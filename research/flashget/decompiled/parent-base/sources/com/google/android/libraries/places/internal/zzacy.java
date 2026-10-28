package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzacy {
    private final zzacx zza;

    private zzacy(zzacx zzacxVar) {
        zzads.zzf(zzacxVar, ProtectedSandApp.s("\ue74d"));
        this.zza = zzacxVar;
        zzacxVar.zza = this;
    }

    public static zzacy zza(zzacx zzacxVar) {
        zzacy zzacyVar = zzacxVar.zza;
        return zzacyVar != null ? zzacyVar : new zzacy(zzacxVar);
    }

    public final void zzA(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                zzacx zzacxVar = this.zza;
                int intValue = ((Integer) list.get(i5)).intValue();
                zzacxVar.zzp(i4, (intValue >> 31) ^ (intValue + intValue));
                i5++;
            }
            return;
        }
        this.zza.zzo(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            int intValue2 = ((Integer) list.get(i7)).intValue();
            i6 += zzacx.zzA((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.zza.zzq(i6);
        while (i5 < list.size()) {
            zzacx zzacxVar2 = this.zza;
            int intValue3 = ((Integer) list.get(i5)).intValue();
            zzacxVar2.zzq((intValue3 >> 31) ^ (intValue3 + intValue3));
            i5++;
        }
    }

    public final void zzB(int i4, long j4) throws IOException {
        this.zza.zzr(i4, (j4 >> 63) ^ (j4 + j4));
    }

    public final void zzC(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                zzacx zzacxVar = this.zza;
                long longValue = ((Long) list.get(i5)).longValue();
                zzacxVar.zzr(i4, (longValue >> 63) ^ (longValue + longValue));
                i5++;
            }
            return;
        }
        this.zza.zzo(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            long longValue2 = ((Long) list.get(i7)).longValue();
            i6 += zzacx.zzB((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.zza.zzq(i6);
        while (i5 < list.size()) {
            zzacx zzacxVar2 = this.zza;
            long longValue3 = ((Long) list.get(i5)).longValue();
            zzacxVar2.zzs((longValue3 >> 63) ^ (longValue3 + longValue3));
            i5++;
        }
    }

    public final void zzD(int i4, String str) throws IOException {
        this.zza.zzm(i4, str);
    }

    public final void zzE(int i4, List list) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzadz)) {
            while (i5 < list.size()) {
                this.zza.zzm(i4, (String) list.get(i5));
                i5++;
            }
            return;
        }
        zzadz zzadzVar = (zzadz) list;
        while (i5 < list.size()) {
            Object zze = zzadzVar.zze(i5);
            if (zze instanceof String) {
                this.zza.zzm(i4, (String) zze);
            } else {
                this.zza.zze(i4, (zzacp) zze);
            }
            i5++;
        }
    }

    public final void zzF(int i4, int i5) throws IOException {
        this.zza.zzp(i4, i5);
    }

    public final void zzG(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.zza.zzp(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        this.zza.zzo(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += zzacx.zzA(((Integer) list.get(i7)).intValue());
        }
        this.zza.zzq(i6);
        while (i5 < list.size()) {
            this.zza.zzq(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public final void zzH(int i4, long j4) throws IOException {
        this.zza.zzr(i4, j4);
    }

    public final void zzI(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.zza.zzr(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        this.zza.zzo(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += zzacx.zzB(((Long) list.get(i7)).longValue());
        }
        this.zza.zzq(i6);
        while (i5 < list.size()) {
            this.zza.zzs(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public final void zzb(int i4, boolean z4) throws IOException {
        this.zza.zzd(i4, z4);
    }

    public final void zzc(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.zza.zzd(i4, ((Boolean) list.get(i5)).booleanValue());
                i5++;
            }
            return;
        }
        this.zza.zzo(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Boolean) list.get(i7)).getClass();
            i6++;
        }
        this.zza.zzq(i6);
        while (i5 < list.size()) {
            this.zza.zzb(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
            i5++;
        }
    }

    public final void zzd(int i4, zzacp zzacpVar) throws IOException {
        this.zza.zze(i4, zzacpVar);
    }

    public final void zze(int i4, List list) throws IOException {
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.zza.zze(i4, (zzacp) list.get(i5));
        }
    }

    public final void zzf(int i4, double d5) throws IOException {
        this.zza.zzh(i4, Double.doubleToRawLongBits(d5));
    }

    public final void zzg(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.zza.zzh(i4, Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                i5++;
            }
            return;
        }
        this.zza.zzo(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Double) list.get(i7)).getClass();
            i6 += 8;
        }
        this.zza.zzq(i6);
        while (i5 < list.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
            i5++;
        }
    }

    public final void zzh(int i4, int i5) throws IOException {
        this.zza.zzj(i4, i5);
    }

    public final void zzi(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.zza.zzj(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        this.zza.zzo(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += zzacx.zzv(((Integer) list.get(i7)).intValue());
        }
        this.zza.zzq(i6);
        while (i5 < list.size()) {
            this.zza.zzk(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public final void zzj(int i4, int i5) throws IOException {
        this.zza.zzf(i4, i5);
    }

    public final void zzk(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.zza.zzf(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        this.zza.zzo(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Integer) list.get(i7)).getClass();
            i6 += 4;
        }
        this.zza.zzq(i6);
        while (i5 < list.size()) {
            this.zza.zzg(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public final void zzl(int i4, long j4) throws IOException {
        this.zza.zzh(i4, j4);
    }

    public final void zzm(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.zza.zzh(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        this.zza.zzo(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            i6 += 8;
        }
        this.zza.zzq(i6);
        while (i5 < list.size()) {
            this.zza.zzi(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public final void zzn(int i4, float f4) throws IOException {
        this.zza.zzf(i4, Float.floatToRawIntBits(f4));
    }

    public final void zzo(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.zza.zzf(i4, Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                i5++;
            }
            return;
        }
        this.zza.zzo(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Float) list.get(i7)).getClass();
            i6 += 4;
        }
        this.zza.zzq(i6);
        while (i5 < list.size()) {
            this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
            i5++;
        }
    }

    public final void zzp(int i4, Object obj, zzafc zzafcVar) throws IOException {
        zzacx zzacxVar = this.zza;
        zzacxVar.zzo(i4, 3);
        zzafcVar.zzi((zzaer) obj, zzacxVar.zza);
        zzacxVar.zzo(i4, 4);
    }

    public final void zzq(int i4, int i5) throws IOException {
        this.zza.zzj(i4, i5);
    }

    public final void zzr(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.zza.zzj(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        this.zza.zzo(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += zzacx.zzv(((Integer) list.get(i7)).intValue());
        }
        this.zza.zzq(i6);
        while (i5 < list.size()) {
            this.zza.zzk(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public final void zzs(int i4, long j4) throws IOException {
        this.zza.zzr(i4, j4);
    }

    public final void zzt(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.zza.zzr(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        this.zza.zzo(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += zzacx.zzB(((Long) list.get(i7)).longValue());
        }
        this.zza.zzq(i6);
        while (i5 < list.size()) {
            this.zza.zzs(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public final void zzu(int i4, Object obj, zzafc zzafcVar) throws IOException {
        Object obj2 = (zzaer) obj;
        zzacu zzacuVar = (zzacu) this.zza;
        zzacuVar.zzq((i4 << 3) | 2);
        zzacc zzaccVar = (zzacc) obj2;
        int zzr = zzaccVar.zzr();
        if (zzr == -1) {
            zzr = zzafcVar.zza(zzaccVar);
            zzaccVar.zzu(zzr);
        }
        zzacuVar.zzq(zzr);
        zzafcVar.zzi(obj2, zzacuVar.zza);
    }

    public final void zzv(int i4, int i5) throws IOException {
        this.zza.zzf(i4, i5);
    }

    public final void zzw(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.zza.zzf(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        this.zza.zzo(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Integer) list.get(i7)).getClass();
            i6 += 4;
        }
        this.zza.zzq(i6);
        while (i5 < list.size()) {
            this.zza.zzg(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public final void zzx(int i4, long j4) throws IOException {
        this.zza.zzh(i4, j4);
    }

    public final void zzy(int i4, List list, boolean z4) throws IOException {
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                this.zza.zzh(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        this.zza.zzo(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            i6 += 8;
        }
        this.zza.zzq(i6);
        while (i5 < list.size()) {
            this.zza.zzi(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public final void zzz(int i4, int i5) throws IOException {
        this.zza.zzp(i4, (i5 >> 31) ^ (i5 + i5));
    }
}
