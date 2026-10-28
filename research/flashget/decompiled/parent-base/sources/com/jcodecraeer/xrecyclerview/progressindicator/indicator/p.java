package com.jcodecraeer.xrecyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BallTrianglePathIndicator.java */
/* loaded from: classes6.dex */
public class p extends s {

    /* renamed from: c, reason: collision with root package name */
    float[] f66595c = new float[3];

    /* renamed from: d, reason: collision with root package name */
    float[] f66596d = new float[3];

    /* compiled from: BallTrianglePathIndicator.java */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66597b;

        a(int i4) {
            this.f66597b = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            p.this.f66595c[this.f66597b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            p.this.h();
        }
    }

    /* compiled from: BallTrianglePathIndicator.java */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66599b;

        b(int i4) {
            this.f66599b = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            p.this.f66596d[this.f66599b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            p.this.h();
        }
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public List<Animator> a() {
        ArrayList arrayList = new ArrayList();
        float f4 = f() / 5;
        float f5 = f() / 5;
        for (int i4 = 0; i4 < 3; i4++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f() / 2, f() - f4, f4, f() / 2);
            if (i4 == 1) {
                ofFloat = ValueAnimator.ofFloat(f() - f4, f4, f() / 2, f() - f4);
            } else if (i4 == 2) {
                ofFloat = ValueAnimator.ofFloat(f4, f() / 2, f() - f4, f4);
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f5, d() - f5, d() - f5, f5);
            if (i4 == 1) {
                ofFloat2 = ValueAnimator.ofFloat(d() - f5, d() - f5, f5, d() - f5);
            } else if (i4 == 2) {
                ofFloat2 = ValueAnimator.ofFloat(d() - f5, f5, d() - f5, d() - f5);
            }
            ofFloat.setDuration(2000L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setRepeatCount(-1);
            ofFloat.addUpdateListener(new a(i4));
            ofFloat.start();
            ofFloat2.setDuration(2000L);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setRepeatCount(-1);
            ofFloat2.addUpdateListener(new b(i4));
            ofFloat2.start();
            arrayList.add(ofFloat);
            arrayList.add(ofFloat2);
        }
        return arrayList;
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public void c(Canvas canvas, Paint paint) {
        paint.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        for (int i4 = 0; i4 < 3; i4++) {
            canvas.save();
            canvas.translate(this.f66595c[i4], this.f66596d[i4]);
            canvas.drawCircle(0.0f, 0.0f, f() / 10, paint);
            canvas.restore();
        }
    }
}
