package com.airbnb.lottie.model.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.q0;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.n0;
import com.airbnb.lottie.o0;
import com.airbnb.lottie.s0;

/* compiled from: ImageLayer.java */
/* loaded from: classes3.dex */
public class d extends b {
    private final Paint H;
    private final Rect I;
    private final Rect J;

    @q0
    private final o0 K;

    @q0
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> L;

    @q0
    private com.airbnb.lottie.animation.keyframe.a<Bitmap, Bitmap> M;

    d(n0 n0Var, e eVar) {
        super(n0Var, eVar);
        this.H = new com.airbnb.lottie.animation.a(3);
        this.I = new Rect();
        this.J = new Rect();
        this.K = n0Var.X(eVar.m());
    }

    @q0
    private Bitmap O() {
        Bitmap h4;
        com.airbnb.lottie.animation.keyframe.a<Bitmap, Bitmap> aVar = this.M;
        if (aVar != null && (h4 = aVar.h()) != null) {
            return h4;
        }
        Bitmap O = this.f39113p.O(this.f39114q.m());
        if (O != null) {
            return O;
        }
        o0 o0Var = this.K;
        if (o0Var != null) {
            return o0Var.a();
        }
        return null;
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.f
    public <T> void d(T t4, @q0 com.airbnb.lottie.value.j<T> jVar) {
        super.d(t4, jVar);
        if (t4 == s0.K) {
            if (jVar == null) {
                this.L = null;
                return;
            } else {
                this.L = new q(jVar, null);
                return;
            }
        }
        if (t4 == s0.N) {
            if (jVar == null) {
                this.M = null;
            } else {
                this.M = new q(jVar, null);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        super.f(rectF, matrix, z4);
        if (this.K != null) {
            float e4 = com.airbnb.lottie.utils.j.e();
            rectF.set(0.0f, 0.0f, this.K.f() * e4, this.K.d() * e4);
            this.f39112o.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void t(@androidx.annotation.o0 Canvas canvas, Matrix matrix, int i4) {
        Bitmap O = O();
        if (O == null || O.isRecycled() || this.K == null) {
            return;
        }
        float e4 = com.airbnb.lottie.utils.j.e();
        this.H.setAlpha(i4);
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.L;
        if (aVar != null) {
            this.H.setColorFilter(aVar.h());
        }
        canvas.save();
        canvas.concat(matrix);
        this.I.set(0, 0, O.getWidth(), O.getHeight());
        if (this.f39113p.Y()) {
            this.J.set(0, 0, (int) (this.K.f() * e4), (int) (this.K.d() * e4));
        } else {
            this.J.set(0, 0, (int) (O.getWidth() * e4), (int) (O.getHeight() * e4));
        }
        canvas.drawBitmap(O, this.I, this.J, this.H);
        canvas.restore();
    }
}
