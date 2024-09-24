package com.project.gym.managerImpl;

import com.project.gym.entity.RutinaEntity;
import com.project.gym.manager.RutinaManager;
import com.project.gym.repository.RutinaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RutinaManagerImpl implements RutinaManager {

    private final RutinaRepository rutinaRepository;

    public RutinaManagerImpl(RutinaRepository rutinaRepository) {
        this.rutinaRepository = rutinaRepository;
    }

    @Override
    public RutinaEntity save(RutinaEntity rutinaEntity){
        return rutinaRepository.save(rutinaEntity);
    }

    @Override
    public List<RutinaEntity> findAll(){
        return rutinaRepository.findAll();
    }

}
