package hb;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.lyft.kronos.internal.ntp.k;
import fg.l;
import fg.m;
import java.util.List;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ClockFactory.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lhb/d;", "", "<init>", "()V", "Lhb/c;", "localClock", "Lhb/j;", "syncResponseCache", "Lhb/i;", "syncListener", "", "", "ntpHosts", "", "requestTimeoutMs", "minWaitTimeBetweenSyncMs", "cacheExpirationMs", "maxNtpResponseTimeMs", "Lhb/f;", "g", "(Lhb/c;Lhb/j;Lhb/i;Ljava/util/List;JJJJ)Lhb/f;", "kronos-java"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final d f74128a = new d();

    private d() {
    }

    @l
    @kd.j
    @n
    public static final f a(@l c cVar, @l j jVar) {
        l0.p(cVar, ProtectedSandApp.s("㠍\u0001"));
        l0.p(jVar, ProtectedSandApp.s("㠎\u0001"));
        return h(cVar, jVar, null, null, 0L, 0L, 0L, 0L, 252, null);
    }

    @l
    @kd.j
    @n
    public static final f b(@l c cVar, @l j jVar, @m i iVar) {
        l0.p(cVar, ProtectedSandApp.s("㠍\u0001"));
        l0.p(jVar, ProtectedSandApp.s("㠎\u0001"));
        return h(cVar, jVar, iVar, null, 0L, 0L, 0L, 0L, 248, null);
    }

    @l
    @kd.j
    @n
    public static final f c(@l c cVar, @l j jVar, @m i iVar, @l List<String> list) {
        l0.p(cVar, ProtectedSandApp.s("㠍\u0001"));
        l0.p(jVar, ProtectedSandApp.s("㠎\u0001"));
        l0.p(list, ProtectedSandApp.s("㠏\u0001"));
        return h(cVar, jVar, iVar, list, 0L, 0L, 0L, 0L, 240, null);
    }

    @l
    @kd.j
    @n
    public static final f d(@l c cVar, @l j jVar, @m i iVar, @l List<String> list, long j4) {
        l0.p(cVar, ProtectedSandApp.s("㠍\u0001"));
        l0.p(jVar, ProtectedSandApp.s("㠎\u0001"));
        l0.p(list, ProtectedSandApp.s("㠏\u0001"));
        return h(cVar, jVar, iVar, list, j4, 0L, 0L, 0L, 224, null);
    }

    @l
    @kd.j
    @n
    public static final f e(@l c cVar, @l j jVar, @m i iVar, @l List<String> list, long j4, long j5) {
        l0.p(cVar, ProtectedSandApp.s("㠍\u0001"));
        l0.p(jVar, ProtectedSandApp.s("㠎\u0001"));
        l0.p(list, ProtectedSandApp.s("㠏\u0001"));
        return h(cVar, jVar, iVar, list, j4, j5, 0L, 0L, 192, null);
    }

    @l
    @kd.j
    @n
    public static final f f(@l c cVar, @l j jVar, @m i iVar, @l List<String> list, long j4, long j5, long j6) {
        l0.p(cVar, ProtectedSandApp.s("㠍\u0001"));
        l0.p(jVar, ProtectedSandApp.s("㠎\u0001"));
        l0.p(list, ProtectedSandApp.s("㠏\u0001"));
        return h(cVar, jVar, iVar, list, j4, j5, j6, 0L, 128, null);
    }

    @l
    @kd.j
    @n
    public static final f g(@l c localClock, @l j syncResponseCache, @m i syncListener, @l List<String> ntpHosts, long requestTimeoutMs, long minWaitTimeBetweenSyncMs, long cacheExpirationMs, long maxNtpResponseTimeMs) {
        l0.p(localClock, ProtectedSandApp.s("㠍\u0001"));
        l0.p(syncResponseCache, ProtectedSandApp.s("㠎\u0001"));
        l0.p(ntpHosts, ProtectedSandApp.s("㠏\u0001"));
        if (localClock instanceof f) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㠐\u0001"));
        }
        return new ib.c(new k(new com.lyft.kronos.internal.ntp.e(localClock, new com.lyft.kronos.internal.ntp.d(), new com.lyft.kronos.internal.ntp.b()), localClock, new com.lyft.kronos.internal.ntp.g(syncResponseCache, localClock), syncListener, ntpHosts, requestTimeoutMs, minWaitTimeBetweenSyncMs, cacheExpirationMs, maxNtpResponseTimeMs), localClock);
    }

    public static /* synthetic */ f h(c cVar, j jVar, i iVar, List list, long j4, long j5, long j6, long j7, int i4, Object obj) {
        return g(cVar, jVar, (i4 & 4) != 0 ? null : iVar, (i4 & 8) != 0 ? e.f74129a.d() : list, (i4 & 16) != 0 ? e.f74129a.e() : j4, (i4 & 32) != 0 ? e.f74129a.c() : j5, (i4 & 64) != 0 ? e.f74129a.a() : j6, (i4 & 128) != 0 ? e.f74129a.b() : j7);
    }
}
