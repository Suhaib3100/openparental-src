package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.mikephil.charting.components.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: LegendRenderer.java */
/* loaded from: classes5.dex */
public class i extends o {

    /* renamed from: b, reason: collision with root package name */
    protected Paint f50541b;

    /* renamed from: c, reason: collision with root package name */
    protected Paint f50542c;

    /* renamed from: d, reason: collision with root package name */
    protected com.github.mikephil.charting.components.e f50543d;

    /* renamed from: e, reason: collision with root package name */
    protected List<com.github.mikephil.charting.components.f> f50544e;

    /* renamed from: f, reason: collision with root package name */
    protected Paint.FontMetrics f50545f;

    /* renamed from: g, reason: collision with root package name */
    private Path f50546g;

    /* compiled from: LegendRenderer.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50547a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f50548b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f50549c;

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f50550d;

        static {
            int[] iArr = new int[e.c.values().length];
            f50550d = iArr;
            try {
                iArr[e.c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50550d[e.c.EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50550d[e.c.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50550d[e.c.CIRCLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50550d[e.c.SQUARE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50550d[e.c.LINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[e.EnumC0775e.values().length];
            f50549c = iArr2;
            try {
                iArr2[e.EnumC0775e.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f50549c[e.EnumC0775e.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[e.f.values().length];
            f50548b = iArr3;
            try {
                iArr3[e.f.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f50548b[e.f.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f50548b[e.f.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr4 = new int[e.d.values().length];
            f50547a = iArr4;
            try {
                iArr4[e.d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f50547a[e.d.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f50547a[e.d.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public i(com.github.mikephil.charting.utils.l lVar, com.github.mikephil.charting.components.e eVar) {
        super(lVar);
        this.f50544e = new ArrayList(16);
        this.f50545f = new Paint.FontMetrics();
        this.f50546g = new Path();
        this.f50543d = eVar;
        Paint paint = new Paint(1);
        this.f50541b = paint;
        paint.setTextSize(com.github.mikephil.charting.utils.k.e(9.0f));
        this.f50541b.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        this.f50542c = paint2;
        paint2.setStyle(Paint.Style.FILL);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [f8.e] */
    /* JADX WARN: Type inference failed for: r7v1, types: [f8.e] */
    public void a(com.github.mikephil.charting.data.k<?> kVar) {
        com.github.mikephil.charting.data.k<?> kVar2;
        com.github.mikephil.charting.data.k<?> kVar3 = kVar;
        if (!this.f50543d.I()) {
            this.f50544e.clear();
            int i4 = 0;
            while (i4 < kVar.m()) {
                ?? k4 = kVar3.k(i4);
                List<Integer> I = k4.I();
                int h12 = k4.h1();
                if (k4 instanceof f8.a) {
                    f8.a aVar = (f8.a) k4;
                    if (aVar.d1()) {
                        String[] e12 = aVar.e1();
                        for (int i5 = 0; i5 < I.size() && i5 < aVar.J(); i5++) {
                            this.f50544e.add(new com.github.mikephil.charting.components.f(e12[i5 % e12.length], k4.m(), k4.x(), k4.B0(), k4.n0(), I.get(i5).intValue()));
                        }
                        if (aVar.o() != null) {
                            this.f50544e.add(new com.github.mikephil.charting.components.f(k4.o(), e.c.NONE, Float.NaN, Float.NaN, null, com.github.mikephil.charting.utils.a.f50619a));
                        }
                        kVar2 = kVar3;
                        i4++;
                        kVar3 = kVar2;
                    }
                }
                if (k4 instanceof f8.i) {
                    f8.i iVar = (f8.i) k4;
                    for (int i6 = 0; i6 < I.size() && i6 < h12; i6++) {
                        this.f50544e.add(new com.github.mikephil.charting.components.f(iVar.w(i6).o(), k4.m(), k4.x(), k4.B0(), k4.n0(), I.get(i6).intValue()));
                    }
                    if (iVar.o() != null) {
                        this.f50544e.add(new com.github.mikephil.charting.components.f(k4.o(), e.c.NONE, Float.NaN, Float.NaN, null, com.github.mikephil.charting.utils.a.f50619a));
                    }
                } else {
                    if (k4 instanceof f8.d) {
                        f8.d dVar = (f8.d) k4;
                        if (dVar.q1() != 1122867) {
                            int q12 = dVar.q1();
                            int T = dVar.T();
                            this.f50544e.add(new com.github.mikephil.charting.components.f(null, k4.m(), k4.x(), k4.B0(), k4.n0(), q12));
                            this.f50544e.add(new com.github.mikephil.charting.components.f(k4.o(), k4.m(), k4.x(), k4.B0(), k4.n0(), T));
                        }
                    }
                    int i7 = 0;
                    while (i7 < I.size() && i7 < h12) {
                        this.f50544e.add(new com.github.mikephil.charting.components.f((i7 >= I.size() + (-1) || i7 >= h12 + (-1)) ? kVar.k(i4).o() : null, k4.m(), k4.x(), k4.B0(), k4.n0(), I.get(i7).intValue()));
                        i7++;
                    }
                }
                kVar2 = kVar;
                i4++;
                kVar3 = kVar2;
            }
            if (this.f50543d.s() != null) {
                Collections.addAll(this.f50544e, this.f50543d.s());
            }
            this.f50543d.P(this.f50544e);
        }
        Typeface c5 = this.f50543d.c();
        if (c5 != null) {
            this.f50541b.setTypeface(c5);
        }
        this.f50541b.setTextSize(this.f50543d.b());
        this.f50541b.setColor(this.f50543d.a());
        this.f50543d.m(this.f50541b, this.f50589a);
    }

