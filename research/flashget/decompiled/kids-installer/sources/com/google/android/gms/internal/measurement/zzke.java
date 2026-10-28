package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public class zzke {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    /* synthetic */ zzke(zzkd zzkdVar) {
    }

    public static int zzb(int i5) {
        return (i5 >>> 1) ^ (-(i5 & 1));
    }

    public static long zzc(long j5) {
        return (j5 >>> 1) ^ (-(1 & j5));
    }
}
