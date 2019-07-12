package ru.goryacms.user.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.goryacms.user.dto.UserDto;

import java.util.List;

public interface UserService {
    Flux<UserDto> findAll();

    Mono<UserDto> loadById(Long id);

    Mono<UserDto> save(UserDto user);

    Mono<UserDto> update(UserDto user);

    Mono<UserDto> delete(UserDto user);
}
