package com.tencent.rtmp.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.ScaleAnimation;

/* loaded from: classes7.dex */
public class FocusIndicatorView extends View {

    /* renamed from: a, reason: collision with root package name */
    final ScaleAnimation f72702a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f72703b;

    /* renamed from: c, reason: collision with root package name */
    private final int f72704c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f72705d;

    public FocusIndicatorView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i4 = this.f72704c / 2;
        Rect rect = this.f72705d;
        rect.left = i4;
        rect.top = i4;
        rect.right = getWidth() - i4;
        this.f72705d.bottom = getHeight() - i4;
        canvas.drawRect(this.f72705d, this.f72703b);
    }

    public FocusIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FocusIndicatorView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f72705d = new Rect();
        int i5 = (int) ((getResources().getDisplayMetrics().density * 1.0f) + 0.5f);
        this.f72704c = i5;
        Paint paint = new Paint();
        this.f72703b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(i5);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.3f, 1.0f, 1.3f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f72702a = scaleAnimation;
        scaleAnimation.setDuration(200L);
    }
}
