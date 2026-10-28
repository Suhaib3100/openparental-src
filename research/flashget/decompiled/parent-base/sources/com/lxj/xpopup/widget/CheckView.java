package com.lxj.xpopup.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.lxj.xpopup.util.h;

/* loaded from: classes6.dex */
public class CheckView extends View {

    /* renamed from: b, reason: collision with root package name */
    Paint f69869b;

    /* renamed from: c, reason: collision with root package name */
    int f69870c;

    /* renamed from: d, reason: collision with root package name */
    Path f69871d;

    public CheckView(Context context) {
        this(context, null);
    }

    public void a(int color) {
        this.f69870c = color;
        this.f69869b.setColor(color);
        postInvalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f69870c == 0) {
            return;
        }
        this.f69871d.moveTo(getMeasuredWidth() / 4.0f, getMeasuredHeight() / 2.0f);
        this.f69871d.lineTo(getMeasuredWidth() / 2.0f, (getMeasuredHeight() * 3) / 4.0f);
        this.f69871d.lineTo(getMeasuredWidth(), getMeasuredHeight() / 4.0f);
        canvas.drawPath(this.f69871d, this.f69869b);
    }

    public CheckView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CheckView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f69870c = 0;
        this.f69871d = new Path();
        Paint paint = new Paint(1);
        this.f69869b = paint;
        paint.setStrokeWidth(h.p(context, 2.0f));
        this.f69869b.setStyle(Paint.Style.STROKE);
    }
}
