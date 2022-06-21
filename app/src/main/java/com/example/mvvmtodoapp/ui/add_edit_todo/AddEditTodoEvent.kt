package com.example.mvvmtodoapp.ui.add_edit_todo

sealed class AddEditTodoEvent{
    data class OntitleChange(val title: String): AddEditTodoEvent()
    data class OnDescriptionChange(val description: String): AddEditTodoEvent()
    object OnSaveTodoClick :AddEditTodoEvent()
}
