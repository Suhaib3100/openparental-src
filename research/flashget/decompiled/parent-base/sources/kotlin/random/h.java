package kotlin.random;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;
import kotlin.a2;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.o2;
import kotlin.ranges.a0;
import kotlin.ranges.x;
import kotlin.t;
import kotlin.w1;

/* compiled from: URandom.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0013\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0016\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u001a\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001e\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a/\u0010\"\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010 \u001a\u00020\u001c2\b\b\u0002\u0010!\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010%\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b%\u0010&\u001a\u001f\u0010'\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000eH\u0000¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lkotlin/random/f;", "Lkotlin/w1;", "g", "(Lkotlin/random/f;)I", "until", "j", "(Lkotlin/random/f;I)I", "from", "i", "(Lkotlin/random/f;II)I", "Lkotlin/ranges/x;", "range", "h", "(Lkotlin/random/f;Lkotlin/ranges/x;)I", "Lkotlin/a2;", "k", "(Lkotlin/random/f;)J", "m", "(Lkotlin/random/f;J)J", "n", "(Lkotlin/random/f;JJ)J", "Lkotlin/ranges/a0;", "l", "(Lkotlin/random/f;Lkotlin/ranges/a0;)J", "Lkotlin/t1;", "array", "d", "(Lkotlin/random/f;[B)[B", "", "size", "c", "(Lkotlin/random/f;I)[B", "fromIndex", "toIndex", "e", "(Lkotlin/random/f;[BII)[B", "Lkotlin/k2;", "a", "(II)V", "b", "(JJ)V", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nURandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URandom.kt\nkotlin/random/URandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
/* loaded from: classes7.dex */
public final class h {
    public static final void a(int i4, int i5) {
        int compare;
        compare = Integer.compare(i5 ^ Integer.MIN_VALUE, i4 ^ Integer.MIN_VALUE);
        if (compare <= 0) {
            throw new IllegalArgumentException(g.c(w1.b(i4), w1.b(i5)).toString());
        }
    }

    public static final void b(long j4, long j5) {
        int compare;
        compare = Long.compare(j5 ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE);
        if (compare <= 0) {
            throw new IllegalArgumentException(g.c(a2.b(j4), a2.b(j5)).toString());
        }
    }

    @l
    @c1(version = "1.3")
    @t
    public static final byte[] c(@l f fVar, int i4) {
        l0.p(fVar, ProtectedSandApp.s("斯\u0001"));
        byte[] d5 = fVar.d(i4);
        l0.p(d5, ProtectedSandApp.s("新\u0001"));
        return d5;
    }

    @l
    @c1(version = "1.3")
    @t
    public static final byte[] d(@l f fVar, @l byte[] bArr) {
        l0.p(fVar, ProtectedSandApp.s("斱\u0001"));
        l0.p(bArr, ProtectedSandApp.s("斲\u0001"));
        fVar.e(bArr);
        return bArr;
    }

    @l
    @c1(version = "1.3")
    @t
    public static final byte[] e(@l f fVar, @l byte[] bArr, int i4, int i5) {
        l0.p(fVar, ProtectedSandApp.s("斱\u0001"));
        l0.p(bArr, ProtectedSandApp.s("斲\u0001"));
        fVar.f(bArr, i4, i5);
        return bArr;
    }

    public static byte[] f(f fVar, byte[] bArr, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = bArr.length;
        }
        return e(fVar, bArr, i4, i5);
    }

    @o2(markerClass = {t.class})
    @c1(version = "1.5")
    public static final int g(@l f fVar) {
        l0.p(fVar, ProtectedSandApp.s("斯\u0001"));
        return w1.h(fVar.l());
    }

    @o2(markerClass = {t.class})
    @c1(version = "1.5")
    public static final int h(@l f fVar, @l x xVar) {
        int compare;
        int compare2;
        l0.p(fVar, ProtectedSandApp.s("斯\u0001"));
        l0.p(xVar, ProtectedSandApp.s("斳\u0001"));
        if (xVar.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("斴\u0001") + xVar);
        }
        compare = Integer.compare(xVar.getLast() ^ Integer.MIN_VALUE, (-1) ^ Integer.MIN_VALUE);
        if (compare < 0) {
            return i(fVar, xVar.getFirst(), w1.h(xVar.getLast() + 1));
        }
        compare2 = Integer.compare(xVar.getFirst() ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE);
        return compare2 > 0 ? i(fVar, w1.h(xVar.getFirst() - 1), xVar.getLast()) + 1 : g(fVar);
    }

    @o2(markerClass = {t.class})
    @c1(version = "1.5")
    public static final int i(@l f fVar, int i4, int i5) {
        l0.p(fVar, ProtectedSandApp.s("斵\u0001"));
        a(i4, i5);
        return w1.h(fVar.n(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    @o2(markerClass = {t.class})
    @c1(version = "1.5")
    public static final int j(@l f fVar, int i4) {
        l0.p(fVar, ProtectedSandApp.s("斵\u0001"));
        return i(fVar, 0, i4);
    }

    @o2(markerClass = {t.class})
    @c1(version = "1.5")
    public static final long k(@l f fVar) {
        l0.p(fVar, ProtectedSandApp.s("斯\u0001"));
        return a2.h(fVar.o());
    }

    @o2(markerClass = {t.class})
    @c1(version = "1.5")
    public static final long l(@l f fVar, @l a0 a0Var) {
        int compare;
        int compare2;
        l0.p(fVar, ProtectedSandApp.s("斯\u0001"));
        l0.p(a0Var, ProtectedSandApp.s("斳\u0001"));
        if (a0Var.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("斴\u0001") + a0Var);
        }
        compare = Long.compare(a0Var.getLast() ^ Long.MIN_VALUE, (-1) ^ Long.MIN_VALUE);
        if (compare < 0) {
            return n(fVar, a0Var.getFirst(), a2.h(1 & 4294967295L) + a0Var.getLast());
        }
        compare2 = Long.compare(a0Var.getFirst() ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE);
        if (compare2 <= 0) {
            return k(fVar);
        }
        long j4 = 1 & 4294967295L;
        return n(fVar, a0Var.getFirst() - a2.h(j4), a0Var.getLast()) + j4;
    }

    @o2(markerClass = {t.class})
    @c1(version = "1.5")
    public static final long m(@l f fVar, long j4) {
        l0.p(fVar, ProtectedSandApp.s("斶\u0001"));
        return n(fVar, 0L, j4);
    }

    @o2(markerClass = {t.class})
    @c1(version = "1.5")
    public static final long n(@l f fVar, long j4, long j5) {
        l0.p(fVar, ProtectedSandApp.s("斶\u0001"));
        b(j4, j5);
        return a2.h(fVar.q(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }
}
