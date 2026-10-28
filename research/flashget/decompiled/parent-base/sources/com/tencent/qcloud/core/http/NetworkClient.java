package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.http.QCloudHttpClient;
import com.tencent.qcloud.core.http.interceptor.QCloudRetryInterceptor;
import com.tencent.qcloud.core.http.interceptor.QCloudTrafficControlInterceptor;
import com.tencent.qcloud.core.task.RetryStrategy;
import javax.net.ssl.HostnameVerifier;
import okhttp3.q;

/* loaded from: classes7.dex */
public abstract class NetworkClient {
    protected q dns;
    protected HttpLogger httpLogger;
    private QCloudRetryInterceptor retryInterceptor;
    protected RetryStrategy retryStrategy;

    public void enableQCloudInterceptor() {
        this.retryInterceptor = new QCloudRetryInterceptor(this.retryStrategy, new QCloudTrafficControlInterceptor());
    }

    public abstract NetworkProxy getNetworkProxy();

    public NetworkProxy getNetworkProxyWrapper() {
        NetworkProxy networkProxy = getNetworkProxy();
        networkProxy.setRetryInterceptor(this.retryInterceptor);
        return networkProxy;
    }

    public void init(QCloudHttpClient.Builder builder, HostnameVerifier hostnameVerifier, q qVar, HttpLogger httpLogger) {
        this.retryStrategy = builder.retryStrategy;
        this.httpLogger = httpLogger;
        this.dns = qVar;
    }
}
