package com.crudDemo.crud.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name="todo_list")
data class Todo(
    @Id
    @Column(name="id") @GeneratedValue(strategy = GenerationType.IDENTITY)  var id: Integer? = null,
    var date:Date? = Date("2020/05/21"),
    var title: String,
    @Column(name="Description") var Des: String
) {
    override fun toString(): String {
        return "Todo [Id = $id Date = $date Title = $title Des = $Des ]"
    }

}