package com.jcodecraeer.xrecyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BallRotateIndicator.java */
/* loaded from: classes6.dex */
public class j extends s {

    /* renamed from: c, reason: collision with root package name */
    float f66566c = 0.5f;

    /* compiled from: BallRotateIndicator.java */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            j.this.f66566c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            j.this.h();
        }
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public List<Animator> a() {
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 1.0f, 0.5f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new a());
        ofFloat.start();
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(e(), ProtectedSandApp.s("ᒄ\u0001"), 0.0f, 180.0f, 360.0f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.start();
        arrayList.add(ofFloat);
        arrayList.add(ofFloat2);
        return arrayList;
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public void c(Canvas canvas, Paint paint) {
        float f4 = f() / 10;
        float f5 = f() / 2;
        float d5 = d() / 2;
        canvas.save();
        float f6 = 2.0f * f4;
        canvas.translate((f5 - f6) - f4, d5);
        float f7 = this.f66566c;
        canvas.scale(f7, f7);
        canvas.drawCircle(0.0f, 0.0f, f4, paint);
        canvas.restore();
        canvas.save();
        canvas.translate(f5, d5);
        float f10 = this.f66566c;
        canvas.scale(f10, f10);
        canvas.drawCircle(0.0f, 0.0f, f4, paint);
        canvas.restore();
        canvas.save();
        canvas.translate(f5 + f6 + f4, d5);
        float f11 = this.f66566c;
        canvas.scale(f11, f11);
        canvas.drawCircle(0.0f, 0.0f, f4, paint);
        canvas.restore();
    }
}
