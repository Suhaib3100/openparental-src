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
import androidx.appcompat.widget.t0;

/* compiled from: MaterialResources.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final float f53764a = 1.3f;

    /* renamed from: b, reason: collision with root package name */
    private static final float f53765b = 2.0f;

    private c() {
    }

    @q0
    public static ColorStateList a(@o0 Context context, @o0 TypedArray typedArray, @i1 int i4) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (colorStateList = androidx.core.content.d.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i4) : colorStateList;
    }

    @q0
    public static ColorStateList b(@o0 Context context, @o0 t0 t0Var, @i1 int i4) {
        int u4;
        ColorStateList colorStateList;
        return (!t0Var.C(i4) || (u4 = t0Var.u(i4, 0)) == 0 || (colorStateList = androidx.core.content.d.getColorStateList(context, u4)) == null) ? t0Var.d(i4) : colorStateList;
    }

    public static int c(@o0 Context context, @o0 TypedArray typedArray, @i1 int i4, int i5) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i4, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i4, i5);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i5);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    @q0
    public static Drawable d(@o0 Context context, @o0 TypedArray typedArray, @i1 int i4) {
        int resourceId;
        Drawable b5;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (b5 = e.a.b(context, resourceId)) == null) ? typedArray.getDrawable(i4) : b5;
    }

    @i1
    static int e(@o0 TypedArray typedArray, @i1 int i4, @i1 int i5) {
        return typedArray.hasValue(i4) ? i4 : i5;
    }

    @q0
    public static d f(@o0 Context context, @o0 TypedArray typedArray, @i1 int i4) {
        int resourceId;
        if (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0) {
            return null;
        }
        return new d(context, resourceId);
    }

    public static boolean g(@o0 Context context) {
        return context.getResources().getConfiguration().fontScale >= f53764a;
    }

    public static boolean h(@o0 Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
