package com.jcodecraeer.xrecyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BallPulseIndicator.java */
/* loaded from: classes6.dex */
public class g extends s {

    /* renamed from: d, reason: collision with root package name */
    public static final float f66559d = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    private float[] f66560c = {1.0f, 1.0f, 1.0f};

    /* compiled from: BallPulseIndicator.java */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66561b;

        a(int i4) {
            this.f66561b = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            g.this.f66560c[this.f66561b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            g.this.h();
        }
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public List<Animator> a() {
        ArrayList arrayList = new ArrayList();
        int[] iArr = {120, 240, 360};
        for (int i4 = 0; i4 < 3; i4++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.3f, 1.0f);
            ofFloat.setDuration(750L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setStartDelay(iArr[i4]);
            ofFloat.addUpdateListener(new a(i4));
            ofFloat.start();
            arrayList.add(ofFloat);
        }
        return arrayList;
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public void c(Canvas canvas, Paint paint) {
        float min = (Math.min(f(), d()) - 8.0f) / 6.0f;
        float f4 = 2.0f * min;
        float f5 = (f() / 2) - (f4 + 4.0f);
        float d5 = d() / 2;
        for (int i4 = 0; i4 < 3; i4++) {
            canvas.save();
            float f6 = i4;
            canvas.translate((f6 * 4.0f) + (f4 * f6) + f5, d5);
            float f7 = this.f66560c[i4];
            canvas.scale(f7, f7);
            canvas.drawCircle(0.0f, 0.0f, min, paint);
            canvas.restore();
        }
    }
}
