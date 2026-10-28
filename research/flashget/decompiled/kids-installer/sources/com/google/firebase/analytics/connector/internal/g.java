package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.a;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.3.0 */
/* loaded from: classes3.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    private final a.b f15321a;

    /* renamed from: b, reason: collision with root package name */
    private final AppMeasurementSdk f15322b;

    /* renamed from: c, reason: collision with root package name */
    private final f f15323c;

    public g(AppMeasurementSdk appMeasurementSdk, a.b bVar) {
        this.f15321a = bVar;
        this.f15322b = appMeasurementSdk;
        f fVar = new f(this);
        this.f15323c = fVar;
        appMeasurementSdk.registerOnMeasurementEventListener(fVar);
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final void a(Set set) {
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final a.b zza() {
        return this.f15321a;
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final void zzc() {
    }
}
