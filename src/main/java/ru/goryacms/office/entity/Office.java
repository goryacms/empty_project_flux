package ru.goryacms.office.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import ru.goryacms.user.entity.User;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(value = "Office")
public class Office {
    @Id
    @Column(keyColumn = "id")
    private Long id;

    @Version
    private Integer version;
    
    @Column(keyColumn = "name")
    private String name;

    @Column(keyColumn = "address")
    private String address;

    @Column(keyColumn = "phone")
    private String phone;

    @Column(keyColumn = "is_active")
    private Boolean isActive;

//    private Organization organization;

    private List<User> users;

}
