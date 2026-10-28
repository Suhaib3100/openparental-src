package com.luck.picture.lib.photoview;

import android.widget.ImageView;
import androidx.core.view.u0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
class Util {

    /* renamed from: com.luck.picture.lib.photoview.Util$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            $SwitchMap$android$widget$ImageView$ScaleType = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    Util() {
    }

    static void checkZoomLevels(float f4, float f5, float f6) {
        if (f4 >= f5) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᛃ\u0001"));
        }
        if (f5 >= f6) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᛂ\u0001"));
        }
    }

    static int getPointerIndex(int i4) {
        return (i4 & u0.f27413f) >> 8;
    }

    static boolean hasDrawable(ImageView imageView) {
        return imageView.getDrawable() != null;
    }

    static boolean isSupportedScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (AnonymousClass1.$SwitchMap$android$widget$ImageView$ScaleType[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalStateException(ProtectedSandApp.s("ᛄ\u0001"));
    }
}
