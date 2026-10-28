package com.jcodecraeer.xrecyclerview.progressindicator;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.jcodecraeer.xrecyclerview.g;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.a0;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.b;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.b0;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.c;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.c0;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.d;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.e;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.f;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.g;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.h;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.i;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.j;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.k;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.l;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.m;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.n;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.o;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.p;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.q;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.r;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.s;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.t;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.u;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.v;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.w;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.x;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.y;
import com.jcodecraeer.xrecyclerview.progressindicator.indicator.z;

/* loaded from: classes6.dex */
public class AVLoadingIndicatorView extends View {
    public static final int A = 20;
    public static final int B = 21;
    public static final int C = 22;
    public static final int D = 23;
    public static final int E = 24;
    public static final int F = 25;
    public static final int G = 26;
    public static final int H = 27;
    public static final int I = 30;

    /* renamed from: g, reason: collision with root package name */
    public static final int f66500g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f66501h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f66502i = 2;

    /* renamed from: j, reason: collision with root package name */
    public static final int f66503j = 3;

    /* renamed from: k, reason: collision with root package name */
    public static final int f66504k = 4;

    /* renamed from: l, reason: collision with root package name */
    public static final int f66505l = 5;

    /* renamed from: m, reason: collision with root package name */
    public static final int f66506m = 6;

    /* renamed from: n, reason: collision with root package name */
    public static final int f66507n = 7;

    /* renamed from: o, reason: collision with root package name */
    public static final int f66508o = 8;

    /* renamed from: p, reason: collision with root package name */
    public static final int f66509p = 9;

    /* renamed from: q, reason: collision with root package name */
    public static final int f66510q = 10;

    /* renamed from: r, reason: collision with root package name */
    public static final int f66511r = 11;

    /* renamed from: s, reason: collision with root package name */
    public static final int f66512s = 12;

    /* renamed from: t, reason: collision with root package name */
    public static final int f66513t = 13;

    /* renamed from: u, reason: collision with root package name */
    public static final int f66514u = 14;

    /* renamed from: v, reason: collision with root package name */
    public static final int f66515v = 15;

    /* renamed from: w, reason: collision with root package name */
    public static final int f66516w = 16;

    /* renamed from: x, reason: collision with root package name */
    public static final int f66517x = 17;

    /* renamed from: y, reason: collision with root package name */
    public static final int f66518y = 18;

    /* renamed from: z, reason: collision with root package name */
    public static final int f66519z = 19;

    /* renamed from: b, reason: collision with root package name */
    int f66520b;

    /* renamed from: c, reason: collision with root package name */
    int f66521c;

    /* renamed from: d, reason: collision with root package name */
    Paint f66522d;

    /* renamed from: e, reason: collision with root package name */
    s f66523e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f66524f;

    public @interface a {
    }

    public AVLoadingIndicatorView(Context context) {
        super(context);
        f(null, 0);
    }

    private void b() {
        switch (this.f66520b) {
            case 0:
                this.f66523e = new g();
                break;
            case 1:
                this.f66523e = new f();
                break;
            case 2:
                this.f66523e = new b();
                break;
            case 3:
                this.f66523e = new d();
                break;
            case 4:
                this.f66523e = new b0();
                break;
            case 5:
                this.f66523e = new c();
                break;
            case 6:
                this.f66523e = new h();
                break;
            case 7:
                this.f66523e = new j();
                break;
            case 8:
                this.f66523e = new t();
                break;
            case 9:
                this.f66523e = new r();
                break;
            case 10:
                this.f66523e = new q();
                break;
            case 11:
                this.f66523e = new p();
                break;
            case 12:
                this.f66523e = new k();
                break;
            case 13:
                this.f66523e = new u();
                break;
            case 14:
                this.f66523e = new v();
                break;
            case 15:
                this.f66523e = new l();
                break;
            case 16:
                this.f66523e = new i();
                break;
            case 17:
                this.f66523e = new com.jcodecraeer.xrecyclerview.progressindicator.indicator.a();
                break;
            case 18:
                this.f66523e = new w();
                break;
            case 19:
                this.f66523e = new x();
                break;
            case 20:
                this.f66523e = new m();
                break;
            case 21:
                this.f66523e = new n();
                break;
            case 22:
                this.f66523e = new o();
                break;
            case 23:
                this.f66523e = new y();
                break;
            case 24:
                this.f66523e = new c0();
                break;
            case 25:
                this.f66523e = new z();
                break;
            case 26:
                this.f66523e = new e();
                break;
            case 27:
                this.f66523e = new a0();
                break;
        }
        this.f66523e.k(this);
    }

    private int d(int i4) {
        return ((int) getContext().getResources().getDisplayMetrics().density) * i4;
    }

    private void f(AttributeSet attributeSet, int i4) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.o.f66155a);
        this.f66520b = obtainStyledAttributes.getInt(g.o.f66168b, 0);
        this.f66521c = obtainStyledAttributes.getColor(g.o.f66182c, -1);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f66522d = paint;
        paint.setColor(this.f66521c);
        this.f66522d.setStyle(Paint.Style.FILL);
        this.f66522d.setAntiAlias(true);
        b();
    }

    private int g(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        return mode == 1073741824 ? size : mode == Integer.MIN_VALUE ? Math.min(i4, size) : i4;
    }

    void a() {
        s sVar = this.f66523e;
        if (sVar == null) {
            return;
        }
        sVar.g();
    }

    public void c() {
        this.f66524f = true;
        s sVar = this.f66523e;
        if (sVar != null) {
            sVar.b();
            this.f66523e = null;
        }
        this.f66522d = null;
    }

    void e(Canvas canvas) {
        s sVar = this.f66523e;
        if (sVar == null) {
            return;
        }
        sVar.c(canvas, this.f66522d);
    }

    public void h(int i4) {
        this.f66521c = i4;
        this.f66522d.setColor(i4);
        invalidate();
    }

    public void i(int i4) {
        this.f66520b = i4;
        b();
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        s sVar = this.f66523e;
        if (sVar == null) {
            return;
        }
        sVar.j(s.b.START);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s sVar = this.f66523e;
        if (sVar == null) {
            return;
        }
        sVar.j(s.b.CANCEL);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        e(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        if (this.f66524f) {
            return;
        }
        this.f66524f = true;
        a();
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        setMeasuredDimension(g(d(30), i4), g(d(30), i5));
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        if (getVisibility() != i4) {
            super.setVisibility(i4);
            s sVar = this.f66523e;
            if (sVar == null) {
                return;
            }
            if (i4 == 8 || i4 == 4) {
                sVar.j(s.b.END);
            } else {
                sVar.j(s.b.START);
            }
        }
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f(attributeSet, 0);
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        f(attributeSet, i4);
    }

    @TargetApi(21)
    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        f(attributeSet, i4);
    }
}
