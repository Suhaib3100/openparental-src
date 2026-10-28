package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import androidx.annotation.c1;
import androidx.annotation.j0;
import androidx.annotation.o0;
import androidx.annotation.q;
import s8.a;

/* compiled from: NavigationRailItemView.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
final class a extends com.google.android.material.navigation.a {
    public a(@o0 Context context) {
        super(context);
    }

    @Override // com.google.android.material.navigation.a
    @q
    protected int l() {
        return a.f.r5;
    }

    @Override // com.google.android.material.navigation.a
    @j0
    protected int m() {
        return a.k.f91206y0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (View.MeasureSpec.getMode(i5) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), View.resolveSizeAndState(Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i5)), i5, 0));
        }
    }
}
