package androidx.constraintlayout.core;

import androidx.constraintlayout.core.f;
import androidx.constraintlayout.core.j;
import java.util.ArrayList;

/* compiled from: ArrayRow.java */
/* loaded from: classes.dex */
public class b implements f.a {

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f21822g = false;

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f21823h = false;

    /* renamed from: e, reason: collision with root package name */
    public a f21828e;

    /* renamed from: a, reason: collision with root package name */
    j f21824a = null;

    /* renamed from: b, reason: collision with root package name */
    float f21825b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    boolean f21826c = false;

    /* renamed from: d, reason: collision with root package name */
    ArrayList<j> f21827d = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    boolean f21829f = false;

    /* compiled from: ArrayRow.java */
    public interface a {
        void clear();

        int e();

        int f(j jVar);

        boolean g(j jVar);

        j h(int i4);

        void i(j jVar, float f4, boolean z4);

        void j();

        float k(j jVar, boolean z4);

        int l();

        void m();

        float n(b bVar, boolean z4);

        void o(j jVar, float f4);

        float p(int i4);

        float q(j jVar);

        void r(float f4);
    }

    public b() {
    }

    private j B(boolean[] zArr, j jVar) {
        j.b bVar;
        int e4 = this.f21828e.e();
        j jVar2 = null;
        float f4 = 0.0f;
        for (int i4 = 0; i4 < e4; i4++) {
            float p4 = this.f21828e.p(i4);
            if (p4 < 0.0f) {
                j h4 = this.f21828e.h(i4);
                if ((zArr == null || !zArr[h4.f21913d]) && h4 != jVar && (((bVar = h4.f21920k) == j.b.SLACK || bVar == j.b.ERROR) && p4 < f4)) {
                    f4 = p4;
                    jVar2 = h4;
                }
            }
        }
        return jVar2;
    }

    private boolean z(j jVar, f fVar) {
        return jVar.f21923n <= 1;
    }

    public j A(j jVar) {
        return B(null, jVar);
    }

    void C(j jVar) {
        j jVar2 = this.f21824a;
        if (jVar2 != null) {
            this.f21828e.o(jVar2, -1.0f);
            this.f21824a.f21914e = -1;
            this.f21824a = null;
        }
        float k4 = this.f21828e.k(jVar, true) * (-1.0f);
        this.f21824a = jVar;
        if (k4 == 1.0f) {
            return;
        }
        this.f21825b /= k4;
        this.f21828e.r(k4);
    }

    public void D() {
        this.f21824a = null;
        this.f21828e.clear();
        this.f21825b = 0.0f;
        this.f21829f = false;
    }

