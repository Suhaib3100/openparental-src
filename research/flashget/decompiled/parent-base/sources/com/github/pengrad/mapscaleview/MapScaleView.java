package com.github.pengrad.mapscaleview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.l;

/* loaded from: classes5.dex */
public class MapScaleView extends View {

    /* renamed from: b, reason: collision with root package name */
    private final c f50901b;

    /* renamed from: c, reason: collision with root package name */
    private final b f50902c;

    /* renamed from: d, reason: collision with root package name */
    private final int f50903d;

    /* renamed from: e, reason: collision with root package name */
    private a f50904e;

    private enum a {
        METERS_ONLY,
        MILES_ONLY,
        BOTH
    }

    public MapScaleView(Context context) {
        this(context, null);
    }

    private int a() {
        return this.f50902c.b();
    }

    private int b() {
        return this.f50903d;
    }

    private int c(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        return mode == 1073741824 ? size : mode == Integer.MIN_VALUE ? Math.min(i4, size) : i4;
    }

    private void p() {
        e d5;
        e eVar = null;
        if (this.f50904e == a.MILES_ONLY) {
            d5 = this.f50901b.d(false);
        } else {
            d5 = this.f50901b.d(true);
            if (this.f50904e == a.BOTH) {
                eVar = this.f50901b.d(false);
            }
        }
        this.f50902c.g(new f(d5, eVar));
        invalidate();
        requestLayout();
    }

    public void d() {
        this.f50904e = a.BOTH;
        p();
    }

    public void e() {
        this.f50904e = a.METERS_ONLY;
        p();
    }

    public void f() {
        this.f50904e = a.MILES_ONLY;
        p();
    }

    public void g(@l int i4) {
        this.f50902c.d(i4);
        invalidate();
    }

    public void h(boolean z4) {
        this.f50902c.e(z4);
        invalidate();
    }

    @Deprecated
    public void i(boolean z4) {
        if (z4) {
            f();
        } else {
            d();
        }
    }

    public void j(boolean z4) {
        this.f50902c.f(z4);
        invalidate();
    }

    public void k(float f4) {
        this.f50902c.h(f4);
        invalidate();
        requestLayout();
    }

    public void l(Typeface typeface) {
        this.f50902c.i(typeface);
        invalidate();
        requestLayout();
    }

    public void m(float f4) {
        this.f50902c.j(f4);
        invalidate();
        requestLayout();
    }

    public void n(int i4) {
        this.f50901b.b(i4);
        p();
    }

    public void o(float f4, double d5) {
        this.f50901b.a(f4, d5);
        p();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f50902c.a(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int c5 = c(b(), i4);
        int c6 = c(a(), i5);
        if (this.f50901b.e(c5)) {
            p();
        }
        if (View.MeasureSpec.getMode(i4) != 1073741824) {
            c5 = this.f50902c.c();
        }
        this.f50902c.k(c5);
        setMeasuredDimension(c5, c6);
    }

    public MapScaleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MapScaleView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f50904e = a.BOTH;
        float f4 = getResources().getDisplayMetrics().density;
        this.f50901b = new c(f4);
        g gVar = new g(context, attributeSet);
        this.f50902c = new b(gVar.f51740b, gVar.f51741c, gVar.f51742d, f4, gVar.f51744f, gVar.f51745g);
        this.f50903d = gVar.f51739a;
        if (gVar.f51743e) {
            this.f50904e = a.MILES_ONLY;
        }
    }
}
