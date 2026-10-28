package com.google.android.material.ripple;

import android.R;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;
import androidx.annotation.c1;
import androidx.annotation.l;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.graphics.z;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: RippleUtils.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class b {

    /* renamed from: m, reason: collision with root package name */
    @m1
    static final String f53808m = ProtectedSandApp.s("\uf20c");

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f53796a = true;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f53797b = {R.attr.state_pressed};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f53798c = {R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f53799d = {R.attr.state_focused};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f53800e = {R.attr.state_hovered};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f53801f = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f53802g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f53803h = {R.attr.state_selected, R.attr.state_focused};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f53804i = {R.attr.state_selected, R.attr.state_hovered};

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f53805j = {R.attr.state_selected};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f53806k = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: l, reason: collision with root package name */
    @m1
    static final String f53807l = b.class.getSimpleName();

    private b() {
    }

    @o0
    public static ColorStateList a(@q0 ColorStateList colorStateList) {
        if (f53796a) {
            return new ColorStateList(new int[][]{f53805j, StateSet.NOTHING}, new int[]{c(colorStateList, f53801f), c(colorStateList, f53797b)});
        }
        int[] iArr = f53801f;
        int[] iArr2 = f53802g;
        int[] iArr3 = f53803h;
        int[] iArr4 = f53804i;
        int[] iArr5 = f53797b;
        int[] iArr6 = f53798c;
        int[] iArr7 = f53799d;
        int[] iArr8 = f53800e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f53805j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{c(colorStateList, iArr), c(colorStateList, iArr2), c(colorStateList, iArr3), c(colorStateList, iArr4), 0, c(colorStateList, iArr5), c(colorStateList, iArr6), c(colorStateList, iArr7), c(colorStateList, iArr8), 0});
    }

    @l
    @TargetApi(21)
    private static int b(@l int i4) {
        return z.D(i4, Math.min(Color.alpha(i4) * 2, 255));
    }

    @l
    private static int c(@q0 ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f53796a ? b(colorForState) : colorForState;
    }

    @o0
    public static ColorStateList d(@q0 ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(f53806k, 0));
        }
        return colorStateList;
    }

    public static boolean e(@o0 int[] iArr) {
        boolean z4 = false;
        boolean z5 = false;
        for (int i4 : iArr) {
            if (i4 == 16842910) {
                z4 = true;
            } else if (i4 == 16842908 || i4 == 16842919 || i4 == 16843623) {
                z5 = true;
            }
        }
        return z4 && z5;
    }
}
