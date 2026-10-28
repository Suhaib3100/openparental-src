package com.google.android.gms.internal.play_billing;

import android.support.v4.media.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Objects;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzs extends zzo {
    final /* synthetic */ zzt zzg;

    zzs(zzt zztVar) {
        Objects.requireNonNull(zztVar);
        this.zzg = zztVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzo
    protected final String zza() {
        zzp zzpVar = (zzp) this.zzg.zza.get();
        if (zzpVar == null) {
            return ProtectedSandApp.s("\ud988");
        }
        return d.a(ProtectedSandApp.s("\ud989"), String.valueOf(zzpVar.zza), ProtectedSandApp.s("\ud98a"));
    }
}
