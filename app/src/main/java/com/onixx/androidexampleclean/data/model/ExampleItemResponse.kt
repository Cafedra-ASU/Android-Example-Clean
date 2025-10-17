package com.onixx.androidexampleclean.data.model

import com.onixx.androidexampleclean.domain.model.exampleItem.ExampleItem


/**
 * разделение ответа от сервера и модели, которая будет использоваться в приложении. Нужно не всегда,
 * но иногда очень полезно
 */

data class ExampleItemResponse(
    val id: String,
    val title: String,
    val subtitle: String
) {

    fun toExampleItem(): ExampleItem {
        return ExampleItem(
            id = id,
            title = title,
            subtitle = subtitle,

        )
    }

}