package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.a;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.1.2 */
/* loaded from: classes6.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    private a.b f58396a;

    /* renamed from: b, reason: collision with root package name */
    private AppMeasurementSdk f58397b;

    /* renamed from: c, reason: collision with root package name */
    private f f58398c;

    public g(AppMeasurementSdk appMeasurementSdk, a.b bVar) {
        this.f58396a = bVar;
        this.f58397b = appMeasurementSdk;
        f fVar = new f(this);
        this.f58398c = fVar;
        this.f58397b.registerOnMeasurementEventListener(fVar);
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final void a(Set<String> set) {
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final a.b zza() {
        return this.f58396a;
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final void zzb() {
    }
}
