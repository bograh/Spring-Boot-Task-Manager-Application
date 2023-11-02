package repository;

import org.springframework.data.repository.CrudRepository;

import entity.Task;


public interface TaskRepository extends CrudRepository<Task, Long> {
    
}
