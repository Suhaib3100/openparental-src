package com.github.mikephil.charting.components;

import android.graphics.DashPathEffect;
import com.github.mikephil.charting.formatter.l;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AxisBase.java */
/* loaded from: classes5.dex */
public abstract class a extends b {

    /* renamed from: g, reason: collision with root package name */
    protected l f50269g;

    /* renamed from: n, reason: collision with root package name */
    public int f50276n;

    /* renamed from: o, reason: collision with root package name */
    public int f50277o;

    /* renamed from: z, reason: collision with root package name */
    protected List<g> f50288z;

    /* renamed from: h, reason: collision with root package name */
    private int f50270h = -7829368;

    /* renamed from: i, reason: collision with root package name */
    private float f50271i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    private int f50272j = -7829368;

    /* renamed from: k, reason: collision with root package name */
    private float f50273k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    public float[] f50274l = new float[0];

    /* renamed from: m, reason: collision with root package name */
    public float[] f50275m = new float[0];

    /* renamed from: p, reason: collision with root package name */
    private int f50278p = 6;

    /* renamed from: q, reason: collision with root package name */
    protected float f50279q = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f50280r = false;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f50281s = false;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f50282t = true;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f50283u = true;

    /* renamed from: v, reason: collision with root package name */
    protected boolean f50284v = true;

    /* renamed from: w, reason: collision with root package name */
    protected boolean f50285w = false;

    /* renamed from: x, reason: collision with root package name */
    private DashPathEffect f50286x = null;

    /* renamed from: y, reason: collision with root package name */
    private DashPathEffect f50287y = null;
    protected boolean A = false;
    protected boolean B = true;
    protected float C = 0.0f;
    protected float D = 0.0f;
    protected boolean E = false;
    protected boolean F = false;
    public float G = 0.0f;
    public float H = 0.0f;
    public float I = 0.0f;

    public a() {
        this.f50293e = com.github.mikephil.charting.utils.k.e(10.0f);
        this.f50290b = com.github.mikephil.charting.utils.k.e(5.0f);
        this.f50291c = com.github.mikephil.charting.utils.k.e(5.0f);
        this.f50288z = new ArrayList();
    }

    public DashPathEffect A() {
        return this.f50287y;
    }

    public float B() {
        return this.f50271i;
    }

    public int C() {
        return this.f50278p;
    }

    public List<g> D() {
        return this.f50288z;
    }

    public String E() {
        String str = "";
        for (int i4 = 0; i4 < this.f50274l.length; i4++) {
            String x4 = x(i4);
            if (x4 != null && str.length() < x4.length()) {
                str = x4;
            }
        }
        return str;
    }

    public float F() {
        return this.D;
    }

    public float G() {
        return this.C;
    }

    public l H() {
        l lVar = this.f50269g;
        if (lVar == null || ((lVar instanceof com.github.mikephil.charting.formatter.b) && ((com.github.mikephil.charting.formatter.b) lVar).l() != this.f50277o)) {
            this.f50269g = new com.github.mikephil.charting.formatter.b(this.f50277o);
        }
        return this.f50269g;
    }

    public boolean I() {
        return this.f50286x != null;
    }

    public boolean J() {
        return this.F;
    }

    public boolean K() {
        return this.E;
    }

    public boolean L() {
        return this.f50285w && this.f50276n > 0;
    }

    public boolean M() {
        return this.f50283u;
    }

    public boolean N() {
        return this.B;
    }

    public boolean O() {
        return this.f50282t;
    }

    public boolean P() {
        return this.f50284v;
    }

    public boolean Q() {
        return this.A;
    }

    public boolean R() {
        return this.f50281s;
    }

    public boolean S() {
        return this.f50280r;
    }

    public boolean T() {
        return this.f50287y != null;
    }

    public void U() {
        this.f50288z.clear();
    }

    public void V(g gVar) {
        this.f50288z.remove(gVar);
    }

    public void W() {
        this.F = false;
    }

    public void X() {
        this.E = false;
    }

    public void Y(int i4) {
        this.f50272j = i4;
    }

    public void Z(DashPathEffect dashPathEffect) {
        this.f50286x = dashPathEffect;
    }

    public void a0(float f4) {
        this.f50273k = com.github.mikephil.charting.utils.k.e(f4);
    }

    @Deprecated
    public void b0(float f4) {
        c0(f4);
    }

    public void c0(float f4) {
        this.F = true;
        this.G = f4;
        this.I = Math.abs(f4 - this.H);
    }

    @Deprecated
    public void d0(float f4) {
        e0(f4);
    }

    public void e0(float f4) {
        this.E = true;
        this.H = f4;
        this.I = Math.abs(this.G - f4);
    }

    public void f0(boolean z4) {
        this.f50285w = z4;
    }

    public void g0(boolean z4) {
        this.f50283u = z4;
    }

    public void h0(boolean z4) {
        this.f50282t = z4;
    }

    public void i0(boolean z4) {
        this.B = z4;
    }

    public void j0(boolean z4) {
        this.f50284v = z4;
    }

    public void k0(boolean z4) {
        this.A = z4;
    }

    public void l0(float f4) {
        this.f50279q = f4;
        this.f50280r = true;
    }

    public void m(g gVar) {
        this.f50288z.add(gVar);
        this.f50288z.size();
    }

    public void m0(boolean z4) {
        this.f50280r = z4;
    }

    public void n(float f4, float f5) {
        float f6 = this.E ? this.H : f4 - this.C;
        float f7 = this.F ? this.G : f5 + this.D;
        if (Math.abs(f7 - f6) == 0.0f) {
            f7 += 1.0f;
            f6 -= 1.0f;
        }
        this.H = f6;
        this.G = f7;
        this.I = Math.abs(f7 - f6);
    }

    public void n0(int i4) {
        this.f50270h = i4;
    }

    public void o() {
        this.f50286x = null;
    }

    public void o0(DashPathEffect dashPathEffect) {
        this.f50287y = dashPathEffect;
    }

    public void p() {
        this.f50287y = null;
    }

    public void p0(float f4) {
        this.f50271i = com.github.mikephil.charting.utils.k.e(f4);
    }

    public void q(float f4, float f5, float f6) {
        this.f50286x = new DashPathEffect(new float[]{f4, f5}, f6);
    }

    public void q0(int i4) {
        if (i4 > 25) {
            i4 = 25;
        }
        if (i4 < 2) {
            i4 = 2;
        }
        this.f50278p = i4;
        this.f50281s = false;
    }

    public void r(float f4, float f5, float f6) {
        this.f50287y = new DashPathEffect(new float[]{f4, f5}, f6);
    }

    public void r0(int i4, boolean z4) {
        q0(i4);
        this.f50281s = z4;
    }

    public int s() {
        return this.f50272j;
    }

    public void s0(float f4) {
        this.D = f4;
    }

    public DashPathEffect t() {
        return this.f50286x;
    }

    public void t0(float f4) {
        this.C = f4;
    }

    public float u() {
        return this.f50273k;
    }

    public void u0(l lVar) {
        if (lVar == null) {
            this.f50269g = new com.github.mikephil.charting.formatter.b(this.f50277o);
        } else {
            this.f50269g = lVar;
        }
    }

    public float v() {
        return this.G;
    }

    public float w() {
        return this.H;
    }

    public String x(int i4) {
        return (i4 < 0 || i4 >= this.f50274l.length) ? "" : H().c(this.f50274l[i4], this);
    }

    public float y() {
        return this.f50279q;
    }

    public int z() {
        return this.f50270h;
    }
}
