package com.lxj.xpopup.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* loaded from: classes5.dex */
public class BlankView extends View {

    /* renamed from: o, reason: collision with root package name */
    private Paint f21361o;

    /* renamed from: p, reason: collision with root package name */
    private RectF f21362p;

    /* renamed from: q, reason: collision with root package name */
    public int f21363q;

    /* renamed from: r, reason: collision with root package name */
    public int f21364r;

    /* renamed from: s, reason: collision with root package name */
    public int f21365s;

    public BlankView(Context context) {
        super(context);
        this.f21361o = new Paint();
        this.f21362p = null;
        this.f21363q = 0;
        this.f21364r = -1;
        this.f21365s = Color.parseColor(ProtectedSandApp.s("㖃"));
    }

    private void a() {
        this.f21361o.setAntiAlias(true);
        this.f21361o.setStrokeWidth(1.0f);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f21361o.setColor(this.f21364r);
        RectF rectF = this.f21362p;
        int i5 = this.f21363q;
        canvas.drawRoundRect(rectF, i5, i5, this.f21361o);
        this.f21361o.setStyle(Paint.Style.STROKE);
        this.f21361o.setColor(this.f21365s);
        RectF rectF2 = this.f21362p;
        int i6 = this.f21363q;
        canvas.drawRoundRect(rectF2, i6, i6, this.f21361o);
        this.f21361o.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w5, int h5, int oldw, int oldh) {
        super.onSizeChanged(w5, h5, oldw, oldh);
        this.f21362p = new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public BlankView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f21361o = new Paint();
        this.f21362p = null;
        this.f21363q = 0;
        this.f21364r = -1;
        this.f21365s = Color.parseColor(ProtectedSandApp.s("㖄"));
        a();
    }

    public BlankView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f21361o = new Paint();
        this.f21362p = null;
        this.f21363q = 0;
        this.f21364r = -1;
        this.f21365s = Color.parseColor(ProtectedSandApp.s("㖅"));
        a();
    }
}
