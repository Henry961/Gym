package com.project.gym.managerImpl;

import com.project.gym.entity.ClienteEntity;
import com.project.gym.manager.ClienteManager;
import com.project.gym.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteManagerImpl implements ClienteManager {

    private final ClienteRepository clienteRepository;

    public ClienteManagerImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public List<ClienteEntity> findAll(){
        return clienteRepository.findAll();
    }

    @Override
    public ClienteEntity save(ClienteEntity clienteEntity){
        return clienteRepository.save(clienteEntity);
    }

}
