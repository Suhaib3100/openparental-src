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
import androidx.core.view.y1;
import androidx.vectordrawable.graphics.drawable.b;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.internal.n;
import com.google.android.material.progressindicator.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import n1.a;

/* compiled from: BaseProgressIndicator.java */
/* loaded from: classes2.dex */
public abstract class b<S extends com.google.android.material.progressindicator.c> extends ProgressBar {
    public static final int C = 0;
    public static final int D = 1;
    public static final int E = 2;
    public static final int F = 0;
    public static final int G = 1;
    public static final int H = 2;
    static final int I = a.n.kc;
    static final float J = 0.2f;
    static final int K = 255;
    static final int L = 1000;
    private final b.a A;
    private final b.a B;

    /* renamed from: o, reason: collision with root package name */
    S f13812o;

    /* renamed from: p, reason: collision with root package name */
    private int f13813p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f13814q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f13815r;

    /* renamed from: s, reason: collision with root package name */
    private final int f13816s;

    /* renamed from: t, reason: collision with root package name */
    private final int f13817t;

    /* renamed from: u, reason: collision with root package name */
    private long f13818u;

    /* renamed from: v, reason: collision with root package name */
    com.google.android.material.progressindicator.a f13819v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f13820w;

    /* renamed from: x, reason: collision with root package name */
    private int f13821x;

    /* renamed from: y, reason: collision with root package name */
    private final Runnable f13822y;

    /* renamed from: z, reason: collision with root package name */
    private final Runnable f13823z;

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
    class RunnableC0178b implements Runnable {
        RunnableC0178b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.t();
            b.this.f13818u = -1L;
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    /* loaded from: classes3.dex */
    class c extends b.a {
        c() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b.a
        public void b(Drawable drawable) {
            b.this.setIndeterminate(false);
            b.this.B(0, false);
            b bVar = b.this;
            bVar.B(bVar.f13813p, b.this.f13814q);
        }
    }

    /* compiled from: BaseProgressIndicator.java */
    /* loaded from: classes3.dex */
    class d extends b.a {
        d() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b.a
        public void b(Drawable drawable) {
            if (b.this.f13820w) {
                return;
            }
            b bVar = b.this;
            bVar.setVisibility(bVar.f13821x);
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

    protected b(@o0 Context context, @q0 AttributeSet attributeSet, @androidx.annotation.f int i5, @h1 int i6) {
        super(v1.a.c(context, attributeSet, i5, I), attributeSet, i5);
        this.f13818u = -1L;
        this.f13820w = false;
        this.f13821x = 4;
        this.f13822y = new a();
        this.f13823z = new RunnableC0178b();
        this.A = new c();
        this.B = new d();
        Context context2 = getContext();
        this.f13812o = i(context2, attributeSet);
        TypedArray j5 = n.j(context2, attributeSet, a.o.f30171c4, i5, i6, new int[0]);
        this.f13816s = j5.getInt(a.o.f30212i4, -1);
        this.f13817t = Math.min(j5.getInt(a.o.f30200g4, -1), 1000);
        j5.recycle();
        this.f13819v = new com.google.android.material.progressindicator.a();
        this.f13815r = true;
    }

    private void I() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c(this.B);
            getIndeterminateDrawable().y().h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().c(this.B);
        }
    }

    @q0
    private h<S> j() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().z();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        ((g) getCurrentDrawable()).u(false, false, true);
        if (w()) {
            setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        if (this.f13817t > 0) {
            this.f13818u = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    private boolean w() {
        return (getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible());
    }

    private void x() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().y().d(this.A);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().b(this.B);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().b(this.B);
        }
    }

    public void A(@androidx.annotation.l int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{p1.a.b(getContext(), a.c.K2, -1)};
        }
        if (Arrays.equals(m(), iArr)) {
            return;
        }
        this.f13812o.f13830c = iArr;
        getIndeterminateDrawable().y().c();
        invalidate();
    }

    public void B(int i5, boolean z5) {
        if (!isIndeterminate()) {
            super.setProgress(i5);
            if (getProgressDrawable() == null || z5) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f13813p = i5;
            this.f13814q = z5;
            this.f13820w = true;
            if (!getIndeterminateDrawable().isVisible() || this.f13819v.a(getContext().getContentResolver()) == 0.0f) {
                this.A.b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().y().f();
            }
        }
    }

    public void C(int i5) {
        this.f13812o.f13832e = i5;
        invalidate();
    }

