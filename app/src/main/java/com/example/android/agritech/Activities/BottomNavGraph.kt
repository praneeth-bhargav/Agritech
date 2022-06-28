package com.example.android.agritech.Activities

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.android.agritech.Activities.fragments.Home
import com.example.android.agritech.Activities.fragments.Dashboard
import com.example.android.agritech.Activities.fragments.Orders
import com.example.android.agritech.Activities.fragments.Profile


@Composable
fun BottomNavGraph(navController:NavHostController) {
   NavHost(navController = navController, startDestination = BottomBarScreen.Home.route){
       composable(BottomBarScreen.Home.route){
            Home();
       }
       composable(BottomBarScreen.Dashboard.route){
            Dashboard();
       }
       composable(BottomBarScreen.Orders.route){
            Orders();
       }
       composable(BottomBarScreen.Profile.route){
            Profile();
       }
   }
}