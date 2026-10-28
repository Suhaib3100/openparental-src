package androidx.core.view;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.annotation.c1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: VelocityTrackerCompat.java */
/* loaded from: classes3.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    private static Map<VelocityTracker, v1> f27434a = Collections.synchronizedMap(new WeakHashMap());

    /* compiled from: VelocityTrackerCompat.java */
    @androidx.annotation.x0(34)
    private static class a {
        private a() {
        }

        static float a(VelocityTracker velocityTracker, int i4) {
            return velocityTracker.getAxisVelocity(i4);
        }

        static float b(VelocityTracker velocityTracker, int i4, int i5) {
            return velocityTracker.getAxisVelocity(i4, i5);
        }

        static boolean c(VelocityTracker velocityTracker, int i4) {
            return velocityTracker.isAxisSupported(i4);
        }
    }

    /* compiled from: VelocityTrackerCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    private u1() {
    }

    public static void a(@androidx.annotation.o0 VelocityTracker velocityTracker, @androidx.annotation.o0 MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f27434a.containsKey(velocityTracker)) {
                f27434a.put(velocityTracker, new v1());
            }
            f27434a.get(velocityTracker).a(motionEvent);
        }
    }

    public static void b(@androidx.annotation.o0 VelocityTracker velocityTracker) {
        velocityTracker.clear();
        l(velocityTracker);
    }

    public static void c(@androidx.annotation.o0 VelocityTracker velocityTracker, int i4) {
        d(velocityTracker, i4, Float.MAX_VALUE);
    }

    public static void d(@androidx.annotation.o0 VelocityTracker velocityTracker, int i4, float f4) {
        velocityTracker.computeCurrentVelocity(i4, f4);
        v1 g4 = g(velocityTracker);
        if (g4 != null) {
            g4.d(i4, f4);
        }
    }

    public static float e(@androidx.annotation.o0 VelocityTracker velocityTracker, int i4) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i4);
        }
        if (i4 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i4 == 1) {
            return velocityTracker.getYVelocity();
        }
        v1 g4 = g(velocityTracker);
        if (g4 != null) {
            return g4.e(i4);
        }
        return 0.0f;
    }

    public static float f(@androidx.annotation.o0 VelocityTracker velocityTracker, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.b(velocityTracker, i4, i5);
        }
        if (i4 == 0) {
            return velocityTracker.getXVelocity(i5);
        }
        if (i4 == 1) {
            return velocityTracker.getYVelocity(i5);
        }
        return 0.0f;
    }

    @androidx.annotation.q0
    private static v1 g(VelocityTracker velocityTracker) {
        return f27434a.get(velocityTracker);
    }

    @androidx.annotation.w0(expression = "tracker.getXVelocity(pointerId)")
    @Deprecated
    public static float h(VelocityTracker velocityTracker, int i4) {
        return velocityTracker.getXVelocity(i4);
    }

    @androidx.annotation.w0(expression = "tracker.getYVelocity(pointerId)")
    @Deprecated
    public static float i(VelocityTracker velocityTracker, int i4) {
        return velocityTracker.getYVelocity(i4);
    }

    public static boolean j(@androidx.annotation.o0 VelocityTracker velocityTracker, int i4) {
        return Build.VERSION.SDK_INT >= 34 ? a.c(velocityTracker, i4) : i4 == 26 || i4 == 0 || i4 == 1;
    }

    public static void k(@androidx.annotation.o0 VelocityTracker velocityTracker) {
        velocityTracker.recycle();
        l(velocityTracker);
    }

    private static void l(VelocityTracker velocityTracker) {
        f27434a.remove(velocityTracker);
    }
}
