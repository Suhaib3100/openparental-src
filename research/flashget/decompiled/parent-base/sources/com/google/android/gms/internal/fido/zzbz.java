package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
final class zzbz extends zzbu {
    private final zzcc zza;

    zzbz(zzcc zzccVar, int i4) {
        super(zzccVar.size(), i4);
        this.zza = zzccVar;
    }

    @Override // com.google.android.gms.internal.fido.zzbu
    protected final Object zza(int i4) {
        return this.zza.get(i4);
    }
}
