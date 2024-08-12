package com.aviansoft.composedemo.API;

import android.content.Context;

import com.aviansoft.composedemo.R;

import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

import okhttp3.OkHttpClient;

public class MTLSHelper {
//    public static OkHttpClient createMTLSClient(Context context) throws Exception {
//        // Load the client certificate
//        InputStream clientCertInputStream = context.getResources().openRawResource(R.raw.client_cert); // Assuming client_cert.p12 is in res/raw folder
//        KeyStore clientKeyStore = KeyStore.getInstance("PKCS12");
//        clientKeyStore.load(clientCertInputStream, "password".toCharArray());
//
//        // Initialize KeyManagerFactory with the client certificate
//        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
//        keyManagerFactory.init(clientKeyStore, "password".toCharArray());
//
//        // Load the CA certificate
//        InputStream caCertInputStream = context.getResources().openRawResource(R.raw.ca_cert); // Assuming ca_cert.crt is in res/raw folder
//        KeyStore trustKeyStore = KeyStore.getInstance(KeyStore.getDefaultType());
//        trustKeyStore.load(null);
//        trustKeyStore.setCertificateEntry("ca", CertificateFactory.getInstance("X.509").generateCertificate(caCertInputStream));
//
//        // Initialize TrustManagerFactory with the CA certificate
//        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
//        trustManagerFactory.init(trustKeyStore);
//
//        // Initialize SSLContext with both the client and CA certificates
//        SSLContext sslContext = SSLContext.getInstance("TLS");
//        sslContext.init(keyManagerFactory.getKeyManagers(), trustManagerFactory.getTrustManagers(), null);
//
//        // Create OkHttpClient with the configured SSLContext
//        OkHttpClient client = new OkHttpClient.Builder()
//                .sslSocketFactory(sslContext.getSocketFactory(), (X509TrustManager) trustManagerFactory.getTrustManagers()[0])
//                .connectTimeout(30, TimeUnit.SECONDS) // Adjust as needed
//                .readTimeout(30, TimeUnit.SECONDS) // Adjust as needed
//                .writeTimeout(30, TimeUnit.SECONDS) // Adjust as needed
//                .build();
//
//        return client;
//    }
}
