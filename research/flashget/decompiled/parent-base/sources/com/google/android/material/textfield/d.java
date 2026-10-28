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
import androidx.core.view.accessibility.h0;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.shape.o;
import com.google.android.material.textfield.TextInputLayout;
import s8.a;

/* compiled from: DropdownMenuEndIconDelegate.java */
/* loaded from: classes6.dex */
class d extends com.google.android.material.textfield.e {

    /* renamed from: q, reason: collision with root package name */
    private static final boolean f54322q = true;

    /* renamed from: r, reason: collision with root package name */
    private static final int f54323r = 50;

    /* renamed from: s, reason: collision with root package name */
    private static final int f54324s = 67;

    /* renamed from: d, reason: collision with root package name */
    private final TextWatcher f54325d;

    /* renamed from: e, reason: collision with root package name */
    private final View.OnFocusChangeListener f54326e;

    /* renamed from: f, reason: collision with root package name */
    private final TextInputLayout.e f54327f;

    /* renamed from: g, reason: collision with root package name */
    private final TextInputLayout.h f54328g;

    /* renamed from: h, reason: collision with root package name */
    @SuppressLint({"ClickableViewAccessibility"})
    private final TextInputLayout.i f54329h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f54330i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f54331j;

    /* renamed from: k, reason: collision with root package name */
    private long f54332k;

    /* renamed from: l, reason: collision with root package name */
    private StateListDrawable f54333l;

    /* renamed from: m, reason: collision with root package name */
    private com.google.android.material.shape.j f54334m;

    /* renamed from: n, reason: collision with root package name */
    @q0
    private AccessibilityManager f54335n;

    /* renamed from: o, reason: collision with root package name */
    private ValueAnimator f54336o;

    /* renamed from: p, reason: collision with root package name */
    private ValueAnimator f54337p;

    /* compiled from: DropdownMenuEndIconDelegate.java */
    class a extends com.google.android.material.internal.m {

        /* compiled from: DropdownMenuEndIconDelegate.java */
        /* renamed from: com.google.android.material.textfield.d$a$a, reason: collision with other inner class name */
        class RunnableC0819a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f54339b;

            RunnableC0819a(AutoCompleteTextView autoCompleteTextView) {
                this.f54339b = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f54339b.isPopupShowing();
                d.this.E(isPopupShowing);
                d.this.f54330i = isPopupShowing;
            }
        }

        a() {
        }

