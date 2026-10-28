package androidx.constraintlayout.solver.state.helpers;

import androidx.constraintlayout.solver.state.e;
import java.util.Iterator;

/* compiled from: VerticalChainReference.java */
/* loaded from: classes3.dex */
public class g extends d {

    /* renamed from: g, reason: collision with root package name */
    private Object f2348g;

    /* renamed from: h, reason: collision with root package name */
    private Object f2349h;

    /* renamed from: i, reason: collision with root package name */
    private Object f2350i;

    /* renamed from: j, reason: collision with root package name */
    private Object f2351j;

    /* compiled from: VerticalChainReference.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2352a;

        static {
            int[] iArr = new int[e.b.values().length];
            f2352a = iArr;
            try {
                iArr[e.b.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2352a[e.b.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2352a[e.b.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g(androidx.constraintlayout.solver.state.e eVar) {
        super(eVar, e.EnumC0020e.VERTICAL_CHAIN);
    }

    @Override // androidx.constraintlayout.solver.state.c
    public void b() {
        Iterator<Object> it = this.f2308c.iterator();
        while (it.hasNext()) {
            this.f2306a.e(it.next()).o();
        }
        Iterator<Object> it2 = this.f2308c.iterator();
        androidx.constraintlayout.solver.state.a aVar = null;
        androidx.constraintlayout.solver.state.a aVar2 = null;
        while (it2.hasNext()) {
            androidx.constraintlayout.solver.state.a e6 = this.f2306a.e(it2.next());
            if (aVar2 == null) {
                Object obj = this.f2348g;
                if (obj != null) {
                    e6.W(obj);
                } else {
                    Object obj2 = this.f2349h;
                    if (obj2 != null) {
                        e6.V(obj2);
                    } else {
                        e6.W(androidx.constraintlayout.solver.state.e.f2314i);
                    }
                }
                aVar2 = e6;
            }
            if (aVar != null) {
                aVar.j(e6.getKey());
                e6.V(aVar.getKey());
            }
            aVar = e6;
        }
        if (aVar != null) {
            Object obj3 = this.f2350i;
            if (obj3 != null) {
                aVar.j(obj3);
            } else {
                Object obj4 = this.f2351j;
                if (obj4 != null) {
                    aVar.i(obj4);
                } else {
                    aVar.i(androidx.constraintlayout.solver.state.e.f2314i);
                }
            }
        }
        if (aVar2 != null) {
            float f6 = this.f2334e;
            if (f6 != 0.5f) {
                aVar2.Y(f6);
            }
        }
        int i5 = a.f2352a[this.f2335f.ordinal()];
        if (i5 == 1) {
            aVar2.O(0);
        } else if (i5 == 2) {
            aVar2.O(1);
        } else {
            if (i5 != 3) {
                return;
            }
            aVar2.O(2);
        }
    }

    public void j(Object obj) {
        this.f2351j = obj;
    }

    public void k(Object obj) {
        this.f2350i = obj;
    }

    public void l(Object obj) {
        this.f2349h = obj;
    }

    public void m(Object obj) {
        this.f2348g = obj;
    }
}
