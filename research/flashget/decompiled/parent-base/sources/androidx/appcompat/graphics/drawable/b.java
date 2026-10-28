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
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: DrawableContainerCompat.java */
/* loaded from: classes.dex */
public class b extends Drawable implements Drawable.Callback {

    /* renamed from: n, reason: collision with root package name */
    private static final boolean f989n = false;

    /* renamed from: o, reason: collision with root package name */
    private static final String f990o = "DrawableContainerCompat";

    /* renamed from: p, reason: collision with root package name */
    private static final boolean f991p = true;

    /* renamed from: b, reason: collision with root package name */
    private d f992b;

    /* renamed from: c, reason: collision with root package name */
    private Rect f993c;

    /* renamed from: d, reason: collision with root package name */
    private Drawable f994d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f995e;

    /* renamed from: g, reason: collision with root package name */
    private boolean f997g;

    /* renamed from: i, reason: collision with root package name */
    private boolean f999i;

    /* renamed from: j, reason: collision with root package name */
    private Runnable f1000j;

    /* renamed from: k, reason: collision with root package name */
    private long f1001k;

    /* renamed from: l, reason: collision with root package name */
    private long f1002l;

    /* renamed from: m, reason: collision with root package name */
    private c f1003m;

    /* renamed from: f, reason: collision with root package name */
    private int f996f = 255;

    /* renamed from: h, reason: collision with root package name */
    private int f998h = -1;

