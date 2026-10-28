package com.jcodecraeer.xrecyclerview;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;

/* compiled from: SimpleItemTouchHelperCallback.java */
/* loaded from: classes6.dex */
public class h extends o.f {

    /* renamed from: c, reason: collision with root package name */
    public static final float f66497c = 1.0f;

    /* renamed from: a, reason: collision with root package name */
    private final e f66498a;

    /* renamed from: b, reason: collision with root package name */
    private XRecyclerView f66499b;

    public h(e eVar, XRecyclerView xRecyclerView) {
        this.f66498a = eVar;
        this.f66499b = xRecyclerView;
    }

    @Override // androidx.recyclerview.widget.o.f
    public void clearView(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
        super.clearView(recyclerView, e0Var);
        e0Var.itemView.setAlpha(1.0f);
        e0Var.itemView.setBackgroundColor(0);
    }

    @Override // androidx.recyclerview.widget.o.f
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
        return o.f.makeMovementFlags(3, 48);
    }

    @Override // androidx.recyclerview.widget.o.f
    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.o.f
    public boolean isLongPressDragEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.o.f
    public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, float f4, float f5, int i4, boolean z4) {
        super.onChildDraw(canvas, recyclerView, e0Var, f4, f5, i4, z4);
        if (i4 == 1) {
            e0Var.itemView.setAlpha(1.0f - (Math.abs(f4) / r1.getWidth()));
        }
    }

    @Override // androidx.recyclerview.widget.o.f
    public boolean onMove(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
        if (e0Var.getItemViewType() != e0Var2.getItemViewType()) {
            return false;
        }
        this.f66498a.b(e0Var.getAdapterPosition(), e0Var2.getAdapterPosition());
        return true;
    }

    @Override // androidx.recyclerview.widget.o.f
    public void onSelectedChanged(RecyclerView.e0 e0Var, int i4) {
        if (i4 != 0) {
            e0Var.itemView.setBackgroundColor(-3355444);
        }
        super.onSelectedChanged(e0Var, i4);
    }

    @Override // androidx.recyclerview.widget.o.f
    public void onSwiped(RecyclerView.e0 e0Var, int i4) {
        this.f66498a.a(e0Var.getAdapterPosition());
    }
}
