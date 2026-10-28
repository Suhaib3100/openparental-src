package androidx.constraintlayout.solver.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DependencyNode.java */
/* loaded from: classes3.dex */
public class g implements d {

    /* renamed from: d, reason: collision with root package name */
    q f2402d;

    /* renamed from: f, reason: collision with root package name */
    int f2404f;

    /* renamed from: g, reason: collision with root package name */
    public int f2405g;

    /* renamed from: a, reason: collision with root package name */
    public d f2399a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2400b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2401c = false;

    /* renamed from: e, reason: collision with root package name */
    a f2403e = a.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    int f2406h = 1;

    /* renamed from: i, reason: collision with root package name */
    h f2407i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2408j = false;

    /* renamed from: k, reason: collision with root package name */
    List<d> f2409k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    List<g> f2410l = new ArrayList();

    /* compiled from: DependencyNode.java */
    /* loaded from: classes.dex */
    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public g(q qVar) {
        this.f2402d = qVar;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.d
    public void a(d dVar) {
        Iterator<g> it = this.f2410l.iterator();
        while (it.hasNext()) {
            if (!it.next().f2408j) {
                return;
            }
        }
        this.f2401c = true;
        d dVar2 = this.f2399a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f2400b) {
            this.f2402d.a(this);
            return;
        }
        g gVar = null;
        int i5 = 0;
        for (g gVar2 : this.f2410l) {
            if (!(gVar2 instanceof h)) {
                i5++;
                gVar = gVar2;
            }
        }
        if (gVar != null && i5 == 1 && gVar.f2408j) {
            h hVar = this.f2407i;
            if (hVar != null) {
                if (!hVar.f2408j) {
                    return;
                } else {
                    this.f2404f = this.f2406h * hVar.f2405g;
                }
            }
            e(gVar.f2405g + this.f2404f);
        }
        d dVar3 = this.f2399a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f2409k.add(dVar);
        if (this.f2408j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f2410l.clear();
        this.f2409k.clear();
        this.f2408j = false;
        this.f2405g = 0;
        this.f2401c = false;
        this.f2400b = false;
    }

    public String d() {
        String y5 = this.f2402d.f2450b.y();
        a aVar = this.f2403e;
        StringBuilder a6 = androidx.constraintlayout.motion.widget.c.a((aVar == a.LEFT || aVar == a.RIGHT) ? androidx.concurrent.futures.b.a(y5, "_HORIZONTAL") : androidx.concurrent.futures.b.a(y5, "_VERTICAL"), ":");
        a6.append(this.f2403e.name());
        return a6.toString();
    }

    public void e(int i5) {
        if (this.f2408j) {
            return;
        }
        this.f2408j = true;
        this.f2405g = i5;
        for (d dVar : this.f2409k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2402d.f2450b.y());
        sb.append(":");
        sb.append(this.f2403e);
        sb.append("(");
        sb.append(this.f2408j ? Integer.valueOf(this.f2405g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f2410l.size());
        sb.append(":d=");
        sb.append(this.f2409k.size());
        sb.append(">");
        return sb.toString();
    }
}
