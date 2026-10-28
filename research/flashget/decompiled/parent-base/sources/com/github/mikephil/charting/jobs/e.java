package com.github.mikephil.charting.jobs;

import android.view.View;
import com.github.mikephil.charting.utils.h;
import com.github.mikephil.charting.utils.i;
import com.github.mikephil.charting.utils.l;

/* compiled from: ViewPortJob.java */
/* loaded from: classes5.dex */
public abstract class e extends h.a implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    protected float[] f50460d = new float[2];

    /* renamed from: e, reason: collision with root package name */
    protected l f50461e;

    /* renamed from: f, reason: collision with root package name */
    protected float f50462f;

    /* renamed from: g, reason: collision with root package name */
    protected float f50463g;

    /* renamed from: h, reason: collision with root package name */
    protected i f50464h;

    /* renamed from: i, reason: collision with root package name */
    protected View f50465i;

    public e(l lVar, float f4, float f5, i iVar, View view) {
        this.f50461e = lVar;
        this.f50462f = f4;
        this.f50463g = f5;
        this.f50464h = iVar;
        this.f50465i = view;
    }

    public float b() {
        return this.f50462f;
    }

    public float c() {
        return this.f50463g;
    }
}
