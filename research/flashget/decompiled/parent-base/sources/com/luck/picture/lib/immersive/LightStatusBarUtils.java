package com.luck.picture.lib.immersive;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Field;

/* loaded from: classes6.dex */
public class LightStatusBarUtils {
    private static void initStatusBarStyle(Activity activity, boolean z4, boolean z5) {
        if (z4 && z5) {
            activity.getWindow().getDecorView().setSystemUiVisibility(256);
            return;
        }
        if (!z4 && !z5) {
            activity.getWindow().getDecorView().setSystemUiVisibility(1280);
        } else {
            if (z4 || !z5) {
                return;
            }
            activity.getWindow().getDecorView().setSystemUiVisibility(1280);
        }
    }

    @TargetApi(11)
    private static void setAndroidNativeLightStatusBar(Activity activity, boolean z4, boolean z5, boolean z6, boolean z7) {
        try {
            if (z6) {
                Window window = activity.getWindow();
                if (z4 && z5) {
                    if (z7) {
                        window.getDecorView().setSystemUiVisibility(8448);
                    } else {
                        window.getDecorView().setSystemUiVisibility(256);
                    }
                } else if (z4 || z5) {
                    if (z4 || !z5) {
                        return;
                    }
                    if (z7) {
                        window.getDecorView().setSystemUiVisibility(9472);
                    } else {
                        window.getDecorView().setSystemUiVisibility(1280);
                    }
                } else if (z7) {
                    window.getDecorView().setSystemUiVisibility(9472);
                } else {
                    window.getDecorView().setSystemUiVisibility(1280);
                }
            } else {
                View decorView = activity.getWindow().getDecorView();
                if (z7) {
                    decorView.setSystemUiVisibility(8192);
                } else {
                    decorView.setSystemUiVisibility(0);
                }
            }
        } catch (Exception unused) {
        }
    }

    private static boolean setFlymeLightStatusBar(Activity activity, boolean z4, boolean z5, boolean z6, boolean z7) {
        boolean z10 = false;
        if (activity == null) {
            return false;
        }
        initStatusBarStyle(activity, z4, z5);
        try {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            Field declaredField = WindowManager.LayoutParams.class.getDeclaredField(ProtectedSandApp.s("ᙏ\u0001"));
            Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField(ProtectedSandApp.s("ᙐ\u0001"));
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            int i4 = declaredField.getInt(null);
            int i5 = declaredField2.getInt(attributes);
            declaredField2.setInt(attributes, z7 ? i4 | i5 : (~i4) & i5);
            activity.getWindow().setAttributes(attributes);
            try {
                if (RomUtils.getFlymeVersion() >= 7) {
                    setAndroidNativeLightStatusBar(activity, z4, z5, z6, z7);
                }
                return true;
            } catch (Exception unused) {
                z10 = true;
                setAndroidNativeLightStatusBar(activity, z4, z5, z6, z7);
                return z10;
            }
        } catch (Exception unused2) {
        }
    }

    public static void setLightStatusBar(Activity activity, boolean z4) {
        setLightStatusBar(activity, false, false, false, z4);
    }

    public static void setLightStatusBarAboveAPI23(Activity activity, boolean z4, boolean z5, boolean z6, boolean z7) {
        setLightStatusBar(activity, z4, z5, z6, z7);
    }

    private static boolean setMIUILightStatusBar(Activity activity, boolean z4, boolean z5, boolean z6, boolean z7) {
        initStatusBarStyle(activity, z4, z5);
        Class<?> cls = activity.getWindow().getClass();
        try {
            Class<?> cls2 = Class.forName(ProtectedSandApp.s("ᙑ\u0001"));
            int i4 = cls2.getField(ProtectedSandApp.s("ᙒ\u0001")).getInt(cls2);
            String s4 = ProtectedSandApp.s("ᙓ\u0001");
            Class cls3 = Integer.TYPE;
            cls.getMethod(s4, cls3, cls3).invoke(activity.getWindow(), Integer.valueOf(z7 ? i4 : 0), Integer.valueOf(i4));
            return true;
        } catch (Exception unused) {
            setAndroidNativeLightStatusBar(activity, z4, z5, z6, z7);
            return false;
        }
    }

    public static void setLightStatusBar(Activity activity, boolean z4, boolean z5, boolean z6, boolean z7) {
        int lightStatusBarAvailableRomType = RomUtils.getLightStatusBarAvailableRomType();
        if (lightStatusBarAvailableRomType == 1) {
            if (RomUtils.getMIUIVersionCode() >= 7) {
                setAndroidNativeLightStatusBar(activity, z4, z5, z6, z7);
                return;
            } else {
                setMIUILightStatusBar(activity, z4, z5, z6, z7);
                return;
            }
        }
        if (lightStatusBarAvailableRomType == 2) {
            setFlymeLightStatusBar(activity, z4, z5, z6, z7);
        } else {
            if (lightStatusBarAvailableRomType != 3) {
                return;
            }
            setAndroidNativeLightStatusBar(activity, z4, z5, z6, z7);
        }
    }
}
