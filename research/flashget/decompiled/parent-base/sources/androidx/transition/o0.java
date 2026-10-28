package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.x1;

/* compiled from: ViewUtils.java */
/* loaded from: classes3.dex */
class o0 {

    /* renamed from: a, reason: collision with root package name */
    private static final a1 f34450a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f34451b = "ViewUtils";

    /* renamed from: c, reason: collision with root package name */
    static final Property<View, Float> f34452c;

    /* renamed from: d, reason: collision with root package name */
    static final Property<View, Rect> f34453d;

    /* compiled from: ViewUtils.java */
    class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(o0.c(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f4) {
            o0.h(view, f4.floatValue());
        }
    }

    /* compiled from: ViewUtils.java */
    class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return x1.Q(view);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            x1.T1(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f34450a = new z0();
        } else {
            f34450a = new y0();
        }
        f34452c = new a(Float.class, "translationAlpha");
        f34453d = new b(Rect.class, "clipBounds");
    }

    private o0() {
    }

    static void a(@androidx.annotation.o0 View view) {
        f34450a.a(view);
    }

    static n0 b(@androidx.annotation.o0 View view) {
        return new m0(view);
    }

    static float c(@androidx.annotation.o0 View view) {
        return f34450a.c(view);
    }

    static e1 d(@androidx.annotation.o0 View view) {
        return new d1(view);
    }

    static void e(@androidx.annotation.o0 View view) {
        f34450a.d(view);
    }

    static void f(@androidx.annotation.o0 View view, @androidx.annotation.q0 Matrix matrix) {
        f34450a.e(view, matrix);
    }

    static void g(@androidx.annotation.o0 View view, int i4, int i5, int i6, int i7) {
        f34450a.f(view, i4, i5, i6, i7);
    }

    static void h(@androidx.annotation.o0 View view, float f4) {
        f34450a.g(view, f4);
    }

    static void i(@androidx.annotation.o0 View view, int i4) {
        f34450a.h(view, i4);
    }

    static void j(@androidx.annotation.o0 View view, @androidx.annotation.o0 Matrix matrix) {
        f34450a.i(view, matrix);
    }

    static void k(@androidx.annotation.o0 View view, @androidx.annotation.o0 Matrix matrix) {
        f34450a.j(view, matrix);
    }
}
