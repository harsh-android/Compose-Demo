package com.aviansoft.composedemo.API

import java.security.KeyStore
import javax.net.ssl.KeyManager
import javax.net.ssl.KeyManagerFactory
import javax.net.ssl.TrustManager
import javax.net.ssl.TrustManagerFactory
import javax.net.ssl.SSLContext as SSLContext1

class SSLTrustManagerHelper(
    private val keyStorePath: String,
    private val keyStorePassword: String,
    private val trustStorePath: String,
    private val trustStorePassword: String
) {

    init {
        if (keyStorePath.isBlank() || keyStorePassword.isBlank() || trustStorePath.isBlank() || trustStorePassword.isBlank()) {
            throw IllegalArgumentException("TrustStore or KeyStore details are empty, which are required to be present when SSL is enabled")
        }
    }

    fun clientSSLContext(): SSLContext1 {
        return try {
            val trustManagerFactory = getTrustManagerFactory(trustStorePath, trustStorePassword)
            val keyManagerFactory = getKeyManagerFactory(keyStorePath, keyStorePassword)

            getSSLContext(keyManagerFactory.keyManagers, trustManagerFactory.trustManagers)
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    private fun getSSLContext(keyManagers: Array<KeyManager>, trustManagers: Array<TrustManager>): SSLContext1 {
        val sslContext = SSLContext1.getInstance("TLSv1.2")
        sslContext.init(keyManagers, trustManagers, null)
        return sslContext
    }

    private fun getKeyManagerFactory(keystorePath: String, keystorePassword: String): KeyManagerFactory {
        
        val keyStore = loadKeyStore(keystorePath, keystorePassword)
        val keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm())
        keyManagerFactory.init(keyStore, keystorePassword.toCharArray())
        return keyManagerFactory
    }

    private fun getTrustManagerFactory(truststorePath: String, truststorePassword: String): TrustManagerFactory {
        val trustStore = loadKeyStore(truststorePath, truststorePassword)
        val trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm())
        trustManagerFactory.init(trustStore)
        return trustManagerFactory
    }

    private fun loadKeyStore(keystorePath: String, keystorePassword: String): KeyStore {
        val keystoreInputStream = SSLTrustManagerHelper::class.java.classLoader.getResourceAsStream(keystorePath)
            ?: throw IllegalArgumentException("Could not find the keystore file with the given location $keystorePath")

        val keyStore = KeyStore.getInstance(KeyStore.getDefaultType())
        keyStore.load(keystoreInputStream, keystorePassword.toCharArray())
        keystoreInputStream.close()
        return keyStore
    }
}