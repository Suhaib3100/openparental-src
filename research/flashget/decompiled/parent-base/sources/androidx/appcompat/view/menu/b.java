package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.p;
import java.util.ArrayList;

/* compiled from: BaseMenuPresenter.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class b implements o {

    /* renamed from: b, reason: collision with root package name */
    protected Context f1176b;

    /* renamed from: c, reason: collision with root package name */
    protected Context f1177c;

    /* renamed from: d, reason: collision with root package name */
    protected h f1178d;

    /* renamed from: e, reason: collision with root package name */
    protected LayoutInflater f1179e;

    /* renamed from: f, reason: collision with root package name */
    protected LayoutInflater f1180f;

    /* renamed from: g, reason: collision with root package name */
    private o.a f1181g;

    /* renamed from: h, reason: collision with root package name */
    private int f1182h;

    /* renamed from: i, reason: collision with root package name */
    private int f1183i;

    /* renamed from: j, reason: collision with root package name */
    protected p f1184j;

    /* renamed from: k, reason: collision with root package name */
    private int f1185k;

    public b(Context context, int i4, int i5) {
        this.f1176b = context;
        this.f1179e = LayoutInflater.from(context);
        this.f1182h = i4;
        this.f1183i = i5;
    }

    @Override // androidx.appcompat.view.menu.o
    public int a() {
        return this.f1185k;
    }

    protected void c(View view, int i4) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1184j).addView(view, i4);
    }

    @Override // androidx.appcompat.view.menu.o
    public void d(h hVar, boolean z4) {
        o.a aVar = this.f1181g;
        if (aVar != null) {
            aVar.d(hVar, z4);
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean e(h hVar, k kVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public void f(o.a aVar) {
        this.f1181g = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.h] */
    @Override // androidx.appcompat.view.menu.o
    public boolean h(t tVar) {
        o.a aVar = this.f1181g;
        t tVar2 = tVar;
        if (aVar == null) {
            return false;
        }
        if (tVar == null) {
            tVar2 = this.f1178d;
        }
        return aVar.e(tVar2);
    }

    @Override // androidx.appcompat.view.menu.o
    public p i(ViewGroup viewGroup) {
        if (this.f1184j == null) {
            p pVar = (p) this.f1179e.inflate(this.f1182h, viewGroup, false);
            this.f1184j = pVar;
            pVar.a(this.f1178d);
            k(true);
        }
        return this.f1184j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.o
    public void k(boolean z4) {
        ViewGroup viewGroup = (ViewGroup) this.f1184j;
        if (viewGroup == null) {
            return;
        }
        h hVar = this.f1178d;
        int i4 = 0;
        if (hVar != null) {
            hVar.u();
            ArrayList<k> H = this.f1178d.H();
            int size = H.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                k kVar = H.get(i6);
                if (u(i5, kVar)) {
                    View childAt = viewGroup.getChildAt(i5);
                    k g4 = childAt instanceof p.a ? ((p.a) childAt).g() : null;
                    View s4 = s(kVar, childAt, viewGroup);
                    if (kVar != g4) {
                        s4.setPressed(false);
                        s4.jumpDrawablesToCurrentState();
                    }
                    if (s4 != childAt) {
                        c(s4, i5);
                    }
                    i5++;
                }
            }
            i4 = i5;
        }
        while (i4 < viewGroup.getChildCount()) {
            if (!q(viewGroup, i4)) {
                i4++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean l() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean m(h hVar, k kVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public void n(Context context, h hVar) {
        this.f1177c = context;
        this.f1180f = LayoutInflater.from(context);
        this.f1178d = hVar;
    }

    public abstract void o(k kVar, p.a aVar);

    public p.a p(ViewGroup viewGroup) {
        return (p.a) this.f1179e.inflate(this.f1183i, viewGroup, false);
    }

    protected boolean q(ViewGroup viewGroup, int i4) {
        viewGroup.removeViewAt(i4);
        return true;
    }

    public o.a r() {
        return this.f1181g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View s(k kVar, View view, ViewGroup viewGroup) {
        p.a p4 = view instanceof p.a ? (p.a) view : p(viewGroup);
        o(kVar, p4);
        return (View) p4;
    }

    public void t(int i4) {
        this.f1185k = i4;
    }

    public boolean u(int i4, k kVar) {
        return true;
    }
}
