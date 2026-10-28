package com.google.android.material.tabs;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* compiled from: TabLayoutMediator.java */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final TabLayout f54218a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final ViewPager2 f54219b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f54220c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f54221d;

    /* renamed from: e, reason: collision with root package name */
    private final b f54222e;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private RecyclerView.h<?> f54223f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f54224g;

    /* renamed from: h, reason: collision with root package name */
    @q0
    private C0816c f54225h;

    /* renamed from: i, reason: collision with root package name */
    @q0
    private TabLayout.f f54226i;

    /* renamed from: j, reason: collision with root package name */
    @q0
    private RecyclerView.j f54227j;

    /* compiled from: TabLayoutMediator.java */
    private class a extends RecyclerView.j {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            c.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i4, int i5) {
            c.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i4, int i5, @q0 Object obj) {
            c.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i4, int i5) {
            c.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i4, int i5, int i6) {
            c.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i4, int i5) {
            c.this.d();
        }
    }

    /* compiled from: TabLayoutMediator.java */
    public interface b {
        void a(@o0 TabLayout.i iVar, int i4);
    }

    /* compiled from: TabLayoutMediator.java */
    /* renamed from: com.google.android.material.tabs.c$c, reason: collision with other inner class name */
    private static class C0816c extends ViewPager2.j {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final WeakReference<TabLayout> f54229a;

        /* renamed from: b, reason: collision with root package name */
        private int f54230b;

        /* renamed from: c, reason: collision with root package name */
        private int f54231c;

        C0816c(TabLayout tabLayout) {
            this.f54229a = new WeakReference<>(tabLayout);
            a();
        }

        void a() {
            this.f54231c = 0;
            this.f54230b = 0;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void onPageScrollStateChanged(int i4) {
            this.f54230b = this.f54231c;
            this.f54231c = i4;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void onPageScrolled(int i4, float f4, int i5) {
            TabLayout tabLayout = this.f54229a.get();
            if (tabLayout != null) {
                int i6 = this.f54231c;
                tabLayout.j0(i4, f4, i6 != 2 || this.f54230b == 1, (i6 == 2 && this.f54230b == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void onPageSelected(int i4) {
            TabLayout tabLayout = this.f54229a.get();
            if (tabLayout == null || tabLayout.A() == i4 || i4 >= tabLayout.C()) {
                return;
            }
            int i5 = this.f54231c;
            tabLayout.b0(tabLayout.B(i4), i5 == 0 || (i5 == 2 && this.f54230b == 0));
        }
    }

    /* compiled from: TabLayoutMediator.java */
    private static class d implements TabLayout.f {

        /* renamed from: a, reason: collision with root package name */
        private final ViewPager2 f54232a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f54233b;

        d(ViewPager2 viewPager2, boolean z4) {
            this.f54232a = viewPager2;
            this.f54233b = z4;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@o0 TabLayout.i iVar) {
            this.f54232a.B(iVar.k(), this.f54233b);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.i iVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.i iVar) {
        }
    }

    public c(@o0 TabLayout tabLayout, @o0 ViewPager2 viewPager2, @o0 b bVar) {
        this(tabLayout, viewPager2, true, true, bVar);
    }

    public void a() {
        if (this.f54224g) {
            throw new IllegalStateException(ProtectedSandApp.s("\uf23c"));
        }
        RecyclerView.h<?> g4 = this.f54219b.g();
        this.f54223f = g4;
        if (g4 == null) {
            throw new IllegalStateException(ProtectedSandApp.s("\uf23b"));
        }
        this.f54224g = true;
        C0816c c0816c = new C0816c(this.f54218a);
        this.f54225h = c0816c;
        this.f54219b.u(c0816c);
        d dVar = new d(this.f54219b, this.f54221d);
        this.f54226i = dVar;
        this.f54218a.d(dVar);
        if (this.f54220c) {
            a aVar = new a();
            this.f54227j = aVar;
            this.f54223f.registerAdapterDataObserver(aVar);
        }
        d();
        this.f54218a.i0(this.f54219b.h(), 0.0f, true);
    }

    public void b() {
        RecyclerView.h<?> hVar;
        if (this.f54220c && (hVar = this.f54223f) != null) {
            hVar.unregisterAdapterDataObserver(this.f54227j);
            this.f54227j = null;
        }
        this.f54218a.W(this.f54226i);
        this.f54219b.K(this.f54225h);
        this.f54226i = null;
        this.f54225h = null;
        this.f54223f = null;
        this.f54224g = false;
    }

    public boolean c() {
        return this.f54224g;
    }

    void d() {
        this.f54218a.U();
        RecyclerView.h<?> hVar = this.f54223f;
        if (hVar != null) {
            int itemCount = hVar.getItemCount();
            for (int i4 = 0; i4 < itemCount; i4++) {
                TabLayout.i R = this.f54218a.R();
                this.f54222e.a(R, i4);
                this.f54218a.h(R, false);
            }
            if (itemCount > 0) {
                int min = Math.min(this.f54219b.h(), this.f54218a.C() - 1);
                if (min != this.f54218a.A()) {
                    TabLayout tabLayout = this.f54218a;
                    tabLayout.a0(tabLayout.B(min));
                }
            }
        }
    }

    public c(@o0 TabLayout tabLayout, @o0 ViewPager2 viewPager2, boolean z4, @o0 b bVar) {
        this(tabLayout, viewPager2, z4, true, bVar);
    }

    public c(@o0 TabLayout tabLayout, @o0 ViewPager2 viewPager2, boolean z4, boolean z5, @o0 b bVar) {
        this.f54218a = tabLayout;
        this.f54219b = viewPager2;
        this.f54220c = z4;
        this.f54221d = z5;
        this.f54222e = bVar;
    }
}
