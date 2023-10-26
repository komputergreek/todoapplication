package com.kostas.todoapp.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoController {
    var todoList: MutableList<Todo> = mutableListOf()

    @GetMapping("/todos")
    fun getTodos(): List<Todo> {
        return todoList
    }

    @PostMapping("/todos")
    fun addTodos(@RequestBody inputTodo: Todo): Todo {
        todoList.add(inputTodo)

        return inputTodo
    }
}