    public void D(@androidx.annotation.l int i5) {
        S s5 = this.f13812o;
        if (s5.f13831d != i5) {
            s5.f13831d = i5;
            invalidate();
        }
    }

    public void E(@u0 int i5) {
        S s5 = this.f13812o;
        if (s5.f13829b != i5) {
            s5.f13829b = Math.min(i5, s5.f13828a / 2);
        }
    }

    public void F(@u0 int i5) {
        S s5 = this.f13812o;
        if (s5.f13828a != i5) {
            s5.f13828a = i5;
            requestLayout();
        }
    }

    public void G(int i5) {
        if (i5 != 0 && i5 != 4 && i5 != 8) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u1249"));
        }
        this.f13821x = i5;
    }

    public void H() {
        if (this.f13816s <= 0) {
            this.f13822y.run();
        } else {
            removeCallbacks(this.f13822y);
            postDelayed(this.f13822y, this.f13816s);
        }
    }

    boolean J() {
        return y1.O0(this) && getWindowVisibility() == 0 && v();
    }

    @Override // android.widget.ProgressBar
    @q0
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    protected void h(boolean z5) {
        if (this.f13815r) {
            ((g) getCurrentDrawable()).u(J(), false, z5);
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
        return this.f13812o.f13833f;
    }

    @Override // android.widget.ProgressBar
    @q0
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public j<S> getIndeterminateDrawable() {
        return (j) super.getIndeterminateDrawable();
    }

    @o0
    public int[] m() {
        return this.f13812o.f13830c;
    }

    @Override // android.widget.ProgressBar
    @q0
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public com.google.android.material.progressindicator.f<S> getProgressDrawable() {
        return (com.google.android.material.progressindicator.f) super.getProgressDrawable();
    }

    public int o() {
        return this.f13812o.f13832e;
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
        removeCallbacks(this.f13823z);
        removeCallbacks(this.f13822y);
        ((g) getCurrentDrawable()).k();
        I();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(@o0 Canvas canvas) {
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        h<S> j5 = j();
        if (j5 == null) {
            return;
        }
        int e6 = j5.e();
        int d6 = j5.d();
        setMeasuredDimension(e6 < 0 ? getMeasuredWidth() : e6 + getPaddingLeft() + getPaddingRight(), d6 < 0 ? getMeasuredHeight() : d6 + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@o0 View view, int i5) {
        super.onVisibilityChanged(view, i5);
        h(i5 == 0);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i5) {
        super.onWindowVisibilityChanged(i5);
        h(false);
    }

    @androidx.annotation.l
    public int p() {
        return this.f13812o.f13831d;
    }

    @u0
    public int q() {
        return this.f13812o.f13829b;
    }

    @u0
    public int r() {
        return this.f13812o.f13828a;
    }

    public void s() {
        if (getVisibility() != 0) {
            removeCallbacks(this.f13822y);
            return;
        }
        removeCallbacks(this.f13823z);
        long uptimeMillis = SystemClock.uptimeMillis() - this.f13818u;
        int i5 = this.f13817t;
        if (uptimeMillis >= ((long) i5)) {
            this.f13823z.run();
        } else {
            postDelayed(this.f13823z, i5 - uptimeMillis);
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z5) {
        if (z5 == isIndeterminate()) {
            return;
        }
        if (J() && z5) {
            throw new IllegalStateException(ProtectedSandApp.s("ቊ"));
        }
        g gVar = (g) getCurrentDrawable();
        if (gVar != null) {
            gVar.k();
        }
        super.setIndeterminate(z5);
        g gVar2 = (g) getCurrentDrawable();
        if (gVar2 != null) {
            gVar2.u(J(), false, false);
        }
        this.f13820w = false;
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@q0 Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof j)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ቋ"));
            }
            ((g) drawable).k();
            super.setIndeterminateDrawable(drawable);
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i5) {
        if (isIndeterminate()) {
            return;
        }
        B(i5, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@q0 Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof com.google.android.material.progressindicator.f)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ቌ"));
            }
            com.google.android.material.progressindicator.f fVar = (com.google.android.material.progressindicator.f) drawable;
            fVar.k();
            super.setProgressDrawable(fVar);
            fVar.E(getProgress() / getMax());
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
        this.f13819v = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f13864q = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f13864q = aVar;
        }
    }

    public void z(int i5) {
        this.f13812o.f13833f = i5;
        invalidate();
    }
}
