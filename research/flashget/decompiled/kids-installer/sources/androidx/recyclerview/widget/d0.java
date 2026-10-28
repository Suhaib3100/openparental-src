package androidx.recyclerview.widget;

import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SimpleItemAnimator.java */
/* loaded from: classes3.dex */
public abstract class d0 extends RecyclerView.m {

    /* renamed from: m, reason: collision with root package name */
    private static final boolean f9181m = false;

    /* renamed from: n, reason: collision with root package name */
    private static final String f9182n = "SimpleItemAnimator";

    /* renamed from: l, reason: collision with root package name */
    boolean f9183l = true;

    public abstract boolean D(RecyclerView.d0 d0Var);

    public abstract boolean E(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i5, int i6, int i7, int i8);

    public abstract boolean F(RecyclerView.d0 d0Var, int i5, int i6, int i7, int i8);

    public abstract boolean G(RecyclerView.d0 d0Var);

    public final void H(RecyclerView.d0 d0Var) {
        Q(d0Var);
        h(d0Var);
    }

    public final void I(RecyclerView.d0 d0Var) {
        R(d0Var);
    }

    public final void J(RecyclerView.d0 d0Var, boolean z5) {
        S(d0Var, z5);
        h(d0Var);
    }

    public final void K(RecyclerView.d0 d0Var, boolean z5) {
        T(d0Var, z5);
    }

    public final void L(RecyclerView.d0 d0Var) {
        U(d0Var);
        h(d0Var);
    }

    public final void M(RecyclerView.d0 d0Var) {
        V(d0Var);
    }

    public final void N(RecyclerView.d0 d0Var) {
        W(d0Var);
        h(d0Var);
    }

    public final void O(RecyclerView.d0 d0Var) {
        X(d0Var);
    }

    public boolean P() {
        return this.f9183l;
    }

    public void Q(RecyclerView.d0 d0Var) {
    }

    public void R(RecyclerView.d0 d0Var) {
    }

    public void S(RecyclerView.d0 d0Var, boolean z5) {
    }

    public void T(RecyclerView.d0 d0Var, boolean z5) {
    }

    public void U(RecyclerView.d0 d0Var) {
    }

    public void V(RecyclerView.d0 d0Var) {
    }

    public void W(RecyclerView.d0 d0Var) {
    }

    public void X(RecyclerView.d0 d0Var) {
    }

    public void Y(boolean z5) {
        this.f9183l = z5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(@o0 RecyclerView.d0 d0Var, @q0 RecyclerView.m.d dVar, @o0 RecyclerView.m.d dVar2) {
        int i5;
        int i6;
        return (dVar == null || ((i5 = dVar.f9043a) == (i6 = dVar2.f9043a) && dVar.f9044b == dVar2.f9044b)) ? D(d0Var) : F(d0Var, i5, dVar.f9044b, i6, dVar2.f9044b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean b(@o0 RecyclerView.d0 d0Var, @o0 RecyclerView.d0 d0Var2, @o0 RecyclerView.m.d dVar, @o0 RecyclerView.m.d dVar2) {
        int i5;
        int i6;
        int i7 = dVar.f9043a;
        int i8 = dVar.f9044b;
        if (d0Var2.N()) {
            int i9 = dVar.f9043a;
            i6 = dVar.f9044b;
            i5 = i9;
        } else {
            i5 = dVar2.f9043a;
            i6 = dVar2.f9044b;
        }
        return E(d0Var, d0Var2, i7, i8, i5, i6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean c(@o0 RecyclerView.d0 d0Var, @o0 RecyclerView.m.d dVar, @q0 RecyclerView.m.d dVar2) {
        int i5 = dVar.f9043a;
        int i6 = dVar.f9044b;
        View view = d0Var.f9003a;
        int left = dVar2 == null ? view.getLeft() : dVar2.f9043a;
        int top = dVar2 == null ? view.getTop() : dVar2.f9044b;
        if (d0Var.z() || (i5 == left && i6 == top)) {
            return G(d0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return F(d0Var, i5, i6, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean d(@o0 RecyclerView.d0 d0Var, @o0 RecyclerView.m.d dVar, @o0 RecyclerView.m.d dVar2) {
        int i5 = dVar.f9043a;
        int i6 = dVar2.f9043a;
        if (i5 != i6 || dVar.f9044b != dVar2.f9044b) {
            return F(d0Var, i5, dVar.f9044b, i6, dVar2.f9044b);
        }
        L(d0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean f(@o0 RecyclerView.d0 d0Var) {
        return !this.f9183l || d0Var.x();
    }
}
