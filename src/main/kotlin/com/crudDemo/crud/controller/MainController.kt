package com.crudDemo.crud.controller

import com.crudDemo.crud.model.Todo
import com.crudDemo.crud.repository.TodoRepo
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@ControllerAdvice
class MainController(private var pr: TodoRepo) {

    @RequestMapping("/home")
    fun homePage(): String {
        return "HomePage.html"
    }

    @RequestMapping("/addTodo")
    fun addTodo(@ModelAttribute todo: Todo): String {
        pr.save(todo)
        return "TodoInfo.html"
    }
}