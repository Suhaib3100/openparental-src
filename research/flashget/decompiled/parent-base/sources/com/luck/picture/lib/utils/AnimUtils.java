package com.luck.picture.lib.utils;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public class AnimUtils {
    public static final int DURATION = 250;

    public static void rotateArrow(ImageView imageView, boolean z4) {
        float f4 = 180.0f;
        float f5 = 0.0f;
        if (z4) {
            f5 = 180.0f;
            f4 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, ProtectedSandApp.s("ᛐ\u0001"), f4, f5);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
    }

    public static void selectZoom(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, ProtectedSandApp.s("ᛑ\u0001"), 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(view, ProtectedSandApp.s("ᛒ\u0001"), 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.start();
    }
}
