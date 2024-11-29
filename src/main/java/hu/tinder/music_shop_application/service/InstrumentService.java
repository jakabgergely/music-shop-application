package hu.tinder.music_shop_application.service;

import hu.tinder.music_shop_application.converter.InstrumentConverter;
import hu.tinder.music_shop_application.dao.InstrumentRepository;
import hu.tinder.music_shop_application.dto.Instrument;
import hu.tinder.music_shop_application.entity.InstrumentEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Gergely Jakab
 */
@Service
public class InstrumentService {

    private final InstrumentRepository instrumentRepository;

    private final InstrumentConverter instrumentConverter;

    public InstrumentService(InstrumentRepository instrumentRepository, InstrumentConverter instrumentConverter) {
        this.instrumentRepository = instrumentRepository;
        this.instrumentConverter = instrumentConverter;
    }

    public Instrument get(long id){
        InstrumentEntity instrumentEntity = instrumentRepository.getReferenceById(id);
        return instrumentConverter.convert(instrumentEntity);
    }

    public void save(Instrument instrument) {
        InstrumentEntity instrumentEntity = instrumentConverter.convert(instrument);
        instrumentRepository.save(instrumentEntity);
    }

    public List<Instrument> getAll() {
        return instrumentRepository.findAll()
                .stream()
                .map(instrumentConverter::convert)
                .collect(Collectors.toList());
    }

    public void delete(long id) {
        instrumentRepository.deleteById(id);
    }
}
