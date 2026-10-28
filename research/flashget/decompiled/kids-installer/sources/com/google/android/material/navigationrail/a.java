package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import androidx.annotation.c1;
import androidx.annotation.j0;
import androidx.annotation.o0;
import androidx.annotation.q;
import n1.a;

/* compiled from: NavigationRailItemView.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
final class a extends com.google.android.material.navigation.a {
    public a(@o0 Context context) {
        super(context);
    }

    @Override // com.google.android.material.navigation.a
    @q
    protected int j() {
        return a.f.r5;
    }

    @Override // com.google.android.material.navigation.a
    @j0
    protected int m() {
        return a.k.f29934y0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        if (View.MeasureSpec.getMode(i6) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), View.resolveSizeAndState(Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i6)), i6, 0));
        }
    }
}
