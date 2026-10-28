package com.bumptech.glide.request.transition;

import com.bumptech.glide.request.transition.j;

/* compiled from: ViewPropertyAnimationFactory.java */
/* loaded from: classes3.dex */
public class i<R> implements g<R> {

    /* renamed from: a, reason: collision with root package name */
    private final j.a f44929a;

    /* renamed from: b, reason: collision with root package name */
    private j<R> f44930b;

    public i(j.a aVar) {
        this.f44929a = aVar;
    }

    @Override // com.bumptech.glide.request.transition.g
    public f<R> a(com.bumptech.glide.load.a aVar, boolean z4) {
        if (aVar == com.bumptech.glide.load.a.MEMORY_CACHE || !z4) {
            return e.b();
        }
        if (this.f44930b == null) {
            this.f44930b = new j<>(this.f44929a);
        }
        return this.f44930b;
    }
}
