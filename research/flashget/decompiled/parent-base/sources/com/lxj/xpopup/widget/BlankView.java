package com.lxj.xpopup.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public class BlankView extends View {

    /* renamed from: b, reason: collision with root package name */
    private Paint f69838b;

    /* renamed from: c, reason: collision with root package name */
    private RectF f69839c;

    /* renamed from: d, reason: collision with root package name */
    public int f69840d;

    /* renamed from: e, reason: collision with root package name */
    public int f69841e;

    /* renamed from: f, reason: collision with root package name */
    public int f69842f;

    public BlankView(Context context) {
        super(context);
        this.f69838b = new Paint();
        this.f69839c = null;
        this.f69840d = 0;
        this.f69841e = -1;
        this.f69842f = Color.parseColor(ProtectedSandApp.s("᠅\u0001"));
    }

    private void a() {
        this.f69838b.setAntiAlias(true);
        this.f69838b.setStrokeWidth(1.0f);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f69838b.setColor(this.f69841e);
        RectF rectF = this.f69839c;
        int i4 = this.f69840d;
        canvas.drawRoundRect(rectF, i4, i4, this.f69838b);
        this.f69838b.setStyle(Paint.Style.STROKE);
        this.f69838b.setColor(this.f69842f);
        RectF rectF2 = this.f69839c;
        int i5 = this.f69840d;
        canvas.drawRoundRect(rectF2, i5, i5, this.f69838b);
        this.f69838b.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w4, int h4, int oldw, int oldh) {
        super.onSizeChanged(w4, h4, oldw, oldh);
        this.f69839c = new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public BlankView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f69838b = new Paint();
        this.f69839c = null;
        this.f69840d = 0;
        this.f69841e = -1;
        this.f69842f = Color.parseColor(ProtectedSandApp.s("᠅\u0001"));
        a();
    }

    public BlankView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f69838b = new Paint();
        this.f69839c = null;
        this.f69840d = 0;
        this.f69841e = -1;
        this.f69842f = Color.parseColor(ProtectedSandApp.s("᠅\u0001"));
        a();
    }
}
