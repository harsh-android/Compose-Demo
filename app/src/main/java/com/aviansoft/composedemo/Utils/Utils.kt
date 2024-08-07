package com.aviansoft.composedemo.Utils

import androidx.compose.ui.geometry.Offset
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

class Utils {


    companion object {
        fun GradientWithAngleExample(angleDegrees: Float): Pair<Offset, Offset> {
            // Convert angle to radians
            val angleRadians = angleDegrees * (PI / 180.0)

            // Calculate start and end offsets based on the angle
            val startX = cos(angleRadians).toFloat() * 2000f
            val startY = sin(angleRadians).toFloat() * 2000f
            val endX = -cos(angleRadians).toFloat() * 2000f
            val endY = -sin(angleRadians).toFloat() * 2000f

            return Pair(Offset(startX, startY), Offset(endX, endY))
        }


        fun getGradientOffsets(
            angleDegrees: Float,
            width: Float,
            height: Float
        ): Pair<Offset, Offset> {
            // Convert angle to radians
            val angleRadians = angleDegrees * (PI / 180.0)

            // Calculate the direction vector based on the angle
            val dx = width / 2 * cos(angleRadians).toFloat()
            val dy = height / 2 * sin(angleRadians).toFloat()

            // Define the start and end points
            val startOffset = Offset(width / 2 - dx, height / 2 - dy)
            val endOffset = Offset(width / 2 + dx, height / 2 + dy)

            return Pair(startOffset, endOffset)
        }
    }
}