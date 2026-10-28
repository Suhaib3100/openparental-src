package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.util.w;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.shape.o;
import com.google.android.material.shape.s;
import java.util.ArrayList;
import java.util.Iterator;
import s8.a;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes6.dex */
class d {
    static final long G = 100;
    static final long H = 100;
    static final int I = 0;
    static final int J = 1;
    static final int K = 2;
    static final float L = 1.5f;
    private static final float M = 0.0f;
    private static final float N = 0.0f;
    private static final float O = 0.0f;
    private static final float P = 1.0f;
    private static final float Q = 1.0f;
    private static final float R = 1.0f;

    @q0
    private ViewTreeObserver.OnPreDrawListener E;

    /* renamed from: a, reason: collision with root package name */
    @q0
    o f53304a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    com.google.android.material.shape.j f53305b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    Drawable f53306c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    com.google.android.material.floatingactionbutton.c f53307d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    Drawable f53308e;

    /* renamed from: f, reason: collision with root package name */
    boolean f53309f;

    /* renamed from: h, reason: collision with root package name */
    float f53311h;

    /* renamed from: i, reason: collision with root package name */
    float f53312i;

    /* renamed from: j, reason: collision with root package name */
    float f53313j;

    /* renamed from: k, reason: collision with root package name */
    int f53314k;

    /* renamed from: l, reason: collision with root package name */
    @o0
    private final com.google.android.material.internal.i f53315l;

    /* renamed from: m, reason: collision with root package name */
    @q0
    private com.google.android.material.animation.h f53316m;

    /* renamed from: n, reason: collision with root package name */
    @q0
    private com.google.android.material.animation.h f53317n;

    /* renamed from: o, reason: collision with root package name */
    @q0
    private Animator f53318o;

    /* renamed from: p, reason: collision with root package name */
    @q0
    private com.google.android.material.animation.h f53319p;

    /* renamed from: q, reason: collision with root package name */
    @q0
    private com.google.android.material.animation.h f53320q;

    /* renamed from: r, reason: collision with root package name */
    private float f53321r;

    /* renamed from: t, reason: collision with root package name */
    private int f53323t;

    /* renamed from: v, reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f53325v;

    /* renamed from: w, reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f53326w;

    /* renamed from: x, reason: collision with root package name */
    private ArrayList<i> f53327x;

    /* renamed from: y, reason: collision with root package name */
    final FloatingActionButton f53328y;

    /* renamed from: z, reason: collision with root package name */
    final com.google.android.material.shadow.c f53329z;
    static final TimeInterpolator F = com.google.android.material.animation.a.f52468c;
    static final int[] S = {R.attr.state_pressed, R.attr.state_enabled};
    static final int[] T = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    static final int[] U = {R.attr.state_focused, R.attr.state_enabled};
    static final int[] V = {R.attr.state_hovered, R.attr.state_enabled};
    static final int[] W = {R.attr.state_enabled};
    static final int[] X = new int[0];

    /* renamed from: g, reason: collision with root package name */
    boolean f53310g = true;

    /* renamed from: s, reason: collision with root package name */
    private float f53322s = 1.0f;

    /* renamed from: u, reason: collision with root package name */
    private int f53324u = 0;
    private final Rect A = new Rect();
    private final RectF B = new RectF();
    private final RectF C = new RectF();
    private final Matrix D = new Matrix();

    /* compiled from: FloatingActionButtonImpl.java */
    class a extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        private boolean f53330b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f53331c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ j f53332d;

