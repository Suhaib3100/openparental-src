package kotlin.time;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.time.e;

/* compiled from: longSaturatedMath.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\t\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\u0011\u001a'\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0011\u001a\u0014\u0010\u0019\u001a\u00020\u0018*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"", "value", "Lkotlin/time/h;", "unit", "Lkotlin/time/e;", "duration", "d", "(JLkotlin/time/h;J)J", "durationInUnit", "a", "(JJJ)J", "e", "b", "(J)J", "valueNs", "origin", "f", "(JJLkotlin/time/h;)J", "origin1", "origin2", "h", "value1", "value2", "g", "", "c", "(J)Z", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
/* loaded from: classes7.dex */
public final class m {
    private static final long a(long j4, long j5, long j6) {
        if (!e.e0(j5) || (j4 ^ j6) >= 0) {
            return j4;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("蕔\u0001"));
    }

    private static final long b(long j4) {
        if (j4 < 0) {
            e.INSTANCE.getClass();
            return e.f79212f;
        }
        e.INSTANCE.getClass();
        return e.f79211e;
    }

    public static final boolean c(long j4) {
        return ((j4 - 1) | 1) == Long.MAX_VALUE;
    }

    public static final long d(long j4, @fg.l h hVar, long j5) {
        l0.p(hVar, ProtectedSandApp.s("蕕\u0001"));
        long t02 = e.t0(j5, hVar);
        if (((j4 - 1) | 1) == Long.MAX_VALUE) {
            return a(j4, j5, t02);
        }
        if ((1 | (t02 - 1)) == Long.MAX_VALUE) {
            return e(j4, hVar, j5);
        }
        long j6 = j4 + t02;
        return ((j4 ^ j6) & (t02 ^ j6)) < 0 ? j4 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j6;
    }

    private static final long e(long j4, h hVar, long j5) {
        long l4 = e.l(j5, 2);
        long t02 = e.t0(l4, hVar);
        return (1 | (t02 - 1)) == Long.MAX_VALUE ? t02 : d(d(j4, hVar, l4), hVar, e.h0(j5, l4));
    }

    public static final long f(long j4, long j5, @fg.l h hVar) {
        l0.p(hVar, ProtectedSandApp.s("蕕\u0001"));
        return (1 | (j5 - 1)) == Long.MAX_VALUE ? e.A0(b(j5)) : g(j4, j5, hVar);
    }

    private static final long g(long j4, long j5, h hVar) {
        long j6 = j4 - j5;
        if (((j6 ^ j4) & (~(j6 ^ j5))) >= 0) {
            return g.n0(j6, hVar);
        }
        h hVar2 = h.MILLISECONDS;
        if (hVar.compareTo(hVar2) >= 0) {
            return e.A0(b(j6));
        }
        long b5 = j.b(1L, hVar2, hVar);
        long j7 = (j4 / b5) - (j5 / b5);
        long j10 = (j4 % b5) - (j5 % b5);
        e.Companion companion = e.INSTANCE;
        return e.i0(g.n0(j7, hVar2), g.n0(j10, hVar));
    }

    public static final long h(long j4, long j5, @fg.l h hVar) {
        l0.p(hVar, ProtectedSandApp.s("蕕\u0001"));
        if (((j5 - 1) | 1) != Long.MAX_VALUE) {
            return (1 | (j4 - 1)) == Long.MAX_VALUE ? b(j4) : g(j4, j5, hVar);
        }
        if (j4 != j5) {
            return e.A0(b(j5));
        }
        e.INSTANCE.getClass();
        return e.f79210d;
    }
}
