package com.google.android.material.textfield;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.accessibility.g0;
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.internal.m;
import com.google.android.material.shape.o;
import com.google.android.material.textfield.TextInputLayout;
import n1.a;

/* compiled from: DropdownMenuEndIconDelegate.java */
/* loaded from: classes3.dex */
class d extends com.google.android.material.textfield.e {

    /* renamed from: q, reason: collision with root package name */
    private static final boolean f14467q = true;

    /* renamed from: r, reason: collision with root package name */
    private static final int f14468r = 50;

    /* renamed from: s, reason: collision with root package name */
    private static final int f14469s = 67;

    /* renamed from: d, reason: collision with root package name */
    private final TextWatcher f14470d;

    /* renamed from: e, reason: collision with root package name */
    private final View.OnFocusChangeListener f14471e;

    /* renamed from: f, reason: collision with root package name */
    private final TextInputLayout.e f14472f;

    /* renamed from: g, reason: collision with root package name */
    private final TextInputLayout.h f14473g;

    /* renamed from: h, reason: collision with root package name */
    @SuppressLint({"ClickableViewAccessibility"})
    private final TextInputLayout.i f14474h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14475i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14476j;

    /* renamed from: k, reason: collision with root package name */
    private long f14477k;

    /* renamed from: l, reason: collision with root package name */
    private StateListDrawable f14478l;

    /* renamed from: m, reason: collision with root package name */
    private com.google.android.material.shape.j f14479m;

    /* renamed from: n, reason: collision with root package name */
    @q0
    private AccessibilityManager f14480n;

    /* renamed from: o, reason: collision with root package name */
    private ValueAnimator f14481o;

    /* renamed from: p, reason: collision with root package name */
    private ValueAnimator f14482p;

    /* compiled from: DropdownMenuEndIconDelegate.java */
    class a extends m {

