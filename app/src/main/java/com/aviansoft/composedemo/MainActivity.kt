package com.aviansoft.composedemo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
//import com.aviansoft.composedemo.HomePage.Companion.HomeScreen
import com.aviansoft.composedemo.MorePage.Companion.MoreScreen
import com.aviansoft.composedemo.NewCarPage.Companion.NewCarScreen
import com.aviansoft.composedemo.WishlistPage.Companion.WishlistScreen
import com.aviansoft.composedemo.ui.theme.ComposeDemoTheme
import dagger.hilt.android.AndroidEntryPoint
import network.chaintech.sdpcomposemultiplatform.sdp
import network.chaintech.sdpcomposemultiplatform.ssp

//@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    MainContent()

                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainContent() {

    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) {
        NavigationGraph(navController = navController)
    }


}

@Composable
fun BottomNavigationBar(navController: NavHostController) {

    val items = listOf(
        Screen.Home,
        Screen.NewCar,
        Screen.Wishlist,
        Screen.More
    )
    val navStackBackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navStackBackEntry?.destination

    Box(
        modifier = Modifier
            .padding(start = 10.sdp, end = 10.sdp, top = 10.sdp, bottom = 10.sdp)
            .clip(RoundedCornerShape(40.sdp))
            .background(
                color = if (isSystemInDarkTheme()) {
                    Color.White
                } else {
                    Color.Black
                }
            )
    ) {


        Row(
            modifier = Modifier
                .padding(start = 10.dp, end = 10.dp, top = 8.dp, bottom = 8.dp)
                .background(Color.Transparent)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            items.forEach { screen ->
                AddItem(
                    screen = screen,
                    currentDestination = currentDestination,
                    navController = navController
                )
            }
        }
    }
}


@Composable
fun RowScope.AddItem(
    screen: Screen,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    val selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true

    val background =
        if (selected)
            if (isSystemInDarkTheme())
                Color.Black
            else
                Color.White
        else
            if (isSystemInDarkTheme())
                Color.White
            else
                Color.Black

    val contentColor =
        if (selected)
            if (isSystemInDarkTheme())
                Color.White
            else
                Color.Black
        else
            if (isSystemInDarkTheme())
                Color.Black
            else
                Color.White

    Box(
        modifier = Modifier
            .height(30.sdp)
            .clip(CircleShape)
            .background(background)
            .clickable(onClick = {
                navController.navigate(screen.route) {
                    popUpTo(navController.graph.findStartDestination().id)
                    launchSingleTop = true
                }
            })
    ) {
        Row(
            modifier = Modifier
                .padding(start = 10.sdp, end = 10.sdp, top = 5.sdp, bottom = 5.sdp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {


            //* if menu title : Report means we will show badge
            if (screen.label == "Wishlist") { // with badge
                BadgedBox(badge = { Badge { Text("6") } }) {
                    Icon(
                        modifier = Modifier.size(17.sdp),
                        painter = painterResource(id = if (selected) screen.fillIcon else screen.icon),
                        contentDescription = "icon",
                        tint = contentColor
                    )
                }

            } else {

                Icon(
                    modifier = Modifier
                        .size(17.sdp)
                        .align(alignment = Alignment.CenterVertically),
                    painter = painterResource(id = if (selected) screen.fillIcon else screen.icon),
                    contentDescription = "icon",
                    tint = contentColor
                )

            }

            Spacer(modifier = Modifier.size(3.sdp, 0.sdp))

            AnimatedVisibility(visible = selected) {
                Box(modifier = Modifier.align(alignment = Alignment.CenterVertically)) {

                    Text(
                        modifier = Modifier,
                        fontSize = 9.ssp,
                        text = screen.label,
                        color = contentColor
                    )
                }
            }
        }
    }
}

sealed class Screen(val route: String, val label: String, val icon: Int, val fillIcon: Int) {
    object Home : Screen("home", "Home", R.drawable.ic_home, R.drawable.ic_home_fill)
    object NewCar : Screen("new_car", "New Car", R.drawable.ic_car, R.drawable.ic_car_fill)
    object Wishlist : Screen("wishlist", "Wishlist", R.drawable.heart, R.drawable.ic_wishlist_fill)
    object More : Screen("more", "More", R.drawable.ic_more, R.drawable.ic_more_fill)
}

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) { HomeScreen() }
        composable(Screen.NewCar.route) { NewCarScreen() }
        composable(Screen.Wishlist.route) { WishlistScreen() }
        composable(Screen.More.route) { MoreScreen() }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeDemoTheme {
        MainContent()
    }
}