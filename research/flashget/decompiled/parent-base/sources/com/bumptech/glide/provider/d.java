package com.bumptech.glide.provider;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.util.l;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ModelToResourceClassCache.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<l> f44765a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    private final androidx.collection.a<l, List<Class<?>>> f44766b = new androidx.collection.a<>();

    public void a() {
        synchronized (this.f44766b) {
            this.f44766b.clear();
        }
    }

    @q0
    public List<Class<?>> b(@o0 Class<?> cls, @o0 Class<?> cls2, @o0 Class<?> cls3) {
        List<Class<?>> list;
        l andSet = this.f44765a.getAndSet(null);
        if (andSet == null) {
            andSet = new l(cls, cls2, cls3);
        } else {
            andSet.b(cls, cls2, cls3);
        }
        synchronized (this.f44766b) {
            list = this.f44766b.get(andSet);
        }
        this.f44765a.set(andSet);
        return list;
    }

    public void c(@o0 Class<?> cls, @o0 Class<?> cls2, @o0 Class<?> cls3, @o0 List<Class<?>> list) {
        synchronized (this.f44766b) {
            this.f44766b.put(new l(cls, cls2, cls3), list);
        }
    }
}
