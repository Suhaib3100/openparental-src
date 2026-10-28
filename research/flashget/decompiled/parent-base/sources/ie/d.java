package ie;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.time.Duration;
import kd.i;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.internal.f;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.o2;
import kotlin.time.e;
import kotlin.time.g;
import kotlin.time.h;
import kotlin.time.l;

/* compiled from: DurationConversions.kt */
@i(name = "DurationConversionsJDK8Kt")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"Ljava/time/Duration;", "Lkotlin/time/e;", "b", "(Ljava/time/Duration;)J", "a", "(J)Ljava/time/Duration;", "kotlin-stdlib-jdk8"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nDurationConversions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n+ 2 Duration.kt\nkotlin/time/Duration\n*L\n1#1,33:1\n731#2,2:34\n*S KotlinDebug\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n*L\n33#1:34,2\n*E\n"})
/* loaded from: classes7.dex */
public final class d {
    @o2(markerClass = {l.class})
    @c1(version = "1.6")
    @f
    private static final Duration a(long j4) {
        Duration ofSeconds;
        ofSeconds = Duration.ofSeconds(e.Q(j4), e.U(j4));
        l0.o(ofSeconds, ProtectedSandApp.s("恓\u0001"));
        return ofSeconds;
    }

    @o2(markerClass = {l.class})
    @c1(version = "1.6")
    @f
    private static final long b(Duration duration) {
        long seconds;
        int nano;
        l0.p(duration, ProtectedSandApp.s("恔\u0001"));
        seconds = duration.getSeconds();
        long n02 = g.n0(seconds, h.SECONDS);
        nano = duration.getNano();
        return e.i0(n02, g.m0(nano, h.NANOSECONDS));
    }
}
