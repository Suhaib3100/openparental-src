package kotlin.random;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongRange;

/* compiled from: Random.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0007\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\fH\u0000\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u001a\u0014\u0010\u0012\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0013H\u0007\u001a\u0014\u0010\u0014\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0000¨\u0006\u0016"}, d2 = {"Random", "Lkotlin/random/Random;", "seed", "", "", "boundsErrorMessage", "", "from", "", "until", "checkRangeBounds", "", "", "fastLog2", "value", "nextInt", "range", "Lkotlin/ranges/IntRange;", "nextLong", "Lkotlin/ranges/LongRange;", "takeUpperBits", "bitCount", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/RandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
/* loaded from: classes5.dex */
public final class g {
    @SinceKotlin(version = "1.3")
    @d5.d
    public static final Random a(int i5) {
        return new XorWowRandom(i5, i5 >> 31);
    }

    @SinceKotlin(version = "1.3")
    @d5.d
    public static final Random b(long j5) {
        return new XorWowRandom((int) j5, (int) (j5 >> 32));
    }

    @d5.d
    public static final String c(@d5.d Object obj, @d5.d Object obj2) {
        l0.p(obj, ProtectedSandApp.s("䇆"));
        l0.p(obj2, ProtectedSandApp.s("䇇"));
        return ProtectedSandApp.s("䇈") + obj + ProtectedSandApp.s("䇉") + obj2 + ProtectedSandApp.s("䇊");
    }

    public static final void d(double d6, double d7) {
        if (!(d7 > d6)) {
            throw new IllegalArgumentException(c(Double.valueOf(d6), Double.valueOf(d7)).toString());
        }
    }

    public static final void e(int i5, int i6) {
        if (!(i6 > i5)) {
            throw new IllegalArgumentException(c(Integer.valueOf(i5), Integer.valueOf(i6)).toString());
        }
    }

    public static final void f(long j5, long j6) {
        if (!(j6 > j5)) {
            throw new IllegalArgumentException(c(Long.valueOf(j5), Long.valueOf(j6)).toString());
        }
    }

    public static final int g(int i5) {
        return 31 - Integer.numberOfLeadingZeros(i5);
    }

    @SinceKotlin(version = "1.3")
    public static final int h(@d5.d Random random, @d5.d IntRange intRange) {
        l0.p(random, ProtectedSandApp.s("䇋"));
        l0.p(intRange, ProtectedSandApp.s("䇌"));
        if (!intRange.isEmpty()) {
            return intRange.getF23725p() < Integer.MAX_VALUE ? random.n(intRange.getF23724o(), intRange.getF23725p() + 1) : intRange.getF23724o() > Integer.MIN_VALUE ? random.n(intRange.getF23724o() - 1, intRange.getF23725p()) + 1 : random.l();
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("䇍") + intRange);
    }

    @SinceKotlin(version = "1.3")
    public static final long i(@d5.d Random random, @d5.d LongRange longRange) {
        l0.p(random, ProtectedSandApp.s("䇎"));
        l0.p(longRange, ProtectedSandApp.s("䇏"));
        if (!longRange.isEmpty()) {
            return longRange.getF23735p() < Long.MAX_VALUE ? random.q(longRange.getF23734o(), longRange.getF23735p() + 1) : longRange.getF23734o() > Long.MIN_VALUE ? random.q(longRange.getF23734o() - 1, longRange.getF23735p()) + 1 : random.o();
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("䇐") + longRange);
    }

    public static final int j(int i5, int i6) {
        return (i5 >>> (32 - i6)) & ((-i6) >> 31);
    }
}
