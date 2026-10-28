package androidx.recyclerview.widget;

import androidx.annotation.o0;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AdapterListUpdateCallback.java */
/* loaded from: classes3.dex */
public final class b implements v {

    /* renamed from: o, reason: collision with root package name */
    @o0
    private final RecyclerView.h f9151o;

    public b(@o0 RecyclerView.h hVar) {
        this.f9151o = hVar;
    }

    @Override // androidx.recyclerview.widget.v
    public void a(int i5, int i6) {
        this.f9151o.q(i5, i6);
    }

    @Override // androidx.recyclerview.widget.v
    public void b(int i5, int i6) {
        this.f9151o.t(i5, i6);
    }

    @Override // androidx.recyclerview.widget.v
    public void c(int i5, int i6) {
        this.f9151o.u(i5, i6);
    }

    @Override // androidx.recyclerview.widget.v
    public void d(int i5, int i6, Object obj) {
        this.f9151o.s(i5, i6, obj);
    }
}
