package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.f;
import androidx.core.view.x1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import v1.a;

/* compiled from: SpecialEffectsController.java */
/* loaded from: classes3.dex */
abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f30097a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<e> f30098b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<e> f30099c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    boolean f30100d = false;

    /* renamed from: e, reason: collision with root package name */
    boolean f30101e = false;

    /* compiled from: SpecialEffectsController.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f30102b;

        a(d dVar) {
            this.f30102b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (u0.this.f30098b.contains(this.f30102b)) {
                this.f30102b.e().applyState(this.f30102b.f().mView);
            }
        }
    }

    /* compiled from: SpecialEffectsController.java */
    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f30104b;

        b(d dVar) {
            this.f30104b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            u0.this.f30098b.remove(this.f30104b);
            u0.this.f30099c.remove(this.f30104b);
        }
    }

    /* compiled from: SpecialEffectsController.java */
    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30106a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f30107b;

        static {
            int[] iArr = new int[e.b.values().length];
            f30107b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30107b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30107b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f30106a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30106a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30106a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30106a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: SpecialEffectsController.java */
    private static class d extends e {

        /* renamed from: h, reason: collision with root package name */
        @androidx.annotation.o0
        private final h0 f30108h;

        d(@androidx.annotation.o0 e.c cVar, @androidx.annotation.o0 e.b bVar, @androidx.annotation.o0 h0 h0Var, @androidx.annotation.o0 androidx.core.os.f fVar) {
            super(cVar, bVar, h0Var.k(), fVar);
            this.f30108h = h0Var;
        }

        @Override // androidx.fragment.app.u0.e
        public void c() {
            super.c();
            this.f30108h.m();
        }

        @Override // androidx.fragment.app.u0.e
        void l() {
            if (g() != e.b.ADDING) {
                if (g() == e.b.REMOVING) {
                    Fragment k4 = this.f30108h.k();
                    View requireView = k4.requireView();
                    if (FragmentManager.W0(2)) {
                        Objects.toString(requireView.findFocus());
                        requireView.toString();
                        k4.toString();
                    }
                    requireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment k5 = this.f30108h.k();
            View findFocus = k5.mView.findFocus();
            if (findFocus != null) {
                k5.setFocusedView(findFocus);
                if (FragmentManager.W0(2)) {
                    findFocus.toString();
                    k5.toString();
                }
            }
            View requireView2 = f().requireView();
            if (requireView2.getParent() == null) {
                this.f30108h.b();
                requireView2.setAlpha(0.0f);
            }
            if (requireView2.getAlpha() == 0.0f && requireView2.getVisibility() == 0) {
                requireView2.setVisibility(4);
            }
            requireView2.setAlpha(k5.getPostOnViewCreatedAlpha());
        }
    }

    u0(@androidx.annotation.o0 ViewGroup viewGroup) {
        this.f30097a = viewGroup;
    }

    private void a(@androidx.annotation.o0 e.c cVar, @androidx.annotation.o0 e.b bVar, @androidx.annotation.o0 h0 h0Var) {
        synchronized (this.f30098b) {
            try {
                androidx.core.os.f fVar = new androidx.core.os.f();
                e h4 = h(h0Var.k());
                if (h4 != null) {
                    h4.k(cVar, bVar);
                    return;
                }
                d dVar = new d(cVar, bVar, h0Var, fVar);
                this.f30098b.add(dVar);
                dVar.a(new a(dVar));
                dVar.a(new b(dVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @androidx.annotation.q0
    private e h(@androidx.annotation.o0 Fragment fragment) {
        Iterator<e> it = this.f30098b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    @androidx.annotation.q0
    private e i(@androidx.annotation.o0 Fragment fragment) {
        Iterator<e> it = this.f30099c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    @androidx.annotation.o0
    static u0 n(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.o0 FragmentManager fragmentManager) {
        return o(viewGroup, fragmentManager.O0());
    }

    @androidx.annotation.o0
    static u0 o(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.o0 v0 v0Var) {
        int i4 = a.c.f92820b;
        Object tag = viewGroup.getTag(i4);
        if (tag instanceof u0) {
            return (u0) tag;
        }
        u0 a5 = v0Var.a(viewGroup);
        viewGroup.setTag(i4, a5);
        return a5;
    }

    private void q() {
        Iterator<e> it = this.f30098b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.g() == e.b.ADDING) {
                next.k(e.c.from(next.f().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    void b(@androidx.annotation.o0 e.c cVar, @androidx.annotation.o0 h0 h0Var) {
        if (FragmentManager.W0(2)) {
            Objects.toString(h0Var.k());
        }
        a(cVar, e.b.ADDING, h0Var);
    }

    void c(@androidx.annotation.o0 h0 h0Var) {
        if (FragmentManager.W0(2)) {
            Objects.toString(h0Var.k());
        }
        a(e.c.GONE, e.b.NONE, h0Var);
    }

    void d(@androidx.annotation.o0 h0 h0Var) {
        if (FragmentManager.W0(2)) {
            Objects.toString(h0Var.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, h0Var);
    }

    void e(@androidx.annotation.o0 h0 h0Var) {
        if (FragmentManager.W0(2)) {
            Objects.toString(h0Var.k());
        }
        a(e.c.VISIBLE, e.b.NONE, h0Var);
    }

    abstract void f(@androidx.annotation.o0 List<e> list, boolean z4);

    void g() {
        if (this.f30101e) {
            return;
        }
        if (!x1.R0(this.f30097a)) {
            j();
            this.f30100d = false;
            return;
        }
        synchronized (this.f30098b) {
            try {
                if (!this.f30098b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f30099c);
                    this.f30099c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        if (FragmentManager.W0(2)) {
                            Objects.toString(eVar);
                        }
                        eVar.b();
                        if (!eVar.i()) {
                            this.f30099c.add(eVar);
                        }
                    }
                    q();
                    ArrayList arrayList2 = new ArrayList(this.f30098b);
                    this.f30098b.clear();
                    this.f30099c.addAll(arrayList2);
                    FragmentManager.W0(2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((e) it2.next()).l();
                    }
                    f(arrayList2, this.f30100d);
                    this.f30100d = false;
                    FragmentManager.W0(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void j() {
        FragmentManager.W0(2);
        boolean R0 = x1.R0(this.f30097a);
        synchronized (this.f30098b) {
            try {
                q();
                Iterator<e> it = this.f30098b.iterator();
                while (it.hasNext()) {
                    it.next().l();
                }
                Iterator it2 = new ArrayList(this.f30099c).iterator();
                while (it2.hasNext()) {
                    e eVar = (e) it2.next();
                    if (FragmentManager.W0(2)) {
                        if (!R0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Container ");
                            sb.append(this.f30097a);
                            sb.append(" is not attached to window. ");
                        }
                        Objects.toString(eVar);
                    }
                    eVar.b();
                }
                Iterator it3 = new ArrayList(this.f30098b).iterator();
                while (it3.hasNext()) {
                    e eVar2 = (e) it3.next();
                    if (FragmentManager.W0(2)) {
                        if (!R0) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Container ");
                            sb2.append(this.f30097a);
                            sb2.append(" is not attached to window. ");
                        }
                        Objects.toString(eVar2);
                    }
                    eVar2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void k() {
        if (this.f30101e) {
            FragmentManager.W0(2);
            this.f30101e = false;
            g();
        }
    }

    @androidx.annotation.q0
    e.b l(@androidx.annotation.o0 h0 h0Var) {
        e h4 = h(h0Var.k());
        e.b g4 = h4 != null ? h4.g() : null;
        e i4 = i(h0Var.k());
        return (i4 == null || !(g4 == null || g4 == e.b.NONE)) ? g4 : i4.g();
    }

    @androidx.annotation.o0
    public ViewGroup m() {
        return this.f30097a;
    }

    void p() {
        synchronized (this.f30098b) {
            try {
                q();
                this.f30101e = false;
                int size = this.f30098b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    e eVar = this.f30098b.get(size);
                    e.c from = e.c.from(eVar.f().mView);
                    e.c e4 = eVar.e();
                    e.c cVar = e.c.VISIBLE;
                    if (e4 == cVar && from != cVar) {
                        this.f30101e = eVar.f().isPostponed();
                        break;
                    }
                    size--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void r(boolean z4) {
        this.f30100d = z4;
    }

    /* compiled from: SpecialEffectsController.java */
    static class e {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.o0
        private c f30109a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.o0
        private b f30110b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.o0
        private final Fragment f30111c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.o0
        private final List<Runnable> f30112d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.o0
        private final HashSet<androidx.core.os.f> f30113e = new HashSet<>();

        /* renamed from: f, reason: collision with root package name */
        private boolean f30114f = false;

        /* renamed from: g, reason: collision with root package name */
        private boolean f30115g = false;

        /* compiled from: SpecialEffectsController.java */
        class a implements f.a {
            a() {
            }

            @Override // androidx.core.os.f.a
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

        e(@androidx.annotation.o0 c cVar, @androidx.annotation.o0 b bVar, @androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 androidx.core.os.f fVar) {
            this.f30109a = cVar;
            this.f30110b = bVar;
            this.f30111c = fragment;
            fVar.d(new a());
        }

        final void a(@androidx.annotation.o0 Runnable runnable) {
            this.f30112d.add(runnable);
        }

        final void b() {
            if (this.f30114f) {
                return;
            }
            this.f30114f = true;
            if (this.f30113e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.f30113e).iterator();
            while (it.hasNext()) {
                ((androidx.core.os.f) it.next()).a();
            }
        }

        @androidx.annotation.i
        public void c() {
            if (this.f30115g) {
                return;
            }
            if (FragmentManager.W0(2)) {
                toString();
            }
            this.f30115g = true;
            Iterator<Runnable> it = this.f30112d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        public final void d(@androidx.annotation.o0 androidx.core.os.f fVar) {
            if (this.f30113e.remove(fVar) && this.f30113e.isEmpty()) {
                c();
            }
        }

        @androidx.annotation.o0
        public c e() {
            return this.f30109a;
        }

        @androidx.annotation.o0
        public final Fragment f() {
            return this.f30111c;
        }

        @androidx.annotation.o0
        b g() {
            return this.f30110b;
        }

        final boolean h() {
            return this.f30114f;
        }

        final boolean i() {
            return this.f30115g;
        }

        public final void j(@androidx.annotation.o0 androidx.core.os.f fVar) {
            l();
            this.f30113e.add(fVar);
        }

        final void k(@androidx.annotation.o0 c cVar, @androidx.annotation.o0 b bVar) {
            int i4 = c.f30107b[bVar.ordinal()];
            if (i4 == 1) {
                if (this.f30109a == c.REMOVED) {
                    if (FragmentManager.W0(2)) {
                        Objects.toString(this.f30111c);
                        Objects.toString(this.f30110b);
                    }
                    this.f30109a = c.VISIBLE;
                    this.f30110b = b.ADDING;
                    return;
                }
                return;
            }
            if (i4 == 2) {
                if (FragmentManager.W0(2)) {
                    Objects.toString(this.f30111c);
                    Objects.toString(this.f30109a);
                    Objects.toString(this.f30110b);
                }
                this.f30109a = c.REMOVED;
                this.f30110b = b.REMOVING;
                return;
            }
            if (i4 == 3 && this.f30109a != c.REMOVED) {
                if (FragmentManager.W0(2)) {
                    Objects.toString(this.f30111c);
                    Objects.toString(this.f30109a);
                    Objects.toString(cVar);
                }
                this.f30109a = cVar;
            }
        }

        void l() {
        }

        @androidx.annotation.o0
        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f30109a + "} {mLifecycleImpact = " + this.f30110b + "} {mFragment = " + this.f30111c + "}";
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
                int i4 = c.f30106a[ordinal()];
                if (i4 == 1) {
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
                if (i4 == 2) {
                    if (FragmentManager.W0(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(0);
                } else if (i4 == 3) {
                    if (FragmentManager.W0(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(8);
                } else {
                    if (i4 != 4) {
                        return;
                    }
                    if (FragmentManager.W0(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(4);
                }
            }

            @androidx.annotation.o0
            static c from(int i4) {
                if (i4 == 0) {
                    return VISIBLE;
                }
                if (i4 == 4) {
                    return INVISIBLE;
                }
                if (i4 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException(android.support.v4.media.a.a("Unknown visibility ", i4));
            }
        }
    }
}
