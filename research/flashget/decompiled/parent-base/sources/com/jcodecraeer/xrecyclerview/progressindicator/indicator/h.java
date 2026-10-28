package com.jcodecraeer.xrecyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BallPulseRiseIndicator.java */
/* loaded from: classes6.dex */
public class h extends s {
    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public List<Animator> a() {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(e(), PropertyValuesHolder.ofFloat(ProtectedSandApp.s("ᒃ\u0001"), 0.0f, 360.0f));
        ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
        ofPropertyValuesHolder.setRepeatCount(-1);
        ofPropertyValuesHolder.setDuration(1500L);
        ofPropertyValuesHolder.start();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ofPropertyValuesHolder);
        return arrayList;
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public void c(Canvas canvas, Paint paint) {
        float f4 = f() / 10;
        float f5 = 2.0f * f4;
        canvas.drawCircle(f() / 4, f5, f4, paint);
        canvas.drawCircle((f() * 3) / 4, f5, f4, paint);
        canvas.drawCircle(f4, d() - f5, f4, paint);
        canvas.drawCircle(f() / 2, d() - f5, f4, paint);
        canvas.drawCircle(f() - f4, d() - f5, f4, paint);
    }
}
