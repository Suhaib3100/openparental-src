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
import androidx.appcompat.view.h;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.z0;
import androidx.core.view.v4;
import androidx.core.view.y1;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.n;
import com.google.android.material.internal.v;
import com.google.android.material.shape.j;
import com.google.android.material.shape.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import n1.a;

/* loaded from: classes2.dex */
public abstract class NavigationBarView extends FrameLayout {

    /* renamed from: v, reason: collision with root package name */
    public static final int f13754v = -1;

    /* renamed from: w, reason: collision with root package name */
    public static final int f13755w = 0;

    /* renamed from: x, reason: collision with root package name */
    public static final int f13756x = 1;

    /* renamed from: y, reason: collision with root package name */
    public static final int f13757y = 2;

    /* renamed from: z, reason: collision with root package name */
    private static final int f13758z = 1;

    /* renamed from: o, reason: collision with root package name */
    @o0
    private final com.google.android.material.navigation.b f13759o;

    /* renamed from: p, reason: collision with root package name */
    @o0
    private final com.google.android.material.navigation.c f13760p;

    /* renamed from: q, reason: collision with root package name */
    @o0
    private final NavigationBarPresenter f13761q;

    /* renamed from: r, reason: collision with root package name */
    @q0
    private ColorStateList f13762r;

    /* renamed from: s, reason: collision with root package name */
    private MenuInflater f13763s;

    /* renamed from: t, reason: collision with root package name */
    private e f13764t;

    /* renamed from: u, reason: collision with root package name */
    private d f13765u;

    /* loaded from: classes3.dex */
    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: q, reason: collision with root package name */
        @q0
        Bundle f13766q;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(@o0 Parcel parcel, ClassLoader classLoader) {
            this.f13766q = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeBundle(this.f13766q);
        }

