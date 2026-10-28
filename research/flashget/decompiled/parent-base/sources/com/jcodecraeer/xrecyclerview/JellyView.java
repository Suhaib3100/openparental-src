package com.jcodecraeer.xrecyclerview;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes6.dex */
public class JellyView extends View implements b {

    /* renamed from: b, reason: collision with root package name */
    Path f64847b;

    /* renamed from: c, reason: collision with root package name */
    Paint f64848c;

    /* renamed from: d, reason: collision with root package name */
    private int f64849d;

    /* renamed from: e, reason: collision with root package name */
    private int f64850e;

    public JellyView(Context context) {
        super(context);
        this.f64849d = 0;
        this.f64850e = 0;
        e();
    }

    private void e() {
        if (isInEditMode()) {
            return;
        }
        this.f64847b = new Path();
        Paint paint = new Paint();
        this.f64848c = paint;
        paint.setColor(getContext().getResources().getColor(R.color.holo_blue_bright));
        this.f64848c.setAntiAlias(true);
    }

    @Override // com.jcodecraeer.xrecyclerview.b
    public void a(float f4) {
        this.f64850e += (int) f4;
        invalidate();
    }

    @Override // com.jcodecraeer.xrecyclerview.b
    public boolean b() {
        return false;
    }

    @Override // com.jcodecraeer.xrecyclerview.b
    public void c() {
    }

    public int d() {
        return this.f64850e;
    }

    public void f(int i4) {
        this.f64848c.setColor(i4);
    }

    public void g(int i4) {
        this.f64850e = i4;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return this.f64849d;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f64847b.reset();
        this.f64847b.lineTo(0.0f, this.f64849d);
        this.f64847b.quadTo(getMeasuredWidth() / 2, this.f64849d + this.f64850e, getMeasuredWidth(), this.f64849d);
        this.f64847b.lineTo(getMeasuredWidth(), 0.0f);
        canvas.drawPath(this.f64847b, this.f64848c);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i4) {
        this.f64849d = i4;
    }

    public JellyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f64849d = 0;
        this.f64850e = 0;
        e();
    }

    public JellyView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f64849d = 0;
        this.f64850e = 0;
        e();
    }

    @TargetApi(21)
    public JellyView(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f64849d = 0;
        this.f64850e = 0;
        e();
    }
}
