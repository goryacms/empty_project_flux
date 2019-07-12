package ru.goryacms.user.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.data.r2dbc.function.DatabaseClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.goryacms.office.dto.OfficeDto;
import ru.goryacms.office.service.OfficeService;
import ru.goryacms.user.dto.UserDto;
import ru.goryacms.user.entity.User;
import ru.goryacms.user.repository.UserRepository;
import ru.goryacms.user.service.UserService;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    private static final String FIND_BY_OFFICE_ID_SQL = "SELECT id, first_name, last_name, middle_name, position, phone, age, is_identified, " +
            "registration_date, salary, office_id " +
            "FROM users WHERE office_id=:officeId";

    private final ModelMapper modelMapper;
    private final UserRepository userRepository;
    private final OfficeService officeService;
    private final DatabaseClient databaseClient;

    public UserServiceImpl(ModelMapper modelMapper, UserRepository userRepository, OfficeService officeService, DatabaseClient databaseClient) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
        this.officeService = officeService;
        this.databaseClient = databaseClient;
    }

    //@Mapper(uses = UserDto.class)
    @Override
    public Flux<UserDto> findAll() {
        Flux<User> all = userRepository.findAll();
        return getUserDtoFlux(all);
    }

    @Override
    public Mono<UserDto> loadById(Long id) {
        return null;
    }

    @Override
    public Flux<UserDto> findByOfficeId(Long officeId) {
        Flux<User> mapFlux = databaseClient.execute().sql(FIND_BY_OFFICE_ID_SQL)
                .bind("officeId", officeId)
                .as(User.class)
                .fetch()
                .all();
        return getUserDtoFlux(mapFlux);
    }

    @Override
    public Mono<UserDto> save(UserDto user) {
        return null;
    }

    @Override
    public Mono<UserDto> update(UserDto user) {
        return null;
    }

    @Override
    public Mono<UserDto> delete(UserDto user) {
        return null;
    }

    private Flux<UserDto> getUserDtoFlux(Flux<User> users) {
        return users
                .map(it -> {
                    Mono<OfficeDto> officeDto = officeService.loadById(it.getOfficeId());
                    UserDto map = modelMapper.map(it, UserDto.class);
                    map.setOffice(officeDto);
                    return map;
                });
    }

}
