package com.lxj.xpopup.widget;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.lxj.xpopup.util.h;

/* loaded from: classes5.dex */
public class LoadingView extends View {
    float A;
    float B;
    private Runnable C;

    /* renamed from: o, reason: collision with root package name */
    private Paint f21385o;

    /* renamed from: p, reason: collision with root package name */
    private float f21386p;

    /* renamed from: q, reason: collision with root package name */
    private float f21387q;

    /* renamed from: r, reason: collision with root package name */
    private float f21388r;

    /* renamed from: s, reason: collision with root package name */
    private ArgbEvaluator f21389s;

    /* renamed from: t, reason: collision with root package name */
    private int f21390t;

    /* renamed from: u, reason: collision with root package name */
    private int f21391u;

    /* renamed from: v, reason: collision with root package name */
    int f21392v;

    /* renamed from: w, reason: collision with root package name */
    float f21393w;

    /* renamed from: x, reason: collision with root package name */
    int f21394x;

    /* renamed from: y, reason: collision with root package name */
    float f21395y;

    /* renamed from: z, reason: collision with root package name */
    float f21396z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingView loadingView = LoadingView.this;
            loadingView.f21394x++;
            loadingView.postInvalidate(0, 0, loadingView.getMeasuredWidth(), LoadingView.this.getMeasuredHeight());
            LoadingView loadingView2 = LoadingView.this;
            loadingView2.postDelayed(loadingView2.C, 80L);
        }
    }

    public LoadingView(Context context) {
        this(context, null);
    }

    public void b() {
        removeCallbacks(this.C);
        postDelayed(this.C, 80L);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.C);
    }

    @Override // android.view.View
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        for (int i5 = this.f21392v - 1; i5 >= 0; i5--) {
            int abs = Math.abs(this.f21394x + i5);
            this.f21385o.setColor(((Integer) this.f21389s.evaluate((((abs % r2) + 1) * 1.0f) / this.f21392v, Integer.valueOf(this.f21390t), Integer.valueOf(this.f21391u))).intValue());
            float f6 = this.A;
            float f7 = this.f21396z;
            canvas.drawLine(f6, f7, this.B, f7, this.f21385o);
            canvas.drawCircle(this.A, this.f21396z, this.f21388r / 2.0f, this.f21385o);
            canvas.drawCircle(this.B, this.f21396z, this.f21388r / 2.0f, this.f21385o);
            canvas.rotate(this.f21393w, this.f21395y, this.f21396z);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int w5, int h5, int oldw, int oldh) {
        super.onSizeChanged(w5, h5, oldw, oldh);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        this.f21386p = measuredWidth;
        this.f21387q = measuredWidth / 2.5f;
        this.f21395y = getMeasuredWidth() / 2.0f;
        this.f21396z = getMeasuredHeight() / 2.0f;
        float p5 = h.p(getContext(), 2.0f);
        this.f21388r = p5;
        this.f21385o.setStrokeWidth(p5);
        float f6 = this.f21395y + this.f21387q;
        this.A = f6;
        this.B = (this.f21386p / 3.0f) + f6;
    }

    public LoadingView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LoadingView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f21388r = 2.0f;
        this.f21389s = new ArgbEvaluator();
        this.f21390t = Color.parseColor(ProtectedSandApp.s("㗁"));
        this.f21391u = Color.parseColor(ProtectedSandApp.s("㗂"));
        this.f21392v = 10;
        this.f21393w = 360.0f / 10;
        this.f21394x = 0;
        this.C = new a();
        this.f21385o = new Paint(1);
        float p5 = h.p(context, this.f21388r);
        this.f21388r = p5;
        this.f21385o.setStrokeWidth(p5);
    }
}
