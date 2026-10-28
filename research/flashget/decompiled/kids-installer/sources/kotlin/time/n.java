package kotlin.time;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlin.time.TimeSource;

/* compiled from: measureTime.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0005\u001a3\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\n\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\f\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"measureTime", "Lkotlin/time/Duration;", "block", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)J", "measureTimedValue", "Lkotlin/time/TimedValue;", "T", "Lkotlin/time/TimeSource;", "(Lkotlin/time/TimeSource;Lkotlin/jvm/functions/Function0;)J", "Lkotlin/time/TimeSource$Monotonic;", "(Lkotlin/time/TimeSource$Monotonic;Lkotlin/jvm/functions/Function0;)J", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nmeasureTime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 measureTime.kt\nkotlin/time/MeasureTimeKt\n*L\n1#1,121:1\n50#1,7:122\n113#1,7:129\n*S KotlinDebug\n*F\n+ 1 measureTime.kt\nkotlin/time/MeasureTimeKt\n*L\n21#1:122,7\n83#1:129,7\n*E\n"})
/* loaded from: classes5.dex */
public final class n {
    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long a(@d5.d TimeSource.b bVar, @d5.d q3.a<m2> aVar) {
        l0.p(bVar, ProtectedSandApp.s("屖"));
        l0.p(aVar, ProtectedSandApp.s("屗"));
        long b6 = bVar.b();
        aVar.n();
        return TimeSource.b.a.r(b6);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long b(@d5.d TimeSource timeSource, @d5.d q3.a<m2> aVar) {
        l0.p(timeSource, ProtectedSandApp.s("屘"));
        l0.p(aVar, ProtectedSandApp.s("屙"));
        TimeMark a6 = timeSource.a();
        aVar.n();
        return a6.h();
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long c(@d5.d q3.a<m2> aVar) {
        l0.p(aVar, ProtectedSandApp.s("屚"));
        long b6 = TimeSource.b.f27214b.b();
        aVar.n();
        return TimeSource.b.a.r(b6);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    @d5.d
    public static final <T> TimedValue<T> d(@d5.d TimeSource.b bVar, @d5.d q3.a<? extends T> aVar) {
        l0.p(bVar, ProtectedSandApp.s("屛"));
        l0.p(aVar, ProtectedSandApp.s("屜"));
        return new TimedValue<>(aVar.n(), TimeSource.b.a.r(bVar.b()), null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    @d5.d
    public static final <T> TimedValue<T> e(@d5.d TimeSource timeSource, @d5.d q3.a<? extends T> aVar) {
        l0.p(timeSource, ProtectedSandApp.s("屝"));
        l0.p(aVar, ProtectedSandApp.s("属"));
        return new TimedValue<>(aVar.n(), timeSource.a().h(), null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    @d5.d
    public static final <T> TimedValue<T> f(@d5.d q3.a<? extends T> aVar) {
        l0.p(aVar, ProtectedSandApp.s("屟"));
        return new TimedValue<>(aVar.n(), TimeSource.b.a.r(TimeSource.b.f27214b.b()), null);
    }
}
