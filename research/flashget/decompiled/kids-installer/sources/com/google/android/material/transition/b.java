package com.google.android.material.transition;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: FadeModeEvaluators.java */
/* loaded from: classes2.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.android.material.transition.a f14706a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.android.material.transition.a f14707b = new C0189b();

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.android.material.transition.a f14708c = new c();

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.android.material.transition.a f14709d = new d();

    /* compiled from: FadeModeEvaluators.java */
    /* loaded from: classes3.dex */
    static class a implements com.google.android.material.transition.a {
        a() {
        }

        @Override // com.google.android.material.transition.a
        public com.google.android.material.transition.c a(float f6, float f7, float f8, float f9) {
            return com.google.android.material.transition.c.a(255, u.q(0, 255, f7, f8, f6));
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    /* renamed from: com.google.android.material.transition.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0189b implements com.google.android.material.transition.a {
        C0189b() {
        }

        @Override // com.google.android.material.transition.a
        public com.google.android.material.transition.c a(float f6, float f7, float f8, float f9) {
            return com.google.android.material.transition.c.b(u.q(255, 0, f7, f8, f6), 255);
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    /* loaded from: classes3.dex */
    static class c implements com.google.android.material.transition.a {
        c() {
        }

        @Override // com.google.android.material.transition.a
        public com.google.android.material.transition.c a(float f6, float f7, float f8, float f9) {
            return com.google.android.material.transition.c.b(u.q(255, 0, f7, f8, f6), u.q(0, 255, f7, f8, f6));
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    /* loaded from: classes3.dex */
    static class d implements com.google.android.material.transition.a {
        d() {
        }

        @Override // com.google.android.material.transition.a
        public com.google.android.material.transition.c a(float f6, float f7, float f8, float f9) {
            float a6 = androidx.appcompat.graphics.drawable.d.a(f8, f7, f9, f7);
            return com.google.android.material.transition.c.b(u.q(255, 0, f7, a6, f6), u.q(0, 255, a6, f8, f6));
        }
    }

    private b() {
    }

    static com.google.android.material.transition.a a(int i5, boolean z5) {
        if (i5 == 0) {
            return z5 ? f14706a : f14707b;
        }
        if (i5 == 1) {
            return z5 ? f14707b : f14706a;
        }
        if (i5 == 2) {
            return f14708c;
        }
        if (i5 == 3) {
            return f14709d;
        }
        throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("ኇ"), i5));
    }
}
