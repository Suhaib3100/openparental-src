package androidx.core.view;

import android.view.ScaleGestureDetector;

/* compiled from: ScaleGestureDetectorCompat.java */
/* loaded from: classes.dex */
public final class t1 {

    /* compiled from: ScaleGestureDetectorCompat.java */
    @androidx.annotation.x0(19)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static boolean a(ScaleGestureDetector scaleGestureDetector) {
            return scaleGestureDetector.isQuickScaleEnabled();
        }

        @androidx.annotation.u
        static void b(ScaleGestureDetector scaleGestureDetector, boolean z5) {
            scaleGestureDetector.setQuickScaleEnabled(z5);
        }
    }

    private t1() {
    }

    public static boolean a(@androidx.annotation.o0 ScaleGestureDetector scaleGestureDetector) {
        return a.a(scaleGestureDetector);
    }

    @Deprecated
    public static boolean b(Object obj) {
        return a.a((ScaleGestureDetector) obj);
    }

    public static void c(@androidx.annotation.o0 ScaleGestureDetector scaleGestureDetector, boolean z5) {
        a.b(scaleGestureDetector, z5);
    }

    @Deprecated
    public static void d(Object obj, boolean z5) {
        a.b((ScaleGestureDetector) obj, z5);
    }
}
