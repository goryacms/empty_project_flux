package ru.goryacms.user.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
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
    @Transactional
    public Flux<UserDto> findAll() {
        System.out.println("Service!!!!!!!!!!");
        Flux<User> all = userRepository.findAll();
        System.out.println("====================== " + all.toString());
        return all
                .map(
                        it -> modelMapper.map(it, UserDto.class)
                );
    }

    @Override
    public List<UserDto> loadByParams(UserDto user) {
        return null;
    }

    @Override
    public UserDto loadById(Long id) {
        return null;
    }

    @Override
    public UserDto save(UserDto user) {
        return null;
    }

    @Override
    public UserDto update(UserDto user) {
        return null;
    }

    @Override
    public UserDto delete(UserDto user) {
        return null;
    }
}
