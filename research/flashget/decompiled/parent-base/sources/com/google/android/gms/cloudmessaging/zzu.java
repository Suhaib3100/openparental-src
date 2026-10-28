package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* loaded from: classes5.dex */
final class zzu extends zzs {
    zzu(int i4, int i5, Bundle bundle) {
        super(i4, i5, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.zzs
    final void zza(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(ProtectedSandApp.s("줇"));
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        zzd(bundle2);
    }

    @Override // com.google.android.gms.cloudmessaging.zzs
    final boolean zzb() {
        return false;
    }
}
