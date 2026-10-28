package com.github.mikephil.charting.components;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.mikephil.charting.utils.l;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Legend.java */
/* loaded from: classes5.dex */
public class e extends com.github.mikephil.charting.components.b {
    public float A;
    private boolean B;
    private List<com.github.mikephil.charting.utils.c> C;
    private List<Boolean> D;
    private List<com.github.mikephil.charting.utils.c> E;

    /* renamed from: g, reason: collision with root package name */
    private com.github.mikephil.charting.components.f[] f50298g;

    /* renamed from: h, reason: collision with root package name */
    private com.github.mikephil.charting.components.f[] f50299h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f50300i;

    /* renamed from: j, reason: collision with root package name */
    private d f50301j;

    /* renamed from: k, reason: collision with root package name */
    private f f50302k;

    /* renamed from: l, reason: collision with root package name */
    private EnumC0775e f50303l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f50304m;

    /* renamed from: n, reason: collision with root package name */
    private b f50305n;

    /* renamed from: o, reason: collision with root package name */
    private c f50306o;

    /* renamed from: p, reason: collision with root package name */
    private float f50307p;

    /* renamed from: q, reason: collision with root package name */
    private float f50308q;

    /* renamed from: r, reason: collision with root package name */
    private DashPathEffect f50309r;

    /* renamed from: s, reason: collision with root package name */
    private float f50310s;

    /* renamed from: t, reason: collision with root package name */
    private float f50311t;

    /* renamed from: u, reason: collision with root package name */
    private float f50312u;

    /* renamed from: v, reason: collision with root package name */
    private float f50313v;

    /* renamed from: w, reason: collision with root package name */
    private float f50314w;

    /* renamed from: x, reason: collision with root package name */
    public float f50315x;

    /* renamed from: y, reason: collision with root package name */
    public float f50316y;

    /* renamed from: z, reason: collision with root package name */
    public float f50317z;

    /* compiled from: Legend.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50318a;

        static {
            int[] iArr = new int[EnumC0775e.values().length];
            f50318a = iArr;
            try {
                iArr[EnumC0775e.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50318a[EnumC0775e.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Legend.java */
    public enum b {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT
    }

    /* compiled from: Legend.java */
    public enum c {
        NONE,
        EMPTY,
        DEFAULT,
        SQUARE,
        CIRCLE,
        LINE
    }

    /* compiled from: Legend.java */
    public enum d {
        LEFT,
        CENTER,
        RIGHT
    }

    /* compiled from: Legend.java */
    /* renamed from: com.github.mikephil.charting.components.e$e, reason: collision with other inner class name */
    public enum EnumC0775e {
        HORIZONTAL,
        VERTICAL
    }

    /* compiled from: Legend.java */
    public enum f {
        TOP,
        CENTER,
        BOTTOM
    }

    public e() {
        this.f50298g = new com.github.mikephil.charting.components.f[0];
        this.f50300i = false;
        this.f50301j = d.LEFT;
        this.f50302k = f.BOTTOM;
        this.f50303l = EnumC0775e.HORIZONTAL;
        this.f50304m = false;
        this.f50305n = b.LEFT_TO_RIGHT;
        this.f50306o = c.SQUARE;
        this.f50307p = 8.0f;
        this.f50308q = 3.0f;
        this.f50309r = null;
        this.f50310s = 6.0f;
        this.f50311t = 0.0f;
        this.f50312u = 5.0f;
        this.f50313v = 3.0f;
        this.f50314w = 0.95f;
        this.f50315x = 0.0f;
        this.f50316y = 0.0f;
        this.f50317z = 0.0f;
        this.A = 0.0f;
        this.B = false;
        this.C = new ArrayList(16);
        this.D = new ArrayList(16);
        this.E = new ArrayList(16);
        this.f50293e = com.github.mikephil.charting.utils.k.e(10.0f);
        this.f50290b = com.github.mikephil.charting.utils.k.e(5.0f);
        this.f50291c = com.github.mikephil.charting.utils.k.e(3.0f);
    }

    public float A(Paint paint) {
        float f4 = 0.0f;
        for (com.github.mikephil.charting.components.f fVar : this.f50298g) {
            String str = fVar.f50319a;
            if (str != null) {
                float a5 = com.github.mikephil.charting.utils.k.a(paint, str);
                if (a5 > f4) {
                    f4 = a5;
                }
            }
        }
        return f4;
    }

    public float B(Paint paint) {
        float e4 = com.github.mikephil.charting.utils.k.e(this.f50312u);
        float f4 = 0.0f;
        float f5 = 0.0f;
        for (com.github.mikephil.charting.components.f fVar : this.f50298g) {
            float e5 = com.github.mikephil.charting.utils.k.e(Float.isNaN(fVar.f50321c) ? this.f50307p : fVar.f50321c);
            if (e5 > f5) {
                f5 = e5;
            }
            String str = fVar.f50319a;
            if (str != null) {
                float measureText = (int) paint.measureText(str);
                if (measureText > f4) {
                    f4 = measureText;
                }
            }
        }
        return f4 + f5 + e4;
    }

