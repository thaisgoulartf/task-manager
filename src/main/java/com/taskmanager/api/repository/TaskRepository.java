package com.taskmanager.api.repository;

import com.taskmanager.api.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // Não precisamos implementar nada por enquanto, JpaRepository já oferece o CRUD básico.
}
