package com.google.common.cache;

import com.google.common.base.u0;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: LongAddables.java */
@g
@d9.b(emulated = true)
/* loaded from: classes6.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final u0<l> f55289a;

    /* compiled from: LongAddables.java */
    class a implements u0<l> {
        a() {
        }

        @Override // com.google.common.base.u0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l get() {
            return new n();
        }
    }

    /* compiled from: LongAddables.java */
    class b implements u0<l> {
        b() {
        }

        @Override // com.google.common.base.u0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l get() {
            return new c();
        }
    }

    /* compiled from: LongAddables.java */
    private static final class c extends AtomicLong implements l {
        private c() {
        }

        @Override // com.google.common.cache.l
        public void a(long j4) {
            getAndAdd(j4);
        }

        @Override // com.google.common.cache.l
        public void b() {
            getAndIncrement();
        }

        @Override // com.google.common.cache.l
        public long c() {
            return get();
        }

        c(a aVar) {
        }
    }

    static {
        u0<l> bVar;
        try {
            new n();
            bVar = new a();
        } catch (Throwable unused) {
            bVar = new b();
        }
        f55289a = bVar;
    }

    m() {
    }

    public static l a() {
        return f55289a.get();
    }
}
