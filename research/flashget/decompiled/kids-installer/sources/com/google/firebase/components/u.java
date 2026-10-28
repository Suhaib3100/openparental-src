package com.google.firebase.components;

import androidx.annotation.m1;

/* compiled from: Lazy.java */
/* loaded from: classes3.dex */
public class u<T> implements o2.b<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f15403c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f15404a;

    /* renamed from: b, reason: collision with root package name */
    private volatile o2.b<T> f15405b;

    u(T t5) {
        this.f15404a = f15403c;
        this.f15404a = t5;
    }

    @m1
    boolean a() {
        return this.f15404a != f15403c;
    }

    @Override // o2.b
    public T get() {
        T t5 = (T) this.f15404a;
        Object obj = f15403c;
        if (t5 == obj) {
            synchronized (this) {
                t5 = (T) this.f15404a;
                if (t5 == obj) {
                    t5 = this.f15405b.get();
                    this.f15404a = t5;
                    this.f15405b = null;
                }
            }
        }
        return t5;
    }

    public u(o2.b<T> bVar) {
        this.f15404a = f15403c;
        this.f15405b = bVar;
    }
}
