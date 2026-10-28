package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.b0;
import com.google.firebase.components.c;
import com.google.firebase.concurrent.z;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
/* loaded from: classes3.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = ProtectedSandApp.s("⪕");

    /* JADX INFO: Access modifiers changed from: private */
    public static k lambda$getComponents$0(com.google.firebase.components.d dVar) {
        return new j((com.google.firebase.g) dVar.a(com.google.firebase.g.class), dVar.c(com.google.firebase.heartbeatinfo.j.class), (ExecutorService) dVar.h(new b0(b2.a.class, ExecutorService.class)), z.h((Executor) dVar.h(new b0(b2.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.c<?>> getComponents() {
        c.b h5 = com.google.firebase.components.c.h(k.class);
        String s5 = ProtectedSandApp.s("⪓");
        return Arrays.asList(h5.h(s5).b(com.google.firebase.components.r.m(com.google.firebase.g.class)).b(com.google.firebase.components.r.k(com.google.firebase.heartbeatinfo.j.class)).b(com.google.firebase.components.r.l(new b0(b2.a.class, ExecutorService.class))).b(com.google.firebase.components.r.l(new b0(b2.b.class, Executor.class))).f(new com.google.firebase.components.g() { // from class: com.google.firebase.installations.l
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                k lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(dVar);
                return lambda$getComponents$0;
            }
        }).d(), com.google.firebase.heartbeatinfo.i.a(), com.google.firebase.platforminfo.h.b(s5, ProtectedSandApp.s("⪔")));
    }
}
