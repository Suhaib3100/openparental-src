package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* loaded from: classes5.dex */
final class zzr extends zzs {
    zzr(int i4, int i5, Bundle bundle) {
        super(i4, i5, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.zzs
    final void zza(Bundle bundle) {
        if (bundle.getBoolean(ProtectedSandApp.s("줅"), false)) {
            zzd(null);
        } else {
            zzc(new zzt(4, ProtectedSandApp.s("줆"), null));
        }
    }

    @Override // com.google.android.gms.cloudmessaging.zzs
    final boolean zzb() {
        return true;
    }
}
