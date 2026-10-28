package com.github.mikephil.charting.charts;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.view.x1;
import com.github.mikephil.charting.components.e;
import com.github.mikephil.charting.components.j;
import com.github.mikephil.charting.components.k;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.c;
import com.github.mikephil.charting.highlight.d;
import com.github.mikephil.charting.listener.f;
import com.github.mikephil.charting.renderer.g;
import com.github.mikephil.charting.renderer.q;
import com.github.mikephil.charting.renderer.t;
import com.github.mikephil.charting.utils.i;
import com.github.mikephil.charting.utils.l;
import com.google.firebase.remoteconfig.p;

@SuppressLint({"RtlHardcoded"})
/* loaded from: classes5.dex */
public abstract class BarLineChartBase<T extends c<? extends f8.b<? extends Entry>>> extends Chart<T> implements e8.b {
    private boolean L2;
    private boolean M2;
    private boolean N2;
    protected int O;
    protected Paint O2;
    protected boolean P;
    protected Paint P2;
    protected boolean Q;
    protected boolean Q1;
    protected boolean Q2;
    protected boolean R;
    protected boolean R2;
    protected boolean S2;
    protected float T2;
    protected boolean U2;
    private boolean V1;
    protected f V2;
    protected k W2;
    protected k X2;
    protected t Y2;
    protected t Z2;

    /* renamed from: a3, reason: collision with root package name */
    protected i f50211a3;

    /* renamed from: b3, reason: collision with root package name */
    protected i f50212b3;

    /* renamed from: c3, reason: collision with root package name */
    protected q f50213c3;

    /* renamed from: d3, reason: collision with root package name */
    private long f50214d3;

    /* renamed from: e3, reason: collision with root package name */
    private long f50215e3;

    /* renamed from: f3, reason: collision with root package name */
    private RectF f50216f3;

    /* renamed from: g3, reason: collision with root package name */
    protected Matrix f50217g3;

    /* renamed from: h3, reason: collision with root package name */
    protected Matrix f50218h3;

    /* renamed from: i3, reason: collision with root package name */
    private boolean f50219i3;

    /* renamed from: j3, reason: collision with root package name */
    protected float[] f50220j3;

    /* renamed from: k3, reason: collision with root package name */
    protected com.github.mikephil.charting.utils.f f50221k3;

    /* renamed from: l3, reason: collision with root package name */
    protected com.github.mikephil.charting.utils.f f50222l3;

    /* renamed from: m3, reason: collision with root package name */
    protected float[] f50223m3;

    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f50224b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f50225c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f50226d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f50227e;

        a(float f4, float f5, float f6, float f7) {
            this.f50224b = f4;
            this.f50225c = f5;
            this.f50226d = f6;
            this.f50227e = f7;
        }

