package com.google.android.material.resources;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q;
import androidx.annotation.q0;
import androidx.annotation.u0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import s8.a;

/* compiled from: MaterialAttributes.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class b {
    @q0
    public static TypedValue a(@o0 Context context, @androidx.annotation.f int i4) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i4, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(@o0 Context context, @androidx.annotation.f int i4, boolean z4) {
        TypedValue a5 = a(context, i4);
        return (a5 == null || a5.type != 18) ? z4 : a5.data != 0;
    }

    public static boolean c(@o0 Context context, @androidx.annotation.f int i4, @o0 String str) {
        return g(context, i4, str) != 0;
    }

    @u0
    public static int d(@o0 Context context, @androidx.annotation.f int i4, @q int i5) {
        TypedValue a5 = a(context, i4);
        return (int) ((a5 == null || a5.type != 5) ? context.getResources().getDimension(i5) : a5.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static int e(@o0 Context context, @androidx.annotation.f int i4, int i5) {
        TypedValue a5 = a(context, i4);
        return (a5 == null || a5.type != 16) ? i5 : a5.data;
    }

    @u0
    public static int f(@o0 Context context) {
        return d(context, a.c.f90411ga, a.f.e5);
    }

    public static int g(@o0 Context context, @androidx.annotation.f int i4, @o0 String str) {
        TypedValue a5 = a(context, i4);
        if (a5 != null) {
            return a5.data;
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("\uf20a"), str, context.getResources().getResourceName(i4)));
    }

    public static int h(@o0 View view, @androidx.annotation.f int i4) {
        return g(view.getContext(), i4, view.getClass().getCanonicalName());
    }
}
