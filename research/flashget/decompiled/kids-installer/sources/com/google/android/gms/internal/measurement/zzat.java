package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.solver.widgets.analyzer.e;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzat implements Iterable, zzap {
    private final String zza;

    public zzat(String str) {
        if (str == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("⋱"));
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzat) {
            return this.zza.equals(((zzat) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzas(this);
    }

    public final String toString() {
        String str = this.zza;
        String s5 = ProtectedSandApp.s("⋲");
        return e.a(s5, str, s5);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02da  */
    @Override // com.google.android.gms.internal.measurement.zzap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.zzap zzbU(java.lang.String r22, com.google.android.gms.internal.measurement.zzg r23, java.util.List r24) {
        /*
            Method dump skipped, instructions count: 1864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzat.zzbU(java.lang.String, com.google.android.gms.internal.measurement.zzg, java.util.List):com.google.android.gms.internal.measurement.zzap");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzat(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(p.f18289o);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new zzar(this);
    }
}
