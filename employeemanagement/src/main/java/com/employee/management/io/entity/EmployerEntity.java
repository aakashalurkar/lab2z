package com.employee.management.io.entity;
import javax.persistence.*;
import java.io.Serializable;

@Entity(name="employers")
public class EmployerEntity implements Serializable {
    private static final long serialVersionUID = 6835192601898364280L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(nullable = false)
    @Embedded
    private AddressEntity address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }
}
