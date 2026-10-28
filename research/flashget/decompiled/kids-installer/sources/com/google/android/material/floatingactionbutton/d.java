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
import androidx.core.util.q;
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.shape.o;
import com.google.android.material.shape.s;
import java.util.ArrayList;
import java.util.Iterator;
import n1.a;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes2.dex */
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
    o f13523a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    com.google.android.material.shape.j f13524b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    Drawable f13525c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    com.google.android.material.floatingactionbutton.c f13526d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    Drawable f13527e;

    /* renamed from: f, reason: collision with root package name */
    boolean f13528f;

    /* renamed from: h, reason: collision with root package name */
    float f13530h;

    /* renamed from: i, reason: collision with root package name */
    float f13531i;

    /* renamed from: j, reason: collision with root package name */
    float f13532j;

    /* renamed from: k, reason: collision with root package name */
    int f13533k;

    /* renamed from: l, reason: collision with root package name */
    @o0
    private final com.google.android.material.internal.i f13534l;

    /* renamed from: m, reason: collision with root package name */
    @q0
    private com.google.android.material.animation.h f13535m;

    /* renamed from: n, reason: collision with root package name */
    @q0
    private com.google.android.material.animation.h f13536n;

    /* renamed from: o, reason: collision with root package name */
    @q0
    private Animator f13537o;

    /* renamed from: p, reason: collision with root package name */
    @q0
    private com.google.android.material.animation.h f13538p;

    /* renamed from: q, reason: collision with root package name */
    @q0
    private com.google.android.material.animation.h f13539q;

    /* renamed from: r, reason: collision with root package name */
    private float f13540r;

    /* renamed from: t, reason: collision with root package name */
    private int f13542t;

    /* renamed from: v, reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f13544v;

    /* renamed from: w, reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f13545w;

    /* renamed from: x, reason: collision with root package name */
    private ArrayList<i> f13546x;

    /* renamed from: y, reason: collision with root package name */
    final FloatingActionButton f13547y;

    /* renamed from: z, reason: collision with root package name */
    final com.google.android.material.shadow.c f13548z;
    static final TimeInterpolator F = com.google.android.material.animation.a.f12780c;
    static final int[] S = {R.attr.state_pressed, R.attr.state_enabled};
    static final int[] T = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    static final int[] U = {R.attr.state_focused, R.attr.state_enabled};
    static final int[] V = {R.attr.state_hovered, R.attr.state_enabled};
    static final int[] W = {R.attr.state_enabled};
    static final int[] X = new int[0];

    /* renamed from: g, reason: collision with root package name */
    boolean f13529g = true;

    /* renamed from: s, reason: collision with root package name */
    private float f13541s = 1.0f;

    /* renamed from: u, reason: collision with root package name */
    private int f13543u = 0;
    private final Rect A = new Rect();
    private final RectF B = new RectF();
    private final RectF C = new RectF();
    private final Matrix D = new Matrix();

    /* compiled from: FloatingActionButtonImpl.java */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f13549a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f13550b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f13551c;

        a(boolean z5, j jVar) {
            this.f13550b = z5;
            this.f13551c = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f13549a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.f13543u = 0;
            d.this.f13537o = null;
            if (this.f13549a) {
                return;
            }
            FloatingActionButton floatingActionButton = d.this.f13547y;
            boolean z5 = this.f13550b;
            floatingActionButton.q(z5 ? 8 : 4, z5);
            j jVar = this.f13551c;
            if (jVar != null) {
                jVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.f13547y.q(0, this.f13550b);
            d.this.f13543u = 1;
            d.this.f13537o = animator;
            this.f13549a = false;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f13553a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f13554b;

        b(boolean z5, j jVar) {
            this.f13553a = z5;
            this.f13554b = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.f13543u = 0;
            d.this.f13537o = null;
            j jVar = this.f13554b;
            if (jVar != null) {
                jVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.f13547y.q(0, this.f13553a);
            d.this.f13543u = 2;
            d.this.f13537o = animator;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    class c extends com.google.android.material.animation.g {
        c() {
        }

        @Override // com.google.android.material.animation.g, android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f6, @o0 Matrix matrix, @o0 Matrix matrix2) {
            d.this.f13541s = f6;
            return super.evaluate(f6, matrix, matrix2);
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.d$d, reason: collision with other inner class name */
    class C0174d implements TypeEvaluator<Float> {

        /* renamed from: a, reason: collision with root package name */
        FloatEvaluator f13557a = new FloatEvaluator();

        C0174d() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f6, Float f7, Float f8) {
            float floatValue = this.f13557a.evaluate(f6, (Number) f7, (Number) f8).floatValue();
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
    /* loaded from: classes3.dex */
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
    /* loaded from: classes3.dex */
    private class g extends l {
        g() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.l
        protected float a() {
            d dVar = d.this;
            return dVar.f13530h + dVar.f13531i;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: classes3.dex */
    private class h extends l {
        h() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.l
        protected float a() {
            d dVar = d.this;
            return dVar.f13530h + dVar.f13532j;
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
    /* loaded from: classes3.dex */
    private class k extends l {
        k() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.l
        protected float a() {
            return d.this.f13530h;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    private abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private boolean f13564a;

        /* renamed from: b, reason: collision with root package name */
        private float f13565b;

        /* renamed from: c, reason: collision with root package name */
        private float f13566c;

        private l() {
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.j0((int) this.f13566c);
            this.f13564a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            if (!this.f13564a) {
                com.google.android.material.shape.j jVar = d.this.f13524b;
                this.f13565b = jVar == null ? 0.0f : jVar.z();
                this.f13566c = a();
                this.f13564a = true;
            }
            d dVar = d.this;
            float f6 = this.f13565b;
            dVar.j0((int) ((valueAnimator.getAnimatedFraction() * (this.f13566c - f6)) + f6));
        }

        /* synthetic */ l(d dVar, a aVar) {
            this();
        }
    }

    d(FloatingActionButton floatingActionButton, com.google.android.material.shadow.c cVar) {
        this.f13547y = floatingActionButton;
        this.f13548z = cVar;
        com.google.android.material.internal.i iVar = new com.google.android.material.internal.i();
        this.f13534l = iVar;
        iVar.a(S, i(new h()));
        iVar.a(T, i(new g()));
        iVar.a(U, i(new g()));
        iVar.a(V, i(new g()));
        iVar.a(W, i(new k()));
        iVar.a(X, i(new f()));
        this.f13540r = floatingActionButton.getRotation();
    }

    private boolean d0() {
        return y1.U0(this.f13547y) && !this.f13547y.isInEditMode();
    }

    private void g(float f6, @o0 Matrix matrix) {
        matrix.reset();
        if (this.f13547y.getDrawable() == null || this.f13542t == 0) {
            return;
        }
        RectF rectF = this.B;
        RectF rectF2 = this.C;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i5 = this.f13542t;
        rectF2.set(0.0f, 0.0f, i5, i5);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i6 = this.f13542t;
        matrix.postScale(f6, f6, i6 / 2.0f, i6 / 2.0f);
    }

    @o0
    private AnimatorSet h(@o0 com.google.android.material.animation.h hVar, float f6, float f7, float f8) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f13547y, (Property<FloatingActionButton, Float>) View.ALPHA, f6);
        hVar.h(ProtectedSandApp.s("ሬ")).a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f13547y, (Property<FloatingActionButton, Float>) View.SCALE_X, f7);
        String s5 = ProtectedSandApp.s("ር");
        hVar.h(s5).a(ofFloat2);
        k0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f13547y, (Property<FloatingActionButton, Float>) View.SCALE_Y, f7);
        hVar.h(s5).a(ofFloat3);
        k0(ofFloat3);
        arrayList.add(ofFloat3);
        g(f8, this.D);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f13547y, new com.google.android.material.animation.f(), new c(), new Matrix(this.D));
        hVar.h(ProtectedSandApp.s("ሮ")).a(ofObject);
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
        objectAnimator.setEvaluator(new C0174d());
    }

    private com.google.android.material.animation.h l() {
        if (this.f13536n == null) {
            this.f13536n = com.google.android.material.animation.h.d(this.f13547y.getContext(), a.b.f29149b);
        }
        com.google.android.material.animation.h hVar = this.f13536n;
        hVar.getClass();
        return hVar;
    }

    private com.google.android.material.animation.h m() {
        if (this.f13535m == null) {
            this.f13535m = com.google.android.material.animation.h.d(this.f13547y.getContext(), a.b.f29150c);
        }
        com.google.android.material.animation.h hVar = this.f13535m;
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
        this.f13534l.c();
    }

    void B() {
        com.google.android.material.shape.j jVar = this.f13524b;
        if (jVar != null) {
            com.google.android.material.shape.k.f(this.f13547y, jVar);
        }
        if (N()) {
            this.f13547y.getViewTreeObserver().addOnPreDrawListener(r());
        }
    }

    void C() {
    }

    void D() {
        ViewTreeObserver viewTreeObserver = this.f13547y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.E = null;
        }
    }

    void E(int[] iArr) {
        this.f13534l.d(iArr);
    }

    void F(float f6, float f7, float f8) {
        i0();
        j0(f6);
    }

    void G(@o0 Rect rect) {
        q.m(this.f13527e, ProtectedSandApp.s("ሯ"));
        if (!c0()) {
            this.f13548z.b(this.f13527e);
        } else {
            this.f13548z.b(new InsetDrawable(this.f13527e, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    void H() {
        float rotation = this.f13547y.getRotation();
        if (this.f13540r != rotation) {
            this.f13540r = rotation;
            g0();
        }
    }

    void I() {
        ArrayList<i> arrayList = this.f13546x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    void J() {
        ArrayList<i> arrayList = this.f13546x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void K(@o0 Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f13545w;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    void L(@o0 Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f13544v;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    void M(@o0 i iVar) {
        ArrayList<i> arrayList = this.f13546x;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(iVar);
    }

    boolean N() {
        return true;
    }

    void O(@q0 ColorStateList colorStateList) {
        com.google.android.material.shape.j jVar = this.f13524b;
        if (jVar != null) {
            jVar.setTintList(colorStateList);
        }
        com.google.android.material.floatingactionbutton.c cVar = this.f13526d;
        if (cVar != null) {
            cVar.d(colorStateList);
        }
    }

    void P(@q0 PorterDuff.Mode mode) {
        com.google.android.material.shape.j jVar = this.f13524b;
        if (jVar != null) {
            jVar.setTintMode(mode);
        }
    }

    final void Q(float f6) {
        if (this.f13530h != f6) {
            this.f13530h = f6;
            F(f6, this.f13531i, this.f13532j);
        }
    }

    void R(boolean z5) {
        this.f13528f = z5;
    }

    final void S(@q0 com.google.android.material.animation.h hVar) {
        this.f13539q = hVar;
    }

    final void T(float f6) {
        if (this.f13531i != f6) {
            this.f13531i = f6;
            F(this.f13530h, f6, this.f13532j);
        }
    }

    final void U(float f6) {
        this.f13541s = f6;
        Matrix matrix = this.D;
        g(f6, matrix);
        this.f13547y.setImageMatrix(matrix);
    }

    final void V(int i5) {
        if (this.f13542t != i5) {
            this.f13542t = i5;
            h0();
        }
    }

    void W(int i5) {
        this.f13533k = i5;
    }

    final void X(float f6) {
        if (this.f13532j != f6) {
            this.f13532j = f6;
            F(this.f13530h, this.f13531i, f6);
        }
    }

    void Y(@q0 ColorStateList colorStateList) {
        Drawable drawable = this.f13525c;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.o(drawable, com.google.android.material.ripple.b.d(colorStateList));
        }
    }

    void Z(boolean z5) {
        this.f13529g = z5;
        i0();
    }

    final void a0(@o0 o oVar) {
        this.f13523a = oVar;
        com.google.android.material.shape.j jVar = this.f13524b;
        if (jVar != null) {
            jVar.g(oVar);
        }
        Object obj = this.f13525c;
        if (obj instanceof s) {
            ((s) obj).g(oVar);
        }
        com.google.android.material.floatingactionbutton.c cVar = this.f13526d;
        if (cVar != null) {
            cVar.g(oVar);
        }
    }

    final void b0(@q0 com.google.android.material.animation.h hVar) {
        this.f13538p = hVar;
    }

    boolean c0() {
        return true;
    }

    public void d(@o0 Animator.AnimatorListener animatorListener) {
        if (this.f13545w == null) {
            this.f13545w = new ArrayList<>();
        }
        this.f13545w.add(animatorListener);
    }

    void e(@o0 Animator.AnimatorListener animatorListener) {
        if (this.f13544v == null) {
            this.f13544v = new ArrayList<>();
        }
        this.f13544v.add(animatorListener);
    }

    final boolean e0() {
        return !this.f13528f || this.f13547y.L() >= this.f13533k;
    }

    void f(@o0 i iVar) {
        if (this.f13546x == null) {
            this.f13546x = new ArrayList<>();
        }
        this.f13546x.add(iVar);
    }

    void f0(@q0 j jVar, boolean z5) {
        if (z()) {
            return;
        }
        Animator animator = this.f13537o;
        if (animator != null) {
            animator.cancel();
        }
        if (!d0()) {
            this.f13547y.q(0, z5);
            this.f13547y.setAlpha(1.0f);
            this.f13547y.setScaleY(1.0f);
            this.f13547y.setScaleX(1.0f);
            U(1.0f);
            if (jVar != null) {
                jVar.a();
                return;
            }
            return;
        }
        if (this.f13547y.getVisibility() != 0) {
            this.f13547y.setAlpha(0.0f);
            this.f13547y.setScaleY(0.0f);
            this.f13547y.setScaleX(0.0f);
            U(0.0f);
        }
        com.google.android.material.animation.h hVar = this.f13538p;
        if (hVar == null) {
            hVar = m();
        }
        AnimatorSet h5 = h(hVar, 1.0f, 1.0f, 1.0f);
        h5.addListener(new b(z5, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.f13544v;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                h5.addListener(it.next());
            }
        }
        h5.start();
    }

    void g0() {
        com.google.android.material.shape.j jVar = this.f13524b;
        if (jVar != null) {
            jVar.x0((int) this.f13540r);
        }
    }

    final void h0() {
        U(this.f13541s);
    }

    final void i0() {
        Rect rect = this.A;
        s(rect);
        G(rect);
        this.f13548z.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    com.google.android.material.shape.j j() {
        o oVar = this.f13523a;
        oVar.getClass();
        return new com.google.android.material.shape.j(oVar);
    }

    void j0(float f6) {
        com.google.android.material.shape.j jVar = this.f13524b;
        if (jVar != null) {
            jVar.o0(f6);
        }
    }

    @q0
    final Drawable k() {
        return this.f13527e;
    }

    float n() {
        return this.f13530h;
    }

    boolean o() {
        return this.f13528f;
    }

    @q0
    final com.google.android.material.animation.h p() {
        return this.f13539q;
    }

    float q() {
        return this.f13531i;
    }

    void s(@o0 Rect rect) {
        int L2 = this.f13528f ? (this.f13533k - this.f13547y.L()) / 2 : 0;
        int max = Math.max(L2, (int) Math.ceil(this.f13529g ? n() + this.f13532j : 0.0f));
        int max2 = Math.max(L2, (int) Math.ceil(r1 * L));
        rect.set(max, max2, max, max2);
    }

    float t() {
        return this.f13532j;
    }

    @q0
    final o u() {
        return this.f13523a;
    }

    @q0
    final com.google.android.material.animation.h v() {
        return this.f13538p;
    }

    void w(@q0 j jVar, boolean z5) {
        if (y()) {
            return;
        }
        Animator animator = this.f13537o;
        if (animator != null) {
            animator.cancel();
        }
        if (!d0()) {
            this.f13547y.q(z5 ? 8 : 4, z5);
            if (jVar != null) {
                jVar.b();
                return;
            }
            return;
        }
        com.google.android.material.animation.h hVar = this.f13539q;
        if (hVar == null) {
            hVar = l();
        }
        AnimatorSet h5 = h(hVar, 0.0f, 0.0f, 0.0f);
        h5.addListener(new a(z5, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.f13545w;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                h5.addListener(it.next());
            }
        }
        h5.start();
    }

    void x(ColorStateList colorStateList, @q0 PorterDuff.Mode mode, ColorStateList colorStateList2, int i5) {
        com.google.android.material.shape.j j5 = j();
        this.f13524b = j5;
        j5.setTintList(colorStateList);
        if (mode != null) {
            this.f13524b.setTintMode(mode);
        }
        this.f13524b.w0(-12303292);
        this.f13524b.a0(this.f13547y.getContext());
        com.google.android.material.ripple.a aVar = new com.google.android.material.ripple.a(this.f13524b.l());
        aVar.setTintList(com.google.android.material.ripple.b.d(colorStateList2));
        this.f13525c = aVar;
        com.google.android.material.shape.j jVar = this.f13524b;
        jVar.getClass();
        this.f13527e = new LayerDrawable(new Drawable[]{jVar, aVar});
    }

    boolean y() {
        return this.f13547y.getVisibility() == 0 ? this.f13543u == 1 : this.f13543u != 2;
    }

    boolean z() {
        return this.f13547y.getVisibility() != 0 ? this.f13543u == 2 : this.f13543u != 1;
    }
}
