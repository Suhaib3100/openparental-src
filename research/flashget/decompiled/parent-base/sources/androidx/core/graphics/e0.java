package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;
import androidx.annotation.c1;

/* compiled from: Insets.java */
/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.o0
    public static final e0 f26244e = new e0(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f26245a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26246b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26247c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26248d;

    /* compiled from: Insets.java */
    @androidx.annotation.x0(29)
    static class a {
        private a() {
        }

        static Insets a(int i4, int i5, int i6, int i7) {
            return Insets.of(i4, i5, i6, i7);
        }
    }

    private e0(int i4, int i5, int i6, int i7) {
        this.f26245a = i4;
        this.f26246b = i5;
        this.f26247c = i6;
        this.f26248d = i7;
    }

    @androidx.annotation.o0
    public static e0 a(@androidx.annotation.o0 e0 e0Var, @androidx.annotation.o0 e0 e0Var2) {
        return d(e0Var.f26245a + e0Var2.f26245a, e0Var.f26246b + e0Var2.f26246b, e0Var.f26247c + e0Var2.f26247c, e0Var.f26248d + e0Var2.f26248d);
    }

    @androidx.annotation.o0
    public static e0 b(@androidx.annotation.o0 e0 e0Var, @androidx.annotation.o0 e0 e0Var2) {
        return d(Math.max(e0Var.f26245a, e0Var2.f26245a), Math.max(e0Var.f26246b, e0Var2.f26246b), Math.max(e0Var.f26247c, e0Var2.f26247c), Math.max(e0Var.f26248d, e0Var2.f26248d));
    }

    @androidx.annotation.o0
    public static e0 c(@androidx.annotation.o0 e0 e0Var, @androidx.annotation.o0 e0 e0Var2) {
        return d(Math.min(e0Var.f26245a, e0Var2.f26245a), Math.min(e0Var.f26246b, e0Var2.f26246b), Math.min(e0Var.f26247c, e0Var2.f26247c), Math.min(e0Var.f26248d, e0Var2.f26248d));
    }

    @androidx.annotation.o0
    public static e0 d(int i4, int i5, int i6, int i7) {
        return (i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) ? f26244e : new e0(i4, i5, i6, i7);
    }

    @androidx.annotation.o0
    public static e0 e(@androidx.annotation.o0 Rect rect) {
        return d(rect.left, rect.top, rect.right, rect.bottom);
    }

    @androidx.annotation.o0
    public static e0 f(@androidx.annotation.o0 e0 e0Var, @androidx.annotation.o0 e0 e0Var2) {
        return d(e0Var.f26245a - e0Var2.f26245a, e0Var.f26246b - e0Var2.f26246b, e0Var.f26247c - e0Var2.f26247c, e0Var.f26248d - e0Var2.f26248d);
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(api = 29)
    public static e0 g(@androidx.annotation.o0 Insets insets) {
        int i4;
        int i5;
        int i6;
        int i7;
        i4 = insets.left;
        i5 = insets.top;
        i6 = insets.right;
        i7 = insets.bottom;
        return d(i4, i5, i6, i7);
    }

    @Deprecated
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.o0
    @androidx.annotation.x0(api = 29)
    public static e0 i(@androidx.annotation.o0 Insets insets) {
        return g(insets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f26248d == e0Var.f26248d && this.f26245a == e0Var.f26245a && this.f26247c == e0Var.f26247c && this.f26246b == e0Var.f26246b;
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(29)
    public Insets h() {
        return a.a(this.f26245a, this.f26246b, this.f26247c, this.f26248d);
    }

    public int hashCode() {
        return (((((this.f26245a * 31) + this.f26246b) * 31) + this.f26247c) * 31) + this.f26248d;
    }

    @androidx.annotation.o0
    public String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f26245a);
        sb.append(", top=");
        sb.append(this.f26246b);
        sb.append(", right=");
        sb.append(this.f26247c);
        sb.append(", bottom=");
        return androidx.view.e.a(sb, this.f26248d, '}');
    }
}
