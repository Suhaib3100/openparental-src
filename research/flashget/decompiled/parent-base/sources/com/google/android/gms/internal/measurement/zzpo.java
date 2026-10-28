package com.google.android.gms.internal.measurement;

import bg.c;
import com.google.common.base.u0;
import com.google.common.base.v0;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzpo implements u0<zzpr> {
    private static zzpo zza = new zzpo();
    private final u0<zzpr> zzb = v0.d(new zzpq());

    @c
    public static boolean zza() {
        return ((zzpr) zza.get()).zza();
    }

    @c
    public static boolean zzb() {
        return ((zzpr) zza.get()).zzb();
    }

    @Override // com.google.common.base.u0
    public final /* synthetic */ zzpr get() {
        return this.zzb.get();
    }
}
