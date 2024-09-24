package com.project.gym.service;

import com.project.gym.entity.ClienteEntity;
import com.project.gym.manager.ClienteManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteService {

    private final ClienteManager clienteManager;

    public ClienteService(ClienteManager clienteManager) {
        this.clienteManager = clienteManager;
    }

    @GetMapping("/find")
    public List<ClienteEntity> findAll(){
        return clienteManager.findAll();
    }

    @PostMapping("/create")
    public ClienteEntity save(@RequestBody ClienteEntity clienteEntity){
        return clienteManager.save(clienteEntity);
    }

}
