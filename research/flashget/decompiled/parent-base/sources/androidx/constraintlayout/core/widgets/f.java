package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.b;
import androidx.constraintlayout.core.widgets.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ConstraintWidgetContainer.java */
/* loaded from: classes.dex */
public class f extends o {

    /* renamed from: g2, reason: collision with root package name */
    private static final int f22987g2 = 8;

    /* renamed from: h2, reason: collision with root package name */
    private static final boolean f22988h2 = false;

    /* renamed from: i2, reason: collision with root package name */
    private static final boolean f22989i2 = false;

    /* renamed from: j2, reason: collision with root package name */
    static final boolean f22990j2 = false;

    /* renamed from: k2, reason: collision with root package name */
    static int f22991k2;
    androidx.constraintlayout.core.widgets.analyzer.b B1;
    public androidx.constraintlayout.core.widgets.analyzer.e C1;
    private int D1;
    protected b.InterfaceC0389b E1;
    private boolean F1;
    public androidx.constraintlayout.core.g G1;
    protected androidx.constraintlayout.core.f H1;
    int I1;
    int J1;
    int K1;
    int L1;
    public int M1;
    public int N1;
    c[] O1;
    c[] P1;
    public boolean Q1;
    public boolean R1;
    public boolean S1;
    public int T1;
    public int U1;
    private int V1;
    public boolean W1;
    private boolean X1;
    private boolean Y1;
    int Z1;

    /* renamed from: a2, reason: collision with root package name */
    private WeakReference<d> f22992a2;

    /* renamed from: b2, reason: collision with root package name */
    private WeakReference<d> f22993b2;

    /* renamed from: c2, reason: collision with root package name */
    private WeakReference<d> f22994c2;

    /* renamed from: d2, reason: collision with root package name */
    private WeakReference<d> f22995d2;

    /* renamed from: e2, reason: collision with root package name */
    HashSet<e> f22996e2;

    /* renamed from: f2, reason: collision with root package name */
    public b.a f22997f2;

    public f() {
        this.B1 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.C1 = new androidx.constraintlayout.core.widgets.analyzer.e(this);
        this.E1 = null;
        this.F1 = false;
        this.H1 = new androidx.constraintlayout.core.f();
        this.M1 = 0;
        this.N1 = 0;
        this.O1 = new c[4];
        this.P1 = new c[4];
        this.Q1 = false;
        this.R1 = false;
        this.S1 = false;
        this.T1 = 0;
        this.U1 = 0;
        this.V1 = 257;
        this.W1 = false;
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = 0;
        this.f22992a2 = null;
        this.f22993b2 = null;
        this.f22994c2 = null;
        this.f22995d2 = null;
        this.f22996e2 = new HashSet<>();
        this.f22997f2 = new b.a();
    }

