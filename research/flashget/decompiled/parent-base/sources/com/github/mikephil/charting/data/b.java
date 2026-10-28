package com.github.mikephil.charting.data;

import android.graphics.Color;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BarDataSet.java */
/* loaded from: classes5.dex */
public class b extends d<BarEntry> implements f8.a {
    private float A;
    private int B;
    private int C;
    private int D;
    private String[] E;

    /* renamed from: y, reason: collision with root package name */
    private int f50354y;

    /* renamed from: z, reason: collision with root package name */
    private int f50355z;

    public b(List<BarEntry> list, String str) {
        super(list, str);
        this.f50354y = 1;
        this.f50355z = Color.rgb(215, 215, 215);
        this.A = 0.0f;
        this.B = x1.f27484y;
        this.C = 120;
        this.D = 0;
        this.E = new String[]{ProtectedSandApp.s("쐡")};
        this.f50356x = Color.rgb(0, 0, 0);
        W1(list);
        U1(list);
    }

    private void U1(List<BarEntry> list) {
        this.D = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            float[] y4 = list.get(i4).y();
            if (y4 == null) {
                this.D++;
            } else {
                this.D += y4.length;
            }
        }
    }

    private void W1(List<BarEntry> list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            float[] y4 = list.get(i4).y();
            if (y4 != null && y4.length > this.f50354y) {
                this.f50354y = y4.length;
            }
        }
    }

    @Override // f8.a
    public int J() {
        return this.f50354y;
    }

    @Override // f8.a
    public int K0() {
        return this.f50355z;
    }

    @Override // com.github.mikephil.charting.data.m
    public m<BarEntry> N1() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < this.f50401s.size(); i4++) {
            arrayList.add(((BarEntry) this.f50401s.get(i4)).g());
        }
        b bVar = new b(arrayList, o());
        X1(bVar);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.data.m
    /* renamed from: V1, reason: merged with bridge method [inline-methods] */
    public void K1(BarEntry barEntry) {
        if (barEntry == null || Float.isNaN(barEntry.c())) {
            return;
        }
        if (barEntry.y() == null) {
            if (barEntry.c() < this.f50403u) {
                this.f50403u = barEntry.c();
            }
            if (barEntry.c() > this.f50402t) {
                this.f50402t = barEntry.c();
            }
        } else {
            if ((-barEntry.u()) < this.f50403u) {
                this.f50403u = -barEntry.u();
            }
            if (barEntry.v() > this.f50402t) {
                this.f50402t = barEntry.v();
            }
        }
        L1(barEntry);
    }

    protected void X1(b bVar) {
        super.S1(bVar);
        bVar.f50354y = this.f50354y;
        bVar.f50355z = this.f50355z;
        bVar.A = this.A;
        bVar.E = this.E;
        bVar.C = this.C;
    }

    @Override // f8.a
    public int Y0() {
        return this.C;
    }

    public int Y1() {
        return this.D;
    }

    public void Z1(int i4) {
        this.B = i4;
    }

    public void a2(float f4) {
        this.A = f4;
    }

    public void b2(int i4) {
        this.f50355z = i4;
    }

    public void c2(int i4) {
        this.C = i4;
    }

    @Override // f8.a
    public boolean d1() {
        return this.f50354y > 1;
    }

    public void d2(String[] strArr) {
        this.E = strArr;
    }

    @Override // f8.a
    public String[] e1() {
        return this.E;
    }

    @Override // f8.a
    public int j() {
        return this.B;
    }

    @Override // f8.a
    public float s0() {
        return this.A;
    }
}
