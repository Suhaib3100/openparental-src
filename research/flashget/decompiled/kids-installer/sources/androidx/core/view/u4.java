package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.view.WindowInsetsAnimationController;

/* compiled from: WindowInsetsAnimationControllerCompat.java */
/* loaded from: classes.dex */
public final class u4 {

    /* renamed from: a, reason: collision with root package name */
    private final b f5685a;

    /* compiled from: WindowInsetsAnimationControllerCompat.java */
    @androidx.annotation.x0(30)
    /* loaded from: classes3.dex */
    private static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final WindowInsetsAnimationController f5686a;

        a(@androidx.annotation.o0 WindowInsetsAnimationController windowInsetsAnimationController) {
            this.f5686a = windowInsetsAnimationController;
        }

        @Override // androidx.core.view.u4.b
        void a(boolean z5) {
            this.f5686a.finish(z5);
        }

        @Override // androidx.core.view.u4.b
        public float b() {
            float currentAlpha;
            currentAlpha = this.f5686a.getCurrentAlpha();
            return currentAlpha;
        }

        @Override // androidx.core.view.u4.b
        public float c() {
            float currentFraction;
            currentFraction = this.f5686a.getCurrentFraction();
            return currentFraction;
        }

        @Override // androidx.core.view.u4.b
        @androidx.annotation.o0
        public androidx.core.graphics.w1 d() {
            Insets currentInsets;
            currentInsets = this.f5686a.getCurrentInsets();
            return androidx.core.graphics.w1.g(currentInsets);
        }

        @Override // androidx.core.view.u4.b
        @androidx.annotation.o0
        public androidx.core.graphics.w1 e() {
            Insets hiddenStateInsets;
            hiddenStateInsets = this.f5686a.getHiddenStateInsets();
            return androidx.core.graphics.w1.g(hiddenStateInsets);
        }

        @Override // androidx.core.view.u4.b
        @androidx.annotation.o0
        public androidx.core.graphics.w1 f() {
            Insets shownStateInsets;
            shownStateInsets = this.f5686a.getShownStateInsets();
            return androidx.core.graphics.w1.g(shownStateInsets);
        }

        @Override // androidx.core.view.u4.b
        @SuppressLint({"WrongConstant"})
        public int g() {
            int types;
            types = this.f5686a.getTypes();
            return types;
        }

        @Override // androidx.core.view.u4.b
        boolean h() {
            boolean isCancelled;
            isCancelled = this.f5686a.isCancelled();
            return isCancelled;
        }

        @Override // androidx.core.view.u4.b
        boolean i() {
            boolean isFinished;
            isFinished = this.f5686a.isFinished();
            return isFinished;
        }

        @Override // androidx.core.view.u4.b
        public boolean j() {
            boolean isReady;
            isReady = this.f5686a.isReady();
            return isReady;
        }

        @Override // androidx.core.view.u4.b
        public void k(@androidx.annotation.q0 androidx.core.graphics.w1 w1Var, float f6, float f7) {
            this.f5686a.setInsetsAndAlpha(w1Var == null ? null : w1Var.h(), f6, f7);
        }
    }

    /* compiled from: WindowInsetsAnimationControllerCompat.java */
    private static class b {
        b() {
        }

        void a(boolean z5) {
        }

        public float b() {
            return 0.0f;
        }

        @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f18289o, to = 1.0d)
        public float c() {
            return 0.0f;
        }

        @androidx.annotation.o0
        public androidx.core.graphics.w1 d() {
            return androidx.core.graphics.w1.f4812e;
        }

        @androidx.annotation.o0
        public androidx.core.graphics.w1 e() {
            return androidx.core.graphics.w1.f4812e;
        }

        @androidx.annotation.o0
        public androidx.core.graphics.w1 f() {
            return androidx.core.graphics.w1.f4812e;
        }

        public int g() {
            return 0;
        }

        boolean h() {
            return true;
        }

        boolean i() {
            return false;
        }

        public boolean j() {
            return false;
        }

        public void k(@androidx.annotation.q0 androidx.core.graphics.w1 w1Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f6, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f7) {
        }
    }

    @androidx.annotation.x0(30)
    u4(@androidx.annotation.o0 WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f5685a = new a(windowInsetsAnimationController);
    }

    public void a(boolean z5) {
        this.f5685a.a(z5);
    }

    public float b() {
        return this.f5685a.b();
    }

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f18289o, to = 1.0d)
    public float c() {
        return this.f5685a.c();
    }

    @androidx.annotation.o0
    public androidx.core.graphics.w1 d() {
        return this.f5685a.d();
    }

    @androidx.annotation.o0
    public androidx.core.graphics.w1 e() {
        return this.f5685a.e();
    }

    @androidx.annotation.o0
    public androidx.core.graphics.w1 f() {
        return this.f5685a.f();
    }

    public int g() {
        return this.f5685a.g();
    }

    public boolean h() {
        return this.f5685a.h();
    }

    public boolean i() {
        return this.f5685a.i();
    }

    public boolean j() {
        return (i() || h()) ? false : true;
    }

    public void k(@androidx.annotation.q0 androidx.core.graphics.w1 w1Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f6, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f7) {
        this.f5685a.k(w1Var, f6, f7);
    }
}
