package ru.goryacms.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import ru.goryacms.user.dto.UserDto;
import ru.goryacms.user.entity.User;
import ru.goryacms.user.service.UserService;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/user", produces = APPLICATION_JSON_VALUE)
public class UserController {

    private UserService userService;

    @GetMapping
    public Flux<UserDto> all() {
        return userService.findAll();
    }



}
