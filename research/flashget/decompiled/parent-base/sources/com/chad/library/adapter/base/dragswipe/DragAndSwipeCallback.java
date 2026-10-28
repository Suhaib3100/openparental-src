package com.chad.library.adapter.base.dragswipe;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.o0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import com.chad.library.adapter.base.module.BaseDraggableModule;
import com.chad.library.c;

/* loaded from: classes3.dex */
public class DragAndSwipeCallback extends o.f {
    private BaseDraggableModule mDraggableModule;
    private float mMoveThreshold = 0.1f;
    private float mSwipeThreshold = 0.7f;
    private int mDragMoveFlags = 15;
    private int mSwipeMoveFlags = 32;

    public DragAndSwipeCallback(BaseDraggableModule baseDraggableModule) {
        this.mDraggableModule = baseDraggableModule;
    }

    private boolean isViewCreateByAdapter(@o0 RecyclerView.e0 e0Var) {
        int itemViewType = e0Var.getItemViewType();
        return itemViewType == 268435729 || itemViewType == 268436002 || itemViewType == 268436275 || itemViewType == 268436821;
    }

    @Override // androidx.recyclerview.widget.o.f
    public void clearView(@o0 RecyclerView recyclerView, @o0 RecyclerView.e0 e0Var) {
        super.clearView(recyclerView, e0Var);
        if (isViewCreateByAdapter(e0Var)) {
            return;
        }
        View view = e0Var.itemView;
        int i4 = c.g.f47070b;
        if (view.getTag(i4) != null && ((Boolean) e0Var.itemView.getTag(i4)).booleanValue()) {
            BaseDraggableModule baseDraggableModule = this.mDraggableModule;
            if (baseDraggableModule != null) {
                baseDraggableModule.onItemDragEnd(e0Var);
            }
            e0Var.itemView.setTag(i4, Boolean.FALSE);
        }
        View view2 = e0Var.itemView;
        int i5 = c.g.f47074c;
        if (view2.getTag(i5) == null || !((Boolean) e0Var.itemView.getTag(i5)).booleanValue()) {
            return;
        }
        BaseDraggableModule baseDraggableModule2 = this.mDraggableModule;
        if (baseDraggableModule2 != null) {
            baseDraggableModule2.onItemSwipeClear(e0Var);
        }
        e0Var.itemView.setTag(i5, Boolean.FALSE);
    }

    @Override // androidx.recyclerview.widget.o.f
    public float getMoveThreshold(@o0 RecyclerView.e0 e0Var) {
        return this.mMoveThreshold;
    }

    @Override // androidx.recyclerview.widget.o.f
    public int getMovementFlags(@o0 RecyclerView recyclerView, @o0 RecyclerView.e0 e0Var) {
        return isViewCreateByAdapter(e0Var) ? o.f.makeMovementFlags(0, 0) : o.f.makeMovementFlags(this.mDragMoveFlags, this.mSwipeMoveFlags);
    }

    @Override // androidx.recyclerview.widget.o.f
    public float getSwipeThreshold(@o0 RecyclerView.e0 e0Var) {
        return this.mSwipeThreshold;
    }

    @Override // androidx.recyclerview.widget.o.f
    public boolean isItemViewSwipeEnabled() {
        BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        if (baseDraggableModule != null) {
            return baseDraggableModule.getIsSwipeEnabled();
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.o.f
    public boolean isLongPressDragEnabled() {
        BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        return (baseDraggableModule == null || !baseDraggableModule.getIsDragEnabled() || this.mDraggableModule.hasToggleView()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.o.f
    public void onChildDrawOver(@o0 Canvas canvas, @o0 RecyclerView recyclerView, @o0 RecyclerView.e0 e0Var, float f4, float f5, int i4, boolean z4) {
        super.onChildDrawOver(canvas, recyclerView, e0Var, f4, f5, i4, z4);
        if (i4 != 1 || isViewCreateByAdapter(e0Var)) {
            return;
        }
        View view = e0Var.itemView;
        canvas.save();
        if (f4 > 0.0f) {
            canvas.clipRect(view.getLeft(), view.getTop(), view.getLeft() + f4, view.getBottom());
            canvas.translate(view.getLeft(), view.getTop());
        } else {
            canvas.clipRect(view.getRight() + f4, view.getTop(), view.getRight(), view.getBottom());
            canvas.translate(view.getRight() + f4, view.getTop());
        }
        BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        if (baseDraggableModule != null) {
            baseDraggableModule.onItemSwiping(canvas, e0Var, f4, f5, z4);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.o.f
    public boolean onMove(@o0 RecyclerView recyclerView, @o0 RecyclerView.e0 e0Var, @o0 RecyclerView.e0 e0Var2) {
        return e0Var.getItemViewType() == e0Var2.getItemViewType();
    }

    @Override // androidx.recyclerview.widget.o.f
    public void onMoved(@o0 RecyclerView recyclerView, @o0 RecyclerView.e0 e0Var, int i4, @o0 RecyclerView.e0 e0Var2, int i5, int i6, int i7) {
        super.onMoved(recyclerView, e0Var, i4, e0Var2, i5, i6, i7);
        BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        if (baseDraggableModule != null) {
            baseDraggableModule.onItemDragMoving(e0Var, e0Var2);
        }
    }

    @Override // androidx.recyclerview.widget.o.f
    public void onSelectedChanged(RecyclerView.e0 e0Var, int i4) {
        if (i4 == 2 && !isViewCreateByAdapter(e0Var)) {
            BaseDraggableModule baseDraggableModule = this.mDraggableModule;
            if (baseDraggableModule != null) {
                baseDraggableModule.onItemDragStart(e0Var);
            }
            e0Var.itemView.setTag(c.g.f47070b, Boolean.TRUE);
        } else if (i4 == 1 && !isViewCreateByAdapter(e0Var)) {
            BaseDraggableModule baseDraggableModule2 = this.mDraggableModule;
            if (baseDraggableModule2 != null) {
                baseDraggableModule2.onItemSwipeStart(e0Var);
            }
            e0Var.itemView.setTag(c.g.f47074c, Boolean.TRUE);
        }
        super.onSelectedChanged(e0Var, i4);
    }

    @Override // androidx.recyclerview.widget.o.f
    public void onSwiped(@o0 RecyclerView.e0 e0Var, int i4) {
        BaseDraggableModule baseDraggableModule;
        if (isViewCreateByAdapter(e0Var) || (baseDraggableModule = this.mDraggableModule) == null) {
            return;
        }
        baseDraggableModule.onItemSwiped(e0Var);
    }

    public void setDragMoveFlags(int i4) {
        this.mDragMoveFlags = i4;
    }

    public void setMoveThreshold(float f4) {
        this.mMoveThreshold = f4;
    }

    public void setSwipeMoveFlags(int i4) {
        this.mSwipeMoveFlags = i4;
    }

    public void setSwipeThreshold(float f4) {
        this.mSwipeThreshold = f4;
    }
}
