package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
final class zzkc extends zzke {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    /* synthetic */ zzkc(byte[] bArr, int i5, int i6, boolean z5, zzkb zzkbVar) {
        super(null);
        this.zze = Integer.MAX_VALUE;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i5) throws zzll {
        int i6 = this.zze;
        this.zze = 0;
        int i7 = this.zzc + this.zzd;
        this.zzc = i7;
        if (i7 > 0) {
            this.zzd = i7;
            this.zzc = i7 - i7;
        } else {
            this.zzd = 0;
        }
        return i6;
    }
}
