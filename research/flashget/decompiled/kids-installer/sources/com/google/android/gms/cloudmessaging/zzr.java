package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes3.dex */
final class zzr extends zzp<Bundle> {
    zzr(int i5, int i6, Bundle bundle) {
        super(i5, 1, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.zzp
    final void zza(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(ProtectedSandApp.s("ℱ"));
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        zzd(bundle2);
    }

    @Override // com.google.android.gms.cloudmessaging.zzp
    final boolean zzb() {
        return false;
    }
}
