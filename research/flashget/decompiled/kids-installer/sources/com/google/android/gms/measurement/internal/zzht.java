package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzht implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzik zzb;

    zzht(zzik zzikVar, Bundle bundle) {
        this.zzb = zzikVar;
        this.zza = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String s5 = ProtectedSandApp.s("ᄇ");
        zzik zzikVar = this.zzb;
        Bundle bundle = this.zza;
        zzikVar.zzg();
        zzikVar.zza();
        Preconditions.checkNotNull(bundle);
        String string = bundle.getString(ProtectedSandApp.s("ᄈ"));
        String string2 = bundle.getString(ProtectedSandApp.s("ᄉ"));
        Preconditions.checkNotEmpty(string);
        Preconditions.checkNotEmpty(string2);
        String s6 = ProtectedSandApp.s("ᄊ");
        Preconditions.checkNotNull(bundle.get(s6));
        if (!zzikVar.zzt.zzJ()) {
            c.a(zzikVar.zzt, ProtectedSandApp.s("ᄋ"));
            return;
        }
        zzlk zzlkVar = new zzlk(string, bundle.getLong(ProtectedSandApp.s("ᄌ")), bundle.get(s6), string2);
        try {
            zzau zzz = zzikVar.zzt.zzv().zzz(bundle.getString(s5), bundle.getString(ProtectedSandApp.s("ᄍ")), bundle.getBundle(ProtectedSandApp.s("ᄎ")), string2, 0L, true, true);
            zzikVar.zzt.zzt().zzE(new zzac(bundle.getString(s5), string2, zzlkVar, bundle.getLong(ProtectedSandApp.s("ᄓ")), false, bundle.getString(ProtectedSandApp.s("ᄔ")), zzikVar.zzt.zzv().zzz(bundle.getString(s5), bundle.getString(ProtectedSandApp.s("ᄏ")), bundle.getBundle(ProtectedSandApp.s("ᄐ")), string2, 0L, true, true), bundle.getLong(ProtectedSandApp.s("ᄕ")), zzz, bundle.getLong(ProtectedSandApp.s("ᄖ")), zzikVar.zzt.zzv().zzz(bundle.getString(s5), bundle.getString(ProtectedSandApp.s("ᄑ")), bundle.getBundle(ProtectedSandApp.s("ᄒ")), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
