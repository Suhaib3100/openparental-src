package com.jcodecraeer.xrecyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BallGridPulseIndicator.java */
/* loaded from: classes6.dex */
public class f extends s {

    /* renamed from: e, reason: collision with root package name */
    public static final int f66551e = 255;

    /* renamed from: f, reason: collision with root package name */
    public static final float f66552f = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    int[] f66553c = {255, 255, 255, 255, 255, 255, 255, 255, 255};

    /* renamed from: d, reason: collision with root package name */
    float[] f66554d = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

    /* compiled from: BallGridPulseIndicator.java */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66555b;

        a(int i4) {
            this.f66555b = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            f.this.f66554d[this.f66555b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            f.this.h();
        }
    }

    /* compiled from: BallGridPulseIndicator.java */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66557b;

        b(int i4) {
            this.f66557b = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            f.this.f66553c[this.f66557b] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            f.this.h();
        }
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public List<Animator> a() {
        ArrayList arrayList = new ArrayList();
        int[] iArr = {720, 1020, 1280, 1420, 1450, 1180, 870, 1450, 1060};
        int[] iArr2 = {-60, 250, -170, 480, 310, 30, 460, 780, 450};
        for (int i4 = 0; i4 < 9; i4++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.5f, 1.0f);
            ofFloat.setDuration(iArr[i4]);
            ofFloat.setRepeatCount(-1);
            ofFloat.setStartDelay(iArr2[i4]);
            ofFloat.addUpdateListener(new a(i4));
            ofFloat.start();
            ValueAnimator ofInt = ValueAnimator.ofInt(255, 210, 122, 255);
            ofInt.setDuration(iArr[i4]);
            ofInt.setRepeatCount(-1);
            ofInt.setStartDelay(iArr2[i4]);
            ofInt.addUpdateListener(new b(i4));
            ofInt.start();
            arrayList.add(ofFloat);
            arrayList.add(ofInt);
        }
        return arrayList;
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public void c(Canvas canvas, Paint paint) {
        float f4 = (f() - 16.0f) / 6.0f;
        float f5 = 2.0f * f4;
        float f6 = f5 + 4.0f;
        float f7 = (f() / 2) - f6;
        float f10 = (f() / 2) - f6;
        for (int i4 = 0; i4 < 3; i4++) {
            for (int i5 = 0; i5 < 3; i5++) {
                canvas.save();
                float f11 = i5;
                float f12 = i4;
                canvas.translate((f11 * 4.0f) + (f5 * f11) + f7, (f12 * 4.0f) + (f5 * f12) + f10);
                int i6 = (i4 * 3) + i5;
                float f13 = this.f66554d[i6];
                canvas.scale(f13, f13);
                paint.setAlpha(this.f66553c[i6]);
                canvas.drawCircle(0.0f, 0.0f, f4, paint);
                canvas.restore();
            }
        }
    }
}
