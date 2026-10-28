package com.tencent.cos.xml;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.compose.material3.j4;
import androidx.compose.material3.z3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.http.NetworkClient;
import com.tencent.qcloud.core.http.QCloudHttpRetryHandler;
import com.tencent.qcloud.core.task.RetryStrategy;
import com.tencent.qcloud.core.task.TaskExecutors;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import org.apache.log4j.Priority;

/* loaded from: classes6.dex */
public class CosXmlServiceConfig implements Parcelable {
    private final boolean accelerate;
    private final String appid;
    private final boolean bucketInPath;
    private final byte[] clientCertificateBytes;
    private final char[] clientCertificatePassword;
    private final Map<String, List<String>> commonHeaders;
    private final int connectionTimeout;
    private final NetworkClient customizeNetworkClient;
    private final boolean dnsCache;
    private final boolean domainSwitch;
    private final int downloadMaxThreadCount;
    private final String endpointSuffix;
    private final Executor executor;
    private final String host;
    private String hostFormat;
    private String hostHeaderFormat;
    private final boolean isDebuggable;
    private final boolean isQuic;
    private final RequestNetworkStrategy networkSwitchStrategy;
    private final Set<String> noSignHeaders;
    private final Executor observeExecutor;
    private final int port;
    private List<String> prefetchHosts;
    private final String protocol;
    private final QCloudHttpRetryHandler qCloudHttpRetryHandler;
    private final boolean redirectEnable;
    private final String region;
    private final RetryStrategy retryStrategy;
    private final boolean signInUrl;
    private final int socketTimeout;
    private final boolean transferThreadControl;
    private final int uploadMaxThreadCount;
    private final String userAgentExtended;
    private final boolean verifySSLEnable;
    public static final String CI_REGION_HOST_FORMAT = ProtectedSandApp.s("㓒\u0001");
    public static final String PATH_STYLE_HOST_FORMAT = ProtectedSandApp.s("㓓\u0001");
    public static final String PIC_HOST_FORMAT = ProtectedSandApp.s("㓔\u0001");
    public static final String CI_HOST_FORMAT = ProtectedSandApp.s("㓕\u0001");
    public static final String CI_APPID_HOST_FORMAT = ProtectedSandApp.s("㓖\u0001");
    public static final String HTTP_PROTOCOL = ProtectedSandApp.s("㓗\u0001");
    public static final String HTTPS_PROTOCOL = ProtectedSandApp.s("㓘\u0001");
    public static final String ACCELERATE_ENDPOINT_SUFFIX = ProtectedSandApp.s("㓙\u0001");
    public static final String ACCELERATE_HOST_FORMAT = ProtectedSandApp.s("㓚\u0001");
    public static final String DEFAULT_HOST_FORMAT = ProtectedSandApp.s("㓛\u0001");
    public static final Parcelable.Creator<CosXmlServiceConfig> CREATOR = new Parcelable.Creator<CosXmlServiceConfig>() { // from class: com.tencent.cos.xml.CosXmlServiceConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CosXmlServiceConfig createFromParcel(Parcel parcel) {
            return new CosXmlServiceConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CosXmlServiceConfig[] newArray(int i4) {
            return new CosXmlServiceConfig[i4];
        }
    };

    public static final class Builder {
        private boolean accelerate;
        private String appid;
        private boolean bucketInPath;
        private byte[] clientCertificateBytes;
        private char[] clientCertificatePassword;
        private Map<String, List<String>> commonHeaders;
        private int connectionTimeout;
        private NetworkClient customizeNetworkClient;
        private boolean dnsCache;
        private boolean domainSwitch;
        private int downloadMaxThreadCount;
        private String endpointSuffix;
        private Executor executor;
        private String host;
        private String hostFormat;
        private String hostHeaderFormat;
        private boolean isDebuggable;
        private boolean isQuic;
        private RequestNetworkStrategy networkSwitchStrategy;
        private Set<String> noSignHeaders;
        private Executor observeExecutor;
        private int port;
        private String protocol;
        private QCloudHttpRetryHandler qCloudHttpRetryHandler;
        private boolean redirectEnable;
        private String region;
        private RetryStrategy retryStrategy;
        private boolean signInUrl;
        private int socketTimeout;
        private boolean transferThreadControl;
        private int uploadMaxThreadCount;
        private String userAgentExtended;
        private boolean verifySSLEnable;

