package com.google.firebase.analytics.ktx;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.c;
import com.google.firebase.platforminfo.h;
import d5.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.z;

/* compiled from: com.google.firebase:firebase-analytics-ktx@@21.3.0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/analytics/ktx/FirebaseAnalyticsKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "", "Lcom/google/firebase/components/c;", "getComponents", "<init>", "()V", "java.com.google.android.libraries.firebase.firebase_analytics_ktx_granule"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class FirebaseAnalyticsKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @d
    public final List<c<?>> getComponents() {
        List<c<?>> k5;
        k5 = z.k(h.b(ProtectedSandApp.s("⟈"), ProtectedSandApp.s("⟉")));
        return k5;
    }
}
