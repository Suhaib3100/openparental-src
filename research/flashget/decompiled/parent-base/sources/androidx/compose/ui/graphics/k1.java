package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* compiled from: BlendMode.kt */
@kd.g
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/k1;", "", "", "value", "E", "(I)I", "", "I", "(I)Ljava/lang/String;", "H", "other", "", "F", "(ILjava/lang/Object;)Z", "a", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k1 {
    private static final int A = 24;
    private static final int B = 25;
    private static final int C = 26;
    private static final int D = 27;
    private static final int E = 28;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final int f17874c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f17875d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f17876e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final int f17877f = 3;

    /* renamed from: g, reason: collision with root package name */
    private static final int f17878g = 4;

    /* renamed from: h, reason: collision with root package name */
    private static final int f17879h = 5;

    /* renamed from: i, reason: collision with root package name */
    private static final int f17880i = 6;

    /* renamed from: j, reason: collision with root package name */
    private static final int f17881j = 7;

    /* renamed from: k, reason: collision with root package name */
    private static final int f17882k = 8;

    /* renamed from: l, reason: collision with root package name */
    private static final int f17883l = 9;

    /* renamed from: m, reason: collision with root package name */
    private static final int f17884m = 10;

    /* renamed from: n, reason: collision with root package name */
    private static final int f17885n = 11;

    /* renamed from: o, reason: collision with root package name */
    private static final int f17886o = 12;

    /* renamed from: p, reason: collision with root package name */
    private static final int f17887p = 13;

    /* renamed from: q, reason: collision with root package name */
    private static final int f17888q = 14;

    /* renamed from: r, reason: collision with root package name */
    private static final int f17889r = 15;

    /* renamed from: s, reason: collision with root package name */
    private static final int f17890s = 16;

    /* renamed from: t, reason: collision with root package name */
    private static final int f17891t = 17;

    /* renamed from: u, reason: collision with root package name */
    private static final int f17892u = 18;

    /* renamed from: v, reason: collision with root package name */
    private static final int f17893v = 19;

    /* renamed from: w, reason: collision with root package name */
    private static final int f17894w = 20;

    /* renamed from: x, reason: collision with root package name */
    private static final int f17895x = 21;

    /* renamed from: y, reason: collision with root package name */
    private static final int f17896y = 22;

    /* renamed from: z, reason: collision with root package name */
    private static final int f17897z = 23;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* compiled from: BlendMode.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b=\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u0017\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001d\u0010\u0019\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001d\u0010\u001b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001d\u0010\u001d\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001d\u0010\u001f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u001d\u0010!\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u001d\u0010#\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u001d\u0010%\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u001d\u0010'\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u001d\u0010)\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u001d\u0010+\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u001d\u0010-\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u001d\u0010/\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\bR\u001d\u00101\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u001d\u00103\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u001d\u00105\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u001d\u00107\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u001d\u00109\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u001d\u0010;\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u001d\u0010=\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u001d\u0010?\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Landroidx/compose/ui/graphics/k1$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/k1;", "Clear", "I", "a", "()I", "Src", "x", "Dst", "g", "SrcOver", "B", "DstOver", "k", "SrcIn", "z", "DstIn", "i", "SrcOut", "A", "DstOut", "j", "SrcAtop", "y", "DstAtop", "h", "Xor", "C", "Plus", "t", "Modulate", "q", "Screen", "v", "Overlay", "s", "Darken", "e", "Lighten", "o", "ColorDodge", "d", "ColorBurn", "c", "Hardlight", "m", "Softlight", "w", "Difference", "f", "Exclusion", "l", "Multiply", "r", "Hue", "n", "Saturation", "u", "Color", "b", "Luminosity", "p", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.k1$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final int A() {
            return k1.f17881j;
        }

        public final int B() {
            return k1.f17877f;
        }

        public final int C() {
            return k1.f17885n;
        }

        public final int a() {
            return k1.f17874c;
        }

        public final int b() {
            return k1.D;
        }

        public final int c() {
            return k1.f17893v;
        }

        public final int d() {
            return k1.f17892u;
        }

        public final int e() {
            return k1.f17890s;
        }

        public final int f() {
            return k1.f17896y;
        }

        public final int g() {
            return k1.f17876e;
        }

        public final int h() {
            return k1.f17884m;
        }

        public final int i() {
            return k1.f17880i;
        }

        public final int j() {
            return k1.f17882k;
        }

        public final int k() {
            return k1.f17878g;
        }

        public final int l() {
            return k1.f17897z;
        }

        public final int m() {
            return k1.f17894w;
        }

        public final int n() {
            return k1.B;
        }

        public final int o() {
            return k1.f17891t;
        }

        public final int p() {
            return k1.E;
        }

        public final int q() {
            return k1.f17887p;
        }

        public final int r() {
            return k1.A;
        }

        public final int s() {
            return k1.f17889r;
        }

        public final int t() {
            return k1.f17886o;
        }

        public final int u() {
            return k1.C;
        }

        public final int v() {
            return k1.f17888q;
        }

        public final int w() {
            return k1.f17895x;
        }

        public final int x() {
            return k1.f17875d;
        }

        public final int y() {
            return k1.f17883l;
        }

        public final int z() {
            return k1.f17879h;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private /* synthetic */ k1(int i4) {
        this.value = i4;
    }

    public static final /* synthetic */ k1 D(int i4) {
        return new k1(i4);
    }

    public static int E(int i4) {
        return i4;
    }

    public static boolean F(int i4, Object obj) {
        return (obj instanceof k1) && i4 == ((k1) obj).value;
    }

    public static final boolean G(int i4, int i5) {
        return i4 == i5;
    }

    public static int H(int i4) {
        return Integer.hashCode(i4);
    }

    @fg.l
    public static String I(int i4) {
        return G(i4, f17874c) ? "Clear" : G(i4, f17875d) ? "Src" : G(i4, f17876e) ? "Dst" : G(i4, f17877f) ? "SrcOver" : G(i4, f17878g) ? "DstOver" : G(i4, f17879h) ? "SrcIn" : G(i4, f17880i) ? "DstIn" : G(i4, f17881j) ? "SrcOut" : G(i4, f17882k) ? "DstOut" : G(i4, f17883l) ? "SrcAtop" : G(i4, f17884m) ? "DstAtop" : G(i4, f17885n) ? "Xor" : G(i4, f17886o) ? "Plus" : G(i4, f17887p) ? "Modulate" : G(i4, f17888q) ? "Screen" : G(i4, f17889r) ? "Overlay" : G(i4, f17890s) ? "Darken" : G(i4, f17891t) ? "Lighten" : G(i4, f17892u) ? "ColorDodge" : G(i4, f17893v) ? "ColorBurn" : G(i4, f17894w) ? "HardLight" : G(i4, f17895x) ? "Softlight" : G(i4, f17896y) ? "Difference" : G(i4, f17897z) ? "Exclusion" : G(i4, A) ? "Multiply" : G(i4, B) ? "Hue" : G(i4, C) ? "Saturation" : G(i4, D) ? "Color" : G(i4, E) ? "Luminosity" : "Unknown";
    }

    /* renamed from: J, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return F(this.value, obj);
    }

    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    @fg.l
    public String toString() {
        return I(this.value);
    }
}
