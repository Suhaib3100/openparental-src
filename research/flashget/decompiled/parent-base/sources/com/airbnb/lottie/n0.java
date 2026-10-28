package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.c1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: LottieDrawable.java */
/* loaded from: classes3.dex */
public class n0 extends Drawable implements Drawable.Callback, Animatable {
    public static final int M = 1;
    public static final int N = 2;
    public static final int O = -1;
    private Bitmap A;
    private Canvas B;
    private Rect C;
    private RectF D;
    private Paint E;
    private Rect F;
    private Rect G;
    private RectF H;
    private RectF I;
    private Matrix J;
    private Matrix K;
    private boolean L;

    /* renamed from: b, reason: collision with root package name */
    private k f39157b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.utils.g f39158c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f39159d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f39160e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f39161f;

    /* renamed from: g, reason: collision with root package name */
    private d f39162g;

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList<c> f39163h;

    /* renamed from: i, reason: collision with root package name */
    private final ValueAnimator.AnimatorUpdateListener f39164i;

    /* renamed from: j, reason: collision with root package name */
    @androidx.annotation.q0
    private com.airbnb.lottie.manager.b f39165j;

    /* renamed from: k, reason: collision with root package name */
    @androidx.annotation.q0
    private String f39166k;

    /* renamed from: l, reason: collision with root package name */
    @androidx.annotation.q0
    private com.airbnb.lottie.d f39167l;

    /* renamed from: m, reason: collision with root package name */
    @androidx.annotation.q0
    private com.airbnb.lottie.manager.a f39168m;

    /* renamed from: n, reason: collision with root package name */
    @androidx.annotation.q0
    com.airbnb.lottie.c f39169n;

    /* renamed from: o, reason: collision with root package name */
    @androidx.annotation.q0
    b1 f39170o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f39171p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f39172q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f39173r;

    /* renamed from: s, reason: collision with root package name */
    @androidx.annotation.q0
    private com.airbnb.lottie.model.layer.c f39174s;

    /* renamed from: t, reason: collision with root package name */
    private int f39175t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f39176u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f39177v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f39178w;

    /* renamed from: x, reason: collision with root package name */
    private z0 f39179x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f39180y;

    /* renamed from: z, reason: collision with root package name */
    private final Matrix f39181z;

