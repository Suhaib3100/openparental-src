package androidx.core.view;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import androidx.core.view.n4;

/* compiled from: WindowInsetsControllerCompat.java */
/* loaded from: classes3.dex */
public final class n4 {

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f27326b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f27327c = 1;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f27328d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f27329e = 2;

    /* renamed from: a, reason: collision with root package name */
    private final g f27330a;

    /* compiled from: WindowInsetsControllerCompat.java */
    @androidx.annotation.x0(20)
    private static class a extends g {

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.o0
        protected final Window f27331b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.o0
        private final l1 f27332c;

        a(@androidx.annotation.o0 Window window, @androidx.annotation.o0 l1 l1Var) {
            this.f27331b = window;
            this.f27332c = l1Var;
        }

        private void l(int i4) {
            if (i4 == 1) {
                m(4);
            } else if (i4 == 2) {
                m(2);
            } else {
                if (i4 != 8) {
                    return;
                }
                this.f27332c.a();
            }
        }

        private void o(int i4) {
            if (i4 == 1) {
                p(4);
                q(1024);
            } else if (i4 == 2) {
                p(2);
            } else {
                if (i4 != 8) {
                    return;
                }
                this.f27332c.b();
            }
        }

        @Override // androidx.core.view.n4.g
        void a(h hVar) {
        }

        @Override // androidx.core.view.n4.g
        void b(int i4, long j4, Interpolator interpolator, CancellationSignal cancellationSignal, c3 c3Var) {
        }

        @Override // androidx.core.view.n4.g
        int c() {
            Object tag = this.f27331b.getDecorView().getTag(356039078);
            if (tag != null) {
                return ((Integer) tag).intValue();
            }
            return 1;
        }