        @Override // com.google.android.material.internal.m, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView y4 = d.y(d.this.f54353a.Z());
            if (d.this.f54335n.isTouchExplorationEnabled() && d.D(y4) && !d.this.f54355c.hasFocus()) {
                y4.dismissDropDown();
            }
            y4.post(new RunnableC0819a(y4));
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            d.this.f54355c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    class c implements View.OnFocusChangeListener {
        c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z4) {
            d.this.f54353a.J1(z4);
            if (z4) {
                return;
            }
            d.this.E(false);
            d.this.f54330i = false;
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$d, reason: collision with other inner class name */
    class C0820d extends TextInputLayout.e {
        C0820d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, androidx.core.view.a
        public void i(View view, @o0 h0 h0Var) {
            super.i(view, h0Var);
            if (!d.D(d.this.f54353a.Z())) {
                h0Var.j1(Spinner.class.getName());
            }
            if (h0Var.J0()) {
                h0Var.A1(null);
            }
        }

        @Override // androidx.core.view.a
        public void j(View view, @o0 AccessibilityEvent accessibilityEvent) {
            super.j(view, accessibilityEvent);
            AutoCompleteTextView y4 = d.y(d.this.f54353a.Z());
            if (accessibilityEvent.getEventType() == 1 && d.this.f54335n.isTouchExplorationEnabled() && !d.D(d.this.f54353a.Z())) {
                d.this.H(y4);
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    class e implements TextInputLayout.h {
        e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.h
        public void a(@o0 TextInputLayout textInputLayout) {
            AutoCompleteTextView y4 = d.y(textInputLayout.Z());
            d.this.F(y4);
            d.this.v(y4);
            d.this.G(y4);
            y4.setThreshold(0);
            y4.removeTextChangedListener(d.this.f54325d);
            y4.addTextChangedListener(d.this.f54325d);
            textInputLayout.K1(true);
            textInputLayout.Z1(null);
            if (!d.D(y4)) {
                x1.Z1(d.this.f54355c, 2);
            }
            textInputLayout.c3(d.this.f54327f);
            textInputLayout.U1(true);
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    class f implements TextInputLayout.i {

        /* compiled from: DropdownMenuEndIconDelegate.java */
        class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f54346b;

            a(AutoCompleteTextView autoCompleteTextView) {
                this.f54346b = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f54346b.removeTextChangedListener(d.this.f54325d);
            }
        }

        f() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.i
        public void a(@o0 TextInputLayout textInputLayout, int i4) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.Z();
            if (autoCompleteTextView == null || i4 != 3) {
                return;
            }
            autoCompleteTextView.post(new a(autoCompleteTextView));
            if (autoCompleteTextView.getOnFocusChangeListener() == d.this.f54326e) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            if (d.f54322q) {
                autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.H((AutoCompleteTextView) d.this.f54353a.Z());
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    class h implements View.OnTouchListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AutoCompleteTextView f54349b;

        h(AutoCompleteTextView autoCompleteTextView) {
            this.f54349b = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(@o0 View view, @o0 MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (d.this.C()) {
                    d.this.f54330i = false;
                }
                d.this.H(this.f54349b);
            }
            return false;
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    class i implements AutoCompleteTextView.OnDismissListener {
        i() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            d.this.f54330i = true;
            d.this.f54332k = System.currentTimeMillis();
            d.this.E(false);
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    class j extends AnimatorListenerAdapter {
        j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            dVar.f54355c.setChecked(dVar.f54331j);
            d.this.f54337p.start();
        }
    }

    d(@o0 TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f54325d = new a();
        this.f54326e = new c();
        this.f54327f = new C0820d(this.f54353a);
        this.f54328g = new e();
        this.f54329h = new f();
        this.f54330i = false;
        this.f54331j = false;
        this.f54332k = Long.MAX_VALUE;
    }

    private com.google.android.material.shape.j A(float f4, float f5, float f6, int i4) {
        o m4 = o.a().K(f4).P(f4).x(f5).C(f5).m();
        com.google.android.material.shape.j p4 = com.google.android.material.shape.j.p(this.f54354b, f6);
        p4.d(m4);
        p4.r0(0, i4, 0, i4);
        return p4;
    }

    private void B() {
        this.f54337p = z(67, 0.0f, 1.0f);
        ValueAnimator z4 = z(50, 1.0f, 0.0f);
        this.f54336o = z4;
        z4.addListener(new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C() {
        long currentTimeMillis = System.currentTimeMillis() - this.f54332k;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean D(@o0 EditText editText) {
        return editText.getKeyListener() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(boolean z4) {
        if (this.f54331j != z4) {
            this.f54331j = z4;
            this.f54337p.cancel();
            this.f54336o.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(@o0 AutoCompleteTextView autoCompleteTextView) {
        if (f54322q) {
            int L = this.f54353a.L();
            if (L == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f54334m);
            } else if (L == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f54333l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void G(@o0 AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f54326e);
        if (f54322q) {
            autoCompleteTextView.setOnDismissListener(new i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(@q0 AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (C()) {
            this.f54330i = false;
        }
        if (this.f54330i) {
            this.f54330i = false;
            return;
        }
        if (f54322q) {
            E(!this.f54331j);
        } else {
            this.f54331j = !this.f54331j;
            this.f54355c.toggle();
        }
        if (!this.f54331j) {
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
        int L = this.f54353a.L();
        com.google.android.material.shape.j J = this.f54353a.J();
        int h4 = com.google.android.material.resources.b.h(autoCompleteTextView, a.c.A2);
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
        if (L == 2) {
            x(autoCompleteTextView, h4, iArr, J);
        } else if (L == 1) {
            w(autoCompleteTextView, h4, iArr, J);
        }
    }

    private void w(@o0 AutoCompleteTextView autoCompleteTextView, int i4, int[][] iArr, @o0 com.google.android.material.shape.j jVar) {
        int K = this.f54353a.K();
        int[] iArr2 = {u8.a.h(i4, K, 0.1f), K};
        if (f54322q) {
            x1.P1(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), jVar, jVar));
            return;
        }
        com.google.android.material.shape.j jVar2 = new com.google.android.material.shape.j(jVar.e());
        jVar2.p0(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{jVar, jVar2});
        int n02 = x1.n0(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int paddingEnd = autoCompleteTextView.getPaddingEnd();
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        autoCompleteTextView.setBackground(layerDrawable);
        autoCompleteTextView.setPaddingRelative(n02, paddingTop, paddingEnd, paddingBottom);
    }

    private void x(@o0 AutoCompleteTextView autoCompleteTextView, int i4, int[][] iArr, @o0 com.google.android.material.shape.j jVar) {
        LayerDrawable layerDrawable;
        int h4 = com.google.android.material.resources.b.h(autoCompleteTextView, a.c.P2);
        com.google.android.material.shape.j jVar2 = new com.google.android.material.shape.j(jVar.e());
        int h5 = u8.a.h(i4, h4, 0.1f);
        jVar2.p0(new ColorStateList(iArr, new int[]{h5, 0}));
        if (f54322q) {
            jVar2.setTint(h4);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{h5, h4});
            com.google.android.material.shape.j jVar3 = new com.google.android.material.shape.j(jVar.e());
            jVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, jVar2, jVar3), jVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{jVar2, jVar});
        }
        x1.P1(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @o0
    public static AutoCompleteTextView y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException(ProtectedSandApp.s("\uf24b"));
    }

    private ValueAnimator z(int i4, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(com.google.android.material.animation.a.f52466a);
        ofFloat.setDuration(i4);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    @Override // com.google.android.material.textfield.e
    void a() {
        float dimensionPixelOffset = this.f54354b.getResources().getDimensionPixelOffset(a.f.M5);
        float dimensionPixelOffset2 = this.f54354b.getResources().getDimensionPixelOffset(a.f.x4);
        int dimensionPixelOffset3 = this.f54354b.getResources().getDimensionPixelOffset(a.f.z4);
        com.google.android.material.shape.j A = A(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        com.google.android.material.shape.j A2 = A(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f54334m = A;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f54333l = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, A);
        this.f54333l.addState(new int[0], A2);
        this.f54353a.O1(e.a.b(this.f54354b, f54322q ? a.g.f90908c1 : a.g.f90911d1));
        TextInputLayout textInputLayout = this.f54353a;
        textInputLayout.M1(textInputLayout.getResources().getText(a.m.K));
        this.f54353a.Q1(new g());
        this.f54353a.e(this.f54328g);
        this.f54353a.f(this.f54329h);
        B();
        this.f54335n = (AccessibilityManager) this.f54354b.getSystemService(ProtectedSandApp.s("\uf24c"));
    }

    @Override // com.google.android.material.textfield.e
    boolean b(int i4) {
        return i4 != 0;
    }

    @Override // com.google.android.material.textfield.e
    boolean d() {
        return true;
    }
}
