package com.google.firebase.crashlytics;

import android.os.Bundle;
import androidx.annotation.b0;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.analytics.connector.a;
import com.google.firebase.messaging.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o2.a;

/* compiled from: AnalyticsDeferredProxy.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final o2.a<com.google.firebase.analytics.connector.a> f15499a;

    /* renamed from: b, reason: collision with root package name */
    private volatile com.google.firebase.crashlytics.internal.analytics.a f15500b;

    /* renamed from: c, reason: collision with root package name */
    private volatile c2.b f15501c;

    /* renamed from: d, reason: collision with root package name */
    @b0("this")
    private final List<c2.a> f15502d;

    public d(o2.a<com.google.firebase.analytics.connector.a> aVar) {
        this(aVar, new c2.c(), new com.google.firebase.crashlytics.internal.analytics.f());
    }

    private void f() {
        this.f15499a.a(new a.InterfaceC0465a() { // from class: com.google.firebase.crashlytics.c
            @Override // o2.a.InterfaceC0465a
            public final void a(o2.b bVar) {
                d.this.i(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(String str, Bundle bundle) {
        this.f15500b.a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(c2.a aVar) {
        synchronized (this) {
            if (this.f15501c instanceof c2.c) {
                this.f15502d.add(aVar);
            }
            this.f15501c.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(o2.b bVar) {
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("Ꮌ"));
        com.google.firebase.analytics.connector.a aVar = (com.google.firebase.analytics.connector.a) bVar.get();
        com.google.firebase.crashlytics.internal.analytics.e eVar = new com.google.firebase.crashlytics.internal.analytics.e(aVar);
        f fVar = new f();
        if (j(aVar, fVar) == null) {
            com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("Ꮎ"));
            return;
        }
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("Ꮍ"));
        com.google.firebase.crashlytics.internal.analytics.d dVar = new com.google.firebase.crashlytics.internal.analytics.d();
        com.google.firebase.crashlytics.internal.analytics.c cVar = new com.google.firebase.crashlytics.internal.analytics.c(eVar, w0.f17634f, TimeUnit.MILLISECONDS);
        synchronized (this) {
            Iterator<c2.a> it = this.f15502d.iterator();
            while (it.hasNext()) {
                dVar.a(it.next());
            }
            fVar.d(dVar);
            fVar.e(cVar);
            this.f15501c = dVar;
            this.f15500b = cVar;
        }
    }

    @a2.a
    private static a.InterfaceC0192a j(@o0 com.google.firebase.analytics.connector.a aVar, @o0 f fVar) {
        a.InterfaceC0192a g5 = aVar.g(ProtectedSandApp.s("Ꮏ"), fVar);
        if (g5 == null) {
            com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("Ꮐ"));
            g5 = aVar.g(ProtectedSandApp.s("Ꮑ"), fVar);
            if (g5 != null) {
                com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("Ꮒ"));
            }
        }
        return g5;
    }

    public com.google.firebase.crashlytics.internal.analytics.a d() {
        return new b(this);
    }

    public c2.b e() {
        return new a(this);
    }

    public d(o2.a<com.google.firebase.analytics.connector.a> aVar, @o0 c2.b bVar, @o0 com.google.firebase.crashlytics.internal.analytics.a aVar2) {
        this.f15499a = aVar;
        this.f15501c = bVar;
        this.f15502d = new ArrayList();
        this.f15500b = aVar2;
        f();
    }
}
