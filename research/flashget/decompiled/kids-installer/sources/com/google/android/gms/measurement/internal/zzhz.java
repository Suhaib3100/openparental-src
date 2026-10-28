package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes3.dex */
final class zzhz implements zzlo {
    final /* synthetic */ zzik zza;

    zzhz(zzik zzikVar) {
        this.zza = zzikVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlo
    public final void zza(String str, String str2, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String s5 = ProtectedSandApp.s("⓱");
        String s6 = ProtectedSandApp.s("⓲");
        if (isEmpty) {
            this.zza.zzD(s5, s6, bundle);
        } else {
            this.zza.zzF(s5, s6, bundle, str);
        }
    }
}
