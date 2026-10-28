package com.bumptech.glide.load.model;

import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.Queue;

/* compiled from: ModelCache.java */
/* loaded from: classes.dex */
public class m<A, B> {

    /* renamed from: b, reason: collision with root package name */
    private static final int f11562b = 250;

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.util.i<b<A>, B> f11563a;

    /* compiled from: ModelCache.java */
    /* loaded from: classes3.dex */
    class a extends com.bumptech.glide.util.i<b<A>, B> {
        a(long j5) {
            super(j5);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.util.i
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public void n(@o0 b<A> bVar, @q0 B b6) {
            bVar.c();
        }
    }

    /* compiled from: ModelCache.java */
    @m1
    static final class b<A> {

        /* renamed from: d, reason: collision with root package name */
        private static final Queue<b<?>> f11565d = com.bumptech.glide.util.n.f(0);

        /* renamed from: a, reason: collision with root package name */
        private int f11566a;

        /* renamed from: b, reason: collision with root package name */
        private int f11567b;

        /* renamed from: c, reason: collision with root package name */
        private A f11568c;

        private b() {
        }

        static <A> b<A> a(A a6, int i5, int i6) {
            b<A> bVar;
            Queue<b<?>> queue = f11565d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a6, i5, i6);
            return bVar;
        }

        private void b(A a6, int i5, int i6) {
            this.f11568c = a6;
            this.f11567b = i5;
            this.f11566a = i6;
        }

        public void c() {
            Queue<b<?>> queue = f11565d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f11567b == bVar.f11567b && this.f11566a == bVar.f11566a && this.f11568c.equals(bVar.f11568c);
        }

        public int hashCode() {
            return this.f11568c.hashCode() + (((this.f11566a * 31) + this.f11567b) * 31);
        }
    }

    public m() {
        this(250L);
    }

    public void a() {
        this.f11563a.b();
    }

    @q0
    public B b(A a6, int i5, int i6) {
        b<A> a7 = b.a(a6, i5, i6);
        B k5 = this.f11563a.k(a7);
        a7.c();
        return k5;
    }

    public void c(A a6, int i5, int i6, B b6) {
        this.f11563a.o(b.a(a6, i5, i6), b6);
    }

    public m(long j5) {
        this.f11563a = new a(j5);
    }
}
