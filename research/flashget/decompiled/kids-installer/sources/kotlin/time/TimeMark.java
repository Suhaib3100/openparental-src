package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;

/* compiled from: TimeSource.kt */
@SinceKotlin(version = "1.9")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\f\u0082\u0002\u0004\n\u0002\b!¨\u0006\u000f"}, d2 = {"Lkotlin/time/TimeMark;", "", "elapsedNow", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "()J", "hasNotPassedNow", "", "hasPassedNow", "minus", "duration", "minus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "plus", "plus-LRDsOJo", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
/* renamed from: kotlin.time.r, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public interface TimeMark {

    /* compiled from: TimeSource.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.time.r$a */
    public static final class a {
        public static boolean a(@d5.d TimeMark timeMark) {
            return Duration.k0(timeMark.h());
        }

        public static boolean b(@d5.d TimeMark timeMark) {
            return !Duration.k0(timeMark.h());
        }

        @d5.d
        public static TimeMark c(@d5.d TimeMark timeMark, long j5) {
            return timeMark.d(Duration.E0(j5));
        }

        @d5.d
        public static TimeMark d(@d5.d TimeMark timeMark, long j5) {
            return new AdjustedTimeMark(timeMark, j5, null);
        }
    }

    @d5.d
    TimeMark c(long j5);

    @d5.d
    TimeMark d(long j5);

    boolean g();

    long h();

    boolean j();
}
