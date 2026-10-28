package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
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

    private DeviceProperties() {
    }

    @KeepForSdk
    public static boolean isAuto(@o0 Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (zzi == null) {
            boolean z5 = false;
            if (PlatformVersion.isAtLeastO() && packageManager.hasSystemFeature(ProtectedSandApp.s("ృ"))) {
                z5 = true;
            }
            zzi = Boolean.valueOf(z5);
        }
        return zzi.booleanValue();
    }

    @KeepForSdk
    public static boolean isBstar(@o0 Context context) {
        if (zzl == null) {
            boolean z5 = false;
            if (PlatformVersion.isAtLeastR() && context.getPackageManager().hasSystemFeature(ProtectedSandApp.s("ౄ"))) {
                z5 = true;
            }
            zzl = Boolean.valueOf(z5);
        }
        return zzl.booleanValue();
    }

    @KeepForSdk
    public static boolean isLatchsky(@o0 Context context) {
        if (zzf == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z5 = false;
            if (packageManager.hasSystemFeature(ProtectedSandApp.s("\u0c45")) && packageManager.hasSystemFeature(ProtectedSandApp.s("ె"))) {
                z5 = true;
            }
            zzf = Boolean.valueOf(z5);
        }
        return zzf.booleanValue();
    }

    @KeepForSdk
    public static boolean isPhone(@o0 Context context) {
        if (zza == null) {
            boolean z5 = false;
            if (!isTablet(context) && !isWearable(context) && !zzb(context)) {
                if (zzh == null) {
                    zzh = Boolean.valueOf(context.getPackageManager().hasSystemFeature(ProtectedSandApp.s("ే")));
                }
                if (!zzh.booleanValue() && !isAuto(context) && !isTv(context)) {
                    if (zzk == null) {
                        zzk = Boolean.valueOf(context.getPackageManager().hasSystemFeature(ProtectedSandApp.s("ై")));
                    }
                    if (!zzk.booleanValue() && !isBstar(context)) {
                        z5 = true;
                    }
                }
            }
            zza = Boolean.valueOf(z5);
        }
        return zza.booleanValue();
    }

    @KeepForSdk
    public static boolean isSevenInchTablet(@o0 Context context) {
        return zzc(context.getResources());
    }

    @KeepForSdk
    @TargetApi(21)
    public static boolean isSidewinder(@o0 Context context) {
        return zza(context);
    }

    @KeepForSdk
    public static boolean isTablet(@o0 Context context) {
        return isTablet(context.getResources());
    }

    @KeepForSdk
    public static boolean isTv(@o0 Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (zzj == null) {
            boolean z5 = true;
            if (!packageManager.hasSystemFeature(ProtectedSandApp.s("\u0c49")) && !packageManager.hasSystemFeature(ProtectedSandApp.s("ొ")) && !packageManager.hasSystemFeature(ProtectedSandApp.s("ో"))) {
                z5 = false;
            }
            zzj = Boolean.valueOf(z5);
        }
        return zzj.booleanValue();
    }

    @KeepForSdk
    public static boolean isUserBuild() {
        int i5 = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return ProtectedSandApp.s("ౌ").equals(Build.TYPE);
    }

    @KeepForSdk
    @TargetApi(20)
    public static boolean isWearable(@o0 Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (zzd == null) {
            boolean z5 = false;
            if (PlatformVersion.isAtLeastKitKatWatch() && packageManager.hasSystemFeature(ProtectedSandApp.s("్"))) {
                z5 = true;
            }
            zzd = Boolean.valueOf(z5);
        }
        return zzd.booleanValue();
    }

    @KeepForSdk
    @TargetApi(26)
    public static boolean isWearableWithoutPlayStore(@o0 Context context) {
        if (isWearable(context) && !PlatformVersion.isAtLeastN()) {
            return true;
        }
        if (zza(context)) {
            return !PlatformVersion.isAtLeastO() || PlatformVersion.isAtLeastR();
        }
        return false;
    }

    @TargetApi(21)
    public static boolean zza(@o0 Context context) {
        if (zze == null) {
            boolean z5 = false;
            if (PlatformVersion.isAtLeastLollipop() && context.getPackageManager().hasSystemFeature(ProtectedSandApp.s("\u0c4e"))) {
                z5 = true;
            }
            zze = Boolean.valueOf(z5);
        }
        return zze.booleanValue();
    }

    public static boolean zzb(@o0 Context context) {
        if (zzg == null) {
            boolean z5 = true;
            if (!context.getPackageManager().hasSystemFeature(ProtectedSandApp.s("\u0c4f")) && !context.getPackageManager().hasSystemFeature(ProtectedSandApp.s("\u0c50"))) {
                z5 = false;
            }
            zzg = Boolean.valueOf(z5);
        }
        return zzg.booleanValue();
    }

    public static boolean zzc(@o0 Resources resources) {
        boolean z5 = false;
        if (resources == null) {
            return false;
        }
        if (zzc == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z5 = true;
            }
            zzc = Boolean.valueOf(z5);
        }
        return zzc.booleanValue();
    }

    @KeepForSdk
    public static boolean isTablet(@o0 Resources resources) {
        if (resources == null) {
            return false;
        }
        if (zzb == null) {
            zzb = Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || zzc(resources));
        }
        return zzb.booleanValue();
    }
}
