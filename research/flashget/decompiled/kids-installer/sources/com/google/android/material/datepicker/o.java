package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;

/* compiled from: SmoothCalendarLayoutManager.java */
/* loaded from: classes3.dex */
class o extends LinearLayoutManager {
    private static final float O = 100.0f;

    /* compiled from: SmoothCalendarLayoutManager.java */
    class a extends s {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.s
        protected float w(DisplayMetrics displayMetrics) {
            return o.O / displayMetrics.densityDpi;
        }
    }

    o(Context context, int i5, boolean z5) {
        super(context, i5, z5);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void f2(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i5) {
        a aVar = new a(recyclerView.getContext());
        aVar.q(i5);
        g2(aVar);
    }
}
