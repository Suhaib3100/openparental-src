package androidx.constraintlayout.widget;

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
import androidx.constraintlayout.motion.widget.v;
import androidx.constraintlayout.solver.widgets.j;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.f;
import com.google.firebase.remoteconfig.p;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet.java */
/* loaded from: classes.dex */
public class d {
    public static final int A = 0;
    private static final int A0 = 44;
    public static final int B = 1;
    private static final int B0 = 45;
    public static final int C = 0;
    private static final int C0 = 46;
    public static final int D = 1;
    private static final int D0 = 47;
    public static final int E = 2;
    private static final int E0 = 48;
    private static final boolean F = false;
    private static final int F0 = 49;
    private static final int G0 = 50;
    private static final int H = 1;
    private static final int H0 = 51;
    private static SparseIntArray I = null;
    private static final int I0 = 52;
    private static final int J = 1;
    private static final int J0 = 53;
    private static final int K = 2;
    private static final int K0 = 54;
    private static final int L = 3;
    private static final int L0 = 55;
    private static final int M = 4;
    private static final int M0 = 56;
    private static final int N = 5;
    private static final int N0 = 57;
    private static final int O = 6;
    private static final int O0 = 58;
    private static final int P = 7;
    private static final int P0 = 59;
    private static final int Q = 8;
    private static final int Q0 = 60;
    private static final int R = 9;
    private static final int R0 = 61;
    private static final int S = 10;
    private static final int S0 = 62;
    private static final int T = 11;
    private static final int T0 = 63;
    private static final int U = 12;
    private static final int U0 = 64;
    private static final int V = 13;
    private static final int V0 = 65;
    private static final int W = 14;
    private static final int W0 = 66;
    private static final int X = 15;
    private static final int X0 = 67;
    private static final int Y = 16;
    private static final int Y0 = 68;
    private static final int Z = 17;
    private static final int Z0 = 69;

    /* renamed from: a0, reason: collision with root package name */
    private static final int f2858a0 = 18;

    /* renamed from: a1, reason: collision with root package name */
    private static final int f2859a1 = 70;

    /* renamed from: b0, reason: collision with root package name */
    private static final int f2860b0 = 19;

    /* renamed from: b1, reason: collision with root package name */
    private static final int f2861b1 = 71;

    /* renamed from: c0, reason: collision with root package name */
    private static final int f2862c0 = 20;

    /* renamed from: c1, reason: collision with root package name */
    private static final int f2863c1 = 72;

    /* renamed from: d0, reason: collision with root package name */
    private static final int f2864d0 = 21;

    /* renamed from: d1, reason: collision with root package name */
    private static final int f2865d1 = 73;

    /* renamed from: e0, reason: collision with root package name */
    private static final int f2867e0 = 22;

    /* renamed from: e1, reason: collision with root package name */
    private static final int f2868e1 = 74;

    /* renamed from: f0, reason: collision with root package name */
    private static final int f2870f0 = 23;

    /* renamed from: f1, reason: collision with root package name */
    private static final int f2871f1 = 75;

    /* renamed from: g, reason: collision with root package name */
    public static final int f2872g = -1;

    /* renamed from: g0, reason: collision with root package name */
    private static final int f2873g0 = 24;

    /* renamed from: g1, reason: collision with root package name */
    private static final int f2874g1 = 76;

    /* renamed from: h, reason: collision with root package name */
    public static final int f2875h = 0;

    /* renamed from: h0, reason: collision with root package name */
    private static final int f2876h0 = 25;

    /* renamed from: h1, reason: collision with root package name */
    private static final int f2877h1 = 77;

    /* renamed from: i, reason: collision with root package name */
    public static final int f2878i = -2;

    /* renamed from: i0, reason: collision with root package name */
    private static final int f2879i0 = 26;

    /* renamed from: i1, reason: collision with root package name */
    private static final int f2880i1 = 78;

    /* renamed from: j, reason: collision with root package name */
    public static final int f2881j = 1;

    /* renamed from: j0, reason: collision with root package name */
    private static final int f2882j0 = 27;

    /* renamed from: j1, reason: collision with root package name */
    private static final int f2883j1 = 79;

    /* renamed from: k, reason: collision with root package name */
    public static final int f2884k = 0;

    /* renamed from: k0, reason: collision with root package name */
    private static final int f2885k0 = 28;

    /* renamed from: k1, reason: collision with root package name */
    private static final int f2886k1 = 80;

    /* renamed from: l, reason: collision with root package name */
    public static final int f2887l = 0;

    /* renamed from: l0, reason: collision with root package name */
    private static final int f2888l0 = 29;

    /* renamed from: l1, reason: collision with root package name */
    private static final int f2889l1 = 81;

    /* renamed from: m, reason: collision with root package name */
    public static final int f2890m = 0;

    /* renamed from: m0, reason: collision with root package name */
    private static final int f2891m0 = 30;

    /* renamed from: m1, reason: collision with root package name */
    private static final int f2892m1 = 82;

    /* renamed from: n, reason: collision with root package name */
    public static final int f2893n = 1;

    /* renamed from: n0, reason: collision with root package name */
    private static final int f2894n0 = 31;

    /* renamed from: o, reason: collision with root package name */
    public static final int f2895o = 0;

    /* renamed from: o0, reason: collision with root package name */
    private static final int f2896o0 = 32;

    /* renamed from: p, reason: collision with root package name */
    public static final int f2897p = 1;

    /* renamed from: p0, reason: collision with root package name */
    private static final int f2898p0 = 33;

    /* renamed from: q, reason: collision with root package name */
    public static final int f2899q = 0;

    /* renamed from: q0, reason: collision with root package name */
    private static final int f2900q0 = 34;

    /* renamed from: r, reason: collision with root package name */
    public static final int f2901r = 4;

    /* renamed from: r0, reason: collision with root package name */
    private static final int f2902r0 = 35;

    /* renamed from: s, reason: collision with root package name */
    public static final int f2903s = 8;

    /* renamed from: s0, reason: collision with root package name */
    private static final int f2904s0 = 36;

    /* renamed from: t, reason: collision with root package name */
    public static final int f2905t = 1;

    /* renamed from: t0, reason: collision with root package name */
    private static final int f2906t0 = 37;

    /* renamed from: u, reason: collision with root package name */
    public static final int f2907u = 2;

    /* renamed from: u0, reason: collision with root package name */
    private static final int f2908u0 = 38;

    /* renamed from: v, reason: collision with root package name */
    public static final int f2909v = 3;

    /* renamed from: v0, reason: collision with root package name */
    private static final int f2910v0 = 39;

    /* renamed from: w, reason: collision with root package name */
    public static final int f2911w = 4;

    /* renamed from: w0, reason: collision with root package name */
    private static final int f2912w0 = 40;

    /* renamed from: x, reason: collision with root package name */
    public static final int f2913x = 5;

    /* renamed from: x0, reason: collision with root package name */
    private static final int f2914x0 = 41;

    /* renamed from: y, reason: collision with root package name */
    public static final int f2915y = 6;

    /* renamed from: y0, reason: collision with root package name */
    private static final int f2916y0 = 42;

    /* renamed from: z, reason: collision with root package name */
    public static final int f2917z = 7;

    /* renamed from: z0, reason: collision with root package name */
    private static final int f2918z0 = 43;

    /* renamed from: a, reason: collision with root package name */
    private boolean f2919a;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, androidx.constraintlayout.widget.a> f2920b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private boolean f2921c = true;

    /* renamed from: d, reason: collision with root package name */
    private HashMap<Integer, a> f2922d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private static final String f2866e = "ConstraintSet";

    /* renamed from: f, reason: collision with root package name */
    private static final String f2869f = "XML parser error must be within a Constraint ";
    private static final int[] G = {0, 4, 8};

    /* compiled from: ConstraintSet.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f2923a;

        /* renamed from: b, reason: collision with root package name */
        public final C0024d f2924b = new C0024d();

        /* renamed from: c, reason: collision with root package name */
        public final c f2925c = new c();

        /* renamed from: d, reason: collision with root package name */
        public final b f2926d = new b();

        /* renamed from: e, reason: collision with root package name */
        public final e f2927e = new e();