        @Override // androidx.core.view.n4.g
        void d(int i4) {
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i4 & i5) != 0) {
                    l(i5);
                }
            }
        }

        @Override // androidx.core.view.n4.g
        void g(@androidx.annotation.o0 h hVar) {
        }

        @Override // androidx.core.view.n4.g
        void j(int i4) {
            this.f27331b.getDecorView().setTag(356039078, Integer.valueOf(i4));
            if (i4 == 0) {
                p(6144);
                return;
            }
            if (i4 == 1) {
                p(4096);
                m(2048);
            } else {
                if (i4 != 2) {
                    return;
                }
                p(2048);
                m(4096);
            }
        }

        @Override // androidx.core.view.n4.g
        void k(int i4) {
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i4 & i5) != 0) {
                    o(i5);
                }
            }
        }

        protected void m(int i4) {
            View decorView = this.f27331b.getDecorView();
            decorView.setSystemUiVisibility(i4 | decorView.getSystemUiVisibility());
        }

        protected void n(int i4) {
            this.f27331b.addFlags(i4);
        }

        protected void p(int i4) {
            View decorView = this.f27331b.getDecorView();
            decorView.setSystemUiVisibility((~i4) & decorView.getSystemUiVisibility());
        }

        protected void q(int i4) {
            this.f27331b.clearFlags(i4);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    @androidx.annotation.x0(23)
    private static class b extends a {
        b(@androidx.annotation.o0 Window window, @androidx.annotation.o0 l1 l1Var) {
            super(window, l1Var);
        }

        @Override // androidx.core.view.n4.g
        public boolean f() {
            return (this.f27331b.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.n4.g
        public void i(boolean z4) {
            if (!z4) {
                p(8192);
                return;
            }
            q(androidx.core.view.accessibility.b.f26943s);
            n(Integer.MIN_VALUE);
            m(8192);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    @androidx.annotation.x0(26)
    private static class c extends b {
        c(@androidx.annotation.o0 Window window, @androidx.annotation.o0 l1 l1Var) {
            super(window, l1Var);
        }

        @Override // androidx.core.view.n4.g
        public boolean e() {
            return (this.f27331b.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // androidx.core.view.n4.g
        public void h(boolean z4) {
            if (!z4) {
                p(16);
                return;
            }
            q(134217728);
            n(Integer.MIN_VALUE);
            m(16);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    @androidx.annotation.x0(31)
    private static class e extends d {
        e(@androidx.annotation.o0 Window window, @androidx.annotation.o0 n4 n4Var, @androidx.annotation.o0 l1 l1Var) {
            super(window, n4Var, l1Var);
        }

        @Override // androidx.core.view.n4.d, androidx.core.view.n4.g
        @SuppressLint({"WrongConstant"})
        int c() {
            int systemBarsBehavior;
            systemBarsBehavior = this.f27334c.getSystemBarsBehavior();
            return systemBarsBehavior;
        }

        @Override // androidx.core.view.n4.d, androidx.core.view.n4.g
        void j(int i4) {
            this.f27334c.setSystemBarsBehavior(i4);
        }

        e(@androidx.annotation.o0 WindowInsetsController windowInsetsController, @androidx.annotation.o0 n4 n4Var, @androidx.annotation.o0 l1 l1Var) {
            super(windowInsetsController, n4Var, l1Var);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    @androidx.annotation.x0(35)
    private static class f extends e {
        f(@androidx.annotation.o0 Window window, @androidx.annotation.o0 n4 n4Var, @androidx.annotation.o0 l1 l1Var) {
            super(window, n4Var, l1Var);
        }

        @Override // androidx.core.view.n4.d, androidx.core.view.n4.g
        public boolean e() {
            int systemBarsAppearance;
            systemBarsAppearance = this.f27334c.getSystemBarsAppearance();
            return (systemBarsAppearance & 16) != 0;
        }

        @Override // androidx.core.view.n4.d, androidx.core.view.n4.g
        public boolean f() {
            int systemBarsAppearance;
            systemBarsAppearance = this.f27334c.getSystemBarsAppearance();
            return (systemBarsAppearance & 8) != 0;
        }

        f(@androidx.annotation.o0 WindowInsetsController windowInsetsController, @androidx.annotation.o0 n4 n4Var, @androidx.annotation.o0 l1 l1Var) {
            super(windowInsetsController, n4Var, l1Var);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    private static class g {

        /* renamed from: a, reason: collision with root package name */
        static final int f27341a = 356039078;

        g() {
        }

        void a(h hVar) {
        }

        void b(int i4, long j4, Interpolator interpolator, CancellationSignal cancellationSignal, c3 c3Var) {
        }

        int c() {
            return 1;
        }

        void d(int i4) {
        }

        public boolean e() {
            return false;
        }

        public boolean f() {
            return false;
        }

        void g(@androidx.annotation.o0 h hVar) {
        }

        public void h(boolean z4) {
        }

        public void i(boolean z4) {
        }

        void j(int i4) {
        }

        void k(int i4) {
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    public interface h {
        void a(@androidx.annotation.o0 n4 n4Var, int i4);
    }

    @androidx.annotation.x0(30)
    @Deprecated
    private n4(@androidx.annotation.o0 WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f27330a = new f(windowInsetsController, this, new l1(windowInsetsController));
        } else {
            this.f27330a = new d(windowInsetsController, this, new l1(windowInsetsController));
        }
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(30)
    @Deprecated
    public static n4 l(@androidx.annotation.o0 WindowInsetsController windowInsetsController) {
        return new n4(windowInsetsController);
    }

    public void a(@androidx.annotation.o0 h hVar) {
        this.f27330a.a(hVar);
    }

    public void b(int i4, long j4, @androidx.annotation.q0 Interpolator interpolator, @androidx.annotation.q0 CancellationSignal cancellationSignal, @androidx.annotation.o0 c3 c3Var) {
        this.f27330a.b(i4, j4, interpolator, cancellationSignal, c3Var);
    }

    @SuppressLint({"WrongConstant"})
    public int c() {
        return this.f27330a.c();
    }

    public void d(int i4) {
        this.f27330a.d(i4);
    }

    public boolean e() {
        return this.f27330a.e();
    }

    public boolean f() {
        return this.f27330a.f();
    }

    public void g(@androidx.annotation.o0 h hVar) {
        this.f27330a.g(hVar);
    }

    public void h(boolean z4) {
        this.f27330a.h(z4);
    }

    public void i(boolean z4) {
        this.f27330a.i(z4);
    }

    public void j(int i4) {
        this.f27330a.j(i4);
    }

    public void k(int i4) {
        this.f27330a.k(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsControllerCompat.java */
    @androidx.annotation.x0(30)
    static class d extends g {

        /* renamed from: b, reason: collision with root package name */
        final n4 f27333b;

        /* renamed from: c, reason: collision with root package name */
        final WindowInsetsController f27334c;

        /* renamed from: d, reason: collision with root package name */
        final l1 f27335d;

        /* renamed from: e, reason: collision with root package name */
        private final androidx.collection.a3<h, WindowInsetsController.OnControllableInsetsChangedListener> f27336e;

        /* renamed from: f, reason: collision with root package name */
        protected Window f27337f;

        /* compiled from: WindowInsetsControllerCompat.java */
        class a implements WindowInsetsAnimationControlListener {

            /* renamed from: b, reason: collision with root package name */
            private i3 f27338b = null;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c3 f27339c;

            a(c3 c3Var) {
                this.f27339c = c3Var;
            }

            public void onCancelled(@androidx.annotation.q0 WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f27339c.a(windowInsetsAnimationController == null ? null : this.f27338b);
            }

            public void onFinished(@androidx.annotation.o0 WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f27339c.c(this.f27338b);
            }

            public void onReady(@androidx.annotation.o0 WindowInsetsAnimationController windowInsetsAnimationController, int i4) {
                i3 i3Var = new i3(windowInsetsAnimationController);
                this.f27338b = i3Var;
                this.f27339c.b(i3Var, i4);
            }
        }

        d(@androidx.annotation.o0 WindowInsetsController windowInsetsController, @androidx.annotation.o0 n4 n4Var, @androidx.annotation.o0 l1 l1Var) {
            this.f27336e = new androidx.collection.a3<>();
            this.f27334c = windowInsetsController;
            this.f27333b = n4Var;
            this.f27335d = l1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(h hVar, WindowInsetsController windowInsetsController, int i4) {
            if (this.f27334c == windowInsetsController) {
                hVar.a(this.f27333b, i4);
            }
        }

        @Override // androidx.core.view.n4.g
        void a(@androidx.annotation.o0 final h hVar) {
            if (this.f27336e.containsKey(hVar)) {
                return;
            }
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.u4
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i4) {
                    n4.d.this.m(hVar, windowInsetsController, i4);
                }
            };
            this.f27336e.put(hVar, onControllableInsetsChangedListener);
            this.f27334c.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        }

        @Override // androidx.core.view.n4.g
        void b(int i4, long j4, @androidx.annotation.q0 Interpolator interpolator, @androidx.annotation.q0 CancellationSignal cancellationSignal, @androidx.annotation.o0 c3 c3Var) {
            this.f27334c.controlWindowInsetsAnimation(i4, j4, interpolator, cancellationSignal, new a(c3Var));
        }

        @Override // androidx.core.view.n4.g
        @SuppressLint({"WrongConstant"})
        int c() {
            int systemBarsBehavior;
            Window window = this.f27337f;
            if (window == null) {
                systemBarsBehavior = this.f27334c.getSystemBarsBehavior();
                return systemBarsBehavior;
            }
            Object tag = window.getDecorView().getTag(356039078);
            if (tag != null) {
                return ((Integer) tag).intValue();
            }
            return 1;
        }

        @Override // androidx.core.view.n4.g
        void d(int i4) {
            if ((i4 & 8) != 0) {
                this.f27335d.a();
            }
            this.f27334c.hide(i4 & (-9));
        }

        @Override // androidx.core.view.n4.g
        public boolean e() {
            int systemBarsAppearance;
            this.f27334c.setSystemBarsAppearance(0, 0);
            systemBarsAppearance = this.f27334c.getSystemBarsAppearance();
            return (systemBarsAppearance & 16) != 0;
        }

        @Override // androidx.core.view.n4.g
        public boolean f() {
            int systemBarsAppearance;
            this.f27334c.setSystemBarsAppearance(0, 0);
            systemBarsAppearance = this.f27334c.getSystemBarsAppearance();
            return (systemBarsAppearance & 8) != 0;
        }

        @Override // androidx.core.view.n4.g
        void g(@androidx.annotation.o0 h hVar) {
            WindowInsetsController.OnControllableInsetsChangedListener a5 = s4.a(this.f27336e.remove(hVar));
            if (a5 != null) {
                this.f27334c.removeOnControllableInsetsChangedListener(a5);
            }
        }

        @Override // androidx.core.view.n4.g
        public void h(boolean z4) {
            if (z4) {
                if (this.f27337f != null) {
                    n(16);
                }
                this.f27334c.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f27337f != null) {
                    o(16);
                }
                this.f27334c.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.n4.g
        public void i(boolean z4) {
            if (z4) {
                if (this.f27337f != null) {
                    n(8192);
                }
                this.f27334c.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f27337f != null) {
                    o(8192);
                }
                this.f27334c.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.n4.g
        void j(int i4) {
            Window window = this.f27337f;
            if (window == null) {
                this.f27334c.setSystemBarsBehavior(i4);
                return;
            }
            window.getDecorView().setTag(356039078, Integer.valueOf(i4));
            if (i4 == 0) {
                o(6144);
                return;
            }
            if (i4 == 1) {
                o(4096);
                n(2048);
            } else {
                if (i4 != 2) {
                    return;
                }
                o(2048);
                n(4096);
            }
        }

        @Override // androidx.core.view.n4.g
        void k(int i4) {
            if ((i4 & 8) != 0) {
                this.f27335d.b();
            }
            this.f27334c.show(i4 & (-9));
        }

        protected void n(int i4) {
            View decorView = this.f27337f.getDecorView();
            decorView.setSystemUiVisibility(i4 | decorView.getSystemUiVisibility());
        }

        protected void o(int i4) {
            View decorView = this.f27337f.getDecorView();
            decorView.setSystemUiVisibility((~i4) & decorView.getSystemUiVisibility());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        d(@androidx.annotation.o0 android.view.Window r2, @androidx.annotation.o0 androidx.core.view.n4 r3, @androidx.annotation.o0 androidx.core.view.l1 r4) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = androidx.core.view.q4.a(r2)
                r1.<init>(r0, r3, r4)
                r1.f27337f = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.n4.d.<init>(android.view.Window, androidx.core.view.n4, androidx.core.view.l1):void");
        }
    }

    public n4(@androidx.annotation.o0 Window window, @androidx.annotation.o0 View view) {
        l1 l1Var = new l1(view);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 35) {
            this.f27330a = new f(window, this, l1Var);
            return;
        }
        if (i4 >= 30) {
            this.f27330a = new d(window, this, l1Var);
        } else if (i4 >= 26) {
            this.f27330a = new c(window, l1Var);
        } else {
            this.f27330a = new b(window, l1Var);
        }
    }
}
