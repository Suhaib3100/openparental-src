package com.jcodecraeer.xrecyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: LineScalePartyIndicator.java */
/* loaded from: classes6.dex */
public class v extends s {

    /* renamed from: d, reason: collision with root package name */
    public static final float f66628d = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    float[] f66629c = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

    /* compiled from: LineScalePartyIndicator.java */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66630b;

        a(int i4) {
            this.f66630b = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            v.this.f66629c[this.f66630b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            v.this.h();
        }
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public List<Animator> a() {
        ArrayList arrayList = new ArrayList();
        long[] jArr = {1260, 430, 1010, 730};
        long[] jArr2 = {770, 290, 280, 740};
        for (int i4 = 0; i4 < 4; i4++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.4f, 1.0f);
            ofFloat.setDuration(jArr[i4]);
            ofFloat.setRepeatCount(-1);
            ofFloat.setStartDelay(jArr2[i4]);
            ofFloat.addUpdateListener(new a(i4));
            ofFloat.start();
            arrayList.add(ofFloat);
        }
        return arrayList;
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public void c(Canvas canvas, Paint paint) {
        float f4 = f() / 9;
        float d5 = d() / 2;
        for (int i4 = 0; i4 < 4; i4++) {
            canvas.save();
            float f5 = f4 / 2.0f;
            canvas.translate((((i4 * 2) + 2) * f4) - f5, d5);
            float f6 = this.f66629c[i4];
            canvas.scale(f6, f6);
            canvas.drawRoundRect(new RectF((-f4) / 2.0f, (-d()) / 2.5f, f5, d() / 2.5f), 5.0f, 5.0f, paint);
            canvas.restore();
        }
    }
}
