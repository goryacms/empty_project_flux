package ru.goryacms.user.dto;

import lombok.Data;

import java.util.Date;

@Data
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

}
