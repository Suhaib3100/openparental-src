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
import androidx.appcompat.widget.t0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import s8.a;

/* compiled from: ThemeEnforcement.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    private static final String f53519b = ProtectedSandApp.s("\uf1eb");

    /* renamed from: d, reason: collision with root package name */
    private static final String f53521d = ProtectedSandApp.s("\uf1ec");

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f53518a = {a.c.J2};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f53520c = {a.c.M2};

    private n() {
    }

    public static void a(@o0 Context context) {
        e(context, f53518a, ProtectedSandApp.s("\uf1eb"));
    }

    private static void b(@o0 Context context, AttributeSet attributeSet, @androidx.annotation.f int i4, @h1 int i5) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.Tt, i4, i5);
        boolean z4 = obtainStyledAttributes.getBoolean(a.o.Vt, false);
        obtainStyledAttributes.recycle();
        if (z4) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(a.c.Z6, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(@o0 Context context) {
        e(context, f53520c, ProtectedSandApp.s("\uf1ec"));
    }

    private static void d(@o0 Context context, AttributeSet attributeSet, @o0 @i1 int[] iArr, @androidx.annotation.f int i4, @h1 int i5, @q0 @i1 int... iArr2) {
        boolean z4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.Tt, i4, i5);
        if (!obtainStyledAttributes.getBoolean(a.o.Wt, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            z4 = obtainStyledAttributes.getResourceId(a.o.Ut, -1) != -1;
        } else {
            z4 = g(context, attributeSet, iArr, i4, i5, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z4) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf1ed"));
        }
    }

    private static void e(@o0 Context context, @o0 int[] iArr, String str) {
        if (!i(context, iArr)) {
            throw new IllegalArgumentException(android.support.v4.media.d.a(ProtectedSandApp.s("\uf1ee"), str, ProtectedSandApp.s("\uf1ef")));
        }
    }

    public static boolean f(@o0 Context context) {
        return i(context, f53518a);
    }

    private static boolean g(@o0 Context context, AttributeSet attributeSet, @o0 @i1 int[] iArr, @androidx.annotation.f int i4, @h1 int i5, @o0 @i1 int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i4, i5);
        for (int i6 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i6, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static boolean h(@o0 Context context) {
        return i(context, f53520c);
    }

    private static boolean i(@o0 Context context, @o0 int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (!obtainStyledAttributes.hasValue(i4)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    @o0
    public static TypedArray j(@o0 Context context, AttributeSet attributeSet, @o0 @i1 int[] iArr, @androidx.annotation.f int i4, @h1 int i5, @i1 int... iArr2) {
        b(context, attributeSet, i4, i5);
        d(context, attributeSet, iArr, i4, i5, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i4, i5);
    }

    public static t0 k(@o0 Context context, AttributeSet attributeSet, @o0 @i1 int[] iArr, @androidx.annotation.f int i4, @h1 int i5, @i1 int... iArr2) {
        b(context, attributeSet, i4, i5);
        d(context, attributeSet, iArr, i4, i5, iArr2);
        return t0.G(context, attributeSet, iArr, i4, i5);
    }
}
