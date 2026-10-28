package com.google.android.gms.internal.measurement;

import android.support.v4.media.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzas implements zzaq, Iterable<zzaq> {
    private final String zza;

    public zzas(String str) {
        if (str == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("툒"));
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.zza.equals(((zzas) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzaq> iterator() {
        return new zzau(this);
    }

    public final String toString() {
        String str = this.zza;
        String s4 = ProtectedSandApp.s("툓");
        return d.a(s4, str, s4);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return new zzas(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(p.f60679p);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return new zzav(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0353  */
    @Override // com.google.android.gms.internal.measurement.zzaq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.zzaq zza(java.lang.String r22, com.google.android.gms.internal.measurement.zzh r23, java.util.List<com.google.android.gms.internal.measurement.zzaq> r24) {
        /*
            Method dump skipped, instructions count: 1854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzas.zza(java.lang.String, com.google.android.gms.internal.measurement.zzh, java.util.List):com.google.android.gms.internal.measurement.zzaq");
    }
}
