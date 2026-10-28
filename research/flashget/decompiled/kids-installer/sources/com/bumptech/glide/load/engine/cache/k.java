package com.bumptech.glide.load.engine.cache;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.load.engine.u;

/* compiled from: MemoryCacheAdapter.java */
/* loaded from: classes3.dex */
public class k implements j {

    /* renamed from: a, reason: collision with root package name */
    private j.a f11250a;

    @Override // com.bumptech.glide.load.engine.cache.j
    public void a(int i5) {
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public void b() {
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public void c(float f6) {
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public long d() {
        return 0L;
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public long e() {
        return 0L;
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @q0
    public u<?> f(@o0 com.bumptech.glide.load.f fVar, @q0 u<?> uVar) {
        if (uVar == null) {
            return null;
        }
        this.f11250a.a(uVar);
        return null;
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    @q0
    public u<?> g(@o0 com.bumptech.glide.load.f fVar) {
        return null;
    }

    @Override // com.bumptech.glide.load.engine.cache.j
    public void h(@o0 j.a aVar) {
        this.f11250a = aVar;
    }
}
