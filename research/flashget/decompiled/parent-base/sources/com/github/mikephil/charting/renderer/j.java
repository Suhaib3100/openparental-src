package com.github.mikephil.charting.renderer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.o;
import com.github.mikephil.charting.renderer.c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* compiled from: LineChartRenderer.java */
/* loaded from: classes5.dex */
public class j extends k {

    /* renamed from: i, reason: collision with root package name */
    protected e8.g f50551i;

    /* renamed from: j, reason: collision with root package name */
    protected Paint f50552j;

    /* renamed from: k, reason: collision with root package name */
    protected WeakReference<Bitmap> f50553k;

    /* renamed from: l, reason: collision with root package name */
    protected Canvas f50554l;

    /* renamed from: m, reason: collision with root package name */
    protected Bitmap.Config f50555m;

    /* renamed from: n, reason: collision with root package name */
    protected Path f50556n;

    /* renamed from: o, reason: collision with root package name */
    protected Path f50557o;

    /* renamed from: p, reason: collision with root package name */
    private float[] f50558p;

    /* renamed from: q, reason: collision with root package name */
    protected Path f50559q;

    /* renamed from: r, reason: collision with root package name */
    private HashMap<f8.e, b> f50560r;

    /* renamed from: s, reason: collision with root package name */
    private float[] f50561s;

    /* compiled from: LineChartRenderer.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50562a;

        static {
            int[] iArr = new int[o.a.values().length];
            f50562a = iArr;
            try {
                iArr[o.a.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50562a[o.a.STEPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50562a[o.a.CUBIC_BEZIER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50562a[o.a.HORIZONTAL_BEZIER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public j(e8.g gVar, com.github.mikephil.charting.animation.a aVar, com.github.mikephil.charting.utils.l lVar) {
        super(aVar, lVar);
        this.f50555m = Bitmap.Config.ARGB_8888;
        this.f50556n = new Path();
        this.f50557o = new Path();
        this.f50558p = new float[4];
        this.f50559q = new Path();
        this.f50560r = new HashMap<>();
        this.f50561s = new float[2];
        this.f50551i = gVar;
        Paint paint = new Paint(1);
        this.f50552j = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f50552j.setColor(-1);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.github.mikephil.charting.data.Entry, com.github.mikephil.charting.data.f] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.github.mikephil.charting.data.Entry, com.github.mikephil.charting.data.f] */
    private void y(f8.f fVar, int i4, int i5, Path path) {
        float a5 = fVar.k0().a(fVar, this.f50551i);
        float i6 = this.f50535b.i();
        boolean z4 = fVar.F0() == o.a.STEPPED;
        path.reset();
        ?? w4 = fVar.w(i4);
        path.moveTo(w4.j(), a5);
        path.lineTo(w4.j(), w4.c() * i6);
        int i7 = i4 + 1;
        Entry entry = null;
        com.github.mikephil.charting.data.f fVar2 = w4;
        while (i7 <= i5) {
            ?? w5 = fVar.w(i7);
            if (z4) {
                path.lineTo(w5.j(), fVar2.c() * i6);
            }
            path.lineTo(w5.j(), w5.c() * i6);
            i7++;
            fVar2 = w5;
            entry = w5;
        }
        if (entry != null) {
            path.lineTo(entry.j(), a5);
        }
        path.close();
    }

    public void A() {
        Canvas canvas = this.f50554l;
        if (canvas != null) {
            canvas.setBitmap(null);
            this.f50554l = null;
        }
        WeakReference<Bitmap> weakReference = this.f50553k;
        if (weakReference != null) {
            Bitmap bitmap = weakReference.get();
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f50553k.clear();
            this.f50553k = null;
        }
    }

