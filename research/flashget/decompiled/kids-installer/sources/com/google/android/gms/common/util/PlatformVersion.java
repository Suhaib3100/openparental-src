package com.google.android.gms.common.util;

import android.os.Build;
import androidx.annotation.k;
import androidx.core.os.a;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@VisibleForTesting
@KeepForSdk
/* loaded from: classes2.dex */
public final class PlatformVersion {
    private PlatformVersion() {
    }

    @KeepForSdk
    @k(api = 11)
    public static boolean isAtLeastHoneycomb() {
        return true;
    }

    @KeepForSdk
    @k(api = 12)
    public static boolean isAtLeastHoneycombMR1() {
        return true;
    }

    @KeepForSdk
    @k(api = 14)
    public static boolean isAtLeastIceCreamSandwich() {
        return true;
    }

    @KeepForSdk
    @k(api = 15)
    public static boolean isAtLeastIceCreamSandwichMR1() {
        return true;
    }

    @KeepForSdk
    @k(api = 16)
    public static boolean isAtLeastJellyBean() {
        return true;
    }

    @KeepForSdk
    @k(api = 17)
    public static boolean isAtLeastJellyBeanMR1() {
        return true;
    }

    @KeepForSdk
    @k(api = 18)
    public static boolean isAtLeastJellyBeanMR2() {
        return true;
    }

    @KeepForSdk
    @k(api = 19)
    public static boolean isAtLeastKitKat() {
        return true;
    }

    @KeepForSdk
    @k(api = 20)
    public static boolean isAtLeastKitKatWatch() {
        return true;
    }

    @KeepForSdk
    @k(api = 21)
    public static boolean isAtLeastLollipop() {
        return true;
    }

    @KeepForSdk
    @k(api = 22)
    public static boolean isAtLeastLollipopMR1() {
        return true;
    }

    @KeepForSdk
    @k(api = 23)
    public static boolean isAtLeastM() {
        return true;
    }

    @KeepForSdk
    @k(api = 24)
    public static boolean isAtLeastN() {
        return true;
    }

    @KeepForSdk
    @k(api = 26)
    public static boolean isAtLeastO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @KeepForSdk
    @k(api = 28)
    public static boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @KeepForSdk
    @k(api = 29)
    public static boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @KeepForSdk
    @k(api = 30)
    public static boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @KeepForSdk
    @k(api = 31)
    public static boolean isAtLeastS() {
        return Build.VERSION.SDK_INT >= 31;
    }

    @KeepForSdk
    @k(api = 32)
    public static boolean isAtLeastSv2() {
        return Build.VERSION.SDK_INT >= 32;
    }

    @KeepForSdk
    @k(api = 33)
    public static boolean isAtLeastT() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }

    @KeepForSdk
    @k(api = 33, codename = "UpsideDownCake")
    public static boolean isAtLeastU() {
        if (isAtLeastT()) {
            return a.l();
        }
        return false;
    }
}
