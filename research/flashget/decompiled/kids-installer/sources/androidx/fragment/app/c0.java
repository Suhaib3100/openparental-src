package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.t;
import androidx.annotation.q0;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* compiled from: FragmentStatePagerAdapter.java */
@Deprecated
/* loaded from: classes3.dex */
public abstract class c0 extends androidx.viewpager.widget.a {

    /* renamed from: l, reason: collision with root package name */
    private static final String f8211l = "FragmentStatePagerAdapt";

    /* renamed from: m, reason: collision with root package name */
    private static final boolean f8212m = false;

    /* renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final int f8213n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f8214o = 1;

    /* renamed from: e, reason: collision with root package name */
    private final FragmentManager f8215e;

    /* renamed from: f, reason: collision with root package name */
    private final int f8216f;

    /* renamed from: g, reason: collision with root package name */
    private f0 f8217g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<Fragment.SavedState> f8218h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList<Fragment> f8219i;

    /* renamed from: j, reason: collision with root package name */
    private Fragment f8220j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8221k;

    @Deprecated
    public c0(@androidx.annotation.o0 FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    @Override // androidx.viewpager.widget.a
    public void e(@androidx.annotation.o0 ViewGroup viewGroup, int i5, @androidx.annotation.o0 Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f8217g == null) {
            this.f8217g = this.f8215e.u();
        }
        while (this.f8218h.size() <= i5) {
            this.f8218h.add(null);
        }
        this.f8218h.set(i5, fragment.isAdded() ? this.f8215e.S1(fragment) : null);
        this.f8219i.set(i5, null);
        this.f8217g.x(fragment);
        if (fragment.equals(this.f8220j)) {
            this.f8220j = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void g(@androidx.annotation.o0 ViewGroup viewGroup) {
        f0 f0Var = this.f8217g;
        if (f0Var != null) {
            if (!this.f8221k) {
                try {
                    this.f8221k = true;
                    f0Var.p();
                } finally {
                    this.f8221k = false;
                }
            }
            this.f8217g = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    @androidx.annotation.o0
    public Object m(@androidx.annotation.o0 ViewGroup viewGroup, int i5) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f8219i.size() > i5 && (fragment = this.f8219i.get(i5)) != null) {
            return fragment;
        }
        if (this.f8217g == null) {
            this.f8217g = this.f8215e.u();
        }
        Fragment y5 = y(i5);
        if (this.f8218h.size() > i5 && (savedState = this.f8218h.get(i5)) != null) {
            y5.setInitialSavedState(savedState);
        }
        while (this.f8219i.size() <= i5) {
            this.f8219i.add(null);
        }
        y5.setMenuVisibility(false);
        if (this.f8216f == 0) {
            y5.setUserVisibleHint(false);
        }
        this.f8219i.set(i5, y5);
        this.f8217g.b(viewGroup.getId(), y5);
        if (this.f8216f == 1) {
            this.f8217g.K(y5, t.c.STARTED);
        }
        return y5;
    }

    @Override // androidx.viewpager.widget.a
    public boolean n(@androidx.annotation.o0 View view, @androidx.annotation.o0 Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.a
    public void q(@q0 Parcelable parcelable, @q0 ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f8218h.clear();
            this.f8219i.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f8218h.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment E0 = this.f8215e.E0(bundle, str);
                    if (E0 != null) {
                        while (this.f8219i.size() <= parseInt) {
                            this.f8219i.add(null);
                        }
                        E0.setMenuVisibility(false);
                        this.f8219i.set(parseInt, E0);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.a
    @q0
    public Parcelable r() {
        Bundle bundle;
        if (this.f8218h.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f8218h.size()];
            this.f8218h.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i5 = 0; i5 < this.f8219i.size(); i5++) {
            Fragment fragment = this.f8219i.get(i5);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f8215e.z1(bundle, androidx.appcompat.view.menu.s.a("f", i5), fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.a
    public void t(@androidx.annotation.o0 ViewGroup viewGroup, int i5, @androidx.annotation.o0 Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f8220j;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f8216f == 1) {
                    if (this.f8217g == null) {
                        this.f8217g = this.f8215e.u();
                    }
                    this.f8217g.K(this.f8220j, t.c.STARTED);
                } else {
                    this.f8220j.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f8216f == 1) {
                if (this.f8217g == null) {
                    this.f8217g = this.f8215e.u();
                }
                this.f8217g.K(fragment, t.c.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f8220j = fragment;
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

    public c0(@androidx.annotation.o0 FragmentManager fragmentManager, int i5) {
        this.f8217g = null;
        this.f8218h = new ArrayList<>();
        this.f8219i = new ArrayList<>();
        this.f8220j = null;
        this.f8215e = fragmentManager;
        this.f8216f = i5;
    }
}
