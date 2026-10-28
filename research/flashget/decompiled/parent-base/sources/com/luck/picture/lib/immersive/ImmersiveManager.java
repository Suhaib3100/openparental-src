package com.luck.picture.lib.immersive;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.accessibility.b;
import androidx.core.view.f0;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.utils.DensityUtil;

/* loaded from: classes6.dex */
public class ImmersiveManager {
    private static final String TAG_FAKE_STATUS_BAR_VIEW = ProtectedSandApp.s("ᙍ\u0001");
    private static final String TAG_MARGIN_ADDED = ProtectedSandApp.s("ᙎ\u0001");
    private static final String TAG_NAVIGATION_BAR_VIEW = ProtectedSandApp.s("ᙌ\u0001");

    public static void immersiveAboveAPI23(AppCompatActivity appCompatActivity, int i4, int i5, boolean z4) {
        immersiveAboveAPI23(appCompatActivity, false, false, i4, i5, z4);
    }

    private static void initBarBelowLOLLIPOP(Activity activity) {
        Window window = activity.getWindow();
        window.addFlags(b.f26943s);
        setupStatusBarView(activity);
        if (DensityUtil.isNavBarVisible(activity)) {
            window.addFlags(134217728);
            setupNavBarView(activity);
        }
    }

    private static void setupNavBarView(Activity activity) {
        FrameLayout.LayoutParams layoutParams;
        Window window = activity.getWindow();
        View decorView = window.getDecorView();
        String s4 = ProtectedSandApp.s("ᙌ\u0001");
        View findViewWithTag = decorView.findViewWithTag(s4);
        if (findViewWithTag == null) {
            findViewWithTag = new View(activity);
            findViewWithTag.setTag(s4);
            ((ViewGroup) window.getDecorView()).addView(findViewWithTag);
        }
        if (DensityUtil.isNavigationAtBottom(activity)) {
            layoutParams = new FrameLayout.LayoutParams(-1, DensityUtil.getNavigationBarHeight(activity));
            layoutParams.gravity = 80;
        } else {
            layoutParams = new FrameLayout.LayoutParams(DensityUtil.getNavigationBarWidth(activity), -1);
            layoutParams.gravity = f0.f27130c;
        }
        findViewWithTag.setLayoutParams(layoutParams);
        findViewWithTag.setBackgroundColor(0);
        findViewWithTag.setVisibility(0);
    }

    private static void setupStatusBarView(Activity activity) {
        Window window = activity.getWindow();
        View findViewWithTag = window.getDecorView().findViewWithTag(ProtectedSandApp.s("ᙍ\u0001"));
        if (findViewWithTag == null) {
            findViewWithTag = new View(activity);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, DensityUtil.getStatusBarHeight(activity));
            layoutParams.gravity = 48;
            findViewWithTag.setLayoutParams(layoutParams);
            findViewWithTag.setVisibility(0);
            findViewWithTag.setTag(ProtectedSandApp.s("ᙎ\u0001"));
            ((ViewGroup) window.getDecorView()).addView(findViewWithTag);
        }
        findViewWithTag.setBackgroundColor(0);
    }

    public static void translucentStatusBar(Activity activity, boolean z4) {
        Window window = activity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(b.f26943s);
        window.setStatusBarColor(0);
        View decorView = window.getDecorView();
        if (z4) {
            decorView.setSystemUiVisibility(9472);
        } else {
            window.getDecorView().setSystemUiVisibility(1280);
        }
        View childAt = ((ViewGroup) window.findViewById(R.id.content)).getChildAt(0);
        if (childAt != null) {
            childAt.setFitsSystemWindows(false);
            x1.B1(childAt);
        }
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
