package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;

/* compiled from: SortedListAdapterCallback.java */
/* loaded from: classes3.dex */
public abstract class g0<T2> extends f0.b<T2> {

    /* renamed from: o, reason: collision with root package name */
    final RecyclerView.h f9257o;

    public g0(RecyclerView.h hVar) {
        this.f9257o = hVar;
    }

    @Override // androidx.recyclerview.widget.v
    public void a(int i5, int i6) {
        this.f9257o.q(i5, i6);
    }

    @Override // androidx.recyclerview.widget.v
    public void b(int i5, int i6) {
        this.f9257o.t(i5, i6);
    }

    @Override // androidx.recyclerview.widget.v
    public void c(int i5, int i6) {
        this.f9257o.u(i5, i6);
    }

    @Override // androidx.recyclerview.widget.f0.b, androidx.recyclerview.widget.v
    public void d(int i5, int i6, Object obj) {
        this.f9257o.s(i5, i6, obj);
    }

    @Override // androidx.recyclerview.widget.f0.b
    public void h(int i5, int i6) {
        this.f9257o.r(i5, i6);
    }
}
