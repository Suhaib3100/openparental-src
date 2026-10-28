package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.c1;
import androidx.annotation.h1;
import androidx.annotation.i1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.widget.z0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import n1.a;

/* compiled from: ThemeEnforcement.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    private static final String f13725b = ProtectedSandApp.s("ሾ");

    /* renamed from: d, reason: collision with root package name */
    private static final String f13727d = ProtectedSandApp.s("ሿ");

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f13724a = {a.c.K2};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f13726c = {a.c.N2};

    private n() {
    }

    public static void a(@o0 Context context) {
        e(context, f13724a, ProtectedSandApp.s("ቀ"));
    }

    private static void b(@o0 Context context, AttributeSet attributeSet, @androidx.annotation.f int i5, @h1 int i6) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.ns, i5, i6);
        boolean z5 = obtainStyledAttributes.getBoolean(a.o.ps, false);
        obtainStyledAttributes.recycle();
        if (z5) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(a.c.a7, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(@o0 Context context) {
        e(context, f13726c, ProtectedSandApp.s("ቁ"));
    }

    private static void d(@o0 Context context, AttributeSet attributeSet, @o0 @i1 int[] iArr, @androidx.annotation.f int i5, @h1 int i6, @q0 @i1 int... iArr2) {
        boolean z5;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.ns, i5, i6);
        if (!obtainStyledAttributes.getBoolean(a.o.qs, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            z5 = obtainStyledAttributes.getResourceId(a.o.os, -1) != -1;
        } else {
            z5 = g(context, attributeSet, iArr, i5, i6, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z5) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ቂ"));
        }
    }

    private static void e(@o0 Context context, @o0 int[] iArr, String str) {
        if (!i(context, iArr)) {
            throw new IllegalArgumentException(androidx.constraintlayout.solver.widgets.analyzer.e.a(ProtectedSandApp.s("ቃ"), str, ProtectedSandApp.s("ቄ")));
        }
    }

    public static boolean f(@o0 Context context) {
        return i(context, f13724a);
    }

    private static boolean g(@o0 Context context, AttributeSet attributeSet, @o0 @i1 int[] iArr, @androidx.annotation.f int i5, @h1 int i6, @o0 @i1 int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i5, i6);
        for (int i7 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i7, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static boolean h(@o0 Context context) {
        return i(context, f13726c);
    }

    private static boolean i(@o0 Context context, @o0 int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i5 = 0; i5 < iArr.length; i5++) {
            if (!obtainStyledAttributes.hasValue(i5)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    @o0
    public static TypedArray j(@o0 Context context, AttributeSet attributeSet, @o0 @i1 int[] iArr, @androidx.annotation.f int i5, @h1 int i6, @i1 int... iArr2) {
        b(context, attributeSet, i5, i6);
        d(context, attributeSet, iArr, i5, i6, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i5, i6);
    }

    public static z0 k(@o0 Context context, AttributeSet attributeSet, @o0 @i1 int[] iArr, @androidx.annotation.f int i5, @h1 int i6, @i1 int... iArr2) {
        b(context, attributeSet, i5, i6);
        d(context, attributeSet, iArr, i5, i6, iArr2);
        return z0.G(context, attributeSet, iArr, i5, i6);
    }
}
