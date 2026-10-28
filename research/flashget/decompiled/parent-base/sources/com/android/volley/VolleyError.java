package com.android.volley;

/* loaded from: classes3.dex */
public class VolleyError extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final l f40811b;

    /* renamed from: c, reason: collision with root package name */
    private long f40812c;

    public VolleyError() {
        this.f40811b = null;
    }

    public long a() {
        return this.f40812c;
    }

    void b(long j4) {
        this.f40812c = j4;
    }

    public VolleyError(l lVar) {
        this.f40811b = lVar;
    }

    public VolleyError(String str) {
        super(str);
        this.f40811b = null;
    }

    public VolleyError(String str, Throwable th) {
        super(str, th);
        this.f40811b = null;
    }

    public VolleyError(Throwable th) {
        super(th);
        this.f40811b = null;
    }
}
