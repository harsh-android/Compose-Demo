package com.aviansoft.composedemo

import android.annotation.SuppressLint
import android.app.Activity
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowInsetsController
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aviansoft.composedemo.Utils.Utils
import com.aviansoft.composedemo.ui.theme.ComposeDemoTheme
import com.aviansoft.composedemo.ui.theme.PrimGradient1
import com.aviansoft.composedemo.ui.theme.PrimGradient2
import kotlinx.coroutines.delay
import network.chaintech.sdpcomposemultiplatform.sdp


// TODO This Demo is Not Fix working on IT


class SplashActivity() : ComponentActivity() {
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
                    NavigationGraph()
                }
            }
        }
    }
}


@Composable
fun NavigationGraph(startDestination: String = "splash_screen") {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = startDestination) {
        composable("splash_screen") { SplashPage(navController) }
        composable("main_screen") { MainActivity() }
    }
}

@Composable
fun SplashPage(navController : NavHostController) {
    var boxSize by remember { mutableStateOf(Offset.Zero) }


    LaunchedEffect(Unit) {

        delay(4000)
        navController.navigate("main_screen") {
            popUpTo("splash_screen") {inclusive = true}
        }

    }

    Row(
        modifier = Modifier
            .fillMaxSize()

            .onGloballyPositioned { coordinates ->
                // Update the size of the box
                val size = coordinates.size
                boxSize = Offset(size.width.toFloat(), size.height.toFloat())
                val (startOffset, endOffset) = Utils.GradientWithAngleExample(90f)
            }
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        PrimGradient1,
                        PrimGradient2
                    ),
                    start = Utils.getGradientOffsets(90f, boxSize.x, boxSize.y).first,
                    end = Utils.getGradientOffsets(90f, boxSize.x, boxSize.y).second
                )
            ),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically

    ) {

        Image(
            painter = painterResource(id = R.drawable.splash_logo),
            contentDescription = "LOGO",
            modifier = Modifier.size(180.sdp, 200.sdp)
        )

    }

}



@Preview(showBackground = true)
@Composable
fun SplashPreview() {
    ComposeDemoTheme {
        NavigationGraph()

    }
}