        public Builder() {
            this.port = -1;
            this.connectionTimeout = 15000;
            this.socketTimeout = Priority.WARN_INT;
            this.isQuic = false;
            this.dnsCache = true;
            this.commonHeaders = new HashMap();
            this.noSignHeaders = new HashSet();
            this.transferThreadControl = true;
            this.protocol = ProtectedSandApp.s("㓎\u0001");
            this.isDebuggable = false;
            this.retryStrategy = RetryStrategy.DEFAULT;
            this.bucketInPath = false;
            this.uploadMaxThreadCount = TaskExecutors.UPLOAD_THREAD_COUNT;
            this.downloadMaxThreadCount = TaskExecutors.DOWNLOAD_THREAD_COUNT;
            this.domainSwitch = true;
            this.verifySSLEnable = true;
            this.clientCertificateBytes = null;
            this.clientCertificatePassword = null;
            this.redirectEnable = false;
            this.customizeNetworkClient = null;
        }

        public Builder addHeader(String str, String str2) {
            List<String> list = this.commonHeaders.get(str);
            if (list == null) {
                list = new LinkedList<>();
            }
            list.add(str2);
            this.commonHeaders.put(str, list);
            return this;
        }

        public Builder addNoSignHeaders(String str) {
            this.noSignHeaders.add(str);
            return this;
        }

        public CosXmlServiceConfig builder() {
            return new CosXmlServiceConfig(this);
        }

        public Builder dnsCache(boolean z4) {
            this.dnsCache = z4;
            return this;
        }

        public Builder enableQuic(boolean z4) {
            this.isQuic = z4;
            return this;
        }

        public Builder isHttps(boolean z4) {
            if (z4) {
                this.protocol = ProtectedSandApp.s("㓎\u0001");
            } else {
                this.protocol = ProtectedSandApp.s("㓏\u0001");
            }
            return this;
        }

        public Builder setAccelerate(boolean z4) {
            this.accelerate = z4;
            return this;
        }

        @Deprecated
        public Builder setAppidAndRegion(String str, String str2) {
            this.appid = str;
            this.region = str2;
            return this;
        }

        @Deprecated
        public Builder setBucketInPath(boolean z4) {
            this.bucketInPath = z4;
            return this;
        }

        public Builder setClientCertificate(byte[] bArr, String str) {
            this.clientCertificateBytes = bArr;
            this.clientCertificatePassword = str.toCharArray();
            return this;
        }

        public Builder setConnectionTimeout(int i4) {
            this.connectionTimeout = i4;
            return this;
        }

        public Builder setCustomizeNetworkClient(NetworkClient networkClient) {
            this.customizeNetworkClient = networkClient;
            return this;
        }

        public Builder setDebuggable(boolean z4) {
            this.isDebuggable = z4;
            return this;
        }

        public Builder setDomainSwitch(boolean z4) {
            this.domainSwitch = z4;
            return this;
        }

        public Builder setDownloadMaxThreadCount(int i4) {
            this.downloadMaxThreadCount = i4;
            return this;
        }

        @Deprecated
        public Builder setEndpointSuffix(String str) {
            this.endpointSuffix = str;
            return this;
        }

        public Builder setExecutor(Executor executor) {
            this.executor = executor;
            return this;
        }

        public Builder setHost(String str) {
            this.host = str;
            return this;
        }

        public Builder setHostFormat(String str) {
            this.hostFormat = str;
            return this;
        }

        public Builder setNetworkSwitchStrategy(RequestNetworkStrategy requestNetworkStrategy) {
            this.networkSwitchStrategy = requestNetworkStrategy;
            return this;
        }

