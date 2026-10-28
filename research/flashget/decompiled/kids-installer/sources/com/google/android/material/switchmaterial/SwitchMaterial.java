package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.internal.v;
import com.google.android.material.resources.b;
import n1.a;

/* loaded from: classes3.dex */
public class SwitchMaterial extends SwitchCompat {

    /* renamed from: s0, reason: collision with root package name */
    private static final int f14273s0 = a.n.xb;

    /* renamed from: t0, reason: collision with root package name */
    private static final int[][] f14274t0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: o0, reason: collision with root package name */
    @o0
    private final s1.a f14275o0;

    /* renamed from: p0, reason: collision with root package name */
    @q0
    private ColorStateList f14276p0;

    /* renamed from: q0, reason: collision with root package name */
    @q0
    private ColorStateList f14277q0;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f14278r0;

    public SwitchMaterial(@o0 Context context) {
        this(context, null);
    }

    private ColorStateList V() {
        if (this.f14276p0 == null) {
            int h5 = b.h(this, a.c.Q2);
            int h6 = b.h(this, a.c.A2);
            float dimension = getResources().getDimension(a.f.d6);
            if (this.f14275o0.l()) {
                dimension += v.i(this);
            }
            int e6 = this.f14275o0.e(h5, dimension);
            int[][] iArr = f14274t0;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = p1.a.h(h5, h6, 1.0f);
            iArr2[1] = e6;
            iArr2[2] = p1.a.h(h5, h6, 0.38f);
            iArr2[3] = e6;
            this.f14276p0 = new ColorStateList(iArr, iArr2);
        }
        return this.f14276p0;
    }

    private ColorStateList W() {
        if (this.f14277q0 == null) {
            int[][] iArr = f14274t0;
            int[] iArr2 = new int[iArr.length];
            int h5 = b.h(this, a.c.Q2);
            int h6 = b.h(this, a.c.A2);
            int h7 = b.h(this, a.c.J2);
            iArr2[0] = p1.a.h(h5, h6, 0.54f);
            iArr2[1] = p1.a.h(h5, h7, 0.32f);
            iArr2[2] = p1.a.h(h5, h6, 0.12f);
            iArr2[3] = p1.a.h(h5, h7, 0.12f);
            this.f14277q0 = new ColorStateList(iArr, iArr2);
        }
        return this.f14277q0;
    }

    public boolean X() {
        return this.f14278r0;
    }

    public void Y(boolean z5) {
        this.f14278r0 = z5;
        if (z5) {
            O(V());
            S(W());
        } else {
            O(null);
            S(null);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f14278r0 && r() == null) {
            O(V());
        }
        if (this.f14278r0 && u() == null) {
            S(W());
        }
    }

    public SwitchMaterial(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.zd);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SwitchMaterial(@androidx.annotation.o0 android.content.Context r7, @androidx.annotation.q0 android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.switchmaterial.SwitchMaterial.f14273s0
            android.content.Context r7 = v1.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            s1.a r7 = new s1.a
            r7.<init>(r0)
            r6.f14275o0 = r7
            int[] r2 = n1.a.o.Zp
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r9 = n1.a.o.aq
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f14278r0 = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.switchmaterial.SwitchMaterial.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
