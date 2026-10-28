package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzah implements zzap {
    private final Double zza;

    public zzah(Double d6) {
        if (d6 == null) {
            this.zza = Double.valueOf(Double.NaN);
        } else {
            this.zza = d6;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzah) {
            return this.zza.equals(((zzah) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbU(String str, zzg zzgVar, List list) {
        if (ProtectedSandApp.s("⋚").equals(str)) {
            return new zzat(zzi());
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("⋛"), zzi(), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzah(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        boolean z5 = false;
        if (!Double.isNaN(this.zza.doubleValue()) && this.zza.doubleValue() != p.f18289o) {
            z5 = true;
        }
        return Boolean.valueOf(z5);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        if (Double.isNaN(this.zza.doubleValue())) {
            return ProtectedSandApp.s("⋜");
        }
        if (Double.isInfinite(this.zza.doubleValue())) {
            return this.zza.doubleValue() > p.f18289o ? ProtectedSandApp.s("⋝") : ProtectedSandApp.s("⋞");
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.zza.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat(ProtectedSandApp.s("⋟"));
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((stripTrailingZeros.scale() > 0 ? stripTrailingZeros.precision() : stripTrailingZeros.scale()) - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        String s5 = ProtectedSandApp.s("⋠");
        int indexOf = format.indexOf(s5);
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace(ProtectedSandApp.s("⋡"), ProtectedSandApp.s("⋢")).replace(s5, ProtectedSandApp.s("⋣")) : stripTrailingZeros.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return null;
    }
}