        public Builder setObserveExecutor(Executor executor) {
            this.observeExecutor = executor;
            return this;
        }

        public Builder setPathStyle(boolean z4) {
            this.bucketInPath = z4;
            return this;
        }

        public Builder setPort(int i4) {
            this.port = i4;
            return this;
        }

        public Builder setRedirectEnable(boolean z4) {
            this.redirectEnable = z4;
            return this;
        }

        public Builder setRegion(String str) {
            this.region = str;
            return this;
        }

        public Builder setRetryHandler(QCloudHttpRetryHandler qCloudHttpRetryHandler) {
            this.qCloudHttpRetryHandler = qCloudHttpRetryHandler;
            return this;
        }

        public Builder setRetryStrategy(RetryStrategy retryStrategy) {
            this.retryStrategy = retryStrategy;
            return this;
        }

        public Builder setSignInUrl(boolean z4) {
            this.signInUrl = z4;
            return this;
        }

        public Builder setSocketTimeout(int i4) {
            this.socketTimeout = i4;
            return this;
        }

        public Builder setTransferThreadControl(boolean z4) {
            this.transferThreadControl = z4;
            return this;
        }

        public Builder setUploadMaxThreadCount(int i4) {
            this.uploadMaxThreadCount = i4;
            return this;
        }

        public Builder setUserAgentExtended(String str) {
            this.userAgentExtended = str;
            return this;
        }

        public Builder setVerifySSLEnable(boolean z4) {
            this.verifySSLEnable = z4;
            return this;
        }

        public Builder setHost(Uri uri) {
            this.host = uri.getHost();
            if (uri.getPort() != -1) {
                this.port = uri.getPort();
            }
            this.protocol = uri.getScheme();
            return this;
        }

        public Builder(CosXmlServiceConfig cosXmlServiceConfig) {
            this.port = -1;
            this.connectionTimeout = 15000;
            this.socketTimeout = Priority.WARN_INT;
            this.isQuic = false;
            this.dnsCache = true;
            this.commonHeaders = new HashMap();
            this.noSignHeaders = new HashSet();
            this.transferThreadControl = true;
            this.protocol = cosXmlServiceConfig.protocol;
            this.region = cosXmlServiceConfig.region;
            this.appid = cosXmlServiceConfig.appid;
            this.host = cosXmlServiceConfig.host;
            this.port = cosXmlServiceConfig.port;
            this.endpointSuffix = cosXmlServiceConfig.endpointSuffix;
            this.bucketInPath = cosXmlServiceConfig.bucketInPath;
            this.isDebuggable = cosXmlServiceConfig.isDebuggable;
            this.retryStrategy = cosXmlServiceConfig.retryStrategy;
            this.qCloudHttpRetryHandler = cosXmlServiceConfig.qCloudHttpRetryHandler;
            this.connectionTimeout = cosXmlServiceConfig.connectionTimeout;
            this.socketTimeout = cosXmlServiceConfig.socketTimeout;
            this.executor = cosXmlServiceConfig.executor;
            this.observeExecutor = cosXmlServiceConfig.observeExecutor;
            this.isQuic = cosXmlServiceConfig.isQuic;
            this.networkSwitchStrategy = cosXmlServiceConfig.networkSwitchStrategy;
            this.dnsCache = cosXmlServiceConfig.dnsCache;
            this.commonHeaders = cosXmlServiceConfig.commonHeaders;
            this.noSignHeaders = cosXmlServiceConfig.noSignHeaders;
            this.hostFormat = cosXmlServiceConfig.hostFormat;
            this.hostHeaderFormat = cosXmlServiceConfig.hostHeaderFormat;
            this.accelerate = cosXmlServiceConfig.accelerate;
            this.signInUrl = cosXmlServiceConfig.signInUrl;
            this.transferThreadControl = cosXmlServiceConfig.transferThreadControl;
            this.uploadMaxThreadCount = cosXmlServiceConfig.uploadMaxThreadCount;
            this.downloadMaxThreadCount = cosXmlServiceConfig.downloadMaxThreadCount;
            this.domainSwitch = cosXmlServiceConfig.domainSwitch;
            this.verifySSLEnable = cosXmlServiceConfig.verifySSLEnable;
            this.clientCertificateBytes = cosXmlServiceConfig.clientCertificateBytes;
            this.clientCertificatePassword = cosXmlServiceConfig.clientCertificatePassword;
            this.redirectEnable = cosXmlServiceConfig.redirectEnable;
            this.customizeNetworkClient = cosXmlServiceConfig.customizeNetworkClient;
        }
    }

