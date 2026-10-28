package com.luck.picture.lib.utils;

import android.content.Context;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import androidx.core.graphics.d;
import androidx.core.graphics.e;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class StyleUtils {
    private static final int INVALID = 0;

    public static boolean checkArrayValidity(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    public static boolean checkSizeValidity(int i4) {
        return i4 > 0;
    }

    public static boolean checkStyleValidity(int i4) {
        return i4 != 0;
    }

    public static boolean checkTextValidity(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static ColorFilter getColorFilter(Context context, int i4) {
        return d.a(androidx.core.content.d.getColor(context, i4), e.SRC_ATOP);
    }

    public static int getFormatCount(String str) {
        int i4 = 0;
        while (Pattern.compile(ProtectedSandApp.s("\u1754\u0001")).matcher(str).find()) {
            i4++;
        }
        return i4;
    }
}
