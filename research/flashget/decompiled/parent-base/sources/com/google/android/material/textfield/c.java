package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.material.shape.o;

/* compiled from: CutoutDrawable.java */
/* loaded from: classes6.dex */
class c extends com.google.android.material.shape.j {

    @o0
    private final Paint E;

    @o0
    private final RectF F;
    private int G;

    c() {
        this(null);
    }

    private void R0(@o0 Canvas canvas) {
        if (getCallback() instanceof View) {
            return;
        }
        canvas.restoreToCount(this.G);
    }

    private void S0(@o0 Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            U0(canvas);
            return;
        }
        View view = (View) callback;
        if (view.getLayerType() != 2) {
            view.setLayerType(2, null);
        }
    }

    private void U0(@o0 Canvas canvas) {
        this.G = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
    }

    private void X0() {
        this.E.setStyle(Paint.Style.FILL_AND_STROKE);
        this.E.setColor(-1);
        this.E.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    private boolean Y0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    boolean Q0() {
        return !this.F.isEmpty();
    }

    void T0() {
        V0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void V0(float f4, float f5, float f6, float f7) {
        RectF rectF = this.F;
        if (f4 == rectF.left && f5 == rectF.top && f6 == rectF.right && f7 == rectF.bottom) {
            return;
        }
        rectF.set(f4, f5, f6, f7);
        invalidateSelf();
    }

    void W0(@o0 RectF rectF) {
        V0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        S0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.F, this.E);
        R0(canvas);
    }

    c(@q0 o oVar) {
        super(oVar == null ? new o() : oVar);
        this.E = new Paint(1);
        X0();
        this.F = new RectF();
    }
}
