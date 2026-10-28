package com.lxj.xpopup.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: PhotoViewAttacher.java */
/* loaded from: classes5.dex */
public class k implements View.OnTouchListener, View.OnLayoutChangeListener {

    /* renamed from: c0, reason: collision with root package name */
    private static float f21216c0 = 4.0f;

    /* renamed from: d0, reason: collision with root package name */
    private static float f21217d0 = 2.5f;

    /* renamed from: e0, reason: collision with root package name */
    private static float f21218e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    private static int f21219f0 = 200;

    /* renamed from: g0, reason: collision with root package name */
    private static final int f21220g0 = -1;

    /* renamed from: h0, reason: collision with root package name */
    private static final int f21221h0 = 0;

    /* renamed from: i0, reason: collision with root package name */
    private static final int f21222i0 = 1;

    /* renamed from: j0, reason: collision with root package name */
    private static final int f21223j0 = 2;

    /* renamed from: k0, reason: collision with root package name */
    private static final int f21224k0 = -1;

    /* renamed from: l0, reason: collision with root package name */
    private static final int f21225l0 = 0;

    /* renamed from: m0, reason: collision with root package name */
    private static final int f21226m0 = 1;

    /* renamed from: n0, reason: collision with root package name */
    private static final int f21227n0 = 2;

    /* renamed from: o0, reason: collision with root package name */
    private static int f21228o0 = 1;
    private com.lxj.xpopup.photoview.d D;
    private com.lxj.xpopup.photoview.f E;
    private com.lxj.xpopup.photoview.e F;
    private j G;
    private View.OnClickListener H;
    private View.OnLongClickListener I;
    private g J;
    private h K;
    private i L;
    private f M;
    private float P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean U;
    public boolean V;

    /* renamed from: a0, reason: collision with root package name */
    float f21229a0;

    /* renamed from: b0, reason: collision with root package name */
    float f21230b0;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f21238v;

    /* renamed from: w, reason: collision with root package name */
    private GestureDetector f21239w;

    /* renamed from: x, reason: collision with root package name */
    private com.lxj.xpopup.photoview.b f21240x;

    /* renamed from: o, reason: collision with root package name */
    private Interpolator f21231o = new AccelerateDecelerateInterpolator();

    /* renamed from: p, reason: collision with root package name */
    private int f21232p = f21219f0;

    /* renamed from: q, reason: collision with root package name */
    private float f21233q = f21218e0;

    /* renamed from: r, reason: collision with root package name */
    private float f21234r = f21217d0;

    /* renamed from: s, reason: collision with root package name */
    private float f21235s = f21216c0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f21236t = true;

    /* renamed from: u, reason: collision with root package name */
    private boolean f21237u = false;

    /* renamed from: y, reason: collision with root package name */
    private final Matrix f21241y = new Matrix();

    /* renamed from: z, reason: collision with root package name */
    private final Matrix f21242z = new Matrix();
    private final Matrix A = new Matrix();
    private final RectF B = new RectF();
    private final float[] C = new float[9];
    private int N = 2;
    private int O = 2;
    public boolean T = false;
    private boolean W = true;
    private boolean X = false;
    private ImageView.ScaleType Y = ImageView.ScaleType.FIT_CENTER;
    private com.lxj.xpopup.photoview.c Z = new a();

    /* compiled from: PhotoViewAttacher.java */
    class a implements com.lxj.xpopup.photoview.c {
        a() {
        }

