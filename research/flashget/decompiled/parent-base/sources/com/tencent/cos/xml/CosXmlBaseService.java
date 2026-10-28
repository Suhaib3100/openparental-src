package com.tencent.cos.xml;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.common.VersionInfo;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlResultListener;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.object.BasePutObjectRequest;
import com.tencent.cos.xml.model.object.BasePutObjectResult;
import com.tencent.cos.xml.model.object.GetObjectBytesRequest;
import com.tencent.cos.xml.model.object.GetObjectBytesResult;
import com.tencent.cos.xml.model.object.GetObjectRequest;
import com.tencent.cos.xml.model.object.GetObjectResult;
import com.tencent.cos.xml.model.object.SaveLocalRequest;
import com.tencent.cos.xml.model.object.UploadPartRequest;
import com.tencent.cos.xml.model.object.UploadPartResult;
import com.tencent.cos.xml.model.object.UploadRequest;
import com.tencent.cos.xml.transfer.ResponseBytesConverter;
import com.tencent.cos.xml.transfer.ResponseFileBodySerializer;
import com.tencent.cos.xml.transfer.ResponseXmlS3BodySerializer;
import com.tencent.cos.xml.utils.StringUtils;
import com.tencent.qcloud.core.auth.QCloudCredentialProvider;
import com.tencent.qcloud.core.auth.QCloudCredentials;
import com.tencent.qcloud.core.auth.QCloudSelfSigner;
import com.tencent.qcloud.core.auth.QCloudSigner;
import com.tencent.qcloud.core.auth.ScopeLimitCredentialProvider;
import com.tencent.qcloud.core.auth.SignerFactory;
import com.tencent.qcloud.core.auth.StaticCredentialProvider;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudResultListener;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.http.HttpResult;
import com.tencent.qcloud.core.http.HttpTask;
import com.tencent.qcloud.core.http.NetworkClient;
import com.tencent.qcloud.core.http.OkHttpClientImpl;
import com.tencent.qcloud.core.http.QCloudHttpClient;
import com.tencent.qcloud.core.http.QCloudHttpRequest;
import com.tencent.qcloud.core.http.QCloudHttpRetryHandler;
import com.tencent.qcloud.core.logger.COSLogger;
import com.tencent.qcloud.core.task.QCloudTask;
import com.tencent.qcloud.core.task.RetryStrategy;
import com.tencent.qcloud.core.task.TaskExecutors;
import com.tencent.qcloud.core.util.ContextHolder;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;
import okhttp3.v;

/* loaded from: classes6.dex */
public class CosXmlBaseService implements BaseCosXml {
    public static String BRIDGE;
    public static boolean IS_CLOSE_REPORT;
    private static final String TAG = ProtectedSandApp.s("㑃\u0001");
    public static String appCachePath;
    protected volatile QCloudHttpClient client;
    protected CosXmlServiceConfig config;
    protected QCloudCredentialProvider credentialProvider;
    protected String requestDomain;
    protected QCloudSelfSigner selfSigner;
    protected String signerType;
    protected String tag;

