package androidx.constraintlayout.core.motion;

import androidx.compose.material3.j4;
import androidx.constraintlayout.core.motion.key.g;
import androidx.constraintlayout.core.motion.key.h;
import androidx.constraintlayout.core.motion.utils.i;
import androidx.constraintlayout.core.motion.utils.j;
import androidx.constraintlayout.core.motion.utils.n;
import androidx.constraintlayout.core.motion.utils.p;
import androidx.constraintlayout.core.motion.utils.u;
import androidx.constraintlayout.core.motion.utils.w;
import androidx.constraintlayout.core.motion.utils.x;
import androidx.constraintlayout.core.motion.utils.y;
import androidx.constraintlayout.core.motion.utils.z;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: Motion.java */
/* loaded from: classes.dex */
public class c implements w {
    public static final int T = 0;
    public static final int U = 1;
    public static final int V = 2;
    public static final int W = 3;
    public static final int X = 4;
    public static final int Y = 5;
    public static final int Z = 0;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f21962a0 = 1;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f21963b0 = 2;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f21964c0 = 3;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f21965d0 = 4;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f21966e0 = 5;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f21967f0 = 6;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f21968g0 = 1;

    /* renamed from: h0, reason: collision with root package name */
    public static final int f21969h0 = 2;

    /* renamed from: i0, reason: collision with root package name */
    private static final String f21970i0 = "MotionController";

    /* renamed from: j0, reason: collision with root package name */
    private static final boolean f21971j0 = false;

    /* renamed from: k0, reason: collision with root package name */
    private static final boolean f21972k0 = false;

    /* renamed from: l0, reason: collision with root package name */
    static final int f21973l0 = 0;

    /* renamed from: m0, reason: collision with root package name */
    static final int f21974m0 = 1;

    /* renamed from: n0, reason: collision with root package name */
    static final int f21975n0 = 2;

    /* renamed from: o0, reason: collision with root package name */
    static final int f21976o0 = 3;

    /* renamed from: p0, reason: collision with root package name */
    static final int f21977p0 = 4;

    /* renamed from: q0, reason: collision with root package name */
    static final int f21978q0 = 5;

    /* renamed from: r0, reason: collision with root package name */
    private static final int f21979r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    private static final int f21980s0 = -2;

    /* renamed from: t0, reason: collision with root package name */
    private static final int f21981t0 = -3;
    private String[] A;
    private int[] B;
    private HashMap<String, u> H;
    private HashMap<String, p> I;
    private HashMap<String, i> J;
    private h[] K;
    String[] S;

    /* renamed from: i, reason: collision with root package name */
    f f21983i;

    /* renamed from: j, reason: collision with root package name */
    int f21984j;

    /* renamed from: k, reason: collision with root package name */
    String f21985k;

    /* renamed from: q, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.c[] f21991q;

    /* renamed from: r, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.c f21992r;

    /* renamed from: v, reason: collision with root package name */
    float f21996v;

    /* renamed from: w, reason: collision with root package name */
    float f21997w;

    /* renamed from: x, reason: collision with root package name */
    private int[] f21998x;

    /* renamed from: y, reason: collision with root package name */
    private double[] f21999y;

    /* renamed from: z, reason: collision with root package name */
    private double[] f22000z;

    /* renamed from: h, reason: collision with root package name */
    n f21982h = new n();

    /* renamed from: l, reason: collision with root package name */
    private int f21986l = -1;

    /* renamed from: m, reason: collision with root package name */
    private e f21987m = new e();

    /* renamed from: n, reason: collision with root package name */
    private e f21988n = new e();

    /* renamed from: o, reason: collision with root package name */
    private d f21989o = new d();

    /* renamed from: p, reason: collision with root package name */
    private d f21990p = new d();

    /* renamed from: s, reason: collision with root package name */
    float f21993s = Float.NaN;

    /* renamed from: t, reason: collision with root package name */
    float f21994t = 0.0f;

    /* renamed from: u, reason: collision with root package name */
    float f21995u = 1.0f;
    private int C = 4;
    private float[] D = new float[4];
    private ArrayList<e> E = new ArrayList<>();
    private float[] F = new float[1];
    private ArrayList<androidx.constraintlayout.core.motion.key.b> G = new ArrayList<>();
    private int L = -1;
    private int M = -1;
    private f N = null;
    private int O = -1;
    private float P = Float.NaN;
    private androidx.constraintlayout.core.motion.utils.d Q = null;
    private boolean R = false;

    /* compiled from: Motion.java */
    static class a implements androidx.constraintlayout.core.motion.utils.d {

        /* renamed from: a, reason: collision with root package name */
        float f22001a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.core.motion.utils.e f22002b;

        a(androidx.constraintlayout.core.motion.utils.e eVar) {
            this.f22002b = eVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.d
        public float a() {
            return (float) this.f22002b.b(this.f22001a);
        }

        @Override // androidx.constraintlayout.core.motion.utils.d
        public float getInterpolation(float f4) {
            this.f22001a = f4;
            return (float) this.f22002b.a(f4);
        }
    }

    public c(f fVar) {
        c0(fVar);
    }

    private static androidx.constraintlayout.core.motion.utils.d A(int i4, String str, int i5) {
        if (i4 != -1) {
            return null;
        }
        return new a(androidx.constraintlayout.core.motion.utils.e.c(str));
    }

    private float I() {
        char c5;
        float f4;
        float[] fArr = new float[2];
        float f5 = 1.0f / 99;
        double d5 = 0.0d;
        double d6 = 0.0d;
        float f6 = 0.0f;
        int i4 = 0;
        while (i4 < 100) {
            float f7 = i4 * f5;
            double d7 = f7;
            androidx.constraintlayout.core.motion.utils.e eVar = this.f21987m.f22034b;
            Iterator<e> it = this.E.iterator();
            float f10 = Float.NaN;
            float f11 = 0.0f;
            while (it.hasNext()) {
                e next = it.next();
                androidx.constraintlayout.core.motion.utils.e eVar2 = next.f22034b;
                if (eVar2 != null) {
                    float f12 = next.f22036d;
                    if (f12 < f7) {
                        eVar = eVar2;
                        f11 = f12;
                    } else if (Float.isNaN(f10)) {
                        f10 = next.f22036d;
                    }
                }
            }
            if (eVar != null) {
                if (Float.isNaN(f10)) {
                    f10 = 1.0f;
                }
                d7 = (((float) eVar.a((f7 - f11) / r17)) * (f10 - f11)) + f11;
            }
            this.f21991q[0].d(d7, this.f21999y);
            float f13 = f6;
            int i5 = i4;
            this.f21987m.h(d7, this.f21998x, this.f21999y, fArr, 0);
            if (i5 > 0) {
                c5 = 0;
                f4 = (float) (Math.hypot(d6 - fArr[1], d5 - fArr[0]) + f13);
            } else {
                c5 = 0;
                f4 = f13;
            }
            d5 = fArr[c5];
            i4 = i5 + 1;
            f6 = f4;
            d6 = fArr[1];
        }
        return f6;
    }

