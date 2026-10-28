package hb;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.w;

/* compiled from: DefaultParam.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\f\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0006\u0010\u000f¨\u0006\u0016"}, d2 = {"Lhb/e;", "", "<init>", "()V", "", "", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "NTP_HOSTS", "", "c", "J", "a", "()J", "CACHE_EXPIRATION_MS", "MIN_WAIT_TIME_BETWEEN_SYNC_MS", "e", "TIMEOUT_MS", "f", "MAX_NTP_RESPONSE_TIME_MS", "kronos-java"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final e f74129a = new e();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private static final List<String> NTP_HOSTS = w.O(ProtectedSandApp.s("㠓\u0001"), ProtectedSandApp.s("㠔\u0001"), ProtectedSandApp.s("㠑\u0001"), ProtectedSandApp.s("㠒\u0001"));

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final long CACHE_EXPIRATION_MS;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final long MIN_WAIT_TIME_BETWEEN_SYNC_MS;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final long TIMEOUT_MS;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final long MAX_NTP_RESPONSE_TIME_MS;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        CACHE_EXPIRATION_MS = timeUnit.toMillis(1L);
        MIN_WAIT_TIME_BETWEEN_SYNC_MS = timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        TIMEOUT_MS = timeUnit2.toMillis(6L);
        MAX_NTP_RESPONSE_TIME_MS = timeUnit2.toMillis(5L);
    }

    private e() {
    }

    public final long a() {
        return CACHE_EXPIRATION_MS;
    }

    public final long b() {
        return MAX_NTP_RESPONSE_TIME_MS;
    }

    public final long c() {
        return MIN_WAIT_TIME_BETWEEN_SYNC_MS;
    }

    @l
    public final List<String> d() {
        return NTP_HOSTS;
    }

    public final long e() {
        return TIMEOUT_MS;
    }
}
