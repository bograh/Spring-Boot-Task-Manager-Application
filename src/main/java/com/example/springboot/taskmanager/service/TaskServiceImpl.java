package com.example.springboot.taskmanager.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.springboot.taskmanager.entity.Task;
import com.example.springboot.taskmanager.repository.TaskRepository;

public class TaskServiceImpl implements TaskService {
	@Autowired
    private TaskRepository taskRepository;

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Long id) {
        Optional<Task> task =  taskRepository.findById(id);
		return task.get();
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    @Override
    public Task updateTask(Long id, Task task) {
        Task taskDB = taskRepository.findById(id).get();
		
		if(Objects.nonNull(task.getName()) && !"".equalsIgnoreCase(task.getName())) {
			taskDB.setName(task.getName());
		}
		
		if(Objects.nonNull(task.getDescription()) && !"".equalsIgnoreCase(task.getDescription())) {
			taskDB.setDescription(task.getDescription());
		}
		
		return taskRepository.save(taskDB);
    }
}
