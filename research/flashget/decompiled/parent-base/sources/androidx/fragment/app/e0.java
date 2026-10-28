package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.view.AbstractC1450w;

/* compiled from: FragmentPagerAdapter.java */
@Deprecated
/* loaded from: classes3.dex */
public abstract class e0 extends androidx.viewpager.widget.a {

    /* renamed from: j, reason: collision with root package name */
    private static final String f29934j = "FragmentPagerAdapter";

    /* renamed from: k, reason: collision with root package name */
    private static final boolean f29935k = false;

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final int f29936l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f29937m = 1;

    /* renamed from: e, reason: collision with root package name */
    private final FragmentManager f29938e;

    /* renamed from: f, reason: collision with root package name */
    private final int f29939f;

    /* renamed from: g, reason: collision with root package name */
    private l0 f29940g;

    /* renamed from: h, reason: collision with root package name */
    private Fragment f29941h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f29942i;

    @Deprecated
    public e0(@androidx.annotation.o0 FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    private static String A(int i4, long j4) {
        return "android:switcher:" + i4 + ":" + j4;
    }

    @Override // androidx.viewpager.widget.a
    public void e(@androidx.annotation.o0 ViewGroup viewGroup, int i4, @androidx.annotation.o0 Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f29940g == null) {
            this.f29940g = this.f29938e.u();
        }
        this.f29940g.w(fragment);
        if (fragment.equals(this.f29941h)) {
            this.f29941h = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void g(@androidx.annotation.o0 ViewGroup viewGroup) {
        l0 l0Var = this.f29940g;
        if (l0Var != null) {
            if (!this.f29942i) {
                try {
                    this.f29942i = true;
                    l0Var.u();
                } finally {
                    this.f29942i = false;
                }
            }
            this.f29940g = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    @androidx.annotation.o0
    public Object m(@androidx.annotation.o0 ViewGroup viewGroup, int i4) {
        if (this.f29940g == null) {
            this.f29940g = this.f29938e.u();
        }
        long z4 = z(i4);
        Fragment s02 = this.f29938e.s0(A(viewGroup.getId(), z4));
        if (s02 != null) {
            this.f29940g.q(s02);
        } else {
            s02 = y(i4);
            this.f29940g.h(viewGroup.getId(), s02, A(viewGroup.getId(), z4));
        }
        if (s02 != this.f29941h) {
            s02.setMenuVisibility(false);
            if (this.f29939f == 1) {
                this.f29940g.P(s02, AbstractC1450w.b.STARTED);
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
    public void q(@androidx.annotation.q0 Parcelable parcelable, @androidx.annotation.q0 ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.a
    @androidx.annotation.q0
    public Parcelable r() {
        return null;
    }

    @Override // androidx.viewpager.widget.a
    public void t(@androidx.annotation.o0 ViewGroup viewGroup, int i4, @androidx.annotation.o0 Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f29941h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f29939f == 1) {
                    if (this.f29940g == null) {
                        this.f29940g = this.f29938e.u();
                    }
                    this.f29940g.P(this.f29941h, AbstractC1450w.b.STARTED);
                } else {
                    this.f29941h.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f29939f == 1) {
                if (this.f29940g == null) {
                    this.f29940g = this.f29938e.u();
                }
                this.f29940g.P(fragment, AbstractC1450w.b.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f29941h = fragment;
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
    public abstract Fragment y(int i4);

    public long z(int i4) {
        return i4;
    }

    public e0(@androidx.annotation.o0 FragmentManager fragmentManager, int i4) {
        this.f29940g = null;
        this.f29941h = null;
        this.f29938e = fragmentManager;
        this.f29939f = i4;
    }
}
