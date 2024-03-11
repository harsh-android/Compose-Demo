package com.aviansoft.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.aviansoft.composedemo.ui.theme.ComposeDemoTheme


// TODO This Demo is Not Fix working on IT



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
                }
            }
        }
    }
}


@Composable
fun CGPA() {

    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "CGPA Calculator\nAapka Bhavishay",
            modifier = Modifier.fillMaxWidth(),
            style = TextStyle(
                fontSize = 20.sp,
                fontStyle = FontStyle.Italic,
                textAlign = TextAlign.Center,
                color = Color(0xff000000)
            )
        )
        Spacer(modifier = Modifier.padding(top = 10.dp))
        subjectText("Subject 1")
    }

}



@Composable
fun subjectText(value: String) {
    Text(
        text = value,
        modifier = Modifier.fillMaxWidth(),
        style = TextStyle(
            fontSize = 20.sp,
            color = Color(0xff000000)
        )
    )
}

@Composable
fun gradeText(grade:String) {
    TextField(value = grade, onValueChange = {text->
        onValueChange(text)
    })
}

fun onValueChange(text: String) {

}


@Preview(showBackground = true)
@Composable
fun CGPAPreview() {

    ComposeDemoTheme {

        CGPA()

    }

}