package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: DisplayCutoutCompat.java */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final DisplayCutout f5736a;

    /* compiled from: DisplayCutoutCompat.java */
    @androidx.annotation.x0(28)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        @androidx.annotation.u
        static List<Rect> b(DisplayCutout displayCutout) {
            List<Rect> boundingRects;
            boundingRects = displayCutout.getBoundingRects();
            return boundingRects;
        }

        @androidx.annotation.u
        static int c(DisplayCutout displayCutout) {
            int safeInsetBottom;
            safeInsetBottom = displayCutout.getSafeInsetBottom();
            return safeInsetBottom;
        }

        @androidx.annotation.u
        static int d(DisplayCutout displayCutout) {
            int safeInsetLeft;
            safeInsetLeft = displayCutout.getSafeInsetLeft();
            return safeInsetLeft;
        }

        @androidx.annotation.u
        static int e(DisplayCutout displayCutout) {
            int safeInsetRight;
            safeInsetRight = displayCutout.getSafeInsetRight();
            return safeInsetRight;
        }

        @androidx.annotation.u
        static int f(DisplayCutout displayCutout) {
            int safeInsetTop;
            safeInsetTop = displayCutout.getSafeInsetTop();
            return safeInsetTop;
        }
    }

    /* compiled from: DisplayCutoutCompat.java */
    @androidx.annotation.x0(29)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }

    /* compiled from: DisplayCutoutCompat.java */
    @androidx.annotation.x0(30)
    static class c {
        private c() {
        }

        @androidx.annotation.u
        static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        @androidx.annotation.u
        static Insets b(DisplayCutout displayCutout) {
            Insets waterfallInsets;
            waterfallInsets = displayCutout.getWaterfallInsets();
            return waterfallInsets;
        }
    }

    public w(@androidx.annotation.q0 Rect rect, @androidx.annotation.q0 List<Rect> list) {
        this(Build.VERSION.SDK_INT >= 28 ? a.a(rect, list) : null);
    }

    private static DisplayCutout a(@androidx.annotation.o0 androidx.core.graphics.w1 w1Var, @androidx.annotation.q0 Rect rect, @androidx.annotation.q0 Rect rect2, @androidx.annotation.q0 Rect rect3, @androidx.annotation.q0 Rect rect4, @androidx.annotation.o0 androidx.core.graphics.w1 w1Var2) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            return c.a(w1Var.h(), rect, rect2, rect3, rect4, w1Var2.h());
        }
        if (i5 >= 29) {
            return b.a(w1Var.h(), rect, rect2, rect3, rect4);
        }
        if (i5 < 28) {
            return null;
        }
        Rect rect5 = new Rect(w1Var.f4813a, w1Var.f4814b, w1Var.f4815c, w1Var.f4816d);
        ArrayList arrayList = new ArrayList();
        if (rect != null) {
            arrayList.add(rect);
        }
        if (rect2 != null) {
            arrayList.add(rect2);
        }
        if (rect3 != null) {
            arrayList.add(rect3);
        }
        if (rect4 != null) {
            arrayList.add(rect4);
        }
        return a.a(rect5, arrayList);
    }

    static w i(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new w(displayCutout);
    }

    @androidx.annotation.o0
    public List<Rect> b() {
        return Build.VERSION.SDK_INT >= 28 ? a.b(this.f5736a) : Collections.emptyList();
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.f5736a);
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.f5736a);
        }
        return 0;
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.e(this.f5736a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        return androidx.core.util.l.a(this.f5736a, ((w) obj).f5736a);
    }

    public int f() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.f(this.f5736a);
        }
        return 0;
    }

    @androidx.annotation.o0
    public androidx.core.graphics.w1 g() {
        return Build.VERSION.SDK_INT >= 30 ? androidx.core.graphics.w1.g(c.b(this.f5736a)) : androidx.core.graphics.w1.f4812e;
    }

    @androidx.annotation.x0(28)
    DisplayCutout h() {
        return this.f5736a;
    }

    public int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f5736a;
        if (displayCutout == null) {
            return 0;
        }
        hashCode = displayCutout.hashCode();
        return hashCode;
    }

    @androidx.annotation.o0
    public String toString() {
        return "DisplayCutoutCompat{" + this.f5736a + "}";
    }

    public w(@androidx.annotation.o0 androidx.core.graphics.w1 w1Var, @androidx.annotation.q0 Rect rect, @androidx.annotation.q0 Rect rect2, @androidx.annotation.q0 Rect rect3, @androidx.annotation.q0 Rect rect4, @androidx.annotation.o0 androidx.core.graphics.w1 w1Var2) {
        this(a(w1Var, rect, rect2, rect3, rect4, w1Var2));
    }

    private w(DisplayCutout displayCutout) {
        this.f5736a = displayCutout;
    }
}
