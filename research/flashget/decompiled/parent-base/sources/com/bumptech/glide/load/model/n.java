package com.bumptech.glide.load.model;

import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.Queue;

/* compiled from: ModelCache.java */
/* loaded from: classes3.dex */
public class n<A, B> {

    /* renamed from: b, reason: collision with root package name */
    private static final int f44312b = 250;

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.util.j<b<A>, B> f44313a;

    /* compiled from: ModelCache.java */
    class a extends com.bumptech.glide.util.j<b<A>, B> {
        a(long j4) {
            super(j4);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.util.j
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public void n(@o0 b<A> bVar, @q0 B b5) {
            bVar.c();
        }
    }

    /* compiled from: ModelCache.java */
    @m1
    static final class b<A> {

        /* renamed from: d, reason: collision with root package name */
        private static final Queue<b<?>> f44315d = com.bumptech.glide.util.o.g(0);

        /* renamed from: a, reason: collision with root package name */
        private int f44316a;

        /* renamed from: b, reason: collision with root package name */
        private int f44317b;

        /* renamed from: c, reason: collision with root package name */
        private A f44318c;

        private b() {
        }

        static <A> b<A> a(A a5, int i4, int i5) {
            b<A> bVar;
            Queue<b<?>> queue = f44315d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a5, i4, i5);
            return bVar;
        }

        private void b(A a5, int i4, int i5) {
            this.f44318c = a5;
            this.f44317b = i4;
            this.f44316a = i5;
        }

        public void c() {
            Queue<b<?>> queue = f44315d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f44317b == bVar.f44317b && this.f44316a == bVar.f44316a && this.f44318c.equals(bVar.f44318c);
        }

        public int hashCode() {
            return this.f44318c.hashCode() + (((this.f44316a * 31) + this.f44317b) * 31);
        }
    }

    public n() {
        this(250L);
    }

    public void a() {
        this.f44313a.c();
    }

    @q0
    public B b(A a5, int i4, int i5) {
        b<A> a6 = b.a(a5, i4, i5);
        B k4 = this.f44313a.k(a6);
        a6.c();
        return k4;
    }

    public void c(A a5, int i4, int i5, B b5) {
        this.f44313a.o(b.a(a5, i4, i5), b5);
    }

    public n(long j4) {
        this.f44313a = new a(j4);
    }
}
