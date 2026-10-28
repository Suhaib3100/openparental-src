package kotlin.time;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.o2;

/* compiled from: DurationUnitJvm.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlin/time/h;", "Ljava/util/concurrent/TimeUnit;", "e", "(Lkotlin/time/h;)Ljava/util/concurrent/TimeUnit;", "d", "(Ljava/util/concurrent/TimeUnit;)Lkotlin/time/h;", "", "value", "sourceUnit", "targetUnit", "a", "(DLkotlin/time/h;Lkotlin/time/h;)D", "", "c", "(JLkotlin/time/h;Lkotlin/time/h;)J", "b", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
/* loaded from: classes7.dex */
class j {

    /* compiled from: DurationUnitJvm.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f79220a;

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
            f79220a = iArr;
        }
    }

    @c1(version = "1.3")
    public static final double a(double d5, @fg.l h hVar, @fg.l h hVar2) {
        l0.p(hVar, ProtectedSandApp.s("蕄\u0001"));
        l0.p(hVar2, ProtectedSandApp.s("蕅\u0001"));
        long convert = hVar2.getTimeUnit().convert(1L, hVar.getTimeUnit());
        return convert > 0 ? d5 * convert : d5 / hVar.getTimeUnit().convert(1L, hVar2.getTimeUnit());
    }

    @c1(version = "1.5")
    public static final long b(long j4, @fg.l h hVar, @fg.l h hVar2) {
        l0.p(hVar, ProtectedSandApp.s("蕄\u0001"));
        l0.p(hVar2, ProtectedSandApp.s("蕅\u0001"));
        return hVar2.getTimeUnit().convert(j4, hVar.getTimeUnit());
    }

    @c1(version = "1.5")
    public static final long c(long j4, @fg.l h hVar, @fg.l h hVar2) {
        l0.p(hVar, ProtectedSandApp.s("蕄\u0001"));
        l0.p(hVar2, ProtectedSandApp.s("蕅\u0001"));
        return hVar2.getTimeUnit().convert(j4, hVar.getTimeUnit());
    }

    @fg.l
    @o2(markerClass = {l.class})
    @c1(version = "1.8")
    public static final h d(@fg.l TimeUnit timeUnit) {
        l0.p(timeUnit, ProtectedSandApp.s("蕆\u0001"));
        switch (a.f79220a[timeUnit.ordinal()]) {
            case 1:
                return h.NANOSECONDS;
            case 2:
                return h.MICROSECONDS;
            case 3:
                return h.MILLISECONDS;
            case 4:
                return h.SECONDS;
            case 5:
                return h.MINUTES;
            case 6:
                return h.HOURS;
            case 7:
                return h.DAYS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @fg.l
    @o2(markerClass = {l.class})
    @c1(version = "1.8")
    public static final TimeUnit e(@fg.l h hVar) {
        l0.p(hVar, ProtectedSandApp.s("蕆\u0001"));
        return hVar.getTimeUnit();
    }
}
