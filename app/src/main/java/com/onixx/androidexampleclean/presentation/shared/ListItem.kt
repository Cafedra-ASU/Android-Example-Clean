package com.onixx.androidexampleclean.presentation.shared

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.onixx.androidexampleclean.domain.model.exampleItem.ExampleItem


/**
 * если композабл базовый для приложения и используется более чем на аодном экране - обычно имеет
 * смысл вынести его в специальную папку shared
 */
@Composable
fun ListItem(
    modifier: Modifier = Modifier,
    item: ExampleItem,
) {
    Column {
        Text(
            modifier = Modifier.padding(top = 4.dp),
            text = "${item.title}, id = ${item.id}",
            fontSize = 18.sp
        )

        Text(
            modifier = Modifier.padding(top = 8.dp),
            text = item.subtitle,
            fontSize = 12.sp
        )

        HorizontalDivider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp),
            thickness = 1.dp,
            color = Color.DarkGray
        )
    }
}