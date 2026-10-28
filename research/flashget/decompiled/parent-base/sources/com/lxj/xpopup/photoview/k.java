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
import androidx.compose.material3.f4;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: PhotoViewAttacher.java */
/* loaded from: classes6.dex */
public class k implements View.OnTouchListener, View.OnLayoutChangeListener {
    private static final int L2 = -1;
    private static final int M2 = 0;
    private static final int N2 = 1;
    private static final int O2 = 2;
    private static float P = 4.0f;
    private static int P2 = 1;
    private static float Q = 2.5f;
    private static final int Q1 = 1;
    private static float R = 1.0f;
    private static final int V1 = 2;
    private static int X = 200;
    private static final int Y = -1;
    private static final int Z = 0;
    private float C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean H;
    public boolean I;
    float N;
    float O;

    /* renamed from: i, reason: collision with root package name */
    private ImageView f69702i;

    /* renamed from: j, reason: collision with root package name */
    private GestureDetector f69703j;

    /* renamed from: k, reason: collision with root package name */
    private com.lxj.xpopup.photoview.b f69704k;

    /* renamed from: q, reason: collision with root package name */
    private com.lxj.xpopup.photoview.d f69710q;

    /* renamed from: r, reason: collision with root package name */
    private com.lxj.xpopup.photoview.f f69711r;

    /* renamed from: s, reason: collision with root package name */
    private com.lxj.xpopup.photoview.e f69712s;

    /* renamed from: t, reason: collision with root package name */
    private j f69713t;

    /* renamed from: u, reason: collision with root package name */
    private View.OnClickListener f69714u;

    /* renamed from: v, reason: collision with root package name */
    private View.OnLongClickListener f69715v;

    /* renamed from: w, reason: collision with root package name */
    private g f69716w;

    /* renamed from: x, reason: collision with root package name */
    private h f69717x;

    /* renamed from: y, reason: collision with root package name */
    private i f69718y;

    /* renamed from: z, reason: collision with root package name */
    private f f69719z;

    /* renamed from: b, reason: collision with root package name */
    private Interpolator f69695b = new AccelerateDecelerateInterpolator();

    /* renamed from: c, reason: collision with root package name */
    private int f69696c = X;

    /* renamed from: d, reason: collision with root package name */
    private float f69697d = R;

    /* renamed from: e, reason: collision with root package name */
    private float f69698e = Q;

    /* renamed from: f, reason: collision with root package name */
    private float f69699f = P;

    /* renamed from: g, reason: collision with root package name */
    private boolean f69700g = true;

    /* renamed from: h, reason: collision with root package name */
    private boolean f69701h = false;

    /* renamed from: l, reason: collision with root package name */
    private final Matrix f69705l = new Matrix();

    /* renamed from: m, reason: collision with root package name */
    private final Matrix f69706m = new Matrix();

    /* renamed from: n, reason: collision with root package name */
    private final Matrix f69707n = new Matrix();

    /* renamed from: o, reason: collision with root package name */
    private final RectF f69708o = new RectF();

    /* renamed from: p, reason: collision with root package name */
    private final float[] f69709p = new float[9];
    private int A = 2;
    private int B = 2;
    public boolean G = false;
    private boolean J = true;
    private boolean K = false;
    private ImageView.ScaleType L = ImageView.ScaleType.FIT_CENTER;
    private com.lxj.xpopup.photoview.c M = new a();

    /* compiled from: PhotoViewAttacher.java */
    class a implements com.lxj.xpopup.photoview.c {
        a() {
        }

