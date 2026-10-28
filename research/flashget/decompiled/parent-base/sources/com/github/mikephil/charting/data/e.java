package com.github.mikephil.charting.data;

import android.content.Context;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Typeface;
import androidx.core.view.x1;
import com.android.internal.telephony.SmsConstants;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.mikephil.charting.components.e;
import com.github.mikephil.charting.components.k;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseDataSet.java */
/* loaded from: classes5.dex */
public abstract class e<T extends Entry> implements f8.e<T> {

    /* renamed from: a, reason: collision with root package name */
    protected List<Integer> f50357a;

    /* renamed from: b, reason: collision with root package name */
    protected h8.a f50358b;

    /* renamed from: c, reason: collision with root package name */
    protected List<h8.a> f50359c;

    /* renamed from: d, reason: collision with root package name */
    protected List<Integer> f50360d;

    /* renamed from: e, reason: collision with root package name */
    private String f50361e;

    /* renamed from: f, reason: collision with root package name */
    protected k.a f50362f;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f50363g;

    /* renamed from: h, reason: collision with root package name */
    protected transient com.github.mikephil.charting.formatter.l f50364h;

    /* renamed from: i, reason: collision with root package name */
    protected Typeface f50365i;

    /* renamed from: j, reason: collision with root package name */
    private e.c f50366j;

    /* renamed from: k, reason: collision with root package name */
    private float f50367k;

    /* renamed from: l, reason: collision with root package name */
    private float f50368l;

    /* renamed from: m, reason: collision with root package name */
    private DashPathEffect f50369m;

    /* renamed from: n, reason: collision with root package name */
    protected boolean f50370n;

    /* renamed from: o, reason: collision with root package name */
    protected boolean f50371o;

    /* renamed from: p, reason: collision with root package name */
    protected com.github.mikephil.charting.utils.g f50372p;

    /* renamed from: q, reason: collision with root package name */
    protected float f50373q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f50374r;

    public e() {
        this.f50357a = null;
        this.f50358b = null;
        this.f50359c = null;
        this.f50360d = null;
        this.f50361e = ProtectedSandApp.s("쐜");
        this.f50362f = k.a.LEFT;
        this.f50363g = true;
        this.f50366j = e.c.DEFAULT;
        this.f50367k = Float.NaN;
        this.f50368l = Float.NaN;
        this.f50369m = null;
        this.f50370n = true;
        this.f50371o = true;
        this.f50372p = new com.github.mikephil.charting.utils.g();
        this.f50373q = 17.0f;
        this.f50374r = true;
        this.f50357a = new ArrayList();
        this.f50360d = new ArrayList();
        this.f50357a.add(Integer.valueOf(Color.rgb(SmsConstants.MAX_USER_DATA_BYTES, 234, 255)));
        this.f50360d.add(Integer.valueOf(x1.f27484y));
    }

    @Override // f8.e
    public void A(boolean z4) {
        this.f50371o = z4;
    }

    public void A1(List<Integer> list) {
        this.f50357a = list;
    }

    @Override // f8.e
    public Typeface B() {
        return this.f50365i;
    }

    @Override // f8.e
    public float B0() {
        return this.f50368l;
    }

    public void B1(int... iArr) {
        this.f50357a = com.github.mikephil.charting.utils.a.c(iArr);
    }

    public void C1(int[] iArr, int i4) {
        x1();
        for (int i5 : iArr) {
            t1(Color.argb(i4, Color.red(i5), Color.green(i5), Color.blue(i5)));
        }
    }

    public void D1(int[] iArr, Context context) {
        if (this.f50357a == null) {
            this.f50357a = new ArrayList();
        }
        this.f50357a.clear();
        for (int i4 : iArr) {
            this.f50357a.add(Integer.valueOf(context.getResources().getColor(i4)));
        }
    }

    @Override // f8.e
    public int E(int i4) {
        List<Integer> list = this.f50360d;
        return list.get(i4 % list.size()).intValue();
    }

    public void E1(e.c cVar) {
        this.f50366j = cVar;
    }

    @Override // f8.e
    public boolean F(T t4) {
        for (int i4 = 0; i4 < h1(); i4++) {
            if (w(i4).equals(t4)) {
                return true;
            }
        }
        return false;
    }

    public void F1(DashPathEffect dashPathEffect) {
        this.f50369m = dashPathEffect;
    }

    @Override // f8.e
    public int G0(int i4) {
        List<Integer> list = this.f50357a;
        return list.get(i4 % list.size()).intValue();
    }

    public void G1(float f4) {
        this.f50368l = f4;
    }

    @Override // f8.e
    public void H(float f4) {
        this.f50373q = com.github.mikephil.charting.utils.k.e(f4);
    }

    public void H1(float f4) {
        this.f50367k = f4;
    }

    @Override // f8.e
    public List<Integer> I() {
        return this.f50357a;
    }

    public void I1(int i4, int i5) {
        this.f50358b = new h8.a(i4, i5);
    }

    public void J1(List<h8.a> list) {
        this.f50359c = list;
    }

    @Override // f8.e
    public boolean L0() {
        return this.f50364h == null;
    }

