package com.employee.management.ui.controller;

import com.employee.management.service.CollaboratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("collaborators") //http://localhost:8080/collaborators
public class CollaboratorController {

    @PutMapping
    public String updateCollaborator(){
        return "create collaborators was called";
    }

    @DeleteMapping
    public String deleteCollaborator(){
        return "delete collaborators was called";
    }
}
