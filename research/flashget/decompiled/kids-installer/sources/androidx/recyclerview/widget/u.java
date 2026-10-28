package androidx.recyclerview.widget;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.d0;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.k;
import java.util.List;

/* compiled from: ListAdapter.java */
/* loaded from: classes3.dex */
public abstract class u<T, VH extends RecyclerView.d0> extends RecyclerView.h<VH> {

    /* renamed from: d, reason: collision with root package name */
    final d<T> f9572d;

    /* renamed from: e, reason: collision with root package name */
    private final d.b<T> f9573e;

    /* compiled from: ListAdapter.java */
    class a implements d.b<T> {
        a() {
        }

        @Override // androidx.recyclerview.widget.d.b
        public void a(@o0 List<T> list, @o0 List<T> list2) {
            u.this.L(list, list2);
        }
    }

    protected u(@o0 k.f<T> fVar) {
        a aVar = new a();
        this.f9573e = aVar;
        d<T> dVar = new d<>(new b(this), new c.a(fVar).a());
        this.f9572d = dVar;
        dVar.a(aVar);
    }

    @o0
    public List<T> J() {
        return this.f9572d.b();
    }

    protected T K(int i5) {
        return this.f9572d.b().get(i5);
    }

    public void L(@o0 List<T> list, @o0 List<T> list2) {
    }

    public void M(@q0 List<T> list) {
        this.f9572d.f(list);
    }

    public void N(@q0 List<T> list, @q0 Runnable runnable) {
        this.f9572d.g(list, runnable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int g() {
        return this.f9572d.b().size();
    }

    protected u(@o0 c<T> cVar) {
        a aVar = new a();
        this.f9573e = aVar;
        d<T> dVar = new d<>(new b(this), cVar);
        this.f9572d = dVar;
        dVar.a(aVar);
    }
}
