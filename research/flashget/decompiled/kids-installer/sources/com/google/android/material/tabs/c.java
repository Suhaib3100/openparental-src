package com.google.android.material.tabs;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* compiled from: TabLayoutMediator.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final TabLayout f14363a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final ViewPager2 f14364b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14365c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f14366d;

    /* renamed from: e, reason: collision with root package name */
    private final b f14367e;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private RecyclerView.h<?> f14368f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14369g;

    /* renamed from: h, reason: collision with root package name */
    @q0
    private C0182c f14370h;

    /* renamed from: i, reason: collision with root package name */
    @q0
    private TabLayout.f f14371i;

    /* renamed from: j, reason: collision with root package name */
    @q0
    private RecyclerView.j f14372j;

    /* compiled from: TabLayoutMediator.java */
    /* loaded from: classes3.dex */
    private class a extends RecyclerView.j {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            c.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i5, int i6) {
            c.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i5, int i6, @q0 Object obj) {
            c.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i5, int i6) {
            c.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i5, int i6, int i7) {
            c.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i5, int i6) {
            c.this.d();
        }
    }

    /* compiled from: TabLayoutMediator.java */
    public interface b {
        void a(@o0 TabLayout.i iVar, int i5);
    }

    /* compiled from: TabLayoutMediator.java */
    /* renamed from: com.google.android.material.tabs.c$c, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static class C0182c extends ViewPager2.j {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final WeakReference<TabLayout> f14374a;

        /* renamed from: b, reason: collision with root package name */
        private int f14375b;

        /* renamed from: c, reason: collision with root package name */
        private int f14376c;

        C0182c(TabLayout tabLayout) {
            this.f14374a = new WeakReference<>(tabLayout);
            d();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void a(int i5) {
            this.f14375b = this.f14376c;
            this.f14376c = i5;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void b(int i5, float f6, int i6) {
            TabLayout tabLayout = this.f14374a.get();
            if (tabLayout != null) {
                int i7 = this.f14376c;
                tabLayout.j0(i5, f6, i7 != 2 || this.f14375b == 1, (i7 == 2 && this.f14375b == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void c(int i5) {
            TabLayout tabLayout = this.f14374a.get();
            if (tabLayout == null || tabLayout.A() == i5 || i5 >= tabLayout.C()) {
                return;
            }
            int i6 = this.f14376c;
            tabLayout.b0(tabLayout.B(i5), i6 == 0 || (i6 == 2 && this.f14375b == 0));
        }

        void d() {
            this.f14376c = 0;
            this.f14375b = 0;
        }
    }

    /* compiled from: TabLayoutMediator.java */
    /* loaded from: classes3.dex */
    private static class d implements TabLayout.f {

        /* renamed from: a, reason: collision with root package name */
        private final ViewPager2 f14377a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f14378b;

        d(ViewPager2 viewPager2, boolean z5) {
            this.f14377a = viewPager2;
            this.f14378b = z5;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.i iVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(@o0 TabLayout.i iVar) {
            this.f14377a.B(iVar.k(), this.f14378b);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.i iVar) {
        }
    }

    public c(@o0 TabLayout tabLayout, @o0 ViewPager2 viewPager2, @o0 b bVar) {
        this(tabLayout, viewPager2, true, bVar);
    }

    public void a() {
        if (this.f14369g) {
            throw new IllegalStateException(ProtectedSandApp.s("ቾ"));
        }
        RecyclerView.h<?> g5 = this.f14364b.g();
        this.f14368f = g5;
        if (g5 == null) {
            throw new IllegalStateException(ProtectedSandApp.s("ች"));
        }
        this.f14369g = true;
        C0182c c0182c = new C0182c(this.f14363a);
        this.f14370h = c0182c;
        this.f14364b.u(c0182c);
        d dVar = new d(this.f14364b, this.f14366d);
        this.f14371i = dVar;
        this.f14363a.d(dVar);
        if (this.f14365c) {
            a aVar = new a();
            this.f14372j = aVar;
            this.f14368f.F(aVar);
        }
        d();
        this.f14363a.i0(this.f14364b.h(), 0.0f, true);
    }

    public void b() {
        RecyclerView.h<?> hVar;
        if (this.f14365c && (hVar = this.f14368f) != null) {
            hVar.I(this.f14372j);
            this.f14372j = null;
        }
        this.f14363a.W(this.f14371i);
        this.f14364b.K(this.f14370h);
        this.f14371i = null;
        this.f14370h = null;
        this.f14368f = null;
        this.f14369g = false;
    }

    public boolean c() {
        return this.f14369g;
    }

    void d() {
        this.f14363a.U();
        RecyclerView.h<?> hVar = this.f14368f;
        if (hVar != null) {
            int g5 = hVar.g();
            for (int i5 = 0; i5 < g5; i5++) {
                TabLayout.i R = this.f14363a.R();
                this.f14367e.a(R, i5);
                this.f14363a.h(R, false);
            }
            if (g5 > 0) {
                int min = Math.min(this.f14364b.h(), this.f14363a.C() - 1);
                if (min != this.f14363a.A()) {
                    TabLayout tabLayout = this.f14363a;
                    tabLayout.a0(tabLayout.B(min));
                }
            }
        }
    }

    public c(@o0 TabLayout tabLayout, @o0 ViewPager2 viewPager2, boolean z5, @o0 b bVar) {
        this(tabLayout, viewPager2, z5, true, bVar);
    }

    public c(@o0 TabLayout tabLayout, @o0 ViewPager2 viewPager2, boolean z5, boolean z6, @o0 b bVar) {
        this.f14363a = tabLayout;
        this.f14364b = viewPager2;
        this.f14365c = z5;
        this.f14366d = z6;
        this.f14367e = bVar;
    }
}
