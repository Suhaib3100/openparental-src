package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WidgetGroup.java */
/* loaded from: classes.dex */
public class p {

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f2433g = false;

    /* renamed from: h, reason: collision with root package name */
    static int f2434h;

    /* renamed from: b, reason: collision with root package name */
    int f2436b;

    /* renamed from: d, reason: collision with root package name */
    int f2438d;

    /* renamed from: a, reason: collision with root package name */
    ArrayList<androidx.constraintlayout.solver.widgets.e> f2435a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    boolean f2437c = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList<a> f2439e = null;

    /* renamed from: f, reason: collision with root package name */
    private int f2440f = -1;

    /* compiled from: WidgetGroup.java */
    class a {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<androidx.constraintlayout.solver.widgets.e> f2441a;

        /* renamed from: b, reason: collision with root package name */
        int f2442b;

        /* renamed from: c, reason: collision with root package name */
        int f2443c;

        /* renamed from: d, reason: collision with root package name */
        int f2444d;

        /* renamed from: e, reason: collision with root package name */
        int f2445e;

        /* renamed from: f, reason: collision with root package name */
        int f2446f;

        /* renamed from: g, reason: collision with root package name */
        int f2447g;

        public a(androidx.constraintlayout.solver.widgets.e eVar, androidx.constraintlayout.solver.g gVar, int i5) {
            this.f2441a = new WeakReference<>(eVar);
            this.f2442b = gVar.O(eVar.J);
            this.f2443c = gVar.O(eVar.K);
            this.f2444d = gVar.O(eVar.L);
            this.f2445e = gVar.O(eVar.M);
            this.f2446f = gVar.O(eVar.N);
            this.f2447g = i5;
        }

        public void a() {
            androidx.constraintlayout.solver.widgets.e eVar = this.f2441a.get();
            if (eVar != null) {
                eVar.U0(this.f2442b, this.f2443c, this.f2444d, this.f2445e, this.f2446f, this.f2447g);
            }
        }
    }

    public p(int i5) {
        int i6 = f2434h;
        f2434h = i6 + 1;
        this.f2436b = i6;
        this.f2438d = i5;
    }

    private boolean e(androidx.constraintlayout.solver.widgets.e eVar) {
        return this.f2435a.contains(eVar);
    }

    private String h() {
        int i5 = this.f2438d;
        return i5 == 0 ? "Horizontal" : i5 == 1 ? "Vertical" : i5 == 2 ? "Both" : "Unknown";
    }

    private int k(int i5, androidx.constraintlayout.solver.widgets.e eVar) {
        e.b z5 = eVar.z(i5);
        if (z5 == e.b.WRAP_CONTENT || z5 == e.b.MATCH_PARENT || z5 == e.b.FIXED) {
            return i5 == 0 ? eVar.j0() : eVar.D();
        }
        return -1;
    }

    private int q(androidx.constraintlayout.solver.g gVar, ArrayList<androidx.constraintlayout.solver.widgets.e> arrayList, int i5) {
        int O;
        int O2;
        androidx.constraintlayout.solver.widgets.f fVar = (androidx.constraintlayout.solver.widgets.f) arrayList.get(0).U();
        gVar.Y();
        fVar.g(gVar, false);
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            arrayList.get(i6).g(gVar, false);
        }
        if (i5 == 0 && fVar.f2574z1 > 0) {
            androidx.constraintlayout.solver.widgets.b.b(fVar, gVar, arrayList, 0);
        }
        if (i5 == 1 && fVar.A1 > 0) {
            androidx.constraintlayout.solver.widgets.b.b(fVar, gVar, arrayList, 1);
        }
        try {
            gVar.T();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        this.f2439e = new ArrayList<>();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            this.f2439e.add(new a(arrayList.get(i7), gVar, i5));
        }
        if (i5 == 0) {
            O = gVar.O(fVar.J);
            O2 = gVar.O(fVar.L);
            gVar.Y();
        } else {
            O = gVar.O(fVar.K);
            O2 = gVar.O(fVar.M);
            gVar.Y();
        }
        return O2 - O;
    }

    public boolean a(androidx.constraintlayout.solver.widgets.e eVar) {
        if (this.f2435a.contains(eVar)) {
            return false;
        }
        this.f2435a.add(eVar);
        return true;
    }

    public void b() {
        if (this.f2439e != null && this.f2437c) {
            for (int i5 = 0; i5 < this.f2439e.size(); i5++) {
                this.f2439e.get(i5).a();
            }
        }
    }

    public void c(ArrayList<p> arrayList) {
        int size = this.f2435a.size();
        if (this.f2440f != -1 && size > 0) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                p pVar = arrayList.get(i5);
                if (this.f2440f == pVar.f2436b) {
                    m(this.f2438d, pVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void d() {
        this.f2435a.clear();
    }

    public int f() {
        return this.f2436b;
    }

    public int g() {
        return this.f2438d;
    }

    public boolean i(p pVar) {
        for (int i5 = 0; i5 < this.f2435a.size(); i5++) {
            if (pVar.e(this.f2435a.get(i5))) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return this.f2437c;
    }

    public int l(androidx.constraintlayout.solver.g gVar, int i5) {
        if (this.f2435a.size() == 0) {
            return 0;
        }
        return q(gVar, this.f2435a, i5);
    }

    public void m(int i5, p pVar) {
        Iterator<androidx.constraintlayout.solver.widgets.e> it = this.f2435a.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.solver.widgets.e next = it.next();
            pVar.a(next);
            if (i5 == 0) {
                next.K0 = pVar.f();
            } else {
                next.L0 = pVar.f();
            }
        }
        this.f2440f = pVar.f2436b;
    }

    public void n(boolean z5) {
        this.f2437c = z5;
    }

    public void o(int i5) {
        this.f2438d = i5;
    }

    public int p() {
        return this.f2435a.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(h());
        sb.append(" [");
        String a6 = androidx.constraintlayout.solver.e.a(sb, this.f2436b, "] <");
        Iterator<androidx.constraintlayout.solver.widgets.e> it = this.f2435a.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.solver.widgets.e next = it.next();
            StringBuilder a7 = androidx.constraintlayout.motion.widget.c.a(a6, " ");
            a7.append(next.y());
            a6 = a7.toString();
        }
        return androidx.concurrent.futures.b.a(a6, " >");
    }
}
