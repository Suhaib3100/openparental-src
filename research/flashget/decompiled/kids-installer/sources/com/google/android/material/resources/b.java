package com.google.android.material.resources;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q;
import androidx.annotation.q0;
import androidx.annotation.u0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import n1.a;

/* compiled from: MaterialAttributes.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class b {
    @q0
    public static TypedValue a(@o0 Context context, @androidx.annotation.f int i5) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i5, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(@o0 Context context, @androidx.annotation.f int i5, boolean z5) {
        TypedValue a6 = a(context, i5);
        return (a6 == null || a6.type != 18) ? z5 : a6.data != 0;
    }

    public static boolean c(@o0 Context context, @androidx.annotation.f int i5, @o0 String str) {
        return g(context, i5, str) != 0;
    }

    @u0
    public static int d(@o0 Context context, @androidx.annotation.f int i5, @q int i6) {
        TypedValue a6 = a(context, i5);
        return (int) ((a6 == null || a6.type != 5) ? context.getResources().getDimension(i6) : a6.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static int e(@o0 Context context, @androidx.annotation.f int i5, int i6) {
        TypedValue a6 = a(context, i5);
        return (a6 == null || a6.type != 16) ? i6 : a6.data;
    }

    @u0
    public static int f(@o0 Context context) {
        return d(context, a.c.ha, a.f.f29472e5);
    }

    public static int g(@o0 Context context, @androidx.annotation.f int i5, @o0 String str) {
        TypedValue a6 = a(context, i5);
        if (a6 != null) {
            return a6.data;
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("\u124e"), str, context.getResources().getResourceName(i5)));
    }

    public static int h(@o0 View view, @androidx.annotation.f int i5) {
        return g(view.getContext(), i5, view.getClass().getCanonicalName());
    }
}
