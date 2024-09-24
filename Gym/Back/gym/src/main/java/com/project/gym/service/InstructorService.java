package com.project.gym.service;

import com.project.gym.entity.InstructorEntity;
import com.project.gym.manager.InstructorManager;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/instructor")
@CrossOrigin(origins = "http://localhost:4200")
public class InstructorService {

    private final InstructorManager instructorManager;

    public InstructorService(InstructorManager instructorManager) {
        this.instructorManager = instructorManager;
    }

    @GetMapping("/find")
    public List<InstructorEntity> findAll() {
        return instructorManager.findAll();
    }

}
