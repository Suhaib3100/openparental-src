package com.github.mikephil.charting.components;

import android.graphics.Paint;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Description.java */
/* loaded from: classes5.dex */
public class c extends b {

    /* renamed from: h, reason: collision with root package name */
    private com.github.mikephil.charting.utils.g f50296h;

    /* renamed from: g, reason: collision with root package name */
    private String f50295g = ProtectedSandApp.s("쏹");

    /* renamed from: i, reason: collision with root package name */
    private Paint.Align f50297i = Paint.Align.RIGHT;

    public c() {
        this.f50293e = com.github.mikephil.charting.utils.k.e(8.0f);
    }

    public com.github.mikephil.charting.utils.g m() {
        return this.f50296h;
    }

    public String n() {
        return this.f50295g;
    }

    public Paint.Align o() {
        return this.f50297i;
    }

    public void p(float f4, float f5) {
        com.github.mikephil.charting.utils.g gVar = this.f50296h;
        if (gVar == null) {
            this.f50296h = com.github.mikephil.charting.utils.g.c(f4, f5);
        } else {
            gVar.f50636d = f4;
            gVar.f50637e = f5;
        }
    }

    public void q(String str) {
        this.f50295g = str;
    }

    public void r(Paint.Align align) {
        this.f50297i = align;
    }
}
