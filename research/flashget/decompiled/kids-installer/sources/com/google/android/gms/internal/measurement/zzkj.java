package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
final class zzkj implements zzoc {
    private final zzki zza;

    private zzkj(zzki zzkiVar) {
        byte[] bArr = zzlj.zzd;
        this.zza = zzkiVar;
        zzkiVar.zza = this;
    }

    public static zzkj zza(zzki zzkiVar) {
        zzkj zzkjVar = zzkiVar.zza;
        return zzkjVar != null ? zzkjVar : new zzkj(zzkiVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzA(int i5, int i6) throws IOException {
        this.zza.zzp(i5, (i6 >> 31) ^ (i6 + i6));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzB(int i5, List list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                zzki zzkiVar = this.zza;
                int intValue = ((Integer) list.get(i6)).intValue();
                zzkiVar.zzp(i5, (intValue >> 31) ^ (intValue + intValue));
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            int intValue2 = ((Integer) list.get(i8)).intValue();
            i7 += zzki.zzx((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            zzki zzkiVar2 = this.zza;
            int intValue3 = ((Integer) list.get(i6)).intValue();
            zzkiVar2.zzq((intValue3 >> 31) ^ (intValue3 + intValue3));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzC(int i5, long j5) throws IOException {
        this.zza.zzr(i5, (j5 >> 63) ^ (j5 + j5));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzD(int i5, List list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                zzki zzkiVar = this.zza;
                long longValue = ((Long) list.get(i6)).longValue();
                zzkiVar.zzr(i5, (longValue >> 63) ^ (longValue + longValue));
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            long longValue2 = ((Long) list.get(i8)).longValue();
            i7 += zzki.zzy((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            zzki zzkiVar2 = this.zza;
            long longValue3 = ((Long) list.get(i6)).longValue();
            zzkiVar2.zzs((longValue3 >> 63) ^ (longValue3 + longValue3));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    @Deprecated
    public final void zzE(int i5) throws IOException {
        this.zza.zzo(i5, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzF(int i5, String str) throws IOException {
        this.zza.zzm(i5, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzG(int i5, List list) throws IOException {
        int i6 = 0;
        if (!(list instanceof zzlq)) {
            while (i6 < list.size()) {
                this.zza.zzm(i5, (String) list.get(i6));
                i6++;
            }
            return;
        }
        zzlq zzlqVar = (zzlq) list;
        while (i6 < list.size()) {
            Object zzf = zzlqVar.zzf(i6);
            if (zzf instanceof String) {
                this.zza.zzm(i5, (String) zzf);
            } else {
                this.zza.zze(i5, (zzka) zzf);
            }
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzH(int i5, int i6) throws IOException {
        this.zza.zzp(i5, i6);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzI(int i5, List list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.zza.zzp(i5, ((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            i7 += zzki.zzx(((Integer) list.get(i8)).intValue());
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            this.zza.zzq(((Integer) list.get(i6)).intValue());
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzJ(int i5, long j5) throws IOException {
        this.zza.zzr(i5, j5);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzK(int i5, List list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.zza.zzr(i5, ((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            i7 += zzki.zzy(((Long) list.get(i8)).longValue());
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            this.zza.zzs(((Long) list.get(i6)).longValue());
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzb(int i5, boolean z5) throws IOException {
        this.zza.zzd(i5, z5);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzc(int i5, List list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.zza.zzd(i5, ((Boolean) list.get(i6)).booleanValue());
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Boolean) list.get(i8)).booleanValue();
            i7++;
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            this.zza.zzb(((Boolean) list.get(i6)).booleanValue() ? (byte) 1 : (byte) 0);
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzd(int i5, zzka zzkaVar) throws IOException {
        this.zza.zze(i5, zzkaVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zze(int i5, List list) throws IOException {
        for (int i6 = 0; i6 < list.size(); i6++) {
            this.zza.zze(i5, (zzka) list.get(i6));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzf(int i5, double d6) throws IOException {
        this.zza.zzh(i5, Double.doubleToRawLongBits(d6));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzg(int i5, List list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.zza.zzh(i5, Double.doubleToRawLongBits(((Double) list.get(i6)).doubleValue()));
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Double) list.get(i8)).doubleValue();
            i7 += 8;
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i6)).doubleValue()));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    @Deprecated
    public final void zzh(int i5) throws IOException {
        this.zza.zzo(i5, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzi(int i5, int i6) throws IOException {
        this.zza.zzj(i5, i6);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzj(int i5, List list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.zza.zzj(i5, ((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            i7 += zzki.zzu(((Integer) list.get(i8)).intValue());
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            this.zza.zzk(((Integer) list.get(i6)).intValue());
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzk(int i5, int i6) throws IOException {
        this.zza.zzf(i5, i6);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzl(int i5, List list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.zza.zzf(i5, ((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Integer) list.get(i8)).intValue();
            i7 += 4;
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            this.zza.zzg(((Integer) list.get(i6)).intValue());
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzm(int i5, long j5) throws IOException {
        this.zza.zzh(i5, j5);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzn(int i5, List list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.zza.zzh(i5, ((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Long) list.get(i8)).longValue();
            i7 += 8;
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            this.zza.zzi(((Long) list.get(i6)).longValue());
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzo(int i5, float f6) throws IOException {
        this.zza.zzf(i5, Float.floatToRawIntBits(f6));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzp(int i5, List list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.zza.zzf(i5, Float.floatToRawIntBits(((Float) list.get(i6)).floatValue()));
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Float) list.get(i8)).floatValue();
            i7 += 4;
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i6)).floatValue()));
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzq(int i5, Object obj, zzmt zzmtVar) throws IOException {
        zzki zzkiVar = this.zza;
        zzkiVar.zzo(i5, 3);
        zzmtVar.zzi((zzmi) obj, zzkiVar.zza);
        zzkiVar.zzo(i5, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzr(int i5, int i6) throws IOException {
        this.zza.zzj(i5, i6);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzs(int i5, List list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.zza.zzj(i5, ((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            i7 += zzki.zzu(((Integer) list.get(i8)).intValue());
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            this.zza.zzk(((Integer) list.get(i6)).intValue());
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzt(int i5, long j5) throws IOException {
        this.zza.zzr(i5, j5);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzu(int i5, List list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.zza.zzr(i5, ((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            i7 += zzki.zzy(((Long) list.get(i8)).longValue());
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            this.zza.zzs(((Long) list.get(i6)).longValue());
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzv(int i5, Object obj, zzmt zzmtVar) throws IOException {
        zzmi zzmiVar = (zzmi) obj;
        zzkf zzkfVar = (zzkf) this.zza;
        zzkfVar.zzq((i5 << 3) | 2);
        zzkfVar.zzq(((zzjk) zzmiVar).zzbu(zzmtVar));
        zzmtVar.zzi(zzmiVar, zzkfVar.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzw(int i5, int i6) throws IOException {
        this.zza.zzf(i5, i6);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzx(int i5, List list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.zza.zzf(i5, ((Integer) list.get(i6)).intValue());
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Integer) list.get(i8)).intValue();
            i7 += 4;
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            this.zza.zzg(((Integer) list.get(i6)).intValue());
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzy(int i5, long j5) throws IOException {
        this.zza.zzh(i5, j5);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzz(int i5, List list, boolean z5) throws IOException {
        int i6 = 0;
        if (!z5) {
            while (i6 < list.size()) {
                this.zza.zzh(i5, ((Long) list.get(i6)).longValue());
                i6++;
            }
            return;
        }
        this.zza.zzo(i5, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Long) list.get(i8)).longValue();
            i7 += 8;
        }
        this.zza.zzq(i7);
        while (i6 < list.size()) {
            this.zza.zzi(((Long) list.get(i6)).longValue());
            i6++;
        }
    }
}
