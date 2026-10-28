package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
final class zzkq {
    private static final zzko zza = new zzkp();
    private static final zzko zzb;

    static {
        zzko zzkoVar;
        try {
            zzkoVar = (zzko) Class.forName(ProtectedSandApp.s("ෑ")).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzkoVar = null;
        }
        zzb = zzkoVar;
    }

    static zzko zza() {
        zzko zzkoVar = zzb;
        if (zzkoVar != null) {
            return zzkoVar;
        }
        throw new IllegalStateException(ProtectedSandApp.s("ි"));
    }

    static zzko zzb() {
        return zza;
    }
}
