package com.jcodecraeer.xrecyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpStatus;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: BallGridBeatIndicator.java */
/* loaded from: classes6.dex */
public class e extends s {

    /* renamed from: d, reason: collision with root package name */
    public static final int f66547d = 255;

    /* renamed from: c, reason: collision with root package name */
    int[] f66548c = {255, 255, 255, 255, 255, 255, 255, 255, 255};

    /* compiled from: BallGridBeatIndicator.java */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66549b;

        a(int i4) {
            this.f66549b = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            e.this.f66548c[this.f66549b] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            e.this.h();
        }
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public List<Animator> a() {
        ArrayList arrayList = new ArrayList();
        int[] iArr = {960, 930, 1190, 1130, 1340, 940, 1200, 820, 1190};
        int[] iArr2 = {360, 400, 680, HttpStatus.SC_GONE, 710, -150, -120, 10, 320};
        for (int i4 = 0; i4 < 9; i4++) {
            ValueAnimator ofInt = ValueAnimator.ofInt(255, SyslogAppender.LOG_LOCAL5, 255);
            ofInt.setDuration(iArr[i4]);
            ofInt.setRepeatCount(-1);
            ofInt.setStartDelay(iArr2[i4]);
            ofInt.addUpdateListener(new a(i4));
            ofInt.start();
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
                paint.setAlpha(this.f66548c[(i4 * 3) + i5]);
                canvas.drawCircle(0.0f, 0.0f, f4, paint);
                canvas.restore();
            }
        }
    }
}
