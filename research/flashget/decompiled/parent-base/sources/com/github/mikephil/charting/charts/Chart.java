package com.github.mikephil.charting.charts;

import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.x0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.mikephil.charting.animation.b;
import com.github.mikephil.charting.components.c;
import com.github.mikephil.charting.components.j;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.k;
import com.github.mikephil.charting.highlight.d;
import com.github.mikephil.charting.highlight.f;
import com.github.mikephil.charting.renderer.g;
import com.github.mikephil.charting.renderer.i;
import com.github.mikephil.charting.utils.l;
import f8.e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class Chart<T extends k<? extends e<? extends Entry>>> extends ViewGroup implements e8.e {
    public static final String H = ProtectedSandApp.s("쉺");
    public static final int I = 4;
    public static final int J = 7;
    public static final int K = 11;
    public static final int L = 13;
    public static final int M = 14;
    public static final int N = 18;
    private boolean A;
    protected d[] B;
    protected float C;
    protected boolean D;
    protected com.github.mikephil.charting.components.d E;
    protected ArrayList<Runnable> F;
    private boolean G;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f50232b;

    /* renamed from: c, reason: collision with root package name */
    protected T f50233c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f50234d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f50235e;

    /* renamed from: f, reason: collision with root package name */
    private float f50236f;

    /* renamed from: g, reason: collision with root package name */
    protected com.github.mikephil.charting.formatter.d f50237g;

    /* renamed from: h, reason: collision with root package name */
    protected Paint f50238h;

    /* renamed from: i, reason: collision with root package name */
    protected Paint f50239i;

    /* renamed from: j, reason: collision with root package name */
    protected j f50240j;

    /* renamed from: k, reason: collision with root package name */
    protected boolean f50241k;

    /* renamed from: l, reason: collision with root package name */
    protected c f50242l;

    /* renamed from: m, reason: collision with root package name */
    protected com.github.mikephil.charting.components.e f50243m;

    /* renamed from: n, reason: collision with root package name */
    protected com.github.mikephil.charting.listener.d f50244n;

    /* renamed from: o, reason: collision with root package name */
    protected com.github.mikephil.charting.listener.b f50245o;

    /* renamed from: p, reason: collision with root package name */
    private String f50246p;

    /* renamed from: q, reason: collision with root package name */
    private com.github.mikephil.charting.listener.c f50247q;

    /* renamed from: r, reason: collision with root package name */
    protected i f50248r;

    /* renamed from: s, reason: collision with root package name */
    protected g f50249s;

    /* renamed from: t, reason: collision with root package name */
    protected f f50250t;

    /* renamed from: u, reason: collision with root package name */
    protected l f50251u;

    /* renamed from: v, reason: collision with root package name */
    protected com.github.mikephil.charting.animation.a f50252v;

    /* renamed from: w, reason: collision with root package name */
    private float f50253w;

    /* renamed from: x, reason: collision with root package name */
    private float f50254x;

    /* renamed from: y, reason: collision with root package name */
    private float f50255y;

    /* renamed from: z, reason: collision with root package name */
    private float f50256z;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            Chart.this.postInvalidate();
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50258a;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            f50258a = iArr;
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50258a[Bitmap.CompressFormat.WEBP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50258a[Bitmap.CompressFormat.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Chart(Context context) {
        super(context);
        this.f50232b = false;
        this.f50233c = null;
        this.f50234d = true;
        this.f50235e = true;
        this.f50236f = 0.9f;
        this.f50237g = new com.github.mikephil.charting.formatter.d(0);
        this.f50241k = true;
        this.f50246p = ProtectedSandApp.s("쉧");
        this.f50251u = new l();
        this.f50253w = 0.0f;
        this.f50254x = 0.0f;
        this.f50255y = 0.0f;
        this.f50256z = 0.0f;
        this.A = false;
        this.C = 0.0f;
        this.D = true;
        this.F = new ArrayList<>();
        this.G = false;
        y0();
    }

    private void p1(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        int i4 = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i4 >= viewGroup.getChildCount()) {
                viewGroup.removeAllViews();
                return;
            } else {
                p1(viewGroup.getChildAt(i4));
                i4++;
            }
        }
    }

    public void A(Runnable runnable) {
        if (this.f50251u.B()) {
            post(runnable);
        } else {
            this.F.add(runnable);
        }
    }

    @Deprecated
    public boolean A0() {
        return B0();
    }

    @x0(11)
    public void B(int i4) {
        this.f50252v.a(i4);
    }

    public boolean B0() {
        return this.D;
    }

    @x0(11)
    public void C(int i4, b.c0 c0Var) {
        this.f50252v.b(i4, c0Var);
    }

    public boolean C0() {
        T t4 = this.f50233c;
        return t4 == null || t4.r() <= 0;
    }

    @x0(11)
    public void D(int i4, int i5) {
        this.f50252v.c(i4, i5);
    }

    public boolean D0() {
        return this.f50234d;
    }

    @x0(11)
    public void E(int i4, int i5, b.c0 c0Var) {
        this.f50252v.d(i4, i5, c0Var);
    }

    public boolean E0() {
        return this.f50232b;
    }

    @x0(11)
    public void F(int i4, int i5, b.c0 c0Var, b.c0 c0Var2) {
        this.f50252v.e(i4, i5, c0Var, c0Var2);
    }

    public abstract void F0();

    @x0(11)
    public void G(int i4) {
        this.f50252v.f(i4);
    }

    public void G0(Runnable runnable) {
        this.F.remove(runnable);
    }

    @x0(11)
    public void H(int i4, b.c0 c0Var) {
        this.f50252v.g(i4, c0Var);
    }

    public boolean H0(String str) {
        return J0(str, "", ProtectedSandApp.s("쉨"), Bitmap.CompressFormat.PNG, 40);
    }

    protected abstract void I();

    public boolean I0(String str, int i4) {
        return J0(str, "", ProtectedSandApp.s("쉨"), Bitmap.CompressFormat.PNG, i4);
    }

    protected abstract void J();

    public boolean J0(String str, String str2, String str3, Bitmap.CompressFormat compressFormat, int i4) {
        String s4;
        if (i4 < 0 || i4 > 100) {
            i4 = 50;
        }
        long currentTimeMillis = System.currentTimeMillis();
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + ProtectedSandApp.s("쉩") + str2);
        if (!file.exists() && !file.mkdirs()) {
            return false;
        }
        int i5 = b.f50258a[compressFormat.ordinal()];
        if (i5 == 1) {
            String s5 = ProtectedSandApp.s("쉯");
            boolean endsWith = str.endsWith(s5);
            s4 = ProtectedSandApp.s("쉰");
            if (!endsWith) {
                str = str.concat(s5);
            }
        } else if (i5 != 2) {
            String s6 = ProtectedSandApp.s("쉪");
            boolean endsWith2 = str.endsWith(s6);
            s4 = ProtectedSandApp.s("쉫");
            if (!endsWith2 && !str.endsWith(ProtectedSandApp.s("쉬"))) {
                str = str.concat(s6);
            }
        } else {
            String s7 = ProtectedSandApp.s("쉭");
            boolean endsWith3 = str.endsWith(s7);
            s4 = ProtectedSandApp.s("쉮");
            if (!endsWith3) {
                str = str.concat(s7);
            }
        }
        String str4 = file.getAbsolutePath() + ProtectedSandApp.s("쉱") + str;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str4);
            T().compress(compressFormat, i4, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            long length = new File(str4).length();
            ContentValues contentValues = new ContentValues(8);
            contentValues.put(ProtectedSandApp.s("쉲"), str);
            contentValues.put(ProtectedSandApp.s("쉳"), str);
            contentValues.put(ProtectedSandApp.s("쉴"), Long.valueOf(currentTimeMillis));
            contentValues.put(ProtectedSandApp.s("쉵"), s4);
            contentValues.put(ProtectedSandApp.s("쉶"), str3);
            contentValues.put(ProtectedSandApp.s("쉷"), (Integer) 0);
            contentValues.put(ProtectedSandApp.s("쉸"), str4);
            contentValues.put(ProtectedSandApp.s("쉹"), Long.valueOf(length));
            return getContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues) != null;
        } catch (IOException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public void K() {
        this.f50233c = null;
        this.A = false;
        this.B = null;
        this.f50245o.f(null);
        invalidate();
    }

    public boolean K0(String str, String str2) {
        Bitmap T = T();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(Environment.getExternalStorageDirectory().getPath() + str2 + ProtectedSandApp.s("쉱") + str + ProtectedSandApp.s("쉯"));
            T.compress(Bitmap.CompressFormat.PNG, 40, fileOutputStream);
            fileOutputStream.close();
            return true;
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public void L() {
        this.F.clear();
    }

    public void L0(T t4) {
        this.f50233c = t4;
        this.A = false;
        if (t4 == null) {
            return;
        }
        o1(t4.B(), t4.z());
        for (e eVar : this.f50233c.q()) {
            if (eVar.L0() || eVar.u() == this.f50237g) {
                eVar.P0(this.f50237g);
            }
        }
        F0();
    }

    public void M() {
        this.f50233c.h();
        invalidate();
    }

    public void M0(c cVar) {
        this.f50242l = cVar;
    }

    public void N() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public void N0(boolean z4) {
        this.f50235e = z4;
    }

    protected void O(Canvas canvas) {
        float f4;
        float f5;
        c cVar = this.f50242l;
        if (cVar == null || !cVar.f()) {
            return;
        }
        com.github.mikephil.charting.utils.g m4 = this.f50242l.m();
        this.f50238h.setTypeface(this.f50242l.c());
        this.f50238h.setTextSize(this.f50242l.b());
        this.f50238h.setColor(this.f50242l.a());
        this.f50238h.setTextAlign(this.f50242l.o());
        if (m4 == null) {
            f5 = (getWidth() - this.f50251u.Q()) - this.f50242l.d();
            f4 = (getHeight() - this.f50251u.O()) - this.f50242l.e();
        } else {
            float f6 = m4.f50636d;
            f4 = m4.f50637e;
            f5 = f6;
        }
        canvas.drawText(this.f50242l.n(), f5, f4, this.f50238h);
    }

    public void O0(float f4) {
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 >= 1.0f) {
            f4 = 0.999f;
        }
        this.f50236f = f4;
    }

    protected void P(Canvas canvas) {
        if (this.E == null || !B0() || !q1()) {
            return;
        }
        int i4 = 0;
        while (true) {
            d[] dVarArr = this.B;
            if (i4 >= dVarArr.length) {
                return;
            }
            d dVar = dVarArr[i4];
            e k4 = this.f50233c.k(dVar.d());
            Entry s4 = this.f50233c.s(this.B[i4]);
            int g4 = k4.g(s4);
            if (s4 != null) {
                if (g4 <= this.f50252v.h() * k4.h1()) {
                    float[] h02 = h0(dVar);
                    if (this.f50251u.G(h02[0], h02[1])) {
                        this.E.c(s4, dVar);
                        this.E.a(canvas, h02[0], h02[1]);
                    }
                }
            }
            i4++;
        }
    }

    @Deprecated
    public void P0(boolean z4) {
        Q0(z4);
    }

    public void Q() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    public void Q0(boolean z4) {
        this.D = z4;
    }

    public com.github.mikephil.charting.animation.a R() {
        return this.f50252v;
    }

    public void R0(float f4) {
        this.f50255y = com.github.mikephil.charting.utils.k.e(f4);
    }

    public com.github.mikephil.charting.utils.g S() {
        return com.github.mikephil.charting.utils.g.c(getWidth() / 2.0f, getHeight() / 2.0f);
    }

    public void S0(float f4) {
        this.f50256z = com.github.mikephil.charting.utils.k.e(f4);
    }

    public Bitmap T() {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        Drawable background = getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        draw(canvas);
        return createBitmap;
    }

    public void T0(float f4, float f5, float f6, float f7) {
        S0(f4);
        V0(f5);
        U0(f6);
        R0(f7);
    }

    public c U() {
        return this.f50242l;
    }

    public void U0(float f4) {
        this.f50254x = com.github.mikephil.charting.utils.k.e(f4);
    }

    public float V() {
        return this.f50236f;
    }

    public void V0(float f4) {
        this.f50253w = com.github.mikephil.charting.utils.k.e(f4);
    }

    public float W() {
        return this.f50255y;
    }

    public void W0(boolean z4) {
        if (z4) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public float X() {
        return this.f50256z;
    }

    public void X0(boolean z4) {
        this.f50234d = z4;
    }

    public float Y() {
        return this.f50254x;
    }

    public void Y0(com.github.mikephil.charting.highlight.b bVar) {
        this.f50250t = bVar;
    }

    public float Z() {
        return this.f50253w;
    }

    protected void Z0(d[] dVarArr) {
        d dVar;
        if (dVarArr == null || dVarArr.length <= 0 || (dVar = dVarArr[0]) == null) {
            this.f50245o.f(null);
        } else {
            this.f50245o.f(dVar);
        }
    }

    @Override // e8.e
    public RectF a() {
        return this.f50251u.q();
    }

    public d a0(float f4, float f5) {
        if (this.f50233c == null) {
            return null;
        }
        return c0().a(f4, f5);
    }

    public void a1(boolean z4) {
        this.f50232b = z4;
    }

    public T b() {
        return this.f50233c;
    }

    public d[] b0() {
        return this.B;
    }

    public void b1(com.github.mikephil.charting.components.d dVar) {
        this.E = dVar;
    }

    public f c0() {
        return this.f50250t;
    }

    @Deprecated
    public void c1(com.github.mikephil.charting.components.d dVar) {
        b1(dVar);
    }

    public ArrayList<Runnable> d0() {
        return this.F;
    }

    public void d1(float f4) {
        this.C = com.github.mikephil.charting.utils.k.e(f4);
    }

    public com.github.mikephil.charting.components.e e0() {
        return this.f50243m;
    }

    public void e1(String str) {
        this.f50246p = str;
    }

    public i f0() {
        return this.f50248r;
    }

    public void f1(int i4) {
        this.f50239i.setColor(i4);
    }

    public com.github.mikephil.charting.components.d g0() {
        return this.E;
    }

    public void g1(Typeface typeface) {
        this.f50239i.setTypeface(typeface);
    }

    protected float[] h0(d dVar) {
        return new float[]{dVar.e(), dVar.f()};
    }

    public void h1(com.github.mikephil.charting.listener.c cVar) {
        this.f50247q = cVar;
    }

    @Deprecated
    public com.github.mikephil.charting.components.d i0() {
        return g0();
    }

    public void i1(com.github.mikephil.charting.listener.d dVar) {
        this.f50244n = dVar;
    }

    @Override // e8.e
    public com.github.mikephil.charting.utils.g j() {
        return this.f50251u.p();
    }

    public com.github.mikephil.charting.listener.c j0() {
        return this.f50247q;
    }

    public void j1(com.github.mikephil.charting.listener.b bVar) {
        this.f50245o = bVar;
    }

    public com.github.mikephil.charting.listener.b k0() {
        return this.f50245o;
    }

    public void k1(Paint paint, int i4) {
        if (i4 == 7) {
            this.f50239i = paint;
        } else {
            if (i4 != 11) {
                return;
            }
            this.f50238h = paint;
        }
    }

    public Paint l0(int i4) {
        if (i4 == 7) {
            return this.f50239i;
        }
        if (i4 != 11) {
            return null;
        }
        return this.f50238h;
    }

    public void l1(g gVar) {
        if (gVar != null) {
            this.f50249s = gVar;
        }
    }

    public g m0() {
        return this.f50249s;
    }

    public void m1(boolean z4) {
        this.f50241k = z4;
    }

    public l n0() {
        return this.f50251u;
    }

    public void n1(boolean z4) {
        this.G = z4;
    }

    @Override // e8.e
    public com.github.mikephil.charting.formatter.l o() {
        return this.f50237g;
    }

    public j o0() {
        return this.f50240j;
    }

    protected void o1(float f4, float f5) {
        T t4 = this.f50233c;
        this.f50237g.m(com.github.mikephil.charting.utils.k.r((t4 == null || t4.r() < 2) ? Math.max(Math.abs(f4), Math.abs(f5)) : Math.abs(f5 - f4)));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.G) {
            p1(this);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f50233c == null) {
            if (TextUtils.isEmpty(this.f50246p)) {
                return;
            }
            com.github.mikephil.charting.utils.g S = S();
            canvas.drawText(this.f50246p, S.f50636d, S.f50637e, this.f50239i);
            return;
        }
        if (this.A) {
            return;
        }
        J();
        this.A = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            getChildAt(i10).layout(i4, i5, i6, i7);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int e4 = (int) com.github.mikephil.charting.utils.k.e(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), View.resolveSize(e4, i4)), Math.max(getSuggestedMinimumHeight(), View.resolveSize(e4, i5)));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        if (i4 > 0 && i5 > 0 && i4 < 10000 && i5 < 10000) {
            this.f50251u.V(i4, i5);
        }
        F0();
        Iterator<Runnable> it = this.F.iterator();
        while (it.hasNext()) {
            post(it.next());
        }
        this.F.clear();
        super.onSizeChanged(i4, i5, i6, i7);
    }

    @Override // e8.e
    public float p() {
        return this.C;
    }

    public float p0() {
        return this.f50233c.z();
    }

    @Override // e8.e
    public com.github.mikephil.charting.utils.g q() {
        return S();
    }

    public float q0() {
        return this.f50233c.B();
    }

    public boolean q1() {
        d[] dVarArr = this.B;
        return (dVarArr == null || dVarArr.length <= 0 || dVarArr[0] == null) ? false : true;
    }

    public void r0(float f4, float f5, int i4) {
        s0(f4, f5, i4, true);
    }

    public void s0(float f4, float f5, int i4, boolean z4) {
        if (i4 < 0 || i4 >= this.f50233c.m()) {
            w0(null, z4);
        } else {
            w0(new d(f4, f5, i4), z4);
        }
    }

    public void t0(float f4, int i4) {
        u0(f4, i4, true);
    }

    @Override // e8.e
    public float u() {
        return this.f50240j.G;
    }

    public void u0(float f4, int i4, boolean z4) {
        s0(f4, Float.NaN, i4, z4);
    }

    public void v0(d dVar) {
        w0(dVar, false);
    }

    @Override // e8.e
    public float w() {
        return this.f50240j.H;
    }

    public void w0(d dVar, boolean z4) {
        Entry entry = null;
        if (dVar == null) {
            this.B = null;
        } else {
            if (this.f50232b) {
                dVar.toString();
            }
            Entry s4 = this.f50233c.s(dVar);
            if (s4 == null) {
                this.B = null;
                dVar = null;
            } else {
                this.B = new d[]{dVar};
            }
            entry = s4;
        }
        Z0(this.B);
        if (z4 && this.f50244n != null) {
            if (q1()) {
                this.f50244n.a(entry, dVar);
            } else {
                this.f50244n.b();
            }
        }
        invalidate();
    }

    public void x0(d[] dVarArr) {
        this.B = dVarArr;
        Z0(dVarArr);
        invalidate();
    }

    @Override // e8.e
    public float y() {
        return this.f50240j.I;
    }

    protected void y0() {
        setWillNotDraw(false);
        this.f50252v = new com.github.mikephil.charting.animation.a(new a());
        com.github.mikephil.charting.utils.k.H(getContext());
        this.C = com.github.mikephil.charting.utils.k.e(500.0f);
        this.f50242l = new c();
        com.github.mikephil.charting.components.e eVar = new com.github.mikephil.charting.components.e();
        this.f50243m = eVar;
        this.f50248r = new i(this.f50251u, eVar);
        this.f50240j = new j();
        this.f50238h = new Paint(1);
        Paint paint = new Paint(1);
        this.f50239i = paint;
        paint.setColor(Color.rgb(247, 189, 51));
        this.f50239i.setTextAlign(Paint.Align.CENTER);
        this.f50239i.setTextSize(com.github.mikephil.charting.utils.k.e(12.0f));
    }

    public boolean z0() {
        return this.f50235e;
    }

    public Chart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50232b = false;
        this.f50233c = null;
        this.f50234d = true;
        this.f50235e = true;
        this.f50236f = 0.9f;
        this.f50237g = new com.github.mikephil.charting.formatter.d(0);
        this.f50241k = true;
        this.f50246p = ProtectedSandApp.s("쉧");
        this.f50251u = new l();
        this.f50253w = 0.0f;
        this.f50254x = 0.0f;
        this.f50255y = 0.0f;
        this.f50256z = 0.0f;
        this.A = false;
        this.C = 0.0f;
        this.D = true;
        this.F = new ArrayList<>();
        this.G = false;
        y0();
    }

    public Chart(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f50232b = false;
        this.f50233c = null;
        this.f50234d = true;
        this.f50235e = true;
        this.f50236f = 0.9f;
        this.f50237g = new com.github.mikephil.charting.formatter.d(0);
        this.f50241k = true;
        this.f50246p = ProtectedSandApp.s("쉧");
        this.f50251u = new l();
        this.f50253w = 0.0f;
        this.f50254x = 0.0f;
        this.f50255y = 0.0f;
        this.f50256z = 0.0f;
        this.A = false;
        this.C = 0.0f;
        this.D = true;
        this.F = new ArrayList<>();
        this.G = false;
        y0();
    }
}
