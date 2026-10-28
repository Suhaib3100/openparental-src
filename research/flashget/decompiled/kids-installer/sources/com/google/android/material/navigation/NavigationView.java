package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.c1;
import androidx.annotation.d0;
import androidx.annotation.h1;
import androidx.annotation.j0;
import androidx.annotation.o0;
import androidx.annotation.q;
import androidx.annotation.q0;
import androidx.annotation.r;
import androidx.annotation.v;
import androidx.appcompat.view.h;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.z0;
import androidx.core.content.d;
import androidx.core.view.v4;
import androidx.customview.view.AbsSavedState;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.f;
import com.google.android.material.internal.g;
import com.google.android.material.shape.j;
import com.google.android.material.shape.k;
import com.google.android.material.shape.o;
import d.a;
import n1.a;

/* loaded from: classes3.dex */
public class NavigationView extends ScrimInsetsFrameLayout {
    private static final int[] A = {R.attr.state_checked};
    private static final int[] B = {-16842910};
    private static final int C = a.n.xa;
    private static final int D = 1;

    /* renamed from: t, reason: collision with root package name */
    @o0
    private final f f13769t;

    /* renamed from: u, reason: collision with root package name */
    private final g f13770u;

    /* renamed from: v, reason: collision with root package name */
    c f13771v;

    /* renamed from: w, reason: collision with root package name */
    private final int f13772w;

    /* renamed from: x, reason: collision with root package name */
    private final int[] f13773x;

    /* renamed from: y, reason: collision with root package name */
    private MenuInflater f13774y;

