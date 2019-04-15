package com.employee.management.ui.controller;

import com.employee.management.service.EmployeeService;
import com.employee.management.shared.dto.EmployeeDto;
import com.employee.management.ui.model.request.EmployeeDetailsRequestModel;
import com.employee.management.ui.model.response.EmployeeDetailsResponseModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("employee") //http://localhost:8080/employee
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public String getEmployee(){
        return "get was called";
    }

    @PostMapping
    public EmployeeDetailsResponseModel createEmployee(@RequestBody EmployeeDetailsRequestModel employeeDetails){
        EmployeeDetailsResponseModel returnValue = new EmployeeDetailsResponseModel();

        EmployeeDto employeeDto = new EmployeeDto();
        BeanUtils.copyProperties(employeeDetails, employeeDto);

        EmployeeDto createdEmployee = employeeService.createEmployee(employeeDto);

        BeanUtils.copyProperties(createdEmployee,returnValue);
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
