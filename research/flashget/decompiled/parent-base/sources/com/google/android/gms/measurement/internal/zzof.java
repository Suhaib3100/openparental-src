package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
final class zzof implements zzor {
    final /* synthetic */ zznv zza;

    zzof(zznv zznvVar) {
        this.zza = zznvVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzor
    public final void zza(String str, String str2, Bundle bundle) {
        zzhy zzhyVar;
        zzhy zzhyVar2;
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzl().zzb(new zzoh(this, str, str2, bundle));
            return;
        }
        zzhyVar = this.zza.zzm;
        if (zzhyVar != null) {
            zzhyVar2 = this.zza.zzm;
            zzhyVar2.zzj().zzg().zza(ProtectedSandApp.s("\ue367"), str2);
        }
    }
}
