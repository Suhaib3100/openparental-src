package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.3.0 */
/* loaded from: classes3.dex */
final class f implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f15320a;

    public f(g gVar) {
        this.f15320a = gVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzhg
    public final void onEvent(String str, String str2, Bundle bundle, long j5) {
        a.b bVar;
        if (str == null || !c.c(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString(ProtectedSandApp.s("⟅"), str2);
        bundle2.putLong(ProtectedSandApp.s("⟆"), j5);
        bundle2.putBundle(ProtectedSandApp.s("⟇"), bundle);
        bVar = this.f15320a.f15321a;
        bVar.a(3, bundle2);
    }
}
