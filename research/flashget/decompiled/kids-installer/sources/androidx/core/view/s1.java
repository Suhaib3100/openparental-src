package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;
import androidx.annotation.c1;

/* compiled from: PointerIconCompat.java */
/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f5661b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5662c = 1000;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5663d = 1001;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5664e = 1002;

    /* renamed from: f, reason: collision with root package name */
    public static final int f5665f = 1003;

    /* renamed from: g, reason: collision with root package name */
    public static final int f5666g = 1004;

    /* renamed from: h, reason: collision with root package name */
    public static final int f5667h = 1006;

    /* renamed from: i, reason: collision with root package name */
    public static final int f5668i = 1007;

    /* renamed from: j, reason: collision with root package name */
    public static final int f5669j = 1008;

    /* renamed from: k, reason: collision with root package name */
    public static final int f5670k = 1009;

    /* renamed from: l, reason: collision with root package name */
    public static final int f5671l = 1010;

    /* renamed from: m, reason: collision with root package name */
    public static final int f5672m = 1011;

    /* renamed from: n, reason: collision with root package name */
    public static final int f5673n = 1012;

    /* renamed from: o, reason: collision with root package name */
    public static final int f5674o = 1013;

    /* renamed from: p, reason: collision with root package name */
    public static final int f5675p = 1014;

    /* renamed from: q, reason: collision with root package name */
    public static final int f5676q = 1015;

    /* renamed from: r, reason: collision with root package name */
    public static final int f5677r = 1016;

    /* renamed from: s, reason: collision with root package name */
    public static final int f5678s = 1017;

    /* renamed from: t, reason: collision with root package name */
    public static final int f5679t = 1018;

    /* renamed from: u, reason: collision with root package name */
    public static final int f5680u = 1019;

    /* renamed from: v, reason: collision with root package name */
    public static final int f5681v = 1020;

    /* renamed from: w, reason: collision with root package name */
    public static final int f5682w = 1021;

    /* renamed from: x, reason: collision with root package name */
    public static final int f5683x = 1000;

    /* renamed from: a, reason: collision with root package name */
    private final PointerIcon f5684a;

    /* compiled from: PointerIconCompat.java */
    @androidx.annotation.x0(24)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static PointerIcon a(Bitmap bitmap, float f6, float f7) {
            return PointerIcon.create(bitmap, f6, f7);
        }

        @androidx.annotation.u
        static PointerIcon b(Context context, int i5) {
            return PointerIcon.getSystemIcon(context, i5);
        }

        @androidx.annotation.u
        static PointerIcon c(Resources resources, int i5) {
            return PointerIcon.load(resources, i5);
        }
    }

    private s1(PointerIcon pointerIcon) {
        this.f5684a = pointerIcon;
    }

    @androidx.annotation.o0
    public static s1 a(@androidx.annotation.o0 Bitmap bitmap, float f6, float f7) {
        return new s1(a.a(bitmap, f6, f7));
    }

    @androidx.annotation.o0
    public static s1 c(@androidx.annotation.o0 Context context, int i5) {
        return new s1(a.b(context, i5));
    }

    @androidx.annotation.o0
    public static s1 d(@androidx.annotation.o0 Resources resources, int i5) {
        return new s1(a.c(resources, i5));
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public Object b() {
        return this.f5684a;
    }
}
