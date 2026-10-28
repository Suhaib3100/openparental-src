package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ConstraintAnchor.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: j, reason: collision with root package name */
    private static final boolean f22895j = false;

    /* renamed from: k, reason: collision with root package name */
    private static final int f22896k = Integer.MIN_VALUE;

    /* renamed from: b, reason: collision with root package name */
    private int f22898b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f22899c;

    /* renamed from: d, reason: collision with root package name */
    public final e f22900d;

    /* renamed from: e, reason: collision with root package name */
    public final b f22901e;

    /* renamed from: f, reason: collision with root package name */
    public d f22902f;

    /* renamed from: i, reason: collision with root package name */
    androidx.constraintlayout.core.j f22905i;

    /* renamed from: a, reason: collision with root package name */
    private HashSet<d> f22897a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f22903g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f22904h = Integer.MIN_VALUE;

    /* compiled from: ConstraintAnchor.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22906a;

        static {
            int[] iArr = new int[b.values().length];
            f22906a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22906a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22906a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22906a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22906a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22906a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22906a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22906a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22906a[b.NONE.ordinal()] = 9;
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
        this.f22900d = eVar;
        this.f22901e = bVar;
    }

    private boolean s(e eVar, HashSet<e> hashSet) {
        if (hashSet.contains(eVar)) {
            return false;
        }
        hashSet.add(eVar);
        if (eVar == i()) {
            return true;
        }
        ArrayList<d> s4 = eVar.s();
        int size = s4.size();
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = s4.get(i4);
            if (dVar.u(this) && dVar.p() && s(dVar.k().i(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    public void A(int i4) {
        this.f22898b = i4;
        this.f22899c = true;
    }

    public void B(int i4) {
        if (p()) {
            this.f22904h = i4;
        }
    }

    public void C(int i4) {
        if (p()) {
            this.f22903g = i4;
        }
    }

    public boolean a(d dVar, int i4) {
        return b(dVar, i4, Integer.MIN_VALUE, false);
    }

    public boolean b(d dVar, int i4, int i5, boolean z4) {
        if (dVar == null) {
            x();
            return true;
        }
        if (!z4 && !v(dVar)) {
            return false;
        }
        this.f22902f = dVar;
        if (dVar.f22897a == null) {
            dVar.f22897a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f22902f.f22897a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f22903g = i4;
        this.f22904h = i5;
        return true;
    }

    public void c(d dVar, HashMap<e, e> hashMap) {
        HashSet<d> hashSet;
        d dVar2 = this.f22902f;
        if (dVar2 != null && (hashSet = dVar2.f22897a) != null) {
            hashSet.remove(this);
        }
        d dVar3 = dVar.f22902f;
        if (dVar3 != null) {
            this.f22902f = hashMap.get(dVar.f22902f.f22900d).r(dVar3.l());
        } else {
            this.f22902f = null;
        }
        d dVar4 = this.f22902f;
        if (dVar4 != null) {
            if (dVar4.f22897a == null) {
                dVar4.f22897a = new HashSet<>();
            }
            this.f22902f.f22897a.add(this);
        }
        this.f22903g = dVar.f22903g;
        this.f22904h = dVar.f22904h;
    }

    public void d(int i4, ArrayList<androidx.constraintlayout.core.widgets.analyzer.o> arrayList, androidx.constraintlayout.core.widgets.analyzer.o oVar) {
        HashSet<d> hashSet = this.f22897a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.analyzer.i.a(it.next().f22900d, i4, arrayList, oVar);
            }
        }
    }

    public HashSet<d> e() {
        return this.f22897a;
    }

    public int f() {
        if (this.f22899c) {
            return this.f22898b;
        }
        return 0;
    }

    public int g() {
        d dVar;
        if (this.f22900d.l0() == 8) {
            return 0;
        }
        return (this.f22904h == Integer.MIN_VALUE || (dVar = this.f22902f) == null || dVar.f22900d.l0() != 8) ? this.f22903g : this.f22904h;
    }

    public final d h() {
        switch (a.f22906a[this.f22901e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f22900d.S;
            case 3:
                return this.f22900d.Q;
            case 4:
                return this.f22900d.T;
            case 5:
                return this.f22900d.R;
            default:
                throw new AssertionError(this.f22901e.name());
        }
    }

    public e i() {
        return this.f22900d;
    }

    public androidx.constraintlayout.core.j j() {
        return this.f22905i;
    }

    public d k() {
        return this.f22902f;
    }

    public b l() {
        return this.f22901e;
    }

    public boolean m() {
        HashSet<d> hashSet = this.f22897a;
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
        HashSet<d> hashSet = this.f22897a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean o() {
        return this.f22899c;
    }

    public boolean p() {
        return this.f22902f != null;
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
        switch (a.f22906a[this.f22901e.ordinal()]) {
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
                throw new AssertionError(this.f22901e.name());
        }
    }

    public String toString() {
        return this.f22900d.y() + ":" + this.f22901e.toString();
    }

    public boolean u(d dVar) {
        b l4 = dVar.l();
        b bVar = this.f22901e;
        if (l4 == bVar) {
            return true;
        }
        switch (a.f22906a[bVar.ordinal()]) {
            case 1:
                return l4 != b.BASELINE;
            case 2:
            case 3:
            case 7:
                return l4 == b.LEFT || l4 == b.RIGHT || l4 == b.CENTER_X;
            case 4:
            case 5:
            case 6:
            case 8:
                return l4 == b.TOP || l4 == b.BOTTOM || l4 == b.CENTER_Y || l4 == b.BASELINE;
            case 9:
                return false;
            default:
                throw new AssertionError(this.f22901e.name());
        }
    }

    public boolean v(d dVar) {
        if (dVar == null) {
            return false;
        }
        b l4 = dVar.l();
        b bVar = this.f22901e;
        if (l4 == bVar) {
            return bVar != b.BASELINE || (dVar.i().q0() && i().q0());
        }
        switch (a.f22906a[bVar.ordinal()]) {
            case 1:
                return (l4 == b.BASELINE || l4 == b.CENTER_X || l4 == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z4 = l4 == b.LEFT || l4 == b.RIGHT;
                if (dVar.i() instanceof h) {
                    return z4 || l4 == b.CENTER_X;
                }
                return z4;
            case 4:
            case 5:
                boolean z5 = l4 == b.TOP || l4 == b.BOTTOM;
                if (dVar.i() instanceof h) {
                    return z5 || l4 == b.CENTER_Y;
                }
                return z5;
            case 6:
                return (l4 == b.LEFT || l4 == b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f22901e.name());
        }
    }

    public boolean w() {
        switch (a.f22906a[this.f22901e.ordinal()]) {
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
                throw new AssertionError(this.f22901e.name());
        }
    }

    public void x() {
        HashSet<d> hashSet;
        d dVar = this.f22902f;
        if (dVar != null && (hashSet = dVar.f22897a) != null) {
            hashSet.remove(this);
            if (this.f22902f.f22897a.size() == 0) {
                this.f22902f.f22897a = null;
            }
        }
        this.f22897a = null;
        this.f22902f = null;
        this.f22903g = 0;
        this.f22904h = Integer.MIN_VALUE;
        this.f22899c = false;
        this.f22898b = 0;
    }

    public void y() {
        this.f22899c = false;
        this.f22898b = 0;
    }

    public void z(androidx.constraintlayout.core.c cVar) {
        androidx.constraintlayout.core.j jVar = this.f22905i;
        if (jVar == null) {
            this.f22905i = new androidx.constraintlayout.core.j(j.b.UNRESTRICTED, (String) null);
        } else {
            jVar.g();
        }
    }
}
