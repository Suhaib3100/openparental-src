package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;

@SuppressLint({"ParcelCreator"})
/* loaded from: classes5.dex */
public class CandleEntry extends Entry {

    /* renamed from: f, reason: collision with root package name */
    private float f50347f;

    /* renamed from: g, reason: collision with root package name */
    private float f50348g;

    /* renamed from: h, reason: collision with root package name */
    private float f50349h;

    /* renamed from: i, reason: collision with root package name */
    private float f50350i;

    public CandleEntry(float f4, float f5, float f6, float f7, float f10) {
        super(f4, (f5 + f6) / 2.0f);
        this.f50347f = f5;
        this.f50348g = f6;
        this.f50350i = f7;
        this.f50349h = f10;
    }

    @Override // com.github.mikephil.charting.data.f
    public float c() {
        return super.c();
    }

    @Override // com.github.mikephil.charting.data.Entry
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public CandleEntry g() {
        return new CandleEntry(j(), this.f50347f, this.f50348g, this.f50350i, this.f50349h, a());
    }

    public float o() {
        return Math.abs(this.f50350i - this.f50349h);
    }

    public float p() {
        return this.f50349h;
    }

    public float r() {
        return this.f50347f;
    }

    public float t() {
        return this.f50348g;
    }

    public float u() {
        return this.f50350i;
    }

    public float v() {
        return Math.abs(this.f50347f - this.f50348g);
    }

    public void w(float f4) {
        this.f50349h = f4;
    }

    public void x(float f4) {
        this.f50347f = f4;
    }

    public void y(float f4) {
        this.f50348g = f4;
    }

    public void z(float f4) {
        this.f50350i = f4;
    }

    public CandleEntry(float f4, float f5, float f6, float f7, float f10, Object obj) {
        super(f4, (f5 + f6) / 2.0f, obj);
        this.f50347f = f5;
        this.f50348g = f6;
        this.f50350i = f7;
        this.f50349h = f10;
    }

    public CandleEntry(float f4, float f5, float f6, float f7, float f10, Drawable drawable) {
        super(f4, (f5 + f6) / 2.0f, drawable);
        this.f50347f = f5;
        this.f50348g = f6;
        this.f50350i = f7;
        this.f50349h = f10;
    }

    public CandleEntry(float f4, float f5, float f6, float f7, float f10, Drawable drawable, Object obj) {
        super(f4, (f5 + f6) / 2.0f, drawable, obj);
        this.f50347f = f5;
        this.f50348g = f6;
        this.f50350i = f7;
        this.f50349h = f10;
    }
}
