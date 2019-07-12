package ru.goryacms.office.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.goryacms.office.dto.OfficeDto;
import ru.goryacms.office.entity.Office;
import ru.goryacms.office.repository.OfficeRepository;
import ru.goryacms.office.service.OfficeService;
import ru.goryacms.user.dto.UserDto;

@Service
public class OfficeServiceImpl implements OfficeService {

    private final ModelMapper modelMapper;
    private final OfficeRepository officeRepository;

    public OfficeServiceImpl(ModelMapper modelMapper, OfficeRepository officeRepository) {
        this.modelMapper = modelMapper;
        this.officeRepository = officeRepository;
    }

    @Override
    public Flux<OfficeDto> findAll() {
        Flux<Office> all = officeRepository.findAll();
        return all
                .map(
                        it -> modelMapper.map(it, OfficeDto.class)
                );
    }

    @Override
    public Mono<OfficeDto> loadById(Long id) {
        return officeRepository.findById(id).map(
                it -> modelMapper.map(it, OfficeDto.class)
        );
    }

    @Override
    public Mono<OfficeDto> save(OfficeDto office) {
        return null;
    }

    @Override
    public Mono<OfficeDto> update(OfficeDto office) {
        return null;
    }

    @Override
    public Mono<OfficeDto> delete(OfficeDto office) {
        return null;
    }

}
