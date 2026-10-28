package com.jcodecraeer.xrecyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BallClipRotatePulseIndicator.java */
/* loaded from: classes6.dex */
public class d extends s {

    /* renamed from: c, reason: collision with root package name */
    float f66541c;

    /* renamed from: d, reason: collision with root package name */
    float f66542d;

    /* renamed from: e, reason: collision with root package name */
    float f66543e;

    /* compiled from: BallClipRotatePulseIndicator.java */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.f66541c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d.this.h();
        }
    }

    /* compiled from: BallClipRotatePulseIndicator.java */
    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.f66542d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d.this.h();
        }
    }

    /* compiled from: BallClipRotatePulseIndicator.java */
    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.f66543e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d.this.h();
        }
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public List<Animator> a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.3f, 1.0f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new a());
        ofFloat.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.6f, 1.0f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.addUpdateListener(new b());
        ofFloat2.start();
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 180.0f, 360.0f);
        ofFloat3.setDuration(1000L);
        ofFloat3.setRepeatCount(-1);
        ofFloat3.addUpdateListener(new c());
        ofFloat3.start();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ofFloat);
        arrayList.add(ofFloat2);
        arrayList.add(ofFloat3);
        return arrayList;
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public void c(Canvas canvas, Paint paint) {
        float f4 = f() / 2;
        float d5 = d() / 2;
        canvas.save();
        canvas.translate(f4, d5);
        float f5 = this.f66541c;
        canvas.scale(f5, f5);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(0.0f, 0.0f, f4 / 2.5f, paint);
        canvas.restore();
        canvas.translate(f4, d5);
        float f6 = this.f66542d;
        canvas.scale(f6, f6);
        canvas.rotate(this.f66543e);
        paint.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        float[] fArr = {225.0f, 45.0f};
        for (int i4 = 0; i4 < 2; i4++) {
            canvas.drawArc(new RectF((-f4) + 12.0f, (-d5) + 12.0f, f4 - 12.0f, d5 - 12.0f), fArr[i4], 90.0f, false, paint);
        }
    }
}
