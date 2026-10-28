package com.github.gzuliyujiang.oaid;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: OAIDRom.java */
/* loaded from: classes5.dex */
public final class j {
    private j() {
    }

    public static boolean a() {
        String str = Build.MANUFACTURER;
        String s4 = ProtectedSandApp.s("쏊");
        return str.equalsIgnoreCase(s4) || Build.BRAND.equalsIgnoreCase(s4);
    }

    public static boolean b() {
        String str = Build.MANUFACTURER;
        String s4 = ProtectedSandApp.s("쏋");
        return str.equalsIgnoreCase(s4) || Build.BRAND.equalsIgnoreCase(s4);
    }

    public static boolean c(Context context) {
        try {
            context.getPackageManager().getPackageInfo(ProtectedSandApp.s("쏌"), 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean d() {
        return t(ProtectedSandApp.s("쏍"), "").equalsIgnoreCase(ProtectedSandApp.s("쏎"));
    }

    public static boolean e() {
        return !TextUtils.isEmpty(t(ProtectedSandApp.s("쏏"), ""));
    }

    public static boolean f() {
        return !TextUtils.isEmpty(t(ProtectedSandApp.s("쏐"), ""));
    }

    public static boolean g() {
        String str = Build.MANUFACTURER;
        String s4 = ProtectedSandApp.s("쏑");
        if (!str.equalsIgnoreCase(s4)) {
            String str2 = Build.BRAND;
            if (!str2.equalsIgnoreCase(s4) && !str2.equalsIgnoreCase(ProtectedSandApp.s("쏒"))) {
                return false;
            }
        }
        return true;
    }

    public static boolean h() {
        String str = Build.MANUFACTURER;
        String s4 = ProtectedSandApp.s("쏓");
        if (!str.equalsIgnoreCase(s4)) {
            String str2 = Build.BRAND;
            if (!str2.equalsIgnoreCase(s4) && !str2.equalsIgnoreCase(ProtectedSandApp.s("쏔"))) {
                return false;
            }
        }
        return true;
    }

    public static boolean i() {
        String str = Build.MANUFACTURER;
        String s4 = ProtectedSandApp.s("쏕");
        return str.equalsIgnoreCase(s4) || Build.BRAND.equalsIgnoreCase(s4) || Build.DISPLAY.toUpperCase().contains(ProtectedSandApp.s("쏖"));
    }

    public static boolean j() {
        return !TextUtils.isEmpty(t(ProtectedSandApp.s("쏗"), ""));
    }

    public static boolean k() {
        String str = Build.MANUFACTURER;
        String s4 = ProtectedSandApp.s("쏘");
        return str.equalsIgnoreCase(s4) || Build.BRAND.equalsIgnoreCase(s4);
    }

    public static boolean l() {
        String str = Build.MANUFACTURER;
        String s4 = ProtectedSandApp.s("쏙");
        return str.equalsIgnoreCase(s4) || Build.BRAND.equalsIgnoreCase(s4);
    }

    public static boolean m() {
        String str = Build.MANUFACTURER;
        String s4 = ProtectedSandApp.s("쏚");
        return str.equalsIgnoreCase(s4) || Build.BRAND.equalsIgnoreCase(s4);
    }

    public static boolean n() {
        String str = Build.MANUFACTURER;
        String s4 = ProtectedSandApp.s("쏛");
        if (!str.equalsIgnoreCase(s4)) {
            String str2 = Build.BRAND;
            if (!str2.equalsIgnoreCase(s4) && !str2.equalsIgnoreCase(ProtectedSandApp.s("쏜")) && TextUtils.isEmpty(t(ProtectedSandApp.s("쏝"), ""))) {
                return false;
            }
        }
        return true;
    }

    public static boolean o() {
        return !TextUtils.isEmpty(t(ProtectedSandApp.s("쏞"), ""));
    }

    public static boolean p() {
        String str = Build.MANUFACTURER;
        String s4 = ProtectedSandApp.s("쏟");
        return str.equalsIgnoreCase(s4) || Build.BRAND.equalsIgnoreCase(s4);
    }

    public static boolean q() {
        String str = Build.MANUFACTURER;
        String s4 = ProtectedSandApp.s("쏠");
        return str.equalsIgnoreCase(s4) || Build.BRAND.equalsIgnoreCase(s4) || !TextUtils.isEmpty(t(ProtectedSandApp.s("쏡"), ""));
    }

    public static boolean r() {
        String str = Build.MANUFACTURER;
        String s4 = ProtectedSandApp.s("쏢");
        if (!str.equalsIgnoreCase(s4)) {
            String str2 = Build.BRAND;
            if (!str2.equalsIgnoreCase(s4) && !str2.equalsIgnoreCase(ProtectedSandApp.s("쏣"))) {
                return false;
            }
        }
        return true;
    }

    public static boolean s() {
        String str = Build.MANUFACTURER;
        String s4 = ProtectedSandApp.s("쏤");
        return str.equalsIgnoreCase(s4) || Build.BRAND.equalsIgnoreCase(s4);
    }

    public static String t(String key, String defValue) {
        String str;
        try {
            Class<?> cls = Class.forName(ProtectedSandApp.s("쏥"));
            str = (String) cls.getMethod(ProtectedSandApp.s("쏦"), String.class, String.class).invoke(cls, key, defValue);
        } catch (Exception e4) {
            i.b(ProtectedSandApp.s("쏧") + e4);
            str = null;
        }
        return str == null ? "" : str;
    }
}
