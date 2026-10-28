package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.m1;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.ShowFirstParty;
import zc.h;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@ShowFirstParty
/* loaded from: classes5.dex */
public class zzy {
    private static final zzy zze = new zzy(true, 3, 1, null, null, -1);
    final boolean zza;

    @h
    final String zzb;

    @h
    final Throwable zzc;
    final int zzd;

    private zzy(boolean z4, int i4, int i5, @h String str, @h Throwable th, long j4) {
        this.zza = z4;
        this.zzd = i4;
        this.zzb = str;
        this.zzc = th;
    }

    @Deprecated
    static zzy zzb() {
        return zze;
    }

    static zzy zzc(@o0 String str) {
        return new zzy(false, 1, 5, str, null, -1L);
    }

    static zzy zzd(@o0 String str, @o0 Throwable th) {
        return new zzy(false, 1, 5, str, th, -1L);
    }

    @m1(otherwise = 3)
    public static zzy zzf(int i4, long j4) {
        return new zzy(true, i4, 1, null, null, j4);
    }

    static zzy zzg(int i4, int i5, @o0 String str, @h Throwable th) {
        return new zzy(false, i4, i5, str, th, -1L);
    }

    @h
    String zza() {
        return this.zzb;
    }

    final void zze() {
        if (this.zza || !Log.isLoggable(ProtectedSandApp.s("챑"), 3)) {
            return;
        }
        if (this.zzc != null) {
            zza();
        } else {
            zza();
        }
    }

    /* synthetic */ zzy(boolean z4, int i4, int i5, String str, Throwable th, long j4, byte[] bArr) {
        this(false, 1, 5, null, null, -1L);
    }
}
