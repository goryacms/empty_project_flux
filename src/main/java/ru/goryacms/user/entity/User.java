package ru.goryacms.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

//import javax.persistence.*;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
//@Entity
@Table(value = "\"Users\"")
public class User {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(keyColumn = "id")
    private Long id;

    @Version
    private Integer version;

    @Column(keyColumn = "first_name")
    private String firstName;

    @Column(keyColumn = "last_name")
    private String lastName;

    @Column(keyColumn = "middle_name")
    private String middleName;

//    @Column(keyColumn = "position")
//    private String position;
//
//    @Column(keyColumn = "phone")
//    private String phone;
//
//    @Column(keyColumn = "age")
//    private Integer age;
//
//    @Column(keyColumn = "is_identified")
//    private Boolean isIdentified;
//
//    @Column(keyColumn = "registration_date")
//    //@Temporal(TemporalType.DATE)
//    private Date registrationDate;
//
//    @Column(keyColumn = "salary")
//    private Double salary;

//    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user",
//            cascade=CascadeType.ALL, orphanRemoval=true)
//    private DocUser docUser;
//
//
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "office_id")
//    private Office office;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "citizenship_code")
//    private Citizenship citizenship;
}
