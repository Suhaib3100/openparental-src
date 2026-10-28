package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: CardViewApi21Impl.java */
@x0(21)
/* loaded from: classes2.dex */
class b implements e {
    b() {
    }

    private f p(d dVar) {
        return (f) dVar.f();
    }

    @Override // androidx.cardview.widget.e
    public void a(d dVar, Context context, ColorStateList colorStateList, float f6, float f7, float f8) {
        dVar.c(new f(colorStateList, f6));
        View g5 = dVar.g();
        g5.setClipToOutline(true);
        g5.setElevation(f7);
        o(dVar, f8);
    }

    @Override // androidx.cardview.widget.e
    public void b(d dVar, float f6) {
        p(dVar).h(f6);
    }

    @Override // androidx.cardview.widget.e
    public float c(d dVar) {
        return dVar.g().getElevation();
    }

    @Override // androidx.cardview.widget.e
    public float d(d dVar) {
        return p(dVar).d();
    }

    @Override // androidx.cardview.widget.e
    public void e(d dVar) {
        o(dVar, g(dVar));
    }

    @Override // androidx.cardview.widget.e
    public void f(d dVar, float f6) {
        dVar.g().setElevation(f6);
    }

    @Override // androidx.cardview.widget.e
    public float g(d dVar) {
        return p(dVar).c();
    }

    @Override // androidx.cardview.widget.e
    public ColorStateList h(d dVar) {
        return p(dVar).b();
    }

    @Override // androidx.cardview.widget.e
    public void i(d dVar) {
        if (!dVar.e()) {
            dVar.a(0, 0, 0, 0);
            return;
        }
        float g5 = g(dVar);
        float d6 = d(dVar);
        int ceil = (int) Math.ceil(g.c(g5, d6, dVar.d()));
        int ceil2 = (int) Math.ceil(g.d(g5, d6, dVar.d()));
        dVar.a(ceil, ceil2, ceil, ceil2);
    }

    @Override // androidx.cardview.widget.e
    public void j() {
    }

    @Override // androidx.cardview.widget.e
    public float k(d dVar) {
        return d(dVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public float l(d dVar) {
        return d(dVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public void m(d dVar) {
        o(dVar, g(dVar));
    }

    @Override // androidx.cardview.widget.e
    public void n(d dVar, @q0 ColorStateList colorStateList) {
        p(dVar).f(colorStateList);
    }

    @Override // androidx.cardview.widget.e
    public void o(d dVar, float f6) {
        p(dVar).g(f6, dVar.e(), dVar.d());
        i(dVar);
    }
}
