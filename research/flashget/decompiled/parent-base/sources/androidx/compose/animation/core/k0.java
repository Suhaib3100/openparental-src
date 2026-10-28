package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: EasingFunctions.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\bS\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u0017\u0010\u000b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u0017\u0010\u000e\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0004\"\u0017\u0010\u0011\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0004\"\u0017\u0010\u0014\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0004\"\u0017\u0010\u0017\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0004\"\u0017\u0010\u001a\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u0004\"\u0017\u0010\u001d\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0004\"\u0017\u0010 \u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u0004\"\u0017\u0010#\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b!\u0010\u0002\u001a\u0004\b\"\u0010\u0004\"\u0017\u0010&\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010\u0004\"\u0017\u0010(\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0002\u001a\u0004\b'\u0010\u0004\"\u0017\u0010*\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u0002\u001a\u0004\b)\u0010\u0004\"\u0017\u0010-\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b+\u0010\u0002\u001a\u0004\b,\u0010\u0004\"\u0017\u00100\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b.\u0010\u0002\u001a\u0004\b/\u0010\u0004\"\u0017\u00102\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b)\u0010\u0002\u001a\u0004\b1\u0010\u0004\"\u0017\u00104\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0002\u001a\u0004\b3\u0010\u0004\"\u0017\u00107\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b5\u0010\u0002\u001a\u0004\b6\u0010\u0004\"\u0017\u0010:\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b8\u0010\u0002\u001a\u0004\b9\u0010\u0004\"\u0017\u0010<\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010\u0002\u001a\u0004\b;\u0010\u0004\"\u0017\u0010?\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b=\u0010\u0002\u001a\u0004\b>\u0010\u0004\"\u0017\u0010A\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b@\u0010\u0002\u001a\u0004\b8\u0010\u0004\"\u0017\u0010C\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b/\u0010\u0002\u001a\u0004\bB\u0010\u0004\"\u0017\u0010E\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0002\u001a\u0004\bD\u0010\u0004\"\u0017\u0010G\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bF\u0010\u0002\u001a\u0004\b+\u0010\u0004\"\u0017\u0010I\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bD\u0010\u0002\u001a\u0004\bH\u0010\u0004\"\u0017\u0010J\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b6\u0010\u0002\u001a\u0004\b=\u0010\u0004\"\u0017\u0010K\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b>\u0010\u0002\u001a\u0004\b5\u0010\u0004\"\u0017\u0010M\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b'\u0010\u0002\u001a\u0004\bL\u0010\u0004\"\u0017\u0010N\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0002\u001a\u0004\bF\u0010\u0004\"\u0017\u0010P\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b1\u0010\u0002\u001a\u0004\bO\u0010\u0004\"\u0017\u0010Q\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b9\u0010\u0002\u001a\u0004\b.\u0010\u0004\"\u0017\u0010R\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\"\u0010\u0002\u001a\u0004\b@\u0010\u0004¨\u0006S"}, d2 = {"Landroidx/compose/animation/core/d0;", "a", "Landroidx/compose/animation/core/d0;", "m", "()Landroidx/compose/animation/core/d0;", "Ease", "b", "J", "EaseOut", "c", "n", "EaseIn", "d", "u", "EaseInOut", "e", "I", "EaseInSine", "f", "T", "EaseOutSine", "g", "E", "EaseInOutSine", "h", "r", "EaseInCubic", "i", "N", "EaseOutCubic", "j", "y", "EaseInOutCubic", "k", "H", "EaseInQuint", "l", "S", "EaseOutQuint", "D", "EaseInOutQuint", "q", "EaseInCirc", "o", "M", "EaseOutCirc", "p", "x", "EaseInOutCirc", "F", "EaseInQuad", "Q", "EaseOutQuad", "s", "B", "EaseInOutQuad", "t", "G", "EaseInQuart", "R", "EaseOutQuart", "v", "C", "EaseInOutQuart", "w", "EaseInExpo", "P", "EaseOutExpo", "A", "EaseInOutExpo", "z", "EaseInBack", "K", "EaseOutBack", "EaseInOutBack", "EaseInElastic", "O", "EaseOutElastic", "EaseInOutElastic", "L", "EaseOutBounce", "EaseInBounce", "EaseInOutBounce", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final d0 f2756a = new x(0.25f, 0.1f, 0.25f, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final d0 f2757b = new x(0.0f, 0.0f, 0.58f, 1.0f);

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final d0 f2758c = new x(0.42f, 0.0f, 1.0f, 1.0f);

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final d0 f2759d = new x(0.42f, 0.0f, 0.58f, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final d0 f2760e = new x(0.12f, 0.0f, 0.39f, 0.0f);

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final d0 f2761f = new x(0.61f, 1.0f, 0.88f, 1.0f);

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final d0 f2762g = new x(0.37f, 0.0f, 0.63f, 1.0f);

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final d0 f2763h = new x(0.32f, 0.0f, 0.67f, 0.0f);

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final d0 f2764i = new x(0.33f, 1.0f, 0.68f, 1.0f);

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private static final d0 f2765j = new x(0.65f, 0.0f, 0.35f, 1.0f);

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private static final d0 f2766k = new x(0.64f, 0.0f, 0.78f, 0.0f);

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private static final d0 f2767l = new x(0.22f, 1.0f, 0.36f, 1.0f);

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    private static final d0 f2768m = new x(0.83f, 0.0f, 0.17f, 1.0f);

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    private static final d0 f2769n = new x(0.55f, 0.0f, 1.0f, 0.45f);

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    private static final d0 f2770o = new x(0.0f, 0.55f, 0.45f, 1.0f);

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    private static final d0 f2771p = new x(0.85f, 0.0f, 0.15f, 1.0f);

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    private static final d0 f2772q = new x(0.11f, 0.0f, 0.5f, 0.0f);

    /* renamed from: r, reason: collision with root package name */
    @fg.l
    private static final d0 f2773r = new x(0.5f, 1.0f, 0.89f, 1.0f);

    /* renamed from: s, reason: collision with root package name */
    @fg.l
    private static final d0 f2774s = new x(0.45f, 0.0f, 0.55f, 1.0f);

    /* renamed from: t, reason: collision with root package name */
    @fg.l
    private static final d0 f2775t = new x(0.5f, 0.0f, 0.75f, 0.0f);

    /* renamed from: u, reason: collision with root package name */
    @fg.l
    private static final d0 f2776u = new x(0.25f, 1.0f, 0.5f, 1.0f);

    /* renamed from: v, reason: collision with root package name */
    @fg.l
    private static final d0 f2777v = new x(0.76f, 0.0f, 0.24f, 1.0f);

    /* renamed from: w, reason: collision with root package name */
    @fg.l
    private static final d0 f2778w = new x(0.7f, 0.0f, 0.84f, 0.0f);

    /* renamed from: x, reason: collision with root package name */
    @fg.l
    private static final d0 f2779x = new x(0.16f, 1.0f, 0.3f, 1.0f);

    /* renamed from: y, reason: collision with root package name */
    @fg.l
    private static final d0 f2780y = new x(0.87f, 0.0f, 0.13f, 1.0f);

    /* renamed from: z, reason: collision with root package name */
    @fg.l
    private static final d0 f2781z = new x(0.36f, 0.0f, 0.66f, -0.56f);

    @fg.l
    private static final d0 A = new x(0.34f, 1.56f, 0.64f, 1.0f);

    @fg.l
    private static final d0 B = new x(0.68f, -0.6f, 0.32f, 1.6f);

    @fg.l
    private static final d0 C = new e0();

    @fg.l
    private static final d0 D = new f0();

    @fg.l
    private static final d0 E = new g0();

    @fg.l
    private static final d0 F = new h0();

    @fg.l
    private static final d0 G = new i0();

    @fg.l
    private static final d0 H = new j0();

    @fg.l
    public static final d0 A() {
        return f2780y;
    }

    @fg.l
    public static final d0 B() {
        return f2774s;
    }

    @fg.l
    public static final d0 C() {
        return f2777v;
    }

    @fg.l
    public static final d0 D() {
        return f2768m;
    }

    @fg.l
    public static final d0 E() {
        return f2762g;
    }

    @fg.l
    public static final d0 F() {
        return f2772q;
    }

    @fg.l
    public static final d0 G() {
        return f2775t;
    }

    @fg.l
    public static final d0 H() {
        return f2766k;
    }

    @fg.l
    public static final d0 I() {
        return f2760e;
    }

    @fg.l
    public static final d0 J() {
        return f2757b;
    }

    @fg.l
    public static final d0 K() {
        return A;
    }

    @fg.l
    public static final d0 L() {
        return F;
    }

    @fg.l
    public static final d0 M() {
        return f2770o;
    }

    @fg.l
    public static final d0 N() {
        return f2764i;
    }

    @fg.l
    public static final d0 O() {
        return D;
    }

    @fg.l
    public static final d0 P() {
        return f2779x;
    }

    @fg.l
    public static final d0 Q() {
        return f2773r;
    }

    @fg.l
    public static final d0 R() {
        return f2776u;
    }

    @fg.l
    public static final d0 S() {
        return f2767l;
    }

    @fg.l
    public static final d0 T() {
        return f2761f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(float f4) {
        return 1 - F.a(1.0f - f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(float f4) {
        if (f4 == 0.0f) {
            return 0.0f;
        }
        if (f4 == 1.0f) {
            return 1.0f;
        }
        float f5 = f4 * 10.0f;
        return (float) (Math.sin((f5 - 10.75f) * 2.0943951023931953d) * (-((float) Math.pow(2.0f, f5 - 10.0f))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float i(float f4) {
        if (f4 < 0.5d) {
            return (1 - F.a(1.0f - (f4 * 2.0f))) / 2.0f;
        }
        return (F.a((f4 * 2.0f) - 1.0f) + 1) / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j(float f4) {
        if (f4 == 0.0f) {
            return 0.0f;
        }
        if (f4 == 1.0f) {
            return 1.0f;
        }
        if (0.0f > f4 || f4 > 0.5f) {
            return ((float) ((Math.sin(((f4 * 20.0f) - 11.125f) * 1.3962634015954636d) * ((float) Math.pow(r8, ((-20.0f) * f4) + 10.0f))) / 2.0f)) + 1.0f;
        }
        float f5 = f4 * 20.0f;
        return (float) ((-(Math.sin((f5 - 11.125f) * 1.3962634015954636d) * ((float) Math.pow(r0, f5 - 10.0f)))) / 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float k(float f4) {
        float f5;
        float f6;
        if (f4 < 0.36363637f) {
            return 7.5625f * f4 * f4;
        }
        if (f4 < 0.72727275f) {
            float f7 = f4 - 0.54545456f;
            f5 = 7.5625f * f7 * f7;
            f6 = 0.75f;
        } else if (f4 < 0.90909094f) {
            float f10 = f4 - 0.8181818f;
            f5 = 7.5625f * f10 * f10;
            f6 = 0.9375f;
        } else {
            float f11 = f4 - 0.95454544f;
            f5 = 7.5625f * f11 * f11;
            f6 = 0.984375f;
        }
        return f5 + f6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float l(float f4) {
        if (f4 == 0.0f) {
            return 0.0f;
        }
        if (f4 == 1.0f) {
            return 1.0f;
        }
        return (float) ((Math.sin(((f4 * 10.0f) - 0.75f) * 2.0943951023931953d) * ((float) Math.pow(2.0f, (-10.0f) * f4))) + 1.0f);
    }

    @fg.l
    public static final d0 m() {
        return f2756a;
    }

    @fg.l
    public static final d0 n() {
        return f2758c;
    }

    @fg.l
    public static final d0 o() {
        return f2781z;
    }

    @fg.l
    public static final d0 p() {
        return G;
    }

    @fg.l
    public static final d0 q() {
        return f2769n;
    }

    @fg.l
    public static final d0 r() {
        return f2763h;
    }

    @fg.l
    public static final d0 s() {
        return C;
    }

    @fg.l
    public static final d0 t() {
        return f2778w;
    }

    @fg.l
    public static final d0 u() {
        return f2759d;
    }

    @fg.l
    public static final d0 v() {
        return B;
    }

    @fg.l
    public static final d0 w() {
        return H;
    }

    @fg.l
    public static final d0 x() {
        return f2771p;
    }

    @fg.l
    public static final d0 y() {
        return f2765j;
    }

    @fg.l
    public static final d0 z() {
        return E;
    }
}
