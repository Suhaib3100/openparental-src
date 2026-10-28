package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.google.android.material.resources.b;
import s8.a;

/* loaded from: classes6.dex */
public class MaterialRadioButton extends AppCompatRadioButton {

    /* renamed from: h, reason: collision with root package name */
    private static final int f53757h = a.n.wb;

    /* renamed from: i, reason: collision with root package name */
    private static final int[][] f53758i = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: f, reason: collision with root package name */
    @q0
    private ColorStateList f53759f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f53760g;

    public MaterialRadioButton(@o0 Context context) {
        this(context, null);
    }

    private ColorStateList d() {
        if (this.f53759f == null) {
            int h4 = b.h(this, a.c.f90650z2);
            int h5 = b.h(this, a.c.I2);
            int h6 = b.h(this, a.c.P2);
            int[][] iArr = f53758i;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = u8.a.h(h6, h4, 1.0f);
            iArr2[1] = u8.a.h(h6, h5, 0.54f);
            iArr2[2] = u8.a.h(h6, h5, 0.38f);
            iArr2[3] = u8.a.h(h6, h5, 0.38f);
            this.f53759f = new ColorStateList(iArr, iArr2);
        }
        return this.f53759f;
    }

    public boolean e() {
        return this.f53760g;
    }

    public void h(boolean z4) {
        this.f53760g = z4;
        if (z4) {
            setButtonTintList(d());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f53760g && getButtonTintList() == null) {
            h(true);
        }
    }

    public MaterialRadioButton(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.Rb);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialRadioButton(@androidx.annotation.o0 android.content.Context r8, @androidx.annotation.q0 android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.radiobutton.MaterialRadioButton.f53757h
            android.content.Context r8 = a9.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = s8.a.o.Hl
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r10 = s8.a.o.Il
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = com.google.android.material.resources.c.a(r8, r9, r10)
            r7.setButtonTintList(r8)
        L28:
            int r8 = s8.a.o.Jl
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f53760g = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.radiobutton.MaterialRadioButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
