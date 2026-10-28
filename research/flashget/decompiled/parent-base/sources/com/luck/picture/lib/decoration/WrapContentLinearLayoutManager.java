package com.luck.picture.lib.decoration;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public class WrapContentLinearLayoutManager extends LinearLayoutManager {
    public WrapContentLinearLayoutManager(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        try {
            super.onLayoutChildren(vVar, a0Var);
        } catch (IndexOutOfBoundsException e4) {
            e4.printStackTrace();
        }
    }

    public WrapContentLinearLayoutManager(Context context, int i4, boolean z4) {
        super(context, i4, z4);
    }

    public WrapContentLinearLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
    }
}
