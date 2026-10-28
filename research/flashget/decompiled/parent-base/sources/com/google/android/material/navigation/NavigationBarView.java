package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.c1;
import androidx.annotation.d0;
import androidx.annotation.f;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q;
import androidx.annotation.q0;
import androidx.annotation.r;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.t0;
import androidx.core.view.j3;
import androidx.core.view.x1;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.n;
import com.google.android.material.internal.v;
import com.google.android.material.shape.j;
import com.google.android.material.shape.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import s8.a;

/* loaded from: classes6.dex */
public abstract class NavigationBarView extends FrameLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final int f53548i = -1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f53549j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f53550k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f53551l = 2;

    /* renamed from: m, reason: collision with root package name */
    private static final int f53552m = 1;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final com.google.android.material.navigation.b f53553b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final com.google.android.material.navigation.c f53554c;

    /* renamed from: d, reason: collision with root package name */
    @o0
    private final NavigationBarPresenter f53555d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private ColorStateList f53556e;

    /* renamed from: f, reason: collision with root package name */
    private MenuInflater f53557f;

    /* renamed from: g, reason: collision with root package name */
    private e f53558g;

    /* renamed from: h, reason: collision with root package name */
    private d f53559h;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        @q0
        Bundle f53560d;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(@o0 Parcel parcel, ClassLoader classLoader) {
            this.f53560d = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeBundle(this.f53560d);
        }

        public SavedState(@o0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    class a implements h.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.h.a
        public boolean a(h hVar, @o0 MenuItem menuItem) {
            if (NavigationBarView.this.f53559h == null || menuItem.getItemId() != NavigationBarView.this.v()) {
                return (NavigationBarView.this.f53558g == null || NavigationBarView.this.f53558g.a(menuItem)) ? false : true;
            }
            NavigationBarView.this.f53559h.a(menuItem);
            return true;
        }

        @Override // androidx.appcompat.view.menu.h.a
        public void b(h hVar) {
        }
    }

    class b implements v.e {
        b() {
        }

        @Override // com.google.android.material.internal.v.e
        @o0
        public j3 a(View view, @o0 j3 j3Var, @o0 v.f fVar) {
            fVar.f53541d = j3Var.o() + fVar.f53541d;
            boolean z4 = x1.c0(view) == 1;
            int p4 = j3Var.p();
            int q4 = j3Var.q();
            fVar.f53538a += z4 ? q4 : p4;
            int i4 = fVar.f53540c;
            if (!z4) {
                p4 = q4;
            }
            fVar.f53540c = i4 + p4;
            fVar.a(view);
            return j3Var;
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public interface d {
        void a(@o0 MenuItem menuItem);
    }

    public interface e {
        boolean a(@o0 MenuItem menuItem);
    }

    public NavigationBarView(@o0 Context context, @q0 AttributeSet attributeSet, @f int i4, @h1 int i5) {
        super(a9.a.c(context, attributeSet, i4, i5), attributeSet, i4);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f53555d = navigationBarPresenter;
        Context context2 = getContext();
        int[] iArr = a.o.An;
        int i6 = a.o.In;
        int i7 = a.o.Hn;
        t0 k4 = n.k(context2, attributeSet, iArr, i4, i5, i6, i7);
        com.google.android.material.navigation.b bVar = new com.google.android.material.navigation.b(context2, getClass(), p());
        this.f53553b = bVar;
        com.google.android.material.navigation.c e4 = e(context2);
        this.f53554c = e4;
        navigationBarPresenter.c(e4);
        navigationBarPresenter.b(1);
        e4.M(navigationBarPresenter);
        bVar.b(navigationBarPresenter);
        navigationBarPresenter.n(getContext(), bVar);
        int i10 = a.o.Fn;
        if (k4.C(i10)) {
            e4.D(k4.d(i10));
        } else {
            e4.D(e4.f(R.attr.textColorSecondary));
        }
        A(k4.g(a.o.En, getResources().getDimensionPixelSize(a.f.f5)));
        if (k4.C(i6)) {
            G(k4.u(i6, 0));
        }
        if (k4.C(i7)) {
            F(k4.u(i7, 0));
        }
        int i11 = a.o.Jn;
        if (k4.C(i11)) {
            H(k4.d(i11));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            x1.P1(this, d(context2));
        }
        if (k4.C(a.o.Cn)) {
            setElevation(k4.g(r10, 0));
        }
        getBackground().mutate().setTintList(com.google.android.material.resources.c.b(context2, k4, a.o.Bn));
        I(k4.p(a.o.Kn, -1));
        int u4 = k4.u(a.o.Dn, 0);
        if (u4 != 0) {
            e4.F(u4);
        } else {
            E(com.google.android.material.resources.c.b(context2, k4, a.o.Gn));
        }
        int i12 = a.o.Ln;
        if (k4.C(i12)) {
            w(k4.u(i12, 0));
        }
        k4.I();
        addView(e4);
        bVar.X(new a());
        c();
    }

    private void c() {
        v.d(this, new b());
    }

    @o0
    private j d(Context context) {
        j jVar = new j();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            jVar.p0(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        jVar.a0(context);
        return jVar;
    }

    private MenuInflater r() {
        if (this.f53557f == null) {
            this.f53557f = new androidx.appcompat.view.h(getContext());
        }
        return this.f53557f;
    }

    public void A(@r int i4) {
        this.f53554c.G(i4);
    }

    public void B(@q int i4) {
        A(getResources().getDimensionPixelSize(i4));
    }

    public void C(@q0 ColorStateList colorStateList) {
        this.f53554c.D(colorStateList);
    }

    public void D(int i4, @q0 View.OnTouchListener onTouchListener) {
        this.f53554c.H(i4, onTouchListener);
    }

    public void E(@q0 ColorStateList colorStateList) {
        if (this.f53556e == colorStateList) {
            if (colorStateList != null || this.f53554c.l() == null) {
                return;
            }
            this.f53554c.E(null);
            return;
        }
        this.f53556e = colorStateList;
        if (colorStateList == null) {
            this.f53554c.E(null);
        } else {
            this.f53554c.E(new RippleDrawable(com.google.android.material.ripple.b.a(colorStateList), null, null));
        }
    }

    public void F(@h1 int i4) {
        this.f53554c.I(i4);
    }

    public void G(@h1 int i4) {
        this.f53554c.J(i4);
    }

    public void H(@q0 ColorStateList colorStateList) {
        this.f53554c.K(colorStateList);
    }

    public void I(int i4) {
        if (this.f53554c.r() != i4) {
            this.f53554c.L(i4);
            this.f53555d.k(false);
        }
    }

    public void J(@q0 d dVar) {
        this.f53559h = dVar;
    }

    public void K(@q0 e eVar) {
        this.f53558g = eVar;
    }

    public void L(@d0 int i4) {
        MenuItem findItem = this.f53553b.findItem(i4);
        if (findItem == null || this.f53553b.P(findItem, this.f53555d, 0)) {
            return;
        }
        findItem.setChecked(true);
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    protected abstract com.google.android.material.navigation.c e(@o0 Context context);

    @q0
    public BadgeDrawable f(int i4) {
        return this.f53554c.i(i4);
    }

    @q0
    public Drawable g() {
        return this.f53554c.l();
    }

    @androidx.annotation.v
    @Deprecated
    public int h() {
        return this.f53554c.m();
    }

    @r
    public int i() {
        return this.f53554c.n();
    }

    @q0
    public ColorStateList j() {
        return this.f53554c.k();
    }

    @q0
    public ColorStateList k() {
        return this.f53556e;
    }

    @h1
    public int l() {
        return this.f53554c.o();
    }

    @h1
    public int m() {
        return this.f53554c.p();
    }

    @q0
    public ColorStateList n() {
        return this.f53554c.q();
    }

    public int o() {
        return this.f53554c.r();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.e(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(@q0 Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.f53553b.U(savedState.f53560d);
    }

    @Override // android.view.View
    @o0
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f53560d = bundle;
        this.f53553b.W(bundle);
        return savedState;
    }

    public abstract int p();

    @o0
    public Menu q() {
        return this.f53553b;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public p s() {
        return this.f53554c;
    }

    @Override // android.view.View
    public void setElevation(float f4) {
        super.setElevation(f4);
        k.d(this, f4);
    }

    @o0
    public BadgeDrawable t(int i4) {
        return this.f53554c.u(i4);
    }

    @o0
    protected NavigationBarPresenter u() {
        return this.f53555d;
    }

    @d0
    public int v() {
        return this.f53554c.v();
    }

    public void w(int i4) {
        this.f53555d.o(true);
        r().inflate(i4, this.f53553b);
        this.f53555d.o(false);
        this.f53555d.k(true);
    }

    public void x(int i4) {
        this.f53554c.z(i4);
    }

    public void y(@q0 Drawable drawable) {
        this.f53554c.E(drawable);
        this.f53556e = null;
    }

    public void z(@androidx.annotation.v int i4) {
        this.f53554c.F(i4);
        this.f53556e = null;
    }
}
