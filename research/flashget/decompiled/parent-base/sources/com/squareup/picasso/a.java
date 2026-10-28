package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.w;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: Action.java */
/* loaded from: classes6.dex */
abstract class a<T> {

    /* renamed from: a, reason: collision with root package name */
    final w f70718a;

    /* renamed from: b, reason: collision with root package name */
    final b0 f70719b;

    /* renamed from: c, reason: collision with root package name */
    final WeakReference<T> f70720c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f70721d;

    /* renamed from: e, reason: collision with root package name */
    final int f70722e;

    /* renamed from: f, reason: collision with root package name */
    final int f70723f;

    /* renamed from: g, reason: collision with root package name */
    final int f70724g;

    /* renamed from: h, reason: collision with root package name */
    final Drawable f70725h;

    /* renamed from: i, reason: collision with root package name */
    final String f70726i;

    /* renamed from: j, reason: collision with root package name */
    final Object f70727j;

    /* renamed from: k, reason: collision with root package name */
    boolean f70728k;

    /* renamed from: l, reason: collision with root package name */
    boolean f70729l;

    /* compiled from: Action.java */
    /* renamed from: com.squareup.picasso.a$a, reason: collision with other inner class name */
    static class C0992a<M> extends WeakReference<M> {

        /* renamed from: a, reason: collision with root package name */
        final a f70730a;

        C0992a(a aVar, M m4, ReferenceQueue<? super M> referenceQueue) {
            super(m4, referenceQueue);
            this.f70730a = aVar;
        }
    }

    a(w wVar, T t4, b0 b0Var, int i4, int i5, int i6, Drawable drawable, String str, Object obj, boolean z4) {
        this.f70718a = wVar;
        this.f70719b = b0Var;
        this.f70720c = t4 == null ? null : new C0992a(this, t4, wVar.f70981k);
        this.f70722e = i4;
        this.f70723f = i5;
        this.f70721d = z4;
        this.f70724g = i6;
        this.f70725h = drawable;
        this.f70726i = str;
        this.f70727j = obj == null ? this : obj;
    }

    void a() {
        this.f70729l = true;
    }

    abstract void b(Bitmap bitmap, w.e eVar);

    abstract void c(Exception exc);

    String d() {
        return this.f70726i;
    }

    int e() {
        return this.f70722e;
    }

    int f() {
        return this.f70723f;
    }

    w g() {
        return this.f70718a;
    }

    w.f h() {
        return this.f70719b.f70766t;
    }

    b0 i() {
        return this.f70719b;
    }

    Object j() {
        return this.f70727j;
    }

    T k() {
        WeakReference<T> weakReference = this.f70720c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    boolean l() {
        return this.f70729l;
    }

    boolean m() {
        return this.f70728k;
    }
}
