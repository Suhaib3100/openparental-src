package com.tencent.liteav.videobase.videobase;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.base.util.i;
import com.tencent.liteav.base.util.k;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class SystemDisplayInfo {
    private static final String TAG = ProtectedSandApp.s("啺\u0001");

    private static Display getDefaultDisplayByWindowManager() {
        return getDefaultDisplayByWindowManager(ContextUtils.getApplicationContext());
    }

    public static Display getDisplay() {
        if (nativeGetDisplayRotationObtainMethod() == 0) {
            return getDisplayByDisplayManager();
        }
        Display defaultDisplayByWindowManager = getDefaultDisplayByWindowManager();
        return defaultDisplayByWindowManager != null ? defaultDisplayByWindowManager : getDisplayByDisplayManager();
    }

    private static Display getDisplayByDisplayManager() {
        Context c5 = i.a().c();
        if (c5 == null) {
            c5 = ContextUtils.getApplicationContext();
        }
        String s4 = ProtectedSandApp.s("啺\u0001");
        if (c5 == null) {
            LiteavLog.e(s4, ProtectedSandApp.s("啻\u0001"));
            return null;
        }
        if (LiteavSystemInfo.getSystemOSVersionInt() < 32) {
            return getDefaultDisplayByWindowManager(c5);
        }
        try {
            return ((DisplayManager) c5.getSystemService(ProtectedSandApp.s("啾\u0001"))).getDisplay(0);
        } catch (Throwable th) {
            LiteavLog.e(s4, ProtectedSandApp.s("啿\u0001"), th);
            return getDefaultDisplayByWindowManager(c5);
        }
    }

    public static k getDisplayRotation() {
        k displayRotationCorrection = getDisplayRotationCorrection();
        if (displayRotationCorrection != null) {
            return displayRotationCorrection;
        }
        try {
            Display display = getDisplay();
            if (display != null) {
                return surfaceRotationEnumToRotation(display.getRotation());
            }
        } catch (Exception e4) {
            LiteavLog.e(ProtectedSandApp.s("啺\u0001"), ProtectedSandApp.s("喀\u0001"), e4);
        }
        return k.f71939a;
    }

    private static k getDisplayRotationCorrection() {
        int nativeGetDisplayRotationCorrection = nativeGetDisplayRotationCorrection();
        if (k.b(nativeGetDisplayRotationCorrection)) {
            return k.a(nativeGetDisplayRotationCorrection);
        }
        return null;
    }

    public static int getDisplayRotationDegree() {
        return getDisplayRotation().mValue;
    }

    public static Size getDisplaySize() {
        try {
            Display display = getDisplay();
            if (display != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                display.getRealMetrics(displayMetrics);
                return new Size(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
        } catch (Exception e4) {
            LiteavLog.e(ProtectedSandApp.s("啺\u0001"), ProtectedSandApp.s("喁\u0001"), e4);
        }
        return new Size(720, 1280);
    }

    private static native synchronized int nativeGetDisplayRotationCorrection();

    private static native synchronized int nativeGetDisplayRotationObtainMethod();

    private static k surfaceRotationEnumToRotation(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? k.f71939a : k.f71942d : k.f71941c : k.f71940b;
    }

    private static Display getDefaultDisplayByWindowManager(Context context) {
        String s4 = ProtectedSandApp.s("啺\u0001");
        if (context == null) {
            LiteavLog.e(s4, ProtectedSandApp.s("啻\u0001"));
            return null;
        }
        try {
            return ((WindowManager) context.getSystemService(ProtectedSandApp.s("啼\u0001"))).getDefaultDisplay();
        } catch (Throwable th) {
            LiteavLog.e(s4, ProtectedSandApp.s("啽\u0001"), th);
            return null;
        }
    }
}
