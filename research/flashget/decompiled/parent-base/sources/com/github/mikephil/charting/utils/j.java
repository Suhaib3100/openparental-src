package com.github.mikephil.charting.utils;

/* compiled from: TransformerHorizontalBarChart.java */
/* loaded from: classes5.dex */
public class j extends i {
    public j(l lVar) {
        super(lVar);
    }

    @Override // com.github.mikephil.charting.utils.i
    public void p(boolean z4) {
        this.f50648b.reset();
        if (!z4) {
            this.f50648b.postTranslate(this.f50649c.P(), this.f50649c.n() - this.f50649c.O());
        } else {
            this.f50648b.setTranslate(-(this.f50649c.o() - this.f50649c.Q()), this.f50649c.n() - this.f50649c.O());
            this.f50648b.postScale(-1.0f, 1.0f);
        }
    }
}
