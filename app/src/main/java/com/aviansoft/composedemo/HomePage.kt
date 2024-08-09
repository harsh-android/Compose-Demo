package com.aviansoft.composedemo

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.aviansoft.composedemo.Utils.Utils
import com.aviansoft.composedemo.ui.theme.ComposeDemoTheme
import com.aviansoft.composedemo.ui.theme.PrimGradient1
import com.aviansoft.composedemo.ui.theme.PrimGradient2
import network.chaintech.sdpcomposemultiplatform.sdp

class HomePage {

    companion object {


        @Composable
        fun HomeScreen() {

            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {

                HomeHeader()

            }

        }

        private @Composable
        fun HomeHeader() {

            var boxSize by remember { mutableStateOf(Offset.Zero) }
            Column(

                modifier = Modifier
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
                    )
            ) {


                Row(modifier = Modifier.padding(10.sdp)) {

                    Image(
                        modifier = Modifier.size(110.sdp,30.sdp),
                        painter = painterResource(id = R.drawable.logo_png),
                        contentDescription = "Logo"
                    )

                    Box {
                        Spacer(modifier = Modifier
                            .wrapContentWidth()
                            .height(2.sdp))
                    }

                    Text(text = "Surat,India", color = )

                }

            }

        }

    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        ComposeDemoTheme {
            HomeScreen()
        }
    }
}

