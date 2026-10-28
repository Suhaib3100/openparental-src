package androidx.core.view;

import android.view.MotionEvent;

/* compiled from: MotionEventCompat.java */
/* loaded from: classes3.dex */
public final class u0 {

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
    public static final int f27405a = 255;

    /* renamed from: a0, reason: collision with root package name */
    @Deprecated
    public static final int f27406a0 = 46;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f27407b = 5;

    /* renamed from: b0, reason: collision with root package name */
    @Deprecated
    public static final int f27408b0 = 47;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f27409c = 6;

    /* renamed from: c0, reason: collision with root package name */
    @Deprecated
    public static final int f27410c0 = 1;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f27411d = 7;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f27412e = 8;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f27413f = 65280;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final int f27414g = 8;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final int f27415h = 9;

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final int f27416i = 10;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final int f27417j = 0;

    /* renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final int f27418k = 1;

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final int f27419l = 2;

    /* renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final int f27420m = 3;

    /* renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final int f27421n = 4;

    /* renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final int f27422o = 5;

    /* renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final int f27423p = 6;

    /* renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final int f27424q = 7;

    /* renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final int f27425r = 8;

    /* renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final int f27426s = 9;

    /* renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final int f27427t = 10;

    /* renamed from: u, reason: collision with root package name */
    @Deprecated
    public static final int f27428u = 11;

    /* renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final int f27429v = 12;

    /* renamed from: w, reason: collision with root package name */
    @Deprecated
    public static final int f27430w = 13;

    /* renamed from: x, reason: collision with root package name */
    @Deprecated
    public static final int f27431x = 14;

    /* renamed from: y, reason: collision with root package name */
    @Deprecated
    public static final int f27432y = 15;

    /* renamed from: z, reason: collision with root package name */
    @Deprecated
    public static final int f27433z = 16;

    private u0() {
    }

    @androidx.annotation.w0(expression = "event.findPointerIndex(pointerId)")
    @Deprecated
    public static int a(MotionEvent motionEvent, int i4) {
        return motionEvent.findPointerIndex(i4);
    }

    @androidx.annotation.w0(expression = "event.getActionIndex()")
    @Deprecated
    public static int b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @androidx.annotation.w0(expression = "event.getActionMasked()")
    @Deprecated
    public static int c(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @androidx.annotation.w0(expression = "event.getAxisValue(axis)")
    @Deprecated
    public static float d(MotionEvent motionEvent, int i4) {
        return motionEvent.getAxisValue(i4);
    }

    @androidx.annotation.w0(expression = "event.getAxisValue(axis, pointerIndex)")
    @Deprecated
    public static float e(MotionEvent motionEvent, int i4, int i5) {
        return motionEvent.getAxisValue(i4, i5);
    }

    @androidx.annotation.w0(expression = "event.getButtonState()")
    @Deprecated
    public static int f(MotionEvent motionEvent) {
        return motionEvent.getButtonState();
    }

    @androidx.annotation.w0(expression = "event.getPointerCount()")
    @Deprecated
    public static int g(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    @androidx.annotation.w0(expression = "event.getPointerId(pointerIndex)")
    @Deprecated
    public static int h(MotionEvent motionEvent, int i4) {
        return motionEvent.getPointerId(i4);
    }

    @androidx.annotation.w0(expression = "event.getSource()")
    @Deprecated
    public static int i(MotionEvent motionEvent) {
        return motionEvent.getSource();
    }

    @androidx.annotation.w0(expression = "event.getX(pointerIndex)")
    @Deprecated
    public static float j(MotionEvent motionEvent, int i4) {
        return motionEvent.getX(i4);
    }

    @androidx.annotation.w0(expression = "event.getY(pointerIndex)")
    @Deprecated
    public static float k(MotionEvent motionEvent, int i4) {
        return motionEvent.getY(i4);
    }

    public static boolean l(@androidx.annotation.o0 MotionEvent motionEvent, int i4) {
        return (motionEvent.getSource() & i4) == i4;
    }
}
