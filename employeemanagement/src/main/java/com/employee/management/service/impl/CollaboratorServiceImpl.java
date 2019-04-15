package com.employee.management.service.impl;

import com.employee.management.CollaboratorRepository;
import com.employee.management.io.entity.CollaboratorEntity;
import com.employee.management.service.CollaboratorService;
import com.employee.management.shared.dto.Collaboratordto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollaboratorServiceImpl implements CollaboratorService {

    @Autowired
    CollaboratorRepository collabrepo;

    @Override
    public Collaboratordto createCollaboration(Collaboratordto collabdto){
        CollaboratorEntity collaboratorEntity = new CollaboratorEntity();
        ObjectMapper mapper = new ObjectMapper();
        collaboratorEntity = mapper.convertValue(collabdto,CollaboratorEntity.class);

        CollaboratorEntity collabstore = collabrepo.save(collaboratorEntity);
        Collaboratordto returnCollabDetailsdto = new Collaboratordto();

        returnCollabDetailsdto = mapper.convertValue(collabstore,Collaboratordto.class);

        return returnCollabDetailsdto;
    }
}
