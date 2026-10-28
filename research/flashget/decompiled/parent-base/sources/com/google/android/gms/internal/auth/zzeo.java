package com.google.android.gms.internal.auth;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
final class zzeo {
    private static final zzem zza = new zzen();
    private static final zzem zzb;

    static {
        zzem zzemVar = null;
        try {
            zzemVar = (zzem) Class.forName(ProtectedSandApp.s("켳")).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zzb = zzemVar;
    }

    static zzem zza() {
        zzem zzemVar = zzb;
        if (zzemVar != null) {
            return zzemVar;
        }
        throw new IllegalStateException(ProtectedSandApp.s("켴"));
    }

    static zzem zzb() {
        return zza;
    }
}
