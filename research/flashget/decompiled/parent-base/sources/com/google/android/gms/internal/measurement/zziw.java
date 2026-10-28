package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
public abstract class zziw {
    private static volatile int zzd = 100;
    int zza;
    int zzb;
    zzjb zzc;

    public static int zza(int i4) {
        return (-(i4 & 1)) ^ (i4 >>> 1);
    }

    public abstract double zza() throws IOException;

    public abstract float zzb() throws IOException;

    public abstract int zzb(int i4) throws zzkb;

    public abstract int zzc();

    public abstract void zzc(int i4) throws zzkb;

    public abstract int zzd() throws IOException;

    public abstract void zzd(int i4);

    public abstract int zze() throws IOException;

    public abstract boolean zze(int i4) throws IOException;

    public abstract int zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract int zzi() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract long zzk() throws IOException;

    public abstract long zzl() throws IOException;

    abstract long zzm() throws IOException;

    public abstract long zzn() throws IOException;

    public abstract long zzo() throws IOException;

    public abstract long zzp() throws IOException;

    public abstract zzik zzq() throws IOException;

    public abstract String zzr() throws IOException;

    public abstract String zzs() throws IOException;

    public abstract boolean zzt() throws IOException;

    public abstract boolean zzu() throws IOException;

    private zziw() {
        this.zzb = zzd;
    }

    public static long zza(long j4) {
        return (-(j4 & 1)) ^ (j4 >>> 1);
    }

    static zziw zza(byte[] bArr, int i4, int i5, boolean z4) {
        zziz zzizVar = new zziz(bArr, i5);
        try {
            zzizVar.zzb(i5);
            return zzizVar;
        } catch (zzkb e4) {
            throw new IllegalArgumentException(e4);
        }
    }
}
