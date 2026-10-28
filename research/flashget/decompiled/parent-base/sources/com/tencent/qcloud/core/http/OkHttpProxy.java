package com.tencent.qcloud.core.http;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.util.List;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.e;
import okhttp3.f0;

/* loaded from: classes7.dex */
public class OkHttpProxy<T> extends NetworkProxy<T> {
    private Field eventListenerFiled;
    private e httpCall;
    private b0 okHttpClient;

    public OkHttpProxy(b0 b0Var) {
        this.okHttpClient = b0Var;
    }

    private boolean isCosResponse(f0 f0Var) {
        if (f0Var != null) {
            if (ProtectedSandApp.s("姽\u0001").equalsIgnoreCase(f0.C(f0Var, ProtectedSandApp.s("姼\u0001"), null, 2, null))) {
                return true;
            }
        }
        return false;
    }

    private void recordDns(String str, CallMetricsListener callMetricsListener) {
        List<InetAddress> dumpDns;
        if (callMetricsListener == null || (dumpDns = callMetricsListener.dumpDns()) == null) {
            return;
        }
        ConnectionRepository.getInstance().insertDnsRecordCache(str, dumpDns);
    }

    @Override // com.tencent.qcloud.core.http.NetworkProxy
    public f0 callHttpRequest(d0 d0Var) throws IOException {
        return null;
    }

    @Override // com.tencent.qcloud.core.http.NetworkProxy
    public void cancel() {
        e eVar = this.httpCall;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0051: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:78), block:B:44:0x0051 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[Catch: all -> 0x0050, IOException -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:22:0x004a, B:9:0x0058, B:19:0x005f, B:25:0x0073, B:27:0x007b, B:33:0x0083, B:35:0x008b, B:36:0x0094), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0058 A[Catch: all -> 0x0050, IOException -> 0x0054, TryCatch #0 {all -> 0x0050, blocks: (B:22:0x004a, B:9:0x0058, B:19:0x005f, B:25:0x0073, B:27:0x007b, B:33:0x0083, B:35:0x008b, B:36:0x0094), top: B:2:0x0007 }] */
    @Override // com.tencent.qcloud.core.http.NetworkProxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.tencent.qcloud.core.http.HttpResult<T> executeHttpRequest(com.tencent.qcloud.core.http.HttpRequest<T> r7) throws com.tencent.qcloud.core.common.QCloudClientException, com.tencent.qcloud.core.common.QCloudServiceException {
        /*
            r6 = this;
            com.tencent.qcloud.core.http.ResponseBodyConverter r0 = r7.getResponseBodyConverter()
            boolean r0 = r0 instanceof com.tencent.qcloud.core.http.SelfCloseConverter
            r1 = 0
            java.lang.String r2 = r6.identifier     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            r7.setOkHttpRequestTag(r2)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            okhttp3.d0 r2 = r7.buildRealRequest()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            okhttp3.b0 r3 = r6.okHttpClient     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            okhttp3.e r2 = r3.b(r2)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            r6.httpCall = r2     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            java.lang.reflect.Field r3 = r6.eventListenerFiled     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            if (r3 != 0) goto L41
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e java.lang.Throwable -> L41
            java.lang.String r3 = "姾\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e java.lang.Throwable -> L41
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e java.lang.Throwable -> L41
            r6.eventListenerFiled = r2     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e java.lang.Throwable -> L41
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e java.lang.Throwable -> L41
            java.lang.reflect.Field r2 = r6.eventListenerFiled     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e java.lang.Throwable -> L41
            okhttp3.e r3 = r6.httpCall     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e java.lang.Throwable -> L41
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e java.lang.Throwable -> L41
            com.tencent.qcloud.core.http.CallMetricsListener r2 = (com.tencent.qcloud.core.http.CallMetricsListener) r2     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e java.lang.Throwable -> L41
            goto L42
        L3b:
            r7 = move-exception
            goto Lad
        L3e:
            r7 = move-exception
            r3 = r1
            goto L73
        L41:
            r2 = r1
        L42:
            okhttp3.e r3 = r6.httpCall     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            okhttp3.f0 r3 = r3.j()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3e
            if (r2 == 0) goto L56
            com.tencent.qcloud.core.http.HttpTaskMetrics r4 = r6.metrics     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L54
            r2.dumpMetrics(r4)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L54
            goto L56
        L50:
            r7 = move-exception
            r1 = r3
            goto Lad
        L54:
            r7 = move-exception
            goto L73
        L56:
            if (r3 == 0) goto L5f
            com.tencent.qcloud.core.http.HttpResult r7 = r6.convertResponse(r7, r3)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L54
            r2 = r7
            r7 = r1
            goto L6b
        L5f:
            com.tencent.qcloud.core.common.QCloudServiceException r7 = new com.tencent.qcloud.core.common.QCloudServiceException     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L54
            java.lang.String r2 = "姿\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L54
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L54
            r2 = r1
        L6b:
            if (r3 == 0) goto La6
            if (r0 != 0) goto La6
            com.tencent.qcloud.core.util.OkhttpInternalUtils.closeQuietly(r3)
            goto La6
        L73:
            java.lang.Throwable r2 = r7.getCause()     // Catch: java.lang.Throwable -> L50
            boolean r2 = r2 instanceof com.tencent.qcloud.core.common.QCloudClientException     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L83
            java.lang.Throwable r7 = r7.getCause()     // Catch: java.lang.Throwable -> L50
            com.tencent.qcloud.core.common.QCloudClientException r7 = (com.tencent.qcloud.core.common.QCloudClientException) r7     // Catch: java.lang.Throwable -> L50
        L81:
            r2 = r1
            goto L9b
        L83:
            java.lang.Throwable r2 = r7.getCause()     // Catch: java.lang.Throwable -> L50
            boolean r2 = r2 instanceof com.tencent.qcloud.core.common.QCloudServiceException     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L94
            java.lang.Throwable r7 = r7.getCause()     // Catch: java.lang.Throwable -> L50
            com.tencent.qcloud.core.common.QCloudServiceException r7 = (com.tencent.qcloud.core.common.QCloudServiceException) r7     // Catch: java.lang.Throwable -> L50
            r2 = r7
            r7 = r1
            goto L9b
        L94:
            com.tencent.qcloud.core.common.QCloudClientException r2 = new com.tencent.qcloud.core.common.QCloudClientException     // Catch: java.lang.Throwable -> L50
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L50
            r7 = r2
            goto L81
        L9b:
            if (r3 == 0) goto La2
            if (r0 != 0) goto La2
            com.tencent.qcloud.core.util.OkhttpInternalUtils.closeQuietly(r3)
        La2:
            r5 = r1
            r1 = r7
            r7 = r2
            r2 = r5
        La6:
            if (r1 != 0) goto Lac
            if (r7 != 0) goto Lab
            return r2
        Lab:
            throw r7
        Lac:
            throw r1
        Lad:
            if (r1 == 0) goto Lb4
            if (r0 != 0) goto Lb4
            com.tencent.qcloud.core.util.OkhttpInternalUtils.closeQuietly(r1)
        Lb4:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qcloud.core.http.OkHttpProxy.executeHttpRequest(com.tencent.qcloud.core.http.HttpRequest):com.tencent.qcloud.core.http.HttpResult");
    }
}
