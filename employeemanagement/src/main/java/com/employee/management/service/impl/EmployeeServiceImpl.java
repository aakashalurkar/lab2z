package com.employee.management.service.impl;

import com.employee.management.EmployeeRepository;
import com.employee.management.io.entity.EmployeeEntity;
import com.employee.management.service.EmployeeService;
import com.employee.management.shared.dto.EmployeeDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository emplRepo;

    @Override
    public EmployeeDto createEmployee(EmployeeDto emplDto) {

        EmployeeEntity employeeEntity = new EmployeeEntity();
        ObjectMapper mapper = new ObjectMapper();
        employeeEntity = mapper.convertValue(emplDto, EmployeeEntity.class);
        //BeanUtils.copyProperties(emplDto,employeeEntity);

        //employeeEntity.setId((long) 123);

        EmployeeEntity storedEmployee = emplRepo.save(employeeEntity);
        EmployeeDto returnEmployeeDetailsdto = new EmployeeDto();

        returnEmployeeDetailsdto = mapper.convertValue(storedEmployee, EmployeeDto.class);
        //BeanUtils.copyProperties(storedEmployee,returnEmployeeDetailsdto);

        return returnEmployeeDetailsdto;
    }
}
