package com.employee.management.io.entity;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@Entity(name="employees")
public class EmployeeEntity implements Serializable {
    private static final long serialVersionUID = 6835192601898364280L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    @Embedded
    private AddressEntity address;

    @ManyToOne()
    private EmployerEntity employers;

    //collab

    public EmployerEntity getEmployers() {
        return employers;
    }
    public void setEmployers(EmployerEntity employers) {
        this.employers = employers;
    }
    public AddressEntity getAddress() {
        return address;
    }
    public void setAddress(AddressEntity address) {
        this.address = address;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
