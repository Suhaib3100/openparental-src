package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
final class zzkq implements zzlt {
    private static final zzkz zza = new zzkp();
    private final zzkz zzb;

    public zzkq() {
        this(new zzkr(zzju.zza(), zza));
    }

    @Override // com.google.android.gms.internal.measurement.zzlt
    public final <T> zzlu<T> zza(Class<T> cls) {
        zzlw.zza((Class<?>) cls);
        zzla zza2 = this.zzb.zza(cls);
        if (zza2.zzc()) {
            return zzli.zza(zzlw.zza(), zzjj.zza(), zza2.zza());
        }
        return zzlg.zza(cls, zza2, zzlm.zza(), zzko.zza(), zzlw.zza(), zzks.zza[zza2.zzb().ordinal()] != 1 ? zzjj.zza() : null, zzkx.zza());
    }

    private zzkq(zzkz zzkzVar) {
        this.zzb = (zzkz) zzjv.zza(zzkzVar, ProtectedSandApp.s("픣"));
    }
}
