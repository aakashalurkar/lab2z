package com.employee.management.ui.model.request;

import com.employee.management.shared.dto.AddressDto;
import com.employee.management.shared.dto.EmployerDto;

public class EmployeeDetailsRequestModel {
    private String name;
    private String email;
    private String title;
    private AddressDto address;
    private EmployerDto employers;

    public EmployerDto getEmployers() {
        return employers;
    }
    public void setEmployers(EmployerDto employers) {
        this.employers = employers;
    }
    public AddressDto getAddress() {
        return address;
    }
    public void setAddress(AddressDto address) {
        this.address = address;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
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
