package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;
import androidx.annotation.c1;

/* compiled from: PointerIconCompat.java */
/* loaded from: classes3.dex */
public final class h1 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f27195b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f27196c = 1000;

    /* renamed from: d, reason: collision with root package name */
    public static final int f27197d = 1001;

    /* renamed from: e, reason: collision with root package name */
    public static final int f27198e = 1002;

    /* renamed from: f, reason: collision with root package name */
    public static final int f27199f = 1003;

    /* renamed from: g, reason: collision with root package name */
    public static final int f27200g = 1004;

    /* renamed from: h, reason: collision with root package name */
    public static final int f27201h = 1006;

    /* renamed from: i, reason: collision with root package name */
    public static final int f27202i = 1007;

    /* renamed from: j, reason: collision with root package name */
    public static final int f27203j = 1008;

    /* renamed from: k, reason: collision with root package name */
    public static final int f27204k = 1009;

    /* renamed from: l, reason: collision with root package name */
    public static final int f27205l = 1010;

    /* renamed from: m, reason: collision with root package name */
    public static final int f27206m = 1011;

    /* renamed from: n, reason: collision with root package name */
    public static final int f27207n = 1012;

    /* renamed from: o, reason: collision with root package name */
    public static final int f27208o = 1013;

    /* renamed from: p, reason: collision with root package name */
    public static final int f27209p = 1014;

    /* renamed from: q, reason: collision with root package name */
    public static final int f27210q = 1015;

    /* renamed from: r, reason: collision with root package name */
    public static final int f27211r = 1016;

    /* renamed from: s, reason: collision with root package name */
    public static final int f27212s = 1017;

    /* renamed from: t, reason: collision with root package name */
    public static final int f27213t = 1018;

    /* renamed from: u, reason: collision with root package name */
    public static final int f27214u = 1019;

    /* renamed from: v, reason: collision with root package name */
    public static final int f27215v = 1020;

    /* renamed from: w, reason: collision with root package name */
    public static final int f27216w = 1021;

    /* renamed from: x, reason: collision with root package name */
    public static final int f27217x = 1000;

    /* renamed from: a, reason: collision with root package name */
    private final PointerIcon f27218a;

    /* compiled from: PointerIconCompat.java */
    @androidx.annotation.x0(24)
    static class a {
        private a() {
        }

        static PointerIcon a(Bitmap bitmap, float f4, float f5) {
            return PointerIcon.create(bitmap, f4, f5);
        }

        static PointerIcon b(Context context, int i4) {
            return PointerIcon.getSystemIcon(context, i4);
        }

        static PointerIcon c(Resources resources, int i4) {
            return PointerIcon.load(resources, i4);
        }
    }

    private h1(PointerIcon pointerIcon) {
        this.f27218a = pointerIcon;
    }

    @androidx.annotation.o0
    public static h1 a(@androidx.annotation.o0 Bitmap bitmap, float f4, float f5) {
        return new h1(PointerIcon.create(bitmap, f4, f5));
    }

    @androidx.annotation.o0
    public static h1 c(@androidx.annotation.o0 Context context, int i4) {
        return new h1(PointerIcon.getSystemIcon(context, i4));
    }

    @androidx.annotation.o0
    public static h1 d(@androidx.annotation.o0 Resources resources, int i4) {
        return new h1(PointerIcon.load(resources, i4));
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public Object b() {
        return this.f27218a;
    }
}
