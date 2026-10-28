package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.b0;
import com.google.firebase.components.c;
import com.google.firebase.concurrent.z;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
/* loaded from: classes6.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = ProtectedSandApp.s("\u008c\u0001");

    /* JADX INFO: Access modifiers changed from: private */
    public static k lambda$getComponents$0(com.google.firebase.components.d dVar) {
        return new j((com.google.firebase.g) dVar.a(com.google.firebase.g.class), dVar.i(com.google.firebase.heartbeatinfo.j.class), (ExecutorService) dVar.g(new b0(l9.a.class, ExecutorService.class)), z.h((Executor) dVar.g(new b0(l9.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.c<?>> getComponents() {
        c.b h4 = com.google.firebase.components.c.h(k.class);
        String s4 = ProtectedSandApp.s("\u008c\u0001");
        return Arrays.asList(h4.h(s4).b(com.google.firebase.components.r.m(com.google.firebase.g.class)).b(com.google.firebase.components.r.k(com.google.firebase.heartbeatinfo.j.class)).b(com.google.firebase.components.r.l(new b0(l9.a.class, ExecutorService.class))).b(com.google.firebase.components.r.l(new b0(l9.b.class, Executor.class))).f(new l()).d(), com.google.firebase.heartbeatinfo.i.a(), com.google.firebase.platforminfo.h.b(s4, ProtectedSandApp.s("\u008d\u0001")));
    }
}
