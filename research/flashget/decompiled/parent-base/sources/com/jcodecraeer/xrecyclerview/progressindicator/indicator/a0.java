package com.jcodecraeer.xrecyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SemiCircleSpinIndicator.java */
/* loaded from: classes6.dex */
public class a0 extends s {
    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public List<Animator> a() {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(e(), ProtectedSandApp.s("ᑾ\u0001"), 0.0f, 180.0f, 360.0f);
        ofFloat.setDuration(600L);
        ofFloat.setRepeatCount(-1);
        ofFloat.start();
        arrayList.add(ofFloat);
        return arrayList;
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public void c(Canvas canvas, Paint paint) {
        canvas.drawArc(new RectF(0.0f, 0.0f, f(), d()), -60.0f, 120.0f, false, paint);
    }
}
