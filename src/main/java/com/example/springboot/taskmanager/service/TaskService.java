package com.example.springboot.taskmanager.service;

import java.util.List;

import com.example.springboot.taskmanager.entity.Task;

public interface TaskService {
	
	public Task createTask(Task task);

	public List<Task> getAllTasks();

	public Task getTaskById(Long id) ;

	public void deleteTask(Long id);

	public Task updateTask(Long id, Task task);
}
