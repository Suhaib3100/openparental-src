package com.bumptech.glide.provider;

import androidx.annotation.q0;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.resource.transcode.g;
import com.bumptech.glide.util.k;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: LoadPathCache.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static final s<?, ?, ?> f11952c = new s<>(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.emptyList(), new g(), null)), null);

    /* renamed from: a, reason: collision with root package name */
    private final androidx.collection.a<k, s<?, ?, ?>> f11953a = new androidx.collection.a<>();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<k> f11954b = new AtomicReference<>();

    private k b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        k andSet = this.f11954b.getAndSet(null);
        if (andSet == null) {
            andSet = new k();
        }
        andSet.b(cls, cls2, cls3);
        return andSet;
    }

    @q0
    public <Data, TResource, Transcode> s<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        s<Data, TResource, Transcode> sVar;
        k b6 = b(cls, cls2, cls3);
        synchronized (this.f11953a) {
            sVar = (s) this.f11953a.get(b6);
        }
        this.f11954b.set(b6);
        return sVar;
    }

    public boolean c(@q0 s<?, ?, ?> sVar) {
        return f11952c.equals(sVar);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, @q0 s<?, ?, ?> sVar) {
        synchronized (this.f11953a) {
            androidx.collection.a<k, s<?, ?, ?>> aVar = this.f11953a;
            k kVar = new k(cls, cls2, cls3);
            if (sVar == null) {
                sVar = f11952c;
            }
            aVar.put(kVar, sVar);
        }
    }
}