    /* compiled from: LottieDrawable.java */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (n0.this.f39174s != null) {
                n0.this.f39174s.L(n0.this.f39158c.k());
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: LottieDrawable.java */
    class b<T> extends com.airbnb.lottie.value.j<T> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.l f39183d;

        b(com.airbnb.lottie.value.l lVar) {
            this.f39183d = lVar;
        }

        @Override // com.airbnb.lottie.value.j
        public T a(com.airbnb.lottie.value.b<T> bVar) {
            return (T) this.f39183d.a(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LottieDrawable.java */
    interface c {
        void a(k kVar);
    }

    /* compiled from: LottieDrawable.java */
    private enum d {
        NONE,
        PLAY,
        RESUME
    }

    /* compiled from: LottieDrawable.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public n0() {
        com.airbnb.lottie.utils.g gVar = new com.airbnb.lottie.utils.g();
        this.f39158c = gVar;
        this.f39159d = true;
        this.f39160e = false;
        this.f39161f = false;
        this.f39162g = d.NONE;
        this.f39163h = new ArrayList<>();
        a aVar = new a();
        this.f39164i = aVar;
        this.f39172q = false;
        this.f39173r = true;
        this.f39175t = 255;
        this.f39179x = z0.AUTOMATIC;
        this.f39180y = false;
        this.f39181z = new Matrix();
        this.L = false;
        gVar.addUpdateListener(aVar);
    }

    private void A() {
        k kVar = this.f39157b;
        if (kVar == null) {
            return;
        }
        com.airbnb.lottie.model.layer.c cVar = new com.airbnb.lottie.model.layer.c(this, com.airbnb.lottie.parser.v.a(kVar), kVar.k(), kVar);
        this.f39174s = cVar;
        if (this.f39177v) {
            cVar.J(true);
        }
        this.f39174s.Q(this.f39173r);
    }

    private /* synthetic */ void A0(String str, String str2, boolean z4, k kVar) {
        h1(str, str2, z4);
    }

    private /* synthetic */ void B0(float f4, float f5, k kVar) {
        i1(f4, f5);
    }

    private /* synthetic */ void C0(int i4, k kVar) {
        j1(i4);
    }

    private void D() {
        k kVar = this.f39157b;
        if (kVar == null) {
            return;
        }
        this.f39180y = this.f39179x.useSoftwareRendering(Build.VERSION.SDK_INT, kVar.t(), kVar.n());
    }

    private /* synthetic */ void D0(String str, k kVar) {
        k1(str);
    }

    private void E(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private /* synthetic */ void E0(float f4, k kVar) {
        l1(f4);
    }

    private void F(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private /* synthetic */ void F0(float f4, k kVar) {
        o1(f4);
    }

    private void I(Canvas canvas) {
        com.airbnb.lottie.model.layer.c cVar = this.f39174s;
        k kVar = this.f39157b;
        if (cVar == null || kVar == null) {
            return;
        }
        this.f39181z.reset();
        if (!getBounds().isEmpty()) {
            this.f39181z.preScale(r2.width() / kVar.b().width(), r2.height() / kVar.b().height());
        }
        cVar.h(canvas, this.f39181z, this.f39175t);
    }

    private void M(int i4, int i5) {
        Bitmap bitmap = this.A;
        if (bitmap == null || bitmap.getWidth() < i4 || this.A.getHeight() < i5) {
            Bitmap createBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
            this.A = createBitmap;
            this.B.setBitmap(createBitmap);
            this.L = true;
            return;
        }
        if (this.A.getWidth() > i4 || this.A.getHeight() > i5) {
            Bitmap createBitmap2 = Bitmap.createBitmap(this.A, 0, 0, i4, i5);
            this.A = createBitmap2;
            this.B.setBitmap(createBitmap2);
            this.L = true;
        }
    }

    private void N() {
        if (this.B != null) {
            return;
        }
        this.B = new Canvas();
        this.I = new RectF();
        this.J = new Matrix();
        this.K = new Matrix();
        this.C = new Rect();
        this.D = new RectF();
        this.E = new com.airbnb.lottie.animation.a();
        this.F = new Rect();
        this.G = new Rect();
        this.H = new RectF();
    }

    private void O0(Canvas canvas, com.airbnb.lottie.model.layer.c cVar) {
        if (this.f39157b == null || cVar == null) {
            return;
        }
        N();
        canvas.getMatrix(this.J);
        canvas.getClipBounds(this.C);
        E(this.C, this.D);
        this.J.mapRect(this.D);
        F(this.D, this.C);
        if (this.f39173r) {
            this.I.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            cVar.f(this.I, null, false);
        }
        this.J.mapRect(this.I);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        S0(this.I, width, height);
        if (!l0()) {
            RectF rectF = this.I;
            Rect rect = this.C;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int ceil = (int) Math.ceil(this.I.width());
        int ceil2 = (int) Math.ceil(this.I.height());
        if (ceil == 0 || ceil2 == 0) {
            return;
        }
        M(ceil, ceil2);
        if (this.L) {
            this.f39181z.set(this.J);
            this.f39181z.preScale(width, height);
            Matrix matrix = this.f39181z;
            RectF rectF2 = this.I;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.A.eraseColor(0);
            cVar.h(this.B, this.f39181z, this.f39175t);
            this.J.invert(this.K);
            this.K.mapRect(this.H, this.I);
            F(this.H, this.G);
        }
        this.F.set(0, 0, ceil, ceil2);
        canvas.drawBitmap(this.A, this.F, this.G, this.E);
    }

    @androidx.annotation.q0
    private Context R() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private com.airbnb.lottie.manager.a S() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f39168m == null) {
            this.f39168m = new com.airbnb.lottie.manager.a(getCallback(), this.f39169n);
        }
        return this.f39168m;
    }

    private void S0(RectF rectF, float f4, float f5) {
        rectF.set(rectF.left * f4, rectF.top * f5, rectF.right * f4, rectF.bottom * f5);
    }

    private com.airbnb.lottie.manager.b V() {
        if (getCallback() == null) {
            return null;
        }
        com.airbnb.lottie.manager.b bVar = this.f39165j;
        if (bVar != null && !bVar.c(R())) {
            this.f39165j = null;
        }
        if (this.f39165j == null) {
            this.f39165j = new com.airbnb.lottie.manager.b(getCallback(), this.f39166k, this.f39167l, this.f39157b.j());
        }
        return this.f39165j;
    }

    private boolean l0() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        if (((View) callback).getParent() instanceof ViewGroup) {
            return !((ViewGroup) r0).getClipChildren();
        }
        return false;
    }

    private /* synthetic */ void r0(com.airbnb.lottie.model.e eVar, Object obj, com.airbnb.lottie.value.j jVar, k kVar) {
        x(eVar, obj, jVar);
    }

    private /* synthetic */ void s0(k kVar) {
        I0();
    }

    private /* synthetic */ void t0(k kVar) {
        Q0();
    }

    private /* synthetic */ void u0(int i4, k kVar) {
        X0(i4);
    }

    private /* synthetic */ void v0(int i4, k kVar) {
        c1(i4);
    }

    private /* synthetic */ void w0(String str, k kVar) {
        d1(str);
    }

    private /* synthetic */ void x0(float f4, k kVar) {
        e1(f4);
    }

    private /* synthetic */ void y0(int i4, int i5, k kVar) {
        f1(i4, i5);
    }

    private boolean z() {
        return this.f39159d || this.f39160e;
    }

    private /* synthetic */ void z0(String str, k kVar) {
        g1(str);
    }

    public void B() {
        this.f39163h.clear();
        this.f39158c.cancel();
        if (isVisible()) {
            return;
        }
        this.f39162g = d.NONE;
    }

    public void C() {
        if (this.f39158c.isRunning()) {
            this.f39158c.cancel();
            if (!isVisible()) {
                this.f39162g = d.NONE;
            }
        }
        this.f39157b = null;
        this.f39174s = null;
        this.f39165j = null;
        this.f39158c.g();
        invalidateSelf();
    }

    @Deprecated
    public void G() {
    }

    @Deprecated
    public void G0(boolean z4) {
        this.f39158c.setRepeatCount(z4 ? -1 : 0);
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void H(Canvas canvas, Matrix matrix) {
        com.airbnb.lottie.model.layer.c cVar = this.f39174s;
        k kVar = this.f39157b;
        if (cVar == null || kVar == null) {
            return;
        }
        if (this.f39180y) {
            canvas.save();
            canvas.concat(matrix);
            O0(canvas, cVar);
            canvas.restore();
        } else {
            cVar.h(canvas, matrix, this.f39175t);
        }
        this.L = false;
    }

    public void H0() {
        this.f39163h.clear();
        this.f39158c.r();
        if (isVisible()) {
            return;
        }
        this.f39162g = d.NONE;
    }

    @androidx.annotation.l0
    public void I0() {
        if (this.f39174s == null) {
            this.f39163h.add(new c() { // from class: com.airbnb.lottie.i0
                @Override // com.airbnb.lottie.n0.c
                public final void a(k kVar) {
                    n0.this.I0();
                }
            });
            return;
        }
        D();
        if (z() || e0() == 0) {
            if (isVisible()) {
                this.f39158c.s();
            } else {
                this.f39162g = d.PLAY;
            }
        }
        if (z()) {
            return;
        }
        X0((int) (g0() < 0.0f ? a0() : Z()));
        this.f39158c.i();
        if (isVisible()) {
            return;
        }
        this.f39162g = d.NONE;
    }

    public void J(boolean z4) {
        if (this.f39171p == z4) {
            return;
        }
        this.f39171p = z4;
        if (this.f39157b != null) {
            A();
        }
    }

    public void J0() {
        this.f39158c.removeAllListeners();
    }

    public boolean K() {
        return this.f39171p;
    }

    public void K0() {
        this.f39158c.removeAllUpdateListeners();
        this.f39158c.addUpdateListener(this.f39164i);
    }

    @androidx.annotation.l0
    public void L() {
        this.f39163h.clear();
        this.f39158c.i();
        if (isVisible()) {
            return;
        }
        this.f39162g = d.NONE;
    }

    public void L0(Animator.AnimatorListener animatorListener) {
        this.f39158c.removeListener(animatorListener);
    }

    @androidx.annotation.x0(api = 19)
    public void M0(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f39158c.removePauseListener(animatorPauseListener);
    }

    public void N0(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f39158c.removeUpdateListener(animatorUpdateListener);
    }

    @androidx.annotation.q0
    public Bitmap O(String str) {
        com.airbnb.lottie.manager.b V = V();
        if (V != null) {
            return V.a(str);
        }
        return null;
    }

    public boolean P() {
        return this.f39173r;
    }

    public List<com.airbnb.lottie.model.e> P0(com.airbnb.lottie.model.e eVar) {
        if (this.f39174s == null) {
            com.airbnb.lottie.utils.f.e(ProtectedSandApp.s("Ƅ"));
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f39174s.e(eVar, 0, arrayList, new com.airbnb.lottie.model.e(new String[0]));
        return arrayList;
    }

    public k Q() {
        return this.f39157b;
    }

    @androidx.annotation.l0
    public void Q0() {
        if (this.f39174s == null) {
            this.f39163h.add(new c() { // from class: com.airbnb.lottie.e0
                @Override // com.airbnb.lottie.n0.c
                public final void a(k kVar) {
                    n0.this.Q0();
                }
            });
            return;
        }
        D();
        if (z() || e0() == 0) {
            if (isVisible()) {
                this.f39158c.w();
            } else {
                this.f39162g = d.RESUME;
            }
        }
        if (z()) {
            return;
        }
        X0((int) (g0() < 0.0f ? a0() : Z()));
        this.f39158c.i();
        if (isVisible()) {
            return;
        }
        this.f39162g = d.NONE;
    }

    public void R0() {
        this.f39158c.y();
    }

    public int T() {
        return (int) this.f39158c.l();
    }

    public void T0(boolean z4) {
        this.f39178w = z4;
    }

    @androidx.annotation.q0
    @Deprecated
    public Bitmap U(String str) {
        com.airbnb.lottie.manager.b V = V();
        if (V != null) {
            return V.a(str);
        }
        k kVar = this.f39157b;
        o0 o0Var = kVar == null ? null : kVar.j().get(str);
        if (o0Var != null) {
            return o0Var.a();
        }
        return null;
    }

    public void U0(boolean z4) {
        if (z4 != this.f39173r) {
            this.f39173r = z4;
            com.airbnb.lottie.model.layer.c cVar = this.f39174s;
            if (cVar != null) {
                cVar.Q(z4);
            }
            invalidateSelf();
        }
    }

    public boolean V0(k kVar) {
        if (this.f39157b == kVar) {
            return false;
        }
        this.L = true;
        C();
        this.f39157b = kVar;
        A();
        this.f39158c.z(kVar);
        o1(this.f39158c.getAnimatedFraction());
        Iterator it = new ArrayList(this.f39163h).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar != null) {
                cVar.a(kVar);
            }
            it.remove();
        }
        this.f39163h.clear();
        kVar.z(this.f39176u);
        D();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    @androidx.annotation.q0
    public String W() {
        return this.f39166k;
    }

    public void W0(com.airbnb.lottie.c cVar) {
        this.f39169n = cVar;
        com.airbnb.lottie.manager.a aVar = this.f39168m;
        if (aVar != null) {
            aVar.d(cVar);
        }
    }

    @androidx.annotation.q0
    public o0 X(String str) {
        k kVar = this.f39157b;
        if (kVar == null) {
            return null;
        }
        return kVar.j().get(str);
    }

    public void X0(final int i4) {
        if (this.f39157b == null) {
            this.f39163h.add(new c() { // from class: com.airbnb.lottie.l0
                @Override // com.airbnb.lottie.n0.c
                public final void a(k kVar) {
                    n0.this.X0(i4);
                }
            });
        } else {
            this.f39158c.A(i4);
        }
    }

    public boolean Y() {
        return this.f39172q;
    }

    public void Y0(boolean z4) {
        this.f39160e = z4;
    }

    public float Z() {
        return this.f39158c.n();
    }

    public void Z0(com.airbnb.lottie.d dVar) {
        this.f39167l = dVar;
        com.airbnb.lottie.manager.b bVar = this.f39165j;
        if (bVar != null) {
            bVar.e(dVar);
        }
    }

    public float a0() {
        return this.f39158c.o();
    }

    public void a1(@androidx.annotation.q0 String str) {
        this.f39166k = str;
    }

    @androidx.annotation.q0
    public x0 b0() {
        k kVar = this.f39157b;
        if (kVar != null) {
            return kVar.o();
        }
        return null;
    }

    public void b1(boolean z4) {
        this.f39172q = z4;
    }

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f60679p, to = 1.0d)
    public float c0() {
        return this.f39158c.k();
    }

    public void c1(final int i4) {
        if (this.f39157b == null) {
            this.f39163h.add(new c() { // from class: com.airbnb.lottie.a0
                @Override // com.airbnb.lottie.n0.c
                public final void a(k kVar) {
                    n0.this.c1(i4);
                }
            });
        } else {
            this.f39158c.B(i4 + 0.99f);
        }
    }

    public z0 d0() {
        return this.f39180y ? z0.SOFTWARE : z0.HARDWARE;
    }

    public void d1(final String str) {
        k kVar = this.f39157b;
        if (kVar == null) {
            this.f39163h.add(new c() { // from class: com.airbnb.lottie.g0
                @Override // com.airbnb.lottie.n0.c
                public final void a(k kVar2) {
                    n0.this.d1(str);
                }
            });
            return;
        }
        com.airbnb.lottie.model.h l4 = kVar.l(str);
        if (l4 == null) {
            throw new IllegalArgumentException(android.support.v4.media.d.a(ProtectedSandApp.s("ƅ"), str, ProtectedSandApp.s("Ɔ")));
        }
        c1((int) (l4.f39093b + l4.f39094c));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@androidx.annotation.o0 Canvas canvas) {
        String s4 = ProtectedSandApp.s("Ƈ");
        com.airbnb.lottie.e.a(s4);
        if (this.f39161f) {
            try {
                if (this.f39180y) {
                    O0(canvas, this.f39174s);
                } else {
                    I(canvas);
                }
            } catch (Throwable th) {
                com.airbnb.lottie.utils.f.c(ProtectedSandApp.s("ƈ"), th);
            }
        } else if (this.f39180y) {
            O0(canvas, this.f39174s);
        } else {
            I(canvas);
        }
        this.L = false;
        com.airbnb.lottie.e.b(s4);
    }

    public int e0() {
        return this.f39158c.getRepeatCount();
    }

    public void e1(@androidx.annotation.x(from = 0.0d, to = 1.0d) final float f4) {
        k kVar = this.f39157b;
        if (kVar == null) {
            this.f39163h.add(new c() { // from class: com.airbnb.lottie.d0
                @Override // com.airbnb.lottie.n0.c
                public final void a(k kVar2) {
                    n0.this.e1(f4);
                }
            });
        } else {
            c1((int) com.airbnb.lottie.utils.i.k(kVar.r(), this.f39157b.f(), f4));
        }
    }

    @SuppressLint({"WrongConstant"})
    public int f0() {
        return this.f39158c.getRepeatMode();
    }

    public void f1(final int i4, final int i5) {
        if (this.f39157b == null) {
            this.f39163h.add(new c() { // from class: com.airbnb.lottie.z
                @Override // com.airbnb.lottie.n0.c
                public final void a(k kVar) {
                    n0.this.f1(i4, i5);
                }
            });
        } else {
            this.f39158c.C(i4, i5 + 0.99f);
        }
    }

    public float g0() {
        return this.f39158c.p();
    }

    public void g1(final String str) {
        k kVar = this.f39157b;
        if (kVar == null) {
            this.f39163h.add(new c() { // from class: com.airbnb.lottie.y
                @Override // com.airbnb.lottie.n0.c
                public final void a(k kVar2) {
                    n0.this.g1(str);
                }
            });
            return;
        }
        com.airbnb.lottie.model.h l4 = kVar.l(str);
        if (l4 == null) {
            throw new IllegalArgumentException(android.support.v4.media.d.a(ProtectedSandApp.s("ƅ"), str, ProtectedSandApp.s("Ɔ")));
        }
        int i4 = (int) l4.f39093b;
        f1(i4, ((int) l4.f39094c) + i4);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f39175t;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        k kVar = this.f39157b;
        if (kVar == null) {
            return -1;
        }
        return kVar.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        k kVar = this.f39157b;
        if (kVar == null) {
            return -1;
        }
        return kVar.b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @androidx.annotation.q0
    public b1 h0() {
        return this.f39170o;
    }

    public void h1(final String str, final String str2, final boolean z4) {
        k kVar = this.f39157b;
        if (kVar == null) {
            this.f39163h.add(new c() { // from class: com.airbnb.lottie.f0
                @Override // com.airbnb.lottie.n0.c
                public final void a(k kVar2) {
                    n0.this.h1(str, str2, z4);
                }
            });
            return;
        }
        com.airbnb.lottie.model.h l4 = kVar.l(str);
        String s4 = ProtectedSandApp.s("Ɔ");
        String s5 = ProtectedSandApp.s("ƅ");
        if (l4 == null) {
            throw new IllegalArgumentException(android.support.v4.media.d.a(s5, str, s4));
        }
        int i4 = (int) l4.f39093b;
        com.airbnb.lottie.model.h l5 = this.f39157b.l(str2);
        if (l5 == null) {
            throw new IllegalArgumentException(android.support.v4.media.d.a(s5, str2, s4));
        }
        f1(i4, (int) (l5.f39093b + (z4 ? 1.0f : 0.0f)));
    }

    @androidx.annotation.q0
    public Typeface i0(String str, String str2) {
        com.airbnb.lottie.manager.a S = S();
        if (S != null) {
            return S.b(str, str2);
        }
        return null;
    }

    public void i1(@androidx.annotation.x(from = 0.0d, to = 1.0d) final float f4, @androidx.annotation.x(from = 0.0d, to = 1.0d) final float f5) {
        k kVar = this.f39157b;
        if (kVar == null) {
            this.f39163h.add(new c() { // from class: com.airbnb.lottie.m0
                @Override // com.airbnb.lottie.n0.c
                public final void a(k kVar2) {
                    n0.this.i1(f4, f5);
                }
            });
        } else {
            f1((int) com.airbnb.lottie.utils.i.k(kVar.r(), this.f39157b.f(), f4), (int) com.airbnb.lottie.utils.i.k(this.f39157b.r(), this.f39157b.f(), f5));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@androidx.annotation.o0 Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.L) {
            return;
        }
        this.L = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return m0();
    }

    public boolean j0() {
        com.airbnb.lottie.model.layer.c cVar = this.f39174s;
        return cVar != null && cVar.O();
    }

    public void j1(final int i4) {
        if (this.f39157b == null) {
            this.f39163h.add(new c() { // from class: com.airbnb.lottie.b0
                @Override // com.airbnb.lottie.n0.c
                public final void a(k kVar) {
                    n0.this.j1(i4);
                }
            });
        } else {
            this.f39158c.D(i4);
        }
    }

    public boolean k0() {
        com.airbnb.lottie.model.layer.c cVar = this.f39174s;
        return cVar != null && cVar.P();
    }

    public void k1(final String str) {
        k kVar = this.f39157b;
        if (kVar == null) {
            this.f39163h.add(new c() { // from class: com.airbnb.lottie.h0
                @Override // com.airbnb.lottie.n0.c
                public final void a(k kVar2) {
                    n0.this.k1(str);
                }
            });
            return;
        }
        com.airbnb.lottie.model.h l4 = kVar.l(str);
        if (l4 == null) {
            throw new IllegalArgumentException(android.support.v4.media.d.a(ProtectedSandApp.s("ƅ"), str, ProtectedSandApp.s("Ɔ")));
        }
        j1((int) l4.f39093b);
    }

    public void l1(final float f4) {
        k kVar = this.f39157b;
        if (kVar == null) {
            this.f39163h.add(new c() { // from class: com.airbnb.lottie.j0
                @Override // com.airbnb.lottie.n0.c
                public final void a(k kVar2) {
                    n0.this.l1(f4);
                }
            });
        } else {
            j1((int) com.airbnb.lottie.utils.i.k(kVar.r(), this.f39157b.f(), f4));
        }
    }

    public boolean m0() {
        com.airbnb.lottie.utils.g gVar = this.f39158c;
        if (gVar == null) {
            return false;
        }
        return gVar.isRunning();
    }

    public void m1(boolean z4) {
        if (this.f39177v == z4) {
            return;
        }
        this.f39177v = z4;
        com.airbnb.lottie.model.layer.c cVar = this.f39174s;
        if (cVar != null) {
            cVar.J(z4);
        }
    }

    boolean n0() {
        if (isVisible()) {
            return this.f39158c.isRunning();
        }
        d dVar = this.f39162g;
        return dVar == d.PLAY || dVar == d.RESUME;
    }

    public void n1(boolean z4) {
        this.f39176u = z4;
        k kVar = this.f39157b;
        if (kVar != null) {
            kVar.z(z4);
        }
    }

    public boolean o0() {
        return this.f39178w;
    }

    public void o1(@androidx.annotation.x(from = 0.0d, to = 1.0d) final float f4) {
        if (this.f39157b == null) {
            this.f39163h.add(new c() { // from class: com.airbnb.lottie.k0
                @Override // com.airbnb.lottie.n0.c
                public final void a(k kVar) {
                    n0.this.o1(f4);
                }
            });
            return;
        }
        String s4 = ProtectedSandApp.s("Ɖ");
        com.airbnb.lottie.e.a(s4);
        this.f39158c.A(this.f39157b.h(f4));
        com.airbnb.lottie.e.b(s4);
    }

    public boolean p0() {
        return this.f39158c.getRepeatCount() == -1;
    }

    public void p1(z0 z0Var) {
        this.f39179x = z0Var;
        D();
    }

    public boolean q0() {
        return this.f39171p;
    }

    public void q1(int i4) {
        this.f39158c.setRepeatCount(i4);
    }

    public void r1(int i4) {
        this.f39158c.setRepeatMode(i4);
    }

    public void s1(boolean z4) {
        this.f39161f = z4;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@androidx.annotation.o0 Drawable drawable, @androidx.annotation.o0 Runnable runnable, long j4) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@androidx.annotation.g0(from = 0, to = 255) int i4) {
        this.f39175t = i4;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@androidx.annotation.q0 ColorFilter colorFilter) {
        com.airbnb.lottie.utils.f.e(ProtectedSandApp.s("Ɗ"));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z4, boolean z5) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z4, z5);
        if (z4) {
            d dVar = this.f39162g;
            if (dVar == d.PLAY) {
                I0();
            } else if (dVar == d.RESUME) {
                Q0();
            }
        } else if (this.f39158c.isRunning()) {
            H0();
            this.f39162g = d.RESUME;
        } else if (isVisible) {
            this.f39162g = d.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    @androidx.annotation.l0
    public void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || ((View) callback).isInEditMode()) {
            return;
        }
        I0();
    }

    @Override // android.graphics.drawable.Animatable
    @androidx.annotation.l0
    public void stop() {
        L();
    }

    public void t1(float f4) {
        this.f39158c.E(f4);
    }

    public void u(Animator.AnimatorListener animatorListener) {
        this.f39158c.addListener(animatorListener);
    }

    void u1(Boolean bool) {
        this.f39159d = bool.booleanValue();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@androidx.annotation.o0 Drawable drawable, @androidx.annotation.o0 Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    @androidx.annotation.x0(api = 19)
    public void v(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f39158c.addPauseListener(animatorPauseListener);
    }

    public void v1(b1 b1Var) {
        this.f39170o = b1Var;
    }

    public void w(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f39158c.addUpdateListener(animatorUpdateListener);
    }

    @androidx.annotation.q0
    public Bitmap w1(String str, @androidx.annotation.q0 Bitmap bitmap) {
        com.airbnb.lottie.manager.b V = V();
        if (V == null) {
            com.airbnb.lottie.utils.f.e(ProtectedSandApp.s("Ƌ"));
            return null;
        }
        Bitmap f4 = V.f(str, bitmap);
        invalidateSelf();
        return f4;
    }

    public <T> void x(final com.airbnb.lottie.model.e eVar, final T t4, @androidx.annotation.q0 final com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.model.layer.c cVar = this.f39174s;
        if (cVar == null) {
            this.f39163h.add(new c() { // from class: com.airbnb.lottie.c0
                @Override // com.airbnb.lottie.n0.c
                public final void a(k kVar) {
                    n0.this.x(eVar, t4, jVar);
                }
            });
            return;
        }
        boolean z4 = true;
        if (eVar == com.airbnb.lottie.model.e.f39086c) {
            cVar.d(t4, jVar);
        } else if (eVar.d() != null) {
            eVar.d().d(t4, jVar);
        } else {
            List<com.airbnb.lottie.model.e> P0 = P0(eVar);
            for (int i4 = 0; i4 < P0.size(); i4++) {
                P0.get(i4).d().d(t4, jVar);
            }
            z4 = true ^ P0.isEmpty();
        }
        if (z4) {
            invalidateSelf();
            if (t4 == s0.E) {
                o1(c0());
            }
        }
    }

    public boolean x1() {
        return this.f39170o == null && this.f39157b.c().B() > 0;
    }

    public <T> void y(com.airbnb.lottie.model.e eVar, T t4, com.airbnb.lottie.value.l<T> lVar) {
        x(eVar, t4, new b(lVar));
    }
}
