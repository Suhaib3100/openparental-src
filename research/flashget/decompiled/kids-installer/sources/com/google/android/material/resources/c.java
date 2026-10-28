package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.c1;
import androidx.annotation.i1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.widget.z0;

/* compiled from: MaterialResources.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final float f13914a = 1.3f;

    /* renamed from: b, reason: collision with root package name */
    private static final float f13915b = 2.0f;

    private c() {
    }

    @q0
    public static ColorStateList a(@o0 Context context, @o0 TypedArray typedArray, @i1 int i5) {
        int resourceId;
        ColorStateList c6;
        return (!typedArray.hasValue(i5) || (resourceId = typedArray.getResourceId(i5, 0)) == 0 || (c6 = androidx.appcompat.content.res.a.c(context, resourceId)) == null) ? typedArray.getColorStateList(i5) : c6;
    }

    @q0
    public static ColorStateList b(@o0 Context context, @o0 z0 z0Var, @i1 int i5) {
        int u5;
        ColorStateList c6;
        return (!z0Var.C(i5) || (u5 = z0Var.u(i5, 0)) == 0 || (c6 = androidx.appcompat.content.res.a.c(context, u5)) == null) ? z0Var.d(i5) : c6;
    }

    public static int c(@o0 Context context, @o0 TypedArray typedArray, @i1 int i5, int i6) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i5, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i5, i6);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i6);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    @q0
    public static Drawable d(@o0 Context context, @o0 TypedArray typedArray, @i1 int i5) {
        int resourceId;
        Drawable d6;
        return (!typedArray.hasValue(i5) || (resourceId = typedArray.getResourceId(i5, 0)) == 0 || (d6 = androidx.appcompat.content.res.a.d(context, resourceId)) == null) ? typedArray.getDrawable(i5) : d6;
    }

    @i1
    static int e(@o0 TypedArray typedArray, @i1 int i5, @i1 int i6) {
        return typedArray.hasValue(i5) ? i5 : i6;
    }

    @q0
    public static d f(@o0 Context context, @o0 TypedArray typedArray, @i1 int i5) {
        int resourceId;
        if (!typedArray.hasValue(i5) || (resourceId = typedArray.getResourceId(i5, 0)) == 0) {
            return null;
        }
        return new d(context, resourceId);
    }

    public static boolean g(@o0 Context context) {
        return context.getResources().getConfiguration().fontScale >= f13914a;
    }

    public static boolean h(@o0 Context context) {
        return context.getResources().getConfiguration().fontScale >= f13915b;
    }
}
