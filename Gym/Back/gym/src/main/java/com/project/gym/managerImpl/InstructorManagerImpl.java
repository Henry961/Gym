package com.project.gym.managerImpl;

import com.project.gym.entity.InstructorEntity;
import com.project.gym.manager.InstructorManager;
import com.project.gym.repository.InstructorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorManagerImpl implements InstructorManager {

    private final InstructorRepository instructorRepository;

    public InstructorManagerImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @Override
    public List<InstructorEntity> findAll(){
        return instructorRepository.findAll();
    }

}
