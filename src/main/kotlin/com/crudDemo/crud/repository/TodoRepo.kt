package com.crudDemo.crud.repository

import com.crudDemo.crud.model.Todo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface TodoRepo: JpaRepository<Todo, Integer?> {

    ///@Query("from Todo where date = ?1")
    fun findBydate(date: Date): List<Todo>

}
