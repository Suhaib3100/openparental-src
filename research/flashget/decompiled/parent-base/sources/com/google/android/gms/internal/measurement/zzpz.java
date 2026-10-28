package com.google.android.gms.internal.measurement;

import bg.c;
import com.google.common.base.u0;
import com.google.common.base.v0;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzpz implements u0<zzpy> {
    private static zzpz zza = new zzpz();
    private final u0<zzpy> zzb = v0.d(new zzqb());

    @c
    public static boolean zza() {
        return ((zzpy) zza.get()).zza();
    }

    @c
    public static boolean zzb() {
        return ((zzpy) zza.get()).zzb();
    }

    @Override // com.google.common.base.u0
    public final /* synthetic */ zzpy get() {
        return this.zzb.get();
    }
}
