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
/* loaded from: classes3.dex */
class c extends com.google.android.material.shape.j {

    @o0
    private final Paint R;

    @o0
    private final RectF S;
    private int T;

    c() {
        this(null);
    }

    private void R0(@o0 Canvas canvas) {
        if (getCallback() instanceof View) {
            return;
        }
        canvas.restoreToCount(this.T);
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
        this.T = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
    }

    private void X0() {
        this.R.setStyle(Paint.Style.FILL_AND_STROKE);
        this.R.setColor(-1);
        this.R.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    private boolean Y0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    boolean Q0() {
        return !this.S.isEmpty();
    }

    void T0() {
        V0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void V0(float f6, float f7, float f8, float f9) {
        RectF rectF = this.S;
        if (f6 == rectF.left && f7 == rectF.top && f8 == rectF.right && f9 == rectF.bottom) {
            return;
        }
        rectF.set(f6, f7, f8, f9);
        invalidateSelf();
    }

    void W0(@o0 RectF rectF) {
        V0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // com.google.android.material.shape.j, android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        S0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.S, this.R);
        R0(canvas);
    }

    c(@q0 o oVar) {
        super(oVar == null ? new o() : oVar);
        this.R = new Paint(1);
        X0();
        this.S = new RectF();
    }
}
