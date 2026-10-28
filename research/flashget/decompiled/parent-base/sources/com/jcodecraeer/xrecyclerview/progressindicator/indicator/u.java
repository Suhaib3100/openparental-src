package com.jcodecraeer.xrecyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: LineScaleIndicator.java */
/* loaded from: classes6.dex */
public class u extends s {

    /* renamed from: d, reason: collision with root package name */
    public static final float f66624d = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    float[] f66625c = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

    /* compiled from: LineScaleIndicator.java */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66626b;

        a(int i4) {
            this.f66626b = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            u.this.f66625c[this.f66626b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            u.this.h();
        }
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public List<Animator> a() {
        ArrayList arrayList = new ArrayList();
        long[] jArr = {100, 200, 300, 400, 500};
        for (int i4 = 0; i4 < 5; i4++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.4f, 1.0f);
            ofFloat.setDuration(1000L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setStartDelay(jArr[i4]);
            ofFloat.addUpdateListener(new a(i4));
            ofFloat.start();
            arrayList.add(ofFloat);
        }
        return arrayList;
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public void c(Canvas canvas, Paint paint) {
        float f4 = f() / 11;
        float d5 = d() / 2;
        for (int i4 = 0; i4 < 5; i4++) {
            canvas.save();
            float f5 = f4 / 2.0f;
            canvas.translate((((i4 * 2) + 2) * f4) - f5, d5);
            canvas.scale(1.0f, this.f66625c[i4]);
            canvas.drawRoundRect(new RectF((-f4) / 2.0f, (-d()) / 2.5f, f5, d() / 2.5f), 5.0f, 5.0f, paint);
            canvas.restore();
        }
    }
}
