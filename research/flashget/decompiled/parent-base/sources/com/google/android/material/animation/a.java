package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.c1;
import androidx.annotation.x;

/* compiled from: AnimationUtils.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeInterpolator f52466a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final TimeInterpolator f52467b = new androidx.interpolator.view.animation.b();

    /* renamed from: c, reason: collision with root package name */
    public static final TimeInterpolator f52468c = new androidx.interpolator.view.animation.a();

    /* renamed from: d, reason: collision with root package name */
    public static final TimeInterpolator f52469d = new androidx.interpolator.view.animation.c();

    /* renamed from: e, reason: collision with root package name */
    public static final TimeInterpolator f52470e = new DecelerateInterpolator();

    public static float a(float f4, float f5, float f6) {
        return androidx.appcompat.graphics.drawable.d.a(f5, f4, f6, f4);
    }

    public static float b(float f4, float f5, @x(from = 0.0d, to = 1.0d) float f6, @x(from = 0.0d, to = 1.0d) float f7, @x(from = 0.0d, to = 1.0d) float f10) {
        return f10 < f6 ? f4 : f10 > f7 ? f5 : a(f4, f5, (f10 - f6) / (f7 - f6));
    }

    public static int c(int i4, int i5, float f4) {
        return Math.round(f4 * (i5 - i4)) + i4;
    }
}
