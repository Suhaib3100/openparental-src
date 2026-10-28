package com.bumptech.glide.provider;

import androidx.annotation.q0;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.resource.transcode.g;
import com.bumptech.glide.util.l;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: LoadPathCache.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static final s<?, ?, ?> f44762c = new s<>(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.emptyList(), new g(), null)), null);

    /* renamed from: a, reason: collision with root package name */
    private final androidx.collection.a<l, s<?, ?, ?>> f44763a = new androidx.collection.a<>();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<l> f44764b = new AtomicReference<>();

    private l b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        l andSet = this.f44764b.getAndSet(null);
        if (andSet == null) {
            andSet = new l();
        }
        andSet.b(cls, cls2, cls3);
        return andSet;
    }

    @q0
    public <Data, TResource, Transcode> s<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        s<Data, TResource, Transcode> sVar;
        l b5 = b(cls, cls2, cls3);
        synchronized (this.f44763a) {
            sVar = (s) this.f44763a.get(b5);
        }
        this.f44764b.set(b5);
        return sVar;
    }

    public boolean c(@q0 s<?, ?, ?> sVar) {
        return f44762c.equals(sVar);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, @q0 s<?, ?, ?> sVar) {
        synchronized (this.f44763a) {
            androidx.collection.a<l, s<?, ?, ?>> aVar = this.f44763a;
            l lVar = new l(cls, cls2, cls3);
            if (sVar == null) {
                sVar = f44762c;
            }
            aVar.put(lVar, sVar);
        }
    }
}
