package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.1.2 */
/* loaded from: classes6.dex */
final class f implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ g f58395a;

    public f(g gVar) {
        this.f58395a = gVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzjl
    public final void onEvent(String str, String str2, Bundle bundle, long j4) {
        a.b bVar;
        if (str == null || !b.l(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString(ProtectedSandApp.s("ﭖ"), str2);
        bundle2.putLong(ProtectedSandApp.s("ﭗ"), j4);
        bundle2.putBundle(ProtectedSandApp.s("ﭘ"), bundle);
        bVar = this.f58395a.f58396a;
        bVar.a(3, bundle2);
    }
}
