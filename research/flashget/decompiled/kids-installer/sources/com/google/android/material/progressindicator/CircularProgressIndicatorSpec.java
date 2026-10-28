package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u0;
import com.google.android.material.internal.n;
import n1.a;

/* loaded from: classes3.dex */
public final class CircularProgressIndicatorSpec extends c {

    /* renamed from: g, reason: collision with root package name */
    @u0
    public int f13805g;

    /* renamed from: h, reason: collision with root package name */
    @u0
    public int f13806h;

    /* renamed from: i, reason: collision with root package name */
    public int f13807i;

    public CircularProgressIndicatorSpec(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f29185c2);
    }

    @Override // com.google.android.material.progressindicator.c
    void e() {
    }

    public CircularProgressIndicatorSpec(@o0 Context context, @q0 AttributeSet attributeSet, @androidx.annotation.f int i5) {
        this(context, attributeSet, i5, CircularProgressIndicator.M);
    }

    public CircularProgressIndicatorSpec(@o0 Context context, @q0 AttributeSet attributeSet, @androidx.annotation.f int i5, @h1 int i6) {
        super(context, attributeSet, i5, i6);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(a.f.D5);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(a.f.y5);
        TypedArray j5 = n.j(context, attributeSet, a.o.i6, i5, i6, new int[0]);
        this.f13805g = Math.max(com.google.android.material.resources.c.c(context, j5, a.o.l6, dimensionPixelSize), this.f13828a * 2);
        this.f13806h = com.google.android.material.resources.c.c(context, j5, a.o.k6, dimensionPixelSize2);
        this.f13807i = j5.getInt(a.o.j6, 0);
        j5.recycle();
    }
}
