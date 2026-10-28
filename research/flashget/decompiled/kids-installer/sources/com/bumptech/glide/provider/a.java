package com.bumptech.glide.provider;

import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: EncoderRegistry.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final List<C0152a<?>> f11948a = new ArrayList();

    /* compiled from: EncoderRegistry.java */
    /* renamed from: com.bumptech.glide.provider.a$a, reason: collision with other inner class name */
    private static final class C0152a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f11949a;

        /* renamed from: b, reason: collision with root package name */
        final com.bumptech.glide.load.d<T> f11950b;

        C0152a(@o0 Class<T> cls, @o0 com.bumptech.glide.load.d<T> dVar) {
            this.f11949a = cls;
            this.f11950b = dVar;
        }

        boolean a(@o0 Class<?> cls) {
            return this.f11949a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(@o0 Class<T> cls, @o0 com.bumptech.glide.load.d<T> dVar) {
        this.f11948a.add(new C0152a<>(cls, dVar));
    }

    @q0
    public synchronized <T> com.bumptech.glide.load.d<T> b(@o0 Class<T> cls) {
        for (C0152a<?> c0152a : this.f11948a) {
            if (c0152a.a(cls)) {
                return (com.bumptech.glide.load.d<T>) c0152a.f11950b;
            }
        }
        return null;
    }

    public synchronized <T> void c(@o0 Class<T> cls, @o0 com.bumptech.glide.load.d<T> dVar) {
        this.f11948a.add(0, new C0152a<>(cls, dVar));
    }
}
