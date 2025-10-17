package com.onixx.androidexampleclean.domain.usecases.exampleItem

import com.onixx.androidexampleclean.domain.model.exampleItem.ExampleItem
import com.onixx.androidexampleclean.domain.repository.ExampleItemsRepository


class GetExamplesUseCase(
    private val coinListRepository: ExampleItemsRepository
) {
    suspend fun execute(count: Int) : List<ExampleItem> {

        /**
         * метод List.map { } возвращает новый список, содержащий результаты применения
         * переданной функции к каждому элементу исходного списка.
         *
         * т.е взяли исходный массив, к каждому элементу применили логику в скобках, и результаты этих применений собрали в новый список
         */

        val result = coinListRepository.getList(count).map { it.toExampleItem() }
        return result
    }
}