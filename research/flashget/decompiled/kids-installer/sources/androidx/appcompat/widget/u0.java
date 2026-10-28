package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.c1;
import androidx.core.graphics.r1;
import d.a;

/* compiled from: ThemeUtils.java */
@androidx.annotation.c1({c1.a.LIBRARY})
/* loaded from: classes.dex */
public class u0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1387a = "ThemeUtils";

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f1388b = new ThreadLocal<>();

    /* renamed from: c, reason: collision with root package name */
    static final int[] f1389c = {-16842910};

    /* renamed from: d, reason: collision with root package name */
    static final int[] f1390d = {R.attr.state_focused};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f1391e = {R.attr.state_activated};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f1392f = {R.attr.state_pressed};

    /* renamed from: g, reason: collision with root package name */
    static final int[] f1393g = {R.attr.state_checked};

    /* renamed from: h, reason: collision with root package name */
    static final int[] f1394h = {R.attr.state_selected};

    /* renamed from: i, reason: collision with root package name */
    static final int[] f1395i = {-16842919, -16842908};

    /* renamed from: j, reason: collision with root package name */
    static final int[] f1396j = new int[0];

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f1397k = new int[1];

    private u0() {
    }

    public static void a(@androidx.annotation.o0 View view, @androidx.annotation.o0 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a.n.f22195f1);
        try {
            if (!obtainStyledAttributes.hasValue(a.n.f22282t3)) {
                view.getClass().toString();
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @androidx.annotation.o0
    public static ColorStateList b(int i5, int i6) {
        return new ColorStateList(new int[][]{f1389c, f1396j}, new int[]{i6, i5});
    }

    public static int c(@androidx.annotation.o0 Context context, int i5) {
        ColorStateList f6 = f(context, i5);
        if (f6 != null && f6.isStateful()) {
            return f6.getColorForState(f1389c, f6.getDefaultColor());
        }
        TypedValue g5 = g();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, g5, true);
        return e(context, i5, g5.getFloat());
    }

    public static int d(@androidx.annotation.o0 Context context, int i5) {
        int[] iArr = f1397k;
        iArr[0] = i5;
        z0 F = z0.F(context, null, iArr);
        try {
            return F.c(0, 0);
        } finally {
            F.I();
        }
    }

    static int e(@androidx.annotation.o0 Context context, int i5, float f6) {
        return r1.B(d(context, i5), Math.round(Color.alpha(r0) * f6));
    }

    @androidx.annotation.q0
    public static ColorStateList f(@androidx.annotation.o0 Context context, int i5) {
        int[] iArr = f1397k;
        iArr[0] = i5;
        z0 F = z0.F(context, null, iArr);
        try {
            return F.d(0);
        } finally {
            F.I();
        }
    }

    private static TypedValue g() {
        ThreadLocal<TypedValue> threadLocal = f1388b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
