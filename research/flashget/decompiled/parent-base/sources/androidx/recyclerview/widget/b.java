package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.o0;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AdapterListUpdateCallback.java */
/* loaded from: classes3.dex */
public final class b implements v {

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final RecyclerView.h f33052b;

    public b(@o0 RecyclerView.h hVar) {
        this.f33052b = hVar;
    }

    @Override // androidx.recyclerview.widget.v
    @SuppressLint({"UnknownNullness"})
    public void onChanged(int i4, int i5, Object obj) {
        this.f33052b.notifyItemRangeChanged(i4, i5, obj);
    }

    @Override // androidx.recyclerview.widget.v
    public void onInserted(int i4, int i5) {
        this.f33052b.notifyItemRangeInserted(i4, i5);
    }

    @Override // androidx.recyclerview.widget.v
    public void onMoved(int i4, int i5) {
        this.f33052b.notifyItemMoved(i4, i5);
    }

    @Override // androidx.recyclerview.widget.v
    public void onRemoved(int i4, int i5) {
        this.f33052b.notifyItemRangeRemoved(i4, i5);
    }
}
