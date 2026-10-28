package com.google.common.util.concurrent;

import com.google.common.collect.p4;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: AtomicLongMap.java */
@b0
@d9.b
/* loaded from: classes6.dex */
public final class q<K> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<K, AtomicLong> f57912b;

    /* renamed from: c, reason: collision with root package name */
    @zc.a
    private transient Map<K, Long> f57913c;

    /* compiled from: AtomicLongMap.java */
    class a implements com.google.common.base.x<AtomicLong, Long> {
        a(q qVar) {
        }

        @Override // com.google.common.base.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long apply(AtomicLong atomicLong) {
            return Long.valueOf(atomicLong.get());
        }
    }

    private q(ConcurrentHashMap<K, AtomicLong> concurrentHashMap) {
        concurrentHashMap.getClass();
        this.f57912b = concurrentHashMap;
    }

    public static <K> q<K> e() {
        return new q<>(new ConcurrentHashMap());
    }

    public static <K> q<K> f(Map<? extends K, ? extends Long> map) {
        q<K> e4 = e();
        e4.p(map);
        return e4;
    }

    private Map<K, Long> g() {
        return Collections.unmodifiableMap(p4.B0(this.f57912b, new a()));
    }

    @f9.a
    public long a(K k4, long j4) {
        AtomicLong atomicLong;
        long j5;
        long j6;
        do {
            atomicLong = this.f57912b.get(k4);
            if (atomicLong == null && (atomicLong = this.f57912b.putIfAbsent(k4, new AtomicLong(j4))) == null) {
                return j4;
            }
            do {
                j5 = atomicLong.get();
                if (j5 != 0) {
                    j6 = j5 + j4;
                }
            } while (!atomicLong.compareAndSet(j5, j6));
            return j6;
        } while (!this.f57912b.replace(k4, atomicLong, new AtomicLong(j4)));
        return j4;
    }

    public Map<K, Long> b() {
        Map<K, Long> map = this.f57913c;
        if (map != null) {
            return map;
        }
        Map<K, Long> g4 = g();
        this.f57913c = g4;
        return g4;
    }

    public void c() {
        this.f57912b.clear();
    }

    public boolean d(Object obj) {
        return this.f57912b.containsKey(obj);
    }

    @f9.a
    public long h(K k4) {
        return a(k4, -1L);
    }

    public long i(K k4) {
        AtomicLong atomicLong = this.f57912b.get(k4);
        if (atomicLong == null) {
            return 0L;
        }
        return atomicLong.get();
    }

    @f9.a
    public long j(K k4, long j4) {
        AtomicLong atomicLong;
        long j5;
        do {
            atomicLong = this.f57912b.get(k4);
            if (atomicLong == null && (atomicLong = this.f57912b.putIfAbsent(k4, new AtomicLong(j4))) == null) {
                return 0L;
            }
            do {
                j5 = atomicLong.get();
                if (j5 == 0) {
                }
            } while (!atomicLong.compareAndSet(j5, j5 + j4));
            return j5;
        } while (!this.f57912b.replace(k4, atomicLong, new AtomicLong(j4)));
        return 0L;
    }

    @f9.a
    public long k(K k4) {
        return j(k4, -1L);
    }

    @f9.a
    public long l(K k4) {
        return j(k4, 1L);
    }

    @f9.a
    public long m(K k4) {
        return a(k4, 1L);
    }

    public boolean n() {
        return this.f57912b.isEmpty();
    }

    @f9.a
    public long o(K k4, long j4) {
        AtomicLong atomicLong;
        long j5;
        do {
            atomicLong = this.f57912b.get(k4);
            if (atomicLong == null && (atomicLong = this.f57912b.putIfAbsent(k4, new AtomicLong(j4))) == null) {
                return 0L;
            }
            do {
                j5 = atomicLong.get();
                if (j5 == 0) {
                }
            } while (!atomicLong.compareAndSet(j5, j4));
            return j5;
        } while (!this.f57912b.replace(k4, atomicLong, new AtomicLong(j4)));
        return 0L;
    }

    public void p(Map<? extends K, ? extends Long> map) {
        for (Map.Entry<? extends K, ? extends Long> entry : map.entrySet()) {
            o(entry.getKey(), entry.getValue().longValue());
        }
    }

    long q(K k4, long j4) {
        AtomicLong atomicLong;
        do {
            atomicLong = this.f57912b.get(k4);
            if (atomicLong == null && (atomicLong = this.f57912b.putIfAbsent(k4, new AtomicLong(j4))) == null) {
                return 0L;
            }
            long j5 = atomicLong.get();
            if (j5 != 0) {
                return j5;
            }
        } while (!this.f57912b.replace(k4, atomicLong, new AtomicLong(j4)));
        return 0L;
    }

    @f9.a
    public long r(K k4) {
        long j4;
        AtomicLong atomicLong = this.f57912b.get(k4);
        if (atomicLong == null) {
            return 0L;
        }
        do {
            j4 = atomicLong.get();
            if (j4 == 0) {
                break;
            }
        } while (!atomicLong.compareAndSet(j4, 0L));
        this.f57912b.remove(k4, atomicLong);
        return j4;
    }

    boolean s(K k4, long j4) {
        AtomicLong atomicLong = this.f57912b.get(k4);
        if (atomicLong == null) {
            return false;
        }
        long j5 = atomicLong.get();
        if (j5 != j4) {
            return false;
        }
        if (j5 != 0 && !atomicLong.compareAndSet(j5, 0L)) {
            return false;
        }
        this.f57912b.remove(k4, atomicLong);
        return true;
    }

    public void t() {
        Iterator<Map.Entry<K, AtomicLong>> it = this.f57912b.entrySet().iterator();
        while (it.hasNext()) {
            AtomicLong value = it.next().getValue();
            if (value != null && value.get() == 0) {
                it.remove();
            }
        }
    }

    public String toString() {
        return this.f57912b.toString();
    }

    @d9.a
    @f9.a
    public boolean u(K k4) {
        return s(k4, 0L);
    }

    boolean v(K k4, long j4, long j5) {
        if (j4 == 0) {
            return q(k4, j5) == 0;
        }
        AtomicLong atomicLong = this.f57912b.get(k4);
        if (atomicLong == null) {
            return false;
        }
        return atomicLong.compareAndSet(j4, j5);
    }

    public int w() {
        return this.f57912b.size();
    }

    public long x() {
        Iterator<AtomicLong> it = this.f57912b.values().iterator();
        long j4 = 0;
        while (it.hasNext()) {
            j4 += it.next().get();
        }
        return j4;
    }
}
