package com.jcodecraeer.xrecyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BallZigZagIndicator.java */
/* loaded from: classes6.dex */
public class r extends s {

    /* renamed from: c, reason: collision with root package name */
    float[] f66605c = new float[2];

    /* renamed from: d, reason: collision with root package name */
    float[] f66606d = new float[2];

    /* compiled from: BallZigZagIndicator.java */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66607b;

        a(int i4) {
            this.f66607b = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            r.this.f66605c[this.f66607b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            r.this.h();
        }
    }

    /* compiled from: BallZigZagIndicator.java */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66609b;

        b(int i4) {
            this.f66609b = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            r.this.f66606d[this.f66609b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            r.this.h();
        }
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public List<Animator> a() {
        ArrayList arrayList = new ArrayList();
        float f4 = f() / 6;
        float f5 = f() / 6;
        for (int i4 = 0; i4 < 2; i4++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f4, f() - f4, f() / 2, f4);
            if (i4 == 1) {
                ofFloat = ValueAnimator.ofFloat(f() - f4, f4, f() / 2, f() - f4);
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f5, f5, d() / 2, f5);
            if (i4 == 1) {
                ofFloat2 = ValueAnimator.ofFloat(d() - f5, d() - f5, d() / 2, d() - f5);
            }
            ofFloat.setDuration(1000L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setRepeatCount(-1);
            ofFloat.addUpdateListener(new a(i4));
            ofFloat.start();
            ofFloat2.setDuration(1000L);
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
        for (int i4 = 0; i4 < 2; i4++) {
            canvas.save();
            canvas.translate(this.f66605c[i4], this.f66606d[i4]);
            canvas.drawCircle(0.0f, 0.0f, f() / 10, paint);
            canvas.restore();
        }
    }
}
