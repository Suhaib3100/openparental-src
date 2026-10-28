package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.c1;
import androidx.annotation.x;

/* compiled from: AnimationUtils.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeInterpolator f12778a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final TimeInterpolator f12779b = new androidx.interpolator.view.animation.b();

    /* renamed from: c, reason: collision with root package name */
    public static final TimeInterpolator f12780c = new androidx.interpolator.view.animation.a();

    /* renamed from: d, reason: collision with root package name */
    public static final TimeInterpolator f12781d = new androidx.interpolator.view.animation.c();

    /* renamed from: e, reason: collision with root package name */
    public static final TimeInterpolator f12782e = new DecelerateInterpolator();

    public static float a(float f6, float f7, float f8) {
        return androidx.appcompat.graphics.drawable.d.a(f7, f6, f8, f6);
    }

    public static float b(float f6, float f7, @x(from = 0.0d, to = 1.0d) float f8, @x(from = 0.0d, to = 1.0d) float f9, @x(from = 0.0d, to = 1.0d) float f10) {
        return f10 < f8 ? f6 : f10 > f9 ? f7 : androidx.appcompat.graphics.drawable.d.a(f7, f6, (f10 - f8) / (f9 - f8), f6);
    }

    public static int c(int i5, int i6, float f6) {
        return Math.round(f6 * (i6 - i5)) + i5;
    }
}
