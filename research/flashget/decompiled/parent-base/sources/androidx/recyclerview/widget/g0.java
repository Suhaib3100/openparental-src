package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;

/* compiled from: SortedListAdapterCallback.java */
/* loaded from: classes3.dex */
public abstract class g0<T2> extends f0.b<T2> {

    /* renamed from: b, reason: collision with root package name */
    final RecyclerView.h<?> f33160b;

    public g0(@SuppressLint({"UnknownNullness", "MissingNullability"}) RecyclerView.h<?> hVar) {
        this.f33160b = hVar;
    }

    @Override // androidx.recyclerview.widget.f0.b
    public void g(int i4, int i5) {
        this.f33160b.notifyItemRangeChanged(i4, i5);
    }

    @Override // androidx.recyclerview.widget.f0.b, androidx.recyclerview.widget.v
    @SuppressLint({"UnknownNullness"})
    public void onChanged(int i4, int i5, Object obj) {
        this.f33160b.notifyItemRangeChanged(i4, i5, obj);
    }

    @Override // androidx.recyclerview.widget.v
    public void onInserted(int i4, int i5) {
        this.f33160b.notifyItemRangeInserted(i4, i5);
    }

    @Override // androidx.recyclerview.widget.v
    public void onMoved(int i4, int i5) {
        this.f33160b.notifyItemMoved(i4, i5);
    }

    @Override // androidx.recyclerview.widget.v
    public void onRemoved(int i4, int i5) {
        this.f33160b.notifyItemRangeRemoved(i4, i5);
    }
}
