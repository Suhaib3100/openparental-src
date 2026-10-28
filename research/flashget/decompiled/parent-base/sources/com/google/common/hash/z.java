package com.google.common.hash;

import com.google.common.base.u0;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: LongAddables.java */
@k
/* loaded from: classes6.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    private static final u0<y> f57044a;

    /* compiled from: LongAddables.java */
    class a implements u0<y> {
        a() {
        }

        @Override // com.google.common.base.u0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y get() {
            return new a0();
        }
    }

    /* compiled from: LongAddables.java */
    class b implements u0<y> {
        b() {
        }

        @Override // com.google.common.base.u0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y get() {
            return new c();
        }
    }

    /* compiled from: LongAddables.java */
    private static final class c extends AtomicLong implements y {
        private c() {
        }

        @Override // com.google.common.hash.y
        public void a(long j4) {
            getAndAdd(j4);
        }

        @Override // com.google.common.hash.y
        public void b() {
            getAndIncrement();
        }

        @Override // com.google.common.hash.y
        public long c() {
            return get();
        }

        c(a aVar) {
        }
    }

    static {
        u0<y> bVar;
        try {
            new a0();
            bVar = new a();
        } catch (Throwable unused) {
            bVar = new b();
        }
        f57044a = bVar;
    }

    z() {
    }

    public static y a() {
        return f57044a.get();
    }
}
