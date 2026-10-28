package com.chad.library.adapter.base.listener;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public interface OnItemSwipeListener {
    void clearView(RecyclerView.e0 e0Var, int i4);

    void onItemSwipeMoving(Canvas canvas, RecyclerView.e0 e0Var, float f4, float f5, boolean z4);

    void onItemSwipeStart(RecyclerView.e0 e0Var, int i4);

    void onItemSwiped(RecyclerView.e0 e0Var, int i4);
}
