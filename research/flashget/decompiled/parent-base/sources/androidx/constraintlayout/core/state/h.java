package androidx.constraintlayout.core.state;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: State.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: f, reason: collision with root package name */
    static final int f22686f = -1;

    /* renamed from: g, reason: collision with root package name */
    static final int f22687g = 0;

    /* renamed from: h, reason: collision with root package name */
    static final int f22688h = 1;

    /* renamed from: i, reason: collision with root package name */
    static final int f22689i = 2;

    /* renamed from: j, reason: collision with root package name */
    public static final Integer f22690j = 0;

    /* renamed from: a, reason: collision with root package name */
    protected HashMap<Object, androidx.constraintlayout.core.state.e> f22691a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    protected HashMap<Object, androidx.constraintlayout.core.state.c> f22692b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    HashMap<String, ArrayList<String>> f22693c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final androidx.constraintlayout.core.state.a f22694d;

    /* renamed from: e, reason: collision with root package name */
    private int f22695e;

    /* compiled from: State.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22696a;

        static {
            int[] iArr = new int[e.values().length];
            f22696a = iArr;
            try {
                iArr[e.HORIZONTAL_CHAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22696a[e.VERTICAL_CHAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22696a[e.ALIGN_HORIZONTALLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22696a[e.ALIGN_VERTICALLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22696a[e.BARRIER.ordinal()] = 5;
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
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
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
    public enum e {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        FLOW
    }

    public h() {
        androidx.constraintlayout.core.state.a aVar = new androidx.constraintlayout.core.state.a(this);
        this.f22694d = aVar;
        this.f22695e = 0;
        this.f22691a.put(f22690j, aVar);
    }

    private String h() {
        StringBuilder sb = new StringBuilder("__HELPER_KEY_");
        int i4 = this.f22695e;
        this.f22695e = i4 + 1;
        return android.support.v4.media.b.a(sb, i4, "__");
    }

    public androidx.constraintlayout.core.state.helpers.f A(Object obj) {
        return k(obj, 1);
    }

    public h B(androidx.constraintlayout.core.state.b bVar) {
        return x(bVar);
    }

    public void a(androidx.constraintlayout.core.widgets.f fVar) {
        androidx.constraintlayout.core.state.c cVar;
        androidx.constraintlayout.core.widgets.j M0;
        androidx.constraintlayout.core.widgets.j M02;
        fVar.p2();
        this.f22694d.V().j(this, fVar, 0);
        this.f22694d.D().j(this, fVar, 1);
        for (Object obj : this.f22692b.keySet()) {
            androidx.constraintlayout.core.widgets.j M03 = this.f22692b.get(obj).M0();
            if (M03 != null) {
                androidx.constraintlayout.core.state.e eVar = this.f22691a.get(obj);
                if (eVar == null) {
                    eVar = e(obj);
                }
                eVar.b(M03);
            }
        }
        for (Object obj2 : this.f22691a.keySet()) {
            androidx.constraintlayout.core.state.e eVar2 = this.f22691a.get(obj2);
            if (eVar2 != this.f22694d && (eVar2.d() instanceof androidx.constraintlayout.core.state.c) && (M02 = ((androidx.constraintlayout.core.state.c) eVar2.d()).M0()) != null) {
                androidx.constraintlayout.core.state.e eVar3 = this.f22691a.get(obj2);
                if (eVar3 == null) {
                    eVar3 = e(obj2);
                }
                eVar3.b(M02);
            }
        }
        Iterator<Object> it = this.f22691a.keySet().iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.state.e eVar4 = this.f22691a.get(it.next());
            if (eVar4 != this.f22694d) {
                androidx.constraintlayout.core.widgets.e a5 = eVar4.a();
                a5.j1(eVar4.getKey().toString());
                a5.S1(null);
                if (eVar4.d() instanceof androidx.constraintlayout.core.state.helpers.f) {
                    eVar4.apply();
                }
                fVar.a(a5);
            } else {
                eVar4.b(fVar);
            }
        }
        Iterator<Object> it2 = this.f22692b.keySet().iterator();
        while (it2.hasNext()) {
            androidx.constraintlayout.core.state.c cVar2 = this.f22692b.get(it2.next());
            if (cVar2.M0() != null) {
                Iterator<Object> it3 = cVar2.f22682l0.iterator();
                while (it3.hasNext()) {
                    cVar2.M0().a(this.f22691a.get(it3.next()).a());
                }
                cVar2.apply();
            } else {
                cVar2.apply();
            }
        }
        Iterator<Object> it4 = this.f22691a.keySet().iterator();
        while (it4.hasNext()) {
            androidx.constraintlayout.core.state.e eVar5 = this.f22691a.get(it4.next());
            if (eVar5 != this.f22694d && (eVar5.d() instanceof androidx.constraintlayout.core.state.c) && (M0 = (cVar = (androidx.constraintlayout.core.state.c) eVar5.d()).M0()) != null) {
                Iterator<Object> it5 = cVar.f22682l0.iterator();
                while (it5.hasNext()) {
                    Object next = it5.next();
                    androidx.constraintlayout.core.state.e eVar6 = this.f22691a.get(next);
                    if (eVar6 != null) {
                        M0.a(eVar6.a());
                    } else if (next instanceof androidx.constraintlayout.core.state.e) {
                        M0.a(((androidx.constraintlayout.core.state.e) next).a());
                    } else {
                        System.out.println("couldn't find reference for " + next);
                    }
                }
                eVar5.apply();
            }
        }
        for (Object obj3 : this.f22691a.keySet()) {
            androidx.constraintlayout.core.state.e eVar7 = this.f22691a.get(obj3);
            eVar7.apply();
            androidx.constraintlayout.core.widgets.e a6 = eVar7.a();
            if (a6 != null && obj3 != null) {
                a6.f22961o = obj3.toString();
            }
        }
    }

    public androidx.constraintlayout.core.state.helpers.c b(Object obj, d dVar) {
        androidx.constraintlayout.core.state.a e4 = e(obj);
        if (e4.d() == null || !(e4.d() instanceof androidx.constraintlayout.core.state.helpers.c)) {
            androidx.constraintlayout.core.state.helpers.c cVar = new androidx.constraintlayout.core.state.helpers.c(this);
            cVar.P0(dVar);
            e4.p0(cVar);
        }
        return (androidx.constraintlayout.core.state.helpers.c) e4.d();
    }

    public androidx.constraintlayout.core.state.helpers.a c(Object... objArr) {
        androidx.constraintlayout.core.state.helpers.a aVar = (androidx.constraintlayout.core.state.helpers.a) m(null, e.ALIGN_HORIZONTALLY);
        aVar.L0(objArr);
        return aVar;
    }

    public androidx.constraintlayout.core.state.helpers.b d(Object... objArr) {
        androidx.constraintlayout.core.state.helpers.b bVar = (androidx.constraintlayout.core.state.helpers.b) m(null, e.ALIGN_VERTICALLY);
        bVar.L0(objArr);
        return bVar;
    }

    public androidx.constraintlayout.core.state.a e(Object obj) {
        androidx.constraintlayout.core.state.e eVar = this.f22691a.get(obj);
        if (eVar == null) {
            eVar = g(obj);
            this.f22691a.put(obj, eVar);
            eVar.c(obj);
        }
        if (eVar instanceof androidx.constraintlayout.core.state.a) {
            return (androidx.constraintlayout.core.state.a) eVar;
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

    public androidx.constraintlayout.core.state.a g(Object obj) {
        return new androidx.constraintlayout.core.state.a(this);
    }

    public void i() {
        for (Object obj : this.f22691a.keySet()) {
            androidx.constraintlayout.core.state.a e4 = e(obj);
            if (e4 != null) {
                e4.w0(obj);
            }
        }
    }

    public ArrayList<String> j(String str) {
        if (this.f22693c.containsKey(str)) {
            return this.f22693c.get(str);
        }
        return null;
    }

    public androidx.constraintlayout.core.state.helpers.f k(Object obj, int i4) {
        androidx.constraintlayout.core.state.a e4 = e(obj);
        if (e4.d() == null || !(e4.d() instanceof androidx.constraintlayout.core.state.helpers.f)) {
            androidx.constraintlayout.core.state.helpers.f fVar = new androidx.constraintlayout.core.state.helpers.f(this);
            fVar.h(i4);
            fVar.c(obj);
            e4.p0(fVar);
        }
        return (androidx.constraintlayout.core.state.helpers.f) e4.d();
    }

    public h l(androidx.constraintlayout.core.state.b bVar) {
        return v(bVar);
    }

    public androidx.constraintlayout.core.state.c m(Object obj, e eVar) {
        androidx.constraintlayout.core.state.c gVar;
        if (obj == null) {
            obj = h();
        }
        androidx.constraintlayout.core.state.c cVar = this.f22692b.get(obj);
        if (cVar == null) {
            int i4 = a.f22696a[eVar.ordinal()];
            if (i4 == 1) {
                gVar = new androidx.constraintlayout.core.state.helpers.g(this);
            } else if (i4 == 2) {
                gVar = new androidx.constraintlayout.core.state.helpers.h(this);
            } else if (i4 == 3) {
                gVar = new androidx.constraintlayout.core.state.helpers.a(this);
            } else if (i4 == 4) {
                gVar = new androidx.constraintlayout.core.state.helpers.b(this);
            } else if (i4 != 5) {
                cVar = new androidx.constraintlayout.core.state.c(this, eVar);
                cVar.c(obj);
                this.f22692b.put(obj, cVar);
            } else {
                gVar = new androidx.constraintlayout.core.state.helpers.c(this);
            }
            cVar = gVar;
            cVar.c(obj);
            this.f22692b.put(obj, cVar);
        }
        return cVar;
    }

    public androidx.constraintlayout.core.state.helpers.g n() {
        return (androidx.constraintlayout.core.state.helpers.g) m(null, e.HORIZONTAL_CHAIN);
    }

    public androidx.constraintlayout.core.state.helpers.g o(Object... objArr) {
        androidx.constraintlayout.core.state.helpers.g gVar = (androidx.constraintlayout.core.state.helpers.g) m(null, e.HORIZONTAL_CHAIN);
        gVar.L0(objArr);
        return gVar;
    }

    public androidx.constraintlayout.core.state.helpers.f p(Object obj) {
        return k(obj, 0);
    }

    public void q(Object obj, Object obj2) {
        androidx.constraintlayout.core.state.a e4 = e(obj);
        if (e4 != null) {
            e4.w0(obj2);
        }
    }

    androidx.constraintlayout.core.state.e r(Object obj) {
        return this.f22691a.get(obj);
    }

    public void s() {
        this.f22692b.clear();
        this.f22693c.clear();
    }

    public boolean t(int i4) {
        return this.f22694d.D().k(i4);
    }

    public boolean u(int i4) {
        return this.f22694d.V().k(i4);
    }

    public h v(androidx.constraintlayout.core.state.b bVar) {
        this.f22694d.q0(bVar);
        return this;
    }

    public void w(String str, String str2) {
        ArrayList<String> arrayList;
        androidx.constraintlayout.core.state.a e4 = e(str);
        if (e4 != null) {
            e4.t0(str2);
            if (this.f22693c.containsKey(str2)) {
                arrayList = this.f22693c.get(str2);
            } else {
                arrayList = new ArrayList<>();
                this.f22693c.put(str2, arrayList);
            }
            arrayList.add(str);
        }
    }

    public h x(androidx.constraintlayout.core.state.b bVar) {
        this.f22694d.x0(bVar);
        return this;
    }

    public androidx.constraintlayout.core.state.helpers.h y() {
        return (androidx.constraintlayout.core.state.helpers.h) m(null, e.VERTICAL_CHAIN);
    }

    public androidx.constraintlayout.core.state.helpers.h z(Object... objArr) {
        androidx.constraintlayout.core.state.helpers.h hVar = (androidx.constraintlayout.core.state.helpers.h) m(null, e.VERTICAL_CHAIN);
        hVar.L0(objArr);
        return hVar;
    }
}
