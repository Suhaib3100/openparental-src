package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;

@SuppressLint({"ParcelCreator"})
/* loaded from: classes5.dex */
public class BubbleEntry extends Entry {

    /* renamed from: f, reason: collision with root package name */
    private float f50346f;

    public BubbleEntry(float f4, float f5, float f6) {
        super(f4, f5);
        this.f50346f = f6;
    }

    @Override // com.github.mikephil.charting.data.Entry
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public BubbleEntry g() {
        return new BubbleEntry(j(), c(), this.f50346f, a());
    }

    public float o() {
        return this.f50346f;
    }

    public void p(float f4) {
        this.f50346f = f4;
    }

    public BubbleEntry(float f4, float f5, float f6, Object obj) {
        super(f4, f5, obj);
        this.f50346f = f6;
    }

    public BubbleEntry(float f4, float f5, float f6, Drawable drawable) {
        super(f4, f5, drawable);
        this.f50346f = f6;
    }

    public BubbleEntry(float f4, float f5, float f6, Drawable drawable, Object obj) {
        super(f4, f5, drawable, obj);
        this.f50346f = f6;
    }
}
