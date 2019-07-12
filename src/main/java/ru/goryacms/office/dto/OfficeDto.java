package ru.goryacms.office.dto;

import lombok.Data;
import reactor.core.publisher.Flux;
import ru.goryacms.user.dto.UserDto;

@Data
public class OfficeDto {
    private Long id;

    private String name;

    private String address;

    private String phone;

    private Boolean isActive;

    private Flux<UserDto> users;
}
