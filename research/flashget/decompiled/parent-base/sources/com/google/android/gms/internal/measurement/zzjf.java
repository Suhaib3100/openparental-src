package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
final class zzjf implements zznb {
    private final zzjc zza;

    private zzjf(zzjc zzjcVar) {
        zzjc zzjcVar2 = (zzjc) zzjv.zza(zzjcVar, ProtectedSandApp.s("풼"));
        this.zza = zzjcVar2;
        zzjcVar2.zza = this;
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i4, List<Double> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzje)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzb(i4, list.get(i5).doubleValue());
                    i5++;
                }
                return;
            }
            this.zza.zzc(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzjc.zza(list.get(i7).doubleValue());
            }
            this.zza.zzc(i6);
            while (i5 < list.size()) {
                this.zza.zzb(list.get(i5).doubleValue());
                i5++;
            }
            return;
        }
        zzje zzjeVar = (zzje) list;
        if (!z4) {
            while (i5 < zzjeVar.size()) {
                this.zza.zzb(i4, zzjeVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzc(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzjeVar.size(); i11++) {
            i10 += zzjc.zza(zzjeVar.zzb(i11));
        }
        this.zza.zzc(i10);
        while (i5 < zzjeVar.size()) {
            this.zza.zzb(zzjeVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzc(int i4, List<Integer> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzjw)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzb(i4, list.get(i5).intValue());
                    i5++;
                }
                return;
            }
            this.zza.zzc(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzjc.zzd(list.get(i7).intValue());
            }
            this.zza.zzc(i6);
            while (i5 < list.size()) {
                this.zza.zzb(list.get(i5).intValue());
                i5++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z4) {
            while (i5 < zzjwVar.size()) {
                this.zza.zzb(i4, zzjwVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzc(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzjwVar.size(); i11++) {
            i10 += zzjc.zzd(zzjwVar.zzb(i11));
        }
        this.zza.zzc(i10);
        while (i5 < zzjwVar.size()) {
            this.zza.zzb(zzjwVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzd(int i4, List<Integer> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzjw)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zza(i4, list.get(i5).intValue());
                    i5++;
                }
                return;
            }
            this.zza.zzc(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzjc.zze(list.get(i7).intValue());
            }
            this.zza.zzc(i6);
            while (i5 < list.size()) {
                this.zza.zza(list.get(i5).intValue());
                i5++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z4) {
            while (i5 < zzjwVar.size()) {
                this.zza.zza(i4, zzjwVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzc(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzjwVar.size(); i11++) {
            i10 += zzjc.zze(zzjwVar.zzb(i11));
        }
        this.zza.zzc(i10);
        while (i5 < zzjwVar.size()) {
            this.zza.zza(zzjwVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zze(int i4, List<Long> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzkn)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zza(i4, list.get(i5).longValue());
                    i5++;
                }
                return;
            }
            this.zza.zzc(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzjc.zzc(list.get(i7).longValue());
            }
            this.zza.zzc(i6);
            while (i5 < list.size()) {
                this.zza.zza(list.get(i5).longValue());
                i5++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (!z4) {
            while (i5 < zzknVar.size()) {
                this.zza.zza(i4, zzknVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzc(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzknVar.size(); i11++) {
            i10 += zzjc.zzc(zzknVar.zzb(i11));
        }
        this.zza.zzc(i10);
        while (i5 < zzknVar.size()) {
            this.zza.zza(zzknVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzf(int i4, List<Float> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzjs)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzb(i4, list.get(i5).floatValue());
                    i5++;
                }
                return;
            }
            this.zza.zzc(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzjc.zza(list.get(i7).floatValue());
            }
            this.zza.zzc(i6);
            while (i5 < list.size()) {
                this.zza.zzb(list.get(i5).floatValue());
                i5++;
            }
            return;
        }
        zzjs zzjsVar = (zzjs) list;
        if (!z4) {
            while (i5 < zzjsVar.size()) {
                this.zza.zzb(i4, zzjsVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzc(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzjsVar.size(); i11++) {
            i10 += zzjc.zza(zzjsVar.zzb(i11));
        }
        this.zza.zzc(i10);
        while (i5 < zzjsVar.size()) {
            this.zza.zzb(zzjsVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzg(int i4, List<Integer> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzjw)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzb(i4, list.get(i5).intValue());
                    i5++;
                }
                return;
            }
            this.zza.zzc(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzjc.zzf(list.get(i7).intValue());
            }
            this.zza.zzc(i6);
            while (i5 < list.size()) {
                this.zza.zzb(list.get(i5).intValue());
                i5++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z4) {
            while (i5 < zzjwVar.size()) {
                this.zza.zzb(i4, zzjwVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzc(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzjwVar.size(); i11++) {
            i10 += zzjc.zzf(zzjwVar.zzb(i11));
        }
        this.zza.zzc(i10);
        while (i5 < zzjwVar.size()) {
            this.zza.zzb(zzjwVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzh(int i4, List<Long> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzkn)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzb(i4, list.get(i5).longValue());
                    i5++;
                }
                return;
            }
            this.zza.zzc(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzjc.zzd(list.get(i7).longValue());
            }
            this.zza.zzc(i6);
            while (i5 < list.size()) {
                this.zza.zzb(list.get(i5).longValue());
                i5++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (!z4) {
            while (i5 < zzknVar.size()) {
                this.zza.zzb(i4, zzknVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzc(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzknVar.size(); i11++) {
            i10 += zzjc.zzd(zzknVar.zzb(i11));
        }
        this.zza.zzc(i10);
        while (i5 < zzknVar.size()) {
            this.zza.zzb(zzknVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzi(int i4, List<Integer> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzjw)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zza(i4, list.get(i5).intValue());
                    i5++;
                }
                return;
            }
            this.zza.zzc(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzjc.zzg(list.get(i7).intValue());
            }
            this.zza.zzc(i6);
            while (i5 < list.size()) {
                this.zza.zza(list.get(i5).intValue());
                i5++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z4) {
            while (i5 < zzjwVar.size()) {
                this.zza.zza(i4, zzjwVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzc(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzjwVar.size(); i11++) {
            i10 += zzjc.zzg(zzjwVar.zzb(i11));
        }
        this.zza.zzc(i10);
        while (i5 < zzjwVar.size()) {
            this.zza.zza(zzjwVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzj(int i4, List<Long> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzkn)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zza(i4, list.get(i5).longValue());
                    i5++;
                }
                return;
            }
            this.zza.zzc(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzjc.zze(list.get(i7).longValue());
            }
            this.zza.zzc(i6);
            while (i5 < list.size()) {
                this.zza.zza(list.get(i5).longValue());
                i5++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (!z4) {
            while (i5 < zzknVar.size()) {
                this.zza.zza(i4, zzknVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzc(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzknVar.size(); i11++) {
            i10 += zzjc.zze(zzknVar.zzb(i11));
        }
        this.zza.zzc(i10);
        while (i5 < zzknVar.size()) {
            this.zza.zza(zzknVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzk(int i4, List<Integer> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzjw)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzk(i4, list.get(i5).intValue());
                    i5++;
                }
                return;
            }
            this.zza.zzc(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzjc.zzh(list.get(i7).intValue());
            }
            this.zza.zzc(i6);
            while (i5 < list.size()) {
                this.zza.zzk(list.get(i5).intValue());
                i5++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z4) {
            while (i5 < zzjwVar.size()) {
                this.zza.zzk(i4, zzjwVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzc(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzjwVar.size(); i11++) {
            i10 += zzjc.zzh(zzjwVar.zzb(i11));
        }
        this.zza.zzc(i10);
        while (i5 < zzjwVar.size()) {
            this.zza.zzk(zzjwVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzl(int i4, List<Long> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzkn)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzh(i4, list.get(i5).longValue());
                    i5++;
                }
                return;
            }
            this.zza.zzc(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzjc.zzf(list.get(i7).longValue());
            }
            this.zza.zzc(i6);
            while (i5 < list.size()) {
                this.zza.zzh(list.get(i5).longValue());
                i5++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (!z4) {
            while (i5 < zzknVar.size()) {
                this.zza.zzh(i4, zzknVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzc(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzknVar.size(); i11++) {
            i10 += zzjc.zzf(zzknVar.zzb(i11));
        }
        this.zza.zzc(i10);
        while (i5 < zzknVar.size()) {
            this.zza.zzh(zzknVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzm(int i4, List<Integer> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzjw)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzd(i4, list.get(i5).intValue());
                    i5++;
                }
                return;
            }
            this.zza.zzc(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzjc.zzj(list.get(i7).intValue());
            }
            this.zza.zzc(i6);
            while (i5 < list.size()) {
                this.zza.zzc(list.get(i5).intValue());
                i5++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z4) {
            while (i5 < zzjwVar.size()) {
                this.zza.zzd(i4, zzjwVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzc(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzjwVar.size(); i11++) {
            i10 += zzjc.zzj(zzjwVar.zzb(i11));
        }
        this.zza.zzc(i10);
        while (i5 < zzjwVar.size()) {
            this.zza.zzc(zzjwVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzn(int i4, List<Long> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzkn)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzb(i4, list.get(i5).longValue());
                    i5++;
                }
                return;
            }
            this.zza.zzc(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzjc.zzg(list.get(i7).longValue());
            }
            this.zza.zzc(i6);
            while (i5 < list.size()) {
                this.zza.zzb(list.get(i5).longValue());
                i5++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (!z4) {
            while (i5 < zzknVar.size()) {
                this.zza.zzb(i4, zzknVar.zzb(i5));
                i5++;
            }
            return;
        }
        this.zza.zzc(i4, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < zzknVar.size(); i11++) {
            i10 += zzjc.zzg(zzknVar.zzb(i11));
        }
        this.zza.zzc(i10);
        while (i5 < zzknVar.size()) {
            this.zza.zzb(zzknVar.zzb(i5));
            i5++;
        }
    }

    public static zzjf zza(zzjc zzjcVar) {
        zzjf zzjfVar = zzjcVar.zza;
        return zzjfVar != null ? zzjfVar : new zzjf(zzjcVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i4, boolean z4) throws IOException {
        this.zza.zza(i4, z4);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i4, List<Boolean> list, boolean z4) throws IOException {
        int i5 = 0;
        if (!(list instanceof zzii)) {
            if (z4) {
                this.zza.zzc(i4, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < list.size(); i7++) {
                    i6 += zzjc.zza(list.get(i7).booleanValue());
                }
                this.zza.zzc(i6);
                while (i5 < list.size()) {
                    this.zza.zzb(list.get(i5).booleanValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                this.zza.zza(i4, list.get(i5).booleanValue());
                i5++;
            }
            return;
        }
        zzii zziiVar = (zzii) list;
        if (z4) {
            this.zza.zzc(i4, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < zziiVar.size(); i11++) {
                i10 += zzjc.zza(zziiVar.zzb(i11));
            }
            this.zza.zzc(i10);
            while (i5 < zziiVar.size()) {
                this.zza.zzb(zziiVar.zzb(i5));
                i5++;
            }
            return;
        }
        while (i5 < zziiVar.size()) {
            this.zza.zza(i4, zziiVar.zzb(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i4, int i5) throws IOException {
        this.zza.zza(i4, i5);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzd(int i4, int i5) throws IOException {
        this.zza.zza(i4, i5);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zze(int i4, int i5) throws IOException {
        this.zza.zzk(i4, i5);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzf(int i4, int i5) throws IOException {
        this.zza.zzd(i4, i5);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i4, long j4) throws IOException {
        this.zza.zzb(i4, j4);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zze(int i4, long j4) throws IOException {
        this.zza.zzb(i4, j4);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzd(int i4, long j4) throws IOException {
        this.zza.zzh(i4, j4);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i4, Object obj, zzlu zzluVar) throws IOException {
        this.zza.zza(i4, (zzlc) obj, zzluVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i4, zzik zzikVar) throws IOException {
        this.zza.zza(i4, zzikVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i4, List<?> list, zzlu zzluVar) throws IOException {
        for (int i5 = 0; i5 < list.size(); i5++) {
            zzb(i4, list.get(i5), zzluVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzc(int i4, int i5) throws IOException {
        this.zza.zzb(i4, i5);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i4, List<zzik> list) throws IOException {
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.zza.zza(i4, list.get(i5));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzc(int i4, long j4) throws IOException {
        this.zza.zza(i4, j4);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    @Deprecated
    public final void zzb(int i4) throws IOException {
        this.zza.zzc(i4, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i4, double d5) throws IOException {
        this.zza.zzb(i4, d5);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i4, List<String> list) throws IOException {
        int i5 = 0;
        if (list instanceof zzkj) {
            zzkj zzkjVar = (zzkj) list;
            while (i5 < list.size()) {
                Object zza = zzkjVar.zza(i5);
                if (zza instanceof String) {
                    this.zza.zza(i4, (String) zza);
                } else {
                    this.zza.zza(i4, (zzik) zza);
                }
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.zza.zza(i4, list.get(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    @Deprecated
    public final void zza(int i4) throws IOException {
        this.zza.zzc(i4, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i4, int i5) throws IOException {
        this.zza.zzb(i4, i5);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i4, long j4) throws IOException {
        this.zza.zza(i4, j4);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i4, float f4) throws IOException {
        this.zza.zzb(i4, f4);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i4, Object obj, zzlu zzluVar) throws IOException {
        zzjc zzjcVar = this.zza;
        zzjcVar.zzc(i4, 3);
        zzluVar.zza((zzlu) obj, (zznb) zzjcVar.zza);
        zzjcVar.zzc(i4, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i4, List<?> list, zzlu zzluVar) throws IOException {
        for (int i5 = 0; i5 < list.size(); i5++) {
            zza(i4, list.get(i5), zzluVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final <K, V> void zza(int i4, zzkt<K, V> zzktVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzc(i4, 2);
            this.zza.zzc(zzku.zza(zzktVar, entry.getKey(), entry.getValue()));
            zzku.zza(this.zza, zzktVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i4, Object obj) throws IOException {
        if (obj instanceof zzik) {
            this.zza.zzb(i4, (zzik) obj);
        } else {
            this.zza.zza(i4, (zzlc) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i4, String str) throws IOException {
        this.zza.zza(i4, str);
    }
}
