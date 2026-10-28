package com.github.mikephil.charting.renderer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.compose.material3.f4;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.data.s;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: PieChartRenderer.java */
/* loaded from: classes5.dex */
public class m extends g {

    /* renamed from: g, reason: collision with root package name */
    protected PieChart f50567g;

    /* renamed from: h, reason: collision with root package name */
    protected Paint f50568h;

    /* renamed from: i, reason: collision with root package name */
    protected Paint f50569i;

    /* renamed from: j, reason: collision with root package name */
    protected Paint f50570j;

    /* renamed from: k, reason: collision with root package name */
    private TextPaint f50571k;

    /* renamed from: l, reason: collision with root package name */
    private Paint f50572l;

    /* renamed from: m, reason: collision with root package name */
    private StaticLayout f50573m;

    /* renamed from: n, reason: collision with root package name */
    private CharSequence f50574n;

    /* renamed from: o, reason: collision with root package name */
    private RectF f50575o;

    /* renamed from: p, reason: collision with root package name */
    private RectF[] f50576p;

    /* renamed from: q, reason: collision with root package name */
    protected WeakReference<Bitmap> f50577q;

    /* renamed from: r, reason: collision with root package name */
    protected Canvas f50578r;

    /* renamed from: s, reason: collision with root package name */
    private Path f50579s;

    /* renamed from: t, reason: collision with root package name */
    private RectF f50580t;

    /* renamed from: u, reason: collision with root package name */
    private Path f50581u;

    /* renamed from: v, reason: collision with root package name */
    protected Path f50582v;

    /* renamed from: w, reason: collision with root package name */
    protected RectF f50583w;

