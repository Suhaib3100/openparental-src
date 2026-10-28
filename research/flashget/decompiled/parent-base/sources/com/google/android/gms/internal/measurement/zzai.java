package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzai implements zzaq {
    private final Double zza;

    public zzai(Double d5) {
        if (d5 == null) {
            this.zza = Double.valueOf(Double.NaN);
        } else {
            this.zza = d5;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzai) {
            return this.zza.equals(((zzai) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        if (ProtectedSandApp.s("퇸").equals(str)) {
            return new zzas(zzf());
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("퇹"), zzf(), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return new zzai(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return Boolean.valueOf((Double.isNaN(this.zza.doubleValue()) || this.zza.doubleValue() == p.f60679p) ? false : true);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        if (Double.isNaN(this.zza.doubleValue())) {
            return ProtectedSandApp.s("퇺");
        }
        if (Double.isInfinite(this.zza.doubleValue())) {
            return this.zza.doubleValue() > p.f60679p ? ProtectedSandApp.s("퇻") : ProtectedSandApp.s("퇼");
        }
        BigDecimal valueOf = BigDecimal.valueOf(this.zza.doubleValue());
        BigDecimal bigDecimal = valueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : a.a(valueOf);
        DecimalFormat decimalFormat = new DecimalFormat(ProtectedSandApp.s("퇽"));
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String format = decimalFormat.format(bigDecimal);
        String s4 = ProtectedSandApp.s("퇾");
        int indexOf = format.indexOf(s4);
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace(ProtectedSandApp.s("퇿"), ProtectedSandApp.s("툀")).replace(s4, ProtectedSandApp.s("툁")) : bigDecimal.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return null;
    }
}
