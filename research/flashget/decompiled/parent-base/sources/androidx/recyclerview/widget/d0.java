package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SimpleItemAnimator.java */
/* loaded from: classes3.dex */
public abstract class d0 extends RecyclerView.m {
    private static final boolean DEBUG = false;
    private static final String TAG = "SimpleItemAnimator";
    boolean mSupportsChangeAnimations = true;

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateAdd(RecyclerView.e0 e0Var);

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean animateAppearance(@o0 RecyclerView.e0 e0Var, @q0 RecyclerView.m.d dVar, @o0 RecyclerView.m.d dVar2) {
        int i4;
        int i5;
        return (dVar == null || ((i4 = dVar.f32934a) == (i5 = dVar2.f32934a) && dVar.f32935b == dVar2.f32935b)) ? animateAdd(e0Var) : animateMove(e0Var, i4, dVar.f32935b, i5, dVar2.f32935b);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateChange(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i4, int i5, int i6, int i7);

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean animateChange(@o0 RecyclerView.e0 e0Var, @o0 RecyclerView.e0 e0Var2, @o0 RecyclerView.m.d dVar, @o0 RecyclerView.m.d dVar2) {
        int i4;
        int i5;
        int i6 = dVar.f32934a;
        int i7 = dVar.f32935b;
        if (e0Var2.shouldIgnore()) {
            int i10 = dVar.f32934a;
            i5 = dVar.f32935b;
            i4 = i10;
        } else {
            i4 = dVar2.f32934a;
            i5 = dVar2.f32935b;
        }
        return animateChange(e0Var, e0Var2, i6, i7, i4, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean animateDisappearance(@o0 RecyclerView.e0 e0Var, @o0 RecyclerView.m.d dVar, @q0 RecyclerView.m.d dVar2) {
        int i4 = dVar.f32934a;
        int i5 = dVar.f32935b;
        View view = e0Var.itemView;
        int left = dVar2 == null ? view.getLeft() : dVar2.f32934a;
        int top2 = dVar2 == null ? view.getTop() : dVar2.f32935b;
        if (e0Var.isRemoved() || (i4 == left && i5 == top2)) {
            return animateRemove(e0Var);
        }
        view.layout(left, top2, view.getWidth() + left, view.getHeight() + top2);
        return animateMove(e0Var, i4, i5, left, top2);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateMove(RecyclerView.e0 e0Var, int i4, int i5, int i6, int i7);

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean animatePersistence(@o0 RecyclerView.e0 e0Var, @o0 RecyclerView.m.d dVar, @o0 RecyclerView.m.d dVar2) {
        int i4 = dVar.f32934a;
        int i5 = dVar2.f32934a;
        if (i4 != i5 || dVar.f32935b != dVar2.f32935b) {
            return animateMove(e0Var, i4, dVar.f32935b, i5, dVar2.f32935b);
        }
        dispatchMoveFinished(e0Var);
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateRemove(RecyclerView.e0 e0Var);

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean canReuseUpdatedViewHolder(@o0 RecyclerView.e0 e0Var) {
        return !this.mSupportsChangeAnimations || e0Var.isInvalid();
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchAddFinished(RecyclerView.e0 e0Var) {
        onAddFinished(e0Var);
        dispatchAnimationFinished(e0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchAddStarting(RecyclerView.e0 e0Var) {
        onAddStarting(e0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchChangeFinished(RecyclerView.e0 e0Var, boolean z4) {
        onChangeFinished(e0Var, z4);
        dispatchAnimationFinished(e0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchChangeStarting(RecyclerView.e0 e0Var, boolean z4) {
        onChangeStarting(e0Var, z4);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchMoveFinished(RecyclerView.e0 e0Var) {
        onMoveFinished(e0Var);
        dispatchAnimationFinished(e0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchMoveStarting(RecyclerView.e0 e0Var) {
        onMoveStarting(e0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchRemoveFinished(RecyclerView.e0 e0Var) {
        onRemoveFinished(e0Var);
        dispatchAnimationFinished(e0Var);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchRemoveStarting(RecyclerView.e0 e0Var) {
        onRemoveStarting(e0Var);
    }

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    @SuppressLint({"UnknownNullness"})
    public void onAddFinished(RecyclerView.e0 e0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onAddStarting(RecyclerView.e0 e0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onChangeFinished(RecyclerView.e0 e0Var, boolean z4) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onChangeStarting(RecyclerView.e0 e0Var, boolean z4) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onMoveFinished(RecyclerView.e0 e0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onMoveStarting(RecyclerView.e0 e0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onRemoveFinished(RecyclerView.e0 e0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onRemoveStarting(RecyclerView.e0 e0Var) {
    }

    public void setSupportsChangeAnimations(boolean z4) {
        this.mSupportsChangeAnimations = z4;
    }
}
