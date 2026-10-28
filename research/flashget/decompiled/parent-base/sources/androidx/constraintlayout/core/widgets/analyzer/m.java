package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: RunGroup.java */
/* loaded from: classes.dex */
class m {

    /* renamed from: h, reason: collision with root package name */
    public static final int f22830h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f22831i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f22832j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static int f22833k;

    /* renamed from: c, reason: collision with root package name */
    p f22836c;

    /* renamed from: d, reason: collision with root package name */
    p f22837d;

    /* renamed from: f, reason: collision with root package name */
    int f22839f;

    /* renamed from: g, reason: collision with root package name */
    int f22840g;

    /* renamed from: a, reason: collision with root package name */
    public int f22834a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22835b = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList<p> f22838e = new ArrayList<>();

    public m(p pVar, int i4) {
        this.f22836c = null;
        this.f22837d = null;
        int i5 = f22833k;
        this.f22839f = i5;
        f22833k = i5 + 1;
        this.f22836c = pVar;
        this.f22837d = pVar;
        this.f22840g = i4;
    }

    private boolean c(p pVar, int i4) {
        f fVar;
        p pVar2;
        f fVar2;
        p pVar3;
        if (!pVar.f22861b.f22945g[i4]) {
            return false;
        }
        for (d dVar : pVar.f22867h.f22817k) {
            if ((dVar instanceof f) && (pVar3 = (fVar2 = (f) dVar).f22810d) != pVar && fVar2 == pVar3.f22867h) {
                if (pVar instanceof c) {
                    Iterator<p> it = ((c) pVar).f22795k.iterator();
                    while (it.hasNext()) {
                        c(it.next(), i4);
                    }
                } else if (!(pVar instanceof k)) {
                    pVar.f22861b.f22945g[i4] = false;
                }
                c(fVar2.f22810d, i4);
            }
        }
        for (d dVar2 : pVar.f22868i.f22817k) {
            if ((dVar2 instanceof f) && (pVar2 = (fVar = (f) dVar2).f22810d) != pVar && fVar == pVar2.f22867h) {
                if (pVar instanceof c) {
                    Iterator<p> it2 = ((c) pVar).f22795k.iterator();
                    while (it2.hasNext()) {
                        c(it2.next(), i4);
                    }
                } else if (!(pVar instanceof k)) {
                    pVar.f22861b.f22945g[i4] = false;
                }
                c(fVar.f22810d, i4);
            }
        }
        return false;
    }

    private long e(f fVar, long j4) {
        p pVar = fVar.f22810d;
        if (pVar instanceof k) {
            return j4;
        }
        int size = fVar.f22817k.size();
        long j5 = j4;
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = fVar.f22817k.get(i4);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f22810d != pVar) {
                    j5 = Math.min(j5, e(fVar2, fVar2.f22812f + j4));
                }
            }
        }
        if (fVar != pVar.f22868i) {
            return j5;
        }
        long j6 = j4 - pVar.j();
        return Math.min(Math.min(j5, e(pVar.f22867h, j6)), j6 - pVar.f22867h.f22812f);
    }

    private long f(f fVar, long j4) {
        p pVar = fVar.f22810d;
        if (pVar instanceof k) {
            return j4;
        }
        int size = fVar.f22817k.size();
        long j5 = j4;
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = fVar.f22817k.get(i4);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f22810d != pVar) {
                    j5 = Math.max(j5, f(fVar2, fVar2.f22812f + j4));
                }
            }
        }
        if (fVar != pVar.f22867h) {
            return j5;
        }
        long j6 = j4 + pVar.j();
        return Math.max(Math.max(j5, f(pVar.f22868i, j6)), j6 - pVar.f22868i.f22812f);
    }

    public void a(p pVar) {
        this.f22838e.add(pVar);
        this.f22837d = pVar;
    }

    public long b(androidx.constraintlayout.core.widgets.f fVar, int i4) {
        p pVar = this.f22836c;
        if (pVar instanceof c) {
            if (((c) pVar).f22865f != i4) {
                return 0L;
            }
        } else if (i4 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i4 == 0 ? fVar.f22941e : fVar.f22943f).f22867h;
        f fVar3 = (i4 == 0 ? fVar.f22941e : fVar.f22943f).f22868i;
        boolean contains = pVar.f22867h.f22818l.contains(fVar2);
        boolean contains2 = this.f22836c.f22868i.f22818l.contains(fVar3);
        long j4 = this.f22836c.j();
        if (!contains || !contains2) {
            if (contains) {
                return Math.max(f(this.f22836c.f22867h, r12.f22812f), this.f22836c.f22867h.f22812f + j4);
            }
            if (contains2) {
                return Math.max(-e(this.f22836c.f22868i, r12.f22812f), (-this.f22836c.f22868i.f22812f) + j4);
            }
            return (this.f22836c.j() + r12.f22867h.f22812f) - this.f22836c.f22868i.f22812f;
        }
        long f4 = f(this.f22836c.f22867h, 0L);
        long e4 = e(this.f22836c.f22868i, 0L);
        long j5 = f4 - j4;
        p pVar2 = this.f22836c;
        int i5 = pVar2.f22868i.f22812f;
        if (j5 >= (-i5)) {
            j5 += i5;
        }
        int i6 = pVar2.f22867h.f22812f;
        long j6 = ((-e4) - j4) - i6;
        if (j6 >= i6) {
            j6 -= i6;
        }
        float u4 = pVar2.f22861b.u(i4);
        float f5 = u4 > 0.0f ? (long) ((j5 / (1.0f - u4)) + (j6 / u4)) : 0L;
        long a5 = ((long) ((f5 * u4) + 0.5f)) + j4 + ((long) androidx.appcompat.graphics.drawable.d.a(1.0f, u4, f5, 0.5f));
        p pVar3 = this.f22836c;
        return (pVar3.f22867h.f22812f + a5) - pVar3.f22868i.f22812f;
    }

    public void d(boolean z4, boolean z5) {
        if (z4) {
            p pVar = this.f22836c;
            if (pVar instanceof l) {
                c(pVar, 0);
            }
        }
        if (z5) {
            p pVar2 = this.f22836c;
            if (pVar2 instanceof n) {
                c(pVar2, 1);
            }
        }
    }
}
