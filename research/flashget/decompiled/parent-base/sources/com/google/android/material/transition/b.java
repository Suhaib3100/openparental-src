package com.google.android.material.transition;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: FadeModeEvaluators.java */
/* loaded from: classes6.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.android.material.transition.a f54545a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.android.material.transition.a f54546b = new C0823b();

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.android.material.transition.a f54547c = new c();

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.android.material.transition.a f54548d = new d();

    /* compiled from: FadeModeEvaluators.java */
    static class a implements com.google.android.material.transition.a {
        a() {
        }

        @Override // com.google.android.material.transition.a
        public com.google.android.material.transition.c a(float f4, float f5, float f6, float f7) {
            return com.google.android.material.transition.c.a(255, u.q(0, 255, f5, f6, f4));
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    /* renamed from: com.google.android.material.transition.b$b, reason: collision with other inner class name */
    static class C0823b implements com.google.android.material.transition.a {
        C0823b() {
        }

        @Override // com.google.android.material.transition.a
        public com.google.android.material.transition.c a(float f4, float f5, float f6, float f7) {
            return com.google.android.material.transition.c.b(u.q(255, 0, f5, f6, f4), 255);
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    static class c implements com.google.android.material.transition.a {
        c() {
        }

        @Override // com.google.android.material.transition.a
        public com.google.android.material.transition.c a(float f4, float f5, float f6, float f7) {
            return com.google.android.material.transition.c.b(u.q(255, 0, f5, f6, f4), u.q(0, 255, f5, f6, f4));
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    static class d implements com.google.android.material.transition.a {
        d() {
        }

        @Override // com.google.android.material.transition.a
        public com.google.android.material.transition.c a(float f4, float f5, float f6, float f7) {
            float a5 = androidx.appcompat.graphics.drawable.d.a(f6, f5, f7, f5);
            return com.google.android.material.transition.c.b(u.q(255, 0, f5, a5, f4), u.q(0, 255, a5, f6, f4));
        }
    }

    private b() {
    }

    static com.google.android.material.transition.a a(int i4, boolean z4) {
        if (i4 == 0) {
            return z4 ? f54545a : f54546b;
        }
        if (i4 == 1) {
            return z4 ? f54546b : f54545a;
        }
        if (i4 == 2) {
            return f54547c;
        }
        if (i4 == 3) {
            return f54548d;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("\uf286"), i4));
    }
}
