package com.crud.api.controller;

import com.crud.api.entity.Todo;
import com.crud.api.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping
    public List<Todo> create(@RequestBody Todo todo){
        return todoService.create(todo);
    }

    @GetMapping
    public List<Todo> list(){
        return todoService.list();
    }

    @GetMapping("{id}")
    public ResponseEntity<Todo> listById(@PathVariable Long id){
       Todo listById = todoService.listById(id);
       return ResponseEntity.ok(listById);
    }

    @PutMapping
    public List<Todo> update(@RequestBody Todo todo){
        return todoService.update(todo);
    }

    @DeleteMapping("{id}")
    public List<Todo> delete(@PathVariable Long id){
        return  todoService.delete(id);
    }
}
