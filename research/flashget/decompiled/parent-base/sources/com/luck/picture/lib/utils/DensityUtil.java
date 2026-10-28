package com.luck.picture.lib.utils;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.immersive.RomUtils;

/* loaded from: classes6.dex */
public class DensityUtil {
    public static int dip2px(Context context, float f4) {
        return (int) ((f4 * context.getApplicationContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    private static int getInternalDimensionSize(Context context, String str) {
        try {
            int identifier = Resources.getSystem().getIdentifier(str, ProtectedSandApp.s("ᛜ\u0001"), ProtectedSandApp.s("ᛝ\u0001"));
            if (identifier > 0) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
                int dimensionPixelSize2 = Resources.getSystem().getDimensionPixelSize(identifier);
                if (dimensionPixelSize2 >= dimensionPixelSize) {
                    return dimensionPixelSize2;
                }
                float f4 = (dimensionPixelSize * Resources.getSystem().getDisplayMetrics().density) / context.getResources().getDisplayMetrics().density;
                return (int) (f4 >= 0.0f ? f4 + 0.5f : f4 - 0.5f);
            }
        } catch (Resources.NotFoundException unused) {
        }
        return 0;
    }

    @TargetApi(14)
    public static int getNavigationBarHeight(Context context) {
        boolean z4 = context.getResources().getConfiguration().orientation == 1;
        if (isNavBarVisible(context)) {
            return getInternalDimensionSize(context, z4 ? ProtectedSandApp.s("ᛞ\u0001") : ProtectedSandApp.s("ᛟ\u0001"));
        }
        return 0;
    }

    @TargetApi(14)
    public static int getNavigationBarWidth(Context context) {
        if (isNavBarVisible(context)) {
            return getInternalDimensionSize(context, ProtectedSandApp.s("ᛠ\u0001"));
        }
        return 0;
    }

    public static int getRealScreenHeight(Context context) {
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService(ProtectedSandApp.s("ᛡ\u0001"));
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.y;
    }

    public static int getRealScreenWidth(Context context) {
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService(ProtectedSandApp.s("ᛡ\u0001"));
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.x;
    }

    private static String getResNameById(Context context, int i4) {
        try {
            return context.getResources().getResourceEntryName(i4);
        } catch (Exception unused) {
            return "";
        }
    }

    public static int getScreenHeight(Context context) {
        return getRealScreenHeight(context) - getStatusNavigationBarHeight(context);
    }

    @SuppressLint({"NewApi"})
    private static float getSmallestWidthDp(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        float f4 = displayMetrics.widthPixels;
        float f5 = displayMetrics.density;
        return Math.min(f4 / f5, displayMetrics.heightPixels / f5);
    }

    public static int getStatusBarHeight(Context context) {
        int statusBarHeight;
        int dimensionPixelSize;
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier(ProtectedSandApp.s("ᛢ\u0001"), ProtectedSandApp.s("ᛜ\u0001"), ProtectedSandApp.s("ᛝ\u0001"));
        if (identifier > 0) {
            try {
                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(identifier);
                dimensionPixelSize = system.getDimensionPixelSize(identifier);
                if (dimensionPixelSize < dimensionPixelSize2) {
                    float f4 = (dimensionPixelSize2 * system.getDisplayMetrics().density) / context.getResources().getDisplayMetrics().density;
                    dimensionPixelSize = (int) (f4 >= 0.0f ? f4 + 0.5f : f4 - 0.5f);
                }
            } catch (Exception unused) {
                statusBarHeight = getStatusBarHeight();
            }
        } else {
            dimensionPixelSize = 0;
        }
        statusBarHeight = dimensionPixelSize;
        return statusBarHeight == 0 ? dip2px(context, 26.0f) : statusBarHeight;
    }

    private static int getStatusNavigationBarHeight(Context context) {
        if (!isNavBarVisible(context)) {
            return getStatusBarHeight(context);
        }
        return getNavigationBarHeight(context) + getStatusBarHeight(context);
    }

    public static boolean isNavBarVisible(Context context) {
        boolean z4;
        if (!(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        int childCount = viewGroup.getChildCount();
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                z4 = false;
                break;
            }
            View childAt = viewGroup.getChildAt(i4);
            int id2 = childAt.getId();
            if (id2 != -1) {
                if (ProtectedSandApp.s("ᛣ\u0001").equals(getResNameById(activity, id2)) && childAt.getVisibility() == 0) {
                    z4 = true;
                    break;
                }
            }
            i4++;
        }
        if (!z4) {
            return z4;
        }
        if (RomUtils.isSamsung() && Build.VERSION.SDK_INT < 29) {
            try {
                return Settings.Global.getInt(activity.getContentResolver(), ProtectedSandApp.s("ᛤ\u0001")) == 0;
            } catch (Exception unused) {
            }
        }
        return (viewGroup.getSystemUiVisibility() & 2) == 0;
    }

    public static boolean isNavigationAtBottom(Activity activity) {
        return getSmallestWidthDp(activity) >= 600.0f || (activity.getResources().getConfiguration().orientation == 1);
    }

    public static int getStatusBarHeight() {
        Resources system = Resources.getSystem();
        return system.getDimensionPixelSize(system.getIdentifier(ProtectedSandApp.s("ᛢ\u0001"), ProtectedSandApp.s("ᛜ\u0001"), ProtectedSandApp.s("ᛝ\u0001")));
    }
}
