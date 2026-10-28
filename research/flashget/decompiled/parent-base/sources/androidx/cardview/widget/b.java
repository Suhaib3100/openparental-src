package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: CardViewApi21Impl.java */
@x0(21)
/* loaded from: classes.dex */
class b implements e {
    b() {
    }

    private f p(d dVar) {
        return (f) dVar.e();
    }

    @Override // androidx.cardview.widget.e
    public void a(d dVar, float f4) {
        ((f) dVar.e()).h(f4);
    }

    @Override // androidx.cardview.widget.e
    public float b(d dVar) {
        return ((f) dVar.e()).d();
    }

    @Override // androidx.cardview.widget.e
    public void c(d dVar, float f4) {
        dVar.h().setElevation(f4);
    }

    @Override // androidx.cardview.widget.e
    public float d(d dVar) {
        return ((f) dVar.e()).c();
    }

    @Override // androidx.cardview.widget.e
    public ColorStateList e(d dVar) {
        return ((f) dVar.e()).b();
    }

    @Override // androidx.cardview.widget.e
    public float f(d dVar) {
        return b(dVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public void g(d dVar) {
        o(dVar, d(dVar));
    }

    @Override // androidx.cardview.widget.e
    public void h(d dVar, Context context, ColorStateList colorStateList, float f4, float f5, float f6) {
        dVar.c(new f(colorStateList, f4));
        View h4 = dVar.h();
        h4.setClipToOutline(true);
        h4.setElevation(f5);
        o(dVar, f6);
    }

    @Override // androidx.cardview.widget.e
    public float i(d dVar) {
        return dVar.h().getElevation();
    }

    @Override // androidx.cardview.widget.e
    public void j(d dVar) {
        o(dVar, d(dVar));
    }

    @Override // androidx.cardview.widget.e
    public void k(d dVar) {
        if (!dVar.d()) {
            dVar.b(0, 0, 0, 0);
            return;
        }
        float d5 = d(dVar);
        float b5 = b(dVar);
        int ceil = (int) Math.ceil(g.c(d5, b5, dVar.g()));
        int ceil2 = (int) Math.ceil(g.d(d5, b5, dVar.g()));
        dVar.b(ceil, ceil2, ceil, ceil2);
    }

    @Override // androidx.cardview.widget.e
    public void l() {
    }

    @Override // androidx.cardview.widget.e
    public float m(d dVar) {
        return b(dVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public void n(d dVar, @q0 ColorStateList colorStateList) {
        ((f) dVar.e()).f(colorStateList);
    }

    @Override // androidx.cardview.widget.e
    public void o(d dVar, float f4) {
        ((f) dVar.e()).g(f4, dVar.d(), dVar.g());
        k(dVar);
    }
}
