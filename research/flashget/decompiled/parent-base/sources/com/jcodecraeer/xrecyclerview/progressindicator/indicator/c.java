package com.jcodecraeer.xrecyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BallClipRotateMultipleIndicator.java */
/* loaded from: classes6.dex */
public class c extends s {

    /* renamed from: c, reason: collision with root package name */
    float f66537c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    float f66538d;

    /* compiled from: BallClipRotateMultipleIndicator.java */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            c.this.f66537c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            c.this.h();
        }
    }

    /* compiled from: BallClipRotateMultipleIndicator.java */
    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            c.this.f66538d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            c.this.h();
        }
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public List<Animator> a() {
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.6f, 1.0f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new a());
        ofFloat.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 180.0f, 360.0f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.addUpdateListener(new b());
        ofFloat2.start();
        arrayList.add(ofFloat);
        arrayList.add(ofFloat2);
        return arrayList;
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public void c(Canvas canvas, Paint paint) {
        paint.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        float f4 = f() / 2;
        float d5 = d() / 2;
        canvas.save();
        canvas.translate(f4, d5);
        float f5 = this.f66537c;
        canvas.scale(f5, f5);
        canvas.rotate(this.f66538d);
        float[] fArr = {135.0f, -45.0f};
        for (int i4 = 0; i4 < 2; i4++) {
            canvas.drawArc(new RectF((-f4) + 12.0f, (-d5) + 12.0f, f4 - 12.0f, d5 - 12.0f), fArr[i4], 90.0f, false, paint);
        }
        canvas.restore();
        canvas.translate(f4, d5);
        float f6 = this.f66537c;
        canvas.scale(f6, f6);
        canvas.rotate(-this.f66538d);
        float[] fArr2 = {225.0f, 45.0f};
        for (int i5 = 0; i5 < 2; i5++) {
            canvas.drawArc(new RectF(((-f4) / 1.8f) + 12.0f, ((-d5) / 1.8f) + 12.0f, (f4 / 1.8f) - 12.0f, (d5 / 1.8f) - 12.0f), fArr2[i5], 90.0f, false, paint);
        }
    }
}
