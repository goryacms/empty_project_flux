package ru.goryacms.user.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.goryacms.user.dto.UserDto;
import ru.goryacms.user.entity.User;
import ru.goryacms.user.repository.UserRepository;
import ru.goryacms.user.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final ModelMapper modelMapper;
    private final UserRepository userRepository;

    public UserServiceImpl(ModelMapper modelMapper, UserRepository userRepository) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
    }

    //@Mapper(uses = UserDto.class)
    @Override
    public Flux<UserDto> findAll() {
        Flux<User> all = userRepository.findAll();
        return all
                .map(
                        it -> modelMapper.map(it, UserDto.class)
                );
    }

    @Override
    public Mono<UserDto> loadById(Long id) {
        return null;
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


}
