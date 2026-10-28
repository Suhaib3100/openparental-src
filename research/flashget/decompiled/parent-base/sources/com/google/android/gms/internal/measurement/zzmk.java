package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
abstract class zzmk<T, B> {
    private static volatile int zza = 100;

    zzmk() {
    }

    abstract int zza(T t4);

    abstract B zza();

    abstract T zza(T t4, T t5);

    abstract void zza(B b5, int i4, int i5);

    abstract void zza(B b5, int i4, long j4);

    abstract void zza(B b5, int i4, zzik zzikVar);

    abstract void zza(B b5, int i4, T t4);

    abstract void zza(T t4, zznb zznbVar) throws IOException;

    abstract boolean zza(zzlr zzlrVar);

    final boolean zza(B b5, zzlr zzlrVar, int i4) throws IOException {
        int zzd = zzlrVar.zzd();
        int i5 = zzd >>> 3;
        int i6 = zzd & 7;
        if (i6 == 0) {
            zzb(b5, i5, zzlrVar.zzl());
            return true;
        }
        if (i6 == 1) {
            zza((zzmk<T, B>) b5, i5, zzlrVar.zzk());
            return true;
        }
        if (i6 == 2) {
            zza((zzmk<T, B>) b5, i5, zzlrVar.zzp());
            return true;
        }
        if (i6 != 3) {
            if (i6 == 4) {
                return false;
            }
            if (i6 != 5) {
                throw zzkb.zza();
            }
            zza((zzmk<T, B>) b5, i5, zzlrVar.zzf());
            return true;
        }
        B zza2 = zza();
        int i7 = 4 | (i5 << 3);
        int i10 = i4 + 1;
        if (i10 >= zza) {
            throw zzkb.zzh();
        }
        while (zzlrVar.zzc() != Integer.MAX_VALUE && zza((zzmk<T, B>) zza2, zzlrVar, i10)) {
        }
        if (i7 != zzlrVar.zzd()) {
            throw zzkb.zzb();
        }
        zza((zzmk<T, B>) b5, i5, (int) zze(zza2));
        return true;
    }

    abstract int zzb(T t4);

    abstract void zzb(B b5, int i4, long j4);

    abstract void zzb(T t4, zznb zznbVar) throws IOException;

    abstract void zzb(Object obj, B b5);

    abstract B zzc(Object obj);

    abstract void zzc(Object obj, T t4);

    abstract T zzd(Object obj);

    abstract T zze(B b5);

    abstract void zzf(Object obj);
}
