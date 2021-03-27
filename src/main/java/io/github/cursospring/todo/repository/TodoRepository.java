package io.github.cursospring.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.cursospring.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
