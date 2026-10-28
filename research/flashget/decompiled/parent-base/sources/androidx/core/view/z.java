package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: DisplayCutoutCompat.java */
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private final DisplayCutout f27505a;

    /* compiled from: DisplayCutoutCompat.java */
    @androidx.annotation.x0(28)
    static class a {
        private a() {
        }

        static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    /* compiled from: DisplayCutoutCompat.java */
    @androidx.annotation.x0(29)
    static class b {
        private b() {
        }

        static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }

    /* compiled from: DisplayCutoutCompat.java */
    @androidx.annotation.x0(30)
    static class c {
        private c() {
        }

        static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        static Insets b(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    /* compiled from: DisplayCutoutCompat.java */
    @androidx.annotation.x0(31)
    static class d {
        private d() {
        }

        @androidx.annotation.q0
        static Path a(DisplayCutout displayCutout) {
            return displayCutout.getCutoutPath();
        }
    }

    /* compiled from: DisplayCutoutCompat.java */
    @androidx.annotation.x0(33)
    static class e {
        private e() {
        }

        static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2, Path path) {
            return new DisplayCutout.Builder().setSafeInsets(insets).setBoundingRectLeft(rect).setBoundingRectTop(rect2).setBoundingRectRight(rect3).setBoundingRectBottom(rect4).setWaterfallInsets(insets2).setCutoutPath(path).build();
        }
    }

    public z(@androidx.annotation.q0 Rect rect, @androidx.annotation.q0 List<Rect> list) {
        this(Build.VERSION.SDK_INT >= 28 ? a.a(rect, list) : null);
    }

    private static DisplayCutout a(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var, @androidx.annotation.q0 Rect rect, @androidx.annotation.q0 Rect rect2, @androidx.annotation.q0 Rect rect3, @androidx.annotation.q0 Rect rect4, @androidx.annotation.o0 androidx.core.graphics.e0 e0Var2, @androidx.annotation.q0 Path path) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            return e.a(e0Var.h(), rect, rect2, rect3, rect4, e0Var2.h(), path);
        }
        if (i4 >= 30) {
            return c.a(e0Var.h(), rect, rect2, rect3, rect4, e0Var2.h());
        }
        if (i4 >= 29) {
            return b.a(e0Var.h(), rect, rect2, rect3, rect4);
        }
        if (i4 < 28) {
            return null;
        }
        Rect rect5 = new Rect(e0Var.f26245a, e0Var.f26246b, e0Var.f26247c, e0Var.f26248d);
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

    static z j(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new z(displayCutout);
    }

    @androidx.annotation.o0
    public List<Rect> b() {
        return Build.VERSION.SDK_INT >= 28 ? a.b(this.f27505a) : Collections.emptyList();
    }

    @androidx.annotation.q0
    public Path c() {
        if (Build.VERSION.SDK_INT >= 31) {
            return d.a(this.f27505a);
        }
        return null;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.f27505a);
        }
        return 0;
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.f27505a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f27505a, ((z) obj).f27505a);
    }

    public int f() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.e(this.f27505a);
        }
        return 0;
    }

    public int g() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.f(this.f27505a);
        }
        return 0;
    }

    @androidx.annotation.o0
    public androidx.core.graphics.e0 h() {
        return Build.VERSION.SDK_INT >= 30 ? androidx.core.graphics.e0.g(c.b(this.f27505a)) : androidx.core.graphics.e0.f26244e;
    }

    public int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f27505a;
        if (displayCutout == null) {
            return 0;
        }
        hashCode = displayCutout.hashCode();
        return hashCode;
    }

    @androidx.annotation.x0(28)
    DisplayCutout i() {
        return this.f27505a;
    }

    @androidx.annotation.o0
    public String toString() {
        return "DisplayCutoutCompat{" + this.f27505a + "}";
    }

    public z(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var, @androidx.annotation.q0 Rect rect, @androidx.annotation.q0 Rect rect2, @androidx.annotation.q0 Rect rect3, @androidx.annotation.q0 Rect rect4, @androidx.annotation.o0 androidx.core.graphics.e0 e0Var2) {
        this(a(e0Var, rect, rect2, rect3, rect4, e0Var2, null));
    }

    public z(@androidx.annotation.o0 androidx.core.graphics.e0 e0Var, @androidx.annotation.q0 Rect rect, @androidx.annotation.q0 Rect rect2, @androidx.annotation.q0 Rect rect3, @androidx.annotation.q0 Rect rect4, @androidx.annotation.o0 androidx.core.graphics.e0 e0Var2, @androidx.annotation.q0 Path path) {
        this(a(e0Var, rect, rect2, rect3, rect4, e0Var2, path));
    }

    private z(DisplayCutout displayCutout) {
        this.f27505a = displayCutout;
    }
}
