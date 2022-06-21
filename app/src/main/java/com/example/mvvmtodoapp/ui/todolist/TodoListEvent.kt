package com.example.mvvmtodoapp.ui.todolist

import com.example.mvvmtodoapp.data.Todo

sealed class TodoListEvent {
    data class OnDeleteTodoClick(val todo:Todo) : TodoListEvent()
    data class OnDoneChange(val todo: Todo, val isDone: Boolean): TodoListEvent()
    object OnUndoDeleteClick: TodoListEvent()
    data class OnTodoClick(val todo: Todo): TodoListEvent()
    object OnAddTodoClick: TodoListEvent()
}
