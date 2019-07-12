package ru.goryacms.office.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.goryacms.office.dto.OfficeDto;

public interface OfficeService {
    Flux<OfficeDto> findAll();

    Mono<OfficeDto> loadById(Long id);

    Mono<OfficeDto> save(OfficeDto office);

    Mono<OfficeDto> update(OfficeDto office);

    Mono<OfficeDto> delete(OfficeDto office);
}
