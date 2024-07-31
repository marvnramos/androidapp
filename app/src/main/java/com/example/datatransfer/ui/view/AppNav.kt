package com.example.datatransfer.ui.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.datatransfer.ui.view.screens.HelloWorldView
import com.example.datatransfer.ui.view.screens.MainView
import com.example.datatransfer.ui.viewModel.MainViewModel

@Composable
fun AppNavHost(
    navController: NavHostController = rememberNavController(),
    viewModel: MainViewModel = MainViewModel()
) {
    NavHost(navController, startDestination = "main") {
        composable("main") { MainView(navController, viewModel) }
        composable("helloWorld") { HelloWorldView(navController, viewModel) }
    }
}

@Preview
@Composable
fun PreviewAppNavHost() {
    AppNavHost()
}
