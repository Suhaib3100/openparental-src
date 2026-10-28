package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;

/* compiled from: BaseMenuPresenter.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public abstract class b implements n {

    /* renamed from: o, reason: collision with root package name */
    protected Context f641o;

    /* renamed from: p, reason: collision with root package name */
    protected Context f642p;

    /* renamed from: q, reason: collision with root package name */
    protected g f643q;

    /* renamed from: r, reason: collision with root package name */
    protected LayoutInflater f644r;

    /* renamed from: s, reason: collision with root package name */
    protected LayoutInflater f645s;

    /* renamed from: t, reason: collision with root package name */
    private n.a f646t;

    /* renamed from: u, reason: collision with root package name */
    private int f647u;

    /* renamed from: v, reason: collision with root package name */
    private int f648v;

    /* renamed from: w, reason: collision with root package name */
    protected o f649w;

    /* renamed from: x, reason: collision with root package name */
    private int f650x;

    public b(Context context, int i5, int i6) {
        this.f641o = context;
        this.f644r = LayoutInflater.from(context);
        this.f647u = i5;
        this.f648v = i6;
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(g gVar, boolean z5) {
        n.a aVar = this.f646t;
        if (aVar != null) {
            aVar.b(gVar, z5);
        }
    }

    protected void c(View view, int i5) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f649w).addView(view, i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.n
    public void d(boolean z5) {
        ViewGroup viewGroup = (ViewGroup) this.f649w;
        if (viewGroup == null) {
            return;
        }
        g gVar = this.f643q;
        int i5 = 0;
        if (gVar != null) {
            gVar.u();
            ArrayList<j> H = this.f643q.H();
            int size = H.size();
            int i6 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                j jVar = H.get(i7);
                if (t(i6, jVar)) {
                    View childAt = viewGroup.getChildAt(i6);
                    j d6 = childAt instanceof o.a ? ((o.a) childAt).d() : null;
                    View r5 = r(jVar, childAt, viewGroup);
                    if (jVar != d6) {
                        r5.setPressed(false);
                        r5.jumpDrawablesToCurrentState();
                    }
                    if (r5 != childAt) {
                        c(r5, i6);
                    }
                    i6++;
                }
            }
            i5 = i6;
        }
        while (i5 < viewGroup.getChildCount()) {
            if (!p(viewGroup, i5)) {
                i5++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean f(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean g(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return this.f650x;
    }

    @Override // androidx.appcompat.view.menu.n
    public void h(n.a aVar) {
        this.f646t = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void i(Context context, g gVar) {
        this.f642p = context;
        this.f645s = LayoutInflater.from(context);
        this.f643q = gVar;
    }

    public abstract void k(j jVar, o.a aVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.g] */
    @Override // androidx.appcompat.view.menu.n
    public boolean l(t tVar) {
        n.a aVar = this.f646t;
        t tVar2 = tVar;
        if (aVar == null) {
            return false;
        }
        if (tVar == null) {
            tVar2 = this.f643q;
        }
        return aVar.c(tVar2);
    }

    @Override // androidx.appcompat.view.menu.n
    public o m(ViewGroup viewGroup) {
        if (this.f649w == null) {
            o oVar = (o) this.f644r.inflate(this.f647u, viewGroup, false);
            this.f649w = oVar;
            oVar.e(this.f643q);
            d(true);
        }
        return this.f649w;
    }

    public o.a o(ViewGroup viewGroup) {
        return (o.a) this.f644r.inflate(this.f648v, viewGroup, false);
    }

    protected boolean p(ViewGroup viewGroup, int i5) {
        viewGroup.removeViewAt(i5);
        return true;
    }

    public n.a q() {
        return this.f646t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View r(j jVar, View view, ViewGroup viewGroup) {
        o.a o5 = view instanceof o.a ? (o.a) view : o(viewGroup);
        k(jVar, o5);
        return (View) o5;
    }

    public void s(int i5) {
        this.f650x = i5;
    }

    public boolean t(int i5, j jVar) {
        return true;
    }
}
