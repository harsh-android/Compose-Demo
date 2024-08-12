@file:OptIn(ExperimentalPagerApi::class)

package com.aviansoft.composedemo

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aviansoft.composedemo.Utils.Util
import com.aviansoft.composedemo.ui.theme.ComposeDemoTheme
import com.aviansoft.composedemo.ui.theme.PrimGradient1
import com.aviansoft.composedemo.ui.theme.PrimGradient2
import com.google.accompanist.pager.ExperimentalPagerApi
import network.chaintech.sdpcomposemultiplatform.sdp
import network.chaintech.sdpcomposemultiplatform.ssp
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.layout.ContentScale
import coil.compose.AsyncImage
import com.google.accompanist.pager.*
import kotlinx.coroutines.delay
import java.util.UUID

class HomePage {

    companion object {


        @OptIn(ExperimentalMaterial3Api::class)
        @Composable
        fun HomeScreen() {


            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                Column {
                    HomeHeader()
                    HomeHeadBanner()



                    Text(text = "Hello")
                }
            }
        }

//        TODO Head Banner Start

        private @Composable
        fun HomeHeadBanner() {

            val pagerState = rememberPagerState(4)
            val coroutineScope = rememberCoroutineScope()

            // Auto scroll the pager
            LaunchedEffect(pagerState) {
                while (true) {
                    delay(3000L)
                    val nextPage = (pagerState.currentPage + 1) % imageList.size
                    pagerState.animateScrollToPage(nextPage)
                }
            }

            HorizontalPager(

                state = pagerState,
                modifier = Modifier
                    .fillMaxWidth()
            ) { page ->
                AsyncImage(
                    model = imageList[page].url,
                    contentDescription = "Sample Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp),
//                            .graphicsLayer(alpha = 1f - alpha),
                    contentScale = ContentScale.FillWidth
                )
            }


        }

        val imageList = arrayListOf(
            ImageItem(
                UUID.randomUUID().toString(),
                "https://static.caronphone.com/public/Banner/72/72_mob.webp"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://static.caronphone.com/public/Banner/57/57_mob.webp"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://static.caronphone.com/public/Banner/58/58_mob.webp"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://static.caronphone.com/public/Banner/59/59_mob.webp"
            )
        )
        data class ImageItem(
            val id : String,
            val url : String
        )

//        Head Banner End


//        TODO Heder Start

        @ExperimentalMaterial3Api
        private @Composable
        fun HomeHeader() {

            var boxSize by remember { mutableStateOf(Offset.Zero) }
            Column(

                modifier = Modifier
                    .onGloballyPositioned { coordinates ->
                        // Update the size of the box
                        val size = coordinates.size
                        boxSize = Offset(size.width.toFloat(), size.height.toFloat())
                        val (startOffset, endOffset) = Util.GradientWithAngleExample(90f)
                    }
                    .wrapContentHeight()
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(
                                PrimGradient1,
                                PrimGradient2
                            ),
                            start = Util.getGradientOffsets(90f, boxSize.x, boxSize.y).first,
                            end = Util.getGradientOffsets(90f, boxSize.x, boxSize.y).second
                        )
                    )
            ) {


                Row(modifier = Modifier.padding(10.sdp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween) {

                    Image(
                        modifier = Modifier.size(110.sdp, 30.sdp),
                        painter = painterResource(id = R.drawable.logo_png),
                        contentDescription = "Logo"
                    )

                    Spacer(modifier = Modifier.weight(1f))


                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Surat",
                                color = Color.White,
                                fontSize = 11.ssp
                            )
                            Icon(
                                imageVector = Icons.Default.LocationOn,
                                contentDescription = "Location Icon",
                                tint = Color.White
                            )
                        }
                        Spacer(modifier = Modifier.width(5.sdp))
                        Icon(
                            imageVector = Icons.Default.Notifications,
                            contentDescription = "Notification Icon",
                            tint = Color.White
                        )
                    }

                }






                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.sdp, 5.sdp, 10.sdp, 10.sdp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {

                    var search by remember {
                        mutableStateOf("")
                    }

                    BasicTextField(
                        value = search,
                        onValueChange = { newText -> search = newText },
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(CircleShape)
                            .defaultMinSize(minHeight = 30.sdp), // Optional: To maintain minimum height
                        keyboardOptions = KeyboardOptions.Default,
                        keyboardActions = KeyboardActions.Default,
                        singleLine = true,
                        decorationBox = { innerTextField ->
                            TextFieldDefaults.TextFieldDecorationBox(
                                value = search,
                                innerTextField = innerTextField,
                                enabled = true,
                                singleLine = true,
                                leadingIcon = {
                                    Icon(
                                        imageVector = Icons.Default.Search,
                                        contentDescription = "Search Icon"
                                    )
                                },
                                placeholder = {
                                    Text(text = "Search", color = Color.Gray)
                                },
                                visualTransformation = VisualTransformation.None,
                                interactionSource = remember { MutableInteractionSource() },
                                contentPadding = PaddingValues(0.dp), // Remove padding
                                colors = TextFieldDefaults.textFieldColors(
                                    containerColor = Color.White,
                                    focusedIndicatorColor = Color.Transparent,
                                    unfocusedIndicatorColor = Color.Transparent
                                )
                            )
                        }
                    )

                }

            }

        }

//        Header End

    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        ComposeDemoTheme {
            HomeScreen()
        }
    }
}

