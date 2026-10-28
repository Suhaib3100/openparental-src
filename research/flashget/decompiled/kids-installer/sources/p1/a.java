package p1;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.f;
import androidx.annotation.g0;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.x;
import androidx.core.graphics.r1;
import com.google.android.material.resources.b;

/* compiled from: MaterialColors.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final float f32247a = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    public static final float f32248b = 0.54f;

    /* renamed from: c, reason: collision with root package name */
    public static final float f32249c = 0.38f;

    /* renamed from: d, reason: collision with root package name */
    public static final float f32250d = 0.32f;

    /* renamed from: e, reason: collision with root package name */
    public static final float f32251e = 0.12f;

    private a() {
    }

    @l
    public static int a(@l int i5, @g0(from = 0, to = 255) int i6) {
        return r1.B(i5, (Color.alpha(i5) * i6) / 255);
    }

    @l
    public static int b(@o0 Context context, @f int i5, @l int i6) {
        TypedValue a6 = b.a(context, i5);
        return a6 != null ? a6.data : i6;
    }

    @l
    public static int c(Context context, @f int i5, String str) {
        return b.g(context, i5, str);
    }

    @l
    public static int d(@o0 View view, @f int i5) {
        return b.h(view, i5);
    }

    @l
    public static int e(@o0 View view, @f int i5, @l int i6) {
        return b(view.getContext(), i5, i6);
    }

    public static boolean f(@l int i5) {
        return i5 != 0 && r1.m(i5) > 0.5d;
    }

    @l
    public static int g(@l int i5, @l int i6) {
        return r1.t(i6, i5);
    }

    @l
    public static int h(@l int i5, @l int i6, @x(from = 0.0d, to = 1.0d) float f6) {
        return r1.t(r1.B(i6, Math.round(Color.alpha(i6) * f6)), i5);
    }

    @l
    public static int i(@o0 View view, @f int i5, @f int i6) {
        return j(view, i5, i6, 1.0f);
    }

    @l
    public static int j(@o0 View view, @f int i5, @f int i6, @x(from = 0.0d, to = 1.0d) float f6) {
        return h(b.h(view, i5), b.h(view, i6), f6);
    }
}