        /* compiled from: DropdownMenuEndIconDelegate.java */
        /* renamed from: com.google.android.material.textfield.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0185a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f14484o;

            RunnableC0185a(AutoCompleteTextView autoCompleteTextView) {
                this.f14484o = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f14484o.isPopupShowing();
                d.this.E(isPopupShowing);
                d.this.f14475i = isPopupShowing;
            }
        }

        a() {
        }

        @Override // com.google.android.material.internal.m, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView y5 = d.y(d.this.f14498a.Z());
            if (d.this.f14480n.isTouchExplorationEnabled() && d.D(y5) && !d.this.f14500c.hasFocus()) {
                y5.dismissDropDown();
            }
            y5.post(new RunnableC0185a(y5));
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes2.dex */
    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            d.this.f14500c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes2.dex */
    class c implements View.OnFocusChangeListener {
        c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z5) {
            d.this.f14498a.J1(z5);
            if (z5) {
                return;
            }
            d.this.E(false);
            d.this.f14475i = false;
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$d, reason: collision with other inner class name */
    class C0186d extends TextInputLayout.e {
        C0186d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, androidx.core.view.a
        public void g(View view, @o0 g0 g0Var) {
            super.g(view, g0Var);
            if (!d.D(d.this.f14498a.Z())) {
                g0Var.W0(Spinner.class.getName());
            }
            if (g0Var.z0()) {
                g0Var.l1(null);
            }
        }

        @Override // androidx.core.view.a
        public void h(View view, @o0 AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            AutoCompleteTextView y5 = d.y(d.this.f14498a.Z());
            if (accessibilityEvent.getEventType() == 1 && d.this.f14480n.isTouchExplorationEnabled() && !d.D(d.this.f14498a.Z())) {
                d.this.H(y5);
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    class e implements TextInputLayout.h {
        e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.h
        public void a(@o0 TextInputLayout textInputLayout) {
            AutoCompleteTextView y5 = d.y(textInputLayout.Z());
            d.this.F(y5);
            d.this.v(y5);
            d.this.G(y5);
            y5.setThreshold(0);
            y5.removeTextChangedListener(d.this.f14470d);
            y5.addTextChangedListener(d.this.f14470d);
            textInputLayout.K1(true);
            textInputLayout.Z1(null);
            if (!d.D(y5)) {
                y1.R1(d.this.f14500c, 2);
            }
            textInputLayout.c3(d.this.f14472f);
            textInputLayout.U1(true);
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    class f implements TextInputLayout.i {

        /* compiled from: DropdownMenuEndIconDelegate.java */
        /* loaded from: classes2.dex */
        class a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f14491o;

            a(AutoCompleteTextView autoCompleteTextView) {
                this.f14491o = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f14491o.removeTextChangedListener(d.this.f14470d);
            }
        }

        f() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.i
        public void a(@o0 TextInputLayout textInputLayout, int i5) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.Z();
            if (autoCompleteTextView == null || i5 != 3) {
                return;
            }
            autoCompleteTextView.post(new a(autoCompleteTextView));
            if (autoCompleteTextView.getOnFocusChangeListener() == d.this.f14471e) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            if (d.f14467q) {
                autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes2.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.H((AutoCompleteTextView) d.this.f14498a.Z());
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes2.dex */
    class h implements View.OnTouchListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ AutoCompleteTextView f14494o;

        h(AutoCompleteTextView autoCompleteTextView) {
            this.f14494o = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(@o0 View view, @o0 MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (d.this.C()) {
                    d.this.f14475i = false;
                }
                d.this.H(this.f14494o);
            }
            return false;
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes2.dex */
    class i implements AutoCompleteTextView.OnDismissListener {
        i() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            d.this.f14475i = true;
            d.this.f14477k = System.currentTimeMillis();
            d.this.E(false);
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes2.dex */
    class j extends AnimatorListenerAdapter {
        j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            dVar.f14500c.setChecked(dVar.f14476j);
            d.this.f14482p.start();
        }
    }

    d(@o0 TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f14470d = new a();
        this.f14471e = new c();
        this.f14472f = new C0186d(this.f14498a);
        this.f14473g = new e();
        this.f14474h = new f();
        this.f14475i = false;
        this.f14476j = false;
        this.f14477k = Long.MAX_VALUE;
    }

    private com.google.android.material.shape.j A(float f6, float f7, float f8, int i5) {
        o m5 = o.a().K(f6).P(f6).x(f7).C(f7).m();
        com.google.android.material.shape.j p5 = com.google.android.material.shape.j.p(this.f14499b, f8);
        p5.g(m5);
        p5.r0(0, i5, 0, i5);
        return p5;
    }

    private void B() {
        this.f14482p = z(67, 0.0f, 1.0f);
        ValueAnimator z5 = z(50, 1.0f, 0.0f);
        this.f14481o = z5;
        z5.addListener(new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C() {
        long currentTimeMillis = System.currentTimeMillis() - this.f14477k;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean D(@o0 EditText editText) {
        return editText.getKeyListener() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(boolean z5) {
        if (this.f14476j != z5) {
            this.f14476j = z5;
            this.f14482p.cancel();
            this.f14481o.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(@o0 AutoCompleteTextView autoCompleteTextView) {
        if (f14467q) {
            int L = this.f14498a.L();
            if (L == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f14479m);
            } else if (L == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f14478l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void G(@o0 AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f14471e);
        if (f14467q) {
            autoCompleteTextView.setOnDismissListener(new i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(@q0 AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (C()) {
            this.f14475i = false;
        }
        if (this.f14475i) {
            this.f14475i = false;
            return;
        }
        if (f14467q) {
            E(!this.f14476j);
        } else {
            this.f14476j = !this.f14476j;
            this.f14500c.toggle();
        }
        if (!this.f14476j) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(@o0 AutoCompleteTextView autoCompleteTextView) {
        if (D(autoCompleteTextView)) {
            return;
        }
        int L = this.f14498a.L();
        com.google.android.material.shape.j J = this.f14498a.J();
        int h5 = com.google.android.material.resources.b.h(autoCompleteTextView, a.c.B2);
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
        if (L == 2) {
            x(autoCompleteTextView, h5, iArr, J);
        } else if (L == 1) {
            w(autoCompleteTextView, h5, iArr, J);
        }
    }

    private void w(@o0 AutoCompleteTextView autoCompleteTextView, int i5, int[][] iArr, @o0 com.google.android.material.shape.j jVar) {
        int K = this.f14498a.K();
        int[] iArr2 = {p1.a.h(i5, K, 0.1f), K};
        if (f14467q) {
            y1.I1(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), jVar, jVar));
            return;
        }
        com.google.android.material.shape.j jVar2 = new com.google.android.material.shape.j(jVar.l());
        jVar2.p0(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{jVar, jVar2});
        int k02 = y1.k0(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int j02 = y1.j0(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        y1.I1(autoCompleteTextView, layerDrawable);
        y1.d2(autoCompleteTextView, k02, paddingTop, j02, paddingBottom);
    }

    private void x(@o0 AutoCompleteTextView autoCompleteTextView, int i5, int[][] iArr, @o0 com.google.android.material.shape.j jVar) {
        LayerDrawable layerDrawable;
        int h5 = com.google.android.material.resources.b.h(autoCompleteTextView, a.c.Q2);
        com.google.android.material.shape.j jVar2 = new com.google.android.material.shape.j(jVar.l());
        int h6 = p1.a.h(i5, h5, 0.1f);
        jVar2.p0(new ColorStateList(iArr, new int[]{h6, 0}));
        if (f14467q) {
            jVar2.setTint(h5);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{h6, h5});
            com.google.android.material.shape.j jVar3 = new com.google.android.material.shape.j(jVar.l());
            jVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, jVar2, jVar3), jVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{jVar2, jVar});
        }
        y1.I1(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public static AutoCompleteTextView y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException(ProtectedSandApp.s("✰"));
    }

    private ValueAnimator z(int i5, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(com.google.android.material.animation.a.f12778a);
        ofFloat.setDuration(i5);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    @Override // com.google.android.material.textfield.e
    void a() {
        float dimensionPixelOffset = this.f14499b.getResources().getDimensionPixelOffset(a.f.M5);
        float dimensionPixelOffset2 = this.f14499b.getResources().getDimensionPixelOffset(a.f.f29587x4);
        int dimensionPixelOffset3 = this.f14499b.getResources().getDimensionPixelOffset(a.f.f29599z4);
        com.google.android.material.shape.j A = A(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        com.google.android.material.shape.j A2 = A(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f14479m = A;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f14478l = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, A);
        this.f14478l.addState(new int[0], A2);
        this.f14498a.O1(androidx.appcompat.content.res.a.d(this.f14499b, f14467q ? a.g.f29608c1 : a.g.f29611d1));
        TextInputLayout textInputLayout = this.f14498a;
        textInputLayout.M1(textInputLayout.getResources().getText(a.m.K));
        this.f14498a.Q1(new g());
        this.f14498a.e(this.f14473g);
        this.f14498a.f(this.f14474h);
        B();
        this.f14480n = (AccessibilityManager) this.f14499b.getSystemService(ProtectedSandApp.s("✱"));
    }

    @Override // com.google.android.material.textfield.e
    boolean b(int i5) {
        return i5 != 0;
    }

    @Override // com.google.android.material.textfield.e
    boolean d() {
        return true;
    }
}
