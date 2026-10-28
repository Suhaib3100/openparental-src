package com.jcodecraeer.xrecyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BallScaleMultipleIndicator.java */
/* loaded from: classes6.dex */
public class l extends s {

    /* renamed from: c, reason: collision with root package name */
    float[] f66572c = {1.0f, 1.0f, 1.0f};

    /* renamed from: d, reason: collision with root package name */
    int[] f66573d = {255, 255, 255};

    /* compiled from: BallScaleMultipleIndicator.java */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66574b;

        a(int i4) {
            this.f66574b = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.this.f66572c[this.f66574b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            l.this.h();
        }
    }

    /* compiled from: BallScaleMultipleIndicator.java */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66576b;

        b(int i4) {
            this.f66576b = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.this.f66573d[this.f66576b] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            l.this.h();
        }
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public List<Animator> a() {
        ArrayList arrayList = new ArrayList();
        long[] jArr = {0, 200, 400};
        for (int i4 = 0; i4 < 3; i4++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(1000L);
            ofFloat.setRepeatCount(-1);
            ofFloat.addUpdateListener(new a(i4));
            ofFloat.setStartDelay(jArr[i4]);
            ofFloat.start();
            ValueAnimator ofInt = ValueAnimator.ofInt(255, 0);
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.setDuration(1000L);
            ofInt.setRepeatCount(-1);
            ofInt.addUpdateListener(new b(i4));
            ofFloat.setStartDelay(jArr[i4]);
            ofInt.start();
            arrayList.add(ofFloat);
            arrayList.add(ofInt);
        }
        return arrayList;
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public void c(Canvas canvas, Paint paint) {
        for (int i4 = 0; i4 < 3; i4++) {
            paint.setAlpha(this.f66573d[i4]);
            float f4 = this.f66572c[i4];
            canvas.scale(f4, f4, f() / 2, d() / 2);
            canvas.drawCircle(f() / 2, d() / 2, (f() / 2) - 4.0f, paint);
        }
    }
}
