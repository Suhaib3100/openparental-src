package com.google.firebase.crashlytics;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.c;
import com.google.firebase.components.r;
import com.google.firebase.sessions.api.b;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    private static final String f15495a = ProtectedSandApp.s("⟠");

    static {
        com.google.firebase.sessions.api.a.f18518a.a(b.a.CRASHLYTICS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public i b(com.google.firebase.components.d dVar) {
        return i.e((com.google.firebase.g) dVar.a(com.google.firebase.g.class), (com.google.firebase.installations.k) dVar.a(com.google.firebase.installations.k.class), dVar.k(com.google.firebase.crashlytics.internal.a.class), dVar.k(com.google.firebase.analytics.connector.a.class), dVar.k(y2.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.c<?>> getComponents() {
        c.b h5 = com.google.firebase.components.c.h(i.class);
        String s5 = ProtectedSandApp.s("⟡");
        return Arrays.asList(h5.h(s5).b(r.m(com.google.firebase.g.class)).b(r.m(com.google.firebase.installations.k.class)).b(r.b(com.google.firebase.crashlytics.internal.a.class)).b(r.b(com.google.firebase.analytics.connector.a.class)).b(r.b(y2.a.class)).f(new com.google.firebase.components.g() { // from class: com.google.firebase.crashlytics.g
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                i b6;
                b6 = CrashlyticsRegistrar.this.b(dVar);
                return b6;
            }
        }).e().d(), com.google.firebase.platforminfo.h.b(s5, ProtectedSandApp.s("⟢")));
    }
}
