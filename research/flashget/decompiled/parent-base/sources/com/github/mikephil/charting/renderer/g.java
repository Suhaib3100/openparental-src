package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/* compiled from: DataRenderer.java */
/* loaded from: classes5.dex */
public abstract class g extends o {

    /* renamed from: b, reason: collision with root package name */
    protected com.github.mikephil.charting.animation.a f50535b;

    /* renamed from: c, reason: collision with root package name */
    protected Paint f50536c;

    /* renamed from: d, reason: collision with root package name */
    protected Paint f50537d;

    /* renamed from: e, reason: collision with root package name */
    protected Paint f50538e;

    /* renamed from: f, reason: collision with root package name */
    protected Paint f50539f;

    public g(com.github.mikephil.charting.animation.a aVar, com.github.mikephil.charting.utils.l lVar) {
        super(lVar);
        this.f50535b = aVar;
        Paint paint = new Paint(1);
        this.f50536c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f50538e = new Paint(4);
        Paint paint2 = new Paint(1);
        this.f50539f = paint2;
        paint2.setColor(Color.rgb(63, 63, 63));
        this.f50539f.setTextAlign(Paint.Align.CENTER);
        this.f50539f.setTextSize(com.github.mikephil.charting.utils.k.e(9.0f));
        Paint paint3 = new Paint(1);
        this.f50537d = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.f50537d.setStrokeWidth(2.0f);
        this.f50537d.setColor(Color.rgb(255, 187, 115));
    }

    protected void a(f8.e eVar) {
        this.f50539f.setTypeface(eVar.B());
        this.f50539f.setTextSize(eVar.z0());
    }

    public abstract void b(Canvas canvas);

    public abstract void c(Canvas canvas);

    public abstract void d(Canvas canvas, com.github.mikephil.charting.highlight.d[] dVarArr);

    public abstract void e(Canvas canvas, String str, float f4, float f5, int i4);

    public abstract void f(Canvas canvas);

    public Paint g() {
        return this.f50537d;
    }

    public Paint h() {
        return this.f50536c;
    }

    public Paint i() {
        return this.f50539f;
    }

    public abstract void j();

    protected boolean k(e8.e eVar) {
        return ((float) eVar.b().r()) < this.f50589a.w() * ((float) eVar.m());
    }
}
