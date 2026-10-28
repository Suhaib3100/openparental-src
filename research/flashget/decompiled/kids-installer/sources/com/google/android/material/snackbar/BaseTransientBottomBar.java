package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.c1;
import androidx.annotation.d0;
import androidx.annotation.j0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.g0;
import androidx.core.view.o1;
import androidx.core.view.v4;
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import n1.a;

/* loaded from: classes2.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    static final int A = 180;
    private static final int B = 150;
    private static final int C = 75;
    private static final float D = 0.8f;
    static final int F = 0;
    static final int G = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f14185u = 0;

    /* renamed from: v, reason: collision with root package name */
    public static final int f14186v = 1;

    /* renamed from: w, reason: collision with root package name */
    public static final int f14187w = -2;

    /* renamed from: x, reason: collision with root package name */
    public static final int f14188x = -1;

    /* renamed from: y, reason: collision with root package name */
    public static final int f14189y = 0;

    /* renamed from: z, reason: collision with root package name */
    static final int f14190z = 250;

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final ViewGroup f14191a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f14192b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    protected final z f14193c;

    /* renamed from: d, reason: collision with root package name */
    @o0
    private final com.google.android.material.snackbar.a f14194d;

    /* renamed from: e, reason: collision with root package name */
    private int f14195e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14196f;

    /* renamed from: g, reason: collision with root package name */
    @q0
    private View f14197g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14198h;

    /* renamed from: i, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f14199i;

    /* renamed from: j, reason: collision with root package name */
    @x0(29)
    private final Runnable f14200j;

    /* renamed from: k, reason: collision with root package name */
    @q0
    private Rect f14201k;

    /* renamed from: l, reason: collision with root package name */
    private int f14202l;

    /* renamed from: m, reason: collision with root package name */
    private int f14203m;

    /* renamed from: n, reason: collision with root package name */
    private int f14204n;

    /* renamed from: o, reason: collision with root package name */
    private int f14205o;

    /* renamed from: p, reason: collision with root package name */
    private int f14206p;

    /* renamed from: q, reason: collision with root package name */
    private List<t<B>> f14207q;

    /* renamed from: r, reason: collision with root package name */
    private Behavior f14208r;

    /* renamed from: s, reason: collision with root package name */
    @q0
    private final AccessibilityManager f14209s;

    /* renamed from: t, reason: collision with root package name */
    @o0
    c.b f14210t;
    private static final boolean H = false;
    private static final int[] I = {a.c.Mc};
    private static final String J = BaseTransientBottomBar.class.getSimpleName();

    @o0
    static final Handler E = new Handler(Looper.getMainLooper(), new j());

    /* loaded from: classes3.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: t, reason: collision with root package name */
        @o0
        private final u f14211t = new u(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void V(@o0 BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f14211t.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean G(View view) {
            return this.f14211t.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean l(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, @o0 MotionEvent motionEvent) {
            this.f14211t.b(coordinatorLayout, view, motionEvent);
            return super.l(coordinatorLayout, view, motionEvent);
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z zVar = BaseTransientBottomBar.this.f14193c;
            if (zVar == null) {
                return;
            }
            if (zVar.getParent() != null) {
                BaseTransientBottomBar.this.f14193c.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f14193c.c() == 1) {
                BaseTransientBottomBar.this.i0();
            } else {
                BaseTransientBottomBar.this.k0();
            }
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.T();
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f14214a;

        c(int i5) {
            this.f14214a = i5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.S(this.f14214a);
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f14193c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class e implements ValueAnimator.AnimatorUpdateListener {
        e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f14193c.setScaleX(floatValue);
            BaseTransientBottomBar.this.f14193c.setScaleY(floatValue);
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.T();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f14194d.a(70, 180);
        }
    }

    class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private int f14219a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f14220b;

        g(int i5) {
            this.f14220b = i5;
            this.f14219a = i5;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.H) {
                y1.f1(BaseTransientBottomBar.this.f14193c, intValue - this.f14219a);
            } else {
                BaseTransientBottomBar.this.f14193c.setTranslationY(intValue);
            }
            this.f14219a = intValue;
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f14222a;

        h(int i5) {
            this.f14222a = i5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.S(this.f14222a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f14194d.b(0, 180);
        }
    }

    class i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private int f14224a = 0;

        i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.H) {
                y1.f1(BaseTransientBottomBar.this.f14193c, intValue - this.f14224a);
            } else {
                BaseTransientBottomBar.this.f14193c.setTranslationY(intValue);
            }
            this.f14224a = intValue;
        }
    }

    static class j implements Handler.Callback {
        j() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@o0 Message message) {
            int i5 = message.what;
            if (i5 == 0) {
                ((BaseTransientBottomBar) message.obj).g0();
                return true;
            }
            if (i5 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).M(message.arg1);
            return true;
        }
    }

    class k implements ViewTreeObserver.OnGlobalLayoutListener {
        k() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (BaseTransientBottomBar.this.f14198h) {
                BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                baseTransientBottomBar.f14206p = baseTransientBottomBar.v();
                BaseTransientBottomBar.this.m0();
            }
        }
    }

    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int G;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f14193c == null || baseTransientBottomBar.f14192b == null || (G = (BaseTransientBottomBar.this.G() - BaseTransientBottomBar.this.K()) + ((int) BaseTransientBottomBar.this.f14193c.getTranslationY())) >= BaseTransientBottomBar.this.f14205o) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f14193c.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                String unused = BaseTransientBottomBar.J;
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = (BaseTransientBottomBar.this.f14205o - G) + marginLayoutParams.bottomMargin;
            BaseTransientBottomBar.this.f14193c.requestLayout();
        }
    }

    /* loaded from: classes3.dex */
    class m implements o1 {
        m() {
        }

        @Override // androidx.core.view.o1
        @o0
        public v4 a(View view, @o0 v4 v4Var) {
            BaseTransientBottomBar.this.f14202l = v4Var.o();
            BaseTransientBottomBar.this.f14203m = v4Var.p();
            BaseTransientBottomBar.this.f14204n = v4Var.q();
            BaseTransientBottomBar.this.m0();
            return v4Var;
        }
    }

    /* loaded from: classes3.dex */
    class n extends androidx.core.view.a {
        n() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @o0 g0 g0Var) {
            super.g(view, g0Var);
            g0Var.a(1048576);
            g0Var.d1(true);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i5, Bundle bundle) {
            if (i5 != 1048576) {
                return super.j(view, i5, bundle);
            }
            BaseTransientBottomBar.this.w();
            return true;
        }
    }

    /* loaded from: classes3.dex */
    class o implements c.b {
        o() {
        }

        @Override // com.google.android.material.snackbar.c.b
        public void a() {
            Handler handler = BaseTransientBottomBar.E;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.c.b
        public void b(int i5) {
            Handler handler = BaseTransientBottomBar.E;
            handler.sendMessage(handler.obtainMessage(1, i5, 0, BaseTransientBottomBar.this));
        }
    }

    /* loaded from: classes3.dex */
    class p implements x {

        /* loaded from: classes2.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BaseTransientBottomBar.this.S(3);
            }
        }

        p() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.x
        public void onViewAttachedToWindow(View view) {
            WindowInsets rootWindowInsets;
            Insets mandatorySystemGestureInsets;
            int i5;
            if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = BaseTransientBottomBar.this.f14193c.getRootWindowInsets()) == null) {
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
            i5 = mandatorySystemGestureInsets.bottom;
            baseTransientBottomBar.f14205o = i5;
            BaseTransientBottomBar.this.m0();
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.x
        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.Q()) {
                BaseTransientBottomBar.E.post(new a());
            }
        }
    }

    /* loaded from: classes3.dex */
    class q implements y {
        q() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.y
        public void a(View view, int i5, int i6, int i7, int i8) {
            BaseTransientBottomBar.this.f14193c.g(null);
            BaseTransientBottomBar.this.h0();
        }
    }

    /* loaded from: classes3.dex */
    class r implements SwipeDismissBehavior.c {
        r() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(@o0 View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.x(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i5) {
            if (i5 == 0) {
                com.google.android.material.snackbar.c.c().l(BaseTransientBottomBar.this.f14210t);
            } else if (i5 == 1 || i5 == 2) {
                com.google.android.material.snackbar.c.c().k(BaseTransientBottomBar.this.f14210t);
            }
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface s {
    }

    public static abstract class t<B> {

        /* renamed from: a, reason: collision with root package name */
        public static final int f14235a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f14236b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f14237c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f14238d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f14239e = 4;

        @c1({c1.a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public void a(B b6, int i5) {
        }

        public void b(B b6) {
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    public static class u {

        /* renamed from: a, reason: collision with root package name */
        private c.b f14240a;

        public u(@o0 SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.R(0.1f);
            swipeDismissBehavior.O(0.6f);
            swipeDismissBehavior.S(0);
        }

        public boolean a(View view) {
            return view instanceof z;
        }

        public void b(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, @o0 MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.P(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.c.c().k(this.f14240a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.c.c().l(this.f14240a);
            }
        }

        public void c(@o0 BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f14240a = baseTransientBottomBar.f14210t;
        }
    }

    @Deprecated
    /* loaded from: classes3.dex */
    public interface v extends com.google.android.material.snackbar.a {
    }

    @c1({c1.a.LIBRARY_GROUP})
    @androidx.annotation.g0(from = 1)
    @Retention(RetentionPolicy.SOURCE)
    public @interface w {
    }

    @c1({c1.a.LIBRARY_GROUP})
    protected interface x {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    @c1({c1.a.LIBRARY_GROUP})
    protected interface y {
        void a(View view, int i5, int i6, int i7, int i8);
    }

    @c1({c1.a.LIBRARY_GROUP})
    protected static class z extends FrameLayout {

        /* renamed from: v, reason: collision with root package name */
        private static final View.OnTouchListener f14241v = new a();

        /* renamed from: o, reason: collision with root package name */
        private y f14242o;

        /* renamed from: p, reason: collision with root package name */
        private x f14243p;

        /* renamed from: q, reason: collision with root package name */
        private int f14244q;

        /* renamed from: r, reason: collision with root package name */
        private final float f14245r;

        /* renamed from: s, reason: collision with root package name */
        private final float f14246s;

        /* renamed from: t, reason: collision with root package name */
        private ColorStateList f14247t;

        /* renamed from: u, reason: collision with root package name */
        private PorterDuff.Mode f14248u;

        static class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected z(@o0 Context context) {
            this(context, null);
        }

        @o0
        private Drawable a() {
            float dimension = getResources().getDimension(a.f.Y5);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(p1.a.j(this, a.c.Q2, a.c.J2, d()));
            ColorStateList colorStateList = this.f14247t;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.d.o(gradientDrawable, colorStateList);
            }
            return gradientDrawable;
        }

        float b() {
            return this.f14246s;
        }

        int c() {
            return this.f14244q;
        }

        float d() {
            return this.f14245r;
        }

        void e(int i5) {
            this.f14244q = i5;
        }

        void f(x xVar) {
            this.f14243p = xVar;
        }

        void g(y yVar) {
            this.f14242o = yVar;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            x xVar = this.f14243p;
            if (xVar != null) {
                xVar.onViewAttachedToWindow(this);
            }
            y1.v1(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            x xVar = this.f14243p;
            if (xVar != null) {
                xVar.onViewDetachedFromWindow(this);
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
            super.onLayout(z5, i5, i6, i7, i8);
            y yVar = this.f14242o;
            if (yVar != null) {
                yVar.a(this, i5, i6, i7, i8);
            }
        }

        @Override // android.view.View
        public void setBackground(@q0 Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@q0 Drawable drawable) {
            if (drawable != null && this.f14247t != null) {
                drawable = drawable.mutate();
                androidx.core.graphics.drawable.d.o(drawable, this.f14247t);
                androidx.core.graphics.drawable.d.p(drawable, this.f14248u);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@q0 ColorStateList colorStateList) {
            this.f14247t = colorStateList;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                androidx.core.graphics.drawable.d.o(mutate, colorStateList);
                androidx.core.graphics.drawable.d.p(mutate, this.f14248u);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@q0 PorterDuff.Mode mode) {
            this.f14248u = mode;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                androidx.core.graphics.drawable.d.p(mutate, mode);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(@q0 View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f14241v);
            super.setOnClickListener(onClickListener);
        }

        protected z(@o0 Context context, AttributeSet attributeSet) {
            super(v1.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, a.o.hp);
            if (obtainStyledAttributes.hasValue(a.o.op)) {
                y1.N1(this, obtainStyledAttributes.getDimensionPixelSize(r1, 0));
            }
            this.f14244q = obtainStyledAttributes.getInt(a.o.kp, 0);
            this.f14245r = obtainStyledAttributes.getFloat(a.o.lp, 1.0f);
            setBackgroundTintList(com.google.android.material.resources.c.a(context2, obtainStyledAttributes, a.o.mp));
            setBackgroundTintMode(com.google.android.material.internal.v.k(obtainStyledAttributes.getInt(a.o.np, -1), PorterDuff.Mode.SRC_IN));
            this.f14246s = obtainStyledAttributes.getFloat(a.o.jp, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f14241v);
            setFocusable(true);
            if (getBackground() == null) {
                y1.I1(this, a());
            }
        }
    }

    protected BaseTransientBottomBar(@o0 ViewGroup viewGroup, @o0 View view, @o0 com.google.android.material.snackbar.a aVar) {
        this(viewGroup.getContext(), viewGroup, view, aVar);
    }

    private ValueAnimator F(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(com.google.android.material.animation.a.f12781d);
        ofFloat.addUpdateListener(new e());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @x0(17)
    public int G() {
        WindowManager windowManager = (WindowManager) this.f14192b.getSystemService(ProtectedSandApp.s("ቯ"));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    private int I() {
        int height = this.f14193c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f14193c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int K() {
        int[] iArr = new int[2];
        this.f14193c.getLocationOnScreen(iArr);
        return this.f14193c.getHeight() + iArr[1];
    }

    private boolean R() {
        ViewGroup.LayoutParams layoutParams = this.f14193c.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    private void c0(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehavior = this.f14208r;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = E();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).V(this);
        }
        swipeDismissBehavior.P(new r());
        fVar.q(swipeDismissBehavior);
        if (this.f14197g == null) {
            fVar.f3933g = 80;
        }
    }

    private boolean e0() {
        return this.f14205o > 0 && !this.f14196f && R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        if (d0()) {
            t();
            return;
        }
        if (this.f14193c.getParent() != null) {
            this.f14193c.setVisibility(0);
        }
        T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0() {
        ValueAnimator y5 = y(0.0f, 1.0f);
        ValueAnimator F2 = F(D, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(y5, F2);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new b());
        animatorSet.start();
    }

    private void j0(int i5) {
        ValueAnimator y5 = y(1.0f, 0.0f);
        y5.setDuration(75L);
        y5.addListener(new c(i5));
        y5.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0() {
        int I2 = I();
        if (H) {
            y1.f1(this.f14193c, I2);
        } else {
            this.f14193c.setTranslationY(I2);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(I2, 0);
        valueAnimator.setInterpolator(com.google.android.material.animation.a.f12779b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new f());
        valueAnimator.addUpdateListener(new g(I2));
        valueAnimator.start();
    }

    private void l0(int i5) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, I());
        valueAnimator.setInterpolator(com.google.android.material.animation.a.f12779b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new h(i5));
        valueAnimator.addUpdateListener(new i());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        Rect rect;
        ViewGroup.LayoutParams layoutParams = this.f14193c.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (rect = this.f14201k) == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + (this.f14197g != null ? this.f14206p : this.f14202l);
        marginLayoutParams.leftMargin = rect.left + this.f14203m;
        marginLayoutParams.rightMargin = rect.right + this.f14204n;
        this.f14193c.requestLayout();
        if (Build.VERSION.SDK_INT < 29 || !e0()) {
            return;
        }
        this.f14193c.removeCallbacks(this.f14200j);
        this.f14193c.post(this.f14200j);
    }

    private void u(int i5) {
        if (this.f14193c.c() == 1) {
            j0(i5);
        } else {
            l0(i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int v() {
        View view = this.f14197g;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i5 = iArr[1];
        int[] iArr2 = new int[2];
        this.f14191a.getLocationOnScreen(iArr2);
        return (this.f14191a.getHeight() + iArr2[1]) - i5;
    }

    private ValueAnimator y(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(com.google.android.material.animation.a.f12778a);
        ofFloat.addUpdateListener(new d());
        return ofFloat;
    }

    public int A() {
        return this.f14193c.c();
    }

    public Behavior B() {
        return this.f14208r;
    }

    @o0
    public Context C() {
        return this.f14192b;
    }

    public int D() {
        return this.f14195e;
    }

    @o0
    protected SwipeDismissBehavior<? extends View> E() {
        return new Behavior();
    }

    @j0
    protected int H() {
        return L() ? a.k.f29930w0 : a.k.F;
    }

    @o0
    public View J() {
        return this.f14193c;
    }

    protected boolean L() {
        TypedArray obtainStyledAttributes = this.f14192b.obtainStyledAttributes(I);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    final void M(int i5) {
        if (d0() && this.f14193c.getVisibility() == 0) {
            u(i5);
        } else {
            S(i5);
        }
    }

    public boolean N() {
        return this.f14198h;
    }

    public boolean O() {
        return this.f14196f;
    }

    public boolean P() {
        return com.google.android.material.snackbar.c.c().e(this.f14210t);
    }

    public boolean Q() {
        return com.google.android.material.snackbar.c.c().f(this.f14210t);
    }

    void S(int i5) {
        com.google.android.material.snackbar.c.c().i(this.f14210t);
        List<t<B>> list = this.f14207q;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f14207q.get(size).a(this, i5);
            }
        }
        ViewParent parent = this.f14193c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f14193c);
        }
    }

    void T() {
        com.google.android.material.snackbar.c.c().j(this.f14210t);
        List<t<B>> list = this.f14207q;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f14207q.get(size).b(this);
            }
        }
    }

    @o0
    public B U(@q0 t<B> tVar) {
        if (tVar == null) {
            return this;
        }
        List<t<B>> list = this.f14207q;
        if (list == null) {
            return this;
        }
        list.remove(tVar);
        return this;
    }

    @o0
    public B V(@d0 int i5) {
        View findViewById = this.f14191a.findViewById(i5);
        if (findViewById != null) {
            return W(findViewById);
        }
        throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("ተ"), i5));
    }

    @o0
    public B W(@q0 View view) {
        com.google.android.material.internal.v.l(this.f14197g, this.f14199i);
        this.f14197g = view;
        com.google.android.material.internal.v.a(view, this.f14199i);
        return this;
    }

    public void X(boolean z5) {
        this.f14198h = z5;
    }

    @o0
    public B Y(int i5) {
        this.f14193c.e(i5);
        return this;
    }

    @o0
    public B Z(Behavior behavior) {
        this.f14208r = behavior;
        return this;
    }

    @o0
    public B a0(int i5) {
        this.f14195e = i5;
        return this;
    }

    @o0
    public B b0(boolean z5) {
        this.f14196f = z5;
        return this;
    }

    boolean d0() {
        AccessibilityManager accessibilityManager = this.f14209s;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public void f0() {
        com.google.android.material.snackbar.c.c().n(D(), this.f14210t);
    }

    final void g0() {
        this.f14193c.f(new p());
        if (this.f14193c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f14193c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                c0((CoordinatorLayout.f) layoutParams);
            }
            this.f14206p = v();
            m0();
            this.f14193c.setVisibility(4);
            this.f14191a.addView(this.f14193c);
        }
        if (y1.U0(this.f14193c)) {
            h0();
        } else {
            this.f14193c.g(new q());
        }
    }

    @o0
    public B s(@q0 t<B> tVar) {
        if (tVar == null) {
            return this;
        }
        if (this.f14207q == null) {
            this.f14207q = new ArrayList();
        }
        this.f14207q.add(tVar);
        return this;
    }

    void t() {
        this.f14193c.post(new a());
    }

    public void w() {
        x(3);
    }

    protected void x(int i5) {
        com.google.android.material.snackbar.c.c().b(this.f14210t, i5);
    }

    @q0
    public View z() {
        return this.f14197g;
    }

    protected BaseTransientBottomBar(@o0 Context context, @o0 ViewGroup viewGroup, @o0 View view, @o0 com.google.android.material.snackbar.a aVar) {
        this.f14198h = false;
        this.f14199i = new k();
        this.f14200j = new l();
        this.f14210t = new o();
        if (viewGroup == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ቮ"));
        }
        if (view == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ቭ"));
        }
        if (aVar == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ቬ"));
        }
        this.f14191a = viewGroup;
        this.f14194d = aVar;
        this.f14192b = context;
        com.google.android.material.internal.n.a(context);
        z zVar = (z) LayoutInflater.from(context).inflate(H(), viewGroup, false);
        this.f14193c = zVar;
        if (view instanceof SnackbarContentLayout) {
            ((SnackbarContentLayout) view).f(zVar.b());
        }
        zVar.addView(view);
        ViewGroup.LayoutParams layoutParams = zVar.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f14201k = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        y1.D1(zVar, 1);
        y1.R1(zVar, 1);
        zVar.setFitsSystemWindows(true);
        y1.a2(zVar, new m());
        y1.B1(zVar, new n());
        this.f14209s = (AccessibilityManager) context.getSystemService(ProtectedSandApp.s("ቫ"));
    }
}
