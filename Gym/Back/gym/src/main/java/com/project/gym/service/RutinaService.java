package com.project.gym.service;

import com.project.gym.entity.RutinaEntity;
import com.project.gym.manager.RutinaManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rutina")
@CrossOrigin(origins = "http://localhost:4200")
public class RutinaService {

    private final RutinaManager rutinaManager;

    public RutinaService(RutinaManager rutinaManager) {
        this.rutinaManager = rutinaManager;
    }

    @GetMapping("/find")
    public List<RutinaEntity> findAll(){
        return rutinaManager.findAll();
    }

    @PostMapping("/create")
    public RutinaEntity save(@RequestBody RutinaEntity rutinaEntity){
        return rutinaManager.save(rutinaEntity);
    }

}
