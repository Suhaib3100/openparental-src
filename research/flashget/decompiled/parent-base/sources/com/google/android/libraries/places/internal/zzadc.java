package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzadc {
    private static final zzada zza = new zzadb();
    private static final zzada zzb;

    static {
        zzada zzadaVar = null;
        try {
            zzadaVar = (zzada) Class.forName(ProtectedSandApp.s("\ue74e")).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zzb = zzadaVar;
    }

    static zzada zza() {
        zzada zzadaVar = zzb;
        if (zzadaVar != null) {
            return zzadaVar;
        }
        throw new IllegalStateException(ProtectedSandApp.s("\ue74f"));
    }

    static zzada zzb() {
        return zza;
    }
}
