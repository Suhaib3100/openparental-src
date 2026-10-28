package com.google.common.hash;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import com.google.common.hash.g;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BloomFilterStrategies.java */
@k
/* loaded from: classes6.dex */
abstract class h implements g.c {
    public static final h MURMUR128_MITZ_32 = new a(ProtectedSandApp.s("\uf608"), 0);
    public static final h MURMUR128_MITZ_64 = new h(ProtectedSandApp.s("\uf609"), 1) { // from class: com.google.common.hash.h.b
        {
            a aVar = null;
        }

        private long lowerEight(byte[] bArr) {
            return com.google.common.primitives.n.j(bArr[7], bArr[6], bArr[5], bArr[4], bArr[3], bArr[2], bArr[1], bArr[0]);
        }

        private long upperEight(byte[] bArr) {
            return com.google.common.primitives.n.j(bArr[15], bArr[14], bArr[13], bArr[12], bArr[11], bArr[10], bArr[9], bArr[8]);
        }

        @Override // com.google.common.hash.g.c
        public <T> boolean mightContain(@f0 T t4, n<? super T> nVar, int i4, c cVar) {
            long b5 = cVar.b();
            byte[] l4 = s.x().h(t4, nVar).l();
            long lowerEight = lowerEight(l4);
            long upperEight = upperEight(l4);
            for (int i5 = 0; i5 < i4; i5++) {
                if (!cVar.e((Long.MAX_VALUE & lowerEight) % b5)) {
                    return false;
                }
                lowerEight += upperEight;
            }
            return true;
        }

        @Override // com.google.common.hash.g.c
        public <T> boolean put(@f0 T t4, n<? super T> nVar, int i4, c cVar) {
            long b5 = cVar.b();
            byte[] l4 = s.x().h(t4, nVar).l();
            long lowerEight = lowerEight(l4);
            long upperEight = upperEight(l4);
            boolean z4 = false;
            for (int i5 = 0; i5 < i4; i5++) {
                z4 |= cVar.h((Long.MAX_VALUE & lowerEight) % b5);
                lowerEight += upperEight;
            }
            return z4;
        }
    };
    private static final /* synthetic */ h[] $VALUES = $values();

    /* compiled from: BloomFilterStrategies.java */
    enum a extends h {
        a(String str, int i4) {
            super(str, i4, null);
        }

        @Override // com.google.common.hash.g.c
        public <T> boolean mightContain(@f0 T t4, n<? super T> nVar, int i4, c cVar) {
            long b5 = cVar.b();
            long c5 = s.x().h(t4, nVar).c();
            int i5 = (int) c5;
            int i6 = (int) (c5 >>> 32);
            for (int i7 = 1; i7 <= i4; i7++) {
                int i10 = (i7 * i6) + i5;
                if (i10 < 0) {
                    i10 = ~i10;
                }
                if (!cVar.e(i10 % b5)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.hash.g.c
        public <T> boolean put(@f0 T t4, n<? super T> nVar, int i4, c cVar) {
            long b5 = cVar.b();
            long c5 = s.x().h(t4, nVar).c();
            int i5 = (int) c5;
            int i6 = (int) (c5 >>> 32);
            boolean z4 = false;
            for (int i7 = 1; i7 <= i4; i7++) {
                int i10 = (i7 * i6) + i5;
                if (i10 < 0) {
                    i10 = ~i10;
                }
                z4 |= cVar.h(i10 % b5);
            }
            return z4;
        }
    }

    private static /* synthetic */ h[] $values() {
        return new h[]{MURMUR128_MITZ_32, MURMUR128_MITZ_64};
    }

    private h(String str, int i4) {
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    /* synthetic */ h(String str, int i4, a aVar) {
        this(str, i4);
    }

    /* compiled from: BloomFilterStrategies.java */
    static final class c {

        /* renamed from: c, reason: collision with root package name */
        private static final int f56952c = 6;

        /* renamed from: a, reason: collision with root package name */
        final AtomicLongArray f56953a;

        /* renamed from: b, reason: collision with root package name */
        private final y f56954b;

        c(long j4) {
            l0.e(j4 > 0, ProtectedSandApp.s("\uf60a"));
            this.f56953a = new AtomicLongArray(com.google.common.primitives.l.d(com.google.common.math.h.g(j4, 64L, RoundingMode.CEILING)));
            this.f56954b = z.a();
        }

        public static long[] i(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i4 = 0; i4 < length; i4++) {
                jArr[i4] = atomicLongArray.get(i4);
            }
            return jArr;
        }

        long a() {
            return this.f56954b.c();
        }

        long b() {
            return this.f56953a.length() * 64;
        }

        c c() {
            return new c(i(this.f56953a));
        }

        int d() {
            return this.f56953a.length();
        }

        boolean e(long j4) {
            return ((1 << ((int) j4)) & this.f56953a.get((int) (j4 >>> 6))) != 0;
        }

        public boolean equals(@zc.a Object obj) {
            if (obj instanceof c) {
                return Arrays.equals(i(this.f56953a), i(((c) obj).f56953a));
            }
            return false;
        }

        void f(c cVar) {
            l0.m(this.f56953a.length() == cVar.f56953a.length(), ProtectedSandApp.s("\uf60b"), this.f56953a.length(), cVar.f56953a.length());
            for (int i4 = 0; i4 < this.f56953a.length(); i4++) {
                g(i4, cVar.f56953a.get(i4));
            }
        }

        void g(int i4, long j4) {
            long j5;
            long j6;
            do {
                j5 = this.f56953a.get(i4);
                j6 = j5 | j4;
                if (j5 == j6) {
                    return;
                }
            } while (!this.f56953a.compareAndSet(i4, j5, j6));
            this.f56954b.a(Long.bitCount(j6) - Long.bitCount(j5));
        }

        boolean h(long j4) {
            long j5;
            long j6;
            if (e(j4)) {
                return false;
            }
            int i4 = (int) (j4 >>> 6);
            long j7 = 1 << ((int) j4);
            do {
                j5 = this.f56953a.get(i4);
                j6 = j5 | j7;
                if (j5 == j6) {
                    return false;
                }
            } while (!this.f56953a.compareAndSet(i4, j5, j6));
            this.f56954b.b();
            return true;
        }

        public int hashCode() {
            return Arrays.hashCode(i(this.f56953a));
        }

        c(long[] jArr) {
            l0.e(jArr.length > 0, ProtectedSandApp.s("\uf60a"));
            this.f56953a = new AtomicLongArray(jArr);
            this.f56954b = z.a();
            long j4 = 0;
            for (long j5 : jArr) {
                j4 += Long.bitCount(j5);
            }
            this.f56954b.a(j4);
        }
    }
}
