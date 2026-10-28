package com.github.mikephil.charting.listener;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.github.mikephil.charting.charts.Chart;

/* compiled from: ChartTouchListener.java */
/* loaded from: classes5.dex */
public abstract class b<T extends Chart<?>> extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {

    /* renamed from: g, reason: collision with root package name */
    protected static final int f50484g = 0;

    /* renamed from: h, reason: collision with root package name */
    protected static final int f50485h = 1;

    /* renamed from: i, reason: collision with root package name */
    protected static final int f50486i = 2;

    /* renamed from: j, reason: collision with root package name */
    protected static final int f50487j = 3;

    /* renamed from: k, reason: collision with root package name */
    protected static final int f50488k = 4;

    /* renamed from: l, reason: collision with root package name */
    protected static final int f50489l = 5;

    /* renamed from: m, reason: collision with root package name */
    protected static final int f50490m = 6;

    /* renamed from: b, reason: collision with root package name */
    protected a f50491b = a.NONE;

    /* renamed from: c, reason: collision with root package name */
    protected int f50492c = 0;

    /* renamed from: d, reason: collision with root package name */
    protected com.github.mikephil.charting.highlight.d f50493d;

    /* renamed from: e, reason: collision with root package name */
    protected GestureDetector f50494e;

    /* renamed from: f, reason: collision with root package name */
    protected T f50495f;

    /* compiled from: ChartTouchListener.java */
    public enum a {
        NONE,
        DRAG,
        X_ZOOM,
        Y_ZOOM,
        PINCH_ZOOM,
        ROTATE,
        SINGLE_TAP,
        DOUBLE_TAP,
        LONG_PRESS,
        FLING
    }

    public b(T t4) {
        this.f50495f = t4;
        this.f50494e = new GestureDetector(t4.getContext(), this);
    }

    protected static float a(float f4, float f5, float f6, float f7) {
        float f10 = f4 - f5;
        float f11 = f6 - f7;
        return (float) Math.sqrt((f11 * f11) + (f10 * f10));
    }

    public void b(MotionEvent motionEvent) {
        c j02 = this.f50495f.j0();
        if (j02 != null) {
            j02.e(motionEvent, this.f50491b);
        }
    }

    public a c() {
        return this.f50491b;
    }

    public int d() {
        return this.f50492c;
    }

    protected void e(com.github.mikephil.charting.highlight.d dVar, MotionEvent motionEvent) {
        if (dVar == null || dVar.a(this.f50493d)) {
            this.f50495f.w0(null, true);
            this.f50493d = null;
        } else {
            this.f50495f.w0(dVar, true);
            this.f50493d = dVar;
        }
    }

    public void f(com.github.mikephil.charting.highlight.d dVar) {
        this.f50493d = dVar;
    }

    public void g(MotionEvent motionEvent) {
        c j02 = this.f50495f.j0();
        if (j02 != null) {
            j02.a(motionEvent, this.f50491b);
        }
    }
}
