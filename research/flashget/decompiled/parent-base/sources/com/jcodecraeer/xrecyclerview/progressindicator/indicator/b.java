package com.jcodecraeer.xrecyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BallClipRotateIndicator.java */
/* loaded from: classes6.dex */
public class b extends s {

    /* renamed from: c, reason: collision with root package name */
    float f66533c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    float f66534d;

    /* compiled from: BallClipRotateIndicator.java */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.f66533c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.h();
        }
    }

    /* compiled from: BallClipRotateIndicator.java */
    /* renamed from: com.jcodecraeer.xrecyclerview.progressindicator.indicator.b$b, reason: collision with other inner class name */
    class C0976b implements ValueAnimator.AnimatorUpdateListener {
        C0976b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.f66534d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.h();
        }
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public List<Animator> a() {
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.6f, 0.5f, 1.0f);
        ofFloat.setDuration(750L);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new a());
        ofFloat.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 180.0f, 360.0f);
        ofFloat2.setDuration(750L);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.addUpdateListener(new C0976b());
        ofFloat2.start();
        arrayList.add(ofFloat);
        arrayList.add(ofFloat2);
        return arrayList;
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public void c(Canvas canvas, Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3.0f);
        float f4 = f() / 2;
        float d5 = d() / 2;
        canvas.translate(f4, d5);
        float f5 = this.f66533c;
        canvas.scale(f5, f5);
        canvas.rotate(this.f66534d);
        canvas.drawArc(new RectF((-f4) + 12.0f, (-d5) + 12.0f, (f4 + 0.0f) - 12.0f, (d5 + 0.0f) - 12.0f), -45.0f, 270.0f, false, paint);
    }
}
