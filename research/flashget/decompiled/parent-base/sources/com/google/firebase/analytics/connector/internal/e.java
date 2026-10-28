package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzji;
import com.google.firebase.analytics.connector.a;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.1.2 */
/* loaded from: classes6.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    Set<String> f58391a;

    /* renamed from: b, reason: collision with root package name */
    private a.b f58392b;

    /* renamed from: c, reason: collision with root package name */
    private AppMeasurementSdk f58393c;

    /* renamed from: d, reason: collision with root package name */
    private d f58394d;

    public e(AppMeasurementSdk appMeasurementSdk, a.b bVar) {
        this.f58392b = bVar;
        this.f58393c = appMeasurementSdk;
        d dVar = new d(this);
        this.f58394d = dVar;
        this.f58393c.registerOnMeasurementEventListener(dVar);
        this.f58391a = new HashSet();
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final void a(Set<String> set) {
        this.f58391a.clear();
        Set<String> set2 = this.f58391a;
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if (hashSet.size() >= 50) {
                break;
            }
            if (b.j(str) && b.k(str)) {
                String zzb = zzji.zzb(str);
                if (zzb != null) {
                    str = zzb;
                }
                Preconditions.checkNotNull(str);
                hashSet.add(str);
            }
        }
        set2.addAll(hashSet);
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final a.b zza() {
        return this.f58392b;
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final void zzb() {
        this.f58391a.clear();
    }
}
