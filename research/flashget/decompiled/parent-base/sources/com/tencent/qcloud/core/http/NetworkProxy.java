package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudProgressListener;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.http.interceptor.QCloudRetryInterceptor;
import java.io.IOException;
import okhttp3.d0;
import okhttp3.f0;

/* loaded from: classes7.dex */
public abstract class NetworkProxy<T> {
    protected String identifier;
    protected QCloudProgressListener mProgressListener;
    private QCloudRetryInterceptor mRetryInterceptor;
    protected HttpTaskMetrics metrics;

    public abstract f0 callHttpRequest(d0 d0Var) throws IOException;

    protected abstract void cancel();

    protected HttpResult<T> convertResponse(HttpRequest<T> httpRequest, f0 f0Var) throws QCloudClientException, QCloudServiceException {
        HttpResponse<T> httpResponse = new HttpResponse<>(httpRequest, f0Var);
        ResponseBodyConverter<T> responseBodyConverter = httpRequest.getResponseBodyConverter();
        if (responseBodyConverter instanceof ProgressBody) {
            ((ProgressBody) responseBodyConverter).setProgressListener(this.mProgressListener);
        }
        return new HttpResult<>(httpResponse, responseBodyConverter.convert(httpResponse));
    }

    protected void disconnect() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:25|26|27|(1:29)(2:39|(6:41|(1:33)|34|35|36|(0)(0))(2:42|43))|30|(1:33)|34|35|36|(0)(0)) */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x002d: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:46), block:B:46:0x002d */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.tencent.qcloud.core.http.HttpResult<T> executeHttpRequest(com.tencent.qcloud.core.http.HttpRequest<T> r6) throws com.tencent.qcloud.core.common.QCloudClientException, com.tencent.qcloud.core.common.QCloudServiceException {
        /*
            r5 = this;
            com.tencent.qcloud.core.http.ResponseBodyConverter r0 = r6.getResponseBodyConverter()
            boolean r0 = r0 instanceof com.tencent.qcloud.core.http.SelfCloseConverter
            r1 = 0
            java.lang.String r2 = r5.identifier     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1c
            r6.setOkHttpRequestTag(r2)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1c
            okhttp3.d0 r2 = r6.buildRealRequest()     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1c
            com.tencent.qcloud.core.http.interceptor.QCloudRetryInterceptor r3 = r5.mRetryInterceptor     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1c
            if (r3 == 0) goto L1f
            okhttp3.f0 r2 = r3.intercept(r5, r2)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1c
            goto L23
        L19:
            r6 = move-exception
            goto L85
        L1c:
            r6 = move-exception
            r2 = r1
            goto L48
        L1f:
            okhttp3.f0 r2 = r5.callHttpRequest(r2)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1c
        L23:
            if (r2 == 0) goto L31
            com.tencent.qcloud.core.http.HttpResult r6 = r5.convertResponse(r6, r2)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2f
            r3 = r6
            r6 = r1
            goto L3d
        L2c:
            r6 = move-exception
            r1 = r2
            goto L85
        L2f:
            r6 = move-exception
            goto L48
        L31:
            com.tencent.qcloud.core.common.QCloudServiceException r6 = new com.tencent.qcloud.core.common.QCloudServiceException     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2f
            java.lang.String r3 = "姞\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2f
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2f
            r3 = r1
        L3d:
            if (r2 == 0) goto L44
            if (r0 != 0) goto L44
            com.tencent.qcloud.core.util.OkhttpInternalUtils.closeQuietly(r2)
        L44:
            r5.disconnect()     // Catch: java.lang.Exception -> L7e
            goto L7e
        L48:
            java.lang.Throwable r3 = r6.getCause()     // Catch: java.lang.Throwable -> L2c
            boolean r3 = r3 instanceof com.tencent.qcloud.core.common.QCloudClientException     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto L58
            java.lang.Throwable r6 = r6.getCause()     // Catch: java.lang.Throwable -> L2c
            com.tencent.qcloud.core.common.QCloudClientException r6 = (com.tencent.qcloud.core.common.QCloudClientException) r6     // Catch: java.lang.Throwable -> L2c
        L56:
            r3 = r1
            goto L70
        L58:
            java.lang.Throwable r3 = r6.getCause()     // Catch: java.lang.Throwable -> L2c
            boolean r3 = r3 instanceof com.tencent.qcloud.core.common.QCloudServiceException     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto L69
            java.lang.Throwable r6 = r6.getCause()     // Catch: java.lang.Throwable -> L2c
            com.tencent.qcloud.core.common.QCloudServiceException r6 = (com.tencent.qcloud.core.common.QCloudServiceException) r6     // Catch: java.lang.Throwable -> L2c
            r3 = r6
            r6 = r1
            goto L70
        L69:
            com.tencent.qcloud.core.common.QCloudClientException r3 = new com.tencent.qcloud.core.common.QCloudClientException     // Catch: java.lang.Throwable -> L2c
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L2c
            r6 = r3
            goto L56
        L70:
            if (r2 == 0) goto L77
            if (r0 != 0) goto L77
            com.tencent.qcloud.core.util.OkhttpInternalUtils.closeQuietly(r2)
        L77:
            r5.disconnect()     // Catch: java.lang.Exception -> L7a
        L7a:
            r4 = r1
            r1 = r6
            r6 = r3
            r3 = r4
        L7e:
            if (r1 != 0) goto L84
            if (r6 != 0) goto L83
            return r3
        L83:
            throw r6
        L84:
            throw r1
        L85:
            if (r1 == 0) goto L8c
            if (r0 != 0) goto L8c
            com.tencent.qcloud.core.util.OkhttpInternalUtils.closeQuietly(r1)
        L8c:
            r5.disconnect()     // Catch: java.lang.Exception -> L8f
        L8f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qcloud.core.http.NetworkProxy.executeHttpRequest(com.tencent.qcloud.core.http.HttpRequest):com.tencent.qcloud.core.http.HttpResult");
    }

    public void setRetryInterceptor(QCloudRetryInterceptor qCloudRetryInterceptor) {
        this.mRetryInterceptor = qCloudRetryInterceptor;
    }
}
