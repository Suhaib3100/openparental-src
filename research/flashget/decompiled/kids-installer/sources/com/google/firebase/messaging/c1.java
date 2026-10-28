package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.n1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* compiled from: TopicsStore.java */
/* loaded from: classes2.dex */
final class c1 {

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.m1
    static final String f17133d = ProtectedSandApp.s("ᜰ");

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.m1
    static final String f17134e = ProtectedSandApp.s("ᜱ");

    /* renamed from: f, reason: collision with root package name */
    private static final String f17135f = ProtectedSandApp.s("ᜲ");

    /* renamed from: g, reason: collision with root package name */
    @androidx.annotation.b0("TopicsStore.class")
    private static WeakReference<c1> f17136g;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f17137a;

    /* renamed from: b, reason: collision with root package name */
    private y0 f17138b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f17139c;

    private c1(SharedPreferences sharedPreferences, Executor executor) {
        this.f17139c = executor;
        this.f17137a = sharedPreferences;
    }

    @androidx.annotation.m1
    static synchronized void b() {
        synchronized (c1.class) {
            WeakReference<c1> weakReference = f17136g;
            if (weakReference != null) {
                weakReference.clear();
            }
        }
    }

    @n1
    public static synchronized c1 d(Context context, Executor executor) {
        c1 c1Var;
        synchronized (c1.class) {
            WeakReference<c1> weakReference = f17136g;
            c1Var = weakReference != null ? weakReference.get() : null;
            if (c1Var == null) {
                c1Var = new c1(context.getSharedPreferences(ProtectedSandApp.s("ᜭ"), 0), executor);
                c1Var.g();
                f17136g = new WeakReference<>(c1Var);
            }
        }
        return c1Var;
    }

    @n1
    private synchronized void g() {
        this.f17138b = y0.j(this.f17137a, ProtectedSandApp.s("ᜮ"), ProtectedSandApp.s("ᜯ"), this.f17139c);
    }

    synchronized boolean a(b1 b1Var) {
        return this.f17138b.b(b1Var.e());
    }

    synchronized void c() {
        this.f17138b.g();
    }

    @androidx.annotation.q0
    synchronized b1 e() {
        return b1.a(this.f17138b.l());
    }

    @androidx.annotation.o0
    synchronized List<b1> f() {
        ArrayList arrayList;
        List<String> t5 = this.f17138b.t();
        arrayList = new ArrayList(t5.size());
        Iterator<String> it = t5.iterator();
        while (it.hasNext()) {
            arrayList.add(b1.a(it.next()));
        }
        return arrayList;
    }

    @androidx.annotation.q0
    synchronized b1 h() {
        try {
        } catch (NoSuchElementException unused) {
            return null;
        }
        return b1.a(this.f17138b.m());
    }

    synchronized boolean i(b1 b1Var) {
        return this.f17138b.n(b1Var.e());
    }
}
