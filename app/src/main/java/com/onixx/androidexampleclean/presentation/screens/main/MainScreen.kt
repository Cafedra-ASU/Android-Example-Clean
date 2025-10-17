package com.onixx.androidexampleclean.presentation.screens.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.onixx.androidexampleclean.presentation.shared.ListItem

class MainScreen(
    private val viewModel: MainScreenViewModel
) {

    @Composable
    fun GetContent() {
        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .padding(horizontal = 16.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp),
                    text = "Clean example",
                    fontSize = 18.sp
                )

                val exampleItems by viewModel.items.collectAsState()

                exampleItems?.let { notNullItems ->
                    LazyColumn(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        items(notNullItems) {
                            ListItem(item = it)
                        }
                    }
                }


            }
        }
    }
}