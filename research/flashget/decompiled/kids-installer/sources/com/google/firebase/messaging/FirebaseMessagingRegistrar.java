package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.c;
import java.util.Arrays;
import java.util.List;

@Keep
@KeepForSdk
/* loaded from: classes3.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = ProtectedSandApp.s("⫔");

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(com.google.firebase.components.d dVar) {
        return new FirebaseMessaging((com.google.firebase.g) dVar.a(com.google.firebase.g.class), (n2.a) dVar.a(n2.a.class), dVar.c(com.google.firebase.platforminfo.i.class), dVar.c(com.google.firebase.heartbeatinfo.k.class), (com.google.firebase.installations.k) dVar.a(com.google.firebase.installations.k.class), (com.google.android.datatransport.i) dVar.a(com.google.android.datatransport.i.class), (l2.d) dVar.a(l2.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<com.google.firebase.components.c<?>> getComponents() {
        c.b h5 = com.google.firebase.components.c.h(FirebaseMessaging.class);
        String s5 = ProtectedSandApp.s("⫒");
        return Arrays.asList(h5.h(s5).b(com.google.firebase.components.r.m(com.google.firebase.g.class)).b(com.google.firebase.components.r.i(n2.a.class)).b(com.google.firebase.components.r.k(com.google.firebase.platforminfo.i.class)).b(com.google.firebase.components.r.k(com.google.firebase.heartbeatinfo.k.class)).b(com.google.firebase.components.r.i(com.google.android.datatransport.i.class)).b(com.google.firebase.components.r.m(com.google.firebase.installations.k.class)).b(com.google.firebase.components.r.m(l2.d.class)).f(new com.google.firebase.components.g() { // from class: com.google.firebase.messaging.d0
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                FirebaseMessaging lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(dVar);
                return lambda$getComponents$0;
            }
        }).c().d(), com.google.firebase.platforminfo.h.b(s5, ProtectedSandApp.s("⫓")));
    }
}
