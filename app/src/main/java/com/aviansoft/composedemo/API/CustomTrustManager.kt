package com.aviansoft.composedemo.API

import java.security.cert.X509Certificate
import javax.net.ssl.X509TrustManager

class CustomTrustManager(private val sslHelper: SSLTrustManagerHelper) : X509TrustManager {

    override fun checkClientTrusted(chain: Array<X509Certificate>, authType: String) {
        // Implement your custom client trust validation logic if needed
    }

    override fun checkServerTrusted(chain: Array<X509Certificate>, authType: String) {
        // Implement your custom server trust validation logic if needed
    }

    override fun getAcceptedIssuers(): Array<X509Certificate> {
        return arrayOf()
    }
}