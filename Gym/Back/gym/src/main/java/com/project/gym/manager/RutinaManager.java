package com.project.gym.manager;

import com.project.gym.entity.RutinaEntity;

import java.util.List;

public interface RutinaManager {
    RutinaEntity save(RutinaEntity rutinaEntity);

    List<RutinaEntity> findAll();
}
