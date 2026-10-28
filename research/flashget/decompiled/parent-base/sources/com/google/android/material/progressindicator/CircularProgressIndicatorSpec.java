package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u0;
import com.google.android.material.internal.n;
import s8.a;

/* loaded from: classes6.dex */
public final class CircularProgressIndicatorSpec extends c {

    /* renamed from: g, reason: collision with root package name */
    @u0
    public int f53627g;

    /* renamed from: h, reason: collision with root package name */
    @u0
    public int f53628h;

    /* renamed from: i, reason: collision with root package name */
    public int f53629i;

    public CircularProgressIndicatorSpec(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f90339b2);
    }

    @Override // com.google.android.material.progressindicator.c
    void e() {
    }

    public CircularProgressIndicatorSpec(@o0 Context context, @q0 AttributeSet attributeSet, @androidx.annotation.f int i4) {
        this(context, attributeSet, i4, CircularProgressIndicator.f53626z);
    }

    public CircularProgressIndicatorSpec(@o0 Context context, @q0 AttributeSet attributeSet, @androidx.annotation.f int i4, @h1 int i5) {
        super(context, attributeSet, i4, i5);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(a.f.D5);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(a.f.y5);
        TypedArray j4 = n.j(context, attributeSet, a.o.j6, i4, i5, new int[0]);
        this.f53627g = Math.max(com.google.android.material.resources.c.c(context, j4, a.o.m6, dimensionPixelSize), this.f53663a * 2);
        this.f53628h = com.google.android.material.resources.c.c(context, j4, a.o.l6, dimensionPixelSize2);
        this.f53629i = j4.getInt(a.o.k6, 0);
        j4.recycle();
    }
}
