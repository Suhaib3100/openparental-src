package com.luck.picture.lib.config;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public class Crop {
    public static final int REQUEST_CROP = 69;
    public static final int REQUEST_EDIT_CROP = 696;
    public static final int RESULT_CROP_ERROR = 96;
    public static final String EXTRA_ERROR = ProtectedSandApp.s("ᗰ\u0001");
    public static final String EXTRA_OUTPUT_CROP_ASPECT_RATIO = ProtectedSandApp.s("ᗳ\u0001");
    private static final String EXTRA_PREFIX = ProtectedSandApp.s("ᗹ\u0001");
    public static final String EXTRA_OUTPUT_IMAGE_WIDTH = ProtectedSandApp.s("ᗸ\u0001");
    public static final String EXTRA_OUTPUT_OFFSET_X = ProtectedSandApp.s("ᗶ\u0001");
    public static final String EXTRA_OUTPUT_OFFSET_Y = ProtectedSandApp.s("ᗷ\u0001");
    public static final String EXTRA_OUTPUT_IMAGE_HEIGHT = ProtectedSandApp.s("ᗵ\u0001");

    @q0
    public static Throwable getError(@o0 Intent intent) {
        return (Throwable) intent.getSerializableExtra(ProtectedSandApp.s("ᗰ\u0001"));
    }

    @q0
    public static Uri getOutput(@o0 Intent intent) {
        Uri uri = (Uri) intent.getParcelableExtra(ProtectedSandApp.s("ᗱ\u0001"));
        return uri == null ? (Uri) intent.getParcelableExtra(ProtectedSandApp.s("ᗲ\u0001")) : uri;
    }

    public static float getOutputCropAspectRatio(@o0 Intent intent) {
        return intent.getFloatExtra(ProtectedSandApp.s("ᗳ\u0001"), 0.0f);
    }

    public static String getOutputCustomExtraData(@o0 Intent intent) {
        return intent.getStringExtra(ProtectedSandApp.s("ᗴ\u0001"));
    }

    public static int getOutputImageHeight(@o0 Intent intent) {
        return intent.getIntExtra(ProtectedSandApp.s("ᗵ\u0001"), -1);
    }

    public static int getOutputImageOffsetX(@o0 Intent intent) {
        return intent.getIntExtra(ProtectedSandApp.s("ᗶ\u0001"), 0);
    }

    public static int getOutputImageOffsetY(@o0 Intent intent) {
        return intent.getIntExtra(ProtectedSandApp.s("ᗷ\u0001"), 0);
    }

    public static int getOutputImageWidth(@o0 Intent intent) {
        return intent.getIntExtra(ProtectedSandApp.s("ᗸ\u0001"), -1);
    }
}
