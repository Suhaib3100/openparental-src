package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public final class zzae {
    private static final Object zza = new Object();
    private static boolean zzb;

    @q0
    private static String zzc;
    private static int zzd;

    @q0
    public static String zza(Context context) {
        zzc(context);
        return zzc;
    }

    public static int zzb(Context context) {
        zzc(context);
        return zzd;
    }

    private static void zzc(Context context) {
        Bundle bundle;
        synchronized (zza) {
            try {
                if (zzb) {
                    return;
                }
                zzb = true;
                try {
                    bundle = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e4) {
                    Log.wtf(ProtectedSandApp.s("쭅"), ProtectedSandApp.s("쭆"), e4);
                }
                if (bundle == null) {
                    return;
                }
                zzc = bundle.getString(ProtectedSandApp.s("쭃"));
                zzd = bundle.getInt(ProtectedSandApp.s("쭄"));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
