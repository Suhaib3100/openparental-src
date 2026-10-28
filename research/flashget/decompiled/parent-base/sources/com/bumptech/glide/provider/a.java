package com.bumptech.glide.provider;

import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: EncoderRegistry.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final List<C0753a<?>> f44758a = new ArrayList();

    /* compiled from: EncoderRegistry.java */
    /* renamed from: com.bumptech.glide.provider.a$a, reason: collision with other inner class name */
    private static final class C0753a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f44759a;

        /* renamed from: b, reason: collision with root package name */
        final com.bumptech.glide.load.d<T> f44760b;

        C0753a(@o0 Class<T> cls, @o0 com.bumptech.glide.load.d<T> dVar) {
            this.f44759a = cls;
            this.f44760b = dVar;
        }

        boolean a(@o0 Class<?> cls) {
            return this.f44759a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(@o0 Class<T> cls, @o0 com.bumptech.glide.load.d<T> dVar) {
        this.f44758a.add(new C0753a<>(cls, dVar));
    }

    @q0
    public synchronized <T> com.bumptech.glide.load.d<T> b(@o0 Class<T> cls) {
        for (C0753a<?> c0753a : this.f44758a) {
            if (c0753a.a(cls)) {
                return (com.bumptech.glide.load.d<T>) c0753a.f44760b;
            }
        }
        return null;
    }

    public synchronized <T> void c(@o0 Class<T> cls, @o0 com.bumptech.glide.load.d<T> dVar) {
        this.f44758a.add(0, new C0753a<>(cls, dVar));
    }
}
