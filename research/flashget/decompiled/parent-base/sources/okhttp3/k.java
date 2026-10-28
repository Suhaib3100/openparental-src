package okhttp3;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ConnectionPool.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fB\t\b\u0016¢\u0006\u0004\b\u0004\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/k;", "", "Lokhttp3/internal/connection/h;", "delegate", "<init>", "(Lokhttp3/internal/connection/h;)V", "", "maxIdleConnections", "", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "(IJLjava/util/concurrent/TimeUnit;)V", "()V", "d", "()I", "a", "Lkotlin/k2;", "b", "Lokhttp3/internal/connection/h;", "c", "()Lokhttp3/internal/connection/h;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final okhttp3.internal.connection.h delegate;

    public k(@fg.l okhttp3.internal.connection.h hVar) {
        l0.p(hVar, ProtectedSandApp.s("ꆥ\u0001"));
        this.delegate = hVar;
    }

    public final int a() {
        return this.delegate.d();
    }

    public final void b() {
        this.delegate.e();
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final okhttp3.internal.connection.h getDelegate() {
        return this.delegate;
    }

    public final int d() {
        return this.delegate.f();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(int i4, long j4, @fg.l TimeUnit timeUnit) {
        this(new okhttp3.internal.connection.h(okhttp3.internal.concurrent.d.f84336h, i4, j4, timeUnit));
        l0.p(timeUnit, ProtectedSandApp.s("ꆤ\u0001"));
    }

    public k() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
