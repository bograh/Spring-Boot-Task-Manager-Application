package service;

import java.util.List;

import entity.Task;

public interface TaskService {
    public Task createTask(Task task);

	public List<Task> getAllTasks();

	public Task getTaskById(Long id) ;

	public void deleteTask(Long id);

	public Task updateTask(Long id, Task task);

}