    public CosXmlBaseService(Context context, CosXmlServiceConfig cosXmlServiceConfig, QCloudCredentialProvider qCloudCredentialProvider) {
        this(context, cosXmlServiceConfig);
        this.credentialProvider = qCloudCredentialProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009d, code lost:
    
        if (r5.getNetworkType() == com.tencent.cos.xml.model.CosXmlRequest.RequestNetworkType.QUIC) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <T1 extends com.tencent.cos.xml.model.CosXmlRequest, T2 extends com.tencent.cos.xml.model.CosXmlResult> com.tencent.qcloud.core.http.HttpTask buildHttpTask(T1 r5, T2 r6, boolean r7) throws com.tencent.cos.xml.exception.CosXmlClientException {
        /*
            r4 = this;
            java.lang.String r0 = r5.getClientTraceId()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L15
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r5.setClientTraceId(r0)
        L15:
            java.lang.String r0 = r5.getRegion()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L2a
            com.tencent.cos.xml.CosXmlServiceConfig r0 = r4.config
            if (r0 == 0) goto L2a
            java.lang.String r0 = r0.getRegion()
            r5.setRegion(r0)
        L2a:
            com.tencent.qcloud.core.http.HttpTaskMetrics r0 = r5.getMetrics()
            if (r0 != 0) goto L38
            com.tencent.qcloud.core.http.HttpTaskMetrics r0 = new com.tencent.qcloud.core.http.HttpTaskMetrics
            r0.<init>()
            r5.attachMetrics(r0)
        L38:
            com.tencent.cos.xml.CosXmlServiceConfig r0 = r4.config
            com.tencent.qcloud.core.http.NetworkClient r0 = r0.getCustomizeNetworkClient()
            if (r0 == 0) goto L4f
            com.tencent.cos.xml.CosXmlServiceConfig r0 = r4.config
            com.tencent.qcloud.core.http.NetworkClient r0 = r0.getCustomizeNetworkClient()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            goto La6
        L4f:
            com.tencent.cos.xml.CosXmlServiceConfig r0 = r4.config
            boolean r0 = r0.isEnableQuic()
            java.lang.Class<com.tencent.qcloud.core.http.OkHttpClientImpl> r1 = com.tencent.qcloud.core.http.OkHttpClientImpl.class
            if (r0 == 0) goto La2
            com.tencent.cos.xml.model.CosXmlRequest$RequestNetworkType r0 = r5.getNetworkType()
            java.lang.String r2 = "㑂\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            if (r0 != 0) goto L8a
            com.tencent.cos.xml.CosXmlServiceConfig r0 = r4.config
            com.tencent.cos.xml.CosXmlServiceConfig$RequestNetworkStrategy r0 = r0.networkSwitchStrategy()
            com.tencent.cos.xml.CosXmlServiceConfig$RequestNetworkStrategy r3 = com.tencent.cos.xml.CosXmlServiceConfig.RequestNetworkStrategy.Aggressive
            if (r0 != r3) goto L78
            if (r7 == 0) goto L76
            java.lang.String r0 = r1.getName()
            goto La6
        L76:
            r0 = r2
            goto La6
        L78:
            com.tencent.cos.xml.CosXmlServiceConfig r0 = r4.config
            com.tencent.cos.xml.CosXmlServiceConfig$RequestNetworkStrategy r0 = r0.networkSwitchStrategy()
            com.tencent.cos.xml.CosXmlServiceConfig$RequestNetworkStrategy r3 = com.tencent.cos.xml.CosXmlServiceConfig.RequestNetworkStrategy.Conservative
            if (r0 != r3) goto La0
            if (r7 == 0) goto L85
            goto L76
        L85:
            java.lang.String r0 = r1.getName()
            goto La6
        L8a:
            com.tencent.cos.xml.model.CosXmlRequest$RequestNetworkType r0 = r5.getNetworkType()
            com.tencent.cos.xml.model.CosXmlRequest$RequestNetworkType r3 = com.tencent.cos.xml.model.CosXmlRequest.RequestNetworkType.OKHTTP
            if (r0 != r3) goto L97
            java.lang.String r0 = r1.getName()
            goto La6
        L97:
            com.tencent.cos.xml.model.CosXmlRequest$RequestNetworkType r0 = r5.getNetworkType()
            com.tencent.cos.xml.model.CosXmlRequest$RequestNetworkType r1 = com.tencent.cos.xml.model.CosXmlRequest.RequestNetworkType.QUIC
            if (r0 != r1) goto La0
            goto L76
        La0:
            r0 = 0
            goto La6
        La2:
            java.lang.String r0 = r1.getName()
        La6:
            com.tencent.qcloud.core.http.QCloudHttpRequest r6 = r4.buildHttpRequest(r5, r6, r7, r0)
            com.tencent.qcloud.core.auth.QCloudCredentialProvider r7 = r5.getCredentialProvider()
            if (r7 == 0) goto Lbb
            com.tencent.qcloud.core.http.QCloudHttpClient r7 = r4.client
            com.tencent.qcloud.core.auth.QCloudCredentialProvider r1 = r5.getCredentialProvider()
            com.tencent.qcloud.core.http.HttpTask r6 = r7.resolveRequest(r6, r1, r0)
            goto Lc3
        Lbb:
            com.tencent.qcloud.core.http.QCloudHttpClient r7 = r4.client
            com.tencent.qcloud.core.auth.QCloudCredentialProvider r1 = r4.credentialProvider
            com.tencent.qcloud.core.http.HttpTask r6 = r7.resolveRequest(r6, r1, r0)
        Lc3:
            com.tencent.cos.xml.CosXmlServiceConfig r7 = r4.config
            boolean r7 = r7.isTransferThreadControl()
            r6.setTransferThreadControl(r7)
            com.tencent.cos.xml.CosXmlServiceConfig r7 = r4.config
            int r7 = r7.getUploadMaxThreadCount()
            r6.setUploadMaxThreadCount(r7)
            com.tencent.cos.xml.CosXmlServiceConfig r7 = r4.config
            int r7 = r7.getDownloadMaxThreadCount()
            r6.setDownloadMaxThreadCount(r7)
            com.tencent.cos.xml.CosXmlServiceConfig r7 = r4.config
            boolean r7 = r7.isDomainSwitch()
            r6.setDomainSwitch(r7)
            r5.setTask(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.cos.xml.CosXmlBaseService.buildHttpTask(com.tencent.cos.xml.model.CosXmlRequest, com.tencent.cos.xml.model.CosXmlResult, boolean):com.tencent.qcloud.core.http.HttpTask");
    }

    private void init(QCloudHttpClient.Builder builder, CosXmlServiceConfig cosXmlServiceConfig) {
        builder.setConnectionTimeout(cosXmlServiceConfig.getConnectionTimeout()).setSocketTimeout(cosXmlServiceConfig.getSocketTimeout());
        RetryStrategy retryStrategy = cosXmlServiceConfig.getRetryStrategy();
        if (retryStrategy != null) {
            builder.setRetryStrategy(retryStrategy);
        }
        QCloudHttpRetryHandler qCloudHttpRetryHandler = cosXmlServiceConfig.getQCloudHttpRetryHandler();
        if (qCloudHttpRetryHandler != null) {
            builder.setQCloudHttpRetryHandler(qCloudHttpRetryHandler);
        }
        if (cosXmlServiceConfig.getCustomizeNetworkClient() != null) {
            builder.setNetworkClient(cosXmlServiceConfig.getCustomizeNetworkClient());
        } else if (cosXmlServiceConfig.isEnableQuic()) {
            try {
                builder.setNetworkClient((NetworkClient) Class.forName(ProtectedSandApp.s("㑂\u0001")).newInstance());
            } catch (Exception e4) {
                IllegalStateException illegalStateException = new IllegalStateException(e4.getMessage(), e4);
                CosTrackService.getInstance().reportError(ProtectedSandApp.s("㑃\u0001"), illegalStateException);
                throw illegalStateException;
            }
        } else {
            builder.setNetworkClient(new OkHttpClientImpl());
        }
        builder.dnsCache(cosXmlServiceConfig.isDnsCache());
        builder.addPrefetchHost(cosXmlServiceConfig.getEndpointSuffix());
        builder.setVerifySSLEnable(cosXmlServiceConfig.isVerifySSLEnable());
        builder.setClientCertificate(cosXmlServiceConfig.getClientCertificateBytes(), cosXmlServiceConfig.getClientCertificatePassword());
        builder.setRedirectEnable(cosXmlServiceConfig.isRedirectEnable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logRequestMetrics(CosXmlRequest cosXmlRequest) {
        if (cosXmlRequest.getMetrics() != null) {
            COSLogger.iNetwork(ProtectedSandApp.s("㑄\u0001"), cosXmlRequest.getMetrics().toString());
        }
    }

    public void addCustomerDNS(String str, String[] strArr) throws CosXmlClientException {
        try {
            this.client.addDnsRecord(str, strArr);
        } catch (UnknownHostException e4) {
            throw new CosXmlClientException(ClientErrorCode.POOR_NETWORK.getCode(), e4);
        }
    }

    public void addCustomerDNSFetch(@o0 QCloudHttpClient.QCloudDnsFetch qCloudDnsFetch) {
        this.client.addDnsFetch(qCloudDnsFetch);
    }

    @Deprecated
    public void addVerifiedHost(String str) {
        this.client.addVerifiedHost(str);
    }

    @Override // com.tencent.cos.xml.BaseCosXml
    public BasePutObjectResult basePutObject(BasePutObjectRequest basePutObjectRequest) throws CosXmlClientException, CosXmlServiceException {
        BasePutObjectResult basePutObjectResult = new BasePutObjectResult();
        basePutObjectResult.accessUrl = getAccessUrl(basePutObjectRequest);
        return (BasePutObjectResult) execute(basePutObjectRequest, basePutObjectResult);
    }

    @Override // com.tencent.cos.xml.BaseCosXml
    public void basePutObjectAsync(BasePutObjectRequest basePutObjectRequest, CosXmlResultListener cosXmlResultListener) {
        BasePutObjectResult basePutObjectResult = new BasePutObjectResult();
        basePutObjectResult.accessUrl = getAccessUrl(basePutObjectRequest);
        schedule(basePutObjectRequest, basePutObjectResult, cosXmlResultListener);
    }

    protected <T1 extends CosXmlRequest, T2 extends CosXmlResult> QCloudHttpRequest buildHttpRequest(T1 t12, T2 t22, boolean z4, String str) throws CosXmlClientException {
        QCloudHttpRequest.Builder<T2> tag = new QCloudHttpRequest.Builder().method(t12.getMethod()).userAgent(getUserAgent(str)).tag((Object) this.tag);
        tag.addNoSignHeaderKeys(this.config.getNoSignHeaders());
        tag.addNoSignHeaderKeys(t12.getNoSignHeaders());
        tag.addNoSignParamKeys(t12.getNoSignParams());
        String requestURL = t12.getRequestURL();
        String requestHost = getRequestHost(t12);
        if (TextUtils.isEmpty(t12.getHost())) {
            if (this.config.networkSwitchStrategy() == CosXmlServiceConfig.RequestNetworkStrategy.Aggressive) {
                if (z4) {
                    requestHost = this.config.getDefaultRequestHost(t12.getRegion(), t12.getBucket());
                }
            } else if (this.config.networkSwitchStrategy() == CosXmlServiceConfig.RequestNetworkStrategy.Conservative && !z4) {
                requestHost = this.config.getDefaultRequestHost(t12.getRegion(), t12.getBucket());
            }
        }
        if (requestURL != null) {
            try {
                tag.url(new URL(requestURL));
            } catch (MalformedURLException e4) {
                throw new CosXmlClientException(ClientErrorCode.BAD_REQUEST.getCode(), e4);
            }
        } else {
            t12.checkParameters();
            tag.scheme(this.config.getProtocol()).host(requestHost).path(t12.getPath(this.config));
            if (this.config.getPort() != -1) {
                tag.port(this.config.getPort());
            }
            tag.query(t12.getQueryString());
            if (t12.getQueryEncodedString() != null) {
                tag.encodedQuery(t12.getQueryEncodedString());
            }
        }
        setCopySource(t12);
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.config.getCommonHeaders().keySet());
        hashSet.addAll(t12.getRequestHeaders().keySet());
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            List<String> list = t12.getRequestHeaders().get(str2);
            if (list == null) {
                list = this.config.getCommonHeaders().get(str2);
            }
            if (list != null) {
                hashMap.put(str2, list);
            }
        }
        String s4 = ProtectedSandApp.s("㑅\u0001");
        if (!hashMap.containsKey(s4)) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(requestHost);
            hashMap.put(s4, linkedList);
        }
        if (t12.headersHasUnsafeNonAscii()) {
            tag.addHeadersUnsafeNonAscii(hashMap);
        } else {
            tag.addHeaders(hashMap);
        }
        if (t12.isNeedMD5()) {
            tag.contentMD5();
        }
        tag.setKeyTime(t12.getKeyTime());
        if (this.credentialProvider != null) {
            tag.signer(signerTypeCompat(this.signerType, t12), t12.getSignSourceProvider());
        } else if (t12.getCredentialProvider() != null) {
            tag.signer(signerTypeCompat(this.signerType, t12), t12.getSignSourceProvider());
        } else {
            tag.signer(null, null);
        }
        QCloudSelfSigner qCloudSelfSigner = this.selfSigner;
        if (qCloudSelfSigner != null) {
            tag.selfSigner(qCloudSelfSigner);
        }
        tag.credentialScope(t12.getSTSCredentialScope(this.config));
        if (t12.getRequestBody() != null) {
            tag.body(t12.getRequestBody());
        }
        if (t12 instanceof SaveLocalRequest) {
            SaveLocalRequest saveLocalRequest = (SaveLocalRequest) t12;
            if (!TextUtils.isEmpty(saveLocalRequest.getSaveLocalPath())) {
                tag.converter(new ResponseFileBodySerializer<>((GetObjectResult) t22, saveLocalRequest.getSaveLocalPath(), saveLocalRequest.getSaveLocalOffset()));
            } else if (saveLocalRequest.getSaveLocalUri() != null) {
                tag.converter(new ResponseFileBodySerializer<>((GetObjectResult) t22, saveLocalRequest.getSaveLocalUri(), ContextHolder.getAppContext().getContentResolver(), saveLocalRequest.getSaveLocalOffset()));
            }
        } else if (t12 instanceof GetObjectBytesRequest) {
            tag.converter(new ResponseBytesConverter<>((GetObjectBytesResult) t22));
        } else if (!buildHttpRequestBodyConverter(t12, t22, tag)) {
            tag.converter(new ResponseXmlS3BodySerializer<>(t22));
        }
        tag.signInUrl(t12.isSignInUrl() || this.config.isSignInUrl());
        return tag.build();
    }

    protected <T1 extends CosXmlRequest, T2 extends CosXmlResult> boolean buildHttpRequestBodyConverter(T1 t12, T2 t22, QCloudHttpRequest.Builder<T2> builder) {
        return false;
    }

    @Override // com.tencent.cos.xml.BaseCosXml
    public void cancel(CosXmlRequest cosXmlRequest) {
        if (cosXmlRequest == null || cosXmlRequest.getHttpTask() == null) {
            return;
        }
        cosXmlRequest.getHttpTask().cancel();
    }

    @Override // com.tencent.cos.xml.BaseCosXml
    public void cancelAll() {
        Iterator<HttpTask> it = this.client.getTasksByTag(this.tag).iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    @Override // com.tencent.cos.xml.BaseCosXml
    public <T1 extends CosXmlRequest, T2 extends CosXmlResult> T2 commonInterface(T1 t12, Class<T2> cls) throws CosXmlClientException, CosXmlServiceException {
        String s4 = ProtectedSandApp.s("㑆\u0001");
        try {
            return (T2) execute(t12, cls.newInstance());
        } catch (IllegalAccessException e4) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), s4, e4);
        } catch (InstantiationException e5) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), s4, e5);
        }
    }

    @Override // com.tencent.cos.xml.BaseCosXml
    public <T1 extends CosXmlRequest, T2 extends CosXmlResult> void commonInterfaceAsync(T1 t12, Class<T2> cls, CosXmlResultListener cosXmlResultListener) {
        String s4 = ProtectedSandApp.s("㑆\u0001");
        try {
            schedule(t12, cls.newInstance(), cosXmlResultListener);
        } catch (IllegalAccessException e4) {
            cosXmlResultListener.onFail(t12, new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), s4, e4), null);
        } catch (InstantiationException e5) {
            cosXmlResultListener.onFail(t12, new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), s4, e5), null);
        }
    }

    protected <T1 extends CosXmlRequest, T2 extends CosXmlResult> T2 execute(T1 t12, T2 t22) throws CosXmlClientException, CosXmlServiceException {
        return (T2) execute(t12, t22, false);
    }

    public String getAccessUrl(CosXmlRequest cosXmlRequest) {
        String str;
        String requestURL = cosXmlRequest.getRequestURL();
        if (requestURL != null) {
            int indexOf = requestURL.indexOf(ProtectedSandApp.s("㑉\u0001"));
            return indexOf > 0 ? requestURL.substring(0, indexOf) : requestURL;
        }
        v.a aVar = new v.a();
        aVar.M(this.config.getProtocol());
        try {
            str = getRequestHost(cosXmlRequest);
        } catch (CosXmlClientException e4) {
            CosTrackService.getInstance().reportError(ProtectedSandApp.s("㑃\u0001"), e4);
            e4.printStackTrace();
            str = null;
        }
        aVar.x(str);
        String path = cosXmlRequest.getPath(this.config);
        if (path.startsWith(ProtectedSandApp.s("㑊\u0001"))) {
            path = path.substring(1);
        }
        if (path.length() > 0) {
            aVar.e(path);
        }
        return aVar.h().getUrl();
    }

    @Deprecated
    public String getAppid() {
        return this.config.getAppid();
    }

    public CosXmlServiceConfig getConfig() {
        return this.config;
    }

    public QCloudCredentialProvider getCredentialProvider() {
        return this.credentialProvider;
    }

    public File[] getLogFiles(int i4) {
        return COSLogger.getLogFiles(i4);
    }

    @Override // com.tencent.cos.xml.BaseCosXml
    public GetObjectResult getObject(GetObjectRequest getObjectRequest) throws CosXmlClientException, CosXmlServiceException {
        return (GetObjectResult) execute(getObjectRequest, new GetObjectResult());
    }

    @Override // com.tencent.cos.xml.BaseCosXml
    public void getObjectAsync(GetObjectRequest getObjectRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getObjectRequest, new GetObjectResult(), cosXmlResultListener);
    }

    @Override // com.tencent.cos.xml.BaseCosXml
    public String getObjectUrl(String str, String str2, String str3) {
        BasePutObjectRequest basePutObjectRequest = new BasePutObjectRequest(str, str3, "");
        basePutObjectRequest.setRegion(str2);
        return getAccessUrl(basePutObjectRequest);
    }

    public String getPresignedURL(CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        QCloudCredentials credentials;
        try {
            if (cosXmlRequest.getCredentialProvider() != null) {
                credentials = cosXmlRequest.getCredentialProvider().getCredentials();
            } else {
                QCloudCredentialProvider qCloudCredentialProvider = this.credentialProvider;
                credentials = qCloudCredentialProvider instanceof ScopeLimitCredentialProvider ? ((ScopeLimitCredentialProvider) qCloudCredentialProvider).getCredentials(cosXmlRequest.getSTSCredentialScope(this.config)) : qCloudCredentialProvider.getCredentials();
            }
            QCloudSigner signer = SignerFactory.getSigner(signerTypeCompat(this.signerType, cosXmlRequest));
            QCloudHttpRequest buildHttpRequest = buildHttpRequest(cosXmlRequest, null, false, null);
            signer.sign(buildHttpRequest, credentials);
            String header = buildHttpRequest.header(ProtectedSandApp.s("㑋\u0001"));
            String header2 = buildHttpRequest.header(ProtectedSandApp.s("㑌\u0001"));
            if (!TextUtils.isEmpty(header2)) {
                header = header + ProtectedSandApp.s("㑍\u0001") + header2;
            }
            String accessUrl = getAccessUrl(cosXmlRequest);
            String flat = StringUtils.flat(cosXmlRequest.getQueryString());
            boolean isEmpty = TextUtils.isEmpty(flat);
            String s4 = ProtectedSandApp.s("㑉\u0001");
            if (isEmpty) {
                return accessUrl + s4 + header;
            }
            return accessUrl + s4 + flat + ProtectedSandApp.s("㑎\u0001") + header;
        } catch (QCloudClientException e4) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_CREDENTIALS.getCode(), e4);
        }
    }

    @Deprecated
    public String getRegion() {
        return this.config.getRegion();
    }

    protected String getRequestHost(CosXmlRequest cosXmlRequest) throws CosXmlClientException {
        return !TextUtils.isEmpty(cosXmlRequest.getHost()) ? cosXmlRequest.getHost() : !TextUtils.isEmpty(this.requestDomain) ? this.requestDomain : cosXmlRequest.getRequestHost(this.config);
    }

    public String getUserAgent(@q0 String str) {
        CosXmlServiceConfig cosXmlServiceConfig = this.config;
        if (cosXmlServiceConfig == null) {
            return VersionInfo.getUserAgent();
        }
        String userAgent = cosXmlServiceConfig.isEnableQuic() ? OkHttpClientImpl.class.getName().equals(str) ? VersionInfo.getUserAgent() : ProtectedSandApp.s("㑂\u0001").equals(str) ? VersionInfo.getQuicUserAgent() : VersionInfo.getQuicUserAgent() : VersionInfo.getUserAgent();
        if (TextUtils.isEmpty(this.config.getUserAgentExtended())) {
            return userAgent;
        }
        StringBuilder a5 = androidx.constraintlayout.core.e.a(userAgent, ProtectedSandApp.s("㑏\u0001"));
        a5.append(this.config.getUserAgentExtended());
        return a5.toString();
    }

    public void internalGetObjectAsync(GetObjectRequest getObjectRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(getObjectRequest, new GetObjectResult(), cosXmlResultListener, true);
    }

    @Override // com.tencent.cos.xml.BaseCosXml
    public void release() {
        cancelAll();
    }

    protected <T1 extends CosXmlRequest, T2 extends CosXmlResult> void schedule(T1 t12, T2 t22, CosXmlResultListener cosXmlResultListener) {
        schedule(t12, t22, cosXmlResultListener, false);
    }

    protected <T1 extends CosXmlRequest> void setCopySource(T1 t12) throws CosXmlClientException {
    }

    public void setDomain(String str) {
        this.requestDomain = str;
    }

    public void setNetworkClient(CosXmlServiceConfig cosXmlServiceConfig) {
        QCloudHttpClient.Builder builder = new QCloudHttpClient.Builder();
        init(builder, cosXmlServiceConfig);
        this.client = builder.build();
        this.client.setNetworkClientType(builder);
        this.config = cosXmlServiceConfig;
        QCloudHttpClient qCloudHttpClient = this.client;
        String s4 = ProtectedSandApp.s("㑐\u0001");
        qCloudHttpClient.addVerifiedHost(s4 + cosXmlServiceConfig.getEndpointSuffix());
        this.client.addVerifiedHost(s4 + cosXmlServiceConfig.getEndpointSuffix(cosXmlServiceConfig.getRegion(), true));
    }

    protected <T1 extends CosXmlRequest, T2 extends CosXmlResult> void setProgressListener(final T1 t12, HttpTask<T2> httpTask, boolean z4) {
        if (t12 instanceof BasePutObjectRequest) {
            httpTask.addProgressListener(((BasePutObjectRequest) t12).getProgressListener());
            return;
        }
        if (!(t12 instanceof UploadPartRequest)) {
            if (t12 instanceof GetObjectRequest) {
                httpTask.addProgressListener(((GetObjectRequest) t12).getProgressListener());
            }
        } else {
            httpTask.addProgressListener(((UploadPartRequest) t12).getProgressListener());
            if (z4) {
                httpTask.setOnRequestWeightListener(new QCloudTask.OnRequestWeightListener() { // from class: com.tencent.cos.xml.CosXmlBaseService.2
                    @Override // com.tencent.qcloud.core.task.QCloudTask.OnRequestWeightListener
                    public int onWeight() {
                        return t12.getWeight();
                    }
                });
            }
        }
    }

    protected String signerTypeCompat(String str, CosXmlRequest cosXmlRequest) {
        return str;
    }

    @Override // com.tencent.cos.xml.BaseCosXml
    public UploadPartResult uploadPart(UploadPartRequest uploadPartRequest) throws CosXmlClientException, CosXmlServiceException {
        return (UploadPartResult) execute(uploadPartRequest, new UploadPartResult());
    }

    @Override // com.tencent.cos.xml.BaseCosXml
    public void uploadPartAsync(UploadPartRequest uploadPartRequest, CosXmlResultListener cosXmlResultListener) {
        schedule(uploadPartRequest, new UploadPartResult(), cosXmlResultListener);
    }

    protected <T1 extends CosXmlRequest, T2 extends CosXmlResult> T2 execute(T1 t12, T2 t22, boolean z4) throws CosXmlClientException, CosXmlServiceException {
        return (T2) execute(t12, t22, z4, false);
    }

    @Override // com.tencent.cos.xml.BaseCosXml
    public byte[] getObject(String str, String str2) throws CosXmlClientException, CosXmlServiceException {
        GetObjectBytesResult getObjectBytesResult = (GetObjectBytesResult) execute(new GetObjectBytesRequest(str, str2), new GetObjectBytesResult());
        return getObjectBytesResult != null ? getObjectBytesResult.data : new byte[0];
    }

    @Deprecated
    public String getRegion(CosXmlRequest cosXmlRequest) {
        return cosXmlRequest.getRegion() == null ? this.config.getRegion() : cosXmlRequest.getRegion();
    }

    protected <T1 extends CosXmlRequest, T2 extends CosXmlResult> void schedule(T1 t12, T2 t22, CosXmlResultListener cosXmlResultListener, boolean z4) {
        schedule(t12, t22, cosXmlResultListener, z4, false);
    }

    public CosXmlBaseService(Context context, CosXmlServiceConfig cosXmlServiceConfig) {
        this.tag = ProtectedSandApp.s("㐿\u0001");
        this.signerType = ProtectedSandApp.s("㑀\u0001");
        ContextHolder.setContext(context);
        COSLogger.enableLogcat(cosXmlServiceConfig.isDebuggable());
        COSLogger.enableLogFile(cosXmlServiceConfig.isDebuggable());
        CosTrackService.init(context.getApplicationContext(), IS_CLOSE_REPORT, BRIDGE);
        appCachePath = context.getApplicationContext().getFilesDir().getPath();
        TaskExecutors.initExecutor(cosXmlServiceConfig.getUploadMaxThreadCount(), cosXmlServiceConfig.getDownloadMaxThreadCount());
        setNetworkClient(cosXmlServiceConfig);
    }

    @Override // com.tencent.cos.xml.BaseCosXml
    public void cancel(CosXmlRequest cosXmlRequest, boolean z4) {
        if (cosXmlRequest == null || cosXmlRequest.getHttpTask() == null) {
            return;
        }
        cosXmlRequest.getHttpTask().cancel(z4);
    }

    protected <T1 extends CosXmlRequest, T2 extends CosXmlResult> T2 execute(T1 t12, T2 t22, boolean z4, boolean z5) throws CosXmlClientException, CosXmlServiceException {
        try {
            HttpTask buildHttpTask = buildHttpTask(t12, t22, z5);
            setProgressListener(t12, buildHttpTask, false);
            HttpResult executeNow = buildHttpTask.executeNow();
            CosTrackService.getInstance().reportRequestSuccess(t12, z4, this.config.getTrackParams());
            CosTrackService.getInstance().reportHttpMetrics(t12);
            logRequestMetrics(t12);
            if (executeNow != null) {
                return (T2) executeNow.content();
            }
            return null;
        } catch (QCloudClientException e4) {
            CosTrackService.getInstance().reportHttpMetrics(t12);
            CosXmlClientException convertClientException = CosTrackService.getInstance().convertClientException(e4);
            if (this.config.networkSwitchStrategy() != null && !z5 && (convertClientException.errorCode == ClientErrorCode.POOR_NETWORK.getCode() || convertClientException.errorCode == ClientErrorCode.IO_ERROR.getCode())) {
                return (T2) execute(t12, t22, z4, true);
            }
            throw CosTrackService.getInstance().reportRequestClientException(t12, e4, z4, this.config.getTrackParams());
        } catch (QCloudServiceException e5) {
            CosTrackService.getInstance().reportHttpMetrics(t12);
            CosXmlServiceException convertServerException = CosTrackService.getInstance().convertServerException(e5);
            if (this.config.networkSwitchStrategy() != null && !z5) {
                if (ProtectedSandApp.s("㑇\u0001").equals(convertServerException.getErrorCode()) || ProtectedSandApp.s("㑈\u0001").equals(convertServerException.getErrorCode())) {
                    return (T2) execute(t12, t22, z4, true);
                }
            }
            throw CosTrackService.getInstance().reportRequestServiceException(t12, e5, z4, this.config.getTrackParams());
        }
    }

    protected <T1 extends CosXmlRequest, T2 extends CosXmlResult> void schedule(final T1 t12, final T2 t22, final CosXmlResultListener cosXmlResultListener, final boolean z4, final boolean z5) {
        Object obj = new QCloudResultListener<HttpResult<T2>>() { // from class: com.tencent.cos.xml.CosXmlBaseService.1
            @Override // com.tencent.qcloud.core.common.QCloudResultListener
            public void onFailure(QCloudClientException qCloudClientException, QCloudServiceException qCloudServiceException) {
                CosTrackService.getInstance().reportHttpMetrics(t12);
                CosXmlBaseService.this.logRequestMetrics(t12);
                if (qCloudClientException != null) {
                    CosXmlClientException convertClientException = CosTrackService.getInstance().convertClientException(qCloudClientException);
                    if (CosXmlBaseService.this.config.networkSwitchStrategy() != null && !z5 && (convertClientException.errorCode == ClientErrorCode.POOR_NETWORK.getCode() || convertClientException.errorCode == ClientErrorCode.IO_ERROR.getCode())) {
                        CosXmlBaseService.this.schedule(t12, t22, cosXmlResultListener, z4, true);
                    }
                    cosXmlResultListener.onFail(t12, CosTrackService.getInstance().reportRequestClientException(t12, qCloudClientException, z4, CosXmlBaseService.this.config.getTrackParams()), null);
                    return;
                }
                if (qCloudServiceException != null) {
                    CosXmlServiceException convertServerException = CosTrackService.getInstance().convertServerException(qCloudServiceException);
                    if (CosXmlBaseService.this.config.networkSwitchStrategy() != null && !z5) {
                        if (ProtectedSandApp.s("㓋\u0001").equals(convertServerException.getErrorCode()) || ProtectedSandApp.s("㓌\u0001").equals(convertServerException.getErrorCode())) {
                            CosXmlBaseService.this.schedule(t12, t22, cosXmlResultListener, z4, true);
                        }
                    }
                    cosXmlResultListener.onFail(t12, null, CosTrackService.getInstance().reportRequestServiceException(t12, qCloudServiceException, z4, CosXmlBaseService.this.config.getTrackParams()));
                }
            }

            @Override // com.tencent.qcloud.core.common.QCloudResultListener
            public void onSuccess(HttpResult<T2> httpResult) {
                CosTrackService.getInstance().reportRequestSuccess(t12, z4, CosXmlBaseService.this.config.getTrackParams());
                CosTrackService.getInstance().reportHttpMetrics(t12);
                CosXmlBaseService.this.logRequestMetrics(t12);
                cosXmlResultListener.onSuccess(t12, (CosXmlResult) httpResult.content());
            }
        };
        try {
            HttpTask buildHttpTask = buildHttpTask(t12, t22, z5);
            setProgressListener(t12, buildHttpTask, true);
            Executor executor = this.config.getExecutor();
            Executor observeExecutor = this.config.getObserveExecutor();
            if (observeExecutor != null) {
                buildHttpTask.observeOn(observeExecutor);
            }
            buildHttpTask.addResultListener(obj);
            if (executor != null) {
                buildHttpTask.scheduleOn(executor);
            } else if (t12 instanceof UploadRequest) {
                buildHttpTask.scheduleOn(TaskExecutors.UPLOAD_EXECUTOR, t12.getPriority());
            } else {
                buildHttpTask.schedule();
            }
        } catch (QCloudClientException e4) {
            CosXmlClientException convertClientException = CosTrackService.getInstance().convertClientException(e4);
            if (this.config.networkSwitchStrategy() != null && !z5 && (convertClientException.errorCode == ClientErrorCode.POOR_NETWORK.getCode() || convertClientException.errorCode == ClientErrorCode.IO_ERROR.getCode())) {
                schedule(t12, t22, cosXmlResultListener, z4, true);
            }
            cosXmlResultListener.onFail(t12, CosTrackService.getInstance().reportRequestClientException(t12, e4, z4, this.config.getTrackParams()), null);
        }
    }

    @Override // com.tencent.cos.xml.BaseCosXml
    public byte[] getObject(GetObjectBytesRequest getObjectBytesRequest) throws CosXmlClientException, CosXmlServiceException {
        GetObjectBytesResult getObjectBytesResult = (GetObjectBytesResult) execute(getObjectBytesRequest, new GetObjectBytesResult());
        return getObjectBytesResult != null ? getObjectBytesResult.data : new byte[0];
    }

    public CosXmlBaseService(Context context, CosXmlServiceConfig cosXmlServiceConfig, QCloudSigner qCloudSigner) {
        this(context, cosXmlServiceConfig);
        this.credentialProvider = new StaticCredentialProvider(null);
        String s4 = ProtectedSandApp.s("㑁\u0001");
        this.signerType = s4;
        SignerFactory.registerSigner(s4, qCloudSigner);
    }

    public CosXmlBaseService(Context context, CosXmlServiceConfig cosXmlServiceConfig, QCloudSelfSigner qCloudSelfSigner) {
        this(context, cosXmlServiceConfig);
        this.selfSigner = qCloudSelfSigner;
    }
}
