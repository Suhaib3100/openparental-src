package com.github.mikephil.charting.components;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;

/* compiled from: LimitLine.java */
/* loaded from: classes5.dex */
public class g extends b {

    /* renamed from: g, reason: collision with root package name */
    private float f50325g;

    /* renamed from: h, reason: collision with root package name */
    private float f50326h;

    /* renamed from: i, reason: collision with root package name */
    private int f50327i;

    /* renamed from: j, reason: collision with root package name */
    private Paint.Style f50328j;

    /* renamed from: k, reason: collision with root package name */
    private String f50329k;

    /* renamed from: l, reason: collision with root package name */
    private DashPathEffect f50330l;

    /* renamed from: m, reason: collision with root package name */
    private a f50331m;

    /* compiled from: LimitLine.java */
    public enum a {
        LEFT_TOP,
        LEFT_BOTTOM,
        RIGHT_TOP,
        RIGHT_BOTTOM
    }

    public g(float f4) {
        this.f50325g = 0.0f;
        this.f50326h = 2.0f;
        this.f50327i = Color.rgb(237, 91, 91);
        this.f50328j = Paint.Style.FILL_AND_STROKE;
        this.f50329k = "";
        this.f50330l = null;
        this.f50331m = a.RIGHT_TOP;
        this.f50325g = f4;
    }

    public void A(Paint.Style style) {
        this.f50328j = style;
    }

    public void m() {
        this.f50330l = null;
    }

    public void n(float f4, float f5, float f6) {
        this.f50330l = new DashPathEffect(new float[]{f4, f5}, f6);
    }

    public DashPathEffect o() {
        return this.f50330l;
    }

    public String p() {
        return this.f50329k;
    }

    public a q() {
        return this.f50331m;
    }

    public float r() {
        return this.f50325g;
    }

    public int s() {
        return this.f50327i;
    }

    public float t() {
        return this.f50326h;
    }

    public Paint.Style u() {
        return this.f50328j;
    }

    public boolean v() {
        return this.f50330l != null;
    }

    public void w(String str) {
        this.f50329k = str;
    }

    public void x(a aVar) {
        this.f50331m = aVar;
    }

    public void y(int i4) {
        this.f50327i = i4;
    }

    public void z(float f4) {
        if (f4 < 0.2f) {
            f4 = 0.2f;
        }
        if (f4 > 12.0f) {
            f4 = 12.0f;
        }
        this.f50326h = com.github.mikephil.charting.utils.k.e(f4);
    }

    public g(float f4, String str) {
        this.f50325g = 0.0f;
        this.f50326h = 2.0f;
        this.f50327i = Color.rgb(237, 91, 91);
        this.f50328j = Paint.Style.FILL_AND_STROKE;
        this.f50329k = "";
        this.f50330l = null;
        this.f50331m = a.RIGHT_TOP;
        this.f50325g = f4;
        this.f50329k = str;
    }
}
