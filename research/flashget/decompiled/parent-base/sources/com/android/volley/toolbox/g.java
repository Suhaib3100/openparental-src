package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.VolleyError;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: BasicNetwork.java */
/* loaded from: classes3.dex */
public class g implements com.android.volley.j {

    /* renamed from: d, reason: collision with root package name */
    private static final int f41004d = 4096;

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    protected final o f41005a;

    /* renamed from: b, reason: collision with root package name */
    private final e f41006b;

    /* renamed from: c, reason: collision with root package name */
    protected final h f41007c;

    @Deprecated
    public g(o oVar) {
        this(oVar, new h(4096));
    }

    @Deprecated
    protected static Map<String, String> b(com.android.volley.i[] iVarArr) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i4 = 0; i4 < iVarArr.length; i4++) {
            treeMap.put(iVarArr[i4].a(), iVarArr[i4].b());
        }
        return treeMap;
    }

    @Override // com.android.volley.j
    public com.android.volley.l a(com.android.volley.n<?> nVar) throws VolleyError {
        IOException iOException;
        n nVar2;
        byte[] bArr;
        n b5;
        int e4;
        List<com.android.volley.i> d5;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            try {
                b5 = this.f41006b.b(nVar, m.c(nVar.getCacheEntry()));
                try {
                    e4 = b5.e();
                    d5 = b5.d();
                    break;
                } catch (IOException e5) {
                    bArr = null;
                    nVar2 = b5;
                    iOException = e5;
                }
            } catch (IOException e6) {
                iOException = e6;
                nVar2 = null;
                bArr = null;
            }
            v.a(nVar, v.e(nVar, iOException, elapsedRealtime, nVar2, bArr));
        }
        if (e4 == 304) {
            return v.b(nVar, SystemClock.elapsedRealtime() - elapsedRealtime, d5);
        }
        InputStream a5 = b5.a();
        byte[] c5 = a5 != null ? v.c(a5, b5.c(), this.f41007c) : new byte[0];
        v.d(SystemClock.elapsedRealtime() - elapsedRealtime, nVar, c5, e4);
        if (e4 < 200 || e4 > 299) {
            throw new IOException();
        }
        return new com.android.volley.l(e4, c5, false, SystemClock.elapsedRealtime() - elapsedRealtime, d5);
    }

    @Deprecated
    public g(o oVar, h hVar) {
        this.f41005a = oVar;
        this.f41006b = new a(oVar);
        this.f41007c = hVar;
    }

    public g(e eVar) {
        this(eVar, new h(4096));
    }

    public g(e eVar, h hVar) {
        this.f41006b = eVar;
        this.f41005a = eVar;
        this.f41007c = hVar;
    }
}
