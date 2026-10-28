package com.github.mikephil.charting.data;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.android.internal.telephony.SmsConstants;
import com.github.mikephil.charting.data.Entry;
import java.util.List;

/* compiled from: LineRadarDataSet.java */
/* loaded from: classes5.dex */
public abstract class p<T extends Entry> extends q<T> implements f8.g<T> {
    private int C;
    protected Drawable D;
    private int E;
    private float F;
    private boolean G;

    public p(List<T> list, String str) {
        super(list, str);
        this.C = Color.rgb(SmsConstants.MAX_USER_DATA_BYTES, 234, 255);
        this.E = 85;
        this.F = 2.5f;
        this.G = false;
    }

    @Override // f8.g
    public boolean D0() {
        return this.G;
    }

    @Override // f8.g
    public void O0(boolean z4) {
        this.G = z4;
    }

    protected void c2(p pVar) {
        super.U1(pVar);
        pVar.G = this.G;
        pVar.E = this.E;
        pVar.C = this.C;
        pVar.D = this.D;
        pVar.F = this.F;
    }

    public void d2(int i4) {
        this.E = i4;
    }

    @Override // f8.g
    public int e() {
        return this.E;
    }

    public void e2(int i4) {
        this.C = i4;
        this.D = null;
    }

    @Override // f8.g
    public int f0() {
        return this.C;
    }

    @TargetApi(18)
    public void f2(Drawable drawable) {
        this.D = drawable;
    }

    public void g2(float f4) {
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > 10.0f) {
            f4 = 10.0f;
        }
        this.F = com.github.mikephil.charting.utils.k.e(f4);
    }

    @Override // f8.g
    public float i() {
        return this.F;
    }

    @Override // f8.g
    public Drawable t() {
        return this.D;
    }
}
