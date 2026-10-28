package kotlin.random;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.WasExperimental;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.ranges.UIntRange;
import kotlin.ranges.ULongRange;

/* compiled from: URandom.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\u001b\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u0018\u001a\u00020\u0003*\u00020\rH\u0007¢\u0006\u0002\u0010\u0019\u001a\u001b\u0010\u0018\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u0018\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u0018\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010 \u001a\u0011\u0010!\u001a\u00020\b*\u00020\rH\u0007¢\u0006\u0002\u0010\"\u001a\u001b\u0010!\u001a\u00020\b*\u00020\r2\u0006\u0010\u0004\u001a\u00020\bH\u0007¢\u0006\u0004\b#\u0010$\u001a#\u0010!\u001a\u00020\b*\u00020\r2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0007¢\u0006\u0004\b%\u0010&\u001a\u0019\u0010!\u001a\u00020\b*\u00020\r2\u0006\u0010\u001e\u001a\u00020'H\u0007¢\u0006\u0002\u0010(¨\u0006)"}, d2 = {"checkUIntRangeBounds", "", "from", "Lkotlin/UInt;", "until", "checkUIntRangeBounds-J1ME1BU", "(II)V", "checkULongRangeBounds", "Lkotlin/ULong;", "checkULongRangeBounds-eb3DHEI", "(JJ)V", "nextUBytes", "Lkotlin/UByteArray;", "Lkotlin/random/Random;", "size", "", "(Lkotlin/random/Random;I)[B", "array", "nextUBytes-EVgfTAA", "(Lkotlin/random/Random;[B)[B", "fromIndex", "toIndex", "nextUBytes-Wvrt4B4", "(Lkotlin/random/Random;[BII)[B", "nextUInt", "(Lkotlin/random/Random;)I", "nextUInt-qCasIEU", "(Lkotlin/random/Random;I)I", "nextUInt-a8DCA5k", "(Lkotlin/random/Random;II)I", "range", "Lkotlin/ranges/UIntRange;", "(Lkotlin/random/Random;Lkotlin/ranges/UIntRange;)I", "nextULong", "(Lkotlin/random/Random;)J", "nextULong-V1Xi4fY", "(Lkotlin/random/Random;J)J", "nextULong-jmpaW-c", "(Lkotlin/random/Random;JJ)J", "Lkotlin/ranges/ULongRange;", "(Lkotlin/random/Random;Lkotlin/ranges/ULongRange;)J", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nURandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URandom.kt\nkotlin/random/URandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
/* loaded from: classes5.dex */
public final class h {
    public static final void a(int i5, int i6) {
        int compare;
        compare = Integer.compare(i6 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
        if (!(compare > 0)) {
            throw new IllegalArgumentException(g.c(UInt.h(i5), UInt.h(i6)).toString());
        }
    }

    public static final void b(long j5, long j6) {
        int compare;
        compare = Long.compare(j6 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
        if (!(compare > 0)) {
            throw new IllegalArgumentException(g.c(ULong.h(j5), ULong.h(j6)).toString());
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @d5.d
    public static final byte[] c(@d5.d Random random, int i5) {
        l0.p(random, ProtectedSandApp.s("䇑"));
        byte[] d6 = random.d(i5);
        l0.p(d6, ProtectedSandApp.s("䇒"));
        return d6;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @d5.d
    public static final byte[] d(@d5.d Random random, @d5.d byte[] bArr) {
        l0.p(random, ProtectedSandApp.s("䇓"));
        l0.p(bArr, ProtectedSandApp.s("䇔"));
        random.e(bArr);
        return bArr;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @d5.d
    public static final byte[] e(@d5.d Random random, @d5.d byte[] bArr, int i5, int i6) {
        l0.p(random, ProtectedSandApp.s("䇕"));
        l0.p(bArr, ProtectedSandApp.s("䇖"));
        random.f(bArr, i5, i6);
        return bArr;
    }

    public static byte[] f(Random random, byte[] bArr, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = bArr.length;
        }
        return e(random, bArr, i5, i6);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int g(@d5.d Random random) {
        l0.p(random, ProtectedSandApp.s("䇗"));
        return UInt.r(random.l());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int h(@d5.d Random random, @d5.d UIntRange uIntRange) {
        int compare;
        int compare2;
        l0.p(random, ProtectedSandApp.s("䇘"));
        l0.p(uIntRange, ProtectedSandApp.s("䇙"));
        if (uIntRange.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("䇚") + uIntRange);
        }
        compare = Integer.compare(uIntRange.getF23749p() ^ Integer.MIN_VALUE, (-1) ^ Integer.MIN_VALUE);
        if (compare < 0) {
            return i(random, uIntRange.getF23748o(), UInt.r(uIntRange.getF23749p() + 1));
        }
        compare2 = Integer.compare(uIntRange.getF23748o() ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE);
        return compare2 > 0 ? i(random, UInt.r(uIntRange.getF23748o() - 1), uIntRange.getF23749p()) + 1 : g(random);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int i(@d5.d Random random, int i5, int i6) {
        l0.p(random, ProtectedSandApp.s("䇛"));
        a(i5, i6);
        return UInt.r(random.n(i5 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int j(@d5.d Random random, int i5) {
        l0.p(random, ProtectedSandApp.s("䇜"));
        return i(random, 0, i5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long k(@d5.d Random random) {
        l0.p(random, ProtectedSandApp.s("䇝"));
        return ULong.r(random.o());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long l(@d5.d Random random, @d5.d ULongRange uLongRange) {
        int compare;
        int compare2;
        l0.p(random, ProtectedSandApp.s("䇞"));
        l0.p(uLongRange, ProtectedSandApp.s("䇟"));
        if (uLongRange.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("䇠") + uLongRange);
        }
        compare = Long.compare(uLongRange.getF23759p() ^ Long.MIN_VALUE, (-1) ^ Long.MIN_VALUE);
        if (compare < 0) {
            return n(random, uLongRange.getF23758o(), ULong.r(1 & 4294967295L) + uLongRange.getF23759p());
        }
        compare2 = Long.compare(uLongRange.getF23758o() ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE);
        if (compare2 <= 0) {
            return k(random);
        }
        long j5 = 1 & 4294967295L;
        return n(random, uLongRange.getF23758o() - ULong.r(j5), uLongRange.getF23759p()) + j5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long m(@d5.d Random random, long j5) {
        l0.p(random, ProtectedSandApp.s("䇡"));
        return n(random, 0L, j5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long n(@d5.d Random random, long j5, long j6) {
        l0.p(random, ProtectedSandApp.s("䇢"));
        b(j5, j6);
        return ULong.r(random.q(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }
}