    protected void b(Canvas canvas, float f4, float f5, com.github.mikephil.charting.components.f fVar, com.github.mikephil.charting.components.e eVar) {
        int i4 = fVar.f50324f;
        if (i4 == 1122868 || i4 == 1122867 || i4 == 0) {
            return;
        }
        int save = canvas.save();
        e.c cVar = fVar.f50320b;
        if (cVar == e.c.DEFAULT) {
            cVar = eVar.t();
        }
        this.f50542c.setColor(fVar.f50324f);
        float e4 = com.github.mikephil.charting.utils.k.e(Float.isNaN(fVar.f50321c) ? eVar.w() : fVar.f50321c);
        float f6 = e4 / 2.0f;
        int i5 = a.f50550d[cVar.ordinal()];
        if (i5 == 3 || i5 == 4) {
            this.f50542c.setStyle(Paint.Style.FILL);
            canvas.drawCircle(f4 + f6, f5, f6, this.f50542c);
        } else if (i5 == 5) {
            this.f50542c.setStyle(Paint.Style.FILL);
            canvas.drawRect(f4, f5 - f6, f4 + e4, f5 + f6, this.f50542c);
        } else if (i5 == 6) {
            float e5 = com.github.mikephil.charting.utils.k.e(Float.isNaN(fVar.f50322d) ? eVar.v() : fVar.f50322d);
            DashPathEffect dashPathEffect = fVar.f50323e;
            if (dashPathEffect == null) {
                dashPathEffect = eVar.u();
            }
            this.f50542c.setStyle(Paint.Style.STROKE);
            this.f50542c.setStrokeWidth(e5);
            this.f50542c.setPathEffect(dashPathEffect);
            this.f50546g.reset();
            this.f50546g.moveTo(f4, f5);
            this.f50546g.lineTo(f4 + e4, f5);
            canvas.drawPath(this.f50546g, this.f50542c);
        }
        canvas.restoreToCount(save);
    }

    protected void c(Canvas canvas, float f4, float f5, String str) {
        canvas.drawText(str, f4, f5, this.f50541b);
    }

    public Paint d() {
        return this.f50542c;
    }

    public Paint e() {
        return this.f50541b;
    }

