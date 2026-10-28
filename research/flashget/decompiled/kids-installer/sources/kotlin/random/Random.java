package kotlin.random;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.m;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.ranges.IntRange;
import org.apache.commons.io.k;

/* compiled from: Random.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b'\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016¨\u0006\u0018"}, d2 = {"Lkotlin/random/Random;", "", "()V", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "nextDouble", "", "until", "from", "nextFloat", "", "nextInt", "nextLong", "", "Default", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SinceKotlin(version = "1.3")
@SourceDebugExtension({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/Random\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
/* renamed from: kotlin.random.f, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public abstract class Random {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    public static final a f23691o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private static final Random f23692p = m.f23351a.b();

    /* compiled from: Random.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0019H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "defaultRandom", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "nextDouble", "", "until", "from", "nextFloat", "", "nextInt", "nextLong", "", "writeReplace", "", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.random.f$a */
    public static final class a extends Random implements Serializable {

        /* compiled from: Random.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "serialVersionUID", "", "readResolve", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.random.f$a$a, reason: collision with other inner class name */
        private static final class C0260a implements Serializable {

            /* renamed from: o, reason: collision with root package name */
            @d5.d
            public static final C0260a f23693o = new C0260a();

            /* renamed from: p, reason: collision with root package name */
            private static final long f23694p = 0;

            private C0260a() {
            }

            private final Object a() {
                return Random.f23691o;
            }
        }

        private a() {
        }

        private final Object r() {
            return C0260a.f23693o;
        }

        @Override // kotlin.random.Random
        public int b(int i5) {
            return Random.f23692p.b(i5);
        }

        @Override // kotlin.random.Random
        public boolean c() {
            return Random.f23692p.c();
        }

        @Override // kotlin.random.Random
        @d5.d
        public byte[] d(int i5) {
            return Random.f23692p.d(i5);
        }

        @Override // kotlin.random.Random
        @d5.d
        public byte[] e(@d5.d byte[] bArr) {
            l0.p(bArr, ProtectedSandApp.s("䇄"));
            return Random.f23692p.e(bArr);
        }

        @Override // kotlin.random.Random
        @d5.d
        public byte[] f(@d5.d byte[] bArr, int i5, int i6) {
            l0.p(bArr, ProtectedSandApp.s("䇅"));
            return Random.f23692p.f(bArr, i5, i6);
        }

        @Override // kotlin.random.Random
        public double h() {
            return Random.f23692p.h();
        }

        @Override // kotlin.random.Random
        public double i(double d6) {
            return Random.f23692p.i(d6);
        }

        @Override // kotlin.random.Random
        public double j(double d6, double d7) {
            return Random.f23692p.j(d6, d7);
        }

        @Override // kotlin.random.Random
        public float k() {
            return Random.f23692p.k();
        }

        @Override // kotlin.random.Random
        public int l() {
            return Random.f23692p.l();
        }

        @Override // kotlin.random.Random
        public int m(int i5) {
            return Random.f23692p.m(i5);
        }

        @Override // kotlin.random.Random
        public int n(int i5, int i6) {
            return Random.f23692p.n(i5, i6);
        }

        @Override // kotlin.random.Random
        public long o() {
            return Random.f23692p.o();
        }

        @Override // kotlin.random.Random
        public long p(long j5) {
            return Random.f23692p.p(j5);
        }

        @Override // kotlin.random.Random
        public long q(long j5, long j6) {
            return Random.f23692p.q(j5, j6);
        }

        public a(w wVar) {
        }
    }

    public static /* synthetic */ byte[] g(Random random, byte[] bArr, int i5, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("䆶"));
        }
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = bArr.length;
        }
        return random.f(bArr, i5, i6);
    }

    public abstract int b(int i5);

    public boolean c() {
        return b(1) != 0;
    }

    @d5.d
    public byte[] d(int i5) {
        return e(new byte[i5]);
    }

    @d5.d
    public byte[] e(@d5.d byte[] bArr) {
        l0.p(bArr, ProtectedSandApp.s("䆷"));
        return f(bArr, 0, bArr.length);
    }

    @d5.d
    public byte[] f(@d5.d byte[] bArr, int i5, int i6) {
        l0.p(bArr, ProtectedSandApp.s("䆸"));
        boolean z5 = new IntRange(0, bArr.length).v(i5) && new IntRange(0, bArr.length).v(i6);
        String s5 = ProtectedSandApp.s("䆹");
        if (!z5) {
            throw new IllegalArgumentException((s5 + i5 + ProtectedSandApp.s("䆼") + i6 + ProtectedSandApp.s("䆽") + bArr.length + k.f32026a).toString());
        }
        if (!(i5 <= i6)) {
            throw new IllegalArgumentException((s5 + i5 + ProtectedSandApp.s("䆺") + i6 + ProtectedSandApp.s("䆻")).toString());
        }
        int i7 = (i6 - i5) / 4;
        for (int i8 = 0; i8 < i7; i8++) {
            int l5 = l();
            bArr[i5] = (byte) l5;
            bArr[i5 + 1] = (byte) (l5 >>> 8);
            bArr[i5 + 2] = (byte) (l5 >>> 16);
            bArr[i5 + 3] = (byte) (l5 >>> 24);
            i5 += 4;
        }
        int i9 = i6 - i5;
        int b6 = b(i9 * 8);
        for (int i10 = 0; i10 < i9; i10++) {
            bArr[i5 + i10] = (byte) (b6 >>> (i10 * 8));
        }
        return bArr;
    }

    public double h() {
        return e.d(b(26), b(27));
    }

    public double i(double d6) {
        return j(p.f18289o, d6);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double j(double r7, double r9) {
        /*
            r6 = this;
            kotlin.random.g.d(r7, r9)
            double r0 = r9 - r7
            boolean r2 = java.lang.Double.isInfinite(r0)
            if (r2 == 0) goto L3d
            boolean r2 = java.lang.Double.isInfinite(r7)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L1b
            boolean r2 = java.lang.Double.isNaN(r7)
            if (r2 != 0) goto L1b
            r2 = r3
            goto L1c
        L1b:
            r2 = r4
        L1c:
            if (r2 == 0) goto L3d
            boolean r2 = java.lang.Double.isInfinite(r9)
            if (r2 != 0) goto L2b
            boolean r2 = java.lang.Double.isNaN(r9)
            if (r2 != 0) goto L2b
            goto L2c
        L2b:
            r3 = r4
        L2c:
            if (r3 == 0) goto L3d
            double r0 = r6.h()
            r2 = 2
            double r2 = (double) r2
            double r4 = r9 / r2
            double r2 = r7 / r2
            double r4 = r4 - r2
            double r4 = r4 * r0
            double r7 = r7 + r4
            double r7 = r7 + r4
            goto L43
        L3d:
            double r2 = r6.h()
            double r2 = r2 * r0
            double r7 = r7 + r2
        L43:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L4d
            r7 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r7 = java.lang.Math.nextAfter(r9, r7)
        L4d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.random.Random.j(double, double):double");
    }

    public float k() {
        return b(24) / 1.6777216E7f;
    }

    public int l() {
        return b(32);
    }

    public int m(int i5) {
        return n(0, i5);
    }

    public int n(int i5, int i6) {
        int l5;
        int i7;
        int i8;
        int l6;
        boolean z5;
        g.e(i5, i6);
        int i9 = i6 - i5;
        if (i9 <= 0 && i9 != Integer.MIN_VALUE) {
            do {
                l6 = l();
                z5 = false;
                if (i5 <= l6 && l6 < i6) {
                    z5 = true;
                }
            } while (!z5);
            return l6;
        }
        if (((-i9) & i9) == i9) {
            i8 = b(g.g(i9));
        } else {
            do {
                l5 = l() >>> 1;
                i7 = l5 % i9;
            } while ((i9 - 1) + (l5 - i7) < 0);
            i8 = i7;
        }
        return i5 + i8;
    }

    public long o() {
        return (l() << 32) + l();
    }

    public long p(long j5) {
        return q(0L, j5);
    }

    public long q(long j5, long j6) {
        long o5;
        boolean z5;
        long o6;
        long j7;
        long j8;
        int l5;
        g.f(j5, j6);
        long j9 = j6 - j5;
        if (j9 <= 0) {
            do {
                o5 = o();
                z5 = false;
                if (j5 <= o5 && o5 < j6) {
                    z5 = true;
                }
            } while (!z5);
            return o5;
        }
        if (((-j9) & j9) == j9) {
            int i5 = (int) j9;
            int i6 = (int) (j9 >>> 32);
            if (i5 != 0) {
                l5 = b(g.g(i5));
            } else if (i6 == 1) {
                l5 = l();
            } else {
                j8 = (b(g.g(i6)) << 32) + (l() & 4294967295L);
            }
            j8 = l5 & 4294967295L;
        } else {
            do {
                o6 = o() >>> 1;
                j7 = o6 % j9;
            } while ((j9 - 1) + (o6 - j7) < 0);
            j8 = j7;
        }
        return j5 + j8;
    }
}
