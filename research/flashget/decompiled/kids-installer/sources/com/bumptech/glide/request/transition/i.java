package com.bumptech.glide.request.transition;

import com.bumptech.glide.request.transition.j;

/* compiled from: ViewPropertyAnimationFactory.java */
/* loaded from: classes3.dex */
public class i<R> implements g<R> {

    /* renamed from: a, reason: collision with root package name */
    private final j.a f12123a;

    /* renamed from: b, reason: collision with root package name */
    private j<R> f12124b;

    public i(j.a aVar) {
        this.f12123a = aVar;
    }

    @Override // com.bumptech.glide.request.transition.g
    public f<R> a(com.bumptech.glide.load.a aVar, boolean z5) {
        if (aVar == com.bumptech.glide.load.a.MEMORY_CACHE || !z5) {
            return e.b();
        }
        if (this.f12124b == null) {
            this.f12124b = new j<>(this.f12123a);
        }
        return this.f12124b;
    }
}
