package com.employee.management.ui.model.response;

import com.employee.management.shared.dto.AddressDto;

public class EmployerDetailsResponseModel {

    private long id;

    private String name;

    private String description;

    private AddressDto address;

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

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }
}