        @Override // com.lxj.xpopup.photoview.c
        public void a(float dx, float dy) {
            if (k.this.f21240x.e()) {
                return;
            }
            if (k.this.L != null) {
                k.this.L.a(dx, dy);
            }
            k.this.A.postTranslate(dx, dy);
            k.this.C();
            k kVar = k.this;
            kVar.Q = kVar.O == 0 && k.this.O() != 1.0f;
            k kVar2 = k.this;
            kVar2.R = kVar2.O == 1 && k.this.O() != 1.0f;
            k kVar3 = k.this;
            kVar3.S = kVar3.N == 0 && k.this.O() != 1.0f;
            k kVar4 = k.this;
            kVar4.T = kVar4.N == 1 && k.this.O() != 1.0f;
            ViewParent parent = k.this.f21238v.getParent();
            if (parent == null) {
                return;
            }
            if (!k.this.f21236t || k.this.f21240x.e() || k.this.f21237u) {
                if (k.this.N == 2 && k.this.X && k.this.V) {
                    parent.requestDisallowInterceptTouchEvent(false);
                    return;
                }
                if ((k.this.N != 1 && k.this.N != 0) || k.this.X || k.this.V) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                } else {
                    parent.requestDisallowInterceptTouchEvent(false);
                    return;
                }
            }
            if ((k.this.N == 2 && !k.this.X) || ((k.this.N == 0 && dx >= 0.0f && k.this.V) || (k.this.N == 1 && dx <= -0.0f && k.this.V))) {
                parent.requestDisallowInterceptTouchEvent(false);
                return;
            }
            if (k.this.O != 2 || !k.this.U) {
                k kVar5 = k.this;
                if ((!kVar5.Q || dy <= 0.0f || !kVar5.U) && (!kVar5.R || dy >= 0.0f || !kVar5.U)) {
                    if (kVar5.X) {
                        if ((k.this.O == 0 && dy > 0.0f && k.this.U) || (k.this.O == 1 && dy < 0.0f && k.this.U)) {
                            parent.requestDisallowInterceptTouchEvent(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            parent.requestDisallowInterceptTouchEvent(false);
        }

        @Override // com.lxj.xpopup.photoview.c
        public void b(float scaleFactor, float focusX, float focusY) {
            if (k.this.O() < k.this.f21235s || scaleFactor < 1.0f) {
                if (k.this.J != null) {
                    k.this.J.a(scaleFactor, focusX, focusY);
                }
                k.this.A.postScale(scaleFactor, scaleFactor, focusX, focusY);
                k.this.C();
            }
        }

        @Override // com.lxj.xpopup.photoview.c
        public void c(float startX, float startY, float velocityX, float velocityY) {
            k kVar = k.this;
            kVar.M = kVar.new f(kVar.f21238v.getContext());
            f fVar = k.this.M;
            k kVar2 = k.this;
            int K = kVar2.K(kVar2.f21238v);
            k kVar3 = k.this;
            fVar.b(K, kVar3.J(kVar3.f21238v), (int) velocityX, (int) velocityY);
            k.this.f21238v.post(k.this.M);
        }
    }

    /* compiled from: PhotoViewAttacher.java */
    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent e12, MotionEvent e22, float velocityX, float velocityY) {
            if (k.this.K == null || k.this.O() > k.f21218e0 || e12.getPointerCount() > k.f21228o0 || e22.getPointerCount() > k.f21228o0) {
                return false;
            }
            return k.this.K.onFling(e12, e22, velocityX, velocityY);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent e6) {
            if (k.this.I != null) {
                k.this.I.onLongClick(k.this.f21238v);
            }
        }
    }

    /* compiled from: PhotoViewAttacher.java */
    class c implements GestureDetector.OnDoubleTapListener {
        c() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent ev) {
            try {
                float O = k.this.O();
                float x5 = ev.getX();
                float y5 = ev.getY();
                if (O < k.this.M()) {
                    k kVar = k.this;
                    kVar.p0(kVar.M(), x5, y5, true);
                } else if (O < k.this.M() || O >= k.this.L()) {
                    k kVar2 = k.this;
                    kVar2.p0(kVar2.N(), x5, y5, true);
                } else {
                    k kVar3 = k.this;
                    kVar3.p0(kVar3.L(), x5, y5, true);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent e6) {
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent e6) {
            if (k.this.H != null) {
                k.this.H.onClick(k.this.f21238v);
            }
            RectF F = k.this.F();
            float x5 = e6.getX();
            float y5 = e6.getY();
            if (k.this.G != null) {
                k.this.G.a(k.this.f21238v, x5, y5);
            }
            if (F == null) {
                return false;
            }
            if (!F.contains(x5, y5)) {
                if (k.this.F == null) {
                    return false;
                }
                k.this.F.a(k.this.f21238v);
                return false;
            }
            float width = (x5 - F.left) / F.width();
            float height = (y5 - F.top) / F.height();
            if (k.this.E == null) {
                return true;
            }
            k.this.E.a(k.this.f21238v, width, height);
            return true;
        }
    }

    /* compiled from: PhotoViewAttacher.java */
    static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21246a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f21246a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21246a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21246a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21246a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: PhotoViewAttacher.java */
    private class e implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final float f21247o;

        /* renamed from: p, reason: collision with root package name */
        private final float f21248p;

        /* renamed from: q, reason: collision with root package name */
        private final long f21249q = System.currentTimeMillis();

        /* renamed from: r, reason: collision with root package name */
        private final float f21250r;

        /* renamed from: s, reason: collision with root package name */
        private final float f21251s;

        public e(final float currentZoom, final float targetZoom, final float focalX, final float focalY) {
            this.f21247o = focalX;
            this.f21248p = focalY;
            this.f21250r = currentZoom;
            this.f21251s = targetZoom;
        }

        private float a() {
            return k.this.f21231o.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f21249q) * 1.0f) / k.this.f21232p));
        }

        @Override // java.lang.Runnable
        public void run() {
            float a6 = a();
            float f6 = this.f21250r;
            k.this.Z.b(androidx.appcompat.graphics.drawable.d.a(this.f21251s, f6, a6, f6) / k.this.O(), this.f21247o, this.f21248p);
            if (a6 < 1.0f) {
                k.this.f21238v.postOnAnimation(this);
            }
        }
    }

    /* compiled from: PhotoViewAttacher.java */
    private class f implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final OverScroller f21253o;

        /* renamed from: p, reason: collision with root package name */
        private int f21254p;

        /* renamed from: q, reason: collision with root package name */
        private int f21255q;

        public f(Context context) {
            this.f21253o = new OverScroller(context);
        }

        public void a() {
            this.f21253o.forceFinished(true);
        }

        public void b(int viewWidth, int viewHeight, int velocityX, int velocityY) {
            int i5;
            int i6;
            int i7;
            int i8;
            RectF F = k.this.F();
            if (F == null) {
                return;
            }
            int round = Math.round(-F.left);
            float f6 = viewWidth;
            if (f6 < F.width()) {
                i6 = Math.round(F.width() - f6);
                i5 = 0;
            } else {
                i5 = round;
                i6 = i5;
            }
            int round2 = Math.round(-F.top);
            float f7 = viewHeight;
            if (f7 < F.height()) {
                i8 = Math.round(F.height() - f7);
                i7 = 0;
            } else {
                i7 = round2;
                i8 = i7;
            }
            this.f21254p = round;
            this.f21255q = round2;
            if (round == i6 && round2 == i8) {
                return;
            }
            this.f21253o.fling(round, round2, velocityX, velocityY, i5, i6, i7, i8, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f21253o.isFinished() && this.f21253o.computeScrollOffset()) {
                int currX = this.f21253o.getCurrX();
                int currY = this.f21253o.getCurrY();
                k.this.A.postTranslate(this.f21254p - currX, this.f21255q - currY);
                k.this.C();
                this.f21254p = currX;
                this.f21255q = currY;
                k.this.f21238v.postOnAnimation(this);
            }
        }
    }

    public k(ImageView imageView) {
        this.f21238v = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.P = 0.0f;
        this.f21240x = new com.lxj.xpopup.photoview.b(imageView.getContext(), this.Z);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new b());
        this.f21239w = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new c());
    }

    private void B() {
        f fVar = this.M;
        if (fVar != null) {
            fVar.a();
            this.M = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (D()) {
            Y(H());
        }
    }

    private boolean D() {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        RectF G = G(H());
        if (G == null) {
            return false;
        }
        float height = G.height();
        float width = G.width();
        float J = J(this.f21238v);
        float f11 = 0.0f;
        if (height > J || G.top < 0.0f) {
            float f12 = G.top;
            if (f12 >= 0.0f) {
                this.O = 0;
                f6 = -f12;
            } else {
                float f13 = G.bottom;
                if (f13 <= J) {
                    this.O = 1;
                    f6 = J - f13;
                } else {
                    this.O = -1;
                    f6 = 0.0f;
                }
            }
        } else {
            int i5 = d.f21246a[this.Y.ordinal()];
            if (i5 != 2) {
                if (i5 != 3) {
                    f9 = (J - height) / 2.0f;
                    f10 = G.top;
                } else {
                    f9 = J - height;
                    f10 = G.top;
                }
                f6 = f9 - f10;
            } else {
                f6 = -G.top;
            }
            this.O = 2;
        }
        float K = K(this.f21238v);
        if (width > K || G.left < 0.0f) {
            float f14 = G.left;
            if (f14 >= 0.0f) {
                this.N = 0;
                f11 = -f14;
            } else {
                float f15 = G.right;
                if (f15 <= K) {
                    f11 = K - f15;
                    this.N = 1;
                } else {
                    this.N = -1;
                }
            }
        } else {
            int i6 = d.f21246a[this.Y.ordinal()];
            if (i6 != 2) {
                if (i6 != 3) {
                    f7 = (K - width) / 2.0f;
                    f8 = G.left;
                } else {
                    f7 = K - width;
                    f8 = G.left;
                }
                f11 = f7 - f8;
            } else {
                f11 = -G.left;
            }
            this.N = 2;
        }
        this.A.postTranslate(f11, f6);
        return true;
    }

    private RectF G(Matrix matrix) {
        if (this.f21238v.getDrawable() == null) {
            return null;
        }
        this.B.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        matrix.mapRect(this.B);
        return this.B;
    }

    private Matrix H() {
        this.f21242z.set(this.f21241y);
        this.f21242z.postConcat(this.A);
        return this.f21242z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int J(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int K(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingStart()) - imageView.getPaddingEnd();
    }

    private void U() {
        this.A.reset();
        m0(this.P);
        Y(H());
        D();
    }

    private void Y(Matrix matrix) {
        RectF G;
        this.f21238v.setImageMatrix(matrix);
        if (this.D == null || (G = G(matrix)) == null) {
            return;
        }
        this.D.a(G);
    }

    private void x0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        float K = K(this.f21238v);
        float J = J(this.f21238v);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f21241y.reset();
        float f6 = intrinsicWidth;
        float f7 = K / f6;
        float f8 = intrinsicHeight;
        float f9 = J / f8;
        ImageView.ScaleType scaleType = this.Y;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f21241y.postTranslate((K - f6) / 2.0f, (J - f8) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float max = Math.max(f7, f9);
            this.f21241y.postScale(max, max);
            this.f21241y.postTranslate((K - (f6 * max)) / 2.0f, (J - (f8 * max)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float min = Math.min(1.0f, Math.min(f7, f9));
            this.f21241y.postScale(min, min);
            this.f21241y.postTranslate((K - (f6 * min)) / 2.0f, (J - (f8 * min)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f6, f8);
            RectF rectF2 = new RectF(0.0f, 0.0f, K, J);
            if (((int) this.P) % SubsamplingScaleImageView.ORIENTATION_180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f8, f6);
            }
            int i5 = d.f21246a[this.Y.ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    this.f21241y.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                } else if (i5 == 3) {
                    this.f21241y.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                } else if (i5 == 4) {
                    this.f21241y.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                }
            } else if ((f8 * 1.0f) / f6 > (J * 1.0f) / K) {
                this.X = true;
                this.f21241y.setRectToRect(rectF, new RectF(0.0f, 0.0f, K, f8 * f7), Matrix.ScaleToFit.START);
            } else {
                this.f21241y.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            }
        }
        U();
    }

    public void E(Matrix matrix) {
        matrix.set(H());
    }

    public RectF F() {
        D();
        return G(H());
    }

    public Matrix I() {
        return this.f21242z;
    }

    public float L() {
        return this.f21235s;
    }

    public float M() {
        return this.f21234r;
    }

    public float N() {
        return this.f21233q;
    }

    public float O() {
        return (float) Math.sqrt(((float) Math.pow(R(this.A, 0), 2.0d)) + ((float) Math.pow(R(this.A, 3), 2.0d)));
    }

    public ImageView.ScaleType P() {
        return this.Y;
    }

    public void Q(Matrix matrix) {
        matrix.set(this.A);
    }

    public float R(Matrix matrix, int whichValue) {
        matrix.getValues(this.C);
        return this.C[whichValue];
    }

    @Deprecated
    public boolean S() {
        return this.W;
    }

    public boolean T() {
        return this.W;
    }

    public void V(boolean allow) {
        this.f21236t = allow;
    }

    public void W(final float degrees) {
        this.P = degrees % 360.0f;
        w0();
        m0(this.P);
        C();
    }

    public boolean X(Matrix finalMatrix) {
        if (finalMatrix == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㔊"));
        }
        if (this.f21238v.getDrawable() == null) {
            return false;
        }
        this.A.set(finalMatrix);
        C();
        return true;
    }

    public void Z(float maximumScale) {
        l.a(this.f21233q, this.f21234r, maximumScale);
        this.f21235s = maximumScale;
    }

    public void a0(float mediumScale) {
        l.a(this.f21233q, mediumScale, this.f21235s);
        this.f21234r = mediumScale;
    }

    public void b0(float minimumScale) {
        l.a(minimumScale, this.f21234r, this.f21235s);
        this.f21233q = minimumScale;
    }

    public void c0(View.OnClickListener listener) {
        this.H = listener;
    }

    public void d0(GestureDetector.OnDoubleTapListener newOnDoubleTapListener) {
        this.f21239w.setOnDoubleTapListener(newOnDoubleTapListener);
    }

    public void e0(View.OnLongClickListener listener) {
        this.I = listener;
    }

    public void f0(com.lxj.xpopup.photoview.d listener) {
        this.D = listener;
    }

    public void g0(com.lxj.xpopup.photoview.e mOutsidePhotoTapListener) {
        this.F = mOutsidePhotoTapListener;
    }

    public void h0(com.lxj.xpopup.photoview.f listener) {
        this.E = listener;
    }

    public void i0(g onScaleChangeListener) {
        this.J = onScaleChangeListener;
    }

    public void j0(h onSingleFlingListener) {
        this.K = onSingleFlingListener;
    }

    public void k0(i listener) {
        this.L = listener;
    }

    public void l0(j listener) {
        this.G = listener;
    }

    public void m0(float degrees) {
        this.A.postRotate(degrees % 360.0f);
        C();
    }

    public void n0(float degrees) {
        this.A.setRotate(degrees % 360.0f);
        C();
    }

    public void o0(float scale) {
        q0(scale, false);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View v5, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        if (left == oldLeft && top == oldTop && right == oldRight && bottom == oldBottom) {
            return;
        }
        x0(this.f21238v.getDrawable());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r0 != 3) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011e  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lxj.xpopup.photoview.k.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void p0(float scale, float focalX, float focalY, boolean animate) {
        if (animate) {
            this.f21238v.post(new e(O(), scale, focalX, focalY));
        } else {
            this.A.setScale(scale, scale, focalX, focalY);
            C();
        }
    }

    public void q0(float scale, boolean animate) {
        p0(scale, this.f21238v.getRight() / 2, this.f21238v.getBottom() / 2, animate);
    }

    public void r0(float minimumScale, float mediumScale, float maximumScale) {
        l.a(minimumScale, mediumScale, maximumScale);
        this.f21233q = minimumScale;
        this.f21234r = mediumScale;
        this.f21235s = maximumScale;
    }

    public void s0(ImageView.ScaleType scaleType) {
        if (!l.d(scaleType) || scaleType == this.Y) {
            return;
        }
        this.Y = scaleType;
        w0();
    }

    public void t0(Interpolator interpolator) {
        this.f21231o = interpolator;
    }

    public void u0(int milliseconds) {
        this.f21232p = milliseconds;
    }

    public void v0(boolean zoomable) {
        this.W = zoomable;
        w0();
    }

    public void w0() {
        if (this.W) {
            x0(this.f21238v.getDrawable());
        } else {
            U();
        }
    }
}
