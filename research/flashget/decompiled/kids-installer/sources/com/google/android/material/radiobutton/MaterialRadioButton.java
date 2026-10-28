package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.d;
import com.google.android.material.resources.b;
import n1.a;

/* loaded from: classes3.dex */
public class MaterialRadioButton extends AppCompatRadioButton {

    /* renamed from: t, reason: collision with root package name */
    private static final int f13907t = a.n.wb;

    /* renamed from: u, reason: collision with root package name */
    private static final int[][] f13908u = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: r, reason: collision with root package name */
    @q0
    private ColorStateList f13909r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f13910s;

    public MaterialRadioButton(@o0 Context context) {
        this(context, null);
    }

    private ColorStateList a() {
        if (this.f13909r == null) {
            int h5 = b.h(this, a.c.A2);
            int h6 = b.h(this, a.c.J2);
            int h7 = b.h(this, a.c.Q2);
            int[][] iArr = f13908u;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = p1.a.h(h7, h5, 1.0f);
            iArr2[1] = p1.a.h(h7, h6, 0.54f);
            iArr2[2] = p1.a.h(h7, h6, 0.38f);
            iArr2[3] = p1.a.h(h7, h6, 0.38f);
            this.f13909r = new ColorStateList(iArr, iArr2);
        }
        return this.f13909r;
    }

    public boolean g() {
        return this.f13910s;
    }

    public void h(boolean z5) {
        this.f13910s = z5;
        if (z5) {
            d.d(this, a());
        } else {
            d.d(this, null);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f13910s && d.b(this) == null) {
            h(true);
        }
    }

    public MaterialRadioButton(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.Sb);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialRadioButton(@androidx.annotation.o0 android.content.Context r8, @androidx.annotation.q0 android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.radiobutton.MaterialRadioButton.f13907t
            android.content.Context r8 = v1.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = n1.a.o.ok
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r10 = n1.a.o.pk
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = com.google.android.material.resources.c.a(r8, r9, r10)
            androidx.core.widget.d.d(r7, r8)
        L28:
            int r8 = n1.a.o.qk
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f13910s = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.radiobutton.MaterialRadioButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
