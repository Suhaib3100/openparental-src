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
import androidx.appcompat.widget.o0;
import androidx.core.graphics.r1;
import d.a;

/* compiled from: AppCompatDrawableManager.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f1206c = false;

    /* renamed from: e, reason: collision with root package name */
    private static f f1208e;

    /* renamed from: a, reason: collision with root package name */
    private o0 f1209a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f1205b = "AppCompatDrawableManag";

    /* renamed from: d, reason: collision with root package name */
    private static final PorterDuff.Mode f1207d = PorterDuff.Mode.SRC_IN;

    /* compiled from: AppCompatDrawableManager.java */
    /* loaded from: classes2.dex */
    class a implements o0.f {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f1210a = {a.g.f21851y0, a.g.f21847w0, a.g.f21802a};

        /* renamed from: b, reason: collision with root package name */
        private final int[] f1211b = {a.g.f21850y, a.g.f21817h0, a.g.F, a.g.A, a.g.B, a.g.E, a.g.D};

        /* renamed from: c, reason: collision with root package name */
        private final int[] f1212c = {a.g.f21845v0, a.g.f21849x0, a.g.f21836r, a.g.f21837r0, a.g.f21839s0, a.g.f21841t0, a.g.f21843u0};

        /* renamed from: d, reason: collision with root package name */
        private final int[] f1213d = {a.g.X, a.g.f21832p, a.g.W};

        /* renamed from: e, reason: collision with root package name */
        private final int[] f1214e = {a.g.f21833p0, a.g.f21853z0};

        /* renamed from: f, reason: collision with root package name */
        private final int[] f1215f = {a.g.f21808d, a.g.f21820j, a.g.f21810e, a.g.f21822k};

        a() {
        }

        private boolean f(int[] iArr, int i5) {
            for (int i6 : iArr) {
                if (i6 == i5) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(@androidx.annotation.o0 Context context) {
            return h(context, 0);
        }

        private ColorStateList h(@androidx.annotation.o0 Context context, @androidx.annotation.l int i5) {
            int d6 = u0.d(context, a.c.E0);
            return new ColorStateList(new int[][]{u0.f1389c, u0.f1392f, u0.f1390d, u0.f1396j}, new int[]{u0.c(context, a.c.C0), r1.t(d6, i5), r1.t(d6, i5), i5});
        }

        private ColorStateList i(@androidx.annotation.o0 Context context) {
            return h(context, u0.d(context, a.c.A0));
        }

        private ColorStateList j(@androidx.annotation.o0 Context context) {
            return h(context, u0.d(context, a.c.C0));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i5 = a.c.J0;
            ColorStateList f6 = u0.f(context, i5);
            if (f6 == null || !f6.isStateful()) {
                iArr[0] = u0.f1389c;
                iArr2[0] = u0.c(context, i5);
                iArr[1] = u0.f1393g;
                iArr2[1] = u0.d(context, a.c.D0);
                iArr[2] = u0.f1396j;
                iArr2[2] = u0.d(context, i5);
            } else {
                int[] iArr3 = u0.f1389c;
                iArr[0] = iArr3;
                iArr2[0] = f6.getColorForState(iArr3, 0);
                iArr[1] = u0.f1393g;
                iArr2[1] = u0.d(context, a.c.D0);
                iArr[2] = u0.f1396j;
                iArr2[2] = f6.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(@androidx.annotation.o0 o0 o0Var, @androidx.annotation.o0 Context context, @androidx.annotation.q int i5) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i5);
            Drawable j5 = o0Var.j(context, a.g.f21825l0);
            Drawable j6 = o0Var.j(context, a.g.f21827m0);
            if ((j5 instanceof BitmapDrawable) && j5.getIntrinsicWidth() == dimensionPixelSize && j5.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) j5;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j5.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j5.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((j6 instanceof BitmapDrawable) && j6.getIntrinsicWidth() == dimensionPixelSize && j6.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j6;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j6.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j6.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i5, PorterDuff.Mode mode) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = f.f1207d;
            }
            drawable.setColorFilter(f.e(i5, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0051  */
        @Override // androidx.appcompat.widget.o0.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(@androidx.annotation.o0 android.content.Context r8, int r9, @androidx.annotation.o0 android.graphics.drawable.Drawable r10) {
            /*
                r7 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.f.a()
                int[] r1 = r7.f1210a
                boolean r1 = r7.f(r1, r9)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r9 = d.a.c.F0
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4f
            L15:
                int[] r1 = r7.f1212c
                boolean r1 = r7.f(r1, r9)
                if (r1 == 0) goto L20
                int r9 = d.a.c.D0
                goto L11
            L20:
                int[] r1 = r7.f1213d
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
                int r1 = d.a.g.L
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
                int r1 = d.a.g.f21840t
                if (r9 != r1) goto L4b
                goto L2d
            L4b:
                r1 = r0
                r9 = r3
                r5 = r9
                goto L13
            L4f:
                if (r5 == 0) goto L6c
                boolean r3 = androidx.appcompat.widget.e0.a(r10)
                if (r3 == 0) goto L5b
                android.graphics.drawable.Drawable r10 = r10.mutate()
            L5b:
                int r8 = androidx.appcompat.widget.u0.d(r8, r9)
                android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.f.e(r8, r1)
                r10.setColorFilter(r8)
                if (r0 == r4) goto L6b
                r10.setAlpha(r0)
            L6b:
                return r2
            L6c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.o0.f
        public PorterDuff.Mode b(int i5) {
            if (i5 == a.g.f21829n0) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.o0.f
        public Drawable c(@androidx.annotation.o0 o0 o0Var, @androidx.annotation.o0 Context context, int i5) {
            if (i5 == a.g.f21834q) {
                return new LayerDrawable(new Drawable[]{o0Var.j(context, a.g.f21832p), o0Var.j(context, a.g.f21836r)});
            }
            if (i5 == a.g.Z) {
                return l(o0Var, context, a.f.f21756h0);
            }
            if (i5 == a.g.Y) {
                return l(o0Var, context, a.f.f21759i0);
            }
            if (i5 == a.g.f21803a0) {
                return l(o0Var, context, a.f.f21762j0);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.o0.f
        public ColorStateList d(@androidx.annotation.o0 Context context, int i5) {
            if (i5 == a.g.f21842u) {
                return androidx.appcompat.content.res.a.c(context, a.e.f21724v);
            }
            if (i5 == a.g.f21831o0) {
                return androidx.appcompat.content.res.a.c(context, a.e.f21730y);
            }
            if (i5 == a.g.f21829n0) {
                return k(context);
            }
            if (i5 == a.g.f21818i) {
                return j(context);
            }
            if (i5 == a.g.f21806c) {
                return h(context, 0);
            }
            if (i5 == a.g.f21816h) {
                return i(context);
            }
            if (i5 == a.g.f21821j0 || i5 == a.g.f21823k0) {
                return androidx.appcompat.content.res.a.c(context, a.e.f21728x);
            }
            if (f(this.f1211b, i5)) {
                return u0.f(context, a.c.F0);
            }
            if (f(this.f1214e, i5)) {
                return androidx.appcompat.content.res.a.c(context, a.e.f21722u);
            }
            if (f(this.f1215f, i5)) {
                return androidx.appcompat.content.res.a.c(context, a.e.f21720t);
            }
            if (i5 == a.g.f21815g0) {
                return androidx.appcompat.content.res.a.c(context, a.e.f21726w);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.o0.f
        public boolean e(@androidx.annotation.o0 Context context, int i5, @androidx.annotation.o0 Drawable drawable) {
            if (i5 == a.g.f21819i0) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i6 = a.c.F0;
                m(findDrawableByLayerId, u0.d(context, i6), f.f1207d);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), u0.d(context, i6), f.f1207d);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), u0.d(context, a.c.D0), f.f1207d);
                return true;
            }
            if (i5 != a.g.Z && i5 != a.g.Y && i5 != a.g.f21803a0) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), u0.c(context, a.c.F0), f.f1207d);
            Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i7 = a.c.D0;
            m(findDrawableByLayerId2, u0.d(context, i7), f.f1207d);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), u0.d(context, i7), f.f1207d);
            return true;
        }
    }

    public static synchronized f b() {
        f fVar;
        synchronized (f.class) {
            if (f1208e == null) {
                i();
            }
            fVar = f1208e;
        }
        return fVar;
    }

    public static synchronized PorterDuffColorFilter e(int i5, PorterDuff.Mode mode) {
        PorterDuffColorFilter l5;
        synchronized (f.class) {
            l5 = o0.l(i5, mode);
        }
        return l5;
    }

    public static synchronized void i() {
        synchronized (f.class) {
            if (f1208e == null) {
                f fVar = new f();
                f1208e = fVar;
                fVar.f1209a = o0.h();
                f1208e.f1209a.u(new a());
            }
        }
    }

    static void j(Drawable drawable, x0 x0Var, int[] iArr) {
        o0.w(drawable, x0Var, iArr);
    }

    public synchronized Drawable c(@androidx.annotation.o0 Context context, @androidx.annotation.v int i5) {
        return this.f1209a.j(context, i5);
    }

    synchronized Drawable d(@androidx.annotation.o0 Context context, @androidx.annotation.v int i5, boolean z5) {
        return this.f1209a.k(context, i5, z5);
    }

    synchronized ColorStateList f(@androidx.annotation.o0 Context context, @androidx.annotation.v int i5) {
        return this.f1209a.m(context, i5);
    }

    public synchronized void g(@androidx.annotation.o0 Context context) {
        this.f1209a.s(context);
    }

    synchronized Drawable h(@androidx.annotation.o0 Context context, @androidx.annotation.o0 f1 f1Var, @androidx.annotation.v int i5) {
        return this.f1209a.t(context, f1Var, i5);
    }

    boolean k(@androidx.annotation.o0 Context context, @androidx.annotation.v int i5, @androidx.annotation.o0 Drawable drawable) {
        return this.f1209a.x(context, i5, drawable);
    }
}
