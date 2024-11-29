package hu.tinder.music_shop_application.converter;

import hu.tinder.music_shop_application.dto.Instrument;
import hu.tinder.music_shop_application.entity.InstrumentEntity;
import org.springframework.stereotype.Component;

/**
 * https://www.baeldung.com/the-persistence-layer-with-spring-data-jpa
 * @author Gergely Jakab
 */
@Component
public class InstrumentConverter {

    public Instrument convert(InstrumentEntity instrumentEntity){
        Instrument instrumentDto = new Instrument();
        instrumentDto.setId(instrumentEntity.getId());
        instrumentDto.setName(instrumentEntity.getName());
        instrumentDto.setType(instrumentEntity.getType());
        instrumentDto.setCompanyName(instrumentEntity.getCompanyName());
        instrumentDto.setCompanyEmail(instrumentEntity.getCompanyEmail());
        return instrumentDto;
    }

    public InstrumentEntity convert(Instrument instrumentDto){
        InstrumentEntity instrumentEntity = new InstrumentEntity();
        instrumentEntity.setId(instrumentDto.getId());
        instrumentEntity.setName(instrumentDto.getName());
        instrumentEntity.setType(instrumentDto.getType());
        instrumentEntity.setCompanyName(instrumentDto.getCompanyName());
        instrumentEntity.setCompanyEmail(instrumentDto.getCompanyEmail());
        return instrumentEntity;
    }
}
