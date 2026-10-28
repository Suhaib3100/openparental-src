package com.bumptech.glide.load.resource;

import androidx.annotation.o0;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.util.m;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: SimpleResource.java */
/* loaded from: classes3.dex */
public class j<T> implements u<T> {

    /* renamed from: b, reason: collision with root package name */
    protected final T f44662b;

    public j(@o0 T t4) {
        this.f44662b = (T) m.f(t4, ProtectedSandApp.s("ਢ"));
    }

    @Override // com.bumptech.glide.load.engine.u
    @o0
    public Class<T> a() {
        return (Class<T>) this.f44662b.getClass();
    }

    @Override // com.bumptech.glide.load.engine.u
    @o0
    public final T get() {
        return this.f44662b;
    }

    @Override // com.bumptech.glide.load.engine.u
    public final int getSize() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.u
    public void recycle() {
    }
}
