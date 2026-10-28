package com.tencent.beacon.base.net.adapter;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.base.net.BResponse;
import com.tencent.beacon.base.net.call.Callback;
import com.tencent.beacon.base.net.call.HttpRequestEntity;
import com.tencent.beacon.base.net.call.JceRequestEntity;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.apache.log4j.Priority;

/* compiled from: HttpAdapter.java */
/* loaded from: classes6.dex */
public class b extends AbstractNetAdapter {
    private BResponse a(String str, String str2, Map<String, String> map, byte[] bArr) throws IOException {
        HttpURLConnection a5 = a(str, str2, map);
        a5.connect();
        OutputStream outputStream = a5.getOutputStream();
        if (outputStream != null && bArr != null) {
            outputStream.write(bArr);
            outputStream.close();
        }
        return new BResponse(a5.getHeaderFields(), a5.getResponseCode(), a5.getResponseMessage(), a(a5.getInputStream()));
    }

    private byte[] buildBody(HttpRequestEntity httpRequestEntity) throws UnsupportedEncodingException {
        int i4 = a.f71145a[httpRequestEntity.bodyType().ordinal()];
        if (i4 == 1) {
            return httpRequestEntity.content();
        }
        String s4 = ProtectedSandApp.s("モ\u0001");
        if (i4 == 2) {
            return com.tencent.beacon.base.net.b.d.b(httpRequestEntity.formParams()).getBytes(s4);
        }
        if (i4 != 3) {
            return null;
        }
        return httpRequestEntity.json().getBytes(s4);
    }

    @Override // com.tencent.beacon.base.net.adapter.AbstractNetAdapter
    public void request(JceRequestEntity jceRequestEntity, Callback<byte[]> callback) {
        String s4 = ProtectedSandApp.s("ャ\u0001");
        String s5 = ProtectedSandApp.s("ラ\u0001");
        String name = jceRequestEntity.getType().name();
        try {
            byte[] content = jceRequestEntity.getContent();
            if (content != null && content.length >= 65535) {
                callback.onFailure(new com.tencent.beacon.base.net.d(jceRequestEntity.getType().toString(), ProtectedSandApp.s("リ\u0001"), -1, s5 + content.length));
                return;
            }
            BResponse a5 = a(jceRequestEntity.getUrl(), ProtectedSandApp.s("ル\u0001"), jceRequestEntity.getHeader(), content);
            int i4 = a5.code;
            if (i4 == 200) {
                com.tencent.beacon.base.net.b.d.a(a5.headers);
                callback.onResponse(a5.body);
            } else {
                callback.onFailure(new com.tencent.beacon.base.net.d(name, ProtectedSandApp.s("ヤ\u0001"), i4, s4 + a5.msg));
            }
        } catch (ConnectException e4) {
            com.tencent.beacon.base.util.c.a(e4);
            callback.onFailure(new com.tencent.beacon.base.net.d(name, ProtectedSandApp.s("ヨ\u0001"), -1, ProtectedSandApp.s("ョ\u0001") + e4.getMessage(), e4));
        } catch (Throwable th) {
            com.tencent.beacon.base.util.c.a(th);
            callback.onFailure(new com.tencent.beacon.base.net.d(name, ProtectedSandApp.s("ユ\u0001"), -1, androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("ュ\u0001"))), th));
        }
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arrayPutListener(TypeUpdate.java:609)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0019: MOVE (r7 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:23:0x0019 */
    private byte[] a(java.io.InputStream r9) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 1
            r1 = 2
            r2 = 0
            r3 = 0
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38
            r4.<init>()     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38
            r3 = 2048(0x800, float:2.87E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1d
        Ld:
            int r5 = r9.read(r3)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1d
            r6 = -1
            if (r5 == r6) goto L1f
            r4.write(r3, r2, r5)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1d
            goto Ld
        L18:
            r3 = move-exception
            r7 = r4
            r4 = r3
            r3 = r7
            goto L49
        L1d:
            r3 = move-exception
            goto L3c
        L1f:
            r4.flush()     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1d
            byte[] r3 = r4.toByteArray()     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1d
            r4.close()     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1d
            r9.close()     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1d
            java.io.Closeable[] r1 = new java.io.Closeable[r1]
            r1[r2] = r9
            r1[r0] = r4
            com.tencent.beacon.base.util.b.a(r1)
            return r3
        L36:
            r4 = move-exception
            goto L49
        L38:
            r4 = move-exception
            r7 = r4
            r4 = r3
            r3 = r7
        L3c:
            com.tencent.beacon.base.util.c.a(r3)     // Catch: java.lang.Throwable -> L18
            java.io.Closeable[] r1 = new java.io.Closeable[r1]
            r1[r2] = r9
            r1[r0] = r4
            com.tencent.beacon.base.util.b.a(r1)
            throw r3
        L49:
            java.io.Closeable[] r1 = new java.io.Closeable[r1]
            r1[r2] = r9
            r1[r0] = r3
            com.tencent.beacon.base.util.b.a(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.base.net.adapter.b.a(java.io.InputStream):byte[]");
    }

    @Override // com.tencent.beacon.base.net.adapter.AbstractNetAdapter
    public void request(HttpRequestEntity httpRequestEntity, Callback<BResponse> callback) {
        String s4 = ProtectedSandApp.s("ャ\u0001");
        String tag = httpRequestEntity.tag();
        try {
            BResponse a5 = a(httpRequestEntity.url(), httpRequestEntity.method().name(), httpRequestEntity.headers(), buildBody(httpRequestEntity));
            int i4 = a5.code;
            if (i4 != 200) {
                callback.onFailure(new com.tencent.beacon.base.net.d(tag, ProtectedSandApp.s("ヤ\u0001"), i4, s4 + a5.msg));
            } else {
                callback.onResponse(a5);
            }
        } catch (ConnectException e4) {
            com.tencent.beacon.base.util.c.a(e4);
            callback.onFailure(new com.tencent.beacon.base.net.d(tag, ProtectedSandApp.s("ヨ\u0001"), -1, ProtectedSandApp.s("ョ\u0001") + e4.getMessage(), e4));
        } catch (Throwable th) {
            com.tencent.beacon.base.util.c.a(th);
            callback.onFailure(new com.tencent.beacon.base.net.d(tag, ProtectedSandApp.s("ユ\u0001"), -1, androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("ュ\u0001"))), th));
        }
    }

    private HttpURLConnection a(String str, String str2, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(Priority.WARN_INT);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        return httpURLConnection;
    }
}
