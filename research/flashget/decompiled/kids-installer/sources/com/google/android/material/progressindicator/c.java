package com.google.android.material.progressindicator;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.internal.n;
import n1.a;

/* compiled from: BaseProgressIndicatorSpec.java */
/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    @u0
    public int f13828a;

    /* renamed from: b, reason: collision with root package name */
    @u0
    public int f13829b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    public int[] f13830c = new int[0];

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.l
    public int f13831d;

    /* renamed from: e, reason: collision with root package name */
    public int f13832e;

    /* renamed from: f, reason: collision with root package name */
    public int f13833f;

    protected c(@o0 Context context, @q0 AttributeSet attributeSet, @androidx.annotation.f int i5, @h1 int i6) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(a.f.J5);
        TypedArray j5 = n.j(context, attributeSet, a.o.f30171c4, i5, i6, new int[0]);
        this.f13828a = com.google.android.material.resources.c.c(context, j5, a.o.f30230l4, dimensionPixelSize);
        this.f13829b = Math.min(com.google.android.material.resources.c.c(context, j5, a.o.f30224k4, 0), this.f13828a / 2);
        this.f13832e = j5.getInt(a.o.f30206h4, 0);
        this.f13833f = j5.getInt(a.o.f30186e4, 0);
        c(context, j5);
        d(context, j5);
        j5.recycle();
    }

    private void c(@o0 Context context, @o0 TypedArray typedArray) {
        int i5 = a.o.f30193f4;
        if (!typedArray.hasValue(i5)) {
            this.f13830c = new int[]{p1.a.b(context, a.c.K2, -1)};
            return;
        }
        if (typedArray.peekValue(i5).type != 1) {
            this.f13830c = new int[]{typedArray.getColor(i5, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i5, -1));
        this.f13830c = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ቍ"));
        }
    }

    private void d(@o0 Context context, @o0 TypedArray typedArray) {
        int i5 = a.o.f30218j4;
        if (typedArray.hasValue(i5)) {
            this.f13831d = typedArray.getColor(i5, -1);
            return;
        }
        this.f13831d = this.f13830c[0];
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f6 = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        this.f13831d = p1.a.a(this.f13831d, (int) (f6 * 255.0f));
    }

    public boolean a() {
        return this.f13833f != 0;
    }

    public boolean b() {
        return this.f13832e != 0;
    }

    abstract void e();
}