        @Override // com.lxj.xpopup.photoview.c
        public void onDrag(float dx, float dy) {
            if (k.this.f69704k.e()) {
                return;
            }
            if (k.this.f69718y != null) {
                k.this.f69718y.onDrag(dx, dy);
            }
            k.this.f69707n.postTranslate(dx, dy);
            k.this.C();
            k kVar = k.this;
            kVar.D = kVar.B == 0 && k.this.O() != 1.0f;
            k kVar2 = k.this;
            kVar2.E = kVar2.B == 1 && k.this.O() != 1.0f;
            k kVar3 = k.this;
            kVar3.F = kVar3.A == 0 && k.this.O() != 1.0f;
            k kVar4 = k.this;
            kVar4.G = kVar4.A == 1 && k.this.O() != 1.0f;
            ViewParent parent = k.this.f69702i.getParent();
            if (parent == null) {
                return;
            }
            if (!k.this.f69700g || k.this.f69704k.e() || k.this.f69701h) {
                if (k.this.A == 2 && k.this.K && k.this.I) {
                    parent.requestDisallowInterceptTouchEvent(false);
                    return;
                }
                if ((k.this.A != 1 && k.this.A != 0) || k.this.K || k.this.I) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                } else {
                    parent.requestDisallowInterceptTouchEvent(false);
                    return;
                }
            }
            if ((k.this.A == 2 && !k.this.K) || ((k.this.A == 0 && dx >= 0.0f && k.this.I) || (k.this.A == 1 && dx <= -0.0f && k.this.I))) {
                parent.requestDisallowInterceptTouchEvent(false);
                return;
            }
            if (k.this.B != 2 || !k.this.H) {
                k kVar5 = k.this;
                if ((!kVar5.D || dy <= 0.0f || !kVar5.H) && (!kVar5.E || dy >= 0.0f || !kVar5.H)) {
                    if (kVar5.K) {
                        if ((k.this.B == 0 && dy > 0.0f && k.this.H) || (k.this.B == 1 && dy < 0.0f && k.this.H)) {
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
        public void onFling(float startX, float startY, float velocityX, float velocityY) {
            k kVar = k.this;
            kVar.f69719z = kVar.new f(kVar.f69702i.getContext());
            f fVar = k.this.f69719z;
            k kVar2 = k.this;
            int K = kVar2.K(kVar2.f69702i);
            k kVar3 = k.this;
            fVar.b(K, kVar3.J(kVar3.f69702i), (int) velocityX, (int) velocityY);
            k.this.f69702i.post(k.this.f69719z);
        }

        @Override // com.lxj.xpopup.photoview.c
        public void onScale(float scaleFactor, float focusX, float focusY) {
            if (k.this.O() < k.this.f69699f || scaleFactor < 1.0f) {
                if (k.this.f69716w != null) {
                    k.this.f69716w.onScaleChange(scaleFactor, focusX, focusY);
                }
                k.this.f69707n.postScale(scaleFactor, scaleFactor, focusX, focusY);
                k.this.C();
            }
        }
    }

    /* compiled from: PhotoViewAttacher.java */
    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent e12, MotionEvent e22, float velocityX, float velocityY) {
            if (k.this.f69717x == null || k.this.O() > k.R || e12.getPointerCount() > k.P2 || e22.getPointerCount() > k.P2) {
                return false;
            }
            return k.this.f69717x.onFling(e12, e22, velocityX, velocityY);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent e4) {
            if (k.this.f69715v != null) {
                k.this.f69715v.onLongClick(k.this.f69702i);
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
                float x4 = ev.getX();
                float y4 = ev.getY();
                if (O < k.this.M()) {
                    k kVar = k.this;
                    kVar.p0(kVar.M(), x4, y4, true);
                } else if (O < k.this.M() || O >= k.this.L()) {
                    k kVar2 = k.this;
                    kVar2.p0(kVar2.N(), x4, y4, true);
                } else {
                    k kVar3 = k.this;
                    kVar3.p0(kVar3.L(), x4, y4, true);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent e4) {
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent e4) {
            if (k.this.f69714u != null) {
                k.this.f69714u.onClick(k.this.f69702i);
            }
            RectF F = k.this.F();
            float x4 = e4.getX();
            float y4 = e4.getY();
            if (k.this.f69713t != null) {
                k.this.f69713t.onViewTap(k.this.f69702i, x4, y4);
            }
            if (F == null) {
                return false;
            }
            if (!F.contains(x4, y4)) {
                if (k.this.f69712s == null) {
                    return false;
                }
                k.this.f69712s.onOutsidePhotoTap(k.this.f69702i);
                return false;
            }
            float width = (x4 - F.left) / F.width();
            float height = (y4 - F.top) / F.height();
            if (k.this.f69711r == null) {
                return true;
            }
            k.this.f69711r.onPhotoTap(k.this.f69702i, width, height);
            return true;
        }
    }

    /* compiled from: PhotoViewAttacher.java */
    static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f69723a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f69723a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69723a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69723a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69723a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: PhotoViewAttacher.java */
    private class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final float f69724b;

        /* renamed from: c, reason: collision with root package name */
        private final float f69725c;

        /* renamed from: d, reason: collision with root package name */
        private final long f69726d = System.currentTimeMillis();

        /* renamed from: e, reason: collision with root package name */
        private final float f69727e;

        /* renamed from: f, reason: collision with root package name */
        private final float f69728f;

        public e(final float currentZoom, final float targetZoom, final float focalX, final float focalY) {
            this.f69724b = focalX;
            this.f69725c = focalY;
            this.f69727e = currentZoom;
            this.f69728f = targetZoom;
        }

        private float a() {
            return k.this.f69695b.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f69726d) * 1.0f) / k.this.f69696c));
        }

