package com.tencent.qcloud.core.http;

import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.constraintlayout.core.motion.key.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.auth.QCloudCredentialProvider;
import com.tencent.qcloud.core.logger.COSLogger;
import com.tencent.qcloud.core.task.QCloudTask;
import com.tencent.qcloud.core.task.RetryStrategy;
import com.tencent.qcloud.core.task.TaskManager;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import okhttp3.b0;
import okhttp3.e;
import okhttp3.q;
import okhttp3.r;
import org.apache.log4j.Priority;

/* loaded from: classes7.dex */
public final class QCloudHttpClient {
    private static volatile QCloudHttpClient gDefault;
    private static b0.a okHttpClientBuilder;
    private final ConnectionRepository connectionRepository;
    private boolean dnsCache;
    private final ArrayList<QCloudDnsFetch> dnsFetchs;
    private final Map<String, List<InetAddress>> dnsMap;
    private final HttpLogger httpLogger;
    private q mDns;
    private r.c mEventListenerFactory;
    private HostnameVerifier mHostnameVerifier;
    private String networkClientType;
    private OkHttpClientImpl okhttpNetworkClient;
    private final TaskManager taskManager;
    private final Set<String> verifiedHost;
    public static final String HTTP_LOG_TAG = ProtectedSandApp.s("娆\u0001");
    public static final String QUIC_LOG_TAG = ProtectedSandApp.s("娇\u0001");
    private static Map<Integer, NetworkClient> networkClientMap = new ConcurrentHashMap(2);
    public static final Object okHttpClientBuilderLock = new Object();

    public static final class Builder {
        byte[] clientCertificateBytes;
        char[] clientCertificatePassword;
        b0.a mBuilder;
        NetworkClient networkClient;
        QCloudHttpRetryHandler qCloudHttpRetryHandler;
        RetryStrategy retryStrategy;
        int connectionTimeout = 15000;
        int socketTimeout = Priority.WARN_INT;
        List<String> prefetchHost = new LinkedList();
        boolean dnsCache = false;
        boolean verifySSLEnable = true;
        boolean redirectEnable = false;

        public Builder addPrefetchHost(String str) {
            this.prefetchHost.add(str);
            return this;
        }

        public QCloudHttpClient build() {
            if (this.retryStrategy == null) {
                this.retryStrategy = RetryStrategy.DEFAULT;
            }
            QCloudHttpRetryHandler qCloudHttpRetryHandler = this.qCloudHttpRetryHandler;
            if (qCloudHttpRetryHandler != null) {
                this.retryStrategy.setRetryHandler(qCloudHttpRetryHandler);
            }
            synchronized (QCloudHttpClient.okHttpClientBuilderLock) {
                try {
                    if (this.mBuilder == null) {
                        if (QCloudHttpClient.okHttpClientBuilder == null) {
                            b0.a unused = QCloudHttpClient.okHttpClientBuilder = new b0.a();
                        }
                        this.mBuilder = QCloudHttpClient.okHttpClientBuilder;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new QCloudHttpClient(this);
        }

        public Builder dnsCache(boolean z4) {
            this.dnsCache = z4;
            return this;
        }

        public Builder setClientCertificate(byte[] bArr, char[] cArr) {
            this.clientCertificateBytes = bArr;
            this.clientCertificatePassword = cArr;
            return this;
        }

        public Builder setConnectionTimeout(int i4) {
            if (i4 < 3000) {
                throw new IllegalArgumentException(ProtectedSandApp.s("娄\u0001"));
            }
            this.connectionTimeout = i4;
            return this;
        }

        public Builder setInheritBuilder(b0.a aVar) {
            this.mBuilder = aVar;
            return this;
        }

        public Builder setNetworkClient(NetworkClient networkClient) {
            this.networkClient = networkClient;
            return this;
        }

        public Builder setQCloudHttpRetryHandler(QCloudHttpRetryHandler qCloudHttpRetryHandler) {
            this.qCloudHttpRetryHandler = qCloudHttpRetryHandler;
            return this;
        }

        public Builder setRedirectEnable(boolean z4) {
            this.redirectEnable = z4;
            return this;
        }

        public Builder setRetryStrategy(RetryStrategy retryStrategy) {
            this.retryStrategy = retryStrategy;
            return this;
        }

        public Builder setSocketTimeout(int i4) {
            if (i4 < 3000) {
                throw new IllegalArgumentException(ProtectedSandApp.s("娅\u0001"));
            }
            this.socketTimeout = i4;
            return this;
        }

        public Builder setVerifySSLEnable(boolean z4) {
            this.verifySSLEnable = z4;
            return this;
        }
    }

    public interface QCloudDnsFetch {
        List<InetAddress> fetch(String str) throws UnknownHostException;
    }

    public static QCloudHttpClient getDefault() {
        if (gDefault == null) {
            synchronized (QCloudHttpClient.class) {
                try {
                    if (gDefault == null) {
                        gDefault = new Builder().build();
                    }
                } finally {
                }
            }
        }
        return gDefault;
    }

    private <T> HttpTask<T> handleRequest(HttpRequest<T> httpRequest, QCloudCredentialProvider qCloudCredentialProvider, String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.networkClientType;
        }
        return OkHttpClientImpl.class.getName().equals(str) ? new HttpTask<>(httpRequest, qCloudCredentialProvider, this.okhttpNetworkClient) : new HttpTask<>(httpRequest, qCloudCredentialProvider, networkClientMap.get(Integer.valueOf(str.hashCode())));
    }

    private HostnameVerifier hostnameVerifier() {
        return this.mHostnameVerifier;
    }

    public void addDnsFetch(@o0 QCloudDnsFetch qCloudDnsFetch) {
        this.dnsFetchs.add(qCloudDnsFetch);
    }

    public void addDnsRecord(@o0 String str, @o0 String[] strArr) throws UnknownHostException {
        if (strArr.length > 0) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str2 : strArr) {
                arrayList.add(InetAddress.getByName(str2));
            }
            this.dnsMap.put(str, arrayList);
        }
    }