    public void B(Bitmap.Config config) {
        this.f50555m = config;
        A();
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void b(Canvas canvas) {
        int o4 = (int) this.f50589a.o();
        int n4 = (int) this.f50589a.n();
        WeakReference<Bitmap> weakReference = this.f50553k;
        Bitmap bitmap = weakReference == null ? null : weakReference.get();
        if (bitmap == null || bitmap.getWidth() != o4 || bitmap.getHeight() != n4) {
            if (o4 <= 0 || n4 <= 0) {
                return;
            }
            bitmap = Bitmap.createBitmap(o4, n4, this.f50555m);
            this.f50553k = new WeakReference<>(bitmap);
            this.f50554l = new Canvas(bitmap);
        }
        bitmap.eraseColor(0);
        for (T t4 : this.f50551i.r().q()) {
            if (t4.isVisible()) {
                u(canvas, t4);
            }
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f50536c);
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void c(Canvas canvas) {
        r(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.github.mikephil.charting.data.Entry, com.github.mikephil.charting.data.f] */
    @Override // com.github.mikephil.charting.renderer.g
    public void d(Canvas canvas, com.github.mikephil.charting.highlight.d[] dVarArr) {
        com.github.mikephil.charting.data.n r4 = this.f50551i.r();
        for (com.github.mikephil.charting.highlight.d dVar : dVarArr) {
            f8.f fVar = (f8.f) r4.k(dVar.d());
            if (fVar != null && fVar.k1()) {
                ?? o02 = fVar.o0(dVar.h(), dVar.j());
                if (l(o02, fVar)) {
                    com.github.mikephil.charting.utils.f f4 = this.f50551i.d(fVar.U()).f(o02.j(), this.f50535b.i() * o02.c());
                    dVar.n((float) f4.f50632d, (float) f4.f50633e);
                    n(canvas, (float) f4.f50632d, (float) f4.f50633e, fVar);
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void e(Canvas canvas, String str, float f4, float f5, int i4) {
        this.f50539f.setColor(i4);
        canvas.drawText(str, f4, f5, this.f50539f);
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void f(Canvas canvas) {
        int i4;
        f8.f fVar;
        Entry entry;
        if (k(this.f50551i)) {
            List<T> q4 = this.f50551i.r().q();
            for (int i5 = 0; i5 < q4.size(); i5++) {
                f8.f fVar2 = (f8.f) q4.get(i5);
                if (m(fVar2) && fVar2.h1() >= 1) {
                    a(fVar2);
                    com.github.mikephil.charting.utils.i d5 = this.f50551i.d(fVar2.U());
                    int C0 = (int) (fVar2.C0() * 1.75f);
                    if (!fVar2.j1()) {
                        C0 /= 2;
                    }
                    int i6 = C0;
                    this.f50516g.a(this.f50551i, fVar2);
                    float h4 = this.f50535b.h();
                    float i7 = this.f50535b.i();
                    c.a aVar = this.f50516g;
                    float[] c5 = d5.c(fVar2, h4, i7, aVar.f50517a, aVar.f50518b);
                    com.github.mikephil.charting.formatter.l u4 = fVar2.u();
                    com.github.mikephil.charting.utils.g d6 = com.github.mikephil.charting.utils.g.d(fVar2.i1());
                    d6.f50636d = com.github.mikephil.charting.utils.k.e(d6.f50636d);
                    d6.f50637e = com.github.mikephil.charting.utils.k.e(d6.f50637e);
                    int i10 = 0;
                    while (i10 < c5.length) {
                        float f4 = c5[i10];
                        float f5 = c5[i10 + 1];
                        if (!this.f50589a.J(f4)) {
                            break;
                        }
                        if (this.f50589a.I(f4) && this.f50589a.M(f5)) {
                            int i11 = i10 / 2;
                            Entry w4 = fVar2.w(this.f50516g.f50517a + i11);
                            if (fVar2.S()) {
                                entry = w4;
                                i4 = i6;
                                fVar = fVar2;
                                e(canvas, u4.j(w4), f4, f5 - i6, fVar2.E(i11));
                            } else {
                                entry = w4;
                                i4 = i6;
                                fVar = fVar2;
                            }
                            if (entry.b() != null && fVar.q0()) {
                                Drawable b5 = entry.b();
                                com.github.mikephil.charting.utils.k.k(canvas, b5, (int) (f4 + d6.f50636d), (int) (f5 + d6.f50637e), b5.getIntrinsicWidth(), b5.getIntrinsicHeight());
                            }
                        } else {
                            i4 = i6;
                            fVar = fVar2;
                        }
                        i10 += 2;
                        fVar2 = fVar;
                        i6 = i4;
                    }
                    com.github.mikephil.charting.utils.g.h(d6);
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void j() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.github.mikephil.charting.data.Entry, com.github.mikephil.charting.data.f] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    protected void r(Canvas canvas) {
        b bVar;
        Bitmap b5;
        this.f50536c.setStyle(Paint.Style.FILL);
        float i4 = this.f50535b.i();
        float[] fArr = this.f50561s;
        boolean z4 = false;
        float f4 = 0.0f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        List q4 = this.f50551i.r().q();
        int i5 = 0;
        while (i5 < q4.size()) {
            f8.f fVar = (f8.f) q4.get(i5);
            if (fVar.isVisible() && fVar.j1() && fVar.h1() != 0) {
                this.f50552j.setColor(fVar.n());
                com.github.mikephil.charting.utils.i d5 = this.f50551i.d(fVar.U());
                this.f50516g.a(this.f50551i, fVar);
                float C0 = fVar.C0();
                float l12 = fVar.l1();
                boolean z5 = (!fVar.s1() || l12 >= C0 || l12 <= f4) ? z4 ? 1 : 0 : true;
                boolean z6 = (z5 && fVar.n() == 1122867) ? true : z4 ? 1 : 0;
                a aVar = null;
                if (this.f50560r.containsKey(fVar)) {
                    bVar = this.f50560r.get(fVar);
                } else {
                    bVar = new b(this, aVar);
                    this.f50560r.put(fVar, bVar);
                }
                if (bVar.c(fVar)) {
                    bVar.a(fVar, z5, z6);
                }
                c.a aVar2 = this.f50516g;
                int i6 = aVar2.f50519c;
                int i7 = aVar2.f50517a;
                int i10 = i6 + i7;
                ?? r32 = z4;
                while (i7 <= i10) {
                    ?? w4 = fVar.w(i7);
                    if (w4 == 0) {
                        break;
                    }
                    this.f50561s[r32] = w4.j();
                    this.f50561s[1] = w4.c() * i4;
                    d5.o(this.f50561s);
                    if (!this.f50589a.J(this.f50561s[r32])) {
                        break;
                    }
                    if (this.f50589a.I(this.f50561s[r32]) && this.f50589a.M(this.f50561s[1]) && (b5 = bVar.b(i7)) != null) {
                        float[] fArr2 = this.f50561s;
                        canvas.drawBitmap(b5, fArr2[r32] - C0, fArr2[1] - C0, (Paint) null);
                    }
                    i7++;
                    r32 = 0;
                }
            }
            i5++;
            z4 = false;
            f4 = 0.0f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.github.mikephil.charting.data.Entry, com.github.mikephil.charting.data.f] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.github.mikephil.charting.data.Entry, com.github.mikephil.charting.data.f] */
    protected void s(f8.f fVar) {
        float i4 = this.f50535b.i();
        com.github.mikephil.charting.utils.i d5 = this.f50551i.d(fVar.U());
        this.f50516g.a(this.f50551i, fVar);
        float r4 = fVar.r();
        this.f50556n.reset();
        c.a aVar = this.f50516g;
        if (aVar.f50519c >= 1) {
            int i5 = aVar.f50517a;
            T w4 = fVar.w(Math.max(i5 - 1, 0));
            ?? w5 = fVar.w(Math.max(i5, 0));
            if (w5 != 0) {
                this.f50556n.moveTo(w5.j(), w5.c() * i4);
                int i6 = this.f50516g.f50517a + 1;
                int i7 = -1;
                Entry entry = w5;
                Entry entry2 = w5;
                Entry entry3 = w4;
                while (true) {
                    c.a aVar2 = this.f50516g;
                    Entry entry4 = entry2;
                    if (i6 > aVar2.f50519c + aVar2.f50517a) {
                        break;
                    }
                    if (i7 != i6) {
                        entry4 = fVar.w(i6);
                    }
                    int i10 = i6 + 1;
                    if (i10 < fVar.h1()) {
                        i6 = i10;
                    }
                    ?? w6 = fVar.w(i6);
                    this.f50556n.cubicTo(entry.j() + ((entry4.j() - entry3.j()) * r4), (entry.c() + ((entry4.c() - entry3.c()) * r4)) * i4, entry4.j() - ((w6.j() - entry.j()) * r4), (entry4.c() - ((w6.c() - entry.c()) * r4)) * i4, entry4.j(), entry4.c() * i4);
                    entry3 = entry;
                    entry = entry4;
                    entry2 = w6;
                    int i11 = i6;
                    i6 = i10;
                    i7 = i11;
                }
            } else {
                return;
            }
        }
        if (fVar.D0()) {
            this.f50557o.reset();
            this.f50557o.addPath(this.f50556n);
            t(this.f50554l, fVar, this.f50557o, d5, this.f50516g);
        }
        this.f50536c.setColor(fVar.Y());
        this.f50536c.setStyle(Paint.Style.STROKE);
        d5.l(this.f50556n);
        this.f50554l.drawPath(this.f50556n, this.f50536c);
        this.f50536c.setPathEffect(null);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.github.mikephil.charting.data.Entry] */
    protected void t(Canvas canvas, f8.f fVar, Path path, com.github.mikephil.charting.utils.i iVar, c.a aVar) {
        float a5 = fVar.k0().a(fVar, this.f50551i);
        path.lineTo(fVar.w(aVar.f50517a + aVar.f50519c).j(), a5);
        path.lineTo(fVar.w(aVar.f50517a).j(), a5);
        path.close();
        iVar.l(path);
        Drawable t4 = fVar.t();
        if (t4 != null) {
            q(canvas, path, t4);
        } else {
            p(canvas, path, fVar.f0(), fVar.e());
        }
    }

    protected void u(Canvas canvas, f8.f fVar) {
        if (fVar.h1() < 1) {
            return;
        }
        this.f50536c.setStrokeWidth(fVar.i());
        this.f50536c.setPathEffect(fVar.w0());
        int i4 = a.f50562a[fVar.F0().ordinal()];
        if (i4 == 3) {
            s(fVar);
        } else if (i4 != 4) {
            w(canvas, fVar);
        } else {
            v(fVar);
        }
        this.f50536c.setPathEffect(null);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [com.github.mikephil.charting.data.Entry, com.github.mikephil.charting.data.f] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.github.mikephil.charting.data.Entry, com.github.mikephil.charting.data.f] */
    protected void v(f8.f fVar) {
        float i4 = this.f50535b.i();
        com.github.mikephil.charting.utils.i d5 = this.f50551i.d(fVar.U());
        this.f50516g.a(this.f50551i, fVar);
        this.f50556n.reset();
        c.a aVar = this.f50516g;
        if (aVar.f50519c >= 1) {
            ?? w4 = fVar.w(aVar.f50517a);
            this.f50556n.moveTo(w4.j(), w4.c() * i4);
            int i5 = this.f50516g.f50517a + 1;
            Entry entry = w4;
            while (true) {
                c.a aVar2 = this.f50516g;
                if (i5 > aVar2.f50519c + aVar2.f50517a) {
                    break;
                }
                ?? w5 = fVar.w(i5);
                float j4 = ((w5.j() - entry.j()) / 2.0f) + entry.j();
                this.f50556n.cubicTo(j4, entry.c() * i4, j4, w5.c() * i4, w5.j(), w5.c() * i4);
                i5++;
                entry = w5;
            }
        }
        if (fVar.D0()) {
            this.f50557o.reset();
            this.f50557o.addPath(this.f50556n);
            t(this.f50554l, fVar, this.f50557o, d5, this.f50516g);
        }
        this.f50536c.setColor(fVar.Y());
        this.f50536c.setStyle(Paint.Style.STROKE);
        d5.l(this.f50556n);
        this.f50554l.drawPath(this.f50556n, this.f50536c);
        this.f50536c.setPathEffect(null);
    }

    /* JADX WARN: Type inference failed for: r12v11, types: [com.github.mikephil.charting.data.Entry, com.github.mikephil.charting.data.f] */
    /* JADX WARN: Type inference failed for: r13v5, types: [com.github.mikephil.charting.data.Entry, com.github.mikephil.charting.data.f] */
    /* JADX WARN: Type inference failed for: r8v22, types: [com.github.mikephil.charting.data.Entry, com.github.mikephil.charting.data.f] */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.github.mikephil.charting.data.Entry, com.github.mikephil.charting.data.f] */
    protected void w(Canvas canvas, f8.f fVar) {
        int h12 = fVar.h1();
        boolean z4 = fVar.F0() == o.a.STEPPED;
        int i4 = z4 ? 4 : 2;
        com.github.mikephil.charting.utils.i d5 = this.f50551i.d(fVar.U());
        float i5 = this.f50535b.i();
        this.f50536c.setStyle(Paint.Style.STROKE);
        Canvas canvas2 = fVar.l() ? this.f50554l : canvas;
        this.f50516g.a(this.f50551i, fVar);
        if (fVar.D0() && h12 > 0) {
            x(canvas, fVar, d5, this.f50516g);
        }
        if (fVar.I().size() > 1) {
            int i6 = i4 * 2;
            if (this.f50558p.length <= i6) {
                this.f50558p = new float[i4 * 4];
            }
            int i7 = this.f50516g.f50517a;
            while (true) {
                c.a aVar = this.f50516g;
                if (i7 > aVar.f50519c + aVar.f50517a) {
                    break;
                }
                ?? w4 = fVar.w(i7);
                if (w4 != 0) {
                    this.f50558p[0] = w4.j();
                    this.f50558p[1] = w4.c() * i5;
                    if (i7 < this.f50516g.f50518b) {
                        ?? w5 = fVar.w(i7 + 1);
                        if (w5 == 0) {
                            break;
                        }
                        if (z4) {
                            this.f50558p[2] = w5.j();
                            float[] fArr = this.f50558p;
                            float f4 = fArr[1];
                            fArr[3] = f4;
                            fArr[4] = fArr[2];
                            fArr[5] = f4;
                            fArr[6] = w5.j();
                            this.f50558p[7] = w5.c() * i5;
                        } else {
                            this.f50558p[2] = w5.j();
                            this.f50558p[3] = w5.c() * i5;
                        }
                    } else {
                        float[] fArr2 = this.f50558p;
                        fArr2[2] = fArr2[0];
                        fArr2[3] = fArr2[1];
                    }
                    d5.o(this.f50558p);
                    if (!this.f50589a.J(this.f50558p[0])) {
                        break;
                    }
                    if (this.f50589a.I(this.f50558p[2]) && (this.f50589a.K(this.f50558p[1]) || this.f50589a.H(this.f50558p[3]))) {
                        this.f50536c.setColor(fVar.G0(i7));
                        canvas2.drawLines(this.f50558p, 0, i6, this.f50536c);
                    }
                }
                i7++;
            }
        } else {
            int i10 = h12 * i4;
            if (this.f50558p.length < Math.max(i10, i4) * 2) {
                this.f50558p = new float[Math.max(i10, i4) * 4];
            }
            if (fVar.w(this.f50516g.f50517a) != 0) {
                int i11 = this.f50516g.f50517a;
                int i12 = 0;
                while (true) {
                    c.a aVar2 = this.f50516g;
                    if (i11 > aVar2.f50519c + aVar2.f50517a) {
                        break;
                    }
                    ?? w6 = fVar.w(i11 == 0 ? 0 : i11 - 1);
                    ?? w7 = fVar.w(i11);
                    if (w6 != 0 && w7 != 0) {
                        this.f50558p[i12] = w6.j();
                        int i13 = i12 + 2;
                        this.f50558p[i12 + 1] = w6.c() * i5;
                        if (z4) {
                            this.f50558p[i13] = w7.j();
                            this.f50558p[i12 + 3] = w6.c() * i5;
                            this.f50558p[i12 + 4] = w7.j();
                            i13 = i12 + 6;
                            this.f50558p[i12 + 5] = w6.c() * i5;
                        }
                        this.f50558p[i13] = w7.j();
                        this.f50558p[i13 + 1] = w7.c() * i5;
                        i12 = i13 + 2;
                    }
                    i11++;
                }
                if (i12 > 0) {
                    d5.o(this.f50558p);
                    int max = Math.max((this.f50516g.f50519c + 1) * i4, i4) * 2;
                    this.f50536c.setColor(fVar.Y());
                    canvas2.drawLines(this.f50558p, 0, max, this.f50536c);
                }
            }
        }
        this.f50536c.setPathEffect(null);
    }

    protected void x(Canvas canvas, f8.f fVar, com.github.mikephil.charting.utils.i iVar, c.a aVar) {
        int i4;
        int i5;
        Path path = this.f50559q;
        int i6 = aVar.f50517a;
        int i7 = aVar.f50519c + i6;
        int i10 = 0;
        do {
            i4 = (i10 * 128) + i6;
            i5 = i4 + 128;
            if (i5 > i7) {
                i5 = i7;
            }
            if (i4 <= i5) {
                y(fVar, i4, i5, path);
                iVar.l(path);
                Drawable t4 = fVar.t();
                if (t4 != null) {
                    q(canvas, path, t4);
                } else {
                    p(canvas, path, fVar.f0(), fVar.e());
                }
            }
            i10++;
        } while (i4 <= i5);
    }

    public Bitmap.Config z() {
        return this.f50555m;
    }

    /* compiled from: LineChartRenderer.java */
    private class b {

        /* renamed from: a, reason: collision with root package name */
        private Path f50563a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap[] f50564b;

        private b() {
            this.f50563a = new Path();
        }

        protected void a(f8.f fVar, boolean z4, boolean z5) {
            int e02 = fVar.e0();
            float C0 = fVar.C0();
            float l12 = fVar.l1();
            for (int i4 = 0; i4 < e02; i4++) {
                int i5 = (int) (C0 * 2.1d);
                Bitmap createBitmap = Bitmap.createBitmap(i5, i5, Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(createBitmap);
                this.f50564b[i4] = createBitmap;
                j.this.f50536c.setColor(fVar.g1(i4));
                if (z5) {
                    this.f50563a.reset();
                    this.f50563a.addCircle(C0, C0, C0, Path.Direction.CW);
                    this.f50563a.addCircle(C0, C0, l12, Path.Direction.CCW);
                    canvas.drawPath(this.f50563a, j.this.f50536c);
                } else {
                    canvas.drawCircle(C0, C0, C0, j.this.f50536c);
                    if (z4) {
                        canvas.drawCircle(C0, C0, l12, j.this.f50552j);
                    }
                }
            }
        }

        protected Bitmap b(int i4) {
            Bitmap[] bitmapArr = this.f50564b;
            return bitmapArr[i4 % bitmapArr.length];
        }

        protected boolean c(f8.f fVar) {
            int e02 = fVar.e0();
            Bitmap[] bitmapArr = this.f50564b;
            if (bitmapArr == null) {
                this.f50564b = new Bitmap[e02];
                return true;
            }
            if (bitmapArr.length == e02) {
                return false;
            }
            this.f50564b = new Bitmap[e02];
            return true;
        }

        /* synthetic */ b(j jVar, a aVar) {
            this();
        }
    }
}
