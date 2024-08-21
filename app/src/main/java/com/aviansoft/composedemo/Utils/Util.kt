package com.aviansoft.composedemo.Utils

import android.annotation.SuppressLint
import androidx.compose.ui.geometry.Offset
import java.util.Base64
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

class Util {


    companion object {


        //        API
        var BASE_URL = "aHR0cHM6Ly9jb3BhcGkuY29tL2FwaS8="
        val OTP_BASE_URL = ""
        val countryCode = "91"

        val mail = ""


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

        @SuppressLint("NewApi")
        fun decodeFromBase64(base64: String): String {
            val bytes = Base64.getDecoder().decode(base64)
            return String(bytes, Charsets.UTF_8)
        }

    }
}