    private void P(e eVar) {
        Iterator<e> it = this.E.iterator();
        e eVar2 = null;
        while (it.hasNext()) {
            e next = it.next();
            if (eVar.f22037e == next.f22037e) {
                eVar2 = next;
            }
        }
        if (eVar2 != null) {
            this.E.remove(eVar2);
        }
        if (Collections.binarySearch(this.E, eVar) == 0) {
            x.f("MotionController", " KeyPath position \"" + eVar.f22037e + "\" outside of range");
        }
        this.E.add((-r0) - 1, eVar);
    }

    private void T(e eVar) {
        eVar.s(this.f21983i.E(), this.f21983i.F(), this.f21983i.D(), this.f21983i.k());
    }

    private float o(float f4, float[] fArr) {
        float f5 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f6 = this.f21995u;
            if (f6 != 1.0d) {
                float f7 = this.f21994t;
                if (f4 < f7) {
                    f4 = 0.0f;
                }
                if (f4 > f7 && f4 < 1.0d) {
                    f4 = Math.min((f4 - f7) * f6, 1.0f);
                }
            }
        }
        androidx.constraintlayout.core.motion.utils.e eVar = this.f21987m.f22034b;
        Iterator<e> it = this.E.iterator();
        float f10 = Float.NaN;
        while (it.hasNext()) {
            e next = it.next();
            androidx.constraintlayout.core.motion.utils.e eVar2 = next.f22034b;
            if (eVar2 != null) {
                float f11 = next.f22036d;
                if (f11 < f4) {
                    eVar = eVar2;
                    f5 = f11;
                } else if (Float.isNaN(f10)) {
                    f10 = next.f22036d;
                }
            }
        }
        if (eVar != null) {
            float f12 = (Float.isNaN(f10) ? 1.0f : f10) - f5;
            double d5 = (f4 - f5) / f12;
            f4 = (((float) eVar.a(d5)) * f12) + f5;
            if (fArr != null) {
                fArr[0] = (float) eVar.b(d5);
            }
        }
        return f4;
    }

    public e B(int i4) {
        return this.E.get(i4);
    }

    public int C(int i4, int[] iArr) {
        float[] fArr = new float[2];
        Iterator<androidx.constraintlayout.core.motion.key.b> it = this.G.iterator();
        int i5 = 0;
        int i6 = 0;
        while (it.hasNext()) {
            androidx.constraintlayout.core.motion.key.b next = it.next();
            int i7 = next.f22120k;
            if (i7 == i4 || i4 != -1) {
                iArr[i6] = 0;
                iArr[i6 + 1] = i7;
                int i10 = next.f22117h;
                iArr[i6 + 2] = i10;
                double d5 = i10 / 100.0f;
                this.f21991q[0].d(d5, this.f21999y);
                this.f21987m.h(d5, this.f21998x, this.f21999y, fArr, 0);
                iArr[i6 + 3] = Float.floatToIntBits(fArr[0]);
                int i11 = i6 + 4;
                iArr[i11] = Float.floatToIntBits(fArr[1]);
                if (next instanceof androidx.constraintlayout.core.motion.key.f) {
                    androidx.constraintlayout.core.motion.key.f fVar = (androidx.constraintlayout.core.motion.key.f) next;
                    iArr[i6 + 5] = fVar.I;
                    iArr[i6 + 6] = Float.floatToIntBits(fVar.E);
                    i11 = i6 + 7;
                    iArr[i11] = Float.floatToIntBits(fVar.F);
                }
                int i12 = i11 + 1;
                iArr[i6] = i12 - i6;
                i5++;
                i6 = i12;
            }
        }
        return i5;
    }

