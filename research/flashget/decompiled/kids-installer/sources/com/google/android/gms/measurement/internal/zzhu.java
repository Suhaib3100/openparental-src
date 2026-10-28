package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzhu implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzik zzb;

    zzhu(zzik zzikVar, Bundle bundle) {
        this.zzb = zzikVar;
        this.zza = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String s5 = ProtectedSandApp.s("ᄗ");
        String s6 = ProtectedSandApp.s("ᄘ");
        zzik zzikVar = this.zzb;
        Bundle bundle = this.zza;
        zzikVar.zzg();
        zzikVar.zza();
        Preconditions.checkNotNull(bundle);
        String checkNotEmpty = Preconditions.checkNotEmpty(bundle.getString(ProtectedSandApp.s("ᄙ")));
        if (!zzikVar.zzt.zzJ()) {
            c.a(zzikVar.zzt, ProtectedSandApp.s("ᄚ"));
            return;
        }
        try {
            zzikVar.zzt.zzt().zzE(new zzac(bundle.getString(s6), "", new zzlk(checkNotEmpty, 0L, null, ""), bundle.getLong(s5), bundle.getBoolean(ProtectedSandApp.s("ᄝ")), bundle.getString(ProtectedSandApp.s("ᄞ")), null, bundle.getLong(ProtectedSandApp.s("ᄟ")), null, bundle.getLong(ProtectedSandApp.s("ᄠ")), zzikVar.zzt.zzv().zzz(bundle.getString(s6), bundle.getString(ProtectedSandApp.s("ᄛ")), bundle.getBundle(ProtectedSandApp.s("ᄜ")), "", bundle.getLong(s5), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
