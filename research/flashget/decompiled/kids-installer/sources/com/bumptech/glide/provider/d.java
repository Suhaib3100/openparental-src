package com.bumptech.glide.provider;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.util.k;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ModelToResourceClassCache.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<k> f11955a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    private final androidx.collection.a<k, List<Class<?>>> f11956b = new androidx.collection.a<>();

    public void a() {
        synchronized (this.f11956b) {
            this.f11956b.clear();
        }
    }

    @q0
    public List<Class<?>> b(@o0 Class<?> cls, @o0 Class<?> cls2, @o0 Class<?> cls3) {
        List<Class<?>> list;
        k andSet = this.f11955a.getAndSet(null);
        if (andSet == null) {
            andSet = new k(cls, cls2, cls3);
        } else {
            andSet.b(cls, cls2, cls3);
        }
        synchronized (this.f11956b) {
            list = this.f11956b.get(andSet);
        }
        this.f11955a.set(andSet);
        return list;
    }

    public void c(@o0 Class<?> cls, @o0 Class<?> cls2, @o0 Class<?> cls3, @o0 List<Class<?>> list) {
        synchronized (this.f11956b) {
            this.f11956b.put(new k(cls, cls2, cls3), list);
        }
    }
}
