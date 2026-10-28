package com.jcodecraeer.xrecyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: LineScalePulseOutIndicator.java */
/* loaded from: classes6.dex */
public class w extends u {

    /* compiled from: LineScalePulseOutIndicator.java */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66632b;

        a(int i4) {
            this.f66632b = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            w.this.f66625c[this.f66632b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            w.this.h();
        }
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.u, com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public List<Animator> a() {
        ArrayList arrayList = new ArrayList();
        long[] jArr = {500, 250, 0, 250, 500};
        for (int i4 = 0; i4 < 5; i4++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.3f, 1.0f);
            ofFloat.setDuration(900L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setStartDelay(jArr[i4]);
            ofFloat.addUpdateListener(new a(i4));
            ofFloat.start();
            arrayList.add(ofFloat);
        }
        return arrayList;
    }
}
