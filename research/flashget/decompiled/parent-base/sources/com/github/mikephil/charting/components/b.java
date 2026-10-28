package com.github.mikephil.charting.components;

import android.graphics.Typeface;
import androidx.core.view.x1;

/* compiled from: ComponentBase.java */
/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    protected boolean f50289a = true;

    /* renamed from: b, reason: collision with root package name */
    protected float f50290b = 5.0f;

    /* renamed from: c, reason: collision with root package name */
    protected float f50291c = 5.0f;

    /* renamed from: d, reason: collision with root package name */
    protected Typeface f50292d = null;

    /* renamed from: e, reason: collision with root package name */
    protected float f50293e = com.github.mikephil.charting.utils.k.e(10.0f);

    /* renamed from: f, reason: collision with root package name */
    protected int f50294f = x1.f27484y;

    public int a() {
        return this.f50294f;
    }

    public float b() {
        return this.f50293e;
    }

    public Typeface c() {
        return this.f50292d;
    }

    public float d() {
        return this.f50290b;
    }

    public float e() {
        return this.f50291c;
    }

    public boolean f() {
        return this.f50289a;
    }

    public void g(boolean z4) {
        this.f50289a = z4;
    }

    public void h(int i4) {
        this.f50294f = i4;
    }

    public void i(float f4) {
        if (f4 > 24.0f) {
            f4 = 24.0f;
        }
        if (f4 < 6.0f) {
            f4 = 6.0f;
        }
        this.f50293e = com.github.mikephil.charting.utils.k.e(f4);
    }

    public void j(Typeface typeface) {
        this.f50292d = typeface;
    }

    public void k(float f4) {
        this.f50290b = com.github.mikephil.charting.utils.k.e(f4);
    }

    public void l(float f4) {
        this.f50291c = com.github.mikephil.charting.utils.k.e(f4);
    }
}
