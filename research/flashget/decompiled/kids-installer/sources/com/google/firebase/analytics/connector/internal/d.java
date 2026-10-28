package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzhc;
import com.google.firebase.analytics.connector.a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.3.0 */
/* loaded from: classes3.dex */
final class d implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f15315a;

    public d(e eVar) {
        this.f15315a = eVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzhg
    public final void onEvent(String str, String str2, Bundle bundle, long j5) {
        a.b bVar;
        if (this.f15315a.f15316a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            int i5 = c.f15314g;
            String zza = zzhc.zza(str2);
            if (zza != null) {
                str2 = zza;
            }
            bundle2.putString(ProtectedSandApp.s("⟄"), str2);
            bVar = this.f15315a.f15317b;
            bVar.a(2, bundle2);
        }
    }
}