    float D(int i4, float f4, float f5) {
        e eVar = this.f21988n;
        float f6 = eVar.f22038f;
        e eVar2 = this.f21987m;
        float f7 = eVar2.f22038f;
        float f10 = f6 - f7;
        float f11 = eVar.f22039g;
        float f12 = eVar2.f22039g;
        float f13 = f11 - f12;
        float f14 = (eVar2.f22040h / 2.0f) + f7;
        float f15 = (eVar2.f22041i / 2.0f) + f12;
        float hypot = (float) Math.hypot(f10, f13);
        if (hypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f16 = f4 - f14;
        float f17 = f5 - f15;
        if (((float) Math.hypot(f16, f17)) == 0.0f) {
            return 0.0f;
        }
        float f18 = (f17 * f13) + (f16 * f10);
        if (i4 == 0) {
            return f18 / hypot;
        }
        if (i4 == 1) {
            return (float) Math.sqrt((hypot * hypot) - (f18 * f18));
        }
        if (i4 == 2) {
            return f16 / f10;
        }
        if (i4 == 3) {
            return f17 / f10;
        }
        if (i4 == 4) {
            return f16 / f13;
        }
        if (i4 != 5) {
            return 0.0f;
        }
        return f17 / f13;
    }

    public int E(int[] iArr, float[] fArr) {
        Iterator<androidx.constraintlayout.core.motion.key.b> it = this.G.iterator();
        int i4 = 0;
        int i5 = 0;
        while (it.hasNext()) {
            androidx.constraintlayout.core.motion.key.b next = it.next();
            int i6 = next.f22117h;
            iArr[i4] = (next.f22120k * 1000) + i6;
            double d5 = i6 / 100.0f;
            this.f21991q[0].d(d5, this.f21999y);
            this.f21987m.h(d5, this.f21998x, this.f21999y, fArr, i5);
            i5 += 2;
            i4++;
        }
        return i4;
    }

    double[] F(double d5) {
        this.f21991q[0].d(d5, this.f21999y);
        androidx.constraintlayout.core.motion.utils.c cVar = this.f21992r;
        if (cVar != null) {
            double[] dArr = this.f21999y;
            if (dArr.length > 0) {
                cVar.d(d5, dArr);
            }
        }
        return this.f21999y;
    }

    androidx.constraintlayout.core.motion.key.f G(int i4, int i5, float f4, float f5) {
        androidx.constraintlayout.core.motion.utils.f fVar = new androidx.constraintlayout.core.motion.utils.f();
        e eVar = this.f21987m;
        float f6 = eVar.f22038f;
        fVar.f22212b = f6;
        float f7 = eVar.f22039g;
        fVar.f22214d = f7;
        fVar.f22213c = f6 + eVar.f22040h;
        fVar.f22211a = f7 + eVar.f22041i;
        androidx.constraintlayout.core.motion.utils.f fVar2 = new androidx.constraintlayout.core.motion.utils.f();
        e eVar2 = this.f21988n;
        float f10 = eVar2.f22038f;
        fVar2.f22212b = f10;
        float f11 = eVar2.f22039g;
        fVar2.f22214d = f11;
        fVar2.f22213c = f10 + eVar2.f22040h;
        fVar2.f22211a = f11 + eVar2.f22041i;
        Iterator<androidx.constraintlayout.core.motion.key.b> it = this.G.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.motion.key.b next = it.next();
            if (next instanceof androidx.constraintlayout.core.motion.key.f) {
                androidx.constraintlayout.core.motion.key.f fVar3 = (androidx.constraintlayout.core.motion.key.f) next;
                if (fVar3.B(i4, i5, fVar, fVar2, f4, f5)) {
                    return fVar3;
                }
            }
        }
        return null;
    }

    void H(float f4, int i4, int i5, float f5, float f6, float[] fArr) {
        float o4 = o(f4, this.F);
        HashMap<String, p> hashMap = this.I;
        p pVar = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, p> hashMap2 = this.I;
        p pVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, p> hashMap3 = this.I;
        p pVar3 = hashMap3 == null ? null : hashMap3.get("rotationZ");
        HashMap<String, p> hashMap4 = this.I;
        p pVar4 = hashMap4 == null ? null : hashMap4.get("scaleX");
        HashMap<String, p> hashMap5 = this.I;
        p pVar5 = hashMap5 == null ? null : hashMap5.get("scaleY");
        HashMap<String, i> hashMap6 = this.J;
        i iVar = hashMap6 == null ? null : hashMap6.get("translationX");
        HashMap<String, i> hashMap7 = this.J;
        i iVar2 = hashMap7 == null ? null : hashMap7.get("translationY");
        HashMap<String, i> hashMap8 = this.J;
        i iVar3 = hashMap8 == null ? null : hashMap8.get("rotationZ");
        HashMap<String, i> hashMap9 = this.J;
        i iVar4 = hashMap9 == null ? null : hashMap9.get("scaleX");
        HashMap<String, i> hashMap10 = this.J;
        i iVar5 = hashMap10 != null ? hashMap10.get("scaleY") : null;
        y yVar = new y();
        yVar.b();
        yVar.d(pVar3, o4);
        yVar.h(pVar, pVar2, o4);
        yVar.f(pVar4, pVar5, o4);
        yVar.c(iVar3, o4);
        yVar.g(iVar, iVar2, o4);
        yVar.e(iVar4, iVar5, o4);
        androidx.constraintlayout.core.motion.utils.c cVar = this.f21992r;
        if (cVar != null) {
            double[] dArr = this.f21999y;
            if (dArr.length > 0) {
                double d5 = o4;
                cVar.d(d5, dArr);
                this.f21992r.g(d5, this.f22000z);
                this.f21987m.t(f5, f6, fArr, this.f21998x, this.f22000z, this.f21999y);
            }
            yVar.a(f5, f6, i4, i5, fArr);
            return;
        }
        int i6 = 0;
        if (this.f21991q == null) {
            e eVar = this.f21988n;
            float f7 = eVar.f22038f;
            e eVar2 = this.f21987m;
            float f10 = f7 - eVar2.f22038f;
            i iVar6 = iVar5;
            float f11 = eVar.f22039g - eVar2.f22039g;
            i iVar7 = iVar4;
            float f12 = eVar.f22040h - eVar2.f22040h;
            float f13 = (eVar.f22041i - eVar2.f22041i) + f11;
            fArr[0] = ((f12 + f10) * f5) + ((1.0f - f5) * f10);
            fArr[1] = (f13 * f6) + ((1.0f - f6) * f11);
            yVar.b();
            yVar.d(pVar3, o4);
            yVar.h(pVar, pVar2, o4);
            yVar.f(pVar4, pVar5, o4);
            yVar.c(iVar3, o4);
            yVar.g(iVar, iVar2, o4);
            yVar.e(iVar7, iVar6, o4);
            yVar.a(f5, f6, i4, i5, fArr);
            return;
        }
        double o5 = o(o4, this.F);
        this.f21991q[0].g(o5, this.f22000z);
        this.f21991q[0].d(o5, this.f21999y);
        float f14 = this.F[0];
        while (true) {
            double[] dArr2 = this.f22000z;
            if (i6 >= dArr2.length) {
                this.f21987m.t(f5, f6, fArr, this.f21998x, dArr2, this.f21999y);
                yVar.a(f5, f6, i4, i5, fArr);
                return;
            } else {
                dArr2[i6] = dArr2[i6] * f14;
                i6++;
            }
        }
    }

    public float J() {
        return this.f21987m.f22041i;
    }

    public float K() {
        return this.f21987m.f22040h;
    }

    public float L() {
        return this.f21987m.f22038f;
    }

    public float M() {
        return this.f21987m.f22039g;
    }

    public int N() {
        return this.M;
    }

    public f O() {
        return this.f21983i;
    }

