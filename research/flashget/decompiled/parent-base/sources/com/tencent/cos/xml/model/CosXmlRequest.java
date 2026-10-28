package com.tencent.cos.xml.model;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.utils.URLEncodeUtils;
import com.tencent.qcloud.core.auth.BasicLifecycleCredentialProvider;
import com.tencent.qcloud.core.auth.COSXmlSignSourceProvider;
import com.tencent.qcloud.core.auth.QCloudCredentialProvider;
import com.tencent.qcloud.core.auth.QCloudLifecycleCredentials;
import com.tencent.qcloud.core.auth.QCloudSignSourceProvider;
import com.tencent.qcloud.core.auth.STSCredentialScope;
import com.tencent.qcloud.core.auth.SessionQCloudCredentials;
import com.tencent.qcloud.core.common.QCloudTaskStateListener;
import com.tencent.qcloud.core.http.HttpConfiguration;
import com.tencent.qcloud.core.http.HttpTask;
import com.tencent.qcloud.core.http.HttpTaskMetrics;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes6.dex */
public abstract class CosXmlRequest {
    protected String bucket;
    private String clientTraceId;
    private QCloudCredentialProvider credentialProvider;
    private String host;
    private HttpTask httpTask;
    private String keyTime;
    private HttpTaskMetrics metrics;
    private OnRequestWeightListener onRequestWeightListener;
    protected QCloudTaskStateListener qCloudTaskStateListener;
    private String queryParameterEncodedString;
    protected String region;
    protected String requestURL;
    private boolean signInUrl;
    protected QCloudSignSourceProvider signSourceProvider;
    protected Map<String, String> queryParameters = new LinkedHashMap();
    protected Map<String, List<String>> requestHeaders = new LinkedHashMap();
    protected Set<String> noSignHeaders = new HashSet();
    protected Set<String> noSignParams = new HashSet();
    private boolean isNeedMD5 = false;
    private boolean isSupportAccelerate = false;
    private RequestNetworkType networkType = null;
    protected int priority = -1;

    public interface OnRequestWeightListener {
        int onWeight();
    }

    public enum RequestNetworkType {
        OKHTTP,
        QUIC
    }

    protected void addHeader(String str, String str2) {
        List<String> arrayList = this.requestHeaders.containsKey(str) ? this.requestHeaders.get(str) : new ArrayList<>();
        arrayList.add(str2);
        this.requestHeaders.put(str, arrayList);
    }

    public void addNoSignHeader(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.noSignHeaders.add(str);
    }

    public void addNoSignParams(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.noSignParams.add(str);
    }

    public void addQuery(String str, String str2) {
        this.queryParameters.put(str, str2);
    }

    public void attachMetrics(HttpTaskMetrics httpTaskMetrics) {
        this.metrics = httpTaskMetrics;
    }

    public void checkParameters() throws CosXmlClientException {
    }

    public String getBucket() {
        return this.bucket;
    }

    public String getClientTraceId() {
        return this.clientTraceId;
    }

    public QCloudCredentialProvider getCredentialProvider() {
        return this.credentialProvider;
    }

    public String getHost() {
        return this.host;
    }

    public HttpTask getHttpTask() {
        return this.httpTask;
    }

    public String getKeyTime() {
        return this.keyTime;
    }

    public abstract String getMethod();

    public HttpTaskMetrics getMetrics() {
        return this.metrics;
    }

    public RequestNetworkType getNetworkType() {
        return this.networkType;
    }

    public Set<String> getNoSignHeaders() {
        return this.noSignHeaders;
    }

    public Set<String> getNoSignParams() {
        return this.noSignParams;
    }

    public abstract String getPath(CosXmlServiceConfig cosXmlServiceConfig);

    public int getPriority() {
        return this.priority;
    }

    public String getQueryEncodedString() {
        return this.queryParameterEncodedString;
    }

    public Map<String, String> getQueryString() {
        return this.queryParameters;
    }

