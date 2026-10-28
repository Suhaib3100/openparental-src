package com.bumptech.glide.util;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: GlideSuppliers.java */
/* loaded from: classes3.dex */
public final class h {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: GlideSuppliers.java */
    class a<T> implements b<T> {

        /* renamed from: a, reason: collision with root package name */
        private volatile T f44964a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f44965b;

        a(b bVar) {
            this.f44965b = bVar;
        }

        @Override // com.bumptech.glide.util.h.b
        public T get() {
            if (this.f44964a == null) {
                synchronized (this) {
                    try {
                        if (this.f44964a == null) {
                            this.f44964a = (T) m.f(this.f44965b.get(), ProtectedSandApp.s("ઝ"));
                        }
                    } finally {
                    }
                }
            }
            return this.f44964a;
        }
    }

    /* compiled from: GlideSuppliers.java */
    public interface b<T> {
        T get();
    }

    private h() {
    }

    public static <T> b<T> a(b<T> bVar) {
        return new a(bVar);
    }
}
