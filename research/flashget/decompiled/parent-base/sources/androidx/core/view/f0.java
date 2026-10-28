package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;

/* compiled from: GravityCompat.java */
/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f27128a = 8388608;

    /* renamed from: b, reason: collision with root package name */
    public static final int f27129b = 8388611;

    /* renamed from: c, reason: collision with root package name */
    public static final int f27130c = 8388613;

    /* renamed from: d, reason: collision with root package name */
    public static final int f27131d = 8388615;

    private f0() {
    }

    public static void a(int i4, int i5, int i6, @androidx.annotation.o0 Rect rect, int i7, int i10, @androidx.annotation.o0 Rect rect2, int i11) {
        Gravity.apply(i4, i5, i6, rect, i7, i10, rect2, i11);
    }

    public static void b(int i4, int i5, int i6, @androidx.annotation.o0 Rect rect, @androidx.annotation.o0 Rect rect2, int i7) {
        Gravity.apply(i4, i5, i6, rect, rect2, i7);
    }

    public static void c(int i4, @androidx.annotation.o0 Rect rect, @androidx.annotation.o0 Rect rect2, int i5) {
        Gravity.applyDisplay(i4, rect, rect2, i5);
    }

    public static int d(int i4, int i5) {
        return Gravity.getAbsoluteGravity(i4, i5);
    }
}
