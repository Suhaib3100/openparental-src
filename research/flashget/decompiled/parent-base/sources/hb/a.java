package hb;

import android.content.Context;
import android.content.SharedPreferences;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.List;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: AndroidClockFactory.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J[\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lhb/a;", "", "<init>", "()V", "Lhb/c;", "a", "()Lhb/c;", "Landroid/content/Context;", "context", "Lhb/i;", "syncListener", "", "", "ntpHosts", "", "requestTimeoutMs", "minWaitTimeBetweenSyncMs", "cacheExpirationMs", "maxNtpResponseTimeMs", "Lhb/f;", "h", "(Landroid/content/Context;Lhb/i;Ljava/util/List;JJJJ)Lhb/f;", "kronos-android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final a f74124a = new a();

    private a() {
    }

    @l
    @n
    public static final c a() {
        return new ib.a();
    }

    @l
    @kd.j
    @n
    public static final f b(@l Context context) {
        l0.p(context, ProtectedSandApp.s("㠇\u0001"));
        return i(context, null, null, 0L, 0L, 0L, 0L, 126, null);
    }

    @l
    @kd.j
    @n
    public static final f c(@l Context context, @m i iVar) {
        l0.p(context, ProtectedSandApp.s("㠇\u0001"));
        return i(context, iVar, null, 0L, 0L, 0L, 0L, 124, null);
    }

    @l
    @kd.j
    @n
    public static final f d(@l Context context, @m i iVar, @l List<String> list) {
        l0.p(context, ProtectedSandApp.s("㠇\u0001"));
        l0.p(list, ProtectedSandApp.s("㠈\u0001"));
        return i(context, iVar, list, 0L, 0L, 0L, 0L, 120, null);
    }

    @l
    @kd.j
    @n
    public static final f e(@l Context context, @m i iVar, @l List<String> list, long j4) {
        l0.p(context, ProtectedSandApp.s("㠇\u0001"));
        l0.p(list, ProtectedSandApp.s("㠈\u0001"));
        return i(context, iVar, list, j4, 0L, 0L, 0L, 112, null);
    }

    @l
    @kd.j
    @n
    public static final f f(@l Context context, @m i iVar, @l List<String> list, long j4, long j5) {
        l0.p(context, ProtectedSandApp.s("㠇\u0001"));
        l0.p(list, ProtectedSandApp.s("㠈\u0001"));
        return i(context, iVar, list, j4, j5, 0L, 0L, 96, null);
    }

    @l
    @kd.j
    @n
    public static final f g(@l Context context, @m i iVar, @l List<String> list, long j4, long j5, long j6) {
        l0.p(context, ProtectedSandApp.s("㠇\u0001"));
        l0.p(list, ProtectedSandApp.s("㠈\u0001"));
        return i(context, iVar, list, j4, j5, j6, 0L, 64, null);
    }

    @l
    @kd.j
    @n
    public static final f h(@l Context context, @m i syncListener, @l List<String> ntpHosts, long requestTimeoutMs, long minWaitTimeBetweenSyncMs, long cacheExpirationMs, long maxNtpResponseTimeMs) {
        l0.p(context, ProtectedSandApp.s("㠇\u0001"));
        l0.p(ntpHosts, ProtectedSandApp.s("㠈\u0001"));
        ib.a aVar = new ib.a();
        SharedPreferences sharedPreferences = context.getSharedPreferences(ProtectedSandApp.s("㠉\u0001"), 0);
        l0.o(sharedPreferences, ProtectedSandApp.s("㠊\u0001"));
        return d.g(aVar, new ib.d(sharedPreferences), syncListener, ntpHosts, requestTimeoutMs, minWaitTimeBetweenSyncMs, cacheExpirationMs, maxNtpResponseTimeMs);
    }

    public static /* synthetic */ f i(Context context, i iVar, List list, long j4, long j5, long j6, long j7, int i4, Object obj) {
        return h(context, (i4 & 2) != 0 ? null : iVar, (i4 & 4) != 0 ? e.f74129a.d() : list, (i4 & 8) != 0 ? e.f74129a.e() : j4, (i4 & 16) != 0 ? e.f74129a.c() : j5, (i4 & 32) != 0 ? e.f74129a.a() : j6, (i4 & 64) != 0 ? e.f74129a.b() : j7);
    }
}
