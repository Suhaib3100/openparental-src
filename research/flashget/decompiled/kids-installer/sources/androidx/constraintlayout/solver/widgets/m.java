package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.analyzer.b;
import androidx.constraintlayout.solver.widgets.e;

/* compiled from: VirtualLayout.java */
/* loaded from: classes3.dex */
public class m extends j {

    /* renamed from: q1, reason: collision with root package name */
    private int f2641q1 = 0;

    /* renamed from: r1, reason: collision with root package name */
    private int f2642r1 = 0;

    /* renamed from: s1, reason: collision with root package name */
    private int f2643s1 = 0;

    /* renamed from: t1, reason: collision with root package name */
    private int f2644t1 = 0;

    /* renamed from: u1, reason: collision with root package name */
    private int f2645u1 = 0;

    /* renamed from: v1, reason: collision with root package name */
    private int f2646v1 = 0;

    /* renamed from: w1, reason: collision with root package name */
    private int f2647w1 = 0;

    /* renamed from: x1, reason: collision with root package name */
    private int f2648x1 = 0;

    /* renamed from: y1, reason: collision with root package name */
    private boolean f2649y1 = false;

    /* renamed from: z1, reason: collision with root package name */
    private int f2650z1 = 0;
    private int A1 = 0;
    protected b.a B1 = new b.a();
    b.InterfaceC0021b C1 = null;

    public void Q1(boolean z5) {
        int i5 = this.f2645u1;
        if (i5 > 0 || this.f2646v1 > 0) {
            if (z5) {
                this.f2647w1 = this.f2646v1;
                this.f2648x1 = i5;
            } else {
                this.f2647w1 = i5;
                this.f2648x1 = this.f2646v1;
            }
        }
    }

    public void R1() {
        for (int i5 = 0; i5 < this.f2619p1; i5++) {
            e eVar = this.f2618o1[i5];
            if (eVar != null) {
                eVar.n1(true);
            }
        }
    }

    public int S1() {
        return this.A1;
    }

    public int T1() {
        return this.f2650z1;
    }

    public int U1() {
        return this.f2642r1;
    }

    public int V1() {
        return this.f2647w1;
    }

    public int W1() {
        return this.f2648x1;
    }

    public int X1() {
        return this.f2641q1;
    }

    public void Y1(int i5, int i6, int i7, int i8) {
    }

    protected void Z1(e eVar, e.b bVar, int i5, e.b bVar2, int i6) {
        while (this.C1 == null && U() != null) {
            this.C1 = ((f) U()).k2();
        }
        b.a aVar = this.B1;
        aVar.f2377a = bVar;
        aVar.f2378b = bVar2;
        aVar.f2379c = i5;
        aVar.f2380d = i6;
        this.C1.b(eVar, aVar);
        eVar.H1(this.B1.f2381e);
        eVar.d1(this.B1.f2382f);
        eVar.c1(this.B1.f2384h);
        eVar.L0(this.B1.f2383g);
    }

    protected boolean a2() {
        e eVar = this.V;
        b.InterfaceC0021b k22 = eVar != null ? ((f) eVar).k2() : null;
        if (k22 == null) {
            return false;
        }
        int i5 = 0;
        while (true) {
            if (i5 >= this.f2619p1) {
                return true;
            }
            e eVar2 = this.f2618o1[i5];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b z5 = eVar2.z(0);
                e.b z6 = eVar2.z(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (!(z5 == bVar && eVar2.f2540p != 1 && z6 == bVar && eVar2.f2542q != 1)) {
                    if (z5 == bVar) {
                        z5 = e.b.WRAP_CONTENT;
                    }
                    if (z6 == bVar) {
                        z6 = e.b.WRAP_CONTENT;
                    }
                    b.a aVar = this.B1;
                    aVar.f2377a = z5;
                    aVar.f2378b = z6;
                    aVar.f2379c = eVar2.j0();
                    this.B1.f2380d = eVar2.D();
                    k22.b(eVar2, this.B1);
                    eVar2.H1(this.B1.f2381e);
                    eVar2.d1(this.B1.f2382f);
                    eVar2.L0(this.B1.f2383g);
                }
            }
            i5++;
        }
    }

    public boolean b2() {
        return this.f2649y1;
    }

    @Override // androidx.constraintlayout.solver.widgets.j, androidx.constraintlayout.solver.widgets.i
    public void c(f fVar) {
        R1();
    }

    protected void c2(boolean z5) {
        this.f2649y1 = z5;
    }

    public void d2(int i5, int i6) {
        this.f2650z1 = i5;
        this.A1 = i6;
    }

    public void e2(int i5) {
        this.f2643s1 = i5;
        this.f2641q1 = i5;
        this.f2644t1 = i5;
        this.f2642r1 = i5;
        this.f2645u1 = i5;
        this.f2646v1 = i5;
    }

    public void f2(int i5) {
        this.f2642r1 = i5;
    }

    public void g2(int i5) {
        this.f2646v1 = i5;
    }

    public void h2(int i5) {
        this.f2643s1 = i5;
        this.f2647w1 = i5;
    }

    public void i2(int i5) {
        this.f2644t1 = i5;
        this.f2648x1 = i5;
    }

    public void j2(int i5) {
        this.f2645u1 = i5;
        this.f2647w1 = i5;
        this.f2648x1 = i5;
    }

    public void k2(int i5) {
        this.f2641q1 = i5;
    }
}
