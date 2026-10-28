package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzaex {
    private static final zzaew zza;
    private static final zzaew zzb;

    static {
        zzaew zzaewVar = null;
        try {
            zzaewVar = (zzaew) Class.forName(ProtectedSandApp.s("\ue7bf")).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzaewVar;
        zzb = new zzaew();
    }

    static zzaew zza() {
        return zza;
    }

    static zzaew zzb() {
        return zzb;
    }
}
