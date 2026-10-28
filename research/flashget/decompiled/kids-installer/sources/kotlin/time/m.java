package kotlin.time;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.time.Duration;

/* compiled from: longSaturatedMath.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000e\u001a%\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0001H\u0080\b¨\u0006\u001d"}, d2 = {"checkInfiniteSumDefined", "", "value", "duration", "Lkotlin/time/Duration;", "durationInUnit", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "infinityOfSign", "(J)J", "saturatingAdd", "unit", "Lkotlin/time/DurationUnit;", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "saturatingAddInHalves", "saturatingAddInHalves-NuflL3o", "saturatingDiff", "valueNs", "origin", "(JJLkotlin/time/DurationUnit;)J", "saturatingFiniteDiff", "value1", "value2", "saturatingOriginsDiff", "origin1", "origin2", "isSaturated", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
/* loaded from: classes5.dex */
public final class m {
    private static final long a(long j5, long j6, long j7) {
        if (!Duration.j0(j6) || (j5 ^ j7) >= 0) {
            return j5;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("屒"));
    }

    private static final long b(long j5) {
        if (j5 < 0) {
            Duration.f27196p.getClass();
            return Duration.f27199s;
        }
        Duration.f27196p.getClass();
        return Duration.f27198r;
    }

    public static final boolean c(long j5) {
        return ((j5 - 1) | 1) == Long.MAX_VALUE;
    }

    public static final long d(long j5, @d5.d DurationUnit durationUnit, long j6) {
        l0.p(durationUnit, ProtectedSandApp.s("屓"));
        long x02 = Duration.x0(j6, durationUnit);
        if (((j5 - 1) | 1) == Long.MAX_VALUE) {
            return a(j5, j6, x02);
        }
        if ((1 | (x02 - 1)) == Long.MAX_VALUE) {
            return e(j5, durationUnit, j6);
        }
        long j7 = j5 + x02;
        return ((j5 ^ j7) & (x02 ^ j7)) < 0 ? j5 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j7;
    }

    private static final long e(long j5, DurationUnit durationUnit, long j6) {
        long v5 = Duration.v(j6, 2);
        long x02 = Duration.x0(v5, durationUnit);
        return ((1 | (x02 - 1)) > Long.MAX_VALUE ? 1 : ((1 | (x02 - 1)) == Long.MAX_VALUE ? 0 : -1)) == 0 ? x02 : d(d(j5, durationUnit, v5), durationUnit, Duration.m0(j6, v5));
    }

    public static final long f(long j5, long j6, @d5.d DurationUnit durationUnit) {
        l0.p(durationUnit, ProtectedSandApp.s("屔"));
        return ((1 | (j6 - 1)) > Long.MAX_VALUE ? 1 : ((1 | (j6 - 1)) == Long.MAX_VALUE ? 0 : -1)) == 0 ? Duration.E0(b(j6)) : g(j5, j6, durationUnit);
    }

    private static final long g(long j5, long j6, DurationUnit durationUnit) {
        long j7 = j5 - j6;
        if (((j7 ^ j5) & (~(j7 ^ j6))) >= 0) {
            return g.n0(j7, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return Duration.E0(b(j7));
        }
        long b6 = j.b(1L, durationUnit2, durationUnit);
        long j8 = (j5 / b6) - (j6 / b6);
        long j9 = (j5 % b6) - (j6 % b6);
        Duration.a aVar = Duration.f27196p;
        return Duration.n0(g.n0(j8, durationUnit2), g.n0(j9, durationUnit));
    }

    public static final long h(long j5, long j6, @d5.d DurationUnit durationUnit) {
        l0.p(durationUnit, ProtectedSandApp.s("展"));
        if (!(((j6 - 1) | 1) == Long.MAX_VALUE)) {
            return (1 | (j5 - 1)) == Long.MAX_VALUE ? b(j5) : g(j5, j6, durationUnit);
        }
        if (j5 != j6) {
            return Duration.E0(b(j6));
        }
        Duration.f27196p.getClass();
        return Duration.f27197q;
    }
}
