package com.google.firebase.components;

import androidx.annotation.m1;

/* compiled from: Lazy.java */
/* loaded from: classes6.dex */
public class u<T> implements y9.b<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f58480c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f58481a;

    /* renamed from: b, reason: collision with root package name */
    private volatile y9.b<T> f58482b;

    u(T t4) {
        this.f58481a = f58480c;
        this.f58481a = t4;
    }

    @m1
    boolean a() {
        return this.f58481a != f58480c;
    }

    @Override // y9.b
    public T get() {
        T t4 = (T) this.f58481a;
        Object obj = f58480c;
        if (t4 == obj) {
            synchronized (this) {
                try {
                    t4 = (T) this.f58481a;
                    if (t4 == obj) {
                        t4 = this.f58482b.get();
                        this.f58481a = t4;
                        this.f58482b = null;
                    }
                } finally {
                }
            }
        }
        return t4;
    }

    public u(y9.b<T> bVar) {
        this.f58481a = f58480c;
        this.f58482b = bVar;
    }
}
