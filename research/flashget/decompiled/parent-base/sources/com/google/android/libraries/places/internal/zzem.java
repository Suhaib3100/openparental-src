package com.google.android.libraries.places.internal;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzem {

    @q0
    private volatile String zza;

    @q0
    private volatile Locale zzb;
    private volatile boolean zzc;

    public final synchronized String zza() {
        zzha.zzi(zzf(), ProtectedSandApp.s("\ue94a"));
        if (this.zza == null) {
            throw null;
        }
        return this.zza;
    }

    public final synchronized Locale zzb() {
        try {
            zzha.zzi(zzf(), ProtectedSandApp.s("\ue94a"));
        } catch (Throwable th) {
            throw th;
        }
        return this.zzb == null ? Locale.getDefault() : this.zzb;
    }

    public final synchronized void zzc() {
        this.zza = null;
        this.zzb = null;
    }

    public final synchronized void zzd(String str, @q0 Locale locale, boolean z4) {
        zzha.zzc(str, ProtectedSandApp.s("\ue94b"));
        zzha.zze(!str.isEmpty(), ProtectedSandApp.s("\ue94c"));
        this.zza = str;
        this.zzb = locale;
        this.zzc = false;
    }

    public final boolean zze() {
        return false;
    }

    public final synchronized boolean zzf() {
        return this.zza != null;
    }
}
