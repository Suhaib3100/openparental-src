package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.a1;
import androidx.annotation.i;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.s0;
import androidx.collection.e1;
import androidx.core.util.w;
import androidx.core.view.x1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.l0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1416b0;
import androidx.view.InterfaceC1423e0;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public abstract class FragmentStateAdapter extends RecyclerView.h<androidx.viewpager2.adapter.a> implements androidx.viewpager2.adapter.b {

    /* renamed from: k, reason: collision with root package name */
    private static final String f35568k = "f#";

    /* renamed from: l, reason: collision with root package name */
    private static final String f35569l = "s#";

    /* renamed from: m, reason: collision with root package name */
    private static final long f35570m = 10000;

    /* renamed from: b, reason: collision with root package name */
    final AbstractC1450w f35571b;

    /* renamed from: c, reason: collision with root package name */
    final FragmentManager f35572c;

    /* renamed from: d, reason: collision with root package name */
    final e1<Fragment> f35573d;

    /* renamed from: e, reason: collision with root package name */
    private final e1<Fragment.SavedState> f35574e;

    /* renamed from: f, reason: collision with root package name */
    private final e1<Integer> f35575f;

    /* renamed from: g, reason: collision with root package name */
    private FragmentMaxLifecycleEnforcer f35576g;

    /* renamed from: h, reason: collision with root package name */
    e f35577h;

    /* renamed from: i, reason: collision with root package name */
    boolean f35578i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f35579j;

    class FragmentMaxLifecycleEnforcer {

        /* renamed from: a, reason: collision with root package name */
        private ViewPager2.j f35585a;

        /* renamed from: b, reason: collision with root package name */
        private RecyclerView.j f35586b;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC1416b0 f35587c;

        /* renamed from: d, reason: collision with root package name */
        private ViewPager2 f35588d;

        /* renamed from: e, reason: collision with root package name */
        private long f35589e = -1;

        class a extends ViewPager2.j {
            a() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.j
            public void onPageScrollStateChanged(int i4) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.j
            public void onPageSelected(int i4) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }
        }

        class b extends c {
            b() {
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.c, androidx.recyclerview.widget.RecyclerView.j
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
            this.f35588d = a(recyclerView);
            a aVar = new a();
            this.f35585a = aVar;
            this.f35588d.u(aVar);
            b bVar = new b();
            this.f35586b = bVar;
            FragmentStateAdapter.this.registerAdapterDataObserver(bVar);
            InterfaceC1416b0 interfaceC1416b0 = new InterfaceC1416b0() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // androidx.view.InterfaceC1416b0
                public void f(@o0 InterfaceC1423e0 interfaceC1423e0, @o0 AbstractC1450w.a aVar2) {
                    FragmentMaxLifecycleEnforcer.this.d(false);
                }
            };
            this.f35587c = interfaceC1416b0;
            FragmentStateAdapter.this.f35571b.a(interfaceC1416b0);
        }

        void c(@o0 RecyclerView recyclerView) {
            a(recyclerView).K(this.f35585a);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.f35586b);
            FragmentStateAdapter.this.f35571b.d(this.f35587c);
            this.f35588d = null;
        }

        void d(boolean z4) {
            int h4;
            Fragment i4;
            if (FragmentStateAdapter.this.x() || this.f35588d.n() != 0 || FragmentStateAdapter.this.f35573d.n() || FragmentStateAdapter.this.getItemCount() == 0 || (h4 = this.f35588d.h()) >= FragmentStateAdapter.this.getItemCount()) {
                return;
            }
            long itemId = FragmentStateAdapter.this.getItemId(h4);
            if ((itemId != this.f35589e || z4) && (i4 = FragmentStateAdapter.this.f35573d.i(itemId)) != null && i4.isAdded()) {
                this.f35589e = itemId;
                l0 u4 = FragmentStateAdapter.this.f35572c.u();
                ArrayList arrayList = new ArrayList();
                Fragment fragment = null;
                for (int i5 = 0; i5 < FragmentStateAdapter.this.f35573d.z(); i5++) {
                    long o4 = FragmentStateAdapter.this.f35573d.o(i5);
                    Fragment A = FragmentStateAdapter.this.f35573d.A(i5);
                    if (A.isAdded()) {
                        if (o4 != this.f35589e) {
                            AbstractC1450w.b bVar = AbstractC1450w.b.STARTED;
                            u4.P(A, bVar);
                            arrayList.add(FragmentStateAdapter.this.f35577h.a(A, bVar));
                        } else {
                            fragment = A;
                        }
                        A.setMenuVisibility(o4 == this.f35589e);
                    }
                }
                if (fragment != null) {
                    AbstractC1450w.b bVar2 = AbstractC1450w.b.RESUMED;
                    u4.P(fragment, bVar2);
                    arrayList.add(FragmentStateAdapter.this.f35577h.a(fragment, bVar2));
                }
                if (u4.B()) {
                    return;
                }
                u4.t();
                Collections.reverse(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    FragmentStateAdapter.this.f35577h.b((List) it.next());
                }
            }
        }
    }

    class a extends FragmentManager.m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f35594a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout f35595b;

        a(Fragment fragment, FrameLayout frameLayout) {
            this.f35594a = fragment;
            this.f35595b = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public void m(@o0 FragmentManager fragmentManager, @o0 Fragment fragment, @o0 View view, @q0 Bundle bundle) {
            if (fragment == this.f35594a) {
                fragmentManager.f2(this);
                FragmentStateAdapter.this.d(view, this.f35595b);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.f35578i = false;
            fragmentStateAdapter.i();
        }
    }

    private static abstract class c extends RecyclerView.j {
        private c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void b(int i4, int i5) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void c(int i4, int i5, @q0 Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void d(int i4, int i5) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void e(int i4, int i5, int i6) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void f(int i4, int i5) {
            a();
        }

        c(AnonymousClass1 anonymousClass1) {
        }
    }

    @a1(level = a1.a.WARNING)
    public @interface d {
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        private List<f> f35598a = new CopyOnWriteArrayList();

        e() {
        }

        public List<f.b> a(Fragment fragment, AbstractC1450w.b bVar) {
            ArrayList arrayList = new ArrayList();
            Iterator<f> it = this.f35598a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a(fragment, bVar));
            }
            return arrayList;
        }

        public void b(List<f.b> list) {
            Iterator<f.b> it = list.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        public List<f.b> c(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<f> it = this.f35598a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().b(fragment));
            }
            return arrayList;
        }

        public List<f.b> d(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<f> it = this.f35598a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().c(fragment));
            }
            return arrayList;
        }

        @s0(markerClass = {d.class})
        public List<f.b> e(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<f> it = this.f35598a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().d(fragment));
            }
            return arrayList;
        }

        public void f(f fVar) {
            this.f35598a.add(fVar);
        }

        public void g(f fVar) {
            this.f35598a.remove(fVar);
        }
    }

    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private static final b f35599a = new a();

        class a implements b {
            a() {
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.f.b
            public void a() {
            }
        }

        public interface b {
            void a();
        }

        @o0
        public b a(@o0 Fragment fragment, @o0 AbstractC1450w.b bVar) {
            return f35599a;
        }

        @o0
        public b b(@o0 Fragment fragment) {
            return f35599a;
        }

        @o0
        public b c(@o0 Fragment fragment) {
            return f35599a;
        }

        @d
        @o0
        public b d(@o0 Fragment fragment) {
            return f35599a;
        }
    }

    public FragmentStateAdapter(@o0 FragmentActivity fragmentActivity) {
        this(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getLifecycle());
    }

    @o0
    private static String g(@o0 String str, long j4) {
        return str + j4;
    }

    private void h(int i4) {
        long itemId = getItemId(i4);
        if (this.f35573d.e(itemId)) {
            return;
        }
        Fragment f4 = f(i4);
        f4.setInitialSavedState(this.f35574e.i(itemId));
        this.f35573d.p(itemId, f4);
    }

    private boolean j(long j4) {
        View view;
        if (this.f35575f.e(j4)) {
            return true;
        }
        Fragment i4 = this.f35573d.i(j4);
        return (i4 == null || (view = i4.getView()) == null || view.getParent() == null) ? false : true;
    }

    private static boolean k(@o0 String str, @o0 String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private Long l(int i4) {
        Long l4 = null;
        for (int i5 = 0; i5 < this.f35575f.z(); i5++) {
            if (this.f35575f.A(i5).intValue() == i4) {
                if (l4 != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                l4 = Long.valueOf(this.f35575f.o(i5));
            }
        }
        return l4;
    }

    private static long r(@o0 String str, @o0 String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void u(long j4) {
        ViewParent parent;
        Fragment i4 = this.f35573d.i(j4);
        if (i4 == null) {
            return;
        }
        if (i4.getView() != null && (parent = i4.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!e(j4)) {
            this.f35574e.s(j4);
        }
        if (!i4.isAdded()) {
            this.f35573d.s(j4);
            return;
        }
        if (x()) {
            this.f35579j = true;
            return;
        }
        if (i4.isAdded() && e(j4)) {
            List<f.b> e4 = this.f35577h.e(i4);
            Fragment.SavedState T1 = this.f35572c.T1(i4);
            this.f35577h.b(e4);
            this.f35574e.p(j4, T1);
        }
        List<f.b> d5 = this.f35577h.d(i4);
        try {
            this.f35572c.u().C(i4).t();
            this.f35573d.s(j4);
        } finally {
            this.f35577h.b(d5);
        }
    }

    private void v() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final b bVar = new b();
        this.f35571b.a(new InterfaceC1416b0() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.4
            @Override // androidx.view.InterfaceC1416b0
            public void f(@o0 InterfaceC1423e0 interfaceC1423e0, @o0 AbstractC1450w.a aVar) {
                if (aVar == AbstractC1450w.a.ON_DESTROY) {
                    handler.removeCallbacks(bVar);
                    interfaceC1423e0.getLifecycle().d(this);
                }
            }
        });
        handler.postDelayed(bVar, 10000L);
    }

    private void w(Fragment fragment, @o0 FrameLayout frameLayout) {
        this.f35572c.B1(new a(fragment, frameLayout), false);
    }

    @Override // androidx.viewpager2.adapter.b
    @o0
    public final Parcelable a() {
        Bundle bundle = new Bundle(this.f35574e.z() + this.f35573d.z());
        for (int i4 = 0; i4 < this.f35573d.z(); i4++) {
            long o4 = this.f35573d.o(i4);
            Fragment i5 = this.f35573d.i(o4);
            if (i5 != null && i5.isAdded()) {
                this.f35572c.A1(bundle, g("f#", o4), i5);
            }
        }
        for (int i6 = 0; i6 < this.f35574e.z(); i6++) {
            long o5 = this.f35574e.o(i6);
            if (e(o5)) {
                bundle.putParcelable(g("s#", o5), this.f35574e.i(o5));
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager2.adapter.b
    public final void c(@o0 Parcelable parcelable) {
        if (!this.f35574e.n() || !this.f35573d.n()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (k(str, "f#")) {
                this.f35573d.p(r(str, "f#"), this.f35572c.E0(bundle, str));
            } else {
                if (!k(str, "s#")) {
                    throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a("Unexpected key in savedState: ", str));
                }
                long r4 = r(str, "s#");
                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                if (e(r4)) {
                    this.f35574e.p(r4, savedState);
                }
            }
        }
        if (this.f35573d.n()) {
            return;
        }
        this.f35579j = true;
        this.f35578i = true;
        i();
        v();
    }

    void d(@o0 View view, @o0 FrameLayout frameLayout) {
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

    public boolean e(long j4) {
        return j4 >= 0 && j4 < ((long) getItemCount());
    }

    @o0
    public abstract Fragment f(int i4);

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i4) {
        return i4;
    }

    void i() {
        if (!this.f35579j || x()) {
            return;
        }
        androidx.collection.d dVar = new androidx.collection.d();
        for (int i4 = 0; i4 < this.f35573d.z(); i4++) {
            long o4 = this.f35573d.o(i4);
            if (!e(o4)) {
                dVar.add(Long.valueOf(o4));
                this.f35575f.s(o4);
            }
        }
        if (!this.f35578i) {
            this.f35579j = false;
            for (int i5 = 0; i5 < this.f35573d.z(); i5++) {
                long o5 = this.f35573d.o(i5);
                if (!j(o5)) {
                    dVar.add(Long.valueOf(o5));
                }
            }
        }
        Iterator it = dVar.iterator();
        while (it.hasNext()) {
            u(((Long) it.next()).longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(@o0 androidx.viewpager2.adapter.a aVar, int i4) {
        long itemId = aVar.getItemId();
        int id2 = ((FrameLayout) aVar.itemView).getId();
        Long l4 = l(id2);
        if (l4 != null && l4.longValue() != itemId) {
            u(l4.longValue());
            this.f35575f.s(l4.longValue());
        }
        this.f35575f.p(itemId, Integer.valueOf(id2));
        h(i4);
        if (x1.R0((FrameLayout) aVar.itemView)) {
            s(aVar);
        }
        i();
    }

    @o0
    public final androidx.viewpager2.adapter.a n(@o0 ViewGroup viewGroup, int i4) {
        return androidx.viewpager2.adapter.a.a(viewGroup);
    }

    public final boolean o(@o0 androidx.viewpager2.adapter.a aVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @i
    public void onAttachedToRecyclerView(@o0 RecyclerView recyclerView) {
        w.a(this.f35576g == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.f35576g = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @o0
    public androidx.viewpager2.adapter.a onCreateViewHolder(@o0 ViewGroup viewGroup, int i4) {
        return androidx.viewpager2.adapter.a.a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @i
    public void onDetachedFromRecyclerView(@o0 RecyclerView recyclerView) {
        this.f35576g.c(recyclerView);
        this.f35576g = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public boolean onFailedToRecycleView(@o0 androidx.viewpager2.adapter.a aVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void onViewAttachedToWindow(@o0 androidx.viewpager2.adapter.a aVar) {
        s(aVar);
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void onViewRecycled(@o0 androidx.viewpager2.adapter.a aVar) {
        Long l4 = l(((FrameLayout) aVar.itemView).getId());
        if (l4 != null) {
            u(l4.longValue());
            this.f35575f.s(l4.longValue());
        }
    }

    void s(@o0 final androidx.viewpager2.adapter.a aVar) {
        Fragment i4 = this.f35573d.i(aVar.getItemId());
        if (i4 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) aVar.itemView;
        View view = i4.getView();
        if (!i4.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (i4.isAdded() && view == null) {
            w(i4, frameLayout);
            return;
        }
        if (i4.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                d(view, frameLayout);
                return;
            }
            return;
        }
        if (i4.isAdded()) {
            d(view, frameLayout);
            return;
        }
        if (x()) {
            if (this.f35572c.V0()) {
                return;
            }
            this.f35571b.a(new InterfaceC1416b0() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.1
                @Override // androidx.view.InterfaceC1416b0
                public void f(@o0 InterfaceC1423e0 interfaceC1423e0, @o0 AbstractC1450w.a aVar2) {
                    if (FragmentStateAdapter.this.x()) {
                        return;
                    }
                    interfaceC1423e0.getLifecycle().d(this);
                    if (x1.R0((FrameLayout) aVar.itemView)) {
                        FragmentStateAdapter.this.s(aVar);
                    }
                }
            });
            return;
        }
        w(i4, frameLayout);
        List<f.b> c5 = this.f35577h.c(i4);
        try {
            i4.setMenuVisibility(false);
            this.f35572c.u().l(i4, "f" + aVar.getItemId()).P(i4, AbstractC1450w.b.STARTED).t();
            this.f35576g.d(false);
        } finally {
            this.f35577h.b(c5);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void setHasStableIds(boolean z4) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public void t(@o0 f fVar) {
        this.f35577h.f(fVar);
    }

    boolean x() {
        return this.f35572c.d1();
    }

    public void y(@o0 f fVar) {
        this.f35577h.g(fVar);
    }

    public FragmentStateAdapter(@o0 Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public FragmentStateAdapter(@o0 FragmentManager fragmentManager, @o0 AbstractC1450w abstractC1450w) {
        this.f35573d = new e1<>();
        this.f35574e = new e1<>();
        this.f35575f = new e1<>();
        this.f35577h = new e();
        this.f35578i = false;
        this.f35579j = false;
        this.f35572c = fragmentManager;
        this.f35571b = abstractC1450w;
        super.setHasStableIds(true);
    }
}
