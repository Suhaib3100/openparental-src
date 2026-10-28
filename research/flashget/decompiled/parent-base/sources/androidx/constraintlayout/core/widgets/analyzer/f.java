package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DependencyNode.java */
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    p f22810d;

    /* renamed from: f, reason: collision with root package name */
    int f22812f;

    /* renamed from: g, reason: collision with root package name */
    public int f22813g;

    /* renamed from: a, reason: collision with root package name */
    public d f22807a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22808b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22809c = false;

    /* renamed from: e, reason: collision with root package name */
    a f22811e = a.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    int f22814h = 1;

    /* renamed from: i, reason: collision with root package name */
    g f22815i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f22816j = false;

    /* renamed from: k, reason: collision with root package name */
    List<d> f22817k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    List<f> f22818l = new ArrayList();

    /* compiled from: DependencyNode.java */
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

    public f(p pVar) {
        this.f22810d = pVar;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        Iterator<f> it = this.f22818l.iterator();
        while (it.hasNext()) {
            if (!it.next().f22816j) {
                return;
            }
        }
        this.f22809c = true;
        d dVar2 = this.f22807a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f22808b) {
            this.f22810d.a(this);
            return;
        }
        f fVar = null;
        int i4 = 0;
        for (f fVar2 : this.f22818l) {
            if (!(fVar2 instanceof g)) {
                i4++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i4 == 1 && fVar.f22816j) {
            g gVar = this.f22815i;
            if (gVar != null) {
                if (!gVar.f22816j) {
                    return;
                } else {
                    this.f22812f = this.f22814h * gVar.f22813g;
                }
            }
            e(fVar.f22813g + this.f22812f);
        }
        d dVar3 = this.f22807a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f22817k.add(dVar);
        if (this.f22816j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f22818l.clear();
        this.f22817k.clear();
        this.f22816j = false;
        this.f22813g = 0;
        this.f22809c = false;
        this.f22808b = false;
    }

    public String d() {
        String y4 = this.f22810d.f22861b.y();
        a aVar = this.f22811e;
        StringBuilder a5 = androidx.constraintlayout.core.e.a((aVar == a.LEFT || aVar == a.RIGHT) ? androidx.compose.runtime.changelist.j.a(y4, "_HORIZONTAL") : androidx.compose.runtime.changelist.j.a(y4, "_VERTICAL"), ":");
        a5.append(this.f22811e.name());
        return a5.toString();
    }

    public void e(int i4) {
        if (this.f22816j) {
            return;
        }
        this.f22816j = true;
        this.f22813g = i4;
        for (d dVar : this.f22817k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22810d.f22861b.y());
        sb.append(":");
        sb.append(this.f22811e);
        sb.append("(");
        sb.append(this.f22816j ? Integer.valueOf(this.f22813g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f22818l.size());
        sb.append(":d=");
        sb.append(this.f22817k.size());
        sb.append(">");
        return sb.toString();
    }
}
