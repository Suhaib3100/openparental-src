package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzhy {
    private final boolean zza;

    public zzhy(zzhx zzhxVar) {
        l0.F(zzhxVar, ProtectedSandApp.s("풖"));
        this.zza = !zzhxVar.zza();
    }

    public final boolean zza(String str) {
        l0.F(str, ProtectedSandApp.s("풗"));
        if (this.zza) {
            return zzia.zza.get().containsValue(str);
        }
        return true;
    }
}
