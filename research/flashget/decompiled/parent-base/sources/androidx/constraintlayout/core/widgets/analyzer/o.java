package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WidgetGroup.java */
/* loaded from: classes.dex */
public class o {

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f22844g = false;

    /* renamed from: h, reason: collision with root package name */
    static int f22845h;

    /* renamed from: b, reason: collision with root package name */
    int f22847b;

    /* renamed from: d, reason: collision with root package name */
    int f22849d;

    /* renamed from: a, reason: collision with root package name */
    ArrayList<androidx.constraintlayout.core.widgets.e> f22846a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    boolean f22848c = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList<a> f22850e = null;

    /* renamed from: f, reason: collision with root package name */
    private int f22851f = -1;

    /* compiled from: WidgetGroup.java */
    class a {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<androidx.constraintlayout.core.widgets.e> f22852a;

        /* renamed from: b, reason: collision with root package name */
        int f22853b;

        /* renamed from: c, reason: collision with root package name */
        int f22854c;

        /* renamed from: d, reason: collision with root package name */
        int f22855d;

        /* renamed from: e, reason: collision with root package name */
        int f22856e;

        /* renamed from: f, reason: collision with root package name */
        int f22857f;

        /* renamed from: g, reason: collision with root package name */
        int f22858g;

        public a(androidx.constraintlayout.core.widgets.e eVar, androidx.constraintlayout.core.f fVar, int i4) {
            this.f22852a = new WeakReference<>(eVar);
            this.f22853b = fVar.O(eVar.Q);
            this.f22854c = fVar.O(eVar.R);
            this.f22855d = fVar.O(eVar.S);
            this.f22856e = fVar.O(eVar.T);
            this.f22857f = fVar.O(eVar.U);
            this.f22858g = i4;
        }

        public void a() {
            androidx.constraintlayout.core.widgets.e eVar = this.f22852a.get();
            if (eVar != null) {
                eVar.p1(this.f22853b, this.f22854c, this.f22855d, this.f22856e, this.f22857f, this.f22858g);
            }
        }
    }

    public o(int i4) {
        int i5 = f22845h;
        f22845h = i5 + 1;
        this.f22847b = i5;
        this.f22849d = i4;
    }

    private boolean e(androidx.constraintlayout.core.widgets.e eVar) {
        return this.f22846a.contains(eVar);
    }

    private String h() {
        int i4 = this.f22849d;
        return i4 == 0 ? "Horizontal" : i4 == 1 ? "Vertical" : i4 == 2 ? "Both" : "Unknown";
    }

    private int k(int i4, androidx.constraintlayout.core.widgets.e eVar) {
        e.b z4 = eVar.z(i4);
        if (z4 == e.b.WRAP_CONTENT || z4 == e.b.MATCH_PARENT || z4 == e.b.FIXED) {
            return i4 == 0 ? eVar.m0() : eVar.D();
        }
        return -1;
    }

    private int q(androidx.constraintlayout.core.f fVar, ArrayList<androidx.constraintlayout.core.widgets.e> arrayList, int i4) {
        int O;
        int O2;
        androidx.constraintlayout.core.widgets.f fVar2 = (androidx.constraintlayout.core.widgets.f) arrayList.get(0).U();
        fVar.Y();
        fVar2.g(fVar, false);
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            arrayList.get(i5).g(fVar, false);
        }
        if (i4 == 0 && fVar2.M1 > 0) {
            androidx.constraintlayout.core.widgets.b.b(fVar2, fVar, arrayList, 0);
        }
        if (i4 == 1 && fVar2.N1 > 0) {
            androidx.constraintlayout.core.widgets.b.b(fVar2, fVar, arrayList, 1);
        }
        try {
            fVar.T();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        this.f22850e = new ArrayList<>();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            this.f22850e.add(new a(arrayList.get(i6), fVar, i4));
        }
        if (i4 == 0) {
            O = fVar.O(fVar2.Q);
            O2 = fVar.O(fVar2.S);
            fVar.Y();
        } else {
            O = fVar.O(fVar2.R);
            O2 = fVar.O(fVar2.T);
            fVar.Y();
        }
        return O2 - O;
    }

    public boolean a(androidx.constraintlayout.core.widgets.e eVar) {
        if (this.f22846a.contains(eVar)) {
            return false;
        }
        this.f22846a.add(eVar);
        return true;
    }

    public void b() {
        if (this.f22850e != null && this.f22848c) {
            for (int i4 = 0; i4 < this.f22850e.size(); i4++) {
                this.f22850e.get(i4).a();
            }
        }
    }

    public void c(ArrayList<o> arrayList) {
        int size = this.f22846a.size();
        if (this.f22851f != -1 && size > 0) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                o oVar = arrayList.get(i4);
                if (this.f22851f == oVar.f22847b) {
                    m(this.f22849d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public void d() {
        this.f22846a.clear();
    }

    public int f() {
        return this.f22847b;
    }

    public int g() {
        return this.f22849d;
    }

    public boolean i(o oVar) {
        for (int i4 = 0; i4 < this.f22846a.size(); i4++) {
            if (oVar.f22846a.contains(this.f22846a.get(i4))) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return this.f22848c;
    }

    public int l(androidx.constraintlayout.core.f fVar, int i4) {
        if (this.f22846a.size() == 0) {
            return 0;
        }
        return q(fVar, this.f22846a, i4);
    }

    public void m(int i4, o oVar) {
        Iterator<androidx.constraintlayout.core.widgets.e> it = this.f22846a.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.widgets.e next = it.next();
            oVar.a(next);
            if (i4 == 0) {
                next.S0 = oVar.f();
            } else {
                next.T0 = oVar.f();
            }
        }
        this.f22851f = oVar.f22847b;
    }

    public void n(boolean z4) {
        this.f22848c = z4;
    }

    public void o(int i4) {
        this.f22849d = i4;
    }

    public int p() {
        return this.f22846a.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(h());
        sb.append(" [");
        String a5 = android.support.v4.media.b.a(sb, this.f22847b, "] <");
        Iterator<androidx.constraintlayout.core.widgets.e> it = this.f22846a.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.widgets.e next = it.next();
            StringBuilder a6 = androidx.constraintlayout.core.e.a(a5, " ");
            a6.append(next.y());
            a5 = a6.toString();
        }
        return androidx.compose.runtime.changelist.j.a(a5, " >");
    }
}
