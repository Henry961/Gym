package com.project.gym.manager;

import com.project.gym.entity.ClienteEntity;

import java.util.List;

public interface ClienteManager {
    List<ClienteEntity> findAll();

    ClienteEntity save(ClienteEntity clienteEntity);
}
