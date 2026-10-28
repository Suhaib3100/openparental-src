package okhttp3.internal.connection;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okhttp3.i0;

/* compiled from: RouteDatabase.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/connection/i;", "", "Lokhttp3/i0;", "failedRoute", "Lkotlin/m2;", "b", "route", "a", "", "c", "", "Ljava/util/Set;", "failedRoutes", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<i0> failedRoutes = new LinkedHashSet();

    public final synchronized void a(@d5.d i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("払"));
        this.failedRoutes.remove(i0Var);
    }

    public final synchronized void b(@d5.d i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("扖"));
        this.failedRoutes.add(i0Var);
    }

    public final synchronized boolean c(@d5.d i0 route) {
        l0.p(route, ProtectedSandApp.s("扗"));
        return this.failedRoutes.contains(route);
    }
}
