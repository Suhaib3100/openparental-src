package androidx.constraintlayout.solver.state.helpers;

import androidx.constraintlayout.solver.state.e;
import java.util.Iterator;

/* compiled from: AlignVerticallyReference.java */
/* loaded from: classes2.dex */
public class b extends androidx.constraintlayout.solver.state.c {

    /* renamed from: e, reason: collision with root package name */
    private float f2325e;

    /* renamed from: f, reason: collision with root package name */
    private Object f2326f;

    /* renamed from: g, reason: collision with root package name */
    private Object f2327g;

    /* renamed from: h, reason: collision with root package name */
    private Object f2328h;

    /* renamed from: i, reason: collision with root package name */
    private Object f2329i;

    public b(androidx.constraintlayout.solver.state.e eVar) {
        super(eVar, e.EnumC0020e.ALIGN_VERTICALLY);
        this.f2325e = 0.5f;
    }

    @Override // androidx.constraintlayout.solver.state.c
    public void b() {
        Iterator<Object> it = this.f2308c.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.solver.state.a e6 = this.f2306a.e(it.next());
            e6.o();
            Object obj = this.f2326f;
            if (obj != null) {
                e6.W(obj);
            } else {
                Object obj2 = this.f2327g;
                if (obj2 != null) {
                    e6.V(obj2);
                } else {
                    e6.W(androidx.constraintlayout.solver.state.e.f2314i);
                }
            }
            Object obj3 = this.f2328h;
            if (obj3 != null) {
                e6.j(obj3);
            } else {
                Object obj4 = this.f2329i;
                if (obj4 != null) {
                    e6.i(obj4);
                } else {
                    e6.i(androidx.constraintlayout.solver.state.e.f2314i);
                }
            }
            float f6 = this.f2325e;
            if (f6 != 0.5f) {
                e6.Y(f6);
            }
        }
    }

    public void f(float f6) {
        this.f2325e = f6;
    }

    public void g(Object obj) {
        this.f2329i = obj;
    }

    public void h(Object obj) {
        this.f2328h = obj;
    }

    public void i(Object obj) {
        this.f2327g = obj;
    }

    public void j(Object obj) {
        this.f2326f = obj;
    }
}
