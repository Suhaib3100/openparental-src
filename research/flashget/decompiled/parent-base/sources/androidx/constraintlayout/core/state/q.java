package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.core.motion.utils.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: Transition.java */
/* loaded from: classes.dex */
public class q implements w {
    private static final int A = -1;
    private static final int B = -2;

    /* renamed from: q, reason: collision with root package name */
    public static final int f22715q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final int f22716r = 1;

    /* renamed from: s, reason: collision with root package name */
    public static final int f22717s = 2;

    /* renamed from: t, reason: collision with root package name */
    static final int f22718t = 0;

    /* renamed from: u, reason: collision with root package name */
    static final int f22719u = 1;

    /* renamed from: v, reason: collision with root package name */
    static final int f22720v = 2;

    /* renamed from: w, reason: collision with root package name */
    static final int f22721w = 3;

    /* renamed from: x, reason: collision with root package name */
    static final int f22722x = 4;

    /* renamed from: y, reason: collision with root package name */
    static final int f22723y = 5;

    /* renamed from: z, reason: collision with root package name */
    static final int f22724z = 6;

    /* renamed from: h, reason: collision with root package name */
    HashMap<Integer, HashMap<String, a>> f22725h = new HashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private HashMap<String, b> f22726i = new HashMap<>();

    /* renamed from: j, reason: collision with root package name */
    v f22727j = new v();

    /* renamed from: k, reason: collision with root package name */
    private int f22728k = 0;

    /* renamed from: l, reason: collision with root package name */
    private String f22729l = null;

    /* renamed from: m, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.e f22730m = null;

    /* renamed from: n, reason: collision with root package name */
    private int f22731n = 0;

    /* renamed from: o, reason: collision with root package name */
    private int f22732o = 400;

    /* renamed from: p, reason: collision with root package name */
    private float f22733p = 0.0f;

    /* compiled from: Transition.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f22734a;

        /* renamed from: b, reason: collision with root package name */
        String f22735b;

        /* renamed from: c, reason: collision with root package name */
        int f22736c;

        /* renamed from: d, reason: collision with root package name */
        float f22737d;

        /* renamed from: e, reason: collision with root package name */
        float f22738e;

