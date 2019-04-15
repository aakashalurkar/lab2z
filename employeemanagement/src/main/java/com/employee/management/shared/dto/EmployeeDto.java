package com.employee.management.shared.dto;

import java.io.Serializable;

public class EmployeeDto implements Serializable {
    private static final long serialVersionUID = 6835192601898364280L;
    private Long id;
    private String name;
    private String email;
    private String title;
    private AddressDto address;
    private EmployerDto employers;

    public EmployerDto getEmployers() { return employers; }
    public void setEmployers(EmployerDto employers) {
        this.employers = employers;
    }
    public AddressDto getAddress() {
        return address;
    }
    public void setAddress(AddressDto address) {
        this.address = address;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) { this.id = id; }
    public String getName() {
        return name;
    }
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
