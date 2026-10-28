package com.bumptech.glide.provider;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.l;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ResourceEncoderRegistry.java */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final List<a<?>> f44772a = new ArrayList();

    /* compiled from: ResourceEncoderRegistry.java */
    private static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f44773a;

        /* renamed from: b, reason: collision with root package name */
        final l<T> f44774b;

        a(@o0 Class<T> cls, @o0 l<T> lVar) {
            this.f44773a = cls;
            this.f44774b = lVar;
        }

        boolean a(@o0 Class<?> cls) {
            return this.f44773a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(@o0 Class<Z> cls, @o0 l<Z> lVar) {
        this.f44772a.add(new a<>(cls, lVar));
    }

    @q0
    public synchronized <Z> l<Z> b(@o0 Class<Z> cls) {
        int size = this.f44772a.size();
        for (int i4 = 0; i4 < size; i4++) {
            a<?> aVar = this.f44772a.get(i4);
            if (aVar.a(cls)) {
                return (l<Z>) aVar.f44774b;
            }
        }
        return null;
    }

    public synchronized <Z> void c(@o0 Class<Z> cls, @o0 l<Z> lVar) {
        this.f44772a.add(0, new a<>(cls, lVar));
    }
}
