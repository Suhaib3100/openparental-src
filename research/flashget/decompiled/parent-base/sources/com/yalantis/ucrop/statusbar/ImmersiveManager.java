package com.yalantis.ucrop.statusbar;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.accessibility.b;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.yalantis.ucrop.util.DensityUtil;

/* loaded from: classes7.dex */
public class ImmersiveManager {
    private static final String TAG_FAKE_STATUS_BAR_VIEW = ProtectedSandApp.s("廥\u0001");
    private static final String TAG_MARGIN_ADDED = ProtectedSandApp.s("廦\u0001");

    public static void immersiveAboveAPI23(AppCompatActivity appCompatActivity, int i4, int i5, boolean z4) {
        immersiveAboveAPI23(appCompatActivity, false, false, i4, i5, z4);
    }

    private static void initBarBelowLOLLIPOP(Activity activity) {
        activity.getWindow().addFlags(b.f26943s);
        setupStatusBarView(activity);
    }

    private static void setupStatusBarView(Activity activity) {
        Window window = activity.getWindow();
        View findViewWithTag = window.getDecorView().findViewWithTag(ProtectedSandApp.s("廥\u0001"));
        if (findViewWithTag == null) {
            findViewWithTag = new View(activity);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, DensityUtil.getStatusBarHeight(activity));
            layoutParams.gravity = 48;
            findViewWithTag.setLayoutParams(layoutParams);
            findViewWithTag.setVisibility(0);
            findViewWithTag.setTag(ProtectedSandApp.s("廦\u0001"));
            ((ViewGroup) window.getDecorView()).addView(findViewWithTag);
        }
        findViewWithTag.setBackgroundColor(0);
    }

    public static void immersiveAboveAPI23(AppCompatActivity appCompatActivity, boolean z4, boolean z5, int i4, int i5, boolean z6) {
        try {
            Window window = appCompatActivity.getWindow();
            boolean z7 = true;
            if (z4 && z5) {
                window.clearFlags(201326592);
                LightStatusBarUtils.setLightStatusBar(appCompatActivity, true, true, i4 == 0, z6);
                window.addFlags(Integer.MIN_VALUE);
            } else if (!z4 && !z5) {
                window.requestFeature(1);
                window.clearFlags(201326592);
                if (i4 != 0) {
                    z7 = false;
                }
                LightStatusBarUtils.setLightStatusBar(appCompatActivity, false, false, z7, z6);
                window.addFlags(Integer.MIN_VALUE);
            } else {
                if (z4) {
                    return;
                }
                window.requestFeature(1);
                window.clearFlags(201326592);
                LightStatusBarUtils.setLightStatusBar(appCompatActivity, false, true, i4 == 0, z6);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setStatusBarColor(i4);
            window.setNavigationBarColor(i5);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }
}
