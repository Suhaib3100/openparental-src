package androidx.constraintlayout.core.widgets.analyzer;

import androidx.compose.runtime.z4;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ChainRun.java */
/* loaded from: classes.dex */
public class c extends p {

    /* renamed from: k, reason: collision with root package name */
    ArrayList<p> f22795k;

    /* renamed from: l, reason: collision with root package name */
    private int f22796l;

    public c(androidx.constraintlayout.core.widgets.e eVar, int i4) {
        super(eVar);
        this.f22795k = new ArrayList<>();
        this.f22865f = i4;
        u();
    }

    private void u() {
        androidx.constraintlayout.core.widgets.e eVar;
        androidx.constraintlayout.core.widgets.e eVar2 = this.f22861b;
        androidx.constraintlayout.core.widgets.e V = eVar2.V(this.f22865f);
        while (true) {
            androidx.constraintlayout.core.widgets.e eVar3 = V;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            } else {
                V = eVar2.V(this.f22865f);
            }
        }
        this.f22861b = eVar;
        this.f22795k.add(eVar.a0(this.f22865f));
        androidx.constraintlayout.core.widgets.e R = eVar.R(this.f22865f);
        while (R != null) {
            this.f22795k.add(R.a0(this.f22865f));
            R = R.R(this.f22865f);
        }
        Iterator<p> it = this.f22795k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i4 = this.f22865f;
            if (i4 == 0) {
                next.f22861b.f22937c = this;
            } else if (i4 == 1) {
                next.f22861b.f22939d = this;
            }
        }
        if (this.f22865f == 0 && ((androidx.constraintlayout.core.widgets.f) this.f22861b.U()).O2() && this.f22795k.size() > 1) {
            this.f22861b = ((p) z4.a(this.f22795k, 1)).f22861b;
        }
        this.f22796l = this.f22865f == 0 ? this.f22861b.G() : this.f22861b.i0();
    }

    private androidx.constraintlayout.core.widgets.e v() {
        for (int i4 = 0; i4 < this.f22795k.size(); i4++) {
            p pVar = this.f22795k.get(i4);
            if (pVar.f22861b.l0() != 8) {
                return pVar.f22861b;
            }
        }
        return null;
    }

    private androidx.constraintlayout.core.widgets.e w() {
        for (int size = this.f22795k.size() - 1; size >= 0; size--) {
            p pVar = this.f22795k.get(size);
            if (pVar.f22861b.l0() != 8) {
                return pVar.f22861b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x03fe, code lost:
    
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.p, androidx.constraintlayout.core.widgets.analyzer.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(androidx.constraintlayout.core.widgets.analyzer.d r27) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.c.a(androidx.constraintlayout.core.widgets.analyzer.d):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void d() {
        Iterator<p> it = this.f22795k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f22795k.size();
        if (size < 1) {
            return;
        }
        androidx.constraintlayout.core.widgets.e eVar = this.f22795k.get(0).f22861b;
        androidx.constraintlayout.core.widgets.e eVar2 = this.f22795k.get(size - 1).f22861b;
        if (this.f22865f == 0) {
            androidx.constraintlayout.core.widgets.d dVar = eVar.Q;
            androidx.constraintlayout.core.widgets.d dVar2 = eVar2.S;
            f i4 = i(dVar, 0);
            int g4 = dVar.g();
            androidx.constraintlayout.core.widgets.e v4 = v();
            if (v4 != null) {
                g4 = v4.Q.g();
            }
            if (i4 != null) {
                b(this.f22867h, i4, g4);
            }
            f i5 = i(dVar2, 0);
            int g5 = dVar2.g();
            androidx.constraintlayout.core.widgets.e w4 = w();
            if (w4 != null) {
                g5 = w4.S.g();
            }
            if (i5 != null) {
                b(this.f22868i, i5, -g5);
            }
        } else {
            androidx.constraintlayout.core.widgets.d dVar3 = eVar.R;
            androidx.constraintlayout.core.widgets.d dVar4 = eVar2.T;
            f i6 = i(dVar3, 1);
            int g6 = dVar3.g();
            androidx.constraintlayout.core.widgets.e v5 = v();
            if (v5 != null) {
                g6 = v5.R.g();
            }
            if (i6 != null) {
                b(this.f22867h, i6, g6);
            }
            f i7 = i(dVar4, 1);
            int g7 = dVar4.g();
            androidx.constraintlayout.core.widgets.e w5 = w();
            if (w5 != null) {
                g7 = w5.T.g();
            }
            if (i7 != null) {
                b(this.f22868i, i7, -g7);
            }
        }
        this.f22867h.f22807a = this;
        this.f22868i.f22807a = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void e() {
        for (int i4 = 0; i4 < this.f22795k.size(); i4++) {
            this.f22795k.get(i4).e();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void f() {
        this.f22862c = null;
        Iterator<p> it = this.f22795k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public long j() {
        int size = this.f22795k.size();
        long j4 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            j4 = r4.f22868i.f22812f + this.f22795k.get(i4).j() + j4 + r4.f22867h.f22812f;
        }
        return j4;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void n() {
        this.f22867h.f22816j = false;
        this.f22868i.f22816j = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    boolean p() {
        int size = this.f22795k.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!this.f22795k.get(i4).p()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f22865f == 0 ? "horizontal : " : "vertical : ");
        Iterator<p> it = this.f22795k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            sb.append("<");
            sb.append(next);
            sb.append("> ");
        }
        return sb.toString();
    }
}