    public String getRegion() {
        return this.region;
    }

    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        try {
            return xmlBuilder();
        } catch (IOException e4) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), e4);
        } catch (XmlPullParserException e5) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), e5);
        }
    }

    public Map<String, List<String>> getRequestHeaders() {
        return this.requestHeaders;
    }

    public String getRequestHost(CosXmlServiceConfig cosXmlServiceConfig) {
        return !TextUtils.isEmpty(this.host) ? this.host : cosXmlServiceConfig.getRequestHost(this.region, this.bucket, this.isSupportAccelerate);
    }

    public String getRequestURL() {
        return this.requestURL;
    }

    public STSCredentialScope[] getSTSCredentialScope(CosXmlServiceConfig cosXmlServiceConfig) {
        return new STSCredentialScope(ProtectedSandApp.s("㙁\u0001") + getClass().getSimpleName().replace(ProtectedSandApp.s("㙂\u0001"), ""), cosXmlServiceConfig.getBucket(this.bucket), getRegion() == null ? cosXmlServiceConfig.getRegion() : getRegion(), getPath(cosXmlServiceConfig)).toArray();
    }

    public QCloudSignSourceProvider getSignSourceProvider() {
        if (this.signSourceProvider == null) {
            this.signSourceProvider = new COSXmlSignSourceProvider();
        }
        return this.signSourceProvider;
    }

    public int getWeight() {
        OnRequestWeightListener onRequestWeightListener = this.onRequestWeightListener;
        if (onRequestWeightListener != null) {
            return onRequestWeightListener.onWeight();
        }
        return 0;
    }

    public boolean headersHasUnsafeNonAscii() {
        return false;
    }

    public boolean isNeedMD5() {
        return this.isNeedMD5;
    }

    public boolean isSignInUrl() {
        return this.signInUrl;
    }

    public void isSupportAccelerate(boolean z4) {
        this.isSupportAccelerate = z4;
    }

    public void setClientTraceId(String str) {
        this.clientTraceId = str;
    }

    public void setCredential(final SessionQCloudCredentials sessionQCloudCredentials) {
        this.credentialProvider = new BasicLifecycleCredentialProvider() { // from class: com.tencent.cos.xml.model.CosXmlRequest.1
            @Override // com.tencent.qcloud.core.auth.BasicLifecycleCredentialProvider
            protected QCloudLifecycleCredentials fetchNewCredentials() {
                return sessionQCloudCredentials;
            }
        };
    }

    public void setCredentialProvider(QCloudCredentialProvider qCloudCredentialProvider) {
        this.credentialProvider = qCloudCredentialProvider;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setNeedMD5(boolean z4) {
        this.isNeedMD5 = z4;
    }

    public void setNetworkType(RequestNetworkType requestNetworkType) {
        this.networkType = requestNetworkType;
    }

    public void setOnRequestWeightListener(OnRequestWeightListener onRequestWeightListener) {
        this.onRequestWeightListener = onRequestWeightListener;
    }

    public void setQueryEncodedString(String str) {
        this.queryParameterEncodedString = str;
    }

    public void setQueryParameters(Map<String, String> map) {
        this.queryParameters = map;
    }

    public void setRegion(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.region = str;
    }

    public void setRequestHeaders(Map<String, List<String>> map) {
        if (map != null) {
            this.requestHeaders.putAll(map);
        }
    }

    public void setRequestURL(String str) {
        this.requestURL = str;
    }

    @Deprecated
    public void setSign(long j4) {
    }

    public void setSignInUrl(boolean z4) {
        this.signInUrl = z4;
    }

    public void setSignKeyTime(int i4) {
        long deviceTimeWithOffset = HttpConfiguration.getDeviceTimeWithOffset();
        this.keyTime = deviceTimeWithOffset + ProtectedSandApp.s("㙅\u0001") + (i4 + deviceTimeWithOffset);
    }

    public void setSignParamsAndHeaders(Set<String> set, Set<String> set2) {
        COSXmlSignSourceProvider cOSXmlSignSourceProvider = new COSXmlSignSourceProvider();
        cOSXmlSignSourceProvider.parameters(set);
        cOSXmlSignSourceProvider.headers(set2);
        this.signSourceProvider = cOSXmlSignSourceProvider;
    }

    public void setSignSourceProvider(QCloudSignSourceProvider qCloudSignSourceProvider) {
        this.signSourceProvider = qCloudSignSourceProvider;
    }

    public void setTask(HttpTask httpTask) {
        this.httpTask = httpTask;
        httpTask.addStateListener(this.qCloudTaskStateListener);
        httpTask.attachMetric(this.metrics);
    }

    public void setTaskStateListener(QCloudTaskStateListener qCloudTaskStateListener) {
        this.qCloudTaskStateListener = qCloudTaskStateListener;
    }

    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException, CosXmlClientException {
        throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("㙆\u0001"));
    }

    public boolean isSupportAccelerate() {
        return this.isSupportAccelerate;
    }

    @Deprecated
    public void setRequestHeaders(String str, String str2) throws CosXmlClientException {
        if (str == null || str2 == null) {
            return;
        }
        addHeader(str, URLEncodeUtils.cosPathEncode(str2));
    }

    @Deprecated
    public void setSign(long j4, long j5) {
    }

    public void addNoSignHeader(Set<String> set) {
        if (set != null) {
            this.noSignHeaders.addAll(set);
        }
    }

    public void setSign(String str) {
        addHeader(ProtectedSandApp.s("㙃\u0001"), str);
    }

    public void setRequestHeaders(String str, String str2, boolean z4) throws CosXmlClientException {
        if (str == null || str2 == null) {
            return;
        }
        if (z4) {
            str2 = URLEncodeUtils.cosPathEncode(str2);
        }
        addHeader(str, str2);
    }

    public void setSign(String str, String str2) {
        addHeader(ProtectedSandApp.s("㙃\u0001"), str);
        if (TextUtils.isEmpty(str2)) {
            addHeader(ProtectedSandApp.s("㙄\u0001"), str2);
        }
    }

    @Deprecated
    public void setSign(long j4, Set<String> set, Set<String> set2) {
        setSignParamsAndHeaders(set, set2);
    }

    @Deprecated
    public void setSign(long j4, long j5, Set<String> set, Set<String> set2) {
        setSignParamsAndHeaders(set, set2);
    }
}
