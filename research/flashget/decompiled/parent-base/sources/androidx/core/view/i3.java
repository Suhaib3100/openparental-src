package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.view.WindowInsetsAnimationController;

/* compiled from: WindowInsetsAnimationControllerCompat.java */
/* loaded from: classes3.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    private final b f27229a;

    /* compiled from: WindowInsetsAnimationControllerCompat.java */
    @androidx.annotation.x0(30)
    private static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final WindowInsetsAnimationController f27230a;

        a(@androidx.annotation.o0 WindowInsetsAnimationController windowInsetsAnimationController) {
            this.f27230a = windowInsetsAnimationController;
        }

        @Override // androidx.core.view.i3.b
        void a(boolean z4) {
            this.f27230a.finish(z4);
        }

        @Override // androidx.core.view.i3.b
        public float b() {
            float currentAlpha;
            currentAlpha = this.f27230a.getCurrentAlpha();
            return currentAlpha;
        }

        @Override // androidx.core.view.i3.b
        public float c() {
            float currentFraction;
            currentFraction = this.f27230a.getCurrentFraction();
            return currentFraction;
        }

        @Override // androidx.core.view.i3.b
        @androidx.annotation.o0
        public androidx.core.graphics.e0 d() {
            Insets currentInsets;
            currentInsets = this.f27230a.getCurrentInsets();
            return androidx.core.graphics.e0.g(currentInsets);
        }

        @Override // androidx.core.view.i3.b
        @androidx.annotation.o0
        public androidx.core.graphics.e0 e() {
            Insets hiddenStateInsets;
            hiddenStateInsets = this.f27230a.getHiddenStateInsets();
            return androidx.core.graphics.e0.g(hiddenStateInsets);
        }

        @Override // androidx.core.view.i3.b
        @androidx.annotation.o0
        public androidx.core.graphics.e0 f() {
            Insets shownStateInsets;
            shownStateInsets = this.f27230a.getShownStateInsets();
            return androidx.core.graphics.e0.g(shownStateInsets);
        }

        @Override // androidx.core.view.i3.b
        @SuppressLint({"WrongConstant"})
        public int g() {
            int types;
            types = this.f27230a.getTypes();
            return types;
        }

        @Override // androidx.core.view.i3.b
        boolean h() {
            boolean isCancelled;
            isCancelled = this.f27230a.isCancelled();
            return isCancelled;
        }

        @Override // androidx.core.view.i3.b
        boolean i() {
            boolean isFinished;
            isFinished = this.f27230a.isFinished();
            return isFinished;
        }

        @Override // androidx.core.view.i3.b
        public void j(@androidx.annotation.q0 androidx.core.graphics.e0 e0Var, float f4, float f5) {
            this.f27230a.setInsetsAndAlpha(e0Var == null ? null : e0Var.h(), f4, f5);
        }
    }

    /* compiled from: WindowInsetsAnimationControllerCompat.java */
    private static class b {
        b() {
        }

        void a(boolean z4) {
        }

        public float b() {
            return 0.0f;
        }

        @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f60679p, to = 1.0d)
        public float c() {
            return 0.0f;
        }

        @androidx.annotation.o0
        public androidx.core.graphics.e0 d() {
            return androidx.core.graphics.e0.f26244e;
        }

        @androidx.annotation.o0
        public androidx.core.graphics.e0 e() {
            return androidx.core.graphics.e0.f26244e;
        }

        @androidx.annotation.o0
        public androidx.core.graphics.e0 f() {
            return androidx.core.graphics.e0.f26244e;
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

        public void j(@androidx.annotation.q0 androidx.core.graphics.e0 e0Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f4, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f5) {
        }
    }

    @androidx.annotation.x0(30)
    i3(@androidx.annotation.o0 WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f27229a = new a(windowInsetsAnimationController);
    }

    public void a(boolean z4) {
        this.f27229a.a(z4);
    }

    public float b() {
        return this.f27229a.b();
    }

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f60679p, to = 1.0d)
    public float c() {
        return this.f27229a.c();
    }

    @androidx.annotation.o0
    public androidx.core.graphics.e0 d() {
        return this.f27229a.d();
    }

    @androidx.annotation.o0
    public androidx.core.graphics.e0 e() {
        return this.f27229a.e();
    }

    @androidx.annotation.o0
    public androidx.core.graphics.e0 f() {
        return this.f27229a.f();
    }

    public int g() {
        return this.f27229a.g();
    }

    public boolean h() {
        return this.f27229a.h();
    }

    public boolean i() {
        return this.f27229a.i();
    }

    public boolean j() {
        return (this.f27229a.i() || this.f27229a.h()) ? false : true;
    }

    public void k(@androidx.annotation.q0 androidx.core.graphics.e0 e0Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f4, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f5) {
        this.f27229a.j(e0Var, f4, f5);
    }
}
