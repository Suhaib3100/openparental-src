package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzaw {
    final List zza = new ArrayList();

    protected zzaw() {
    }

    public abstract zzap zza(String str, zzg zzgVar, List list);

    final zzap zzb(String str) {
        if (!this.zza.contains(zzh.zze(str))) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u0d0d"));
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("ഌ").concat(String.valueOf(str)));
    }
}
