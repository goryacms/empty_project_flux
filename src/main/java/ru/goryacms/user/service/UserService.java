package ru.goryacms.user.service;

import reactor.core.publisher.Flux;
import ru.goryacms.user.dto.UserDto;

import java.util.List;

public interface UserService {
    Flux<UserDto> findAll();

    List<UserDto> loadByParams(UserDto user);

    UserDto loadById(Long id);

    UserDto save(UserDto user);

    UserDto update(UserDto user);

    UserDto delete(UserDto user);
}