    /* compiled from: DrawableContainerCompat.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* compiled from: DrawableContainerCompat.java */
    @x0(21)
    /* renamed from: androidx.appcompat.graphics.drawable.b$b, reason: collision with other inner class name */
    private static class C0017b {
        private C0017b() {
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

    /* compiled from: DrawableContainerCompat.java */
    static class c implements Drawable.Callback {

        /* renamed from: b, reason: collision with root package name */
        private Drawable.Callback f1005b;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f1005b;
            this.f1005b = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f1005b = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@o0 Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@o0 Drawable drawable, @o0 Runnable runnable, long j4) {
            Drawable.Callback callback = this.f1005b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j4);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@o0 Drawable drawable, @o0 Runnable runnable) {
            Drawable.Callback callback = this.f1005b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* compiled from: DrawableContainerCompat.java */
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
        final b f1006a;

        /* renamed from: b, reason: collision with root package name */
        Resources f1007b;

        /* renamed from: c, reason: collision with root package name */
        int f1008c;

        /* renamed from: d, reason: collision with root package name */
        int f1009d;

        /* renamed from: e, reason: collision with root package name */
        int f1010e;

        /* renamed from: f, reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f1011f;

        /* renamed from: g, reason: collision with root package name */
        Drawable[] f1012g;

        /* renamed from: h, reason: collision with root package name */
        int f1013h;

        /* renamed from: i, reason: collision with root package name */
        boolean f1014i;

        /* renamed from: j, reason: collision with root package name */
        boolean f1015j;

        /* renamed from: k, reason: collision with root package name */
        Rect f1016k;

        /* renamed from: l, reason: collision with root package name */
        boolean f1017l;

        /* renamed from: m, reason: collision with root package name */
        boolean f1018m;

        /* renamed from: n, reason: collision with root package name */
        int f1019n;

        /* renamed from: o, reason: collision with root package name */
        int f1020o;

        /* renamed from: p, reason: collision with root package name */
        int f1021p;

        /* renamed from: q, reason: collision with root package name */
        int f1022q;

        /* renamed from: r, reason: collision with root package name */
        boolean f1023r;

        /* renamed from: s, reason: collision with root package name */
        int f1024s;

        /* renamed from: t, reason: collision with root package name */
        boolean f1025t;

        /* renamed from: u, reason: collision with root package name */
        boolean f1026u;

        /* renamed from: v, reason: collision with root package name */
        boolean f1027v;

        /* renamed from: w, reason: collision with root package name */
        boolean f1028w;

        /* renamed from: x, reason: collision with root package name */
        boolean f1029x;

        /* renamed from: y, reason: collision with root package name */
        boolean f1030y;

        /* renamed from: z, reason: collision with root package name */
        int f1031z;

        d(d dVar, b bVar, Resources resources) {
            this.f1014i = false;
            this.f1017l = false;
            this.f1029x = true;
            this.A = 0;
            this.B = 0;
            this.f1006a = bVar;
            this.f1007b = resources != null ? resources : dVar != null ? dVar.f1007b : null;
            int g4 = b.g(resources, dVar != null ? dVar.f1008c : 0);
            this.f1008c = g4;
            if (dVar == null) {
                this.f1012g = new Drawable[10];
                this.f1013h = 0;
                return;
            }
            this.f1009d = dVar.f1009d;
            this.f1010e = dVar.f1010e;
            this.f1027v = true;
            this.f1028w = true;
            this.f1014i = dVar.f1014i;
            this.f1017l = dVar.f1017l;
            this.f1029x = dVar.f1029x;
            this.f1030y = dVar.f1030y;
            this.f1031z = dVar.f1031z;
            this.A = dVar.A;
            this.B = dVar.B;
            this.C = dVar.C;
            this.D = dVar.D;
            this.E = dVar.E;
            this.F = dVar.F;
            this.G = dVar.G;
            this.H = dVar.H;
            this.I = dVar.I;
            if (dVar.f1008c == g4) {
                if (dVar.f1015j) {
                    this.f1016k = dVar.f1016k != null ? new Rect(dVar.f1016k) : null;
                    this.f1015j = true;
                }
                if (dVar.f1018m) {
                    this.f1019n = dVar.f1019n;
                    this.f1020o = dVar.f1020o;
                    this.f1021p = dVar.f1021p;
                    this.f1022q = dVar.f1022q;
                    this.f1018m = true;
                }
            }
            if (dVar.f1023r) {
                this.f1024s = dVar.f1024s;
                this.f1023r = true;
            }
            if (dVar.f1025t) {
                this.f1026u = dVar.f1026u;
                this.f1025t = true;
            }
            Drawable[] drawableArr = dVar.f1012g;
            this.f1012g = new Drawable[drawableArr.length];
            this.f1013h = dVar.f1013h;
            SparseArray<Drawable.ConstantState> sparseArray = dVar.f1011f;
            if (sparseArray != null) {
                this.f1011f = sparseArray.clone();
            } else {
                this.f1011f = new SparseArray<>(this.f1013h);
            }
            int i4 = this.f1013h;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f1011f.put(i5, constantState);
                    } else {
                        this.f1012g[i5] = drawableArr[i5];
                    }
                }
            }
        }

        private void f() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f1011f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    this.f1012g[this.f1011f.keyAt(i4)] = w(this.f1011f.valueAt(i4).newDrawable(this.f1007b));
                }
                this.f1011f = null;
            }
        }

        private Drawable w(Drawable drawable) {
            drawable.setLayoutDirection(this.f1031z);
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f1006a);
            return mutate;
        }

        final boolean A(int i4, int i5) {
            int i6 = this.f1013h;
            Drawable[] drawableArr = this.f1012g;
            boolean z4 = false;
            for (int i7 = 0; i7 < i6; i7++) {
                Drawable drawable = drawableArr[i7];
                if (drawable != null) {
                    boolean layoutDirection = drawable.setLayoutDirection(i4);
                    if (i7 == i5) {
                        z4 = layoutDirection;
                    }
                }
            }
            this.f1031z = i4;
            return z4;
        }

        public final void B(boolean z4) {
            this.f1014i = z4;
        }

        final void C(Resources resources) {
            if (resources != null) {
                this.f1007b = resources;
                int g4 = b.g(resources, this.f1008c);
                int i4 = this.f1008c;
                this.f1008c = g4;
                if (i4 != g4) {
                    this.f1018m = false;
                    this.f1015j = false;
                }
            }
        }

        public final int a(Drawable drawable) {
            int i4 = this.f1013h;
            if (i4 >= this.f1012g.length) {
                r(i4, i4 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f1006a);
            this.f1012g[i4] = drawable;
            this.f1013h++;
            this.f1010e = drawable.getChangingConfigurations() | this.f1010e;
            s();
            this.f1016k = null;
            this.f1015j = false;
            this.f1018m = false;
            this.f1027v = false;
            return i4;
        }

        @x0(21)
        final void b(Resources.Theme theme) {
            if (theme != null) {
                f();
                int i4 = this.f1013h;
                Drawable[] drawableArr = this.f1012g;
                for (int i5 = 0; i5 < i4; i5++) {
                    Drawable drawable = drawableArr[i5];
                    if (drawable != null && drawable.canApplyTheme()) {
                        drawableArr[i5].applyTheme(theme);
                        this.f1010e |= drawableArr[i5].getChangingConfigurations();
                    }
                }
                C(theme.getResources());
            }
        }

        public boolean c() {
            if (this.f1027v) {
                return this.f1028w;
            }
            f();
            this.f1027v = true;
            int i4 = this.f1013h;
            Drawable[] drawableArr = this.f1012g;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5].getConstantState() == null) {
                    this.f1028w = false;
                    return false;
                }
            }
            this.f1028w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @x0(21)
        public boolean canApplyTheme() {
            int i4 = this.f1013h;
            Drawable[] drawableArr = this.f1012g;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f1011f.get(i5);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        final void d() {
            this.f1030y = false;
        }

        protected void e() {
            this.f1018m = true;
            f();
            int i4 = this.f1013h;
            Drawable[] drawableArr = this.f1012g;
            this.f1020o = -1;
            this.f1019n = -1;
            this.f1022q = 0;
            this.f1021p = 0;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f1019n) {
                    this.f1019n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f1020o) {
                    this.f1020o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f1021p) {
                    this.f1021p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f1022q) {
                    this.f1022q = minimumHeight;
                }
            }
        }

        final int g() {
            return this.f1012g.length;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1009d | this.f1010e;
        }

        public final Drawable h(int i4) {
            int indexOfKey;
            Drawable drawable = this.f1012g[i4];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f1011f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i4)) < 0) {
                return null;
            }
            Drawable w4 = w(this.f1011f.valueAt(indexOfKey).newDrawable(this.f1007b));
            this.f1012g[i4] = w4;
            this.f1011f.removeAt(indexOfKey);
            if (this.f1011f.size() == 0) {
                this.f1011f = null;
            }
            return w4;
        }

        public final int i() {
            return this.f1013h;
        }

        public final int j() {
            if (!this.f1018m) {
                e();
            }
            return this.f1020o;
        }

        public final int k() {
            if (!this.f1018m) {
                e();
            }
            return this.f1022q;
        }

        public final int l() {
            if (!this.f1018m) {
                e();
            }
            return this.f1021p;
        }

        public final Rect m() {
            Rect rect = null;
            if (this.f1014i) {
                return null;
            }
            Rect rect2 = this.f1016k;
            if (rect2 != null || this.f1015j) {
                return rect2;
            }
            f();
            Rect rect3 = new Rect();
            int i4 = this.f1013h;
            Drawable[] drawableArr = this.f1012g;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i6 = rect3.left;
                    if (i6 > rect.left) {
                        rect.left = i6;
                    }
                    int i7 = rect3.top;
                    if (i7 > rect.top) {
                        rect.top = i7;
                    }
                    int i10 = rect3.right;
                    if (i10 > rect.right) {
                        rect.right = i10;
                    }
                    int i11 = rect3.bottom;
                    if (i11 > rect.bottom) {
                        rect.bottom = i11;
                    }
                }
            }
            this.f1015j = true;
            this.f1016k = rect;
            return rect;
        }

        public final int n() {
            if (!this.f1018m) {
                e();
            }
            return this.f1019n;
        }

        public final int o() {
            return this.A;
        }

        public final int p() {
            return this.B;
        }

        public final int q() {
            if (this.f1023r) {
                return this.f1024s;
            }
            f();
            int i4 = this.f1013h;
            Drawable[] drawableArr = this.f1012g;
            int opacity = i4 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i5 = 1; i5 < i4; i5++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i5].getOpacity());
            }
            this.f1024s = opacity;
            this.f1023r = true;
            return opacity;
        }

        public void r(int i4, int i5) {
            Drawable[] drawableArr = new Drawable[i5];
            Drawable[] drawableArr2 = this.f1012g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i4);
            }
            this.f1012g = drawableArr;
        }

        void s() {
            this.f1023r = false;
            this.f1025t = false;
        }

        public final boolean t() {
            return this.f1017l;
        }

        public final boolean u() {
            if (this.f1025t) {
                return this.f1026u;
            }
            f();
            int i4 = this.f1013h;
            Drawable[] drawableArr = this.f1012g;
            boolean z4 = false;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                if (drawableArr[i5].isStateful()) {
                    z4 = true;
                    break;
                }
                i5++;
            }
            this.f1026u = z4;
            this.f1025t = true;
            return z4;
        }

        void v() {
            int i4 = this.f1013h;
            Drawable[] drawableArr = this.f1012g;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
            this.f1030y = true;
        }

        public final void x(boolean z4) {
            this.f1017l = z4;
        }

        public final void y(int i4) {
            this.A = i4;
        }

        public final void z(int i4) {
            this.B = i4;
        }
    }

    private void e(Drawable drawable) {
        if (this.f1003m == null) {
            this.f1003m = new c();
        }
        drawable.setCallback(this.f1003m.b(drawable.getCallback()));
        try {
            if (this.f992b.A <= 0 && this.f997g) {
                drawable.setAlpha(this.f996f);
            }
            d dVar = this.f992b;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    drawable.setTintList(dVar.F);
                }
                d dVar2 = this.f992b;
                if (dVar2.I) {
                    drawable.setTintMode(dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f992b.f1029x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f992b.C);
            Rect rect = this.f993c;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            drawable.setCallback(this.f1003m.a());
        } catch (Throwable th) {
            drawable.setCallback(this.f1003m.a());
            throw th;
        }
    }

    private boolean f() {
        return isAutoMirrored() && getLayoutDirection() == 1;
    }

    static int g(@q0 Resources resources, int i4) {
        if (resources != null) {
            i4 = resources.getDisplayMetrics().densityDpi;
        }
        if (i4 == 0) {
            return 160;
        }
        return i4;
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
            r13.f997g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f994d
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f1001k
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f996f
            r3.setAlpha(r9)
            r13.f1001k = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            androidx.appcompat.graphics.drawable.b$d r10 = r13.f992b
            int r10 = r10.A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f996f
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f1001k = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.f995e
            if (r9 == 0) goto L61
            long r10 = r13.f1002l
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f995e = r0
            r13.f1002l = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            androidx.appcompat.graphics.drawable.b$d r4 = r13.f992b
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f996f
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f1002l = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.f1000j
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
        this.f992b.b(theme);
    }

    void b() {
        this.f992b.f1030y = false;
        this.f999i = false;
    }

    d c() {
        return this.f992b;
    }

    @Override // android.graphics.drawable.Drawable
    @x0(21)
    public boolean canApplyTheme() {
        return this.f992b.canApplyTheme();
    }

    int d() {
        return this.f998h;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        Drawable drawable = this.f994d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f995e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f996f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f992b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f992b.c()) {
            return null;
        }
        this.f992b.f1009d = getChangingConfigurations();
        return this.f992b;
    }

    @Override // android.graphics.drawable.Drawable
    @o0
    public Drawable getCurrent() {
        return this.f994d;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(@o0 Rect rect) {
        Rect rect2 = this.f993c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        d dVar = this.f992b;
        if (dVar.f1017l) {
            return dVar.j();
        }
        Drawable drawable = this.f994d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        d dVar = this.f992b;
        if (dVar.f1017l) {
            return dVar.n();
        }
        Drawable drawable = this.f994d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        d dVar = this.f992b;
        if (dVar.f1017l) {
            return dVar.k();
        }
        Drawable drawable = this.f994d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        d dVar = this.f992b;
        if (dVar.f1017l) {
            return dVar.l();
        }
        Drawable drawable = this.f994d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f994d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f992b.q();
    }

    @Override // android.graphics.drawable.Drawable
    @x0(21)
    public void getOutline(@o0 Outline outline) {
        Drawable drawable = this.f994d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@o0 Rect rect) {
        boolean padding;
        Rect m4 = this.f992b.m();
        if (m4 != null) {
            rect.set(m4);
            padding = (m4.right | ((m4.left | m4.top) | m4.bottom)) != 0;
        } else {
            Drawable drawable = this.f994d;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (f()) {
            int i4 = rect.left;
            rect.left = rect.right;
            rect.right = i4;
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
            int r0 = r9.f998h
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            androidx.appcompat.graphics.drawable.b$d r0 = r9.f992b
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f995e
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f994d
            if (r0 == 0) goto L29
            r9.f995e = r0
            androidx.appcompat.graphics.drawable.b$d r0 = r9.f992b
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f1002l = r0
            goto L35
        L29:
            r9.f995e = r4
            r9.f1002l = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f994d
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            androidx.appcompat.graphics.drawable.b$d r0 = r9.f992b
            int r1 = r0.f1013h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.h(r10)
            r9.f994d = r0
            r9.f998h = r10
            if (r0 == 0) goto L5a
            androidx.appcompat.graphics.drawable.b$d r10 = r9.f992b
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f1001k = r2
        L51:
            r9.e(r0)
            goto L5a
        L55:
            r9.f994d = r4
            r10 = -1
            r9.f998h = r10
        L5a:
            long r0 = r9.f1001k
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f1002l
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.f1000j
            if (r10 != 0) goto L73
            androidx.appcompat.graphics.drawable.b$a r10 = new androidx.appcompat.graphics.drawable.b$a
            r10.<init>()
            r9.f1000j = r10
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
        this.f992b = dVar;
        int i4 = this.f998h;
        if (i4 >= 0) {
            Drawable h4 = dVar.h(i4);
            this.f994d = h4;
            if (h4 != null) {
                e(h4);
            }
        }
        this.f995e = null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@o0 Drawable drawable) {
        d dVar = this.f992b;
        if (dVar != null) {
            dVar.s();
        }
        if (drawable != this.f994d || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f992b.C;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f992b.u();
    }

    void j(int i4) {
        h(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z4;
        Drawable drawable = this.f995e;
        boolean z5 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f995e = null;
            z4 = true;
        } else {
            z4 = false;
        }
        Drawable drawable2 = this.f994d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f997g) {
                this.f994d.setAlpha(this.f996f);
            }
        }
        if (this.f1002l != 0) {
            this.f1002l = 0L;
            z4 = true;
        }
        if (this.f1001k != 0) {
            this.f1001k = 0L;
        } else {
            z5 = z4;
        }
        if (z5) {
            invalidateSelf();
        }
    }

    public void k(int i4) {
        this.f992b.A = i4;
    }

    public void l(int i4) {
        this.f992b.B = i4;
    }

    final void m(Resources resources) {
        this.f992b.C(resources);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f999i && super.mutate() == this) {
            d c5 = c();
            c5.v();
            i(c5);
            this.f999i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f995e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f994d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i4) {
        return this.f992b.A(i4, d());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i4) {
        Drawable drawable = this.f995e;
        if (drawable != null) {
            return drawable.setLevel(i4);
        }
        Drawable drawable2 = this.f994d;
        if (drawable2 != null) {
            return drawable2.setLevel(i4);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(@o0 int[] iArr) {
        Drawable drawable = this.f995e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f994d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@o0 Drawable drawable, @o0 Runnable runnable, long j4) {
        if (drawable != this.f994d || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        if (this.f997g && this.f996f == i4) {
            return;
        }
        this.f997g = true;
        this.f996f = i4;
        Drawable drawable = this.f994d;
        if (drawable != null) {
            if (this.f1001k == 0) {
                drawable.setAlpha(i4);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z4) {
        d dVar = this.f992b;
        if (dVar.C != z4) {
            dVar.C = z4;
            Drawable drawable = this.f994d;
            if (drawable != null) {
                drawable.setAutoMirrored(z4);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f992b;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f994d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z4) {
        d dVar = this.f992b;
        if (dVar.f1029x != z4) {
            dVar.f1029x = z4;
            Drawable drawable = this.f994d;
            if (drawable != null) {
                drawable.setDither(z4);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f4, float f5) {
        Drawable drawable = this.f994d;
        if (drawable != null) {
            drawable.setHotspot(f4, f5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i4, int i5, int i6, int i7) {
        Rect rect = this.f993c;
        if (rect == null) {
            this.f993c = new Rect(i4, i5, i6, i7);
        } else {
            rect.set(i4, i5, i6, i7);
        }
        Drawable drawable = this.f994d;
        if (drawable != null) {
            drawable.setHotspotBounds(i4, i5, i6, i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(@l int i4) {
        setTintList(ColorStateList.valueOf(i4));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f992b;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            this.f994d.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@o0 PorterDuff.Mode mode) {
        d dVar = this.f992b;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            androidx.core.graphics.drawable.d.p(this.f994d, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z4, boolean z5) {
        boolean visible = super.setVisible(z4, z5);
        Drawable drawable = this.f995e;
        if (drawable != null) {
            drawable.setVisible(z4, z5);
        }
        Drawable drawable2 = this.f994d;
        if (drawable2 != null) {
            drawable2.setVisible(z4, z5);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@o0 Drawable drawable, @o0 Runnable runnable) {
        if (drawable != this.f994d || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
