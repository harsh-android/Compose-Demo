package com.aviansoft.composedemo

import android.os.Bundle
import android.os.Handler
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aviansoft.composedemo.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}


@Composable
fun App() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "Home") {
        composable(route = "Home") {
            Greeting(navController)
        }
       
    }
}

@Composable
fun Greeting(navController: NavController, modifier: Modifier = Modifier) {

    var image = painterResource(id = R.drawable.ic_logo)

//    next(navController)

    Box(modifier = Modifier)
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(10.dp)
    ) {
        Image(
            painter = image, contentDescription = null, modifier = Modifier
                .height(200.dp)
                .align(Alignment.CenterHorizontally)
        )
        Image(
            painter = image, contentDescription = null, modifier = Modifier
                .height(200.dp)
                .align(Alignment.CenterHorizontally)
        )


    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeDemoTheme {
        Surface(modifier = Modifier.fillMaxSize()) {

            App()
        }
    }
}