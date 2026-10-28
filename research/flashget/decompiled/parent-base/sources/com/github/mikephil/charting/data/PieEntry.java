package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;

@SuppressLint({"ParcelCreator"})
/* loaded from: classes5.dex */
public class PieEntry extends Entry {

    /* renamed from: f, reason: collision with root package name */
    private String f50352f;

    public PieEntry(float f4) {
        super(0.0f, f4);
    }

    @Override // com.github.mikephil.charting.data.Entry
    @Deprecated
    public float j() {
        return super.j();
    }

    @Override // com.github.mikephil.charting.data.Entry
    @Deprecated
    public void k(float f4) {
        super.k(f4);
    }

    @Override // com.github.mikephil.charting.data.Entry
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public PieEntry g() {
        return new PieEntry(c(), this.f50352f, a());
    }

    public String o() {
        return this.f50352f;
    }

    public float p() {
        return c();
    }

    public void r(String str) {
        this.f50352f = str;
    }

    public PieEntry(float f4, Object obj) {
        super(0.0f, f4, obj);
    }

    public PieEntry(float f4, Drawable drawable) {
        super(0.0f, f4, drawable);
    }

    public PieEntry(float f4, Drawable drawable, Object obj) {
        super(0.0f, f4, drawable, obj);
    }

    public PieEntry(float f4, String str) {
        super(0.0f, f4);
        this.f50352f = str;
    }

    public PieEntry(float f4, String str, Object obj) {
        super(0.0f, f4, obj);
        this.f50352f = str;
    }

    public PieEntry(float f4, String str, Drawable drawable) {
        super(0.0f, f4, drawable);
        this.f50352f = str;
    }

    public PieEntry(float f4, String str, Drawable drawable, Object obj) {
        super(0.0f, f4, drawable, obj);
        this.f50352f = str;
    }
}
