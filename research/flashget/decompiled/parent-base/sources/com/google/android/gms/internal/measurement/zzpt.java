package com.google.android.gms.internal.measurement;

import bg.c;
import com.google.common.base.u0;
import com.google.common.base.v0;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzpt implements u0<zzps> {
    private static zzpt zza = new zzpt();
    private final u0<zzps> zzb = v0.d(new zzpv());

    @c
    public static boolean zza() {
        return ((zzps) zza.get()).zza();
    }

    @c
    public static boolean zzb() {
        return ((zzps) zza.get()).zzb();
    }

    @Override // com.google.common.base.u0
    public final /* synthetic */ zzps get() {
        return this.zzb.get();
    }
}
