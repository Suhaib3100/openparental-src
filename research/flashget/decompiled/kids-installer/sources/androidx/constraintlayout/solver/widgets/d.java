package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.k;
import androidx.constraintlayout.solver.widgets.analyzer.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ConstraintAnchor.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: j, reason: collision with root package name */
    private static final boolean f2484j = false;

    /* renamed from: k, reason: collision with root package name */
    private static final int f2485k = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f2487b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2488c;

    /* renamed from: d, reason: collision with root package name */
    public final e f2489d;

    /* renamed from: e, reason: collision with root package name */
    public final b f2490e;

    /* renamed from: f, reason: collision with root package name */
    public d f2491f;

    /* renamed from: i, reason: collision with root package name */
    androidx.constraintlayout.solver.k f2494i;

    /* renamed from: a, reason: collision with root package name */
    private HashSet<d> f2486a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f2492g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f2493h = -1;

    /* compiled from: ConstraintAnchor.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2495a;

        static {
            int[] iArr = new int[b.values().length];
            f2495a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2495a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2495a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2495a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2495a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2495a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2495a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2495a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2495a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: ConstraintAnchor.java */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f2489d = eVar;
        this.f2490e = bVar;
    }

    private boolean s(e eVar, HashSet<e> hashSet) {
        if (hashSet.contains(eVar)) {
            return false;
        }
        hashSet.add(eVar);
        if (eVar == i()) {
            return true;
        }
        ArrayList<d> s5 = eVar.s();
        int size = s5.size();
        for (int i5 = 0; i5 < size; i5++) {
            d dVar = s5.get(i5);
            if (dVar.u(this) && dVar.p() && s(dVar.k().i(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    public void A(int i5) {
        this.f2487b = i5;
        this.f2488c = true;
    }

    public void B(int i5) {
        if (p()) {
            this.f2493h = i5;
        }
    }

    public void C(int i5) {
        if (p()) {
            this.f2492g = i5;
        }
    }

    public boolean a(d dVar, int i5) {
        return b(dVar, i5, -1, false);
    }

    public boolean b(d dVar, int i5, int i6, boolean z5) {
        if (dVar == null) {
            x();
            return true;
        }
        if (!z5 && !v(dVar)) {
            return false;
        }
        this.f2491f = dVar;
        if (dVar.f2486a == null) {
            dVar.f2486a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f2491f.f2486a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i5 > 0) {
            this.f2492g = i5;
        } else {
            this.f2492g = 0;
        }
        this.f2493h = i6;
        return true;
    }

    public void c(d dVar, HashMap<e, e> hashMap) {
        HashSet<d> hashSet;
        d dVar2 = this.f2491f;
        if (dVar2 != null && (hashSet = dVar2.f2486a) != null) {
            hashSet.remove(this);
        }
        d dVar3 = dVar.f2491f;
        if (dVar3 != null) {
            this.f2491f = hashMap.get(dVar.f2491f.f2489d).r(dVar3.l());
        } else {
            this.f2491f = null;
        }
        d dVar4 = this.f2491f;
        if (dVar4 != null) {
            if (dVar4.f2486a == null) {
                dVar4.f2486a = new HashSet<>();
            }
            this.f2491f.f2486a.add(this);
        }
        this.f2492g = dVar.f2492g;
        this.f2493h = dVar.f2493h;
    }

    public void d(int i5, ArrayList<p> arrayList, p pVar) {
        HashSet<d> hashSet = this.f2486a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.solver.widgets.analyzer.j.a(it.next().f2489d, i5, arrayList, pVar);
            }
        }
    }

    public HashSet<d> e() {
        return this.f2486a;
    }

    public int f() {
        if (this.f2488c) {
            return this.f2487b;
        }
        return 0;
    }

    public int g() {
        d dVar;
        if (this.f2489d.i0() == 8) {
            return 0;
        }
        return (this.f2493h <= -1 || (dVar = this.f2491f) == null || dVar.f2489d.i0() != 8) ? this.f2492g : this.f2493h;
    }

    public final d h() {
        switch (a.f2495a[this.f2490e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f2489d.L;
            case 3:
                return this.f2489d.J;
            case 4:
                return this.f2489d.M;
            case 5:
                return this.f2489d.K;
            default:
                throw new AssertionError(this.f2490e.name());
        }
    }

    public e i() {
        return this.f2489d;
    }

    public androidx.constraintlayout.solver.k j() {
        return this.f2494i;
    }

    public d k() {
        return this.f2491f;
    }

    public b l() {
        return this.f2490e;
    }

    public boolean m() {
        HashSet<d> hashSet = this.f2486a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().h().p()) {
                return true;
            }
        }
        return false;
    }

    public boolean n() {
        HashSet<d> hashSet = this.f2486a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean o() {
        return this.f2488c;
    }

    public boolean p() {
        return this.f2491f != null;
    }

    public boolean q(e eVar) {
        if (s(eVar, new HashSet<>())) {
            return false;
        }
        e U = i().U();
        return U == eVar || eVar.U() == U;
    }

    public boolean r(e eVar, d dVar) {
        return q(eVar);
    }

    public boolean t() {
        switch (a.f2495a[this.f2490e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                throw new AssertionError(this.f2490e.name());
        }
    }

    public String toString() {
        return this.f2489d.y() + ":" + this.f2490e.toString();
    }

    public boolean u(d dVar) {
        b l5 = dVar.l();
        b bVar = this.f2490e;
        if (l5 == bVar) {
            return true;
        }
        switch (a.f2495a[bVar.ordinal()]) {
            case 1:
                return l5 != b.BASELINE;
            case 2:
            case 3:
            case 7:
                return l5 == b.LEFT || l5 == b.RIGHT || l5 == b.CENTER_X;
            case 4:
            case 5:
            case 6:
            case 8:
                return l5 == b.TOP || l5 == b.BOTTOM || l5 == b.CENTER_Y || l5 == b.BASELINE;
            case 9:
                return false;
            default:
                throw new AssertionError(this.f2490e.name());
        }
    }

    public boolean v(d dVar) {
        if (dVar == null) {
            return false;
        }
        b l5 = dVar.l();
        b bVar = this.f2490e;
        if (l5 == bVar) {
            return bVar != b.BASELINE || (dVar.i().m0() && i().m0());
        }
        switch (a.f2495a[bVar.ordinal()]) {
            case 1:
                return (l5 == b.BASELINE || l5 == b.CENTER_X || l5 == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z5 = l5 == b.LEFT || l5 == b.RIGHT;
                if (dVar.i() instanceof h) {
                    return z5 || l5 == b.CENTER_X;
                }
                return z5;
            case 4:
            case 5:
                boolean z6 = l5 == b.TOP || l5 == b.BOTTOM;
                if (dVar.i() instanceof h) {
                    return z6 || l5 == b.CENTER_Y;
                }
                return z6;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f2490e.name());
        }
    }

    public boolean w() {
        switch (a.f2495a[this.f2490e.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 7:
                return false;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
                return true;
            default:
                throw new AssertionError(this.f2490e.name());
        }
    }

    public void x() {
        HashSet<d> hashSet;
        d dVar = this.f2491f;
        if (dVar != null && (hashSet = dVar.f2486a) != null) {
            hashSet.remove(this);
            if (this.f2491f.f2486a.size() == 0) {
                this.f2491f.f2486a = null;
            }
        }
        this.f2486a = null;
        this.f2491f = null;
        this.f2492g = 0;
        this.f2493h = -1;
        this.f2488c = false;
        this.f2487b = 0;
    }

    public void y() {
        this.f2488c = false;
        this.f2487b = 0;
    }

    public void z(androidx.constraintlayout.solver.c cVar) {
        androidx.constraintlayout.solver.k kVar = this.f2494i;
        if (kVar == null) {
            this.f2494i = new androidx.constraintlayout.solver.k(k.b.UNRESTRICTED, (String) null);
        } else {
            kVar.g();
        }
    }
}
