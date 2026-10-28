package androidx.core.util;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: TypedValueCompat.java */
/* loaded from: classes3.dex */
public class n0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f26867a = 0.013888889f;

    /* renamed from: b, reason: collision with root package name */
    private static final float f26868b = 0.03937008f;

    /* compiled from: TypedValueCompat.java */
    @x0(34)
    private static class a {
        private a() {
        }

        public static float a(int i4, float f4, DisplayMetrics displayMetrics) {
            return TypedValue.deriveDimension(i4, f4, displayMetrics);
        }
    }

    /* compiled from: TypedValueCompat.java */
    @c1({c1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    private n0() {
    }

    public static float a(int i4, float f4, @o0 DisplayMetrics displayMetrics) {
        float f5;
        float f6;
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(i4, f4, displayMetrics);
        }
        if (i4 == 0) {
            return f4;
        }
        if (i4 == 1) {
            float f7 = displayMetrics.density;
            if (f7 == 0.0f) {
                return 0.0f;
            }
            return f4 / f7;
        }
        if (i4 == 2) {
            float f10 = displayMetrics.scaledDensity;
            if (f10 == 0.0f) {
                return 0.0f;
            }
            return f4 / f10;
        }
        if (i4 == 3) {
            float f11 = displayMetrics.xdpi;
            if (f11 == 0.0f) {
                return 0.0f;
            }
            f5 = f4 / f11;
            f6 = f26867a;
        } else {
            if (i4 == 4) {
                float f12 = displayMetrics.xdpi;
                if (f12 == 0.0f) {
                    return 0.0f;
                }
                return f4 / f12;
            }
            if (i4 != 5) {
                throw new IllegalArgumentException(android.support.v4.media.a.a("Invalid unitToConvertTo ", i4));
            }
            float f13 = displayMetrics.xdpi;
            if (f13 == 0.0f) {
                return 0.0f;
            }
            f5 = f4 / f13;
            f6 = f26868b;
        }
        return f5 / f6;
    }

    public static float b(float f4, @o0 DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, f4, displayMetrics);
    }

    @SuppressLint({"WrongConstant"})
    public static int c(int i4) {
        return i4 & 15;
    }

    public static float d(float f4, @o0 DisplayMetrics displayMetrics) {
        return a(1, f4, displayMetrics);
    }

    public static float e(float f4, @o0 DisplayMetrics displayMetrics) {
        return a(2, f4, displayMetrics);
    }

    public static float f(float f4, @o0 DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(2, f4, displayMetrics);
    }
}
