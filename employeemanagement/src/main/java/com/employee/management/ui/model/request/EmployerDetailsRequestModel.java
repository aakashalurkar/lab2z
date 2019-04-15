package com.employee.management.ui.model.request;

import com.employee.management.shared.dto.AddressDto;

public class EmployerDetailsRequestModel {

    private String name;

    private String description;

    private AddressDto address;

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

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }
}
