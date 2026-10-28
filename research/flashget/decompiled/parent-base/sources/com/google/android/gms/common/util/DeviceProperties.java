package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.apps.common.proguard.SideEffectFree;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public final class DeviceProperties {

    @q0
    private static Boolean zza;

    @q0
    private static Boolean zzb;

    @q0
    private static Boolean zzc;

    @q0
    private static Boolean zzd;

    @q0
    private static Boolean zze;

    @q0
    private static Boolean zzf;

    @q0
    private static Boolean zzg;

    @q0
    private static Boolean zzh;

    @q0
    private static Boolean zzi;

    @q0
    private static Boolean zzj;

    @q0
    private static Boolean zzk;

    @q0
    private static Boolean zzl;

    @q0
    private static Boolean zzm;

    @q0
    private static Boolean zzn;

    @q0
    private static Boolean zzo;

    @q0
    private static Boolean zzp;

    @q0
    private static Boolean zzq;

    private DeviceProperties() {
    }

    @SideEffectFree
    @KeepForSdk
    public static boolean isAuto(@o0 Context context) {
        return zze(context.getPackageManager());
    }

    @SideEffectFree
    @KeepForSdk
    public static boolean isBstar(@o0 Context context) {
        if (zzo == null) {
            boolean z4 = false;
            if (PlatformVersion.isAtLeastR() && context.getPackageManager().hasSystemFeature(ProtectedSandApp.s("쯙"))) {
                z4 = true;
            }
            zzo = Boolean.valueOf(z4);
        }
        return zzo.booleanValue();
    }

    @KeepForSdk
    public static boolean isFoldable(@o0 Context context) {
        if (zzd == null) {
            boolean z4 = false;
            if (PlatformVersion.isAtLeastR() && context.getPackageManager().hasSystemFeature(ProtectedSandApp.s("쯚"))) {
                z4 = true;
            }
            zzd = Boolean.valueOf(z4);
        }
        return zzd.booleanValue();
    }

    @KeepForSdk
    public static boolean isLatchsky(@o0 Context context) {
        if (zzh == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z4 = false;
            if (packageManager.hasSystemFeature(ProtectedSandApp.s("쯛")) && packageManager.hasSystemFeature(ProtectedSandApp.s("쯜"))) {
                z4 = true;
            }
            zzh = Boolean.valueOf(z4);
        }
        return zzh.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        if (com.google.android.gms.common.util.DeviceProperties.zzq.booleanValue() == false) goto L37;
     */
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isPhone(@androidx.annotation.o0 android.content.Context r4) {
        /*
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zza
            if (r0 != 0) goto L9e
            boolean r0 = isFoldable(r4)
            r1 = 1
            if (r0 != 0) goto L98
            boolean r0 = isTablet(r4)
            r2 = 0
            if (r0 != 0) goto L97
            boolean r0 = isWearable(r4)
            if (r0 != 0) goto L97
            boolean r0 = zzd(r4)
            if (r0 != 0) goto L97
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzk
            if (r0 != 0) goto L36
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r3 = "쯝"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            boolean r0 = r0.hasSystemFeature(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.google.android.gms.common.util.DeviceProperties.zzk = r0
        L36:
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzk
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L97
            boolean r0 = isAuto(r4)
            if (r0 != 0) goto L97
            boolean r0 = isTv(r4)
            if (r0 != 0) goto L97
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzn
            if (r0 != 0) goto L62
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r3 = "쯞"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            boolean r0 = r0.hasSystemFeature(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.google.android.gms.common.util.DeviceProperties.zzn = r0
        L62:
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzn
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L97
            boolean r0 = isBstar(r4)
            if (r0 != 0) goto L97
            boolean r0 = isXr(r4)
            if (r0 != 0) goto L97
            java.lang.Boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzq
            if (r0 != 0) goto L8e
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r0 = "쯟"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            boolean r4 = r4.hasSystemFeature(r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            com.google.android.gms.common.util.DeviceProperties.zzq = r4
        L8e:
            java.lang.Boolean r4 = com.google.android.gms.common.util.DeviceProperties.zzq
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L97
            goto L98
        L97:
            r1 = r2
        L98:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            com.google.android.gms.common.util.DeviceProperties.zza = r4
        L9e:
            java.lang.Boolean r4 = com.google.android.gms.common.util.DeviceProperties.zza
            boolean r4 = r4.booleanValue()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.DeviceProperties.isPhone(android.content.Context):boolean");
    }

    @KeepForSdk
    public static boolean isPhoneGo(@o0 Context context) {
        ActivityManager activityManager;
        boolean z4 = false;
        if (context == null) {
            return false;
        }
        if (zzb == null) {
            if (isPhone(context)) {
                if (zzi == null && (activityManager = (ActivityManager) context.getSystemService(ProtectedSandApp.s("쯠"))) != null) {
                    zzi = Boolean.valueOf(activityManager.isLowRamDevice());
                }
                if (Objects.equal(zzi, Boolean.TRUE) && Build.VERSION.SDK_INT >= 27) {
                    z4 = true;
                }
            }
            zzb = Boolean.valueOf(z4);
        }
        return zzb.booleanValue();
    }

    @KeepForSdk
    public static boolean isSevenInchTablet(@o0 Context context) {
        return zza(context.getResources());
    }

    @KeepForSdk
    public static boolean isSidewinder(@o0 Context context) {
        return zzc(context);
    }

    @KeepForSdk
    public static boolean isTablet(@o0 Context context) {
        return isTablet(context.getResources());
    }

    @SideEffectFree
    @KeepForSdk
    public static boolean isTv(@o0 Context context) {
        return zzf(context.getPackageManager());
    }

    @KeepForSdk
    public static boolean isUserBuild() {
        int i4 = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return ProtectedSandApp.s("쯡").equals(Build.TYPE);
    }

    @SideEffectFree
    @KeepForSdk
    public static boolean isWearable(@o0 Context context) {
        return zzb(context.getPackageManager());
    }

    @KeepForSdk
    @TargetApi(26)
    public static boolean isWearableWithoutPlayStore(@o0 Context context) {
        if (isWearable(context) && !PlatformVersion.isAtLeastN()) {
            return true;
        }
        if (zzc(context)) {
            return !PlatformVersion.isAtLeastO() || PlatformVersion.isAtLeastR();
        }
        return false;
    }

    @SideEffectFree
    @KeepForSdk
    public static boolean isXr(@o0 Context context) {
        return zzg(context.getPackageManager());
    }

    public static boolean zza(@o0 Resources resources) {
        boolean z4 = false;
        if (resources == null) {
            return false;
        }
        if (zze == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z4 = true;
            }
            zze = Boolean.valueOf(z4);
        }
        return zze.booleanValue();
    }

    @SideEffectFree
    public static boolean zzb(@o0 PackageManager packageManager) {
        if (zzf == null) {
            zzf = Boolean.valueOf(packageManager.hasSystemFeature(ProtectedSandApp.s("쯢")));
        }
        return zzf.booleanValue();
    }

    public static boolean zzc(@o0 Context context) {
        if (zzg == null) {
            zzg = Boolean.valueOf(context.getPackageManager().hasSystemFeature(ProtectedSandApp.s("쯣")));
        }
        return zzg.booleanValue();
    }

    public static boolean zzd(@o0 Context context) {
        if (zzj == null) {
            zzj = Boolean.valueOf(PlatformVersion.isAtLeastO() ? context.getPackageManager().hasSystemFeature(ProtectedSandApp.s("쯤")) : context.getPackageManager().hasSystemFeature(ProtectedSandApp.s("쯥")));
        }
        return zzj.booleanValue();
    }

    @SideEffectFree
    public static boolean zze(@o0 PackageManager packageManager) {
        if (zzl == null) {
            boolean z4 = false;
            if (PlatformVersion.isAtLeastO() && packageManager.hasSystemFeature(ProtectedSandApp.s("쯦"))) {
                z4 = true;
            }
            zzl = Boolean.valueOf(z4);
        }
        return zzl.booleanValue();
    }

    @SideEffectFree
    public static boolean zzf(@o0 PackageManager packageManager) {
        if (zzm == null) {
            boolean z4 = true;
            if (!packageManager.hasSystemFeature(ProtectedSandApp.s("쯧")) && !packageManager.hasSystemFeature(ProtectedSandApp.s("쯨")) && !packageManager.hasSystemFeature(ProtectedSandApp.s("쯩")) && !packageManager.hasSystemFeature(ProtectedSandApp.s("쯞"))) {
                z4 = false;
            }
            zzm = Boolean.valueOf(z4);
        }
        return zzm.booleanValue();
    }

    @SideEffectFree
    public static boolean zzg(@o0 PackageManager packageManager) {
        if (zzp == null) {
            zzp = Boolean.valueOf(packageManager.hasSystemFeature(ProtectedSandApp.s("쯪")));
        }
        return zzp.booleanValue();
    }

    @KeepForSdk
    public static boolean isTablet(@o0 Resources resources) {
        if (resources == null) {
            return false;
        }
        if (zzc == null) {
            zzc = Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || zza(resources));
        }
        return zzc.booleanValue();
    }
}
