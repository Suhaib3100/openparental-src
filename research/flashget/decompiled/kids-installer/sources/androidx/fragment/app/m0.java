package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.q0;
import androidx.core.os.c;
import androidx.core.view.y1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import z.a;

/* compiled from: SpecialEffectsController.java */
/* loaded from: classes.dex */
abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f8325a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<e> f8326b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<e> f8327c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    boolean f8328d = false;

    /* renamed from: e, reason: collision with root package name */
    boolean f8329e = false;

    /* compiled from: SpecialEffectsController.java */
    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ d f8330o;

        a(d dVar) {
            this.f8330o = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (m0.this.f8326b.contains(this.f8330o)) {
                this.f8330o.e().applyState(this.f8330o.f().mView);
            }
        }
    }

    /* compiled from: SpecialEffectsController.java */
    class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ d f8332o;

        b(d dVar) {
            this.f8332o = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            m0.this.f8326b.remove(this.f8332o);
            m0.this.f8327c.remove(this.f8332o);
        }
    }

    /* compiled from: SpecialEffectsController.java */
    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8334a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f8335b;

        static {
            int[] iArr = new int[e.b.values().length];
            f8335b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8335b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8335b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f8334a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8334a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8334a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8334a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: SpecialEffectsController.java */
    /* loaded from: classes3.dex */
    private static class d extends e {

        /* renamed from: h, reason: collision with root package name */
        @androidx.annotation.o0
        private final b0 f8336h;

        d(@androidx.annotation.o0 e.c cVar, @androidx.annotation.o0 e.b bVar, @androidx.annotation.o0 b0 b0Var, @androidx.annotation.o0 androidx.core.os.c cVar2) {
            super(cVar, bVar, b0Var.k(), cVar2);
            this.f8336h = b0Var;
        }

        @Override // androidx.fragment.app.m0.e
        public void c() {
            super.c();
            this.f8336h.m();
        }

        @Override // androidx.fragment.app.m0.e
        void l() {
            if (g() != e.b.ADDING) {
                if (g() == e.b.REMOVING) {
                    Fragment k5 = this.f8336h.k();
                    View requireView = k5.requireView();
                    if (FragmentManager.W0(2)) {
                        Objects.toString(requireView.findFocus());
                        requireView.toString();
                        k5.toString();
                    }
                    requireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment k6 = this.f8336h.k();
            View findFocus = k6.mView.findFocus();
            if (findFocus != null) {
                k6.setFocusedView(findFocus);
                if (FragmentManager.W0(2)) {
                    findFocus.toString();
                    k6.toString();
                }
            }
            View requireView2 = f().requireView();
            if (requireView2.getParent() == null) {
                this.f8336h.b();
                requireView2.setAlpha(0.0f);
            }
            if (requireView2.getAlpha() == 0.0f && requireView2.getVisibility() == 0) {
                requireView2.setVisibility(4);
            }
            requireView2.setAlpha(k6.getPostOnViewCreatedAlpha());
        }
    }

    m0(@androidx.annotation.o0 ViewGroup viewGroup) {
        this.f8325a = viewGroup;
    }

    private void a(@androidx.annotation.o0 e.c cVar, @androidx.annotation.o0 e.b bVar, @androidx.annotation.o0 b0 b0Var) {
        synchronized (this.f8326b) {
            androidx.core.os.c cVar2 = new androidx.core.os.c();
            e h5 = h(b0Var.k());
            if (h5 != null) {
                h5.k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, b0Var, cVar2);
            this.f8326b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    @q0
    private e h(@androidx.annotation.o0 Fragment fragment) {
        Iterator<e> it = this.f8326b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    @q0
    private e i(@androidx.annotation.o0 Fragment fragment) {
        Iterator<e> it = this.f8327c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    @androidx.annotation.o0
    static m0 n(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.o0 FragmentManager fragmentManager) {
        return o(viewGroup, fragmentManager.O0());
    }

    @androidx.annotation.o0
    static m0 o(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.o0 n0 n0Var) {
        int i5 = a.c.f34376b;
        Object tag = viewGroup.getTag(i5);
        if (tag instanceof m0) {
            return (m0) tag;
        }
        m0 a6 = n0Var.a(viewGroup);
        viewGroup.setTag(i5, a6);
        return a6;
    }

    private void q() {
        Iterator<e> it = this.f8326b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.g() == e.b.ADDING) {
                next.k(e.c.from(next.f().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    void b(@androidx.annotation.o0 e.c cVar, @androidx.annotation.o0 b0 b0Var) {
        if (FragmentManager.W0(2)) {
            Objects.toString(b0Var.k());
        }
        a(cVar, e.b.ADDING, b0Var);
    }

    void c(@androidx.annotation.o0 b0 b0Var) {
        if (FragmentManager.W0(2)) {
            Objects.toString(b0Var.k());
        }
        a(e.c.GONE, e.b.NONE, b0Var);
    }

    void d(@androidx.annotation.o0 b0 b0Var) {
        if (FragmentManager.W0(2)) {
            Objects.toString(b0Var.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, b0Var);
    }

    void e(@androidx.annotation.o0 b0 b0Var) {
        if (FragmentManager.W0(2)) {
            Objects.toString(b0Var.k());
        }
        a(e.c.VISIBLE, e.b.NONE, b0Var);
    }

    abstract void f(@androidx.annotation.o0 List<e> list, boolean z5);

    void g() {
        if (this.f8329e) {
            return;
        }
        if (!y1.O0(this.f8325a)) {
            j();
            this.f8328d = false;
            return;
        }
        synchronized (this.f8326b) {
            if (!this.f8326b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f8327c);
                this.f8327c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (FragmentManager.W0(2)) {
                        Objects.toString(eVar);
                    }
                    eVar.b();
                    if (!eVar.i()) {
                        this.f8327c.add(eVar);
                    }
                }
                q();
                ArrayList arrayList2 = new ArrayList(this.f8326b);
                this.f8326b.clear();
                this.f8327c.addAll(arrayList2);
                FragmentManager.W0(2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).l();
                }
                f(arrayList2, this.f8328d);
                this.f8328d = false;
                FragmentManager.W0(2);
            }
        }
    }

    void j() {
        FragmentManager.W0(2);
        boolean O0 = y1.O0(this.f8325a);
        synchronized (this.f8326b) {
            q();
            Iterator<e> it = this.f8326b.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
            Iterator it2 = new ArrayList(this.f8327c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (FragmentManager.W0(2)) {
                    if (!O0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Container ");
                        sb.append(this.f8325a);
                        sb.append(" is not attached to window. ");
                    }
                    Objects.toString(eVar);
                }
                eVar.b();
            }
            Iterator it3 = new ArrayList(this.f8326b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (FragmentManager.W0(2)) {
                    if (!O0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Container ");
                        sb2.append(this.f8325a);
                        sb2.append(" is not attached to window. ");
                    }
                    Objects.toString(eVar2);
                }
                eVar2.b();
            }
        }
    }

    void k() {
        if (this.f8329e) {
            FragmentManager.W0(2);
            this.f8329e = false;
            g();
        }
    }

    @q0
    e.b l(@androidx.annotation.o0 b0 b0Var) {
        e h5 = h(b0Var.k());
        e.b g5 = h5 != null ? h5.g() : null;
        e i5 = i(b0Var.k());
        return (i5 == null || !(g5 == null || g5 == e.b.NONE)) ? g5 : i5.g();
    }

    @androidx.annotation.o0
    public ViewGroup m() {
        return this.f8325a;
    }

    void p() {
        synchronized (this.f8326b) {
            q();
            this.f8329e = false;
            int size = this.f8326b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.f8326b.get(size);
                e.c from = e.c.from(eVar.f().mView);
                e.c e6 = eVar.e();
                e.c cVar = e.c.VISIBLE;
                if (e6 == cVar && from != cVar) {
                    this.f8329e = eVar.f().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    void r(boolean z5) {
        this.f8328d = z5;
    }

    /* compiled from: SpecialEffectsController.java */
    static class e {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.o0
        private c f8337a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.o0
        private b f8338b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.o0
        private final Fragment f8339c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.o0
        private final List<Runnable> f8340d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.o0
        private final HashSet<androidx.core.os.c> f8341e = new HashSet<>();

        /* renamed from: f, reason: collision with root package name */
        private boolean f8342f = false;

        /* renamed from: g, reason: collision with root package name */
        private boolean f8343g = false;

        /* compiled from: SpecialEffectsController.java */
        /* loaded from: classes3.dex */
        class a implements c.b {
            a() {
            }

            @Override // androidx.core.os.c.b
            public void onCancel() {
                e.this.b();
            }
        }

        /* compiled from: SpecialEffectsController.java */
        enum b {
            NONE,
            ADDING,
            REMOVING
        }

        e(@androidx.annotation.o0 c cVar, @androidx.annotation.o0 b bVar, @androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 androidx.core.os.c cVar2) {
            this.f8337a = cVar;
            this.f8338b = bVar;
            this.f8339c = fragment;
            cVar2.d(new a());
        }

        final void a(@androidx.annotation.o0 Runnable runnable) {
            this.f8340d.add(runnable);
        }

        final void b() {
            if (h()) {
                return;
            }
            this.f8342f = true;
            if (this.f8341e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.f8341e).iterator();
            while (it.hasNext()) {
                ((androidx.core.os.c) it.next()).a();
            }
        }

        @androidx.annotation.i
        public void c() {
            if (this.f8343g) {
                return;
            }
            if (FragmentManager.W0(2)) {
                toString();
            }
            this.f8343g = true;
            Iterator<Runnable> it = this.f8340d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        public final void d(@androidx.annotation.o0 androidx.core.os.c cVar) {
            if (this.f8341e.remove(cVar) && this.f8341e.isEmpty()) {
                c();
            }
        }

        @androidx.annotation.o0
        public c e() {
            return this.f8337a;
        }

        @androidx.annotation.o0
        public final Fragment f() {
            return this.f8339c;
        }

        @androidx.annotation.o0
        b g() {
            return this.f8338b;
        }

        final boolean h() {
            return this.f8342f;
        }

        final boolean i() {
            return this.f8343g;
        }

        public final void j(@androidx.annotation.o0 androidx.core.os.c cVar) {
            l();
            this.f8341e.add(cVar);
        }

        final void k(@androidx.annotation.o0 c cVar, @androidx.annotation.o0 b bVar) {
            int i5 = c.f8335b[bVar.ordinal()];
            if (i5 == 1) {
                if (this.f8337a == c.REMOVED) {
                    if (FragmentManager.W0(2)) {
                        Objects.toString(this.f8339c);
                        Objects.toString(this.f8338b);
                    }
                    this.f8337a = c.VISIBLE;
                    this.f8338b = b.ADDING;
                    return;
                }
                return;
            }
            if (i5 == 2) {
                if (FragmentManager.W0(2)) {
                    Objects.toString(this.f8339c);
                    Objects.toString(this.f8337a);
                    Objects.toString(this.f8338b);
                }
                this.f8337a = c.REMOVED;
                this.f8338b = b.REMOVING;
                return;
            }
            if (i5 == 3 && this.f8337a != c.REMOVED) {
                if (FragmentManager.W0(2)) {
                    Objects.toString(this.f8339c);
                    Objects.toString(this.f8337a);
                    Objects.toString(cVar);
                }
                this.f8337a = cVar;
            }
        }

        void l() {
        }

        @androidx.annotation.o0
        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f8337a + "} {mLifecycleImpact = " + this.f8338b + "} {mFragment = " + this.f8339c + "}";
        }

        /* compiled from: SpecialEffectsController.java */
        enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            @androidx.annotation.o0
            static c from(@androidx.annotation.o0 View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : from(view.getVisibility());
            }

            void applyState(@androidx.annotation.o0 View view) {
                int i5 = c.f8334a[ordinal()];
                if (i5 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.W0(2)) {
                            view.toString();
                            viewGroup.toString();
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i5 == 2) {
                    if (FragmentManager.W0(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(0);
                } else if (i5 == 3) {
                    if (FragmentManager.W0(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(8);
                } else {
                    if (i5 != 4) {
                        return;
                    }
                    if (FragmentManager.W0(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(4);
                }
            }

            @androidx.annotation.o0
            static c from(int i5) {
                if (i5 == 0) {
                    return VISIBLE;
                }
                if (i5 == 4) {
                    return INVISIBLE;
                }
                if (i5 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a("Unknown visibility ", i5));
            }
        }
    }
}
