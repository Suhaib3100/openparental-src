package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.internal.n;
import n1.a;

/* loaded from: classes3.dex */
public final class LinearProgressIndicatorSpec extends c {

    /* renamed from: g, reason: collision with root package name */
    public int f13808g;

    /* renamed from: h, reason: collision with root package name */
    public int f13809h;

    /* renamed from: i, reason: collision with root package name */
    boolean f13810i;

    public LinearProgressIndicatorSpec(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.Y8);
    }

    @Override // com.google.android.material.progressindicator.c
    void e() {
        if (this.f13808g == 0) {
            if (this.f13829b > 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("✑"));
            }
            if (this.f13830c.length < 3) {
                throw new IllegalArgumentException(ProtectedSandApp.s("✐"));
            }
        }
    }

    public LinearProgressIndicatorSpec(@o0 Context context, @q0 AttributeSet attributeSet, @androidx.annotation.f int i5) {
        this(context, attributeSet, i5, LinearProgressIndicator.M);
    }

    public LinearProgressIndicatorSpec(@o0 Context context, @q0 AttributeSet attributeSet, @androidx.annotation.f int i5, @h1 int i6) {
        super(context, attributeSet, i5, i6);
        TypedArray j5 = n.j(context, attributeSet, a.o.Ji, a.c.Y8, LinearProgressIndicator.M, new int[0]);
        this.f13808g = j5.getInt(a.o.Ki, 1);
        this.f13809h = j5.getInt(a.o.Li, 0);
        j5.recycle();
        e();
        this.f13810i = this.f13809h == 1;
    }
}