    public enum RequestNetworkStrategy {
        Aggressive,
        Conservative
    }

    private String getFormatHost(String str, String str2, String str3) {
        if (str2 == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㓞\u0001"));
        }
        if (str3 != null) {
            return str.replace(ProtectedSandApp.s("㓟\u0001"), str3).replace(ProtectedSandApp.s("㓝\u0001"), str2);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("㓠\u0001"));
    }

    private String getFormatHostByAppId(String str, String str2, String str3) {
        if (str2 == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㓞\u0001"));
        }
        if (str3 != null) {
            return str.replace(ProtectedSandApp.s("㓡\u0001"), str3).replace(ProtectedSandApp.s("㓝\u0001"), str2);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("㓢\u0001"));
    }

    private String getHostFormat(boolean z4, boolean z5) {
        if (!TextUtils.isEmpty(this.hostFormat)) {
            return this.hostFormat;
        }
        String s4 = z4 ? ProtectedSandApp.s("㓚\u0001") : z5 ? ProtectedSandApp.s("㓓\u0001") : ProtectedSandApp.s("㓛\u0001");
        String str = this.endpointSuffix;
        if (str == null) {
            return s4;
        }
        String concat = this.bucketInPath ? str : ProtectedSandApp.s("㓣\u0001").concat(str);
        return z4 ? concat.replace(ProtectedSandApp.s("㓤\u0001"), ProtectedSandApp.s("㓙\u0001")) : concat;
    }

