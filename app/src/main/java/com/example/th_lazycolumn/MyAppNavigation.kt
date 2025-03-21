package com.example.th_lazycolumn

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.*
import com.example.th_lazycolumn.layouts.Detail
import com.example.th_lazycolumn.layouts.ListLazyColumn
import com.example.th_lazycolumn.layouts.Welcome

@Composable
fun MyAppNavigation() {
    val navCotroller = rememberNavController()
    NavHost(navController = navCotroller, startDestination = "welcome") {
        composable(route = "welcome") {
            Welcome(navCotroller)
        }
        composable(route = "list") {
            ListLazyColumn(navCotroller)
        }
        composable(route = "detail") {
            Detail(navCotroller)

        }
        }

}