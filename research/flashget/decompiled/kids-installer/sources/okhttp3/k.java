package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: ConnectionPool.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rB!\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0013B\t\b\u0016¢\u0006\u0004\b\f\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005R\u001a\u0010\u000b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lokhttp3/k;", "", "", "d", "a", "Lkotlin/m2;", "b", "Lokhttp3/internal/connection/h;", "Lokhttp3/internal/connection/h;", "c", "()Lokhttp3/internal/connection/h;", "delegate", "<init>", "(Lokhttp3/internal/connection/h;)V", "maxIdleConnections", "", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "(IJLjava/util/concurrent/TimeUnit;)V", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final okhttp3.internal.connection.h delegate;

    public k(@d5.d okhttp3.internal.connection.h hVar) {
        kotlin.jvm.internal.l0.p(hVar, ProtectedSandApp.s("昨"));
        this.delegate = hVar;
    }

    public final int a() {
        return this.delegate.d();
    }

    public final void b() {
        this.delegate.e();
    }

    @d5.d
    /* renamed from: c, reason: from getter */
    public final okhttp3.internal.connection.h getDelegate() {
        return this.delegate;
    }

    public final int d() {
        return this.delegate.f();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(int i5, long j5, @d5.d TimeUnit timeUnit) {
        this(new okhttp3.internal.connection.h(okhttp3.internal.concurrent.d.f30815h, i5, j5, timeUnit));
        kotlin.jvm.internal.l0.p(timeUnit, ProtectedSandApp.s("昧"));
    }

    public k() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
