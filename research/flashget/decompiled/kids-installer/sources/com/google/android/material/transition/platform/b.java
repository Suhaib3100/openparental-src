package com.google.android.material.transition.platform;

import androidx.annotation.x0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: FadeModeEvaluators.java */
@x0(21)
/* loaded from: classes2.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.android.material.transition.platform.a f14818a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.android.material.transition.platform.a f14819b = new C0190b();

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.android.material.transition.platform.a f14820c = new c();

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.android.material.transition.platform.a f14821d = new d();

    /* compiled from: FadeModeEvaluators.java */
    /* loaded from: classes3.dex */
    static class a implements com.google.android.material.transition.platform.a {
        a() {
        }

        @Override // com.google.android.material.transition.platform.a
        public com.google.android.material.transition.platform.c a(float f6, float f7, float f8, float f9) {
            return com.google.android.material.transition.platform.c.a(255, v.q(0, 255, f7, f8, f6));
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    /* renamed from: com.google.android.material.transition.platform.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0190b implements com.google.android.material.transition.platform.a {
        C0190b() {
        }

        @Override // com.google.android.material.transition.platform.a
        public com.google.android.material.transition.platform.c a(float f6, float f7, float f8, float f9) {
            return com.google.android.material.transition.platform.c.b(v.q(255, 0, f7, f8, f6), 255);
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    /* loaded from: classes3.dex */
    static class c implements com.google.android.material.transition.platform.a {
        c() {
        }

        @Override // com.google.android.material.transition.platform.a
        public com.google.android.material.transition.platform.c a(float f6, float f7, float f8, float f9) {
            return com.google.android.material.transition.platform.c.b(v.q(255, 0, f7, f8, f6), v.q(0, 255, f7, f8, f6));
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    /* loaded from: classes3.dex */
    static class d implements com.google.android.material.transition.platform.a {
        d() {
        }

        @Override // com.google.android.material.transition.platform.a
        public com.google.android.material.transition.platform.c a(float f6, float f7, float f8, float f9) {
            float a6 = androidx.appcompat.graphics.drawable.d.a(f8, f7, f9, f7);
            return com.google.android.material.transition.platform.c.b(v.q(255, 0, f7, a6, f6), v.q(0, 255, a6, f8, f6));
        }
    }

    private b() {
    }

    static com.google.android.material.transition.platform.a a(int i5, boolean z5) {
        if (i5 == 0) {
            return z5 ? f14818a : f14819b;
        }
        if (i5 == 1) {
            return z5 ? f14819b : f14818a;
        }
        if (i5 == 2) {
            return f14820c;
        }
        if (i5 == 3) {
            return f14821d;
        }
        throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("ኌ"), i5));
    }
}
