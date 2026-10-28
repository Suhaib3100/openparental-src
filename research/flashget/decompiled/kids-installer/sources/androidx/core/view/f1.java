package androidx.core.view;

import android.view.MotionEvent;

/* compiled from: MotionEventCompat.java */
/* loaded from: classes.dex */
public final class f1 {

    @Deprecated
    public static final int A = 17;

    @Deprecated
    public static final int B = 18;

    @Deprecated
    public static final int C = 19;

    @Deprecated
    public static final int D = 20;

    @Deprecated
    public static final int E = 21;

    @Deprecated
    public static final int F = 22;

    @Deprecated
    public static final int G = 23;

    @Deprecated
    public static final int H = 24;

    @Deprecated
    public static final int I = 25;
    public static final int J = 26;
    public static final int K = 27;
    public static final int L = 28;

    @Deprecated
    public static final int M = 32;

    @Deprecated
    public static final int N = 33;

    @Deprecated
    public static final int O = 34;

    @Deprecated
    public static final int P = 35;

    @Deprecated
    public static final int Q = 36;

    @Deprecated
    public static final int R = 37;

    @Deprecated
    public static final int S = 38;

    @Deprecated
    public static final int T = 39;

    @Deprecated
    public static final int U = 40;

    @Deprecated
    public static final int V = 41;

    @Deprecated
    public static final int W = 42;

    @Deprecated
    public static final int X = 43;

    @Deprecated
    public static final int Y = 44;

    @Deprecated
    public static final int Z = 45;

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f5496a = 255;

    /* renamed from: a0, reason: collision with root package name */
    @Deprecated
    public static final int f5497a0 = 46;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f5498b = 5;

    /* renamed from: b0, reason: collision with root package name */
    @Deprecated
    public static final int f5499b0 = 47;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f5500c = 6;

    /* renamed from: c0, reason: collision with root package name */
    @Deprecated
    public static final int f5501c0 = 1;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f5502d = 7;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f5503e = 8;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f5504f = 65280;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final int f5505g = 8;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final int f5506h = 9;

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final int f5507i = 10;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final int f5508j = 0;

    /* renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final int f5509k = 1;

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final int f5510l = 2;

    /* renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final int f5511m = 3;

    /* renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final int f5512n = 4;

    /* renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final int f5513o = 5;

    /* renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final int f5514p = 6;

    /* renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final int f5515q = 7;

    /* renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final int f5516r = 8;

    /* renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final int f5517s = 9;

    /* renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final int f5518t = 10;

    /* renamed from: u, reason: collision with root package name */
    @Deprecated
    public static final int f5519u = 11;

    /* renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final int f5520v = 12;

    /* renamed from: w, reason: collision with root package name */
    @Deprecated
    public static final int f5521w = 13;

    /* renamed from: x, reason: collision with root package name */
    @Deprecated
    public static final int f5522x = 14;

    /* renamed from: y, reason: collision with root package name */
    @Deprecated
    public static final int f5523y = 15;

    /* renamed from: z, reason: collision with root package name */
    @Deprecated
    public static final int f5524z = 16;

    private f1() {
    }

    @Deprecated
    public static int a(MotionEvent motionEvent, int i5) {
        return motionEvent.findPointerIndex(i5);
    }

    @Deprecated
    public static int b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    public static int c(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @Deprecated
    public static float d(MotionEvent motionEvent, int i5) {
        return motionEvent.getAxisValue(i5);
    }

    @Deprecated
    public static float e(MotionEvent motionEvent, int i5, int i6) {
        return motionEvent.getAxisValue(i5, i6);
    }

    @Deprecated
    public static int f(MotionEvent motionEvent) {
        return motionEvent.getButtonState();
    }

    @Deprecated
    public static int g(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    @Deprecated
    public static int h(MotionEvent motionEvent, int i5) {
        return motionEvent.getPointerId(i5);
    }

    @Deprecated
    public static int i(MotionEvent motionEvent) {
        return motionEvent.getSource();
    }

    @Deprecated
    public static float j(MotionEvent motionEvent, int i5) {
        return motionEvent.getX(i5);
    }

    @Deprecated
    public static float k(MotionEvent motionEvent, int i5) {
        return motionEvent.getY(i5);
    }

    public static boolean l(@androidx.annotation.o0 MotionEvent motionEvent, int i5) {
        return (motionEvent.getSource() & i5) == i5;
    }
}
