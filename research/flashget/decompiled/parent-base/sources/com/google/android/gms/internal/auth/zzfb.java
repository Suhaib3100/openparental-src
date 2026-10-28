package com.google.android.gms.internal.auth;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
public final class zzfb extends IOException {
    private zzfx zza;

    public zzfb(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    static zzfb zza() {
        return new zzfb(ProtectedSandApp.s("콈"));
    }

    static zzfb zzb() {
        return new zzfb(ProtectedSandApp.s("콉"));
    }

    static zzfb zzc() {
        return new zzfb(ProtectedSandApp.s("콊"));
    }

    static zzfb zzd() {
        return new zzfb(ProtectedSandApp.s("콋"));
    }

    static zzfb zzf() {
        return new zzfb(ProtectedSandApp.s("콌"));
    }

    public final zzfb zze(zzfx zzfxVar) {
        this.zza = zzfxVar;
        return this;
    }

    public zzfb(String str) {
        super(str);
        this.zza = null;
    }
}