        /* renamed from: f, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.a> f2928f = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: private */
        public void j(int i5, ConstraintLayout.LayoutParams layoutParams) {
            this.f2923a = i5;
            b bVar = this.f2926d;
            bVar.f2970h = layoutParams.f2736d;
            bVar.f2972i = layoutParams.f2738e;
            bVar.f2974j = layoutParams.f2740f;
            bVar.f2976k = layoutParams.f2742g;
            bVar.f2977l = layoutParams.f2744h;
            bVar.f2978m = layoutParams.f2746i;
            bVar.f2979n = layoutParams.f2748j;
            bVar.f2980o = layoutParams.f2750k;
            bVar.f2981p = layoutParams.f2752l;
            bVar.f2982q = layoutParams.f2760p;
            bVar.f2983r = layoutParams.f2761q;
            bVar.f2984s = layoutParams.f2762r;
            bVar.f2985t = layoutParams.f2763s;
            bVar.f2986u = layoutParams.f2770z;
            bVar.f2987v = layoutParams.A;
            bVar.f2988w = layoutParams.B;
            bVar.f2989x = layoutParams.f2754m;
            bVar.f2990y = layoutParams.f2756n;
            bVar.f2991z = layoutParams.f2758o;
            bVar.A = layoutParams.Q;
            bVar.B = layoutParams.R;
            bVar.C = layoutParams.S;
            bVar.f2968g = layoutParams.f2734c;
            bVar.f2964e = layoutParams.f2730a;
            bVar.f2966f = layoutParams.f2732b;
            bVar.f2960c = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            bVar.f2962d = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            bVar.D = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            bVar.E = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            bVar.F = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            bVar.G = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            bVar.P = layoutParams.F;
            bVar.Q = layoutParams.E;
            bVar.S = layoutParams.H;
            bVar.R = layoutParams.G;
            bVar.f2971h0 = layoutParams.T;
            bVar.f2973i0 = layoutParams.U;
            bVar.T = layoutParams.I;
            bVar.U = layoutParams.J;
            bVar.V = layoutParams.M;
            bVar.W = layoutParams.N;
            bVar.X = layoutParams.K;
            bVar.Y = layoutParams.L;
            bVar.Z = layoutParams.O;
            bVar.f2957a0 = layoutParams.P;
            bVar.f2969g0 = layoutParams.V;
            bVar.K = layoutParams.f2765u;
            bVar.M = layoutParams.f2767w;
            bVar.J = layoutParams.f2764t;
            bVar.L = layoutParams.f2766v;
            bVar.O = layoutParams.f2768x;
            bVar.N = layoutParams.f2769y;
            bVar.H = layoutParams.getMarginEnd();
            this.f2926d.I = layoutParams.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(int i5, Constraints.LayoutParams layoutParams) {
            j(i5, layoutParams);
            this.f2924b.f3009d = layoutParams.H0;
            e eVar = this.f2927e;
            eVar.f3024b = layoutParams.K0;
            eVar.f3025c = layoutParams.L0;
            eVar.f3026d = layoutParams.M0;
            eVar.f3027e = layoutParams.N0;
            eVar.f3028f = layoutParams.O0;
            eVar.f3029g = layoutParams.P0;
            eVar.f3030h = layoutParams.Q0;
            eVar.f3031i = layoutParams.R0;
            eVar.f3032j = layoutParams.S0;
            eVar.f3033k = layoutParams.T0;
            eVar.f3035m = layoutParams.J0;
            eVar.f3034l = layoutParams.I0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(ConstraintHelper constraintHelper, int i5, Constraints.LayoutParams layoutParams) {
            k(i5, layoutParams);
            if (constraintHelper instanceof Barrier) {
                b bVar = this.f2926d;
                bVar.f2963d0 = 1;
                Barrier barrier = (Barrier) constraintHelper;
                bVar.f2959b0 = barrier.H();
                this.f2926d.f2965e0 = barrier.p();
                this.f2926d.f2961c0 = barrier.G();
            }
        }

        private androidx.constraintlayout.widget.a m(String str, a.b bVar) {
            if (!this.f2928f.containsKey(str)) {
                androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a(str, bVar);
                this.f2928f.put(str, aVar);
                return aVar;
            }
            androidx.constraintlayout.widget.a aVar2 = this.f2928f.get(str);
            if (aVar2.d() == bVar) {
                return aVar2;
            }
            throw new IllegalArgumentException("ConstraintAttribute is already a " + aVar2.d().name());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String str, int i5) {
            m(str, a.b.COLOR_TYPE).j(i5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(String str, float f6) {
            m(str, a.b.FLOAT_TYPE).k(f6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(String str, int i5) {
            m(str, a.b.INT_TYPE).l(i5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(String str, String str2) {
            m(str, a.b.STRING_TYPE).n(str2);
        }

        public void h(ConstraintLayout.LayoutParams layoutParams) {
            b bVar = this.f2926d;
            layoutParams.f2736d = bVar.f2970h;
            layoutParams.f2738e = bVar.f2972i;
            layoutParams.f2740f = bVar.f2974j;
            layoutParams.f2742g = bVar.f2976k;
            layoutParams.f2744h = bVar.f2977l;
            layoutParams.f2746i = bVar.f2978m;
            layoutParams.f2748j = bVar.f2979n;
            layoutParams.f2750k = bVar.f2980o;
            layoutParams.f2752l = bVar.f2981p;
            layoutParams.f2760p = bVar.f2982q;
            layoutParams.f2761q = bVar.f2983r;
            layoutParams.f2762r = bVar.f2984s;
            layoutParams.f2763s = bVar.f2985t;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bVar.D;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bVar.E;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = bVar.F;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bVar.G;
            layoutParams.f2768x = bVar.O;
            layoutParams.f2769y = bVar.N;
            layoutParams.f2765u = bVar.K;
            layoutParams.f2767w = bVar.M;
            layoutParams.f2770z = bVar.f2986u;
            layoutParams.A = bVar.f2987v;
            layoutParams.f2754m = bVar.f2989x;
            layoutParams.f2756n = bVar.f2990y;
            layoutParams.f2758o = bVar.f2991z;
            layoutParams.B = bVar.f2988w;
            layoutParams.Q = bVar.A;
            layoutParams.R = bVar.B;
            layoutParams.F = bVar.P;
            layoutParams.E = bVar.Q;
            layoutParams.H = bVar.S;
            layoutParams.G = bVar.R;
            layoutParams.T = bVar.f2971h0;
            layoutParams.U = bVar.f2973i0;
            layoutParams.I = bVar.T;
            layoutParams.J = bVar.U;
            layoutParams.M = bVar.V;
            layoutParams.N = bVar.W;
            layoutParams.K = bVar.X;
            layoutParams.L = bVar.Y;
            layoutParams.O = bVar.Z;
            layoutParams.P = bVar.f2957a0;
            layoutParams.S = bVar.C;
            layoutParams.f2734c = bVar.f2968g;
            layoutParams.f2730a = bVar.f2964e;
            layoutParams.f2732b = bVar.f2966f;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = bVar.f2960c;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = bVar.f2962d;
            String str = bVar.f2969g0;
            if (str != null) {
                layoutParams.V = str;
            }
            layoutParams.setMarginStart(bVar.I);
            layoutParams.setMarginEnd(this.f2926d.H);
            layoutParams.e();
        }

        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f2926d.a(this.f2926d);
            aVar.f2925c.a(this.f2925c);
            aVar.f2924b.a(this.f2924b);
            aVar.f2927e.a(this.f2927e);
            aVar.f2923a = this.f2923a;
            return aVar;
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class b {
        private static final int A0 = 15;
        private static final int B0 = 16;
        private static final int C0 = 17;
        private static final int D0 = 18;
        private static final int E0 = 19;
        private static final int F0 = 20;
        private static final int G0 = 21;
        private static final int H0 = 22;
        private static final int I0 = 23;
        private static final int J0 = 24;
        private static final int K0 = 25;
        private static final int L0 = 26;
        private static final int M0 = 27;
        private static final int N0 = 28;
        private static final int O0 = 29;
        private static final int P0 = 30;
        private static final int Q0 = 31;
        private static final int R0 = 32;
        private static final int S0 = 33;
        private static final int T0 = 34;
        private static final int U0 = 35;
        private static final int V0 = 36;
        private static final int W0 = 37;
        private static final int X0 = 38;
        private static final int Y0 = 39;
        private static final int Z0 = 40;

        /* renamed from: a1, reason: collision with root package name */
        private static final int f2929a1 = 61;

        /* renamed from: b1, reason: collision with root package name */
        private static final int f2930b1 = 62;

        /* renamed from: c1, reason: collision with root package name */
        private static final int f2931c1 = 63;

        /* renamed from: d1, reason: collision with root package name */
        private static final int f2932d1 = 69;

        /* renamed from: e1, reason: collision with root package name */
        private static final int f2933e1 = 70;

        /* renamed from: f1, reason: collision with root package name */
        private static final int f2934f1 = 71;

        /* renamed from: g1, reason: collision with root package name */
        private static final int f2935g1 = 72;

        /* renamed from: h1, reason: collision with root package name */
        private static final int f2936h1 = 73;

        /* renamed from: i1, reason: collision with root package name */
        private static final int f2937i1 = 74;

        /* renamed from: j1, reason: collision with root package name */
        private static final int f2938j1 = 75;

        /* renamed from: k0, reason: collision with root package name */
        public static final int f2939k0 = -1;

        /* renamed from: k1, reason: collision with root package name */
        private static final int f2940k1 = 76;

        /* renamed from: l0, reason: collision with root package name */
        private static SparseIntArray f2941l0 = null;

        /* renamed from: m0, reason: collision with root package name */
        private static final int f2942m0 = 1;

        /* renamed from: n0, reason: collision with root package name */
        private static final int f2943n0 = 2;

        /* renamed from: o0, reason: collision with root package name */
        private static final int f2944o0 = 3;

        /* renamed from: p0, reason: collision with root package name */
        private static final int f2945p0 = 4;

        /* renamed from: q0, reason: collision with root package name */
        private static final int f2946q0 = 5;

        /* renamed from: r0, reason: collision with root package name */
        private static final int f2947r0 = 6;

        /* renamed from: s0, reason: collision with root package name */
        private static final int f2948s0 = 7;

        /* renamed from: t0, reason: collision with root package name */
        private static final int f2949t0 = 8;

        /* renamed from: u0, reason: collision with root package name */
        private static final int f2950u0 = 9;

        /* renamed from: v0, reason: collision with root package name */
        private static final int f2951v0 = 10;

        /* renamed from: w0, reason: collision with root package name */
        private static final int f2952w0 = 11;

        /* renamed from: x0, reason: collision with root package name */
        private static final int f2953x0 = 12;

        /* renamed from: y0, reason: collision with root package name */
        private static final int f2954y0 = 13;

        /* renamed from: z0, reason: collision with root package name */
        private static final int f2955z0 = 14;

        /* renamed from: c, reason: collision with root package name */
        public int f2960c;

        /* renamed from: d, reason: collision with root package name */
        public int f2962d;

        /* renamed from: e0, reason: collision with root package name */
        public int[] f2965e0;

        /* renamed from: f0, reason: collision with root package name */
        public String f2967f0;

        /* renamed from: g0, reason: collision with root package name */
        public String f2969g0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f2956a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f2958b = false;

        /* renamed from: e, reason: collision with root package name */
        public int f2964e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f2966f = -1;

        /* renamed from: g, reason: collision with root package name */
        public float f2968g = -1.0f;

        /* renamed from: h, reason: collision with root package name */
        public int f2970h = -1;

        /* renamed from: i, reason: collision with root package name */
        public int f2972i = -1;

        /* renamed from: j, reason: collision with root package name */
        public int f2974j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f2976k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f2977l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f2978m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f2979n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f2980o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f2981p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f2982q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f2983r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f2984s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f2985t = -1;

        /* renamed from: u, reason: collision with root package name */
        public float f2986u = 0.5f;

        /* renamed from: v, reason: collision with root package name */
        public float f2987v = 0.5f;

        /* renamed from: w, reason: collision with root package name */
        public String f2988w = null;

        /* renamed from: x, reason: collision with root package name */
        public int f2989x = -1;

        /* renamed from: y, reason: collision with root package name */
        public int f2990y = 0;

        /* renamed from: z, reason: collision with root package name */
        public float f2991z = 0.0f;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = -1;
        public int J = -1;
        public int K = -1;
        public int L = -1;
        public int M = -1;
        public int N = -1;
        public int O = -1;
        public float P = -1.0f;
        public float Q = -1.0f;
        public int R = 0;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public int V = -1;
        public int W = -1;
        public int X = -1;
        public int Y = -1;
        public float Z = 1.0f;

        /* renamed from: a0, reason: collision with root package name */
        public float f2957a0 = 1.0f;

        /* renamed from: b0, reason: collision with root package name */
        public int f2959b0 = -1;

        /* renamed from: c0, reason: collision with root package name */
        public int f2961c0 = 0;

        /* renamed from: d0, reason: collision with root package name */
        public int f2963d0 = -1;

        /* renamed from: h0, reason: collision with root package name */
        public boolean f2971h0 = false;

        /* renamed from: i0, reason: collision with root package name */
        public boolean f2973i0 = false;

        /* renamed from: j0, reason: collision with root package name */
        public boolean f2975j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2941l0 = sparseIntArray;
            sparseIntArray.append(f.m.Dd, 24);
            f2941l0.append(f.m.Ed, 25);
            f2941l0.append(f.m.Gd, 28);
            f2941l0.append(f.m.Hd, 29);
            f2941l0.append(f.m.Md, 35);
            f2941l0.append(f.m.Ld, 34);
            f2941l0.append(f.m.ld, 4);
            f2941l0.append(f.m.kd, 3);
            f2941l0.append(f.m.id, 1);
            f2941l0.append(f.m.Ud, 6);
            f2941l0.append(f.m.Vd, 7);
            f2941l0.append(f.m.sd, 17);
            f2941l0.append(f.m.td, 18);
            f2941l0.append(f.m.ud, 19);
            f2941l0.append(f.m.Qc, 26);
            f2941l0.append(f.m.Id, 31);
            f2941l0.append(f.m.Jd, 32);
            f2941l0.append(f.m.rd, 10);
            f2941l0.append(f.m.qd, 9);
            f2941l0.append(f.m.Yd, 13);
            f2941l0.append(f.m.be, 16);
            f2941l0.append(f.m.Zd, 14);
            f2941l0.append(f.m.Wd, 11);
            f2941l0.append(f.m.ae, 15);
            f2941l0.append(f.m.Xd, 12);
            f2941l0.append(f.m.Pd, 38);
            f2941l0.append(f.m.Bd, 37);
            f2941l0.append(f.m.Ad, 39);
            f2941l0.append(f.m.Od, 40);
            f2941l0.append(f.m.zd, 20);
            f2941l0.append(f.m.Nd, 36);
            f2941l0.append(f.m.pd, 5);
            f2941l0.append(f.m.Cd, 76);
            f2941l0.append(f.m.Kd, 76);
            f2941l0.append(f.m.Fd, 76);
            f2941l0.append(f.m.jd, 76);
            f2941l0.append(f.m.hd, 76);
            f2941l0.append(f.m.Tc, 23);
            f2941l0.append(f.m.Vc, 27);
            f2941l0.append(f.m.Xc, 30);
            f2941l0.append(f.m.Yc, 8);
            f2941l0.append(f.m.Uc, 33);
            f2941l0.append(f.m.Wc, 2);
            f2941l0.append(f.m.Rc, 22);
            f2941l0.append(f.m.Sc, 21);
            f2941l0.append(f.m.md, 61);
            f2941l0.append(f.m.od, 62);
            f2941l0.append(f.m.nd, 63);
            f2941l0.append(f.m.Td, 69);
            f2941l0.append(f.m.yd, 70);
            f2941l0.append(f.m.cd, 71);
            f2941l0.append(f.m.ad, 72);
            f2941l0.append(f.m.bd, 73);
            f2941l0.append(f.m.dd, 74);
            f2941l0.append(f.m.Zc, 75);
        }

        public void a(b bVar) {
            this.f2956a = bVar.f2956a;
            this.f2960c = bVar.f2960c;
            this.f2958b = bVar.f2958b;
            this.f2962d = bVar.f2962d;
            this.f2964e = bVar.f2964e;
            this.f2966f = bVar.f2966f;
            this.f2968g = bVar.f2968g;
            this.f2970h = bVar.f2970h;
            this.f2972i = bVar.f2972i;
            this.f2974j = bVar.f2974j;
            this.f2976k = bVar.f2976k;
            this.f2977l = bVar.f2977l;
            this.f2978m = bVar.f2978m;
            this.f2979n = bVar.f2979n;
            this.f2980o = bVar.f2980o;
            this.f2981p = bVar.f2981p;
            this.f2982q = bVar.f2982q;
            this.f2983r = bVar.f2983r;
            this.f2984s = bVar.f2984s;
            this.f2985t = bVar.f2985t;
            this.f2986u = bVar.f2986u;
            this.f2987v = bVar.f2987v;
            this.f2988w = bVar.f2988w;
            this.f2989x = bVar.f2989x;
            this.f2990y = bVar.f2990y;
            this.f2991z = bVar.f2991z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f2957a0 = bVar.f2957a0;
            this.f2959b0 = bVar.f2959b0;
            this.f2961c0 = bVar.f2961c0;
            this.f2963d0 = bVar.f2963d0;
            this.f2969g0 = bVar.f2969g0;
            int[] iArr = bVar.f2965e0;
            if (iArr != null) {
                this.f2965e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f2965e0 = null;
            }
            this.f2967f0 = bVar.f2967f0;
            this.f2971h0 = bVar.f2971h0;
            this.f2973i0 = bVar.f2973i0;
            this.f2975j0 = bVar.f2975j0;
        }

        public void b(v vVar, StringBuilder sb) {
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
                                Object M = vVar.M(num.intValue());
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(M == null ? num : M);
                                sb.append("\"\n");
                            }
                        } else if (type == Float.TYPE) {
                            Float f6 = (Float) obj;
                            if (f6.floatValue() != -1.0f) {
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(f6);
                                sb.append("\"\n");
                            }
                        }
                    } catch (IllegalAccessException e6) {
                        e6.printStackTrace();
                    }
                }
            }
        }

        void c(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.m.Pc);
            this.f2958b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                int i6 = f2941l0.get(index);
                if (i6 == 80) {
                    this.f2971h0 = obtainStyledAttributes.getBoolean(index, this.f2971h0);
                } else if (i6 != 81) {
                    switch (i6) {
                        case 1:
                            this.f2981p = d.p0(obtainStyledAttributes, index, this.f2981p);
                            break;
                        case 2:
                            this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            break;
                        case 3:
                            this.f2980o = d.p0(obtainStyledAttributes, index, this.f2980o);
                            break;
                        case 4:
                            this.f2979n = d.p0(obtainStyledAttributes, index, this.f2979n);
                            break;
                        case 5:
                            this.f2988w = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.A = obtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                            break;
                        case 7:
                            this.B = obtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                            break;
                        case 8:
                            this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            break;
                        case 9:
                            this.f2985t = d.p0(obtainStyledAttributes, index, this.f2985t);
                            break;
                        case 10:
                            this.f2984s = d.p0(obtainStyledAttributes, index, this.f2984s);
                            break;
                        case 11:
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        case 12:
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        case 13:
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            break;
                        case 14:
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        case 15:
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        case 16:
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        case 17:
                            this.f2964e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2964e);
                            break;
                        case 18:
                            this.f2966f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2966f);
                            break;
                        case 19:
                            this.f2968g = obtainStyledAttributes.getFloat(index, this.f2968g);
                            break;
                        case 20:
                            this.f2986u = obtainStyledAttributes.getFloat(index, this.f2986u);
                            break;
                        case 21:
                            this.f2962d = obtainStyledAttributes.getLayoutDimension(index, this.f2962d);
                            break;
                        case 22:
                            this.f2960c = obtainStyledAttributes.getLayoutDimension(index, this.f2960c);
                            break;
                        case 23:
                            this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            break;
                        case 24:
                            this.f2970h = d.p0(obtainStyledAttributes, index, this.f2970h);
                            break;
                        case 25:
                            this.f2972i = d.p0(obtainStyledAttributes, index, this.f2972i);
                            break;
                        case 26:
                            this.C = obtainStyledAttributes.getInt(index, this.C);
                            break;
                        case 27:
                            this.E = obtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            break;
                        case 28:
                            this.f2974j = d.p0(obtainStyledAttributes, index, this.f2974j);
                            break;
                        case 29:
                            this.f2976k = d.p0(obtainStyledAttributes, index, this.f2976k);
                            break;
                        case 30:
                            this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            break;
                        case 31:
                            this.f2982q = d.p0(obtainStyledAttributes, index, this.f2982q);
                            break;
                        case 32:
                            this.f2983r = d.p0(obtainStyledAttributes, index, this.f2983r);
                            break;
                        case 33:
                            this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            break;
                        case 34:
                            this.f2978m = d.p0(obtainStyledAttributes, index, this.f2978m);
                            break;
                        case 35:
                            this.f2977l = d.p0(obtainStyledAttributes, index, this.f2977l);
                            break;
                        case 36:
                            this.f2987v = obtainStyledAttributes.getFloat(index, this.f2987v);
                            break;
                        case 37:
                            this.Q = obtainStyledAttributes.getFloat(index, this.Q);
                            break;
                        case 38:
                            this.P = obtainStyledAttributes.getFloat(index, this.P);
                            break;
                        case 39:
                            this.R = obtainStyledAttributes.getInt(index, this.R);
                            break;
                        case 40:
                            this.S = obtainStyledAttributes.getInt(index, this.S);
                            break;
                        default:
                            switch (i6) {
                                case 54:
                                    this.T = obtainStyledAttributes.getInt(index, this.T);
                                    break;
                                case 55:
                                    this.U = obtainStyledAttributes.getInt(index, this.U);
                                    break;
                                case 56:
                                    this.V = obtainStyledAttributes.getDimensionPixelSize(index, this.V);
                                    break;
                                case 57:
                                    this.W = obtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                    break;
                                case 58:
                                    this.X = obtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                    break;
                                case 59:
                                    this.Y = obtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                    break;
                                default:
                                    switch (i6) {
                                        case 61:
                                            this.f2989x = d.p0(obtainStyledAttributes, index, this.f2989x);
                                            break;
                                        case 62:
                                            this.f2990y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2990y);
                                            break;
                                        case 63:
                                            this.f2991z = obtainStyledAttributes.getFloat(index, this.f2991z);
                                            break;
                                        default:
                                            switch (i6) {
                                                case 69:
                                                    this.Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f2957a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    break;
                                                case 72:
                                                    this.f2959b0 = obtainStyledAttributes.getInt(index, this.f2959b0);
                                                    break;
                                                case 73:
                                                    this.f2961c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2961c0);
                                                    break;
                                                case 74:
                                                    this.f2967f0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f2975j0 = obtainStyledAttributes.getBoolean(index, this.f2975j0);
                                                    break;
                                                case 76:
                                                    Integer.toHexString(index);
                                                    f2941l0.get(index);
                                                    break;
                                                case 77:
                                                    this.f2969g0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    Integer.toHexString(index);
                                                    f2941l0.get(index);
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f2973i0 = obtainStyledAttributes.getBoolean(index, this.f2973i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class c {

        /* renamed from: h, reason: collision with root package name */
        private static SparseIntArray f2992h = null;

        /* renamed from: i, reason: collision with root package name */
        private static final int f2993i = 1;

        /* renamed from: j, reason: collision with root package name */
        private static final int f2994j = 2;

        /* renamed from: k, reason: collision with root package name */
        private static final int f2995k = 3;

        /* renamed from: l, reason: collision with root package name */
        private static final int f2996l = 4;

        /* renamed from: m, reason: collision with root package name */
        private static final int f2997m = 5;

        /* renamed from: n, reason: collision with root package name */
        private static final int f2998n = 6;

        /* renamed from: a, reason: collision with root package name */
        public boolean f2999a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f3000b = -1;

        /* renamed from: c, reason: collision with root package name */
        public String f3001c = null;

        /* renamed from: d, reason: collision with root package name */
        public int f3002d = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f3003e = 0;

        /* renamed from: f, reason: collision with root package name */
        public float f3004f = Float.NaN;

        /* renamed from: g, reason: collision with root package name */
        public float f3005g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2992h = sparseIntArray;
            sparseIntArray.append(f.m.xf, 1);
            f2992h.append(f.m.zf, 2);
            f2992h.append(f.m.Af, 3);
            f2992h.append(f.m.wf, 4);
            f2992h.append(f.m.vf, 5);
            f2992h.append(f.m.yf, 6);
        }

        public void a(c cVar) {
            this.f2999a = cVar.f2999a;
            this.f3000b = cVar.f3000b;
            this.f3001c = cVar.f3001c;
            this.f3002d = cVar.f3002d;
            this.f3003e = cVar.f3003e;
            this.f3005g = cVar.f3005g;
            this.f3004f = cVar.f3004f;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.m.uf);
            this.f2999a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                switch (f2992h.get(index)) {
                    case 1:
                        this.f3005g = obtainStyledAttributes.getFloat(index, this.f3005g);
                        break;
                    case 2:
                        this.f3002d = obtainStyledAttributes.getInt(index, this.f3002d);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f3001c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f3001c = androidx.constraintlayout.motion.utils.c.f1627k[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f3003e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f3000b = d.p0(obtainStyledAttributes, index, this.f3000b);
                        break;
                    case 6:
                        this.f3004f = obtainStyledAttributes.getFloat(index, this.f3004f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.d$d, reason: collision with other inner class name */
    public static class C0024d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3006a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f3007b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f3008c = 0;

        /* renamed from: d, reason: collision with root package name */
        public float f3009d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f3010e = Float.NaN;

        public void a(C0024d c0024d) {
            this.f3006a = c0024d.f3006a;
            this.f3007b = c0024d.f3007b;
            this.f3009d = c0024d.f3009d;
            this.f3010e = c0024d.f3010e;
            this.f3008c = c0024d.f3008c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.m.og);
            this.f3006a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == f.m.qg) {
                    this.f3009d = obtainStyledAttributes.getFloat(index, this.f3009d);
                } else if (index == f.m.pg) {
                    this.f3007b = obtainStyledAttributes.getInt(index, this.f3007b);
                    this.f3007b = d.G[this.f3007b];
                } else if (index == f.m.tg) {
                    this.f3008c = obtainStyledAttributes.getInt(index, this.f3008c);
                } else if (index == f.m.sg) {
                    this.f3010e = obtainStyledAttributes.getFloat(index, this.f3010e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class e {

        /* renamed from: n, reason: collision with root package name */
        private static SparseIntArray f3011n = null;

        /* renamed from: o, reason: collision with root package name */
        private static final int f3012o = 1;

        /* renamed from: p, reason: collision with root package name */
        private static final int f3013p = 2;

        /* renamed from: q, reason: collision with root package name */
        private static final int f3014q = 3;

        /* renamed from: r, reason: collision with root package name */
        private static final int f3015r = 4;

        /* renamed from: s, reason: collision with root package name */
        private static final int f3016s = 5;

        /* renamed from: t, reason: collision with root package name */
        private static final int f3017t = 6;

        /* renamed from: u, reason: collision with root package name */
        private static final int f3018u = 7;

        /* renamed from: v, reason: collision with root package name */
        private static final int f3019v = 8;

        /* renamed from: w, reason: collision with root package name */
        private static final int f3020w = 9;

        /* renamed from: x, reason: collision with root package name */
        private static final int f3021x = 10;

        /* renamed from: y, reason: collision with root package name */
        private static final int f3022y = 11;

        /* renamed from: a, reason: collision with root package name */
        public boolean f3023a = false;

        /* renamed from: b, reason: collision with root package name */
        public float f3024b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f3025c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f3026d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f3027e = 1.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f3028f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f3029g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public float f3030h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public float f3031i = 0.0f;

        /* renamed from: j, reason: collision with root package name */
        public float f3032j = 0.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f3033k = 0.0f;

        /* renamed from: l, reason: collision with root package name */
        public boolean f3034l = false;

        /* renamed from: m, reason: collision with root package name */
        public float f3035m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3011n = sparseIntArray;
            sparseIntArray.append(f.m.Bi, 1);
            f3011n.append(f.m.Ci, 2);
            f3011n.append(f.m.Di, 3);
            f3011n.append(f.m.zi, 4);
            f3011n.append(f.m.Ai, 5);
            f3011n.append(f.m.vi, 6);
            f3011n.append(f.m.wi, 7);
            f3011n.append(f.m.xi, 8);
            f3011n.append(f.m.yi, 9);
            f3011n.append(f.m.Ei, 10);
            f3011n.append(f.m.Fi, 11);
        }

        public void a(e eVar) {
            this.f3023a = eVar.f3023a;
            this.f3024b = eVar.f3024b;
            this.f3025c = eVar.f3025c;
            this.f3026d = eVar.f3026d;
            this.f3027e = eVar.f3027e;
            this.f3028f = eVar.f3028f;
            this.f3029g = eVar.f3029g;
            this.f3030h = eVar.f3030h;
            this.f3031i = eVar.f3031i;
            this.f3032j = eVar.f3032j;
            this.f3033k = eVar.f3033k;
            this.f3034l = eVar.f3034l;
            this.f3035m = eVar.f3035m;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.m.ui);
            this.f3023a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                switch (f3011n.get(index)) {
                    case 1:
                        this.f3024b = obtainStyledAttributes.getFloat(index, this.f3024b);
                        break;
                    case 2:
                        this.f3025c = obtainStyledAttributes.getFloat(index, this.f3025c);
                        break;
                    case 3:
                        this.f3026d = obtainStyledAttributes.getFloat(index, this.f3026d);
                        break;
                    case 4:
                        this.f3027e = obtainStyledAttributes.getFloat(index, this.f3027e);
                        break;
                    case 5:
                        this.f3028f = obtainStyledAttributes.getFloat(index, this.f3028f);
                        break;
                    case 6:
                        this.f3029g = obtainStyledAttributes.getDimension(index, this.f3029g);
                        break;
                    case 7:
                        this.f3030h = obtainStyledAttributes.getDimension(index, this.f3030h);
                        break;
                    case 8:
                        this.f3031i = obtainStyledAttributes.getDimension(index, this.f3031i);
                        break;
                    case 9:
                        this.f3032j = obtainStyledAttributes.getDimension(index, this.f3032j);
                        break;
                    case 10:
                        this.f3033k = obtainStyledAttributes.getDimension(index, this.f3033k);
                        break;
                    case 11:
                        this.f3034l = true;
                        this.f3035m = obtainStyledAttributes.getDimension(index, this.f3035m);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.append(f.m.p5, 25);
        I.append(f.m.q5, 26);
        I.append(f.m.s5, 29);
        I.append(f.m.t5, 30);
        I.append(f.m.z5, 36);
        I.append(f.m.y5, 35);
        I.append(f.m.X4, 4);
        I.append(f.m.W4, 3);
        I.append(f.m.U4, 1);
        I.append(f.m.H5, 6);
        I.append(f.m.I5, 7);
        I.append(f.m.f3764e5, 17);
        I.append(f.m.f3771f5, 18);
        I.append(f.m.g5, 19);
        I.append(f.m.Q3, 27);
        I.append(f.m.u5, 32);
        I.append(f.m.v5, 33);
        I.append(f.m.f3756d5, 10);
        I.append(f.m.f3749c5, 9);
        I.append(f.m.L5, 13);
        I.append(f.m.O5, 16);
        I.append(f.m.M5, 14);
        I.append(f.m.J5, 11);
        I.append(f.m.N5, 15);
        I.append(f.m.K5, 12);
        I.append(f.m.C5, 40);
        I.append(f.m.n5, 39);
        I.append(f.m.m5, 41);
        I.append(f.m.B5, 42);
        I.append(f.m.l5, 20);
        I.append(f.m.A5, 37);
        I.append(f.m.f3742b5, 5);
        I.append(f.m.o5, 82);
        I.append(f.m.x5, 82);
        I.append(f.m.r5, 82);
        I.append(f.m.V4, 82);
        I.append(f.m.T4, 82);
        I.append(f.m.V3, 24);
        I.append(f.m.X3, 28);
        I.append(f.m.f3819n4, 31);
        I.append(f.m.f3825o4, 8);
        I.append(f.m.W3, 34);
        I.append(f.m.Y3, 2);
        I.append(f.m.T3, 23);
        I.append(f.m.U3, 21);
        I.append(f.m.S3, 22);
        I.append(f.m.f3755d4, 43);
        I.append(f.m.f3837q4, 44);
        I.append(f.m.f3807l4, 45);
        I.append(f.m.f3813m4, 46);
        I.append(f.m.f3801k4, 60);
        I.append(f.m.f3789i4, 47);
        I.append(f.m.f3795j4, 48);
        I.append(f.m.f3763e4, 49);
        I.append(f.m.f3770f4, 50);
        I.append(f.m.f3777g4, 51);
        I.append(f.m.f3783h4, 52);
        I.append(f.m.f3831p4, 53);
        I.append(f.m.D5, 54);
        I.append(f.m.h5, 55);
        I.append(f.m.E5, 56);
        I.append(f.m.i5, 57);
        I.append(f.m.F5, 58);
        I.append(f.m.j5, 59);
        I.append(f.m.Y4, 61);
        I.append(f.m.f3735a5, 62);
        I.append(f.m.Z4, 63);
        I.append(f.m.f3843r4, 64);
        I.append(f.m.T5, 65);
        I.append(f.m.f3885y4, 66);
        I.append(f.m.U5, 67);
        I.append(f.m.Q5, 79);
        I.append(f.m.R3, 38);
        I.append(f.m.P5, 68);
        I.append(f.m.G5, 69);
        I.append(f.m.k5, 70);
        I.append(f.m.f3867v4, 71);
        I.append(f.m.f3855t4, 72);
        I.append(f.m.f3861u4, 73);
        I.append(f.m.f3873w4, 74);
        I.append(f.m.f3849s4, 75);
        I.append(f.m.R5, 76);
        I.append(f.m.w5, 77);
        I.append(f.m.V5, 78);
        I.append(f.m.S4, 80);
        I.append(f.m.R4, 81);
    }

    private int[] S(View view, String str) {
        int i5;
        Object m5;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i6 = 0;
        int i7 = 0;
        while (i6 < split.length) {
            String trim = split[i6].trim();
            try {
                i5 = f.g.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i5 = 0;
            }
            if (i5 == 0) {
                i5 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i5 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (m5 = ((ConstraintLayout) view.getParent()).m(0, trim)) != null && (m5 instanceof Integer)) {
                i5 = ((Integer) m5).intValue();
            }
            iArr[i7] = i5;
            i6++;
            i7++;
        }
        return i7 != split.length ? Arrays.copyOf(iArr, i7) : iArr;
    }

    private void W(int i5, int i6, int i7, int i8, int[] iArr, float[] fArr, int i9, int i10, int i11) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            b0(iArr[0]).f2926d.Q = fArr[0];
        }
        b0(iArr[0]).f2926d.R = i9;
        E(iArr[0], i10, i5, i6, -1);
        for (int i12 = 1; i12 < iArr.length; i12++) {
            int i13 = i12 - 1;
            E(iArr[i12], i10, iArr[i13], i11, -1);
            E(iArr[i13], i11, iArr[i12], i10, -1);
            if (fArr != null) {
                b0(iArr[i12]).f2926d.Q = fArr[i12];
            }
        }
        E(iArr[iArr.length - 1], i11, i7, i8, -1);
    }

    private a a0(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.m.P3);
        u0(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private a b0(int i5) {
        if (!this.f2922d.containsKey(Integer.valueOf(i5))) {
            this.f2922d.put(Integer.valueOf(i5), new a());
        }
        return this.f2922d.get(Integer.valueOf(i5));
    }

    private void c(a.b bVar, String... strArr) {
        for (int i5 = 0; i5 < strArr.length; i5++) {
            if (this.f2920b.containsKey(strArr[i5])) {
                androidx.constraintlayout.widget.a aVar = this.f2920b.get(strArr[i5]);
                if (aVar.d() != bVar) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + aVar.d().name());
                }
            } else {
                this.f2920b.put(strArr[i5], new androidx.constraintlayout.widget.a(strArr[i5], bVar));
            }
        }
    }

    private String n1(int i5) {
        switch (i5) {
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

    private static String[] o1(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        boolean z5 = false;
        for (int i6 = 0; i6 < charArray.length; i6++) {
            char c6 = charArray[i6];
            if (c6 == ',' && !z5) {
                arrayList.add(new String(charArray, i5, i6 - i5));
                i5 = i6 + 1;
            } else if (c6 == '\"') {
                z5 = !z5;
            }
        }
        arrayList.add(new String(charArray, i5, charArray.length - i5));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int p0(TypedArray typedArray, int i5, int i6) {
        int resourceId = typedArray.getResourceId(i5, i6);
        return resourceId == -1 ? typedArray.getInt(i5, -1) : resourceId;
    }

    private void u0(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = typedArray.getIndex(i5);
            if (index != f.m.R3 && f.m.f3819n4 != index && f.m.f3825o4 != index) {
                aVar.f2925c.f2999a = true;
                aVar.f2926d.f2958b = true;
                aVar.f2924b.f3006a = true;
                aVar.f2927e.f3023a = true;
            }
            switch (I.get(index)) {
                case 1:
                    b bVar = aVar.f2926d;
                    bVar.f2981p = p0(typedArray, index, bVar.f2981p);
                    break;
                case 2:
                    b bVar2 = aVar.f2926d;
                    bVar2.G = typedArray.getDimensionPixelSize(index, bVar2.G);
                    break;
                case 3:
                    b bVar3 = aVar.f2926d;
                    bVar3.f2980o = p0(typedArray, index, bVar3.f2980o);
                    break;
                case 4:
                    b bVar4 = aVar.f2926d;
                    bVar4.f2979n = p0(typedArray, index, bVar4.f2979n);
                    break;
                case 5:
                    aVar.f2926d.f2988w = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f2926d;
                    bVar5.A = typedArray.getDimensionPixelOffset(index, bVar5.A);
                    break;
                case 7:
                    b bVar6 = aVar.f2926d;
                    bVar6.B = typedArray.getDimensionPixelOffset(index, bVar6.B);
                    break;
                case 8:
                    b bVar7 = aVar.f2926d;
                    bVar7.H = typedArray.getDimensionPixelSize(index, bVar7.H);
                    break;
                case 9:
                    b bVar8 = aVar.f2926d;
                    bVar8.f2985t = p0(typedArray, index, bVar8.f2985t);
                    break;
                case 10:
                    b bVar9 = aVar.f2926d;
                    bVar9.f2984s = p0(typedArray, index, bVar9.f2984s);
                    break;
                case 11:
                    b bVar10 = aVar.f2926d;
                    bVar10.M = typedArray.getDimensionPixelSize(index, bVar10.M);
                    break;
                case 12:
                    b bVar11 = aVar.f2926d;
                    bVar11.N = typedArray.getDimensionPixelSize(index, bVar11.N);
                    break;
                case 13:
                    b bVar12 = aVar.f2926d;
                    bVar12.J = typedArray.getDimensionPixelSize(index, bVar12.J);
                    break;
                case 14:
                    b bVar13 = aVar.f2926d;
                    bVar13.L = typedArray.getDimensionPixelSize(index, bVar13.L);
                    break;
                case 15:
                    b bVar14 = aVar.f2926d;
                    bVar14.O = typedArray.getDimensionPixelSize(index, bVar14.O);
                    break;
                case 16:
                    b bVar15 = aVar.f2926d;
                    bVar15.K = typedArray.getDimensionPixelSize(index, bVar15.K);
                    break;
                case 17:
                    b bVar16 = aVar.f2926d;
                    bVar16.f2964e = typedArray.getDimensionPixelOffset(index, bVar16.f2964e);
                    break;
                case 18:
                    b bVar17 = aVar.f2926d;
                    bVar17.f2966f = typedArray.getDimensionPixelOffset(index, bVar17.f2966f);
                    break;
                case 19:
                    b bVar18 = aVar.f2926d;
                    bVar18.f2968g = typedArray.getFloat(index, bVar18.f2968g);
                    break;
                case 20:
                    b bVar19 = aVar.f2926d;
                    bVar19.f2986u = typedArray.getFloat(index, bVar19.f2986u);
                    break;
                case 21:
                    b bVar20 = aVar.f2926d;
                    bVar20.f2962d = typedArray.getLayoutDimension(index, bVar20.f2962d);
                    break;
                case 22:
                    C0024d c0024d = aVar.f2924b;
                    c0024d.f3007b = typedArray.getInt(index, c0024d.f3007b);
                    C0024d c0024d2 = aVar.f2924b;
                    c0024d2.f3007b = G[c0024d2.f3007b];
                    break;
                case 23:
                    b bVar21 = aVar.f2926d;
                    bVar21.f2960c = typedArray.getLayoutDimension(index, bVar21.f2960c);
                    break;
                case 24:
                    b bVar22 = aVar.f2926d;
                    bVar22.D = typedArray.getDimensionPixelSize(index, bVar22.D);
                    break;
                case 25:
                    b bVar23 = aVar.f2926d;
                    bVar23.f2970h = p0(typedArray, index, bVar23.f2970h);
                    break;
                case 26:
                    b bVar24 = aVar.f2926d;
                    bVar24.f2972i = p0(typedArray, index, bVar24.f2972i);
                    break;
                case 27:
                    b bVar25 = aVar.f2926d;
                    bVar25.C = typedArray.getInt(index, bVar25.C);
                    break;
                case 28:
                    b bVar26 = aVar.f2926d;
                    bVar26.E = typedArray.getDimensionPixelSize(index, bVar26.E);
                    break;
                case 29:
                    b bVar27 = aVar.f2926d;
                    bVar27.f2974j = p0(typedArray, index, bVar27.f2974j);
                    break;
                case 30:
                    b bVar28 = aVar.f2926d;
                    bVar28.f2976k = p0(typedArray, index, bVar28.f2976k);
                    break;
                case 31:
                    b bVar29 = aVar.f2926d;
                    bVar29.I = typedArray.getDimensionPixelSize(index, bVar29.I);
                    break;
                case 32:
                    b bVar30 = aVar.f2926d;
                    bVar30.f2982q = p0(typedArray, index, bVar30.f2982q);
                    break;
                case 33:
                    b bVar31 = aVar.f2926d;
                    bVar31.f2983r = p0(typedArray, index, bVar31.f2983r);
                    break;
                case 34:
                    b bVar32 = aVar.f2926d;
                    bVar32.F = typedArray.getDimensionPixelSize(index, bVar32.F);
                    break;
                case 35:
                    b bVar33 = aVar.f2926d;
                    bVar33.f2978m = p0(typedArray, index, bVar33.f2978m);
                    break;
                case 36:
                    b bVar34 = aVar.f2926d;
                    bVar34.f2977l = p0(typedArray, index, bVar34.f2977l);
                    break;
                case 37:
                    b bVar35 = aVar.f2926d;
                    bVar35.f2987v = typedArray.getFloat(index, bVar35.f2987v);
                    break;
                case 38:
                    aVar.f2923a = typedArray.getResourceId(index, aVar.f2923a);
                    break;
                case 39:
                    b bVar36 = aVar.f2926d;
                    bVar36.Q = typedArray.getFloat(index, bVar36.Q);
                    break;
                case 40:
                    b bVar37 = aVar.f2926d;
                    bVar37.P = typedArray.getFloat(index, bVar37.P);
                    break;
                case 41:
                    b bVar38 = aVar.f2926d;
                    bVar38.R = typedArray.getInt(index, bVar38.R);
                    break;
                case 42:
                    b bVar39 = aVar.f2926d;
                    bVar39.S = typedArray.getInt(index, bVar39.S);
                    break;
                case 43:
                    C0024d c0024d3 = aVar.f2924b;
                    c0024d3.f3009d = typedArray.getFloat(index, c0024d3.f3009d);
                    break;
                case 44:
                    e eVar = aVar.f2927e;
                    eVar.f3034l = true;
                    eVar.f3035m = typedArray.getDimension(index, eVar.f3035m);
                    break;
                case 45:
                    e eVar2 = aVar.f2927e;
                    eVar2.f3025c = typedArray.getFloat(index, eVar2.f3025c);
                    break;
                case 46:
                    e eVar3 = aVar.f2927e;
                    eVar3.f3026d = typedArray.getFloat(index, eVar3.f3026d);
                    break;
                case 47:
                    e eVar4 = aVar.f2927e;
                    eVar4.f3027e = typedArray.getFloat(index, eVar4.f3027e);
                    break;
                case 48:
                    e eVar5 = aVar.f2927e;
                    eVar5.f3028f = typedArray.getFloat(index, eVar5.f3028f);
                    break;
                case 49:
                    e eVar6 = aVar.f2927e;
                    eVar6.f3029g = typedArray.getDimension(index, eVar6.f3029g);
                    break;
                case 50:
                    e eVar7 = aVar.f2927e;
                    eVar7.f3030h = typedArray.getDimension(index, eVar7.f3030h);
                    break;
                case 51:
                    e eVar8 = aVar.f2927e;
                    eVar8.f3031i = typedArray.getDimension(index, eVar8.f3031i);
                    break;
                case 52:
                    e eVar9 = aVar.f2927e;
                    eVar9.f3032j = typedArray.getDimension(index, eVar9.f3032j);
                    break;
                case 53:
                    e eVar10 = aVar.f2927e;
                    eVar10.f3033k = typedArray.getDimension(index, eVar10.f3033k);
                    break;
                case 54:
                    b bVar40 = aVar.f2926d;
                    bVar40.T = typedArray.getInt(index, bVar40.T);
                    break;
                case 55:
                    b bVar41 = aVar.f2926d;
                    bVar41.U = typedArray.getInt(index, bVar41.U);
                    break;
                case 56:
                    b bVar42 = aVar.f2926d;
                    bVar42.V = typedArray.getDimensionPixelSize(index, bVar42.V);
                    break;
                case 57:
                    b bVar43 = aVar.f2926d;
                    bVar43.W = typedArray.getDimensionPixelSize(index, bVar43.W);
                    break;
                case 58:
                    b bVar44 = aVar.f2926d;
                    bVar44.X = typedArray.getDimensionPixelSize(index, bVar44.X);
                    break;
                case 59:
                    b bVar45 = aVar.f2926d;
                    bVar45.Y = typedArray.getDimensionPixelSize(index, bVar45.Y);
                    break;
                case 60:
                    e eVar11 = aVar.f2927e;
                    eVar11.f3024b = typedArray.getFloat(index, eVar11.f3024b);
                    break;
                case 61:
                    b bVar46 = aVar.f2926d;
                    bVar46.f2989x = p0(typedArray, index, bVar46.f2989x);
                    break;
                case 62:
                    b bVar47 = aVar.f2926d;
                    bVar47.f2990y = typedArray.getDimensionPixelSize(index, bVar47.f2990y);
                    break;
                case 63:
                    b bVar48 = aVar.f2926d;
                    bVar48.f2991z = typedArray.getFloat(index, bVar48.f2991z);
                    break;
                case 64:
                    c cVar = aVar.f2925c;
                    cVar.f3000b = p0(typedArray, index, cVar.f3000b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f2925c.f3001c = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f2925c.f3001c = androidx.constraintlayout.motion.utils.c.f1627k[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f2925c.f3003e = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f2925c;
                    cVar2.f3005g = typedArray.getFloat(index, cVar2.f3005g);
                    break;
                case 68:
                    C0024d c0024d4 = aVar.f2924b;
                    c0024d4.f3010e = typedArray.getFloat(index, c0024d4.f3010e);
                    break;
                case 69:
                    aVar.f2926d.Z = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f2926d.f2957a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    b bVar49 = aVar.f2926d;
                    bVar49.f2959b0 = typedArray.getInt(index, bVar49.f2959b0);
                    break;
                case 73:
                    b bVar50 = aVar.f2926d;
                    bVar50.f2961c0 = typedArray.getDimensionPixelSize(index, bVar50.f2961c0);
                    break;
                case 74:
                    aVar.f2926d.f2967f0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f2926d;
                    bVar51.f2975j0 = typedArray.getBoolean(index, bVar51.f2975j0);
                    break;
                case 76:
                    c cVar3 = aVar.f2925c;
                    cVar3.f3002d = typedArray.getInt(index, cVar3.f3002d);
                    break;
                case 77:
                    aVar.f2926d.f2969g0 = typedArray.getString(index);
                    break;
                case 78:
                    C0024d c0024d5 = aVar.f2924b;
                    c0024d5.f3008c = typedArray.getInt(index, c0024d5.f3008c);
                    break;
                case 79:
                    c cVar4 = aVar.f2925c;
                    cVar4.f3004f = typedArray.getFloat(index, cVar4.f3004f);
                    break;
                case 80:
                    b bVar52 = aVar.f2926d;
                    bVar52.f2971h0 = typedArray.getBoolean(index, bVar52.f2971h0);
                    break;
                case 81:
                    b bVar53 = aVar.f2926d;
                    bVar53.f2973i0 = typedArray.getBoolean(index, bVar53.f2973i0);
                    break;
                case 82:
                    Integer.toHexString(index);
                    I.get(index);
                    break;
                default:
                    Integer.toHexString(index);
                    I.get(index);
                    break;
            }
        }
    }

    public void A(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f2922d.clear();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = constraintLayout.getChildAt(i5);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f2921c && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2922d.containsKey(Integer.valueOf(id))) {
                this.f2922d.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f2922d.get(Integer.valueOf(id));
            aVar.f2928f = androidx.constraintlayout.widget.a.c(this.f2920b, childAt);
            aVar.j(id, layoutParams);
            aVar.f2924b.f3007b = childAt.getVisibility();
            aVar.f2924b.f3009d = childAt.getAlpha();
            aVar.f2927e.f3024b = childAt.getRotation();
            aVar.f2927e.f3025c = childAt.getRotationX();
            aVar.f2927e.f3026d = childAt.getRotationY();
            aVar.f2927e.f3027e = childAt.getScaleX();
            aVar.f2927e.f3028f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != p.f18289o || pivotY != p.f18289o) {
                e eVar = aVar.f2927e;
                eVar.f3029g = pivotX;
                eVar.f3030h = pivotY;
            }
            aVar.f2927e.f3031i = childAt.getTranslationX();
            aVar.f2927e.f3032j = childAt.getTranslationY();
            aVar.f2927e.f3033k = childAt.getTranslationZ();
            e eVar2 = aVar.f2927e;
            if (eVar2.f3034l) {
                eVar2.f3035m = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                aVar.f2926d.f2975j0 = barrier.F();
                aVar.f2926d.f2965e0 = barrier.p();
                aVar.f2926d.f2959b0 = barrier.H();
                aVar.f2926d.f2961c0 = barrier.G();
            }
        }
    }

    public void A0(int i5, float f6) {
        b0(i5).f2924b.f3009d = f6;
    }

    public void B(d dVar) {
        this.f2922d.clear();
        for (Integer num : dVar.f2922d.keySet()) {
            this.f2922d.put(num, dVar.f2922d.get(num).clone());
        }
    }

    public void B0(int i5, boolean z5) {
        b0(i5).f2927e.f3034l = z5;
    }

    public void C(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f2922d.clear();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = constraints.getChildAt(i5);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f2921c && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2922d.containsKey(Integer.valueOf(id))) {
                this.f2922d.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f2922d.get(Integer.valueOf(id));
            if (childAt instanceof ConstraintHelper) {
                aVar.l((ConstraintHelper) childAt, id, layoutParams);
            }
            aVar.k(id, layoutParams);
        }
    }

    public void C0(int i5, int i6) {
        b0(i5).f2926d.f2963d0 = i6;
    }

    public void D(int i5, int i6, int i7, int i8) {
        if (!this.f2922d.containsKey(Integer.valueOf(i5))) {
            this.f2922d.put(Integer.valueOf(i5), new a());
        }
        a aVar = this.f2922d.get(Integer.valueOf(i5));
        switch (i6) {
            case 1:
                if (i8 == 1) {
                    b bVar = aVar.f2926d;
                    bVar.f2970h = i7;
                    bVar.f2972i = -1;
                    return;
                } else {
                    if (i8 != 2) {
                        throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder("left to "), n1(i8), " undefined"));
                    }
                    b bVar2 = aVar.f2926d;
                    bVar2.f2972i = i7;
                    bVar2.f2970h = -1;
                    return;
                }
            case 2:
                if (i8 == 1) {
                    b bVar3 = aVar.f2926d;
                    bVar3.f2974j = i7;
                    bVar3.f2976k = -1;
                    return;
                } else {
                    if (i8 != 2) {
                        throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder("right to "), n1(i8), " undefined"));
                    }
                    b bVar4 = aVar.f2926d;
                    bVar4.f2976k = i7;
                    bVar4.f2974j = -1;
                    return;
                }
            case 3:
                if (i8 == 3) {
                    b bVar5 = aVar.f2926d;
                    bVar5.f2977l = i7;
                    bVar5.f2978m = -1;
                    bVar5.f2981p = -1;
                    return;
                }
                if (i8 != 4) {
                    throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder("right to "), n1(i8), " undefined"));
                }
                b bVar6 = aVar.f2926d;
                bVar6.f2978m = i7;
                bVar6.f2977l = -1;
                bVar6.f2981p = -1;
                return;
            case 4:
                if (i8 == 4) {
                    b bVar7 = aVar.f2926d;
                    bVar7.f2980o = i7;
                    bVar7.f2979n = -1;
                    bVar7.f2981p = -1;
                    return;
                }
                if (i8 != 3) {
                    throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder("right to "), n1(i8), " undefined"));
                }
                b bVar8 = aVar.f2926d;
                bVar8.f2979n = i7;
                bVar8.f2980o = -1;
                bVar8.f2981p = -1;
                return;
            case 5:
                if (i8 != 5) {
                    throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder("right to "), n1(i8), " undefined"));
                }
                b bVar9 = aVar.f2926d;
                bVar9.f2981p = i7;
                bVar9.f2980o = -1;
                bVar9.f2979n = -1;
                bVar9.f2977l = -1;
                bVar9.f2978m = -1;
                return;
            case 6:
                if (i8 == 6) {
                    b bVar10 = aVar.f2926d;
                    bVar10.f2983r = i7;
                    bVar10.f2982q = -1;
                    return;
                } else {
                    if (i8 != 7) {
                        throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder("right to "), n1(i8), " undefined"));
                    }
                    b bVar11 = aVar.f2926d;
                    bVar11.f2982q = i7;
                    bVar11.f2983r = -1;
                    return;
                }
            case 7:
                if (i8 == 7) {
                    b bVar12 = aVar.f2926d;
                    bVar12.f2985t = i7;
                    bVar12.f2984s = -1;
                    return;
                } else {
                    if (i8 != 6) {
                        throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder("right to "), n1(i8), " undefined"));
                    }
                    b bVar13 = aVar.f2926d;
                    bVar13.f2984s = i7;
                    bVar13.f2985t = -1;
                    return;
                }
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(n1(i6));
                sb.append(" to ");
                throw new IllegalArgumentException(androidx.concurrent.futures.a.a(sb, n1(i8), " unknown"));
        }
    }

    public void D0(int i5, String str, int i6) {
        b0(i5).n(str, i6);
    }

    public void E(int i5, int i6, int i7, int i8, int i9) {
        if (!this.f2922d.containsKey(Integer.valueOf(i5))) {
            this.f2922d.put(Integer.valueOf(i5), new a());
        }
        a aVar = this.f2922d.get(Integer.valueOf(i5));
        switch (i6) {
            case 1:
                if (i8 == 1) {
                    b bVar = aVar.f2926d;
                    bVar.f2970h = i7;
                    bVar.f2972i = -1;
                } else {
                    if (i8 != 2) {
                        throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder("Left to "), n1(i8), " undefined"));
                    }
                    b bVar2 = aVar.f2926d;
                    bVar2.f2972i = i7;
                    bVar2.f2970h = -1;
                }
                aVar.f2926d.D = i9;
                return;
            case 2:
                if (i8 == 1) {
                    b bVar3 = aVar.f2926d;
                    bVar3.f2974j = i7;
                    bVar3.f2976k = -1;
                } else {
                    if (i8 != 2) {
                        throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder("right to "), n1(i8), " undefined"));
                    }
                    b bVar4 = aVar.f2926d;
                    bVar4.f2976k = i7;
                    bVar4.f2974j = -1;
                }
                aVar.f2926d.E = i9;
                return;
            case 3:
                if (i8 == 3) {
                    b bVar5 = aVar.f2926d;
                    bVar5.f2977l = i7;
                    bVar5.f2978m = -1;
                    bVar5.f2981p = -1;
                } else {
                    if (i8 != 4) {
                        throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder("right to "), n1(i8), " undefined"));
                    }
                    b bVar6 = aVar.f2926d;
                    bVar6.f2978m = i7;
                    bVar6.f2977l = -1;
                    bVar6.f2981p = -1;
                }
                aVar.f2926d.F = i9;
                return;
            case 4:
                if (i8 == 4) {
                    b bVar7 = aVar.f2926d;
                    bVar7.f2980o = i7;
                    bVar7.f2979n = -1;
                    bVar7.f2981p = -1;
                } else {
                    if (i8 != 3) {
                        throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder("right to "), n1(i8), " undefined"));
                    }
                    b bVar8 = aVar.f2926d;
                    bVar8.f2979n = i7;
                    bVar8.f2980o = -1;
                    bVar8.f2981p = -1;
                }
                aVar.f2926d.G = i9;
                return;
            case 5:
                if (i8 != 5) {
                    throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder("right to "), n1(i8), " undefined"));
                }
                b bVar9 = aVar.f2926d;
                bVar9.f2981p = i7;
                bVar9.f2980o = -1;
                bVar9.f2979n = -1;
                bVar9.f2977l = -1;
                bVar9.f2978m = -1;
                return;
            case 6:
                if (i8 == 6) {
                    b bVar10 = aVar.f2926d;
                    bVar10.f2983r = i7;
                    bVar10.f2982q = -1;
                } else {
                    if (i8 != 7) {
                        throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder("right to "), n1(i8), " undefined"));
                    }
                    b bVar11 = aVar.f2926d;
                    bVar11.f2982q = i7;
                    bVar11.f2983r = -1;
                }
                aVar.f2926d.I = i9;
                return;
            case 7:
                if (i8 == 7) {
                    b bVar12 = aVar.f2926d;
                    bVar12.f2985t = i7;
                    bVar12.f2984s = -1;
                } else {
                    if (i8 != 6) {
                        throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder("right to "), n1(i8), " undefined"));
                    }
                    b bVar13 = aVar.f2926d;
                    bVar13.f2984s = i7;
                    bVar13.f2985t = -1;
                }
                aVar.f2926d.H = i9;
                return;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(n1(i6));
                sb.append(" to ");
                throw new IllegalArgumentException(androidx.concurrent.futures.a.a(sb, n1(i8), " unknown"));
        }
    }

    public void E0(int i5, String str) {
        b0(i5).f2926d.f2988w = str;
    }

    public void F(int i5, int i6, int i7, float f6) {
        b bVar = b0(i5).f2926d;
        bVar.f2989x = i6;
        bVar.f2990y = i7;
        bVar.f2991z = f6;
    }

    public void F0(int i5, int i6) {
        b0(i5).f2926d.A = i6;
    }

    public void G(int i5, int i6) {
        b0(i5).f2926d.U = i6;
    }

    public void G0(int i5, int i6) {
        b0(i5).f2926d.B = i6;
    }

    public void H(int i5, int i6) {
        b0(i5).f2926d.T = i6;
    }

    public void H0(int i5, float f6) {
        b0(i5).f2927e.f3035m = f6;
        b0(i5).f2927e.f3034l = true;
    }

    public void I(int i5, int i6) {
        b0(i5).f2926d.f2962d = i6;
    }

    public void I0(int i5, String str, float f6) {
        b0(i5).o(str, f6);
    }

    public void J(int i5, int i6) {
        b0(i5).f2926d.W = i6;
    }

    public void J0(boolean z5) {
        this.f2921c = z5;
    }

    public void K(int i5, int i6) {
        b0(i5).f2926d.V = i6;
    }

    public void K0(int i5, int i6, int i7) {
        a b02 = b0(i5);
        switch (i6) {
            case 1:
                b02.f2926d.J = i7;
                return;
            case 2:
                b02.f2926d.L = i7;
                return;
            case 3:
                b02.f2926d.K = i7;
                return;
            case 4:
                b02.f2926d.M = i7;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                b02.f2926d.O = i7;
                return;
            case 7:
                b02.f2926d.N = i7;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void L(int i5, int i6) {
        b0(i5).f2926d.Y = i6;
    }

    public void L0(int i5, int i6) {
        b0(i5).f2926d.f2964e = i6;
        b0(i5).f2926d.f2966f = -1;
        b0(i5).f2926d.f2968g = -1.0f;
    }

    public void M(int i5, int i6) {
        b0(i5).f2926d.X = i6;
    }

    public void M0(int i5, int i6) {
        b0(i5).f2926d.f2966f = i6;
        b0(i5).f2926d.f2964e = -1;
        b0(i5).f2926d.f2968g = -1.0f;
    }

    public void N(int i5, float f6) {
        b0(i5).f2926d.f2957a0 = f6;
    }

    public void N0(int i5, float f6) {
        b0(i5).f2926d.f2968g = f6;
        b0(i5).f2926d.f2966f = -1;
        b0(i5).f2926d.f2964e = -1;
    }

    public void O(int i5, float f6) {
        b0(i5).f2926d.Z = f6;
    }

    public void O0(int i5, float f6) {
        b0(i5).f2926d.f2986u = f6;
    }

    public void P(int i5, int i6) {
        b0(i5).f2926d.f2960c = i6;
    }

    public void P0(int i5, int i6) {
        b0(i5).f2926d.R = i6;
    }

    public void Q(int i5, boolean z5) {
        b0(i5).f2926d.f2973i0 = z5;
    }

    public void Q0(int i5, float f6) {
        b0(i5).f2926d.Q = f6;
    }

    public void R(int i5, boolean z5) {
        b0(i5).f2926d.f2971h0 = z5;
    }

    public void R0(int i5, String str, int i6) {
        b0(i5).p(str, i6);
    }

    public void S0(int i5, int i6, int i7) {
        a b02 = b0(i5);
        switch (i6) {
            case 1:
                b02.f2926d.D = i7;
                return;
            case 2:
                b02.f2926d.E = i7;
                return;
            case 3:
                b02.f2926d.F = i7;
                return;
            case 4:
                b02.f2926d.G = i7;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                b02.f2926d.I = i7;
                return;
            case 7:
                b02.f2926d.H = i7;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void T(int i5, int i6) {
        b bVar = b0(i5).f2926d;
        bVar.f2956a = true;
        bVar.C = i6;
    }

    public void T0(int i5, int... iArr) {
        b0(i5).f2926d.f2965e0 = iArr;
    }

    public void U(int i5, int i6, int i7, int... iArr) {
        b bVar = b0(i5).f2926d;
        bVar.f2963d0 = 1;
        bVar.f2959b0 = i6;
        bVar.f2961c0 = i7;
        bVar.f2956a = false;
        bVar.f2965e0 = iArr;
    }

    public void U0(int i5, float f6) {
        b0(i5).f2927e.f3024b = f6;
    }

    public void V(int i5, int i6, int i7, int i8, int[] iArr, float[] fArr, int i9) {
        W(i5, i6, i7, i8, iArr, fArr, i9, 1, 2);
    }

    public void V0(int i5, float f6) {
        b0(i5).f2927e.f3025c = f6;
    }

    public void W0(int i5, float f6) {
        b0(i5).f2927e.f3026d = f6;
    }

    public void X(int i5, int i6, int i7, int i8, int[] iArr, float[] fArr, int i9) {
        W(i5, i6, i7, i8, iArr, fArr, i9, 6, 7);
    }

    public void X0(int i5, float f6) {
        b0(i5).f2927e.f3027e = f6;
    }

    public void Y(int i5, int i6, int i7, int i8, int[] iArr, float[] fArr, int i9) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            b0(iArr[0]).f2926d.P = fArr[0];
        }
        b0(iArr[0]).f2926d.S = i9;
        E(iArr[0], 3, i5, i6, 0);
        for (int i10 = 1; i10 < iArr.length; i10++) {
            int i11 = i10 - 1;
            E(iArr[i10], 3, iArr[i11], 4, 0);
            E(iArr[i11], 4, iArr[i10], 3, 0);
            if (fArr != null) {
                b0(iArr[i10]).f2926d.P = fArr[i10];
            }
        }
        E(iArr[iArr.length - 1], 4, i7, i8, 0);
    }

    public void Y0(int i5, float f6) {
        b0(i5).f2927e.f3028f = f6;
    }

    public void Z(v vVar, int... iArr) {
        HashSet hashSet;
        Set<Integer> keySet = this.f2922d.keySet();
        if (iArr.length != 0) {
            hashSet = new HashSet();
            for (int i5 : iArr) {
                hashSet.add(Integer.valueOf(i5));
            }
        } else {
            hashSet = new HashSet(keySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            a aVar = this.f2922d.get(num);
            sb.append("<Constraint id=");
            sb.append(num);
            sb.append(" \n");
            aVar.f2926d.b(vVar, sb);
            sb.append("/>\n");
        }
        System.out.println(sb.toString());
    }

    public void Z0(int i5, String str, String str2) {
        b0(i5).q(str, str2);
    }

    public void a1(int i5, float f6, float f7) {
        e eVar = b0(i5).f2927e;
        eVar.f3030h = f7;
        eVar.f3029g = f6;
    }

    public void b1(int i5, float f6) {
        b0(i5).f2927e.f3029g = f6;
    }

    public boolean c0(int i5) {
        return b0(i5).f2927e.f3034l;
    }

    public void c1(int i5, float f6) {
        b0(i5).f2927e.f3030h = f6;
    }

    public void d(String... strArr) {
        c(a.b.COLOR_TYPE, strArr);
    }

    public a d0(int i5) {
        if (this.f2922d.containsKey(Integer.valueOf(i5))) {
            return this.f2922d.get(Integer.valueOf(i5));
        }
        return null;
    }

    public void d1(int i5, float f6, float f7) {
        e eVar = b0(i5).f2927e;
        eVar.f3031i = f6;
        eVar.f3032j = f7;
    }

    public void e(String... strArr) {
        c(a.b.FLOAT_TYPE, strArr);
    }

    public HashMap<String, androidx.constraintlayout.widget.a> e0() {
        return this.f2920b;
    }

    public void e1(int i5, float f6) {
        b0(i5).f2927e.f3031i = f6;
    }

    public void f(String... strArr) {
        c(a.b.INT_TYPE, strArr);
    }

    public int f0(int i5) {
        return b0(i5).f2926d.f2962d;
    }

    public void f1(int i5, float f6) {
        b0(i5).f2927e.f3032j = f6;
    }

    public void g(String... strArr) {
        c(a.b.STRING_TYPE, strArr);
    }

    public int[] g0() {
        Integer[] numArr = (Integer[]) this.f2922d.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i5 = 0; i5 < length; i5++) {
            iArr[i5] = numArr[i5].intValue();
        }
        return iArr;
    }

    public void g1(int i5, float f6) {
        b0(i5).f2927e.f3033k = f6;
    }

    public void h(int i5, int i6, int i7) {
        E(i5, 1, i6, i6 == 0 ? 1 : 2, 0);
        E(i5, 2, i7, i7 == 0 ? 2 : 1, 0);
        if (i6 != 0) {
            E(i6, 2, i5, 1, 0);
        }
        if (i7 != 0) {
            E(i7, 1, i5, 2, 0);
        }
    }

    public a h0(int i5) {
        return b0(i5);
    }

    public void h1(boolean z5) {
        this.f2919a = z5;
    }

    public void i(int i5, int i6, int i7) {
        E(i5, 6, i6, i6 == 0 ? 6 : 7, 0);
        E(i5, 7, i7, i7 == 0 ? 7 : 6, 0);
        if (i6 != 0) {
            E(i6, 7, i5, 6, 0);
        }
        if (i7 != 0) {
            E(i7, 6, i5, 7, 0);
        }
    }

    public int[] i0(int i5) {
        int[] iArr = b0(i5).f2926d.f2965e0;
        return iArr == null ? new int[0] : Arrays.copyOf(iArr, iArr.length);
    }

    public void i1(int i5, float f6) {
        b0(i5).f2926d.f2987v = f6;
    }

    public void j(int i5, int i6, int i7) {
        E(i5, 3, i6, i6 == 0 ? 3 : 4, 0);
        E(i5, 4, i7, i7 == 0 ? 4 : 3, 0);
        if (i6 != 0) {
            E(i6, 4, i5, 3, 0);
        }
        if (i7 != 0) {
            E(i7, 3, i5, 4, 0);
        }
    }

    public int j0(int i5) {
        return b0(i5).f2924b.f3007b;
    }

    public void j1(int i5, int i6) {
        b0(i5).f2926d.S = i6;
    }

    public void k(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = constraintLayout.getChildAt(i5);
            int id = childAt.getId();
            if (!this.f2922d.containsKey(Integer.valueOf(id))) {
                androidx.constraintlayout.motion.widget.d.k(childAt);
            } else {
                if (this.f2921c && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.f2922d.containsKey(Integer.valueOf(id))) {
                    androidx.constraintlayout.widget.a.i(childAt, this.f2922d.get(Integer.valueOf(id)).f2928f);
                }
            }
        }
    }

    public int k0(int i5) {
        return b0(i5).f2924b.f3008c;
    }

    public void k1(int i5, float f6) {
        b0(i5).f2926d.P = f6;
    }

    public void l(ConstraintLayout constraintLayout) {
        n(constraintLayout, true);
        constraintLayout.J(null);
        constraintLayout.requestLayout();
    }

    public int l0(int i5) {
        return b0(i5).f2926d.f2960c;
    }

    public void l1(int i5, int i6) {
        b0(i5).f2924b.f3007b = i6;
    }

    public void m(ConstraintHelper constraintHelper, androidx.constraintlayout.solver.widgets.e eVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<androidx.constraintlayout.solver.widgets.e> sparseArray) {
        int id = constraintHelper.getId();
        if (this.f2922d.containsKey(Integer.valueOf(id))) {
            a aVar = this.f2922d.get(Integer.valueOf(id));
            if (eVar instanceof j) {
                constraintHelper.s(aVar, (j) eVar, layoutParams, sparseArray);
            }
        }
    }

    public boolean m0() {
        return this.f2921c;
    }

    public void m1(int i5, int i6) {
        b0(i5).f2924b.f3008c = i6;
    }

    void n(ConstraintLayout constraintLayout, boolean z5) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2922d.keySet());
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = constraintLayout.getChildAt(i5);
            int id = childAt.getId();
            if (!this.f2922d.containsKey(Integer.valueOf(id))) {
                androidx.constraintlayout.motion.widget.d.k(childAt);
            } else {
                if (this.f2921c && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && this.f2922d.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = this.f2922d.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        aVar.f2926d.f2963d0 = 1;
                    }
                    int i6 = aVar.f2926d.f2963d0;
                    if (i6 != -1 && i6 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.L(aVar.f2926d.f2959b0);
                        barrier.K(aVar.f2926d.f2961c0);
                        barrier.I(aVar.f2926d.f2975j0);
                        b bVar = aVar.f2926d;
                        int[] iArr = bVar.f2965e0;
                        if (iArr != null) {
                            barrier.x(iArr);
                        } else {
                            String str = bVar.f2967f0;
                            if (str != null) {
                                bVar.f2965e0 = S(barrier, str);
                                barrier.x(aVar.f2926d.f2965e0);
                            }
                        }
                    }
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                    layoutParams.e();
                    aVar.h(layoutParams);
                    if (z5) {
                        androidx.constraintlayout.widget.a.i(childAt, aVar.f2928f);
                    }
                    childAt.setLayoutParams(layoutParams);
                    C0024d c0024d = aVar.f2924b;
                    if (c0024d.f3008c == 0) {
                        childAt.setVisibility(c0024d.f3007b);
                    }
                    childAt.setAlpha(aVar.f2924b.f3009d);
                    childAt.setRotation(aVar.f2927e.f3024b);
                    childAt.setRotationX(aVar.f2927e.f3025c);
                    childAt.setRotationY(aVar.f2927e.f3026d);
                    childAt.setScaleX(aVar.f2927e.f3027e);
                    childAt.setScaleY(aVar.f2927e.f3028f);
                    if (!Float.isNaN(aVar.f2927e.f3029g)) {
                        childAt.setPivotX(aVar.f2927e.f3029g);
                    }
                    if (!Float.isNaN(aVar.f2927e.f3030h)) {
                        childAt.setPivotY(aVar.f2927e.f3030h);
                    }
                    childAt.setTranslationX(aVar.f2927e.f3031i);
                    childAt.setTranslationY(aVar.f2927e.f3032j);
                    childAt.setTranslationZ(aVar.f2927e.f3033k);
                    e eVar = aVar.f2927e;
                    if (eVar.f3034l) {
                        childAt.setElevation(eVar.f3035m);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.f2922d.get(num);
            int i7 = aVar2.f2926d.f2963d0;
            if (i7 != -1 && i7 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar2 = aVar2.f2926d;
                int[] iArr2 = bVar2.f2965e0;
                if (iArr2 != null) {
                    barrier2.x(iArr2);
                } else {
                    String str2 = bVar2.f2967f0;
                    if (str2 != null) {
                        bVar2.f2965e0 = S(barrier2, str2);
                        barrier2.x(aVar2.f2926d.f2965e0);
                    }
                }
                barrier2.L(aVar2.f2926d.f2959b0);
                barrier2.K(aVar2.f2926d.f2961c0);
                ConstraintLayout.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.E();
                aVar2.h(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (aVar2.f2926d.f2956a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.h(generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, generateDefaultLayoutParams2);
            }
        }
    }

    public void n0(Context context, int i5) {
        XmlResourceParser xml = context.getResources().getXml(i5);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a a02 = a0(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        a02.f2926d.f2956a = true;
                    }
                    this.f2922d.put(Integer.valueOf(a02.f2923a), a02);
                }
            }
        } catch (IOException e6) {
            e6.printStackTrace();
        } catch (XmlPullParserException e7) {
            e7.printStackTrace();
        }
    }

    public void o(int i5, ConstraintLayout.LayoutParams layoutParams) {
        if (this.f2922d.containsKey(Integer.valueOf(i5))) {
            this.f2922d.get(Integer.valueOf(i5)).h(layoutParams);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0178, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o0(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.o0(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public void p(ConstraintLayout constraintLayout) {
        n(constraintLayout, false);
        constraintLayout.J(null);
    }

    public void q(int i5, int i6, int i7, int i8, int i9, int i10, int i11, float f6) {
        if (i8 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (f6 <= 0.0f || f6 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (i7 == 1 || i7 == 2) {
            E(i5, 1, i6, i7, i8);
            E(i5, 2, i9, i10, i11);
            this.f2922d.get(Integer.valueOf(i5)).f2926d.f2986u = f6;
        } else if (i7 == 6 || i7 == 7) {
            E(i5, 6, i6, i7, i8);
            E(i5, 7, i9, i10, i11);
            this.f2922d.get(Integer.valueOf(i5)).f2926d.f2986u = f6;
        } else {
            E(i5, 3, i6, i7, i8);
            E(i5, 4, i9, i10, i11);
            this.f2922d.get(Integer.valueOf(i5)).f2926d.f2987v = f6;
        }
    }

    public void q0(a aVar, String str) {
        String[] split = str.split(",");
        for (int i5 = 0; i5 < split.length; i5++) {
            String[] split2 = split[i5].split("=");
            if (split2.length != 2) {
                String str2 = split[i5];
            } else {
                aVar.n(split2[0], Color.parseColor(split2[1]));
            }
        }
    }

    public void r(int i5, int i6) {
        if (i6 == 0) {
            q(i5, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            q(i5, i6, 2, 0, i6, 1, 0, 0.5f);
        }
    }

    public void r0(a aVar, String str) {
        String[] split = str.split(",");
        for (int i5 = 0; i5 < split.length; i5++) {
            String[] split2 = split[i5].split("=");
            if (split2.length != 2) {
                String str2 = split[i5];
            } else {
                aVar.o(split2[0], Float.parseFloat(split2[1]));
            }
        }
    }

    public void s(int i5, int i6, int i7, int i8, int i9, int i10, int i11, float f6) {
        E(i5, 1, i6, i7, i8);
        E(i5, 2, i9, i10, i11);
        this.f2922d.get(Integer.valueOf(i5)).f2926d.f2986u = f6;
    }

    public void s0(a aVar, String str) {
        String[] split = str.split(",");
        for (int i5 = 0; i5 < split.length; i5++) {
            String[] split2 = split[i5].split("=");
            if (split2.length != 2) {
                String str2 = split[i5];
            } else {
                aVar.o(split2[0], Integer.decode(split2[1]).intValue());
            }
        }
    }

    public void t(int i5, int i6) {
        if (i6 == 0) {
            q(i5, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            q(i5, i6, 7, 0, i6, 6, 0, 0.5f);
        }
    }

    public void t0(a aVar, String str) {
        String[] o12 = o1(str);
        for (int i5 = 0; i5 < o12.length; i5++) {
            String[] split = o12[i5].split("=");
            String str2 = o12[i5];
            aVar.q(split[0], split[1]);
        }
    }

    public void u(int i5, int i6, int i7, int i8, int i9, int i10, int i11, float f6) {
        E(i5, 6, i6, i7, i8);
        E(i5, 7, i9, i10, i11);
        this.f2922d.get(Integer.valueOf(i5)).f2926d.f2986u = f6;
    }

    public void v(int i5, int i6) {
        if (i6 == 0) {
            q(i5, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            q(i5, i6, 4, 0, i6, 3, 0, 0.5f);
        }
    }

    public void v0(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = constraintLayout.getChildAt(i5);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f2921c && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2922d.containsKey(Integer.valueOf(id))) {
                this.f2922d.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f2922d.get(Integer.valueOf(id));
            if (!aVar.f2926d.f2958b) {
                aVar.j(id, layoutParams);
                if (childAt instanceof ConstraintHelper) {
                    aVar.f2926d.f2965e0 = ((ConstraintHelper) childAt).p();
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        aVar.f2926d.f2975j0 = barrier.F();
                        aVar.f2926d.f2959b0 = barrier.H();
                        aVar.f2926d.f2961c0 = barrier.G();
                    }
                }
                aVar.f2926d.f2958b = true;
            }
            C0024d c0024d = aVar.f2924b;
            if (!c0024d.f3006a) {
                c0024d.f3007b = childAt.getVisibility();
                aVar.f2924b.f3009d = childAt.getAlpha();
                aVar.f2924b.f3006a = true;
            }
            e eVar = aVar.f2927e;
            if (!eVar.f3023a) {
                eVar.f3023a = true;
                eVar.f3024b = childAt.getRotation();
                aVar.f2927e.f3025c = childAt.getRotationX();
                aVar.f2927e.f3026d = childAt.getRotationY();
                aVar.f2927e.f3027e = childAt.getScaleX();
                aVar.f2927e.f3028f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != p.f18289o || pivotY != p.f18289o) {
                    e eVar2 = aVar.f2927e;
                    eVar2.f3029g = pivotX;
                    eVar2.f3030h = pivotY;
                }
                aVar.f2927e.f3031i = childAt.getTranslationX();
                aVar.f2927e.f3032j = childAt.getTranslationY();
                aVar.f2927e.f3033k = childAt.getTranslationZ();
                e eVar3 = aVar.f2927e;
                if (eVar3.f3034l) {
                    eVar3.f3035m = childAt.getElevation();
                }
            }
        }
    }

    public void w(int i5, int i6, int i7, int i8, int i9, int i10, int i11, float f6) {
        E(i5, 3, i6, i7, i8);
        E(i5, 4, i9, i10, i11);
        this.f2922d.get(Integer.valueOf(i5)).f2926d.f2987v = f6;
    }

    public void w0(d dVar) {
        for (Integer num : dVar.f2922d.keySet()) {
            int intValue = num.intValue();
            a aVar = dVar.f2922d.get(num);
            if (!this.f2922d.containsKey(Integer.valueOf(intValue))) {
                this.f2922d.put(Integer.valueOf(intValue), new a());
            }
            a aVar2 = this.f2922d.get(Integer.valueOf(intValue));
            b bVar = aVar2.f2926d;
            if (!bVar.f2958b) {
                bVar.a(aVar.f2926d);
            }
            C0024d c0024d = aVar2.f2924b;
            if (!c0024d.f3006a) {
                c0024d.a(aVar.f2924b);
            }
            e eVar = aVar2.f2927e;
            if (!eVar.f3023a) {
                eVar.a(aVar.f2927e);
            }
            c cVar = aVar2.f2925c;
            if (!cVar.f2999a) {
                cVar.a(aVar.f2925c);
            }
            for (String str : aVar.f2928f.keySet()) {
                if (!aVar2.f2928f.containsKey(str)) {
                    aVar2.f2928f.put(str, aVar.f2928f.get(str));
                }
            }
        }
    }

    public void x(int i5) {
        this.f2922d.remove(Integer.valueOf(i5));
    }

    public void x0(String str) {
        this.f2920b.remove(str);
    }

    public void y(int i5, int i6) {
        if (this.f2922d.containsKey(Integer.valueOf(i5))) {
            a aVar = this.f2922d.get(Integer.valueOf(i5));
            switch (i6) {
                case 1:
                    b bVar = aVar.f2926d;
                    bVar.f2972i = -1;
                    bVar.f2970h = -1;
                    bVar.D = -1;
                    bVar.J = -1;
                    return;
                case 2:
                    b bVar2 = aVar.f2926d;
                    bVar2.f2976k = -1;
                    bVar2.f2974j = -1;
                    bVar2.E = -1;
                    bVar2.L = -1;
                    return;
                case 3:
                    b bVar3 = aVar.f2926d;
                    bVar3.f2978m = -1;
                    bVar3.f2977l = -1;
                    bVar3.F = -1;
                    bVar3.K = -1;
                    return;
                case 4:
                    b bVar4 = aVar.f2926d;
                    bVar4.f2979n = -1;
                    bVar4.f2980o = -1;
                    bVar4.G = -1;
                    bVar4.M = -1;
                    return;
                case 5:
                    aVar.f2926d.f2981p = -1;
                    return;
                case 6:
                    b bVar5 = aVar.f2926d;
                    bVar5.f2982q = -1;
                    bVar5.f2983r = -1;
                    bVar5.I = -1;
                    bVar5.O = -1;
                    return;
                case 7:
                    b bVar6 = aVar.f2926d;
                    bVar6.f2984s = -1;
                    bVar6.f2985t = -1;
                    bVar6.H = -1;
                    bVar6.N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void y0(int i5) {
        if (this.f2922d.containsKey(Integer.valueOf(i5))) {
            b bVar = this.f2922d.get(Integer.valueOf(i5)).f2926d;
            int i6 = bVar.f2972i;
            int i7 = bVar.f2974j;
            if (i6 != -1 || i7 != -1) {
                if (i6 != -1 && i7 != -1) {
                    E(i6, 2, i7, 1, 0);
                    E(i7, 1, i6, 2, 0);
                } else if (i6 != -1 || i7 != -1) {
                    int i8 = bVar.f2976k;
                    if (i8 != -1) {
                        E(i6, 2, i8, 2, 0);
                    } else {
                        int i9 = bVar.f2970h;
                        if (i9 != -1) {
                            E(i7, 1, i9, 1, 0);
                        }
                    }
                }
                y(i5, 1);
                y(i5, 2);
                return;
            }
            int i10 = bVar.f2982q;
            int i11 = bVar.f2984s;
            if (i10 != -1 || i11 != -1) {
                if (i10 != -1 && i11 != -1) {
                    E(i10, 7, i11, 6, 0);
                    E(i11, 6, i6, 7, 0);
                } else if (i6 != -1 || i11 != -1) {
                    int i12 = bVar.f2976k;
                    if (i12 != -1) {
                        E(i6, 7, i12, 7, 0);
                    } else {
                        int i13 = bVar.f2970h;
                        if (i13 != -1) {
                            E(i11, 6, i13, 6, 0);
                        }
                    }
                }
            }
            y(i5, 6);
            y(i5, 7);
        }
    }

    public void z(Context context, int i5) {
        A((ConstraintLayout) LayoutInflater.from(context).inflate(i5, (ViewGroup) null));
    }

    public void z0(int i5) {
        if (this.f2922d.containsKey(Integer.valueOf(i5))) {
            b bVar = this.f2922d.get(Integer.valueOf(i5)).f2926d;
            int i6 = bVar.f2978m;
            int i7 = bVar.f2979n;
            if (i6 != -1 || i7 != -1) {
                if (i6 != -1 && i7 != -1) {
                    E(i6, 4, i7, 3, 0);
                    E(i7, 3, i6, 4, 0);
                } else if (i6 != -1 || i7 != -1) {
                    int i8 = bVar.f2980o;
                    if (i8 != -1) {
                        E(i6, 4, i8, 4, 0);
                    } else {
                        int i9 = bVar.f2977l;
                        if (i9 != -1) {
                            E(i7, 3, i9, 3, 0);
                        }
                    }
                }
            }
        }
        y(i5, 3);
        y(i5, 4);
    }
}
