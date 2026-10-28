package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.m1;
import androidx.annotation.n1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzhf {
    final zzhy zza;

    zzhf(zznv zznvVar) {
        this.zza = zznvVar.zzk();
    }

    @n1
    @m1
    final Bundle zza(String str, com.google.android.gms.internal.measurement.zzbz zzbzVar) {
        this.zza.zzl().zzt();
        if (zzbzVar == null) {
            this.zza.zzj().zzu().zza(ProtectedSandApp.s("\udec5"));
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString(ProtectedSandApp.s("\udec6"), str);
        try {
            Bundle zza = zzbzVar.zza(bundle);
            if (zza != null) {
                return zza;
            }
            this.zza.zzj().zzg().zza(ProtectedSandApp.s("\udec7"));
            return null;
        } catch (Exception e4) {
            this.zza.zzj().zzg().zza(ProtectedSandApp.s("\udec8"), e4.getMessage());
            return null;
        }
    }

    @m1
    final boolean zza() {
        try {
            PackageManagerWrapper packageManager = Wrappers.packageManager(this.zza.zza());
            if (packageManager != null) {
                return packageManager.getPackageInfo(ProtectedSandApp.s("\udeca"), 128).versionCode >= 80837300;
            }
            this.zza.zzj().zzp().zza(ProtectedSandApp.s("\udec9"));
            return false;
        } catch (Exception e4) {
            this.zza.zzj().zzp().zza(ProtectedSandApp.s("\udecb"), e4);
            return false;
        }
    }
}
