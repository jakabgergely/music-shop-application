package hu.tinder.music_shop_application.controller;

import hu.tinder.music_shop_application.dto.Instrument;
import hu.tinder.music_shop_application.service.InstrumentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * MVC, REST, Dispatcher, Filter
 *
 * @author Gergely Jakab
 */
//TODO add company controller + service + dao
@RestController
@RequestMapping("instrument")
public class InstrumentController {

    private final InstrumentService instrumentService;

    public InstrumentController(InstrumentService instrumentService) {
        this.instrumentService = instrumentService;
    }

    @GetMapping("/{id}")
    public Instrument get(@PathVariable("id") long id) {
        return instrumentService.get(id);
    }

    @GetMapping("/all")
    public List<Instrument> getAll() {
        return instrumentService.getAll();
    }

    @PostMapping
    public void add(@Valid @RequestBody Instrument instrument) {
        instrumentService.save(instrument);
    }

    @PutMapping
    public void update(@Valid @RequestBody Instrument instrument) {
        instrumentService.save(instrument);
    }

    @DeleteMapping
    public void delete(long id) {
        instrumentService.delete(id);
    }

}
