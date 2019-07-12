package ru.goryacms.user.controller;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.goryacms.user.dto.UserDto;
import ru.goryacms.user.service.UserService;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/user", produces = APPLICATION_JSON_VALUE)
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Flux<UserDto> all() {
        return userService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Mono<UserDto> userById(@PathVariable("id") Long id) {
        return userService.loadById(id);
    }

    @PostMapping
    public Mono<UserDto> addUser(@RequestBody UserDto userView) {
        return userService.save(userView);
    }

    @PutMapping
    public Mono<UserDto> updUser(@RequestBody UserDto userView) {
        return userService.save(userView);
    }

    @DeleteMapping
    public Mono<UserDto> delUser(@RequestBody UserDto userView) {
        return userService.save(userView);
    }

}
