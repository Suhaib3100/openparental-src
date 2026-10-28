package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.r;
import com.google.firebase.platforminfo.h;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.1.2 */
@Keep
@KeepForSdk
/* loaded from: classes6.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    @o0
    @KeepForSdk
    public List<com.google.firebase.components.c<?>> getComponents() {
        return Arrays.asList(com.google.firebase.components.c.h(com.google.firebase.analytics.connector.a.class).b(r.m(com.google.firebase.g.class)).b(r.m(Context.class)).b(r.m(v9.d.class)).f(new c()).e().d(), h.b(ProtectedSandApp.s("\ufb19"), ProtectedSandApp.s("\ufb1a")));
    }
}
