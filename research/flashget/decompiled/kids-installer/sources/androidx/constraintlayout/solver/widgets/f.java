package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.analyzer.b;
import androidx.constraintlayout.solver.widgets.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ConstraintWidgetContainer.java */
/* loaded from: classes3.dex */
public class f extends n {
    private static final int S1 = 8;
    private static final boolean T1 = false;
    private static final boolean U1 = false;
    static final boolean V1 = false;
    static int W1;
    public int A1;
    c[] B1;
    c[] C1;
    public boolean D1;
    public boolean E1;
    public boolean F1;
    public int G1;
    public int H1;
    private int I1;
    public boolean J1;
    private boolean K1;
    private boolean L1;
    int M1;
    private WeakReference<d> N1;
    private WeakReference<d> O1;
    private WeakReference<d> P1;
    private WeakReference<d> Q1;
    public b.a R1;

    /* renamed from: p1, reason: collision with root package name */
    androidx.constraintlayout.solver.widgets.analyzer.b f2564p1;

    /* renamed from: q1, reason: collision with root package name */
    public androidx.constraintlayout.solver.widgets.analyzer.f f2565q1;

    /* renamed from: r1, reason: collision with root package name */
    protected b.InterfaceC0021b f2566r1;

    /* renamed from: s1, reason: collision with root package name */
    private boolean f2567s1;

    /* renamed from: t1, reason: collision with root package name */
    public androidx.constraintlayout.solver.h f2568t1;

    /* renamed from: u1, reason: collision with root package name */
    protected androidx.constraintlayout.solver.g f2569u1;

    /* renamed from: v1, reason: collision with root package name */
    int f2570v1;

    /* renamed from: w1, reason: collision with root package name */
    int f2571w1;

    /* renamed from: x1, reason: collision with root package name */
    int f2572x1;

    /* renamed from: y1, reason: collision with root package name */
    int f2573y1;

    /* renamed from: z1, reason: collision with root package name */
    public int f2574z1;

    public f() {
        this.f2564p1 = new androidx.constraintlayout.solver.widgets.analyzer.b(this);
        this.f2565q1 = new androidx.constraintlayout.solver.widgets.analyzer.f(this);
        this.f2566r1 = null;
        this.f2567s1 = false;
        this.f2569u1 = new androidx.constraintlayout.solver.g();
        this.f2574z1 = 0;
        this.A1 = 0;
        this.B1 = new c[4];
        this.C1 = new c[4];
        this.D1 = false;
        this.E1 = false;
        this.F1 = false;
        this.G1 = 0;
        this.H1 = 0;
        this.I1 = 257;
        this.J1 = false;
        this.K1 = false;
        this.L1 = false;
        this.M1 = 0;
        this.N1 = null;
        this.O1 = null;
        this.P1 = null;
        this.Q1 = null;
        this.R1 = new b.a();
    }

