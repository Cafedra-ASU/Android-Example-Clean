package com.onixx.androidexampleclean.presentation.screens.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.onixx.androidexampleclean.domain.model.exampleItem.ExampleItem
import com.onixx.androidexampleclean.domain.usecases.exampleItem.GetExamplesUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch


class MainScreenViewModel(
    val getExamplesUseCase: GetExamplesUseCase
) : ViewModel() {

    /**
     * соcтояние может быть null, показал как обрабатывать такое в ui
     */
    private val _items = MutableStateFlow<List<ExampleItem>?>(null)
    val items = _items.asStateFlow()

    init {
        getExamples()
    }

    /**
     * у ViewModel есть свой встроенный контекст для запуска корутин, чтобы не надо было ничего прокидывать самим.
     * У любого контекста корутин есть два основных метода:
     * .launch - корутина работает по принципу "запустил и забыл", получить ничего из контекста нельзя
     * .async - возвращает из контекста некоторый результат
     */
    fun getExamples() {
        viewModelScope.launch {
            _items.value = getExamplesUseCase.execute(10)
        }
    }

}