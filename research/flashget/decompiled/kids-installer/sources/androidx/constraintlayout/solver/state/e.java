package androidx.constraintlayout.solver.state;

import androidx.constraintlayout.solver.state.helpers.g;
import androidx.constraintlayout.solver.widgets.f;
import androidx.constraintlayout.solver.widgets.j;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: State.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: e, reason: collision with root package name */
    static final int f2310e = -1;

    /* renamed from: f, reason: collision with root package name */
    static final int f2311f = 0;

    /* renamed from: g, reason: collision with root package name */
    static final int f2312g = 1;

    /* renamed from: h, reason: collision with root package name */
    static final int f2313h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final Integer f2314i = 0;

    /* renamed from: a, reason: collision with root package name */
    protected HashMap<Object, androidx.constraintlayout.solver.state.d> f2315a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    protected HashMap<Object, androidx.constraintlayout.solver.state.c> f2316b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public final androidx.constraintlayout.solver.state.a f2317c;

    /* renamed from: d, reason: collision with root package name */
    private int f2318d;

    /* compiled from: State.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2319a;

        static {
            int[] iArr = new int[EnumC0020e.values().length];
            f2319a = iArr;
            try {
                iArr[EnumC0020e.HORIZONTAL_CHAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2319a[EnumC0020e.VERTICAL_CHAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2319a[EnumC0020e.ALIGN_HORIZONTALLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2319a[EnumC0020e.ALIGN_VERTICALLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2319a[EnumC0020e.BARRIER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: State.java */
    public enum b {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    /* compiled from: State.java */
    public enum c {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BASELINE_TO_BASELINE,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY
    }

    /* compiled from: State.java */
    public enum d {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    /* compiled from: State.java */
    /* renamed from: androidx.constraintlayout.solver.state.e$e, reason: collision with other inner class name */
    public enum EnumC0020e {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        FLOW
    }

    public e() {
        androidx.constraintlayout.solver.state.a aVar = new androidx.constraintlayout.solver.state.a(this);
        this.f2317c = aVar;
        this.f2318d = 0;
        this.f2315a.put(f2314i, aVar);
    }

    private String h() {
        StringBuilder sb = new StringBuilder("__HELPER_KEY_");
        int i5 = this.f2318d;
        this.f2318d = i5 + 1;
        return androidx.constraintlayout.solver.e.a(sb, i5, "__");
    }

    public void a(f fVar) {
        fVar.T1();
        this.f2317c.A().i(this, fVar, 0);
        this.f2317c.v().i(this, fVar, 1);
        for (Object obj : this.f2316b.keySet()) {
            j c6 = this.f2316b.get(obj).c();
            if (c6 != null) {
                androidx.constraintlayout.solver.state.d dVar = this.f2315a.get(obj);
                if (dVar == null) {
                    dVar = e(obj);
                }
                dVar.c(c6);
            }
        }
        Iterator<Object> it = this.f2315a.keySet().iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.solver.state.d dVar2 = this.f2315a.get(it.next());
            if (dVar2 != this.f2317c) {
                androidx.constraintlayout.solver.widgets.e b6 = dVar2.b();
                b6.x1(null);
                if (dVar2 instanceof androidx.constraintlayout.solver.state.helpers.e) {
                    dVar2.apply();
                }
                fVar.a(b6);
            } else {
                dVar2.c(fVar);
            }
        }
        Iterator<Object> it2 = this.f2316b.keySet().iterator();
        while (it2.hasNext()) {
            androidx.constraintlayout.solver.state.c cVar = this.f2316b.get(it2.next());
            if (cVar.c() != null) {
                Iterator<Object> it3 = cVar.f2308c.iterator();
                while (it3.hasNext()) {
                    cVar.c().a(this.f2315a.get(it3.next()).b());
                }
                cVar.b();
            }
        }
        Iterator<Object> it4 = this.f2315a.keySet().iterator();
        while (it4.hasNext()) {
            this.f2315a.get(it4.next()).apply();
        }
    }

    public androidx.constraintlayout.solver.state.helpers.c b(Object obj, d dVar) {
        androidx.constraintlayout.solver.state.helpers.c cVar = (androidx.constraintlayout.solver.state.helpers.c) l(obj, EnumC0020e.BARRIER);
        cVar.h(dVar);
        return cVar;
    }

    public androidx.constraintlayout.solver.state.helpers.a c(Object... objArr) {
        androidx.constraintlayout.solver.state.helpers.a aVar = (androidx.constraintlayout.solver.state.helpers.a) l(null, EnumC0020e.ALIGN_HORIZONTALLY);
        aVar.a(objArr);
        return aVar;
    }

    public androidx.constraintlayout.solver.state.helpers.b d(Object... objArr) {
        androidx.constraintlayout.solver.state.helpers.b bVar = (androidx.constraintlayout.solver.state.helpers.b) l(null, EnumC0020e.ALIGN_VERTICALLY);
        bVar.a(objArr);
        return bVar;
    }

    public androidx.constraintlayout.solver.state.a e(Object obj) {
        androidx.constraintlayout.solver.state.d dVar = this.f2315a.get(obj);
        if (dVar == null) {
            dVar = g(obj);
            this.f2315a.put(obj, dVar);
            dVar.a(obj);
        }
        if (dVar instanceof androidx.constraintlayout.solver.state.a) {
            return (androidx.constraintlayout.solver.state.a) dVar;
        }
        return null;
    }

    public int f(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public androidx.constraintlayout.solver.state.a g(Object obj) {
        return new androidx.constraintlayout.solver.state.a(this);
    }

    public void i() {
        for (Object obj : this.f2315a.keySet()) {
            e(obj).P(obj);
        }
    }

    public androidx.constraintlayout.solver.state.helpers.e j(Object obj, int i5) {
        androidx.constraintlayout.solver.state.d dVar = this.f2315a.get(obj);
        androidx.constraintlayout.solver.state.d dVar2 = dVar;
        if (dVar == null) {
            androidx.constraintlayout.solver.state.helpers.e eVar = new androidx.constraintlayout.solver.state.helpers.e(this);
            eVar.g(i5);
            eVar.a(obj);
            this.f2315a.put(obj, eVar);
            dVar2 = eVar;
        }
        return (androidx.constraintlayout.solver.state.helpers.e) dVar2;
    }

    public e k(androidx.constraintlayout.solver.state.b bVar) {
        return r(bVar);
    }

    public androidx.constraintlayout.solver.state.c l(Object obj, EnumC0020e enumC0020e) {
        androidx.constraintlayout.solver.state.c fVar;
        if (obj == null) {
            obj = h();
        }
        androidx.constraintlayout.solver.state.c cVar = this.f2316b.get(obj);
        if (cVar == null) {
            int i5 = a.f2319a[enumC0020e.ordinal()];
            if (i5 == 1) {
                fVar = new androidx.constraintlayout.solver.state.helpers.f(this);
            } else if (i5 == 2) {
                fVar = new g(this);
            } else if (i5 == 3) {
                fVar = new androidx.constraintlayout.solver.state.helpers.a(this);
            } else if (i5 == 4) {
                fVar = new androidx.constraintlayout.solver.state.helpers.b(this);
            } else if (i5 != 5) {
                cVar = new androidx.constraintlayout.solver.state.c(this, enumC0020e);
                this.f2316b.put(obj, cVar);
            } else {
                fVar = new androidx.constraintlayout.solver.state.helpers.c(this);
            }
            cVar = fVar;
            this.f2316b.put(obj, cVar);
        }
        return cVar;
    }

    public androidx.constraintlayout.solver.state.helpers.f m(Object... objArr) {
        androidx.constraintlayout.solver.state.helpers.f fVar = (androidx.constraintlayout.solver.state.helpers.f) l(null, EnumC0020e.HORIZONTAL_CHAIN);
        fVar.a(objArr);
        return fVar;
    }

    public androidx.constraintlayout.solver.state.helpers.e n(Object obj) {
        return j(obj, 0);
    }

    public void o(Object obj, Object obj2) {
        e(obj).P(obj2);
    }

    androidx.constraintlayout.solver.state.d p(Object obj) {
        return this.f2315a.get(obj);
    }

    public void q() {
        this.f2316b.clear();
    }

    public e r(androidx.constraintlayout.solver.state.b bVar) {
        this.f2317c.M(bVar);
        return this;
    }

    public e s(androidx.constraintlayout.solver.state.b bVar) {
        this.f2317c.Q(bVar);
        return this;
    }

    public g t(Object... objArr) {
        g gVar = (g) l(null, EnumC0020e.VERTICAL_CHAIN);
        gVar.a(objArr);
        return gVar;
    }

    public androidx.constraintlayout.solver.state.helpers.e u(Object obj) {
        return j(obj, 1);
    }

    public e v(androidx.constraintlayout.solver.state.b bVar) {
        return s(bVar);
    }
}