    @Override // f8.e
    public List<h8.a> P() {
        return this.f50359c;
    }

    @Override // f8.e
    public void P0(com.github.mikephil.charting.formatter.l lVar) {
        if (lVar == null) {
            return;
        }
        this.f50364h = lVar;
    }

    @Override // f8.e
    public boolean S() {
        return this.f50370n;
    }

    @Override // f8.e
    public k.a U() {
        return this.f50362f;
    }

    @Override // f8.e
    public boolean V(int i4) {
        return M0(w(i4));
    }

    @Override // f8.e
    public void V0(List<Integer> list) {
        this.f50360d = list;
    }

    @Override // f8.e
    public void W(boolean z4) {
        this.f50370n = z4;
    }

    @Override // f8.e
    public void W0(com.github.mikephil.charting.utils.g gVar) {
        com.github.mikephil.charting.utils.g gVar2 = this.f50372p;
        gVar2.f50636d = gVar.f50636d;
        gVar2.f50637e = gVar.f50637e;
    }

    @Override // f8.e
    public int Y() {
        return this.f50357a.get(0).intValue();
    }

    @Override // f8.e
    public void b(boolean z4) {
        this.f50363g = z4;
    }

    @Override // f8.e
    public void d(k.a aVar) {
        this.f50362f = aVar;
    }

    @Override // f8.e
    public com.github.mikephil.charting.utils.g i1() {
        return this.f50372p;
    }

    @Override // f8.e
    public boolean isVisible() {
        return this.f50374r;
    }

    @Override // f8.e
    public boolean k1() {
        return this.f50363g;
    }

    @Override // f8.e
    public boolean l0(float f4) {
        return M0(o0(f4, Float.NaN));
    }

    @Override // f8.e
    public e.c m() {
        return this.f50366j;
    }

    @Override // f8.e
    public DashPathEffect n0() {
        return this.f50369m;
    }

    @Override // f8.e
    public h8.a n1(int i4) {
        List<h8.a> list = this.f50359c;
        return list.get(i4 % list.size());
    }

    @Override // f8.e
    public String o() {
        return this.f50361e;
    }

    @Override // f8.e
    public void p1(String str) {
        this.f50361e = str;
    }

    @Override // f8.e
    public boolean q0() {
        return this.f50371o;
    }

    @Override // f8.e
    public void r0(Typeface typeface) {
        this.f50365i = typeface;
    }

    @Override // f8.e
    public boolean removeFirst() {
        if (h1() > 0) {
            return M0(w(0));
        }
        return false;
    }

    @Override // f8.e
    public boolean removeLast() {
        if (h1() > 0) {
            return M0(w(h1() - 1));
        }
        return false;
    }

    @Override // f8.e
    public int s(int i4) {
        for (int i5 = 0; i5 < h1(); i5++) {
            if (i4 == w(i5).j()) {
                return i5;
            }
        }
        return -1;
    }

    @Override // f8.e
    public void setVisible(boolean z4) {
        this.f50374r = z4;
    }

    @Override // f8.e
    public int t0() {
        return this.f50360d.get(0).intValue();
    }

    public void t1(int i4) {
        if (this.f50357a == null) {
            this.f50357a = new ArrayList();
        }
        this.f50357a.add(Integer.valueOf(i4));
    }

    @Override // f8.e
    public com.github.mikephil.charting.formatter.l u() {
        return L0() ? com.github.mikephil.charting.utils.k.s() : this.f50364h;
    }

    protected void u1(e eVar) {
        eVar.f50362f = this.f50362f;
        eVar.f50357a = this.f50357a;
        eVar.f50371o = this.f50371o;
        eVar.f50370n = this.f50370n;
        eVar.f50366j = this.f50366j;
        eVar.f50369m = this.f50369m;
        eVar.f50368l = this.f50368l;
        eVar.f50367k = this.f50367k;
        eVar.f50358b = this.f50358b;
        eVar.f50359c = this.f50359c;
        eVar.f50363g = this.f50363g;
        eVar.f50372p = this.f50372p;
        eVar.f50360d = this.f50360d;
        eVar.f50364h = this.f50364h;
        eVar.f50360d = this.f50360d;
        eVar.f50373q = this.f50373q;
        eVar.f50374r = this.f50374r;
    }

    @Override // f8.e
    public h8.a v0() {
        return this.f50358b;
    }

    public List<Integer> v1() {
        return this.f50360d;
    }

    public void w1() {
        O();
    }

    @Override // f8.e
    public float x() {
        return this.f50367k;
    }

    @Override // f8.e
    public void x0(int i4) {
        this.f50360d.clear();
        this.f50360d.add(Integer.valueOf(i4));
    }

    public void x1() {
        if (this.f50357a == null) {
            this.f50357a = new ArrayList();
        }
        this.f50357a.clear();
    }

    public void y1(int i4) {
        x1();
        this.f50357a.add(Integer.valueOf(i4));
    }

    @Override // f8.e
    public float z0() {
        return this.f50373q;
    }

    public void z1(int i4, int i5) {
        y1(Color.argb(i5, Color.red(i4), Color.green(i4), Color.blue(i4)));
    }

    public e(String str) {
        this();
        this.f50361e = str;
    }
}
