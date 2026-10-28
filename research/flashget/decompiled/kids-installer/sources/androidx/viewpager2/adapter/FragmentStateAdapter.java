package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.a0;
import android.view.t;
import android.view.w;
import android.widget.FrameLayout;
import androidx.annotation.i;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.f;
import androidx.constraintlayout.motion.widget.g;
import androidx.core.util.q;
import androidx.core.view.y1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.f0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class FragmentStateAdapter extends RecyclerView.h<androidx.viewpager2.adapter.a> implements androidx.viewpager2.adapter.b {

    /* renamed from: l, reason: collision with root package name */
    private static final String f10420l = "f#";

    /* renamed from: m, reason: collision with root package name */
    private static final String f10421m = "s#";

    /* renamed from: n, reason: collision with root package name */
    private static final long f10422n = 10000;

    /* renamed from: d, reason: collision with root package name */
    final t f10423d;

    /* renamed from: e, reason: collision with root package name */
    final FragmentManager f10424e;

    /* renamed from: f, reason: collision with root package name */
    final f<Fragment> f10425f;

    /* renamed from: g, reason: collision with root package name */
    private final f<Fragment.SavedState> f10426g;

    /* renamed from: h, reason: collision with root package name */
    private final f<Integer> f10427h;

    /* renamed from: i, reason: collision with root package name */
    private FragmentMaxLifecycleEnforcer f10428i;

    /* renamed from: j, reason: collision with root package name */
    boolean f10429j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f10430k;

    /* loaded from: classes.dex */
    class FragmentMaxLifecycleEnforcer {

        /* renamed from: a, reason: collision with root package name */
        private ViewPager2.j f10436a;

        /* renamed from: b, reason: collision with root package name */
        private RecyclerView.j f10437b;

        /* renamed from: c, reason: collision with root package name */
        private w f10438c;

        /* renamed from: d, reason: collision with root package name */
        private ViewPager2 f10439d;

        /* renamed from: e, reason: collision with root package name */
        private long f10440e = -1;

        /* loaded from: classes3.dex */
        class a extends ViewPager2.j {
            a() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.j
            public void a(int i5) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.j
            public void c(int i5) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }
        }

        /* loaded from: classes3.dex */
        class b extends d {
            b() {
                super(null);
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.d, androidx.recyclerview.widget.RecyclerView.j
            public void a() {
                FragmentMaxLifecycleEnforcer.this.d(true);
            }
        }

        FragmentMaxLifecycleEnforcer() {
        }

        @o0
        private ViewPager2 a(@o0 RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        void b(@o0 RecyclerView recyclerView) {
            this.f10439d = a(recyclerView);
            a aVar = new a();
            this.f10436a = aVar;
            this.f10439d.u(aVar);
            b bVar = new b();
            this.f10437b = bVar;
            FragmentStateAdapter.this.F(bVar);
            w wVar = new w() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // android.view.w
                public void h(@o0 a0 a0Var, @o0 t.b bVar2) {
                    FragmentMaxLifecycleEnforcer.this.d(false);
                }
            };
            this.f10438c = wVar;
            FragmentStateAdapter.this.f10423d.a(wVar);
        }

        void c(@o0 RecyclerView recyclerView) {
            a(recyclerView).K(this.f10436a);
            FragmentStateAdapter.this.I(this.f10437b);
            FragmentStateAdapter.this.f10423d.c(this.f10438c);
            this.f10439d = null;
        }

        void d(boolean z5) {
            int h5;
            Fragment j5;
            if (FragmentStateAdapter.this.c0() || this.f10439d.n() != 0 || FragmentStateAdapter.this.f10425f.n() || FragmentStateAdapter.this.g() == 0 || (h5 = this.f10439d.h()) >= FragmentStateAdapter.this.g()) {
                return;
            }
            long h6 = FragmentStateAdapter.this.h(h5);
            if ((h6 != this.f10440e || z5) && (j5 = FragmentStateAdapter.this.f10425f.j(h6)) != null && j5.isAdded()) {
                this.f10440e = h6;
                f0 u5 = FragmentStateAdapter.this.f10424e.u();
                Fragment fragment = null;
                for (int i5 = 0; i5 < FragmentStateAdapter.this.f10425f.A(); i5++) {
                    long o5 = FragmentStateAdapter.this.f10425f.o(i5);
                    Fragment B = FragmentStateAdapter.this.f10425f.B(i5);
                    if (B.isAdded()) {
                        if (o5 != this.f10440e) {
                            u5.K(B, t.c.STARTED);
                        } else {
                            fragment = B;
                        }
                        B.setMenuVisibility(o5 == this.f10440e);
                    }
                }
                if (fragment != null) {
                    u5.K(fragment, t.c.RESUMED);
                }
                if (u5.w()) {
                    return;
                }
                u5.o();
            }
        }
    }

    /* loaded from: classes.dex */
    class a implements View.OnLayoutChangeListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ FrameLayout f10445o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.viewpager2.adapter.a f10446p;

        a(FrameLayout frameLayout, androidx.viewpager2.adapter.a aVar) {
            this.f10445o = frameLayout;
            this.f10446p = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
            if (this.f10445o.getParent() != null) {
                this.f10445o.removeOnLayoutChangeListener(this);
                FragmentStateAdapter.this.Y(this.f10446p);
            }
        }
    }

    class b extends FragmentManager.m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f10448a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout f10449b;

        b(Fragment fragment, FrameLayout frameLayout) {
            this.f10448a = fragment;
            this.f10449b = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public void m(@o0 FragmentManager fragmentManager, @o0 Fragment fragment, @o0 View view, @q0 Bundle bundle) {
            if (fragment == this.f10448a) {
                fragmentManager.e2(this);
                FragmentStateAdapter.this.J(view, this.f10449b);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.f10429j = false;
            fragmentStateAdapter.O();
        }
    }

    private static abstract class d extends RecyclerView.j {
        private d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void b(int i5, int i6) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void c(int i5, int i6, @q0 Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void d(int i5, int i6) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void e(int i5, int i6, int i7) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void f(int i5, int i6) {
            a();
        }

        d(a aVar) {
        }
    }

    public FragmentStateAdapter(@o0 FragmentActivity fragmentActivity) {
        this(fragmentActivity.Y(), fragmentActivity.getLifecycle());
    }

    @o0
    private static String M(@o0 String str, long j5) {
        return str + j5;
    }

    private void N(int i5) {
        long h5 = h(i5);
        if (this.f10425f.d(h5)) {
            return;
        }
        Fragment L = L(i5);
        L.setInitialSavedState(this.f10426g.j(h5));
        this.f10425f.p(h5, L);
    }

    private boolean P(long j5) {
        View view;
        if (this.f10427h.d(j5)) {
            return true;
        }
        Fragment j6 = this.f10425f.j(j5);
        return (j6 == null || (view = j6.getView()) == null || view.getParent() == null) ? false : true;
    }

    private static boolean Q(@o0 String str, @o0 String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private Long R(int i5) {
        Long l5 = null;
        for (int i6 = 0; i6 < this.f10427h.A(); i6++) {
            if (this.f10427h.B(i6).intValue() == i5) {
                if (l5 != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                l5 = Long.valueOf(this.f10427h.o(i6));
            }
        }
        return l5;
    }

    private static long X(@o0 String str, @o0 String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void Z(long j5) {
        ViewParent parent;
        Fragment j6 = this.f10425f.j(j5);
        if (j6 == null) {
            return;
        }
        if (j6.getView() != null && (parent = j6.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!K(j5)) {
            this.f10426g.u(j5);
        }
        if (!j6.isAdded()) {
            this.f10425f.u(j5);
            return;
        }
        if (c0()) {
            this.f10430k = true;
            return;
        }
        if (j6.isAdded() && K(j5)) {
            this.f10426g.p(j5, this.f10424e.S1(j6));
        }
        this.f10424e.u().x(j6).o();
        this.f10425f.u(j5);
    }

    private void a0() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final c cVar = new c();
        this.f10423d.a(new w() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
            @Override // android.view.w
            public void h(@o0 a0 a0Var, @o0 t.b bVar) {
                if (bVar == t.b.ON_DESTROY) {
                    handler.removeCallbacks(cVar);
                    a0Var.getLifecycle().c(this);
                }
            }
        });
        handler.postDelayed(cVar, f10422n);
    }

    private void b0(Fragment fragment, @o0 FrameLayout frameLayout) {
        this.f10424e.A1(new b(fragment, frameLayout), false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @i
    public void A(@o0 RecyclerView recyclerView) {
        this.f10428i.c(recyclerView);
        this.f10428i = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void G(boolean z5) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    void J(@o0 View view, @o0 FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public boolean K(long j5) {
        return j5 >= 0 && j5 < ((long) g());
    }

    @o0
    public abstract Fragment L(int i5);

    void O() {
        if (!this.f10430k || c0()) {
            return;
        }
        androidx.collection.b bVar = new androidx.collection.b();
        for (int i5 = 0; i5 < this.f10425f.A(); i5++) {
            long o5 = this.f10425f.o(i5);
            if (!K(o5)) {
                bVar.add(Long.valueOf(o5));
                this.f10427h.u(o5);
            }
        }
        if (!this.f10429j) {
            this.f10430k = false;
            for (int i6 = 0; i6 < this.f10425f.A(); i6++) {
                long o6 = this.f10425f.o(i6);
                if (!P(o6)) {
                    bVar.add(Long.valueOf(o6));
                }
            }
        }
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            Z(((Long) it.next()).longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void x(@o0 androidx.viewpager2.adapter.a aVar, int i5) {
        long n5 = aVar.n();
        int id = ((FrameLayout) aVar.f9003a).getId();
        Long R = R(id);
        if (R != null && R.longValue() != n5) {
            Z(R.longValue());
            this.f10427h.u(R.longValue());
        }
        this.f10427h.p(n5, Integer.valueOf(id));
        N(i5);
        FrameLayout frameLayout = (FrameLayout) aVar.f9003a;
        if (y1.O0(frameLayout)) {
            if (frameLayout.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            frameLayout.addOnLayoutChangeListener(new a(frameLayout, aVar));
        }
        O();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @o0
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final androidx.viewpager2.adapter.a z(@o0 ViewGroup viewGroup, int i5) {
        return androidx.viewpager2.adapter.a.R(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final boolean B(@o0 androidx.viewpager2.adapter.a aVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final void C(@o0 androidx.viewpager2.adapter.a aVar) {
        Y(aVar);
        O();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final void E(@o0 androidx.viewpager2.adapter.a aVar) {
        Long R = R(((FrameLayout) aVar.f9003a).getId());
        if (R != null) {
            Z(R.longValue());
            this.f10427h.u(R.longValue());
        }
    }

    void Y(@o0 final androidx.viewpager2.adapter.a aVar) {
        Fragment j5 = this.f10425f.j(aVar.n());
        if (j5 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) aVar.f9003a;
        View view = j5.getView();
        if (!j5.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (j5.isAdded() && view == null) {
            b0(j5, frameLayout);
            return;
        }
        if (j5.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                J(view, frameLayout);
            }
        } else {
            if (j5.isAdded()) {
                J(view, frameLayout);
                return;
            }
            if (c0()) {
                if (this.f10424e.V0()) {
                    return;
                }
                this.f10423d.a(new w() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                    @Override // android.view.w
                    public void h(@o0 a0 a0Var, @o0 t.b bVar) {
                        if (FragmentStateAdapter.this.c0()) {
                            return;
                        }
                        a0Var.getLifecycle().c(this);
                        if (y1.O0((FrameLayout) aVar.f9003a)) {
                            FragmentStateAdapter.this.Y(aVar);
                        }
                    }
                });
            } else {
                b0(j5, frameLayout);
                this.f10424e.u().g(j5, "f" + aVar.n()).K(j5, t.c.STARTED).o();
                this.f10428i.d(false);
            }
        }
    }

    @Override // androidx.viewpager2.adapter.b
    @o0
    public final Parcelable a() {
        Bundle bundle = new Bundle(this.f10426g.A() + this.f10425f.A());
        for (int i5 = 0; i5 < this.f10425f.A(); i5++) {
            long o5 = this.f10425f.o(i5);
            Fragment j5 = this.f10425f.j(o5);
            if (j5 != null && j5.isAdded()) {
                this.f10424e.z1(bundle, M("f#", o5), j5);
            }
        }
        for (int i6 = 0; i6 < this.f10426g.A(); i6++) {
            long o6 = this.f10426g.o(i6);
            if (K(o6)) {
                bundle.putParcelable(M("s#", o6), this.f10426g.j(o6));
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager2.adapter.b
    public final void b(@o0 Parcelable parcelable) {
        if (!this.f10426g.n() || !this.f10425f.n()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (Q(str, "f#")) {
                this.f10425f.p(X(str, "f#"), this.f10424e.E0(bundle, str));
            } else {
                if (!Q(str, "s#")) {
                    throw new IllegalArgumentException(g.a("Unexpected key in savedState: ", str));
                }
                long X = X(str, "s#");
                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                if (K(X)) {
                    this.f10426g.p(X, savedState);
                }
            }
        }
        if (this.f10425f.n()) {
            return;
        }
        this.f10430k = true;
        this.f10429j = true;
        O();
        a0();
    }

    boolean c0() {
        return this.f10424e.c1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long h(int i5) {
        return i5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @i
    public void w(@o0 RecyclerView recyclerView) {
        q.a(this.f10428i == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.f10428i = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.b(recyclerView);
    }

    public FragmentStateAdapter(@o0 Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public FragmentStateAdapter(@o0 FragmentManager fragmentManager, @o0 t tVar) {
        this.f10425f = new f<>();
        this.f10426g = new f<>();
        this.f10427h = new f<>();
        this.f10429j = false;
        this.f10430k = false;
        this.f10424e = fragmentManager;
        this.f10423d = tVar;
        super.G(true);
    }
}
