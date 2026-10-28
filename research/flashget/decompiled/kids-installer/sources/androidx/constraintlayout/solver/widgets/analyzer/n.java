package androidx.constraintlayout.solver.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: RunGroup.java */
/* loaded from: classes.dex */
class n {

    /* renamed from: h, reason: collision with root package name */
    public static final int f2419h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f2420i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f2421j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static int f2422k;

    /* renamed from: c, reason: collision with root package name */
    q f2425c;

    /* renamed from: d, reason: collision with root package name */
    q f2426d;

    /* renamed from: f, reason: collision with root package name */
    int f2428f;

    /* renamed from: g, reason: collision with root package name */
    int f2429g;

    /* renamed from: a, reason: collision with root package name */
    public int f2423a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2424b = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList<q> f2427e = new ArrayList<>();

    public n(q qVar, int i5) {
        this.f2425c = null;
        this.f2426d = null;
        int i6 = f2422k;
        this.f2428f = i6;
        f2422k = i6 + 1;
        this.f2425c = qVar;
        this.f2426d = qVar;
        this.f2429g = i5;
    }

    private boolean c(q qVar, int i5) {
        g gVar;
        q qVar2;
        g gVar2;
        q qVar3;
        if (!qVar.f2450b.f2522g[i5]) {
            return false;
        }
        for (d dVar : qVar.f2456h.f2409k) {
            if ((dVar instanceof g) && (qVar3 = (gVar2 = (g) dVar).f2402d) != qVar && gVar2 == qVar3.f2456h) {
                if (qVar instanceof c) {
                    Iterator<q> it = ((c) qVar).f2387k.iterator();
                    while (it.hasNext()) {
                        c(it.next(), i5);
                    }
                } else if (!(qVar instanceof l)) {
                    qVar.f2450b.f2522g[i5] = false;
                }
                c(gVar2.f2402d, i5);
            }
        }
        for (d dVar2 : qVar.f2457i.f2409k) {
            if ((dVar2 instanceof g) && (qVar2 = (gVar = (g) dVar2).f2402d) != qVar && gVar == qVar2.f2456h) {
                if (qVar instanceof c) {
                    Iterator<q> it2 = ((c) qVar).f2387k.iterator();
                    while (it2.hasNext()) {
                        c(it2.next(), i5);
                    }
                } else if (!(qVar instanceof l)) {
                    qVar.f2450b.f2522g[i5] = false;
                }
                c(gVar.f2402d, i5);
            }
        }
        return false;
    }

    private long e(g gVar, long j5) {
        q qVar = gVar.f2402d;
        if (qVar instanceof l) {
            return j5;
        }
        int size = gVar.f2409k.size();
        long j6 = j5;
        for (int i5 = 0; i5 < size; i5++) {
            d dVar = gVar.f2409k.get(i5);
            if (dVar instanceof g) {
                g gVar2 = (g) dVar;
                if (gVar2.f2402d != qVar) {
                    j6 = Math.min(j6, e(gVar2, gVar2.f2404f + j5));
                }
            }
        }
        if (gVar != qVar.f2457i) {
            return j6;
        }
        long j7 = j5 - qVar.j();
        return Math.min(Math.min(j6, e(qVar.f2456h, j7)), j7 - qVar.f2456h.f2404f);
    }

    private long f(g gVar, long j5) {
        q qVar = gVar.f2402d;
        if (qVar instanceof l) {
            return j5;
        }
        int size = gVar.f2409k.size();
        long j6 = j5;
        for (int i5 = 0; i5 < size; i5++) {
            d dVar = gVar.f2409k.get(i5);
            if (dVar instanceof g) {
                g gVar2 = (g) dVar;
                if (gVar2.f2402d != qVar) {
                    j6 = Math.max(j6, f(gVar2, gVar2.f2404f + j5));
                }
            }
        }
        if (gVar != qVar.f2456h) {
            return j6;
        }
        long j7 = j5 + qVar.j();
        return Math.max(Math.max(j6, f(qVar.f2457i, j7)), j7 - qVar.f2457i.f2404f);
    }

    public void a(q qVar) {
        this.f2427e.add(qVar);
        this.f2426d = qVar;
    }

    public long b(androidx.constraintlayout.solver.widgets.f fVar, int i5) {
        q qVar = this.f2425c;
        if (qVar instanceof c) {
            if (((c) qVar).f2454f != i5) {
                return 0L;
            }
        } else if (i5 == 0) {
            if (!(qVar instanceof m)) {
                return 0L;
            }
        } else if (!(qVar instanceof o)) {
            return 0L;
        }
        g gVar = (i5 == 0 ? fVar.f2518e : fVar.f2520f).f2456h;
        g gVar2 = (i5 == 0 ? fVar.f2518e : fVar.f2520f).f2457i;
        boolean contains = qVar.f2456h.f2410l.contains(gVar);
        boolean contains2 = this.f2425c.f2457i.f2410l.contains(gVar2);
        long j5 = this.f2425c.j();
        if (!contains || !contains2) {
            if (contains) {
                return Math.max(f(this.f2425c.f2456h, r12.f2404f), this.f2425c.f2456h.f2404f + j5);
            }
            if (contains2) {
                return Math.max(-e(this.f2425c.f2457i, r12.f2404f), (-this.f2425c.f2457i.f2404f) + j5);
            }
            return (this.f2425c.j() + r12.f2456h.f2404f) - this.f2425c.f2457i.f2404f;
        }
        long f6 = f(this.f2425c.f2456h, 0L);
        long e6 = e(this.f2425c.f2457i, 0L);
        long j6 = f6 - j5;
        q qVar2 = this.f2425c;
        int i6 = qVar2.f2457i.f2404f;
        if (j6 >= (-i6)) {
            j6 += i6;
        }
        int i7 = qVar2.f2456h.f2404f;
        long j7 = ((-e6) - j5) - i7;
        if (j7 >= i7) {
            j7 -= i7;
        }
        float u5 = qVar2.f2450b.u(i5);
        float f7 = u5 > 0.0f ? (long) ((j6 / (1.0f - u5)) + (j7 / u5)) : 0L;
        long a6 = ((long) ((f7 * u5) + 0.5f)) + j5 + ((long) androidx.appcompat.graphics.drawable.d.a(1.0f, u5, f7, 0.5f));
        q qVar3 = this.f2425c;
        return (qVar3.f2456h.f2404f + a6) - qVar3.f2457i.f2404f;
    }

    public void d(boolean z5, boolean z6) {
        if (z5) {
            q qVar = this.f2425c;
            if (qVar instanceof m) {
                c(qVar, 0);
            }
        }
        if (z6) {
            q qVar2 = this.f2425c;
            if (qVar2 instanceof o) {
                c(qVar2, 1);
            }
        }
    }
}
