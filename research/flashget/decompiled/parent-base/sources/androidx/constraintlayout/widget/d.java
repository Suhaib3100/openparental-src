package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.j;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.t;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.g;
import com.google.firebase.remoteconfig.p;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet.java */
/* loaded from: classes.dex */
public class d {
    public static final int A = 1;
    private static final int A0 = 29;
    private static final int A1 = 81;
    public static final int B = 0;
    private static final int B0 = 30;
    private static final int B1 = 82;
    public static final int C = 1;
    private static final int C0 = 31;
    private static final int C1 = 83;
    public static final int D = 0;
    private static final int D0 = 32;
    private static final int D1 = 84;
    public static final int E = 4;
    private static final int E0 = 33;
    private static final int E1 = 85;
    public static final int F = 8;
    private static final int F0 = 34;
    private static final int F1 = 86;
    public static final int G = 1;
    private static final int G0 = 35;
    private static final int G1 = 87;
    public static final int H = 2;
    private static final int H0 = 36;
    private static final int H1 = 88;
    public static final int I = 3;
    private static final int I0 = 37;
    private static final int I1 = 89;
    public static final int J = 4;
    private static final int J0 = 38;
    private static final int J1 = 90;
    public static final int K = 5;
    private static final int K0 = 39;
    private static final int K1 = 91;
    public static final int L = 6;
    private static final int L0 = 40;
    private static final int L1 = 92;
    public static final int M = 7;
    private static final int M0 = 41;
    private static final int M1 = 93;
    public static final int N = 8;
    private static final int N0 = 42;
    private static final int N1 = 94;
    public static final int O = 0;
    private static final int O0 = 43;
    private static final int O1 = 95;
    public static final int P = 1;
    private static final int P0 = 44;
    private static final int P1 = 96;
    public static final int Q = 0;
    private static final int Q0 = 45;
    private static final int Q1 = 97;
    public static final int R = 1;
    private static final int R0 = 46;
    private static final int R1 = 98;
    public static final int S = 2;
    private static final int S0 = 47;
    private static final int S1 = 99;
    private static final boolean T = false;
    private static final int T0 = 48;
    private static final int U0 = 49;
    private static final int V = 1;
    private static final int V0 = 50;
    private static final int W0 = 51;
    private static final int X0 = 52;
    private static final int Y = 1;
    private static final int Y0 = 53;
    private static final int Z = 2;
    private static final int Z0 = 54;

    /* renamed from: a0, reason: collision with root package name */
    private static final int f23966a0 = 3;

    /* renamed from: a1, reason: collision with root package name */
    private static final int f23967a1 = 55;

    /* renamed from: b0, reason: collision with root package name */
    private static final int f23968b0 = 4;

    /* renamed from: b1, reason: collision with root package name */
    private static final int f23969b1 = 56;

    /* renamed from: c0, reason: collision with root package name */
    private static final int f23970c0 = 5;

    /* renamed from: c1, reason: collision with root package name */
    private static final int f23971c1 = 57;

    /* renamed from: d0, reason: collision with root package name */
    private static final int f23972d0 = 6;

    /* renamed from: d1, reason: collision with root package name */
    private static final int f23973d1 = 58;

    /* renamed from: e0, reason: collision with root package name */
    private static final int f23974e0 = 7;

    /* renamed from: e1, reason: collision with root package name */
    private static final int f23975e1 = 59;

    /* renamed from: f0, reason: collision with root package name */
    private static final int f23976f0 = 8;

    /* renamed from: f1, reason: collision with root package name */
    private static final int f23977f1 = 60;

    /* renamed from: g0, reason: collision with root package name */
    private static final int f23978g0 = 9;

    /* renamed from: g1, reason: collision with root package name */
    private static final int f23979g1 = 61;

    /* renamed from: h0, reason: collision with root package name */
    private static final int f23981h0 = 10;

    /* renamed from: h1, reason: collision with root package name */
    private static final int f23982h1 = 62;

    /* renamed from: i0, reason: collision with root package name */
    private static final int f23984i0 = 11;

    /* renamed from: i1, reason: collision with root package name */
    private static final int f23985i1 = 63;

    /* renamed from: j, reason: collision with root package name */
    private static final int f23986j = -1;

    /* renamed from: j0, reason: collision with root package name */
    private static final int f23987j0 = 12;

    /* renamed from: j1, reason: collision with root package name */
    private static final int f23988j1 = 64;

    /* renamed from: k, reason: collision with root package name */
    private static final int f23989k = -2;

    /* renamed from: k0, reason: collision with root package name */
    private static final int f23990k0 = 13;

    /* renamed from: k1, reason: collision with root package name */
    private static final int f23991k1 = 65;

    /* renamed from: l, reason: collision with root package name */
    private static final int f23992l = -3;

    /* renamed from: l0, reason: collision with root package name */
    private static final int f23993l0 = 14;

    /* renamed from: l1, reason: collision with root package name */
    private static final int f23994l1 = 66;

    /* renamed from: m, reason: collision with root package name */
    private static final int f23995m = -4;

    /* renamed from: m0, reason: collision with root package name */
    private static final int f23996m0 = 15;

    /* renamed from: m1, reason: collision with root package name */
    private static final int f23997m1 = 67;

    /* renamed from: n, reason: collision with root package name */
    public static final int f23998n = 0;

    /* renamed from: n0, reason: collision with root package name */
    private static final int f23999n0 = 16;

    /* renamed from: n1, reason: collision with root package name */
    private static final int f24000n1 = 68;

    /* renamed from: o, reason: collision with root package name */
    public static final int f24001o = 1;

    /* renamed from: o0, reason: collision with root package name */
    private static final int f24002o0 = 17;

    /* renamed from: o1, reason: collision with root package name */
    private static final int f24003o1 = 69;

    /* renamed from: p, reason: collision with root package name */
    public static final int f24004p = 2;

    /* renamed from: p0, reason: collision with root package name */
    private static final int f24005p0 = 18;

    /* renamed from: p1, reason: collision with root package name */
    private static final int f24006p1 = 70;

    /* renamed from: q, reason: collision with root package name */
    public static final int f24007q = 3;

    /* renamed from: q0, reason: collision with root package name */
    private static final int f24008q0 = 19;

    /* renamed from: q1, reason: collision with root package name */
    private static final int f24009q1 = 71;

    /* renamed from: r, reason: collision with root package name */
    public static final int f24010r = 4;

    /* renamed from: r0, reason: collision with root package name */
    private static final int f24011r0 = 20;

    /* renamed from: r1, reason: collision with root package name */
    private static final int f24012r1 = 72;

    /* renamed from: s, reason: collision with root package name */
    public static final int f24013s = -1;

    /* renamed from: s0, reason: collision with root package name */
    private static final int f24014s0 = 21;

    /* renamed from: s1, reason: collision with root package name */
    private static final int f24015s1 = 73;

    /* renamed from: t, reason: collision with root package name */
    public static final int f24016t = 0;

    /* renamed from: t0, reason: collision with root package name */
    private static final int f24017t0 = 22;

    /* renamed from: t1, reason: collision with root package name */
    private static final int f24018t1 = 74;

    /* renamed from: u, reason: collision with root package name */
    public static final int f24019u = -2;

    /* renamed from: u0, reason: collision with root package name */
    private static final int f24020u0 = 23;

    /* renamed from: u1, reason: collision with root package name */
    private static final int f24021u1 = 75;

    /* renamed from: v, reason: collision with root package name */
    public static final int f24022v = 1;

    /* renamed from: v0, reason: collision with root package name */
    private static final int f24023v0 = 24;

    /* renamed from: v1, reason: collision with root package name */
    private static final int f24024v1 = 76;

    /* renamed from: w, reason: collision with root package name */
    public static final int f24025w = 0;

    /* renamed from: w0, reason: collision with root package name */
    private static final int f24026w0 = 25;

    /* renamed from: w1, reason: collision with root package name */
    private static final int f24027w1 = 77;

    /* renamed from: x, reason: collision with root package name */
    public static final int f24028x = 2;

    /* renamed from: x0, reason: collision with root package name */
    private static final int f24029x0 = 26;

    /* renamed from: x1, reason: collision with root package name */
    private static final int f24030x1 = 78;

    /* renamed from: y, reason: collision with root package name */
    public static final int f24031y = 0;

    /* renamed from: y0, reason: collision with root package name */
    private static final int f24032y0 = 27;

    /* renamed from: y1, reason: collision with root package name */
    private static final int f24033y1 = 79;

    /* renamed from: z, reason: collision with root package name */
    public static final int f24034z = 0;

    /* renamed from: z0, reason: collision with root package name */
    private static final int f24035z0 = 28;

    /* renamed from: z1, reason: collision with root package name */
    private static final int f24036z1 = 80;

    /* renamed from: a, reason: collision with root package name */
    private boolean f24037a;

    /* renamed from: b, reason: collision with root package name */
    public String f24038b;

    /* renamed from: c, reason: collision with root package name */
    public String f24039c = "";

    /* renamed from: d, reason: collision with root package name */
    public int f24040d = 0;

    /* renamed from: e, reason: collision with root package name */
    private HashMap<String, androidx.constraintlayout.widget.a> f24041e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private boolean f24042f = true;

    /* renamed from: g, reason: collision with root package name */
    private HashMap<Integer, a> f24043g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private static final String f23980h = "ConstraintSet";

    /* renamed from: i, reason: collision with root package name */
    private static final String f23983i = "XML parser error must be within a Constraint ";
    private static final String V1 = "parent";
    private static final String U1 = "ratio";
    private static final String T1 = "weight";
    private static final int[] U = {0, 4, 8};
    private static SparseIntArray W = new SparseIntArray();
    private static SparseIntArray X = new SparseIntArray();

    /* compiled from: ConstraintSet.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f24044a;

        /* renamed from: b, reason: collision with root package name */
        String f24045b;

        /* renamed from: c, reason: collision with root package name */
        public final C0398d f24046c = new C0398d();

        /* renamed from: d, reason: collision with root package name */
        public final c f24047d = new c();

        /* renamed from: e, reason: collision with root package name */
        public final b f24048e = new b();

        /* renamed from: f, reason: collision with root package name */
        public final e f24049f = new e();

        /* renamed from: g, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.a> f24050g = new HashMap<>();

        /* renamed from: h, reason: collision with root package name */
        C0397a f24051h;

        /* compiled from: ConstraintSet.java */
        /* renamed from: androidx.constraintlayout.widget.d$a$a, reason: collision with other inner class name */
        static class C0397a {

            /* renamed from: m, reason: collision with root package name */
            private static final int f24052m = 4;

            /* renamed from: n, reason: collision with root package name */
            private static final int f24053n = 10;

            /* renamed from: o, reason: collision with root package name */
            private static final int f24054o = 10;

            /* renamed from: p, reason: collision with root package name */
            private static final int f24055p = 5;

            /* renamed from: a, reason: collision with root package name */
            int[] f24056a = new int[10];

            /* renamed from: b, reason: collision with root package name */
            int[] f24057b = new int[10];

            /* renamed from: c, reason: collision with root package name */
            int f24058c = 0;

            /* renamed from: d, reason: collision with root package name */
            int[] f24059d = new int[10];

            /* renamed from: e, reason: collision with root package name */
            float[] f24060e = new float[10];

            /* renamed from: f, reason: collision with root package name */
            int f24061f = 0;

            /* renamed from: g, reason: collision with root package name */
            int[] f24062g = new int[5];

            /* renamed from: h, reason: collision with root package name */
            String[] f24063h = new String[5];

            /* renamed from: i, reason: collision with root package name */
            int f24064i = 0;

            /* renamed from: j, reason: collision with root package name */
            int[] f24065j = new int[4];

            /* renamed from: k, reason: collision with root package name */
            boolean[] f24066k = new boolean[4];

            /* renamed from: l, reason: collision with root package name */
            int f24067l = 0;

            C0397a() {
            }

