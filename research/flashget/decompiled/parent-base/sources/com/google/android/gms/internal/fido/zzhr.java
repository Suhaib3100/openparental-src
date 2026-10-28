package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public final class zzhr {
    private final byte zza;
    private final byte zzb;

    zzhr(int i4) {
        this.zza = (byte) (i4 & 224);
        this.zzb = (byte) (i4 & 31);
    }

    public final byte zza() {
        return this.zzb;
    }

    public final byte zzb() {
        return this.zza;
    }

    public final int zzc() {
        return (this.zza >> 5) & 7;
    }
}