        a(boolean z4, j jVar) {
            this.f53331c = z4;
            this.f53332d = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f53330b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.f53324u = 0;
            d.this.f53318o = null;
            if (this.f53330b) {
                return;
            }
            FloatingActionButton floatingActionButton = d.this.f53328y;
            boolean z4 = this.f53331c;
            floatingActionButton.i(z4 ? 8 : 4, z4);
            j jVar = this.f53332d;
            if (jVar != null) {
                jVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.f53328y.i(0, this.f53331c);
            d.this.f53324u = 1;
            d.this.f53318o = animator;
            this.f53330b = false;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    class b extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f53334b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f53335c;

        b(boolean z4, j jVar) {
            this.f53334b = z4;
            this.f53335c = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.f53324u = 0;
            d.this.f53318o = null;
            j jVar = this.f53335c;
            if (jVar != null) {
                jVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.f53328y.i(0, this.f53334b);
            d.this.f53324u = 2;
            d.this.f53318o = animator;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    class c extends com.google.android.material.animation.g {
        c() {
        }

        @Override // com.google.android.material.animation.g, android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f4, @o0 Matrix matrix, @o0 Matrix matrix2) {
            d.this.f53322s = f4;
            return super.evaluate(f4, matrix, matrix2);
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.d$d, reason: collision with other inner class name */
    class C0808d implements TypeEvaluator<Float> {

        /* renamed from: a, reason: collision with root package name */
        FloatEvaluator f53338a = new FloatEvaluator();

        C0808d() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f4, Float f5, Float f6) {
            float floatValue = this.f53338a.evaluate(f4, (Number) f5, (Number) f6).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    class e implements ViewTreeObserver.OnPreDrawListener {
        e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            d.this.H();
            return true;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    private class f extends l {
        f() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.l
        protected float a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    private class g extends l {
        g() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.l
        protected float a() {
            d dVar = d.this;
            return dVar.f53311h + dVar.f53312i;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    private class h extends l {
        h() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.l
        protected float a() {
            d dVar = d.this;
            return dVar.f53311h + dVar.f53313j;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    interface i {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    interface j {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    private class k extends l {
        k() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.l
        protected float a() {
            return d.this.f53311h;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    private abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        private boolean f53345b;

        /* renamed from: c, reason: collision with root package name */
        private float f53346c;

        /* renamed from: d, reason: collision with root package name */
        private float f53347d;

        private l() {
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.j0((int) this.f53347d);
            this.f53345b = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            if (!this.f53345b) {
                com.google.android.material.shape.j jVar = d.this.f53305b;
                this.f53346c = jVar == null ? 0.0f : jVar.z();
                this.f53347d = a();
                this.f53345b = true;
            }
            d dVar = d.this;
            float f4 = this.f53346c;
            dVar.j0((int) ((valueAnimator.getAnimatedFraction() * (this.f53347d - f4)) + f4));
        }

        /* synthetic */ l(d dVar, a aVar) {
            this();
        }
    }

    d(FloatingActionButton floatingActionButton, com.google.android.material.shadow.c cVar) {
        this.f53328y = floatingActionButton;
        this.f53329z = cVar;
        com.google.android.material.internal.i iVar = new com.google.android.material.internal.i();
        this.f53315l = iVar;
        iVar.a(S, i(new h()));
        iVar.a(T, i(new g()));
        iVar.a(U, i(new g()));
        iVar.a(V, i(new g()));
        iVar.a(W, i(new k()));
        iVar.a(X, i(new f()));
        this.f53321r = floatingActionButton.getRotation();
    }

    private boolean d0() {
        return x1.Y0(this.f53328y) && !this.f53328y.isInEditMode();
    }

    private void g(float f4, @o0 Matrix matrix) {
        matrix.reset();
        if (this.f53328y.getDrawable() == null || this.f53323t == 0) {
            return;
        }
        RectF rectF = this.B;
        RectF rectF2 = this.C;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i4 = this.f53323t;
        rectF2.set(0.0f, 0.0f, i4, i4);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i5 = this.f53323t;
        matrix.postScale(f4, f4, i5 / 2.0f, i5 / 2.0f);
    }

    @o0
    private AnimatorSet h(@o0 com.google.android.material.animation.h hVar, float f4, float f5, float f6) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f53328y, (Property<FloatingActionButton, Float>) View.ALPHA, f4);
        hVar.h(ProtectedSandApp.s("\uf1d5")).a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f53328y, (Property<FloatingActionButton, Float>) View.SCALE_X, f5);
        String s4 = ProtectedSandApp.s("\uf1d6");
        hVar.h(s4).a(ofFloat2);
        k0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f53328y, (Property<FloatingActionButton, Float>) View.SCALE_Y, f5);
        hVar.h(s4).a(ofFloat3);
        k0(ofFloat3);
        arrayList.add(ofFloat3);
        g(f6, this.D);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f53328y, new com.google.android.material.animation.f(), new c(), new Matrix(this.D));
        hVar.h(ProtectedSandApp.s("\uf1d7")).a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        com.google.android.material.animation.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    @o0
    private ValueAnimator i(@o0 l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(F);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private void k0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new C0808d());
    }

    private com.google.android.material.animation.h l() {
        if (this.f53317n == null) {
            this.f53317n = com.google.android.material.animation.h.d(this.f53328y.getContext(), a.b.f90304b);
        }
        com.google.android.material.animation.h hVar = this.f53317n;
        hVar.getClass();
        return hVar;
    }

    private com.google.android.material.animation.h m() {
        if (this.f53316m == null) {
            this.f53316m = com.google.android.material.animation.h.d(this.f53328y.getContext(), a.b.f90305c);
        }
        com.google.android.material.animation.h hVar = this.f53316m;
        hVar.getClass();
        return hVar;
    }

    @o0
    private ViewTreeObserver.OnPreDrawListener r() {
        if (this.E == null) {
            this.E = new e();
        }
        return this.E;
    }

    void A() {
        this.f53315l.c();
    }

    void B() {
        com.google.android.material.shape.j jVar = this.f53305b;
        if (jVar != null) {
            com.google.android.material.shape.k.f(this.f53328y, jVar);
        }
        if (N()) {
            this.f53328y.getViewTreeObserver().addOnPreDrawListener(r());
        }
    }

    void C() {
    }

    void D() {
        ViewTreeObserver viewTreeObserver = this.f53328y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.E = null;
        }
    }

    void E(int[] iArr) {
        this.f53315l.d(iArr);
    }

    void F(float f4, float f5, float f6) {
        i0();
        j0(f4);
    }

    void G(@o0 Rect rect) {
        w.m(this.f53308e, ProtectedSandApp.s("\uf1d8"));
        if (!c0()) {
            this.f53329z.a(this.f53308e);
        } else {
            this.f53329z.a(new InsetDrawable(this.f53308e, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    void H() {
        float rotation = this.f53328y.getRotation();
        if (this.f53321r != rotation) {
            this.f53321r = rotation;
            g0();
        }
    }

    void I() {
        ArrayList<i> arrayList = this.f53327x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    void J() {
        ArrayList<i> arrayList = this.f53327x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void K(@o0 Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f53326w;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    void L(@o0 Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f53325v;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    void M(@o0 i iVar) {
        ArrayList<i> arrayList = this.f53327x;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(iVar);
    }

    boolean N() {
        return true;
    }

    void O(@q0 ColorStateList colorStateList) {
        com.google.android.material.shape.j jVar = this.f53305b;
        if (jVar != null) {
            jVar.setTintList(colorStateList);
        }
        com.google.android.material.floatingactionbutton.c cVar = this.f53307d;
        if (cVar != null) {
            cVar.d(colorStateList);
        }
    }

    void P(@q0 PorterDuff.Mode mode) {
        com.google.android.material.shape.j jVar = this.f53305b;
        if (jVar != null) {
            jVar.setTintMode(mode);
        }
    }

    final void Q(float f4) {
        if (this.f53311h != f4) {
            this.f53311h = f4;
            F(f4, this.f53312i, this.f53313j);
        }
    }

    void R(boolean z4) {
        this.f53309f = z4;
    }

    final void S(@q0 com.google.android.material.animation.h hVar) {
        this.f53320q = hVar;
    }

    final void T(float f4) {
        if (this.f53312i != f4) {
            this.f53312i = f4;
            F(this.f53311h, f4, this.f53313j);
        }
    }

    final void U(float f4) {
        this.f53322s = f4;
        Matrix matrix = this.D;
        g(f4, matrix);
        this.f53328y.setImageMatrix(matrix);
    }

    final void V(int i4) {
        if (this.f53323t != i4) {
            this.f53323t = i4;
            h0();
        }
    }

    void W(int i4) {
        this.f53314k = i4;
    }

    final void X(float f4) {
        if (this.f53313j != f4) {
            this.f53313j = f4;
            F(this.f53311h, this.f53312i, f4);
        }
    }

    void Y(@q0 ColorStateList colorStateList) {
        Drawable drawable = this.f53306c;
        if (drawable != null) {
            drawable.setTintList(com.google.android.material.ripple.b.d(colorStateList));
        }
    }

    void Z(boolean z4) {
        this.f53310g = z4;
        i0();
    }

    final void a0(@o0 o oVar) {
        this.f53304a = oVar;
        com.google.android.material.shape.j jVar = this.f53305b;
        if (jVar != null) {
            jVar.d(oVar);
        }
        Object obj = this.f53306c;
        if (obj instanceof s) {
            ((s) obj).d(oVar);
        }
        com.google.android.material.floatingactionbutton.c cVar = this.f53307d;
        if (cVar != null) {
            cVar.g(oVar);
        }
    }

    final void b0(@q0 com.google.android.material.animation.h hVar) {
        this.f53319p = hVar;
    }

    boolean c0() {
        return true;
    }

    public void d(@o0 Animator.AnimatorListener animatorListener) {
        if (this.f53326w == null) {
            this.f53326w = new ArrayList<>();
        }
        this.f53326w.add(animatorListener);
    }

    void e(@o0 Animator.AnimatorListener animatorListener) {
        if (this.f53325v == null) {
            this.f53325v = new ArrayList<>();
        }
        this.f53325v.add(animatorListener);
    }

    final boolean e0() {
        return !this.f53309f || this.f53328y.D() >= this.f53314k;
    }

    void f(@o0 i iVar) {
        if (this.f53327x == null) {
            this.f53327x = new ArrayList<>();
        }
        this.f53327x.add(iVar);
    }

    void f0(@q0 j jVar, boolean z4) {
        if (z()) {
            return;
        }
        Animator animator = this.f53318o;
        if (animator != null) {
            animator.cancel();
        }
        if (!d0()) {
            this.f53328y.i(0, z4);
            this.f53328y.setAlpha(1.0f);
            this.f53328y.setScaleY(1.0f);
            this.f53328y.setScaleX(1.0f);
            U(1.0f);
            if (jVar != null) {
                jVar.a();
                return;
            }
            return;
        }
        if (this.f53328y.getVisibility() != 0) {
            this.f53328y.setAlpha(0.0f);
            this.f53328y.setScaleY(0.0f);
            this.f53328y.setScaleX(0.0f);
            U(0.0f);
        }
        com.google.android.material.animation.h hVar = this.f53319p;
        if (hVar == null) {
            hVar = m();
        }
        AnimatorSet h4 = h(hVar, 1.0f, 1.0f, 1.0f);
        h4.addListener(new b(z4, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.f53325v;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                h4.addListener(it.next());
            }
        }
        h4.start();
    }

    void g0() {
        com.google.android.material.shape.j jVar = this.f53305b;
        if (jVar != null) {
            jVar.x0((int) this.f53321r);
        }
    }

    final void h0() {
        U(this.f53322s);
    }

    final void i0() {
        Rect rect = this.A;
        s(rect);
        G(rect);
        this.f53329z.b(rect.left, rect.top, rect.right, rect.bottom);
    }

    com.google.android.material.shape.j j() {
        o oVar = this.f53304a;
        oVar.getClass();
        return new com.google.android.material.shape.j(oVar);
    }

    void j0(float f4) {
        com.google.android.material.shape.j jVar = this.f53305b;
        if (jVar != null) {
            jVar.o0(f4);
        }
    }

    @q0
    final Drawable k() {
        return this.f53308e;
    }

    float n() {
        return this.f53311h;
    }

    boolean o() {
        return this.f53309f;
    }

    @q0
    final com.google.android.material.animation.h p() {
        return this.f53320q;
    }

    float q() {
        return this.f53312i;
    }

    void s(@o0 Rect rect) {
        int D = this.f53309f ? (this.f53314k - this.f53328y.D()) / 2 : 0;
        int max = Math.max(D, (int) Math.ceil(this.f53310g ? n() + this.f53313j : 0.0f));
        int max2 = Math.max(D, (int) Math.ceil(r1 * L));
        rect.set(max, max2, max, max2);
    }

    float t() {
        return this.f53313j;
    }

    @q0
    final o u() {
        return this.f53304a;
    }

    @q0
    final com.google.android.material.animation.h v() {
        return this.f53319p;
    }

    void w(@q0 j jVar, boolean z4) {
        if (y()) {
            return;
        }
        Animator animator = this.f53318o;
        if (animator != null) {
            animator.cancel();
        }
        if (!d0()) {
            this.f53328y.i(z4 ? 8 : 4, z4);
            if (jVar != null) {
                jVar.b();
                return;
            }
            return;
        }
        com.google.android.material.animation.h hVar = this.f53320q;
        if (hVar == null) {
            hVar = l();
        }
        AnimatorSet h4 = h(hVar, 0.0f, 0.0f, 0.0f);
        h4.addListener(new a(z4, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.f53326w;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                h4.addListener(it.next());
            }
        }
        h4.start();
    }

    void x(ColorStateList colorStateList, @q0 PorterDuff.Mode mode, ColorStateList colorStateList2, int i4) {
        com.google.android.material.shape.j j4 = j();
        this.f53305b = j4;
        j4.setTintList(colorStateList);
        if (mode != null) {
            this.f53305b.setTintMode(mode);
        }
        this.f53305b.w0(-12303292);
        this.f53305b.a0(this.f53328y.getContext());
        com.google.android.material.ripple.a aVar = new com.google.android.material.ripple.a(this.f53305b.e());
        aVar.setTintList(com.google.android.material.ripple.b.d(colorStateList2));
        this.f53306c = aVar;
        com.google.android.material.shape.j jVar = this.f53305b;
        jVar.getClass();
        this.f53308e = new LayerDrawable(new Drawable[]{jVar, aVar});
    }

    boolean y() {
        return this.f53328y.getVisibility() == 0 ? this.f53324u == 1 : this.f53324u != 2;
    }

    boolean z() {
        return this.f53328y.getVisibility() != 0 ? this.f53324u == 2 : this.f53324u != 1;
    }
}
