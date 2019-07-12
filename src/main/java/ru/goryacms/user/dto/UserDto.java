package ru.goryacms.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import reactor.core.publisher.Mono;
import ru.goryacms.office.dto.OfficeDto;
import ru.goryacms.office.entity.Office;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String firstName;

    private String lastName;

    private String middleName;

    private String position;

    private String phone;

    private Integer age;

    private Boolean isIdentified;

    private Date registrationDate;

    private Double salary;

    private Mono<OfficeDto> office;
}