    public boolean Q(f fVar, float f4, long j4, androidx.constraintlayout.core.motion.utils.h hVar) {
        double d5;
        float o4 = o(f4, null);
        int i4 = this.O;
        if (i4 != -1) {
            float f5 = 1.0f / i4;
            float floor = ((float) Math.floor(o4 / f5)) * f5;
            float f6 = (o4 % f5) / f5;
            if (!Float.isNaN(this.P)) {
                f6 = (f6 + this.P) % 1.0f;
            }
            androidx.constraintlayout.core.motion.utils.d dVar = this.Q;
            o4 = ((dVar != null ? dVar.getInterpolation(f6) : ((double) f6) > 0.5d ? 1.0f : 0.0f) * f5) + floor;
        }
        float f7 = o4;
        HashMap<String, p> hashMap = this.I;
        if (hashMap != null) {
            Iterator<p> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().h(fVar, f7);
            }
        }
        androidx.constraintlayout.core.motion.utils.c[] cVarArr = this.f21991q;
        if (cVarArr != null) {
            double d6 = f7;
            cVarArr[0].d(d6, this.f21999y);
            this.f21991q[0].g(d6, this.f22000z);
            androidx.constraintlayout.core.motion.utils.c cVar = this.f21992r;
            if (cVar != null) {
                double[] dArr = this.f21999y;
                if (dArr.length > 0) {
                    cVar.d(d6, dArr);
                    this.f21992r.g(d6, this.f22000z);
                }
            }
            if (this.R) {
                d5 = d6;
            } else {
                d5 = d6;
                this.f21987m.u(f7, fVar, this.f21998x, this.f21999y, this.f22000z, null);
            }
            if (this.M != -1) {
                if (this.N == null) {
                    this.N = fVar.n().f(this.M);
                }
                if (this.N != null) {
                    float h4 = (this.N.h() + r1.w()) / 2.0f;
                    float q4 = (this.N.q() + this.N.l()) / 2.0f;
                    if (fVar.q() - fVar.l() > 0 && fVar.h() - fVar.w() > 0) {
                        fVar.N(q4 - fVar.l());
                        fVar.O(h4 - fVar.w());
                    }
                }
            }
            int i5 = 1;
            while (true) {
                androidx.constraintlayout.core.motion.utils.c[] cVarArr2 = this.f21991q;
                if (i5 >= cVarArr2.length) {
                    break;
                }
                cVarArr2[i5].e(d5, this.D);
                this.f21987m.f22048p.get(this.A[i5 - 1]).w(fVar, this.D);
                i5++;
            }
            d dVar2 = this.f21989o;
            if (dVar2.f22004c == 0) {
                if (f7 <= 0.0f) {
                    fVar.b0(dVar2.f22005d);
                } else if (f7 >= 1.0f) {
                    fVar.b0(this.f21990p.f22005d);
                } else if (this.f21990p.f22005d != dVar2.f22005d) {
                    fVar.b0(4);
                }
            }
            if (this.K != null) {
                int i6 = 0;
                while (true) {
                    h[] hVarArr = this.K;
                    if (i6 >= hVarArr.length) {
                        break;
                    }
                    hVarArr[i6].v(f7, fVar);
                    i6++;
                }
            }
        } else {
            e eVar = this.f21987m;
            float f10 = eVar.f22038f;
            e eVar2 = this.f21988n;
            float a5 = androidx.appcompat.graphics.drawable.d.a(eVar2.f22038f, f10, f7, f10);
            float f11 = eVar.f22039g;
            float a6 = androidx.appcompat.graphics.drawable.d.a(eVar2.f22039g, f11, f7, f11);
            float f12 = eVar.f22040h;
            float a7 = androidx.appcompat.graphics.drawable.d.a(eVar2.f22040h, f12, f7, f12);
            float f13 = eVar.f22041i;
            float f14 = a5 + 0.5f;
            float f15 = a6 + 0.5f;
            fVar.G((int) f14, (int) f15, (int) (f14 + a7), (int) (f15 + androidx.appcompat.graphics.drawable.d.a(eVar2.f22041i, f13, f7, f13)));
        }
        HashMap<String, i> hashMap2 = this.J;
        if (hashMap2 == null) {
            return false;
        }
        for (i iVar : hashMap2.values()) {
            if (iVar instanceof i.f) {
                double[] dArr2 = this.f22000z;
                ((i.f) iVar).l(fVar, f7, dArr2[0], dArr2[1]);
            } else {
                iVar.h(fVar, f7);
            }
        }
        return false;
    }

    String R() {
        return this.f21983i.m();
    }

    void S(f fVar, androidx.constraintlayout.core.motion.key.f fVar2, float f4, float f5, String[] strArr, float[] fArr) {
        androidx.constraintlayout.core.motion.utils.f fVar3 = new androidx.constraintlayout.core.motion.utils.f();
        e eVar = this.f21987m;
        float f6 = eVar.f22038f;
        fVar3.f22212b = f6;
        float f7 = eVar.f22039g;
        fVar3.f22214d = f7;
        fVar3.f22213c = f6 + eVar.f22040h;
        fVar3.f22211a = f7 + eVar.f22041i;
        androidx.constraintlayout.core.motion.utils.f fVar4 = new androidx.constraintlayout.core.motion.utils.f();
        e eVar2 = this.f21988n;
        float f10 = eVar2.f22038f;
        fVar4.f22212b = f10;
        float f11 = eVar2.f22039g;
        fVar4.f22214d = f11;
        fVar4.f22213c = f10 + eVar2.f22040h;
        fVar4.f22211a = f11 + eVar2.f22041i;
        fVar2.C(fVar, fVar3, fVar4, f4, f5, strArr, fArr);
    }

    void U(n nVar, n nVar2, int i4, int i5, int i6) {
        if (i4 == 1) {
            int i7 = nVar.f22304b + nVar.f22305c;
            nVar2.f22304b = ((nVar.f22306d + nVar.f22303a) - nVar.b()) / 2;
            nVar2.f22306d = i6 - ((nVar.a() + i7) / 2);
            nVar2.f22305c = nVar.b() + nVar2.f22304b;
            nVar2.f22303a = nVar.a() + nVar2.f22306d;
            return;
        }
        if (i4 == 2) {
            int i10 = nVar.f22304b + nVar.f22305c;
            nVar2.f22304b = i5 - ((nVar.b() + (nVar.f22306d + nVar.f22303a)) / 2);
            nVar2.f22306d = (i10 - nVar.a()) / 2;
            nVar2.f22305c = nVar.b() + nVar2.f22304b;
            nVar2.f22303a = nVar.a() + nVar2.f22306d;
            return;
        }
        if (i4 == 3) {
            int i11 = nVar.f22304b + nVar.f22305c;
            nVar2.f22304b = ((nVar.a() / 2) + nVar.f22306d) - (i11 / 2);
            nVar2.f22306d = i6 - ((nVar.a() + i11) / 2);
            nVar2.f22305c = nVar.b() + nVar2.f22304b;
            nVar2.f22303a = nVar.a() + nVar2.f22306d;
            return;
        }
        if (i4 != 4) {
            return;
        }
        int i12 = nVar.f22304b + nVar.f22305c;
        nVar2.f22304b = i5 - ((nVar.b() + (nVar.f22303a + nVar.f22306d)) / 2);
        nVar2.f22306d = (i12 - nVar.a()) / 2;
        nVar2.f22305c = nVar.b() + nVar2.f22304b;
        nVar2.f22303a = nVar.a() + nVar2.f22306d;
    }

    void V(f fVar) {
        e eVar = this.f21987m;
        eVar.f22036d = 0.0f;
        eVar.f22037e = 0.0f;
        this.R = true;
        eVar.s(fVar.E(), fVar.F(), fVar.D(), fVar.k());
        this.f21988n.s(fVar.E(), fVar.F(), fVar.D(), fVar.k());
        this.f21989o.l(fVar);
        this.f21990p.l(fVar);
    }

    public void W(int i4) {
        this.f21987m.f22035c = i4;
    }

    public void X(f fVar) {
        e eVar = this.f21988n;
        eVar.f22036d = 1.0f;
        eVar.f22037e = 1.0f;
        T(eVar);
        this.f21988n.s(fVar.l(), fVar.w(), fVar.D(), fVar.k());
        this.f21988n.a(fVar);
        this.f21990p.l(fVar);
    }

    public void Y(int i4) {
        this.L = i4;
    }

    public void Z(f fVar) {
        e eVar = this.f21987m;
        eVar.f22036d = 0.0f;
        eVar.f22037e = 0.0f;
        eVar.s(fVar.E(), fVar.F(), fVar.D(), fVar.k());
        this.f21987m.a(fVar);
        this.f21989o.l(fVar);
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public int a(String str) {
        return 0;
    }

    public void a0(z zVar, f fVar, int i4, int i5, int i6) {
        e eVar = this.f21987m;
        eVar.f22036d = 0.0f;
        eVar.f22037e = 0.0f;
        n nVar = new n();
        if (i4 == 1) {
            int i7 = zVar.f22598b + zVar.f22600d;
            nVar.f22304b = ((zVar.f22599c + zVar.f22601e) - zVar.c()) / 2;
            nVar.f22306d = i5 - ((zVar.b() + i7) / 2);
            nVar.f22305c = zVar.c() + nVar.f22304b;
            nVar.f22303a = zVar.b() + nVar.f22306d;
        } else if (i4 == 2) {
            int i10 = zVar.f22598b + zVar.f22600d;
            nVar.f22304b = i6 - ((zVar.c() + (zVar.f22599c + zVar.f22601e)) / 2);
            nVar.f22306d = (i10 - zVar.b()) / 2;
            nVar.f22305c = zVar.c() + nVar.f22304b;
            nVar.f22303a = zVar.b() + nVar.f22306d;
        }
        this.f21987m.s(nVar.f22304b, nVar.f22306d, nVar.b(), nVar.a());
        this.f21989o.m(nVar, fVar, i4, zVar.f22597a);
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public boolean b(int i4, int i5) {
        if (i4 != 509) {
            return i4 == 704;
        }
        Y(i5);
        return true;
    }

    public void b0(int i4) {
        this.M = i4;
        this.N = null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public boolean c(int i4, float f4) {
        return false;
    }

    public void c0(f fVar) {
        this.f21983i = fVar;
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public boolean d(int i4, boolean z4) {
        return false;
    }

    public void d0(int i4, int i5, float f4, long j4) {
        ArrayList arrayList;
        String[] strArr;
        int i6;
        int i7;
        b bVar;
        p f5;
        b bVar2;
        Integer num;
        p f6;
        b bVar3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int i10 = this.L;
        if (i10 != -1) {
            this.f21987m.f22044l = i10;
        }
        this.f21989o.e(this.f21990p, hashSet2);
        ArrayList<androidx.constraintlayout.core.motion.key.b> arrayList2 = this.G;
        if (arrayList2 != null) {
            Iterator<androidx.constraintlayout.core.motion.key.b> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                androidx.constraintlayout.core.motion.key.b next = it.next();
                if (next instanceof androidx.constraintlayout.core.motion.key.f) {
                    androidx.constraintlayout.core.motion.key.f fVar = (androidx.constraintlayout.core.motion.key.f) next;
                    P(new e(i4, i5, fVar, this.f21987m, this.f21988n));
                    int i11 = fVar.f22131y;
                    if (i11 != -1) {
                        this.f21986l = i11;
                    }
                } else if (next instanceof androidx.constraintlayout.core.motion.key.e) {
                    next.i(hashSet3);
                } else if (next instanceof g) {
                    next.i(hashSet);
                } else if (next instanceof h) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((h) next);
                } else {
                    next.q(hashMap);
                    next.i(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.K = (h[]) arrayList.toArray(new h[0]);
        }
        char c5 = 1;
        if (!hashSet2.isEmpty()) {
            this.I = new HashMap<>();
            Iterator<String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    j.b bVar4 = new j.b();
                    String str = next2.split(",")[c5];
                    Iterator<androidx.constraintlayout.core.motion.key.b> it3 = this.G.iterator();
                    while (it3.hasNext()) {
                        androidx.constraintlayout.core.motion.key.b next3 = it3.next();
                        HashMap<String, b> hashMap2 = next3.f22121l;
                        if (hashMap2 != null && (bVar3 = hashMap2.get(str)) != null) {
                            bVar4.a(next3.f22117h, bVar3);
                        }
                    }
                    f6 = new p.c(next2, bVar4);
                } else {
                    f6 = p.f(next2, j4);
                }
                if (f6 != null) {
                    f6.i(next2);
                    this.I.put(next2, f6);
                }
                c5 = 1;
            }
            ArrayList<androidx.constraintlayout.core.motion.key.b> arrayList3 = this.G;
            if (arrayList3 != null) {
                Iterator<androidx.constraintlayout.core.motion.key.b> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    androidx.constraintlayout.core.motion.key.b next4 = it4.next();
                    if (next4 instanceof androidx.constraintlayout.core.motion.key.d) {
                        next4.f(this.I);
                    }
                }
            }
            this.f21989o.a(this.I, 0);
            this.f21990p.a(this.I, 100);
            for (String str2 : this.I.keySet()) {
                int intValue = (!hashMap.containsKey(str2) || (num = hashMap.get(str2)) == null) ? 0 : num.intValue();
                p pVar = this.I.get(str2);
                if (pVar != null) {
                    pVar.j(intValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.H == null) {
                this.H = new HashMap<>();
            }
            Iterator<String> it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String next5 = it5.next();
                if (!this.H.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        j.b bVar5 = new j.b();
                        String str3 = next5.split(",")[1];
                        Iterator<androidx.constraintlayout.core.motion.key.b> it6 = this.G.iterator();
                        while (it6.hasNext()) {
                            androidx.constraintlayout.core.motion.key.b next6 = it6.next();
                            HashMap<String, b> hashMap3 = next6.f22121l;
                            if (hashMap3 != null && (bVar2 = hashMap3.get(str3)) != null) {
                                bVar5.a(next6.f22117h, bVar2);
                            }
                        }
                        f5 = new p.c(next5, bVar5);
                    } else {
                        f5 = p.f(next5, j4);
                    }
                    if (f5 != null) {
                        f5.i(next5);
                    }
                }
            }
            ArrayList<androidx.constraintlayout.core.motion.key.b> arrayList4 = this.G;
            if (arrayList4 != null) {
                Iterator<androidx.constraintlayout.core.motion.key.b> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    androidx.constraintlayout.core.motion.key.b next7 = it7.next();
                    if (next7 instanceof g) {
                        ((g) next7).v(this.H);
                    }
                }
            }
            for (String str4 : this.H.keySet()) {
                this.H.get(str4).f(hashMap.containsKey(str4) ? hashMap.get(str4).intValue() : 0);
            }
        }
        int size = this.E.size();
        int i12 = size + 2;
        e[] eVarArr = new e[i12];
        eVarArr[0] = this.f21987m;
        eVarArr[size + 1] = this.f21988n;
        if (this.E.size() > 0 && this.f21986l == androidx.constraintlayout.core.motion.key.b.f22105m) {
            this.f21986l = 0;
        }
        Iterator<e> it8 = this.E.iterator();
        int i13 = 1;
        while (it8.hasNext()) {
            eVarArr[i13] = it8.next();
            i13++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.f21988n.f22048p.keySet()) {
            if (this.f21987m.f22048p.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.A = strArr2;
        this.B = new int[strArr2.length];
        int i14 = 0;
        while (true) {
            strArr = this.A;
            if (i14 >= strArr.length) {
                break;
            }
            String str6 = strArr[i14];
            this.B[i14] = 0;
            int i15 = 0;
            while (true) {
                if (i15 >= i12) {
                    break;
                }
                if (eVarArr[i15].f22048p.containsKey(str6) && (bVar = eVarArr[i15].f22048p.get(str6)) != null) {
                    int[] iArr = this.B;
                    iArr[i14] = bVar.r() + iArr[i14];
                    break;
                }
                i15++;
            }
            i14++;
        }
        boolean z4 = eVarArr[0].f22044l != -1;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i16 = 1; i16 < i12; i16++) {
            eVarArr[i16].e(eVarArr[i16 - 1], zArr, this.A, z4);
        }
        int i17 = 0;
        for (int i18 = 1; i18 < length; i18++) {
            if (zArr[i18]) {
                i17++;
            }
        }
        this.f21998x = new int[i17];
        int i19 = 2;
        int max = Math.max(2, i17);
        this.f21999y = new double[max];
        this.f22000z = new double[max];
        int i20 = 0;
        for (int i21 = 1; i21 < length; i21++) {
            if (zArr[i21]) {
                this.f21998x[i20] = i21;
                i20++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i12, this.f21998x.length);
        double[] dArr2 = new double[i12];
        for (int i22 = 0; i22 < i12; i22++) {
            eVarArr[i22].f(dArr[i22], this.f21998x);
            dArr2[i22] = eVarArr[i22].f22036d;
        }
        int i23 = 0;
        while (true) {
            int[] iArr2 = this.f21998x;
            if (i23 >= iArr2.length) {
                break;
            }
            if (iArr2[i23] < e.G.length) {
                String a5 = android.support.v4.media.c.a(new StringBuilder(), e.G[this.f21998x[i23]], " [");
                for (int i24 = 0; i24 < i12; i24++) {
                    StringBuilder a6 = j4.a(a5);
                    a6.append(dArr[i24][i23]);
                    a5 = a6.toString();
                }
            }
            i23++;
        }
        this.f21991q = new androidx.constraintlayout.core.motion.utils.c[this.A.length + 1];
        int i25 = 0;
        while (true) {
            String[] strArr3 = this.A;
            if (i25 >= strArr3.length) {
                break;
            }
            String str7 = strArr3[i25];
            int i26 = 0;
            int i27 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i26 < i12) {
                if (eVarArr[i26].n(str7)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i12];
                        int[] iArr3 = new int[i19];
                        iArr3[1] = eVarArr[i26].l(str7);
                        i7 = 0;
                        iArr3[0] = i12;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iArr3);
                    } else {
                        i7 = 0;
                    }
                    e eVar = eVarArr[i26];
                    i6 = i12;
                    dArr3[i27] = eVar.f22036d;
                    eVar.k(str7, dArr4[i27], i7);
                    i27++;
                } else {
                    i6 = i12;
                }
                i26++;
                i12 = i6;
                i19 = 2;
            }
            i25++;
            this.f21991q[i25] = androidx.constraintlayout.core.motion.utils.c.a(this.f21986l, Arrays.copyOf(dArr3, i27), (double[][]) Arrays.copyOf(dArr4, i27));
            i12 = i12;
            i19 = 2;
        }
        int i28 = i12;
        this.f21991q[0] = androidx.constraintlayout.core.motion.utils.c.a(this.f21986l, dArr2, dArr);
        if (eVarArr[0].f22044l != -1) {
            int[] iArr4 = new int[i28];
            double[] dArr5 = new double[i28];
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i28, 2);
            for (int i29 = 0; i29 < i28; i29++) {
                iArr4[i29] = eVarArr[i29].f22044l;
                dArr5[i29] = r7.f22036d;
                double[] dArr7 = dArr6[i29];
                dArr7[0] = r7.f22038f;
                dArr7[1] = r7.f22039g;
            }
            this.f21992r = new androidx.constraintlayout.core.motion.utils.b(iArr4, dArr5, dArr6);
        }
        this.J = new HashMap<>();
        if (this.G != null) {
            Iterator<String> it9 = hashSet3.iterator();
            float f7 = Float.NaN;
            while (it9.hasNext()) {
                String next8 = it9.next();
                i d5 = i.d(next8);
                if (d5 != null) {
                    if (d5.k() && Float.isNaN(f7)) {
                        f7 = I();
                    }
                    d5.i(next8);
                    this.J.put(next8, d5);
                }
            }
            Iterator<androidx.constraintlayout.core.motion.key.b> it10 = this.G.iterator();
            while (it10.hasNext()) {
                androidx.constraintlayout.core.motion.key.b next9 = it10.next();
                if (next9 instanceof androidx.constraintlayout.core.motion.key.e) {
                    ((androidx.constraintlayout.core.motion.key.e) next9).v(this.J);
                }
            }
            Iterator<i> it11 = this.J.values().iterator();
            while (it11.hasNext()) {
                it11.next().j(f7);
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public boolean e(int i4, String str) {
        if (705 == i4) {
            System.out.println("TYPE_INTERPOLATOR  " + str);
            this.Q = A(-1, str, 0);
        }
        return false;
    }

    public void e0(c cVar) {
        this.f21987m.v(cVar, cVar.f21987m);
        this.f21988n.v(cVar, cVar.f21988n);
    }

    public void f(androidx.constraintlayout.core.motion.key.b bVar) {
        this.G.add(bVar);
    }

    void g(ArrayList<androidx.constraintlayout.core.motion.key.b> arrayList) {
        this.G.addAll(arrayList);
    }

    void h(float[] fArr, int i4) {
        float f4 = 1.0f / (i4 - 1);
        HashMap<String, p> hashMap = this.I;
        if (hashMap != null) {
            hashMap.get("translationX");
        }
        HashMap<String, p> hashMap2 = this.I;
        if (hashMap2 != null) {
            hashMap2.get("translationY");
        }
        HashMap<String, i> hashMap3 = this.J;
        if (hashMap3 != null) {
            hashMap3.get("translationX");
        }
        HashMap<String, i> hashMap4 = this.J;
        if (hashMap4 != null) {
            hashMap4.get("translationY");
        }
        for (int i5 = 0; i5 < i4; i5++) {
            float f5 = i5 * f4;
            float f6 = this.f21995u;
            float f7 = 0.0f;
            if (f6 != 1.0f) {
                float f10 = this.f21994t;
                if (f5 < f10) {
                    f5 = 0.0f;
                }
                if (f5 > f10 && f5 < 1.0d) {
                    f5 = Math.min((f5 - f10) * f6, 1.0f);
                }
            }
            double d5 = f5;
            androidx.constraintlayout.core.motion.utils.e eVar = this.f21987m.f22034b;
            Iterator<e> it = this.E.iterator();
            float f11 = Float.NaN;
            while (it.hasNext()) {
                e next = it.next();
                androidx.constraintlayout.core.motion.utils.e eVar2 = next.f22034b;
                if (eVar2 != null) {
                    float f12 = next.f22036d;
                    if (f12 < f5) {
                        eVar = eVar2;
                        f7 = f12;
                    } else if (Float.isNaN(f11)) {
                        f11 = next.f22036d;
                    }
                }
            }
            if (eVar != null) {
                if (Float.isNaN(f11)) {
                    f11 = 1.0f;
                }
                d5 = (((float) eVar.a((f5 - f7) / r12)) * (f11 - f7)) + f7;
            }
            this.f21991q[0].d(d5, this.f21999y);
            androidx.constraintlayout.core.motion.utils.c cVar = this.f21992r;
            if (cVar != null) {
                double[] dArr = this.f21999y;
                if (dArr.length > 0) {
                    cVar.d(d5, dArr);
                }
            }
            this.f21987m.g(this.f21998x, this.f21999y, fArr, i5 * 2);
        }
    }

    int i(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] h4 = this.f21991q[0].h();
        if (iArr != null) {
            Iterator<e> it = this.E.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                iArr[i4] = it.next().f22049q;
                i4++;
            }
        }
        int i5 = 0;
        for (double d5 : h4) {
            this.f21991q[0].d(d5, this.f21999y);
            this.f21987m.g(this.f21998x, this.f21999y, fArr, i5);
            i5 += 2;
        }
        return i5 / 2;
    }

    public int j(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] h4 = this.f21991q[0].h();
        if (iArr != null) {
            Iterator<e> it = this.E.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                iArr[i4] = it.next().f22049q;
                i4++;
            }
        }
        if (iArr2 != null) {
            Iterator<e> it2 = this.E.iterator();
            int i5 = 0;
            while (it2.hasNext()) {
                iArr2[i5] = (int) (it2.next().f22037e * 100.0f);
                i5++;
            }
        }
        int i6 = 0;
        for (int i7 = 0; i7 < h4.length; i7++) {
            this.f21991q[0].d(h4[i7], this.f21999y);
            this.f21987m.h(h4[i7], this.f21998x, this.f21999y, fArr, i6);
            i6 += 2;
        }
        return i6 / 2;
    }

    public void k(float[] fArr, int i4) {
        double d5;
        float f4 = 1.0f;
        float f5 = 1.0f / (i4 - 1);
        HashMap<String, p> hashMap = this.I;
        p pVar = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, p> hashMap2 = this.I;
        p pVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, i> hashMap3 = this.J;
        i iVar = hashMap3 == null ? null : hashMap3.get("translationX");
        HashMap<String, i> hashMap4 = this.J;
        i iVar2 = hashMap4 != null ? hashMap4.get("translationY") : null;
        int i5 = 0;
        while (i5 < i4) {
            float f6 = i5 * f5;
            float f7 = this.f21995u;
            float f10 = 0.0f;
            if (f7 != f4) {
                float f11 = this.f21994t;
                if (f6 < f11) {
                    f6 = 0.0f;
                }
                if (f6 > f11 && f6 < 1.0d) {
                    f6 = Math.min((f6 - f11) * f7, f4);
                }
            }
            float f12 = f6;
            double d6 = f12;
            androidx.constraintlayout.core.motion.utils.e eVar = this.f21987m.f22034b;
            Iterator<e> it = this.E.iterator();
            float f13 = Float.NaN;
            while (it.hasNext()) {
                e next = it.next();
                androidx.constraintlayout.core.motion.utils.e eVar2 = next.f22034b;
                double d7 = d6;
                if (eVar2 != null) {
                    float f14 = next.f22036d;
                    if (f14 < f12) {
                        f10 = f14;
                        eVar = eVar2;
                    } else if (Float.isNaN(f13)) {
                        f13 = next.f22036d;
                    }
                }
                d6 = d7;
            }
            double d10 = d6;
            if (eVar != null) {
                if (Float.isNaN(f13)) {
                    f13 = 1.0f;
                }
                d5 = (((float) eVar.a((f12 - f10) / r16)) * (f13 - f10)) + f10;
            } else {
                d5 = d10;
            }
            this.f21991q[0].d(d5, this.f21999y);
            androidx.constraintlayout.core.motion.utils.c cVar = this.f21992r;
            if (cVar != null) {
                double[] dArr = this.f21999y;
                if (dArr.length > 0) {
                    cVar.d(d5, dArr);
                }
            }
            int i6 = i5 * 2;
            int i7 = i5;
            this.f21987m.h(d5, this.f21998x, this.f21999y, fArr, i6);
            if (iVar != null) {
                fArr[i6] = iVar.a(f12) + fArr[i6];
            } else if (pVar != null) {
                fArr[i6] = pVar.a(f12) + fArr[i6];
            }
            if (iVar2 != null) {
                int i10 = i6 + 1;
                fArr[i10] = iVar2.a(f12) + fArr[i10];
            } else if (pVar2 != null) {
                int i11 = i6 + 1;
                fArr[i11] = pVar2.a(f12) + fArr[i11];
            }
            i5 = i7 + 1;
            f4 = 1.0f;
        }
    }

    public void l(float f4, float[] fArr, int i4) {
        this.f21991q[0].d(o(f4, null), this.f21999y);
        this.f21987m.m(this.f21998x, this.f21999y, fArr, i4);
    }

    void m(float[] fArr, int i4) {
        float f4 = 1.0f / (i4 - 1);
        for (int i5 = 0; i5 < i4; i5++) {
            this.f21991q[0].d(o(i5 * f4, null), this.f21999y);
            this.f21987m.m(this.f21998x, this.f21999y, fArr, i5 * 8);
        }
    }

    void n(boolean z4) {
    }

    public int p() {
        return this.f21987m.f22045m;
    }

    int q(String str, float[] fArr, int i4) {
        p pVar = this.I.get(str);
        if (pVar == null) {
            return -1;
        }
        for (int i5 = 0; i5 < fArr.length; i5++) {
            fArr[i5] = pVar.a(i5 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public void r(double d5, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f21991q[0].d(d5, dArr);
        this.f21991q[0].g(d5, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f21987m.i(d5, this.f21998x, dArr, fArr, dArr2, fArr2);
    }

    public float s() {
        return this.f21996v;
    }

    public float t() {
        return this.f21997w;
    }

    public String toString() {
        return " start: x: " + this.f21987m.f22038f + " y: " + this.f21987m.f22039g + " end: x: " + this.f21988n.f22038f + " y: " + this.f21988n.f22039g;
    }

    void u(float f4, float f5, float f6, float[] fArr) {
        double[] dArr;
        float o4 = o(f4, this.F);
        androidx.constraintlayout.core.motion.utils.c[] cVarArr = this.f21991q;
        int i4 = 0;
        if (cVarArr == null) {
            e eVar = this.f21988n;
            float f7 = eVar.f22038f;
            e eVar2 = this.f21987m;
            float f10 = f7 - eVar2.f22038f;
            float f11 = eVar.f22039g - eVar2.f22039g;
            float f12 = eVar.f22040h - eVar2.f22040h;
            float f13 = (eVar.f22041i - eVar2.f22041i) + f11;
            fArr[0] = ((f12 + f10) * f5) + ((1.0f - f5) * f10);
            fArr[1] = (f13 * f6) + ((1.0f - f6) * f11);
            return;
        }
        double d5 = o4;
        cVarArr[0].g(d5, this.f22000z);
        this.f21991q[0].d(d5, this.f21999y);
        float f14 = this.F[0];
        while (true) {
            dArr = this.f22000z;
            if (i4 >= dArr.length) {
                break;
            }
            dArr[i4] = dArr[i4] * f14;
            i4++;
        }
        androidx.constraintlayout.core.motion.utils.c cVar = this.f21992r;
        if (cVar == null) {
            this.f21987m.t(f5, f6, fArr, this.f21998x, dArr, this.f21999y);
            return;
        }
        double[] dArr2 = this.f21999y;
        if (dArr2.length > 0) {
            cVar.d(d5, dArr2);
            this.f21992r.g(d5, this.f22000z);
            this.f21987m.t(f5, f6, fArr, this.f21998x, this.f22000z, this.f21999y);
        }
    }

    public int v() {
        int i4 = this.f21987m.f22035c;
        Iterator<e> it = this.E.iterator();
        while (it.hasNext()) {
            i4 = Math.max(i4, it.next().f22035c);
        }
        return Math.max(i4, this.f21988n.f22035c);
    }

    public float w() {
        return this.f21988n.f22041i;
    }

    public float x() {
        return this.f21988n.f22040h;
    }

    public float y() {
        return this.f21988n.f22038f;
    }

    public float z() {
        return this.f21988n.f22039g;
    }
}
