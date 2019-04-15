package com.employee.management.service.impl;

import com.employee.management.EmployerRepository;
import com.employee.management.io.entity.EmployerEntity;
import com.employee.management.service.EmployerService;
import com.employee.management.shared.dto.EmployerDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployerServiceImpl implements EmployerService {
    @Autowired
    EmployerRepository emplrRepo;

    @Override
    public EmployerDto createEmployer(EmployerDto emplrDto) {

        EmployerEntity employerEntity = new EmployerEntity();

        ObjectMapper mapper = new ObjectMapper();
        employerEntity = mapper.convertValue(emplrDto, EmployerEntity.class);
        //BeanUtils.copyProperties(emplrDto,employerEntity);

        EmployerEntity storedEmployer = emplrRepo.save(employerEntity);
        EmployerDto returnEmployerDetailsdto = new EmployerDto();

        returnEmployerDetailsdto = mapper.convertValue(storedEmployer, EmployerDto.class);
        //BeanUtils.copyProperties(storedEmployer,returnEmployerDetailsdto);

        return returnEmployerDetailsdto;
    }
}
