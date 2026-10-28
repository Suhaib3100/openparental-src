package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.o0;
import androidx.annotation.u;
import androidx.annotation.x0;

/* compiled from: PathInterpolatorCompat.java */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: PathInterpolatorCompat.java */
    @x0(21)
    static class a {
        private a() {
        }

        @u
        static PathInterpolator a(float f6, float f7) {
            return new PathInterpolator(f6, f7);
        }

        @u
        static PathInterpolator b(float f6, float f7, float f8, float f9) {
            return new PathInterpolator(f6, f7, f8, f9);
        }

        @u
        static PathInterpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    private b() {
    }

    @o0
    public static Interpolator a(float f6, float f7) {
        return a.a(f6, f7);
    }

    @o0
    public static Interpolator b(float f6, float f7, float f8, float f9) {
        return a.b(f6, f7, f8, f9);
    }

    @o0
    public static Interpolator c(@o0 Path path) {
        return a.c(path);
    }
}
