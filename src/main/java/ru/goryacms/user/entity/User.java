package ru.goryacms.user.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Version
    private Integer version;

    @Basic(optional = false)
    @Column(name = "first_name")
    private String firstName;

    @Basic(optional = false)
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "position")
    private String position;

    @Column(name = "phone")
    private String phone;

    @Basic(optional = false)
    @Column(name = "age")
    private Integer age;

    @Basic(optional = false)
    @Column(name = "is_identified")
    private Boolean isIdentified;

    @Column(name = "registration_date")
    @Temporal(TemporalType.DATE)
    private Date registrationDate;

    @Basic(optional = false)
    @Column(name = "salary")
    private Double salary;

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