    public static boolean R2(int i4, e eVar, b.InterfaceC0389b interfaceC0389b, b.a aVar, int i5) {
        int i6;
        int i7;
        if (interfaceC0389b == null) {
            return false;
        }
        if (eVar.l0() == 8 || (eVar instanceof h) || (eVar instanceof a)) {
            aVar.f22789e = 0;
            aVar.f22790f = 0;
            return false;
        }
        aVar.f22785a = eVar.H();
        aVar.f22786b = eVar.j0();
        aVar.f22787c = eVar.m0();
        aVar.f22788d = eVar.D();
        aVar.f22793i = false;
        aVar.f22794j = i5;
        e.b bVar = aVar.f22785a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z4 = bVar == bVar2;
        boolean z5 = aVar.f22786b == bVar2;
        boolean z6 = z4 && eVar.f22944f0 > 0.0f;
        boolean z7 = z5 && eVar.f22944f0 > 0.0f;
        if (z4 && eVar.r0(0) && eVar.f22977w == 0 && !z6) {
            aVar.f22785a = e.b.WRAP_CONTENT;
            if (z5 && eVar.f22979x == 0) {
                aVar.f22785a = e.b.FIXED;
            }
            z4 = false;
        }
        if (z5 && eVar.r0(1) && eVar.f22979x == 0 && !z7) {
            aVar.f22786b = e.b.WRAP_CONTENT;
            if (z4 && eVar.f22977w == 0) {
                aVar.f22786b = e.b.FIXED;
            }
            z5 = false;
        }
        if (eVar.G0()) {
            aVar.f22785a = e.b.FIXED;
            z4 = false;
        }
        if (eVar.H0()) {
            aVar.f22786b = e.b.FIXED;
            z5 = false;
        }
        if (z6) {
            if (eVar.f22981y[0] == 4) {
                aVar.f22785a = e.b.FIXED;
            } else if (!z5) {
                e.b bVar3 = aVar.f22786b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i7 = aVar.f22788d;
                } else {
                    aVar.f22785a = e.b.WRAP_CONTENT;
                    interfaceC0389b.b(eVar, aVar);
                    i7 = aVar.f22790f;
                }
                aVar.f22785a = bVar4;
                aVar.f22787c = (int) (eVar.A() * i7);
            }
        }
        if (z7) {
            if (eVar.f22981y[1] == 4) {
                aVar.f22786b = e.b.FIXED;
            } else if (!z4) {
                e.b bVar5 = aVar.f22785a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i6 = aVar.f22787c;
                } else {
                    aVar.f22786b = e.b.WRAP_CONTENT;
                    interfaceC0389b.b(eVar, aVar);
                    i6 = aVar.f22789e;
                }
                aVar.f22786b = bVar6;
                if (eVar.B() == -1) {
                    aVar.f22788d = (int) (i6 / eVar.A());
                } else {
                    aVar.f22788d = (int) (eVar.A() * i6);
                }
            }
        }
        interfaceC0389b.b(eVar, aVar);
        eVar.c2(aVar.f22789e);
        eVar.y1(aVar.f22790f);
        eVar.x1(aVar.f22792h);
        eVar.g1(aVar.f22791g);
        aVar.f22794j = b.a.f22782k;
        return aVar.f22793i;
    }

    private void T2() {
        this.M1 = 0;
        this.N1 = 0;
    }

    private void s2(e eVar) {
        int i4 = this.M1 + 1;
        c[] cVarArr = this.P1;
        if (i4 >= cVarArr.length) {
            this.P1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.P1[this.M1] = new c(eVar, 0, O2());
        this.M1++;
    }

    private void v2(d dVar, androidx.constraintlayout.core.j jVar) {
        this.H1.i(jVar, this.H1.u(dVar), 0, 5);
    }

    private void w2(d dVar, androidx.constraintlayout.core.j jVar) {
        this.H1.i(this.H1.u(dVar), jVar, 0, 5);
    }

    private void x2(e eVar) {
        int i4 = this.N1 + 1;
        c[] cVarArr = this.O1;
        if (i4 >= cVarArr.length) {
            this.O1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.O1[this.N1] = new c(eVar, 1, O2());
        this.N1++;
    }

    public void A2() {
        this.C1.f(H(), j0());
    }

    public boolean B2(boolean z4) {
        return this.C1.g(z4);
    }

    public boolean C2(boolean z4) {
        return this.C1.h(z4);
    }

    public boolean D2(boolean z4, int i4) {
        return this.C1.i(z4, i4);
    }

    public void E2(androidx.constraintlayout.core.g gVar) {
        this.G1 = gVar;
        this.H1.F(gVar);
    }

    public ArrayList<h> F2() {
        ArrayList<h> arrayList = new ArrayList<>();
        int size = this.A1.size();
        for (int i4 = 0; i4 < size; i4++) {
            e eVar = this.A1.get(i4);
            if (eVar instanceof h) {
                h hVar = (h) eVar;
                if (hVar.m2() == 0) {
                    arrayList.add(hVar);
                }
            }
        }
        return arrayList;
    }

    public b.InterfaceC0389b G2() {
        return this.E1;
    }

    public int H2() {
        return this.V1;
    }

    public androidx.constraintlayout.core.f I2() {
        return this.H1;
    }

    public ArrayList<h> J2() {
        ArrayList<h> arrayList = new ArrayList<>();
        int size = this.A1.size();
        for (int i4 = 0; i4 < size; i4++) {
            e eVar = this.A1.get(i4);
            if (eVar instanceof h) {
                h hVar = (h) eVar;
                if (hVar.m2() == 1) {
                    arrayList.add(hVar);
                }
            }
        }
        return arrayList;
    }

    public boolean K2() {
        return false;
    }

    public void L2() {
        this.C1.o();
    }

    public void M2() {
        this.C1.p();
    }

    public boolean N2() {
        return this.Y1;
    }

    public boolean O2() {
        return this.F1;
    }

    public boolean P2() {
        return this.X1;
    }

    public long Q2(int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13, int i14) {
        this.I1 = i13;
        this.J1 = i14;
        return this.B1.d(this, i4, i13, i14, i5, i6, i7, i10, i11, i12);
    }

    @Override // androidx.constraintlayout.core.widgets.o, androidx.constraintlayout.core.widgets.e
    public void R0() {
        this.H1.Y();
        this.I1 = 0;
        this.K1 = 0;
        this.J1 = 0;
        this.L1 = 0;
        this.W1 = false;
        super.R0();
    }

    public boolean S2(int i4) {
        return (this.V1 & i4) == i4;
    }

    public void U2(b.InterfaceC0389b interfaceC0389b) {
        this.E1 = interfaceC0389b;
        this.C1.u(interfaceC0389b);
    }

    public void V2(int i4) {
        this.V1 = i4;
        androidx.constraintlayout.core.f.f21838v = S2(512);
    }

    public void W2(int i4, int i5, int i6, int i7) {
        this.I1 = i4;
        this.J1 = i5;
        this.K1 = i6;
        this.L1 = i7;
    }

    public void X2(int i4) {
        this.D1 = i4;
    }

    public void Y2(boolean z4) {
        this.F1 = z4;
    }

    public boolean Z2(androidx.constraintlayout.core.f fVar, boolean[] zArr) {
        zArr[2] = false;
        boolean S2 = S2(64);
        j2(fVar, S2);
        int size = this.A1.size();
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            e eVar = this.A1.get(i4);
            eVar.j2(fVar, S2);
            if (eVar.t0()) {
                z4 = true;
            }
        }
        return z4;
    }

    public void a3() {
        this.B1.e(this);
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void b0(StringBuilder sb) {
        sb.append(this.f22961o + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f22940d0);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f22942e0);
        sb.append("\n");
        Iterator<e> it = l2().iterator();
        while (it.hasNext()) {
            it.next().b0(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public String f0() {
        return "ConstraintLayout";
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void i2(boolean z4, boolean z5) {
        super.i2(z4, z5);
        int size = this.A1.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.A1.get(i4).i2(z4, z5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0318  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // androidx.constraintlayout.core.widgets.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n2() {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.f.n2():void");
    }

    void q2(e eVar, int i4) {
        if (i4 == 0) {
            s2(eVar);
        } else if (i4 == 1) {
            x2(eVar);
        }
    }

    public boolean r2(androidx.constraintlayout.core.f fVar) {
        boolean S2 = S2(64);
        g(fVar, S2);
        int size = this.A1.size();
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            e eVar = this.A1.get(i4);
            eVar.G1(0, false);
            eVar.G1(1, false);
            if (eVar instanceof a) {
                z4 = true;
            }
        }
        if (z4) {
            for (int i5 = 0; i5 < size; i5++) {
                e eVar2 = this.A1.get(i5);
                if (eVar2 instanceof a) {
                    ((a) eVar2).s2();
                }
            }
        }
        this.f22996e2.clear();
        for (int i6 = 0; i6 < size; i6++) {
            e eVar3 = this.A1.get(i6);
            if (eVar3.f()) {
                if (eVar3 instanceof n) {
                    this.f22996e2.add(eVar3);
                } else {
                    eVar3.g(fVar, S2);
                }
            }
        }
        while (this.f22996e2.size() > 0) {
            int size2 = this.f22996e2.size();
            Iterator<e> it = this.f22996e2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                n nVar = (n) it.next();
                if (nVar.o2(this.f22996e2)) {
                    nVar.g(fVar, S2);
                    this.f22996e2.remove(nVar);
                    break;
                }
            }
            if (size2 == this.f22996e2.size()) {
                Iterator<e> it2 = this.f22996e2.iterator();
                while (it2.hasNext()) {
                    it2.next().g(fVar, S2);
                }
                this.f22996e2.clear();
            }
        }
        if (androidx.constraintlayout.core.f.f21838v) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i7 = 0; i7 < size; i7++) {
                e eVar4 = this.A1.get(i7);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            e(this, fVar, hashSet, H() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<e> it3 = hashSet.iterator();
            while (it3.hasNext()) {
                e next = it3.next();
                k.a(this, fVar, next);
                next.g(fVar, S2);
            }
        } else {
            for (int i10 = 0; i10 < size; i10++) {
                e eVar5 = this.A1.get(i10);
                if (eVar5 instanceof f) {
                    e.b[] bVarArr = eVar5.f22936b0;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar5.D1(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.Y1(e.b.FIXED);
                    }
                    eVar5.g(fVar, S2);
                    if (bVar == bVar3) {
                        eVar5.D1(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.Y1(bVar2);
                    }
                } else {
                    k.a(this, fVar, eVar5);
                    if (!eVar5.f()) {
                        eVar5.g(fVar, S2);
                    }
                }
            }
        }
        if (this.M1 > 0) {
            b.b(this, fVar, null, 0);
        }
        if (this.N1 > 0) {
            b.b(this, fVar, null, 1);
        }
        return true;
    }

    public void t2(d dVar) {
        WeakReference<d> weakReference = this.f22995d2;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.f22995d2.get().f()) {
            this.f22995d2 = new WeakReference<>(dVar);
        }
    }

    public void u2(d dVar) {
        WeakReference<d> weakReference = this.f22993b2;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.f22993b2.get().f()) {
            this.f22993b2 = new WeakReference<>(dVar);
        }
    }

    void y2(d dVar) {
        WeakReference<d> weakReference = this.f22994c2;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.f22994c2.get().f()) {
            this.f22994c2 = new WeakReference<>(dVar);
        }
    }

    void z2(d dVar) {
        WeakReference<d> weakReference = this.f22992a2;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.f22992a2.get().f()) {
            this.f22992a2 = new WeakReference<>(dVar);
        }
    }

    public f(int i4, int i5, int i6, int i7) {
        super(i4, i5, i6, i7);
        this.B1 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.C1 = new androidx.constraintlayout.core.widgets.analyzer.e(this);
        this.E1 = null;
        this.F1 = false;
        this.H1 = new androidx.constraintlayout.core.f();
        this.M1 = 0;
        this.N1 = 0;
        this.O1 = new c[4];
        this.P1 = new c[4];
        this.Q1 = false;
        this.R1 = false;
        this.S1 = false;
        this.T1 = 0;
        this.U1 = 0;
        this.V1 = 257;
        this.W1 = false;
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = 0;
        this.f22992a2 = null;
        this.f22993b2 = null;
        this.f22994c2 = null;
        this.f22995d2 = null;
        this.f22996e2 = new HashSet<>();
        this.f22997f2 = new b.a();
    }

    public f(int i4, int i5) {
        super(i4, i5);
        this.B1 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.C1 = new androidx.constraintlayout.core.widgets.analyzer.e(this);
        this.E1 = null;
        this.F1 = false;
        this.H1 = new androidx.constraintlayout.core.f();
        this.M1 = 0;
        this.N1 = 0;
        this.O1 = new c[4];
        this.P1 = new c[4];
        this.Q1 = false;
        this.R1 = false;
        this.S1 = false;
        this.T1 = 0;
        this.U1 = 0;
        this.V1 = 257;
        this.W1 = false;
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = 0;
        this.f22992a2 = null;
        this.f22993b2 = null;
        this.f22994c2 = null;
        this.f22995d2 = null;
        this.f22996e2 = new HashSet<>();
        this.f22997f2 = new b.a();
    }

    public f(String str, int i4, int i5) {
        super(i4, i5);
        this.B1 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.C1 = new androidx.constraintlayout.core.widgets.analyzer.e(this);
        this.E1 = null;
        this.F1 = false;
        this.H1 = new androidx.constraintlayout.core.f();
        this.M1 = 0;
        this.N1 = 0;
        this.O1 = new c[4];
        this.P1 = new c[4];
        this.Q1 = false;
        this.R1 = false;
        this.S1 = false;
        this.T1 = 0;
        this.U1 = 0;
        this.V1 = 257;
        this.W1 = false;
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = 0;
        this.f22992a2 = null;
        this.f22993b2 = null;
        this.f22994c2 = null;
        this.f22995d2 = null;
        this.f22996e2 = new HashSet<>();
        this.f22997f2 = new b.a();
        j1(str);
    }
}
