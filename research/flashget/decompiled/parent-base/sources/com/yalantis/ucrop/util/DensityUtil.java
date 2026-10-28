package com.yalantis.ucrop.util;

import android.content.Context;
import android.content.res.Resources;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public class DensityUtil {
    public static int dip2px(Context context, float f4) {
        return (int) ((f4 * context.getApplicationContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int getStatusBarHeight(Context context) {
        int identifier = Resources.getSystem().getIdentifier(ProtectedSandApp.s("弍\u0001"), ProtectedSandApp.s("弋\u0001"), ProtectedSandApp.s("弌\u0001"));
        int dimensionPixelSize = identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
        return dimensionPixelSize == 0 ? dip2px(context, 26.0f) : dimensionPixelSize;
    }
}
