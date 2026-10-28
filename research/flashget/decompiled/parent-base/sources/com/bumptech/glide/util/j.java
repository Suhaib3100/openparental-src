package com.bumptech.glide.util;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LruCache.java */
/* loaded from: classes3.dex */
public class j<T, Y> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<T, a<Y>> f44967a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private final long f44968b;

    /* renamed from: c, reason: collision with root package name */
    private long f44969c;

    /* renamed from: d, reason: collision with root package name */
    private long f44970d;

    /* compiled from: LruCache.java */
    static final class a<Y> {

        /* renamed from: a, reason: collision with root package name */
        final Y f44971a;

        /* renamed from: b, reason: collision with root package name */
        final int f44972b;

        a(Y y4, int i4) {
            this.f44971a = y4;
            this.f44972b = i4;
        }
    }

    public j(long j4) {
        this.f44968b = j4;
        this.f44969c = j4;
    }

    private void j() {
        q(this.f44969c);
    }

    public synchronized long a() {
        return this.f44969c;
    }

    public void c() {
        q(0L);
    }

    public synchronized void d(float f4) {
        if (f4 < 0.0f) {
            throw new IllegalArgumentException(ProtectedSandApp.s("࣏"));
        }
        this.f44969c = Math.round(this.f44968b * f4);
        j();
    }

    public synchronized long e() {
        return this.f44970d;
    }

    public synchronized boolean i(@o0 T t4) {
        return this.f44967a.containsKey(t4);
    }

    @q0
    public synchronized Y k(@o0 T t4) {
        a<Y> aVar;
        aVar = this.f44967a.get(t4);
        return aVar != null ? aVar.f44971a : null;
    }

    protected synchronized int l() {
        return this.f44967a.size();
    }

    protected int m(@q0 Y y4) {
        return 1;
    }

    protected void n(@o0 T t4, @q0 Y y4) {
    }

    @q0
    public synchronized Y o(@o0 T t4, @q0 Y y4) {
        int m4 = m(y4);
        long j4 = m4;
        if (j4 >= this.f44969c) {
            n(t4, y4);
            return null;
        }
        if (y4 != null) {
            this.f44970d += j4;
        }
        a<Y> put = this.f44967a.put(t4, y4 == null ? null : new a<>(y4, m4));
        if (put != null) {
            this.f44970d -= put.f44972b;
            if (!put.f44971a.equals(y4)) {
                n(t4, put.f44971a);
            }
        }
        j();
        return put != null ? put.f44971a : null;
    }

    @q0
    public synchronized Y p(@o0 T t4) {
        a<Y> remove = this.f44967a.remove(t4);
        if (remove == null) {
            return null;
        }
        this.f44970d -= remove.f44972b;
        return remove.f44971a;
    }

    protected synchronized void q(long j4) {
        while (this.f44970d > j4) {
            Iterator<Map.Entry<T, a<Y>>> it = this.f44967a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.f44970d -= value.f44972b;
            T key = next.getKey();
            it.remove();
            n(key, value.f44971a);
        }
    }
}
