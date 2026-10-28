package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzaen {
    private static final zzaem zza;
    private static final zzaem zzb;

    static {
        zzaem zzaemVar = null;
        try {
            zzaemVar = (zzaem) Class.forName(ProtectedSandApp.s("\ue7ab")).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzaemVar;
        zzb = new zzaem();
    }

    static zzaem zza() {
        return zza;
    }

    static zzaem zzb() {
        return zzb;
    }
}
