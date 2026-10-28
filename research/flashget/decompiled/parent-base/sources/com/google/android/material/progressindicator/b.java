package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.c1;
import androidx.annotation.h1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u0;
import androidx.core.view.x1;
import androidx.vectordrawable.graphics.drawable.b;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.internal.n;
import com.google.android.material.progressindicator.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import s8.a;

/* compiled from: BaseProgressIndicator.java */
/* loaded from: classes6.dex */
public abstract class b<S extends com.google.android.material.progressindicator.c> extends ProgressBar {

    /* renamed from: p, reason: collision with root package name */
    public static final int f53635p = 0;

    /* renamed from: q, reason: collision with root package name */
    public static final int f53636q = 1;

    /* renamed from: r, reason: collision with root package name */
    public static final int f53637r = 2;

    /* renamed from: s, reason: collision with root package name */
    public static final int f53638s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static final int f53639t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f53640u = 2;

    /* renamed from: v, reason: collision with root package name */
    static final int f53641v = a.n.kc;

    /* renamed from: w, reason: collision with root package name */
    static final float f53642w = 0.2f;

    /* renamed from: x, reason: collision with root package name */
    static final int f53643x = 255;

    /* renamed from: y, reason: collision with root package name */
    static final int f53644y = 1000;

    /* renamed from: b, reason: collision with root package name */
    S f53645b;

    /* renamed from: c, reason: collision with root package name */
    private int f53646c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f53647d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f53648e;

    /* renamed from: f, reason: collision with root package name */
    private final int f53649f;

    /* renamed from: g, reason: collision with root package name */
    private final int f53650g;

    /* renamed from: h, reason: collision with root package name */
    private long f53651h;

    /* renamed from: i, reason: collision with root package name */
    com.google.android.material.progressindicator.a f53652i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f53653j;

    /* renamed from: k, reason: collision with root package name */
    private int f53654k;

    /* renamed from: l, reason: collision with root package name */
    private final Runnable f53655l;

    /* renamed from: m, reason: collision with root package name */
    private final Runnable f53656m;

    /* renamed from: n, reason: collision with root package name */
    private final b.a f53657n;

    /* renamed from: o, reason: collision with root package name */
    private final b.a f53658o;

    /* compiled from: BaseProgressIndicator.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.u();
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    /* renamed from: com.google.android.material.progressindicator.b$b, reason: collision with other inner class name */
    class RunnableC0812b implements Runnable {
        RunnableC0812b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.t();
            b.this.f53651h = -1L;
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    class c extends b.a {
        c() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b.a
        public void b(Drawable drawable) {
            b.this.setIndeterminate(false);
            b.this.B(0, false);
            b bVar = b.this;
            bVar.B(bVar.f53646c, b.this.f53647d);
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    class d extends b.a {
        d() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b.a
        public void b(Drawable drawable) {
            if (b.this.f53653j) {
                return;
            }
            b bVar = b.this;
            bVar.setVisibility(bVar.f53654k);
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    /* compiled from: BaseProgressIndicator.java */
    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    protected b(@o0 Context context, @q0 AttributeSet attributeSet, @androidx.annotation.f int i4, @h1 int i5) {
        super(a9.a.c(context, attributeSet, i4, f53641v), attributeSet, i4);
        this.f53651h = -1L;
        this.f53653j = false;
        this.f53654k = 4;
        this.f53655l = new a();
        this.f53656m = new RunnableC0812b();
        this.f53657n = new c();
        this.f53658o = new d();
        Context context2 = getContext();
        this.f53645b = i(context2, attributeSet);
        TypedArray j4 = n.j(context2, attributeSet, a.o.f91549d4, i4, i5, new int[0]);
        this.f53649f = j4.getInt(a.o.j4, -1);
        this.f53650g = Math.min(j4.getInt(a.o.h4, -1), 1000);
        j4.recycle();
        this.f53652i = new com.google.android.material.progressindicator.a();
        this.f53648e = true;
    }

    private void I() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().e(this.f53658o);
            getIndeterminateDrawable().z().h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().e(this.f53658o);
        }
    }

    @q0
    private h<S> j() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().A();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        ((g) getCurrentDrawable()).v(false, false, true);
        if (w()) {
            setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        if (this.f53650g > 0) {
            this.f53651h = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    private boolean w() {
        return (getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible());
    }

    private void x() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().z().d(this.f53657n);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().b(this.f53658o);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().b(this.f53658o);
        }
    }

    public void A(@androidx.annotation.l int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{u8.a.b(getContext(), a.c.J2, -1)};
        }
        if (Arrays.equals(m(), iArr)) {
            return;
        }
        this.f53645b.f53665c = iArr;
        getIndeterminateDrawable().z().c();
        invalidate();
    }

    public void B(int i4, boolean z4) {
        if (!isIndeterminate()) {
            super.setProgress(i4);
            if (getProgressDrawable() == null || z4) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f53646c = i4;
            this.f53647d = z4;
            this.f53653j = true;
            if (!getIndeterminateDrawable().isVisible() || this.f53652i.a(getContext().getContentResolver()) == 0.0f) {
                this.f53657n.b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().z().f();
            }
        }
    }

    public void C(int i4) {
        this.f53645b.f53667e = i4;
        invalidate();
    }

    public void D(@androidx.annotation.l int i4) {
        S s4 = this.f53645b;
        if (s4.f53666d != i4) {
            s4.f53666d = i4;
            invalidate();
        }
    }

    public void E(@u0 int i4) {
        S s4 = this.f53645b;
        if (s4.f53664b != i4) {
            s4.f53664b = Math.min(i4, s4.f53663a / 2);
        }
    }

    public void F(@u0 int i4) {
        S s4 = this.f53645b;
        if (s4.f53663a != i4) {
            s4.f53663a = i4;
            requestLayout();
        }
    }

    public void G(int i4) {
        if (i4 != 0 && i4 != 4 && i4 != 8) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf1f9"));
        }
        this.f53654k = i4;
    }

