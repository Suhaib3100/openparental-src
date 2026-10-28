package kotlin.random;

import androidx.collection.n1;
import androidx.collection.q2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import fg.l;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.internal.m;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* compiled from: Random.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\f\b'\u0018\u0000 \u00062\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J+\u0010'\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020#2\u0006\u0010+\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lkotlin/random/f;", "", "<init>", "()V", "", "bitCount", "b", "(I)I", "l", "()I", "until", "m", "from", "n", "(II)I", "", "o", "()J", "p", "(J)J", "q", "(JJ)J", "", "c", "()Z", "", "h", "()D", "i", "(D)D", "j", "(DD)D", "", "k", "()F", "", "array", "fromIndex", "toIndex", "f", "([BII)[B", "e", "([B)[B", "size", "d", "(I)[B", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@c1(version = "1.3")
@r1({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/Random\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
/* loaded from: classes7.dex */
public abstract class f {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    @l
    private static final f f75441c = m.f75110a.b();

    /* compiled from: Random.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u00015B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020(2\u0006\u0010,\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010.J'\u00101\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\tH\u0016¢\u0006\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Lkotlin/random/f$a;", "Lkotlin/random/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "r", "()Ljava/lang/Object;", "", "bitCount", "b", "(I)I", "l", "()I", "until", "m", "from", "n", "(II)I", "", "o", "()J", "p", "(J)J", "q", "(JJ)J", "", "c", "()Z", "", "h", "()D", "i", "(D)D", "j", "(DD)D", "", "k", "()F", "", "array", "e", "([B)[B", "size", "d", "(I)[B", "fromIndex", "toIndex", "f", "([BII)[B", "defaultRandom", "Lkotlin/random/f;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.random.f$a, reason: from kotlin metadata */
    public static final class Companion extends f implements Serializable {

        /* compiled from: Random.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lkotlin/random/f$a$a;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "a", "()Ljava/lang/Object;", "", "c", "J", "serialVersionUID", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.random.f$a$a, reason: collision with other inner class name */
        private static final class C1063a implements Serializable {

            /* renamed from: b, reason: collision with root package name */
            @l
            public static final C1063a f75442b = new C1063a();

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private static final long serialVersionUID = 0;

            private C1063a() {
            }

            private final Object a() {
                return f.INSTANCE;
            }
        }

        private Companion() {
        }

        private final Object r() {
            return C1063a.f75442b;
        }

        @Override // kotlin.random.f
        public int b(int bitCount) {
            return f.f75441c.b(bitCount);
        }

        @Override // kotlin.random.f
        public boolean c() {
            return f.f75441c.c();
        }

        @Override // kotlin.random.f
        @l
        public byte[] d(int size) {
            return f.f75441c.d(size);
        }

        @Override // kotlin.random.f
        @l
        public byte[] e(@l byte[] array) {
            l0.p(array, ProtectedSandApp.s("斦\u0001"));
            return f.f75441c.e(array);
        }

        @Override // kotlin.random.f
        @l
        public byte[] f(@l byte[] array, int fromIndex, int toIndex) {
            l0.p(array, ProtectedSandApp.s("斦\u0001"));
            return f.f75441c.f(array, fromIndex, toIndex);
        }

        @Override // kotlin.random.f
        public double h() {
            return f.f75441c.h();
        }

        @Override // kotlin.random.f
        public double i(double until) {
            return f.f75441c.i(until);
        }

        @Override // kotlin.random.f
        public double j(double from, double until) {
            return f.f75441c.j(from, until);
        }

        @Override // kotlin.random.f
        public float k() {
            return f.f75441c.k();
        }

        @Override // kotlin.random.f
        public int l() {
            return f.f75441c.l();
        }

        @Override // kotlin.random.f
        public int m(int until) {
            return f.f75441c.m(until);
        }

        @Override // kotlin.random.f
        public int n(int from, int until) {
            return f.f75441c.n(from, until);
        }

        @Override // kotlin.random.f
        public long o() {
            return f.f75441c.o();
        }

        @Override // kotlin.random.f
        public long p(long until) {
            return f.f75441c.p(until);
        }

        @Override // kotlin.random.f
        public long q(long from, long until) {
            return f.f75441c.q(from, until);
        }

        public Companion(w wVar) {
        }
    }

    public static /* synthetic */ byte[] g(f fVar, byte[] bArr, int i4, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("斘\u0001"));
        }
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = bArr.length;
        }
        return fVar.f(bArr, i4, i5);
    }

    public abstract int b(int bitCount);

    public boolean c() {
        return b(1) != 0;
    }

    @l
    public byte[] d(int size) {
        return e(new byte[size]);
    }

    @l
    public byte[] e(@l byte[] array) {
        l0.p(array, ProtectedSandApp.s("料\u0001"));
        return f(array, 0, array.length);
    }

    @l
    public byte[] f(@l byte[] array, int fromIndex, int toIndex) {
        l0.p(array, ProtectedSandApp.s("料\u0001"));
        boolean r4 = new kotlin.ranges.l(0, array.length, 1).r(fromIndex);
        String s4 = ProtectedSandApp.s("斚\u0001");
        if (!r4 || !new kotlin.ranges.l(0, array.length, 1).r(toIndex)) {
            throw new IllegalArgumentException(androidx.view.e.a(n1.a(s4, fromIndex, ProtectedSandApp.s("斝\u0001"), toIndex, ProtectedSandApp.s("斞\u0001")), array.length, '.').toString());
        }
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException(q2.a(s4, fromIndex, ProtectedSandApp.s("斛\u0001"), toIndex, ProtectedSandApp.s("斜\u0001")).toString());
        }
        int i4 = (toIndex - fromIndex) / 4;
        for (int i5 = 0; i5 < i4; i5++) {
            int l4 = l();
            array[fromIndex] = (byte) l4;
            array[fromIndex + 1] = (byte) (l4 >>> 8);
            array[fromIndex + 2] = (byte) (l4 >>> 16);
            array[fromIndex + 3] = (byte) (l4 >>> 24);
            fromIndex += 4;
        }
        int i6 = toIndex - fromIndex;
        int b5 = b(i6 * 8);
        for (int i7 = 0; i7 < i6; i7++) {
            array[fromIndex + i7] = (byte) (b5 >>> (i7 * 8));
        }
        return array;
    }

    public double h() {
        return e.d(b(26), b(27));
    }

    public double i(double until) {
        return j(p.f60679p, until);
    }

    public double j(double from, double until) {
        double h4;
        g.d(from, until);
        double d5 = until - from;
        if (!Double.isInfinite(d5) || Double.isInfinite(from) || Double.isNaN(from) || Double.isInfinite(until) || Double.isNaN(until)) {
            h4 = from + (h() * d5);
        } else {
            double d6 = 2;
            double h5 = ((until / d6) - (from / d6)) * h();
            h4 = from + h5 + h5;
        }
        return h4 >= until ? Math.nextAfter(until, Double.NEGATIVE_INFINITY) : h4;
    }

    public float k() {
        return b(24) / 1.6777216E7f;
    }

    public int l() {
        return b(32);
    }

    public int m(int until) {
        return n(0, until);
    }

    public int n(int from, int until) {
        int l4;
        int i4;
        int i5;
        g.e(from, until);
        int i6 = until - from;
        if (i6 > 0 || i6 == Integer.MIN_VALUE) {
            if (((-i6) & i6) == i6) {
                i5 = b(g.g(i6));
            } else {
                do {
                    l4 = l() >>> 1;
                    i4 = l4 % i6;
                } while ((i6 - 1) + (l4 - i4) < 0);
                i5 = i4;
            }
            return from + i5;
        }
        while (true) {
            int l5 = l();
            if (from <= l5 && l5 < until) {
                return l5;
            }
        }
    }

    public long o() {
        return (l() << 32) + l();
    }

    public long p(long until) {
        return q(0L, until);
    }

    public long q(long from, long until) {
        long o4;
        long j4;
        long j5;
        int l4;
        g.f(from, until);
        long j6 = until - from;
        if (j6 > 0) {
            if (((-j6) & j6) == j6) {
                int i4 = (int) j6;
                int i5 = (int) (j6 >>> 32);
                if (i4 != 0) {
                    l4 = b(g.g(i4));
                } else if (i5 == 1) {
                    l4 = l();
                } else {
                    j5 = (b(g.g(i5)) << 32) + (l() & 4294967295L);
                }
                j5 = l4 & 4294967295L;
            } else {
                do {
                    o4 = o() >>> 1;
                    j4 = o4 % j6;
                } while ((j6 - 1) + (o4 - j4) < 0);
                j5 = j4;
            }
            return from + j5;
        }
        while (true) {
            long o5 = o();
            if (from <= o5 && o5 < until) {
                return o5;
            }
        }
    }
}
