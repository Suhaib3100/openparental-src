package com.jcodecraeer.xrecyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BallSpinFadeLoaderIndicator.java */
/* loaded from: classes6.dex */
public class o extends s {

    /* renamed from: e, reason: collision with root package name */
    public static final float f66584e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public static final int f66585f = 255;

    /* renamed from: c, reason: collision with root package name */
    float[] f66586c = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: d, reason: collision with root package name */
    int[] f66587d = {255, 255, 255, 255, 255, 255, 255, 255};

    /* compiled from: BallSpinFadeLoaderIndicator.java */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66588b;

        a(int i4) {
            this.f66588b = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            o.this.f66586c[this.f66588b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            o.this.h();
        }
    }

    /* compiled from: BallSpinFadeLoaderIndicator.java */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66590b;

        b(int i4) {
            this.f66590b = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            o.this.f66587d[this.f66590b] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            o.this.h();
        }
    }

    /* compiled from: BallSpinFadeLoaderIndicator.java */
    final class c {

        /* renamed from: a, reason: collision with root package name */
        public float f66592a;

        /* renamed from: b, reason: collision with root package name */
        public float f66593b;

        public c(float f4, float f5) {
            this.f66592a = f4;
            this.f66593b = f5;
        }
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public List<Animator> a() {
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 120, 240, 360, 480, 600, 720, 780, 840};
        for (int i4 = 0; i4 < 8; i4++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.4f, 1.0f);
            ofFloat.setDuration(1000L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setStartDelay(iArr[i4]);
            ofFloat.addUpdateListener(new a(i4));
            ofFloat.start();
            ValueAnimator ofInt = ValueAnimator.ofInt(255, 77, 255);
            ofInt.setDuration(1000L);
            ofInt.setRepeatCount(-1);
            ofInt.setStartDelay(iArr[i4]);
            ofInt.addUpdateListener(new b(i4));
            ofInt.start();
            arrayList.add(ofFloat);
            arrayList.add(ofInt);
        }
        return arrayList;
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public void c(Canvas canvas, Paint paint) {
        float f4 = f() / 10;
        for (int i4 = 0; i4 < 8; i4++) {
            canvas.save();
            c l4 = l(f(), d(), (f() / 2) - f4, 0.7853981633974483d * i4);
            canvas.translate(l4.f66592a, l4.f66593b);
            float f5 = this.f66586c[i4];
            canvas.scale(f5, f5);
            paint.setAlpha(this.f66587d[i4]);
            canvas.drawCircle(0.0f, 0.0f, f4, paint);
            canvas.restore();
        }
    }

    c l(int i4, int i5, float f4, double d5) {
        double d6 = f4;
        return new c((float) ((Math.cos(d5) * d6) + (i4 / 2)), (float) androidx.appcompat.app.b0.a(d5, d6, i5 / 2));
    }
}
