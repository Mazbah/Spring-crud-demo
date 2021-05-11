package com.crudDemo.crud.model

import javax.persistence.*

@Entity
@Table(name="todo_list")
data class Todo(
    @Id
    @Column(name="id") @GeneratedValue(strategy = GenerationType.IDENTITY)  val id: Integer? = null,
    val title: String,
    val Des: String
) {
    override fun toString(): String {
        return "Todo [Id = $id Title = $title Des = $Des ]"
    }
}