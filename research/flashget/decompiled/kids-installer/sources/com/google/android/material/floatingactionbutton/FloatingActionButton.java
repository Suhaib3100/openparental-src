package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.annotation.d0;
import androidx.annotation.l;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q;
import androidx.annotation.q0;
import androidx.annotation.u0;
import androidx.annotation.v;
import androidx.annotation.x0;
import androidx.appcompat.widget.h;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.v1;
import androidx.core.view.y1;
import androidx.core.widget.g0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.animation.k;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.d;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.shape.o;
import com.google.android.material.shape.s;
import com.google.android.material.stateful.ExtendableSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import n1.a;

/* loaded from: classes3.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements v1, g0, t1.a, s, CoordinatorLayout.b {
    private static final String F = ProtectedSandApp.s("⛯");
    private static final String G = ProtectedSandApp.s("⛰");
    private static final int H = a.n.wa;
    public static final int I = 1;
    public static final int J = 0;
    public static final int K = -1;
    public static final int L = 0;
    private static final int M = 470;
    final Rect A;
    private final Rect B;

    @o0
    private final h C;

    @o0
    private final t1.c D;
    private com.google.android.material.floatingactionbutton.d E;

    /* renamed from: p, reason: collision with root package name */
    @q0
    private ColorStateList f13477p;

    /* renamed from: q, reason: collision with root package name */
    @q0
    private PorterDuff.Mode f13478q;

    /* renamed from: r, reason: collision with root package name */
    @q0
    private ColorStateList f13479r;

    /* renamed from: s, reason: collision with root package name */
    @q0
    private PorterDuff.Mode f13480s;

    /* renamed from: t, reason: collision with root package name */
    @q0
    private ColorStateList f13481t;

    /* renamed from: u, reason: collision with root package name */
    private int f13482u;

    /* renamed from: v, reason: collision with root package name */
    private int f13483v;

    /* renamed from: w, reason: collision with root package name */
    private int f13484w;

    /* renamed from: x, reason: collision with root package name */
    private int f13485x;

    /* renamed from: y, reason: collision with root package name */
    private int f13486y;

    /* renamed from: z, reason: collision with root package name */
    boolean f13487z;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: G */
        public /* bridge */ /* synthetic */ boolean b(@o0 CoordinatorLayout coordinatorLayout, @o0 FloatingActionButton floatingActionButton, @o0 Rect rect) {
            return super.b(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean H() {
            return super.H();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: K */
        public /* bridge */ /* synthetic */ boolean i(CoordinatorLayout coordinatorLayout, @o0 FloatingActionButton floatingActionButton, View view) {
            return super.i(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: L */
        public /* bridge */ /* synthetic */ boolean m(@o0 CoordinatorLayout coordinatorLayout, @o0 FloatingActionButton floatingActionButton, int i5) {
            return super.m(coordinatorLayout, floatingActionButton, i5);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void M(boolean z5) {
            super.M(z5);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        @m1
        public /* bridge */ /* synthetic */ void N(b bVar) {
            super.N(bVar);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void h(@o0 CoordinatorLayout.f fVar) {
            super.h(fVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    class a implements d.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f13492a;

        a(b bVar) {
            this.f13492a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.j
        public void a() {
            this.f13492a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.d.j
        public void b() {
            this.f13492a.a(FloatingActionButton.this);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    private class c implements com.google.android.material.shadow.c {
        c() {
        }

        @Override // com.google.android.material.shadow.c
        public void a(int i5, int i6, int i7, int i8) {
            FloatingActionButton.this.A.set(i5, i6, i7, i8);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i5 + floatingActionButton.f13485x, i6 + FloatingActionButton.this.f13485x, i7 + FloatingActionButton.this.f13485x, i8 + FloatingActionButton.this.f13485x);
        }

        @Override // com.google.android.material.shadow.c
        public void b(@q0 Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // com.google.android.material.shadow.c
        public boolean c() {
            return FloatingActionButton.this.f13487z;
        }

        @Override // com.google.android.material.shadow.c
        public float d() {
            return FloatingActionButton.this.L() / 2.0f;
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface d {
    }

    class e<T extends FloatingActionButton> implements d.i {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final k<T> f13495a;

        e(@o0 k<T> kVar) {
            this.f13495a = kVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public void a() {
            this.f13495a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public void b() {
            this.f13495a.a(FloatingActionButton.this);
        }

        public boolean equals(@q0 Object obj) {
            return (obj instanceof e) && ((e) obj).f13495a.equals(this.f13495a);
        }

        public int hashCode() {
            return this.f13495a.hashCode();
        }
    }

    public FloatingActionButton(@o0 Context context) {
        this(context, null);
    }

    private com.google.android.material.floatingactionbutton.d F() {
        if (this.E == null) {
            this.E = x();
        }
        return this.E;
    }

    private int M(int i5) {
        int i6 = this.f13484w;
        if (i6 != 0) {
            return i6;
        }
        Resources resources = getResources();
        return i5 != -1 ? i5 != 1 ? resources.getDimensionPixelSize(a.f.f29494i1) : resources.getDimensionPixelSize(a.f.f29488h1) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < M ? M(1) : M(0);
    }

    private void T(@o0 Rect rect) {
        int i5 = rect.left;
        Rect rect2 = this.A;
        rect.left = i5 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void U() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f13479r;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f13480s;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(androidx.appcompat.widget.f.e(colorForState, mode));
    }

    private static int Y(int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i5, size);
        }
        if (mode == 0) {
            return i5;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    @q0
    private d.j u0(@q0 b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    @o0
    private com.google.android.material.floatingactionbutton.d x() {
        return new com.google.android.material.floatingactionbutton.e(this, new c());
    }

    public float A() {
        return F().t();
    }

    @q0
    public Drawable B() {
        return F().k();
    }

    @Deprecated
    public boolean C(@o0 Rect rect) {
        if (!y1.U0(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        T(rect);
        return true;
    }

    @u0
    public int D() {
        return this.f13484w;
    }

    @q0
    public com.google.android.material.animation.h E() {
        return F().p();
    }

    public void G(@o0 Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        T(rect);
    }

    @l
    @Deprecated
    public int H() {
        ColorStateList colorStateList = this.f13481t;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @q0
    public ColorStateList I() {
        return this.f13481t;
    }

    @q0
    public com.google.android.material.animation.h J() {
        return F().v();
    }

    public int K() {
        return this.f13483v;
    }

    int L() {
        return M(this.f13483v);
    }

    public boolean N() {
        return this.f13487z;
    }

    public void O() {
        P(null);
    }

    public void P(@q0 b bVar) {
        Q(bVar, true);
    }

    void Q(@q0 b bVar, boolean z5) {
        F().w(u0(bVar), z5);
    }

    public boolean R() {
        return F().y();
    }

    public boolean S() {
        return F().z();
    }

    public void V(@o0 Animator.AnimatorListener animatorListener) {
        F().K(animatorListener);
    }

    public void W(@o0 Animator.AnimatorListener animatorListener) {
        F().L(animatorListener);
    }

    public void X(@o0 k<? extends FloatingActionButton> kVar) {
        F().M(new e(kVar));
    }

    public void Z(float f6) {
        F().Q(f6);
    }

    @Override // androidx.core.widget.g0
    @q0
    public ColorStateList a() {
        return this.f13479r;
    }

    public void a0(@q int i5) {
        Z(getResources().getDimension(i5));
    }

    @Override // t1.a
    public void b(@d0 int i5) {
        this.D.g(i5);
    }

    public void b0(float f6) {
        F().T(f6);
    }

    @Override // androidx.core.widget.g0
    @q0
    public PorterDuff.Mode c() {
        return this.f13480s;
    }

    public void c0(@q int i5) {
        b0(getResources().getDimension(i5));
    }

    @Override // androidx.core.widget.g0
    public void d(@q0 ColorStateList colorStateList) {
        if (this.f13479r != colorStateList) {
            this.f13479r = colorStateList;
            U();
        }
    }

    public void d0(float f6) {
        F().X(f6);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        F().E(getDrawableState());
    }

    @Override // androidx.core.view.v1
    @q0
    public ColorStateList e() {
        return getBackgroundTintList();
    }

    public void e0(@q int i5) {
        d0(getResources().getDimension(i5));
    }

    @Override // t1.a
    public int f() {
        return this.D.b();
    }

    public void f0(@u0 int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("⛱"));
        }
        if (i5 != this.f13484w) {
            this.f13484w = i5;
            requestLayout();
        }
    }

    @Override // com.google.android.material.shape.s
    public void g(@o0 o oVar) {
        F().a0(oVar);
    }

    public void g0(boolean z5) {
        if (z5 != F().o()) {
            F().R(z5);
            requestLayout();
        }
    }

    @Override // android.view.View
    @q0
    public ColorStateList getBackgroundTintList() {
        return this.f13477p;
    }

    @Override // android.view.View
    @q0
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f13478q;
    }

    @Override // t1.b
    public boolean h(boolean z5) {
        return this.D.f(z5);
    }

    public void h0(@q0 com.google.android.material.animation.h hVar) {
        F().S(hVar);
    }

    @Override // androidx.core.widget.g0
    public void i(@q0 PorterDuff.Mode mode) {
        if (this.f13480s != mode) {
            this.f13480s = mode;
            U();
        }
    }

    public void i0(@androidx.annotation.b int i5) {
        h0(com.google.android.material.animation.h.d(getContext(), i5));
    }

    @Override // androidx.core.view.v1
    @q0
    public PorterDuff.Mode j() {
        return getBackgroundTintMode();
    }

    public void j0(@l int i5) {
        k0(ColorStateList.valueOf(i5));
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        F().A();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @o0
    public CoordinatorLayout.Behavior<FloatingActionButton> k() {
        return new Behavior();
    }

    public void k0(@q0 ColorStateList colorStateList) {
        if (this.f13481t != colorStateList) {
            this.f13481t = colorStateList;
            F().Y(this.f13481t);
        }
    }

    @Override // com.google.android.material.shape.s
    @o0
    public o l() {
        o u5 = F().u();
        u5.getClass();
        return u5;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @m1
    public void l0(boolean z5) {
        F().Z(z5);
    }

    @Override // androidx.core.view.v1
    public void m(@q0 ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void m0(@q0 com.google.android.material.animation.h hVar) {
        F().b0(hVar);
    }

    @Override // t1.b
    public boolean n() {
        return this.D.c();
    }

    public void n0(@androidx.annotation.b int i5) {
        m0(com.google.android.material.animation.h.d(getContext(), i5));
    }

    @Override // androidx.core.view.v1
    public void o(@q0 PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void o0(int i5) {
        this.f13484w = 0;
        if (i5 != this.f13483v) {
            this.f13483v = i5;
            requestLayout();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        F().B();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        F().D();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i5, int i6) {
        int L2 = L();
        this.f13485x = (L2 - this.f13486y) / 2;
        F().i0();
        int min = Math.min(Y(L2, i5), Y(L2, i6));
        Rect rect = this.A;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.a());
        t1.c cVar = this.D;
        Bundle bundle = extendableSavedState.f14272q.get(ProtectedSandApp.s("⛲"));
        bundle.getClass();
        cVar.d(bundle);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        extendableSavedState.f14272q.put(ProtectedSandApp.s("⛳"), this.D.e());
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@o0 MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && C(this.B) && !this.B.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void p0(boolean z5) {
        if (this.f13487z != z5) {
            this.f13487z = z5;
            F().C();
        }
    }

    public boolean q0() {
        return F().o();
    }

    public void r0() {
        s0(null);
    }

    public void s0(@q0 b bVar) {
        t0(bVar, true);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i5) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(@q0 ColorStateList colorStateList) {
        if (this.f13477p != colorStateList) {
            this.f13477p = colorStateList;
            F().O(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@q0 PorterDuff.Mode mode) {
        if (this.f13478q != mode) {
            this.f13478q = mode;
            F().P(mode);
        }
    }

    @Override // android.view.View
    @x0(21)
    public void setElevation(float f6) {
        super.setElevation(f6);
        F().j0(f6);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@q0 Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            F().h0();
            if (this.f13479r != null) {
                U();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@v int i5) {
        this.C.g(i5);
        U();
    }

    @Override // android.view.View
    public void setScaleX(float f6) {
        super.setScaleX(f6);
        F().I();
    }

    @Override // android.view.View
    public void setScaleY(float f6) {
        super.setScaleY(f6);
        F().I();
    }

    @Override // android.view.View
    public void setTranslationX(float f6) {
        super.setTranslationX(f6);
        F().J();
    }

    @Override // android.view.View
    public void setTranslationY(float f6) {
        super.setTranslationY(f6);
        F().J();
    }

    @Override // android.view.View
    public void setTranslationZ(float f6) {
        super.setTranslationZ(f6);
        F().J();
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i5) {
        q(i5, true);
    }

    public void t(@o0 Animator.AnimatorListener animatorListener) {
        F().d(animatorListener);
    }

    void t0(@q0 b bVar, boolean z5) {
        F().f0(u0(bVar), z5);
    }

    public void u(@o0 Animator.AnimatorListener animatorListener) {
        F().e(animatorListener);
    }

    public void v(@o0 k<? extends FloatingActionButton> kVar) {
        F().f(new e(kVar));
    }

    public void w() {
        f0(0);
    }

    public float y() {
        return F().n();
    }

    public float z() {
        return F().q();
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: d, reason: collision with root package name */
        private static final boolean f13488d = true;

        /* renamed from: a, reason: collision with root package name */
        private Rect f13489a;

        /* renamed from: b, reason: collision with root package name */
        private b f13490b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f13491c;

        public BaseBehavior() {
            this.f13491c = f13488d;
        }

        private static boolean I(@o0 View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void J(@o0 CoordinatorLayout coordinatorLayout, @o0 FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.A;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            int i5 = 0;
            int i6 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i5 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i5 = -rect.top;
            }
            if (i5 != 0) {
                y1.f1(floatingActionButton, i5);
            }
            if (i6 != 0) {
                y1.e1(floatingActionButton, i6);
            }
        }

        private boolean O(@o0 View view, @o0 FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (this.f13491c && fVar.e() == view.getId() && floatingActionButton.p() == 0) {
                return f13488d;
            }
            return false;
        }

        private boolean P(CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout, @o0 FloatingActionButton floatingActionButton) {
            if (!O(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f13489a == null) {
                this.f13489a = new Rect();
            }
            Rect rect = this.f13489a;
            com.google.android.material.internal.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.l()) {
                floatingActionButton.Q(this.f13490b, false);
                return f13488d;
            }
            floatingActionButton.t0(this.f13490b, false);
            return f13488d;
        }

        private boolean Q(@o0 View view, @o0 FloatingActionButton floatingActionButton) {
            if (!O(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.Q(this.f13490b, false);
                return f13488d;
            }
            floatingActionButton.t0(this.f13490b, false);
            return f13488d;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public boolean b(@o0 CoordinatorLayout coordinatorLayout, @o0 FloatingActionButton floatingActionButton, @o0 Rect rect) {
            Rect rect2 = floatingActionButton.A;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return f13488d;
        }

        public boolean H() {
            return this.f13491c;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public boolean i(CoordinatorLayout coordinatorLayout, @o0 FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                P(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!I(view)) {
                return false;
            }
            Q(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public boolean m(@o0 CoordinatorLayout coordinatorLayout, @o0 FloatingActionButton floatingActionButton, int i5) {
            List<View> C = coordinatorLayout.C(floatingActionButton);
            int size = C.size();
            for (int i6 = 0; i6 < size; i6++) {
                View view = C.get(i6);
                if (!(view instanceof AppBarLayout)) {
                    if (I(view) && Q(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (P(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.W(floatingActionButton, i5);
            J(coordinatorLayout, floatingActionButton);
            return f13488d;
        }

        public void M(boolean z5) {
            this.f13491c = z5;
        }

        @m1
        public void N(b bVar) {
            this.f13490b = bVar;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void h(@o0 CoordinatorLayout.f fVar) {
            if (fVar.f3934h == 0) {
                fVar.f3934h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.pe);
            this.f13491c = obtainStyledAttributes.getBoolean(a.o.qe, f13488d);
            obtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.A5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FloatingActionButton(@androidx.annotation.o0 android.content.Context r11, @androidx.annotation.q0 android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
