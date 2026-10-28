package com.android.volley.toolbox;

import android.os.SystemClock;
import androidx.annotation.q0;
import com.android.volley.AuthFailureError;
import com.android.volley.ClientError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.e;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;

/* compiled from: NetworkUtility.java */
/* loaded from: classes3.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    private static final int f41074a = 3000;

    /* compiled from: NetworkUtility.java */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f41075a;

        /* renamed from: b, reason: collision with root package name */
        private final VolleyError f41076b;

        private b(String str, VolleyError volleyError) {
            this.f41075a = str;
            this.f41076b = volleyError;
        }
    }

    private v() {
    }

    static void a(com.android.volley.n<?> nVar, b bVar) throws VolleyError {
        com.android.volley.s retryPolicy = nVar.getRetryPolicy();
        int timeoutMs = nVar.getTimeoutMs();
        try {
            retryPolicy.b(bVar.f41076b);
            nVar.addMarker(String.format(ProtectedSandApp.s("۹"), bVar.f41075a, Integer.valueOf(timeoutMs)));
        } catch (VolleyError e4) {
            nVar.addMarker(String.format(ProtectedSandApp.s("ۺ"), bVar.f41075a, Integer.valueOf(timeoutMs)));
            throw e4;
        }
    }

    static com.android.volley.l b(com.android.volley.n<?> nVar, long j4, List<com.android.volley.i> list) {
        e.a cacheEntry = nVar.getCacheEntry();
        if (cacheEntry == null) {
            return new com.android.volley.l(304, (byte[]) null, true, j4, list);
        }
        return new com.android.volley.l(304, cacheEntry.f40862a, true, j4, m.a(list, cacheEntry));
    }

    static byte[] c(InputStream inputStream, int i4, h hVar) throws IOException {
        byte[] bArr;
        String s4 = ProtectedSandApp.s("ۻ");
        y yVar = new y(hVar, i4);
        try {
            bArr = hVar.a(1024);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    yVar.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            com.android.volley.t.f(s4, new Object[0]);
                        }
                    }
                    hVar.b(bArr);
                    yVar.close();
                    throw th;
                }
            }
            byte[] byteArray = yVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                com.android.volley.t.f(s4, new Object[0]);
            }
            hVar.b(bArr);
            yVar.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
        }
    }

    static void d(long j4, com.android.volley.n<?> nVar, byte[] bArr, int i4) {
        if (com.android.volley.t.f40943b || j4 > 3000) {
            com.android.volley.t.b(ProtectedSandApp.s("۽"), nVar, Long.valueOf(j4), bArr != null ? Integer.valueOf(bArr.length) : ProtectedSandApp.s("ۼ"), Integer.valueOf(i4), Integer.valueOf(nVar.getRetryPolicy().a()));
        }
    }

    static b e(com.android.volley.n<?> nVar, IOException iOException, long j4, @q0 n nVar2, @q0 byte[] bArr) throws VolleyError {
        if (iOException instanceof SocketTimeoutException) {
            return new b(ProtectedSandApp.s("۾"), new TimeoutError());
        }
        if (iOException instanceof MalformedURLException) {
            throw new RuntimeException(ProtectedSandApp.s("܄") + nVar.getUrl(), iOException);
        }
        if (nVar2 == null) {
            if (!nVar.shouldRetryConnectionErrors()) {
                throw new NoConnectionError(iOException);
            }
            return new b(ProtectedSandApp.s("܃"), new NoConnectionError());
        }
        int e4 = nVar2.e();
        com.android.volley.t.c(ProtectedSandApp.s("ۿ"), Integer.valueOf(e4), nVar.getUrl());
        if (bArr == null) {
            return new b(ProtectedSandApp.s("܂"), new NetworkError());
        }
        com.android.volley.l lVar = new com.android.volley.l(e4, bArr, false, SystemClock.elapsedRealtime() - j4, nVar2.d());
        if (e4 == 401 || e4 == 403) {
            return new b(ProtectedSandApp.s("܁"), new AuthFailureError(lVar));
        }
        if (e4 >= 400 && e4 <= 499) {
            throw new ClientError(lVar);
        }
        if (e4 < 500 || e4 > 599 || !nVar.shouldRetryServerErrors()) {
            throw new ServerError(lVar);
        }
        return new b(ProtectedSandApp.s("܀"), new ServerError(lVar));
    }
}
