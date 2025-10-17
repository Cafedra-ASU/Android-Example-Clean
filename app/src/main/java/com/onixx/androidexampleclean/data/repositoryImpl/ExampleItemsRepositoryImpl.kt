package com.onixx.androidexampleclean.data.repositoryImpl

import com.onixx.androidexampleclean.data.model.ExampleItemResponse
import com.onixx.androidexampleclean.domain.repository.ExampleItemsRepository

class ExampleItemsRepositoryImpl : ExampleItemsRepository {

    override suspend fun getList(count: Int): List<ExampleItemResponse> {
        /**
         * здесь должен быть вызов апи для получения данных, но это в отдельном примере будет
         */
        return listOf(
            ExampleItemResponse("1", "Title 1", "Subtitle 1"),
            ExampleItemResponse("2", "Title 2", "Subtitle 2"),
            ExampleItemResponse("3", "Title 3", "Subtitle 3"),
            ExampleItemResponse("4", "Title 4", "Subtitle 4"),
            ExampleItemResponse("5", "Title 5", "Subtitle 5"),
            ExampleItemResponse("6", "Title 6", "Subtitle 6"),
            ExampleItemResponse("7", "Title 7", "Subtitle 7"),
            ExampleItemResponse("8", "Title 8", "Subtitle 8"),
            ExampleItemResponse("9", "Title 9", "Subtitle 9"),
            ExampleItemResponse("10", "Title 10", "Subtitle 10"),
            ExampleItemResponse("11", "Title 11", "Subtitle 11")
        )
    }
}