package com.crudDemo.crud.repository

import com.crudDemo.crud.model.Todo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoRepo: JpaRepository<Todo, Integer?> {

}
