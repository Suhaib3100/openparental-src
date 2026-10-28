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
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q;
import androidx.annotation.q0;
import androidx.annotation.u0;
import androidx.annotation.v;
import androidx.annotation.x0;
import androidx.appcompat.widget.h;
import androidx.appcompat.widget.l;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.s1;
import androidx.core.view.x1;
import androidx.core.widget.w;
import com.flashget.parentalcontrol.ProtectedSandApp;
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
import s8.a;

/* loaded from: classes6.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements s1, w, y8.a, s, CoordinatorLayout.b {

    /* renamed from: s, reason: collision with root package name */
    private static final String f53245s = ProtectedSandApp.s("\uf1d2");

    /* renamed from: t, reason: collision with root package name */
    private static final String f53246t = ProtectedSandApp.s("\uf1d3");

    /* renamed from: u, reason: collision with root package name */
    private static final int f53247u = a.n.f91474wa;

    /* renamed from: v, reason: collision with root package name */
    public static final int f53248v = 1;

    /* renamed from: w, reason: collision with root package name */
    public static final int f53249w = 0;

    /* renamed from: x, reason: collision with root package name */
    public static final int f53250x = -1;

    /* renamed from: y, reason: collision with root package name */
    public static final int f53251y = 0;

    /* renamed from: z, reason: collision with root package name */
    private static final int f53252z = 470;

    /* renamed from: c, reason: collision with root package name */
    @q0
    private ColorStateList f53253c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    private PorterDuff.Mode f53254d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private ColorStateList f53255e;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private PorterDuff.Mode f53256f;

    /* renamed from: g, reason: collision with root package name */
    @q0
    private ColorStateList f53257g;

    /* renamed from: h, reason: collision with root package name */
    private int f53258h;

    /* renamed from: i, reason: collision with root package name */
    private int f53259i;

    /* renamed from: j, reason: collision with root package name */
    private int f53260j;

    /* renamed from: k, reason: collision with root package name */
    private int f53261k;

    /* renamed from: l, reason: collision with root package name */
    private int f53262l;

    /* renamed from: m, reason: collision with root package name */
    boolean f53263m;

    /* renamed from: n, reason: collision with root package name */
    final Rect f53264n;

    /* renamed from: o, reason: collision with root package name */
    private final Rect f53265o;

    /* renamed from: p, reason: collision with root package name */
    @o0
    private final l f53266p;

    /* renamed from: q, reason: collision with root package name */
    @o0
    private final y8.c f53267q;

    /* renamed from: r, reason: collision with root package name */
    private com.google.android.material.floatingactionbutton.d f53268r;

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
        public /* bridge */ /* synthetic */ boolean m(@o0 CoordinatorLayout coordinatorLayout, @o0 FloatingActionButton floatingActionButton, int i4) {
            return super.m(coordinatorLayout, floatingActionButton, i4);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void M(boolean z4) {
            super.M(z4);
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
        final /* synthetic */ b f53273a;

        a(b bVar) {
            this.f53273a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.j
        public void a() {
            this.f53273a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.d.j
        public void b() {
            this.f53273a.a(FloatingActionButton.this);
        }
    }

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
        public void a(@q0 Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // com.google.android.material.shadow.c
        public void b(int i4, int i5, int i6, int i7) {
            FloatingActionButton.this.f53264n.set(i4, i5, i6, i7);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i4 + floatingActionButton.f53261k, i5 + FloatingActionButton.this.f53261k, i6 + FloatingActionButton.this.f53261k, i7 + FloatingActionButton.this.f53261k);
        }

        @Override // com.google.android.material.shadow.c
        public boolean c() {
            return FloatingActionButton.this.f53263m;
        }

        @Override // com.google.android.material.shadow.c
        public float d() {
            return FloatingActionButton.this.D() / 2.0f;
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    class e<T extends FloatingActionButton> implements d.i {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final k<T> f53276a;

        e(@o0 k<T> kVar) {
            this.f53276a = kVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public void a() {
            this.f53276a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public void b() {
            this.f53276a.a(FloatingActionButton.this);
        }

        public boolean equals(@q0 Object obj) {
            return (obj instanceof e) && ((e) obj).f53276a.equals(this.f53276a);
        }

        public int hashCode() {
            return this.f53276a.hashCode();
        }
    }

    public FloatingActionButton(@o0 Context context) {
        this(context, null);
    }

    private int E(int i4) {
        int i5 = this.f53260j;
        if (i5 != 0) {
            return i5;
        }
        Resources resources = getResources();
        return i4 != -1 ? i4 != 1 ? resources.getDimensionPixelSize(a.f.f90812i1) : resources.getDimensionPixelSize(a.f.f90807h1) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < f53252z ? E(1) : E(0);
    }

    private void L(@o0 Rect rect) {
        int i4 = rect.left;
        Rect rect2 = this.f53264n;
        rect.left = i4 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void M() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f53255e;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f53256f;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(h.e(colorForState, mode));
    }

    private static int Q(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i4, size);
        }
        if (mode == 0) {
            return i4;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    @q0
    private d.j m0(@q0 b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    @o0
    private com.google.android.material.floatingactionbutton.d p() {
        return new com.google.android.material.floatingactionbutton.e(this, new c());
    }

    private com.google.android.material.floatingactionbutton.d x() {
        if (this.f53268r == null) {
            this.f53268r = p();
        }
        return this.f53268r;
    }

    @q0
    public ColorStateList A() {
        return this.f53257g;
    }

    @q0
    public com.google.android.material.animation.h B() {
        return x().v();
    }

    public int C() {
        return this.f53259i;
    }

    int D() {
        return E(this.f53259i);
    }

    public boolean F() {
        return this.f53263m;
    }

    public void G() {
        H(null);
    }

    public void H(@q0 b bVar) {
        I(bVar, true);
    }

    void I(@q0 b bVar, boolean z4) {
        x().w(m0(bVar), z4);
    }

    public boolean J() {
        return x().y();
    }

    public boolean K() {
        return x().z();
    }

    public void N(@o0 Animator.AnimatorListener animatorListener) {
        x().K(animatorListener);
    }

    public void O(@o0 Animator.AnimatorListener animatorListener) {
        x().L(animatorListener);
    }

    public void P(@o0 k<? extends FloatingActionButton> kVar) {
        x().M(new e(kVar));
    }

    public void R(float f4) {
        x().Q(f4);
    }

    public void S(@q int i4) {
        R(getResources().getDimension(i4));
    }

    public void T(float f4) {
        x().T(f4);
    }

    public void U(@q int i4) {
        T(getResources().getDimension(i4));
    }

    public void V(float f4) {
        x().X(f4);
    }

    public void W(@q int i4) {
        V(getResources().getDimension(i4));
    }

    public void X(@u0 int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf1d4"));
        }
        if (i4 != this.f53260j) {
            this.f53260j = i4;
            requestLayout();
        }
    }

    public void Y(boolean z4) {
        if (z4 != x().o()) {
            x().R(z4);
            requestLayout();
        }
    }

    public void Z(@q0 com.google.android.material.animation.h hVar) {
        x().S(hVar);
    }

    @Override // y8.a
    public void a(@d0 int i4) {
        this.f53267q.g(i4);
    }

    public void a0(@androidx.annotation.b int i4) {
        Z(com.google.android.material.animation.h.d(getContext(), i4));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @o0
    public CoordinatorLayout.Behavior<FloatingActionButton> b() {
        return new Behavior();
    }

    public void b0(@androidx.annotation.l int i4) {
        c0(ColorStateList.valueOf(i4));
    }

    @Override // y8.b
    public boolean c(boolean z4) {
        return this.f53267q.f(z4);
    }

    public void c0(@q0 ColorStateList colorStateList) {
        if (this.f53257g != colorStateList) {
            this.f53257g = colorStateList;
            x().Y(this.f53257g);
        }
    }

    @Override // com.google.android.material.shape.s
    public void d(@o0 o oVar) {
        x().a0(oVar);
    }

    @c1({c1.a.LIBRARY_GROUP})
    @m1
    public void d0(boolean z4) {
        x().Z(z4);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        x().E(getDrawableState());
    }

    @Override // com.google.android.material.shape.s
    @o0
    public o e() {
        o oVar = x().f53304a;
        oVar.getClass();
        return oVar;
    }

    public void e0(@q0 com.google.android.material.animation.h hVar) {
        x().b0(hVar);
    }

    @Override // y8.a
    public int f() {
        return this.f53267q.b();
    }

    public void f0(@androidx.annotation.b int i4) {
        e0(com.google.android.material.animation.h.d(getContext(), i4));
    }

    @Override // y8.b
    public boolean g() {
        return this.f53267q.c();
    }

    public void g0(int i4) {
        this.f53260j = 0;
        if (i4 != this.f53259i) {
            this.f53259i = i4;
            requestLayout();
        }
    }

    @Override // android.view.View
    @q0
    public ColorStateList getBackgroundTintList() {
        return this.f53253c;
    }

    @Override // android.view.View
    @q0
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f53254d;
    }

    @Override // androidx.core.view.s1
    @q0
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // androidx.core.view.s1
    @q0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.w
    @q0
    public ColorStateList getSupportImageTintList() {
        return this.f53255e;
    }

    @Override // androidx.core.widget.w
    @q0
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f53256f;
    }

    public void h0(boolean z4) {
        if (this.f53263m != z4) {
            this.f53263m = z4;
            x().C();
        }
    }

    public boolean i0() {
        return x().o();
    }

    public void j0() {
        k0(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        x().A();
    }

    public void k0(@q0 b bVar) {
        l0(bVar, true);
    }

    public void l(@o0 Animator.AnimatorListener animatorListener) {
        x().d(animatorListener);
    }

    void l0(@q0 b bVar, boolean z4) {
        x().f0(m0(bVar), z4);
    }

    public void m(@o0 Animator.AnimatorListener animatorListener) {
        x().e(animatorListener);
    }

    public void n(@o0 k<? extends FloatingActionButton> kVar) {
        x().f(new e(kVar));
    }

    public void o() {
        X(0);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        x().B();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x().D();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i4, int i5) {
        int D = D();
        this.f53261k = (D - this.f53262l) / 2;
        x().i0();
        int min = Math.min(Q(D, i4), Q(D, i5));
        Rect rect = this.f53264n;
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
        y8.c cVar = this.f53267q;
        Bundle bundle = extendableSavedState.f54140d.get(ProtectedSandApp.s("\uf1d3"));
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
        extendableSavedState.f54140d.put(ProtectedSandApp.s("\uf1d3"), this.f53267q.e());
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@o0 MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && u(this.f53265o) && !this.f53265o.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public float q() {
        return x().n();
    }

    public float r() {
        return x().q();
    }

    public float s() {
        return x().t();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(@q0 ColorStateList colorStateList) {
        if (this.f53253c != colorStateList) {
            this.f53253c = colorStateList;
            x().O(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@q0 PorterDuff.Mode mode) {
        if (this.f53254d != mode) {
            this.f53254d = mode;
            x().P(mode);
        }
    }

    @Override // android.view.View
    @x0(21)
    public void setElevation(float f4) {
        super.setElevation(f4);
        x().j0(f4);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@q0 Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            x().h0();
            if (this.f53255e != null) {
                M();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@v int i4) {
        this.f53266p.i(i4);
        M();
    }

    @Override // android.view.View
    public void setScaleX(float f4) {
        super.setScaleX(f4);
        x().I();
    }

    @Override // android.view.View
    public void setScaleY(float f4) {
        super.setScaleY(f4);
        x().I();
    }

    @Override // androidx.core.view.s1
    public void setSupportBackgroundTintList(@q0 ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // androidx.core.view.s1
    public void setSupportBackgroundTintMode(@q0 PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.w
    public void setSupportImageTintList(@q0 ColorStateList colorStateList) {
        if (this.f53255e != colorStateList) {
            this.f53255e = colorStateList;
            M();
        }
    }

    @Override // androidx.core.widget.w
    public void setSupportImageTintMode(@q0 PorterDuff.Mode mode) {
        if (this.f53256f != mode) {
            this.f53256f = mode;
            M();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f4) {
        super.setTranslationX(f4);
        x().J();
    }

    @Override // android.view.View
    public void setTranslationY(float f4) {
        super.setTranslationY(f4);
        x().J();
    }

    @Override // android.view.View
    public void setTranslationZ(float f4) {
        super.setTranslationZ(f4);
        x().J();
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i4) {
        i(i4, true);
    }

    @q0
    public Drawable t() {
        return x().f53308e;
    }

    @Deprecated
    public boolean u(@o0 Rect rect) {
        if (!x1.Y0(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        L(rect);
        return true;
    }

    @u0
    public int v() {
        return this.f53260j;
    }

    @q0
    public com.google.android.material.animation.h w() {
        return x().p();
    }

    public void y(@o0 Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        L(rect);
    }

    @androidx.annotation.l
    @Deprecated
    public int z() {
        ColorStateList colorStateList = this.f53257g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: d, reason: collision with root package name */
        private static final boolean f53269d = true;

        /* renamed from: a, reason: collision with root package name */
        private Rect f53270a;

        /* renamed from: b, reason: collision with root package name */
        private b f53271b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f53272c;

        public BaseBehavior() {
            this.f53272c = true;
        }

        private static boolean I(@o0 View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void J(@o0 CoordinatorLayout coordinatorLayout, @o0 FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f53264n;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            int i4 = 0;
            int i5 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i4 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i4 = -rect.top;
            }
            if (i4 != 0) {
                x1.j1(floatingActionButton, i4);
            }
            if (i5 != 0) {
                x1.i1(floatingActionButton, i5);
            }
        }

        private boolean O(@o0 View view, @o0 FloatingActionButton floatingActionButton) {
            return this.f53272c && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.h() == 0;
        }

        private boolean P(CoordinatorLayout coordinatorLayout, @o0 AppBarLayout appBarLayout, @o0 FloatingActionButton floatingActionButton) {
            if (!O(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f53270a == null) {
                this.f53270a = new Rect();
            }
            Rect rect = this.f53270a;
            com.google.android.material.internal.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.l()) {
                floatingActionButton.I(this.f53271b, false);
                return true;
            }
            floatingActionButton.l0(this.f53271b, false);
            return true;
        }

        private boolean Q(@o0 View view, @o0 FloatingActionButton floatingActionButton) {
            if (!O(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.I(this.f53271b, false);
                return true;
            }
            floatingActionButton.l0(this.f53271b, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public boolean b(@o0 CoordinatorLayout coordinatorLayout, @o0 FloatingActionButton floatingActionButton, @o0 Rect rect) {
            Rect rect2 = floatingActionButton.f53264n;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public boolean H() {
            return this.f53272c;
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
        public boolean m(@o0 CoordinatorLayout coordinatorLayout, @o0 FloatingActionButton floatingActionButton, int i4) {
            List<View> z4 = coordinatorLayout.z(floatingActionButton);
            int size = z4.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = z4.get(i5);
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
            coordinatorLayout.T(floatingActionButton, i4);
            J(coordinatorLayout, floatingActionButton);
            return true;
        }

        public void M(boolean z4) {
            this.f53272c = z4;
        }

        @m1
        public void N(b bVar) {
            this.f53271b = bVar;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void h(@o0 CoordinatorLayout.f fVar) {
            if (fVar.f25336h == 0) {
                fVar.f25336h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.f91701of);
            this.f53272c = obtainStyledAttributes.getBoolean(a.o.f91715pf, true);
            obtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.z5);
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
