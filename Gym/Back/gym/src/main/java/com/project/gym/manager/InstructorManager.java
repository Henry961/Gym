package com.project.gym.manager;

import com.project.gym.entity.InstructorEntity;

import java.util.List;

public interface InstructorManager {
    List<InstructorEntity> findAll();
}
