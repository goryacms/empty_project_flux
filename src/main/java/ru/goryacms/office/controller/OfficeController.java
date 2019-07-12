package ru.goryacms.office.controller;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.goryacms.office.dto.OfficeDto;
import ru.goryacms.office.service.OfficeService;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/office", produces = APPLICATION_JSON_VALUE)
public class OfficeController {

    private final OfficeService officeService;

    public OfficeController(OfficeService officeService) {
        this.officeService = officeService;
    }

    @GetMapping
    public Flux<OfficeDto> all() {
        return officeService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Mono<OfficeDto> officeById(@PathVariable("id") Long id) {
        return officeService.loadById(id);
    }

    @PostMapping
    public Mono<OfficeDto> addOffice(@RequestBody OfficeDto officeDto) {
        return officeService.save(officeDto);
    }

    @PutMapping
    public Mono<OfficeDto> updOffice(@RequestBody OfficeDto officeDto) {
        return officeService.save(officeDto);
    }

    @DeleteMapping
    public Mono<OfficeDto> delOffice(@RequestBody OfficeDto officeDto) {
        return officeService.save(officeDto);
    }
    
}
