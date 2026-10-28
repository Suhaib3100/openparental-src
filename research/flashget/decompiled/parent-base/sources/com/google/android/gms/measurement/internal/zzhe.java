package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.n1;
import androidx.compose.runtime.changelist.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import d9.d;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzhe {

    @d
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final /* synthetic */ zzha zze;

    @n1
    private final long zzb() {
        return this.zze.zzg().getLong(this.zza, 0L);
    }

    @n1
    private final void zzc() {
        this.zze.zzt();
        long currentTimeMillis = this.zze.zzb().currentTimeMillis();
        SharedPreferences.Editor edit = this.zze.zzg().edit();
        edit.remove(this.zzb);
        edit.remove(this.zzc);
        edit.putLong(this.zza, currentTimeMillis);
        edit.apply();
    }

    @n1
    public final Pair<String, Long> zza() {
        long abs;
        this.zze.zzt();
        this.zze.zzt();
        long zzb = zzb();
        if (zzb == 0) {
            zzc();
            abs = 0;
        } else {
            abs = Math.abs(zzb - this.zze.zzb().currentTimeMillis());
        }
        long j4 = this.zzd;
        if (abs < j4) {
            return null;
        }
        if (abs > (j4 << 1)) {
            zzc();
            return null;
        }
        String string = this.zze.zzg().getString(this.zzc, null);
        long j5 = this.zze.zzg().getLong(this.zzb, 0L);
        zzc();
        return (string == null || j5 <= 0) ? zzha.zza : new Pair<>(string, Long.valueOf(j5));
    }

    private zzhe(zzha zzhaVar, String str, long j4) {
        this.zze = zzhaVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(j4 > 0);
        this.zza = str + ProtectedSandApp.s("\udec2");
        this.zzb = j.a(str, ProtectedSandApp.s("\udec3"));
        this.zzc = j.a(str, ProtectedSandApp.s("\udec4"));
        this.zzd = j4;
    }

    @n1
    public final void zza(String str, long j4) {
        this.zze.zzt();
        if (zzb() == 0) {
            zzc();
        }
        if (str == null) {
            str = "";
        }
        long j5 = this.zze.zzg().getLong(this.zzb, 0L);
        if (j5 <= 0) {
            SharedPreferences.Editor edit = this.zze.zzg().edit();
            edit.putString(this.zzc, str);
            edit.putLong(this.zzb, 1L);
            edit.apply();
            return;
        }
        long j6 = j5 + 1;
        boolean z4 = (this.zze.zzq().zzv().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j6;
        SharedPreferences.Editor edit2 = this.zze.zzg().edit();
        if (z4) {
            edit2.putString(this.zzc, str);
        }
        edit2.putLong(this.zzb, j6);
        edit2.apply();
    }
}
