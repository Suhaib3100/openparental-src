package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes3.dex */
final class zzlc implements zzlo {
    final /* synthetic */ zzlh zza;

    zzlc(zzlh zzlhVar) {
        this.zza = zzlhVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlo
    public final void zza(String str, String str2, Bundle bundle) {
        zzgd zzgdVar;
        zzgd zzgdVar2;
        boolean isEmpty = TextUtils.isEmpty(str);
        String s5 = ProtectedSandApp.s("┉");
        if (!isEmpty) {
            this.zza.zzaB().zzp(new zzlb(this, str, s5, bundle));
            return;
        }
        zzlh zzlhVar = this.zza;
        zzgdVar = zzlhVar.zzn;
        if (zzgdVar != null) {
            zzgdVar2 = zzlhVar.zzn;
            zzgdVar2.zzaA().zzd().zzb(ProtectedSandApp.s("┊"), s5);
        }
    }
}
