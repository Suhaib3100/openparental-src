package com.google.android.gms.measurement.internal;

import androidx.annotation.m1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfl {
    final zzgd zza;

    zzfl(zzlh zzlhVar) {
        this.zza = zzlhVar.zzp();
    }

    @m1
    final boolean zza() {
        try {
            PackageManagerWrapper packageManager = Wrappers.packageManager(this.zza.zzaw());
            if (packageManager != null) {
                return packageManager.getPackageInfo(ProtectedSandApp.s("ྸ"), 128).versionCode >= 80837300;
            }
            this.zza.zzaA().zzj().zza(ProtectedSandApp.s("ྷ"));
            return false;
        } catch (Exception e6) {
            this.zza.zzaA().zzj().zzb(ProtectedSandApp.s("ྐྵ"), e6);
            return false;
        }
    }
}
