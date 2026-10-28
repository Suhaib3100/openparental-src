package kotlin.time;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.l0;

/* compiled from: DurationUnitJvm.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u001a \u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u001a \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u001a\f\u0010\b\u001a\u00020\u0004*\u00020\tH\u0007\u001a\f\u0010\n\u001a\u00020\t*\u00020\u0004H\u0007¨\u0006\u000b"}, d2 = {"convertDurationUnit", "", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "", "convertDurationUnitOverflow", "toDurationUnit", "Ljava/util/concurrent/TimeUnit;", "toTimeUnit", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
/* loaded from: classes5.dex */
class j {

    /* compiled from: DurationUnitJvm.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27207a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f27207a = iArr;
        }
    }

    @SinceKotlin(version = "1.3")
    public static final double a(double d6, @d5.d DurationUnit durationUnit, @d5.d DurationUnit durationUnit2) {
        l0.p(durationUnit, ProtectedSandApp.s("尶"));
        l0.p(durationUnit2, ProtectedSandApp.s("尷"));
        long convert = durationUnit2.getTimeUnit().convert(1L, durationUnit.getTimeUnit());
        return convert > 0 ? d6 * convert : d6 / durationUnit.getTimeUnit().convert(1L, durationUnit2.getTimeUnit());
    }

    @SinceKotlin(version = "1.5")
    public static final long b(long j5, @d5.d DurationUnit durationUnit, @d5.d DurationUnit durationUnit2) {
        l0.p(durationUnit, ProtectedSandApp.s("尸"));
        l0.p(durationUnit2, ProtectedSandApp.s("尹"));
        return durationUnit2.getTimeUnit().convert(j5, durationUnit.getTimeUnit());
    }

    @SinceKotlin(version = "1.5")
    public static final long c(long j5, @d5.d DurationUnit durationUnit, @d5.d DurationUnit durationUnit2) {
        l0.p(durationUnit, ProtectedSandApp.s("尺"));
        l0.p(durationUnit2, ProtectedSandApp.s("尻"));
        return durationUnit2.getTimeUnit().convert(j5, durationUnit.getTimeUnit());
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    @d5.d
    public static final DurationUnit d(@d5.d TimeUnit timeUnit) {
        l0.p(timeUnit, ProtectedSandApp.s("尼"));
        switch (a.f27207a[timeUnit.ordinal()]) {
            case 1:
                return DurationUnit.NANOSECONDS;
            case 2:
                return DurationUnit.MICROSECONDS;
            case 3:
                return DurationUnit.MILLISECONDS;
            case 4:
                return DurationUnit.SECONDS;
            case 5:
                return DurationUnit.MINUTES;
            case 6:
                return DurationUnit.HOURS;
            case 7:
                return DurationUnit.DAYS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    @d5.d
    public static final TimeUnit e(@d5.d DurationUnit durationUnit) {
        l0.p(durationUnit, ProtectedSandApp.s("尽"));
        return durationUnit.getTimeUnit();
    }
}
