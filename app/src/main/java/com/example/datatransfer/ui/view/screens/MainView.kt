package com.example.datatransfer.ui.view.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.datatransfer.ui.view.components.InputTextComponent
import com.example.datatransfer.ui.view.components.BtnScreenChange
import com.example.datatransfer.ui.viewModel.MainViewModel

@Composable
fun MainView(
    navController: NavController,
    viewModel: MainViewModel = hiltViewModel()
) {
    val text: String by viewModel.inputText.observeAsState(initial = "")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 75.dp)
    ) {
        InputTextComponent(text) {
            viewModel.onInputChange(it)
        }
        BtnScreenChange(navController)
    }
}

@Preview
@Composable
fun PreviewMainView() {
    // Dummy NavController for preview
    val navController = rememberNavController()
    MainView(navController)
}
