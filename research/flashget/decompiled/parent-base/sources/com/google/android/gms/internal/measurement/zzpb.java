package com.google.android.gms.internal.measurement;

import bg.c;
import com.google.common.base.u0;
import com.google.common.base.v0;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzpb implements u0<zzpa> {
    private static zzpb zza = new zzpb();
    private final u0<zzpa> zzb = v0.d(new zzpd());

    @c
    public static boolean zza() {
        return ((zzpa) zza.get()).zza();
    }

    @c
    public static boolean zzb() {
        return ((zzpa) zza.get()).zzb();
    }

    @Override // com.google.common.base.u0
    public final /* synthetic */ zzpa get() {
        return this.zzb.get();
    }
}
