package com.google.android.libraries.places.internal;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzacr extends zzact {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    /* synthetic */ zzacr(byte[] bArr, int i4, int i5, boolean z4, zzacq zzacqVar) {
        super(null);
        this.zze = Integer.MAX_VALUE;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i4) throws zzadu {
        int i5 = this.zze;
        this.zze = 0;
        int i6 = this.zzc + this.zzd;
        this.zzc = i6;
        if (i6 > 0) {
            this.zzd = i6;
            this.zzc = 0;
        } else {
            this.zzd = 0;
        }
        return i5;
    }
}
