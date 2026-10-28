package androidx.constraintlayout.solver.state.helpers;

import androidx.constraintlayout.solver.widgets.h;

/* compiled from: GuidelineReference.java */
/* loaded from: classes3.dex */
public class e implements androidx.constraintlayout.solver.state.d {

    /* renamed from: a, reason: collision with root package name */
    final androidx.constraintlayout.solver.state.e f2336a;

    /* renamed from: b, reason: collision with root package name */
    private int f2337b;

    /* renamed from: c, reason: collision with root package name */
    private h f2338c;

    /* renamed from: d, reason: collision with root package name */
    private int f2339d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f2340e = -1;

    /* renamed from: f, reason: collision with root package name */
    private float f2341f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    private Object f2342g;

    public e(androidx.constraintlayout.solver.state.e eVar) {
        this.f2336a = eVar;
    }

    @Override // androidx.constraintlayout.solver.state.d
    public void a(Object obj) {
        this.f2342g = obj;
    }

    @Override // androidx.constraintlayout.solver.state.d
    public void apply() {
        this.f2338c.f2(this.f2337b);
        int i5 = this.f2339d;
        if (i5 != -1) {
            this.f2338c.a2(i5);
            return;
        }
        int i6 = this.f2340e;
        if (i6 != -1) {
            this.f2338c.b2(i6);
        } else {
            this.f2338c.c2(this.f2341f);
        }
    }

    @Override // androidx.constraintlayout.solver.state.d
    public androidx.constraintlayout.solver.widgets.e b() {
        if (this.f2338c == null) {
            this.f2338c = new h();
        }
        return this.f2338c;
    }

    @Override // androidx.constraintlayout.solver.state.d
    public void c(androidx.constraintlayout.solver.widgets.e eVar) {
        if (eVar instanceof h) {
            this.f2338c = (h) eVar;
        } else {
            this.f2338c = null;
        }
    }

    public void d(Object obj) {
        this.f2339d = -1;
        this.f2340e = this.f2336a.f(obj);
        this.f2341f = 0.0f;
    }

    public int e() {
        return this.f2337b;
    }

    public void f(float f6) {
        this.f2339d = -1;
        this.f2340e = -1;
        this.f2341f = f6;
    }

    public void g(int i5) {
        this.f2337b = i5;
    }

    @Override // androidx.constraintlayout.solver.state.d
    public Object getKey() {
        return this.f2342g;
    }

    public void h(Object obj) {
        this.f2339d = this.f2336a.f(obj);
        this.f2340e = -1;
        this.f2341f = 0.0f;
    }
}
