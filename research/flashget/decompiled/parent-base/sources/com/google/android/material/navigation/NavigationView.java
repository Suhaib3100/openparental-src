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
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.t0;
import androidx.core.content.d;
import androidx.core.view.j3;
import androidx.customview.view.AbsSavedState;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.f;
import com.google.android.material.internal.g;
import com.google.android.material.shape.j;
import com.google.android.material.shape.k;
import com.google.android.material.shape.o;
import d.a;
import s8.a;

/* loaded from: classes6.dex */
public class NavigationView extends ScrimInsetsFrameLayout {

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f53563n = {R.attr.state_checked};

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f53564o = {-16842910};

    /* renamed from: p, reason: collision with root package name */
    private static final int f53565p = a.n.f91483xa;

    /* renamed from: q, reason: collision with root package name */
    private static final int f53566q = 1;

    /* renamed from: g, reason: collision with root package name */
    @o0
    private final f f53567g;

    /* renamed from: h, reason: collision with root package name */
    private final g f53568h;

    /* renamed from: i, reason: collision with root package name */
    c f53569i;

    /* renamed from: j, reason: collision with root package name */
    private final int f53570j;

    /* renamed from: k, reason: collision with root package name */
    private final int[] f53571k;

    /* renamed from: l, reason: collision with root package name */
    private MenuInflater f53572l;

    /* renamed from: m, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f53573m;

    class a implements h.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.h.a
        public boolean a(h hVar, MenuItem menuItem) {
            c cVar = NavigationView.this.f53569i;
            return cVar != null && cVar.a(menuItem);
        }

        @Override // androidx.appcompat.view.menu.h.a
        public void b(h hVar) {
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f53571k);
            boolean z4 = NavigationView.this.f53571k[1] == 0;
            NavigationView.this.f53568h.B(z4);
            NavigationView.this.c(z4);
            Activity a5 = com.google.android.material.internal.b.a(NavigationView.this.getContext());
            if (a5 != null) {
                NavigationView.this.b((a5.findViewById(R.id.content).getHeight() == NavigationView.this.getHeight()) && (Color.alpha(a5.getWindow().getNavigationBarColor()) != 0));
            }
        }
    }

    public interface c {
        boolean a(@o0 MenuItem menuItem);
    }

    public NavigationView(@o0 Context context) {
        this(context, null);
    }

    private void M() {
        this.f53573m = new b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f53573m);
    }

    @q0
    private ColorStateList h(int i4) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i4, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = d.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(a.b.J0, typedValue, true)) {
            return null;
        }
        int i5 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = f53564o;
        return new ColorStateList(new int[][]{iArr, f53563n, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i5, defaultColor});
    }

    @o0
    private final Drawable i(@o0 t0 t0Var) {
        j jVar = new j(o.b(getContext(), t0Var.u(a.o.bo, 0), t0Var.u(a.o.co, 0)).m());
        jVar.p0(com.google.android.material.resources.c.b(getContext(), t0Var, a.o.eo));
        return new InsetDrawable((Drawable) jVar, t0Var.g(a.o.ho, 0), t0Var.g(a.o.f91622io, 0), t0Var.g(a.o.go, 0), t0Var.g(a.o.fo, 0));
    }

    private MenuInflater t() {
        if (this.f53572l == null) {
            this.f53572l = new androidx.appcompat.view.h(getContext());
        }
        return this.f53572l;
    }

    private boolean u(@o0 t0 t0Var) {
        return t0Var.C(a.o.bo) || t0Var.C(a.o.co);
    }

    public void A(@q0 Drawable drawable) {
        this.f53568h.E(drawable);
    }

    public void B(@v int i4) {
        A(d.getDrawable(getContext(), i4));
    }

    public void C(@r int i4) {
        this.f53568h.F(i4);
    }

    public void D(@q int i4) {
        this.f53568h.F(getResources().getDimensionPixelSize(i4));
    }

    public void E(@r int i4) {
        this.f53568h.G(i4);
    }

    public void F(int i4) {
        this.f53568h.G(getResources().getDimensionPixelSize(i4));
    }

    public void G(@r int i4) {
        this.f53568h.H(i4);
    }

    public void H(@q0 ColorStateList colorStateList) {
        this.f53568h.I(colorStateList);
    }

    public void I(int i4) {
        this.f53568h.J(i4);
    }

    public void J(@h1 int i4) {
        this.f53568h.K(i4);
    }

    public void K(@q0 ColorStateList colorStateList) {
        this.f53568h.L(colorStateList);
    }

    public void L(@q0 c cVar) {
        this.f53569i = cVar;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    @c1({c1.a.LIBRARY_GROUP})
    protected void a(@o0 j3 j3Var) {
        this.f53568h.o(j3Var);
    }

    public void g(@o0 View view) {
        this.f53568h.c(view);
    }

    @q0
    public MenuItem j() {
        return this.f53568h.p();
    }

    public int k() {
        return this.f53568h.q();
    }

    public View l(int i4) {
        return this.f53568h.r(i4);
    }

    @q0
    public Drawable m() {
        return this.f53568h.s();
    }

    @r
    public int n() {
        return this.f53568h.t();
    }

    @r
    public int o() {
        return this.f53568h.u();
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.e(this);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f53573m);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        if (mode == Integer.MIN_VALUE) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i4), this.f53570j), 1073741824);
        } else if (mode == 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(this.f53570j, 1073741824);
        }
        super.onMeasure(i4, i5);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.f53567g.U(savedState.f53574d);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f53574d = bundle;
        this.f53567g.W(bundle);
        return savedState;
    }

    @q0
    public ColorStateList p() {
        return this.f53568h.x();
    }

    public int q() {
        return this.f53568h.v();
    }

    @q0
    public ColorStateList r() {
        return this.f53568h.w();
    }

    @o0
    public Menu s() {
        return this.f53567g;
    }

    @Override // android.view.View
    public void setElevation(float f4) {
        super.setElevation(f4);
        k.d(this, f4);
    }

    @Override // android.view.View
    public void setOverScrollMode(int i4) {
        super.setOverScrollMode(i4);
        g gVar = this.f53568h;
        if (gVar != null) {
            gVar.M(i4);
        }
    }

    public View v(@j0 int i4) {
        return this.f53568h.y(i4);
    }

    public void w(int i4) {
        this.f53568h.N(true);
        t().inflate(i4, this.f53567g);
        this.f53568h.N(false);
        this.f53568h.k(false);
    }

    public void x(@o0 View view) {
        this.f53568h.A(view);
    }

    public void y(@d0 int i4) {
        MenuItem findItem = this.f53567g.findItem(i4);
        if (findItem != null) {
            this.f53568h.C((androidx.appcompat.view.menu.k) findItem);
        }
    }

    public void z(@o0 MenuItem menuItem) {
        MenuItem findItem = this.f53567g.findItem(menuItem.getItemId());
        if (findItem == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf1f3"));
        }
        this.f53568h.C((androidx.appcompat.view.menu.k) findItem);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        @q0
        public Bundle f53574d;

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
            public SavedState[] c(int i4) {
                return new SavedState[i4];
            }

            @Override // android.os.Parcelable.Creator
            @o0
            public Object[] newArray(int i4) {
                return new SavedState[i4];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @o0
            public SavedState createFromParcel(@o0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(@o0 Parcel parcel, @q0 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f53574d = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeBundle(this.f53574d);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.Pa);
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