    private void W1(e eVar) {
        int i5 = this.f2574z1 + 1;
        c[] cVarArr = this.C1;
        if (i5 >= cVarArr.length) {
            this.C1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.C1[this.f2574z1] = new c(eVar, 0, s2());
        this.f2574z1++;
    }

    private void Z1(d dVar, androidx.constraintlayout.solver.k kVar) {
        this.f2569u1.i(kVar, this.f2569u1.u(dVar), 0, 5);
    }

    private void a2(d dVar, androidx.constraintlayout.solver.k kVar) {
        this.f2569u1.i(this.f2569u1.u(dVar), kVar, 0, 5);
    }

    private void b2(e eVar) {
        int i5 = this.A1 + 1;
        c[] cVarArr = this.B1;
        if (i5 >= cVarArr.length) {
            this.B1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.B1[this.A1] = new c(eVar, 1, s2());
        this.A1++;
    }

    public static boolean v2(e eVar, b.InterfaceC0021b interfaceC0021b, b.a aVar, int i5) {
        int i6;
        int i7;
        if (interfaceC0021b == null) {
            return false;
        }
        aVar.f2377a = eVar.H();
        aVar.f2378b = eVar.g0();
        aVar.f2379c = eVar.j0();
        aVar.f2380d = eVar.D();
        aVar.f2385i = false;
        aVar.f2386j = i5;
        e.b bVar = aVar.f2377a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z5 = bVar == bVar2;
        boolean z6 = aVar.f2378b == bVar2;
        boolean z7 = z5 && eVar.Y > 0.0f;
        boolean z8 = z6 && eVar.Y > 0.0f;
        if (z5 && eVar.n0(0) && eVar.f2540p == 0 && !z7) {
            aVar.f2377a = e.b.WRAP_CONTENT;
            if (z6 && eVar.f2542q == 0) {
                aVar.f2377a = e.b.FIXED;
            }
            z5 = false;
        }
        if (z6 && eVar.n0(1) && eVar.f2542q == 0 && !z8) {
            aVar.f2378b = e.b.WRAP_CONTENT;
            if (z5 && eVar.f2540p == 0) {
                aVar.f2378b = e.b.FIXED;
            }
            z6 = false;
        }
        if (eVar.x0()) {
            aVar.f2377a = e.b.FIXED;
            z5 = false;
        }
        if (eVar.y0()) {
            aVar.f2378b = e.b.FIXED;
            z6 = false;
        }
        if (z7) {
            if (eVar.f2544r[0] == 4) {
                aVar.f2377a = e.b.FIXED;
            } else if (!z6) {
                e.b bVar3 = aVar.f2378b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i7 = aVar.f2380d;
                } else {
                    aVar.f2377a = e.b.WRAP_CONTENT;
                    interfaceC0021b.b(eVar, aVar);
                    i7 = aVar.f2382f;
                }
                aVar.f2377a = bVar4;
                int i8 = eVar.Z;
                if (i8 == 0 || i8 == -1) {
                    aVar.f2379c = (int) (eVar.A() * i7);
                } else {
                    aVar.f2379c = (int) (eVar.A() / i7);
                }
            }
        }
        if (z8) {
            if (eVar.f2544r[1] == 4) {
                aVar.f2378b = e.b.FIXED;
            } else if (!z5) {
                e.b bVar5 = aVar.f2377a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i6 = aVar.f2379c;
                } else {
                    aVar.f2378b = e.b.WRAP_CONTENT;
                    interfaceC0021b.b(eVar, aVar);
                    i6 = aVar.f2381e;
                }
                aVar.f2378b = bVar6;
                int i9 = eVar.Z;
                if (i9 == 0 || i9 == -1) {
                    aVar.f2380d = (int) (i6 / eVar.A());
                } else {
                    aVar.f2380d = (int) (eVar.A() * i6);
                }
            }
        }
        interfaceC0021b.b(eVar, aVar);
        eVar.H1(aVar.f2381e);
        eVar.d1(aVar.f2382f);
        eVar.c1(aVar.f2384h);
        eVar.L0(aVar.f2383g);
        aVar.f2386j = b.a.f2374k;
        return aVar.f2385i;
    }

    private void x2() {
        this.f2574z1 = 0;
        this.A1 = 0;
    }

    public void A2(int i5, int i6, int i7, int i8) {
        this.f2570v1 = i5;
        this.f2571w1 = i6;
        this.f2572x1 = i7;
        this.f2573y1 = i8;
    }

    public void B2(boolean z5) {
        this.f2567s1 = z5;
    }

