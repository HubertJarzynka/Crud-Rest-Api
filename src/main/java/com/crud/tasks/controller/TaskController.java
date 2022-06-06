package com.crud.tasks.controller;

import com.crud.tasks.domain.TaskDto;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/v1/tasks")
@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
public class TaskController {

    @GetMapping
    public List<TaskDto> getTasks() {

        return new ArrayList<>();
    }

    @GetMapping(value ="{taskId")
    public TaskDto getTask(@PathVariable Long taskId) {

        return new TaskDto(1L, "test title", "test_content");
    }

    @DeleteMapping
    public void deleteTask(Long taskId) {

    }

    @PutMapping
    public TaskDto updateTask(TaskDto taskDto) {

        return new TaskDto(1L, "Edited test title", "Test content");
    }

    @PostMapping
    public void createTask(TaskDto taskDto) {
    }
}