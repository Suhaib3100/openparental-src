package com.bumptech.glide.util.pool;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: StateVerifier.java */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f12186a = false;

    /* compiled from: StateVerifier.java */
    /* loaded from: classes3.dex */
    private static class b extends c {

        /* renamed from: b, reason: collision with root package name */
        private volatile RuntimeException f12187b;

        b() {
            super(null);
        }

        @Override // com.bumptech.glide.util.pool.c
        void b(boolean z5) {
            if (z5) {
                this.f12187b = new RuntimeException(ProtectedSandApp.s("ᶴ"));
            } else {
                this.f12187b = null;
            }
        }

        @Override // com.bumptech.glide.util.pool.c
        public void c() {
            if (this.f12187b != null) {
                throw new IllegalStateException(ProtectedSandApp.s("ᶵ"), this.f12187b);
            }
        }
    }

    /* compiled from: StateVerifier.java */
    /* renamed from: com.bumptech.glide.util.pool.c$c, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static class C0156c extends c {

        /* renamed from: b, reason: collision with root package name */
        private volatile boolean f12188b;

        C0156c() {
            super(null);
        }

        @Override // com.bumptech.glide.util.pool.c
        public void b(boolean z5) {
            this.f12188b = z5;
        }

        @Override // com.bumptech.glide.util.pool.c
        public void c() {
            if (this.f12188b) {
                throw new IllegalStateException(ProtectedSandApp.s("ᶶ"));
            }
        }
    }

    private c() {
    }

    @o0
    public static c a() {
        return new C0156c();
    }

    abstract void b(boolean z5);

    public abstract void c();

    c(a aVar) {
    }
}
