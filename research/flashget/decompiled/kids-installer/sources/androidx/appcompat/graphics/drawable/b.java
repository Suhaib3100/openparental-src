package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: DrawableContainer.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
class b extends Drawable implements Drawable.Callback {
    private static final boolean A = false;
    private static final String B = "DrawableContainer";
    private static final boolean C = true;

    /* renamed from: o, reason: collision with root package name */
    private d f474o;

    /* renamed from: p, reason: collision with root package name */
    private Rect f475p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f476q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f477r;

    /* renamed from: t, reason: collision with root package name */
    private boolean f479t;

    /* renamed from: v, reason: collision with root package name */
    private boolean f481v;

    /* renamed from: w, reason: collision with root package name */
    private Runnable f482w;

    /* renamed from: x, reason: collision with root package name */
    private long f483x;

    /* renamed from: y, reason: collision with root package name */
    private long f484y;

    /* renamed from: z, reason: collision with root package name */
    private c f485z;

    /* renamed from: s, reason: collision with root package name */
    private int f478s = 255;

    /* renamed from: u, reason: collision with root package name */
    private int f480u = -1;

    /* compiled from: DrawableContainer.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(b.C);
            b.this.invalidateSelf();
        }
    }

    /* compiled from: DrawableContainer.java */
    @x0(21)
    /* renamed from: androidx.appcompat.graphics.drawable.b$b, reason: collision with other inner class name */
    private static class C0008b {
        private C0008b() {
        }

        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* compiled from: DrawableContainer.java */
    static class c implements Drawable.Callback {

