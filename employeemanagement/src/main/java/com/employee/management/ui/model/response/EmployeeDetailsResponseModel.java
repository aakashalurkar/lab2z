package com.employee.management.ui.model.response;

import com.employee.management.shared.dto.AddressDto;
import com.employee.management.shared.dto.EmployerDto;

public class EmployeeDetailsResponseModel {
    private Long id;
    private String name;
    private String email;
    private String title;
    private EmployerDto employers;
    private AddressDto address;

    public EmployerDto getEmployers() {
        return employers;
    }
    public void setEmployers(EmployerDto employers) {
        this.employers = employers;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
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
    public void setId(Long id) {
        this.id = id;
    }
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

}
