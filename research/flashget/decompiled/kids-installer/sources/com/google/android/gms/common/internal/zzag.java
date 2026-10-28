package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzag {
    private static final Object zza = new Object();

    @GuardedBy("sLock")
    private static boolean zzb;

    @q0
    private static String zzc;
    private static int zzd;

    public static int zza(Context context) {
        zzc(context);
        return zzd;
    }

    @q0
    public static String zzb(Context context) {
        zzc(context);
        return zzc;
    }

    private static void zzc(Context context) {
        Bundle bundle;
        synchronized (zza) {
            if (zzb) {
                return;
            }
            zzb = true;
            try {
                bundle = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e6) {
                Log.wtf(ProtectedSandApp.s("\u0bba"), ProtectedSandApp.s("\u0bbb"), e6);
            }
            if (bundle == null) {
                return;
            }
            zzc = bundle.getString(ProtectedSandApp.s("ஸ"));
            zzd = bundle.getInt(ProtectedSandApp.s("ஹ"));
        }
    }
}
