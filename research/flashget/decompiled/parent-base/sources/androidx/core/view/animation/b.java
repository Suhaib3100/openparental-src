package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.o0;
import androidx.annotation.x0;

/* compiled from: PathInterpolatorCompat.java */
/* loaded from: classes3.dex */
public final class b {

    /* compiled from: PathInterpolatorCompat.java */
    @x0(21)
    static class a {
        private a() {
        }

        static Interpolator a(float f4, float f5) {
            return new PathInterpolator(f4, f5);
        }

        static Interpolator b(float f4, float f5, float f6, float f7) {
            return new PathInterpolator(f4, f5, f6, f7);
        }

        static Interpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    private b() {
    }

    @o0
    public static Interpolator a(float f4, float f5) {
        return new PathInterpolator(f4, f5);
    }

    @o0
    public static Interpolator b(float f4, float f5, float f6, float f7) {
        return new PathInterpolator(f4, f5, f6, f7);
    }

    @o0
    public static Interpolator c(@o0 Path path) {
        return new PathInterpolator(path);
    }
}
