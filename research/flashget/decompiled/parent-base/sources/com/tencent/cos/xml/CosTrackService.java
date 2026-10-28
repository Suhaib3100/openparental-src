package com.tencent.cos.xml;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.common.VersionInfo;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.object.BasePutObjectRequest;
import com.tencent.cos.xml.model.object.GetObjectBytesRequest;
import com.tencent.cos.xml.model.object.GetObjectRequest;
import com.tencent.cos.xml.transfer.TransferTaskMetrics;
import com.tencent.cos.xml.utils.ThrowableUtils;
import com.tencent.qcloud.core.common.QCloudAuthenticationException;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.http.HttpRequest;
import com.tencent.qcloud.core.http.HttpTask;
import com.tencent.qcloud.core.http.HttpTaskMetrics;
import com.tencent.qcloud.track.QCloudTrackService;
import com.tencent.qcloud.track.cls.ClsLifecycleCredentialProvider;
import com.tencent.qcloud.track.service.BeaconTrackService;
import com.tencent.qcloud.track.service.ClsTrackService;
import java.io.IOException;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class CosTrackService {
    private static final boolean IS_DEBUG = false;
    private static CosTrackService instance;
    private String bridge;
    private boolean isCloseReport;
    private static final String EVENT_CODE_TRACK_COS_SDK_HTTP = ProtectedSandApp.s("㑴\u0001");
    private static final String EVENT_CODE_TRACK_COS_SDK = ProtectedSandApp.s("㑳\u0001");
    private static final String EVENT_PARAMS_SERVER = ProtectedSandApp.s("㑱\u0001");
    private static final String EVENT_CODE_NEW_TRANSFER = ProtectedSandApp.s("㑸\u0001");
    public static final String EVENT_CODE_TRACK_COS_SDK_SONAR_FAILURE = ProtectedSandApp.s("㑶\u0001");
    private static final String SDK_NAME = ProtectedSandApp.s("㒥\u0001");
    private static final String EVENT_PARAMS_FAILURE = ProtectedSandApp.s("㒞\u0001");
    private static final String EVENT_PARAMS_SUCCESS = ProtectedSandApp.s("㒠\u0001");
    public static final String EVENT_CODE_TRACK_COS_SDK_SONAR = ProtectedSandApp.s("㑵\u0001");
    private static final String EVENT_PARAMS_CLIENT = ProtectedSandApp.s("㑥\u0001");
    private static final String TAG = ProtectedSandApp.s("㒫\u0001");
    private final CosTrackSonarService sonarService = new CosTrackSonarService();
    private final SonarHostsRandomQueue sonarHosts = new SonarHostsRandomQueue(3);

    private static class ReturnClientException {
        private final CosXmlClientException exception;
        private final Map<String, String> params;

        public ReturnClientException(CosXmlClientException cosXmlClientException, Map<String, String> map) {
            this.exception = cosXmlClientException;
            this.params = map;
        }
    }

    private static class ReturnServiceException {
        private final CosXmlServiceException exception;
        private final Map<String, String> params;

        public ReturnServiceException(CosXmlServiceException cosXmlServiceException, Map<String, String> map) {
            this.exception = cosXmlServiceException;
            this.params = map;
        }
    }

    public static class SonarHost {
        private final String bucket;
        private final String host;
        private final String region;

        public SonarHost(String str, String str2, String str3) {
            this.host = str;
            this.region = str2;
            this.bucket = str3;
        }

        public String getBucket() {
            return this.bucket;
        }

        public String getHost() {
            return this.host;
        }

        public String getRegion() {
            return this.region;
        }
    }

    public static class SonarHostsRandomQueue {
        private final int maxSize;
        private long sonarHostsAddTimestamp;
        private final List<SonarHost> list = new LinkedList();
        private final Random random = new Random();

        public SonarHostsRandomQueue(int i4) {
            this.maxSize = i4;
        }

        public void add(SonarHost sonarHost) {
            if (this.list.size() >= this.maxSize) {
                this.list.remove(0);
            }
            this.list.add(sonarHost);
            this.sonarHostsAddTimestamp = System.currentTimeMillis();
        }

        public SonarHost get() {
            if (this.list.isEmpty()) {
                return null;
            }
            return this.list.get(this.random.nextInt(this.list.size()));
        }

        public long getSonarHostsAddTimestamp() {
            return this.sonarHostsAddTimestamp;
        }
    }

    private CosTrackService() {
    }

    private Map<String, String> createTransferExtra(String str, CosXmlRequest cosXmlRequest) {
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("㑞\u0001"), str);
        hashMap.put(ProtectedSandApp.s("㑠\u0001"), cosXmlRequest != null ? cosXmlRequest.getClass().getSimpleName() : ProtectedSandApp.s("㑟\u0001"));
        return hashMap;
    }

    private ReturnClientException getClientExceptionParams(QCloudClientException qCloudClientException) {
        HashMap hashMap = new HashMap();
        CosXmlClientException convertClientException = convertClientException(qCloudClientException);
        Throwable rootCause = ThrowableUtils.getRootCause(convertClientException);
        hashMap.put(ProtectedSandApp.s("㑡\u0001"), String.valueOf(convertClientException.errorCode));
        hashMap.put(ProtectedSandApp.s("㑢\u0001"), rootCause.getClass().getSimpleName());
        hashMap.put(ProtectedSandApp.s("㑣\u0001"), rootCause.getMessage());
        hashMap.put(ProtectedSandApp.s("㑤\u0001"), ProtectedSandApp.s("㑥\u0001"));
        return new ReturnClientException(convertClientException, hashMap);
    }

    private Map<String, String> getCommonParams() {
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("㑦\u0001"), VersionInfo.getVersionName());
        hashMap.put(ProtectedSandApp.s("㑧\u0001"), String.valueOf(VersionInfo.getVersionCode()));
        if (!TextUtils.isEmpty(this.bridge)) {
            hashMap.put(ProtectedSandApp.s("㑨\u0001"), this.bridge);
        }
        return hashMap;
    }

    public static CosTrackService getInstance() {
        return instance;
    }

    @o0
    private static String getRequestName(CosXmlRequest cosXmlRequest) {
        if (cosXmlRequest instanceof BasePutObjectRequest) {
            return ProtectedSandApp.s("㑩\u0001");
        }
        if ((cosXmlRequest instanceof GetObjectRequest) || (cosXmlRequest instanceof GetObjectBytesRequest)) {
            return ProtectedSandApp.s("㑬\u0001");
        }
        return ProtectedSandApp.s("㑪\u0001").equalsIgnoreCase(cosXmlRequest.getClass().getSimpleName()) ? ProtectedSandApp.s("㑫\u0001") : cosXmlRequest.getClass().getSimpleName();
    }

    private ReturnServiceException getServiceExceptionParams(QCloudServiceException qCloudServiceException) {
        HashMap hashMap = new HashMap();
        CosXmlServiceException convertServerException = convertServerException(qCloudServiceException);
        boolean isEmpty = TextUtils.isEmpty(convertServerException.getErrorCode());
        String s4 = ProtectedSandApp.s("㑟\u0001");
        hashMap.put(ProtectedSandApp.s("㑡\u0001"), (isEmpty || convertServerException.getErrorCode().equals(s4)) ? String.valueOf(convertServerException.getStatusCode()) : convertServerException.getErrorCode());
        hashMap.put(ProtectedSandApp.s("㑣\u0001"), (TextUtils.isEmpty(convertServerException.getErrorMessage()) || convertServerException.getErrorMessage().equals(s4)) ? String.valueOf(convertServerException.getHttpMessage()) : convertServerException.getErrorMessage());
        hashMap.put(ProtectedSandApp.s("㑭\u0001"), String.valueOf(convertServerException.getStatusCode()));
        hashMap.put(ProtectedSandApp.s("㑮\u0001"), convertServerException.getHttpMessage());
        hashMap.put(ProtectedSandApp.s("㑯\u0001"), convertServerException.getServiceName());
        hashMap.put(ProtectedSandApp.s("㑰\u0001"), convertServerException.getRequestId());
        hashMap.put(ProtectedSandApp.s("㑤\u0001"), ProtectedSandApp.s("㑱\u0001"));
        return new ReturnServiceException(convertServerException, hashMap);
    }

    public static void init(Context context, boolean z4, String str) {
        synchronized (CosTrackService.class) {
            try {
                if (instance == null) {
                    CosTrackService cosTrackService = new CosTrackService();
                    instance = cosTrackService;
                    cosTrackService.bridge = str;
                    cosTrackService.isCloseReport = z4;
                    if (BeaconTrackService.isInclude()) {
                        BeaconTrackService beaconTrackService = new BeaconTrackService();
                        beaconTrackService.setContext(context);
                        beaconTrackService.init(ProtectedSandApp.s("㑲\u0001"));
                        QCloudTrackService.getInstance().addTrackService(ProtectedSandApp.s("㑳\u0001"), beaconTrackService);
                        QCloudTrackService.getInstance().addTrackService(ProtectedSandApp.s("㑴\u0001"), beaconTrackService);
                        QCloudTrackService.getInstance().addTrackService(ProtectedSandApp.s("㑵\u0001"), beaconTrackService);
                        QCloudTrackService.getInstance().addTrackService(ProtectedSandApp.s("㑶\u0001"), beaconTrackService);
                        BeaconTrackService beaconTrackService2 = new BeaconTrackService();
                        beaconTrackService2.setContext(context);
                        beaconTrackService2.init(ProtectedSandApp.s("㑷\u0001"));
                        QCloudTrackService.getInstance().addTrackService(ProtectedSandApp.s("㑸\u0001"), beaconTrackService2);
                    }
                    QCloudTrackService.getInstance().init(context);
                    QCloudTrackService.getInstance().setDebug(false);
                    QCloudTrackService.getInstance().setIsCloseReport(z4);
                    getInstance().reportSdkStart();
                    getInstance().getSonarService().setContext(context);
                    getInstance().getSonarService().periodicSonar();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void initCLs(Context context, String str, String str2) {
        if (!ClsTrackService.isInclude()) {
            throw new IllegalStateException(ProtectedSandApp.s("㑻\u0001"));
        }
        ClsTrackService clsTrackService = new ClsTrackService();
        clsTrackService.init(context, str, str2);
        clsTrackService.setSecurityCredential(ProtectedSandApp.s("㑹\u0001"), ProtectedSandApp.s("㑺\u0001"));
        QCloudTrackService.getInstance().addTrackService(ProtectedSandApp.s("㑳\u0001"), clsTrackService);
    }

    private boolean isReport(CosXmlServiceException cosXmlServiceException) {
        return true;
    }

    private Map<String, String> parseClientExceptionParams(CosXmlClientException cosXmlClientException) {
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("㑣\u0001"), cosXmlClientException.getMessage());
        hashMap.put(ProtectedSandApp.s("㑡\u0001"), String.valueOf(cosXmlClientException.errorCode));
        hashMap.put(ProtectedSandApp.s("㑤\u0001"), ProtectedSandApp.s("㑥\u0001"));
        return hashMap;
    }

    private Map<String, String> parseCosXmlRequestBaseParams(CosXmlRequest cosXmlRequest) {
        HashMap hashMap = new HashMap();
        if (cosXmlRequest == null) {
            return hashMap;
        }
        hashMap.put(ProtectedSandApp.s("㑽\u0001"), cosXmlRequest.getBucket());
        String region = cosXmlRequest.getRegion();
        String s4 = ProtectedSandApp.s("㑾\u0001");
        hashMap.put(s4, region);
        if (cosXmlRequest.getHttpTask() != null && cosXmlRequest.getHttpTask().request() != null) {
            String header = cosXmlRequest.getHttpTask().request().header(ProtectedSandApp.s("㑿\u0001"));
            hashMap.put(ProtectedSandApp.s("㒂\u0001"), (TextUtils.isEmpty(header) || !header.contains(ProtectedSandApp.s("㒀\u0001"))) ? cosXmlRequest.getHttpTask().request().url().getProtocol() : ProtectedSandApp.s("㒁\u0001"));
            hashMap.put(ProtectedSandApp.s("㒃\u0001"), cosXmlRequest.getHttpTask().request().method());
        }
        String parseHost = parseHost(cosXmlRequest);
        if (!TextUtils.isEmpty(parseHost)) {
            hashMap.put(ProtectedSandApp.s("㒄\u0001"), parseHost);
            try {
                Matcher matcher = Pattern.compile(ProtectedSandApp.s("㒅\u0001")).matcher(parseHost);
                if (matcher.find()) {
                    String group = matcher.group(1);
                    if (!TextUtils.isEmpty(group)) {
                        hashMap.put(s4, group);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    private Map<String, String> parseCosXmlRequestParams(CosXmlRequest cosXmlRequest) {
        HashMap hashMap = new HashMap();
        if (cosXmlRequest == null) {
            return hashMap;
        }
        hashMap.putAll(parseCosXmlRequestBaseParams(cosXmlRequest));
        if (cosXmlRequest.getHttpTask() != null && cosXmlRequest.getHttpTask().request() != null) {
            String header = cosXmlRequest.getHttpTask().request().header(ProtectedSandApp.s("㑿\u0001"));
            if (!TextUtils.isEmpty(header)) {
                hashMap.put(ProtectedSandApp.s("㒆\u0001"), header);
            }
        }
        return hashMap;
    }

    @q0
    private String parseHost(CosXmlRequest cosXmlRequest) {
        HttpRequest request;
        HttpTask httpTask = cosXmlRequest.getHttpTask();
        if (httpTask == null || (request = httpTask.request()) == null) {
            return null;
        }
        return request.host();
    }

    private Map<String, String> parseHttpTaskMetricsBaseParams(@q0 HttpTaskMetrics httpTaskMetrics, String str) {
        HashMap hashMap = new HashMap();
        if (httpTaskMetrics == null) {
            return hashMap;
        }
        hashMap.put(ProtectedSandApp.s("㒇\u0001"), String.valueOf(httpTaskMetrics.httpTaskFullTime()));
        hashMap.put(ProtectedSandApp.s("㒈\u0001"), String.valueOf(httpTaskMetrics.dnsLookupTookTime()));
        hashMap.put(ProtectedSandApp.s("㒉\u0001"), String.valueOf(httpTaskMetrics.connectTookTime()));
        hashMap.put(ProtectedSandApp.s("㒊\u0001"), String.valueOf(httpTaskMetrics.secureConnectTookTime()));
        hashMap.put(ProtectedSandApp.s("㒋\u0001"), String.valueOf(httpTaskMetrics.readResponseHeaderTookTime()));
        hashMap.put(ProtectedSandApp.s("㒌\u0001"), String.valueOf(httpTaskMetrics.readResponseBodyTookTime()));
        hashMap.put(ProtectedSandApp.s("㒍\u0001"), String.valueOf(httpTaskMetrics.writeRequestHeaderTookTime()));
        hashMap.put(ProtectedSandApp.s("㒎\u0001"), String.valueOf(httpTaskMetrics.writeRequestBodyTookTime()));
        boolean equalsIgnoreCase = ProtectedSandApp.s("㑩\u0001").equalsIgnoreCase(str);
        String s4 = ProtectedSandApp.s("㒏\u0001");
        String s5 = ProtectedSandApp.s("㒐\u0001");
        if (equalsIgnoreCase || ProtectedSandApp.s("㑫\u0001").equalsIgnoreCase(str)) {
            hashMap.put(s5, String.valueOf(httpTaskMetrics.requestBodyByteCount()));
            hashMap.put(s4, String.valueOf((httpTaskMetrics.requestBodyByteCount() / 1024.0d) / httpTaskMetrics.httpTaskFullTime()));
        } else if (ProtectedSandApp.s("㑬\u0001").equalsIgnoreCase(str)) {
            hashMap.put(s5, String.valueOf(httpTaskMetrics.responseBodyByteCount()));
            hashMap.put(s4, String.valueOf((httpTaskMetrics.responseBodyByteCount() / 1024.0d) / httpTaskMetrics.httpTaskFullTime()));
        } else {
            hashMap.put(s5, String.valueOf(httpTaskMetrics.responseBodyByteCount() + httpTaskMetrics.requestBodyByteCount()));
            hashMap.put(s4, String.valueOf(((httpTaskMetrics.responseBodyByteCount() + httpTaskMetrics.requestBodyByteCount()) / 1024.0d) / httpTaskMetrics.httpTaskFullTime()));
        }
        InetAddress connectAddress = httpTaskMetrics.getConnectAddress();
        String s6 = ProtectedSandApp.s("㑟\u0001");
        hashMap.put(ProtectedSandApp.s("㒑\u0001"), connectAddress != null ? httpTaskMetrics.getConnectAddress().getHostAddress() : s6);
        if (httpTaskMetrics.getRemoteAddress() != null) {
            s6 = httpTaskMetrics.getRemoteAddress().toString();
        }
        hashMap.put(ProtectedSandApp.s("㒒\u0001"), s6);
        return hashMap;
    }

    private Map<String, String> parseHttpTaskMetricsParams(@q0 HttpTaskMetrics httpTaskMetrics, String str) {
        HashMap hashMap = new HashMap();
        if (httpTaskMetrics == null) {
            return hashMap;
        }
        hashMap.putAll(parseHttpTaskMetricsBaseParams(httpTaskMetrics, str));
        hashMap.put(ProtectedSandApp.s("㒓\u0001"), String.valueOf(httpTaskMetrics.calculateMD5STookTime()));
        hashMap.put(ProtectedSandApp.s("㒔\u0001"), String.valueOf(httpTaskMetrics.signRequestTookTime()));
        hashMap.put(ProtectedSandApp.s("㒕\u0001"), String.valueOf(httpTaskMetrics.fullTaskTookTime()));
        hashMap.put(ProtectedSandApp.s("㒖\u0001"), String.valueOf(httpTaskMetrics.getRetryCount()));
        return hashMap;
    }

    private Map<String, String> parseServiceExceptionParams(CosXmlServiceException cosXmlServiceException) {
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("㑣\u0001"), cosXmlServiceException.getErrorMessage());
        hashMap.put(ProtectedSandApp.s("㑡\u0001"), cosXmlServiceException.getErrorCode());
        hashMap.put(ProtectedSandApp.s("㒗\u0001"), cosXmlServiceException.getRequestId());
        hashMap.put(ProtectedSandApp.s("㑤\u0001"), ProtectedSandApp.s("㑱\u0001"));
        return hashMap;
    }

    private Map<String, String> parseSimplePerfParams(@q0 TransferTaskMetrics transferTaskMetrics) {
        HashMap hashMap = new HashMap();
        if (transferTaskMetrics == null) {
            return hashMap;
        }
        hashMap.put(ProtectedSandApp.s("㒘\u0001"), String.valueOf(transferTaskMetrics.getSize()));
        hashMap.put(ProtectedSandApp.s("㒙\u0001"), transferTaskMetrics.getConnectAddress() != null ? transferTaskMetrics.getConnectAddress().getHostAddress() : "");
        hashMap.put(ProtectedSandApp.s("㒚\u0001"), String.valueOf(transferTaskMetrics.getTookTime()));
        hashMap.put(ProtectedSandApp.s("㒛\u0001"), String.valueOf(transferTaskMetrics.getWaitTookTime()));
        hashMap.put(ProtectedSandApp.s("㒜\u0001"), String.valueOf(transferTaskMetrics.getFirstProgressTookTime()));
        return hashMap;
    }

    private CosXmlClientException reportClientException(CosXmlRequest cosXmlRequest, QCloudClientException qCloudClientException, @q0 Map<String, String> map, boolean z4) {
        CosTrackSonarService cosTrackSonarService;
        ReturnClientException clientExceptionParams = getClientExceptionParams(qCloudClientException);
        if (!z4) {
            try {
                if (isReport(clientExceptionParams.exception)) {
                    HttpTaskMetrics metrics = cosXmlRequest.getMetrics();
                    Map<String, String> parseCosXmlRequestParams = parseCosXmlRequestParams(cosXmlRequest);
                    parseCosXmlRequestParams.putAll(getCommonParams());
                    parseCosXmlRequestParams.putAll(clientExceptionParams.params);
                    String s4 = ProtectedSandApp.s("㑞\u0001");
                    if (map == null || !map.containsKey(s4)) {
                        parseCosXmlRequestParams.put(s4, cosXmlRequest.getClass().getSimpleName());
                    }
                    parseCosXmlRequestParams.put(ProtectedSandApp.s("㒝\u0001"), ProtectedSandApp.s("㒞\u0001"));
                    if (map != null) {
                        parseCosXmlRequestParams.putAll(map);
                    }
                    parseCosXmlRequestParams.putAll(parseHttpTaskMetricsParams(metrics, parseCosXmlRequestParams.get(s4)));
                    if (!TextUtils.isEmpty(cosXmlRequest.getClientTraceId())) {
                        parseCosXmlRequestParams.put(ProtectedSandApp.s("㒟\u0001"), cosXmlRequest.getClientTraceId());
                    }
                    QCloudTrackService.getInstance().report(ProtectedSandApp.s("㑳\u0001"), parseCosXmlRequestParams);
                    if ((clientExceptionParams.exception.errorCode == ClientErrorCode.POOR_NETWORK.getCode() || clientExceptionParams.exception.errorCode == ClientErrorCode.IO_ERROR.getCode()) && (cosTrackSonarService = this.sonarService) != null) {
                        cosTrackSonarService.failSonar(parseCosXmlRequestParams.get(ProtectedSandApp.s("㒄\u0001")), parseCosXmlRequestParams.get(ProtectedSandApp.s("㑾\u0001")), parseCosXmlRequestParams.get(ProtectedSandApp.s("㑽\u0001")), cosXmlRequest.getClientTraceId());
                    }
                }
            } catch (Exception unused) {
            }
        }
        return clientExceptionParams.exception;
    }

    private CosXmlServiceException reportServiceException(CosXmlRequest cosXmlRequest, QCloudServiceException qCloudServiceException, @q0 Map<String, String> map, boolean z4) {
        CosTrackSonarService cosTrackSonarService;
        ReturnServiceException serviceExceptionParams = getServiceExceptionParams(qCloudServiceException);
        if (!z4) {
            try {
                if (isReport(serviceExceptionParams.exception)) {
                    Map<String, String> parseCosXmlRequestParams = parseCosXmlRequestParams(cosXmlRequest);
                    parseCosXmlRequestParams.putAll(getCommonParams());
                    parseCosXmlRequestParams.putAll(serviceExceptionParams.params);
                    String s4 = ProtectedSandApp.s("㑞\u0001");
                    if (map == null || !map.containsKey(s4)) {
                        parseCosXmlRequestParams.put(s4, cosXmlRequest.getClass().getSimpleName());
                    }
                    parseCosXmlRequestParams.put(ProtectedSandApp.s("㒝\u0001"), ProtectedSandApp.s("㒞\u0001"));
                    if (map != null) {
                        parseCosXmlRequestParams.putAll(map);
                    }
                    parseCosXmlRequestParams.putAll(parseHttpTaskMetricsParams(cosXmlRequest.getMetrics(), parseCosXmlRequestParams.get(s4)));
                    if (!TextUtils.isEmpty(cosXmlRequest.getClientTraceId())) {
                        parseCosXmlRequestParams.put(ProtectedSandApp.s("㒟\u0001"), cosXmlRequest.getClientTraceId());
                    }
                    QCloudTrackService.getInstance().report(ProtectedSandApp.s("㑳\u0001"), parseCosXmlRequestParams);
                    if (serviceExceptionParams.exception != null && ((ProtectedSandApp.s("㒡\u0001").equals(serviceExceptionParams.exception.getErrorCode()) || ProtectedSandApp.s("㒢\u0001").equals(serviceExceptionParams.exception.getErrorCode())) && (cosTrackSonarService = this.sonarService) != null)) {
                        cosTrackSonarService.failSonar(parseCosXmlRequestParams.get(ProtectedSandApp.s("㒄\u0001")), parseCosXmlRequestParams.get(ProtectedSandApp.s("㑾\u0001")), parseCosXmlRequestParams.get(ProtectedSandApp.s("㑽\u0001")), cosXmlRequest.getClientTraceId());
                    }
                }
            } catch (Exception unused) {
            }
        }
        return serviceExceptionParams.exception;
    }

    private void reportTransferTask(CosXmlRequest cosXmlRequest, TransferTaskMetrics transferTaskMetrics, boolean z4, boolean z5, @q0 Map<String, String> map) {
        try {
            Map<String, String> parseCosXmlRequestParams = parseCosXmlRequestParams(cosXmlRequest);
            parseCosXmlRequestParams.put(ProtectedSandApp.s("㑞\u0001"), cosXmlRequest.getClass().getSimpleName());
            parseCosXmlRequestParams.putAll(getCommonParams());
            parseCosXmlRequestParams.putAll(parseSimplePerfParams(transferTaskMetrics));
            parseCosXmlRequestParams.put(ProtectedSandApp.s("㒣\u0001"), String.valueOf(z4));
            parseCosXmlRequestParams.put(ProtectedSandApp.s("㒝\u0001"), z5 ? ProtectedSandApp.s("㒠\u0001") : ProtectedSandApp.s("㒞\u0001"));
            if (map != null) {
                parseCosXmlRequestParams.putAll(map);
            }
            QCloudTrackService.getInstance().report(ProtectedSandApp.s("㑸\u0001"), parseCosXmlRequestParams);
        } catch (Exception unused) {
        }
    }

    public CosXmlClientException convertClientException(QCloudClientException qCloudClientException) {
        if (qCloudClientException instanceof CosXmlClientException) {
            return (CosXmlClientException) qCloudClientException;
        }
        Throwable rootCause = ThrowableUtils.getRootCause(qCloudClientException);
        return rootCause instanceof IllegalArgumentException ? new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), qCloudClientException) : rootCause instanceof QCloudAuthenticationException ? new CosXmlClientException(ClientErrorCode.INVALID_CREDENTIALS.getCode(), qCloudClientException) : rootCause instanceof IOException ? new CosXmlClientException(ClientErrorCode.IO_ERROR.getCode(), qCloudClientException) : new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), qCloudClientException);
    }

    public CosXmlServiceException convertServerException(QCloudServiceException qCloudServiceException) {
        return qCloudServiceException instanceof CosXmlServiceException ? (CosXmlServiceException) qCloudServiceException : new CosXmlServiceException(qCloudServiceException);
    }

    public SonarHostsRandomQueue getSonarHosts() {
        return this.sonarHosts;
    }

    public CosTrackSonarService getSonarService() {
        return this.sonarService;
    }

    public boolean isCloseReport() {
        return this.isCloseReport;
    }

    public void reportCopyTaskClientException(CosXmlRequest cosXmlRequest, CosXmlClientException cosXmlClientException, Map<String, String> map) {
        Map<String, String> createTransferExtra = createTransferExtra(ProtectedSandApp.s("㑫\u0001"), cosXmlRequest);
        createTransferExtra.putAll(map);
        reportClientException(cosXmlRequest, cosXmlClientException, createTransferExtra, false);
    }

    public void reportCopyTaskServiceException(CosXmlRequest cosXmlRequest, CosXmlServiceException cosXmlServiceException, Map<String, String> map) {
        Map<String, String> createTransferExtra = createTransferExtra(ProtectedSandApp.s("㑫\u0001"), cosXmlRequest);
        createTransferExtra.putAll(map);
        reportServiceException(cosXmlRequest, cosXmlServiceException, createTransferExtra, false);
    }

    public void reportCopyTaskSuccess(CosXmlRequest cosXmlRequest, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("㑞\u0001"), ProtectedSandApp.s("㑫\u0001"));
        hashMap.putAll(map);
        reportRequestSuccess(cosXmlRequest, (Map<String, String>) hashMap, false);
    }

    public void reportDownloadTaskClientException(CosXmlRequest cosXmlRequest, QCloudClientException qCloudClientException, Map<String, String> map) {
        Map<String, String> createTransferExtra = createTransferExtra(ProtectedSandApp.s("㑬\u0001"), cosXmlRequest);
        createTransferExtra.putAll(map);
        reportClientException(cosXmlRequest, qCloudClientException, createTransferExtra, false);
    }

    public void reportDownloadTaskServiceException(CosXmlRequest cosXmlRequest, QCloudServiceException qCloudServiceException, Map<String, String> map) {
        Map<String, String> createTransferExtra = createTransferExtra(ProtectedSandApp.s("㑬\u0001"), cosXmlRequest);
        createTransferExtra.putAll(map);
        reportServiceException(cosXmlRequest, qCloudServiceException, createTransferExtra, false);
    }

    public void reportDownloadTaskSuccess(CosXmlRequest cosXmlRequest, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("㑞\u0001"), ProtectedSandApp.s("㑬\u0001"));
        hashMap.putAll(map);
        reportRequestSuccess(cosXmlRequest, (Map<String, String>) hashMap, false);
    }

    public void reportError(String str, Exception exc) {
        if (exc == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            Throwable rootCause = ThrowableUtils.getRootCause(exc);
            hashMap.put(ProtectedSandApp.s("㒤\u0001"), ProtectedSandApp.s("㒥\u0001"));
            hashMap.put(ProtectedSandApp.s("㒦\u0001"), str);
            hashMap.put(ProtectedSandApp.s("㒧\u0001"), rootCause.getClass().getSimpleName());
            hashMap.put(ProtectedSandApp.s("㒨\u0001"), rootCause.getMessage());
            hashMap.putAll(getCommonParams());
            QCloudTrackService.getInstance().reportSimpleData(ProtectedSandApp.s("㒩\u0001"), hashMap);
        } catch (Exception unused) {
        }
    }

    public void reportHttpMetrics(CosXmlRequest cosXmlRequest) {
        if (cosXmlRequest == null || cosXmlRequest.getMetrics() == null) {
            return;
        }
        if (cosXmlRequest.getMetrics().httpTaskFullTime() == p.f60679p && cosXmlRequest.getMetrics().dnsLookupTookTime() == p.f60679p && cosXmlRequest.getMetrics().connectTookTime() == p.f60679p && cosXmlRequest.getMetrics().secureConnectTookTime() == p.f60679p) {
            return;
        }
        try {
            Map<String, String> parseCosXmlRequestBaseParams = parseCosXmlRequestBaseParams(cosXmlRequest);
            parseCosXmlRequestBaseParams.putAll(parseHttpTaskMetricsBaseParams(cosXmlRequest.getMetrics(), getRequestName(cosXmlRequest)));
            parseCosXmlRequestBaseParams.putAll(getCommonParams());
            if (!TextUtils.isEmpty(cosXmlRequest.getClientTraceId())) {
                parseCosXmlRequestBaseParams.put(ProtectedSandApp.s("㒟\u0001"), cosXmlRequest.getClientTraceId());
            }
            QCloudTrackService.getInstance().report(ProtectedSandApp.s("㑴\u0001"), parseCosXmlRequestBaseParams);
        } catch (Exception unused) {
        }
    }

    public CosXmlClientException reportRequestClientException(CosXmlRequest cosXmlRequest, QCloudClientException qCloudClientException, boolean z4, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("㑞\u0001"), getRequestName(cosXmlRequest));
        hashMap.putAll(map);
        return reportClientException(cosXmlRequest, qCloudClientException, hashMap, z4);
    }

    public CosXmlServiceException reportRequestServiceException(CosXmlRequest cosXmlRequest, QCloudServiceException qCloudServiceException, boolean z4, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("㑞\u0001"), getRequestName(cosXmlRequest));
        hashMap.putAll(map);
        return reportServiceException(cosXmlRequest, qCloudServiceException, hashMap, z4);
    }

    public void reportRequestSuccess(CosXmlRequest cosXmlRequest, boolean z4, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("㑞\u0001"), getRequestName(cosXmlRequest));
        hashMap.putAll(map);
        reportRequestSuccess(cosXmlRequest, hashMap, z4);
    }

    public void reportSdkStart() {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put(ProtectedSandApp.s("㒤\u0001"), ProtectedSandApp.s("㒥\u0001"));
            hashMap.putAll(getCommonParams());
            QCloudTrackService.getInstance().reportSimpleData(ProtectedSandApp.s("㒪\u0001"), hashMap);
        } catch (Exception unused) {
        }
    }

    public void reportTransferClientException(CosXmlRequest cosXmlRequest, TransferTaskMetrics transferTaskMetrics, CosXmlClientException cosXmlClientException, boolean z4) {
        if (isReport(cosXmlClientException)) {
            reportTransferTask(cosXmlRequest, transferTaskMetrics, z4, false, parseClientExceptionParams(cosXmlClientException));
        }
    }

    public void reportTransferServiceException(CosXmlRequest cosXmlRequest, TransferTaskMetrics transferTaskMetrics, CosXmlServiceException cosXmlServiceException, boolean z4) {
        if (isReport(cosXmlServiceException)) {
            reportTransferTask(cosXmlRequest, transferTaskMetrics, z4, false, parseServiceExceptionParams(cosXmlServiceException));
        }
    }

    public void reportTransferSuccess(CosXmlRequest cosXmlRequest, TransferTaskMetrics transferTaskMetrics, boolean z4) {
        reportTransferTask(cosXmlRequest, transferTaskMetrics, z4, true, null);
    }

    public void reportUploadTaskClientException(CosXmlRequest cosXmlRequest, QCloudClientException qCloudClientException, Map<String, String> map) {
        Map<String, String> createTransferExtra = createTransferExtra(ProtectedSandApp.s("㑩\u0001"), cosXmlRequest);
        createTransferExtra.putAll(map);
        reportClientException(cosXmlRequest, qCloudClientException, createTransferExtra, false);
    }

    public void reportUploadTaskServiceException(CosXmlRequest cosXmlRequest, QCloudServiceException qCloudServiceException, Map<String, String> map) {
        Map<String, String> createTransferExtra = createTransferExtra(ProtectedSandApp.s("㑩\u0001"), cosXmlRequest);
        createTransferExtra.putAll(map);
        reportServiceException(cosXmlRequest, qCloudServiceException, createTransferExtra, false);
    }

    public void reportUploadTaskSuccess(CosXmlRequest cosXmlRequest, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("㑞\u0001"), ProtectedSandApp.s("㑩\u0001"));
        hashMap.putAll(map);
        reportRequestSuccess(cosXmlRequest, (Map<String, String>) hashMap, false);
    }

    private boolean isReport(CosXmlClientException cosXmlClientException) {
        return !(cosXmlClientException.getMessage() != null && cosXmlClientException.getMessage().toLowerCase(Locale.ROOT).contains(ProtectedSandApp.s("㑼\u0001")));
    }

    private void reportRequestSuccess(CosXmlRequest cosXmlRequest, @q0 Map<String, String> map, boolean z4) {
        if (z4) {
            return;
        }
        try {
            HttpTaskMetrics metrics = cosXmlRequest.getMetrics();
            Map<String, String> parseCosXmlRequestParams = parseCosXmlRequestParams(cosXmlRequest);
            parseCosXmlRequestParams.putAll(getCommonParams());
            String s4 = ProtectedSandApp.s("㑞\u0001");
            if (map == null || !map.containsKey(s4)) {
                parseCosXmlRequestParams.put(s4, cosXmlRequest.getClass().getSimpleName());
            }
            parseCosXmlRequestParams.put(ProtectedSandApp.s("㒝\u0001"), ProtectedSandApp.s("㒠\u0001"));
            if (map != null) {
                parseCosXmlRequestParams.putAll(map);
            }
            parseCosXmlRequestParams.putAll(parseHttpTaskMetricsParams(metrics, parseCosXmlRequestParams.get(s4)));
            if (!TextUtils.isEmpty(cosXmlRequest.getClientTraceId())) {
                parseCosXmlRequestParams.put(ProtectedSandApp.s("㒟\u0001"), cosXmlRequest.getClientTraceId());
            }
            QCloudTrackService.getInstance().report(ProtectedSandApp.s("㑳\u0001"), parseCosXmlRequestParams);
            this.sonarHosts.add(new SonarHost(parseCosXmlRequestParams.get(ProtectedSandApp.s("㒄\u0001")), parseCosXmlRequestParams.get(ProtectedSandApp.s("㑾\u0001")), parseCosXmlRequestParams.get(ProtectedSandApp.s("㑽\u0001"))));
        } catch (Exception unused) {
        }
    }

    public static void initCLs(Context context, String str, String str2, String str3, String str4) {
        if (ClsTrackService.isInclude()) {
            ClsTrackService clsTrackService = new ClsTrackService();
            clsTrackService.init(context, str, str2);
            clsTrackService.setSecurityCredential(str3, str4);
            QCloudTrackService.getInstance().addTrackService(ProtectedSandApp.s("㑳\u0001"), clsTrackService);
            return;
        }
        throw new IllegalStateException(ProtectedSandApp.s("㑻\u0001"));
    }

    public static void initCLs(Context context, String str, String str2, ClsLifecycleCredentialProvider clsLifecycleCredentialProvider) {
        if (ClsTrackService.isInclude()) {
            ClsTrackService clsTrackService = new ClsTrackService();
            clsTrackService.init(context, str, str2);
            clsTrackService.setCredentialProvider(clsLifecycleCredentialProvider);
            QCloudTrackService.getInstance().addTrackService(ProtectedSandApp.s("㑳\u0001"), clsTrackService);
            return;
        }
        throw new IllegalStateException(ProtectedSandApp.s("㑻\u0001"));
    }
}
