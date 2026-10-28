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
import androidx.annotation.g0;
import androidx.annotation.j0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.h0;
import androidx.core.view.d1;
import androidx.core.view.j3;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import s8.a;

/* loaded from: classes6.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    static final int A = 180;
    private static final int B = 150;
    private static final int C = 75;
    private static final float D = 0.8f;
    static final int F = 0;
    static final int G = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f54053u = 0;

    /* renamed from: v, reason: collision with root package name */
    public static final int f54054v = 1;

    /* renamed from: w, reason: collision with root package name */
    public static final int f54055w = -2;

    /* renamed from: x, reason: collision with root package name */
    public static final int f54056x = -1;

    /* renamed from: y, reason: collision with root package name */
    public static final int f54057y = 0;

    /* renamed from: z, reason: collision with root package name */
    static final int f54058z = 250;

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final ViewGroup f54059a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f54060b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    protected final z f54061c;

    /* renamed from: d, reason: collision with root package name */
    @o0
    private final com.google.android.material.snackbar.a f54062d;

    /* renamed from: e, reason: collision with root package name */
    private int f54063e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f54064f;

    /* renamed from: g, reason: collision with root package name */
    @q0
    private View f54065g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f54066h;

    /* renamed from: i, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f54067i;

    /* renamed from: j, reason: collision with root package name */
    @x0(29)
    private final Runnable f54068j;

    /* renamed from: k, reason: collision with root package name */
    @q0
    private Rect f54069k;

    /* renamed from: l, reason: collision with root package name */
    private int f54070l;

    /* renamed from: m, reason: collision with root package name */
    private int f54071m;

    /* renamed from: n, reason: collision with root package name */
    private int f54072n;

    /* renamed from: o, reason: collision with root package name */
    private int f54073o;

    /* renamed from: p, reason: collision with root package name */
    private int f54074p;

    /* renamed from: q, reason: collision with root package name */
    private List<t<B>> f54075q;

    /* renamed from: r, reason: collision with root package name */
    private Behavior f54076r;

    /* renamed from: s, reason: collision with root package name */
    @q0
    private final AccessibilityManager f54077s;

    /* renamed from: t, reason: collision with root package name */
    @o0
    c.b f54078t;
    private static final boolean H = false;
    private static final int[] I = {a.c.Lc};
    private static final String J = BaseTransientBottomBar.class.getSimpleName();

    @o0
    static final Handler E = new Handler(Looper.getMainLooper(), new j());

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: t, reason: collision with root package name */
        @o0
        private final u f54079t = new u(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void V(@o0 BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f54079t.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean G(View view) {
            return this.f54079t.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean l(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, @o0 MotionEvent motionEvent) {
            this.f54079t.b(coordinatorLayout, view, motionEvent);
            return super.l(coordinatorLayout, view, motionEvent);
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z zVar = BaseTransientBottomBar.this.f54061c;
            if (zVar == null) {
                return;
            }
            if (zVar.getParent() != null) {
                BaseTransientBottomBar.this.f54061c.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f54061c.c() == 1) {
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

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f54082b;

        c(int i4) {
            this.f54082b = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.S(this.f54082b);
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f54061c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class e implements ValueAnimator.AnimatorUpdateListener {
        e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f54061c.setScaleX(floatValue);
            BaseTransientBottomBar.this.f54061c.setScaleY(floatValue);
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
            BaseTransientBottomBar.this.f54062d.a(70, 180);
        }
    }

    class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        private int f54087b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f54088c;

        g(int i4) {
            this.f54088c = i4;
            this.f54087b = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.H) {
                x1.j1(BaseTransientBottomBar.this.f54061c, intValue - this.f54087b);
            } else {
                BaseTransientBottomBar.this.f54061c.setTranslationY(intValue);
            }
            this.f54087b = intValue;
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f54090b;

        h(int i4) {
            this.f54090b = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.S(this.f54090b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f54062d.b(0, 180);
        }
    }

    class i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        private int f54092b = 0;

        i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.H) {
                x1.j1(BaseTransientBottomBar.this.f54061c, intValue - this.f54092b);
            } else {
                BaseTransientBottomBar.this.f54061c.setTranslationY(intValue);
            }
            this.f54092b = intValue;
        }
    }

    static class j implements Handler.Callback {
        j() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@o0 Message message) {
            int i4 = message.what;
            if (i4 == 0) {
                ((BaseTransientBottomBar) message.obj).g0();
                return true;
            }
            if (i4 != 1) {
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
            if (BaseTransientBottomBar.this.f54066h) {
                BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                baseTransientBottomBar.f54074p = baseTransientBottomBar.v();
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
            if (baseTransientBottomBar.f54061c == null || baseTransientBottomBar.f54060b == null || (G = (BaseTransientBottomBar.this.G() - BaseTransientBottomBar.this.K()) + ((int) BaseTransientBottomBar.this.f54061c.getTranslationY())) >= BaseTransientBottomBar.this.f54073o) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f54061c.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                String unused = BaseTransientBottomBar.J;
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = (BaseTransientBottomBar.this.f54073o - G) + marginLayoutParams.bottomMargin;
            BaseTransientBottomBar.this.f54061c.requestLayout();
        }
    }

    class m implements d1 {
        m() {
        }

        @Override // androidx.core.view.d1
        @o0
        public j3 a(View view, @o0 j3 j3Var) {
            BaseTransientBottomBar.this.f54070l = j3Var.o();
            BaseTransientBottomBar.this.f54071m = j3Var.p();
            BaseTransientBottomBar.this.f54072n = j3Var.q();
            BaseTransientBottomBar.this.m0();
            return j3Var;
        }
    }

    class n extends androidx.core.view.a {
        n() {
        }

        @Override // androidx.core.view.a
        public void i(View view, @o0 h0 h0Var) {
            super.i(view, h0Var);
            h0Var.a(1048576);
            h0Var.r1(true);
        }

        @Override // androidx.core.view.a
        public boolean m(View view, int i4, Bundle bundle) {
            if (i4 != 1048576) {
                return super.m(view, i4, bundle);
            }
            BaseTransientBottomBar.this.w();
            return true;
        }
    }

    class o implements c.b {
        o() {
        }

        @Override // com.google.android.material.snackbar.c.b
        public void a(int i4) {
            Handler handler = BaseTransientBottomBar.E;
            handler.sendMessage(handler.obtainMessage(1, i4, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.c.b
        public void b() {
            Handler handler = BaseTransientBottomBar.E;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    class p implements x {

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
            int i4;
            if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = BaseTransientBottomBar.this.f54061c.getRootWindowInsets()) == null) {
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
            i4 = mandatorySystemGestureInsets.bottom;
            baseTransientBottomBar.f54073o = i4;
            BaseTransientBottomBar.this.m0();
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.x
        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.Q()) {
                BaseTransientBottomBar.E.post(new a());
            }
        }
    }

    class q implements y {
        q() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.y
        public void a(View view, int i4, int i5, int i6, int i7) {
            BaseTransientBottomBar.this.f54061c.g(null);
            BaseTransientBottomBar.this.h0();
        }
    }

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
        public void b(int i4) {
            if (i4 == 0) {
                com.google.android.material.snackbar.c.c().l(BaseTransientBottomBar.this.f54078t);
            } else if (i4 == 1 || i4 == 2) {
                com.google.android.material.snackbar.c.c().k(BaseTransientBottomBar.this.f54078t);
            }
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface s {
    }

    public static abstract class t<B> {

        /* renamed from: a, reason: collision with root package name */
        public static final int f54103a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f54104b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f54105c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f54106d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f54107e = 4;

        @c1({c1.a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public void a(B b5, int i4) {
        }

        public void b(B b5) {
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    public static class u {

        /* renamed from: a, reason: collision with root package name */
        private c.b f54108a;

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
                if (coordinatorLayout.M(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.c.c().k(this.f54108a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.c.c().l(this.f54108a);
            }
        }

        public void c(@o0 BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f54108a = baseTransientBottomBar.f54078t;
        }
    }

    @Deprecated
    public interface v extends com.google.android.material.snackbar.a {
    }

    @c1({c1.a.LIBRARY_GROUP})
    @g0(from = 1)
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
        void a(View view, int i4, int i5, int i6, int i7);
    }

    @c1({c1.a.LIBRARY_GROUP})
    protected static class z extends FrameLayout {

        /* renamed from: i, reason: collision with root package name */
        private static final View.OnTouchListener f54109i = new a();

        /* renamed from: b, reason: collision with root package name */
        private y f54110b;

        /* renamed from: c, reason: collision with root package name */
        private x f54111c;

        /* renamed from: d, reason: collision with root package name */
        private int f54112d;

        /* renamed from: e, reason: collision with root package name */
        private final float f54113e;

        /* renamed from: f, reason: collision with root package name */
        private final float f54114f;

        /* renamed from: g, reason: collision with root package name */
        private ColorStateList f54115g;

        /* renamed from: h, reason: collision with root package name */
        private PorterDuff.Mode f54116h;

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
            gradientDrawable.setColor(u8.a.j(this, a.c.P2, a.c.I2, d()));
            ColorStateList colorStateList = this.f54115g;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            return gradientDrawable;
        }

        float b() {
            return this.f54114f;
        }

        int c() {
            return this.f54112d;
        }

        float d() {
            return this.f54113e;
        }

        void e(int i4) {
            this.f54112d = i4;
        }

        void f(x xVar) {
            this.f54111c = xVar;
        }

        void g(y yVar) {
            this.f54110b = yVar;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            x xVar = this.f54111c;
            if (xVar != null) {
                xVar.onViewAttachedToWindow(this);
            }
            x1.B1(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            x xVar = this.f54111c;
            if (xVar != null) {
                xVar.onViewDetachedFromWindow(this);
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
            super.onLayout(z4, i4, i5, i6, i7);
            y yVar = this.f54110b;
            if (yVar != null) {
                yVar.a(this, i4, i5, i6, i7);
            }
        }

        @Override // android.view.View
        public void setBackground(@q0 Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@q0 Drawable drawable) {
            if (drawable != null && this.f54115g != null) {
                drawable = drawable.mutate();
                drawable.setTintList(this.f54115g);
                drawable.setTintMode(this.f54116h);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@q0 ColorStateList colorStateList) {
            this.f54115g = colorStateList;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                mutate.setTintList(colorStateList);
                mutate.setTintMode(this.f54116h);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@q0 PorterDuff.Mode mode) {
            this.f54116h = mode;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                mutate.setTintMode(mode);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(@q0 View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f54109i);
            super.setOnClickListener(onClickListener);
        }

        protected z(@o0 Context context, AttributeSet attributeSet) {
            super(a9.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, a.o.Mq);
            if (obtainStyledAttributes.hasValue(a.o.Tq)) {
                x1.V1(this, obtainStyledAttributes.getDimensionPixelSize(r1, 0));
            }
            this.f54112d = obtainStyledAttributes.getInt(a.o.Pq, 0);
            this.f54113e = obtainStyledAttributes.getFloat(a.o.Qq, 1.0f);
            setBackgroundTintList(com.google.android.material.resources.c.a(context2, obtainStyledAttributes, a.o.Rq));
            setBackgroundTintMode(com.google.android.material.internal.v.k(obtainStyledAttributes.getInt(a.o.Sq, -1), PorterDuff.Mode.SRC_IN));
            this.f54114f = obtainStyledAttributes.getFloat(a.o.Oq, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f54109i);
            setFocusable(true);
            if (getBackground() == null) {
                x1.P1(this, a());
            }
        }
    }

    protected BaseTransientBottomBar(@o0 ViewGroup viewGroup, @o0 View view, @o0 com.google.android.material.snackbar.a aVar) {
        this(viewGroup.getContext(), viewGroup, view, aVar);
    }

    private ValueAnimator F(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(com.google.android.material.animation.a.f52469d);
        ofFloat.addUpdateListener(new e());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @x0(17)
    public int G() {
        WindowManager windowManager = (WindowManager) this.f54060b.getSystemService(ProtectedSandApp.s("\uf22c"));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    private int I() {
        int height = this.f54061c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f54061c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int K() {
        int[] iArr = new int[2];
        this.f54061c.getLocationOnScreen(iArr);
        return this.f54061c.getHeight() + iArr[1];
    }

    private boolean R() {
        ViewGroup.LayoutParams layoutParams = this.f54061c.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    private void c0(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehavior = this.f54076r;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = E();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).V(this);
        }
        swipeDismissBehavior.P(new r());
        fVar.q(swipeDismissBehavior);
        if (this.f54065g == null) {
            fVar.f25335g = 80;
        }
    }

    private boolean e0() {
        return this.f54073o > 0 && !this.f54064f && R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        if (d0()) {
            t();
            return;
        }
        if (this.f54061c.getParent() != null) {
            this.f54061c.setVisibility(0);
        }
        T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0() {
        ValueAnimator y4 = y(0.0f, 1.0f);
        ValueAnimator F2 = F(D, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(y4, F2);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new b());
        animatorSet.start();
    }

    private void j0(int i4) {
        ValueAnimator y4 = y(1.0f, 0.0f);
        y4.setDuration(75L);
        y4.addListener(new c(i4));
        y4.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0() {
        int I2 = I();
        if (H) {
            x1.j1(this.f54061c, I2);
        } else {
            this.f54061c.setTranslationY(I2);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(I2, 0);
        valueAnimator.setInterpolator(com.google.android.material.animation.a.f52467b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new f());
        valueAnimator.addUpdateListener(new g(I2));
        valueAnimator.start();
    }

    private void l0(int i4) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, I());
        valueAnimator.setInterpolator(com.google.android.material.animation.a.f52467b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new h(i4));
        valueAnimator.addUpdateListener(new i());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        Rect rect;
        ViewGroup.LayoutParams layoutParams = this.f54061c.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (rect = this.f54069k) == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + (this.f54065g != null ? this.f54074p : this.f54070l);
        marginLayoutParams.leftMargin = rect.left + this.f54071m;
        marginLayoutParams.rightMargin = rect.right + this.f54072n;
        this.f54061c.requestLayout();
        if (Build.VERSION.SDK_INT < 29 || !e0()) {
            return;
        }
        this.f54061c.removeCallbacks(this.f54068j);
        this.f54061c.post(this.f54068j);
    }

    private void u(int i4) {
        if (this.f54061c.c() == 1) {
            j0(i4);
        } else {
            l0(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int v() {
        View view = this.f54065g;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i4 = iArr[1];
        int[] iArr2 = new int[2];
        this.f54059a.getLocationOnScreen(iArr2);
        return (this.f54059a.getHeight() + iArr2[1]) - i4;
    }

    private ValueAnimator y(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(com.google.android.material.animation.a.f52466a);
        ofFloat.addUpdateListener(new d());
        return ofFloat;
    }

    public int A() {
        return this.f54061c.c();
    }

    public Behavior B() {
        return this.f54076r;
    }

    @o0
    public Context C() {
        return this.f54060b;
    }

    public int D() {
        return this.f54063e;
    }

    @o0
    protected SwipeDismissBehavior<? extends View> E() {
        return new Behavior();
    }

    @j0
    protected int H() {
        return L() ? a.k.f91202w0 : a.k.F;
    }

    @o0
    public View J() {
        return this.f54061c;
    }

    protected boolean L() {
        TypedArray obtainStyledAttributes = this.f54060b.obtainStyledAttributes(I);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    final void M(int i4) {
        if (d0() && this.f54061c.getVisibility() == 0) {
            u(i4);
        } else {
            S(i4);
        }
    }

    public boolean N() {
        return this.f54066h;
    }

    public boolean O() {
        return this.f54064f;
    }

    public boolean P() {
        return com.google.android.material.snackbar.c.c().e(this.f54078t);
    }

    public boolean Q() {
        return com.google.android.material.snackbar.c.c().f(this.f54078t);
    }

    void S(int i4) {
        com.google.android.material.snackbar.c.c().i(this.f54078t);
        List<t<B>> list = this.f54075q;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f54075q.get(size).a(this, i4);
            }
        }
        ViewParent parent = this.f54061c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f54061c);
        }
    }

    void T() {
        com.google.android.material.snackbar.c.c().j(this.f54078t);
        List<t<B>> list = this.f54075q;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f54075q.get(size).b(this);
            }
        }
    }

    @o0
    public B U(@q0 t<B> tVar) {
        if (tVar == null) {
            return this;
        }
        List<t<B>> list = this.f54075q;
        if (list == null) {
            return this;
        }
        list.remove(tVar);
        return this;
    }

    @o0
    public B V(@d0 int i4) {
        View findViewById = this.f54059a.findViewById(i4);
        if (findViewById != null) {
            return W(findViewById);
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("\uf22d"), i4));
    }

    @o0
    public B W(@q0 View view) {
        com.google.android.material.internal.v.l(this.f54065g, this.f54067i);
        this.f54065g = view;
        com.google.android.material.internal.v.a(view, this.f54067i);
        return this;
    }

    public void X(boolean z4) {
        this.f54066h = z4;
    }

    @o0
    public B Y(int i4) {
        this.f54061c.e(i4);
        return this;
    }

    @o0
    public B Z(Behavior behavior) {
        this.f54076r = behavior;
        return this;
    }

    @o0
    public B a0(int i4) {
        this.f54063e = i4;
        return this;
    }

    @o0
    public B b0(boolean z4) {
        this.f54064f = z4;
        return this;
    }

    boolean d0() {
        AccessibilityManager accessibilityManager = this.f54077s;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public void f0() {
        com.google.android.material.snackbar.c.c().n(D(), this.f54078t);
    }

    final void g0() {
        this.f54061c.f(new p());
        if (this.f54061c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f54061c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                c0((CoordinatorLayout.f) layoutParams);
            }
            this.f54074p = v();
            m0();
            this.f54061c.setVisibility(4);
            this.f54059a.addView(this.f54061c);
        }
        if (x1.Y0(this.f54061c)) {
            h0();
        } else {
            this.f54061c.g(new q());
        }
    }

    @o0
    public B s(@q0 t<B> tVar) {
        if (tVar == null) {
            return this;
        }
        if (this.f54075q == null) {
            this.f54075q = new ArrayList();
        }
        this.f54075q.add(tVar);
        return this;
    }

    void t() {
        this.f54061c.post(new a());
    }

    public void w() {
        x(3);
    }

    protected void x(int i4) {
        com.google.android.material.snackbar.c.c().b(this.f54078t, i4);
    }

    @q0
    public View z() {
        return this.f54065g;
    }

    protected BaseTransientBottomBar(@o0 Context context, @o0 ViewGroup viewGroup, @o0 View view, @o0 com.google.android.material.snackbar.a aVar) {
        this.f54066h = false;
        this.f54067i = new k();
        this.f54068j = new l();
        this.f54078t = new o();
        if (viewGroup == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf22b"));
        }
        if (view == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf22a"));
        }
        if (aVar == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf229"));
        }
        this.f54059a = viewGroup;
        this.f54062d = aVar;
        this.f54060b = context;
        com.google.android.material.internal.n.a(context);
        z zVar = (z) LayoutInflater.from(context).inflate(H(), viewGroup, false);
        this.f54061c = zVar;
        if (view instanceof SnackbarContentLayout) {
            ((SnackbarContentLayout) view).f(zVar.b());
        }
        zVar.addView(view);
        ViewGroup.LayoutParams layoutParams = zVar.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f54069k = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        x1.J1(zVar, 1);
        zVar.setImportantForAccessibility(1);
        zVar.setFitsSystemWindows(true);
        x1.k2(zVar, new m());
        x1.H1(zVar, new n());
        this.f54077s = (AccessibilityManager) context.getSystemService(ProtectedSandApp.s("\uf228"));
    }
}
