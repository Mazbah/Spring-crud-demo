package com.crudDemo.crud.controller

import com.crudDemo.crud.model.Todo
import com.crudDemo.crud.repository.TodoRepo
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import javax.print.attribute.IntegerSyntax

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
        return "redirect:/home"
    }

    @RequestMapping("/findById")
    fun findById(@RequestParam id:Integer, m: Model):String{
        var t:Todo = pr.getOne(id)
        println(t.id)
        if(t.id !=null) {
            m.addAttribute("todo",t)
             return "TodoInfo.html"
        }else return "No data found by this ID"
    }

    @RequestMapping("/deleteTodo")
    fun deleteTodo(@RequestParam id:Integer):String{
        pr.deleteById(id)
        return "redirect:/home"
    }

    @RequestMapping("/updateTodo")
    fun updateTodo(@ModelAttribute todo: Todo):String{
        var t:Todo = pr.getOne(todo.id!!)
        t.title = todo.title
        t.Des = todo.Des
        pr.save(t)
        return "TodoInfo.html"
    }


}