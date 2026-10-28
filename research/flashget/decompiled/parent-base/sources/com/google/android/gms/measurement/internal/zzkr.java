package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zzkr implements zzor {
    private final /* synthetic */ zzjq zza;

    zzkr(zzjq zzjqVar) {
        this.zza = zzjqVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzor
    public final void zza(String str, String str2, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String s4 = ProtectedSandApp.s("\ue137");
        if (isEmpty) {
            this.zza.zzb(s4, str2, bundle);
        } else {
            this.zza.zza(s4, str2, bundle, str);
        }
    }
}
