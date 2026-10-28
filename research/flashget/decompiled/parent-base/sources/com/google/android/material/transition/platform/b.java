package com.google.android.material.transition.platform;

import androidx.annotation.x0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: FadeModeEvaluators.java */
@x0(21)
/* loaded from: classes6.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.android.material.transition.platform.a f54650a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.android.material.transition.platform.a f54651b = new C0824b();

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.android.material.transition.platform.a f54652c = new c();

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.android.material.transition.platform.a f54653d = new d();

    /* compiled from: FadeModeEvaluators.java */
    static class a implements com.google.android.material.transition.platform.a {
        a() {
        }

        @Override // com.google.android.material.transition.platform.a
        public com.google.android.material.transition.platform.c a(float f4, float f5, float f6, float f7) {
            return com.google.android.material.transition.platform.c.a(255, v.q(0, 255, f5, f6, f4));
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    /* renamed from: com.google.android.material.transition.platform.b$b, reason: collision with other inner class name */
    static class C0824b implements com.google.android.material.transition.platform.a {
        C0824b() {
        }

        @Override // com.google.android.material.transition.platform.a
        public com.google.android.material.transition.platform.c a(float f4, float f5, float f6, float f7) {
            return com.google.android.material.transition.platform.c.b(v.q(255, 0, f5, f6, f4), 255);
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    static class c implements com.google.android.material.transition.platform.a {
        c() {
        }

        @Override // com.google.android.material.transition.platform.a
        public com.google.android.material.transition.platform.c a(float f4, float f5, float f6, float f7) {
            return com.google.android.material.transition.platform.c.b(v.q(255, 0, f5, f6, f4), v.q(0, 255, f5, f6, f4));
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    static class d implements com.google.android.material.transition.platform.a {
        d() {
        }

        @Override // com.google.android.material.transition.platform.a
        public com.google.android.material.transition.platform.c a(float f4, float f5, float f6, float f7) {
            float a5 = androidx.appcompat.graphics.drawable.d.a(f6, f5, f7, f5);
            return com.google.android.material.transition.platform.c.b(v.q(255, 0, f5, a5, f4), v.q(0, 255, a5, f6, f4));
        }
    }

    private b() {
    }

    static com.google.android.material.transition.platform.a a(int i4, boolean z4) {
        if (i4 == 0) {
            return z4 ? f54650a : f54651b;
        }
        if (i4 == 1) {
            return z4 ? f54651b : f54650a;
        }
        if (i4 == 2) {
            return f54652c;
        }
        if (i4 == 3) {
            return f54653d;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("\uf290"), i4));
    }
}
