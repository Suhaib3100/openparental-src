package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzfy implements zzji {
    private final zzfx zza;

    private zzfy(zzfx zzfxVar) {
        this.zza = zzfxVar;
        zzfxVar.zza = this;
    }

    public static zzfy zza(zzfx zzfxVar) {
        Object obj = zzfxVar.zza;
        return obj != null ? (zzfy) obj : new zzfy(zzfxVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzA(int i4, long j4) throws IOException {
        this.zza.zzj(i4, j4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzB(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzhj)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzj(i4, ((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Long) list.get(i7)).getClass();
                i6 += 8;
            }
            zzfxVar.zzu(i6);
            while (i5 < list.size()) {
                zzfxVar.zzk(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        zzhj zzhjVar = (zzhj) list;
        if (!z4) {
            while (i5 < zzhjVar.size()) {
                this.zza.zzj(i4, zzhjVar.zze(i5));
                i5++;
            }
            return;
        }
        zzfx zzfxVar2 = this.zza;
        zzfxVar2.zzs(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzhjVar.size(); i11++) {
            zzhjVar.zze(i11);
            i10 += 8;
        }
        zzfxVar2.zzu(i10);
        while (i5 < zzhjVar.size()) {
            zzfxVar2.zzk(zzhjVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzC(int i4, int i5) throws IOException {
        this.zza.zzt(i4, (i5 >> 31) ^ (i5 + i5));
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzD(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzgq)) {
            if (!z4) {
                while (i5 < list.size()) {
                    zzfx zzfxVar = this.zza;
                    int intValue = ((Integer) list.get(i5)).intValue();
                    zzfxVar.zzt(i4, (intValue >> 31) ^ (intValue + intValue));
                    i5++;
                }
                return;
            }
            zzfx zzfxVar2 = this.zza;
            zzfxVar2.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                int intValue2 = ((Integer) list.get(i7)).intValue();
                i6 += zzfx.zzy((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzfxVar2.zzu(i6);
            while (i5 < list.size()) {
                int intValue3 = ((Integer) list.get(i5)).intValue();
                zzfxVar2.zzu((intValue3 >> 31) ^ (intValue3 + intValue3));
                i5++;
            }
            return;
        }
        zzgq zzgqVar = (zzgq) list;
        if (!z4) {
            while (i5 < zzgqVar.size()) {
                zzfx zzfxVar3 = this.zza;
                int zze = zzgqVar.zze(i5);
                zzfxVar3.zzt(i4, (zze >> 31) ^ (zze + zze));
                i5++;
            }
            return;
        }
        zzfx zzfxVar4 = this.zza;
        zzfxVar4.zzs(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzgqVar.size(); i11++) {
            int zze2 = zzgqVar.zze(i11);
            i10 += zzfx.zzy((zze2 >> 31) ^ (zze2 + zze2));
        }
        zzfxVar4.zzu(i10);
        while (i5 < zzgqVar.size()) {
            int zze3 = zzgqVar.zze(i5);
            zzfxVar4.zzu((zze3 >> 31) ^ (zze3 + zze3));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzE(int i4, long j4) throws IOException {
        this.zza.zzv(i4, (j4 >> 63) ^ (j4 + j4));
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzF(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzhj)) {
            if (!z4) {
                while (i5 < list.size()) {
                    zzfx zzfxVar = this.zza;
                    long longValue = ((Long) list.get(i5)).longValue();
                    zzfxVar.zzv(i4, (longValue >> 63) ^ (longValue + longValue));
                    i5++;
                }
                return;
            }
            zzfx zzfxVar2 = this.zza;
            zzfxVar2.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                long longValue2 = ((Long) list.get(i7)).longValue();
                i6 += zzfx.zzz((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zzfxVar2.zzu(i6);
            while (i5 < list.size()) {
                long longValue3 = ((Long) list.get(i5)).longValue();
                zzfxVar2.zzw((longValue3 >> 63) ^ (longValue3 + longValue3));
                i5++;
            }
            return;
        }
        zzhj zzhjVar = (zzhj) list;
        if (!z4) {
            while (i5 < zzhjVar.size()) {
                zzfx zzfxVar3 = this.zza;
                long zze = zzhjVar.zze(i5);
                zzfxVar3.zzv(i4, (zze >> 63) ^ (zze + zze));
                i5++;
            }
            return;
        }
        zzfx zzfxVar4 = this.zza;
        zzfxVar4.zzs(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzhjVar.size(); i11++) {
            long zze2 = zzhjVar.zze(i11);
            i10 += zzfx.zzz((zze2 >> 63) ^ (zze2 + zze2));
        }
        zzfxVar4.zzu(i10);
        while (i5 < zzhjVar.size()) {
            long zze3 = zzhjVar.zze(i5);
            zzfxVar4.zzw((zze3 >> 63) ^ (zze3 + zze3));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    @Deprecated
    public final void zzG(int i4) throws IOException {
        this.zza.zzs(i4, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzH(int i4, String str) throws IOException {
        this.zza.zzq(i4, str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzI(int i4, List list) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzhd)) {
            while (i5 < list.size()) {
                this.zza.zzq(i4, (String) list.get(i5));
                i5++;
            }
            return;
        }
        zzhd zzhdVar = (zzhd) list;
        while (i5 < list.size()) {
            Object zza = zzhdVar.zza();
            if (zza instanceof String) {
                this.zza.zzq(i4, (String) zza);
            } else {
                this.zza.zzf(i4, (zzfp) zza);
            }
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzJ(int i4, int i5) throws IOException {
        this.zza.zzt(i4, i5);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzK(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzgq)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzt(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzfx.zzy(((Integer) list.get(i7)).intValue());
            }
            zzfxVar.zzu(i6);
            while (i5 < list.size()) {
                zzfxVar.zzu(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        zzgq zzgqVar = (zzgq) list;
        if (!z4) {
            while (i5 < zzgqVar.size()) {
                this.zza.zzt(i4, zzgqVar.zze(i5));
                i5++;
            }
            return;
        }
        zzfx zzfxVar2 = this.zza;
        zzfxVar2.zzs(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzgqVar.size(); i11++) {
            i10 += zzfx.zzy(zzgqVar.zze(i11));
        }
        zzfxVar2.zzu(i10);
        while (i5 < zzgqVar.size()) {
            zzfxVar2.zzu(zzgqVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzL(int i4, long j4) throws IOException {
        this.zza.zzv(i4, j4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzM(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzhj)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzv(i4, ((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzfx.zzz(((Long) list.get(i7)).longValue());
            }
            zzfxVar.zzu(i6);
            while (i5 < list.size()) {
                zzfxVar.zzw(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        zzhj zzhjVar = (zzhj) list;
        if (!z4) {
            while (i5 < zzhjVar.size()) {
                this.zza.zzv(i4, zzhjVar.zze(i5));
                i5++;
            }
            return;
        }
        zzfx zzfxVar2 = this.zza;
        zzfxVar2.zzs(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzhjVar.size(); i11++) {
            i10 += zzfx.zzz(zzhjVar.zze(i11));
        }
        zzfxVar2.zzu(i10);
        while (i5 < zzhjVar.size()) {
            zzfxVar2.zzw(zzhjVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzb(int i4, boolean z4) throws IOException {
        this.zza.zzd(i4, z4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzc(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzff)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzd(i4, ((Boolean) list.get(i5)).booleanValue());
                    i5++;
                }
                return;
            }
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Boolean) list.get(i7)).getClass();
                i6++;
            }
            zzfxVar.zzu(i6);
            while (i5 < list.size()) {
                zzfxVar.zzb(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
                i5++;
            }
            return;
        }
        zzff zzffVar = (zzff) list;
        if (!z4) {
            while (i5 < zzffVar.size()) {
                this.zza.zzd(i4, zzffVar.zzf(i5));
                i5++;
            }
            return;
        }
        zzfx zzfxVar2 = this.zza;
        zzfxVar2.zzs(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzffVar.size(); i11++) {
            zzffVar.zzf(i11);
            i10++;
        }
        zzfxVar2.zzu(i10);
        while (i5 < zzffVar.size()) {
            zzfxVar2.zzb(zzffVar.zzf(i5) ? (byte) 1 : (byte) 0);
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzd(int i4, zzfp zzfpVar) throws IOException {
        this.zza.zzf(i4, zzfpVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zze(int i4, List list) throws IOException {
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.zza.zzf(i4, (zzfp) list.get(i5));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzf(int i4, double d5) throws IOException {
        this.zza.zzj(i4, Double.doubleToRawLongBits(d5));
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzg(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzfz)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzj(i4, Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                    i5++;
                }
                return;
            }
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Double) list.get(i7)).getClass();
                i6 += 8;
            }
            zzfxVar.zzu(i6);
            while (i5 < list.size()) {
                zzfxVar.zzk(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                i5++;
            }
            return;
        }
        zzfz zzfzVar = (zzfz) list;
        if (!z4) {
            while (i5 < zzfzVar.size()) {
                this.zza.zzj(i4, Double.doubleToRawLongBits(zzfzVar.zze(i5)));
                i5++;
            }
            return;
        }
        zzfx zzfxVar2 = this.zza;
        zzfxVar2.zzs(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzfzVar.size(); i11++) {
            zzfzVar.zze(i11);
            i10 += 8;
        }
        zzfxVar2.zzu(i10);
        while (i5 < zzfzVar.size()) {
            zzfxVar2.zzk(Double.doubleToRawLongBits(zzfzVar.zze(i5)));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    @Deprecated
    public final void zzh(int i4) throws IOException {
        this.zza.zzs(i4, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzi(int i4, int i5) throws IOException {
        this.zza.zzl(i4, i5);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzj(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzgq)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzl(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzfx.zzz(((Integer) list.get(i7)).intValue());
            }
            zzfxVar.zzu(i6);
            while (i5 < list.size()) {
                zzfxVar.zzm(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        zzgq zzgqVar = (zzgq) list;
        if (!z4) {
            while (i5 < zzgqVar.size()) {
                this.zza.zzl(i4, zzgqVar.zze(i5));
                i5++;
            }
            return;
        }
        zzfx zzfxVar2 = this.zza;
        zzfxVar2.zzs(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzgqVar.size(); i11++) {
            i10 += zzfx.zzz(zzgqVar.zze(i11));
        }
        zzfxVar2.zzu(i10);
        while (i5 < zzgqVar.size()) {
            zzfxVar2.zzm(zzgqVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzk(int i4, int i5) throws IOException {
        this.zza.zzh(i4, i5);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzl(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzgq)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzh(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i6 += 4;
            }
            zzfxVar.zzu(i6);
            while (i5 < list.size()) {
                zzfxVar.zzi(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        zzgq zzgqVar = (zzgq) list;
        if (!z4) {
            while (i5 < zzgqVar.size()) {
                this.zza.zzh(i4, zzgqVar.zze(i5));
                i5++;
            }
            return;
        }
        zzfx zzfxVar2 = this.zza;
        zzfxVar2.zzs(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzgqVar.size(); i11++) {
            zzgqVar.zze(i11);
            i10 += 4;
        }
        zzfxVar2.zzu(i10);
        while (i5 < zzgqVar.size()) {
            zzfxVar2.zzi(zzgqVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzm(int i4, long j4) throws IOException {
        this.zza.zzj(i4, j4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzn(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzhj)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzj(i4, ((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Long) list.get(i7)).getClass();
                i6 += 8;
            }
            zzfxVar.zzu(i6);
            while (i5 < list.size()) {
                zzfxVar.zzk(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        zzhj zzhjVar = (zzhj) list;
        if (!z4) {
            while (i5 < zzhjVar.size()) {
                this.zza.zzj(i4, zzhjVar.zze(i5));
                i5++;
            }
            return;
        }
        zzfx zzfxVar2 = this.zza;
        zzfxVar2.zzs(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzhjVar.size(); i11++) {
            zzhjVar.zze(i11);
            i10 += 8;
        }
        zzfxVar2.zzu(i10);
        while (i5 < zzhjVar.size()) {
            zzfxVar2.zzk(zzhjVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzo(int i4, float f4) throws IOException {
        this.zza.zzh(i4, Float.floatToRawIntBits(f4));
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzp(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzgj)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzh(i4, Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                    i5++;
                }
                return;
            }
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Float) list.get(i7)).getClass();
                i6 += 4;
            }
            zzfxVar.zzu(i6);
            while (i5 < list.size()) {
                zzfxVar.zzi(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                i5++;
            }
            return;
        }
        zzgj zzgjVar = (zzgj) list;
        if (!z4) {
            while (i5 < zzgjVar.size()) {
                this.zza.zzh(i4, Float.floatToRawIntBits(zzgjVar.zze(i5)));
                i5++;
            }
            return;
        }
        zzfx zzfxVar2 = this.zza;
        zzfxVar2.zzs(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzgjVar.size(); i11++) {
            zzgjVar.zze(i11);
            i10 += 4;
        }
        zzfxVar2.zzu(i10);
        while (i5 < zzgjVar.size()) {
            zzfxVar2.zzi(Float.floatToRawIntBits(zzgjVar.zze(i5)));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzq(int i4, Object obj, zzib zzibVar) throws IOException {
        zzfx zzfxVar = this.zza;
        zzfxVar.zzs(i4, 3);
        zzibVar.zzi((zzfa) obj, this);
        zzfxVar.zzs(i4, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzr(int i4, int i5) throws IOException {
        this.zza.zzl(i4, i5);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzs(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzgq)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzl(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzfx.zzz(((Integer) list.get(i7)).intValue());
            }
            zzfxVar.zzu(i6);
            while (i5 < list.size()) {
                zzfxVar.zzm(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        zzgq zzgqVar = (zzgq) list;
        if (!z4) {
            while (i5 < zzgqVar.size()) {
                this.zza.zzl(i4, zzgqVar.zze(i5));
                i5++;
            }
            return;
        }
        zzfx zzfxVar2 = this.zza;
        zzfxVar2.zzs(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzgqVar.size(); i11++) {
            i10 += zzfx.zzz(zzgqVar.zze(i11));
        }
        zzfxVar2.zzu(i10);
        while (i5 < zzgqVar.size()) {
            zzfxVar2.zzm(zzgqVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzt(int i4, long j4) throws IOException {
        this.zza.zzv(i4, j4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzu(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzhj)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzv(i4, ((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzfx.zzz(((Long) list.get(i7)).longValue());
            }
            zzfxVar.zzu(i6);
            while (i5 < list.size()) {
                zzfxVar.zzw(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        zzhj zzhjVar = (zzhj) list;
        if (!z4) {
            while (i5 < zzhjVar.size()) {
                this.zza.zzv(i4, zzhjVar.zze(i5));
                i5++;
            }
            return;
        }
        zzfx zzfxVar2 = this.zza;
        zzfxVar2.zzs(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzhjVar.size(); i11++) {
            i10 += zzfx.zzz(zzhjVar.zze(i11));
        }
        zzfxVar2.zzu(i10);
        while (i5 < zzhjVar.size()) {
            zzfxVar2.zzw(zzhjVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzv(int i4, zzhk zzhkVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i4, 2);
            zzfxVar.zzu(zzhl.zzb(zzhkVar, entry.getKey(), entry.getValue()));
            zzhl.zze(zzfxVar, zzhkVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzw(int i4, Object obj, zzib zzibVar) throws IOException {
        zzfx zzfxVar = this.zza;
        zzfa zzfaVar = (zzfa) obj;
        zzfxVar.zzs(i4, 2);
        zzfxVar.zzu(zzfaVar.zzi(zzibVar));
        zzibVar.zzi(zzfaVar, this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzx(int i4, Object obj) throws IOException {
        if (obj instanceof zzfp) {
            this.zza.zzp(i4, (zzfp) obj);
        } else {
            this.zza.zzo(i4, (zzhr) obj);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzy(int i4, int i5) throws IOException {
        this.zza.zzh(i4, i5);
    }

    @Override // com.google.android.gms.internal.play_billing.zzji
    public final void zzz(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzgq)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzh(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            zzfx zzfxVar = this.zza;
            zzfxVar.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i6 += 4;
            }
            zzfxVar.zzu(i6);
            while (i5 < list.size()) {
                zzfxVar.zzi(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        zzgq zzgqVar = (zzgq) list;
        if (!z4) {
            while (i5 < zzgqVar.size()) {
                this.zza.zzh(i4, zzgqVar.zze(i5));
                i5++;
            }
            return;
        }
        zzfx zzfxVar2 = this.zza;
        zzfxVar2.zzs(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzgqVar.size(); i11++) {
            zzgqVar.zze(i11);
            i10 += 4;
        }
        zzfxVar2.zzu(i10);
        while (i5 < zzgqVar.size()) {
            zzfxVar2.zzi(zzgqVar.zze(i5));
            i5++;
        }
    }
}
