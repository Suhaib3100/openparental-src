package com.android.volley;

/* compiled from: RequestTask.java */
/* loaded from: classes3.dex */
public abstract class p<T> implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final n<T> f40937b;

    public p(n<T> nVar) {
        this.f40937b = nVar;
    }

    public int a(p<?> pVar) {
        return this.f40937b.compareTo((n) pVar.f40937b);
    }
}