        @Override // java.lang.Runnable
        public void run() {
            BarLineChartBase.this.f50251u.U(this.f50224b, this.f50225c, this.f50226d, this.f50227e);
            BarLineChartBase.this.f2();
            BarLineChartBase.this.g2();
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50229a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f50230b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f50231c;

        static {
            int[] iArr = new int[e.EnumC0775e.values().length];
            f50231c = iArr;
            try {
                iArr[e.EnumC0775e.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50231c[e.EnumC0775e.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[e.d.values().length];
            f50230b = iArr2;
            try {
                iArr2[e.d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50230b[e.d.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50230b[e.d.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[e.f.values().length];
            f50229a = iArr3;
            try {
                iArr3[e.f.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50229a[e.f.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public BarLineChartBase(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.O = 100;
        this.P = false;
        this.Q = false;
        this.R = true;
        this.Q1 = true;
        this.V1 = true;
        this.L2 = true;
        this.M2 = true;
        this.N2 = true;
        this.Q2 = false;
        this.R2 = false;
        this.S2 = false;
        this.T2 = 15.0f;
        this.U2 = false;
        this.f50214d3 = 0L;
        this.f50215e3 = 0L;
        this.f50216f3 = new RectF();
        this.f50217g3 = new Matrix();
        this.f50218h3 = new Matrix();
        this.f50219i3 = false;
        this.f50220j3 = new float[2];
        this.f50221k3 = com.github.mikephil.charting.utils.f.b(p.f60679p, p.f60679p);
        this.f50222l3 = com.github.mikephil.charting.utils.f.b(p.f60679p, p.f60679p);
        this.f50223m3 = new float[2];
    }

    public k A1() {
        return this.X2;
    }

    public void A2(float f4) {
        this.T2 = f4;
    }

    public f8.b B1(float f4, float f5) {
        d a02 = a0(f4, f5);
        if (a02 != null) {
            return (f8.b) ((c) this.f50233c).k(a02.d());
        }
        return null;
    }

    public void B2(f fVar) {
        this.V2 = fVar;
    }

    public f C1() {
        return this.V2;
    }

    public void C2(boolean z4) {
        this.Q = z4;
    }

    public Entry D1(float f4, float f5) {
        d a02 = a0(f4, f5);
        if (a02 != null) {
            return ((c) this.f50233c).s(a02);
        }
        return null;
    }

    public void D2(t tVar) {
        this.Y2 = tVar;
    }

    public float E1() {
        return this.T2;
    }

    public void E2(t tVar) {
        this.Z2 = tVar;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void F0() {
        if (this.f50233c == 0) {
            return;
        }
        g gVar = this.f50249s;
        if (gVar != null) {
            gVar.j();
        }
        I();
        t tVar = this.Y2;
        k kVar = this.W2;
        tVar.a(kVar.H, kVar.G, kVar.I0());
        t tVar2 = this.Z2;
        k kVar2 = this.X2;
        tVar2.a(kVar2.H, kVar2.G, kVar2.I0());
        q qVar = this.f50213c3;
        j jVar = this.f50240j;
        qVar.a(jVar.H, jVar.G, false);
        if (this.f50243m != null) {
            this.f50248r.a(this.f50233c);
        }
        J();
    }

    public com.github.mikephil.charting.utils.f F1(float f4, float f5, k.a aVar) {
        return d(aVar).f(f4, f5);
    }

    public void F2(boolean z4) {
        this.M2 = z4;
        this.N2 = z4;
    }

    public com.github.mikephil.charting.utils.g G1(Entry entry, k.a aVar) {
        if (entry == null) {
            return null;
        }
        this.f50220j3[0] = entry.j();
        this.f50220j3[1] = entry.c();
        d(aVar).o(this.f50220j3);
        float[] fArr = this.f50220j3;
        return com.github.mikephil.charting.utils.g.c(fArr[0], fArr[1]);
    }

    public void G2(float f4, float f5) {
        this.f50251u.c0(f4);
        this.f50251u.d0(f5);
    }

    public t H1() {
        return this.Y2;
    }

    public void H2(boolean z4) {
        this.M2 = z4;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected void I() {
        this.f50240j.n(((c) this.f50233c).y(), ((c) this.f50233c).x());
        k kVar = this.W2;
        c cVar = (c) this.f50233c;
        k.a aVar = k.a.LEFT;
        kVar.n(cVar.C(aVar), ((c) this.f50233c).A(aVar));
        k kVar2 = this.X2;
        c cVar2 = (c) this.f50233c;
        k.a aVar2 = k.a.RIGHT;
        kVar2.n(cVar2.C(aVar2), ((c) this.f50233c).A(aVar2));
    }

    public t I1() {
        return this.Z2;
    }

    public void I2(boolean z4) {
        this.N2 = z4;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void J() {
        if (!this.f50219i3) {
            s1(this.f50216f3);
            RectF rectF = this.f50216f3;
            float f4 = rectF.left + 0.0f;
            float f5 = rectF.top + 0.0f;
            float f6 = rectF.right + 0.0f;
            float f7 = rectF.bottom + 0.0f;
            if (this.W2.L0()) {
                f4 += this.W2.A0(this.Y2.c());
            }
            if (this.X2.L0()) {
                f6 += this.X2.A0(this.Z2.c());
            }
            if (this.f50240j.f() && this.f50240j.P()) {
                float e4 = this.f50240j.e() + r2.M;
                if (this.f50240j.w0() == j.a.BOTTOM) {
                    f7 += e4;
                } else {
                    if (this.f50240j.w0() != j.a.TOP) {
                        if (this.f50240j.w0() == j.a.BOTH_SIDED) {
                            f7 += e4;
                        }
                    }
                    f5 += e4;
                }
            }
            float Z = Z() + f5;
            float Y = Y() + f6;
            float W = W() + f7;
            float X = X() + f4;
            float e5 = com.github.mikephil.charting.utils.k.e(this.T2);
            this.f50251u.U(Math.max(e5, X), Math.max(e5, Z), Math.max(e5, Y), Math.max(e5, W));
            if (this.f50232b) {
                this.f50251u.q().toString();
            }
        }
        f2();
        g2();
    }

    public q J1() {
        return this.f50213c3;
    }

    public void J2(float f4, float f5, float f6, float f7) {
        this.f50219i3 = true;
        post(new a(f4, f5, f6, f7));
    }

    public com.github.mikephil.charting.utils.f K1(float f4, float f5, k.a aVar) {
        com.github.mikephil.charting.utils.f b5 = com.github.mikephil.charting.utils.f.b(p.f60679p, p.f60679p);
        L1(f4, f5, aVar, b5);
        return b5;
    }

    public void K2(float f4, float f5) {
        float f6 = this.f50240j.I;
        this.f50251u.a0(f6 / f4, f6 / f5);
    }

    public void L1(float f4, float f5, k.a aVar, com.github.mikephil.charting.utils.f fVar) {
        d(aVar).k(f4, f5, fVar);
    }

    public void L2(float f4) {
        this.f50251u.c0(this.f50240j.I / f4);
    }

    public float M1() {
        return Math.abs(g() - f());
    }

    public void M2(float f4) {
        this.f50251u.Y(this.f50240j.I / f4);
    }

    public boolean N1() {
        return this.f50251u.C();
    }

    public void N2(float f4, float f5, k.a aVar) {
        this.f50251u.b0(z1(aVar) / f4, z1(aVar) / f5);
    }

    public boolean O1() {
        return this.W2.I0() || this.X2.I0();
    }

    public void O2(float f4, k.a aVar) {
        this.f50251u.d0(z1(aVar) / f4);
    }

    public boolean P1() {
        return this.P;
    }

    public void P2(float f4, k.a aVar) {
        this.f50251u.Z(z1(aVar) / f4);
    }

    public boolean Q1() {
        return this.S2;
    }

    public void Q2(q qVar) {
        this.f50213c3 = qVar;
    }

    public boolean R1() {
        return this.R;
    }

    public void R2(float f4, float f5, float f6, float f7) {
        this.f50251u.l0(f4, f5, f6, -f7, this.f50217g3);
        this.f50251u.S(this.f50217g3, this, false);
        J();
        postInvalidate();
    }

    public boolean S1() {
        return this.V1 || this.L2;
    }

    public void S2(float f4, float f5, float f6, float f7, k.a aVar) {
        A(com.github.mikephil.charting.jobs.f.d(this.f50251u, f4, f5, f6, f7, d(aVar), aVar, this));
    }

    public boolean T1() {
        return this.V1;
    }

    @TargetApi(11)
    public void T2(float f4, float f5, float f6, float f7, k.a aVar, long j4) {
        com.github.mikephil.charting.utils.f K1 = K1(this.f50251u.h(), this.f50251u.j(), aVar);
        A(com.github.mikephil.charting.jobs.c.j(this.f50251u, this, d(aVar), x(aVar), this.f50240j.I, f4, f5, this.f50251u.w(), this.f50251u.x(), f6, f7, (float) K1.f50632d, (float) K1.f50633e, j4));
        com.github.mikephil.charting.utils.f.c(K1);
    }

    public boolean U1() {
        return this.L2;
    }

    public void U2() {
        com.github.mikephil.charting.utils.g p4 = this.f50251u.p();
        this.f50251u.o0(p4.f50636d, -p4.f50637e, this.f50217g3);
        this.f50251u.S(this.f50217g3, this, false);
        com.github.mikephil.charting.utils.g.h(p4);
        J();
        postInvalidate();
    }

    public boolean V1() {
        return this.R2;
    }

    public void V2() {
        com.github.mikephil.charting.utils.g p4 = this.f50251u.p();
        this.f50251u.q0(p4.f50636d, -p4.f50637e, this.f50217g3);
        this.f50251u.S(this.f50217g3, this, false);
        com.github.mikephil.charting.utils.g.h(p4);
        J();
        postInvalidate();
    }

    public boolean W1() {
        return this.f50251u.D();
    }

    public void W2(float f4, float f5) {
        com.github.mikephil.charting.utils.g j4 = j();
        Matrix matrix = this.f50217g3;
        this.f50251u.l0(f4, f5, j4.f50636d, -j4.f50637e, matrix);
        this.f50251u.S(matrix, this, false);
    }

    public boolean X1() {
        return this.Q1;
    }

    public boolean Y1() {
        return this.U2;
    }

    public boolean Z1() {
        return this.Q;
    }

    public boolean a2() {
        return this.M2;
    }

    @Override // com.github.mikephil.charting.charts.Chart, e8.e, e8.b
    public c b() {
        return (c) this.f50233c;
    }

    public boolean b2() {
        return this.N2;
    }

    public void c2(float f4, float f5, k.a aVar) {
        A(com.github.mikephil.charting.jobs.d.d(this.f50251u, f4, ((z1(aVar) / this.f50251u.x()) / 2.0f) + f5, d(aVar), this));
    }

    @Override // android.view.View
    public void computeScroll() {
        com.github.mikephil.charting.listener.b bVar = this.f50245o;
        if (bVar instanceof com.github.mikephil.charting.listener.a) {
            ((com.github.mikephil.charting.listener.a) bVar).h();
        }
    }

    @Override // e8.b
    public i d(k.a aVar) {
        return aVar == k.a.LEFT ? this.f50211a3 : this.f50212b3;
    }

    @TargetApi(11)
    public void d2(float f4, float f5, k.a aVar, long j4) {
        com.github.mikephil.charting.utils.f K1 = K1(this.f50251u.h(), this.f50251u.j(), aVar);
        A(com.github.mikephil.charting.jobs.a.j(this.f50251u, f4, ((z1(aVar) / this.f50251u.x()) / 2.0f) + f5, d(aVar), this, (float) K1.f50632d, (float) K1.f50633e, j4));
        com.github.mikephil.charting.utils.f.c(K1);
    }

    public void e2(float f4) {
        A(com.github.mikephil.charting.jobs.d.d(this.f50251u, f4, 0.0f, d(k.a.LEFT), this));
    }

    @Override // e8.b
    public float f() {
        d(k.a.LEFT).k(this.f50251u.h(), this.f50251u.f(), this.f50221k3);
        return (float) Math.max(this.f50240j.H, this.f50221k3.f50632d);
    }

    protected void f2() {
        this.f50212b3.p(this.X2.I0());
        this.f50211a3.p(this.W2.I0());
    }

    @Override // e8.b
    public float g() {
        d(k.a.LEFT).k(this.f50251u.i(), this.f50251u.f(), this.f50222l3);
        return (float) Math.min(this.f50240j.G, this.f50222l3.f50632d);
    }

    protected void g2() {
        if (this.f50232b) {
            j jVar = this.f50240j;
            float f4 = jVar.H;
            float f5 = jVar.G;
            float f6 = jVar.I;
        }
        i iVar = this.f50212b3;
        j jVar2 = this.f50240j;
        float f7 = jVar2.H;
        float f10 = jVar2.I;
        k kVar = this.X2;
        iVar.q(f7, f10, kVar.I, kVar.H);
        i iVar2 = this.f50211a3;
        j jVar3 = this.f50240j;
        float f11 = jVar3.H;
        float f12 = jVar3.I;
        k kVar2 = this.W2;
        iVar2.q(f11, f12, kVar2.I, kVar2.H);
    }

    @Override // android.view.View
    public float getScaleX() {
        l lVar = this.f50251u;
        if (lVar == null) {
            return 1.0f;
        }
        return lVar.w();
    }

    @Override // android.view.View
    public float getScaleY() {
        l lVar = this.f50251u;
        if (lVar == null) {
            return 1.0f;
        }
        return lVar.x();
    }

    public void h2() {
        this.f50214d3 = 0L;
        this.f50215e3 = 0L;
    }

    public void i2() {
        this.f50219i3 = false;
        J();
    }

    public void j2() {
        this.f50251u.T(this.f50217g3);
        this.f50251u.S(this.f50217g3, this, false);
        J();
        postInvalidate();
    }

    @Override // e8.e
    public float k() {
        return Math.min(this.W2.H, this.X2.H);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void k1(Paint paint, int i4) {
        super.k1(paint, i4);
        if (i4 != 4) {
            return;
        }
        this.O2 = paint;
    }

    public void k2(boolean z4) {
        this.P = z4;
    }

    @Override // e8.e
    public float l() {
        return Math.max(this.W2.G, this.X2.G);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public Paint l0(int i4) {
        Paint l02 = super.l0(i4);
        if (l02 != null) {
            return l02;
        }
        if (i4 != 4) {
            return null;
        }
        return this.O2;
    }

    public void l2(int i4) {
        this.P2.setColor(i4);
    }

    @Override // e8.e
    public int m() {
        return this.O;
    }

    public void m2(float f4) {
        this.P2.setStrokeWidth(com.github.mikephil.charting.utils.k.e(f4));
    }

    @Override // e8.b
    public boolean n(k.a aVar) {
        return x(aVar).I0();
    }

    public void n2(boolean z4) {
        this.S2 = z4;
    }

    public void o2(boolean z4) {
        this.R = z4;
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f50233c == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        w1(canvas);
        if (this.P) {
            r1();
        }
        if (this.W2.f()) {
            t tVar = this.Y2;
            k kVar = this.W2;
            tVar.a(kVar.H, kVar.G, kVar.I0());
        }
        if (this.X2.f()) {
            t tVar2 = this.Z2;
            k kVar2 = this.X2;
            tVar2.a(kVar2.H, kVar2.G, kVar2.I0());
        }
        if (this.f50240j.f()) {
            q qVar = this.f50213c3;
            j jVar = this.f50240j;
            qVar.a(jVar.H, jVar.G, false);
        }
        this.f50213c3.h(canvas);
        this.Y2.h(canvas);
        this.Z2.h(canvas);
        if (this.f50240j.N()) {
            this.f50213c3.i(canvas);
        }
        if (this.W2.N()) {
            this.Y2.i(canvas);
        }
        if (this.X2.N()) {
            this.Z2.i(canvas);
        }
        if (this.f50240j.f() && this.f50240j.Q()) {
            this.f50213c3.j(canvas);
        }
        if (this.W2.f() && this.W2.Q()) {
            this.Y2.j(canvas);
        }
        if (this.X2.f() && this.X2.Q()) {
            this.Z2.j(canvas);
        }
        int save = canvas.save();
        canvas.clipRect(this.f50251u.q());
        this.f50249s.b(canvas);
        if (!this.f50240j.N()) {
            this.f50213c3.i(canvas);
        }
        if (!this.W2.N()) {
            this.Y2.i(canvas);
        }
        if (!this.X2.N()) {
            this.Z2.i(canvas);
        }
        if (q1()) {
            this.f50249s.d(canvas, this.B);
        }
        canvas.restoreToCount(save);
        this.f50249s.c(canvas);
        if (this.f50240j.f() && !this.f50240j.Q()) {
            this.f50213c3.j(canvas);
        }
        if (this.W2.f() && !this.W2.Q()) {
            this.Y2.j(canvas);
        }
        if (this.X2.f() && !this.X2.Q()) {
            this.Z2.j(canvas);
        }
        this.f50213c3.g(canvas);
        this.Y2.g(canvas);
        this.Z2.g(canvas);
        if (Q1()) {
            int save2 = canvas.save();
            canvas.clipRect(this.f50251u.q());
            this.f50249s.f(canvas);
            canvas.restoreToCount(save2);
        } else {
            this.f50249s.f(canvas);
        }
        this.f50248r.f(canvas);
        O(canvas);
        P(canvas);
        if (this.f50232b) {
            long currentTimeMillis2 = this.f50214d3 + (System.currentTimeMillis() - currentTimeMillis);
            this.f50214d3 = currentTimeMillis2;
            long j4 = this.f50215e3 + 1;
            this.f50215e3 = j4;
            long j5 = currentTimeMillis2 / j4;
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        float[] fArr = this.f50223m3;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        if (this.U2) {
            fArr[0] = this.f50251u.h();
            this.f50223m3[1] = this.f50251u.j();
            d(k.a.LEFT).n(this.f50223m3);
        }
        super.onSizeChanged(i4, i5, i6, i7);
        if (this.U2) {
            d(k.a.LEFT).o(this.f50223m3);
            this.f50251u.e(this.f50223m3, this);
        } else {
            l lVar = this.f50251u;
            lVar.S(lVar.r(), this, true);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        com.github.mikephil.charting.listener.b bVar = this.f50245o;
        if (bVar == null || this.f50233c == 0 || !this.f50241k) {
            return false;
        }
        return bVar.onTouch(this, motionEvent);
    }

    public void p2(boolean z4) {
        this.V1 = z4;
        this.L2 = z4;
    }

    public void q2(float f4) {
        this.f50251u.W(f4);
    }

    protected void r1() {
        ((c) this.f50233c).g(f(), g());
        this.f50240j.n(((c) this.f50233c).y(), ((c) this.f50233c).x());
        if (this.W2.f()) {
            k kVar = this.W2;
            c cVar = (c) this.f50233c;
            k.a aVar = k.a.LEFT;
            kVar.n(cVar.C(aVar), ((c) this.f50233c).A(aVar));
        }
        if (this.X2.f()) {
            k kVar2 = this.X2;
            c cVar2 = (c) this.f50233c;
            k.a aVar2 = k.a.RIGHT;
            kVar2.n(cVar2.C(aVar2), ((c) this.f50233c).A(aVar2));
        }
        J();
    }

    public void r2(float f4) {
        this.f50251u.X(f4);
    }

    protected void s1(RectF rectF) {
        rectF.left = 0.0f;
        rectF.right = 0.0f;
        rectF.top = 0.0f;
        rectF.bottom = 0.0f;
        e eVar = this.f50243m;
        if (eVar == null || !eVar.f() || this.f50243m.H()) {
            return;
        }
        int i4 = b.f50231c[this.f50243m.C().ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                return;
            }
            int i5 = b.f50229a[this.f50243m.E().ordinal()];
            if (i5 == 1) {
                rectF.top = this.f50243m.e() + Math.min(this.f50243m.f50316y, this.f50243m.z() * this.f50251u.n()) + rectF.top;
                return;
            }
            if (i5 != 2) {
                return;
            }
            rectF.bottom = this.f50243m.e() + Math.min(this.f50243m.f50316y, this.f50243m.z() * this.f50251u.n()) + rectF.bottom;
            return;
        }
        int i6 = b.f50230b[this.f50243m.y().ordinal()];
        if (i6 == 1) {
            rectF.left = this.f50243m.d() + Math.min(this.f50243m.f50315x, this.f50243m.z() * this.f50251u.o()) + rectF.left;
            return;
        }
        if (i6 == 2) {
            rectF.right = this.f50243m.d() + Math.min(this.f50243m.f50315x, this.f50243m.z() * this.f50251u.o()) + rectF.right;
            return;
        }
        if (i6 != 3) {
            return;
        }
        int i7 = b.f50229a[this.f50243m.E().ordinal()];
        if (i7 == 1) {
            rectF.top = this.f50243m.e() + Math.min(this.f50243m.f50316y, this.f50243m.z() * this.f50251u.n()) + rectF.top;
            return;
        }
        if (i7 != 2) {
            return;
        }
        rectF.bottom = this.f50243m.e() + Math.min(this.f50243m.f50316y, this.f50243m.z() * this.f50251u.n()) + rectF.bottom;
    }

    public void s2(boolean z4) {
        this.V1 = z4;
    }

    public void t1(float f4, float f5, k.a aVar) {
        float z12 = z1(aVar) / this.f50251u.x();
        A(com.github.mikephil.charting.jobs.d.d(this.f50251u, f4 - ((o0().I / this.f50251u.w()) / 2.0f), (z12 / 2.0f) + f5, d(aVar), this));
    }

    public void t2(boolean z4) {
        this.L2 = z4;
    }

    @TargetApi(11)
    public void u1(float f4, float f5, k.a aVar, long j4) {
        com.github.mikephil.charting.utils.f K1 = K1(this.f50251u.h(), this.f50251u.j(), aVar);
        float z12 = z1(aVar) / this.f50251u.x();
        A(com.github.mikephil.charting.jobs.a.j(this.f50251u, f4 - ((o0().I / this.f50251u.w()) / 2.0f), (z12 / 2.0f) + f5, d(aVar), this, (float) K1.f50632d, (float) K1.f50633e, j4));
        com.github.mikephil.charting.utils.f.c(K1);
    }

    public void u2(boolean z4) {
        this.R2 = z4;
    }

    public void v1(float f4, k.a aVar) {
        A(com.github.mikephil.charting.jobs.d.d(this.f50251u, 0.0f, ((z1(aVar) / this.f50251u.x()) / 2.0f) + f4, d(aVar), this));
    }

    public void v2(boolean z4) {
        this.Q2 = z4;
    }

    protected void w1(Canvas canvas) {
        if (this.Q2) {
            canvas.drawRect(this.f50251u.q(), this.O2);
        }
        if (this.R2) {
            canvas.drawRect(this.f50251u.q(), this.P2);
        }
    }

    public void w2(int i4) {
        this.O2.setColor(i4);
    }

    public k x(k.a aVar) {
        return aVar == k.a.LEFT ? this.W2 : this.X2;
    }

    public void x1() {
        Matrix matrix = this.f50218h3;
        this.f50251u.m(matrix);
        this.f50251u.S(matrix, this, false);
        J();
        postInvalidate();
    }

    public void x2(boolean z4) {
        this.Q1 = z4;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected void y0() {
        super.y0();
        this.W2 = new k(k.a.LEFT);
        this.X2 = new k(k.a.RIGHT);
        this.f50211a3 = new i(this.f50251u);
        this.f50212b3 = new i(this.f50251u);
        this.Y2 = new t(this.f50251u, this.W2, this.f50211a3);
        this.Z2 = new t(this.f50251u, this.X2, this.f50212b3);
        this.f50213c3 = new q(this.f50251u, this.f50240j, this.f50211a3);
        Y0(new com.github.mikephil.charting.highlight.b(this));
        this.f50245o = new com.github.mikephil.charting.listener.a(this, this.f50251u.r(), 3.0f);
        Paint paint = new Paint();
        this.O2 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.O2.setColor(Color.rgb(240, 240, 240));
        Paint paint2 = new Paint();
        this.P2 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.P2.setColor(x1.f27484y);
        this.P2.setStrokeWidth(com.github.mikephil.charting.utils.k.e(1.0f));
    }

    public k y1() {
        return this.W2;
    }

    public void y2(boolean z4) {
        this.U2 = z4;
    }

    protected float z1(k.a aVar) {
        return aVar == k.a.LEFT ? this.W2.I : this.X2.I;
    }

    public void z2(int i4) {
        this.O = i4;
    }

    public BarLineChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.O = 100;
        this.P = false;
        this.Q = false;
        this.R = true;
        this.Q1 = true;
        this.V1 = true;
        this.L2 = true;
        this.M2 = true;
        this.N2 = true;
        this.Q2 = false;
        this.R2 = false;
        this.S2 = false;
        this.T2 = 15.0f;
        this.U2 = false;
        this.f50214d3 = 0L;
        this.f50215e3 = 0L;
        this.f50216f3 = new RectF();
        this.f50217g3 = new Matrix();
        this.f50218h3 = new Matrix();
        this.f50219i3 = false;
        this.f50220j3 = new float[2];
        this.f50221k3 = com.github.mikephil.charting.utils.f.b(p.f60679p, p.f60679p);
        this.f50222l3 = com.github.mikephil.charting.utils.f.b(p.f60679p, p.f60679p);
        this.f50223m3 = new float[2];
    }

    public BarLineChartBase(Context context) {
        super(context);
        this.O = 100;
        this.P = false;
        this.Q = false;
        this.R = true;
        this.Q1 = true;
        this.V1 = true;
        this.L2 = true;
        this.M2 = true;
        this.N2 = true;
        this.Q2 = false;
        this.R2 = false;
        this.S2 = false;
        this.T2 = 15.0f;
        this.U2 = false;
        this.f50214d3 = 0L;
        this.f50215e3 = 0L;
        this.f50216f3 = new RectF();
        this.f50217g3 = new Matrix();
        this.f50218h3 = new Matrix();
        this.f50219i3 = false;
        this.f50220j3 = new float[2];
        this.f50221k3 = com.github.mikephil.charting.utils.f.b(p.f60679p, p.f60679p);
        this.f50222l3 = com.github.mikephil.charting.utils.f.b(p.f60679p, p.f60679p);
        this.f50223m3 = new float[2];
    }
}
