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
import s8.a;

/* loaded from: classes6.dex */
public class SwitchMaterial extends SwitchCompat {
    private static final int Y2 = a.n.xb;
    private static final int[][] Z2 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    @o0
    private final x8.a U2;

    @q0
    private ColorStateList V2;

    @q0
    private ColorStateList W2;
    private boolean X2;

    public SwitchMaterial(@o0 Context context) {
        this(context, null);
    }

    private ColorStateList d0() {
        if (this.V2 == null) {
            int h4 = b.h(this, a.c.P2);
            int h5 = b.h(this, a.c.f90650z2);
            float dimension = getResources().getDimension(a.f.d6);
            if (this.U2.l()) {
                dimension += v.i(this);
            }
            int e4 = this.U2.e(h4, dimension);
            int[][] iArr = Z2;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = u8.a.h(h4, h5, 1.0f);
            iArr2[1] = e4;
            iArr2[2] = u8.a.h(h4, h5, 0.38f);
            iArr2[3] = e4;
            this.V2 = new ColorStateList(iArr, iArr2);
        }
        return this.V2;
    }

    private ColorStateList e0() {
        if (this.W2 == null) {
            int[][] iArr = Z2;
            int[] iArr2 = new int[iArr.length];
            int h4 = b.h(this, a.c.P2);
            int h5 = b.h(this, a.c.f90650z2);
            int h6 = b.h(this, a.c.I2);
            iArr2[0] = u8.a.h(h4, h5, 0.54f);
            iArr2[1] = u8.a.h(h4, h6, 0.32f);
            iArr2[2] = u8.a.h(h4, h5, 0.12f);
            iArr2[3] = u8.a.h(h4, h6, 0.12f);
            this.W2 = new ColorStateList(iArr, iArr2);
        }
        return this.W2;
    }

    public boolean f0() {
        return this.X2;
    }

    public void g0(boolean z4) {
        this.X2 = z4;
        if (z4) {
            V(d0());
            Z(e0());
        } else {
            V(null);
            Z(null);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.X2 && u() == null) {
            V(d0());
        }
        if (this.X2 && x() == null) {
            Z(e0());
        }
    }

    public SwitchMaterial(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f90644yd);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SwitchMaterial(@androidx.annotation.o0 android.content.Context r7, @androidx.annotation.q0 android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.switchmaterial.SwitchMaterial.Y2
            android.content.Context r7 = a9.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            x8.a r7 = new x8.a
            r7.<init>(r0)
            r6.U2 = r7
            int[] r2 = s8.a.o.Er
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r9 = s8.a.o.Fr
            boolean r7 = r8.getBoolean(r9, r7)
            r6.X2 = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.switchmaterial.SwitchMaterial.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
