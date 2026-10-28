package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.internal.n;
import s8.a;

/* loaded from: classes6.dex */
public final class LinearProgressIndicatorSpec extends c {

    /* renamed from: g, reason: collision with root package name */
    public int f53631g;

    /* renamed from: h, reason: collision with root package name */
    public int f53632h;

    /* renamed from: i, reason: collision with root package name */
    boolean f53633i;

    public LinearProgressIndicatorSpec(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.X8);
    }

    @Override // com.google.android.material.progressindicator.c
    void e() {
        if (this.f53631g == 0) {
            if (this.f53664b > 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\uf200"));
            }
            if (this.f53665c.length < 3) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\uf1ff"));
            }
        }
    }

    public LinearProgressIndicatorSpec(@o0 Context context, @q0 AttributeSet attributeSet, @androidx.annotation.f int i4) {
        this(context, attributeSet, i4, LinearProgressIndicator.f53630z);
    }

    public LinearProgressIndicatorSpec(@o0 Context context, @q0 AttributeSet attributeSet, @androidx.annotation.f int i4, @h1 int i5) {
        super(context, attributeSet, i4, i5);
        TypedArray j4 = n.j(context, attributeSet, a.o.ck, a.c.X8, LinearProgressIndicator.f53630z, new int[0]);
        this.f53631g = j4.getInt(a.o.dk, 1);
        this.f53632h = j4.getInt(a.o.ek, 0);
        j4.recycle();
        e();
        this.f53633i = this.f53632h == 1;
    }
}
