package com.jcodecraeer.xrecyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PacmanIndicator.java */
/* loaded from: classes6.dex */
public class z extends s {

    /* renamed from: c, reason: collision with root package name */
    private float f66636c;

    /* renamed from: d, reason: collision with root package name */
    private int f66637d;

    /* renamed from: e, reason: collision with root package name */
    private float f66638e;

    /* renamed from: f, reason: collision with root package name */
    private float f66639f;

    /* compiled from: PacmanIndicator.java */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            z.this.f66636c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            z.this.h();
        }
    }

    /* compiled from: PacmanIndicator.java */
    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            z.this.f66637d = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            z.this.h();
        }
    }

    /* compiled from: PacmanIndicator.java */
    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            z.this.f66638e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            z.this.h();
        }
    }

    /* compiled from: PacmanIndicator.java */
    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            z.this.f66639f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            z.this.h();
        }
    }

    private void p(Canvas canvas, Paint paint) {
        float f4 = f() / 11;
        paint.setAlpha(this.f66637d);
        canvas.drawCircle(this.f66636c, d() / 2, f4, paint);
    }

    private void q(Canvas canvas, Paint paint) {
        float f4 = f() / 2;
        float d5 = d() / 2;
        canvas.save();
        canvas.translate(f4, d5);
        canvas.rotate(this.f66638e);
        paint.setAlpha(255);
        float f5 = (-f4) / 1.7f;
        float f6 = (-d5) / 1.7f;
        float f7 = f4 / 1.7f;
        float f10 = d5 / 1.7f;
        canvas.drawArc(new RectF(f5, f6, f7, f10), 0.0f, 270.0f, true, paint);
        canvas.restore();
        canvas.save();
        canvas.translate(f4, d5);
        canvas.rotate(this.f66639f);
        paint.setAlpha(255);
        canvas.drawArc(new RectF(f5, f6, f7, f10), 90.0f, 270.0f, true, paint);
        canvas.restore();
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public List<Animator> a() {
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f() - (f() / 11), f() / 2);
        ofFloat.setDuration(650L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new a());
        ofFloat.start();
        ValueAnimator ofInt = ValueAnimator.ofInt(255, 122);
        ofInt.setDuration(650L);
        ofInt.setRepeatCount(-1);
        ofInt.addUpdateListener(new b());
        ofInt.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 45.0f, 0.0f);
        ofFloat2.setDuration(650L);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.addUpdateListener(new c());
        ofFloat2.start();
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, -45.0f, 0.0f);
        ofFloat3.setDuration(650L);
        ofFloat3.setRepeatCount(-1);
        ofFloat3.addUpdateListener(new d());
        ofFloat3.start();
        arrayList.add(ofFloat);
        arrayList.add(ofInt);
        arrayList.add(ofFloat2);
        arrayList.add(ofFloat3);
        return arrayList;
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public void c(Canvas canvas, Paint paint) {
        q(canvas, paint);
        p(canvas, paint);
    }
}
