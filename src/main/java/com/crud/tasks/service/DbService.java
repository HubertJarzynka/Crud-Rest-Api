package com.crud.tasks.service;

import com.crud.tasks.domain.TaskDto;
import com.crud.tasks.repository.TaskRepository;
import com.crud.tasks.domain.Task;
import org.springframework.stereotype.Service;


import lombok.RequiredArgsConstructor;


import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class DbService {

    private final TaskRepository repository;

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task getTaskById(Long taskId) {
        return repository.findById(taskId).orElse(null);
    }
}