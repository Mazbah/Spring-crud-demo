package com.crudDemo.crud.model

import javax.persistence.*

@Entity
@Table(name="todo_list")
data class Todo(
    @Id
    @Column(name="id") @GeneratedValue(strategy = GenerationType.IDENTITY)  var id: Integer? = null,
    var title: String,
    @Column(name="Description") var Des: String
) {
    override fun toString(): String {
        return "Todo [Id = $id Title = $title Des = $Des ]"
    }

}