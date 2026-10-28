package com.jcodecraeer.xrecyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BallScaleIndicator.java */
/* loaded from: classes6.dex */
public class k extends s {

    /* renamed from: c, reason: collision with root package name */
    float f66568c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    int f66569d = 255;

    /* compiled from: BallScaleIndicator.java */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            k.this.f66568c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            k.this.h();
        }
    }

    /* compiled from: BallScaleIndicator.java */
    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            k.this.f66569d = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            k.this.h();
        }
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public List<Animator> a() {
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new a());
        ofFloat.start();
        ValueAnimator ofInt = ValueAnimator.ofInt(255, 0);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.setDuration(1000L);
        ofInt.setRepeatCount(-1);
        ofInt.addUpdateListener(new b());
        ofInt.start();
        arrayList.add(ofFloat);
        arrayList.add(ofInt);
        return arrayList;
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public void c(Canvas canvas, Paint paint) {
        paint.setAlpha(this.f66569d);
        float f4 = this.f66568c;
        canvas.scale(f4, f4, f() / 2, d() / 2);
        paint.setAlpha(this.f66569d);
        canvas.drawCircle(f() / 2, d() / 2, (f() / 2) - 4.0f, paint);
    }
}
