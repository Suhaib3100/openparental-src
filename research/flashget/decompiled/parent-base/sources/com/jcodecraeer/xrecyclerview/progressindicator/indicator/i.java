package com.jcodecraeer.xrecyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.android.internal.telephony.SmsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BallPulseSyncIndicator.java */
/* loaded from: classes6.dex */
public class i extends s {

    /* renamed from: c, reason: collision with root package name */
    float[] f66563c = new float[3];

    /* compiled from: BallPulseSyncIndicator.java */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66564b;

        a(int i4) {
            this.f66564b = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            i.this.f66563c[this.f66564b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            i.this.h();
        }
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public List<Animator> a() {
        ArrayList arrayList = new ArrayList();
        float f4 = (f() - 8.0f) / 6.0f;
        int[] iArr = {70, SmsConstants.MAX_USER_DATA_BYTES, 210};
        for (int i4 = 0; i4 < 3; i4++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(d() / 2, (d() / 2) - (2.0f * f4), d() / 2);
            ofFloat.setDuration(600L);
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
        float f4 = (f() - 8.0f) / 6.0f;
        float f5 = 2.0f * f4;
        float f6 = (f() / 2) - (f5 + 4.0f);
        for (int i4 = 0; i4 < 3; i4++) {
            canvas.save();
            float f7 = i4;
            canvas.translate((f7 * 4.0f) + (f5 * f7) + f6, this.f66563c[i4]);
            canvas.drawCircle(0.0f, 0.0f, f4, paint);
            canvas.restore();
        }
    }
}
