package androidx.core.view;

import android.R;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.z5;

/* compiled from: WindowInsetsControllerCompat.java */
/* loaded from: classes.dex */
public final class z5 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f5816b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f5817c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f5818d = 2;

    /* renamed from: a, reason: collision with root package name */
    private final e f5819a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsControllerCompat.java */
    @androidx.annotation.x0(20)
    /* loaded from: classes3.dex */
    static class a extends e {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.o0
        protected final Window f5820a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.o0
        private final View f5821b;

        a(@androidx.annotation.o0 Window window, @androidx.annotation.o0 View view) {
            this.f5820a = window;
            this.f5821b = view;
        }

        private void m(int i5) {
            if (i5 == 1) {
                o(4);
            } else if (i5 == 2) {
                o(2);
            } else {
                if (i5 != 8) {
                    return;
                }
                ((InputMethodManager) this.f5820a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f5820a.getDecorView().getWindowToken(), 0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void n(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        private void q(int i5) {
            if (i5 == 1) {
                r(4);
                s(1024);
                return;
            }
            if (i5 == 2) {
                r(2);
                return;
            }
            if (i5 != 8) {
                return;
            }
            final View view = this.f5821b;
            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                view.requestFocus();
            } else {
                view = this.f5820a.getCurrentFocus();
            }
            if (view == null) {
                view = this.f5820a.findViewById(R.id.content);
            }
            if (view == null || !view.hasWindowFocus()) {
                return;
            }
            view.post(new Runnable() { // from class: androidx.core.view.y5
                @Override // java.lang.Runnable
                public final void run() {
                    z5.a.n(view);
                }
            });
        }

        @Override // androidx.core.view.z5.e
        void a(f fVar) {
        }

        @Override // androidx.core.view.z5.e
        void b(int i5, long j5, Interpolator interpolator, CancellationSignal cancellationSignal, i4 i4Var) {
        }

        @Override // androidx.core.view.z5.e
        int c() {
            return 0;
        }

        @Override // androidx.core.view.z5.e
        void d(int i5) {
            for (int i6 = 1; i6 <= 256; i6 <<= 1) {
                if ((i5 & i6) != 0) {
                    m(i6);
                }
            }
        }

        @Override // androidx.core.view.z5.e
        void g(@androidx.annotation.o0 f fVar) {
        }

        @Override // androidx.core.view.z5.e
        void j(int i5) {
            if (i5 == 0) {
                r(6144);
                return;
            }
            if (i5 == 1) {
                r(4096);
                o(2048);
            } else {
                if (i5 != 2) {
                    return;
                }
                r(2048);
                o(4096);
            }
        }

        @Override // androidx.core.view.z5.e
        void k(int i5) {
            for (int i6 = 1; i6 <= 256; i6 <<= 1) {
                if ((i5 & i6) != 0) {
                    q(i6);
                }
            }
        }

        protected void o(int i5) {
            View decorView = this.f5820a.getDecorView();
            decorView.setSystemUiVisibility(i5 | decorView.getSystemUiVisibility());
        }

        protected void p(int i5) {
            this.f5820a.addFlags(i5);
        }

        protected void r(int i5) {
            View decorView = this.f5820a.getDecorView();
            decorView.setSystemUiVisibility((~i5) & decorView.getSystemUiVisibility());
        }

        protected void s(int i5) {
            this.f5820a.clearFlags(i5);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    @androidx.annotation.x0(23)
    /* loaded from: classes3.dex */
    private static class b extends a {
        b(@androidx.annotation.o0 Window window, @androidx.annotation.q0 View view) {
            super(window, view);
        }

        @Override // androidx.core.view.z5.e
        public boolean f() {
            return (this.f5820a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.z5.e
        public void i(boolean z5) {
            if (!z5) {
                r(8192);
                return;
            }
            s(67108864);
            p(Integer.MIN_VALUE);
            o(8192);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    @androidx.annotation.x0(26)
    /* loaded from: classes3.dex */
    private static class c extends b {
        c(@androidx.annotation.o0 Window window, @androidx.annotation.q0 View view) {
            super(window, view);
        }

        @Override // androidx.core.view.z5.e
        public boolean e() {
            return (this.f5820a.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // androidx.core.view.z5.e
        public void h(boolean z5) {
            if (!z5) {
                r(16);
                return;
            }
            s(134217728);
            p(Integer.MIN_VALUE);
            o(16);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    private static class e {
        e() {
        }

        void a(f fVar) {
        }

        void b(int i5, long j5, Interpolator interpolator, CancellationSignal cancellationSignal, i4 i4Var) {
        }

        int c() {
            return 0;
        }

        void d(int i5) {
        }

        public boolean e() {
            return false;
        }

        public boolean f() {
            return false;
        }

        void g(@androidx.annotation.o0 f fVar) {
        }

        public void h(boolean z5) {
        }

        public void i(boolean z5) {
        }

        void j(int i5) {
        }

        void k(int i5) {
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    public interface f {
        void a(@androidx.annotation.o0 z5 z5Var, int i5);
    }

    @androidx.annotation.x0(30)
    @Deprecated
    private z5(@androidx.annotation.o0 WindowInsetsController windowInsetsController) {
        this.f5819a = new d(windowInsetsController, this);
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(30)
    @Deprecated
    public static z5 l(@androidx.annotation.o0 WindowInsetsController windowInsetsController) {
        return new z5(windowInsetsController);
    }

    public void a(@androidx.annotation.o0 f fVar) {
        this.f5819a.a(fVar);
    }

    public void b(int i5, long j5, @androidx.annotation.q0 Interpolator interpolator, @androidx.annotation.q0 CancellationSignal cancellationSignal, @androidx.annotation.o0 i4 i4Var) {
        this.f5819a.b(i5, j5, interpolator, cancellationSignal, i4Var);
    }

    @SuppressLint({"WrongConstant"})
    public int c() {
        return this.f5819a.c();
    }

    public void d(int i5) {
        this.f5819a.d(i5);
    }

    public boolean e() {
        return this.f5819a.e();
    }

    public boolean f() {
        return this.f5819a.f();
    }

    public void g(@androidx.annotation.o0 f fVar) {
        this.f5819a.g(fVar);
    }

    public void h(boolean z5) {
        this.f5819a.h(z5);
    }

    public void i(boolean z5) {
        this.f5819a.i(z5);
    }

    public void j(int i5) {
        this.f5819a.j(i5);
    }

    public void k(int i5) {
        this.f5819a.k(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsControllerCompat.java */
    @androidx.annotation.x0(30)
    /* loaded from: classes3.dex */
    static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final z5 f5822a;

        /* renamed from: b, reason: collision with root package name */
        final WindowInsetsController f5823b;

        /* renamed from: c, reason: collision with root package name */
        private final androidx.collection.i<f, WindowInsetsController.OnControllableInsetsChangedListener> f5824c;

        /* renamed from: d, reason: collision with root package name */
        protected Window f5825d;

        /* compiled from: WindowInsetsControllerCompat.java */
        /* loaded from: classes.dex */
        class a implements WindowInsetsAnimationControlListener {

            /* renamed from: a, reason: collision with root package name */
            private u4 f5826a = null;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ i4 f5827b;

            a(i4 i4Var) {
                this.f5827b = i4Var;
            }

            @Override // android.view.WindowInsetsAnimationControlListener
            public void onCancelled(@androidx.annotation.q0 WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f5827b.a(windowInsetsAnimationController == null ? null : this.f5826a);
            }

            @Override // android.view.WindowInsetsAnimationControlListener
            public void onFinished(@androidx.annotation.o0 WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f5827b.c(this.f5826a);
            }

            @Override // android.view.WindowInsetsAnimationControlListener
            public void onReady(@androidx.annotation.o0 WindowInsetsAnimationController windowInsetsAnimationController, int i5) {
                u4 u4Var = new u4(windowInsetsAnimationController);
                this.f5826a = u4Var;
                this.f5827b.b(u4Var, i5);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        d(@androidx.annotation.o0 android.view.Window r2, @androidx.annotation.o0 androidx.core.view.z5 r3) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = androidx.core.view.i6.a(r2)
                r1.<init>(r0, r3)
                r1.f5825d = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.z5.d.<init>(android.view.Window, androidx.core.view.z5):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(f fVar, WindowInsetsController windowInsetsController, int i5) {
            if (this.f5823b == windowInsetsController) {
                fVar.a(this.f5822a, i5);
            }
        }

        @Override // androidx.core.view.z5.e
        void a(@androidx.annotation.o0 final f fVar) {
            if (this.f5824c.containsKey(fVar)) {
                return;
            }
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.k6
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i5) {
                    z5.d.this.m(fVar, windowInsetsController, i5);
                }
            };
            this.f5824c.put(fVar, onControllableInsetsChangedListener);
            this.f5823b.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        }

        @Override // androidx.core.view.z5.e
        void b(int i5, long j5, @androidx.annotation.q0 Interpolator interpolator, @androidx.annotation.q0 CancellationSignal cancellationSignal, @androidx.annotation.o0 i4 i4Var) {
            this.f5823b.controlWindowInsetsAnimation(i5, j5, interpolator, cancellationSignal, new a(i4Var));
        }

        @Override // androidx.core.view.z5.e
        @SuppressLint({"WrongConstant"})
        int c() {
            int systemBarsBehavior;
            systemBarsBehavior = this.f5823b.getSystemBarsBehavior();
            return systemBarsBehavior;
        }

        @Override // androidx.core.view.z5.e
        void d(int i5) {
            this.f5823b.hide(i5);
        }

        @Override // androidx.core.view.z5.e
        public boolean e() {
            int systemBarsAppearance;
            systemBarsAppearance = this.f5823b.getSystemBarsAppearance();
            return (systemBarsAppearance & 16) != 0;
        }

        @Override // androidx.core.view.z5.e
        public boolean f() {
            int systemBarsAppearance;
            systemBarsAppearance = this.f5823b.getSystemBarsAppearance();
            return (systemBarsAppearance & 8) != 0;
        }

        @Override // androidx.core.view.z5.e
        void g(@androidx.annotation.o0 f fVar) {
            WindowInsetsController.OnControllableInsetsChangedListener remove = this.f5824c.remove(fVar);
            if (remove != null) {
                this.f5823b.removeOnControllableInsetsChangedListener(remove);
            }
        }

        @Override // androidx.core.view.z5.e
        public void h(boolean z5) {
            if (z5) {
                if (this.f5825d != null) {
                    n(16);
                }
                this.f5823b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f5825d != null) {
                    o(16);
                }
                this.f5823b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.z5.e
        public void i(boolean z5) {
            if (z5) {
                if (this.f5825d != null) {
                    n(8192);
                }
                this.f5823b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f5825d != null) {
                    o(8192);
                }
                this.f5823b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.z5.e
        void j(int i5) {
            this.f5823b.setSystemBarsBehavior(i5);
        }

        @Override // androidx.core.view.z5.e
        void k(int i5) {
            Window window = this.f5825d;
            if (window != null && (i5 & 8) != 0 && Build.VERSION.SDK_INT < 32) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.f5823b.show(i5);
        }

        protected void n(int i5) {
            View decorView = this.f5825d.getDecorView();
            decorView.setSystemUiVisibility(i5 | decorView.getSystemUiVisibility());
        }

        protected void o(int i5) {
            View decorView = this.f5825d.getDecorView();
            decorView.setSystemUiVisibility((~i5) & decorView.getSystemUiVisibility());
        }

        d(@androidx.annotation.o0 WindowInsetsController windowInsetsController, @androidx.annotation.o0 z5 z5Var) {
            this.f5824c = new androidx.collection.i<>();
            this.f5823b = windowInsetsController;
            this.f5822a = z5Var;
        }
    }

    public z5(@androidx.annotation.o0 Window window, @androidx.annotation.o0 View view) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            this.f5819a = new d(window, this);
        } else if (i5 >= 26) {
            this.f5819a = new c(window, view);
        } else {
            this.f5819a = new b(window, view);
        }
    }
}
