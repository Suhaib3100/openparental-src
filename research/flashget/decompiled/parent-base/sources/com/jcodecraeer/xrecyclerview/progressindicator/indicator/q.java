package com.jcodecraeer.xrecyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BallZigZagDeflectIndicator.java */
/* loaded from: classes6.dex */
public class q extends r {

    /* compiled from: BallZigZagDeflectIndicator.java */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66601b;

        a(int i4) {
            this.f66601b = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            q.this.f66605c[this.f66601b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            q.this.h();
        }
    }

    /* compiled from: BallZigZagDeflectIndicator.java */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66603b;

        b(int i4) {
            this.f66603b = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            q.this.f66606d[this.f66603b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            q.this.h();
        }
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.r, com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public List<Animator> a() {
        char c5 = 4;
        ArrayList arrayList = new ArrayList();
        float f4 = f() / 6;
        float f5 = f() / 6;
        int i4 = 0;
        while (i4 < 2) {
            float[] fArr = new float[5];
            fArr[0] = f4;
            fArr[1] = f() - f4;
            fArr[2] = f4;
            fArr[3] = f() - f4;
            fArr[c5] = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            if (i4 == 1) {
                float[] fArr2 = new float[5];
                fArr2[0] = f() - f4;
                fArr2[1] = f4;
                fArr2[2] = f() - f4;
                fArr2[3] = f4;
                fArr2[c5] = f() - f4;
                ofFloat = ValueAnimator.ofFloat(fArr2);
            }
            float[] fArr3 = new float[5];
            fArr3[0] = f5;
            fArr3[1] = f5;
            fArr3[2] = d() - f5;
            fArr3[3] = d() - f5;
            fArr3[c5] = f5;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr3);
            if (i4 == 1) {
                float[] fArr4 = new float[5];
                fArr4[0] = d() - f5;
                fArr4[1] = d() - f5;
                fArr4[2] = f5;
                fArr4[3] = f5;
                fArr4[c5] = d() - f5;
                ofFloat2 = ValueAnimator.ofFloat(fArr4);
            }
            ofFloat.setDuration(2000L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setRepeatCount(-1);
            ofFloat.addUpdateListener(new a(i4));
            ofFloat.start();
            ofFloat2.setDuration(2000L);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setRepeatCount(-1);
            ofFloat2.addUpdateListener(new b(i4));
            ofFloat2.start();
            arrayList.add(ofFloat);
            arrayList.add(ofFloat2);
            i4++;
            c5 = 4;
        }
        return arrayList;
    }
}
