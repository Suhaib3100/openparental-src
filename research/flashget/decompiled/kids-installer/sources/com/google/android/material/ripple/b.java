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
import androidx.core.graphics.r1;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: RippleUtils.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class b {

    /* renamed from: m, reason: collision with root package name */
    @m1
    static final String f13958m = ProtectedSandApp.s("ቐ");

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f13946a = true;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f13947b = {R.attr.state_pressed};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f13948c = {R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f13949d = {R.attr.state_focused};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f13950e = {R.attr.state_hovered};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f13951f = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f13952g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f13953h = {R.attr.state_selected, R.attr.state_focused};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f13954i = {R.attr.state_selected, R.attr.state_hovered};

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f13955j = {R.attr.state_selected};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f13956k = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: l, reason: collision with root package name */
    @m1
    static final String f13957l = b.class.getSimpleName();

    private b() {
    }

    @o0
    public static ColorStateList a(@q0 ColorStateList colorStateList) {
        if (f13946a) {
            return new ColorStateList(new int[][]{f13955j, StateSet.NOTHING}, new int[]{c(colorStateList, f13951f), c(colorStateList, f13947b)});
        }
        int[] iArr = f13951f;
        int[] iArr2 = f13952g;
        int[] iArr3 = f13953h;
        int[] iArr4 = f13954i;
        int[] iArr5 = f13947b;
        int[] iArr6 = f13948c;
        int[] iArr7 = f13949d;
        int[] iArr8 = f13950e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f13955j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{c(colorStateList, iArr), c(colorStateList, iArr2), c(colorStateList, iArr3), c(colorStateList, iArr4), 0, c(colorStateList, iArr5), c(colorStateList, iArr6), c(colorStateList, iArr7), c(colorStateList, iArr8), 0});
    }

    @l
    @TargetApi(21)
    private static int b(@l int i5) {
        return r1.B(i5, Math.min(Color.alpha(i5) * 2, 255));
    }

    @l
    private static int c(@q0 ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f13946a ? b(colorForState) : colorForState;
    }

    @o0
    public static ColorStateList d(@q0 ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(f13956k, 0));
        }
        return colorStateList;
    }

    public static boolean e(@o0 int[] iArr) {
        boolean z5 = false;
        boolean z6 = false;
        for (int i5 : iArr) {
            if (i5 == 16842910) {
                z5 = true;
            } else if (i5 == 16842908 || i5 == 16842919 || i5 == 16843623) {
                z6 = true;
            }
        }
        return z5 && z6;
    }
}
