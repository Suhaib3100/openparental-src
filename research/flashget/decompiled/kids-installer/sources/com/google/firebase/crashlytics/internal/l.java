package com.google.firebase.crashlytics.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.metadata.n;
import o2.a;

/* compiled from: RemoteConfigDeferredProxy.java */
/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final o2.a<y2.a> f15790a;

    public l(o2.a<y2.a> aVar) {
        this.f15790a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(e eVar, o2.b bVar) {
        ((y2.a) bVar.get()).a(ProtectedSandApp.s("ᓉ"), eVar);
        g.f().b(ProtectedSandApp.s("ᓊ"));
    }

    public void c(n nVar) {
        if (nVar == null) {
            g.f().m(ProtectedSandApp.s("ᓋ"));
        } else {
            final e eVar = new e(nVar);
            this.f15790a.a(new a.InterfaceC0465a() { // from class: com.google.firebase.crashlytics.internal.k
                @Override // o2.a.InterfaceC0465a
                public final void a(o2.b bVar) {
                    l.b(e.this, bVar);
                }
            });
        }
    }
}
