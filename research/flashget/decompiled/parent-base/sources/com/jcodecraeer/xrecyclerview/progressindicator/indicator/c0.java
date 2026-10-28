package com.jcodecraeer.xrecyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.animation.LinearInterpolator;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TriangleSkewSpinIndicator.java */
/* loaded from: classes6.dex */
public class c0 extends s {
    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public List<Animator> a() {
        ArrayList arrayList = new ArrayList();
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(ProtectedSandApp.s("ᒁ\u0001"), 0.0f, 180.0f, 180.0f, 0.0f, 0.0f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(e(), PropertyValuesHolder.ofFloat(ProtectedSandApp.s("ᒂ\u0001"), 0.0f, 0.0f, 180.0f, 180.0f, 0.0f), ofFloat);
        ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
        ofPropertyValuesHolder.setRepeatCount(-1);
        ofPropertyValuesHolder.setDuration(2500L);
        ofPropertyValuesHolder.start();
        arrayList.add(ofPropertyValuesHolder);
        return arrayList;
    }

    @Override // com.jcodecraeer.xrecyclerview.progressindicator.indicator.s
    public void c(Canvas canvas, Paint paint) {
        Path path = new Path();
        path.moveTo(f() / 5, (d() * 4) / 5);
        path.lineTo((f() * 4) / 5, (d() * 4) / 5);
        path.lineTo(f() / 2, d() / 5);
        path.close();
        canvas.drawPath(path, paint);
    }
}
