package com.luck.picture.lib.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public class SpUtils {
    private static SharedPreferences pictureSpUtils;

    public static boolean contains(Context context, String str) {
        return getSp(context).contains(str);
    }

    public static boolean getBoolean(Context context, String str, boolean z4) {
        return getSp(context).getBoolean(str, z4);
    }

    private static SharedPreferences getSp(Context context) {
        if (pictureSpUtils == null) {
            pictureSpUtils = context.getSharedPreferences(ProtectedSandApp.s("ᝓ\u0001"), 0);
        }
        return pictureSpUtils;
    }

    public static void putBoolean(Context context, String str, boolean z4) {
        getSp(context).edit().putBoolean(str, z4).apply();
    }

    public static void putString(Context context, String str, String str2) {
        getSp(context).edit().putString(str, str2).apply();
    }
}
