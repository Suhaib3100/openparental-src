package androidx.constraintlayout.solver;

import androidx.constraintlayout.motion.widget.r;
import androidx.constraintlayout.solver.b;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PriorityGoalRow.java */
/* loaded from: classes3.dex */
public class j extends androidx.constraintlayout.solver.b {

    /* renamed from: o, reason: collision with root package name */
    private static final float f2208o = 1.0E-4f;

    /* renamed from: p, reason: collision with root package name */
    private static final boolean f2209p = false;

    /* renamed from: q, reason: collision with root package name */
    static final int f2210q = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f2211i;

    /* renamed from: j, reason: collision with root package name */
    private k[] f2212j;

    /* renamed from: k, reason: collision with root package name */
    private k[] f2213k;

    /* renamed from: l, reason: collision with root package name */
    private int f2214l;

    /* renamed from: m, reason: collision with root package name */
    b f2215m;

    /* renamed from: n, reason: collision with root package name */
    c f2216n;

    /* compiled from: PriorityGoalRow.java */
    /* loaded from: classes.dex */
    class a implements Comparator<k> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(k kVar, k kVar2) {
            return kVar.f2232c - kVar2.f2232c;
        }
    }

    /* compiled from: PriorityGoalRow.java */
    /* loaded from: classes.dex */
    class b implements Comparable {

        /* renamed from: o, reason: collision with root package name */
        k f2218o;

        /* renamed from: p, reason: collision with root package name */
        j f2219p;

        public b(j jVar) {
            this.f2219p = jVar;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f2218o.f2232c - ((k) obj).f2232c;
        }

        public void g(k kVar) {
            for (int i5 = 0; i5 < 9; i5++) {
                float[] fArr = this.f2218o.f2238i;
                float f6 = fArr[i5] + kVar.f2238i[i5];
                fArr[i5] = f6;
                if (Math.abs(f6) < 1.0E-4f) {
                    this.f2218o.f2238i[i5] = 0.0f;
                }
            }
        }

        public boolean h(k kVar, float f6) {
            boolean z5 = true;
            if (!this.f2218o.f2230a) {
                for (int i5 = 0; i5 < 9; i5++) {
                    float f7 = kVar.f2238i[i5];
                    if (f7 != 0.0f) {
                        float f8 = f7 * f6;
                        if (Math.abs(f8) < 1.0E-4f) {
                            f8 = 0.0f;
                        }
                        this.f2218o.f2238i[i5] = f8;
                    } else {
                        this.f2218o.f2238i[i5] = 0.0f;
                    }
                }
                return true;
            }
            for (int i6 = 0; i6 < 9; i6++) {
                float[] fArr = this.f2218o.f2238i;
                float f9 = (kVar.f2238i[i6] * f6) + fArr[i6];
                fArr[i6] = f9;
                if (Math.abs(f9) < 1.0E-4f) {
                    this.f2218o.f2238i[i6] = 0.0f;
                } else {
                    z5 = false;
                }
            }
            if (z5) {
                j.this.J(this.f2218o);
            }
            return false;
        }

        public void j(k kVar) {
            this.f2218o = kVar;
        }

        public final boolean l() {
            for (int i5 = 8; i5 >= 0; i5--) {
                float f6 = this.f2218o.f2238i[i5];
                if (f6 > 0.0f) {
                    return false;
                }
                if (f6 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean o() {
            for (int i5 = 0; i5 < 9; i5++) {
                if (this.f2218o.f2238i[i5] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public final boolean p(k kVar) {
            int i5 = 8;
            while (true) {
                if (i5 < 0) {
                    break;
                }
                float f6 = kVar.f2238i[i5];
                float f7 = this.f2218o.f2238i[i5];
                if (f7 == f6) {
                    i5--;
                } else if (f7 < f6) {
                    return true;
                }
            }
            return false;
        }

        public void q() {
            Arrays.fill(this.f2218o.f2238i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f2218o != null) {
                for (int i5 = 0; i5 < 9; i5++) {
                    StringBuilder a6 = r.a(str);
                    a6.append(this.f2218o.f2238i[i5]);
                    a6.append(" ");
                    str = a6.toString();
                }
            }
            StringBuilder a7 = androidx.constraintlayout.motion.widget.c.a(str, "] ");
            a7.append(this.f2218o);
            return a7.toString();
        }
    }

    public j(c cVar) {
        super(cVar);
        this.f2211i = 128;
        this.f2212j = new k[128];
        this.f2213k = new k[128];
        this.f2214l = 0;
        this.f2215m = new b(this);
        this.f2216n = cVar;
    }

    private final void I(k kVar) {
        int i5;
        int i6 = this.f2214l + 1;
        k[] kVarArr = this.f2212j;
        if (i6 > kVarArr.length) {
            k[] kVarArr2 = (k[]) Arrays.copyOf(kVarArr, kVarArr.length * 2);
            this.f2212j = kVarArr2;
            this.f2213k = (k[]) Arrays.copyOf(kVarArr2, kVarArr2.length * 2);
        }
        k[] kVarArr3 = this.f2212j;
        int i7 = this.f2214l;
        kVarArr3[i7] = kVar;
        int i8 = i7 + 1;
        this.f2214l = i8;
        if (i8 > 1 && kVarArr3[i8 - 1].f2232c > kVar.f2232c) {
            int i9 = 0;
            while (true) {
                i5 = this.f2214l;
                if (i9 >= i5) {
                    break;
                }
                this.f2213k[i9] = this.f2212j[i9];
                i9++;
            }
            Arrays.sort(this.f2213k, 0, i5, new a());
            for (int i10 = 0; i10 < this.f2214l; i10++) {
                this.f2212j[i10] = this.f2213k[i10];
            }
        }
        kVar.f2230a = true;
        kVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(k kVar) {
        int i5 = 0;
        while (i5 < this.f2214l) {
            if (this.f2212j[i5] == kVar) {
                while (true) {
                    int i6 = this.f2214l;
                    if (i5 >= i6 - 1) {
                        this.f2214l = i6 - 1;
                        kVar.f2230a = false;
                        return;
                    } else {
                        k[] kVarArr = this.f2212j;
                        int i7 = i5 + 1;
                        kVarArr[i5] = kVarArr[i7];
                        i5 = i7;
                    }
                }
            } else {
                i5++;
            }
        }
    }

    @Override // androidx.constraintlayout.solver.b, androidx.constraintlayout.solver.g.a
    public void b(k kVar) {
        this.f2215m.j(kVar);
        this.f2215m.q();
        kVar.f2238i[kVar.f2234e] = 1.0f;
        I(kVar);
    }

    @Override // androidx.constraintlayout.solver.b, androidx.constraintlayout.solver.g.a
    public void c(g gVar, androidx.constraintlayout.solver.b bVar, boolean z5) {
        k kVar = bVar.f2142a;
        if (kVar == null) {
            return;
        }
        b.a aVar = bVar.f2146e;
        int d6 = aVar.d();
        for (int i5 = 0; i5 < d6; i5++) {
            k f6 = aVar.f(i5);
            float h5 = aVar.h(i5);
            this.f2215m.j(f6);
            if (this.f2215m.h(kVar, h5)) {
                I(f6);
            }
            this.f2143b = (bVar.f2143b * h5) + this.f2143b;
        }
        J(kVar);
    }

    @Override // androidx.constraintlayout.solver.b, androidx.constraintlayout.solver.g.a
    public void clear() {
        this.f2214l = 0;
        this.f2143b = 0.0f;
    }

    @Override // androidx.constraintlayout.solver.b, androidx.constraintlayout.solver.g.a
    public k d(g gVar, boolean[] zArr) {
        int i5 = -1;
        for (int i6 = 0; i6 < this.f2214l; i6++) {
            k kVar = this.f2212j[i6];
            if (!zArr[kVar.f2232c]) {
                this.f2215m.j(kVar);
                if (i5 == -1) {
                    if (!this.f2215m.l()) {
                    }
                    i5 = i6;
                } else {
                    if (!this.f2215m.p(this.f2212j[i5])) {
                    }
                    i5 = i6;
                }
            }
        }
        if (i5 == -1) {
            return null;
        }
        return this.f2212j[i5];
    }

    @Override // androidx.constraintlayout.solver.b, androidx.constraintlayout.solver.g.a
    public boolean isEmpty() {
        return this.f2214l == 0;
    }

    @Override // androidx.constraintlayout.solver.b
    public String toString() {
        String str = " goal -> (" + this.f2143b + ") : ";
        for (int i5 = 0; i5 < this.f2214l; i5++) {
            this.f2215m.j(this.f2212j[i5]);
            StringBuilder a6 = r.a(str);
            a6.append(this.f2215m);
            a6.append(" ");
            str = a6.toString();
        }
        return str;
    }
}
