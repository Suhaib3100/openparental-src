package com.tencent.qcloud.core.http;

import bolts.e;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import com.tencent.qcloud.core.auth.QCloudCredentialProvider;
import com.tencent.qcloud.core.auth.QCloudSelfSigner;
import com.tencent.qcloud.core.auth.QCloudSigner;
import com.tencent.qcloud.core.auth.ScopeLimitCredentialProvider;
import com.tencent.qcloud.core.common.QCloudAuthenticationException;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudDigistListener;
import com.tencent.qcloud.core.common.QCloudProgressListener;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.task.QCloudTask;
import com.tencent.qcloud.core.task.TaskExecutors;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.e0;
import okhttp3.f0;
import okio.m;

/* loaded from: classes7.dex */
public final class HttpTask<T> extends QCloudTask<HttpResult<T>> {
    private static AtomicInteger increments = new AtomicInteger(1);
    protected final QCloudCredentialProvider credentialProvider;
    protected final HttpRequest<T> httpRequest;
    protected HttpResult<T> httpResult;
    private QCloudProgressListener mProgressListener;
    protected HttpTaskMetrics metrics;
    private NetworkProxy<T> networkProxy;

    HttpTask(HttpRequest<T> httpRequest, QCloudCredentialProvider qCloudCredentialProvider, NetworkClient networkClient) {
        super(ProtectedSandApp.s("妊\u0001") + httpRequest.tag() + ProtectedSandApp.s("妋\u0001") + increments.getAndIncrement(), httpRequest.tag());
        this.mProgressListener = new QCloudProgressListener() { // from class: com.tencent.qcloud.core.http.HttpTask.1
            @Override // com.tencent.qcloud.core.common.QCloudProgressListener
            public void onProgress(long j4, long j5) {
                HttpTask.this.onProgress(j4, j5);
            }
        };
        this.httpRequest = httpRequest;
        this.credentialProvider = qCloudCredentialProvider;
        NetworkProxy<T> networkProxyWrapper = networkClient.getNetworkProxyWrapper();
        this.networkProxy = networkProxyWrapper;
        networkProxyWrapper.identifier = getIdentifier();
        this.networkProxy.mProgressListener = this.mProgressListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void calculateContentMD5() throws QCloudClientException {
        e0 requestBody = this.httpRequest.getRequestBody();
        if (requestBody == 0) {
            throw new QCloudClientException(new IllegalArgumentException(ProtectedSandApp.s("妏\u0001")));
        }
        boolean z4 = requestBody instanceof QCloudDigistListener;
        String s4 = ProtectedSandApp.s("妌\u0001");
        if (z4) {
            try {
                if (this.httpRequest.getRequestBody() instanceof MultipartStreamRequestBody) {
                    ((MultipartStreamRequestBody) this.httpRequest.getRequestBody()).addMd5();
                } else {
                    this.httpRequest.addHeader(s4, ((QCloudDigistListener) requestBody).onGetMd5());
                }
                return;
            } catch (IOException e4) {
                throw new QCloudClientException(ProtectedSandApp.s("妍\u0001") + e4.getMessage(), e4);
            }
        }
        m mVar = new m();
        try {
            requestBody.writeTo(mVar);
            this.httpRequest.addHeader(s4, mVar.F().d());
        } catch (IOException e5) {
            throw new QCloudClientException(ProtectedSandApp.s("妎\u0001") + e5.getMessage(), e5);
        }
    }

    private boolean isClockSkewedError(QCloudServiceException qCloudServiceException) {
        return ProtectedSandApp.s("妐\u0001").equals(qCloudServiceException.getErrorCode()) || ProtectedSandApp.s("妑\u0001").equals(qCloudServiceException.getErrorCode());
    }

    private boolean isCompleteMultipartRequest(HttpRequest httpRequest) {
        Set<String> keySet = httpRequest.queries.keySet();
        return keySet != null && keySet.size() == 1 && keySet.contains(ProtectedSandApp.s("妒\u0001"));
    }

    private void signRequest(QCloudSigner qCloudSigner, QCloudHttpRequest qCloudHttpRequest) throws QCloudClientException {
        QCloudCredentialProvider qCloudCredentialProvider = this.credentialProvider;
        if (qCloudCredentialProvider == null) {
            throw new QCloudClientException(new QCloudAuthenticationException(ProtectedSandApp.s("妓\u0001")));
        }
        qCloudSigner.sign(qCloudHttpRequest, qCloudCredentialProvider instanceof ScopeLimitCredentialProvider ? ((ScopeLimitCredentialProvider) qCloudCredentialProvider).getCredentials(qCloudHttpRequest.getCredentialScope()) : qCloudCredentialProvider.getCredentials());
    }

    public HttpTask<T> attachMetric(HttpTaskMetrics httpTaskMetrics) {
        this.metrics = httpTaskMetrics;
        return this;
    }

    @Override // com.tencent.qcloud.core.task.QCloudTask
    public void cancel() {
        this.networkProxy.cancel();
        super.cancel();
    }

    public void convertResponse(f0 f0Var) throws QCloudClientException, QCloudServiceException {
        this.httpResult = this.networkProxy.convertResponse(this.httpRequest, f0Var);
    }

    public double getAverageStreamingSpeed(long j4) {
        return (this.httpRequest.getRequestBody() instanceof ProgressBody ? (ProgressBody) this.httpRequest.getRequestBody() : this.httpRequest.getResponseBodyConverter() instanceof ProgressBody ? (ProgressBody) this.httpRequest.getResponseBodyConverter() : null) != null ? (r0.getBytesTransferred() / 1024.0d) / (j4 / 1000.0d) : p.f60679p;
    }

    public long getTransferBodySize() {
        ProgressBody progressBody = this.httpRequest.getRequestBody() instanceof ProgressBody ? (ProgressBody) this.httpRequest.getRequestBody() : this.httpRequest.getResponseBodyConverter() instanceof ProgressBody ? (ProgressBody) this.httpRequest.getResponseBodyConverter() : null;
        if (progressBody != null) {
            return progressBody.getBytesTransferred();
        }
        return 0L;
    }

    public boolean isDownloadTask() {
        return this.httpRequest.getResponseBodyConverter() instanceof ProgressBody;
    }

    public boolean isResponseFilePathConverter() {
        return (this.httpRequest.getResponseBodyConverter() instanceof ResponseFileConverter) && ((ResponseFileConverter) this.httpRequest.getResponseBodyConverter()).isFilePathConverter();
    }

    public boolean isSelfSigner() {
        return this.httpRequest.getQCloudSelfSigner() != null;
    }

    public boolean isSuccessful() {
        HttpResult<T> httpResult = this.httpResult;
        return httpResult != null && httpResult.isSuccessful();
    }

    public boolean isUploadTask() {
        if (this.httpRequest.getRequestBody() instanceof StreamingRequestBody) {
            return ((StreamingRequestBody) this.httpRequest.getRequestBody()).isLargeData();
        }
        return false;
    }

    public HttpTaskMetrics metrics() {
        return this.metrics;
    }

    public QCloudHttpRequest newRangeSignRequest(String str) throws QCloudClientException {
        this.httpRequest.removeHeader(ProtectedSandApp.s("妖\u0001"));
        this.httpRequest.addOrReplaceHeader(ProtectedSandApp.s("妗\u0001"), str);
        QCloudSigner qCloudSigner = this.httpRequest.getQCloudSigner();
        if (qCloudSigner != null) {
            this.metrics.onSignRequestStart();
            signRequest(qCloudSigner, (QCloudHttpRequest) this.httpRequest);
            this.metrics.onSignRequestEnd();
        }
        QCloudSelfSigner qCloudSelfSigner = this.httpRequest.getQCloudSelfSigner();
        if (qCloudSelfSigner != null) {
            this.metrics.onSignRequestStart();
            qCloudSelfSigner.sign((QCloudHttpRequest) this.httpRequest);
            this.metrics.onSignRequestEnd();
        }
        return (QCloudHttpRequest) this.httpRequest;
    }

    public HttpRequest<T> request() {
        return this.httpRequest;
    }

    public QCloudHttpRequest retrySignRequest() throws QCloudClientException {
        this.httpRequest.removeHeader(ProtectedSandApp.s("妖\u0001"));
        this.httpRequest.addOrReplaceHeader(ProtectedSandApp.s("妕\u0001"), String.valueOf(true));
        QCloudSigner qCloudSigner = this.httpRequest.getQCloudSigner();
        if (qCloudSigner != null) {
            this.metrics.onSignRequestStart();
            signRequest(qCloudSigner, (QCloudHttpRequest) this.httpRequest);
            this.metrics.onSignRequestEnd();
        }
        QCloudSelfSigner qCloudSelfSigner = this.httpRequest.getQCloudSelfSigner();
        if (qCloudSelfSigner != null) {
            this.metrics.onSignRequestStart();
            qCloudSelfSigner.sign((QCloudHttpRequest) this.httpRequest);
            this.metrics.onSignRequestEnd();
        }
        return (QCloudHttpRequest) this.httpRequest;
    }

    public HttpTask<T> schedule() {
        schedule(2);
        return this;
    }

    public HttpTask<T> scheduleOn(Executor executor) {
        scheduleOn(executor, 2);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00dc, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x017a, code lost:
    
        if ((r5.httpRequest.getRequestBody() instanceof com.tencent.qcloud.core.http.StreamingRequestBody) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01dc, code lost:
    
        if ((r5.httpRequest.getRequestBody() instanceof com.tencent.qcloud.core.http.StreamingRequestBody) != false) goto L34;
     */
    @Override // com.tencent.qcloud.core.task.QCloudTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.qcloud.core.http.HttpResult<T> execute() throws com.tencent.qcloud.core.common.QCloudClientException, com.tencent.qcloud.core.common.QCloudServiceException {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qcloud.core.http.HttpTask.execute():com.tencent.qcloud.core.http.HttpResult");
    }

    @Override // com.tencent.qcloud.core.task.QCloudTask
    public HttpResult<T> getResult() {
        return this.httpResult;
    }

    public HttpTask<T> schedule(int i4) {
        if (this.httpRequest.getRequestBody() instanceof ProgressBody) {
            scheduleOn(TaskExecutors.UPLOAD_EXECUTOR, i4);
        } else if (this.httpRequest.getResponseBodyConverter() instanceof ProgressBody) {
            scheduleOn(TaskExecutors.DOWNLOAD_EXECUTOR, i4);
        } else {
            scheduleOn(TaskExecutors.COMMAND_EXECUTOR, i4);
        }
        return this;
    }

    public HttpTask<T> scheduleOn(Executor executor, int i4) {
        scheduleOn(executor, new e(), i4);
        return this;
    }

    @Override // com.tencent.qcloud.core.task.QCloudTask
    public void cancel(boolean z4) {
        this.networkProxy.cancel();
        super.cancel(z4);
    }
}
