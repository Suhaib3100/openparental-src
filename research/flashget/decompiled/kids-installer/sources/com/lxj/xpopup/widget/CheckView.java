package com.lxj.xpopup.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.lxj.xpopup.util.h;

/* loaded from: classes5.dex */
public class CheckView extends View {

    /* renamed from: o, reason: collision with root package name */
    Paint f21382o;

    /* renamed from: p, reason: collision with root package name */
    int f21383p;

    /* renamed from: q, reason: collision with root package name */
    Path f21384q;

    public CheckView(Context context) {
        this(context, null);
    }

    public void a(int color) {
        this.f21383p = color;
        this.f21382o.setColor(color);
        postInvalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f21383p == 0) {
            return;
        }
        this.f21384q.moveTo(getMeasuredWidth() / 4.0f, getMeasuredHeight() / 2.0f);
        this.f21384q.lineTo(getMeasuredWidth() / 2.0f, (getMeasuredHeight() * 3) / 4.0f);
        this.f21384q.lineTo(getMeasuredWidth(), getMeasuredHeight() / 4.0f);
        canvas.drawPath(this.f21384q, this.f21382o);
    }

    public CheckView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CheckView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f21383p = 0;
        this.f21384q = new Path();
        Paint paint = new Paint(1);
        this.f21382o = paint;
        paint.setStrokeWidth(h.p(context, 2.0f));
        this.f21382o.setStyle(Paint.Style.STROKE);
    }
}