        /* renamed from: o, reason: collision with root package name */
        private Drawable.Callback f487o;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f487o;
            this.f487o = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f487o = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@o0 Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@o0 Drawable drawable, @o0 Runnable runnable, long j5) {
            Drawable.Callback callback = this.f487o;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j5);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@o0 Drawable drawable, @o0 Runnable runnable) {
            Drawable.Callback callback = this.f487o;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* compiled from: DrawableContainer.java */
    static abstract class d extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* renamed from: a, reason: collision with root package name */
        final b f488a;

        /* renamed from: b, reason: collision with root package name */
        Resources f489b;

        /* renamed from: c, reason: collision with root package name */
        int f490c;

        /* renamed from: d, reason: collision with root package name */
        int f491d;

        /* renamed from: e, reason: collision with root package name */
        int f492e;

        /* renamed from: f, reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f493f;

        /* renamed from: g, reason: collision with root package name */
        Drawable[] f494g;

        /* renamed from: h, reason: collision with root package name */
        int f495h;

        /* renamed from: i, reason: collision with root package name */
        boolean f496i;

        /* renamed from: j, reason: collision with root package name */
        boolean f497j;

        /* renamed from: k, reason: collision with root package name */
        Rect f498k;

        /* renamed from: l, reason: collision with root package name */
        boolean f499l;

        /* renamed from: m, reason: collision with root package name */
        boolean f500m;

        /* renamed from: n, reason: collision with root package name */
        int f501n;

        /* renamed from: o, reason: collision with root package name */
        int f502o;

        /* renamed from: p, reason: collision with root package name */
        int f503p;

        /* renamed from: q, reason: collision with root package name */
        int f504q;

        /* renamed from: r, reason: collision with root package name */
        boolean f505r;

        /* renamed from: s, reason: collision with root package name */
        int f506s;

        /* renamed from: t, reason: collision with root package name */
        boolean f507t;

        /* renamed from: u, reason: collision with root package name */
        boolean f508u;

        /* renamed from: v, reason: collision with root package name */
        boolean f509v;

        /* renamed from: w, reason: collision with root package name */
        boolean f510w;

        /* renamed from: x, reason: collision with root package name */
        boolean f511x;

        /* renamed from: y, reason: collision with root package name */
        boolean f512y;

        /* renamed from: z, reason: collision with root package name */
        int f513z;

        d(d dVar, b bVar, Resources resources) {
            this.f496i = false;
            this.f499l = false;
            this.f511x = b.C;
            this.A = 0;
            this.B = 0;
            this.f488a = bVar;
            this.f489b = resources != null ? resources : dVar != null ? dVar.f489b : null;
            int g5 = b.g(resources, dVar != null ? dVar.f490c : 0);
            this.f490c = g5;
            if (dVar == null) {
                this.f494g = new Drawable[10];
                this.f495h = 0;
                return;
            }
            this.f491d = dVar.f491d;
            this.f492e = dVar.f492e;
            this.f509v = b.C;
            this.f510w = b.C;
            this.f496i = dVar.f496i;
            this.f499l = dVar.f499l;
            this.f511x = dVar.f511x;
            this.f512y = dVar.f512y;
            this.f513z = dVar.f513z;
            this.A = dVar.A;
            this.B = dVar.B;
            this.C = dVar.C;
            this.D = dVar.D;
            this.E = dVar.E;
            this.F = dVar.F;
            this.G = dVar.G;
            this.H = dVar.H;
            this.I = dVar.I;
            if (dVar.f490c == g5) {
                if (dVar.f497j) {
                    this.f498k = dVar.f498k != null ? new Rect(dVar.f498k) : null;
                    this.f497j = b.C;
                }
                if (dVar.f500m) {
                    this.f501n = dVar.f501n;
                    this.f502o = dVar.f502o;
                    this.f503p = dVar.f503p;
                    this.f504q = dVar.f504q;
                    this.f500m = b.C;
                }
            }
            if (dVar.f505r) {
                this.f506s = dVar.f506s;
                this.f505r = b.C;
            }
            if (dVar.f507t) {
                this.f508u = dVar.f508u;
                this.f507t = b.C;
            }
            Drawable[] drawableArr = dVar.f494g;
            this.f494g = new Drawable[drawableArr.length];
            this.f495h = dVar.f495h;
            SparseArray<Drawable.ConstantState> sparseArray = dVar.f493f;
            if (sparseArray != null) {
                this.f493f = sparseArray.clone();
            } else {
                this.f493f = new SparseArray<>(this.f495h);
            }
            int i5 = this.f495h;
            for (int i6 = 0; i6 < i5; i6++) {
                Drawable drawable = drawableArr[i6];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f493f.put(i6, constantState);
                    } else {
                        this.f494g[i6] = drawableArr[i6];
                    }
                }
            }
        }

        private void f() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f493f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i5 = 0; i5 < size; i5++) {
                    this.f494g[this.f493f.keyAt(i5)] = w(this.f493f.valueAt(i5).newDrawable(this.f489b));
                }
                this.f493f = null;
            }
        }

        private Drawable w(Drawable drawable) {
            androidx.core.graphics.drawable.d.m(drawable, this.f513z);
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f488a);
            return mutate;
        }

        final boolean A(int i5, int i6) {
            int i7 = this.f495h;
            Drawable[] drawableArr = this.f494g;
            boolean z5 = false;
            for (int i8 = 0; i8 < i7; i8++) {
                Drawable drawable = drawableArr[i8];
                if (drawable != null) {
                    boolean m5 = androidx.core.graphics.drawable.d.m(drawable, i5);
                    if (i8 == i6) {
                        z5 = m5;
                    }
                }
            }
            this.f513z = i5;
            return z5;
        }

        public final void B(boolean z5) {
            this.f496i = z5;
        }

        final void C(Resources resources) {
            if (resources != null) {
                this.f489b = resources;
                int g5 = b.g(resources, this.f490c);
                int i5 = this.f490c;
                this.f490c = g5;
                if (i5 != g5) {
                    this.f500m = false;
                    this.f497j = false;
                }
            }
        }

        public final int a(Drawable drawable) {
            int i5 = this.f495h;
            if (i5 >= this.f494g.length) {
                r(i5, i5 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, b.C);
            drawable.setCallback(this.f488a);
            this.f494g[i5] = drawable;
            this.f495h++;
            this.f492e = drawable.getChangingConfigurations() | this.f492e;
            s();
            this.f498k = null;
            this.f497j = false;
            this.f500m = false;
            this.f509v = false;
            return i5;
        }

        @x0(21)
        final void b(Resources.Theme theme) {
            if (theme != null) {
                f();
                int i5 = this.f495h;
                Drawable[] drawableArr = this.f494g;
                for (int i6 = 0; i6 < i5; i6++) {
                    Drawable drawable = drawableArr[i6];
                    if (drawable != null && androidx.core.graphics.drawable.d.b(drawable)) {
                        androidx.core.graphics.drawable.d.a(drawableArr[i6], theme);
                        this.f492e |= drawableArr[i6].getChangingConfigurations();
                    }
                }
                C(theme.getResources());
            }
        }

        public boolean c() {
            if (this.f509v) {
                return this.f510w;
            }
            f();
            this.f509v = b.C;
            int i5 = this.f495h;
            Drawable[] drawableArr = this.f494g;
            for (int i6 = 0; i6 < i5; i6++) {
                if (drawableArr[i6].getConstantState() == null) {
                    this.f510w = false;
                    return false;
                }
            }
            this.f510w = b.C;
            return b.C;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @x0(21)
        public boolean canApplyTheme() {
            int i5 = this.f495h;
            Drawable[] drawableArr = this.f494g;
            for (int i6 = 0; i6 < i5; i6++) {
                Drawable drawable = drawableArr[i6];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f493f.get(i6);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return b.C;
                    }
                } else if (androidx.core.graphics.drawable.d.b(drawable)) {
                    return b.C;
                }
            }
            return false;
        }

        final void d() {
            this.f512y = false;
        }

        protected void e() {
            this.f500m = b.C;
            f();
            int i5 = this.f495h;
            Drawable[] drawableArr = this.f494g;
            this.f502o = -1;
            this.f501n = -1;
            this.f504q = 0;
            this.f503p = 0;
            for (int i6 = 0; i6 < i5; i6++) {
                Drawable drawable = drawableArr[i6];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f501n) {
                    this.f501n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f502o) {
                    this.f502o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f503p) {
                    this.f503p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f504q) {
                    this.f504q = minimumHeight;
                }
            }
        }

        final int g() {
            return this.f494g.length;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f491d | this.f492e;
        }

        public final Drawable h(int i5) {
            int indexOfKey;
            Drawable drawable = this.f494g[i5];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f493f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i5)) < 0) {
                return null;
            }
            Drawable w5 = w(this.f493f.valueAt(indexOfKey).newDrawable(this.f489b));
            this.f494g[i5] = w5;
            this.f493f.removeAt(indexOfKey);
            if (this.f493f.size() == 0) {
                this.f493f = null;
            }
            return w5;
        }

        public final int i() {
            return this.f495h;
        }

        public final int j() {
            if (!this.f500m) {
                e();
            }
            return this.f502o;
        }

        public final int k() {
            if (!this.f500m) {
                e();
            }
            return this.f504q;
        }

        public final int l() {
            if (!this.f500m) {
                e();
            }
            return this.f503p;
        }

        public final Rect m() {
            Rect rect = null;
            if (this.f496i) {
                return null;
            }
            Rect rect2 = this.f498k;
            if (rect2 != null || this.f497j) {
                return rect2;
            }
            f();
            Rect rect3 = new Rect();
            int i5 = this.f495h;
            Drawable[] drawableArr = this.f494g;
            for (int i6 = 0; i6 < i5; i6++) {
                if (drawableArr[i6].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i7 = rect3.left;
                    if (i7 > rect.left) {
                        rect.left = i7;
                    }
                    int i8 = rect3.top;
                    if (i8 > rect.top) {
                        rect.top = i8;
                    }
                    int i9 = rect3.right;
                    if (i9 > rect.right) {
                        rect.right = i9;
                    }
                    int i10 = rect3.bottom;
                    if (i10 > rect.bottom) {
                        rect.bottom = i10;
                    }
                }
            }
            this.f497j = b.C;
            this.f498k = rect;
            return rect;
        }

        public final int n() {
            if (!this.f500m) {
                e();
            }
            return this.f501n;
        }

        public final int o() {
            return this.A;
        }

        public final int p() {
            return this.B;
        }

        public final int q() {
            if (this.f505r) {
                return this.f506s;
            }
            f();
            int i5 = this.f495h;
            Drawable[] drawableArr = this.f494g;
            int opacity = i5 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i6 = 1; i6 < i5; i6++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i6].getOpacity());
            }
            this.f506s = opacity;
            this.f505r = b.C;
            return opacity;
        }

        public void r(int i5, int i6) {
            Drawable[] drawableArr = new Drawable[i6];
            Drawable[] drawableArr2 = this.f494g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i5);
            }
            this.f494g = drawableArr;
        }

        void s() {
            this.f505r = false;
            this.f507t = false;
        }

        public final boolean t() {
            return this.f499l;
        }

        public final boolean u() {
            if (this.f507t) {
                return this.f508u;
            }
            f();
            int i5 = this.f495h;
            Drawable[] drawableArr = this.f494g;
            boolean z5 = false;
            int i6 = 0;
            while (true) {
                if (i6 >= i5) {
                    break;
                }
                if (drawableArr[i6].isStateful()) {
                    z5 = true;
                    break;
                }
                i6++;
            }
            this.f508u = z5;
            this.f507t = b.C;
            return z5;
        }

        void v() {
            int i5 = this.f495h;
            Drawable[] drawableArr = this.f494g;
            for (int i6 = 0; i6 < i5; i6++) {
                Drawable drawable = drawableArr[i6];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
            this.f512y = b.C;
        }

        public final void x(boolean z5) {
            this.f499l = z5;
        }

        public final void y(int i5) {
            this.A = i5;
        }

        public final void z(int i5) {
            this.B = i5;
        }
    }

    b() {
    }

    private void e(Drawable drawable) {
        if (this.f485z == null) {
            this.f485z = new c();
        }
        drawable.setCallback(this.f485z.b(drawable.getCallback()));
        try {
            if (this.f474o.A <= 0 && this.f479t) {
                drawable.setAlpha(this.f478s);
            }
            d dVar = this.f474o;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    androidx.core.graphics.drawable.d.o(drawable, dVar.F);
                }
                d dVar2 = this.f474o;
                if (dVar2.I) {
                    androidx.core.graphics.drawable.d.p(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), C);
            drawable.setDither(this.f474o.f511x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            androidx.core.graphics.drawable.d.m(drawable, androidx.core.graphics.drawable.d.f(this));
            androidx.core.graphics.drawable.d.j(drawable, this.f474o.C);
            Rect rect = this.f475p;
            if (rect != null) {
                androidx.core.graphics.drawable.d.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f485z.a());
        }
    }

    private boolean f() {
        if (isAutoMirrored() && androidx.core.graphics.drawable.d.f(this) == 1) {
            return C;
        }
        return false;
    }

    static int g(@q0 Resources resources, int i5) {
        if (resources != null) {
            i5 = resources.getDisplayMetrics().densityDpi;
        }
        return i5 == 0 ? SyslogAppender.LOG_LOCAL4 : i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f479t = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f476q
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f483x
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f478s
            r3.setAlpha(r9)
            r13.f483x = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            androidx.appcompat.graphics.drawable.b$d r10 = r13.f474o
            int r10 = r10.A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f478s
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f483x = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.f477r
            if (r9 == 0) goto L61
            long r10 = r13.f484y
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f477r = r0
            r13.f484y = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            androidx.appcompat.graphics.drawable.b$d r4 = r13.f474o
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f478s
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f484y = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.f482w
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    @x0(21)
    public void applyTheme(@o0 Resources.Theme theme) {
        this.f474o.b(theme);
    }

    void b() {
        this.f474o.d();
        this.f481v = false;
    }

    d c() {
        return this.f474o;
    }

    @Override // android.graphics.drawable.Drawable
    @x0(21)
    public boolean canApplyTheme() {
        return this.f474o.canApplyTheme();
    }

    int d() {
        return this.f480u;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        Drawable drawable = this.f476q;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f477r;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f478s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f474o.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f474o.c()) {
            return null;
        }
        this.f474o.f491d = getChangingConfigurations();
        return this.f474o;
    }

    @Override // android.graphics.drawable.Drawable
    @o0
    public Drawable getCurrent() {
        return this.f476q;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(@o0 Rect rect) {
        Rect rect2 = this.f475p;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f474o.t()) {
            return this.f474o.j();
        }
        Drawable drawable = this.f476q;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f474o.t()) {
            return this.f474o.n();
        }
        Drawable drawable = this.f476q;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f474o.t()) {
            return this.f474o.k();
        }
        Drawable drawable = this.f476q;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f474o.t()) {
            return this.f474o.l();
        }
        Drawable drawable = this.f476q;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f476q;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f474o.q();
    }

    @Override // android.graphics.drawable.Drawable
    @x0(21)
    public void getOutline(@o0 Outline outline) {
        Drawable drawable = this.f476q;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@o0 Rect rect) {
        boolean padding;
        Rect m5 = this.f474o.m();
        if (m5 != null) {
            rect.set(m5);
            padding = (m5.right | ((m5.left | m5.top) | m5.bottom)) != 0 ? C : false;
        } else {
            Drawable drawable = this.f476q;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (f()) {
            int i5 = rect.left;
            rect.left = rect.right;
            rect.right = i5;
        }
        return padding;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean h(int r10) {
        /*
            r9 = this;
            int r0 = r9.f480u
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            androidx.appcompat.graphics.drawable.b$d r0 = r9.f474o
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f477r
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f476q
            if (r0 == 0) goto L29
            r9.f477r = r0
            androidx.appcompat.graphics.drawable.b$d r0 = r9.f474o
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f484y = r0
            goto L35
        L29:
            r9.f477r = r4
            r9.f484y = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f476q
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            androidx.appcompat.graphics.drawable.b$d r0 = r9.f474o
            int r1 = r0.f495h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.h(r10)
            r9.f476q = r0
            r9.f480u = r10
            if (r0 == 0) goto L5a
            androidx.appcompat.graphics.drawable.b$d r10 = r9.f474o
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f483x = r2
        L51:
            r9.e(r0)
            goto L5a
        L55:
            r9.f476q = r4
            r10 = -1
            r9.f480u = r10
        L5a:
            long r0 = r9.f483x
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f484y
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.f482w
            if (r10 != 0) goto L73
            androidx.appcompat.graphics.drawable.b$a r10 = new androidx.appcompat.graphics.drawable.b$a
            r10.<init>()
            r9.f482w = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.a(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.b.h(int):boolean");
    }

    void i(d dVar) {
        this.f474o = dVar;
        int i5 = this.f480u;
        if (i5 >= 0) {
            Drawable h5 = dVar.h(i5);
            this.f476q = h5;
            if (h5 != null) {
                e(h5);
            }
        }
        this.f477r = null;
    }

    public void invalidateDrawable(@o0 Drawable drawable) {
        d dVar = this.f474o;
        if (dVar != null) {
            dVar.s();
        }
        if (drawable != this.f476q || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f474o.C;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f474o.u();
    }

    void j(int i5) {
        h(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z5;
        Drawable drawable = this.f477r;
        boolean z6 = C;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f477r = null;
            z5 = true;
        } else {
            z5 = false;
        }
        Drawable drawable2 = this.f476q;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f479t) {
                this.f476q.setAlpha(this.f478s);
            }
        }
        if (this.f484y != 0) {
            this.f484y = 0L;
            z5 = true;
        }
        if (this.f483x != 0) {
            this.f483x = 0L;
        } else {
            z6 = z5;
        }
        if (z6) {
            invalidateSelf();
        }
    }

    public void k(int i5) {
        this.f474o.A = i5;
    }

    public void l(int i5) {
        this.f474o.B = i5;
    }

    final void m(Resources resources) {
        this.f474o.C(resources);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f481v && super.mutate() == this) {
            d c6 = c();
            c6.v();
            i(c6);
            this.f481v = C;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f477r;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f476q;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i5) {
        return this.f474o.A(i5, d());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i5) {
        Drawable drawable = this.f477r;
        if (drawable != null) {
            return drawable.setLevel(i5);
        }
        Drawable drawable2 = this.f476q;
        if (drawable2 != null) {
            return drawable2.setLevel(i5);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f477r;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f476q;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(@o0 Drawable drawable, @o0 Runnable runnable, long j5) {
        if (drawable != this.f476q || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        if (this.f479t && this.f478s == i5) {
            return;
        }
        this.f479t = C;
        this.f478s = i5;
        Drawable drawable = this.f476q;
        if (drawable != null) {
            if (this.f483x == 0) {
                drawable.setAlpha(i5);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z5) {
        d dVar = this.f474o;
        if (dVar.C != z5) {
            dVar.C = z5;
            Drawable drawable = this.f476q;
            if (drawable != null) {
                androidx.core.graphics.drawable.d.j(drawable, z5);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f474o;
        dVar.E = C;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f476q;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z5) {
        d dVar = this.f474o;
        if (dVar.f511x != z5) {
            dVar.f511x = z5;
            Drawable drawable = this.f476q;
            if (drawable != null) {
                drawable.setDither(z5);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f6, float f7) {
        Drawable drawable = this.f476q;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.k(drawable, f6, f7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i5, int i6, int i7, int i8) {
        Rect rect = this.f475p;
        if (rect == null) {
            this.f475p = new Rect(i5, i6, i7, i8);
        } else {
            rect.set(i5, i6, i7, i8);
        }
        Drawable drawable = this.f476q;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.l(drawable, i5, i6, i7, i8);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f474o;
        dVar.H = C;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            androidx.core.graphics.drawable.d.o(this.f476q, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintMode(@o0 PorterDuff.Mode mode) {
        d dVar = this.f474o;
        dVar.I = C;
        if (dVar.G != mode) {
            dVar.G = mode;
            androidx.core.graphics.drawable.d.p(this.f476q, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z5, boolean z6) {
        boolean visible = super.setVisible(z5, z6);
        Drawable drawable = this.f477r;
        if (drawable != null) {
            drawable.setVisible(z5, z6);
        }
        Drawable drawable2 = this.f476q;
        if (drawable2 != null) {
            drawable2.setVisible(z5, z6);
        }
        return visible;
    }

    public void unscheduleDrawable(@o0 Drawable drawable, @o0 Runnable runnable) {
        if (drawable != this.f476q || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
