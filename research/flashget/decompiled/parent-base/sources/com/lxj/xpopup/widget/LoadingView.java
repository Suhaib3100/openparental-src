package com.lxj.xpopup.widget;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.lxj.xpopup.util.h;

/* loaded from: classes6.dex */
public class LoadingView extends View {

    /* renamed from: b, reason: collision with root package name */
    private Paint f69872b;

    /* renamed from: c, reason: collision with root package name */
    private float f69873c;

    /* renamed from: d, reason: collision with root package name */
    private float f69874d;

    /* renamed from: e, reason: collision with root package name */
    private float f69875e;

    /* renamed from: f, reason: collision with root package name */
    private ArgbEvaluator f69876f;

    /* renamed from: g, reason: collision with root package name */
    private int f69877g;

    /* renamed from: h, reason: collision with root package name */
    private int f69878h;

    /* renamed from: i, reason: collision with root package name */
    int f69879i;

    /* renamed from: j, reason: collision with root package name */
    float f69880j;

    /* renamed from: k, reason: collision with root package name */
    int f69881k;

    /* renamed from: l, reason: collision with root package name */
    float f69882l;

    /* renamed from: m, reason: collision with root package name */
    float f69883m;

    /* renamed from: n, reason: collision with root package name */
    float f69884n;

    /* renamed from: o, reason: collision with root package name */
    float f69885o;

    /* renamed from: p, reason: collision with root package name */
    private Runnable f69886p;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingView loadingView = LoadingView.this;
            loadingView.f69881k++;
            loadingView.postInvalidate(0, 0, loadingView.getMeasuredWidth(), LoadingView.this.getMeasuredHeight());
            LoadingView loadingView2 = LoadingView.this;
            loadingView2.postDelayed(loadingView2.f69886p, 80L);
        }
    }

    public LoadingView(Context context) {
        this(context, null);
    }

    public void b() {
        removeCallbacks(this.f69886p);
        postDelayed(this.f69886p, 80L);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f69886p);
    }

    @Override // android.view.View
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        for (int i4 = this.f69879i - 1; i4 >= 0; i4--) {
            int abs = Math.abs(this.f69881k + i4);
            this.f69872b.setColor(((Integer) this.f69876f.evaluate((((abs % r2) + 1) * 1.0f) / this.f69879i, Integer.valueOf(this.f69877g), Integer.valueOf(this.f69878h))).intValue());
            float f4 = this.f69884n;
            float f5 = this.f69883m;
            canvas.drawLine(f4, f5, this.f69885o, f5, this.f69872b);
            canvas.drawCircle(this.f69884n, this.f69883m, this.f69875e / 2.0f, this.f69872b);
            canvas.drawCircle(this.f69885o, this.f69883m, this.f69875e / 2.0f, this.f69872b);
            canvas.rotate(this.f69880j, this.f69882l, this.f69883m);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int w4, int h4, int oldw, int oldh) {
        super.onSizeChanged(w4, h4, oldw, oldh);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        this.f69873c = measuredWidth;
        this.f69874d = measuredWidth / 2.5f;
        this.f69882l = getMeasuredWidth() / 2.0f;
        this.f69883m = getMeasuredHeight() / 2.0f;
        float p4 = h.p(getContext(), 2.0f);
        this.f69875e = p4;
        this.f69872b.setStrokeWidth(p4);
        float f4 = this.f69882l + this.f69874d;
        this.f69884n = f4;
        this.f69885o = (this.f69873c / 3.0f) + f4;
    }

    public LoadingView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LoadingView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f69875e = 2.0f;
        this.f69876f = new ArgbEvaluator();
        this.f69877g = Color.parseColor(ProtectedSandApp.s("ᠦ\u0001"));
        this.f69878h = Color.parseColor(ProtectedSandApp.s("ᠧ\u0001"));
        this.f69879i = 10;
        this.f69880j = 360.0f / 10;
        this.f69881k = 0;
        this.f69886p = new a();
        this.f69872b = new Paint(1);
        float p4 = h.p(context, this.f69875e);
        this.f69875e = p4;
        this.f69872b.setStrokeWidth(p4);
    }
}
