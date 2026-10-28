package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.r;
import com.google.firebase.platforminfo.h;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.3.0 */
@Keep
@KeepForSdk
/* loaded from: classes3.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    @o0
    @KeepForSdk
    public List<com.google.firebase.components.c<?>> getComponents() {
        return Arrays.asList(com.google.firebase.components.c.h(com.google.firebase.analytics.connector.a.class).b(r.m(com.google.firebase.g.class)).b(r.m(Context.class)).b(r.m(l2.d.class)).f(new com.google.firebase.components.g() { // from class: com.google.firebase.analytics.connector.internal.b
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                com.google.firebase.analytics.connector.a j5;
                j5 = com.google.firebase.analytics.connector.b.j((com.google.firebase.g) dVar.a(com.google.firebase.g.class), (Context) dVar.a(Context.class), (l2.d) dVar.a(l2.d.class));
                return j5;
            }
        }).e().d(), h.b(ProtectedSandApp.s("⟂"), ProtectedSandApp.s("⟃")));
    }
}