    public m(PieChart pieChart, com.github.mikephil.charting.animation.a aVar, com.github.mikephil.charting.utils.l lVar) {
        super(aVar, lVar);
        this.f50575o = new RectF();
        this.f50576p = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.f50579s = new Path();
        this.f50580t = new RectF();
        this.f50581u = new Path();
        this.f50582v = new Path();
        this.f50583w = new RectF();
        this.f50567g = pieChart;
        Paint paint = new Paint(1);
        this.f50568h = paint;
        paint.setColor(-1);
        Paint paint2 = this.f50568h;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.f50569i = paint3;
        paint3.setColor(-1);
        this.f50569i.setStyle(style);
        this.f50569i.setAlpha(105);
        TextPaint textPaint = new TextPaint(1);
        this.f50571k = textPaint;
        textPaint.setColor(x1.f27484y);
        this.f50571k.setTextSize(com.github.mikephil.charting.utils.k.e(12.0f));
        this.f50539f.setTextSize(com.github.mikephil.charting.utils.k.e(13.0f));
        this.f50539f.setColor(-1);
        Paint paint4 = this.f50539f;
        Paint.Align align = Paint.Align.CENTER;
        paint4.setTextAlign(align);
        Paint paint5 = new Paint(1);
        this.f50572l = paint5;
        paint5.setColor(-1);
        this.f50572l.setTextAlign(align);
        this.f50572l.setTextSize(com.github.mikephil.charting.utils.k.e(13.0f));
        Paint paint6 = new Paint(1);
        this.f50570j = paint6;
        paint6.setStyle(Paint.Style.STROKE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.g
    public void b(Canvas canvas) {
        int o4 = (int) this.f50589a.o();
        int n4 = (int) this.f50589a.n();
        WeakReference<Bitmap> weakReference = this.f50577q;
        Bitmap bitmap = weakReference == null ? null : weakReference.get();
        if (bitmap == null || bitmap.getWidth() != o4 || bitmap.getHeight() != n4) {
            if (o4 <= 0 || n4 <= 0) {
                return;
            }
            bitmap = Bitmap.createBitmap(o4, n4, Bitmap.Config.ARGB_4444);
            this.f50577q = new WeakReference<>(bitmap);
            this.f50578r = new Canvas(bitmap);
        }
        bitmap.eraseColor(0);
        for (f8.i iVar : ((com.github.mikephil.charting.data.r) this.f50567g.b()).q()) {
            if (iVar.isVisible() && iVar.h1() > 0) {
                n(canvas, iVar);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void c(Canvas canvas) {
        p(canvas);
        canvas.drawBitmap(this.f50577q.get(), 0.0f, 0.0f, (Paint) null);
        m(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.g
    public void d(Canvas canvas, com.github.mikephil.charting.highlight.d[] dVarArr) {
        f8.i k4;
        float f4;
        int i4;
        float[] fArr;
        float f5;
        int i5;
        boolean z4;
        RectF rectF;
        com.github.mikephil.charting.utils.g gVar;
        int i6;
        float f6;
        float[] fArr2;
        float f7;
        float f10;
        float f11;
        float f12;
        com.github.mikephil.charting.highlight.d[] dVarArr2 = dVarArr;
        boolean z5 = this.f50567g.Z1() && !this.f50567g.b2();
        if (z5 && this.f50567g.a2()) {
            return;
        }
        float h4 = this.f50535b.h();
        float i7 = this.f50535b.i();
        float C1 = this.f50567g.C1();
        float[] S1 = this.f50567g.S1();
        float[] L1 = this.f50567g.L1();
        com.github.mikephil.charting.utils.g M1 = this.f50567g.M1();
        float y12 = this.f50567g.y1();
        float T1 = z5 ? (this.f50567g.T1() / 100.0f) * y12 : 0.0f;
        RectF rectF2 = this.f50583w;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        int i10 = 0;
        while (i10 < dVarArr2.length) {
            int h5 = (int) dVarArr2[i10].h();
            if (h5 < S1.length && (k4 = ((com.github.mikephil.charting.data.r) this.f50567g.b()).k(dVarArr2[i10].d())) != null && k4.k1()) {
                int h12 = k4.h1();
                int i11 = 0;
                for (int i12 = 0; i12 < h12; i12++) {
                    if (Math.abs(k4.w(i12).c()) > com.github.mikephil.charting.utils.k.f50664g) {
                        i11++;
                    }
                }
                if (h5 == 0) {
                    i4 = 1;
                    f4 = 0.0f;
                } else {
                    f4 = L1[h5 - 1] * h4;
                    i4 = 1;
                }
                float g02 = i11 <= i4 ? 0.0f : k4.g0();
                float f13 = S1[h5];
                float Q = k4.Q();
                int i13 = i10;
                float f14 = y12 + Q;
                float f15 = T1;
                rectF2.set(this.f50567g.Q1());
                float f16 = -Q;
                rectF2.inset(f16, f16);
                boolean z6 = g02 > 0.0f && f13 <= 180.0f;
                this.f50536c.setColor(k4.G0(h5));
                float f17 = i11 == 1 ? 0.0f : g02 / (y12 * 0.017453292f);
                float f18 = i11 == 1 ? 0.0f : g02 / (f14 * 0.017453292f);
                float f19 = (((f17 / 2.0f) + f4) * i7) + C1;
                float f20 = (f13 - f17) * i7;
                float f21 = f20 < 0.0f ? 0.0f : f20;
                float f22 = (((f18 / 2.0f) + f4) * i7) + C1;
                float f23 = (f13 - f18) * i7;
                if (f23 < 0.0f) {
                    f23 = 0.0f;
                }
                this.f50579s.reset();
                if (f21 < 360.0f || f21 % 360.0f > com.github.mikephil.charting.utils.k.f50664g) {
                    fArr = S1;
                    f5 = f4;
                    double d5 = f22 * 0.017453292f;
                    i5 = i11;
                    z4 = z5;
                    this.f50579s.moveTo((((float) Math.cos(d5)) * f14) + M1.f50636d, (f14 * ((float) Math.sin(d5))) + M1.f50637e);
                    this.f50579s.arcTo(rectF2, f22, f23);
                } else {
                    this.f50579s.addCircle(M1.f50636d, M1.f50637e, f14, Path.Direction.CW);
                    fArr = S1;
                    f5 = f4;
                    i5 = i11;
                    z4 = z5;
                }
                if (z6) {
                    double d6 = f19 * 0.017453292f;
                    i6 = i13;
                    rectF = rectF2;
                    f6 = f15;
                    gVar = M1;
                    fArr2 = fArr;
                    f7 = l(M1, y12, f13 * i7, (((float) Math.cos(d6)) * y12) + M1.f50636d, (((float) Math.sin(d6)) * y12) + M1.f50637e, f19, f21);
                } else {
                    rectF = rectF2;
                    gVar = M1;
                    i6 = i13;
                    f6 = f15;
                    fArr2 = fArr;
                    f7 = 0.0f;
                }
                RectF rectF3 = this.f50580t;
                float f24 = gVar.f50636d;
                float f25 = gVar.f50637e;
                rectF3.set(f24 - f6, f25 - f6, f24 + f6, f25 + f6);
                if (!z4 || (f6 <= 0.0f && !z6)) {
                    f10 = h4;
                    f11 = i7;
                    if (f21 % 360.0f > com.github.mikephil.charting.utils.k.f50664g) {
                        if (z6) {
                            double d7 = ((f21 / 2.0f) + f19) * 0.017453292f;
                            this.f50579s.lineTo((((float) Math.cos(d7)) * f7) + gVar.f50636d, (f7 * ((float) Math.sin(d7))) + gVar.f50637e);
                        } else {
                            this.f50579s.lineTo(gVar.f50636d, gVar.f50637e);
                        }
                    }
                } else {
                    if (z6) {
                        if (f7 < 0.0f) {
                            f7 = -f7;
                        }
                        f12 = Math.max(f6, f7);
                    } else {
                        f12 = f6;
                    }
                    float f26 = (i5 == 1 || f12 == 0.0f) ? 0.0f : g02 / (f12 * 0.017453292f);
                    float f27 = (((f26 / 2.0f) + f5) * i7) + C1;
                    float f28 = (f13 - f26) * i7;
                    if (f28 < 0.0f) {
                        f28 = 0.0f;
                    }
                    float f29 = f27 + f28;
                    if (f21 < 360.0f || f21 % 360.0f > com.github.mikephil.charting.utils.k.f50664g) {
                        double d10 = f29 * 0.017453292f;
                        f10 = h4;
                        f11 = i7;
                        this.f50579s.lineTo((((float) Math.cos(d10)) * f12) + gVar.f50636d, (f12 * ((float) Math.sin(d10))) + gVar.f50637e);
                        this.f50579s.arcTo(this.f50580t, f29, -f28);
                    } else {
                        this.f50579s.addCircle(gVar.f50636d, gVar.f50637e, f12, Path.Direction.CCW);
                        f10 = h4;
                        f11 = i7;
                    }
                }
                this.f50579s.close();
                this.f50578r.drawPath(this.f50579s, this.f50536c);
            } else {
                i6 = i10;
                rectF = rectF2;
                f6 = T1;
                fArr2 = S1;
                z4 = z5;
                f10 = h4;
                f11 = i7;
                gVar = M1;
            }
            i10 = i6 + 1;
            h4 = f10;
            rectF2 = rectF;
            T1 = f6;
            M1 = gVar;
            i7 = f11;
            S1 = fArr2;
            z5 = z4;
            dVarArr2 = dVarArr;
        }
        com.github.mikephil.charting.utils.g.h(M1);
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void e(Canvas canvas, String str, float f4, float f5, int i4) {
        this.f50539f.setColor(i4);
        canvas.drawText(str, f4, f5, this.f50539f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.g
    public void f(Canvas canvas) {
        int i4;
        List<f8.i> list;
        float f4;
        float[] fArr;
        float[] fArr2;
        float f5;
        float f6;
        float f7;
        com.github.mikephil.charting.utils.g gVar;
        float f10;
        Canvas canvas2;
        boolean z4;
        float f11;
        com.github.mikephil.charting.utils.g gVar2;
        float f12;
        float f13;
        float f14;
        f8.i iVar;
        float f15;
        com.github.mikephil.charting.utils.g gVar3;
        PieEntry pieEntry;
        float f16;
        int i5;
        Canvas canvas3;
        String str;
        s.a aVar;
        String str2;
        Canvas canvas4;
        com.github.mikephil.charting.utils.g gVar4;
        Canvas canvas5 = canvas;
        com.github.mikephil.charting.utils.g M1 = this.f50567g.M1();
        float y12 = this.f50567g.y1();
        float C1 = this.f50567g.C1();
        float[] S1 = this.f50567g.S1();
        float[] L1 = this.f50567g.L1();
        float h4 = this.f50535b.h();
        float i6 = this.f50535b.i();
        float T1 = (y12 - ((this.f50567g.T1() * y12) / 100.0f)) / 2.0f;
        float T12 = this.f50567g.T1() / 100.0f;
        float f17 = (y12 / 10.0f) * 3.6f;
        if (this.f50567g.Z1()) {
            f17 = f4.a(y12, T12, y12, 2.0f);
            if (!this.f50567g.b2() && this.f50567g.a2()) {
                C1 = (float) (((T1 * 360.0f) / (y12 * 6.283185307179586d)) + C1);
            }
        }
        float f18 = C1;
        float f19 = y12 - f17;
        com.github.mikephil.charting.data.r rVar = (com.github.mikephil.charting.data.r) this.f50567g.b();
        List<f8.i> q4 = rVar.q();
        float T = rVar.T();
        boolean Y1 = this.f50567g.Y1();
        canvas.save();
        float e4 = com.github.mikephil.charting.utils.k.e(5.0f);
        int i7 = 0;
        int i10 = 0;
        while (i10 < q4.size()) {
            f8.i iVar2 = q4.get(i10);
            boolean S = iVar2.S();
            if (S || Y1) {
                s.a I0 = iVar2.I0();
                s.a S0 = iVar2.S0();
                a(iVar2);
                int i11 = i7;
                i4 = i10;
                float e5 = com.github.mikephil.charting.utils.k.e(4.0f) + com.github.mikephil.charting.utils.k.a(this.f50539f, ProtectedSandApp.s("쑓"));
                com.github.mikephil.charting.formatter.l u4 = iVar2.u();
                int h12 = iVar2.h1();
                list = q4;
                com.github.mikephil.charting.utils.g gVar5 = M1;
                this.f50570j.setColor(iVar2.E0());
                this.f50570j.setStrokeWidth(com.github.mikephil.charting.utils.k.e(iVar2.y()));
                float v4 = v(iVar2);
                com.github.mikephil.charting.utils.g d5 = com.github.mikephil.charting.utils.g.d(iVar2.i1());
                f4 = T12;
                d5.f50636d = com.github.mikephil.charting.utils.k.e(d5.f50636d);
                d5.f50637e = com.github.mikephil.charting.utils.k.e(d5.f50637e);
                int i12 = 0;
                while (i12 < h12) {
                    com.github.mikephil.charting.utils.g gVar6 = d5;
                    PieEntry w4 = iVar2.w(i12);
                    int i13 = h12;
                    float f20 = ((((S1[i11] - ((v4 / (f19 * 0.017453292f)) / 2.0f)) / 2.0f) + (i11 == 0 ? 0.0f : L1[i11 - 1] * h4)) * i6) + f18;
                    float f21 = v4;
                    String i14 = u4.i(this.f50567g.c2() ? (w4.c() / T) * 100.0f : w4.c(), w4);
                    float[] fArr3 = S1;
                    String o4 = w4.o();
                    com.github.mikephil.charting.formatter.l lVar = u4;
                    double d6 = f20 * 0.017453292f;
                    float[] fArr4 = L1;
                    float f22 = h4;
                    float cos = (float) Math.cos(d6);
                    float f23 = i6;
                    float sin = (float) Math.sin(d6);
                    boolean z5 = Y1 && I0 == s.a.OUTSIDE_SLICE;
                    float f24 = f18;
                    boolean z6 = S && S0 == s.a.OUTSIDE_SLICE;
                    boolean z7 = Y1 && I0 == s.a.INSIDE_SLICE;
                    s.a aVar2 = I0;
                    boolean z10 = S && S0 == s.a.INSIDE_SLICE;
                    if (z5 || z6) {
                        float z11 = iVar2.z();
                        float K = iVar2.K();
                        s.a aVar3 = S0;
                        float c12 = iVar2.c1() / 100.0f;
                        z4 = z7;
                        if (this.f50567g.Z1()) {
                            float f25 = y12 * f4;
                            f11 = androidx.appcompat.graphics.drawable.d.a(y12, f25, c12, f25);
                        } else {
                            f11 = c12 * y12;
                        }
                        float abs = iVar2.T0() ? K * f19 * ((float) Math.abs(Math.sin(d6))) : K * f19;
                        gVar2 = gVar5;
                        float f26 = gVar2.f50636d;
                        float f27 = (f11 * cos) + f26;
                        f12 = y12;
                        float f28 = gVar2.f50637e;
                        float f29 = (f11 * sin) + f28;
                        float f30 = (z11 + 1.0f) * f19;
                        float f31 = (f30 * cos) + f26;
                        float f32 = f28 + (f30 * sin);
                        double d7 = f20 % 360.0d;
                        if (d7 < 90.0d || d7 > 270.0d) {
                            f13 = f31 + abs;
                            Paint paint = this.f50539f;
                            Paint.Align align = Paint.Align.LEFT;
                            paint.setTextAlign(align);
                            if (z5) {
                                this.f50572l.setTextAlign(align);
                            }
                            f14 = f13 + e4;
                        } else {
                            float f33 = f31 - abs;
                            Paint paint2 = this.f50539f;
                            Paint.Align align2 = Paint.Align.RIGHT;
                            paint2.setTextAlign(align2);
                            if (z5) {
                                this.f50572l.setTextAlign(align2);
                            }
                            f13 = f33;
                            f14 = f33 - e4;
                        }
                        if (iVar2.E0() != 1122867) {
                            if (iVar2.X0()) {
                                this.f50570j.setColor(iVar2.G0(i12));
                            }
                            iVar = iVar2;
                            gVar3 = gVar6;
                            pieEntry = w4;
                            f16 = f14;
                            f15 = sin;
                            i5 = i12;
                            canvas.drawLine(f27, f29, f31, f32, this.f50570j);
                            canvas.drawLine(f31, f32, f13, f32, this.f50570j);
                        } else {
                            iVar = iVar2;
                            f15 = sin;
                            gVar3 = gVar6;
                            pieEntry = w4;
                            f16 = f14;
                            i5 = i12;
                        }
                        if (z5 && z6) {
                            e(canvas, i14, f16, f32, iVar.E(i5));
                            if (i5 >= rVar.r() || o4 == null) {
                                aVar = aVar3;
                                canvas4 = canvas;
                                str2 = o4;
                            } else {
                                canvas3 = canvas;
                                float f34 = f16;
                                str = o4;
                                aVar = aVar3;
                                o(canvas3, str, f34, f32 + e5);
                                str2 = str;
                                canvas4 = canvas3;
                            }
                        } else {
                            canvas3 = canvas;
                            float f35 = f16;
                            str = o4;
                            aVar = aVar3;
                            if (z5) {
                                if (i5 < rVar.r() && str != null) {
                                    o(canvas3, str, f35, (e5 / 2.0f) + f32);
                                }
                            } else if (z6) {
                                str2 = str;
                                canvas4 = canvas3;
                                e(canvas, i14, f35, f32 + (e5 / 2.0f), iVar.E(i5));
                            }
                            str2 = str;
                            canvas4 = canvas3;
                        }
                    } else {
                        z4 = z7;
                        f15 = sin;
                        gVar2 = gVar5;
                        gVar3 = gVar6;
                        pieEntry = w4;
                        str2 = o4;
                        i5 = i12;
                        aVar = S0;
                        f12 = y12;
                        canvas4 = canvas;
                        iVar = iVar2;
                    }
                    if (z4 || z10) {
                        float f36 = (f19 * cos) + gVar2.f50636d;
                        float f37 = (f19 * f15) + gVar2.f50637e;
                        this.f50539f.setTextAlign(Paint.Align.CENTER);
                        if (z4 && z10) {
                            e(canvas, i14, f36, f37, iVar.E(i5));
                            if (i5 < rVar.r() && str2 != null) {
                                o(canvas4, str2, f36, f37 + e5);
                            }
                        } else {
                            if (z4) {
                                if (i5 < rVar.r() && str2 != null) {
                                    o(canvas4, str2, f36, (e5 / 2.0f) + f37);
                                }
                            } else if (z10) {
                                e(canvas, i14, f36, (e5 / 2.0f) + f37, iVar.E(i5));
                            }
                            if (pieEntry.b() == null && iVar.q0()) {
                                Drawable b5 = pieEntry.b();
                                gVar4 = gVar3;
                                float f38 = gVar4.f50637e;
                                com.github.mikephil.charting.utils.k.k(canvas, b5, (int) (((f19 + f38) * cos) + gVar2.f50636d), (int) (((f38 + f19) * f15) + gVar2.f50637e + gVar4.f50636d), b5.getIntrinsicWidth(), b5.getIntrinsicHeight());
                            } else {
                                gVar4 = gVar3;
                            }
                            i11++;
                            i12 = i5 + 1;
                            iVar2 = iVar;
                            d5 = gVar4;
                            y12 = f12;
                            h12 = i13;
                            v4 = f21;
                            S0 = aVar;
                            u4 = lVar;
                            L1 = fArr4;
                            h4 = f22;
                            i6 = f23;
                            f18 = f24;
                            I0 = aVar2;
                            gVar5 = gVar2;
                            S1 = fArr3;
                        }
                    }
                    if (pieEntry.b() == null) {
                    }
                    gVar4 = gVar3;
                    i11++;
                    i12 = i5 + 1;
                    iVar2 = iVar;
                    d5 = gVar4;
                    y12 = f12;
                    h12 = i13;
                    v4 = f21;
                    S0 = aVar;
                    u4 = lVar;
                    L1 = fArr4;
                    h4 = f22;
                    i6 = f23;
                    f18 = f24;
                    I0 = aVar2;
                    gVar5 = gVar2;
                    S1 = fArr3;
                }
                fArr = S1;
                fArr2 = L1;
                f5 = h4;
                f6 = i6;
                f7 = f18;
                gVar = gVar5;
                f10 = y12;
                canvas2 = canvas;
                com.github.mikephil.charting.utils.g.h(d5);
                i7 = i11;
            } else {
                i4 = i10;
                list = q4;
                f4 = T12;
                f10 = y12;
                fArr = S1;
                fArr2 = L1;
                f5 = h4;
                f6 = i6;
                f7 = f18;
                canvas2 = canvas5;
                gVar = M1;
            }
            i10 = i4 + 1;
            canvas5 = canvas2;
            M1 = gVar;
            q4 = list;
            y12 = f10;
            T12 = f4;
            S1 = fArr;
            L1 = fArr2;
            h4 = f5;
            i6 = f6;
            f18 = f7;
        }
        com.github.mikephil.charting.utils.g.h(M1);
        canvas.restore();
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void j() {
    }

    protected float l(com.github.mikephil.charting.utils.g gVar, float f4, float f5, float f6, float f7, float f10, float f11) {
        double d5 = (f10 + f11) * 0.017453292f;
        float cos = (((float) Math.cos(d5)) * f4) + gVar.f50636d;
        float sin = (((float) Math.sin(d5)) * f4) + gVar.f50637e;
        double d6 = ((f11 / 2.0f) + f10) * 0.017453292f;
        float cos2 = (((float) Math.cos(d6)) * f4) + gVar.f50636d;
        float sin2 = (((float) Math.sin(d6)) * f4) + gVar.f50637e;
        return (float) ((f4 - ((float) (Math.tan(((180.0d - f5) / 2.0d) * 0.017453292519943295d) * (Math.sqrt(Math.pow(sin - f7, 2.0d) + Math.pow(cos - f6, 2.0d)) / 2.0d)))) - Math.sqrt(Math.pow(sin2 - ((sin + f7) / 2.0f), 2.0d) + Math.pow(cos2 - ((cos + f6) / 2.0f), 2.0d)));
    }

    protected void m(Canvas canvas) {
        float y12;
        com.github.mikephil.charting.utils.g gVar;
        CharSequence N1 = this.f50567g.N1();
        if (!this.f50567g.X1() || N1 == null) {
            return;
        }
        com.github.mikephil.charting.utils.g M1 = this.f50567g.M1();
        com.github.mikephil.charting.utils.g O1 = this.f50567g.O1();
        float f4 = M1.f50636d + O1.f50636d;
        float f5 = M1.f50637e + O1.f50637e;
        if (!this.f50567g.Z1() || this.f50567g.b2()) {
            y12 = this.f50567g.y1();
        } else {
            y12 = (this.f50567g.T1() / 100.0f) * this.f50567g.y1();
        }
        RectF[] rectFArr = this.f50576p;
        RectF rectF = rectFArr[0];
        rectF.left = f4 - y12;
        rectF.top = f5 - y12;
        rectF.right = f4 + y12;
        rectF.bottom = f5 + y12;
        RectF rectF2 = rectFArr[1];
        rectF2.set(rectF);
        float P1 = this.f50567g.P1() / 100.0f;
        if (P1 > com.google.firebase.remoteconfig.p.f60679p) {
            rectF2.inset((rectF2.width() - (rectF2.width() * P1)) / 2.0f, (rectF2.height() - (rectF2.height() * P1)) / 2.0f);
        }
        if (N1.equals(this.f50574n) && rectF2.equals(this.f50575o)) {
            gVar = O1;
        } else {
            this.f50575o.set(rectF2);
            this.f50574n = N1;
            gVar = O1;
            this.f50573m = new StaticLayout(N1, 0, N1.length(), this.f50571k, (int) Math.max(Math.ceil(this.f50575o.width()), 1.0d), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
        float height = this.f50573m.getHeight();
        canvas.save();
        Path path = this.f50582v;
        path.reset();
        path.addOval(rectF, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(rectF2.left, ((rectF2.height() - height) / 2.0f) + rectF2.top);
        this.f50573m.draw(canvas);
        canvas.restore();
        com.github.mikephil.charting.utils.g.h(M1);
        com.github.mikephil.charting.utils.g.h(gVar);
    }

    protected void n(Canvas canvas, f8.i iVar) {
        int i4;
        int i5;
        int i6;
        float f4;
        float f5;
        float[] fArr;
        float f6;
        float f7;
        int i7;
        RectF rectF;
        RectF rectF2;
        com.github.mikephil.charting.utils.g gVar;
        float f10;
        com.github.mikephil.charting.utils.g gVar2;
        int i10;
        float f11;
        com.github.mikephil.charting.utils.g gVar3;
        f8.i iVar2 = iVar;
        float C1 = this.f50567g.C1();
        float h4 = this.f50535b.h();
        float i11 = this.f50535b.i();
        RectF Q1 = this.f50567g.Q1();
        int h12 = iVar.h1();
        float[] S1 = this.f50567g.S1();
        com.github.mikephil.charting.utils.g M1 = this.f50567g.M1();
        float y12 = this.f50567g.y1();
        boolean z4 = this.f50567g.Z1() && !this.f50567g.b2();
        float T1 = z4 ? (this.f50567g.T1() / 100.0f) * y12 : 0.0f;
        float T12 = (y12 - ((this.f50567g.T1() * y12) / 100.0f)) / 2.0f;
        RectF rectF3 = new RectF();
        boolean z5 = z4 && this.f50567g.a2();
        int i12 = 0;
        for (int i13 = 0; i13 < h12; i13++) {
            if (Math.abs(iVar2.w(i13).c()) > com.github.mikephil.charting.utils.k.f50664g) {
                i12++;
            }
        }
        float v4 = i12 <= 1 ? 0.0f : v(iVar2);
        int i14 = 0;
        float f12 = 0.0f;
        while (i14 < h12) {
            float f13 = S1[i14];
            float abs = Math.abs(iVar2.w(i14).c());
            float f14 = com.github.mikephil.charting.utils.k.f50664g;
            if (abs > f14 && (!this.f50567g.d2(i14) || z5)) {
                boolean z6 = v4 > 0.0f && f13 <= 180.0f;
                i4 = h12;
                this.f50536c.setColor(iVar2.G0(i14));
                float f15 = i12 == 1 ? 0.0f : v4 / (y12 * 0.017453292f);
                float f16 = (((f15 / 2.0f) + f12) * i11) + C1;
                float f17 = (f13 - f15) * i11;
                float f18 = f17 < 0.0f ? 0.0f : f17;
                this.f50579s.reset();
                if (z5) {
                    float f19 = y12 - T12;
                    i5 = i14;
                    i6 = i12;
                    double d5 = f16 * 0.017453292f;
                    f4 = C1;
                    f5 = h4;
                    float cos = (((float) Math.cos(d5)) * f19) + M1.f50636d;
                    float sin = (f19 * ((float) Math.sin(d5))) + M1.f50637e;
                    rectF3.set(cos - T12, sin - T12, cos + T12, sin + T12);
                } else {
                    i5 = i14;
                    i6 = i12;
                    f4 = C1;
                    f5 = h4;
                }
                double d6 = f16 * 0.017453292f;
                float f20 = T1;
                float cos2 = (((float) Math.cos(d6)) * y12) + M1.f50636d;
                float sin2 = (((float) Math.sin(d6)) * y12) + M1.f50637e;
                if (f18 < 360.0f || f18 % 360.0f > f14) {
                    fArr = S1;
                    if (z5) {
                        this.f50579s.arcTo(rectF3, f16 + 180.0f, -180.0f);
                    }
                    this.f50579s.arcTo(Q1, f16, f18);
                } else {
                    fArr = S1;
                    this.f50579s.addCircle(M1.f50636d, M1.f50637e, y12, Path.Direction.CW);
                }
                RectF rectF4 = this.f50580t;
                float f21 = M1.f50636d;
                float f22 = M1.f50637e;
                RectF rectF5 = rectF3;
                rectF4.set(f21 - f20, f22 - f20, f21 + f20, f22 + f20);
                if (!z4) {
                    f6 = y12;
                    f7 = f20;
                    i7 = i6;
                    rectF = rectF5;
                    rectF2 = Q1;
                    gVar = M1;
                    f10 = 360.0f;
                } else if (f20 > 0.0f || z6) {
                    if (z6) {
                        i7 = i6;
                        rectF2 = Q1;
                        f7 = f20;
                        i10 = 1;
                        f6 = y12;
                        gVar2 = M1;
                        float l4 = l(M1, y12, f13 * i11, cos2, sin2, f16, f18);
                        if (l4 < 0.0f) {
                            l4 = -l4;
                        }
                        f11 = Math.max(f7, l4);
                    } else {
                        f6 = y12;
                        gVar2 = M1;
                        f7 = f20;
                        i7 = i6;
                        rectF2 = Q1;
                        i10 = 1;
                        f11 = f7;
                    }
                    float f23 = (i7 == i10 || f11 == 0.0f) ? 0.0f : v4 / (f11 * 0.017453292f);
                    float f24 = (((f23 / 2.0f) + f12) * i11) + f4;
                    float f25 = (f13 - f23) * i11;
                    if (f25 < 0.0f) {
                        f25 = 0.0f;
                    }
                    float f26 = f24 + f25;
                    if (f18 < 360.0f || f18 % 360.0f > f14) {
                        if (z5) {
                            float f27 = f6 - T12;
                            double d7 = 0.017453292f * f26;
                            gVar3 = gVar2;
                            float cos3 = (((float) Math.cos(d7)) * f27) + gVar2.f50636d;
                            float sin3 = (f27 * ((float) Math.sin(d7))) + gVar3.f50637e;
                            rectF = rectF5;
                            rectF.set(cos3 - T12, sin3 - T12, cos3 + T12, sin3 + T12);
                            this.f50579s.arcTo(rectF, f26, 180.0f);
                        } else {
                            gVar3 = gVar2;
                            rectF = rectF5;
                            double d10 = f26 * 0.017453292f;
                            this.f50579s.lineTo((((float) Math.cos(d10)) * f11) + gVar3.f50636d, (f11 * ((float) Math.sin(d10))) + gVar3.f50637e);
                        }
                        this.f50579s.arcTo(this.f50580t, f26, -f25);
                    } else {
                        this.f50579s.addCircle(gVar2.f50636d, gVar2.f50637e, f11, Path.Direction.CCW);
                        gVar3 = gVar2;
                        rectF = rectF5;
                    }
                    gVar = gVar3;
                    this.f50579s.close();
                    this.f50578r.drawPath(this.f50579s, this.f50536c);
                    f12 = (f13 * f5) + f12;
                } else {
                    f6 = y12;
                    f7 = f20;
                    i7 = i6;
                    rectF = rectF5;
                    f10 = 360.0f;
                    rectF2 = Q1;
                    gVar = M1;
                }
                if (f18 % f10 > f14) {
                    if (z6) {
                        float l5 = l(gVar, f6, f13 * i11, cos2, sin2, f16, f18);
                        double d11 = 0.017453292f * ((f18 / 2.0f) + f16);
                        this.f50579s.lineTo((((float) Math.cos(d11)) * l5) + gVar.f50636d, (l5 * ((float) Math.sin(d11))) + gVar.f50637e);
                    } else {
                        this.f50579s.lineTo(gVar.f50636d, gVar.f50637e);
                    }
                }
                this.f50579s.close();
                this.f50578r.drawPath(this.f50579s, this.f50536c);
                f12 = (f13 * f5) + f12;
            } else {
                i5 = i14;
                f6 = y12;
                f4 = C1;
                f5 = h4;
                rectF2 = Q1;
                i4 = h12;
                fArr = S1;
                f12 = (f13 * h4) + f12;
                i7 = i12;
                rectF = rectF3;
                f7 = T1;
                gVar = M1;
            }
            i14 = i5 + 1;
            iVar2 = iVar;
            T1 = f7;
            rectF3 = rectF;
            M1 = gVar;
            i12 = i7;
            y12 = f6;
            h12 = i4;
            Q1 = rectF2;
            C1 = f4;
            h4 = f5;
            S1 = fArr;
        }
        com.github.mikephil.charting.utils.g.h(M1);
    }

    protected void o(Canvas canvas, String str, float f4, float f5) {
        canvas.drawText(str, f4, f5, this.f50572l);
    }

    protected void p(Canvas canvas) {
        if (!this.f50567g.Z1() || this.f50578r == null) {
            return;
        }
        float y12 = this.f50567g.y1();
        float T1 = (this.f50567g.T1() / 100.0f) * y12;
        com.github.mikephil.charting.utils.g M1 = this.f50567g.M1();
        if (Color.alpha(this.f50568h.getColor()) > 0) {
            this.f50578r.drawCircle(M1.f50636d, M1.f50637e, T1, this.f50568h);
        }
        if (Color.alpha(this.f50569i.getColor()) > 0 && this.f50567g.W1() > this.f50567g.T1()) {
            int alpha = this.f50569i.getAlpha();
            float W1 = (this.f50567g.W1() / 100.0f) * y12;
            this.f50569i.setAlpha((int) (this.f50535b.i() * this.f50535b.h() * alpha));
            this.f50581u.reset();
            this.f50581u.addCircle(M1.f50636d, M1.f50637e, W1, Path.Direction.CW);
            this.f50581u.addCircle(M1.f50636d, M1.f50637e, T1, Path.Direction.CCW);
            this.f50578r.drawPath(this.f50581u, this.f50569i);
            this.f50569i.setAlpha(alpha);
        }
        com.github.mikephil.charting.utils.g.h(M1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void q(Canvas canvas) {
        float f4;
        float[] fArr;
        float f5;
        if (this.f50567g.a2()) {
            f8.i Q = ((com.github.mikephil.charting.data.r) this.f50567g.b()).Q();
            if (Q.isVisible()) {
                float h4 = this.f50535b.h();
                float i4 = this.f50535b.i();
                com.github.mikephil.charting.utils.g M1 = this.f50567g.M1();
                float y12 = this.f50567g.y1();
                float T1 = (y12 - ((this.f50567g.T1() * y12) / 100.0f)) / 2.0f;
                float[] S1 = this.f50567g.S1();
                float C1 = this.f50567g.C1();
                int i5 = 0;
                while (i5 < Q.h1()) {
                    float f6 = S1[i5];
                    if (Math.abs(Q.w(i5).c()) > com.github.mikephil.charting.utils.k.f50664g) {
                        double d5 = y12 - T1;
                        double d6 = (C1 + f6) * i4;
                        f4 = i4;
                        fArr = S1;
                        f5 = C1;
                        float cos = (float) (M1.f50636d + (Math.cos(Math.toRadians(d6)) * d5));
                        float sin = (float) ((Math.sin(Math.toRadians(d6)) * d5) + M1.f50637e);
                        this.f50536c.setColor(Q.G0(i5));
                        this.f50578r.drawCircle(cos, sin, T1, this.f50536c);
                    } else {
                        f4 = i4;
                        fArr = S1;
                        f5 = C1;
                    }
                    C1 = (f6 * h4) + f5;
                    i5++;
                    i4 = f4;
                    S1 = fArr;
                }
                com.github.mikephil.charting.utils.g.h(M1);
            }
        }
    }

    public TextPaint r() {
        return this.f50571k;
    }

    public Paint s() {
        return this.f50572l;
    }

    public Paint t() {
        return this.f50568h;
    }

    public Paint u() {
        return this.f50569i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected float v(f8.i iVar) {
        if (!iVar.v()) {
            return iVar.g0();
        }
        if (iVar.g0() / this.f50589a.y() > (iVar.p() / ((com.github.mikephil.charting.data.r) this.f50567g.b()).T()) * 2.0f) {
            return 0.0f;
        }
        return iVar.g0();
    }

    public void w() {
        Canvas canvas = this.f50578r;
        if (canvas != null) {
            canvas.setBitmap(null);
            this.f50578r = null;
        }
        WeakReference<Bitmap> weakReference = this.f50577q;
        if (weakReference != null) {
            Bitmap bitmap = weakReference.get();
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f50577q.clear();
            this.f50577q = null;
        }
    }
}