        @Override // java.lang.Runnable
        public void run() {
            float a5 = a();
            float f4 = this.f69727e;
            k.this.M.onScale(androidx.appcompat.graphics.drawable.d.a(this.f69728f, f4, a5, f4) / k.this.O(), this.f69724b, this.f69725c);
            if (a5 < 1.0f) {
                k.this.f69702i.postOnAnimation(this);
            }
        }
    }

    /* compiled from: PhotoViewAttacher.java */
    private class f implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final OverScroller f69730b;

        /* renamed from: c, reason: collision with root package name */
        private int f69731c;

        /* renamed from: d, reason: collision with root package name */
        private int f69732d;

        public f(Context context) {
            this.f69730b = new OverScroller(context);
        }

        public void a() {
            this.f69730b.forceFinished(true);
        }

        public void b(int viewWidth, int viewHeight, int velocityX, int velocityY) {
            int i4;
            int i5;
            int i6;
            int i7;
            RectF F = k.this.F();
            if (F == null) {
                return;
            }
            int round = Math.round(-F.left);
            float f4 = viewWidth;
            if (f4 < F.width()) {
                i5 = Math.round(F.width() - f4);
                i4 = 0;
            } else {
                i4 = round;
                i5 = i4;
            }
            int round2 = Math.round(-F.top);
            float f5 = viewHeight;
            if (f5 < F.height()) {
                i7 = Math.round(F.height() - f5);
                i6 = 0;
            } else {
                i6 = round2;
                i7 = i6;
            }
            this.f69731c = round;
            this.f69732d = round2;
            if (round == i5 && round2 == i7) {
                return;
            }
            this.f69730b.fling(round, round2, velocityX, velocityY, i4, i5, i6, i7, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f69730b.isFinished() && this.f69730b.computeScrollOffset()) {
                int currX = this.f69730b.getCurrX();
                int currY = this.f69730b.getCurrY();
                k.this.f69707n.postTranslate(this.f69731c - currX, this.f69732d - currY);
                k.this.C();
                this.f69731c = currX;
                this.f69732d = currY;
                k.this.f69702i.postOnAnimation(this);
            }
        }
    }

    public k(ImageView imageView) {
        this.f69702i = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.C = 0.0f;
        this.f69704k = new com.lxj.xpopup.photoview.b(imageView.getContext(), this.M);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new b());
        this.f69703j = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new c());
    }

    private void B() {
        f fVar = this.f69719z;
        if (fVar != null) {
            fVar.a();
            this.f69719z = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (D()) {
            Y(H());
        }
    }

    private boolean D() {
        float f4;
        float f5;
        float f6;
        float f7;
        float f10;
        RectF G = G(H());
        if (G == null) {
            return false;
        }
        float height = G.height();
        float width = G.width();
        float J = J(this.f69702i);
        float f11 = 0.0f;
        if (height > J || G.top < 0.0f) {
            float f12 = G.top;
            if (f12 >= 0.0f) {
                this.B = 0;
                f4 = -f12;
            } else {
                float f13 = G.bottom;
                if (f13 <= J) {
                    this.B = 1;
                    f4 = J - f13;
                } else {
                    this.B = -1;
                    f4 = 0.0f;
                }
            }
        } else {
            int i4 = d.f69723a[this.L.ordinal()];
            if (i4 != 2) {
                if (i4 != 3) {
                    f7 = (J - height) / 2.0f;
                    f10 = G.top;
                } else {
                    f7 = J - height;
                    f10 = G.top;
                }
                f4 = f7 - f10;
            } else {
                f4 = -G.top;
            }
            this.B = 2;
        }
        float K = K(this.f69702i);
        if (width > K || G.left < 0.0f) {
            float f14 = G.left;
            if (f14 >= 0.0f) {
                this.A = 0;
                f11 = -f14;
            } else {
                float f15 = G.right;
                if (f15 <= K) {
                    f11 = K - f15;
                    this.A = 1;
                } else {
                    this.A = -1;
                }
            }
        } else {
            int i5 = d.f69723a[this.L.ordinal()];
            if (i5 != 2) {
                if (i5 != 3) {
                    f5 = (K - width) / 2.0f;
                    f6 = G.left;
                } else {
                    f5 = K - width;
                    f6 = G.left;
                }
                f11 = f5 - f6;
            } else {
                f11 = -G.left;
            }
            this.A = 2;
        }
        this.f69707n.postTranslate(f11, f4);
        return true;
    }

    private RectF G(Matrix matrix) {
        if (this.f69702i.getDrawable() == null) {
            return null;
        }
        this.f69708o.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        matrix.mapRect(this.f69708o);
        return this.f69708o;
    }

    private Matrix H() {
        this.f69706m.set(this.f69705l);
        this.f69706m.postConcat(this.f69707n);
        return this.f69706m;
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
        this.f69707n.reset();
        m0(this.C);
        Y(H());
        D();
    }

    private void Y(Matrix matrix) {
        RectF G;
        this.f69702i.setImageMatrix(matrix);
        if (this.f69710q == null || (G = G(matrix)) == null) {
            return;
        }
        this.f69710q.onMatrixChanged(G);
    }

    private void x0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        float K = K(this.f69702i);
        float J = J(this.f69702i);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f69705l.reset();
        float f4 = intrinsicWidth;
        float f5 = K / f4;
        float f6 = intrinsicHeight;
        float f7 = J / f6;
        ImageView.ScaleType scaleType = this.L;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f69705l.postTranslate((K - f4) / 2.0f, (J - f6) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float max = Math.max(f5, f7);
            this.f69705l.postScale(max, max);
            this.f69705l.postTranslate(f4.a(f4, max, K, 2.0f), f4.a(f6, max, J, 2.0f));
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float min = Math.min(1.0f, Math.min(f5, f7));
            this.f69705l.postScale(min, min);
            this.f69705l.postTranslate(f4.a(f4, min, K, 2.0f), f4.a(f6, min, J, 2.0f));
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f4, f6);
            RectF rectF2 = new RectF(0.0f, 0.0f, K, J);
            if (((int) this.C) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f6, f4);
            }
            int i4 = d.f69723a[this.L.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    this.f69705l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                } else if (i4 == 3) {
                    this.f69705l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                } else if (i4 == 4) {
                    this.f69705l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                }
            } else if ((f6 * 1.0f) / f4 > (J * 1.0f) / K) {
                this.K = true;
                this.f69705l.setRectToRect(rectF, new RectF(0.0f, 0.0f, K, f6 * f5), Matrix.ScaleToFit.START);
            } else {
                this.f69705l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
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
        return this.f69706m;
    }

    public float L() {
        return this.f69699f;
    }

    public float M() {
        return this.f69698e;
    }

    public float N() {
        return this.f69697d;
    }

    public float O() {
        return (float) Math.sqrt(((float) Math.pow(R(this.f69707n, 0), 2.0d)) + ((float) Math.pow(R(this.f69707n, 3), 2.0d)));
    }

    public ImageView.ScaleType P() {
        return this.L;
    }

    public void Q(Matrix matrix) {
        matrix.set(this.f69707n);
    }

    public float R(Matrix matrix, int whichValue) {
        matrix.getValues(this.f69709p);
        return this.f69709p[whichValue];
    }

    @Deprecated
    public boolean S() {
        return this.J;
    }

    public boolean T() {
        return this.J;
    }

    public void V(boolean allow) {
        this.f69700g = allow;
    }

    public void W(final float degrees) {
        this.C = degrees % 360.0f;
        w0();
        m0(this.C);
        C();
    }

    public boolean X(Matrix finalMatrix) {
        if (finalMatrix == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ឡ\u0001"));
        }
        if (this.f69702i.getDrawable() == null) {
            return false;
        }
        this.f69707n.set(finalMatrix);
        C();
        return true;
    }

    public void Z(float maximumScale) {
        l.a(this.f69697d, this.f69698e, maximumScale);
        this.f69699f = maximumScale;
    }

    public void a0(float mediumScale) {
        l.a(this.f69697d, mediumScale, this.f69699f);
        this.f69698e = mediumScale;
    }

    public void b0(float minimumScale) {
        l.a(minimumScale, this.f69698e, this.f69699f);
        this.f69697d = minimumScale;
    }

    public void c0(View.OnClickListener listener) {
        this.f69714u = listener;
    }

    public void d0(GestureDetector.OnDoubleTapListener newOnDoubleTapListener) {
        this.f69703j.setOnDoubleTapListener(newOnDoubleTapListener);
    }

    public void e0(View.OnLongClickListener listener) {
        this.f69715v = listener;
    }

    public void f0(com.lxj.xpopup.photoview.d listener) {
        this.f69710q = listener;
    }

    public void g0(com.lxj.xpopup.photoview.e mOutsidePhotoTapListener) {
        this.f69712s = mOutsidePhotoTapListener;
    }

    public void h0(com.lxj.xpopup.photoview.f listener) {
        this.f69711r = listener;
    }

    public void i0(g onScaleChangeListener) {
        this.f69716w = onScaleChangeListener;
    }

    public void j0(h onSingleFlingListener) {
        this.f69717x = onSingleFlingListener;
    }

    public void k0(i listener) {
        this.f69718y = listener;
    }

    public void l0(j listener) {
        this.f69713t = listener;
    }

    public void m0(float degrees) {
        this.f69707n.postRotate(degrees % 360.0f);
        C();
    }

    public void n0(float degrees) {
        this.f69707n.setRotate(degrees % 360.0f);
        C();
    }

    public void o0(float scale) {
        q0(scale, false);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View v4, int left, int top2, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        if (left == oldLeft && top2 == oldTop && right == oldRight && bottom == oldBottom) {
            return;
        }
        x0(this.f69702i.getDrawable());
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
            this.f69702i.post(new e(O(), scale, focalX, focalY));
        } else {
            this.f69707n.setScale(scale, scale, focalX, focalY);
            C();
        }
    }

    public void q0(float scale, boolean animate) {
        p0(scale, this.f69702i.getRight() / 2, this.f69702i.getBottom() / 2, animate);
    }

    public void r0(float minimumScale, float mediumScale, float maximumScale) {
        l.a(minimumScale, mediumScale, maximumScale);
        this.f69697d = minimumScale;
        this.f69698e = mediumScale;
        this.f69699f = maximumScale;
    }

    public void s0(ImageView.ScaleType scaleType) {
        if (!l.d(scaleType) || scaleType == this.L) {
            return;
        }
        this.L = scaleType;
        w0();
    }

    public void t0(Interpolator interpolator) {
        this.f69695b = interpolator;
    }

    public void u0(int milliseconds) {
        this.f69696c = milliseconds;
    }

    public void v0(boolean zoomable) {
        this.J = zoomable;
        w0();
    }

    public void w0() {
        if (this.J) {
            x0(this.f69702i.getDrawable());
        } else {
            U();
        }
    }
}
