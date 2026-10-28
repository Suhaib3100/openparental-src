package com.github.gzuliyujiang.oaid;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: OAIDRom.java */
/* loaded from: classes2.dex */
public final class h {
    private h() {
    }

    public static boolean a() {
        String str = Build.MANUFACTURER;
        String s5 = ProtectedSandApp.s("ࢷ");
        return str.equalsIgnoreCase(s5) || Build.BRAND.equalsIgnoreCase(s5);
    }

    public static boolean b() {
        String str = Build.MANUFACTURER;
        String s5 = ProtectedSandApp.s("ࢸ");
        return str.equalsIgnoreCase(s5) || Build.BRAND.equalsIgnoreCase(s5);
    }

    public static boolean c(Context context) {
        try {
            context.getPackageManager().getPackageInfo(ProtectedSandApp.s("ࢹ"), 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean d() {
        return t(ProtectedSandApp.s("ࢺ"), "").equalsIgnoreCase(ProtectedSandApp.s("ࢻ"));
    }

    public static boolean e() {
        return !TextUtils.isEmpty(t(ProtectedSandApp.s("ࢼ"), ""));
    }

    public static boolean f() {
        return !TextUtils.isEmpty(t(ProtectedSandApp.s("ࢽ"), ""));
    }

    public static boolean g() {
        String str = Build.MANUFACTURER;
        String s5 = ProtectedSandApp.s("ࢾ");
        if (!str.equalsIgnoreCase(s5)) {
            String str2 = Build.BRAND;
            if (!str2.equalsIgnoreCase(s5) && !str2.equalsIgnoreCase(ProtectedSandApp.s("ࢿ"))) {
                return false;
            }
        }
        return true;
    }

    public static boolean h() {
        String str = Build.MANUFACTURER;
        String s5 = ProtectedSandApp.s("ࣀ");
        if (!str.equalsIgnoreCase(s5)) {
            String str2 = Build.BRAND;
            if (!str2.equalsIgnoreCase(s5) && !str2.equalsIgnoreCase(ProtectedSandApp.s("ࣁ"))) {
                return false;
            }
        }
        return true;
    }

    public static boolean i() {
        String str = Build.MANUFACTURER;
        String s5 = ProtectedSandApp.s("ࣂ");
        return str.equalsIgnoreCase(s5) || Build.BRAND.equalsIgnoreCase(s5) || Build.DISPLAY.toUpperCase().contains(ProtectedSandApp.s("ࣃ"));
    }

    public static boolean j() {
        return !TextUtils.isEmpty(t(ProtectedSandApp.s("ࣄ"), ""));
    }

    public static boolean k() {
        String str = Build.MANUFACTURER;
        String s5 = ProtectedSandApp.s("ࣅ");
        return str.equalsIgnoreCase(s5) || Build.BRAND.equalsIgnoreCase(s5);
    }

    public static boolean l() {
        String str = Build.MANUFACTURER;
        String s5 = ProtectedSandApp.s("ࣆ");
        return str.equalsIgnoreCase(s5) || Build.BRAND.equalsIgnoreCase(s5);
    }

    public static boolean m() {
        String str = Build.MANUFACTURER;
        String s5 = ProtectedSandApp.s("ࣇ");
        return str.equalsIgnoreCase(s5) || Build.BRAND.equalsIgnoreCase(s5);
    }

    public static boolean n() {
        String str = Build.MANUFACTURER;
        String s5 = ProtectedSandApp.s("ࣈ");
        if (!str.equalsIgnoreCase(s5)) {
            String str2 = Build.BRAND;
            if (!str2.equalsIgnoreCase(s5) && !str2.equalsIgnoreCase(ProtectedSandApp.s("ࣉ")) && TextUtils.isEmpty(t(ProtectedSandApp.s("࣊"), ""))) {
                return false;
            }
        }
        return true;
    }

    public static boolean o() {
        return !TextUtils.isEmpty(t(ProtectedSandApp.s("࣋"), ""));
    }

    public static boolean p() {
        String str = Build.MANUFACTURER;
        String s5 = ProtectedSandApp.s("࣌");
        return str.equalsIgnoreCase(s5) || Build.BRAND.equalsIgnoreCase(s5);
    }

    public static boolean q() {
        String str = Build.MANUFACTURER;
        String s5 = ProtectedSandApp.s("࣍");
        return str.equalsIgnoreCase(s5) || Build.BRAND.equalsIgnoreCase(s5) || !TextUtils.isEmpty(t(ProtectedSandApp.s("࣎"), ""));
    }

    public static boolean r() {
        String str = Build.MANUFACTURER;
        String s5 = ProtectedSandApp.s("࣏");
        if (!str.equalsIgnoreCase(s5)) {
            String str2 = Build.BRAND;
            if (!str2.equalsIgnoreCase(s5) && !str2.equalsIgnoreCase(ProtectedSandApp.s("࣐"))) {
                return false;
            }
        }
        return true;
    }

    public static boolean s() {
        String str = Build.MANUFACTURER;
        String s5 = ProtectedSandApp.s("࣑");
        return str.equalsIgnoreCase(s5) || Build.BRAND.equalsIgnoreCase(s5);
    }

    public static String t(String key, String defValue) {
        String str;
        try {
            Class<?> cls = Class.forName(ProtectedSandApp.s("࣒"));
            str = (String) cls.getMethod(ProtectedSandApp.s("࣓"), String.class, String.class).invoke(cls, key, defValue);
        } catch (Exception e6) {
            g.b(ProtectedSandApp.s("ࣔ") + e6);
            str = null;
        }
        return str == null ? "" : str;
    }
}
