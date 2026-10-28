package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.c;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

@Keep
/* loaded from: classes6.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = ProtectedSandApp.s("̴\u0001");

    /* JADX INFO: Access modifiers changed from: private */
    public static x lambda$getComponents$0(com.google.firebase.components.b0 b0Var, com.google.firebase.components.d dVar) {
        return new x((Context) dVar.a(Context.class), (ScheduledExecutorService) dVar.g(b0Var), (com.google.firebase.g) dVar.a(com.google.firebase.g.class), (com.google.firebase.installations.k) dVar.a(com.google.firebase.installations.k.class), ((com.google.firebase.abt.component.a) dVar.a(com.google.firebase.abt.component.a.class)).b(ProtectedSandApp.s("̳\u0001")), dVar.i(com.google.firebase.analytics.connector.a.class), true);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.c<?>> getComponents() {
        final com.google.firebase.components.b0 b0Var = new com.google.firebase.components.b0(l9.b.class, ScheduledExecutorService.class);
        c.b i4 = com.google.firebase.components.c.i(x.class, ia.a.class);
        String s4 = ProtectedSandApp.s("̴\u0001");
        return Arrays.asList(i4.h(s4).b(com.google.firebase.components.r.m(Context.class)).b(com.google.firebase.components.r.l(b0Var)).b(com.google.firebase.components.r.m(com.google.firebase.g.class)).b(com.google.firebase.components.r.m(com.google.firebase.installations.k.class)).b(com.google.firebase.components.r.m(com.google.firebase.abt.component.a.class)).b(com.google.firebase.components.r.k(com.google.firebase.analytics.connector.a.class)).f(new com.google.firebase.components.g() { // from class: com.google.firebase.remoteconfig.b0
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                x lambda$getComponents$0;
                lambda$getComponents$0 = RemoteConfigRegistrar.lambda$getComponents$0(com.google.firebase.components.b0.this, dVar);
                return lambda$getComponents$0;
            }
        }).e().d(), com.google.firebase.platforminfo.h.b(s4, ProtectedSandApp.s("̵\u0001")));
    }
}
