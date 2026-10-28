package com.bumptech.glide.util.pool;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: StateVerifier.java */
/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f44996a = false;

    /* compiled from: StateVerifier.java */
    private static class b extends c {

        /* renamed from: b, reason: collision with root package name */
        private volatile RuntimeException f44997b;

        b() {
        }

        @Override // com.bumptech.glide.util.pool.c
        void b(boolean z4) {
            if (z4) {
                this.f44997b = new RuntimeException(ProtectedSandApp.s("બ"));
            } else {
                this.f44997b = null;
            }
        }

        @Override // com.bumptech.glide.util.pool.c
        public void c() {
            if (this.f44997b != null) {
                throw new IllegalStateException(ProtectedSandApp.s("ભ"), this.f44997b);
            }
        }
    }

    /* compiled from: StateVerifier.java */
    /* renamed from: com.bumptech.glide.util.pool.c$c, reason: collision with other inner class name */
    private static class C0757c extends c {

        /* renamed from: b, reason: collision with root package name */
        private volatile boolean f44998b;

        C0757c() {
        }

        @Override // com.bumptech.glide.util.pool.c
        public void b(boolean z4) {
            this.f44998b = z4;
        }

        @Override // com.bumptech.glide.util.pool.c
        public void c() {
            if (this.f44998b) {
                throw new IllegalStateException(ProtectedSandApp.s("મ"));
            }
        }
    }

    private c() {
    }

    @o0
    public static c a() {
        return new C0757c();
    }

    abstract void b(boolean z4);

    public abstract void c();

    c(a aVar) {
    }
}