    public void H() {
        if (this.f53649f <= 0) {
            this.f53655l.run();
        } else {
            removeCallbacks(this.f53655l);
            postDelayed(this.f53655l, this.f53649f);
        }
    }

    boolean J() {
        return x1.R0(this) && getWindowVisibility() == 0 && v();
    }

    @Override // android.widget.ProgressBar
    @q0
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    protected void h(boolean z4) {
        if (this.f53648e) {
            ((g) getCurrentDrawable()).v(J(), false, z4);
        }
    }

    abstract S i(@o0 Context context, @o0 AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    public int k() {
        return this.f53645b.f53668f;
    }

    @Override // android.widget.ProgressBar
    @q0
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public j<S> getIndeterminateDrawable() {
        return (j) super.getIndeterminateDrawable();
    }

    @o0
    public int[] m() {
        return this.f53645b.f53665c;
    }

    @Override // android.widget.ProgressBar
    @q0
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public com.google.android.material.progressindicator.f<S> getProgressDrawable() {
        return (com.google.android.material.progressindicator.f) super.getProgressDrawable();
    }

    public int o() {
        return this.f53645b.f53667e;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        x();
        if (J()) {
            u();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f53656m);
        removeCallbacks(this.f53655l);
        ((g) getCurrentDrawable()).l();
        I();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(@o0 Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (getPaddingRight() == 0 || getPaddingBottom() != 0) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getPaddingRight() == 0) {
            }
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i4, int i5) {
        try {
            super.onMeasure(i4, i5);
            h<S> j4 = j();
            if (j4 == null) {
                return;
            }
            int e4 = j4.e();
            int d5 = j4.d();
            setMeasuredDimension(e4 < 0 ? getMeasuredWidth() : e4 + getPaddingLeft() + getPaddingRight(), d5 < 0 ? getMeasuredHeight() : d5 + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@o0 View view, int i4) {
        super.onVisibilityChanged(view, i4);
        h(i4 == 0);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        h(false);
    }

    @androidx.annotation.l
    public int p() {
        return this.f53645b.f53666d;
    }

    @u0
    public int q() {
        return this.f53645b.f53664b;
    }

    @u0
    public int r() {
        return this.f53645b.f53663a;
    }

    public void s() {
        if (getVisibility() != 0) {
            removeCallbacks(this.f53655l);
            return;
        }
        removeCallbacks(this.f53656m);
        long uptimeMillis = SystemClock.uptimeMillis() - this.f53651h;
        int i4 = this.f53650g;
        if (uptimeMillis >= i4) {
            this.f53656m.run();
        } else {
            postDelayed(this.f53656m, i4 - uptimeMillis);
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z4) {
        try {
            if (z4 == isIndeterminate()) {
                return;
            }
            if (J() && z4) {
                throw new IllegalStateException(ProtectedSandApp.s("\uf1fa"));
            }
            g gVar = (g) getCurrentDrawable();
            if (gVar != null) {
                gVar.l();
            }
            super.setIndeterminate(z4);
            g gVar2 = (g) getCurrentDrawable();
            if (gVar2 != null) {
                gVar2.v(J(), false, false);
            }
            this.f53653j = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@q0 Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof j)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\uf1fb"));
            }
            ((g) drawable).l();
            super.setIndeterminateDrawable(drawable);
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i4) {
        if (isIndeterminate()) {
            return;
        }
        B(i4, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@q0 Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof com.google.android.material.progressindicator.f)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\uf1fc"));
            }
            com.google.android.material.progressindicator.f fVar = (com.google.android.material.progressindicator.f) drawable;
            fVar.v(false, false, false);
            super.setProgressDrawable(fVar);
            fVar.F(getProgress() / getMax());
        }
    }

    boolean v() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @m1
    public void y(@o0 com.google.android.material.progressindicator.a aVar) {
        this.f53652i = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f53710d = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f53710d = aVar;
        }
    }

    public void z(int i4) {
        this.f53645b.f53668f = i4;
        invalidate();
    }
}
