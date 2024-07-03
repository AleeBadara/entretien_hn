package com.hn.entretien.Task;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepository {
    private final List<Task> tasks = new ArrayList<>();

    @PostConstruct
    private void initTask() {
        tasks.add((new Task("1", "Faire des course", LocalDateTime.now(), LocalDateTime.now().plusMinutes(30))));
    }
}
