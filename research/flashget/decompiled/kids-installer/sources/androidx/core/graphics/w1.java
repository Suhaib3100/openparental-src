package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;
import androidx.annotation.c1;

/* compiled from: Insets.java */
/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.o0
    public static final w1 f4812e = new w1(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f4813a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4814b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4815c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4816d;

    /* compiled from: Insets.java */
    @androidx.annotation.x0(29)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static Insets a(int i5, int i6, int i7, int i8) {
            Insets of;
            of = Insets.of(i5, i6, i7, i8);
            return of;
        }
    }

    private w1(int i5, int i6, int i7, int i8) {
        this.f4813a = i5;
        this.f4814b = i6;
        this.f4815c = i7;
        this.f4816d = i8;
    }

    @androidx.annotation.o0
    public static w1 a(@androidx.annotation.o0 w1 w1Var, @androidx.annotation.o0 w1 w1Var2) {
        return d(w1Var.f4813a + w1Var2.f4813a, w1Var.f4814b + w1Var2.f4814b, w1Var.f4815c + w1Var2.f4815c, w1Var.f4816d + w1Var2.f4816d);
    }

    @androidx.annotation.o0
    public static w1 b(@androidx.annotation.o0 w1 w1Var, @androidx.annotation.o0 w1 w1Var2) {
        return d(Math.max(w1Var.f4813a, w1Var2.f4813a), Math.max(w1Var.f4814b, w1Var2.f4814b), Math.max(w1Var.f4815c, w1Var2.f4815c), Math.max(w1Var.f4816d, w1Var2.f4816d));
    }

    @androidx.annotation.o0
    public static w1 c(@androidx.annotation.o0 w1 w1Var, @androidx.annotation.o0 w1 w1Var2) {
        return d(Math.min(w1Var.f4813a, w1Var2.f4813a), Math.min(w1Var.f4814b, w1Var2.f4814b), Math.min(w1Var.f4815c, w1Var2.f4815c), Math.min(w1Var.f4816d, w1Var2.f4816d));
    }

    @androidx.annotation.o0
    public static w1 d(int i5, int i6, int i7, int i8) {
        return (i5 == 0 && i6 == 0 && i7 == 0 && i8 == 0) ? f4812e : new w1(i5, i6, i7, i8);
    }

    @androidx.annotation.o0
    public static w1 e(@androidx.annotation.o0 Rect rect) {
        return d(rect.left, rect.top, rect.right, rect.bottom);
    }

    @androidx.annotation.o0
    public static w1 f(@androidx.annotation.o0 w1 w1Var, @androidx.annotation.o0 w1 w1Var2) {
        return d(w1Var.f4813a - w1Var2.f4813a, w1Var.f4814b - w1Var2.f4814b, w1Var.f4815c - w1Var2.f4815c, w1Var.f4816d - w1Var2.f4816d);
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(api = 29)
    public static w1 g(@androidx.annotation.o0 Insets insets) {
        int i5;
        int i6;
        int i7;
        int i8;
        i5 = insets.left;
        i6 = insets.top;
        i7 = insets.right;
        i8 = insets.bottom;
        return d(i5, i6, i7, i8);
    }

    @Deprecated
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.o0
    @androidx.annotation.x0(api = 29)
    public static w1 i(@androidx.annotation.o0 Insets insets) {
        return g(insets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w1.class != obj.getClass()) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return this.f4816d == w1Var.f4816d && this.f4813a == w1Var.f4813a && this.f4815c == w1Var.f4815c && this.f4814b == w1Var.f4814b;
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(29)
    public Insets h() {
        return a.a(this.f4813a, this.f4814b, this.f4815c, this.f4816d);
    }

    public int hashCode() {
        return (((((this.f4813a * 31) + this.f4814b) * 31) + this.f4815c) * 31) + this.f4816d;
    }

    @androidx.annotation.o0
    public String toString() {
        return "Insets{left=" + this.f4813a + ", top=" + this.f4814b + ", right=" + this.f4815c + ", bottom=" + this.f4816d + '}';
    }
}
