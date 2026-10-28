package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.AbstractC1450w;
import java.util.ArrayList;

/* compiled from: FragmentStatePagerAdapter.java */
@Deprecated
/* loaded from: classes3.dex */
public abstract class i0 extends androidx.viewpager.widget.a {

    /* renamed from: l, reason: collision with root package name */
    private static final String f29960l = "FragmentStatePagerAdapt";

    /* renamed from: m, reason: collision with root package name */
    private static final boolean f29961m = false;

    /* renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final int f29962n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f29963o = 1;

    /* renamed from: e, reason: collision with root package name */
    private final FragmentManager f29964e;

    /* renamed from: f, reason: collision with root package name */
    private final int f29965f;

    /* renamed from: g, reason: collision with root package name */
    private l0 f29966g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<Fragment.SavedState> f29967h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList<Fragment> f29968i;

    /* renamed from: j, reason: collision with root package name */
    private Fragment f29969j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f29970k;

    @Deprecated
    public i0(@androidx.annotation.o0 FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    @Override // androidx.viewpager.widget.a
    public void e(@androidx.annotation.o0 ViewGroup viewGroup, int i4, @androidx.annotation.o0 Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f29966g == null) {
            this.f29966g = this.f29964e.u();
        }
        while (this.f29967h.size() <= i4) {
            this.f29967h.add(null);
        }
        this.f29967h.set(i4, fragment.isAdded() ? this.f29964e.T1(fragment) : null);
        this.f29968i.set(i4, null);
        this.f29966g.C(fragment);
        if (fragment.equals(this.f29969j)) {
            this.f29969j = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void g(@androidx.annotation.o0 ViewGroup viewGroup) {
        l0 l0Var = this.f29966g;
        if (l0Var != null) {
            if (!this.f29970k) {
                try {
                    this.f29970k = true;
                    l0Var.u();
                } finally {
                    this.f29970k = false;
                }
            }
            this.f29966g = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    @androidx.annotation.o0
    public Object m(@androidx.annotation.o0 ViewGroup viewGroup, int i4) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f29968i.size() > i4 && (fragment = this.f29968i.get(i4)) != null) {
            return fragment;
        }
        if (this.f29966g == null) {
            this.f29966g = this.f29964e.u();
        }
        Fragment y4 = y(i4);
        if (this.f29967h.size() > i4 && (savedState = this.f29967h.get(i4)) != null) {
            y4.setInitialSavedState(savedState);
        }
        while (this.f29968i.size() <= i4) {
            this.f29968i.add(null);
        }
        y4.setMenuVisibility(false);
        if (this.f29965f == 0) {
            y4.setUserVisibleHint(false);
        }
        this.f29968i.set(i4, y4);
        this.f29966g.g(viewGroup.getId(), y4);
        if (this.f29965f == 1) {
            this.f29966g.P(y4, AbstractC1450w.b.STARTED);
        }
        return y4;
    }

    @Override // androidx.viewpager.widget.a
    public boolean n(@androidx.annotation.o0 View view, @androidx.annotation.o0 Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.a
    public void q(@androidx.annotation.q0 Parcelable parcelable, @androidx.annotation.q0 ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f29967h.clear();
            this.f29968i.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f29967h.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment E0 = this.f29964e.E0(bundle, str);
                    if (E0 != null) {
                        while (this.f29968i.size() <= parseInt) {
                            this.f29968i.add(null);
                        }
                        E0.setMenuVisibility(false);
                        this.f29968i.set(parseInt, E0);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.a
    @androidx.annotation.q0
    public Parcelable r() {
        Bundle bundle;
        if (this.f29967h.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f29967h.size()];
            this.f29967h.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i4 = 0; i4 < this.f29968i.size(); i4++) {
            Fragment fragment = this.f29968i.get(i4);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f29964e.A1(bundle, android.support.v4.media.a.a("f", i4), fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.a
    public void t(@androidx.annotation.o0 ViewGroup viewGroup, int i4, @androidx.annotation.o0 Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f29969j;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f29965f == 1) {
                    if (this.f29966g == null) {
                        this.f29966g = this.f29964e.u();
                    }
                    this.f29966g.P(this.f29969j, AbstractC1450w.b.STARTED);
                } else {
                    this.f29969j.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f29965f == 1) {
                if (this.f29966g == null) {
                    this.f29966g = this.f29964e.u();
                }
                this.f29966g.P(fragment, AbstractC1450w.b.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f29969j = fragment;
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

    public i0(@androidx.annotation.o0 FragmentManager fragmentManager, int i4) {
        this.f29966g = null;
        this.f29967h = new ArrayList<>();
        this.f29968i = new ArrayList<>();
        this.f29969j = null;
        this.f29964e = fragmentManager;
        this.f29965f = i4;
    }
}
