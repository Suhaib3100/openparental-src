package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.c1;
import d.a;

/* compiled from: ThemeUtils.java */
@androidx.annotation.c1({c1.a.LIBRARY})
/* loaded from: classes.dex */
public class o0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1969a = "ThemeUtils";

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f1970b = new ThreadLocal<>();

    /* renamed from: c, reason: collision with root package name */
    static final int[] f1971c = {-16842910};

    /* renamed from: d, reason: collision with root package name */
    static final int[] f1972d = {R.attr.state_focused};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f1973e = {R.attr.state_activated};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f1974f = {R.attr.state_pressed};

    /* renamed from: g, reason: collision with root package name */
    static final int[] f1975g = {R.attr.state_checked};

    /* renamed from: h, reason: collision with root package name */
    static final int[] f1976h = {R.attr.state_selected};

    /* renamed from: i, reason: collision with root package name */
    static final int[] f1977i = {-16842919, -16842908};

    /* renamed from: j, reason: collision with root package name */
    static final int[] f1978j = new int[0];

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f1979k = new int[1];

    private o0() {
    }

    public static void a(@androidx.annotation.o0 View view, @androidx.annotation.o0 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a.m.S0);
        try {
            if (!obtainStyledAttributes.hasValue(a.m.f73523g3)) {
                view.getClass().toString();
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @androidx.annotation.o0
    public static ColorStateList b(int i4, int i5) {
        return new ColorStateList(new int[][]{f1971c, f1978j}, new int[]{i5, i4});
    }

    public static int c(@androidx.annotation.o0 Context context, int i4) {
        ColorStateList f4 = f(context, i4);
        if (f4 != null && f4.isStateful()) {
            return f4.getColorForState(f1971c, f4.getDefaultColor());
        }
        TypedValue g4 = g();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, g4, true);
        return e(context, i4, g4.getFloat());
    }

    public static int d(@androidx.annotation.o0 Context context, int i4) {
        int[] iArr = f1979k;
        iArr[0] = i4;
        t0 F = t0.F(context, null, iArr);
        try {
            return F.c(0, 0);
        } finally {
            F.I();
        }
    }

    static int e(@androidx.annotation.o0 Context context, int i4, float f4) {
        return androidx.core.graphics.z.D(d(context, i4), Math.round(Color.alpha(r0) * f4));
    }

    @androidx.annotation.q0
    public static ColorStateList f(@androidx.annotation.o0 Context context, int i4) {
        int[] iArr = f1979k;
        iArr[0] = i4;
        t0 F = t0.F(context, null, iArr);
        try {
            return F.d(0);
        } finally {
            F.I();
        }
    }

    private static TypedValue g() {
        ThreadLocal<TypedValue> threadLocal = f1970b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
