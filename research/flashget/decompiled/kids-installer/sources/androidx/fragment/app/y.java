package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.t;
import androidx.annotation.q0;

/* compiled from: FragmentPagerAdapter.java */
@Deprecated
/* loaded from: classes3.dex */
public abstract class y extends androidx.viewpager.widget.a {

    /* renamed from: j, reason: collision with root package name */
    private static final String f8377j = "FragmentPagerAdapter";

    /* renamed from: k, reason: collision with root package name */
    private static final boolean f8378k = false;

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final int f8379l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f8380m = 1;

    /* renamed from: e, reason: collision with root package name */
    private final FragmentManager f8381e;

    /* renamed from: f, reason: collision with root package name */
    private final int f8382f;

    /* renamed from: g, reason: collision with root package name */
    private f0 f8383g;

    /* renamed from: h, reason: collision with root package name */
    private Fragment f8384h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8385i;

    @Deprecated
    public y(@androidx.annotation.o0 FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    private static String A(int i5, long j5) {
        return "android:switcher:" + i5 + ":" + j5;
    }

    @Override // androidx.viewpager.widget.a
    public void e(@androidx.annotation.o0 ViewGroup viewGroup, int i5, @androidx.annotation.o0 Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f8383g == null) {
            this.f8383g = this.f8381e.u();
        }
        this.f8383g.r(fragment);
        if (fragment.equals(this.f8384h)) {
            this.f8384h = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void g(@androidx.annotation.o0 ViewGroup viewGroup) {
        f0 f0Var = this.f8383g;
        if (f0Var != null) {
            if (!this.f8385i) {
                try {
                    this.f8385i = true;
                    f0Var.p();
                } finally {
                    this.f8385i = false;
                }
            }
            this.f8383g = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    @androidx.annotation.o0
    public Object m(@androidx.annotation.o0 ViewGroup viewGroup, int i5) {
        if (this.f8383g == null) {
            this.f8383g = this.f8381e.u();
        }
        long z5 = z(i5);
        Fragment s02 = this.f8381e.s0(A(viewGroup.getId(), z5));
        if (s02 != null) {
            this.f8383g.l(s02);
        } else {
            s02 = y(i5);
            this.f8383g.c(viewGroup.getId(), s02, A(viewGroup.getId(), z5));
        }
        if (s02 != this.f8384h) {
            s02.setMenuVisibility(false);
            if (this.f8382f == 1) {
                this.f8383g.K(s02, t.c.STARTED);
            } else {
                s02.setUserVisibleHint(false);
            }
        }
        return s02;
    }

    @Override // androidx.viewpager.widget.a
    public boolean n(@androidx.annotation.o0 View view, @androidx.annotation.o0 Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.a
    public void q(@q0 Parcelable parcelable, @q0 ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.a
    @q0
    public Parcelable r() {
        return null;
    }

    @Override // androidx.viewpager.widget.a
    public void t(@androidx.annotation.o0 ViewGroup viewGroup, int i5, @androidx.annotation.o0 Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f8384h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f8382f == 1) {
                    if (this.f8383g == null) {
                        this.f8383g = this.f8381e.u();
                    }
                    this.f8383g.K(this.f8384h, t.c.STARTED);
                } else {
                    this.f8384h.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f8382f == 1) {
                if (this.f8383g == null) {
                    this.f8383g = this.f8381e.u();
                }
                this.f8383g.K(fragment, t.c.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f8384h = fragment;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void w(@androidx.annotation.o0 ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @androidx.annotation.o0
    public abstract Fragment y(int i5);

    public long z(int i5) {
        return i5;
    }

    public y(@androidx.annotation.o0 FragmentManager fragmentManager, int i5) {
        this.f8383g = null;
        this.f8384h = null;
        this.f8381e = fragmentManager;
        this.f8382f = i5;
    }
}
