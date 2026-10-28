package com.tencent.qcloud.core.http;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.http.HttpLoggingInterceptor;
import com.tencent.qcloud.core.http.QCloudHttpClient;
import com.tencent.qcloud.core.http.interceptor.RedirectInterceptor;
import com.tencent.qcloud.core.http.interceptor.RetryInterceptor;
import com.tencent.qcloud.core.http.interceptor.TrafficControlInterceptor;
import java.io.ByteArrayInputStream;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.b0;
import okhttp3.e;
import okhttp3.q;
import okhttp3.r;

/* loaded from: classes7.dex */
public class OkHttpClientImpl extends NetworkClient {
    private r.c mEventListenerFactory = new r.c() { // from class: com.tencent.qcloud.core.http.OkHttpClientImpl.1
        @Override // okhttp3.r.c
        public r create(e eVar) {
            return new CallMetricsListener(eVar);
        }
    };
    private b0 okHttpClient;

    @Override // com.tencent.qcloud.core.http.NetworkClient
    public NetworkProxy getNetworkProxy() {
        return new OkHttpProxy(this.okHttpClient);
    }

    @Override // com.tencent.qcloud.core.http.NetworkClient
    public void init(QCloudHttpClient.Builder builder, HostnameVerifier hostnameVerifier, q qVar, HttpLogger httpLogger) {
        super.init(builder, hostnameVerifier, qVar, httpLogger);
        synchronized (QCloudHttpClient.okHttpClientBuilderLock) {
            try {
                HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(httpLogger);
                httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);
                b0.a aVar = builder.mBuilder;
                aVar.a0().clear();
                RedirectInterceptor redirectInterceptor = new RedirectInterceptor();
                b0.a q4 = aVar.t(false).u(true).Z(hostnameVerifier).q(qVar);
                long j4 = builder.connectionTimeout;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                q4.k(j4, timeUnit).j0(builder.socketTimeout, timeUnit).R0(builder.socketTimeout, timeUnit).s(this.mEventListenerFactory).c(httpLoggingInterceptor).c(new RetryInterceptor(builder.retryStrategy)).c(new TrafficControlInterceptor());
                if (builder.redirectEnable) {
                    aVar.c(redirectInterceptor);
                }
                if (!builder.verifySSLEnable) {
                    try {
                        aVar.Z(new HostnameVerifier() { // from class: com.tencent.qcloud.core.http.OkHttpClientImpl.2
                            @Override // javax.net.ssl.HostnameVerifier
                            public boolean verify(String str, SSLSession sSLSession) {
                                return true;
                            }
                        });
                        TrustManager[] trustManagerArr = {new X509TrustManager() { // from class: com.tencent.qcloud.core.http.OkHttpClientImpl.3
                            @Override // javax.net.ssl.X509TrustManager
                            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
                            }

                            @Override // javax.net.ssl.X509TrustManager
                            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
                            }

                            @Override // javax.net.ssl.X509TrustManager
                            public X509Certificate[] getAcceptedIssuers() {
                                return new X509Certificate[0];
                            }
                        }};
                        SSLContext sSLContext = SSLContext.getInstance(ProtectedSandApp.s("姟\u0001"));
                        sSLContext.init(null, trustManagerArr, new SecureRandom());
                        aVar.Q0(sSLContext.getSocketFactory(), (X509TrustManager) trustManagerArr[0]);
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                }
                if (builder.clientCertificateBytes != null) {
                    try {
                        KeyStore keyStore = KeyStore.getInstance(ProtectedSandApp.s("姠\u0001"));
                        if (builder.clientCertificateBytes == null) {
                            throw new IllegalStateException(ProtectedSandApp.s("姡\u0001"));
                        }
                        keyStore.load(new ByteArrayInputStream(builder.clientCertificateBytes), builder.clientCertificatePassword);
                        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                        keyManagerFactory.init(keyStore, builder.clientCertificatePassword);
                        KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        SSLContext sSLContext2 = SSLContext.getInstance(ProtectedSandApp.s("姟\u0001"));
                        sSLContext2.init(keyManagers, trustManagers, new SecureRandom());
                        aVar.Q0(sSLContext2.getSocketFactory(), (X509TrustManager) trustManagers[0]);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
                b0 b0Var = new b0(aVar);
                this.okHttpClient = b0Var;
                redirectInterceptor.setClient(b0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
