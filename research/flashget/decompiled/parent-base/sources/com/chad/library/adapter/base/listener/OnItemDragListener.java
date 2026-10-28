package com.chad.library.adapter.base.listener;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public interface OnItemDragListener {
    void onItemDragEnd(RecyclerView.e0 e0Var, int i4);

    void onItemDragMoving(RecyclerView.e0 e0Var, int i4, RecyclerView.e0 e0Var2, int i5);

    void onItemDragStart(RecyclerView.e0 e0Var, int i4);
}
