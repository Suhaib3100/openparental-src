package com.luck.picture.lib.animators;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public abstract class BaseAnimationAdapter extends RecyclerView.h<RecyclerView.e0> {
    private RecyclerView.h<RecyclerView.e0> mAdapter;
    private int mDuration = 250;
    private Interpolator mInterpolator = new LinearInterpolator();
    private int mLastPosition = -1;
    private boolean isFirstOnly = true;

    public BaseAnimationAdapter(RecyclerView.h<RecyclerView.e0> hVar) {
        this.mAdapter = hVar;
    }

    protected abstract Animator[] getAnimators(View view);

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.mAdapter.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i4) {
        return this.mAdapter.getItemId(i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i4) {
        return this.mAdapter.getItemViewType(i4);
    }

    public RecyclerView.h<RecyclerView.e0> getWrappedAdapter() {
        return this.mAdapter;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.mAdapter.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i4) {
        this.mAdapter.onBindViewHolder(e0Var, i4);
        int adapterPosition = e0Var.getAdapterPosition();
        if (this.isFirstOnly && adapterPosition <= this.mLastPosition) {
            ViewHelper.clear(e0Var.itemView);
            return;
        }
        for (Animator animator : getAnimators(e0Var.itemView)) {
            animator.setDuration(this.mDuration).start();
            animator.setInterpolator(this.mInterpolator);
        }
        this.mLastPosition = adapterPosition;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i4) {
        return this.mAdapter.onCreateViewHolder(viewGroup, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.mAdapter.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewAttachedToWindow(RecyclerView.e0 e0Var) {
        super.onViewAttachedToWindow(e0Var);
        this.mAdapter.onViewAttachedToWindow(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewDetachedFromWindow(RecyclerView.e0 e0Var) {
        super.onViewDetachedFromWindow(e0Var);
        this.mAdapter.onViewDetachedFromWindow(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(RecyclerView.e0 e0Var) {
        this.mAdapter.onViewRecycled(e0Var);
        super.onViewRecycled(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void registerAdapterDataObserver(RecyclerView.j jVar) {
        super.registerAdapterDataObserver(jVar);
        this.mAdapter.registerAdapterDataObserver(jVar);
    }

    public void setDuration(int i4) {
        this.mDuration = i4;
    }

    public void setFirstOnly(boolean z4) {
        this.isFirstOnly = z4;
    }

    public void setInterpolator(Interpolator interpolator) {
        this.mInterpolator = interpolator;
    }

    public void setStartPosition(int i4) {
        this.mLastPosition = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void unregisterAdapterDataObserver(RecyclerView.j jVar) {
        super.unregisterAdapterDataObserver(jVar);
        this.mAdapter.unregisterAdapterDataObserver(jVar);
    }
}
