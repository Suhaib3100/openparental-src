package com.google.firebase.crashlytics;

import android.os.Bundle;
import androidx.annotation.b0;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.analytics.connector.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import y9.a;

/* compiled from: AnalyticsDeferredProxy.java */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final y9.a<com.google.firebase.analytics.connector.a> f58582a;

    /* renamed from: b, reason: collision with root package name */
    private volatile com.google.firebase.crashlytics.internal.analytics.a f58583b;

    /* renamed from: c, reason: collision with root package name */
    private volatile m9.b f58584c;

    /* renamed from: d, reason: collision with root package name */
    @b0("this")
    private final List<m9.a> f58585d;

    public d(y9.a<com.google.firebase.analytics.connector.a> aVar) {
        this(aVar, new m9.c(), new com.google.firebase.crashlytics.internal.analytics.f());
    }

    private void f() {
        this.f58582a.a(new a.InterfaceC1408a() { // from class: com.google.firebase.crashlytics.c
            @Override // y9.a.InterfaceC1408a
            public final void a(y9.b bVar) {
                d.this.i(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(String str, Bundle bundle) {
        this.f58583b.a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(m9.a aVar) {
        synchronized (this) {
            try {
                if (this.f58584c instanceof m9.c) {
                    this.f58585d.add(aVar);
                }
                this.f58584c.a(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(y9.b bVar) {
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("﮳"));
        com.google.firebase.analytics.connector.a aVar = (com.google.firebase.analytics.connector.a) bVar.get();
        com.google.firebase.crashlytics.internal.analytics.e eVar = new com.google.firebase.crashlytics.internal.analytics.e(aVar);
        f fVar = new f();
        if (j(aVar, fVar) == null) {
            com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("﮵"));
            return;
        }
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("﮴"));
        com.google.firebase.crashlytics.internal.analytics.d dVar = new com.google.firebase.crashlytics.internal.analytics.d();
        com.google.firebase.crashlytics.internal.analytics.c cVar = new com.google.firebase.crashlytics.internal.analytics.c(eVar, 500, TimeUnit.MILLISECONDS);
        synchronized (this) {
            try {
                Iterator<m9.a> it = this.f58585d.iterator();
                while (it.hasNext()) {
                    dVar.a(it.next());
                }
                fVar.d(dVar);
                fVar.e(cVar);
                this.f58584c = dVar;
                this.f58583b = cVar;
            } finally {
            }
        }
    }

    @k9.a
    private static a.InterfaceC0895a j(@o0 com.google.firebase.analytics.connector.a aVar, @o0 f fVar) {
        a.InterfaceC0895a g4 = aVar.g(ProtectedSandApp.s("﮶"), fVar);
        if (g4 == null) {
            com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("﮷"));
            g4 = aVar.g(ProtectedSandApp.s("﮸"), fVar);
            if (g4 != null) {
                com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("﮹"));
            }
        }
        return g4;
    }

    public com.google.firebase.crashlytics.internal.analytics.a d() {
        return new b(this);
    }

    public m9.b e() {
        return new a(this);
    }

    public d(y9.a<com.google.firebase.analytics.connector.a> aVar, @o0 m9.b bVar, @o0 com.google.firebase.crashlytics.internal.analytics.a aVar2) {
        this.f58582a = aVar;
        this.f58584c = bVar;
        this.f58585d = new ArrayList();
        this.f58583b = aVar2;
        f();
    }
}
