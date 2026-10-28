package com.bumptech.glide.provider;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.l;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ResourceEncoderRegistry.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final List<a<?>> f11962a = new ArrayList();

    /* compiled from: ResourceEncoderRegistry.java */
    private static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f11963a;

        /* renamed from: b, reason: collision with root package name */
        final l<T> f11964b;

        a(@o0 Class<T> cls, @o0 l<T> lVar) {
            this.f11963a = cls;
            this.f11964b = lVar;
        }

        boolean a(@o0 Class<?> cls) {
            return this.f11963a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(@o0 Class<Z> cls, @o0 l<Z> lVar) {
        this.f11962a.add(new a<>(cls, lVar));
    }

    @q0
    public synchronized <Z> l<Z> b(@o0 Class<Z> cls) {
        int size = this.f11962a.size();
        for (int i5 = 0; i5 < size; i5++) {
            a<?> aVar = this.f11962a.get(i5);
            if (aVar.a(cls)) {
                return (l<Z>) aVar.f11964b;
            }
        }
        return null;
    }

    public synchronized <Z> void c(@o0 Class<Z> cls, @o0 l<Z> lVar) {
        this.f11962a.add(0, new a<>(cls, lVar));
    }
}
