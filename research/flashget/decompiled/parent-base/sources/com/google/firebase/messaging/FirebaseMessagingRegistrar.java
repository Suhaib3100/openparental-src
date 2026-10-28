package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.c;
import java.util.Arrays;
import java.util.List;

@Keep
@KeepForSdk
/* loaded from: classes6.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = ProtectedSandApp.s("ŕ\u0001");

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(com.google.firebase.components.b0 b0Var, com.google.firebase.components.d dVar) {
        return new FirebaseMessaging((com.google.firebase.g) dVar.a(com.google.firebase.g.class), (x9.a) dVar.a(x9.a.class), dVar.i(com.google.firebase.platforminfo.i.class), dVar.i(com.google.firebase.heartbeatinfo.k.class), (com.google.firebase.installations.k) dVar.a(com.google.firebase.installations.k.class), dVar.b(b0Var), (v9.d) dVar.a(v9.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<com.google.firebase.components.c<?>> getComponents() {
        final com.google.firebase.components.b0 b0Var = new com.google.firebase.components.b0(q9.d.class, com.google.android.datatransport.m.class);
        c.b h4 = com.google.firebase.components.c.h(FirebaseMessaging.class);
        String s4 = ProtectedSandApp.s("ŕ\u0001");
        return Arrays.asList(h4.h(s4).b(com.google.firebase.components.r.m(com.google.firebase.g.class)).b(com.google.firebase.components.r.i(x9.a.class)).b(com.google.firebase.components.r.k(com.google.firebase.platforminfo.i.class)).b(com.google.firebase.components.r.k(com.google.firebase.heartbeatinfo.k.class)).b(com.google.firebase.components.r.m(com.google.firebase.installations.k.class)).b(com.google.firebase.components.r.j(b0Var)).b(com.google.firebase.components.r.m(v9.d.class)).f(new com.google.firebase.components.g() { // from class: com.google.firebase.messaging.h0
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                FirebaseMessaging lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(com.google.firebase.components.b0.this, dVar);
                return lambda$getComponents$0;
            }
        }).c().d(), com.google.firebase.platforminfo.h.b(s4, ProtectedSandApp.s("Ŗ\u0001")));
    }
}
