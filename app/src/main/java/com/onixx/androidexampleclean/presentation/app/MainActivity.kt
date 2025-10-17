package com.onixx.androidexampleclean.presentation.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.onixx.androidexampleclean.presentation.screens.main.MainScreen
import com.onixx.androidexampleclean.presentation.screens.main.MainScreenViewModel
import com.onixx.androidexampleclean.presentation.theme.AndroidExampleCleanTheme
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val vm  by viewModel<MainScreenViewModel>()

        setContent {
            AndroidExampleCleanTheme {
                MainScreen(vm).GetContent()
            }
        }
    }
}