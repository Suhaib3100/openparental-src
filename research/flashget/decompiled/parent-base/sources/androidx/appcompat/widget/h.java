package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.c1;
import androidx.appcompat.widget.i0;
import d.a;

/* compiled from: AppCompatDrawableManager.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f1852c = false;

    /* renamed from: e, reason: collision with root package name */
    private static h f1854e;

    /* renamed from: a, reason: collision with root package name */
    private i0 f1855a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f1851b = "AppCompatDrawableManag";

    /* renamed from: d, reason: collision with root package name */
    private static final PorterDuff.Mode f1853d = PorterDuff.Mode.SRC_IN;

    /* compiled from: AppCompatDrawableManager.java */
    class a implements i0.f {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f1856a = {a.f.f73233y0, a.f.f73229w0, a.f.f73184a};

        /* renamed from: b, reason: collision with root package name */
        private final int[] f1857b = {a.f.f73232y, a.f.f73199h0, a.f.F, a.f.A, a.f.B, a.f.E, a.f.D};

        /* renamed from: c, reason: collision with root package name */
        private final int[] f1858c = {a.f.f73227v0, a.f.f73231x0, a.f.f73218r, a.f.f73219r0, a.f.f73221s0, a.f.f73223t0, a.f.f73225u0};

        /* renamed from: d, reason: collision with root package name */
        private final int[] f1859d = {a.f.X, a.f.f73214p, a.f.W};

        /* renamed from: e, reason: collision with root package name */
        private final int[] f1860e = {a.f.f73215p0, a.f.f73235z0};

        /* renamed from: f, reason: collision with root package name */
        private final int[] f1861f = {a.f.f73190d, a.f.f73202j, a.f.f73192e, a.f.f73204k};

        a() {
        }

        private boolean f(int[] iArr, int i4) {
            for (int i5 : iArr) {
                if (i5 == i4) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(@androidx.annotation.o0 Context context) {
            return h(context, 0);
        }

        private ColorStateList h(@androidx.annotation.o0 Context context, @androidx.annotation.l int i4) {
            int d5 = o0.d(context, a.b.G0);
            return new ColorStateList(new int[][]{o0.f1971c, o0.f1974f, o0.f1972d, o0.f1978j}, new int[]{o0.c(context, a.b.E0), androidx.core.graphics.z.v(d5, i4), androidx.core.graphics.z.v(d5, i4), i4});
        }

        private ColorStateList i(@androidx.annotation.o0 Context context) {
            return h(context, o0.d(context, a.b.C0));
        }

        private ColorStateList j(@androidx.annotation.o0 Context context) {
            return h(context, o0.d(context, a.b.E0));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i4 = a.b.L0;
            ColorStateList f4 = o0.f(context, i4);
            if (f4 == null || !f4.isStateful()) {
                iArr[0] = o0.f1971c;
                iArr2[0] = o0.c(context, i4);
                iArr[1] = o0.f1975g;
                iArr2[1] = o0.d(context, a.b.F0);
                iArr[2] = o0.f1978j;
                iArr2[2] = o0.d(context, i4);
            } else {
                int[] iArr3 = o0.f1971c;
                iArr[0] = iArr3;
                iArr2[0] = f4.getColorForState(iArr3, 0);
                iArr[1] = o0.f1975g;
                iArr2[1] = o0.d(context, a.b.F0);
                iArr[2] = o0.f1978j;
                iArr2[2] = f4.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(@androidx.annotation.o0 i0 i0Var, @androidx.annotation.o0 Context context, @androidx.annotation.q int i4) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i4);
            Drawable j4 = i0Var.j(context, a.f.f73207l0);
            Drawable j5 = i0Var.j(context, a.f.f73209m0);
            if ((j4 instanceof BitmapDrawable) && j4.getIntrinsicWidth() == dimensionPixelSize && j4.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) j4;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j4.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j4.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((j5 instanceof BitmapDrawable) && j5.getIntrinsicWidth() == dimensionPixelSize && j5.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j5;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j5.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j5.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i4, PorterDuff.Mode mode) {
            if (a0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = h.f1853d;
            }
            drawable.setColorFilter(h.e(i4, mode));
        }

        @Override // androidx.appcompat.widget.i0.f
        public Drawable a(@androidx.annotation.o0 i0 i0Var, @androidx.annotation.o0 Context context, int i4) {
            if (i4 == a.f.f73216q) {
                return new LayerDrawable(new Drawable[]{i0Var.j(context, a.f.f73214p), i0Var.j(context, a.f.f73218r)});
            }
            if (i4 == a.f.Z) {
                return l(i0Var, context, a.e.f73147h0);
            }
            if (i4 == a.f.Y) {
                return l(i0Var, context, a.e.f73149i0);
            }
            if (i4 == a.f.f73185a0) {
                return l(i0Var, context, a.e.f73151j0);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.i0.f
        public ColorStateList b(@androidx.annotation.o0 Context context, int i4) {
            if (i4 == a.f.f73224u) {
                return androidx.core.content.d.getColorStateList(context, a.d.f73122v);
            }
            if (i4 == a.f.f73213o0) {
                return androidx.core.content.d.getColorStateList(context, a.d.f73128y);
            }
            if (i4 == a.f.f73211n0) {
                return k(context);
            }
            if (i4 == a.f.f73200i) {
                return j(context);
            }
            if (i4 == a.f.f73188c) {
                return h(context, 0);
            }
            if (i4 == a.f.f73198h) {
                return i(context);
            }
            if (i4 == a.f.f73203j0 || i4 == a.f.f73205k0) {
                return androidx.core.content.d.getColorStateList(context, a.d.f73126x);
            }
            if (f(this.f1857b, i4)) {
                return o0.f(context, a.b.H0);
            }
            if (f(this.f1860e, i4)) {
                return androidx.core.content.d.getColorStateList(context, a.d.f73120u);
            }
            if (f(this.f1861f, i4)) {
                return androidx.core.content.d.getColorStateList(context, a.d.f73118t);
            }
            if (i4 == a.f.f73197g0) {
                return androidx.core.content.d.getColorStateList(context, a.d.f73124w);
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0051  */
        @Override // androidx.appcompat.widget.i0.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean c(@androidx.annotation.o0 android.content.Context r8, int r9, @androidx.annotation.o0 android.graphics.drawable.Drawable r10) {
            /*
                r7 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.h.a()
                int[] r1 = r7.f1856a
                boolean r1 = r7.f(r1, r9)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r9 = d.a.b.H0
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4f
            L15:
                int[] r1 = r7.f1858c
                boolean r1 = r7.f(r1, r9)
                if (r1 == 0) goto L20
                int r9 = d.a.b.F0
                goto L11
            L20:
                int[] r1 = r7.f1859d
                boolean r1 = r7.f(r1, r9)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r0 = r4
                r9 = r5
                r5 = r2
                goto L4f
            L32:
                int r1 = d.a.f.L
                if (r9 != r1) goto L46
                r9 = 1109603123(0x42233333, float:40.8)
                int r9 = java.lang.Math.round(r9)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r2
                r6 = r0
                r0 = r9
                r9 = r1
                r1 = r6
                goto L4f
            L46:
                int r1 = d.a.f.f73222t
                if (r9 != r1) goto L4b
                goto L2d
            L4b:
                r1 = r0
                r9 = r3
                r5 = r9
                goto L13
            L4f:
                if (r5 == 0) goto L6c
                boolean r3 = androidx.appcompat.widget.a0.a(r10)
                if (r3 == 0) goto L5b
                android.graphics.drawable.Drawable r10 = r10.mutate()
            L5b:
                int r8 = androidx.appcompat.widget.o0.d(r8, r9)
                android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.h.e(r8, r1)
                r10.setColorFilter(r8)
                if (r0 == r4) goto L6b
                r10.setAlpha(r0)
            L6b:
                return r2
            L6c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h.a.c(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.i0.f
        public PorterDuff.Mode d(int i4) {
            if (i4 == a.f.f73211n0) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.i0.f
        public boolean e(@androidx.annotation.o0 Context context, int i4, @androidx.annotation.o0 Drawable drawable) {
            if (i4 == a.f.f73201i0) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i5 = a.b.H0;
                m(findDrawableByLayerId, o0.d(context, i5), h.f1853d);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), o0.d(context, i5), h.f1853d);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), o0.d(context, a.b.F0), h.f1853d);
                return true;
            }
            if (i4 != a.f.Z && i4 != a.f.Y && i4 != a.f.f73185a0) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), o0.c(context, a.b.H0), h.f1853d);
            Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i6 = a.b.F0;
            m(findDrawableByLayerId2, o0.d(context, i6), h.f1853d);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), o0.d(context, i6), h.f1853d);
            return true;
        }
    }

    public static synchronized h b() {
        h hVar;
        synchronized (h.class) {
            try {
                if (f1854e == null) {
                    i();
                }
                hVar = f1854e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public static synchronized PorterDuffColorFilter e(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter l4;
        synchronized (h.class) {
            l4 = i0.l(i4, mode);
        }
        return l4;
    }

    public static synchronized void i() {
        synchronized (h.class) {
            if (f1854e == null) {
                h hVar = new h();
                f1854e = hVar;
                hVar.f1855a = i0.h();
                f1854e.f1855a.u(new a());
            }
        }
    }

    static void j(Drawable drawable, r0 r0Var, int[] iArr) {
        i0.w(drawable, r0Var, iArr);
    }

    public synchronized Drawable c(@androidx.annotation.o0 Context context, @androidx.annotation.v int i4) {
        return this.f1855a.j(context, i4);
    }

    synchronized Drawable d(@androidx.annotation.o0 Context context, @androidx.annotation.v int i4, boolean z4) {
        return this.f1855a.k(context, i4, z4);
    }

    synchronized ColorStateList f(@androidx.annotation.o0 Context context, @androidx.annotation.v int i4) {
        return this.f1855a.m(context, i4);
    }

    public synchronized void g(@androidx.annotation.o0 Context context) {
        this.f1855a.s(context);
    }

    synchronized Drawable h(@androidx.annotation.o0 Context context, @androidx.annotation.o0 d1 d1Var, @androidx.annotation.v int i4) {
        return this.f1855a.t(context, d1Var, i4);
    }

    boolean k(@androidx.annotation.o0 Context context, @androidx.annotation.v int i4, @androidx.annotation.o0 Drawable drawable) {
        return this.f1855a.x(context, i4, drawable);
    }
}
