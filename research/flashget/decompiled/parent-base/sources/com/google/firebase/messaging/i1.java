package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* compiled from: TopicsStore.java */
/* loaded from: classes6.dex */
final class i1 {

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.m1
    static final String f60154d = ProtectedSandApp.s("Ɍ\u0001");

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.m1
    static final String f60155e = ProtectedSandApp.s("ɍ\u0001");

    /* renamed from: f, reason: collision with root package name */
    private static final String f60156f = ProtectedSandApp.s("Ɏ\u0001");

    /* renamed from: g, reason: collision with root package name */
    @androidx.annotation.b0("TopicsStore.class")
    private static WeakReference<i1> f60157g;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f60158a;

    /* renamed from: b, reason: collision with root package name */
    private e1 f60159b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f60160c;

    private i1(SharedPreferences sharedPreferences, Executor executor) {
        this.f60160c = executor;
        this.f60158a = sharedPreferences;
    }

    @androidx.annotation.m1
    static synchronized void b() {
        synchronized (i1.class) {
            WeakReference<i1> weakReference = f60157g;
            if (weakReference != null) {
                weakReference.clear();
            }
        }
    }

    @androidx.annotation.n1
    public static synchronized i1 d(Context context, Executor executor) {
        i1 i1Var;
        synchronized (i1.class) {
            try {
                WeakReference<i1> weakReference = f60157g;
                i1Var = weakReference != null ? weakReference.get() : null;
                if (i1Var == null) {
                    i1Var = new i1(context.getSharedPreferences(ProtectedSandApp.s("Ɍ\u0001"), 0), executor);
                    i1Var.g();
                    f60157g = new WeakReference<>(i1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i1Var;
    }

    @androidx.annotation.n1
    private synchronized void g() {
        this.f60159b = e1.j(this.f60158a, ProtectedSandApp.s("ɍ\u0001"), ProtectedSandApp.s("Ɏ\u0001"), this.f60160c);
    }

    synchronized boolean a(h1 h1Var) {
        return this.f60159b.b(h1Var.e());
    }

    synchronized void c() {
        this.f60159b.g();
    }

    @androidx.annotation.q0
    synchronized h1 e() {
        return h1.a(this.f60159b.l());
    }

    @androidx.annotation.o0
    synchronized List<h1> f() {
        ArrayList arrayList;
        List<String> t4 = this.f60159b.t();
        arrayList = new ArrayList(t4.size());
        Iterator<String> it = t4.iterator();
        while (it.hasNext()) {
            arrayList.add(h1.a(it.next()));
        }
        return arrayList;
    }

    @androidx.annotation.q0
    synchronized h1 h() {
        try {
        } catch (NoSuchElementException unused) {
            return null;
        }
        return h1.a(this.f60159b.m());
    }

    synchronized boolean i(h1 h1Var) {
        return this.f60159b.n(h1Var.e());
    }
}
