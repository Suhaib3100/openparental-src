package com.google.firebase.crashlytics;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.b0;
import com.google.firebase.components.c;
import com.google.firebase.components.r;
import com.google.firebase.sessions.api.b;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes6.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: c, reason: collision with root package name */
    private static final String f58572c = ProtectedSandApp.s("ﮥ");

    /* renamed from: a, reason: collision with root package name */
    private final b0<ExecutorService> f58573a = new b0<>(l9.a.class, ExecutorService.class);

    /* renamed from: b, reason: collision with root package name */
    private final b0<ExecutorService> f58574b = new b0<>(l9.b.class, ExecutorService.class);

    static {
        com.google.firebase.sessions.api.a.a(b.a.CRASHLYTICS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FirebaseCrashlytics b(com.google.firebase.components.d dVar) {
        com.google.firebase.crashlytics.internal.concurrency.k.g(false);
        long currentTimeMillis = System.currentTimeMillis();
        FirebaseCrashlytics b5 = FirebaseCrashlytics.b((com.google.firebase.g) dVar.a(com.google.firebase.g.class), (com.google.firebase.installations.k) dVar.a(com.google.firebase.installations.k.class), dVar.k(com.google.firebase.crashlytics.internal.a.class), dVar.k(com.google.firebase.analytics.connector.a.class), dVar.k(ia.a.class), (ExecutorService) dVar.g(this.f58573a), (ExecutorService) dVar.g(this.f58574b));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 16) {
            com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﮦ") + currentTimeMillis2 + ProtectedSandApp.s("ﮧ"));
        }
        return b5;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.c<?>> getComponents() {
        c.b h4 = com.google.firebase.components.c.h(FirebaseCrashlytics.class);
        String s4 = ProtectedSandApp.s("ﮥ");
        return Arrays.asList(h4.h(s4).b(r.m(com.google.firebase.g.class)).b(r.m(com.google.firebase.installations.k.class)).b(r.l(this.f58573a)).b(r.l(this.f58574b)).b(r.b(com.google.firebase.crashlytics.internal.a.class)).b(r.b(com.google.firebase.analytics.connector.a.class)).b(r.b(ia.a.class)).f(new com.google.firebase.components.g() { // from class: com.google.firebase.crashlytics.g
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                FirebaseCrashlytics b5;
                b5 = CrashlyticsRegistrar.this.b(dVar);
                return b5;
            }
        }).e().d(), com.google.firebase.platforminfo.h.b(s4, ProtectedSandApp.s("ﮨ")));
    }
}
