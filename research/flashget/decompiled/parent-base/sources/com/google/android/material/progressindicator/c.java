package com.google.android.material.progressindicator;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.internal.n;
import s8.a;

/* compiled from: BaseProgressIndicatorSpec.java */
/* loaded from: classes6.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    @u0
    public int f53663a;

    /* renamed from: b, reason: collision with root package name */
    @u0
    public int f53664b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    public int[] f53665c = new int[0];

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.l
    public int f53666d;

    /* renamed from: e, reason: collision with root package name */
    public int f53667e;

    /* renamed from: f, reason: collision with root package name */
    public int f53668f;

    protected c(@o0 Context context, @q0 AttributeSet attributeSet, @androidx.annotation.f int i4, @h1 int i5) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(a.f.J5);
        TypedArray j4 = n.j(context, attributeSet, a.o.f91549d4, i4, i5, new int[0]);
        this.f53663a = com.google.android.material.resources.c.c(context, j4, a.o.m4, dimensionPixelSize);
        this.f53664b = Math.min(com.google.android.material.resources.c.c(context, j4, a.o.l4, 0), this.f53663a / 2);
        this.f53667e = j4.getInt(a.o.i4, 0);
        this.f53668f = j4.getInt(a.o.f4, 0);
        c(context, j4);
        d(context, j4);
        j4.recycle();
    }

    private void c(@o0 Context context, @o0 TypedArray typedArray) {
        int i4 = a.o.g4;
        if (!typedArray.hasValue(i4)) {
            this.f53665c = new int[]{u8.a.b(context, a.c.J2, -1)};
            return;
        }
        if (typedArray.peekValue(i4).type != 1) {
            this.f53665c = new int[]{typedArray.getColor(i4, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i4, -1));
        this.f53665c = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf1fd"));
        }
    }

    private void d(@o0 Context context, @o0 TypedArray typedArray) {
        int i4 = a.o.k4;
        if (typedArray.hasValue(i4)) {
            this.f53666d = typedArray.getColor(i4, -1);
            return;
        }
        this.f53666d = this.f53665c[0];
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f4 = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        this.f53666d = u8.a.a(this.f53666d, (int) (f4 * 255.0f));
    }

    public boolean a() {
        return this.f53668f != 0;
    }

    public boolean b() {
        return this.f53667e != 0;
    }

    abstract void e();
}
