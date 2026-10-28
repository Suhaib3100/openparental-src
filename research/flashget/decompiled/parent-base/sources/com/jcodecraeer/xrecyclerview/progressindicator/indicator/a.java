package com.jcodecraeer.xrecyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BallBeatIndicator.java */
/* loaded from: classes6.dex */
public class a extends s {

    /* renamed from: e, reason: collision with root package name */
    public static final float f66525e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public static final int f66526f = 255;

    /* renamed from: c, reason: collision with root package name */
    private float[] f66527c = {1.0f, 1.0f, 1.0f};

    /* renamed from: d, reason: collision with root package name */
    int[] f66528d = {255, 255, 255};

    /* compiled from: BallBeatIndicator.java */
    /* renamed from: com.jcodecraeer.xrecyclerview.progressindicator.indicator.a$a, reason: collision with other inner class name */
    class C0975a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66529b;

        C0975a(int i4) {
            this.f66529b = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f66527c[this.f66529b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.h();
        }
    }

    /* compiled from: BallBeatIndicator.java */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66531b;

        b(int i4) {
            this.f66531b = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f66528d[this.f66531b] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            a.this.h();
        }
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public List<Animator> a() {
        ArrayList arrayList = new ArrayList();
        int[] iArr = {350, 0, 350};
        for (int i4 = 0; i4 < 3; i4++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.75f, 1.0f);
            ofFloat.setDuration(700L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setStartDelay(iArr[i4]);
            ofFloat.addUpdateListener(new C0975a(i4));
            ofFloat.start();
            ValueAnimator ofInt = ValueAnimator.ofInt(255, 51, 255);
            ofInt.setDuration(700L);
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
        float f4 = (f() - 8.0f) / 6.0f;
        float f5 = 2.0f * f4;
        float f6 = (f() / 2) - (f5 + 4.0f);
        float d5 = d() / 2;
        for (int i4 = 0; i4 < 3; i4++) {
            canvas.save();
            float f7 = i4;
            canvas.translate((f7 * 4.0f) + (f5 * f7) + f6, d5);
            float f10 = this.f66527c[i4];
            canvas.scale(f10, f10);
            paint.setAlpha(this.f66528d[i4]);
            canvas.drawCircle(0.0f, 0.0f, f4, paint);
            canvas.restore();
        }
    }
}
