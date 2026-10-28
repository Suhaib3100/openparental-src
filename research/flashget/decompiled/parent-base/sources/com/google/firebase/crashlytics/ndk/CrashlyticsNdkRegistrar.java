package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.c;
import com.google.firebase.components.r;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public class CrashlyticsNdkRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    private static final String f59557a = ProtectedSandApp.s("\u0001\u0001");

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.firebase.crashlytics.internal.a b(com.google.firebase.components.d dVar) {
        return g.f((Context) dVar.a(Context.class), !com.google.firebase.crashlytics.internal.f.g(r2));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.c<?>> getComponents() {
        c.b h4 = com.google.firebase.components.c.h(com.google.firebase.crashlytics.internal.a.class);
        String s4 = ProtectedSandApp.s("\u0001\u0001");
        return Arrays.asList(h4.h(s4).b(r.m(Context.class)).f(new com.google.firebase.components.g() { // from class: com.google.firebase.crashlytics.ndk.b
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                com.google.firebase.crashlytics.internal.a b5;
                b5 = CrashlyticsNdkRegistrar.this.b(dVar);
                return b5;
            }
        }).e().d(), com.google.firebase.platforminfo.h.b(s4, ProtectedSandApp.s("\u0002\u0001")));
    }
}
