package androidx.recyclerview.widget;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.e0;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.k;
import java.util.List;

/* compiled from: ListAdapter.java */
/* loaded from: classes3.dex */
public abstract class u<T, VH extends RecyclerView.e0> extends RecyclerView.h<VH> {
    final d<T> mDiffer;
    private final d.b<T> mListener;

    /* compiled from: ListAdapter.java */
    class a implements d.b<T> {
        a() {
        }

        @Override // androidx.recyclerview.widget.d.b
        public void onCurrentListChanged(@o0 List<T> list, @o0 List<T> list2) {
            u.this.onCurrentListChanged(list, list2);
        }
    }

    protected u(@o0 k.f<T> fVar) {
        a aVar = new a();
        this.mListener = aVar;
        d<T> dVar = new d<>(new b(this), new c.a(fVar).a());
        this.mDiffer = dVar;
        dVar.a(aVar);
    }

    @o0
    public List<T> getCurrentList() {
        return this.mDiffer.b();
    }

    protected T getItem(int i4) {
        return this.mDiffer.b().get(i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.mDiffer.b().size();
    }

    public void onCurrentListChanged(@o0 List<T> list, @o0 List<T> list2) {
    }

    public void submitList(@q0 List<T> list) {
        this.mDiffer.f(list);
    }

    public void submitList(@q0 List<T> list, @q0 Runnable runnable) {
        this.mDiffer.g(list, runnable);
    }

    protected u(@o0 c<T> cVar) {
        a aVar = new a();
        this.mListener = aVar;
        d<T> dVar = new d<>(new b(this), cVar);
        this.mDiffer = dVar;
        dVar.a(aVar);
    }
}
