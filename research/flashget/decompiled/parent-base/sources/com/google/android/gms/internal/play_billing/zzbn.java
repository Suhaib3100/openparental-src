package com.google.android.gms.internal.play_billing;

import androidx.compose.material3.z3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzbn {
    private final zzbq zza;
    private boolean zzb;
    private long zzc;
    private long zzd;

    zzbn() {
        this.zza = zzbq.zzb();
    }

    public static zzbn zzb(zzbq zzbqVar) {
        zzbn zzbnVar = new zzbn(zzbqVar);
        zzbnVar.zze();
        return zzbnVar;
    }

    public static zzbn zzc(zzbq zzbqVar) {
        return new zzbn(zzbqVar);
    }

    private final long zzh() {
        return this.zzb ? (this.zza.zza() - this.zzd) + this.zzc : this.zzc;
    }

    public final String toString() {
        String s4;
        long zzh = zzh();
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(zzh, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(zzh, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(zzh, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(zzh, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(zzh, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(zzh, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        String format = String.format(Locale.ROOT, ProtectedSandApp.s("횘"), Double.valueOf(zzh / timeUnit2.convert(1L, timeUnit)));
        switch (zzbm.zza[timeUnit.ordinal()]) {
            case 1:
                s4 = ProtectedSandApp.s("횟");
                break;
            case 2:
                s4 = ProtectedSandApp.s("횞");
                break;
            case 3:
                s4 = ProtectedSandApp.s("횝");
                break;
            case 4:
                s4 = ProtectedSandApp.s("횜");
                break;
            case 5:
                s4 = ProtectedSandApp.s("횛");
                break;
            case 6:
                s4 = ProtectedSandApp.s("횚");
                break;
            case 7:
                s4 = ProtectedSandApp.s("횙");
                break;
            default:
                throw new AssertionError();
        }
        return z3.a(format, ProtectedSandApp.s("횠"), s4);
    }

    public final long zza(TimeUnit timeUnit) {
        return timeUnit.convert(zzh(), TimeUnit.NANOSECONDS);
    }

    public final zzbn zzd() {
        this.zzc = 0L;
        this.zzb = false;
        return this;
    }

    public final zzbn zze() {
        zzbl.zze(!this.zzb, ProtectedSandApp.s("횡"));
        this.zzb = true;
        this.zzd = this.zza.zza();
        return this;
    }

    public final zzbn zzf() {
        long zza = this.zza.zza();
        zzbl.zze(this.zzb, ProtectedSandApp.s("횢"));
        this.zzb = false;
        this.zzc = (zza - this.zzd) + this.zzc;
        return this;
    }

    public final boolean zzg() {
        return this.zzb;
    }

    zzbn(zzbq zzbqVar) {
        zzbl.zzc(zzbqVar, ProtectedSandApp.s("횗"));
        this.zza = zzbqVar;
    }
}
