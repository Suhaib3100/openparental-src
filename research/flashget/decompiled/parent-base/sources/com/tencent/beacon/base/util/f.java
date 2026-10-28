package com.tencent.beacon.base.util;

import androidx.annotation.o0;

/* compiled from: Pools.java */
/* loaded from: classes6.dex */
public class f<T> extends e<T> {

    /* renamed from: c, reason: collision with root package name */
    private final Object f71370c;

    public f(int i4) {
        super(i4);
        this.f71370c = new Object();
    }

    @Override // com.tencent.beacon.base.util.e
    public T a() {
        T t4;
        synchronized (this.f71370c) {
            t4 = (T) super.a();
        }
        return t4;
    }

    @Override // com.tencent.beacon.base.util.e
    public boolean a(@o0 T t4) {
        boolean a5;
        synchronized (this.f71370c) {
            a5 = super.a(t4);
        }
        return a5;
    }
}