        public a(String str, int i4, int i5, float f4, float f5) {
            this.f22735b = str;
            this.f22734a = i4;
            this.f22736c = i5;
            this.f22737d = f4;
            this.f22738e = f5;
        }
    }

    /* compiled from: Transition.java */
    static class b {

        /* renamed from: d, reason: collision with root package name */
        androidx.constraintlayout.core.motion.c f22742d;

        /* renamed from: h, reason: collision with root package name */
        androidx.constraintlayout.core.motion.utils.h f22746h = new androidx.constraintlayout.core.motion.utils.h();

        /* renamed from: i, reason: collision with root package name */
        int f22747i = -1;

        /* renamed from: j, reason: collision with root package name */
        int f22748j = -1;

        /* renamed from: a, reason: collision with root package name */
        r f22739a = new r();

        /* renamed from: b, reason: collision with root package name */
        r f22740b = new r();

        /* renamed from: c, reason: collision with root package name */
        r f22741c = new r();

        /* renamed from: e, reason: collision with root package name */
        androidx.constraintlayout.core.motion.f f22743e = new androidx.constraintlayout.core.motion.f(this.f22739a);

        /* renamed from: f, reason: collision with root package name */
        androidx.constraintlayout.core.motion.f f22744f = new androidx.constraintlayout.core.motion.f(this.f22740b);

        /* renamed from: g, reason: collision with root package name */
        androidx.constraintlayout.core.motion.f f22745g = new androidx.constraintlayout.core.motion.f(this.f22741c);

        public b() {
            androidx.constraintlayout.core.motion.c cVar = new androidx.constraintlayout.core.motion.c(this.f22743e);
            this.f22742d = cVar;
            cVar.Z(this.f22743e);
            this.f22742d.X(this.f22744f);
        }

        public r a(int i4) {
            return i4 == 0 ? this.f22739a : i4 == 1 ? this.f22740b : this.f22741c;
        }

        public void b(int i4, int i5, float f4, q qVar) {
            this.f22747i = i5;
            this.f22748j = i4;
            this.f22742d.d0(i4, i5, 1.0f, System.nanoTime());
            r.n(i4, i5, this.f22741c, this.f22739a, this.f22740b, qVar, f4);
            this.f22741c.f22767q = f4;
            this.f22742d.Q(this.f22745g, f4, System.nanoTime(), this.f22746h);
        }

        public void c(v vVar) {
            androidx.constraintlayout.core.motion.key.d dVar = new androidx.constraintlayout.core.motion.key.d();
            vVar.g(dVar);
            this.f22742d.f(dVar);
        }

        public void d(v vVar) {
            androidx.constraintlayout.core.motion.key.e eVar = new androidx.constraintlayout.core.motion.key.e();
            vVar.g(eVar);
            this.f22742d.f(eVar);
        }

        public void e(v vVar) {
            androidx.constraintlayout.core.motion.key.f fVar = new androidx.constraintlayout.core.motion.key.f();
            vVar.g(fVar);
            this.f22742d.f(fVar);
        }

        public void f(androidx.constraintlayout.core.widgets.e eVar, int i4) {
            if (i4 == 0) {
                this.f22739a.C(eVar);
                this.f22742d.Z(this.f22743e);
            } else if (i4 == 1) {
                this.f22740b.C(eVar);
                this.f22742d.X(this.f22744f);
            }
            this.f22748j = -1;
        }
    }

    public static d E(int i4, final String str) {
        switch (i4) {
            case -1:
                return new d() { // from class: androidx.constraintlayout.core.state.i
                    @Override // androidx.constraintlayout.core.state.d
                    public final float getInterpolation(float f4) {
                        float Q;
                        Q = q.Q(str, f4);
                        return Q;
                    }
                };
            case 0:
                return new j();
            case 1:
                return new k();
            case 2:
                return new l();
            case 3:
                return new m();
            case 4:
                return new p();
            case 5:
                return new o();
            case 6:
                return new n();
            default:
                return null;
        }
    }

    private b L(String str) {
        return this.f22726i.get(str);
    }

    private b M(String str, androidx.constraintlayout.core.widgets.e eVar, int i4) {
        b bVar = this.f22726i.get(str);
        if (bVar == null) {
            bVar = new b();
            this.f22727j.g(bVar.f22742d);
            this.f22726i.put(str, bVar);
            if (eVar != null) {
                bVar.f(eVar, i4);
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float Q(String str, float f4) {
        return (float) androidx.constraintlayout.core.motion.utils.e.c(str).a(f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float R(float f4) {
        return (float) androidx.constraintlayout.core.motion.utils.e.c("standard").a(f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float S(float f4) {
        return (float) androidx.constraintlayout.core.motion.utils.e.c("accelerate").a(f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float T(float f4) {
        return (float) androidx.constraintlayout.core.motion.utils.e.c("decelerate").a(f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float U(float f4) {
        return (float) androidx.constraintlayout.core.motion.utils.e.c("linear").a(f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float V(float f4) {
        return (float) androidx.constraintlayout.core.motion.utils.e.c("anticipate").a(f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float W(float f4) {
        return (float) androidx.constraintlayout.core.motion.utils.e.c("overshoot").a(f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ float X(float f4) {
        return (float) androidx.constraintlayout.core.motion.utils.e.c("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").a(f4);
    }

    public r A(String str) {
        b bVar = this.f22726i.get(str);
        if (bVar == null) {
            return null;
        }
        return bVar.f22740b;
    }

    public r B(androidx.constraintlayout.core.widgets.e eVar) {
        return M(eVar.f22961o, null, 2).f22741c;
    }

    public r C(String str) {
        b bVar = this.f22726i.get(str);
        if (bVar == null) {
            return null;
        }
        return bVar.f22741c;
    }

    public d D() {
        return E(this.f22728k, this.f22729l);
    }

    public int F(String str, float[] fArr, int[] iArr, int[] iArr2) {
        return this.f22726i.get(str).f22742d.j(fArr, iArr, iArr2);
    }

    public androidx.constraintlayout.core.motion.c G(String str) {
        return M(str, null, 0).f22742d;
    }

    public int H(r rVar) {
        int i4 = 0;
        for (int i5 = 0; i5 <= 100; i5++) {
            HashMap<String, a> hashMap = this.f22725h.get(Integer.valueOf(i5));
            if (hashMap != null && hashMap.get(rVar.f22751a.f22961o) != null) {
                i4++;
            }
        }
        return i4;
    }

    public float[] I(String str) {
        float[] fArr = new float[124];
        this.f22726i.get(str).f22742d.k(fArr, 62);
        return fArr;
    }

    public r J(androidx.constraintlayout.core.widgets.e eVar) {
        return M(eVar.f22961o, null, 0).f22739a;
    }

    public r K(String str) {
        b bVar = this.f22726i.get(str);
        if (bVar == null) {
            return null;
        }
        return bVar.f22739a;
    }

    public boolean N() {
        return this.f22725h.size() > 0;
    }

    public void O(int i4, int i5, float f4) {
        androidx.constraintlayout.core.motion.utils.e eVar = this.f22730m;
        if (eVar != null) {
            f4 = (float) eVar.a(f4);
        }
        Iterator<String> it = this.f22726i.keySet().iterator();
        while (it.hasNext()) {
            this.f22726i.get(it.next()).b(i4, i5, f4, this);
        }
    }

    public boolean P() {
        return this.f22726i.isEmpty();
    }

    public void Y(v vVar) {
        vVar.f(this.f22727j);
        vVar.g(this);
    }

    public void Z(androidx.constraintlayout.core.widgets.f fVar, int i4) {
        ArrayList<androidx.constraintlayout.core.widgets.e> l22 = fVar.l2();
        int size = l22.size();
        for (int i5 = 0; i5 < size; i5++) {
            androidx.constraintlayout.core.widgets.e eVar = l22.get(i5);
            M(eVar.f22961o, null, i4).f(eVar, i4);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public int a(String str) {
        return 0;
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public boolean b(int i4, int i5) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public boolean c(int i4, float f4) {
        if (i4 != 706) {
            return false;
        }
        this.f22733p = f4;
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public boolean d(int i4, boolean z4) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public boolean e(int i4, String str) {
        if (i4 != 705) {
            return false;
        }
        this.f22729l = str;
        this.f22730m = androidx.constraintlayout.core.motion.utils.e.c(str);
        return false;
    }

    public void n(int i4, String str, String str2, int i5) {
        M(str, null, i4).a(i4).c(str2, i5);
    }

    public void o(int i4, String str, String str2, float f4) {
        M(str, null, i4).a(i4).d(str2, f4);
    }

    public void p(String str, v vVar) {
        M(str, null, 0).c(vVar);
    }

    public void q(String str, v vVar) {
        M(str, null, 0).d(vVar);
    }

    public void r(String str, int i4, int i5, float f4, float f5) {
        v vVar = new v();
        vVar.b(w.g.f22543r, 2);
        vVar.b(100, i4);
        vVar.a(w.g.f22539n, f4);
        vVar.a(507, f5);
        M(str, null, 0).e(vVar);
        a aVar = new a(str, i4, i5, f4, f5);
        HashMap<String, a> hashMap = this.f22725h.get(Integer.valueOf(i4));
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.f22725h.put(Integer.valueOf(i4), hashMap);
        }
        hashMap.put(str, aVar);
    }

    public void s(String str, v vVar) {
        M(str, null, 0).e(vVar);
    }

    public void t() {
        this.f22726i.clear();
    }

    public boolean u(String str) {
        return this.f22726i.containsKey(str);
    }

    public void v(r rVar, float[] fArr, float[] fArr2, float[] fArr3) {
        a aVar;
        int i4 = 0;
        for (int i5 = 0; i5 <= 100; i5++) {
            HashMap<String, a> hashMap = this.f22725h.get(Integer.valueOf(i5));
            if (hashMap != null && (aVar = hashMap.get(rVar.f22751a.f22961o)) != null) {
                fArr[i4] = aVar.f22737d;
                fArr2[i4] = aVar.f22738e;
                fArr3[i4] = aVar.f22734a;
                i4++;
            }
        }
    }

    public a w(String str, int i4) {
        a aVar;
        while (i4 <= 100) {
            HashMap<String, a> hashMap = this.f22725h.get(Integer.valueOf(i4));
            if (hashMap != null && (aVar = hashMap.get(str)) != null) {
                return aVar;
            }
            i4++;
        }
        return null;
    }

    public a x(String str, int i4) {
        a aVar;
        while (i4 >= 0) {
            HashMap<String, a> hashMap = this.f22725h.get(Integer.valueOf(i4));
            if (hashMap != null && (aVar = hashMap.get(str)) != null) {
                return aVar;
            }
            i4--;
        }
        return null;
    }

    public int y() {
        return this.f22731n;
    }

    public r z(androidx.constraintlayout.core.widgets.e eVar) {
        return M(eVar.f22961o, null, 1).f22740b;
    }
}
