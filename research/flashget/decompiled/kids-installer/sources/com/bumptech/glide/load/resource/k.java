package com.bumptech.glide.load.resource;

import androidx.annotation.o0;
import com.bumptech.glide.load.engine.u;

/* compiled from: SimpleResource.java */
/* loaded from: classes3.dex */
public class k<T> implements u<T> {

    /* renamed from: o, reason: collision with root package name */
    protected final T f11883o;

    public k(@o0 T t5) {
        this.f11883o = (T) com.bumptech.glide.util.l.d(t5);
    }

    @Override // com.bumptech.glide.load.engine.u
    public final int a() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.u
    @o0
    public Class<T> c() {
        return (Class<T>) this.f11883o.getClass();
    }

    @Override // com.bumptech.glide.load.engine.u
    @o0
    public final T get() {
        return this.f11883o;
    }

    @Override // com.bumptech.glide.load.engine.u
    public void recycle() {
    }
}