    public EnumC0775e C() {
        return this.f50303l;
    }

    public float D() {
        return this.f50313v;
    }

    public f E() {
        return this.f50302k;
    }

    public float F() {
        return this.f50310s;
    }

    public float G() {
        return this.f50311t;
    }

    public boolean H() {
        return this.f50304m;
    }

    public boolean I() {
        return this.f50300i;
    }

    public boolean J() {
        return this.B;
    }

    public void K() {
        this.f50300i = false;
    }

    public void L(List<com.github.mikephil.charting.components.f> list) {
        this.f50298g = (com.github.mikephil.charting.components.f[]) list.toArray(new com.github.mikephil.charting.components.f[list.size()]);
        this.f50300i = true;
    }

    public void M(com.github.mikephil.charting.components.f[] fVarArr) {
        this.f50298g = fVarArr;
        this.f50300i = true;
    }

    public void N(b bVar) {
        this.f50305n = bVar;
    }

    public void O(boolean z4) {
        this.f50304m = z4;
    }

    public void P(List<com.github.mikephil.charting.components.f> list) {
        this.f50298g = (com.github.mikephil.charting.components.f[]) list.toArray(new com.github.mikephil.charting.components.f[list.size()]);
    }

    public void Q(List<com.github.mikephil.charting.components.f> list) {
        this.f50299h = (com.github.mikephil.charting.components.f[]) list.toArray(new com.github.mikephil.charting.components.f[list.size()]);
    }

