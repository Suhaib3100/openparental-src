package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;

/* compiled from: GravityCompat.java */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5463a = 8388608;

    /* renamed from: b, reason: collision with root package name */
    public static final int f5464b = 8388611;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5465c = 8388613;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5466d = 8388615;

    /* compiled from: GravityCompat.java */
    @androidx.annotation.x0(17)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(int i5, int i6, int i7, Rect rect, int i8, int i9, Rect rect2, int i10) {
            Gravity.apply(i5, i6, i7, rect, i8, i9, rect2, i10);
        }

        @androidx.annotation.u
        static void b(int i5, int i6, int i7, Rect rect, Rect rect2, int i8) {
            Gravity.apply(i5, i6, i7, rect, rect2, i8);
        }

        @androidx.annotation.u
        static void c(int i5, Rect rect, Rect rect2, int i6) {
            Gravity.applyDisplay(i5, rect, rect2, i6);
        }
    }

    private d0() {
    }

    public static void a(int i5, int i6, int i7, @androidx.annotation.o0 Rect rect, int i8, int i9, @androidx.annotation.o0 Rect rect2, int i10) {
        a.a(i5, i6, i7, rect, i8, i9, rect2, i10);
    }

    public static void b(int i5, int i6, int i7, @androidx.annotation.o0 Rect rect, @androidx.annotation.o0 Rect rect2, int i8) {
        a.b(i5, i6, i7, rect, rect2, i8);
    }

    public static void c(int i5, @androidx.annotation.o0 Rect rect, @androidx.annotation.o0 Rect rect2, int i6) {
        a.c(i5, rect, rect2, i6);
    }

    public static int d(int i5, int i6) {
        return Gravity.getAbsoluteGravity(i5, i6);
    }
}