    public void addVerifiedHost(String str) {
        if (str != null) {
            this.verifiedHost.add(str);
        }
    }

    public List<HttpTask> getTasksByTag(String str) {
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            return arrayList;
        }
        for (QCloudTask qCloudTask : this.taskManager.snapshot()) {
            if ((qCloudTask instanceof HttpTask) && str.equals(qCloudTask.getTag())) {
                arrayList.add((HttpTask) qCloudTask);
            }
        }
        return arrayList;
    }

    public <T> HttpTask<T> resolveRequest(HttpRequest<T> httpRequest) {
        return handleRequest(httpRequest, null, null);
    }

    public void setNetworkClientType(Builder builder) {
        OkHttpClientImpl okHttpClientImpl = new OkHttpClientImpl();
        this.okhttpNetworkClient = okHttpClientImpl;
        okHttpClientImpl.init(builder, hostnameVerifier(), this.mDns, this.httpLogger);
        NetworkClient networkClient = builder.networkClient;
        if (networkClient != null) {
            this.networkClientType = networkClient.getClass().getName();
            if (OkHttpClientImpl.class.getName().equals(this.networkClientType) && (networkClient instanceof OkHttpClientImpl)) {
                if (this.okhttpNetworkClient == null) {
                    OkHttpClientImpl okHttpClientImpl2 = (OkHttpClientImpl) networkClient;
                    this.okhttpNetworkClient = okHttpClientImpl2;
                    okHttpClientImpl2.init(builder, hostnameVerifier(), this.mDns, this.httpLogger);
                    return;
                }
                return;
            }
            int hashCode = this.networkClientType.hashCode();
            if (networkClientMap.containsKey(Integer.valueOf(hashCode))) {
                return;
            }
            networkClient.init(builder, hostnameVerifier(), this.mDns, this.httpLogger);
            if (!ProtectedSandApp.s("娈\u0001").equals(this.networkClientType)) {
                networkClient.enableQCloudInterceptor();
            }
            networkClientMap.put(Integer.valueOf(hashCode), networkClient);
        }
    }

    private QCloudHttpClient(Builder builder) {
        this.networkClientType = OkHttpClientImpl.class.getName();
        this.dnsCache = true;
        this.mHostnameVerifier = new HostnameVerifier() { // from class: com.tencent.qcloud.core.http.QCloudHttpClient.1
            @Override // javax.net.ssl.HostnameVerifier
            public boolean verify(String str, SSLSession sSLSession) {
                if (QCloudHttpClient.this.verifiedHost.size() > 0) {
                    Iterator it = QCloudHttpClient.this.verifiedHost.iterator();
                    while (it.hasNext()) {
                        if (HttpsURLConnection.getDefaultHostnameVerifier().verify((String) it.next(), sSLSession)) {
                            return true;
                        }
                    }
                }
                return HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
            }
        };
        this.mDns = new q() { // from class: com.tencent.qcloud.core.http.QCloudHttpClient.2
            @Override // okhttp3.q
            public List<InetAddress> lookup(String str) throws UnknownHostException {
                List<InetAddress> list = QCloudHttpClient.this.dnsMap.containsKey(str) ? (List) QCloudHttpClient.this.dnsMap.get(str) : null;
                if (list == null || list.size() == 0) {
                    Iterator it = QCloudHttpClient.this.dnsFetchs.iterator();
                    while (it.hasNext()) {
                        QCloudDnsFetch qCloudDnsFetch = (QCloudDnsFetch) it.next();
                        if (qCloudDnsFetch != null) {
                            try {
                                list = qCloudDnsFetch.fetch(str);
                                if (list != null) {
                                    break;
                                }
                            } catch (UnknownHostException unused) {
                                continue;
                            }
                        }
                    }
                }
                String s4 = ProtectedSandApp.s("娀\u0001");
                if (list == null || list.size() == 0) {
                    try {
                        list = q.f85056a.lookup(str);
                    } catch (UnknownHostException unused2) {
                        COSLogger.wNetwork(s4, ProtectedSandApp.s("威\u0001"));
                    }
                }
                if ((list == null || list.size() == 0) && !QCloudHttpClient.this.dnsCache) {
                    throw new UnknownHostException(c.a(ProtectedSandApp.s("娃\u0001"), str));
                }
                if (list == null || list.size() == 0) {
                    try {
                        list = QCloudHttpClient.this.connectionRepository.getDnsRecord(str);
                    } catch (UnknownHostException unused3) {
                        COSLogger.wNetwork(s4, ProtectedSandApp.s("娂\u0001"));
                    }
                }
                if (list == null || list.size() <= 0) {
                    throw new UnknownHostException(str);
                }
                ConnectionRepository.getInstance().insertDnsRecordCache(str, list);
                return list;
            }
        };
        this.mEventListenerFactory = new r.c() { // from class: com.tencent.qcloud.core.http.QCloudHttpClient.3
            @Override // okhttp3.r.c
            public r create(e eVar) {
                return new CallMetricsListener(eVar);
            }
        };
        this.verifiedHost = new HashSet(5);
        this.dnsMap = new ConcurrentHashMap(3);
        this.dnsFetchs = new ArrayList<>(3);
        this.taskManager = TaskManager.getInstance();
        ConnectionRepository connectionRepository = ConnectionRepository.getInstance();
        this.connectionRepository = connectionRepository;
        HttpLogger httpLogger = new HttpLogger();
        this.httpLogger = httpLogger;
        OkHttpClientImpl okHttpClientImpl = new OkHttpClientImpl();
        this.okhttpNetworkClient = okHttpClientImpl;
        okHttpClientImpl.init(builder, hostnameVerifier(), this.mDns, httpLogger);
        NetworkClient networkClient = builder.networkClient;
        networkClient = networkClient == null ? new OkHttpClientImpl() : networkClient;
        this.networkClientType = networkClient.getClass().getName();
        if (!OkHttpClientImpl.class.getName().equals(this.networkClientType) || !(networkClient instanceof OkHttpClientImpl)) {
            int hashCode = this.networkClientType.hashCode();
            if (!networkClientMap.containsKey(Integer.valueOf(hashCode))) {
                networkClient.init(builder, hostnameVerifier(), this.mDns, httpLogger);
                if (!ProtectedSandApp.s("娈\u0001").equals(this.networkClientType)) {
                    networkClient.enableQCloudInterceptor();
                }
                networkClientMap.put(Integer.valueOf(hashCode), networkClient);
            }
        } else if (this.okhttpNetworkClient == null) {
            OkHttpClientImpl okHttpClientImpl2 = (OkHttpClientImpl) networkClient;
            this.okhttpNetworkClient = okHttpClientImpl2;
            okHttpClientImpl2.init(builder, hostnameVerifier(), this.mDns, httpLogger);
        }
        connectionRepository.addPrefetchHosts(builder.prefetchHost);
        connectionRepository.init();
    }

    public <T> HttpTask<T> resolveRequest(HttpRequest<T> httpRequest, String str) {
        return handleRequest(httpRequest, null, str);
    }

    public <T> HttpTask<T> resolveRequest(QCloudHttpRequest<T> qCloudHttpRequest, QCloudCredentialProvider qCloudCredentialProvider) {
        return handleRequest(qCloudHttpRequest, qCloudCredentialProvider, null);
    }

    public <T> HttpTask<T> resolveRequest(QCloudHttpRequest<T> qCloudHttpRequest, QCloudCredentialProvider qCloudCredentialProvider, String str) {
        return handleRequest(qCloudHttpRequest, qCloudCredentialProvider, str);
    }
}
