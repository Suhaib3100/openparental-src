package androidx.core.view;

import android.view.ScaleGestureDetector;

/* compiled from: ScaleGestureDetectorCompat.java */
/* loaded from: classes3.dex */
public final class i1 {
    private i1() {
    }

    @androidx.annotation.w0(expression = "scaleGestureDetector.isQuickScaleEnabled()")
    @Deprecated
    public static boolean a(@androidx.annotation.o0 ScaleGestureDetector scaleGestureDetector) {
        return scaleGestureDetector.isQuickScaleEnabled();
    }

    @Deprecated
    public static boolean b(Object obj) {
        return ((ScaleGestureDetector) obj).isQuickScaleEnabled();
    }

    @androidx.annotation.w0(expression = "scaleGestureDetector.setQuickScaleEnabled(enabled)")
    @Deprecated
    public static void c(@androidx.annotation.o0 ScaleGestureDetector scaleGestureDetector, boolean z4) {
        scaleGestureDetector.setQuickScaleEnabled(z4);
    }

    @Deprecated
    public static void d(Object obj, boolean z4) {
        ((ScaleGestureDetector) obj).setQuickScaleEnabled(z4);
    }
}
