package com.google.android.datatransport.runtime;

import android.content.Context;
import androidx.annotation.c1;
import androidx.annotation.m1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: TransportRuntime.java */
@h3.f
/* loaded from: classes3.dex */
public class x implements w {

    /* renamed from: e, reason: collision with root package name */
    private static volatile y f12768e;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f12769a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f12770b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.e f12771c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.s f12772d;

    @h3.a
    x(@com.google.android.datatransport.runtime.time.h com.google.android.datatransport.runtime.time.a aVar, @com.google.android.datatransport.runtime.time.b com.google.android.datatransport.runtime.time.a aVar2, com.google.android.datatransport.runtime.scheduling.e eVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.s sVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.w wVar) {
        this.f12769a = aVar;
        this.f12770b = aVar2;
        this.f12771c = eVar;
        this.f12772d = sVar;
        wVar.c();
    }

    private k b(r rVar) {
        return k.a().i(this.f12769a.a()).k(this.f12770b.a()).j(rVar.g()).h(new j(rVar.b(), rVar.d())).g(rVar.c().a()).d();
    }

    public static x c() {
        y yVar = f12768e;
        if (yVar != null) {
            return yVar.b();
        }
        throw new IllegalStateException(ProtectedSandApp.s("\u20fd"));
    }

    private static Set<com.google.android.datatransport.c> d(h hVar) {
        return hVar instanceof i ? Collections.unmodifiableSet(((i) hVar).a()) : Collections.singleton(com.google.android.datatransport.c.b(ProtectedSandApp.s("\u20fe")));
    }

    public static void f(Context context) {
        if (f12768e == null) {
            synchronized (x.class) {
                if (f12768e == null) {
                    f12768e = g.c().a(context).build();
                }
            }
        }
    }

    @c1({c1.a.TESTS})
    @m1
    static void i(y yVar, Callable<Void> callable) throws Throwable {
        y yVar2;
        synchronized (x.class) {
            yVar2 = f12768e;
            f12768e = yVar;
        }
        try {
            callable.call();
            synchronized (x.class) {
                f12768e = yVar2;
            }
        } catch (Throwable th) {
            synchronized (x.class) {
                f12768e = yVar2;
                throw th;
            }
        }
    }

    @Override // com.google.android.datatransport.runtime.w
    public void a(r rVar, com.google.android.datatransport.j jVar) {
        this.f12771c.a(rVar.f().f(rVar.c().c()), b(rVar), jVar);
    }

    @c1({c1.a.LIBRARY_GROUP})
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.s e() {
        return this.f12772d;
    }

    public com.google.android.datatransport.i g(h hVar) {
        return new t(d(hVar), s.a().b(hVar.getName()).c(hVar.getExtras()).a(), this);
    }

    @Deprecated
    public com.google.android.datatransport.i h(String str) {
        return new t(d(null), s.a().b(str).a(), this);
    }
}
