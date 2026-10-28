package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.1.2 */
/* loaded from: classes6.dex */
final class d implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ e f58390a;

    public d(e eVar) {
        this.f58390a = eVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzjl
    public final void onEvent(String str, String str2, Bundle bundle, long j4) {
        a.b bVar;
        if (this.f58390a.f58391a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(ProtectedSandApp.s("ﭕ"), b.c(str2));
            bVar = this.f58390a.f58392b;
            bVar.a(2, bundle2);
        }
    }
}