    public void R(int[] iArr, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < Math.min(iArr.length, strArr.length); i4++) {
            com.github.mikephil.charting.components.f fVar = new com.github.mikephil.charting.components.f();
            int i5 = iArr[i4];
            fVar.f50324f = i5;
            fVar.f50319a = strArr[i4];
            if (i5 == 1122868 || i5 == 0) {
                fVar.f50320b = c.NONE;
            } else if (i5 == 1122867) {
                fVar.f50320b = c.EMPTY;
            }
            arrayList.add(fVar);
        }
        this.f50299h = (com.github.mikephil.charting.components.f[]) arrayList.toArray(new com.github.mikephil.charting.components.f[arrayList.size()]);
    }

    public void S(com.github.mikephil.charting.components.f[] fVarArr) {
        if (fVarArr == null) {
            fVarArr = new com.github.mikephil.charting.components.f[0];
        }
        this.f50299h = fVarArr;
    }

    public void T(c cVar) {
        this.f50306o = cVar;
    }

    public void U(DashPathEffect dashPathEffect) {
        this.f50309r = dashPathEffect;
    }

    public void V(float f4) {
        this.f50308q = f4;
    }

    public void W(float f4) {
        this.f50307p = f4;
    }

    public void X(float f4) {
        this.f50312u = f4;
    }

    public void Y(d dVar) {
        this.f50301j = dVar;
    }

    public void Z(float f4) {
        this.f50314w = f4;
    }

    public void a0(EnumC0775e enumC0775e) {
        this.f50303l = enumC0775e;
    }

    public void b0(float f4) {
        this.f50313v = f4;
    }

    public void c0(f fVar) {
        this.f50302k = fVar;
    }

    public void d0(boolean z4) {
        this.B = z4;
    }

    public void e0(float f4) {
        this.f50310s = f4;
    }

    public void f0(float f4) {
        this.f50311t = f4;
    }

    public void m(Paint paint, l lVar) {
        float f4;
        float f5;
        float f6;
        float e4 = com.github.mikephil.charting.utils.k.e(this.f50307p);
        float e5 = com.github.mikephil.charting.utils.k.e(this.f50313v);
        float e6 = com.github.mikephil.charting.utils.k.e(this.f50312u);
        float e7 = com.github.mikephil.charting.utils.k.e(this.f50310s);
        float e10 = com.github.mikephil.charting.utils.k.e(this.f50311t);
        boolean z4 = this.B;
        com.github.mikephil.charting.components.f[] fVarArr = this.f50298g;
        int length = fVarArr.length;
        this.A = B(paint);
        this.f50317z = A(paint);
        int i4 = a.f50318a[this.f50303l.ordinal()];
        if (i4 == 1) {
            float t4 = com.github.mikephil.charting.utils.k.t(paint);
            float f7 = 0.0f;
            float f10 = 0.0f;
            float f11 = 0.0f;
            boolean z5 = false;
            for (int i5 = 0; i5 < length; i5++) {
                com.github.mikephil.charting.components.f fVar = fVarArr[i5];
                boolean z6 = fVar.f50320b != c.NONE;
                float e11 = Float.isNaN(fVar.f50321c) ? e4 : com.github.mikephil.charting.utils.k.e(fVar.f50321c);
                String str = fVar.f50319a;
                if (!z5) {
                    f11 = 0.0f;
                }
                if (z6) {
                    if (z5) {
                        f11 += e5;
                    }
                    f11 += e11;
                }
                if (str != null) {
                    if (z6 && !z5) {
                        f11 += e6;
                    } else if (z5) {
                        f7 = Math.max(f7, f11);
                        f10 += t4 + e10;
                        f11 = 0.0f;
                        z5 = false;
                    }
                    f11 += (int) paint.measureText(str);
                    if (i5 < length - 1) {
                        f10 = t4 + e10 + f10;
                    }
                } else {
                    f11 += e11;
                    if (i5 < length - 1) {
                        f11 += e5;
                    }
                    z5 = true;
                }
                f7 = Math.max(f7, f11);
            }
            this.f50315x = f7;
            this.f50316y = f10;
        } else if (i4 == 2) {
            float t5 = com.github.mikephil.charting.utils.k.t(paint);
            float v4 = com.github.mikephil.charting.utils.k.v(paint) + e10;
            float k4 = lVar.k() * this.f50314w;
            this.D.clear();
            this.C.clear();
            this.E.clear();
            int i6 = 0;
            float f12 = 0.0f;
            int i7 = -1;
            float f13 = 0.0f;
            float f14 = 0.0f;
            while (i6 < length) {
                com.github.mikephil.charting.components.f fVar2 = fVarArr[i6];
                float f15 = e4;
                float f16 = e7;
                boolean z7 = fVar2.f50320b != c.NONE;
                float e12 = Float.isNaN(fVar2.f50321c) ? f15 : com.github.mikephil.charting.utils.k.e(fVar2.f50321c);
                String str2 = fVar2.f50319a;
                com.github.mikephil.charting.components.f[] fVarArr2 = fVarArr;
                float f17 = v4;
                this.D.add(Boolean.FALSE);
                float f18 = i7 == -1 ? 0.0f : f13 + e5;
                if (str2 != null) {
                    f4 = e5;
                    this.C.add(com.github.mikephil.charting.utils.k.b(paint, str2));
                    f5 = f18 + (z7 ? e6 + e12 : 0.0f) + this.C.get(i6).f50628d;
                } else {
                    f4 = e5;
                    float f19 = e12;
                    this.C.add(com.github.mikephil.charting.utils.c.b(0.0f, 0.0f));
                    f5 = f18 + (z7 ? f19 : 0.0f);
                    if (i7 == -1) {
                        i7 = i6;
                    }
                }
                if (str2 != null || i6 == length - 1) {
                    float f20 = f14;
                    float f21 = f20 == 0.0f ? 0.0f : f16;
                    if (!z4 || f20 == 0.0f || k4 - f20 >= f21 + f5) {
                        f6 = f21 + f5 + f20;
                    } else {
                        this.E.add(com.github.mikephil.charting.utils.c.b(f20, t5));
                        f12 = Math.max(f12, f20);
                        this.D.set(i7 > -1 ? i7 : i6, Boolean.TRUE);
                        f6 = f5;
                    }
                    if (i6 == length - 1) {
                        this.E.add(com.github.mikephil.charting.utils.c.b(f6, t5));
                        f12 = Math.max(f12, f6);
                    }
                    f14 = f6;
                }
                if (str2 != null) {
                    i7 = -1;
                }
                i6++;
                e5 = f4;
                e4 = f15;
                e7 = f16;
                v4 = f17;
                f13 = f5;
                fVarArr = fVarArr2;
            }
            float f22 = v4;
            this.f50315x = f12;
            this.f50316y = (f22 * (this.E.size() == 0 ? 0 : this.E.size() - 1)) + (t5 * this.E.size());
        }
        this.f50316y += this.f50291c;
        this.f50315x += this.f50290b;
    }

    public List<Boolean> n() {
        return this.D;
    }

    public List<com.github.mikephil.charting.utils.c> o() {
        return this.C;
    }

    public List<com.github.mikephil.charting.utils.c> p() {
        return this.E;
    }

    public b q() {
        return this.f50305n;
    }

    public com.github.mikephil.charting.components.f[] r() {
        return this.f50298g;
    }

    public com.github.mikephil.charting.components.f[] s() {
        return this.f50299h;
    }

    public c t() {
        return this.f50306o;
    }

    public DashPathEffect u() {
        return this.f50309r;
    }

    public float v() {
        return this.f50308q;
    }

    public float w() {
        return this.f50307p;
    }

    public float x() {
        return this.f50312u;
    }

    public d y() {
        return this.f50301j;
    }

    public float z() {
        return this.f50314w;
    }

    public e(com.github.mikephil.charting.components.f[] fVarArr) {
        this();
        if (fVarArr != null) {
            this.f50298g = fVarArr;
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("쐊"));
    }
}
