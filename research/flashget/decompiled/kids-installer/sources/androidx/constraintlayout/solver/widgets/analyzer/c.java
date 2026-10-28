package androidx.constraintlayout.solver.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ChainRun.java */
/* loaded from: classes3.dex */
public class c extends q {

    /* renamed from: k, reason: collision with root package name */
    ArrayList<q> f2387k;

    /* renamed from: l, reason: collision with root package name */
    private int f2388l;

    public c(androidx.constraintlayout.solver.widgets.e eVar, int i5) {
        super(eVar);
        this.f2387k = new ArrayList<>();
        this.f2454f = i5;
        u();
    }

    private void u() {
        androidx.constraintlayout.solver.widgets.e eVar;
        androidx.constraintlayout.solver.widgets.e eVar2 = this.f2450b;
        androidx.constraintlayout.solver.widgets.e V = eVar2.V(this.f2454f);
        while (true) {
            androidx.constraintlayout.solver.widgets.e eVar3 = V;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            } else {
                V = eVar2.V(this.f2454f);
            }
        }
        this.f2450b = eVar;
        this.f2387k.add(eVar.a0(this.f2454f));
        androidx.constraintlayout.solver.widgets.e R = eVar.R(this.f2454f);
        while (R != null) {
            this.f2387k.add(R.a0(this.f2454f));
            R = R.R(this.f2454f);
        }
        Iterator<q> it = this.f2387k.iterator();
        while (it.hasNext()) {
            q next = it.next();
            int i5 = this.f2454f;
            if (i5 == 0) {
                next.f2450b.f2514c = this;
            } else if (i5 == 1) {
                next.f2450b.f2516d = this;
            }
        }
        if ((this.f2454f == 0 && ((androidx.constraintlayout.solver.widgets.f) this.f2450b.U()).s2()) && this.f2387k.size() > 1) {
            ArrayList<q> arrayList = this.f2387k;
            this.f2450b = arrayList.get(arrayList.size() - 1).f2450b;
        }
        this.f2388l = this.f2454f == 0 ? this.f2450b.G() : this.f2450b.f0();
    }

    private androidx.constraintlayout.solver.widgets.e v() {
        for (int i5 = 0; i5 < this.f2387k.size(); i5++) {
            q qVar = this.f2387k.get(i5);
            if (qVar.f2450b.i0() != 8) {
                return qVar.f2450b;
            }
        }
        return null;
    }

    private androidx.constraintlayout.solver.widgets.e w() {
        for (int size = this.f2387k.size() - 1; size >= 0; size--) {
            q qVar = this.f2387k.get(size);
            if (qVar.f2450b.i0() != 8) {
                return qVar.f2450b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01a5, code lost:
    
        if (r1 != r7) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01d0, code lost:
    
        r9.f2453e.e(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01cd, code lost:
    
        r13 = r13 + 1;
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01cb, code lost:
    
        if (r1 != r7) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0418, code lost:
    
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00eb  */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.q, androidx.constraintlayout.solver.widgets.analyzer.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(androidx.constraintlayout.solver.widgets.analyzer.d r26) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.c.a(androidx.constraintlayout.solver.widgets.analyzer.d):void");
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q
    void d() {
        Iterator<q> it = this.f2387k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f2387k.size();
        if (size < 1) {
            return;
        }
        androidx.constraintlayout.solver.widgets.e eVar = this.f2387k.get(0).f2450b;
        androidx.constraintlayout.solver.widgets.e eVar2 = this.f2387k.get(size - 1).f2450b;
        if (this.f2454f == 0) {
            androidx.constraintlayout.solver.widgets.d dVar = eVar.J;
            androidx.constraintlayout.solver.widgets.d dVar2 = eVar2.L;
            g i5 = i(dVar, 0);
            int g5 = dVar.g();
            androidx.constraintlayout.solver.widgets.e v5 = v();
            if (v5 != null) {
                g5 = v5.J.g();
            }
            if (i5 != null) {
                b(this.f2456h, i5, g5);
            }
            g i6 = i(dVar2, 0);
            int g6 = dVar2.g();
            androidx.constraintlayout.solver.widgets.e w5 = w();
            if (w5 != null) {
                g6 = w5.L.g();
            }
            if (i6 != null) {
                b(this.f2457i, i6, -g6);
            }
        } else {
            androidx.constraintlayout.solver.widgets.d dVar3 = eVar.K;
            androidx.constraintlayout.solver.widgets.d dVar4 = eVar2.M;
            g i7 = i(dVar3, 1);
            int g7 = dVar3.g();
            androidx.constraintlayout.solver.widgets.e v6 = v();
            if (v6 != null) {
                g7 = v6.K.g();
            }
            if (i7 != null) {
                b(this.f2456h, i7, g7);
            }
            g i8 = i(dVar4, 1);
            int g8 = dVar4.g();
            androidx.constraintlayout.solver.widgets.e w6 = w();
            if (w6 != null) {
                g8 = w6.M.g();
            }
            if (i8 != null) {
                b(this.f2457i, i8, -g8);
            }
        }
        this.f2456h.f2399a = this;
        this.f2457i.f2399a = this;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q
    public void e() {
        for (int i5 = 0; i5 < this.f2387k.size(); i5++) {
            this.f2387k.get(i5).e();
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q
    void f() {
        this.f2451c = null;
        Iterator<q> it = this.f2387k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q
    public long j() {
        int size = this.f2387k.size();
        long j5 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            j5 = r4.f2457i.f2404f + this.f2387k.get(i5).j() + j5 + r4.f2456h.f2404f;
        }
        return j5;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q
    void n() {
        this.f2456h.f2408j = false;
        this.f2457i.f2408j = false;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.q
    boolean p() {
        int size = this.f2387k.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (!this.f2387k.get(i5).p()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String concat = "ChainRun ".concat(this.f2454f == 0 ? "horizontal : " : "vertical : ");
        Iterator<q> it = this.f2387k.iterator();
        while (it.hasNext()) {
            q next = it.next();
            concat = androidx.concurrent.futures.b.a(androidx.concurrent.futures.b.a(concat, "<") + next, "> ");
        }
        return concat;
    }
}