    public void C2(androidx.constraintlayout.solver.g gVar, boolean[] zArr) {
        zArr[2] = false;
        boolean w22 = w2(64);
        N1(gVar, w22);
        int size = this.f2651o1.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f2651o1.get(i5).N1(gVar, w22);
        }
    }

    public void D2() {
        this.f2564p1.e(this);
    }

    @Override // androidx.constraintlayout.solver.widgets.n, androidx.constraintlayout.solver.widgets.e
    public void F0() {
        this.f2569u1.Y();
        this.f2570v1 = 0;
        this.f2572x1 = 0;
        this.f2571w1 = 0;
        this.f2573y1 = 0;
        this.J1 = false;
        super.F0();
    }

    @Override // androidx.constraintlayout.solver.widgets.e
    public void M1(boolean z5, boolean z6) {
        super.M1(z5, z6);
        int size = this.f2651o1.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f2651o1.get(i5).M1(z5, z6);
        }
    }

    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    @Override // androidx.constraintlayout.solver.widgets.n
    public void R1() {
        int i5;
        int i6;
        boolean z5;
        boolean z6;
        ?? r6;
        boolean z7;
        e.b bVar;
        int i7 = 0;
        this.f2511a0 = 0;
        this.f2513b0 = 0;
        this.K1 = false;
        this.L1 = false;
        int size = this.f2651o1.size();
        int max = Math.max(0, j0());
        int max2 = Math.max(0, D());
        e.b[] bVarArr = this.U;
        e.b bVar2 = bVarArr[1];
        e.b bVar3 = bVarArr[0];
        androidx.constraintlayout.solver.h hVar = this.f2568t1;
        if (hVar != null) {
            hVar.P++;
        }
        if (k.b(this.I1, 1)) {
            androidx.constraintlayout.solver.widgets.analyzer.i.i(this, k2());
            for (int i8 = 0; i8 < size; i8++) {
                e eVar = this.f2651o1.get(i8);
                if (eVar.w0() && !(eVar instanceof h) && !(eVar instanceof a) && !(eVar instanceof m) && !eVar.v0()) {
                    e.b z8 = eVar.z(0);
                    e.b z9 = eVar.z(1);
                    e.b bVar4 = e.b.MATCH_CONSTRAINT;
                    if (!(z8 == bVar4 && eVar.f2540p != 1 && z9 == bVar4 && eVar.f2542q != 1)) {
                        v2(eVar, this.f2566r1, new b.a(), b.a.f2374k);
                    }
                }
            }
        }
        if (size <= 2 || !((bVar3 == (bVar = e.b.WRAP_CONTENT) || bVar2 == bVar) && k.b(this.I1, 1024) && androidx.constraintlayout.solver.widgets.analyzer.j.c(this, k2()))) {
            i5 = max2;
            i6 = max;
            z5 = false;
        } else {
            if (bVar3 == bVar) {
                if (max >= j0() || max <= 0) {
                    max = j0();
                } else {
                    H1(max);
                    this.K1 = true;
                }
            }
            if (bVar2 == bVar) {
                if (max2 >= D() || max2 <= 0) {
                    max2 = D();
                } else {
                    d1(max2);
                    this.L1 = true;
                }
            }
            i5 = max2;
            i6 = max;
            z5 = true;
        }
        boolean z10 = w2(64) || w2(128);
        androidx.constraintlayout.solver.g gVar = this.f2569u1;
        gVar.f2168h = false;
        gVar.f2169i = false;
        if (this.I1 != 0 && z10) {
            gVar.f2169i = true;
        }
        ArrayList<e> arrayList = this.f2651o1;
        e.b H = H();
        e.b bVar5 = e.b.WRAP_CONTENT;
        boolean z11 = H == bVar5 || g0() == bVar5;
        x2();
        for (int i9 = 0; i9 < size; i9++) {
            e eVar2 = this.f2651o1.get(i9);
            if (eVar2 instanceof n) {
                ((n) eVar2).R1();
            }
        }
        boolean w22 = w2(64);
        boolean z12 = z5;
        int i10 = 0;
        boolean z13 = true;
        while (z13) {
            int i11 = i10 + 1;
            try {
                this.f2569u1.Y();
                x2();
                o(this.f2569u1);
                for (int i12 = i7; i12 < size; i12++) {
                    this.f2651o1.get(i12).o(this.f2569u1);
                }
                z13 = V1(this.f2569u1);
                WeakReference<d> weakReference = this.N1;
                if (weakReference != null && weakReference.get() != null) {
                    a2(this.N1.get(), this.f2569u1.u(this.K));
                    this.N1 = null;
                }
                WeakReference<d> weakReference2 = this.P1;
                if (weakReference2 != null && weakReference2.get() != null) {
                    Z1(this.P1.get(), this.f2569u1.u(this.M));
                    this.P1 = null;
                }
                WeakReference<d> weakReference3 = this.O1;
                if (weakReference3 != null && weakReference3.get() != null) {
                    a2(this.O1.get(), this.f2569u1.u(this.J));
                    this.O1 = null;
                }
                WeakReference<d> weakReference4 = this.Q1;
                if (weakReference4 != null && weakReference4.get() != null) {
                    Z1(this.Q1.get(), this.f2569u1.u(this.L));
                    this.Q1 = null;
                }
                if (z13) {
                    this.f2569u1.T();
                }
            } catch (Exception e6) {
                e6.printStackTrace();
                System.out.println("EXCEPTION : " + e6);
            }
            if (z13) {
                C2(this.f2569u1, k.f2633n);
            } else {
                N1(this.f2569u1, w22);
                for (int i13 = 0; i13 < size; i13++) {
                    this.f2651o1.get(i13).N1(this.f2569u1, w22);
                }
            }
            if (z11 && i11 < 8 && k.f2633n[2]) {
                int i14 = 0;
                int i15 = 0;
                for (int i16 = 0; i16 < size; i16++) {
                    e eVar3 = this.f2651o1.get(i16);
                    i14 = Math.max(i14, eVar3.j0() + eVar3.f2511a0);
                    i15 = Math.max(i15, eVar3.D() + eVar3.f2513b0);
                }
                int max3 = Math.max(this.f2525h0, i14);
                int max4 = Math.max(this.f2527i0, i15);
                e.b bVar6 = e.b.WRAP_CONTENT;
                if (bVar3 != bVar6 || j0() >= max3) {
                    z6 = false;
                } else {
                    H1(max3);
                    this.U[0] = bVar6;
                    z6 = true;
                    z12 = true;
                }
                if (bVar2 == bVar6 && D() < max4) {
                    d1(max4);
                    this.U[1] = bVar6;
                    z6 = true;
                    z12 = true;
                }
            } else {
                z6 = false;
            }
            int max5 = Math.max(this.f2525h0, j0());
            if (max5 > j0()) {
                H1(max5);
                this.U[0] = e.b.FIXED;
                z6 = true;
                z12 = true;
            }
            int max6 = Math.max(this.f2527i0, D());
            if (max6 > D()) {
                d1(max6);
                r6 = 1;
                this.U[1] = e.b.FIXED;
                z6 = true;
                z7 = true;
            } else {
                r6 = 1;
                z7 = z12;
            }
            if (!z7) {
                e.b bVar7 = this.U[0];
                e.b bVar8 = e.b.WRAP_CONTENT;
                if (bVar7 == bVar8 && i6 > 0 && j0() > i6) {
                    this.K1 = r6;
                    this.U[0] = e.b.FIXED;
                    H1(i6);
                    z6 = r6;
                    z7 = z6;
                }
                if (this.U[r6] == bVar8 && i5 > 0 && D() > i5) {
                    this.L1 = r6;
                    this.U[r6] = e.b.FIXED;
                    d1(i5);
                    z12 = true;
                    z13 = true;
                    i10 = i11;
                    i7 = 0;
                }
            }
            z13 = z6;
            z12 = z7;
            i10 = i11;
            i7 = 0;
        }
        this.f2651o1 = arrayList;
        if (z12) {
            e.b[] bVarArr2 = this.U;
            bVarArr2[0] = bVar3;
            bVarArr2[1] = bVar2;
        }
        K0(this.f2569u1.G());
    }

    void U1(e eVar, int i5) {
        if (i5 == 0) {
            W1(eVar);
        } else if (i5 == 1) {
            b2(eVar);
        }
    }

    public boolean V1(androidx.constraintlayout.solver.g gVar) {
        boolean w22 = w2(64);
        g(gVar, w22);
        int size = this.f2651o1.size();
        boolean z5 = false;
        for (int i5 = 0; i5 < size; i5++) {
            e eVar = this.f2651o1.get(i5);
            eVar.l1(0, false);
            eVar.l1(1, false);
            if (eVar instanceof a) {
                z5 = true;
            }
        }
        if (z5) {
            for (int i6 = 0; i6 < size; i6++) {
                e eVar2 = this.f2651o1.get(i6);
                if (eVar2 instanceof a) {
                    ((a) eVar2).V1();
                }
            }
        }
        for (int i7 = 0; i7 < size; i7++) {
            e eVar3 = this.f2651o1.get(i7);
            if (eVar3.f()) {
                eVar3.g(gVar, w22);
            }
        }
        if (androidx.constraintlayout.solver.g.f2156v) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i8 = 0; i8 < size; i8++) {
                e eVar4 = this.f2651o1.get(i8);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            e(this, gVar, hashSet, H() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<e> it = hashSet.iterator();
            while (it.hasNext()) {
                e next = it.next();
                k.a(this, gVar, next);
                next.g(gVar, w22);
            }
        } else {
            for (int i9 = 0; i9 < size; i9++) {
                e eVar5 = this.f2651o1.get(i9);
                if (eVar5 instanceof f) {
                    e.b[] bVarArr = eVar5.U;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar5.i1(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.D1(e.b.FIXED);
                    }
                    eVar5.g(gVar, w22);
                    if (bVar == bVar3) {
                        eVar5.i1(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.D1(bVar2);
                    }
                } else {
                    k.a(this, gVar, eVar5);
                    if (!eVar5.f()) {
                        eVar5.g(gVar, w22);
                    }
                }
            }
        }
        if (this.f2574z1 > 0) {
            b.b(this, gVar, null, 0);
        }
        if (this.A1 > 0) {
            b.b(this, gVar, null, 1);
        }
        return true;
    }

    public void X1(d dVar) {
        WeakReference<d> weakReference = this.Q1;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.Q1.get().f()) {
            this.Q1 = new WeakReference<>(dVar);
        }
    }

    public void Y1(d dVar) {
        WeakReference<d> weakReference = this.O1;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.O1.get().f()) {
            this.O1 = new WeakReference<>(dVar);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.e
    public String c0() {
        return "ConstraintLayout";
    }

    void c2(d dVar) {
        WeakReference<d> weakReference = this.P1;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.P1.get().f()) {
            this.P1 = new WeakReference<>(dVar);
        }
    }

    void d2(d dVar) {
        WeakReference<d> weakReference = this.N1;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.N1.get().f()) {
            this.N1 = new WeakReference<>(dVar);
        }
    }

    public void e2() {
        this.f2565q1.f(H(), g0());
    }

    public boolean f2(boolean z5) {
        return this.f2565q1.g(z5);
    }

    public boolean g2(boolean z5) {
        return this.f2565q1.h(z5);
    }

    public boolean h2(boolean z5, int i5) {
        return this.f2565q1.i(z5, i5);
    }

    public void i2(androidx.constraintlayout.solver.h hVar) {
        this.f2568t1 = hVar;
        this.f2569u1.F(hVar);
    }

    public ArrayList<h> j2() {
        ArrayList<h> arrayList = new ArrayList<>();
        int size = this.f2651o1.size();
        for (int i5 = 0; i5 < size; i5++) {
            e eVar = this.f2651o1.get(i5);
            if (eVar instanceof h) {
                h hVar = (h) eVar;
                if (hVar.Q1() == 0) {
                    arrayList.add(hVar);
                }
            }
        }
        return arrayList;
    }

    public b.InterfaceC0021b k2() {
        return this.f2566r1;
    }

    public int l2() {
        return this.I1;
    }

    public androidx.constraintlayout.solver.g m2() {
        return this.f2569u1;
    }

    public ArrayList<h> n2() {
        ArrayList<h> arrayList = new ArrayList<>();
        int size = this.f2651o1.size();
        for (int i5 = 0; i5 < size; i5++) {
            e eVar = this.f2651o1.get(i5);
            if (eVar instanceof h) {
                h hVar = (h) eVar;
                if (hVar.Q1() == 1) {
                    arrayList.add(hVar);
                }
            }
        }
        return arrayList;
    }

    public boolean o2() {
        return false;
    }

    public void p2() {
        this.f2565q1.o();
    }

    public void q2() {
        this.f2565q1.p();
    }

    public boolean r2() {
        return this.L1;
    }

    public boolean s2() {
        return this.f2567s1;
    }

    public boolean t2() {
        return this.K1;
    }

    public long u2(int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f2570v1 = i12;
        this.f2571w1 = i13;
        return this.f2564p1.d(this, i5, i12, i13, i6, i7, i8, i9, i10, i11);
    }

    public boolean w2(int i5) {
        return (this.I1 & i5) == i5;
    }

    public void y2(b.InterfaceC0021b interfaceC0021b) {
        this.f2566r1 = interfaceC0021b;
        this.f2565q1.u(interfaceC0021b);
    }

    public void z2(int i5) {
        this.I1 = i5;
        androidx.constraintlayout.solver.g.f2156v = w2(512);
    }

    public f(int i5, int i6, int i7, int i8) {
        super(i5, i6, i7, i8);
        this.f2564p1 = new androidx.constraintlayout.solver.widgets.analyzer.b(this);
        this.f2565q1 = new androidx.constraintlayout.solver.widgets.analyzer.f(this);
        this.f2566r1 = null;
        this.f2567s1 = false;
        this.f2569u1 = new androidx.constraintlayout.solver.g();
        this.f2574z1 = 0;
        this.A1 = 0;
        this.B1 = new c[4];
        this.C1 = new c[4];
        this.D1 = false;
        this.E1 = false;
        this.F1 = false;
        this.G1 = 0;
        this.H1 = 0;
        this.I1 = 257;
        this.J1 = false;
        this.K1 = false;
        this.L1 = false;
        this.M1 = 0;
        this.N1 = null;
        this.O1 = null;
        this.P1 = null;
        this.Q1 = null;
        this.R1 = new b.a();
    }

    public f(int i5, int i6) {
        super(i5, i6);
        this.f2564p1 = new androidx.constraintlayout.solver.widgets.analyzer.b(this);
        this.f2565q1 = new androidx.constraintlayout.solver.widgets.analyzer.f(this);
        this.f2566r1 = null;
        this.f2567s1 = false;
        this.f2569u1 = new androidx.constraintlayout.solver.g();
        this.f2574z1 = 0;
        this.A1 = 0;
        this.B1 = new c[4];
        this.C1 = new c[4];
        this.D1 = false;
        this.E1 = false;
        this.F1 = false;
        this.G1 = 0;
        this.H1 = 0;
        this.I1 = 257;
        this.J1 = false;
        this.K1 = false;
        this.L1 = false;
        this.M1 = 0;
        this.N1 = null;
        this.O1 = null;
        this.P1 = null;
        this.Q1 = null;
        this.R1 = new b.a();
    }

    public f(String str, int i5, int i6) {
        super(i5, i6);
        this.f2564p1 = new androidx.constraintlayout.solver.widgets.analyzer.b(this);
        this.f2565q1 = new androidx.constraintlayout.solver.widgets.analyzer.f(this);
        this.f2566r1 = null;
        this.f2567s1 = false;
        this.f2569u1 = new androidx.constraintlayout.solver.g();
        this.f2574z1 = 0;
        this.A1 = 0;
        this.B1 = new c[4];
        this.C1 = new c[4];
        this.D1 = false;
        this.E1 = false;
        this.F1 = false;
        this.G1 = 0;
        this.H1 = 0;
        this.I1 = 257;
        this.J1 = false;
        this.K1 = false;
        this.L1 = false;
        this.M1 = 0;
        this.N1 = null;
        this.O1 = null;
        this.P1 = null;
        this.Q1 = null;
        this.R1 = new b.a();
        O0(str);
    }
}
