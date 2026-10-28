package com.google.android.datatransport.runtime;

import android.content.Context;
import androidx.annotation.c1;
import androidx.annotation.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.runtime.g;
import com.google.android.datatransport.runtime.k;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: TransportRuntime.java */
@cd.f
/* loaded from: classes5.dex */
public class x implements w {

    /* renamed from: e, reason: collision with root package name */
    private static volatile y f52311e;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f52312a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f52313b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.e f52314c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.s f52315d;

    @cd.a
    x(@com.google.android.datatransport.runtime.time.h com.google.android.datatransport.runtime.time.a aVar, @com.google.android.datatransport.runtime.time.b com.google.android.datatransport.runtime.time.a aVar2, com.google.android.datatransport.runtime.scheduling.e eVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.s sVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.w wVar) {
        this.f52312a = aVar;
        this.f52313b = aVar2;
        this.f52314c = eVar;
        this.f52315d = sVar;
        wVar.c();
    }

    private k b(r rVar) {
        k.a g4 = k.a().i(this.f52312a.a()).o(this.f52313b.a()).n(rVar.g()).h(new j(rVar.b(), rVar.d())).g(rVar.c().a());
        if (rVar.c().e() != null && rVar.c().e().a() != null) {
            g4.l(rVar.c().e().a());
        }
        if (rVar.c().b() != null) {
            com.google.android.datatransport.g b5 = rVar.c().b();
            if (b5.d() != null) {
                g4.m(b5.d());
            }
            if (b5.b() != null) {
                g4.j(b5.b());
            }
            if (b5.c() != null) {
                g4.k(b5.c());
            }
        }
        return g4.d();
    }

    public static x c() {
        y yVar = f52311e;
        if (yVar != null) {
            return yVar.b();
        }
        throw new IllegalStateException(ProtectedSandApp.s("용"));
    }

    private static Set<com.google.android.datatransport.e> d(h hVar) {
        return hVar instanceof i ? Collections.unmodifiableSet(((i) hVar).a()) : Collections.singleton(com.google.android.datatransport.e.b(ProtectedSandApp.s("욪")));
    }

    public static void f(Context context) {
        if (f52311e == null) {
            synchronized (x.class) {
                try {
                    if (f52311e == null) {
                        f52311e = new g.b().b(context).a();
                    }
                } finally {
                }
            }
        }
    }

    @c1({c1.a.TESTS})
    @m1
    static void i(y yVar, Callable<Void> callable) throws Throwable {
        y yVar2;
        synchronized (x.class) {
            yVar2 = f52311e;
            f52311e = yVar;
        }
        try {
            callable.call();
            synchronized (x.class) {
                f52311e = yVar2;
            }
        } catch (Throwable th) {
            synchronized (x.class) {
                f52311e = yVar2;
                throw th;
            }
        }
    }

    @Override // com.google.android.datatransport.runtime.w
    public void a(r rVar, com.google.android.datatransport.n nVar) {
        this.f52314c.a(rVar.f().f(rVar.c().d()), b(rVar), nVar);
    }

    @c1({c1.a.LIBRARY_GROUP})
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.s e() {
        return this.f52315d;
    }

    public com.google.android.datatransport.m g(h hVar) {
        return new t(d(hVar), s.a().b(hVar.getName()).c(hVar.getExtras()).a(), this);
    }

    @Deprecated
    public com.google.android.datatransport.m h(String str) {
        return new t(d(null), s.a().b(str).a(), this);
    }
}
