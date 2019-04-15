package com.employee.management.ui.controller;

import com.employee.management.service.EmployerService;
import com.employee.management.shared.dto.EmployerDto;
import com.employee.management.ui.model.request.EmployerDetailsRequestModel;
import com.employee.management.ui.model.response.EmployerDetailsResponseModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("employers") //http://localhost:8080/employers

public class EmployerController {

    @Autowired
    EmployerService employerService;

    @GetMapping
    public String getEmployer(){
        return "get was " +
                "called";
    }

    @PostMapping
    public EmployerDetailsResponseModel createEmployer(@RequestBody EmployerDetailsRequestModel employerDetails){

        EmployerDetailsResponseModel returnValue = new EmployerDetailsResponseModel();

        EmployerDto employerDto = new EmployerDto();

        BeanUtils.copyProperties(employerDetails, employerDto);

        EmployerDto createdEmployer = employerService.createEmployer(employerDto);

        BeanUtils.copyProperties(createdEmployer,returnValue);

        return returnValue;
    }

    @PutMapping
    public String updateEmployee(){
        return "update employee was called";
    }

    @DeleteMapping
    public String deleteEmployee(){
        return "delete employee was called";
    }
}
