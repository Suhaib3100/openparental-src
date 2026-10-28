package com.android.volley.toolbox;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.n;

/* compiled from: ClearCacheRequest.java */
/* loaded from: classes3.dex */
public class i extends com.android.volley.n<Object> {

    /* renamed from: b, reason: collision with root package name */
    private final com.android.volley.e f41013b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f41014c;

    public i(com.android.volley.e eVar, Runnable runnable) {
        super(0, null, null);
        this.f41013b = eVar;
        this.f41014c = runnable;
    }

    @Override // com.android.volley.n
    protected void deliverResponse(Object obj) {
    }

    @Override // com.android.volley.n
    public n.d getPriority() {
        return n.d.IMMEDIATE;
    }

    @Override // com.android.volley.n
    public boolean isCanceled() {
        this.f41013b.clear();
        if (this.f41014c == null) {
            return true;
        }
        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(this.f41014c);
        return true;
    }

    @Override // com.android.volley.n
    protected com.android.volley.q<Object> parseNetworkResponse(com.android.volley.l lVar) {
        return null;
    }
}
