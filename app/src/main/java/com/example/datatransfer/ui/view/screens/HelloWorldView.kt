package com.example.datatransfer.ui.view.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.datatransfer.ui.view.components.BtnBackToMain
import com.example.datatransfer.ui.viewModel.MainViewModel

@Composable
fun HelloWorldView(navController: NavController, viewModel: MainViewModel = hiltViewModel()) {
    val inputText = viewModel.inputText.observeAsState("")
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 75.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Welcome, ${inputText.value ?: ""} 👋 👀")
        BtnBackToMain(navController)
    }
}

@Preview
@Composable
fun PreviewHelloWorldView() {
    val navController = rememberNavController()
    HelloWorldView(navController)
}
