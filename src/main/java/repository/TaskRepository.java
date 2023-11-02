package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Task;


public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
