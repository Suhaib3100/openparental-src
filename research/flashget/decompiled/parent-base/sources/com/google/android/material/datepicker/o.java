package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;

/* compiled from: SmoothCalendarLayoutManager.java */
/* loaded from: classes6.dex */
class o extends LinearLayoutManager {

    /* renamed from: b, reason: collision with root package name */
    private static final float f53215b = 100.0f;

    /* compiled from: SmoothCalendarLayoutManager.java */
    class a extends s {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.s
        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    o(Context context, int i4, boolean z4) {
        super(context, i4, z4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i4) {
        a aVar = new a(recyclerView.getContext());
        aVar.setTargetPosition(i4);
        startSmoothScroll(aVar);
    }
}
