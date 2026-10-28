package com.bumptech.glide.util;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LruCache.java */
/* loaded from: classes.dex */
public class i<T, Y> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<T, a<Y>> f12158a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private final long f12159b;

    /* renamed from: c, reason: collision with root package name */
    private long f12160c;

    /* renamed from: d, reason: collision with root package name */
    private long f12161d;

    /* compiled from: LruCache.java */
    static final class a<Y> {

        /* renamed from: a, reason: collision with root package name */
        final Y f12162a;

        /* renamed from: b, reason: collision with root package name */
        final int f12163b;

        a(Y y5, int i5) {
            this.f12162a = y5;
            this.f12163b = i5;
        }
    }

    public i(long j5) {
        this.f12159b = j5;
        this.f12160c = j5;
    }

    private void j() {
        q(this.f12160c);
    }

    public void b() {
        q(0L);
    }

    public synchronized void c(float f6) {
        if (f6 < 0.0f) {
            throw new IllegalArgumentException(ProtectedSandApp.s("Ȫ"));
        }
        this.f12160c = Math.round(this.f12159b * f6);
        j();
    }

    public synchronized long d() {
        return this.f12161d;
    }

    public synchronized long e() {
        return this.f12160c;
    }

    public synchronized boolean i(@o0 T t5) {
        return this.f12158a.containsKey(t5);
    }

    @q0
    public synchronized Y k(@o0 T t5) {
        a<Y> aVar;
        aVar = this.f12158a.get(t5);
        return aVar != null ? aVar.f12162a : null;
    }

    protected synchronized int l() {
        return this.f12158a.size();
    }

    protected int m(@q0 Y y5) {
        return 1;
    }

    protected void n(@o0 T t5, @q0 Y y5) {
    }

    @q0
    public synchronized Y o(@o0 T t5, @q0 Y y5) {
        int m5 = m(y5);
        long j5 = m5;
        if (j5 >= this.f12160c) {
            n(t5, y5);
            return null;
        }
        if (y5 != null) {
            this.f12161d += j5;
        }
        a<Y> put = this.f12158a.put(t5, y5 == null ? null : new a<>(y5, m5));
        if (put != null) {
            this.f12161d -= put.f12163b;
            if (!put.f12162a.equals(y5)) {
                n(t5, put.f12162a);
            }
        }
        j();
        return put != null ? put.f12162a : null;
    }

    @q0
    public synchronized Y p(@o0 T t5) {
        a<Y> remove = this.f12158a.remove(t5);
        if (remove == null) {
            return null;
        }
        this.f12161d -= remove.f12163b;
        return remove.f12162a;
    }

    protected synchronized void q(long j5) {
        while (this.f12161d > j5) {
            Iterator<Map.Entry<T, a<Y>>> it = this.f12158a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.f12161d -= value.f12163b;
            T key = next.getKey();
            it.remove();
            n(key, value.f12162a);
        }
    }
}