    private String substituteEndpointSuffix(String str, String str2) {
        return (TextUtils.isEmpty(str) || str2 == null) ? str : str.replace(ProtectedSandApp.s("㓝\u0001"), str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppid() {
        return this.appid;
    }

    public String getBucket(String str) {
        return getBucket(str, this.appid);
    }

    public byte[] getClientCertificateBytes() {
        return this.clientCertificateBytes;
    }

    public char[] getClientCertificatePassword() {
        return this.clientCertificatePassword;
    }

    public Map<String, List<String>> getCommonHeaders() {
        return this.commonHeaders;
    }

    public int getConnectionTimeout() {
        return this.connectionTimeout;
    }

    public NetworkClient getCustomizeNetworkClient() {
        return this.customizeNetworkClient;
    }

    @Deprecated
    public String getDefaultRequestHost(String str, String str2, String str3) {
        return getDefaultRequestHost(str, getBucket(str2, str3));
    }

    public int getDownloadMaxThreadCount() {
        return this.downloadMaxThreadCount;
    }

    @Deprecated
    public String getEndpointSuffix() {
        return getEndpointSuffix(this.region, false);
    }

    public Executor getExecutor() {
        return this.executor;
    }

    public String getHeaderHost(String str, String str2) {
        String str3 = this.hostHeaderFormat;
        return str3 != null ? getFormatHost(str3, str, str2) : "";
    }

    @Deprecated
    public String getHost(String str, boolean z4) {
        return getHost(str, null, z4);
    }

    public Set<String> getNoSignHeaders() {
        return this.noSignHeaders;
    }

    public Executor getObserveExecutor() {
        return this.observeExecutor;
    }

    public int getPort() {
        return this.port;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public QCloudHttpRetryHandler getQCloudHttpRetryHandler() {
        return this.qCloudHttpRetryHandler;
    }

    public String getRegion() {
        return this.region;
    }

    public String getRequestHost(String str, boolean z4) {
        return getRequestHost((String) null, str, z4);
    }

    public String getRequestHostByAppId(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(this.host)) {
            return this.host;
        }
        if (TextUtils.isEmpty(str)) {
            str = this.region;
        }
        return getFormatHostByAppId(str3, str, str2);
    }

    public RetryStrategy getRetryStrategy() {
        return this.retryStrategy;
    }

    public int getSocketTimeout() {
        return this.socketTimeout;
    }

    public Map<String, String> getTrackParams() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.host)) {
            hashMap.put(ProtectedSandApp.s("㓩\u0001"), this.host);
        }
        hashMap.put(ProtectedSandApp.s("㓪\u0001"), String.valueOf(isEnableQuic()));
        if (networkSwitchStrategy() != null) {
            hashMap.put(ProtectedSandApp.s("㓫\u0001"), networkSwitchStrategy().toString());
        }
        return hashMap;
    }

    public int getUploadMaxThreadCount() {
        return this.uploadMaxThreadCount;
    }

    public String getUrlPath(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        boolean z4 = this.bucketInPath;
        String s4 = ProtectedSandApp.s("㓬\u0001");
        if (z4) {
            String s5 = ProtectedSandApp.s("㓥\u0001");
            if (!str.endsWith(s5 + this.appid) && !TextUtils.isEmpty(this.appid)) {
                StringBuilder a5 = androidx.constraintlayout.core.e.a(str, s5);
                a5.append(this.appid);
                str = a5.toString();
            }
            sb.append(s4);
            sb.append(str);
        }
        if (str2 == null || str2.startsWith(s4)) {
            sb.append(str2);
        } else {
            sb.append(s4);
            sb.append(str2);
        }
        return sb.toString();
    }

    public String getUserAgentExtended() {
        return this.userAgentExtended;
    }

    public boolean isDebuggable() {
        return this.isDebuggable;
    }

    public boolean isDnsCache() {
        return this.dnsCache;
    }

    public boolean isDomainSwitch() {
        return this.domainSwitch;
    }

    public boolean isEnableQuic() {
        return this.isQuic;
    }

    public boolean isRedirectEnable() {
        return this.redirectEnable;
    }

    public boolean isSignInUrl() {
        return this.signInUrl;
    }

    public boolean isTransferThreadControl() {
        return this.transferThreadControl;
    }

    public boolean isVerifySSLEnable() {
        return this.verifySSLEnable;
    }

    public RequestNetworkStrategy networkSwitchStrategy() {
        return this.networkSwitchStrategy;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.protocol);
        parcel.writeString(this.region);
        parcel.writeInt(this.isDebuggable ? 1 : 0);
    }

    public CosXmlServiceConfig(Builder builder) {
        this.hostFormat = ProtectedSandApp.s("㓛\u0001");
        this.hostHeaderFormat = null;
        this.protocol = builder.protocol;
        this.userAgentExtended = builder.userAgentExtended;
        this.isDebuggable = builder.isDebuggable;
        this.appid = builder.appid;
        String str = builder.region;
        this.region = str;
        String str2 = builder.host;
        this.host = str2;
        this.port = builder.port;
        this.endpointSuffix = builder.endpointSuffix;
        this.bucketInPath = builder.bucketInPath;
        this.commonHeaders = builder.commonHeaders;
        this.noSignHeaders = builder.noSignHeaders;
        if (TextUtils.isEmpty(this.hostFormat) && TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㓜\u0001"));
        }
        this.retryStrategy = builder.retryStrategy;
        this.qCloudHttpRetryHandler = builder.qCloudHttpRetryHandler;
        this.socketTimeout = builder.socketTimeout;
        this.connectionTimeout = builder.connectionTimeout;
        this.hostFormat = builder.hostFormat;
        this.hostHeaderFormat = builder.hostHeaderFormat;
        this.executor = builder.executor;
        this.observeExecutor = builder.observeExecutor;
        this.isQuic = builder.isQuic;
        this.networkSwitchStrategy = builder.networkSwitchStrategy;
        this.accelerate = builder.accelerate;
        this.dnsCache = builder.dnsCache;
        this.signInUrl = builder.signInUrl;
        this.transferThreadControl = builder.transferThreadControl;
        this.uploadMaxThreadCount = builder.uploadMaxThreadCount;
        this.downloadMaxThreadCount = builder.downloadMaxThreadCount;
        this.domainSwitch = builder.domainSwitch;
        this.verifySSLEnable = builder.verifySSLEnable;
        this.clientCertificateBytes = builder.clientCertificateBytes;
        this.clientCertificatePassword = builder.clientCertificatePassword;
        this.redirectEnable = builder.redirectEnable;
        this.customizeNetworkClient = builder.customizeNetworkClient;
    }

    public String getBucket(String str, String str2) {
        if (str == null) {
            return str;
        }
        String s4 = ProtectedSandApp.s("㓥\u0001");
        StringBuilder sb = new StringBuilder(s4);
        sb.append(str2);
        return (str.endsWith(sb.toString()) || TextUtils.isEmpty(str2)) ? str : z3.a(str, s4, str2);
    }

    public String getDefaultRequestHost(String str, String str2) {
        return getFormatHost(ProtectedSandApp.s("㓛\u0001"), str, str2);
    }

    @Deprecated
    public String getEndpointSuffix(String str, boolean z4) {
        if (TextUtils.isEmpty(str)) {
            str = getRegion();
        }
        String str2 = this.endpointSuffix;
        String s4 = ProtectedSandApp.s("㓦\u0001");
        if (str2 == null && str != null) {
            str2 = android.support.v4.media.d.a(s4, str, ProtectedSandApp.s("㓧\u0001"));
        }
        String substituteEndpointSuffix = substituteEndpointSuffix(str2, str);
        if (substituteEndpointSuffix == null || !z4) {
            return substituteEndpointSuffix;
        }
        return substituteEndpointSuffix.replace(s4 + str, ProtectedSandApp.s("㓙\u0001"));
    }

    @Deprecated
    public String getHost(String str, String str2, boolean z4) {
        return getHost(str, str2, this.appid, z4);
    }

    public String getRequestHost(String str, String str2, boolean z4) {
        return getRequestHost(str, str2, getHostFormat(z4 || this.accelerate, this.bucketInPath));
    }

    @Deprecated
    public String getHost(String str, String str2, boolean z4, boolean z5) {
        return getHost(str, str2, this.appid, z4, z5);
    }

    private String getFormatHost(String str, String str2) {
        if (str2 != null) {
            return str.replace(ProtectedSandApp.s("㓝\u0001"), str2);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("㓞\u0001"));
    }

    @Deprecated
    public String getHost(String str, String str2, String str3, boolean z4, boolean z5) {
        if (!z5 && !TextUtils.isEmpty(this.host)) {
            return this.host;
        }
        StringBuilder a5 = j4.a(this.bucketInPath ? "" : android.support.v4.media.d.a("", getBucket(str, str3), ProtectedSandApp.s("㓨\u0001")));
        a5.append(getEndpointSuffix(str2, z4));
        return a5.toString();
    }

    public String getRequestHost(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(this.host)) {
            return this.host;
        }
        if (TextUtils.isEmpty(str)) {
            str = this.region;
        }
        return getFormatHost(str3, str, getBucket(str2, this.appid));
    }

    public String getRequestHost(String str, String str2) {
        if (!TextUtils.isEmpty(this.host)) {
            return this.host;
        }
        if (TextUtils.isEmpty(str)) {
            str = this.region;
        }
        return getFormatHost(str2, str);
    }

    @Deprecated
    public String getHost(String str, String str2, String str3, boolean z4) {
        return getHost(str, str2, str3, z4, false);
    }

    private CosXmlServiceConfig(Parcel parcel) {
        this(new Builder().isHttps(ProtectedSandApp.s("㓘\u0001").equals(parcel.readString())).setRegion(parcel.readString()).setDebuggable(parcel.readInt() == 1));
    }
}
