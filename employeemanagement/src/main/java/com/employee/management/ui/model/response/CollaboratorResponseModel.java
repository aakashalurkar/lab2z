package com.employee.management.ui.model.response;

import com.employee.management.shared.dto.AddressDto;
import com.employee.management.shared.dto.EmployerDto;

public class CollaboratorResponseModel {

    private Long id;
    private String name;
    private String title;
    private EmployerDto employers;

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
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public EmployerDto getEmployers() {
        return employers;
    }
    public void setEmployers(EmployerDto employers) {
        this.employers = employers;
    }
}
