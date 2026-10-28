package kotlin.random;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.o;

/* compiled from: Random.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\u0000*\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\t\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010!\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"", "seed", "Lkotlin/random/f;", "a", "(I)Lkotlin/random/f;", "", "b", "(J)Lkotlin/random/f;", "Lkotlin/ranges/l;", "range", "h", "(Lkotlin/random/f;Lkotlin/ranges/l;)I", "Lkotlin/ranges/o;", "i", "(Lkotlin/random/f;Lkotlin/ranges/o;)J", "value", "g", "(I)I", "bitCount", "j", "(II)I", "from", "until", "Lkotlin/k2;", "e", "(II)V", "f", "(JJ)V", "", "d", "(DD)V", "", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/RandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
/* loaded from: classes7.dex */
public final class g {
    @l
    @c1(version = "1.3")
    public static final f a(int i4) {
        return new i(i4, i4 >> 31);
    }

    @l
    @c1(version = "1.3")
    public static final f b(long j4) {
        return new i((int) j4, (int) (j4 >> 32));
    }

    @l
    public static final String c(@l Object obj, @l Object obj2) {
        l0.p(obj, ProtectedSandApp.s("斧\u0001"));
        l0.p(obj2, ProtectedSandApp.s("斨\u0001"));
        return ProtectedSandApp.s("斩\u0001") + obj + ProtectedSandApp.s("斪\u0001") + obj2 + ProtectedSandApp.s("斫\u0001");
    }

    public static final void d(double d5, double d6) {
        if (d6 <= d5) {
            throw new IllegalArgumentException(c(Double.valueOf(d5), Double.valueOf(d6)).toString());
        }
    }

    public static final void e(int i4, int i5) {
        if (i5 <= i4) {
            throw new IllegalArgumentException(c(Integer.valueOf(i4), Integer.valueOf(i5)).toString());
        }
    }

    public static final void f(long j4, long j5) {
        if (j5 <= j4) {
            throw new IllegalArgumentException(c(Long.valueOf(j4), Long.valueOf(j5)).toString());
        }
    }

    public static final int g(int i4) {
        return 31 - Integer.numberOfLeadingZeros(i4);
    }

    @c1(version = "1.3")
    public static final int h(@l f fVar, @l kotlin.ranges.l lVar) {
        l0.p(fVar, ProtectedSandApp.s("斬\u0001"));
        l0.p(lVar, ProtectedSandApp.s("断\u0001"));
        if (!lVar.isEmpty()) {
            return lVar.getLast() < Integer.MAX_VALUE ? fVar.n(lVar.getFirst(), lVar.getLast() + 1) : lVar.getFirst() > Integer.MIN_VALUE ? fVar.n(lVar.getFirst() - 1, lVar.getLast()) + 1 : fVar.l();
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("斮\u0001") + lVar);
    }

    @c1(version = "1.3")
    public static final long i(@l f fVar, @l o oVar) {
        l0.p(fVar, ProtectedSandApp.s("斬\u0001"));
        l0.p(oVar, ProtectedSandApp.s("断\u0001"));
        if (!oVar.isEmpty()) {
            return oVar.getLast() < Long.MAX_VALUE ? fVar.q(oVar.getFirst(), oVar.getLast() + 1) : oVar.getFirst() > Long.MIN_VALUE ? fVar.q(oVar.getFirst() - 1, oVar.getLast()) + 1 : fVar.o();
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("斮\u0001") + oVar);
    }

    public static final int j(int i4, int i5) {
        return (i4 >>> (32 - i5)) & ((-i5) >> 31);
    }
}
