package com.jcodecraeer.xrecyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CubeTransitionIndicator.java */
/* loaded from: classes6.dex */
public class t extends s {

    /* renamed from: e, reason: collision with root package name */
    float f66616e;

    /* renamed from: c, reason: collision with root package name */
    float[] f66614c = new float[2];

    /* renamed from: d, reason: collision with root package name */
    float[] f66615d = new float[2];

    /* renamed from: f, reason: collision with root package name */
    float f66617f = 1.0f;

    /* compiled from: CubeTransitionIndicator.java */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66618b;

        a(int i4) {
            this.f66618b = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            t.this.f66614c[this.f66618b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            t.this.h();
        }
    }

    /* compiled from: CubeTransitionIndicator.java */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66620b;

        b(int i4) {
            this.f66620b = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            t.this.f66615d[this.f66620b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            t.this.h();
        }
    }

    /* compiled from: CubeTransitionIndicator.java */
    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            t.this.f66617f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            t.this.h();
        }
    }

    /* compiled from: CubeTransitionIndicator.java */
    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            t.this.f66616e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            t.this.h();
        }
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public List<Animator> a() {
        ArrayList arrayList = new ArrayList();
        float f4 = f() / 5;
        float d5 = d() / 5;
        for (int i4 = 0; i4 < 2; i4++) {
            this.f66614c[i4] = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f4, f() - f4, f() - f4, f4, f4);
            if (i4 == 1) {
                ofFloat = ValueAnimator.ofFloat(f() - f4, f4, f4, f() - f4, f() - f4);
            }
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(1600L);
            ofFloat.setRepeatCount(-1);
            ofFloat.addUpdateListener(new a(i4));
            ofFloat.start();
            this.f66615d[i4] = d5;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(d5, d5, d() - d5, d() - d5, d5);
            if (i4 == 1) {
                ofFloat2 = ValueAnimator.ofFloat(d() - d5, d() - d5, d5, d5, d() - d5);
            }
            ofFloat2.setDuration(1600L);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setRepeatCount(-1);
            ofFloat2.addUpdateListener(new b(i4));
            ofFloat2.start();
            arrayList.add(ofFloat);
            arrayList.add(ofFloat2);
        }
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.5f, 1.0f, 0.5f, 1.0f);
        ofFloat3.setDuration(1600L);
        ofFloat3.setInterpolator(new LinearInterpolator());
        ofFloat3.setRepeatCount(-1);
        ofFloat3.addUpdateListener(new c());
        ofFloat3.start();
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, 180.0f, 360.0f, 540.0f, 720.0f);
        ofFloat4.setDuration(1600L);
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.setRepeatCount(-1);
        ofFloat4.addUpdateListener(new d());
        ofFloat4.start();
        arrayList.add(ofFloat3);
        arrayList.add(ofFloat4);
        return arrayList;
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public void c(Canvas canvas, Paint paint) {
        float f4 = f() / 5;
        float d5 = d() / 5;
        for (int i4 = 0; i4 < 2; i4++) {
            canvas.save();
            canvas.translate(this.f66614c[i4], this.f66615d[i4]);
            canvas.rotate(this.f66616e);
            float f5 = this.f66617f;
            canvas.scale(f5, f5);
            canvas.drawRect(new RectF((-f4) / 2.0f, (-d5) / 2.0f, f4 / 2.0f, d5 / 2.0f), paint);
            canvas.restore();
        }
    }
}
