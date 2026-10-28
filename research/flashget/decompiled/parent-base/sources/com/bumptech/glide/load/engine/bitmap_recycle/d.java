package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.m;
import java.util.Queue;

/* compiled from: BaseKeyPool.java */
/* loaded from: classes3.dex */
abstract class d<T extends m> {

    /* renamed from: b, reason: collision with root package name */
    private static final int f43866b = 20;

    /* renamed from: a, reason: collision with root package name */
    private final Queue<T> f43867a = com.bumptech.glide.util.o.g(20);

    d() {
    }

    abstract T a();

    T b() {
        T poll = this.f43867a.poll();
        return poll == null ? a() : poll;
    }

    public void c(T t4) {
        if (this.f43867a.size() < 20) {
            this.f43867a.offer(t4);
        }
    }
}
