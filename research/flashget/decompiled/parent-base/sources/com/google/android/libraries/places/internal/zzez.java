package com.google.android.libraries.places.internal;

import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzez {
    private final Context zza;

    public zzez(Context context) {
        zzha.zzc(context, ProtectedSandApp.s("\ue967"));
        this.zza = context;
    }

    public final zzhv zza() {
        String packageName = this.zza.getPackageName();
        String zza = zzeo.zza(this.zza.getPackageManager(), packageName);
        zzhu zzhuVar = new zzhu();
        if (packageName != null) {
            zzhuVar.zza(ProtectedSandApp.s("\ue968"), packageName);
        }
        if (zza != null) {
            zzhuVar.zza(ProtectedSandApp.s("\ue969"), zza);
        }
        return zzhuVar.zzb();
    }
}
