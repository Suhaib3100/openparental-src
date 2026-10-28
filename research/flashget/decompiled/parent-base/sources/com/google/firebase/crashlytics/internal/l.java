package com.google.firebase.crashlytics.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.metadata.o;
import y9.a;

/* compiled from: RemoteConfigDeferredProxy.java */
/* loaded from: classes6.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final y9.a<ia.a> f58892a;

    public l(y9.a<ia.a> aVar) {
        this.f58892a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(e eVar, y9.b bVar) {
        ((ia.a) bVar.get()).a(ProtectedSandApp.s("ﳫ"), eVar);
        g.f().b(ProtectedSandApp.s("ﳬ"));
    }

    public void c(o oVar) {
        if (oVar == null) {
            g.f().m(ProtectedSandApp.s("ﳭ"));
        } else {
            final e eVar = new e(oVar);
            this.f58892a.a(new a.InterfaceC1408a() { // from class: com.google.firebase.crashlytics.internal.k
                @Override // y9.a.InterfaceC1408a
                public final void a(y9.b bVar) {
                    l.b(e.this, bVar);
                }
            });
        }
    }
}
