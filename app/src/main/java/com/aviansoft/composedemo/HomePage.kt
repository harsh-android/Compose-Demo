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
import androidx.compose.foundation.layout.wrapContentWidth
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
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
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
import com.aviansoft.composedemo.Utils.Utils
import com.aviansoft.composedemo.ui.theme.ComposeDemoTheme
import com.aviansoft.composedemo.ui.theme.ImageSliderTheme
import com.aviansoft.composedemo.ui.theme.PrimGradient1
import com.aviansoft.composedemo.ui.theme.PrimGradient2
import com.google.accompanist.pager.ExperimentalPagerApi
import network.chaintech.sdpcomposemultiplatform.sdp
import network.chaintech.sdpcomposemultiplatform.ssp
import android.view.ViewGroup
import android.widget.ImageView
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.util.lerp
import androidx.compose.ui.viewinterop.AndroidView
import com.bumptech.glide.Glide
import com.google.accompanist.pager.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.yield
import java.util.UUID
import kotlin.math.absoluteValue

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
                }
            }
        }

        private @Composable
        fun HomeHeadBanner() {
            ImageSliderTheme {

                ViewPagerSlider()
            }
        }

        @ExperimentalPagerApi
        @Composable
        fun ViewPagerSlider(){

            val pagerState  = rememberPagerState(
                pageCount = imageList.size,
                initialPage =  2
            )

            LaunchedEffect(Unit){
                while (true){
                    yield()
                    delay(4000)
                    pagerState.animateScrollToPage(
                        page = (pagerState.currentPage + 1) % (pagerState.pageCount),
                        animationSpec = tween(600)
                    )
                }
            }

            Column(modifier = Modifier .background(Color.White)) {

                HorizontalPager(state = pagerState,
                    modifier = Modifier
                ) { page ->
                    Card(modifier = Modifier
                        .graphicsLayer {
                            val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue

                            lerp(
                                start = 0.85f,
                                stop = 1f,
                                fraction = 1f - pageOffset.coerceIn(0f, 1f)
                            ).also { scale ->
                                scaleX = scale
                                scaleY = scale

                            }
                            alpha = lerp(
                                start = 0.5f,
                                stop = 1f,
                                fraction = 1f - pageOffset.coerceIn(0f, 1f)
                            )

                        }
                        .fillMaxWidth(),
                    ) {

                        val newKids = imageList[page]
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White)
                        ) {
                            AndroidView(
                                factory = { context ->
                                    ImageView(context).apply {
                                        layoutParams = ViewGroup.LayoutParams(
                                            ViewGroup.LayoutParams.MATCH_PARENT,
                                            ViewGroup.LayoutParams.MATCH_PARENT
                                        )
                                        scaleType = ImageView.ScaleType.CENTER_CROP
                                    }
                                },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(200.dp),
                                update = { imageView ->
                                    Glide.with(imageView.context)
                                        .load(newKids.url)
                                        .into(imageView)
                                }
                            )

                        }


                    }

                }

                //Horizontal dot indicator
                HorizontalPagerIndicator(
                    pagerState = pagerState,modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(16.dp)
                )

            }

        }

        val imageList = arrayListOf(
            ImageItem(
                UUID.randomUUID().toString(),
                "https://fastly.picsum.photos/id/866/500/500.jpg?hmac=FOptChXpmOmfR5SpiL2pp74Yadf1T_bRhBF1wJZa9hg"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://fastly.picsum.photos/id/270/500/500.jpg?hmac=MK7XNrBrZ73QsthvGaAkiNoTl65ZDlUhEO-6fnd-ZnY"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://fastly.picsum.photos/id/320/500/500.jpg?hmac=2iE7TIF9kIqQOHrIUPOJx2wP1CJewQIZBeMLIRrm74s"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://fastly.picsum.photos/id/798/500/500.jpg?hmac=Bmzk6g3m8sUiEVHfJWBscr2DUg8Vd2QhN7igHBXLLfo"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://fastly.picsum.photos/id/95/500/500.jpg?hmac=0aldBQ7cQN5D_qyamlSP5j51o-Og4gRxSq4AYvnKk2U"
            ),
            ImageItem(
                UUID.randomUUID().toString(),
                "https://fastly.picsum.photos/id/778/500/500.jpg?hmac=jZLZ6WV_OGRxAIIYPk7vGRabcAGAILzxVxhqSH9uLas"
            )
        )
        data class ImageItem(
            val id : String,
            val url : String
        )


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
                        val (startOffset, endOffset) = Utils.GradientWithAngleExample(90f)
                    }
                    .wrapContentHeight()
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

    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        ComposeDemoTheme {
            HomeScreen()
        }
    }
}