    public void f(Canvas canvas) {
        float f4;
        float f5;
        float f6;
        float f7;
        float f10;
        List<Boolean> list;
        List<com.github.mikephil.charting.utils.c> list2;
        int i4;
        float f11;
        float f12;
        float f13;
        float f14;
        float j4;
        float f15;
        float f16;
        float f17;
        e.b bVar;
        com.github.mikephil.charting.components.f fVar;
        float f18;
        double d5;
        if (this.f50543d.f()) {
            Typeface c5 = this.f50543d.c();
            if (c5 != null) {
                this.f50541b.setTypeface(c5);
            }
            this.f50541b.setTextSize(this.f50543d.b());
            this.f50541b.setColor(this.f50543d.a());
            float u4 = com.github.mikephil.charting.utils.k.u(this.f50541b, this.f50545f);
            float e4 = com.github.mikephil.charting.utils.k.e(this.f50543d.G()) + com.github.mikephil.charting.utils.k.w(this.f50541b, this.f50545f);
            float a5 = u4 - (com.github.mikephil.charting.utils.k.a(this.f50541b, ProtectedSandApp.s("쑐")) / 2.0f);
            com.github.mikephil.charting.components.f[] r4 = this.f50543d.r();
            float e5 = com.github.mikephil.charting.utils.k.e(this.f50543d.x());
            float e6 = com.github.mikephil.charting.utils.k.e(this.f50543d.F());
            e.EnumC0775e C = this.f50543d.C();
            e.d y4 = this.f50543d.y();
            e.f E = this.f50543d.E();
            e.b q4 = this.f50543d.q();
            float e7 = com.github.mikephil.charting.utils.k.e(this.f50543d.w());
            float e10 = com.github.mikephil.charting.utils.k.e(this.f50543d.D());
            float e11 = this.f50543d.e();
            float d6 = this.f50543d.d();
            int i5 = a.f50547a[y4.ordinal()];
            float f19 = e10;
            float f20 = e6;
            if (i5 == 1) {
                f4 = u4;
                f5 = e4;
                if (C != e.EnumC0775e.VERTICAL) {
                    d6 += this.f50589a.h();
                }
                f6 = q4 == e.b.RIGHT_TO_LEFT ? d6 + this.f50543d.f50315x : d6;
            } else if (i5 == 2) {
                f4 = u4;
                f5 = e4;
                f6 = (C == e.EnumC0775e.VERTICAL ? this.f50589a.o() : this.f50589a.i()) - d6;
                if (q4 == e.b.LEFT_TO_RIGHT) {
                    f6 -= this.f50543d.f50315x;
                }
            } else if (i5 != 3) {
                f4 = u4;
                f5 = e4;
                f6 = 0.0f;
            } else {
                e.EnumC0775e enumC0775e = e.EnumC0775e.VERTICAL;
                float o4 = C == enumC0775e ? this.f50589a.o() / 2.0f : this.f50589a.h() + (this.f50589a.k() / 2.0f);
                e.b bVar2 = e.b.LEFT_TO_RIGHT;
                f5 = e4;
                f6 = o4 + (q4 == bVar2 ? d6 : -d6);
                if (C == enumC0775e) {
                    double d7 = f6;
                    if (q4 == bVar2) {
                        f4 = u4;
                        d5 = ((-this.f50543d.f50315x) / 2.0d) + d6;
                    } else {
                        f4 = u4;
                        d5 = (this.f50543d.f50315x / 2.0d) - d6;
                    }
                    f6 = (float) (d7 + d5);
                } else {
                    f4 = u4;
                }
            }
            int i6 = a.f50549c[C.ordinal()];
            if (i6 != 1) {
                if (i6 != 2) {
                    return;
                }
                int i7 = a.f50548b[E.ordinal()];
                if (i7 == 1) {
                    j4 = (y4 == e.d.CENTER ? 0.0f : this.f50589a.j()) + e11;
                } else if (i7 == 2) {
                    j4 = (y4 == e.d.CENTER ? this.f50589a.n() : this.f50589a.f()) - (this.f50543d.f50316y + e11);
                } else if (i7 != 3) {
                    j4 = 0.0f;
                } else {
                    float n4 = this.f50589a.n() / 2.0f;
                    com.github.mikephil.charting.components.e eVar = this.f50543d;
                    j4 = eVar.e() + (n4 - (eVar.f50316y / 2.0f));
                }
                float f21 = j4;
                float f22 = 0.0f;
                boolean z4 = false;
                int i10 = 0;
                while (i10 < r4.length) {
                    com.github.mikephil.charting.components.f fVar2 = r4[i10];
                    boolean z5 = fVar2.f50320b != e.c.NONE;
                    float e12 = Float.isNaN(fVar2.f50321c) ? e7 : com.github.mikephil.charting.utils.k.e(fVar2.f50321c);
                    if (z5) {
                        e.b bVar3 = e.b.LEFT_TO_RIGHT;
                        f18 = q4 == bVar3 ? f6 + f22 : f6 - (e12 - f22);
                        f16 = a5;
                        f17 = f19;
                        f15 = f6;
                        bVar = q4;
                        b(canvas, f18, f21 + a5, fVar2, this.f50543d);
                        if (bVar == bVar3) {
                            f18 += e12;
                        }
                        fVar = fVar2;
                    } else {
                        f15 = f6;
                        f16 = a5;
                        f17 = f19;
                        bVar = q4;
                        fVar = fVar2;
                        f18 = f15;
                    }
                    if (fVar.f50319a != null) {
                        if (z5 && !z4) {
                            f18 += bVar == e.b.LEFT_TO_RIGHT ? e5 : -e5;
                        } else if (z4) {
                            f18 = f15;
                        }
                        if (bVar == e.b.RIGHT_TO_LEFT) {
                            f18 -= (int) this.f50541b.measureText(r1);
                        }
                        float f23 = f18;
                        if (z4) {
                            f21 += f4 + f5;
                            c(canvas, f23, f21 + f4, fVar.f50319a);
                        } else {
                            c(canvas, f23, f21 + f4, fVar.f50319a);
                        }
                        f21 = f4 + f5 + f21;
                        f22 = 0.0f;
                    } else {
                        f22 = e12 + f17 + f22;
                        z4 = true;
                    }
                    i10++;
                    q4 = bVar;
                    f19 = f17;
                    a5 = f16;
                    f6 = f15;
                }
                return;
            }
            float f24 = f6;
            float f25 = f19;
            List<com.github.mikephil.charting.utils.c> p4 = this.f50543d.p();
            List<com.github.mikephil.charting.utils.c> o5 = this.f50543d.o();
            List<Boolean> n5 = this.f50543d.n();
            int i11 = a.f50548b[E.ordinal()];
            if (i11 != 1) {
                e11 = i11 != 2 ? i11 != 3 ? 0.0f : e11 + ((this.f50589a.n() - this.f50543d.f50316y) / 2.0f) : (this.f50589a.n() - e11) - this.f50543d.f50316y;
            }
            int length = r4.length;
            float f26 = f24;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                float f27 = f25;
                com.github.mikephil.charting.components.f fVar3 = r4[i12];
                float f28 = f26;
                int i14 = length;
                boolean z6 = fVar3.f50320b != e.c.NONE;
                float e13 = Float.isNaN(fVar3.f50321c) ? e7 : com.github.mikephil.charting.utils.k.e(fVar3.f50321c);
                if (i12 >= n5.size() || !n5.get(i12).booleanValue()) {
                    f7 = f28;
                    f10 = e11;
                } else {
                    f10 = f4 + f5 + e11;
                    f7 = f24;
                }
                if (f7 == f24 && y4 == e.d.CENTER && i13 < p4.size()) {
                    f7 += (q4 == e.b.RIGHT_TO_LEFT ? p4.get(i13).f50628d : -p4.get(i13).f50628d) / 2.0f;
                    i13++;
                }
                int i15 = i13;
                boolean z7 = fVar3.f50319a == null;
                if (z6) {
                    if (q4 == e.b.RIGHT_TO_LEFT) {
                        f7 -= e13;
                    }
                    float f29 = f7;
                    list2 = p4;
                    i4 = i12;
                    list = n5;
                    b(canvas, f29, f10 + a5, fVar3, this.f50543d);
                    f7 = q4 == e.b.LEFT_TO_RIGHT ? f29 + e13 : f29;
                } else {
                    list = n5;
                    list2 = p4;
                    i4 = i12;
                }
                if (z7) {
                    f11 = f20;
                    if (q4 == e.b.RIGHT_TO_LEFT) {
                        f12 = f27;
                        f13 = -f12;
                    } else {
                        f12 = f27;
                        f13 = f12;
                    }
                    f26 = f7 + f13;
                } else {
                    if (z6) {
                        f7 += q4 == e.b.RIGHT_TO_LEFT ? -e5 : e5;
                    }
                    e.b bVar4 = e.b.RIGHT_TO_LEFT;
                    if (q4 == bVar4) {
                        f7 -= o5.get(i4).f50628d;
                    }
                    c(canvas, f7, f10 + f4, fVar3.f50319a);
                    if (q4 == e.b.LEFT_TO_RIGHT) {
                        f7 += o5.get(i4).f50628d;
                    }
                    if (q4 == bVar4) {
                        f11 = f20;
                        f14 = -f11;
                    } else {
                        f11 = f20;
                        f14 = f11;
                    }
                    f26 = f7 + f14;
                    f12 = f27;
                }
                f20 = f11;
                f25 = f12;
                i12 = i4 + 1;
                e11 = f10;
                length = i14;
                i13 = i15;
                p4 = list2;
                n5 = list;
            }
        }
    }
}
