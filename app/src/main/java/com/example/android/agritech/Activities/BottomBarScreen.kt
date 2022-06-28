package com.example.android.agritech.Activities

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(val route:String,val title:String,val icon:ImageVector){
    object Home:BottomBarScreen("home","Home", Icons.Default.Home)
    object Dashboard:BottomBarScreen("dashboard","Dashboard", Icons.Default.Done)
    object Orders:BottomBarScreen("orders","Orders", Icons.Default.ShoppingCart)
    object Profile:BottomBarScreen("profile","Profile", Icons.Default.Person)
}
