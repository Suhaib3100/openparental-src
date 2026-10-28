package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import androidx.annotation.b0;
import androidx.annotation.k;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public class zzgs {

    @q0
    @b0("DirectBootUtils.class")
    private static UserManager zza;
    private static volatile boolean zzb = !zza();

    private zzgs() {
    }

    @k(api = 24)
    public static boolean zza() {
        return true;
    }

    public static boolean zzb(Context context) {
        return !zza() || zzc(context);
    }

    @TargetApi(24)
    @x0(24)
    private static boolean zzc(Context context) {
        if (zzb) {
            return true;
        }
        synchronized (zzgs.class) {
            try {
                if (zzb) {
                    return true;
                }
                boolean zzd = zzd(context);
                if (zzd) {
                    zzb = zzd;
                }
                return zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @b0("DirectBootUtils.class")
    @TargetApi(24)
    @x0(24)
    private static boolean zzd(Context context) {
        boolean z4;
        boolean z5 = true;
        int i4 = 1;
        while (true) {
            z4 = false;
            if (i4 > 2) {
                break;
            }
            if (zza == null) {
                zza = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = zza;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked()) {
                    break;
                }
                if (userManager.isUserRunning(Process.myUserHandle())) {
                    z5 = false;
                }
            } catch (NullPointerException unused) {
                zza = null;
                i4++;
            }
        }
        z4 = z5;
        if (z4) {
            zza = null;
        }
        return z4;
    }

    public static boolean zza(Context context) {
        return zza() && !zzc(context);
    }
}
