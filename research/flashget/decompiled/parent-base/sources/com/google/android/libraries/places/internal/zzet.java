package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import b9.c;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
@c
/* loaded from: classes5.dex */
public abstract class zzet {
    public static zzes zzd(Context context) {
        String packageName = context.getPackageName();
        int i4 = 0;
        try {
            i4 = context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        zzep zzepVar = new zzep();
        zzepVar.zza(packageName);
        zzepVar.zzb(i4);
        zzepVar.zzd(1);
        return zzepVar;
    }

    public abstract int zza();

    public abstract String zzb();

    public abstract int zzc();
}
