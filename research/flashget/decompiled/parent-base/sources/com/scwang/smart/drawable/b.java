package com.scwang.smart.drawable;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import androidx.annotation.o0;
import androidx.work.i0;
import com.tencent.mmkv.MMKV;

/* compiled from: ProgressDrawable.java */
/* loaded from: classes6.dex */
public class b extends a implements Animatable, ValueAnimator.AnimatorUpdateListener {

    /* renamed from: f, reason: collision with root package name */
    protected ValueAnimator f70532f;

    /* renamed from: c, reason: collision with root package name */
    protected int f70529c = 0;

    /* renamed from: d, reason: collision with root package name */
    protected int f70530d = 0;

    /* renamed from: e, reason: collision with root package name */
    protected int f70531e = 0;

    /* renamed from: g, reason: collision with root package name */
    protected Path f70533g = new Path();

    public b() {
        ValueAnimator ofInt = ValueAnimator.ofInt(30, MMKV.ExpireInHour);
        this.f70532f = ofInt;
        ofInt.setDuration(i0.f35991f);
        this.f70532f.setInterpolator(null);
        this.f70532f.setRepeatCount(-1);
        this.f70532f.setRepeatMode(1);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        float f4 = width;
        float max = Math.max(1.0f, f4 / 22.0f);
        if (this.f70529c != width || this.f70530d != height) {
            this.f70533g.reset();
            Path path = this.f70533g;
            float f5 = f4 - max;
            float f6 = height / 2.0f;
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(f5, f6, max, direction);
            float f7 = f4 - (5.0f * max);
            this.f70533g.addRect(f7, f6 - max, f5, f6 + max, direction);
            this.f70533g.addCircle(f7, f6, max, direction);
            this.f70529c = width;
            this.f70530d = height;
        }
        canvas.save();
        float f10 = f4 / 2.0f;
        float f11 = height / 2.0f;
        canvas.rotate(this.f70531e, f10, f11);
        for (int i4 = 0; i4 < 12; i4++) {
            this.f70528b.setAlpha((i4 + 5) * 17);
            canvas.rotate(30.0f, f10, f11);
            canvas.drawPath(this.f70533g, this.f70528b);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f70532f.isRunning();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f70531e = (((Integer) valueAnimator.getAnimatedValue()).intValue() / 30) * 30;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f70532f.isRunning()) {
            return;
        }
        this.f70532f.addUpdateListener(this);
        this.f70532f.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f70532f.isRunning()) {
            this.f70532f.removeAllListeners();
            this.f70532f.removeAllUpdateListeners();
            this.f70532f.cancel();
        }
    }
}
