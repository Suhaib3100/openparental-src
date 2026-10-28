package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.y1;

/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
class q0 {

    /* renamed from: a, reason: collision with root package name */
    private static final d1 f9949a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f9950b = "ViewUtils";

    /* renamed from: c, reason: collision with root package name */
    static final Property<View, Float> f9951c;

    /* renamed from: d, reason: collision with root package name */
    static final Property<View, Rect> f9952d;

    /* compiled from: ViewUtils.java */
    static class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(q0.c(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f6) {
            q0.h(view, f6.floatValue());
        }
    }

    /* compiled from: ViewUtils.java */
    static class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        public Rect a(View view) {
            return y1.P(view);
        }

        public void b(View view, Rect rect) {
            y1.M1(view, rect);
        }

        @Override // android.util.Property
        public Rect get(View view) {
            return y1.P(view);
        }

        @Override // android.util.Property
        public void set(View view, Rect rect) {
            y1.M1(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f9949a = new c1();
        } else {
            f9949a = new b1();
        }
        f9951c = new a(Float.class, "translationAlpha");
        f9952d = new b(Rect.class, "clipBounds");
    }

    private q0() {
    }

    static void a(@androidx.annotation.o0 View view) {
        f9949a.a(view);
    }

    static p0 b(@androidx.annotation.o0 View view) {
        return new o0(view);
    }

    static float c(@androidx.annotation.o0 View view) {
        return f9949a.c(view);
    }

    static h1 d(@androidx.annotation.o0 View view) {
        return new g1(view);
    }

    static void e(@androidx.annotation.o0 View view) {
        f9949a.d(view);
    }

    static void f(@androidx.annotation.o0 View view, @androidx.annotation.q0 Matrix matrix) {
        f9949a.e(view, matrix);
    }

    static void g(@androidx.annotation.o0 View view, int i5, int i6, int i7, int i8) {
        f9949a.f(view, i5, i6, i7, i8);
    }

    static void h(@androidx.annotation.o0 View view, float f6) {
        f9949a.g(view, f6);
    }

    static void i(@androidx.annotation.o0 View view, int i5) {
        f9949a.h(view, i5);
    }

    static void j(@androidx.annotation.o0 View view, @androidx.annotation.o0 Matrix matrix) {
        f9949a.i(view, matrix);
    }

    static void k(@androidx.annotation.o0 View view, @androidx.annotation.o0 Matrix matrix) {
        f9949a.j(view, matrix);
    }
}