    /* renamed from: z, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f13775z;

    class a implements g.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            c cVar = NavigationView.this.f13771v;
            return cVar != null && cVar.a(menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
        }
    }

    /* loaded from: classes2.dex */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f13773x);
            boolean z5 = NavigationView.this.f13773x[1] == 0;
            NavigationView.this.f13770u.A(z5);
            NavigationView.this.c(z5);
            Activity a6 = com.google.android.material.internal.b.a(NavigationView.this.getContext());
            if (a6 != null) {
                NavigationView.this.b((a6.findViewById(R.id.content).getHeight() == NavigationView.this.getHeight()) && (Color.alpha(a6.getWindow().getNavigationBarColor()) != 0));
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        boolean a(@o0 MenuItem menuItem);
    }

    public NavigationView(@o0 Context context) {
        this(context, null);
    }

    private void M() {
        this.f13775z = new b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f13775z);
    }

    @q0
    private ColorStateList h(int i5) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i5, typedValue, true)) {
            return null;
        }
        ColorStateList c6 = androidx.appcompat.content.res.a.c(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(a.c.H0, typedValue, true)) {
            return null;
        }
        int i6 = typedValue.data;
        int defaultColor = c6.getDefaultColor();
        int[] iArr = B;
        return new ColorStateList(new int[][]{iArr, A, FrameLayout.EMPTY_STATE_SET}, new int[]{c6.getColorForState(iArr, defaultColor), i6, defaultColor});
    }

    @o0
    private final Drawable i(@o0 z0 z0Var) {
        j jVar = new j(o.b(getContext(), z0Var.u(a.o.Em, 0), z0Var.u(a.o.Fm, 0)).m());
        jVar.p0(com.google.android.material.resources.c.b(getContext(), z0Var, a.o.Gm));
        return new InsetDrawable((Drawable) jVar, z0Var.g(a.o.Jm, 0), z0Var.g(a.o.Km, 0), z0Var.g(a.o.Im, 0), z0Var.g(a.o.Hm, 0));
    }

    private MenuInflater t() {
        if (this.f13774y == null) {
            this.f13774y = new h(getContext());
        }
        return this.f13774y;
    }

    private boolean u(@o0 z0 z0Var) {
        return z0Var.C(a.o.Em) || z0Var.C(a.o.Fm);
    }

    public void A(@q0 Drawable drawable) {
        this.f13770u.D(drawable);
    }

    public void B(@v int i5) {
        A(d.i(getContext(), i5));
    }

    public void C(@r int i5) {
        this.f13770u.E(i5);
    }

    public void D(@q int i5) {
        this.f13770u.E(getResources().getDimensionPixelSize(i5));
    }

    public void E(@r int i5) {
        this.f13770u.F(i5);
    }

    public void F(int i5) {
        this.f13770u.F(getResources().getDimensionPixelSize(i5));
    }

    public void G(@r int i5) {
        this.f13770u.G(i5);
    }

    public void H(@q0 ColorStateList colorStateList) {
        this.f13770u.H(colorStateList);
    }

    public void I(int i5) {
        this.f13770u.I(i5);
    }

    public void J(@h1 int i5) {
        this.f13770u.J(i5);
    }

    public void K(@q0 ColorStateList colorStateList) {
        this.f13770u.K(colorStateList);
    }

    public void L(@q0 c cVar) {
        this.f13771v = cVar;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    @c1({c1.a.LIBRARY_GROUP})
    protected void a(@o0 v4 v4Var) {
        this.f13770u.k(v4Var);
    }

    public void g(@o0 View view) {
        this.f13770u.c(view);
    }

    @q0
    public MenuItem j() {
        return this.f13770u.o();
    }

    public int k() {
        return this.f13770u.p();
    }

    public View l(int i5) {
        return this.f13770u.q(i5);
    }

    @q0
    public Drawable m() {
        return this.f13770u.r();
    }

    @r
    public int n() {
        return this.f13770u.s();
    }

    @r
    public int o() {
        return this.f13770u.t();
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.e(this);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f13775z);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i5);
        if (mode == Integer.MIN_VALUE) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i5), this.f13772w), androidx.constraintlayout.solver.widgets.analyzer.b.f2366g);
        } else if (mode == 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(this.f13772w, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g);
        }
        super.onMeasure(i5, i6);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.f13769t.U(savedState.f13776q);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f13776q = bundle;
        this.f13769t.W(bundle);
        return savedState;
    }

    @q0
    public ColorStateList p() {
        return this.f13770u.w();
    }

    public int q() {
        return this.f13770u.u();
    }

    @q0
    public ColorStateList r() {
        return this.f13770u.v();
    }

    @o0
    public Menu s() {
        return this.f13769t;
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        k.d(this, f6);
    }

    @Override // android.view.View
    public void setOverScrollMode(int i5) {
        super.setOverScrollMode(i5);
        com.google.android.material.internal.g gVar = this.f13770u;
        if (gVar != null) {
            gVar.L(i5);
        }
    }

    public View v(@j0 int i5) {
        return this.f13770u.x(i5);
    }

    public void w(int i5) {
        this.f13770u.M(true);
        t().inflate(i5, this.f13769t);
        this.f13770u.M(false);
        this.f13770u.d(false);
    }

    public void x(@o0 View view) {
        this.f13770u.z(view);
    }

    public void y(@d0 int i5) {
        MenuItem findItem = this.f13769t.findItem(i5);
        if (findItem != null) {
            this.f13770u.B((androidx.appcompat.view.menu.j) findItem);
        }
    }

    public void z(@o0 MenuItem menuItem) {
        MenuItem findItem = this.f13769t.findItem(menuItem.getItemId());
        if (findItem == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("✉"));
        }
        this.f13770u.B((androidx.appcompat.view.menu.j) findItem);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: q, reason: collision with root package name */
        @q0
        public Bundle f13776q;

        /* loaded from: classes2.dex */
        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @q0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@o0 Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @o0
            public SavedState b(@o0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @o0
            public SavedState[] c(int i5) {
                return new SavedState[i5];
            }

            @Override // android.os.Parcelable.Creator
            @o0
            public Object[] newArray(int i5) {
                return new SavedState[i5];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @o0
            public SavedState createFromParcel(@o0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(@o0 Parcel parcel, @q0 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13776q = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeBundle(this.f13776q);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.Qa);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NavigationView(@androidx.annotation.o0 android.content.Context r11, @androidx.annotation.q0 android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
