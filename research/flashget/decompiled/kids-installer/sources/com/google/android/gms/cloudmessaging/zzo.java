package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes3.dex */
final class zzo extends zzp<Void> {
    zzo(int i5, int i6, Bundle bundle) {
        super(i5, 2, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.zzp
    final void zza(Bundle bundle) {
        if (bundle.getBoolean(ProtectedSandApp.s("ℯ"), false)) {
            zzd(null);
        } else {
            zzc(new zzq(4, ProtectedSandApp.s("ℰ"), null));
        }
    }

    @Override // com.google.android.gms.cloudmessaging.zzp
    final boolean zzb() {
        return true;
    }
}
