package com.android.billingclient.api;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzer;
import com.google.android.gms.internal.play_billing.zzes;
import com.google.android.gms.internal.play_billing.zzim;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class r4 {
    static Bundle a(zzes zzesVar, zzim zzimVar) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(ProtectedSandApp.s("ք"), zzesVar.zzQ());
        bundle.putByteArray(ProtectedSandApp.s("օ"), zzimVar.zzQ());
        return bundle;
    }

    static zzes b(String str, int i4, Context context, String str2) {
        String str3;
        zzer zza = zzes.zza();
        zza.zzd(ProtectedSandApp.s("ֆ"));
        zza.zze(24);
        zza.zzb(context.getPackageName());
        zza.zzc(str2);
        try {
            str3 = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            zzc.zzn(ProtectedSandApp.s("և"), ProtectedSandApp.s("ֈ"));
            str3 = null;
        }
        if (str3 != null) {
            zza.zza(str3);
        }
        return (zzes) zza.zzi();
    }
}