            void a(int type, float value) {
                int i4 = this.f24061f;
                int[] iArr = this.f24059d;
                if (i4 >= iArr.length) {
                    this.f24059d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f24060e;
                    this.f24060e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f24059d;
                int i5 = this.f24061f;
                iArr2[i5] = type;
                float[] fArr2 = this.f24060e;
                this.f24061f = i5 + 1;
                fArr2[i5] = value;
            }

            void b(int type, int value) {
                int i4 = this.f24058c;
                int[] iArr = this.f24056a;
                if (i4 >= iArr.length) {
                    this.f24056a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f24057b;
                    this.f24057b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f24056a;
                int i5 = this.f24058c;
                iArr3[i5] = type;
                int[] iArr4 = this.f24057b;
                this.f24058c = i5 + 1;
                iArr4[i5] = value;
            }

            void c(int type, String value) {
                int i4 = this.f24064i;
                int[] iArr = this.f24062g;
                if (i4 >= iArr.length) {
                    this.f24062g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f24063h;
                    this.f24063h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f24062g;
                int i5 = this.f24064i;
                iArr2[i5] = type;
                String[] strArr2 = this.f24063h;
                this.f24064i = i5 + 1;
                strArr2[i5] = value;
            }

            void d(int type, boolean value) {
                int i4 = this.f24067l;
                int[] iArr = this.f24065j;
                if (i4 >= iArr.length) {
                    this.f24065j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f24066k;
                    this.f24066k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f24065j;
                int i5 = this.f24067l;
                iArr2[i5] = type;
                boolean[] zArr2 = this.f24066k;
                this.f24067l = i5 + 1;
                zArr2[i5] = value;
            }

            void e(a c5) {
                for (int i4 = 0; i4 < this.f24058c; i4++) {
                    d.S0(c5, this.f24056a[i4], this.f24057b[i4]);
                }
                for (int i5 = 0; i5 < this.f24061f; i5++) {
                    d.R0(c5, this.f24059d[i5], this.f24060e[i5]);
                }
                for (int i6 = 0; i6 < this.f24064i; i6++) {
                    d.T0(c5, this.f24062g[i6], this.f24063h[i6]);
                }
                for (int i7 = 0; i7 < this.f24067l; i7++) {
                    d.U0(c5, this.f24065j[i7], this.f24066k[i7]);
                }
            }

            @SuppressLint({"LogConditional"})
            void f(String tag) {
                for (int i4 = 0; i4 < this.f24058c; i4++) {
                    int i5 = this.f24056a[i4];
                    int i6 = this.f24057b[i4];
                }
                for (int i7 = 0; i7 < this.f24061f; i7++) {
                    int i10 = this.f24059d[i7];
                    float f4 = this.f24060e[i7];
                }
                for (int i11 = 0; i11 < this.f24064i; i11++) {
                    int i12 = this.f24062g[i11];
                    String str = this.f24063h[i11];
                }
                for (int i13 = 0; i13 < this.f24067l; i13++) {
                    int i14 = this.f24065j[i13];
                    boolean z4 = this.f24066k[i13];
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(int viewId, ConstraintLayout.LayoutParams param) {
            this.f24044a = viewId;
            b bVar = this.f24048e;
            bVar.f24121j = param.f23837f;
            bVar.f24123k = param.f23839g;
            bVar.f24125l = param.f23841h;
            bVar.f24127m = param.f23843i;
            bVar.f24129n = param.f23845j;
            bVar.f24131o = param.f23847k;
            bVar.f24133p = param.f23849l;
            bVar.f24135q = param.f23851m;
            bVar.f24137r = param.f23852n;
            bVar.f24138s = param.f23853o;
            bVar.f24139t = param.f23854p;
            bVar.f24140u = param.f23858t;
            bVar.f24141v = param.f23859u;
            bVar.f24142w = param.f23860v;
            bVar.f24143x = param.f23861w;
            bVar.f24144y = param.H;
            bVar.f24145z = param.I;
            bVar.A = param.J;
            bVar.B = param.f23855q;
            bVar.C = param.f23856r;
            bVar.D = param.f23857s;
            bVar.E = param.M2;
            bVar.F = param.N2;
            bVar.G = param.O2;
            bVar.f24117h = param.f23833d;
            bVar.f24113f = param.f23829b;
            bVar.f24115g = param.f23831c;
            bVar.f24109d = ((ViewGroup.MarginLayoutParams) param).width;
            bVar.f24111e = ((ViewGroup.MarginLayoutParams) param).height;
            bVar.H = ((ViewGroup.MarginLayoutParams) param).leftMargin;
            bVar.I = ((ViewGroup.MarginLayoutParams) param).rightMargin;
            bVar.J = ((ViewGroup.MarginLayoutParams) param).topMargin;
            bVar.K = ((ViewGroup.MarginLayoutParams) param).bottomMargin;
            bVar.N = param.E;
            bVar.V = param.N;
            bVar.W = param.M;
            bVar.Y = param.P;
            bVar.X = param.O;
            bVar.f24130n0 = param.P2;
            bVar.f24132o0 = param.Q2;
            bVar.Z = param.Q;
            bVar.f24104a0 = param.R;
            bVar.f24106b0 = param.Z;
            bVar.f24108c0 = param.Q1;
            bVar.f24110d0 = param.X;
            bVar.f24112e0 = param.Y;
            bVar.f24114f0 = param.V1;
            bVar.f24116g0 = param.L2;
            bVar.f24128m0 = param.R2;
            bVar.P = param.f23863y;
            bVar.R = param.A;
            bVar.O = param.f23862x;
            bVar.Q = param.f23864z;
            bVar.T = param.B;
            bVar.S = param.C;
            bVar.U = param.D;
            bVar.f24136q0 = param.S2;
            bVar.L = param.getMarginEnd();
            this.f24048e.M = param.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(int viewId, Constraints.LayoutParams param) {
            k(viewId, param);
            this.f24046c.f24175d = param.K3;
            e eVar = this.f24049f;
            eVar.f24190b = param.N3;
            eVar.f24191c = param.O3;
            eVar.f24192d = param.P3;
            eVar.f24193e = param.Q3;
            eVar.f24194f = param.R3;
            eVar.f24195g = param.S3;
            eVar.f24196h = param.T3;
            eVar.f24198j = param.U3;
            eVar.f24199k = param.V3;
            eVar.f24200l = param.W3;
            eVar.f24202n = param.M3;
            eVar.f24201m = param.L3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m(ConstraintHelper helper, int viewId, Constraints.LayoutParams param) {
            l(viewId, param);
            if (helper instanceof Barrier) {
                b bVar = this.f24048e;
                bVar.f24122j0 = 1;
                Barrier barrier = (Barrier) helper;
                bVar.f24118h0 = barrier.S();
                this.f24048e.f24124k0 = barrier.y();
                this.f24048e.f24120i0 = barrier.R();
            }
        }

        private androidx.constraintlayout.widget.a n(String attributeName, a.b attributeType) {
            if (!this.f24050g.containsKey(attributeName)) {
                androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a(attributeName, attributeType);
                this.f24050g.put(attributeName, aVar);
                return aVar;
            }
            androidx.constraintlayout.widget.a aVar2 = this.f24050g.get(attributeName);
            if (aVar2.j() == attributeType) {
                return aVar2;
            }
            throw new IllegalArgumentException("ConstraintAttribute is already a " + aVar2.j().name());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(String attributeName, int value) {
            n(attributeName, a.b.COLOR_TYPE).s(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(String attributeName, float value) {
            n(attributeName, a.b.FLOAT_TYPE).t(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r(String attributeName, int value) {
            n(attributeName, a.b.INT_TYPE).u(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(String attributeName, String value) {
            n(attributeName, a.b.STRING_TYPE).v(value);
        }

        public void h(a c5) {
            C0397a c0397a = this.f24051h;
            if (c0397a != null) {
                c0397a.e(c5);
            }
        }

        public void i(ConstraintLayout.LayoutParams param) {
            b bVar = this.f24048e;
            param.f23837f = bVar.f24121j;
            param.f23839g = bVar.f24123k;
            param.f23841h = bVar.f24125l;
            param.f23843i = bVar.f24127m;
            param.f23845j = bVar.f24129n;
            param.f23847k = bVar.f24131o;
            param.f23849l = bVar.f24133p;
            param.f23851m = bVar.f24135q;
            param.f23852n = bVar.f24137r;
            param.f23853o = bVar.f24138s;
            param.f23854p = bVar.f24139t;
            param.f23858t = bVar.f24140u;
            param.f23859u = bVar.f24141v;
            param.f23860v = bVar.f24142w;
            param.f23861w = bVar.f24143x;
            ((ViewGroup.MarginLayoutParams) param).leftMargin = bVar.H;
            ((ViewGroup.MarginLayoutParams) param).rightMargin = bVar.I;
            ((ViewGroup.MarginLayoutParams) param).topMargin = bVar.J;
            ((ViewGroup.MarginLayoutParams) param).bottomMargin = bVar.K;
            param.B = bVar.T;
            param.C = bVar.S;
            param.f23863y = bVar.P;
            param.A = bVar.R;
            param.H = bVar.f24144y;
            param.I = bVar.f24145z;
            param.f23855q = bVar.B;
            param.f23856r = bVar.C;
            param.f23857s = bVar.D;
            param.J = bVar.A;
            param.M2 = bVar.E;
            param.N2 = bVar.F;
            param.N = bVar.V;
            param.M = bVar.W;
            param.P = bVar.Y;
            param.O = bVar.X;
            param.P2 = bVar.f24130n0;
            param.Q2 = bVar.f24132o0;
            param.Q = bVar.Z;
            param.R = bVar.f24104a0;
            param.Z = bVar.f24106b0;
            param.Q1 = bVar.f24108c0;
            param.X = bVar.f24110d0;
            param.Y = bVar.f24112e0;
            param.V1 = bVar.f24114f0;
            param.L2 = bVar.f24116g0;
            param.O2 = bVar.G;
            param.f23833d = bVar.f24117h;
            param.f23829b = bVar.f24113f;
            param.f23831c = bVar.f24115g;
            ((ViewGroup.MarginLayoutParams) param).width = bVar.f24109d;
            ((ViewGroup.MarginLayoutParams) param).height = bVar.f24111e;
            String str = bVar.f24128m0;
            if (str != null) {
                param.R2 = str;
            }
            param.S2 = bVar.f24136q0;
            param.setMarginStart(bVar.M);
            param.setMarginEnd(this.f24048e.L);
            param.f();
        }

        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f24048e.a(this.f24048e);
            aVar.f24047d.a(this.f24047d);
            aVar.f24046c.a(this.f24046c);
            aVar.f24049f.a(this.f24049f);
            aVar.f24044a = this.f24044a;
            aVar.f24051h = this.f24051h;
            return aVar;
        }

        public void o(String tag) {
            C0397a c0397a = this.f24051h;
            if (c0397a != null) {
                c0397a.f(tag);
            }
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class b {
        private static final int A0 = 7;
        private static final int A1 = 82;
        private static final int B0 = 8;
        private static final int B1 = 83;
        private static final int C0 = 9;
        private static final int C1 = 84;
        private static final int D0 = 10;
        private static final int D1 = 85;
        private static final int E0 = 11;
        private static final int E1 = 86;
        private static final int F0 = 12;
        private static final int F1 = 87;
        private static final int G0 = 13;
        private static final int G1 = 88;
        private static final int H0 = 14;
        private static final int H1 = 89;
        private static final int I0 = 15;
        private static final int I1 = 90;
        private static final int J0 = 16;
        private static final int J1 = 91;
        private static final int K0 = 17;
        private static final int L0 = 18;
        private static final int M0 = 19;
        private static final int N0 = 20;
        private static final int O0 = 21;
        private static final int P0 = 22;
        private static final int Q0 = 23;
        private static final int R0 = 24;
        private static final int S0 = 25;
        private static final int T0 = 26;
        private static final int U0 = 27;
        private static final int V0 = 28;
        private static final int W0 = 29;
        private static final int X0 = 30;
        private static final int Y0 = 31;
        private static final int Z0 = 32;

        /* renamed from: a1, reason: collision with root package name */
        private static final int f24068a1 = 33;

        /* renamed from: b1, reason: collision with root package name */
        private static final int f24069b1 = 34;

        /* renamed from: c1, reason: collision with root package name */
        private static final int f24070c1 = 35;

        /* renamed from: d1, reason: collision with root package name */
        private static final int f24071d1 = 36;

        /* renamed from: e1, reason: collision with root package name */
        private static final int f24072e1 = 37;

        /* renamed from: f1, reason: collision with root package name */
        private static final int f24073f1 = 38;

        /* renamed from: g1, reason: collision with root package name */
        private static final int f24074g1 = 39;

        /* renamed from: h1, reason: collision with root package name */
        private static final int f24075h1 = 40;

        /* renamed from: i1, reason: collision with root package name */
        private static final int f24076i1 = 41;

        /* renamed from: j1, reason: collision with root package name */
        private static final int f24077j1 = 42;

        /* renamed from: k1, reason: collision with root package name */
        private static final int f24078k1 = 61;

        /* renamed from: l1, reason: collision with root package name */
        private static final int f24079l1 = 62;

        /* renamed from: m1, reason: collision with root package name */
        private static final int f24080m1 = 63;

        /* renamed from: n1, reason: collision with root package name */
        private static final int f24081n1 = 69;

        /* renamed from: o1, reason: collision with root package name */
        private static final int f24082o1 = 70;

        /* renamed from: p1, reason: collision with root package name */
        private static final int f24083p1 = 71;

        /* renamed from: q1, reason: collision with root package name */
        private static final int f24084q1 = 72;

        /* renamed from: r0, reason: collision with root package name */
        public static final int f24085r0 = -1;

        /* renamed from: r1, reason: collision with root package name */
        private static final int f24086r1 = 73;

        /* renamed from: s0, reason: collision with root package name */
        public static final int f24087s0 = Integer.MIN_VALUE;

        /* renamed from: s1, reason: collision with root package name */
        private static final int f24088s1 = 74;

        /* renamed from: t0, reason: collision with root package name */
        private static SparseIntArray f24089t0 = null;

        /* renamed from: t1, reason: collision with root package name */
        private static final int f24090t1 = 75;

        /* renamed from: u0, reason: collision with root package name */
        private static final int f24091u0 = 1;

        /* renamed from: u1, reason: collision with root package name */
        private static final int f24092u1 = 76;

        /* renamed from: v0, reason: collision with root package name */
        private static final int f24093v0 = 2;

        /* renamed from: v1, reason: collision with root package name */
        private static final int f24094v1 = 77;

        /* renamed from: w0, reason: collision with root package name */
        private static final int f24095w0 = 3;

        /* renamed from: w1, reason: collision with root package name */
        private static final int f24096w1 = 78;

        /* renamed from: x0, reason: collision with root package name */
        private static final int f24097x0 = 4;

        /* renamed from: x1, reason: collision with root package name */
        private static final int f24098x1 = 79;

        /* renamed from: y0, reason: collision with root package name */
        private static final int f24099y0 = 5;

        /* renamed from: y1, reason: collision with root package name */
        private static final int f24100y1 = 80;

        /* renamed from: z0, reason: collision with root package name */
        private static final int f24101z0 = 6;

        /* renamed from: z1, reason: collision with root package name */
        private static final int f24102z1 = 81;

        /* renamed from: d, reason: collision with root package name */
        public int f24109d;

        /* renamed from: e, reason: collision with root package name */
        public int f24111e;

        /* renamed from: k0, reason: collision with root package name */
        public int[] f24124k0;

        /* renamed from: l0, reason: collision with root package name */
        public String f24126l0;

        /* renamed from: m0, reason: collision with root package name */
        public String f24128m0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f24103a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f24105b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f24107c = false;

        /* renamed from: f, reason: collision with root package name */
        public int f24113f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f24115g = -1;

        /* renamed from: h, reason: collision with root package name */
        public float f24117h = -1.0f;

        /* renamed from: i, reason: collision with root package name */
        public boolean f24119i = true;

        /* renamed from: j, reason: collision with root package name */
        public int f24121j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f24123k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f24125l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f24127m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f24129n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f24131o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f24133p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f24135q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f24137r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f24138s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f24139t = -1;

        /* renamed from: u, reason: collision with root package name */
        public int f24140u = -1;

        /* renamed from: v, reason: collision with root package name */
        public int f24141v = -1;

        /* renamed from: w, reason: collision with root package name */
        public int f24142w = -1;

        /* renamed from: x, reason: collision with root package name */
        public int f24143x = -1;

        /* renamed from: y, reason: collision with root package name */
        public float f24144y = 0.5f;

        /* renamed from: z, reason: collision with root package name */
        public float f24145z = 0.5f;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = 0.0f;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public int U = Integer.MIN_VALUE;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a0, reason: collision with root package name */
        public int f24104a0 = 0;

        /* renamed from: b0, reason: collision with root package name */
        public int f24106b0 = 0;

        /* renamed from: c0, reason: collision with root package name */
        public int f24108c0 = 0;

        /* renamed from: d0, reason: collision with root package name */
        public int f24110d0 = 0;

        /* renamed from: e0, reason: collision with root package name */
        public int f24112e0 = 0;

        /* renamed from: f0, reason: collision with root package name */
        public float f24114f0 = 1.0f;

        /* renamed from: g0, reason: collision with root package name */
        public float f24116g0 = 1.0f;

        /* renamed from: h0, reason: collision with root package name */
        public int f24118h0 = -1;

        /* renamed from: i0, reason: collision with root package name */
        public int f24120i0 = 0;

        /* renamed from: j0, reason: collision with root package name */
        public int f24122j0 = -1;

        /* renamed from: n0, reason: collision with root package name */
        public boolean f24130n0 = false;

        /* renamed from: o0, reason: collision with root package name */
        public boolean f24132o0 = false;

        /* renamed from: p0, reason: collision with root package name */
        public boolean f24134p0 = true;

        /* renamed from: q0, reason: collision with root package name */
        public int f24136q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f24089t0 = sparseIntArray;
            sparseIntArray.append(g.m.rh, 24);
            f24089t0.append(g.m.sh, 25);
            f24089t0.append(g.m.uh, 28);
            f24089t0.append(g.m.vh, 29);
            f24089t0.append(g.m.Ah, 35);
            f24089t0.append(g.m.zh, 34);
            f24089t0.append(g.m.Yg, 4);
            f24089t0.append(g.m.Xg, 3);
            f24089t0.append(g.m.Tg, 1);
            f24089t0.append(g.m.Jh, 6);
            f24089t0.append(g.m.Kh, 7);
            f24089t0.append(g.m.fh, 17);
            f24089t0.append(g.m.gh, 18);
            f24089t0.append(g.m.hh, 19);
            f24089t0.append(g.m.Pg, 90);
            f24089t0.append(g.m.Ag, 26);
            f24089t0.append(g.m.wh, 31);
            f24089t0.append(g.m.xh, 32);
            f24089t0.append(g.m.eh, 10);
            f24089t0.append(g.m.dh, 9);
            f24089t0.append(g.m.Oh, 13);
            f24089t0.append(g.m.Rh, 16);
            f24089t0.append(g.m.Ph, 14);
            f24089t0.append(g.m.Mh, 11);
            f24089t0.append(g.m.Qh, 15);
            f24089t0.append(g.m.Nh, 12);
            f24089t0.append(g.m.Dh, 38);
            f24089t0.append(g.m.ph, 37);
            f24089t0.append(g.m.oh, 39);
            f24089t0.append(g.m.Ch, 40);
            f24089t0.append(g.m.nh, 20);
            f24089t0.append(g.m.Bh, 36);
            f24089t0.append(g.m.ch, 5);
            f24089t0.append(g.m.qh, 91);
            f24089t0.append(g.m.yh, 91);
            f24089t0.append(g.m.th, 91);
            f24089t0.append(g.m.Wg, 91);
            f24089t0.append(g.m.Sg, 91);
            f24089t0.append(g.m.Dg, 23);
            f24089t0.append(g.m.Fg, 27);
            f24089t0.append(g.m.Hg, 30);
            f24089t0.append(g.m.Ig, 8);
            f24089t0.append(g.m.Eg, 33);
            f24089t0.append(g.m.Gg, 2);
            f24089t0.append(g.m.Bg, 22);
            f24089t0.append(g.m.Cg, 21);
            f24089t0.append(g.m.Eh, 41);
            f24089t0.append(g.m.ih, 42);
            f24089t0.append(g.m.Rg, 41);
            f24089t0.append(g.m.Qg, 42);
            f24089t0.append(g.m.Th, 76);
            f24089t0.append(g.m.Zg, 61);
            f24089t0.append(g.m.bh, 62);
            f24089t0.append(g.m.ah, 63);
            f24089t0.append(g.m.Ih, 69);
            f24089t0.append(g.m.mh, 70);
            f24089t0.append(g.m.Mg, 71);
            f24089t0.append(g.m.Kg, 72);
            f24089t0.append(g.m.Lg, 73);
            f24089t0.append(g.m.Ng, 74);
            f24089t0.append(g.m.Jg, 75);
        }

        public void a(b src) {
            this.f24103a = src.f24103a;
            this.f24109d = src.f24109d;
            this.f24105b = src.f24105b;
            this.f24111e = src.f24111e;
            this.f24113f = src.f24113f;
            this.f24115g = src.f24115g;
            this.f24117h = src.f24117h;
            this.f24119i = src.f24119i;
            this.f24121j = src.f24121j;
            this.f24123k = src.f24123k;
            this.f24125l = src.f24125l;
            this.f24127m = src.f24127m;
            this.f24129n = src.f24129n;
            this.f24131o = src.f24131o;
            this.f24133p = src.f24133p;
            this.f24135q = src.f24135q;
            this.f24137r = src.f24137r;
            this.f24138s = src.f24138s;
            this.f24139t = src.f24139t;
            this.f24140u = src.f24140u;
            this.f24141v = src.f24141v;
            this.f24142w = src.f24142w;
            this.f24143x = src.f24143x;
            this.f24144y = src.f24144y;
            this.f24145z = src.f24145z;
            this.A = src.A;
            this.B = src.B;
            this.C = src.C;
            this.D = src.D;
            this.E = src.E;
            this.F = src.F;
            this.G = src.G;
            this.H = src.H;
            this.I = src.I;
            this.J = src.J;
            this.K = src.K;
            this.L = src.L;
            this.M = src.M;
            this.N = src.N;
            this.O = src.O;
            this.P = src.P;
            this.Q = src.Q;
            this.R = src.R;
            this.S = src.S;
            this.T = src.T;
            this.U = src.U;
            this.V = src.V;
            this.W = src.W;
            this.X = src.X;
            this.Y = src.Y;
            this.Z = src.Z;
            this.f24104a0 = src.f24104a0;
            this.f24106b0 = src.f24106b0;
            this.f24108c0 = src.f24108c0;
            this.f24110d0 = src.f24110d0;
            this.f24112e0 = src.f24112e0;
            this.f24114f0 = src.f24114f0;
            this.f24116g0 = src.f24116g0;
            this.f24118h0 = src.f24118h0;
            this.f24120i0 = src.f24120i0;
            this.f24122j0 = src.f24122j0;
            this.f24128m0 = src.f24128m0;
            int[] iArr = src.f24124k0;
            if (iArr == null || src.f24126l0 != null) {
                this.f24124k0 = null;
            } else {
                this.f24124k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f24126l0 = src.f24126l0;
            this.f24130n0 = src.f24130n0;
            this.f24132o0 = src.f24132o0;
            this.f24134p0 = src.f24134p0;
            this.f24136q0 = src.f24136q0;
        }

        public void b(t tVar, StringBuilder sb) {
            Field[] declaredFields = getClass().getDeclaredFields();
            sb.append("\n");
            for (Field field : declaredFields) {
                String name = field.getName();
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object obj = field.get(this);
                        Class<?> type = field.getType();
                        if (type == Integer.TYPE) {
                            Integer num = (Integer) obj;
                            if (num.intValue() != -1) {
                                Object X = tVar.X(num.intValue());
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(X == null ? num : X);
                                sb.append("\"\n");
                            }
                        } else if (type == Float.TYPE) {
                            Float f4 = (Float) obj;
                            if (f4.floatValue() != -1.0f) {
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(f4);
                                sb.append("\"\n");
                            }
                        }
                    } catch (IllegalAccessException e4) {
                        e4.printStackTrace();
                    }
                }
            }
        }

        void c(Context context, AttributeSet attrs) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, g.m.zg);
            this.f24105b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = f24089t0.get(index);
                switch (i5) {
                    case 1:
                        this.f24137r = d.y0(obtainStyledAttributes, index, this.f24137r);
                        break;
                    case 2:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.f24135q = d.y0(obtainStyledAttributes, index, this.f24135q);
                        break;
                    case 4:
                        this.f24133p = d.y0(obtainStyledAttributes, index, this.f24133p);
                        break;
                    case 5:
                        this.A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 7:
                        this.F = obtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 9:
                        this.f24143x = d.y0(obtainStyledAttributes, index, this.f24143x);
                        break;
                    case 10:
                        this.f24142w = d.y0(obtainStyledAttributes, index, this.f24142w);
                        break;
                    case 11:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 12:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 16:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f24113f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f24113f);
                        break;
                    case 18:
                        this.f24115g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f24115g);
                        break;
                    case 19:
                        this.f24117h = obtainStyledAttributes.getFloat(index, this.f24117h);
                        break;
                    case 20:
                        this.f24144y = obtainStyledAttributes.getFloat(index, this.f24144y);
                        break;
                    case 21:
                        this.f24111e = obtainStyledAttributes.getLayoutDimension(index, this.f24111e);
                        break;
                    case 22:
                        this.f24109d = obtainStyledAttributes.getLayoutDimension(index, this.f24109d);
                        break;
                    case 23:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.f24121j = d.y0(obtainStyledAttributes, index, this.f24121j);
                        break;
                    case 25:
                        this.f24123k = d.y0(obtainStyledAttributes, index, this.f24123k);
                        break;
                    case 26:
                        this.G = obtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.f24125l = d.y0(obtainStyledAttributes, index, this.f24125l);
                        break;
                    case 29:
                        this.f24127m = d.y0(obtainStyledAttributes, index, this.f24127m);
                        break;
                    case 30:
                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 31:
                        this.f24140u = d.y0(obtainStyledAttributes, index, this.f24140u);
                        break;
                    case 32:
                        this.f24141v = d.y0(obtainStyledAttributes, index, this.f24141v);
                        break;
                    case 33:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.f24131o = d.y0(obtainStyledAttributes, index, this.f24131o);
                        break;
                    case 35:
                        this.f24129n = d.y0(obtainStyledAttributes, index, this.f24129n);
                        break;
                    case 36:
                        this.f24145z = obtainStyledAttributes.getFloat(index, this.f24145z);
                        break;
                    case 37:
                        this.W = obtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case 38:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 39:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 40:
                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 41:
                        d.A0(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        d.A0(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i5) {
                            case 61:
                                this.B = d.y0(obtainStyledAttributes, index, this.B);
                                break;
                            case 62:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case 63:
                                this.D = obtainStyledAttributes.getFloat(index, this.D);
                                break;
                            default:
                                switch (i5) {
                                    case 69:
                                        this.f24114f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f24116g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        break;
                                    case 72:
                                        this.f24118h0 = obtainStyledAttributes.getInt(index, this.f24118h0);
                                        break;
                                    case 73:
                                        this.f24120i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f24120i0);
                                        break;
                                    case 74:
                                        this.f24126l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f24134p0 = obtainStyledAttributes.getBoolean(index, this.f24134p0);
                                        break;
                                    case 76:
                                        this.f24136q0 = obtainStyledAttributes.getInt(index, this.f24136q0);
                                        break;
                                    case 77:
                                        this.f24138s = d.y0(obtainStyledAttributes, index, this.f24138s);
                                        break;
                                    case 78:
                                        this.f24139t = d.y0(obtainStyledAttributes, index, this.f24139t);
                                        break;
                                    case 79:
                                        this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        break;
                                    case 80:
                                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        break;
                                    case 81:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 82:
                                        this.f24104a0 = obtainStyledAttributes.getInt(index, this.f24104a0);
                                        break;
                                    case 83:
                                        this.f24108c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f24108c0);
                                        break;
                                    case 84:
                                        this.f24106b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f24106b0);
                                        break;
                                    case 85:
                                        this.f24112e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f24112e0);
                                        break;
                                    case 86:
                                        this.f24110d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f24110d0);
                                        break;
                                    case 87:
                                        this.f24130n0 = obtainStyledAttributes.getBoolean(index, this.f24130n0);
                                        break;
                                    case 88:
                                        this.f24132o0 = obtainStyledAttributes.getBoolean(index, this.f24132o0);
                                        break;
                                    case 89:
                                        this.f24128m0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f24119i = obtainStyledAttributes.getBoolean(index, this.f24119i);
                                        break;
                                    case 91:
                                        Integer.toHexString(index);
                                        f24089t0.get(index);
                                        break;
                                    default:
                                        Integer.toHexString(index);
                                        f24089t0.get(index);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class c {
        private static final int A = 9;
        private static final int B = 10;

        /* renamed from: o, reason: collision with root package name */
        private static final int f24146o = -2;

        /* renamed from: p, reason: collision with root package name */
        private static final int f24147p = -1;

        /* renamed from: q, reason: collision with root package name */
        private static final int f24148q = -3;

        /* renamed from: r, reason: collision with root package name */
        private static SparseIntArray f24149r = null;

        /* renamed from: s, reason: collision with root package name */
        private static final int f24150s = 1;

        /* renamed from: t, reason: collision with root package name */
        private static final int f24151t = 2;

        /* renamed from: u, reason: collision with root package name */
        private static final int f24152u = 3;

        /* renamed from: v, reason: collision with root package name */
        private static final int f24153v = 4;

        /* renamed from: w, reason: collision with root package name */
        private static final int f24154w = 5;

        /* renamed from: x, reason: collision with root package name */
        private static final int f24155x = 6;

        /* renamed from: y, reason: collision with root package name */
        private static final int f24156y = 7;

        /* renamed from: z, reason: collision with root package name */
        private static final int f24157z = 8;

        /* renamed from: a, reason: collision with root package name */
        public boolean f24158a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f24159b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f24160c = 0;

        /* renamed from: d, reason: collision with root package name */
        public String f24161d = null;

        /* renamed from: e, reason: collision with root package name */
        public int f24162e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f24163f = 0;

        /* renamed from: g, reason: collision with root package name */
        public float f24164g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public int f24165h = -1;

        /* renamed from: i, reason: collision with root package name */
        public float f24166i = Float.NaN;

        /* renamed from: j, reason: collision with root package name */
        public float f24167j = Float.NaN;

        /* renamed from: k, reason: collision with root package name */
        public int f24168k = -1;

        /* renamed from: l, reason: collision with root package name */
        public String f24169l = null;

        /* renamed from: m, reason: collision with root package name */
        public int f24170m = -3;

        /* renamed from: n, reason: collision with root package name */
        public int f24171n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f24149r = sparseIntArray;
            sparseIntArray.append(g.m.qj, 1);
            f24149r.append(g.m.sj, 2);
            f24149r.append(g.m.wj, 3);
            f24149r.append(g.m.pj, 4);
            f24149r.append(g.m.oj, 5);
            f24149r.append(g.m.nj, 6);
            f24149r.append(g.m.rj, 7);
            f24149r.append(g.m.vj, 8);
            f24149r.append(g.m.uj, 9);
            f24149r.append(g.m.tj, 10);
        }

        public void a(c src) {
            this.f24158a = src.f24158a;
            this.f24159b = src.f24159b;
            this.f24161d = src.f24161d;
            this.f24162e = src.f24162e;
            this.f24163f = src.f24163f;
            this.f24166i = src.f24166i;
            this.f24164g = src.f24164g;
            this.f24165h = src.f24165h;
        }

        void b(Context context, AttributeSet attrs) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, g.m.mj);
            this.f24158a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                switch (f24149r.get(index)) {
                    case 1:
                        this.f24166i = obtainStyledAttributes.getFloat(index, this.f24166i);
                        break;
                    case 2:
                        this.f24162e = obtainStyledAttributes.getInt(index, this.f24162e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f24161d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f24161d = androidx.constraintlayout.core.motion.utils.e.f22203o[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f24163f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f24159b = d.y0(obtainStyledAttributes, index, this.f24159b);
                        break;
                    case 6:
                        this.f24160c = obtainStyledAttributes.getInteger(index, this.f24160c);
                        break;
                    case 7:
                        this.f24164g = obtainStyledAttributes.getFloat(index, this.f24164g);
                        break;
                    case 8:
                        this.f24168k = obtainStyledAttributes.getInteger(index, this.f24168k);
                        break;
                    case 9:
                        this.f24167j = obtainStyledAttributes.getFloat(index, this.f24167j);
                        break;
                    case 10:
                        int i5 = obtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f24171n = resourceId;
                            if (resourceId != -1) {
                                this.f24170m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i5 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f24169l = string;
                            if (string.indexOf("/") > 0) {
                                this.f24171n = obtainStyledAttributes.getResourceId(index, -1);
                                this.f24170m = -2;
                                break;
                            } else {
                                this.f24170m = -1;
                                break;
                            }
                        } else {
                            this.f24170m = obtainStyledAttributes.getInteger(index, this.f24171n);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.d$d, reason: collision with other inner class name */
    public static class C0398d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f24172a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f24173b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f24174c = 0;

        /* renamed from: d, reason: collision with root package name */
        public float f24175d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f24176e = Float.NaN;

        public void a(C0398d src) {
            this.f24172a = src.f24172a;
            this.f24173b = src.f24173b;
            this.f24175d = src.f24175d;
            this.f24176e = src.f24176e;
            this.f24174c = src.f24174c;
        }

        void b(Context context, AttributeSet attrs) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, g.m.al);
            this.f24172a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.m.cl) {
                    this.f24175d = obtainStyledAttributes.getFloat(index, this.f24175d);
                } else if (index == g.m.bl) {
                    this.f24173b = obtainStyledAttributes.getInt(index, this.f24173b);
                    this.f24173b = d.U[this.f24173b];
                } else if (index == g.m.fl) {
                    this.f24174c = obtainStyledAttributes.getInt(index, this.f24174c);
                } else if (index == g.m.el) {
                    this.f24176e = obtainStyledAttributes.getFloat(index, this.f24176e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class e {
        private static final int A = 12;

        /* renamed from: o, reason: collision with root package name */
        private static SparseIntArray f24177o = null;

        /* renamed from: p, reason: collision with root package name */
        private static final int f24178p = 1;

        /* renamed from: q, reason: collision with root package name */
        private static final int f24179q = 2;

        /* renamed from: r, reason: collision with root package name */
        private static final int f24180r = 3;

        /* renamed from: s, reason: collision with root package name */
        private static final int f24181s = 4;

        /* renamed from: t, reason: collision with root package name */
        private static final int f24182t = 5;

        /* renamed from: u, reason: collision with root package name */
        private static final int f24183u = 6;

        /* renamed from: v, reason: collision with root package name */
        private static final int f24184v = 7;

        /* renamed from: w, reason: collision with root package name */
        private static final int f24185w = 8;

        /* renamed from: x, reason: collision with root package name */
        private static final int f24186x = 9;

        /* renamed from: y, reason: collision with root package name */
        private static final int f24187y = 10;

        /* renamed from: z, reason: collision with root package name */
        private static final int f24188z = 11;

        /* renamed from: a, reason: collision with root package name */
        public boolean f24189a = false;

        /* renamed from: b, reason: collision with root package name */
        public float f24190b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f24191c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f24192d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f24193e = 1.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f24194f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f24195g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public float f24196h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public int f24197i = -1;

        /* renamed from: j, reason: collision with root package name */
        public float f24198j = 0.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f24199k = 0.0f;

        /* renamed from: l, reason: collision with root package name */
        public float f24200l = 0.0f;

        /* renamed from: m, reason: collision with root package name */
        public boolean f24201m = false;

        /* renamed from: n, reason: collision with root package name */
        public float f24202n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f24177o = sparseIntArray;
            sparseIntArray.append(g.m.Cn, 1);
            f24177o.append(g.m.Dn, 2);
            f24177o.append(g.m.En, 3);
            f24177o.append(g.m.An, 4);
            f24177o.append(g.m.Bn, 5);
            f24177o.append(g.m.wn, 6);
            f24177o.append(g.m.xn, 7);
            f24177o.append(g.m.yn, 8);
            f24177o.append(g.m.zn, 9);
            f24177o.append(g.m.Fn, 10);
            f24177o.append(g.m.Gn, 11);
            f24177o.append(g.m.Hn, 12);
        }

        public void a(e src) {
            this.f24189a = src.f24189a;
            this.f24190b = src.f24190b;
            this.f24191c = src.f24191c;
            this.f24192d = src.f24192d;
            this.f24193e = src.f24193e;
            this.f24194f = src.f24194f;
            this.f24195g = src.f24195g;
            this.f24196h = src.f24196h;
            this.f24197i = src.f24197i;
            this.f24198j = src.f24198j;
            this.f24199k = src.f24199k;
            this.f24200l = src.f24200l;
            this.f24201m = src.f24201m;
            this.f24202n = src.f24202n;
        }

        void b(Context context, AttributeSet attrs) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, g.m.vn);
            this.f24189a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                switch (f24177o.get(index)) {
                    case 1:
                        this.f24190b = obtainStyledAttributes.getFloat(index, this.f24190b);
                        break;
                    case 2:
                        this.f24191c = obtainStyledAttributes.getFloat(index, this.f24191c);
                        break;
                    case 3:
                        this.f24192d = obtainStyledAttributes.getFloat(index, this.f24192d);
                        break;
                    case 4:
                        this.f24193e = obtainStyledAttributes.getFloat(index, this.f24193e);
                        break;
                    case 5:
                        this.f24194f = obtainStyledAttributes.getFloat(index, this.f24194f);
                        break;
                    case 6:
                        this.f24195g = obtainStyledAttributes.getDimension(index, this.f24195g);
                        break;
                    case 7:
                        this.f24196h = obtainStyledAttributes.getDimension(index, this.f24196h);
                        break;
                    case 8:
                        this.f24198j = obtainStyledAttributes.getDimension(index, this.f24198j);
                        break;
                    case 9:
                        this.f24199k = obtainStyledAttributes.getDimension(index, this.f24199k);
                        break;
                    case 10:
                        this.f24200l = obtainStyledAttributes.getDimension(index, this.f24200l);
                        break;
                    case 11:
                        this.f24201m = true;
                        this.f24202n = obtainStyledAttributes.getDimension(index, this.f24202n);
                        break;
                    case 12:
                        this.f24197i = d.y0(obtainStyledAttributes, index, this.f24197i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    class f {

        /* renamed from: o, reason: collision with root package name */
        private static final String f24203o = "       ";

        /* renamed from: a, reason: collision with root package name */
        Writer f24204a;

        /* renamed from: b, reason: collision with root package name */
        ConstraintLayout f24205b;

        /* renamed from: c, reason: collision with root package name */
        Context f24206c;

        /* renamed from: d, reason: collision with root package name */
        int f24207d;

        /* renamed from: e, reason: collision with root package name */
        int f24208e = 0;

        /* renamed from: f, reason: collision with root package name */
        final String f24209f = "'left'";

        /* renamed from: g, reason: collision with root package name */
        final String f24210g = "'right'";

        /* renamed from: h, reason: collision with root package name */
        final String f24211h = "'baseline'";

        /* renamed from: i, reason: collision with root package name */
        final String f24212i = "'bottom'";

        /* renamed from: j, reason: collision with root package name */
        final String f24213j = "'top'";

        /* renamed from: k, reason: collision with root package name */
        final String f24214k = "'start'";

        /* renamed from: l, reason: collision with root package name */
        final String f24215l = "'end'";

        /* renamed from: m, reason: collision with root package name */
        HashMap<Integer, String> f24216m = new HashMap<>();

        f(Writer writer, ConstraintLayout layout, int flags) throws IOException {
            this.f24204a = writer;
            this.f24205b = layout;
            this.f24206c = layout.getContext();
            this.f24207d = flags;
        }

        private void e(String dimString, int dim, int dimDefault, float dimPercent, int dimMin, int dimMax, boolean constrainedDim) throws IOException {
            if (dim != 0) {
                if (dim == -2) {
                    this.f24204a.write("       " + dimString + ": 'wrap'\n");
                    return;
                }
                if (dim == -1) {
                    this.f24204a.write("       " + dimString + ": 'parent'\n");
                    return;
                }
                this.f24204a.write("       " + dimString + ": " + dim + ",\n");
                return;
            }
            if (dimMax == -1 && dimMin == -1) {
                if (dimDefault == 1) {
                    this.f24204a.write("       " + dimString + ": '???????????',\n");
                    return;
                }
                if (dimDefault != 2) {
                    return;
                }
                this.f24204a.write("       " + dimString + ": '" + dimPercent + "%',\n");
                return;
            }
            if (dimDefault == 0) {
                Writer writer = this.f24204a;
                StringBuilder a5 = androidx.constraintlayout.widget.e.a("       ", dimString, ": {'spread' ,", dimMin, ", ");
                a5.append(dimMax);
                a5.append("}\n");
                writer.write(a5.toString());
                return;
            }
            if (dimDefault == 1) {
                Writer writer2 = this.f24204a;
                StringBuilder a6 = androidx.constraintlayout.widget.e.a("       ", dimString, ": {'wrap' ,", dimMin, ", ");
                a6.append(dimMax);
                a6.append("}\n");
                writer2.write(a6.toString());
                return;
            }
            if (dimDefault != 2) {
                return;
            }
            this.f24204a.write("       " + dimString + ": {'" + dimPercent + "'% ," + dimMin + ", " + dimMax + "}\n");
        }

        private void f(int orientation, int guideBegin, int guideEnd, float guidePercent) {
        }

        String a(int id2) {
            if (this.f24216m.containsKey(Integer.valueOf(id2))) {
                return android.support.v4.media.c.a(new StringBuilder("'"), this.f24216m.get(Integer.valueOf(id2)), "'");
            }
            if (id2 == 0) {
                return "'parent'";
            }
            String b5 = b(id2);
            this.f24216m.put(Integer.valueOf(id2), b5);
            return "'" + b5 + "'";
        }

        String b(int id2) {
            try {
                if (id2 != -1) {
                    return this.f24206c.getResources().getResourceEntryName(id2);
                }
                StringBuilder sb = new StringBuilder("unknown");
                int i4 = this.f24208e + 1;
                this.f24208e = i4;
                sb.append(i4);
                return sb.toString();
            } catch (Exception unused) {
                StringBuilder sb2 = new StringBuilder("unknown");
                int i5 = this.f24208e + 1;
                this.f24208e = i5;
                sb2.append(i5);
                return sb2.toString();
            }
        }

        void c(int circleConstraint, float circleAngle, int circleRadius) throws IOException {
            if (circleConstraint == -1) {
                return;
            }
            this.f24204a.write("       circle");
            this.f24204a.write(":[");
            this.f24204a.write(a(circleConstraint));
            this.f24204a.write(", " + circleAngle);
            this.f24204a.write(circleRadius + "]");
        }

        void d(String my, int leftToLeft, String other, int margin, int goneMargin) throws IOException {
            if (leftToLeft == -1) {
                return;
            }
            this.f24204a.write("       " + my);
            this.f24204a.write(":[");
            this.f24204a.write(a(leftToLeft));
            this.f24204a.write(" , ");
            this.f24204a.write(other);
            if (margin != 0) {
                this.f24204a.write(" , " + margin);
            }
            this.f24204a.write("],\n");
        }

        void g() throws IOException {
            this.f24204a.write("\n'ConstraintSet':{\n");
            for (Integer num : d.this.f24043g.keySet()) {
                a aVar = (a) d.this.f24043g.get(num);
                String a5 = a(num.intValue());
                this.f24204a.write(a5 + ":{\n");
                b bVar = aVar.f24048e;
                e("height", bVar.f24111e, bVar.f24104a0, bVar.f24116g0, bVar.f24112e0, bVar.f24108c0, bVar.f24132o0);
                e("width", bVar.f24109d, bVar.Z, bVar.f24114f0, bVar.f24110d0, bVar.f24106b0, bVar.f24130n0);
                d("'left'", bVar.f24121j, "'left'", bVar.H, bVar.O);
                d("'left'", bVar.f24123k, "'right'", bVar.H, bVar.O);
                d("'right'", bVar.f24125l, "'left'", bVar.I, bVar.Q);
                d("'right'", bVar.f24127m, "'right'", bVar.I, bVar.Q);
                d("'baseline'", bVar.f24137r, "'baseline'", -1, bVar.U);
                d("'baseline'", bVar.f24138s, "'top'", -1, bVar.U);
                d("'baseline'", bVar.f24139t, "'bottom'", -1, bVar.U);
                d("'top'", bVar.f24131o, "'bottom'", bVar.J, bVar.P);
                d("'top'", bVar.f24129n, "'top'", bVar.J, bVar.P);
                d("'bottom'", bVar.f24135q, "'bottom'", bVar.K, bVar.R);
                d("'bottom'", bVar.f24133p, "'top'", bVar.K, bVar.R);
                d("'start'", bVar.f24141v, "'start'", bVar.M, bVar.T);
                d("'start'", bVar.f24140u, "'end'", bVar.M, bVar.T);
                d("'end'", bVar.f24142w, "'start'", bVar.L, bVar.S);
                d("'end'", bVar.f24143x, "'end'", bVar.L, bVar.S);
                i("'horizontalBias'", bVar.f24144y, 0.5f);
                i("'verticalBias'", bVar.f24145z, 0.5f);
                c(bVar.B, bVar.D, bVar.C);
                k("'dimensionRatio'", bVar.A);
                j("'barrierMargin'", bVar.f24120i0);
                j("'type'", bVar.f24122j0);
                k("'ReferenceId'", bVar.f24126l0);
                m("'mBarrierAllowsGoneWidgets'", bVar.f24134p0, true);
                j("'WrapBehavior'", bVar.f24136q0);
                h("'verticalWeight'", bVar.V);
                h("'horizontalWeight'", bVar.W);
                j("'horizontalChainStyle'", bVar.X);
                j("'verticalChainStyle'", bVar.Y);
                j("'barrierDirection'", bVar.f24118h0);
                int[] iArr = bVar.f24124k0;
                if (iArr != null) {
                    n("'ReferenceIds'", iArr);
                }
                this.f24204a.write("}\n");
            }
            this.f24204a.write("}\n");
        }

        void h(String name, float value) throws IOException {
            if (value == -1.0f) {
                return;
            }
            this.f24204a.write("       " + name);
            this.f24204a.write(": " + value);
            this.f24204a.write(",\n");
        }

        void i(String name, float value, float def) throws IOException {
            if (value == def) {
                return;
            }
            this.f24204a.write("       " + name);
            this.f24204a.write(": " + value);
            this.f24204a.write(",\n");
        }

        void j(String name, int value) throws IOException {
            if (value == 0 || value == -1) {
                return;
            }
            this.f24204a.write("       " + name);
            this.f24204a.write(":");
            this.f24204a.write(", " + value);
            this.f24204a.write("\n");
        }

        void k(String name, String value) throws IOException {
            if (value == null) {
                return;
            }
            this.f24204a.write("       " + name);
            this.f24204a.write(":");
            this.f24204a.write(", ".concat(value));
            this.f24204a.write("\n");
        }

        void l(String name, boolean value) throws IOException {
            if (value) {
                this.f24204a.write("       " + name);
                this.f24204a.write(": " + value);
                this.f24204a.write(",\n");
            }
        }

        void m(String name, boolean value, boolean def) throws IOException {
            if (value == def) {
                return;
            }
            this.f24204a.write("       " + name);
            this.f24204a.write(": " + value);
            this.f24204a.write(",\n");
        }

        void n(String name, int[] value) throws IOException {
            if (value == null) {
                return;
            }
            this.f24204a.write("       " + name);
            this.f24204a.write(": ");
            int i4 = 0;
            while (i4 < value.length) {
                Writer writer = this.f24204a;
                StringBuilder sb = new StringBuilder();
                sb.append(i4 == 0 ? "[" : ", ");
                sb.append(a(value[i4]));
                writer.write(sb.toString());
                i4++;
            }
            this.f24204a.write("],\n");
        }
    }

    /* compiled from: ConstraintSet.java */
    class g {

        /* renamed from: o, reason: collision with root package name */
        private static final String f24218o = "\n       ";

        /* renamed from: a, reason: collision with root package name */
        Writer f24219a;

        /* renamed from: b, reason: collision with root package name */
        ConstraintLayout f24220b;

        /* renamed from: c, reason: collision with root package name */
        Context f24221c;

        /* renamed from: d, reason: collision with root package name */
        int f24222d;

        /* renamed from: e, reason: collision with root package name */
        int f24223e = 0;

        /* renamed from: f, reason: collision with root package name */
        final String f24224f = "'left'";

        /* renamed from: g, reason: collision with root package name */
        final String f24225g = "'right'";

        /* renamed from: h, reason: collision with root package name */
        final String f24226h = "'baseline'";

        /* renamed from: i, reason: collision with root package name */
        final String f24227i = "'bottom'";

        /* renamed from: j, reason: collision with root package name */
        final String f24228j = "'top'";

        /* renamed from: k, reason: collision with root package name */
        final String f24229k = "'start'";

        /* renamed from: l, reason: collision with root package name */
        final String f24230l = "'end'";

        /* renamed from: m, reason: collision with root package name */
        HashMap<Integer, String> f24231m = new HashMap<>();

        g(Writer writer, ConstraintLayout layout, int flags) throws IOException {
            this.f24219a = writer;
            this.f24220b = layout;
            this.f24221c = layout.getContext();
            this.f24222d = flags;
        }

        private void c(String dimString, int dim, int def) throws IOException {
            if (dim != def) {
                if (dim == -2) {
                    this.f24219a.write("\n       " + dimString + "=\"wrap_content\"");
                    return;
                }
                if (dim == -1) {
                    this.f24219a.write("\n       " + dimString + "=\"match_parent\"");
                    return;
                }
                this.f24219a.write("\n       " + dimString + "=\"" + dim + "dp\"");
            }
        }

        private void d(String dimString, boolean val, boolean def) throws IOException {
            if (val != def) {
                this.f24219a.write("\n       " + dimString + "=\"" + val + "dp\"");
            }
        }

        private void g(String dimString, int dim, int def) throws IOException {
            if (dim != def) {
                this.f24219a.write("\n       " + dimString + "=\"" + dim + "dp\"");
            }
        }

        private void h(String dimString, int val, String[] types, int def) throws IOException {
            if (val != def) {
                Writer writer = this.f24219a;
                StringBuilder a5 = androidx.appcompat.view.g.a("\n       ", dimString, "=\"");
                a5.append(types[val]);
                a5.append("\"");
                writer.write(a5.toString());
            }
        }

        String a(int id2) {
            if (this.f24231m.containsKey(Integer.valueOf(id2))) {
                return android.support.v4.media.c.a(new StringBuilder("@+id/"), this.f24231m.get(Integer.valueOf(id2)), "");
            }
            if (id2 == 0) {
                return "parent";
            }
            String b5 = b(id2);
            this.f24231m.put(Integer.valueOf(id2), b5);
            return "@+id/" + b5 + "";
        }

        String b(int id2) {
            try {
                if (id2 != -1) {
                    return this.f24221c.getResources().getResourceEntryName(id2);
                }
                StringBuilder sb = new StringBuilder("unknown");
                int i4 = this.f24223e + 1;
                this.f24223e = i4;
                sb.append(i4);
                return sb.toString();
            } catch (Exception unused) {
                StringBuilder sb2 = new StringBuilder("unknown");
                int i5 = this.f24223e + 1;
                this.f24223e = i5;
                sb2.append(i5);
                return sb2.toString();
            }
        }

        void e(int circleConstraint, float circleAngle, int circleRadius) throws IOException {
            if (circleConstraint == -1) {
                return;
            }
            this.f24219a.write("circle");
            this.f24219a.write(":[");
            this.f24219a.write(a(circleConstraint));
            this.f24219a.write(", " + circleAngle);
            this.f24219a.write(circleRadius + "]");
        }

        void f(String my, int leftToLeft, String other, int margin, int goneMargin) throws IOException {
            if (leftToLeft == -1) {
                return;
            }
            this.f24219a.write("\n       " + my);
            this.f24219a.write(":[");
            this.f24219a.write(a(leftToLeft));
            this.f24219a.write(" , ");
            this.f24219a.write(other);
            if (margin != 0) {
                this.f24219a.write(" , " + margin);
            }
            this.f24219a.write("],\n");
        }

        void i() throws IOException {
            this.f24219a.write("\n<ConstraintSet>\n");
            for (Integer num : d.this.f24043g.keySet()) {
                a aVar = (a) d.this.f24043g.get(num);
                String a5 = a(num.intValue());
                this.f24219a.write("  <Constraint");
                this.f24219a.write("\n       android:id=\"" + a5 + "\"");
                b bVar = aVar.f24048e;
                c("android:layout_width", bVar.f24109d, -5);
                c("android:layout_height", bVar.f24111e, -5);
                j("app:layout_constraintGuide_begin", bVar.f24113f, -1.0f);
                j("app:layout_constraintGuide_end", bVar.f24115g, -1.0f);
                j("app:layout_constraintGuide_percent", bVar.f24117h, -1.0f);
                j("app:layout_constraintHorizontal_bias", bVar.f24144y, 0.5f);
                j("app:layout_constraintVertical_bias", bVar.f24145z, 0.5f);
                m("app:layout_constraintDimensionRatio", bVar.A, null);
                o("app:layout_constraintCircle", bVar.B);
                j("app:layout_constraintCircleRadius", bVar.C, 0.0f);
                j("app:layout_constraintCircleAngle", bVar.D, 0.0f);
                j("android:orientation", bVar.G, -1.0f);
                j("app:layout_constraintVertical_weight", bVar.V, -1.0f);
                j("app:layout_constraintHorizontal_weight", bVar.W, -1.0f);
                j("app:layout_constraintHorizontal_chainStyle", bVar.X, 0.0f);
                j("app:layout_constraintVertical_chainStyle", bVar.Y, 0.0f);
                j("app:barrierDirection", bVar.f24118h0, -1.0f);
                j("app:barrierMargin", bVar.f24120i0, 0.0f);
                g("app:layout_marginLeft", bVar.H, 0);
                g("app:layout_goneMarginLeft", bVar.O, Integer.MIN_VALUE);
                g("app:layout_marginRight", bVar.I, 0);
                g("app:layout_goneMarginRight", bVar.Q, Integer.MIN_VALUE);
                g("app:layout_marginStart", bVar.M, 0);
                g("app:layout_goneMarginStart", bVar.T, Integer.MIN_VALUE);
                g("app:layout_marginEnd", bVar.L, 0);
                g("app:layout_goneMarginEnd", bVar.S, Integer.MIN_VALUE);
                g("app:layout_marginTop", bVar.J, 0);
                g("app:layout_goneMarginTop", bVar.P, Integer.MIN_VALUE);
                g("app:layout_marginBottom", bVar.K, 0);
                g("app:layout_goneMarginBottom", bVar.R, Integer.MIN_VALUE);
                g("app:goneBaselineMargin", bVar.U, Integer.MIN_VALUE);
                g("app:baselineMargin", bVar.N, 0);
                d("app:layout_constrainedWidth", bVar.f24130n0, false);
                d("app:layout_constrainedHeight", bVar.f24132o0, false);
                d("app:barrierAllowsGoneWidgets", bVar.f24134p0, true);
                j("app:layout_wrapBehaviorInParent", bVar.f24136q0, 0.0f);
                o("app:baselineToBaseline", bVar.f24137r);
                o("app:baselineToBottom", bVar.f24139t);
                o("app:baselineToTop", bVar.f24138s);
                o("app:layout_constraintBottom_toBottomOf", bVar.f24135q);
                o("app:layout_constraintBottom_toTopOf", bVar.f24133p);
                o("app:layout_constraintEnd_toEndOf", bVar.f24143x);
                o("app:layout_constraintEnd_toStartOf", bVar.f24142w);
                o("app:layout_constraintLeft_toLeftOf", bVar.f24121j);
                o("app:layout_constraintLeft_toRightOf", bVar.f24123k);
                o("app:layout_constraintRight_toLeftOf", bVar.f24125l);
                o("app:layout_constraintRight_toRightOf", bVar.f24127m);
                o("app:layout_constraintStart_toEndOf", bVar.f24140u);
                o("app:layout_constraintStart_toStartOf", bVar.f24141v);
                o("app:layout_constraintTop_toBottomOf", bVar.f24131o);
                o("app:layout_constraintTop_toTopOf", bVar.f24129n);
                String[] strArr = {"spread", "wrap", "percent"};
                h("app:layout_constraintHeight_default", bVar.f24104a0, strArr, 0);
                j("app:layout_constraintHeight_percent", bVar.f24116g0, 1.0f);
                g("app:layout_constraintHeight_min", bVar.f24112e0, 0);
                g("app:layout_constraintHeight_max", bVar.f24108c0, 0);
                d("android:layout_constrainedHeight", bVar.f24132o0, false);
                h("app:layout_constraintWidth_default", bVar.Z, strArr, 0);
                j("app:layout_constraintWidth_percent", bVar.f24114f0, 1.0f);
                g("app:layout_constraintWidth_min", bVar.f24110d0, 0);
                g("app:layout_constraintWidth_max", bVar.f24106b0, 0);
                d("android:layout_constrainedWidth", bVar.f24130n0, false);
                j("app:layout_constraintVertical_weight", bVar.V, -1.0f);
                j("app:layout_constraintHorizontal_weight", bVar.W, -1.0f);
                k("app:layout_constraintHorizontal_chainStyle", bVar.X);
                k("app:layout_constraintVertical_chainStyle", bVar.Y);
                h("app:barrierDirection", bVar.f24118h0, new String[]{"left", "right", "top", "bottom", "start", "end"}, -1);
                m("app:layout_constraintTag", bVar.f24128m0, null);
                int[] iArr = bVar.f24124k0;
                if (iArr != null) {
                    n("'ReferenceIds'", iArr);
                }
                this.f24219a.write(" />\n");
            }
            this.f24219a.write("</ConstraintSet>\n");
        }

        void j(String name, float value, float def) throws IOException {
            if (value == def) {
                return;
            }
            this.f24219a.write("\n       " + name);
            this.f24219a.write("=\"" + value + "\"");
        }

        void k(String name, int value) throws IOException {
            if (value == 0 || value == -1) {
                return;
            }
            this.f24219a.write("\n       " + name + "=\"" + value + "\"\n");
        }

        void l(String name, String value) throws IOException {
            if (value == null) {
                return;
            }
            this.f24219a.write(name);
            this.f24219a.write(":");
            this.f24219a.write(", ".concat(value));
            this.f24219a.write("\n");
        }

        void m(String name, String value, String def) throws IOException {
            if (value == null || value.equals(def)) {
                return;
            }
            this.f24219a.write("\n       " + name);
            this.f24219a.write("=\"" + value + "\"");
        }

        void n(String name, int[] value) throws IOException {
            if (value == null) {
                return;
            }
            this.f24219a.write("\n       " + name);
            this.f24219a.write(":");
            int i4 = 0;
            while (i4 < value.length) {
                Writer writer = this.f24219a;
                StringBuilder sb = new StringBuilder();
                sb.append(i4 == 0 ? "[" : ", ");
                sb.append(a(value[i4]));
                writer.write(sb.toString());
                i4++;
            }
            this.f24219a.write("],\n");
        }

        void o(String str, int leftToLeft) throws IOException {
            if (leftToLeft == -1) {
                return;
            }
            this.f24219a.write("\n       " + str);
            this.f24219a.write("=\"" + a(leftToLeft) + "\"");
        }
    }

    static {
        W.append(g.m.H5, 25);
        W.append(g.m.I5, 26);
        W.append(g.m.K5, 29);
        W.append(g.m.L5, 30);
        W.append(g.m.R5, 36);
        W.append(g.m.Q5, 35);
        W.append(g.m.o5, 4);
        W.append(g.m.n5, 3);
        W.append(g.m.j5, 1);
        W.append(g.m.l5, 91);
        W.append(g.m.k5, 92);
        W.append(g.m.a6, 6);
        W.append(g.m.b6, 7);
        W.append(g.m.v5, 17);
        W.append(g.m.w5, 18);
        W.append(g.m.x5, 19);
        W.append(g.m.f5, 99);
        W.append(g.m.f24987d4, 27);
        W.append(g.m.M5, 32);
        W.append(g.m.N5, 33);
        W.append(g.m.u5, 10);
        W.append(g.m.t5, 9);
        W.append(g.m.f6, 13);
        W.append(g.m.i6, 16);
        W.append(g.m.g6, 14);
        W.append(g.m.d6, 11);
        W.append(g.m.h6, 15);
        W.append(g.m.e6, 12);
        W.append(g.m.U5, 40);
        W.append(g.m.F5, 39);
        W.append(g.m.E5, 41);
        W.append(g.m.T5, 42);
        W.append(g.m.D5, 20);
        W.append(g.m.S5, 37);
        W.append(g.m.s5, 5);
        W.append(g.m.G5, 87);
        W.append(g.m.P5, 87);
        W.append(g.m.J5, 87);
        W.append(g.m.m5, 87);
        W.append(g.m.i5, 87);
        W.append(g.m.i4, 24);
        W.append(g.m.k4, 28);
        W.append(g.m.A4, 31);
        W.append(g.m.B4, 8);
        W.append(g.m.j4, 34);
        W.append(g.m.l4, 2);
        W.append(g.m.g4, 23);
        W.append(g.m.h4, 21);
        W.append(g.m.V5, 95);
        W.append(g.m.y5, 96);
        W.append(g.m.f4, 22);
        W.append(g.m.q4, 43);
        W.append(g.m.D4, 44);
        W.append(g.m.y4, 45);
        W.append(g.m.z4, 46);
        W.append(g.m.x4, 60);
        W.append(g.m.v4, 47);
        W.append(g.m.w4, 48);
        W.append(g.m.r4, 49);
        W.append(g.m.s4, 50);
        W.append(g.m.t4, 51);
        W.append(g.m.u4, 52);
        W.append(g.m.C4, 53);
        W.append(g.m.W5, 54);
        W.append(g.m.z5, 55);
        W.append(g.m.X5, 56);
        W.append(g.m.A5, 57);
        W.append(g.m.Y5, 58);
        W.append(g.m.B5, 59);
        W.append(g.m.p5, 61);
        W.append(g.m.r5, 62);
        W.append(g.m.q5, 63);
        W.append(g.m.F4, 64);
        W.append(g.m.u6, 65);
        W.append(g.m.M4, 66);
        W.append(g.m.v6, 67);
        W.append(g.m.m6, 79);
        W.append(g.m.e4, 38);
        W.append(g.m.l6, 68);
        W.append(g.m.Z5, 69);
        W.append(g.m.C5, 70);
        W.append(g.m.k6, 97);
        W.append(g.m.J4, 71);
        W.append(g.m.H4, 72);
        W.append(g.m.I4, 73);
        W.append(g.m.K4, 74);
        W.append(g.m.G4, 75);
        W.append(g.m.n6, 76);
        W.append(g.m.O5, 77);
        W.append(g.m.w6, 78);
        W.append(g.m.h5, 80);
        W.append(g.m.g5, 81);
        W.append(g.m.p6, 82);
        W.append(g.m.t6, 83);
        W.append(g.m.s6, 84);
        W.append(g.m.r6, 85);
        W.append(g.m.q6, 86);
        SparseIntArray sparseIntArray = X;
        int i4 = g.m.f25273za;
        sparseIntArray.append(i4, 6);
        X.append(i4, 7);
        X.append(g.m.S8, 27);
        X.append(g.m.Da, 13);
        X.append(g.m.Ga, 16);
        X.append(g.m.Ea, 14);
        X.append(g.m.Ba, 11);
        X.append(g.m.Fa, 15);
        X.append(g.m.Ca, 12);
        X.append(g.m.f25189sa, 40);
        X.append(g.m.f25094la, 39);
        X.append(g.m.f25081ka, 41);
        X.append(g.m.f25176ra, 42);
        X.append(g.m.f25068ja, 20);
        X.append(g.m.f25162qa, 37);
        X.append(g.m.f24948aa, 5);
        X.append(g.m.f25107ma, 87);
        X.append(g.m.f25148pa, 87);
        X.append(g.m.f25120na, 87);
        X.append(g.m.X9, 87);
        X.append(g.m.W9, 87);
        X.append(g.m.X8, 24);
        X.append(g.m.Z8, 28);
        X.append(g.m.f25147p9, 31);
        X.append(g.m.f25161q9, 8);
        X.append(g.m.Y8, 34);
        X.append(g.m.f24947a9, 2);
        X.append(g.m.V8, 23);
        X.append(g.m.W8, 21);
        X.append(g.m.f25201ta, 95);
        X.append(g.m.f25003ea, 96);
        X.append(g.m.U8, 22);
        X.append(g.m.f25015f9, 43);
        X.append(g.m.f25188s9, 44);
        X.append(g.m.f25119n9, 45);
        X.append(g.m.f25133o9, 46);
        X.append(g.m.f25106m9, 60);
        X.append(g.m.f25080k9, 47);
        X.append(g.m.f25093l9, 48);
        X.append(g.m.f25028g9, 49);
        X.append(g.m.f25041h9, 50);
        X.append(g.m.f25054i9, 51);
        X.append(g.m.f25067j9, 52);
        X.append(g.m.f25175r9, 53);
        X.append(g.m.f25213ua, 54);
        X.append(g.m.f25016fa, 55);
        X.append(g.m.f25225va, 56);
        X.append(g.m.f25029ga, 57);
        X.append(g.m.f25237wa, 58);
        X.append(g.m.f25042ha, 59);
        X.append(g.m.Z9, 62);
        X.append(g.m.Y9, 63);
        X.append(g.m.f25212u9, 64);
        X.append(g.m.Ta, 65);
        X.append(g.m.A9, 66);
        X.append(g.m.Ua, 67);
        X.append(g.m.Ka, 79);
        X.append(g.m.T8, 38);
        X.append(g.m.La, 98);
        X.append(g.m.Ja, 68);
        X.append(g.m.f25249xa, 69);
        X.append(g.m.f25055ia, 70);
        X.append(g.m.f25260y9, 71);
        X.append(g.m.f25236w9, 72);
        X.append(g.m.f25248x9, 73);
        X.append(g.m.f25272z9, 74);
        X.append(g.m.f25224v9, 75);
        X.append(g.m.Ma, 76);
        X.append(g.m.f25134oa, 77);
        X.append(g.m.Va, 78);
        X.append(g.m.V9, 80);
        X.append(g.m.U9, 81);
        X.append(g.m.Oa, 82);
        X.append(g.m.Sa, 83);
        X.append(g.m.Ra, 84);
        X.append(g.m.Qa, 85);
        X.append(g.m.Pa, 86);
        X.append(g.m.Ia, 97);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void A0(java.lang.Object r4, android.content.res.TypedArray r5, int r6, int r7) {
        /*
            if (r4 != 0) goto L3
            return
        L3:
            android.util.TypedValue r0 = r5.peekValue(r6)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L71
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L2a
            int r5 = r5.getInt(r6, r2)
            r6 = -4
            r0 = -2
            if (r5 == r6) goto L26
            r6 = -3
            if (r5 == r6) goto L20
            if (r5 == r0) goto L22
            r6 = -1
            if (r5 == r6) goto L22
        L20:
            r5 = r2
            goto L2f
        L22:
            r3 = r2
            r2 = r5
            r5 = r3
            goto L2f
        L26:
            r2 = 1
            r5 = r2
            r2 = r0
            goto L2f
        L2a:
            int r5 = r5.getDimensionPixelSize(r6, r2)
            goto L22
        L2f:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r6 == 0) goto L41
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r4 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r4
            if (r7 != 0) goto L3c
            r4.width = r2
            r4.P2 = r5
            goto L70
        L3c:
            r4.height = r2
            r4.Q2 = r5
            goto L70
        L41:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.d.b
            if (r6 == 0) goto L53
            androidx.constraintlayout.widget.d$b r4 = (androidx.constraintlayout.widget.d.b) r4
            if (r7 != 0) goto L4e
            r4.f24109d = r2
            r4.f24130n0 = r5
            goto L70
        L4e:
            r4.f24111e = r2
            r4.f24132o0 = r5
            goto L70
        L53:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.d.a.C0397a
            if (r6 == 0) goto L70
            androidx.constraintlayout.widget.d$a$a r4 = (androidx.constraintlayout.widget.d.a.C0397a) r4
            if (r7 != 0) goto L66
            r6 = 23
            r4.b(r6, r2)
            r6 = 80
            r4.d(r6, r5)
            goto L70
        L66:
            r6 = 21
            r4.b(r6, r2)
            r6 = 81
            r4.d(r6, r5)
        L70:
            return
        L71:
            java.lang.String r5 = r5.getString(r6)
            B0(r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.A0(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    static void B0(Object data, String value, int orientation) {
        if (value == null) {
            return;
        }
        int indexOf = value.indexOf(61);
        int length = value.length();
        if (indexOf <= 0 || indexOf >= length - 1) {
            return;
        }
        String substring = value.substring(0, indexOf);
        String substring2 = value.substring(indexOf + 1);
        if (substring2.length() > 0) {
            String trim = substring.trim();
            String trim2 = substring2.trim();
            if ("ratio".equalsIgnoreCase(trim)) {
                if (data instanceof ConstraintLayout.LayoutParams) {
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) data;
                    if (orientation == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                    }
                    C0(layoutParams, trim2);
                    return;
                }
                if (data instanceof b) {
                    ((b) data).A = trim2;
                    return;
                } else {
                    if (data instanceof a.C0397a) {
                        ((a.C0397a) data).c(5, trim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(trim)) {
                    float parseFloat = Float.parseFloat(trim2);
                    if (data instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) data;
                        if (orientation == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                            layoutParams2.M = parseFloat;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                            layoutParams2.N = parseFloat;
                        }
                    } else if (data instanceof b) {
                        b bVar = (b) data;
                        if (orientation == 0) {
                            bVar.f24109d = 0;
                            bVar.W = parseFloat;
                        } else {
                            bVar.f24111e = 0;
                            bVar.V = parseFloat;
                        }
                    } else if (data instanceof a.C0397a) {
                        a.C0397a c0397a = (a.C0397a) data;
                        if (orientation == 0) {
                            c0397a.b(23, 0);
                            c0397a.a(39, parseFloat);
                        } else {
                            c0397a.b(21, 0);
                            c0397a.a(40, parseFloat);
                        }
                    }
                } else {
                    if (!"parent".equalsIgnoreCase(trim)) {
                        return;
                    }
                    float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                    if (data instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) data;
                        if (orientation == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).width = 0;
                            layoutParams3.V1 = max;
                            layoutParams3.Q = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
                            layoutParams3.L2 = max;
                            layoutParams3.R = 2;
                        }
                    } else if (data instanceof b) {
                        b bVar2 = (b) data;
                        if (orientation == 0) {
                            bVar2.f24109d = 0;
                            bVar2.f24114f0 = max;
                            bVar2.Z = 2;
                        } else {
                            bVar2.f24111e = 0;
                            bVar2.f24116g0 = max;
                            bVar2.f24104a0 = 2;
                        }
                    } else if (data instanceof a.C0397a) {
                        a.C0397a c0397a2 = (a.C0397a) data;
                        if (orientation == 0) {
                            c0397a2.b(23, 0);
                            c0397a2.b(54, 2);
                        } else {
                            c0397a2.b(21, 0);
                            c0397a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    static void C0(ConstraintLayout.LayoutParams params, String value) {
        float f4 = Float.NaN;
        int i4 = -1;
        if (value != null) {
            int length = value.length();
            int indexOf = value.indexOf(44);
            int i5 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = value.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i4 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i4 = 1;
                }
                i5 = indexOf + 1;
            }
            int indexOf2 = value.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = value.substring(i5);
                    if (substring2.length() > 0) {
                        f4 = Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = value.substring(i5, indexOf2);
                    String substring4 = value.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f4 = i4 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        params.J = value;
        params.K = f4;
        params.L = i4;
    }

    private String F1(int side) {
        switch (side) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    private void G0(Context ctx, a c5, TypedArray a5, boolean override) {
        if (override) {
            H0(ctx, c5, a5);
            return;
        }
        int indexCount = a5.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = a5.getIndex(i4);
            if (index != g.m.e4 && g.m.A4 != index && g.m.B4 != index) {
                c5.f24047d.f24158a = true;
                c5.f24048e.f24105b = true;
                c5.f24046c.f24172a = true;
                c5.f24049f.f24189a = true;
            }
            switch (W.get(index)) {
                case 1:
                    b bVar = c5.f24048e;
                    bVar.f24137r = y0(a5, index, bVar.f24137r);
                    break;
                case 2:
                    b bVar2 = c5.f24048e;
                    bVar2.K = a5.getDimensionPixelSize(index, bVar2.K);
                    break;
                case 3:
                    b bVar3 = c5.f24048e;
                    bVar3.f24135q = y0(a5, index, bVar3.f24135q);
                    break;
                case 4:
                    b bVar4 = c5.f24048e;
                    bVar4.f24133p = y0(a5, index, bVar4.f24133p);
                    break;
                case 5:
                    c5.f24048e.A = a5.getString(index);
                    break;
                case 6:
                    b bVar5 = c5.f24048e;
                    bVar5.E = a5.getDimensionPixelOffset(index, bVar5.E);
                    break;
                case 7:
                    b bVar6 = c5.f24048e;
                    bVar6.F = a5.getDimensionPixelOffset(index, bVar6.F);
                    break;
                case 8:
                    b bVar7 = c5.f24048e;
                    bVar7.L = a5.getDimensionPixelSize(index, bVar7.L);
                    break;
                case 9:
                    b bVar8 = c5.f24048e;
                    bVar8.f24143x = y0(a5, index, bVar8.f24143x);
                    break;
                case 10:
                    b bVar9 = c5.f24048e;
                    bVar9.f24142w = y0(a5, index, bVar9.f24142w);
                    break;
                case 11:
                    b bVar10 = c5.f24048e;
                    bVar10.R = a5.getDimensionPixelSize(index, bVar10.R);
                    break;
                case 12:
                    b bVar11 = c5.f24048e;
                    bVar11.S = a5.getDimensionPixelSize(index, bVar11.S);
                    break;
                case 13:
                    b bVar12 = c5.f24048e;
                    bVar12.O = a5.getDimensionPixelSize(index, bVar12.O);
                    break;
                case 14:
                    b bVar13 = c5.f24048e;
                    bVar13.Q = a5.getDimensionPixelSize(index, bVar13.Q);
                    break;
                case 15:
                    b bVar14 = c5.f24048e;
                    bVar14.T = a5.getDimensionPixelSize(index, bVar14.T);
                    break;
                case 16:
                    b bVar15 = c5.f24048e;
                    bVar15.P = a5.getDimensionPixelSize(index, bVar15.P);
                    break;
                case 17:
                    b bVar16 = c5.f24048e;
                    bVar16.f24113f = a5.getDimensionPixelOffset(index, bVar16.f24113f);
                    break;
                case 18:
                    b bVar17 = c5.f24048e;
                    bVar17.f24115g = a5.getDimensionPixelOffset(index, bVar17.f24115g);
                    break;
                case 19:
                    b bVar18 = c5.f24048e;
                    bVar18.f24117h = a5.getFloat(index, bVar18.f24117h);
                    break;
                case 20:
                    b bVar19 = c5.f24048e;
                    bVar19.f24144y = a5.getFloat(index, bVar19.f24144y);
                    break;
                case 21:
                    b bVar20 = c5.f24048e;
                    bVar20.f24111e = a5.getLayoutDimension(index, bVar20.f24111e);
                    break;
                case 22:
                    C0398d c0398d = c5.f24046c;
                    c0398d.f24173b = a5.getInt(index, c0398d.f24173b);
                    C0398d c0398d2 = c5.f24046c;
                    c0398d2.f24173b = U[c0398d2.f24173b];
                    break;
                case 23:
                    b bVar21 = c5.f24048e;
                    bVar21.f24109d = a5.getLayoutDimension(index, bVar21.f24109d);
                    break;
                case 24:
                    b bVar22 = c5.f24048e;
                    bVar22.H = a5.getDimensionPixelSize(index, bVar22.H);
                    break;
                case 25:
                    b bVar23 = c5.f24048e;
                    bVar23.f24121j = y0(a5, index, bVar23.f24121j);
                    break;
                case 26:
                    b bVar24 = c5.f24048e;
                    bVar24.f24123k = y0(a5, index, bVar24.f24123k);
                    break;
                case 27:
                    b bVar25 = c5.f24048e;
                    bVar25.G = a5.getInt(index, bVar25.G);
                    break;
                case 28:
                    b bVar26 = c5.f24048e;
                    bVar26.I = a5.getDimensionPixelSize(index, bVar26.I);
                    break;
                case 29:
                    b bVar27 = c5.f24048e;
                    bVar27.f24125l = y0(a5, index, bVar27.f24125l);
                    break;
                case 30:
                    b bVar28 = c5.f24048e;
                    bVar28.f24127m = y0(a5, index, bVar28.f24127m);
                    break;
                case 31:
                    b bVar29 = c5.f24048e;
                    bVar29.M = a5.getDimensionPixelSize(index, bVar29.M);
                    break;
                case 32:
                    b bVar30 = c5.f24048e;
                    bVar30.f24140u = y0(a5, index, bVar30.f24140u);
                    break;
                case 33:
                    b bVar31 = c5.f24048e;
                    bVar31.f24141v = y0(a5, index, bVar31.f24141v);
                    break;
                case 34:
                    b bVar32 = c5.f24048e;
                    bVar32.J = a5.getDimensionPixelSize(index, bVar32.J);
                    break;
                case 35:
                    b bVar33 = c5.f24048e;
                    bVar33.f24131o = y0(a5, index, bVar33.f24131o);
                    break;
                case 36:
                    b bVar34 = c5.f24048e;
                    bVar34.f24129n = y0(a5, index, bVar34.f24129n);
                    break;
                case 37:
                    b bVar35 = c5.f24048e;
                    bVar35.f24145z = a5.getFloat(index, bVar35.f24145z);
                    break;
                case 38:
                    c5.f24044a = a5.getResourceId(index, c5.f24044a);
                    break;
                case 39:
                    b bVar36 = c5.f24048e;
                    bVar36.W = a5.getFloat(index, bVar36.W);
                    break;
                case 40:
                    b bVar37 = c5.f24048e;
                    bVar37.V = a5.getFloat(index, bVar37.V);
                    break;
                case 41:
                    b bVar38 = c5.f24048e;
                    bVar38.X = a5.getInt(index, bVar38.X);
                    break;
                case 42:
                    b bVar39 = c5.f24048e;
                    bVar39.Y = a5.getInt(index, bVar39.Y);
                    break;
                case 43:
                    C0398d c0398d3 = c5.f24046c;
                    c0398d3.f24175d = a5.getFloat(index, c0398d3.f24175d);
                    break;
                case 44:
                    e eVar = c5.f24049f;
                    eVar.f24201m = true;
                    eVar.f24202n = a5.getDimension(index, eVar.f24202n);
                    break;
                case 45:
                    e eVar2 = c5.f24049f;
                    eVar2.f24191c = a5.getFloat(index, eVar2.f24191c);
                    break;
                case 46:
                    e eVar3 = c5.f24049f;
                    eVar3.f24192d = a5.getFloat(index, eVar3.f24192d);
                    break;
                case 47:
                    e eVar4 = c5.f24049f;
                    eVar4.f24193e = a5.getFloat(index, eVar4.f24193e);
                    break;
                case 48:
                    e eVar5 = c5.f24049f;
                    eVar5.f24194f = a5.getFloat(index, eVar5.f24194f);
                    break;
                case 49:
                    e eVar6 = c5.f24049f;
                    eVar6.f24195g = a5.getDimension(index, eVar6.f24195g);
                    break;
                case 50:
                    e eVar7 = c5.f24049f;
                    eVar7.f24196h = a5.getDimension(index, eVar7.f24196h);
                    break;
                case 51:
                    e eVar8 = c5.f24049f;
                    eVar8.f24198j = a5.getDimension(index, eVar8.f24198j);
                    break;
                case 52:
                    e eVar9 = c5.f24049f;
                    eVar9.f24199k = a5.getDimension(index, eVar9.f24199k);
                    break;
                case 53:
                    e eVar10 = c5.f24049f;
                    eVar10.f24200l = a5.getDimension(index, eVar10.f24200l);
                    break;
                case 54:
                    b bVar40 = c5.f24048e;
                    bVar40.Z = a5.getInt(index, bVar40.Z);
                    break;
                case 55:
                    b bVar41 = c5.f24048e;
                    bVar41.f24104a0 = a5.getInt(index, bVar41.f24104a0);
                    break;
                case 56:
                    b bVar42 = c5.f24048e;
                    bVar42.f24106b0 = a5.getDimensionPixelSize(index, bVar42.f24106b0);
                    break;
                case 57:
                    b bVar43 = c5.f24048e;
                    bVar43.f24108c0 = a5.getDimensionPixelSize(index, bVar43.f24108c0);
                    break;
                case 58:
                    b bVar44 = c5.f24048e;
                    bVar44.f24110d0 = a5.getDimensionPixelSize(index, bVar44.f24110d0);
                    break;
                case 59:
                    b bVar45 = c5.f24048e;
                    bVar45.f24112e0 = a5.getDimensionPixelSize(index, bVar45.f24112e0);
                    break;
                case 60:
                    e eVar11 = c5.f24049f;
                    eVar11.f24190b = a5.getFloat(index, eVar11.f24190b);
                    break;
                case 61:
                    b bVar46 = c5.f24048e;
                    bVar46.B = y0(a5, index, bVar46.B);
                    break;
                case 62:
                    b bVar47 = c5.f24048e;
                    bVar47.C = a5.getDimensionPixelSize(index, bVar47.C);
                    break;
                case 63:
                    b bVar48 = c5.f24048e;
                    bVar48.D = a5.getFloat(index, bVar48.D);
                    break;
                case 64:
                    c cVar = c5.f24047d;
                    cVar.f24159b = y0(a5, index, cVar.f24159b);
                    break;
                case 65:
                    if (a5.peekValue(index).type == 3) {
                        c5.f24047d.f24161d = a5.getString(index);
                        break;
                    } else {
                        c5.f24047d.f24161d = androidx.constraintlayout.core.motion.utils.e.f22203o[a5.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    c5.f24047d.f24163f = a5.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = c5.f24047d;
                    cVar2.f24166i = a5.getFloat(index, cVar2.f24166i);
                    break;
                case 68:
                    C0398d c0398d4 = c5.f24046c;
                    c0398d4.f24176e = a5.getFloat(index, c0398d4.f24176e);
                    break;
                case 69:
                    c5.f24048e.f24114f0 = a5.getFloat(index, 1.0f);
                    break;
                case 70:
                    c5.f24048e.f24116g0 = a5.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    b bVar49 = c5.f24048e;
                    bVar49.f24118h0 = a5.getInt(index, bVar49.f24118h0);
                    break;
                case 73:
                    b bVar50 = c5.f24048e;
                    bVar50.f24120i0 = a5.getDimensionPixelSize(index, bVar50.f24120i0);
                    break;
                case 74:
                    c5.f24048e.f24126l0 = a5.getString(index);
                    break;
                case 75:
                    b bVar51 = c5.f24048e;
                    bVar51.f24134p0 = a5.getBoolean(index, bVar51.f24134p0);
                    break;
                case 76:
                    c cVar3 = c5.f24047d;
                    cVar3.f24162e = a5.getInt(index, cVar3.f24162e);
                    break;
                case 77:
                    c5.f24048e.f24128m0 = a5.getString(index);
                    break;
                case 78:
                    C0398d c0398d5 = c5.f24046c;
                    c0398d5.f24174c = a5.getInt(index, c0398d5.f24174c);
                    break;
                case 79:
                    c cVar4 = c5.f24047d;
                    cVar4.f24164g = a5.getFloat(index, cVar4.f24164g);
                    break;
                case 80:
                    b bVar52 = c5.f24048e;
                    bVar52.f24130n0 = a5.getBoolean(index, bVar52.f24130n0);
                    break;
                case 81:
                    b bVar53 = c5.f24048e;
                    bVar53.f24132o0 = a5.getBoolean(index, bVar53.f24132o0);
                    break;
                case 82:
                    c cVar5 = c5.f24047d;
                    cVar5.f24160c = a5.getInteger(index, cVar5.f24160c);
                    break;
                case 83:
                    e eVar12 = c5.f24049f;
                    eVar12.f24197i = y0(a5, index, eVar12.f24197i);
                    break;
                case 84:
                    c cVar6 = c5.f24047d;
                    cVar6.f24168k = a5.getInteger(index, cVar6.f24168k);
                    break;
                case 85:
                    c cVar7 = c5.f24047d;
                    cVar7.f24167j = a5.getFloat(index, cVar7.f24167j);
                    break;
                case 86:
                    int i5 = a5.peekValue(index).type;
                    if (i5 == 1) {
                        c5.f24047d.f24171n = a5.getResourceId(index, -1);
                        c cVar8 = c5.f24047d;
                        if (cVar8.f24171n != -1) {
                            cVar8.f24170m = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i5 == 3) {
                        c5.f24047d.f24169l = a5.getString(index);
                        if (c5.f24047d.f24169l.indexOf("/") > 0) {
                            c5.f24047d.f24171n = a5.getResourceId(index, -1);
                            c5.f24047d.f24170m = -2;
                            break;
                        } else {
                            c5.f24047d.f24170m = -1;
                            break;
                        }
                    } else {
                        c cVar9 = c5.f24047d;
                        cVar9.f24170m = a5.getInteger(index, cVar9.f24171n);
                        break;
                    }
                case 87:
                    Integer.toHexString(index);
                    W.get(index);
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Integer.toHexString(index);
                    W.get(index);
                    break;
                case 91:
                    b bVar54 = c5.f24048e;
                    bVar54.f24138s = y0(a5, index, bVar54.f24138s);
                    break;
                case 92:
                    b bVar55 = c5.f24048e;
                    bVar55.f24139t = y0(a5, index, bVar55.f24139t);
                    break;
                case 93:
                    b bVar56 = c5.f24048e;
                    bVar56.N = a5.getDimensionPixelSize(index, bVar56.N);
                    break;
                case 94:
                    b bVar57 = c5.f24048e;
                    bVar57.U = a5.getDimensionPixelSize(index, bVar57.U);
                    break;
                case 95:
                    A0(c5.f24048e, a5, index, 0);
                    break;
                case 96:
                    A0(c5.f24048e, a5, index, 1);
                    break;
                case 97:
                    b bVar58 = c5.f24048e;
                    bVar58.f24136q0 = a5.getInt(index, bVar58.f24136q0);
                    break;
            }
        }
        b bVar59 = c5.f24048e;
        if (bVar59.f24126l0 != null) {
            bVar59.f24124k0 = null;
        }
    }

    private static String[] G1(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        boolean z4 = false;
        for (int i5 = 0; i5 < charArray.length; i5++) {
            char c5 = charArray[i5];
            if (c5 == ',' && !z4) {
                arrayList.add(new String(charArray, i4, i5 - i4));
                i4 = i5 + 1;
            } else if (c5 == '\"') {
                z4 = !z4;
            }
        }
        arrayList.add(new String(charArray, i4, charArray.length - i4));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static void H0(Context ctx, a c5, TypedArray a5) {
        int indexCount = a5.getIndexCount();
        a.C0397a c0397a = new a.C0397a();
        c5.f24051h = c0397a;
        c5.f24047d.f24158a = false;
        c5.f24048e.f24105b = false;
        c5.f24046c.f24172a = false;
        c5.f24049f.f24189a = false;
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = a5.getIndex(i4);
            switch (X.get(index)) {
                case 2:
                    c0397a.b(2, a5.getDimensionPixelSize(index, c5.f24048e.K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Integer.toHexString(index);
                    W.get(index);
                    break;
                case 5:
                    c0397a.c(5, a5.getString(index));
                    break;
                case 6:
                    c0397a.b(6, a5.getDimensionPixelOffset(index, c5.f24048e.E));
                    break;
                case 7:
                    c0397a.b(7, a5.getDimensionPixelOffset(index, c5.f24048e.F));
                    break;
                case 8:
                    c0397a.b(8, a5.getDimensionPixelSize(index, c5.f24048e.L));
                    break;
                case 11:
                    c0397a.b(11, a5.getDimensionPixelSize(index, c5.f24048e.R));
                    break;
                case 12:
                    c0397a.b(12, a5.getDimensionPixelSize(index, c5.f24048e.S));
                    break;
                case 13:
                    c0397a.b(13, a5.getDimensionPixelSize(index, c5.f24048e.O));
                    break;
                case 14:
                    c0397a.b(14, a5.getDimensionPixelSize(index, c5.f24048e.Q));
                    break;
                case 15:
                    c0397a.b(15, a5.getDimensionPixelSize(index, c5.f24048e.T));
                    break;
                case 16:
                    c0397a.b(16, a5.getDimensionPixelSize(index, c5.f24048e.P));
                    break;
                case 17:
                    c0397a.b(17, a5.getDimensionPixelOffset(index, c5.f24048e.f24113f));
                    break;
                case 18:
                    c0397a.b(18, a5.getDimensionPixelOffset(index, c5.f24048e.f24115g));
                    break;
                case 19:
                    c0397a.a(19, a5.getFloat(index, c5.f24048e.f24117h));
                    break;
                case 20:
                    c0397a.a(20, a5.getFloat(index, c5.f24048e.f24144y));
                    break;
                case 21:
                    c0397a.b(21, a5.getLayoutDimension(index, c5.f24048e.f24111e));
                    break;
                case 22:
                    c0397a.b(22, U[a5.getInt(index, c5.f24046c.f24173b)]);
                    break;
                case 23:
                    c0397a.b(23, a5.getLayoutDimension(index, c5.f24048e.f24109d));
                    break;
                case 24:
                    c0397a.b(24, a5.getDimensionPixelSize(index, c5.f24048e.H));
                    break;
                case 27:
                    c0397a.b(27, a5.getInt(index, c5.f24048e.G));
                    break;
                case 28:
                    c0397a.b(28, a5.getDimensionPixelSize(index, c5.f24048e.I));
                    break;
                case 31:
                    c0397a.b(31, a5.getDimensionPixelSize(index, c5.f24048e.M));
                    break;
                case 34:
                    c0397a.b(34, a5.getDimensionPixelSize(index, c5.f24048e.J));
                    break;
                case 37:
                    c0397a.a(37, a5.getFloat(index, c5.f24048e.f24145z));
                    break;
                case 38:
                    int resourceId = a5.getResourceId(index, c5.f24044a);
                    c5.f24044a = resourceId;
                    c0397a.b(38, resourceId);
                    break;
                case 39:
                    c0397a.a(39, a5.getFloat(index, c5.f24048e.W));
                    break;
                case 40:
                    c0397a.a(40, a5.getFloat(index, c5.f24048e.V));
                    break;
                case 41:
                    c0397a.b(41, a5.getInt(index, c5.f24048e.X));
                    break;
                case 42:
                    c0397a.b(42, a5.getInt(index, c5.f24048e.Y));
                    break;
                case 43:
                    c0397a.a(43, a5.getFloat(index, c5.f24046c.f24175d));
                    break;
                case 44:
                    c0397a.d(44, true);
                    c0397a.a(44, a5.getDimension(index, c5.f24049f.f24202n));
                    break;
                case 45:
                    c0397a.a(45, a5.getFloat(index, c5.f24049f.f24191c));
                    break;
                case 46:
                    c0397a.a(46, a5.getFloat(index, c5.f24049f.f24192d));
                    break;
                case 47:
                    c0397a.a(47, a5.getFloat(index, c5.f24049f.f24193e));
                    break;
                case 48:
                    c0397a.a(48, a5.getFloat(index, c5.f24049f.f24194f));
                    break;
                case 49:
                    c0397a.a(49, a5.getDimension(index, c5.f24049f.f24195g));
                    break;
                case 50:
                    c0397a.a(50, a5.getDimension(index, c5.f24049f.f24196h));
                    break;
                case 51:
                    c0397a.a(51, a5.getDimension(index, c5.f24049f.f24198j));
                    break;
                case 52:
                    c0397a.a(52, a5.getDimension(index, c5.f24049f.f24199k));
                    break;
                case 53:
                    c0397a.a(53, a5.getDimension(index, c5.f24049f.f24200l));
                    break;
                case 54:
                    c0397a.b(54, a5.getInt(index, c5.f24048e.Z));
                    break;
                case 55:
                    c0397a.b(55, a5.getInt(index, c5.f24048e.f24104a0));
                    break;
                case 56:
                    c0397a.b(56, a5.getDimensionPixelSize(index, c5.f24048e.f24106b0));
                    break;
                case 57:
                    c0397a.b(57, a5.getDimensionPixelSize(index, c5.f24048e.f24108c0));
                    break;
                case 58:
                    c0397a.b(58, a5.getDimensionPixelSize(index, c5.f24048e.f24110d0));
                    break;
                case 59:
                    c0397a.b(59, a5.getDimensionPixelSize(index, c5.f24048e.f24112e0));
                    break;
                case 60:
                    c0397a.a(60, a5.getFloat(index, c5.f24049f.f24190b));
                    break;
                case 62:
                    c0397a.b(62, a5.getDimensionPixelSize(index, c5.f24048e.C));
                    break;
                case 63:
                    c0397a.a(63, a5.getFloat(index, c5.f24048e.D));
                    break;
                case 64:
                    c0397a.b(64, y0(a5, index, c5.f24047d.f24159b));
                    break;
                case 65:
                    if (a5.peekValue(index).type == 3) {
                        c0397a.c(65, a5.getString(index));
                        break;
                    } else {
                        c0397a.c(65, androidx.constraintlayout.core.motion.utils.e.f22203o[a5.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    c0397a.b(66, a5.getInt(index, 0));
                    break;
                case 67:
                    c0397a.a(67, a5.getFloat(index, c5.f24047d.f24166i));
                    break;
                case 68:
                    c0397a.a(68, a5.getFloat(index, c5.f24046c.f24176e));
                    break;
                case 69:
                    c0397a.a(69, a5.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0397a.a(70, a5.getFloat(index, 1.0f));
                    break;
                case 71:
                    break;
                case 72:
                    c0397a.b(72, a5.getInt(index, c5.f24048e.f24118h0));
                    break;
                case 73:
                    c0397a.b(73, a5.getDimensionPixelSize(index, c5.f24048e.f24120i0));
                    break;
                case 74:
                    c0397a.c(74, a5.getString(index));
                    break;
                case 75:
                    c0397a.d(75, a5.getBoolean(index, c5.f24048e.f24134p0));
                    break;
                case 76:
                    c0397a.b(76, a5.getInt(index, c5.f24047d.f24162e));
                    break;
                case 77:
                    c0397a.c(77, a5.getString(index));
                    break;
                case 78:
                    c0397a.b(78, a5.getInt(index, c5.f24046c.f24174c));
                    break;
                case 79:
                    c0397a.a(79, a5.getFloat(index, c5.f24047d.f24164g));
                    break;
                case 80:
                    c0397a.d(80, a5.getBoolean(index, c5.f24048e.f24130n0));
                    break;
                case 81:
                    c0397a.d(81, a5.getBoolean(index, c5.f24048e.f24132o0));
                    break;
                case 82:
                    c0397a.b(82, a5.getInteger(index, c5.f24047d.f24160c));
                    break;
                case 83:
                    c0397a.b(83, y0(a5, index, c5.f24049f.f24197i));
                    break;
                case 84:
                    c0397a.b(84, a5.getInteger(index, c5.f24047d.f24168k));
                    break;
                case 85:
                    c0397a.a(85, a5.getFloat(index, c5.f24047d.f24167j));
                    break;
                case 86:
                    int i5 = a5.peekValue(index).type;
                    if (i5 == 1) {
                        c5.f24047d.f24171n = a5.getResourceId(index, -1);
                        c0397a.b(89, c5.f24047d.f24171n);
                        c cVar = c5.f24047d;
                        if (cVar.f24171n != -1) {
                            cVar.f24170m = -2;
                            c0397a.b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (i5 == 3) {
                        c5.f24047d.f24169l = a5.getString(index);
                        c0397a.c(90, c5.f24047d.f24169l);
                        if (c5.f24047d.f24169l.indexOf("/") > 0) {
                            c5.f24047d.f24171n = a5.getResourceId(index, -1);
                            c0397a.b(89, c5.f24047d.f24171n);
                            c5.f24047d.f24170m = -2;
                            c0397a.b(88, -2);
                            break;
                        } else {
                            c5.f24047d.f24170m = -1;
                            c0397a.b(88, -1);
                            break;
                        }
                    } else {
                        c cVar2 = c5.f24047d;
                        cVar2.f24170m = a5.getInteger(index, cVar2.f24171n);
                        c0397a.b(88, c5.f24047d.f24170m);
                        break;
                    }
                case 87:
                    Integer.toHexString(index);
                    W.get(index);
                    break;
                case 93:
                    c0397a.b(93, a5.getDimensionPixelSize(index, c5.f24048e.N));
                    break;
                case 94:
                    c0397a.b(94, a5.getDimensionPixelSize(index, c5.f24048e.U));
                    break;
                case 95:
                    A0(c0397a, a5, index, 0);
                    break;
                case 96:
                    A0(c0397a, a5, index, 1);
                    break;
                case 97:
                    c0397a.b(97, a5.getInt(index, c5.f24048e.f24136q0));
                    break;
                case 98:
                    if (MotionLayout.l4) {
                        int resourceId2 = a5.getResourceId(index, c5.f24044a);
                        c5.f24044a = resourceId2;
                        if (resourceId2 == -1) {
                            c5.f24045b = a5.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (a5.peekValue(index).type == 3) {
                        c5.f24045b = a5.getString(index);
                        break;
                    } else {
                        c5.f24044a = a5.getResourceId(index, c5.f24044a);
                        break;
                    }
                case 99:
                    c0397a.d(99, a5.getBoolean(index, c5.f24048e.f24119i));
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void R0(a c5, int type, float value) {
        if (type == 19) {
            c5.f24048e.f24117h = value;
        }
        if (type == 20) {
            c5.f24048e.f24144y = value;
            return;
        }
        if (type == 37) {
            c5.f24048e.f24145z = value;
            return;
        }
        if (type == 60) {
            c5.f24049f.f24190b = value;
            return;
        }
        if (type == 63) {
            c5.f24048e.D = value;
            return;
        }
        if (type == 79) {
            c5.f24047d.f24164g = value;
            return;
        }
        if (type == 85) {
            c5.f24047d.f24167j = value;
            return;
        }
        if (type == 39) {
            c5.f24048e.W = value;
            return;
        }
        if (type == 40) {
            c5.f24048e.V = value;
            return;
        }
        switch (type) {
            case 43:
                c5.f24046c.f24175d = value;
                break;
            case 44:
                e eVar = c5.f24049f;
                eVar.f24202n = value;
                eVar.f24201m = true;
                break;
            case 45:
                c5.f24049f.f24191c = value;
                break;
            case 46:
                c5.f24049f.f24192d = value;
                break;
            case 47:
                c5.f24049f.f24193e = value;
                break;
            case 48:
                c5.f24049f.f24194f = value;
                break;
            case 49:
                c5.f24049f.f24195g = value;
                break;
            case 50:
                c5.f24049f.f24196h = value;
                break;
            case 51:
                c5.f24049f.f24198j = value;
                break;
            case 52:
                c5.f24049f.f24199k = value;
                break;
            case 53:
                c5.f24049f.f24200l = value;
                break;
            default:
                switch (type) {
                    case 67:
                        c5.f24047d.f24166i = value;
                        break;
                    case 68:
                        c5.f24046c.f24176e = value;
                        break;
                    case 69:
                        c5.f24048e.f24114f0 = value;
                        break;
                    case 70:
                        c5.f24048e.f24116g0 = value;
                        break;
                }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void S0(a c5, int type, int value) {
        if (type == 6) {
            c5.f24048e.E = value;
        }
        if (type == 7) {
            c5.f24048e.F = value;
            return;
        }
        if (type == 8) {
            c5.f24048e.L = value;
            return;
        }
        if (type == 27) {
            c5.f24048e.G = value;
            return;
        }
        if (type == 28) {
            c5.f24048e.I = value;
            return;
        }
        if (type == 41) {
            c5.f24048e.X = value;
            return;
        }
        if (type == 42) {
            c5.f24048e.Y = value;
            return;
        }
        if (type == 61) {
            c5.f24048e.B = value;
            return;
        }
        if (type == 62) {
            c5.f24048e.C = value;
            return;
        }
        if (type == 72) {
            c5.f24048e.f24118h0 = value;
            return;
        }
        if (type == 73) {
            c5.f24048e.f24120i0 = value;
            return;
        }
        if (type == 88) {
            c5.f24047d.f24170m = value;
            return;
        }
        if (type == 89) {
            c5.f24047d.f24171n = value;
            return;
        }
        switch (type) {
            case 2:
                c5.f24048e.K = value;
                break;
            case 11:
                c5.f24048e.R = value;
                break;
            case 12:
                c5.f24048e.S = value;
                break;
            case 13:
                c5.f24048e.O = value;
                break;
            case 14:
                c5.f24048e.Q = value;
                break;
            case 15:
                c5.f24048e.T = value;
                break;
            case 16:
                c5.f24048e.P = value;
                break;
            case 17:
                c5.f24048e.f24113f = value;
                break;
            case 18:
                c5.f24048e.f24115g = value;
                break;
            case 31:
                c5.f24048e.M = value;
                break;
            case 34:
                c5.f24048e.J = value;
                break;
            case 38:
                c5.f24044a = value;
                break;
            case 64:
                c5.f24047d.f24159b = value;
                break;
            case 66:
                c5.f24047d.f24163f = value;
                break;
            case 76:
                c5.f24047d.f24162e = value;
                break;
            case 78:
                c5.f24046c.f24174c = value;
                break;
            case 93:
                c5.f24048e.N = value;
                break;
            case 94:
                c5.f24048e.U = value;
                break;
            case 97:
                c5.f24048e.f24136q0 = value;
                break;
            default:
                switch (type) {
                    case 21:
                        c5.f24048e.f24111e = value;
                        break;
                    case 22:
                        c5.f24046c.f24173b = value;
                        break;
                    case 23:
                        c5.f24048e.f24109d = value;
                        break;
                    case 24:
                        c5.f24048e.H = value;
                        break;
                    default:
                        switch (type) {
                            case 54:
                                c5.f24048e.Z = value;
                                break;
                            case 55:
                                c5.f24048e.f24104a0 = value;
                                break;
                            case 56:
                                c5.f24048e.f24106b0 = value;
                                break;
                            case 57:
                                c5.f24048e.f24108c0 = value;
                                break;
                            case 58:
                                c5.f24048e.f24110d0 = value;
                                break;
                            case 59:
                                c5.f24048e.f24112e0 = value;
                                break;
                            default:
                                switch (type) {
                                    case 82:
                                        c5.f24047d.f24160c = value;
                                        break;
                                    case 83:
                                        c5.f24049f.f24197i = value;
                                        break;
                                    case 84:
                                        c5.f24047d.f24168k = value;
                                        break;
                                }
                        }
                }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void T0(a c5, int type, String value) {
        if (type == 5) {
            c5.f24048e.A = value;
            return;
        }
        if (type == 65) {
            c5.f24047d.f24161d = value;
            return;
        }
        if (type == 74) {
            b bVar = c5.f24048e;
            bVar.f24126l0 = value;
            bVar.f24124k0 = null;
        } else if (type == 77) {
            c5.f24048e.f24128m0 = value;
        } else {
            if (type != 90) {
                return;
            }
            c5.f24047d.f24169l = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void U0(a c5, int type, boolean value) {
        if (type == 44) {
            c5.f24049f.f24201m = value;
            return;
        }
        if (type == 75) {
            c5.f24048e.f24134p0 = value;
        } else if (type == 80) {
            c5.f24048e.f24130n0 = value;
        } else {
            if (type != 81) {
                return;
            }
            c5.f24048e.f24132o0 = value;
        }
    }

    private int[] Z(View view, String referenceIdString) {
        int i4;
        Object l4;
        String[] split = referenceIdString.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i5 = 0;
        int i6 = 0;
        while (i5 < split.length) {
            String trim = split[i5].trim();
            try {
                i4 = g.C0399g.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i4 = 0;
            }
            if (i4 == 0) {
                i4 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i4 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (l4 = ((ConstraintLayout) view.getParent()).l(0, trim)) != null && (l4 instanceof Integer)) {
                i4 = ((Integer) l4).intValue();
            }
            iArr[i6] = i4;
            i5++;
            i6++;
        }
        return i6 != split.length ? Arrays.copyOf(iArr, i6) : iArr;
    }

    private void d0(int leftId, int leftSide, int rightId, int rightSide, int[] chainIds, float[] weights, int style, int left, int right) {
        if (chainIds.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (weights != null && weights.length != chainIds.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (weights != null) {
            i0(chainIds[0]).f24048e.W = weights[0];
        }
        i0(chainIds[0]).f24048e.X = style;
        L(chainIds[0], left, leftId, leftSide, -1);
        for (int i4 = 1; i4 < chainIds.length; i4++) {
            int i5 = i4 - 1;
            L(chainIds[i4], left, chainIds[i5], right, -1);
            L(chainIds[i5], right, chainIds[i4], left, -1);
            if (weights != null) {
                i0(chainIds[i4]).f24048e.W = weights[i4];
            }
        }
        L(chainIds[chainIds.length - 1], right, rightId, rightSide, -1);
    }

    private void h(a.b attributeType, String... attributeName) {
        for (int i4 = 0; i4 < attributeName.length; i4++) {
            if (this.f24041e.containsKey(attributeName[i4])) {
                androidx.constraintlayout.widget.a aVar = this.f24041e.get(attributeName[i4]);
                if (aVar != null && aVar.j() != attributeType) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + aVar.j().name());
                }
            } else {
                this.f24041e.put(attributeName[i4], new androidx.constraintlayout.widget.a(attributeName[i4], attributeType));
            }
        }
    }

    private a h0(Context context, AttributeSet attrs, boolean override) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, override ? g.m.R8 : g.m.f24973c4);
        G0(context, aVar, obtainStyledAttributes, override);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private a i0(int id2) {
        if (!this.f24043g.containsKey(Integer.valueOf(id2))) {
            this.f24043g.put(Integer.valueOf(id2), new a());
        }
        return this.f24043g.get(Integer.valueOf(id2));
    }

    static String m0(int v4) {
        for (Field field : d.class.getDeclaredFields()) {
            if (field.getName().contains("_") && field.getType() == Integer.TYPE && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                try {
                    if (field.getInt(null) == v4) {
                        return field.getName();
                    }
                    continue;
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                }
            }
        }
        return "UNKNOWN";
    }

    static String p0(Context context, int resourceId, XmlPullParser pullParser) {
        return ".(" + androidx.constraintlayout.motion.widget.c.i(context, resourceId) + ".xml:" + pullParser.getLineNumber() + ") \"" + pullParser.getName() + "\"";
    }

    public static a w(Context context, XmlPullParser parser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(parser);
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, g.m.R8);
        H0(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int y0(TypedArray a5, int index, int def) {
        int resourceId = a5.getResourceId(index, def);
        return resourceId == -1 ? a5.getInt(index, -1) : resourceId;
    }

    public void A(int viewId, int toView) {
        if (toView == 0) {
            x(viewId, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            x(viewId, toView, 7, 0, toView, 6, 0, 0.5f);
        }
    }

    public void A1(int viewId, float bias) {
        i0(viewId).f24048e.f24145z = bias;
    }

    public void B(int centerID, int startId, int startSide, int startMargin, int endId, int endSide, int endMargin, float bias) {
        L(centerID, 6, startId, startSide, startMargin);
        L(centerID, 7, endId, endSide, endMargin);
        a aVar = this.f24043g.get(Integer.valueOf(centerID));
        if (aVar != null) {
            aVar.f24048e.f24144y = bias;
        }
    }

    public void B1(int viewId, int chainStyle) {
        i0(viewId).f24048e.Y = chainStyle;
    }

    public void C(int viewId, int toView) {
        if (toView == 0) {
            x(viewId, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            x(viewId, toView, 4, 0, toView, 3, 0, 0.5f);
        }
    }

    public void C1(int viewId, float weight) {
        i0(viewId).f24048e.V = weight;
    }

    public void D(int centerID, int topId, int topSide, int topMargin, int bottomId, int bottomSide, int bottomMargin, float bias) {
        L(centerID, 3, topId, topSide, topMargin);
        L(centerID, 4, bottomId, bottomSide, bottomMargin);
        a aVar = this.f24043g.get(Integer.valueOf(centerID));
        if (aVar != null) {
            aVar.f24048e.f24145z = bias;
        }
    }

    public void D0(a set, String attributes) {
        String[] split = attributes.split(",");
        for (int i4 = 0; i4 < split.length; i4++) {
            String[] split2 = split[i4].split("=");
            if (split2.length != 2) {
                String str = split[i4];
            } else {
                set.q(split2[0], Float.parseFloat(split2[1]));
            }
        }
    }

    public void D1(int viewId, int visibility) {
        i0(viewId).f24046c.f24173b = visibility;
    }

    public void E(int viewId) {
        this.f24043g.remove(Integer.valueOf(viewId));
    }

    public void E0(a set, String attributes) {
        String[] split = attributes.split(",");
        for (int i4 = 0; i4 < split.length; i4++) {
            String[] split2 = split[i4].split("=");
            if (split2.length != 2) {
                String str = split[i4];
            } else {
                set.q(split2[0], Integer.decode(split2[1]).intValue());
            }
        }
    }

    public void E1(int viewId, int visibilityMode) {
        i0(viewId).f24046c.f24174c = visibilityMode;
    }

    public void F(int viewId, int anchor) {
        a aVar;
        if (!this.f24043g.containsKey(Integer.valueOf(viewId)) || (aVar = this.f24043g.get(Integer.valueOf(viewId))) == null) {
            return;
        }
        switch (anchor) {
            case 1:
                b bVar = aVar.f24048e;
                bVar.f24123k = -1;
                bVar.f24121j = -1;
                bVar.H = -1;
                bVar.O = Integer.MIN_VALUE;
                return;
            case 2:
                b bVar2 = aVar.f24048e;
                bVar2.f24127m = -1;
                bVar2.f24125l = -1;
                bVar2.I = -1;
                bVar2.Q = Integer.MIN_VALUE;
                return;
            case 3:
                b bVar3 = aVar.f24048e;
                bVar3.f24131o = -1;
                bVar3.f24129n = -1;
                bVar3.J = 0;
                bVar3.P = Integer.MIN_VALUE;
                return;
            case 4:
                b bVar4 = aVar.f24048e;
                bVar4.f24133p = -1;
                bVar4.f24135q = -1;
                bVar4.K = 0;
                bVar4.R = Integer.MIN_VALUE;
                return;
            case 5:
                b bVar5 = aVar.f24048e;
                bVar5.f24137r = -1;
                bVar5.f24138s = -1;
                bVar5.f24139t = -1;
                bVar5.N = 0;
                bVar5.U = Integer.MIN_VALUE;
                return;
            case 6:
                b bVar6 = aVar.f24048e;
                bVar6.f24140u = -1;
                bVar6.f24141v = -1;
                bVar6.M = 0;
                bVar6.T = Integer.MIN_VALUE;
                return;
            case 7:
                b bVar7 = aVar.f24048e;
                bVar7.f24142w = -1;
                bVar7.f24143x = -1;
                bVar7.L = 0;
                bVar7.S = Integer.MIN_VALUE;
                return;
            case 8:
                b bVar8 = aVar.f24048e;
                bVar8.D = -1.0f;
                bVar8.C = -1;
                bVar8.B = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void F0(a set, String attributes) {
        String[] G12 = G1(attributes);
        for (int i4 = 0; i4 < G12.length; i4++) {
            String[] split = G12[i4].split("=");
            String str = G12[i4];
            set.s(split[0], split[1]);
        }
    }

    public void G(Context context, int constraintLayoutId) {
        H((ConstraintLayout) LayoutInflater.from(context).inflate(constraintLayoutId, (ViewGroup) null));
    }

    public void H(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f24043g.clear();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f24042f && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f24043g.containsKey(Integer.valueOf(id2))) {
                this.f24043g.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f24043g.get(Integer.valueOf(id2));
            if (aVar != null) {
                aVar.f24050g = androidx.constraintlayout.widget.a.d(this.f24041e, childAt);
                aVar.k(id2, layoutParams);
                aVar.f24046c.f24173b = childAt.getVisibility();
                aVar.f24046c.f24175d = childAt.getAlpha();
                aVar.f24049f.f24190b = childAt.getRotation();
                aVar.f24049f.f24191c = childAt.getRotationX();
                aVar.f24049f.f24192d = childAt.getRotationY();
                aVar.f24049f.f24193e = childAt.getScaleX();
                aVar.f24049f.f24194f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != p.f60679p || pivotY != p.f60679p) {
                    e eVar = aVar.f24049f;
                    eVar.f24195g = pivotX;
                    eVar.f24196h = pivotY;
                }
                aVar.f24049f.f24198j = childAt.getTranslationX();
                aVar.f24049f.f24199k = childAt.getTranslationY();
                aVar.f24049f.f24200l = childAt.getTranslationZ();
                e eVar2 = aVar.f24049f;
                if (eVar2.f24201m) {
                    eVar2.f24202n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f24048e.f24134p0 = barrier.Q();
                    aVar.f24048e.f24124k0 = barrier.y();
                    aVar.f24048e.f24118h0 = barrier.S();
                    aVar.f24048e.f24120i0 = barrier.R();
                }
            }
        }
    }

    public void H1(Writer writer, ConstraintLayout layout, int flags) throws IOException {
        writer.write("\n---------------------------------------------\n");
        if ((flags & 1) == 1) {
            new g(writer, layout, flags).i();
        } else {
            new f(writer, layout, flags).g();
        }
        writer.write("\n---------------------------------------------\n");
    }

    public void I(d set) {
        this.f24043g.clear();
        for (Integer num : set.f24043g.keySet()) {
            a aVar = set.f24043g.get(num);
            if (aVar != null) {
                this.f24043g.put(num, aVar.clone());
            }
        }
    }

    public void I0(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f24042f && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f24043g.containsKey(Integer.valueOf(id2))) {
                this.f24043g.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f24043g.get(Integer.valueOf(id2));
            if (aVar != null) {
                if (!aVar.f24048e.f24105b) {
                    aVar.k(id2, layoutParams);
                    if (childAt instanceof ConstraintHelper) {
                        aVar.f24048e.f24124k0 = ((ConstraintHelper) childAt).y();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            aVar.f24048e.f24134p0 = barrier.Q();
                            aVar.f24048e.f24118h0 = barrier.S();
                            aVar.f24048e.f24120i0 = barrier.R();
                        }
                    }
                    aVar.f24048e.f24105b = true;
                }
                C0398d c0398d = aVar.f24046c;
                if (!c0398d.f24172a) {
                    c0398d.f24173b = childAt.getVisibility();
                    aVar.f24046c.f24175d = childAt.getAlpha();
                    aVar.f24046c.f24172a = true;
                }
                e eVar = aVar.f24049f;
                if (!eVar.f24189a) {
                    eVar.f24189a = true;
                    eVar.f24190b = childAt.getRotation();
                    aVar.f24049f.f24191c = childAt.getRotationX();
                    aVar.f24049f.f24192d = childAt.getRotationY();
                    aVar.f24049f.f24193e = childAt.getScaleX();
                    aVar.f24049f.f24194f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != p.f60679p || pivotY != p.f60679p) {
                        e eVar2 = aVar.f24049f;
                        eVar2.f24195g = pivotX;
                        eVar2.f24196h = pivotY;
                    }
                    aVar.f24049f.f24198j = childAt.getTranslationX();
                    aVar.f24049f.f24199k = childAt.getTranslationY();
                    aVar.f24049f.f24200l = childAt.getTranslationZ();
                    e eVar3 = aVar.f24049f;
                    if (eVar3.f24201m) {
                        eVar3.f24202n = childAt.getElevation();
                    }
                }
            }
        }
    }

    public void J(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f24043g.clear();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraints.getChildAt(i4);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f24042f && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f24043g.containsKey(Integer.valueOf(id2))) {
                this.f24043g.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f24043g.get(Integer.valueOf(id2));
            if (aVar != null) {
                if (childAt instanceof ConstraintHelper) {
                    aVar.m((ConstraintHelper) childAt, id2, layoutParams);
                }
                aVar.l(id2, layoutParams);
            }
        }
    }

    public void J0(d set) {
        for (Integer num : set.f24043g.keySet()) {
            num.intValue();
            a aVar = set.f24043g.get(num);
            if (!this.f24043g.containsKey(num)) {
                this.f24043g.put(num, new a());
            }
            a aVar2 = this.f24043g.get(num);
            if (aVar2 != null) {
                b bVar = aVar2.f24048e;
                if (!bVar.f24105b) {
                    bVar.a(aVar.f24048e);
                }
                C0398d c0398d = aVar2.f24046c;
                if (!c0398d.f24172a) {
                    c0398d.a(aVar.f24046c);
                }
                e eVar = aVar2.f24049f;
                if (!eVar.f24189a) {
                    eVar.a(aVar.f24049f);
                }
                c cVar = aVar2.f24047d;
                if (!cVar.f24158a) {
                    cVar.a(aVar.f24047d);
                }
                for (String str : aVar.f24050g.keySet()) {
                    if (!aVar2.f24050g.containsKey(str)) {
                        aVar2.f24050g.put(str, aVar.f24050g.get(str));
                    }
                }
            }
        }
    }

    public void K(int startID, int startSide, int endID, int endSide) {
        if (!this.f24043g.containsKey(Integer.valueOf(startID))) {
            this.f24043g.put(Integer.valueOf(startID), new a());
        }
        a aVar = this.f24043g.get(Integer.valueOf(startID));
        if (aVar == null) {
            return;
        }
        switch (startSide) {
            case 1:
                if (endSide == 1) {
                    b bVar = aVar.f24048e;
                    bVar.f24121j = endID;
                    bVar.f24123k = -1;
                    return;
                } else {
                    if (endSide != 2) {
                        throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder("left to "), F1(endSide), " undefined"));
                    }
                    b bVar2 = aVar.f24048e;
                    bVar2.f24123k = endID;
                    bVar2.f24121j = -1;
                    return;
                }
            case 2:
                if (endSide == 1) {
                    b bVar3 = aVar.f24048e;
                    bVar3.f24125l = endID;
                    bVar3.f24127m = -1;
                    return;
                } else {
                    if (endSide != 2) {
                        throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder("right to "), F1(endSide), " undefined"));
                    }
                    b bVar4 = aVar.f24048e;
                    bVar4.f24127m = endID;
                    bVar4.f24125l = -1;
                    return;
                }
            case 3:
                if (endSide == 3) {
                    b bVar5 = aVar.f24048e;
                    bVar5.f24129n = endID;
                    bVar5.f24131o = -1;
                    bVar5.f24137r = -1;
                    bVar5.f24138s = -1;
                    bVar5.f24139t = -1;
                    return;
                }
                if (endSide != 4) {
                    throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder("right to "), F1(endSide), " undefined"));
                }
                b bVar6 = aVar.f24048e;
                bVar6.f24131o = endID;
                bVar6.f24129n = -1;
                bVar6.f24137r = -1;
                bVar6.f24138s = -1;
                bVar6.f24139t = -1;
                return;
            case 4:
                if (endSide == 4) {
                    b bVar7 = aVar.f24048e;
                    bVar7.f24135q = endID;
                    bVar7.f24133p = -1;
                    bVar7.f24137r = -1;
                    bVar7.f24138s = -1;
                    bVar7.f24139t = -1;
                    return;
                }
                if (endSide != 3) {
                    throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder("right to "), F1(endSide), " undefined"));
                }
                b bVar8 = aVar.f24048e;
                bVar8.f24133p = endID;
                bVar8.f24135q = -1;
                bVar8.f24137r = -1;
                bVar8.f24138s = -1;
                bVar8.f24139t = -1;
                return;
            case 5:
                if (endSide == 5) {
                    b bVar9 = aVar.f24048e;
                    bVar9.f24137r = endID;
                    bVar9.f24135q = -1;
                    bVar9.f24133p = -1;
                    bVar9.f24129n = -1;
                    bVar9.f24131o = -1;
                    return;
                }
                if (endSide == 3) {
                    b bVar10 = aVar.f24048e;
                    bVar10.f24138s = endID;
                    bVar10.f24135q = -1;
                    bVar10.f24133p = -1;
                    bVar10.f24129n = -1;
                    bVar10.f24131o = -1;
                    return;
                }
                if (endSide != 4) {
                    throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder("right to "), F1(endSide), " undefined"));
                }
                b bVar11 = aVar.f24048e;
                bVar11.f24139t = endID;
                bVar11.f24135q = -1;
                bVar11.f24133p = -1;
                bVar11.f24129n = -1;
                bVar11.f24131o = -1;
                return;
            case 6:
                if (endSide == 6) {
                    b bVar12 = aVar.f24048e;
                    bVar12.f24141v = endID;
                    bVar12.f24140u = -1;
                    return;
                } else {
                    if (endSide != 7) {
                        throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder("right to "), F1(endSide), " undefined"));
                    }
                    b bVar13 = aVar.f24048e;
                    bVar13.f24140u = endID;
                    bVar13.f24141v = -1;
                    return;
                }
            case 7:
                if (endSide == 7) {
                    b bVar14 = aVar.f24048e;
                    bVar14.f24143x = endID;
                    bVar14.f24142w = -1;
                    return;
                } else {
                    if (endSide != 6) {
                        throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder("right to "), F1(endSide), " undefined"));
                    }
                    b bVar15 = aVar.f24048e;
                    bVar15.f24142w = endID;
                    bVar15.f24143x = -1;
                    return;
                }
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(F1(startSide));
                sb.append(" to ");
                throw new IllegalArgumentException(android.support.v4.media.c.a(sb, F1(endSide), " unknown"));
        }
    }

    public void K0(String attributeName) {
        this.f24041e.remove(attributeName);
    }

    public void L(int startID, int startSide, int endID, int endSide, int margin) {
        if (!this.f24043g.containsKey(Integer.valueOf(startID))) {
            this.f24043g.put(Integer.valueOf(startID), new a());
        }
        a aVar = this.f24043g.get(Integer.valueOf(startID));
        if (aVar == null) {
            return;
        }
        switch (startSide) {
            case 1:
                if (endSide == 1) {
                    b bVar = aVar.f24048e;
                    bVar.f24121j = endID;
                    bVar.f24123k = -1;
                } else {
                    if (endSide != 2) {
                        throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder("Left to "), F1(endSide), " undefined"));
                    }
                    b bVar2 = aVar.f24048e;
                    bVar2.f24123k = endID;
                    bVar2.f24121j = -1;
                }
                aVar.f24048e.H = margin;
                return;
            case 2:
                if (endSide == 1) {
                    b bVar3 = aVar.f24048e;
                    bVar3.f24125l = endID;
                    bVar3.f24127m = -1;
                } else {
                    if (endSide != 2) {
                        throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder("right to "), F1(endSide), " undefined"));
                    }
                    b bVar4 = aVar.f24048e;
                    bVar4.f24127m = endID;
                    bVar4.f24125l = -1;
                }
                aVar.f24048e.I = margin;
                return;
            case 3:
                if (endSide == 3) {
                    b bVar5 = aVar.f24048e;
                    bVar5.f24129n = endID;
                    bVar5.f24131o = -1;
                    bVar5.f24137r = -1;
                    bVar5.f24138s = -1;
                    bVar5.f24139t = -1;
                } else {
                    if (endSide != 4) {
                        throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder("right to "), F1(endSide), " undefined"));
                    }
                    b bVar6 = aVar.f24048e;
                    bVar6.f24131o = endID;
                    bVar6.f24129n = -1;
                    bVar6.f24137r = -1;
                    bVar6.f24138s = -1;
                    bVar6.f24139t = -1;
                }
                aVar.f24048e.J = margin;
                return;
            case 4:
                if (endSide == 4) {
                    b bVar7 = aVar.f24048e;
                    bVar7.f24135q = endID;
                    bVar7.f24133p = -1;
                    bVar7.f24137r = -1;
                    bVar7.f24138s = -1;
                    bVar7.f24139t = -1;
                } else {
                    if (endSide != 3) {
                        throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder("right to "), F1(endSide), " undefined"));
                    }
                    b bVar8 = aVar.f24048e;
                    bVar8.f24133p = endID;
                    bVar8.f24135q = -1;
                    bVar8.f24137r = -1;
                    bVar8.f24138s = -1;
                    bVar8.f24139t = -1;
                }
                aVar.f24048e.K = margin;
                return;
            case 5:
                if (endSide == 5) {
                    b bVar9 = aVar.f24048e;
                    bVar9.f24137r = endID;
                    bVar9.f24135q = -1;
                    bVar9.f24133p = -1;
                    bVar9.f24129n = -1;
                    bVar9.f24131o = -1;
                    return;
                }
                if (endSide == 3) {
                    b bVar10 = aVar.f24048e;
                    bVar10.f24138s = endID;
                    bVar10.f24135q = -1;
                    bVar10.f24133p = -1;
                    bVar10.f24129n = -1;
                    bVar10.f24131o = -1;
                    return;
                }
                if (endSide != 4) {
                    throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder("right to "), F1(endSide), " undefined"));
                }
                b bVar11 = aVar.f24048e;
                bVar11.f24139t = endID;
                bVar11.f24135q = -1;
                bVar11.f24133p = -1;
                bVar11.f24129n = -1;
                bVar11.f24131o = -1;
                return;
            case 6:
                if (endSide == 6) {
                    b bVar12 = aVar.f24048e;
                    bVar12.f24141v = endID;
                    bVar12.f24140u = -1;
                } else {
                    if (endSide != 7) {
                        throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder("right to "), F1(endSide), " undefined"));
                    }
                    b bVar13 = aVar.f24048e;
                    bVar13.f24140u = endID;
                    bVar13.f24141v = -1;
                }
                aVar.f24048e.M = margin;
                return;
            case 7:
                if (endSide == 7) {
                    b bVar14 = aVar.f24048e;
                    bVar14.f24143x = endID;
                    bVar14.f24142w = -1;
                } else {
                    if (endSide != 6) {
                        throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder("right to "), F1(endSide), " undefined"));
                    }
                    b bVar15 = aVar.f24048e;
                    bVar15.f24142w = endID;
                    bVar15.f24143x = -1;
                }
                aVar.f24048e.L = margin;
                return;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(F1(startSide));
                sb.append(" to ");
                throw new IllegalArgumentException(android.support.v4.media.c.a(sb, F1(endSide), " unknown"));
        }
    }

    public void L0(int viewId) {
        a aVar;
        if (!this.f24043g.containsKey(Integer.valueOf(viewId)) || (aVar = this.f24043g.get(Integer.valueOf(viewId))) == null) {
            return;
        }
        b bVar = aVar.f24048e;
        int i4 = bVar.f24123k;
        int i5 = bVar.f24125l;
        if (i4 != -1 || i5 != -1) {
            if (i4 == -1 || i5 == -1) {
                int i6 = bVar.f24127m;
                if (i6 != -1) {
                    L(i4, 2, i6, 2, 0);
                } else {
                    int i7 = bVar.f24121j;
                    if (i7 != -1) {
                        L(i5, 1, i7, 1, 0);
                    }
                }
            } else {
                L(i4, 2, i5, 1, 0);
                L(i5, 1, i4, 2, 0);
            }
            F(viewId, 1);
            F(viewId, 2);
            return;
        }
        int i10 = bVar.f24140u;
        int i11 = bVar.f24142w;
        if (i10 != -1 || i11 != -1) {
            if (i10 != -1 && i11 != -1) {
                L(i10, 7, i11, 6, 0);
                L(i11, 6, i4, 7, 0);
            } else if (i11 != -1) {
                int i12 = bVar.f24127m;
                if (i12 != -1) {
                    L(i4, 7, i12, 7, 0);
                } else {
                    int i13 = bVar.f24121j;
                    if (i13 != -1) {
                        L(i11, 6, i13, 6, 0);
                    }
                }
            }
        }
        F(viewId, 6);
        F(viewId, 7);
    }

    public void M(int viewId, int id2, int radius, float angle) {
        b bVar = i0(viewId).f24048e;
        bVar.B = id2;
        bVar.C = radius;
        bVar.D = angle;
    }

    public void M0(int viewId) {
        if (this.f24043g.containsKey(Integer.valueOf(viewId))) {
            a aVar = this.f24043g.get(Integer.valueOf(viewId));
            if (aVar == null) {
                return;
            }
            b bVar = aVar.f24048e;
            int i4 = bVar.f24131o;
            int i5 = bVar.f24133p;
            if (i4 != -1 || i5 != -1) {
                if (i4 == -1 || i5 == -1) {
                    int i6 = bVar.f24135q;
                    if (i6 != -1) {
                        L(i4, 4, i6, 4, 0);
                    } else {
                        int i7 = bVar.f24129n;
                        if (i7 != -1) {
                            L(i5, 3, i7, 3, 0);
                        }
                    }
                } else {
                    L(i4, 4, i5, 3, 0);
                    L(i5, 3, i4, 4, 0);
                }
            }
        }
        F(viewId, 3);
        F(viewId, 4);
    }

    public void N(int viewId, int height) {
        i0(viewId).f24048e.f24104a0 = height;
    }

    public void N0(int viewId, float alpha) {
        i0(viewId).f24046c.f24175d = alpha;
    }

    public void O(int viewId, int width) {
        i0(viewId).f24048e.Z = width;
    }

    public void O0(int viewId, boolean apply) {
        i0(viewId).f24049f.f24201m = apply;
    }

    public void P(int viewId, int height) {
        i0(viewId).f24048e.f24111e = height;
    }

    public void P0(int id2, int type) {
        i0(id2).f24048e.f24122j0 = type;
    }

    public void Q(int viewId, int height) {
        i0(viewId).f24048e.f24108c0 = height;
    }

    public void Q0(int viewId, String attributeName, int value) {
        i0(viewId).p(attributeName, value);
    }

    public void R(int viewId, int width) {
        i0(viewId).f24048e.f24106b0 = width;
    }

    public void S(int viewId, int height) {
        i0(viewId).f24048e.f24112e0 = height;
    }

    public void T(int viewId, int width) {
        i0(viewId).f24048e.f24110d0 = width;
    }

    public void U(int viewId, float percent) {
        i0(viewId).f24048e.f24116g0 = percent;
    }

    public void V(int viewId, float percent) {
        i0(viewId).f24048e.f24114f0 = percent;
    }

    public void V0(int viewId, String ratio) {
        i0(viewId).f24048e.A = ratio;
    }

    public void W(int viewId, int width) {
        i0(viewId).f24048e.f24109d = width;
    }

    public void W0(int viewId, int position) {
        i0(viewId).f24048e.E = position;
    }

    public void X(int viewId, boolean constrained) {
        i0(viewId).f24048e.f24132o0 = constrained;
    }

    public void X0(int viewId, int position) {
        i0(viewId).f24048e.F = position;
    }

    public void Y(int viewId, boolean constrained) {
        i0(viewId).f24048e.f24130n0 = constrained;
    }

    public void Y0(int viewId, float elevation) {
        i0(viewId).f24049f.f24202n = elevation;
        i0(viewId).f24049f.f24201m = true;
    }

    public void Z0(int viewId, String attributeName, float value) {
        i0(viewId).q(attributeName, value);
    }

    public void a0(int guidelineID, int orientation) {
        b bVar = i0(guidelineID).f24048e;
        bVar.f24103a = true;
        bVar.G = orientation;
    }

    public void a1(boolean forceId) {
        this.f24042f = forceId;
    }

    public void b0(int id2, int direction, int margin, int... referenced) {
        b bVar = i0(id2).f24048e;
        bVar.f24122j0 = 1;
        bVar.f24118h0 = direction;
        bVar.f24120i0 = margin;
        bVar.f24103a = false;
        bVar.f24124k0 = referenced;
    }

    public void b1(int viewId, int anchor, int value) {
        a i02 = i0(viewId);
        switch (anchor) {
            case 1:
                i02.f24048e.O = value;
                return;
            case 2:
                i02.f24048e.Q = value;
                return;
            case 3:
                i02.f24048e.P = value;
                return;
            case 4:
                i02.f24048e.R = value;
                return;
            case 5:
                i02.f24048e.U = value;
                return;
            case 6:
                i02.f24048e.T = value;
                return;
            case 7:
                i02.f24048e.S = value;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void c0(int leftId, int leftSide, int rightId, int rightSide, int[] chainIds, float[] weights, int style) {
        d0(leftId, leftSide, rightId, rightSide, chainIds, weights, style, 1, 2);
    }

    public void c1(int guidelineID, int margin) {
        i0(guidelineID).f24048e.f24113f = margin;
        i0(guidelineID).f24048e.f24115g = -1;
        i0(guidelineID).f24048e.f24117h = -1.0f;
    }

    public void d1(int guidelineID, int margin) {
        i0(guidelineID).f24048e.f24115g = margin;
        i0(guidelineID).f24048e.f24113f = -1;
        i0(guidelineID).f24048e.f24117h = -1.0f;
    }

    public void e0(int startId, int startSide, int endId, int endSide, int[] chainIds, float[] weights, int style) {
        d0(startId, startSide, endId, endSide, chainIds, weights, style, 6, 7);
    }

    public void e1(int guidelineID, float ratio) {
        i0(guidelineID).f24048e.f24117h = ratio;
        i0(guidelineID).f24048e.f24115g = -1;
        i0(guidelineID).f24048e.f24113f = -1;
    }

    public void f0(int topId, int topSide, int bottomId, int bottomSide, int[] chainIds, float[] weights, int style) {
        if (chainIds.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (weights != null && weights.length != chainIds.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (weights != null) {
            i0(chainIds[0]).f24048e.V = weights[0];
        }
        i0(chainIds[0]).f24048e.Y = style;
        L(chainIds[0], 3, topId, topSide, 0);
        for (int i4 = 1; i4 < chainIds.length; i4++) {
            int i5 = i4 - 1;
            L(chainIds[i4], 3, chainIds[i5], 4, 0);
            L(chainIds[i5], 4, chainIds[i4], 3, 0);
            if (weights != null) {
                i0(chainIds[i4]).f24048e.V = weights[i4];
            }
        }
        L(chainIds[chainIds.length - 1], 4, bottomId, bottomSide, 0);
    }

    public void f1(int viewId, float bias) {
        i0(viewId).f24048e.f24144y = bias;
    }

    public void g0(t scene, int... ids) {
        HashSet hashSet;
        Set<Integer> keySet = this.f24043g.keySet();
        if (ids.length != 0) {
            hashSet = new HashSet();
            for (int i4 : ids) {
                hashSet.add(Integer.valueOf(i4));
            }
        } else {
            hashSet = new HashSet(keySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            a aVar = this.f24043g.get(num);
            if (aVar != null) {
                sb.append("<Constraint id=");
                sb.append(num);
                sb.append(" \n");
                aVar.f24048e.b(scene, sb);
                sb.append("/>\n");
            }
        }
        System.out.println(sb.toString());
    }

    public void g1(int viewId, int chainStyle) {
        i0(viewId).f24048e.X = chainStyle;
    }

    public void h1(int viewId, float weight) {
        i0(viewId).f24048e.W = weight;
    }

    public void i(String... attributeName) {
        h(a.b.COLOR_TYPE, attributeName);
    }

    public void i1(int viewId, String attributeName, int value) {
        i0(viewId).r(attributeName, value);
    }

    public void j(String... attributeName) {
        h(a.b.FLOAT_TYPE, attributeName);
    }

    public boolean j0(int viewId) {
        return i0(viewId).f24049f.f24201m;
    }

    public void j1(int viewId, int behavior) {
        if (behavior < 0 || behavior > 3) {
            return;
        }
        i0(viewId).f24048e.f24136q0 = behavior;
    }

    public void k(String... attributeName) {
        h(a.b.INT_TYPE, attributeName);
    }

    public a k0(int id2) {
        if (this.f24043g.containsKey(Integer.valueOf(id2))) {
            return this.f24043g.get(Integer.valueOf(id2));
        }
        return null;
    }

    public void k1(int viewId, int anchor, int value) {
        a i02 = i0(viewId);
        switch (anchor) {
            case 1:
                i02.f24048e.H = value;
                return;
            case 2:
                i02.f24048e.I = value;
                return;
            case 3:
                i02.f24048e.J = value;
                return;
            case 4:
                i02.f24048e.K = value;
                return;
            case 5:
                i02.f24048e.N = value;
                return;
            case 6:
                i02.f24048e.M = value;
                return;
            case 7:
                i02.f24048e.L = value;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void l(String... attributeName) {
        h(a.b.STRING_TYPE, attributeName);
    }

    public HashMap<String, androidx.constraintlayout.widget.a> l0() {
        return this.f24041e;
    }

    public void l1(int id2, int... referenced) {
        i0(id2).f24048e.f24124k0 = referenced;
    }

    public void m(int viewId, int leftId, int rightId) {
        L(viewId, 1, leftId, leftId == 0 ? 1 : 2, 0);
        L(viewId, 2, rightId, rightId == 0 ? 2 : 1, 0);
        if (leftId != 0) {
            L(leftId, 2, viewId, 1, 0);
        }
        if (rightId != 0) {
            L(rightId, 1, viewId, 2, 0);
        }
    }

    public void m1(int viewId, float rotation) {
        i0(viewId).f24049f.f24190b = rotation;
    }

    public void n(int viewId, int leftId, int rightId) {
        L(viewId, 6, leftId, leftId == 0 ? 6 : 7, 0);
        L(viewId, 7, rightId, rightId == 0 ? 7 : 6, 0);
        if (leftId != 0) {
            L(leftId, 7, viewId, 6, 0);
        }
        if (rightId != 0) {
            L(rightId, 6, viewId, 7, 0);
        }
    }

    public int n0(int viewId) {
        return i0(viewId).f24048e.f24111e;
    }

    public void n1(int viewId, float rotationX) {
        i0(viewId).f24049f.f24191c = rotationX;
    }

    public void o(int viewId, int topId, int bottomId) {
        L(viewId, 3, topId, topId == 0 ? 3 : 4, 0);
        L(viewId, 4, bottomId, bottomId == 0 ? 4 : 3, 0);
        if (topId != 0) {
            L(topId, 4, viewId, 3, 0);
        }
        if (bottomId != 0) {
            L(bottomId, 3, viewId, 4, 0);
        }
    }

    public int[] o0() {
        Integer[] numArr = (Integer[]) this.f24043g.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr[i4] = numArr[i4].intValue();
        }
        return iArr;
    }

    public void o1(int viewId, float rotationY) {
        i0(viewId).f24049f.f24192d = rotationY;
    }

    public void p(ConstraintLayout constraintLayout) {
        a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            int id2 = childAt.getId();
            if (!this.f24043g.containsKey(Integer.valueOf(id2))) {
                androidx.constraintlayout.motion.widget.c.k(childAt);
            } else {
                if (this.f24042f && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.f24043g.containsKey(Integer.valueOf(id2)) && (aVar = this.f24043g.get(Integer.valueOf(id2))) != null) {
                    androidx.constraintlayout.widget.a.r(childAt, aVar.f24050g);
                }
            }
        }
    }

    public void p1(int viewId, float scaleX) {
        i0(viewId).f24049f.f24193e = scaleX;
    }

    public void q(d cs) {
        for (a aVar : cs.f24043g.values()) {
            if (aVar.f24051h != null) {
                if (aVar.f24045b != null) {
                    Iterator<Integer> it = this.f24043g.keySet().iterator();
                    while (it.hasNext()) {
                        a k02 = k0(it.next().intValue());
                        String str = k02.f24048e.f24128m0;
                        if (str != null && aVar.f24045b.matches(str)) {
                            aVar.f24051h.e(k02);
                            k02.f24050g.putAll((HashMap) aVar.f24050g.clone());
                        }
                    }
                } else {
                    aVar.f24051h.e(k0(aVar.f24044a));
                }
            }
        }
    }

    public a q0(int mId) {
        return i0(mId);
    }

    public void q1(int viewId, float scaleY) {
        i0(viewId).f24049f.f24194f = scaleY;
    }

    public void r(ConstraintLayout constraintLayout) {
        t(constraintLayout, true);
        constraintLayout.I(null);
        constraintLayout.requestLayout();
    }

    public int[] r0(int id2) {
        int[] iArr = i0(id2).f24048e.f24124k0;
        return iArr == null ? new int[0] : Arrays.copyOf(iArr, iArr.length);
    }

    public void r1(int viewId, String attributeName, String value) {
        i0(viewId).s(attributeName, value);
    }

    public void s(ConstraintHelper helper, androidx.constraintlayout.core.widgets.e child, ConstraintLayout.LayoutParams layoutParams, SparseArray<androidx.constraintlayout.core.widgets.e> mapIdToWidget) {
        a aVar;
        int id2 = helper.getId();
        if (this.f24043g.containsKey(Integer.valueOf(id2)) && (aVar = this.f24043g.get(Integer.valueOf(id2))) != null && (child instanceof j)) {
            helper.C(aVar, (j) child, layoutParams, mapIdToWidget);
        }
    }

    public int s0(int viewId) {
        return i0(viewId).f24046c.f24173b;
    }

    public void s1(int viewId, float transformPivotX, float transformPivotY) {
        e eVar = i0(viewId).f24049f;
        eVar.f24196h = transformPivotY;
        eVar.f24195g = transformPivotX;
    }

    void t(ConstraintLayout constraintLayout, boolean applyPostLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f24043g.keySet());
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            int id2 = childAt.getId();
            if (!this.f24043g.containsKey(Integer.valueOf(id2))) {
                androidx.constraintlayout.motion.widget.c.k(childAt);
            } else {
                if (this.f24042f && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1 && this.f24043g.containsKey(Integer.valueOf(id2))) {
                    hashSet.remove(Integer.valueOf(id2));
                    a aVar = this.f24043g.get(Integer.valueOf(id2));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            aVar.f24048e.f24122j0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id2);
                            barrier.W(aVar.f24048e.f24118h0);
                            barrier.V(aVar.f24048e.f24120i0);
                            barrier.T(aVar.f24048e.f24134p0);
                            b bVar = aVar.f24048e;
                            int[] iArr = bVar.f24124k0;
                            if (iArr != null) {
                                barrier.H(iArr);
                            } else {
                                String str = bVar.f24126l0;
                                if (str != null) {
                                    bVar.f24124k0 = Z(barrier, str);
                                    barrier.H(aVar.f24048e.f24124k0);
                                }
                            }
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        layoutParams.f();
                        aVar.i(layoutParams);
                        if (applyPostLayout) {
                            androidx.constraintlayout.widget.a.r(childAt, aVar.f24050g);
                        }
                        childAt.setLayoutParams(layoutParams);
                        C0398d c0398d = aVar.f24046c;
                        if (c0398d.f24174c == 0) {
                            childAt.setVisibility(c0398d.f24173b);
                        }
                        childAt.setAlpha(aVar.f24046c.f24175d);
                        childAt.setRotation(aVar.f24049f.f24190b);
                        childAt.setRotationX(aVar.f24049f.f24191c);
                        childAt.setRotationY(aVar.f24049f.f24192d);
                        childAt.setScaleX(aVar.f24049f.f24193e);
                        childAt.setScaleY(aVar.f24049f.f24194f);
                        e eVar = aVar.f24049f;
                        if (eVar.f24197i != -1) {
                            if (((View) childAt.getParent()).findViewById(aVar.f24049f.f24197i) != null) {
                                float bottom = (r4.getBottom() + r4.getTop()) / 2.0f;
                                float right = (r4.getRight() + r4.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f24195g)) {
                                childAt.setPivotX(aVar.f24049f.f24195g);
                            }
                            if (!Float.isNaN(aVar.f24049f.f24196h)) {
                                childAt.setPivotY(aVar.f24049f.f24196h);
                            }
                        }
                        childAt.setTranslationX(aVar.f24049f.f24198j);
                        childAt.setTranslationY(aVar.f24049f.f24199k);
                        childAt.setTranslationZ(aVar.f24049f.f24200l);
                        e eVar2 = aVar.f24049f;
                        if (eVar2.f24201m) {
                            childAt.setElevation(eVar2.f24202n);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.f24043g.get(num);
            if (aVar2 != null) {
                if (aVar2.f24048e.f24122j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar2 = aVar2.f24048e;
                    int[] iArr2 = bVar2.f24124k0;
                    if (iArr2 != null) {
                        barrier2.H(iArr2);
                    } else {
                        String str2 = bVar2.f24126l0;
                        if (str2 != null) {
                            bVar2.f24124k0 = Z(barrier2, str2);
                            barrier2.H(aVar2.f24048e.f24124k0);
                        }
                    }
                    barrier2.W(aVar2.f24048e.f24118h0);
                    barrier2.V(aVar2.f24048e.f24120i0);
                    ConstraintLayout.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.O();
                    aVar2.i(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (aVar2.f24048e.f24103a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.i(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt2 = constraintLayout.getChildAt(i5);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).t(constraintLayout);
            }
        }
    }

    public int t0(int viewId) {
        return i0(viewId).f24046c.f24174c;
    }

    public void t1(int viewId, float transformPivotX) {
        i0(viewId).f24049f.f24195g = transformPivotX;
    }

    public void u(int id2, ConstraintLayout.LayoutParams layoutParams) {
        a aVar;
        if (!this.f24043g.containsKey(Integer.valueOf(id2)) || (aVar = this.f24043g.get(Integer.valueOf(id2))) == null) {
            return;
        }
        aVar.i(layoutParams);
    }

    public int u0(int viewId) {
        return i0(viewId).f24048e.f24109d;
    }

    public void u1(int viewId, float transformPivotY) {
        i0(viewId).f24049f.f24196h = transformPivotY;
    }

    public void v(ConstraintLayout constraintLayout) {
        t(constraintLayout, false);
        constraintLayout.I(null);
    }

    public boolean v0() {
        return this.f24042f;
    }

    public void v1(int viewId, float translationX, float translationY) {
        e eVar = i0(viewId).f24049f;
        eVar.f24198j = translationX;
        eVar.f24199k = translationY;
    }

    public void w0(Context context, int resourceId) {
        XmlResourceParser xml = context.getResources().getXml(resourceId);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a h02 = h0(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        h02.f24048e.f24103a = true;
                    }
                    this.f24043g.put(Integer.valueOf(h02.f24044a), h02);
                }
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }

    public void w1(int viewId, float translationX) {
        i0(viewId).f24049f.f24198j = translationX;
    }

    public void x(int centerID, int firstID, int firstSide, int firstMargin, int secondId, int secondSide, int secondMargin, float bias) {
        if (firstMargin < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (secondMargin < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (bias <= 0.0f || bias > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (firstSide == 1 || firstSide == 2) {
            L(centerID, 1, firstID, firstSide, firstMargin);
            L(centerID, 2, secondId, secondSide, secondMargin);
            a aVar = this.f24043g.get(Integer.valueOf(centerID));
            if (aVar != null) {
                aVar.f24048e.f24144y = bias;
                return;
            }
            return;
        }
        if (firstSide == 6 || firstSide == 7) {
            L(centerID, 6, firstID, firstSide, firstMargin);
            L(centerID, 7, secondId, secondSide, secondMargin);
            a aVar2 = this.f24043g.get(Integer.valueOf(centerID));
            if (aVar2 != null) {
                aVar2.f24048e.f24144y = bias;
                return;
            }
            return;
        }
        L(centerID, 3, firstID, firstSide, firstMargin);
        L(centerID, 4, secondId, secondSide, secondMargin);
        a aVar3 = this.f24043g.get(Integer.valueOf(centerID));
        if (aVar3 != null) {
            aVar3.f24048e.f24145z = bias;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01cf, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x0(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.x0(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public void x1(int viewId, float translationY) {
        i0(viewId).f24049f.f24199k = translationY;
    }

    public void y(int viewId, int toView) {
        if (toView == 0) {
            x(viewId, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            x(viewId, toView, 2, 0, toView, 1, 0, 0.5f);
        }
    }

    public void y1(int viewId, float translationZ) {
        i0(viewId).f24049f.f24200l = translationZ;
    }

    public void z(int centerID, int leftId, int leftSide, int leftMargin, int rightId, int rightSide, int rightMargin, float bias) {
        L(centerID, 1, leftId, leftSide, leftMargin);
        L(centerID, 2, rightId, rightSide, rightMargin);
        a aVar = this.f24043g.get(Integer.valueOf(centerID));
        if (aVar != null) {
            aVar.f24048e.f24144y = bias;
        }
    }

    public void z0(a set, String attributes) {
        String[] split = attributes.split(",");
        for (int i4 = 0; i4 < split.length; i4++) {
            String[] split2 = split[i4].split("=");
            if (split2.length != 2) {
                String str = split[i4];
            } else {
                set.p(split2[0], Color.parseColor(split2[1]));
            }
        }
    }

    public void z1(boolean validate) {
        this.f24037a = validate;
    }
}
