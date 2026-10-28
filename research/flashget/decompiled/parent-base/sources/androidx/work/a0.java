package androidx.work;

import androidx.annotation.x0;
import androidx.work.z;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: PeriodicWorkRequest.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a,\u0010\u0007\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a$\u0010\n\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\tH\u0087\b¢\u0006\u0004\b\n\u0010\u000b\u001a<\u0010\u000e\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a,\u0010\u0010\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/work/ListenableWorker;", "W", "", "repeatInterval", "Ljava/util/concurrent/TimeUnit;", "repeatIntervalTimeUnit", "Landroidx/work/z$a;", "a", "(JLjava/util/concurrent/TimeUnit;)Landroidx/work/z$a;", "Ljava/time/Duration;", "c", "(Ljava/time/Duration;)Landroidx/work/z$a;", "flexTimeInterval", "flexTimeIntervalUnit", "b", "(JLjava/util/concurrent/TimeUnit;JLjava/util/concurrent/TimeUnit;)Landroidx/work/z$a;", "d", "(Ljava/time/Duration;Ljava/time/Duration;)Landroidx/work/z$a;", "work-runtime-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class a0 {
    public static final <W extends ListenableWorker> z.a a(long j4, TimeUnit repeatIntervalTimeUnit) {
        l0.p(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        l0.P();
        return new z.a((Class<? extends ListenableWorker>) ListenableWorker.class, j4, repeatIntervalTimeUnit);
    }

    public static final <W extends ListenableWorker> z.a b(long j4, TimeUnit repeatIntervalTimeUnit, long j5, TimeUnit flexTimeIntervalUnit) {
        l0.p(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        l0.p(flexTimeIntervalUnit, "flexTimeIntervalUnit");
        l0.P();
        return new z.a(ListenableWorker.class, j4, repeatIntervalTimeUnit, j5, flexTimeIntervalUnit);
    }

    @x0(26)
    public static final <W extends ListenableWorker> z.a c(Duration repeatInterval) {
        l0.p(repeatInterval, "repeatInterval");
        l0.P();
        return new z.a(ListenableWorker.class, repeatInterval);
    }

    @x0(26)
    public static final <W extends ListenableWorker> z.a d(Duration repeatInterval, Duration flexTimeInterval) {
        l0.p(repeatInterval, "repeatInterval");
        l0.p(flexTimeInterval, "flexTimeInterval");
        l0.P();
        return new z.a((Class<? extends ListenableWorker>) ListenableWorker.class, repeatInterval, flexTimeInterval);
    }
}
