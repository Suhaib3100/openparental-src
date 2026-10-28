package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.m;
import java.util.Queue;

/* compiled from: BaseKeyPool.java */
/* loaded from: classes.dex */
abstract class d<T extends m> {

    /* renamed from: b, reason: collision with root package name */
    private static final int f11158b = 20;

    /* renamed from: a, reason: collision with root package name */
    private final Queue<T> f11159a = com.bumptech.glide.util.n.f(20);

    d() {
    }

    abstract T a();

    T b() {
        T poll = this.f11159a.poll();
        return poll == null ? a() : poll;
    }

    public void c(T t5) {
        if (this.f11159a.size() < 20) {
            this.f11159a.offer(t5);
        }
    }
}