    int E() {
        return this.f21828e.l() + (this.f21824a != null ? 4 : 0) + 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String F() {
        /*
            r10 = this;
            androidx.constraintlayout.core.j r0 = r10.f21824a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            androidx.constraintlayout.core.j r1 = r10.f21824a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = androidx.compose.runtime.changelist.j.a(r0, r1)
            float r1 = r10.f21825b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = androidx.compose.material3.j4.a(r0)
            float r1 = r10.f21825b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L36
        L35:
            r1 = r3
        L36:
            androidx.constraintlayout.core.b$a r5 = r10.f21828e
            int r5 = r5.e()
        L3c:
            if (r3 >= r5) goto L9c
            androidx.constraintlayout.core.b$a r6 = r10.f21828e
            androidx.constraintlayout.core.j r6 = r6.h(r3)
            if (r6 != 0) goto L47
            goto L99
        L47:
            androidx.constraintlayout.core.b$a r7 = r10.f21828e
            float r7 = r7.p(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = androidx.compose.runtime.changelist.j.a(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = androidx.compose.runtime.changelist.j.a(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = androidx.compose.runtime.changelist.j.a(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = androidx.compose.runtime.changelist.j.a(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r4
        L99:
            int r3 = r3 + 1
            goto L3c
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = androidx.compose.runtime.changelist.j.a(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.b.F():java.lang.String");
    }

    public void G(f fVar, j jVar, boolean z4) {
        if (jVar == null || !jVar.f21924o) {
            return;
        }
        float q4 = this.f21828e.q(jVar);
        this.f21825b = (jVar.f21926q * q4) + this.f21825b;
        this.f21828e.k(jVar, z4);
        if (z4) {
            jVar.f(this);
        }
        this.f21828e.i(fVar.f21856n.f21833d[jVar.f21925p], q4, z4);
        if (f.f21840x && this.f21828e.e() == 0) {
            this.f21829f = true;
            fVar.f21843a = true;
        }
    }

    @Override // androidx.constraintlayout.core.f.a
    public void a(f fVar, j jVar, boolean z4) {
        if (jVar == null || !jVar.f21917h) {
            return;
        }
        float q4 = this.f21828e.q(jVar);
        this.f21825b = (jVar.f21916g * q4) + this.f21825b;
        this.f21828e.k(jVar, z4);
        if (z4) {
            jVar.f(this);
        }
        if (f.f21840x && this.f21828e.e() == 0) {
            this.f21829f = true;
            fVar.f21843a = true;
        }
    }

    @Override // androidx.constraintlayout.core.f.a
    public void b(f fVar) {
        if (fVar.f21849g.length == 0) {
            return;
        }
        boolean z4 = false;
        while (!z4) {
            int e4 = this.f21828e.e();
            for (int i4 = 0; i4 < e4; i4++) {
                j h4 = this.f21828e.h(i4);
                if (h4.f21914e != -1 || h4.f21917h || h4.f21924o) {
                    this.f21827d.add(h4);
                }
            }
            int size = this.f21827d.size();
            if (size > 0) {
                for (int i5 = 0; i5 < size; i5++) {
                    j jVar = this.f21827d.get(i5);
                    if (jVar.f21917h) {
                        a(fVar, jVar, true);
                    } else if (jVar.f21924o) {
                        G(fVar, jVar, true);
                    } else {
                        c(fVar, fVar.f21849g[jVar.f21914e], true);
                    }
                }
                this.f21827d.clear();
            } else {
                z4 = true;
            }
        }
        if (f.f21840x && this.f21824a != null && this.f21828e.e() == 0) {
            this.f21829f = true;
            fVar.f21843a = true;
        }
    }

    @Override // androidx.constraintlayout.core.f.a
    public void c(f fVar, b bVar, boolean z4) {
        float n4 = this.f21828e.n(bVar, z4);
        this.f21825b = (bVar.f21825b * n4) + this.f21825b;
        if (z4) {
            bVar.f21824a.f(this);
        }
        if (f.f21840x && this.f21824a != null && this.f21828e.e() == 0) {
            this.f21829f = true;
            fVar.f21843a = true;
        }
    }

    @Override // androidx.constraintlayout.core.f.a
    public void clear() {
        this.f21828e.clear();
        this.f21824a = null;
        this.f21825b = 0.0f;
    }

    @Override // androidx.constraintlayout.core.f.a
    public void d(f.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f21824a = null;
            this.f21828e.clear();
            for (int i4 = 0; i4 < bVar.f21828e.e(); i4++) {
                this.f21828e.i(bVar.f21828e.h(i4), bVar.f21828e.p(i4), true);
            }
        }
    }

    @Override // androidx.constraintlayout.core.f.a
    public j e(f fVar, boolean[] zArr) {
        return B(zArr, null);
    }

    @Override // androidx.constraintlayout.core.f.a
    public void f(j jVar) {
        int i4 = jVar.f21915f;
        float f4 = 1.0f;
        if (i4 != 1) {
            if (i4 == 2) {
                f4 = 1000.0f;
            } else if (i4 == 3) {
                f4 = 1000000.0f;
            } else if (i4 == 4) {
                f4 = 1.0E9f;
            } else if (i4 == 5) {
                f4 = 1.0E12f;
            }
        }
        this.f21828e.o(jVar, f4);
    }

    public b g(f fVar, int i4) {
        this.f21828e.o(fVar.s(i4, "ep"), 1.0f);
        this.f21828e.o(fVar.s(i4, "em"), -1.0f);
        return this;
    }

    @Override // androidx.constraintlayout.core.f.a
    public j getKey() {
        return this.f21824a;
    }

    b h(j jVar, int i4) {
        this.f21828e.o(jVar, i4);
        return this;
    }

    boolean i(f fVar) {
        boolean z4;
        j j4 = j(fVar);
        if (j4 == null) {
            z4 = true;
        } else {
            C(j4);
            z4 = false;
        }
        if (this.f21828e.e() == 0) {
            this.f21829f = true;
        }
        return z4;
    }

    @Override // androidx.constraintlayout.core.f.a
    public boolean isEmpty() {
        return this.f21824a == null && this.f21825b == 0.0f && this.f21828e.e() == 0;
    }

    j j(f fVar) {
        boolean z4;
        boolean z5;
        int e4 = this.f21828e.e();
        j jVar = null;
        float f4 = 0.0f;
        float f5 = 0.0f;
        boolean z6 = false;
        boolean z7 = false;
        j jVar2 = null;
        for (int i4 = 0; i4 < e4; i4++) {
            float p4 = this.f21828e.p(i4);
            j h4 = this.f21828e.h(i4);
            if (h4.f21920k == j.b.UNRESTRICTED) {
                if (jVar == null) {
                    z5 = z(h4, fVar);
                } else if (f4 > p4) {
                    z5 = z(h4, fVar);
                } else if (!z6 && z(h4, fVar)) {
                    f4 = p4;
                    jVar = h4;
                    z6 = true;
                }
                z6 = z5;
                f4 = p4;
                jVar = h4;
            } else if (jVar == null && p4 < 0.0f) {
                if (jVar2 == null) {
                    z4 = z(h4, fVar);
                } else if (f5 > p4) {
                    z4 = z(h4, fVar);
                } else if (!z7 && z(h4, fVar)) {
                    f5 = p4;
                    jVar2 = h4;
                    z7 = true;
                }
                z7 = z4;
                f5 = p4;
                jVar2 = h4;
            }
        }
        return jVar != null ? jVar : jVar2;
    }

    b k(j jVar, j jVar2, int i4, float f4, j jVar3, j jVar4, int i5) {
        if (jVar2 == jVar3) {
            this.f21828e.o(jVar, 1.0f);
            this.f21828e.o(jVar4, 1.0f);
            this.f21828e.o(jVar2, -2.0f);
            return this;
        }
        if (f4 == 0.5f) {
            this.f21828e.o(jVar, 1.0f);
            this.f21828e.o(jVar2, -1.0f);
            this.f21828e.o(jVar3, -1.0f);
            this.f21828e.o(jVar4, 1.0f);
            if (i4 > 0 || i5 > 0) {
                this.f21825b = (-i4) + i5;
            }
        } else if (f4 <= 0.0f) {
            this.f21828e.o(jVar, -1.0f);
            this.f21828e.o(jVar2, 1.0f);
            this.f21825b = i4;
        } else if (f4 >= 1.0f) {
            this.f21828e.o(jVar4, -1.0f);
            this.f21828e.o(jVar3, 1.0f);
            this.f21825b = -i5;
        } else {
            float f5 = 1.0f - f4;
            this.f21828e.o(jVar, f5 * 1.0f);
            this.f21828e.o(jVar2, f5 * (-1.0f));
            this.f21828e.o(jVar3, (-1.0f) * f4);
            this.f21828e.o(jVar4, 1.0f * f4);
            if (i4 > 0 || i5 > 0) {
                this.f21825b = (i5 * f4) + ((-i4) * f5);
            }
        }
        return this;
    }

    b l(j jVar, int i4) {
        this.f21824a = jVar;
        float f4 = i4;
        jVar.f21916g = f4;
        this.f21825b = f4;
        this.f21829f = true;
        return this;
    }

    b m(j jVar, j jVar2, float f4) {
        this.f21828e.o(jVar, -1.0f);
        this.f21828e.o(jVar2, f4);
        return this;
    }

    public b n(j jVar, j jVar2, j jVar3, j jVar4, float f4) {
        this.f21828e.o(jVar, -1.0f);
        this.f21828e.o(jVar2, 1.0f);
        this.f21828e.o(jVar3, f4);
        this.f21828e.o(jVar4, -f4);
        return this;
    }

    public b o(float f4, float f5, float f6, j jVar, int i4, j jVar2, int i5, j jVar3, int i6, j jVar4, int i7) {
        if (f5 == 0.0f || f4 == f6) {
            this.f21825b = ((-i4) - i5) + i6 + i7;
            this.f21828e.o(jVar, 1.0f);
            this.f21828e.o(jVar2, -1.0f);
            this.f21828e.o(jVar4, 1.0f);
            this.f21828e.o(jVar3, -1.0f);
        } else {
            float f7 = (f4 / f5) / (f6 / f5);
            this.f21825b = (i7 * f7) + (i6 * f7) + ((-i4) - i5);
            this.f21828e.o(jVar, 1.0f);
            this.f21828e.o(jVar2, -1.0f);
            this.f21828e.o(jVar4, f7);
            this.f21828e.o(jVar3, -f7);
        }
        return this;
    }

    public b p(float f4, float f5, float f6, j jVar, j jVar2, j jVar3, j jVar4) {
        this.f21825b = 0.0f;
        if (f5 == 0.0f || f4 == f6) {
            this.f21828e.o(jVar, 1.0f);
            this.f21828e.o(jVar2, -1.0f);
            this.f21828e.o(jVar4, 1.0f);
            this.f21828e.o(jVar3, -1.0f);
        } else if (f4 == 0.0f) {
            this.f21828e.o(jVar, 1.0f);
            this.f21828e.o(jVar2, -1.0f);
        } else if (f6 == 0.0f) {
            this.f21828e.o(jVar3, 1.0f);
            this.f21828e.o(jVar4, -1.0f);
        } else {
            float f7 = (f4 / f5) / (f6 / f5);
            this.f21828e.o(jVar, 1.0f);
            this.f21828e.o(jVar2, -1.0f);
            this.f21828e.o(jVar4, f7);
            this.f21828e.o(jVar3, -f7);
        }
        return this;
    }

    public b q(j jVar, int i4) {
        if (i4 < 0) {
            this.f21825b = i4 * (-1);
            this.f21828e.o(jVar, 1.0f);
        } else {
            this.f21825b = i4;
            this.f21828e.o(jVar, -1.0f);
        }
        return this;
    }

    public b r(j jVar, j jVar2, int i4) {
        boolean z4 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z4 = true;
            }
            this.f21825b = i4;
        }
        if (z4) {
            this.f21828e.o(jVar, 1.0f);
            this.f21828e.o(jVar2, -1.0f);
        } else {
            this.f21828e.o(jVar, -1.0f);
            this.f21828e.o(jVar2, 1.0f);
        }
        return this;
    }

    public b s(j jVar, int i4, j jVar2) {
        this.f21825b = i4;
        this.f21828e.o(jVar, -1.0f);
        return this;
    }

    public b t(j jVar, j jVar2, j jVar3, int i4) {
        boolean z4 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z4 = true;
            }
            this.f21825b = i4;
        }
        if (z4) {
            this.f21828e.o(jVar, 1.0f);
            this.f21828e.o(jVar2, -1.0f);
            this.f21828e.o(jVar3, -1.0f);
        } else {
            this.f21828e.o(jVar, -1.0f);
            this.f21828e.o(jVar2, 1.0f);
            this.f21828e.o(jVar3, 1.0f);
        }
        return this;
    }

    public String toString() {
        return F();
    }

    public b u(j jVar, j jVar2, j jVar3, int i4) {
        boolean z4 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z4 = true;
            }
            this.f21825b = i4;
        }
        if (z4) {
            this.f21828e.o(jVar, 1.0f);
            this.f21828e.o(jVar2, -1.0f);
            this.f21828e.o(jVar3, 1.0f);
        } else {
            this.f21828e.o(jVar, -1.0f);
            this.f21828e.o(jVar2, 1.0f);
            this.f21828e.o(jVar3, -1.0f);
        }
        return this;
    }

    public b v(j jVar, j jVar2, j jVar3, j jVar4, float f4) {
        this.f21828e.o(jVar3, 0.5f);
        this.f21828e.o(jVar4, 0.5f);
        this.f21828e.o(jVar, -0.5f);
        this.f21828e.o(jVar2, -0.5f);
        this.f21825b = -f4;
        return this;
    }

    void w() {
        float f4 = this.f21825b;
        if (f4 < 0.0f) {
            this.f21825b = f4 * (-1.0f);
            this.f21828e.j();
        }
    }

    boolean x() {
        j jVar = this.f21824a;
        return jVar != null && (jVar.f21920k == j.b.UNRESTRICTED || this.f21825b >= 0.0f);
    }

    boolean y(j jVar) {
        return this.f21828e.g(jVar);
    }

    public b(c cVar) {
        this.f21828e = new androidx.constraintlayout.core.a(this, cVar);
    }
}