        public SavedState(@o0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    /* loaded from: classes3.dex */
    class a implements g.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(g gVar, @o0 MenuItem menuItem) {
            if (NavigationBarView.this.f13765u == null || menuItem.getItemId() != NavigationBarView.this.v()) {
                return (NavigationBarView.this.f13764t == null || NavigationBarView.this.f13764t.a(menuItem)) ? false : true;
            }
            NavigationBarView.this.f13765u.a(menuItem);
            return true;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(g gVar) {
        }
    }

    /* loaded from: classes3.dex */
    class b implements v.e {
        b() {
        }

        @Override // com.google.android.material.internal.v.e
        @o0
        public v4 a(View view, @o0 v4 v4Var, @o0 v.f fVar) {
            fVar.f13747d = v4Var.o() + fVar.f13747d;
            boolean z5 = y1.Z(view) == 1;
            int p5 = v4Var.p();
            int q5 = v4Var.q();
            fVar.f13744a += z5 ? q5 : p5;
            int i5 = fVar.f13746c;
            if (!z5) {
                p5 = q5;
            }
            fVar.f13746c = i5 + p5;
            fVar.a(view);
            return v4Var;
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

    public NavigationBarView(@o0 Context context, @q0 AttributeSet attributeSet, @f int i5, @h1 int i6) {
        super(v1.a.c(context, attributeSet, i5, i6), attributeSet, i5);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f13761q = navigationBarPresenter;
        Context context2 = getContext();
        int[] iArr = a.o.dm;
        int i7 = a.o.lm;
        int i8 = a.o.km;
        z0 k5 = n.k(context2, attributeSet, iArr, i5, i6, i7, i8);
        com.google.android.material.navigation.b bVar = new com.google.android.material.navigation.b(context2, getClass(), p());
        this.f13759o = bVar;
        com.google.android.material.navigation.c e6 = e(context2);
        this.f13760p = e6;
        navigationBarPresenter.c(e6);
        navigationBarPresenter.a(1);
        e6.M(navigationBarPresenter);
        bVar.b(navigationBarPresenter);
        navigationBarPresenter.i(getContext(), bVar);
        int i9 = a.o.im;
        if (k5.C(i9)) {
            e6.D(k5.d(i9));
        } else {
            e6.D(e6.d(R.attr.textColorSecondary));
        }
        A(k5.g(a.o.hm, getResources().getDimensionPixelSize(a.f.f29479f5)));
        if (k5.C(i7)) {
            G(k5.u(i7, 0));
        }
        if (k5.C(i8)) {
            F(k5.u(i8, 0));
        }
        int i10 = a.o.mm;
        if (k5.C(i10)) {
            H(k5.d(i10));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            y1.I1(this, d(context2));
        }
        if (k5.C(a.o.fm)) {
            setElevation(k5.g(r12, 0));
        }
        androidx.core.graphics.drawable.d.o(getBackground().mutate(), com.google.android.material.resources.c.b(context2, k5, a.o.em));
        I(k5.p(a.o.nm, -1));
        int u5 = k5.u(a.o.gm, 0);
        if (u5 != 0) {
            e6.F(u5);
        } else {
            E(com.google.android.material.resources.c.b(context2, k5, a.o.jm));
        }
        int i11 = a.o.om;
        if (k5.C(i11)) {
            w(k5.u(i11, 0));
        }
        k5.I();
        addView(e6);
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
        if (this.f13763s == null) {
            this.f13763s = new h(getContext());
        }
        return this.f13763s;
    }

    public void A(@r int i5) {
        this.f13760p.G(i5);
    }

    public void B(@q int i5) {
        A(getResources().getDimensionPixelSize(i5));
    }

    public void C(@q0 ColorStateList colorStateList) {
        this.f13760p.D(colorStateList);
    }

    public void D(int i5, @q0 View.OnTouchListener onTouchListener) {
        this.f13760p.H(i5, onTouchListener);
    }

    public void E(@q0 ColorStateList colorStateList) {
        if (this.f13762r == colorStateList) {
            if (colorStateList != null || this.f13760p.l() == null) {
                return;
            }
            this.f13760p.E(null);
            return;
        }
        this.f13762r = colorStateList;
        if (colorStateList == null) {
            this.f13760p.E(null);
        } else {
            this.f13760p.E(new RippleDrawable(com.google.android.material.ripple.b.a(colorStateList), null, null));
        }
    }

    public void F(@h1 int i5) {
        this.f13760p.I(i5);
    }

    public void G(@h1 int i5) {
        this.f13760p.J(i5);
    }

    public void H(@q0 ColorStateList colorStateList) {
        this.f13760p.K(colorStateList);
    }

    public void I(int i5) {
        if (this.f13760p.r() != i5) {
            this.f13760p.L(i5);
            this.f13761q.d(false);
        }
    }

    public void J(@q0 d dVar) {
        this.f13765u = dVar;
    }

    public void K(@q0 e eVar) {
        this.f13764t = eVar;
    }

    public void L(@d0 int i5) {
        MenuItem findItem = this.f13759o.findItem(i5);
        if (findItem == null || this.f13759o.P(findItem, this.f13761q, 0)) {
            return;
        }
        findItem.setChecked(true);
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    protected abstract com.google.android.material.navigation.c e(@o0 Context context);

    @q0
    public BadgeDrawable f(int i5) {
        return this.f13760p.i(i5);
    }

    @q0
    public Drawable g() {
        return this.f13760p.l();
    }

    @androidx.annotation.v
    @Deprecated
    public int h() {
        return this.f13760p.m();
    }

    @r
    public int i() {
        return this.f13760p.n();
    }

    @q0
    public ColorStateList j() {
        return this.f13760p.k();
    }

    @q0
    public ColorStateList k() {
        return this.f13762r;
    }

    @h1
    public int l() {
        return this.f13760p.o();
    }

    @h1
    public int m() {
        return this.f13760p.p();
    }

    @q0
    public ColorStateList n() {
        return this.f13760p.q();
    }

    public int o() {
        return this.f13760p.r();
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
        this.f13759o.U(savedState.f13766q);
    }

    @Override // android.view.View
    @o0
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f13766q = bundle;
        this.f13759o.W(bundle);
        return savedState;
    }

    public abstract int p();

    @o0
    public Menu q() {
        return this.f13759o;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public o s() {
        return this.f13760p;
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        k.d(this, f6);
    }

    @o0
    public BadgeDrawable t(int i5) {
        return this.f13760p.u(i5);
    }

    @o0
    protected NavigationBarPresenter u() {
        return this.f13761q;
    }

    @d0
    public int v() {
        return this.f13760p.v();
    }

    public void w(int i5) {
        this.f13761q.k(true);
        r().inflate(i5, this.f13759o);
        this.f13761q.k(false);
        this.f13761q.d(true);
    }

    public void x(int i5) {
        this.f13760p.z(i5);
    }

    public void y(@q0 Drawable drawable) {
        this.f13760p.E(drawable);
        this.f13762r = null;
    }

    public void z(@androidx.annotation.v int i5) {
        this.f13760p.F(i5);
        this.f13762r = null;
    }
}
