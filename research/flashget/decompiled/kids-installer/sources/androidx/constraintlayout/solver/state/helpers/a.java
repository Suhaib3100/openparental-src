package androidx.constraintlayout.solver.state.helpers;

import androidx.constraintlayout.solver.state.e;
import java.util.Iterator;

/* compiled from: AlignHorizontallyReference.java */
/* loaded from: classes2.dex */
public class a extends androidx.constraintlayout.solver.state.c {

    /* renamed from: e, reason: collision with root package name */
    private float f2320e;

    /* renamed from: f, reason: collision with root package name */
    private Object f2321f;

    /* renamed from: g, reason: collision with root package name */
    private Object f2322g;

    /* renamed from: h, reason: collision with root package name */
    private Object f2323h;

    /* renamed from: i, reason: collision with root package name */
    private Object f2324i;

    public a(androidx.constraintlayout.solver.state.e eVar) {
        super(eVar, e.EnumC0020e.ALIGN_VERTICALLY);
        this.f2320e = 0.5f;
    }

    @Override // androidx.constraintlayout.solver.state.c
    public void b() {
        Iterator<Object> it = this.f2308c.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.solver.state.a e6 = this.f2306a.e(it.next());
            e6.n();
            Object obj = this.f2321f;
            if (obj != null) {
                e6.T(obj);
            } else {
                Object obj2 = this.f2322g;
                if (obj2 != null) {
                    e6.S(obj2);
                } else {
                    e6.T(androidx.constraintlayout.solver.state.e.f2314i);
                }
            }
            Object obj3 = this.f2323h;
            if (obj3 != null) {
                e6.t(obj3);
            } else {
                Object obj4 = this.f2324i;
                if (obj4 != null) {
                    e6.s(obj4);
                } else {
                    e6.s(androidx.constraintlayout.solver.state.e.f2314i);
                }
            }
            float f6 = this.f2320e;
            if (f6 != 0.5f) {
                e6.C(f6);
            }
        }
    }

    public void f(float f6) {
        this.f2320e = f6;
    }

    public void g(Object obj) {
        this.f2324i = obj;
    }

    public void h(Object obj) {
        this.f2323h = obj;
    }

    public void i(Object obj) {
        this.f2322g = obj;
    }

    public void j(Object obj) {
        this.f2321f = obj;
    }
}
