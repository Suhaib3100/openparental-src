package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.n1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfg {
    final String zza;
    final /* synthetic */ zzfi zzb;
    private final String zzc;
    private final String zzd;
    private final long zze;

    /* synthetic */ zzfg(zzfi zzfiVar, String str, long j5, zzff zzffVar) {
        this.zzb = zzfiVar;
        Preconditions.checkNotEmpty(ProtectedSandApp.s("\u0f98"));
        Preconditions.checkArgument(j5 > 0);
        this.zza = ProtectedSandApp.s("ྙ");
        this.zzc = ProtectedSandApp.s("ྚ");
        this.zzd = ProtectedSandApp.s("ྛ");
        this.zze = j5;
    }

    @n1
    private final long zzc() {
        return this.zzb.zza().getLong(this.zza, 0L);
    }

    @n1
    private final void zzd() {
        this.zzb.zzg();
        long currentTimeMillis = this.zzb.zzt.zzax().currentTimeMillis();
        SharedPreferences.Editor edit = this.zzb.zza().edit();
        edit.remove(this.zzc);
        edit.remove(this.zzd);
        edit.putLong(this.zza, currentTimeMillis);
        edit.apply();
    }

    @n1
    public final Pair zza() {
        long abs;
        this.zzb.zzg();
        this.zzb.zzg();
        long zzc = zzc();
        if (zzc == 0) {
            zzd();
            abs = 0;
        } else {
            abs = Math.abs(zzc - this.zzb.zzt.zzax().currentTimeMillis());
        }
        long j5 = this.zze;
        if (abs < j5) {
            return null;
        }
        if (abs > j5 + j5) {
            zzd();
            return null;
        }
        String string = this.zzb.zza().getString(this.zzd, null);
        long j6 = this.zzb.zza().getLong(this.zzc, 0L);
        zzd();
        return (string == null || j6 <= 0) ? zzfi.zza : new Pair(string, Long.valueOf(j6));
    }

    @n1
    public final void zzb(String str, long j5) {
        this.zzb.zzg();
        if (zzc() == 0) {
            zzd();
        }
        if (str == null) {
            str = "";
        }
        long j6 = this.zzb.zza().getLong(this.zzc, 0L);
        if (j6 <= 0) {
            SharedPreferences.Editor edit = this.zzb.zza().edit();
            edit.putString(this.zzd, str);
            edit.putLong(this.zzc, 1L);
            edit.apply();
            return;
        }
        long nextLong = this.zzb.zzt.zzv().zzG().nextLong() & Long.MAX_VALUE;
        long j7 = j6 + 1;
        long j8 = Long.MAX_VALUE / j7;
        SharedPreferences.Editor edit2 = this.zzb.zza().edit();
        if (nextLong < j8) {
            edit2.putString(this.zzd, str);
        }
        edit2.putLong(this.zzc, j7);
        edit2.apply();
    }
}
