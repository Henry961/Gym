package com.project.gym.repository;

import com.project.gym.entity.InstructorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<InstructorEntity, String> {
}
