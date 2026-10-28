package kotlin.time;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.l0;
import kotlin.time.TimeMark;

/* compiled from: TimeSource.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\bH¦\u0002J\b\u0010\t\u001a\u00020\u0004H&J\u001b\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0000H¦\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bH¦\u0002¢\u0006\u0004\b\u0012\u0010\u0010\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0013"}, d2 = {"Lkotlin/time/ComparableTimeMark;", "Lkotlin/time/TimeMark;", "", "compareTo", "", "other", "equals", "", "", "hashCode", "minus", "Lkotlin/time/Duration;", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "duration", "minus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "plus", "plus-LRDsOJo", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = {ExperimentalTime.class})
/* renamed from: kotlin.time.d, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public interface ComparableTimeMark extends TimeMark, Comparable<ComparableTimeMark> {

    /* compiled from: TimeSource.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.time.d$a */
    public static final class a {
        public static int a(@d5.d ComparableTimeMark comparableTimeMark, @d5.d ComparableTimeMark comparableTimeMark2) {
            l0.p(comparableTimeMark2, ProtectedSandApp.s("寴"));
            long i5 = comparableTimeMark.i(comparableTimeMark2);
            Duration.f27196p.getClass();
            return Duration.r(i5, Duration.f27197q);
        }

        public static boolean b(@d5.d ComparableTimeMark comparableTimeMark) {
            return TimeMark.a.a(comparableTimeMark);
        }

        public static boolean c(@d5.d ComparableTimeMark comparableTimeMark) {
            return TimeMark.a.b(comparableTimeMark);
        }

        @d5.d
        public static ComparableTimeMark d(@d5.d ComparableTimeMark comparableTimeMark, long j5) {
            return comparableTimeMark.d(Duration.E0(j5));
        }
    }

    @Override // kotlin.time.TimeMark
    @d5.d
    ComparableTimeMark c(long j5);

    @Override // kotlin.time.TimeMark
    @d5.d
    ComparableTimeMark d(long j5);

    boolean equals(@d5.e Object other);

    int hashCode();

    long i(@d5.d ComparableTimeMark comparableTimeMark);

    int m(@d5.d ComparableTimeMark comparableTimeMark);
}
