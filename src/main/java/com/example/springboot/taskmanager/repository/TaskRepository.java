package com.example.springboot.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.taskmanager.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
