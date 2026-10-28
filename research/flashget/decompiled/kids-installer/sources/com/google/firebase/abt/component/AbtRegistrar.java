package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.c;
import com.google.firebase.components.d;
import com.google.firebase.components.g;
import com.google.firebase.components.r;
import com.google.firebase.platforminfo.h;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes3.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = ProtectedSandApp.s("➜");

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(d dVar) {
        return new a((Context) dVar.a(Context.class), dVar.c(com.google.firebase.analytics.connector.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        c.b h5 = c.h(a.class);
        String s5 = ProtectedSandApp.s("➚");
        return Arrays.asList(h5.h(s5).b(r.m(Context.class)).b(r.k(com.google.firebase.analytics.connector.a.class)).f(new g() { // from class: com.google.firebase.abt.component.b
            @Override // com.google.firebase.components.g
            public final Object a(d dVar) {
                a lambda$getComponents$0;
                lambda$getComponents$0 = AbtRegistrar.lambda$getComponents$0(dVar);
                return lambda$getComponents$0;
            }
        }).d(), h.b(s5, ProtectedSandApp.s("➛")));
    }
}
