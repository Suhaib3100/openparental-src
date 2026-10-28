package com.github.mikephil.charting.data;

import java.util.ArrayList;
import java.util.List;

/* compiled from: BubbleDataSet.java */
/* loaded from: classes5.dex */
public class h extends d<BubbleEntry> implements f8.c {
    private float A;

    /* renamed from: y, reason: collision with root package name */
    protected float f50385y;

    /* renamed from: z, reason: collision with root package name */
    protected boolean f50386z;

    public h(List<BubbleEntry> list, String str) {
        super(list, str);
        this.f50386z = true;
        this.A = 2.5f;
    }

    @Override // f8.c
    public void H0(float f4) {
        this.A = com.github.mikephil.charting.utils.k.e(f4);
    }

    @Override // com.github.mikephil.charting.data.m
    public m<BubbleEntry> N1() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < this.f50401s.size(); i4++) {
            arrayList.add(((BubbleEntry) this.f50401s.get(i4)).g());
        }
        h hVar = new h(arrayList, o());
        V1(hVar);
        return hVar;
    }

    @Override // f8.c
    public float R() {
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.data.m
    /* renamed from: U1, reason: merged with bridge method [inline-methods] */
    public void K1(BubbleEntry bubbleEntry) {
        super.K1(bubbleEntry);
        float o4 = bubbleEntry.o();
        if (o4 > this.f50385y) {
            this.f50385y = o4;
        }
    }

    protected void V1(h hVar) {
        hVar.A = this.A;
        hVar.f50386z = this.f50386z;
    }

    public void W1(boolean z4) {
        this.f50386z = z4;
    }

    @Override // f8.c
    public float a() {
        return this.f50385y;
    }

    @Override // f8.c
    public boolean d0() {
        return this.f50386z;
    }
}
