package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
enum zzfh {
    zza,
    zzb,
    zzc,
    zzd;

    static /* bridge */ /* synthetic */ zzfh zza(Object obj) {
        if (obj instanceof String) {
            return zzb;
        }
        if (obj instanceof Boolean) {
            return zza;
        }
        if (obj instanceof Long) {
            return zzc;
        }
        if (obj instanceof Double) {
            return zzd;
        }
        throw new AssertionError(ProtectedSandApp.s("큥").concat(String.valueOf(obj.getClass())));
    }
}
