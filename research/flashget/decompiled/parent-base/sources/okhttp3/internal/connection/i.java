package okhttp3.internal.connection;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okhttp3.h0;

/* compiled from: RouteDatabase.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/connection/i;", "", "<init>", "()V", "Lokhttp3/h0;", "failedRoute", "Lkotlin/k2;", "b", "(Lokhttp3/h0;)V", "route", "a", "", "c", "(Lokhttp3/h0;)Z", "", "Ljava/util/Set;", "failedRoutes", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<h0> failedRoutes = new LinkedHashSet();

    public final synchronized void a(@l h0 route) {
        l0.p(route, ProtectedSandApp.s("ꄯ\u0001"));
        this.failedRoutes.remove(route);
    }

    public final synchronized void b(@l h0 failedRoute) {
        l0.p(failedRoute, ProtectedSandApp.s("ꄰ\u0001"));
        this.failedRoutes.add(failedRoute);
    }

    public final synchronized boolean c(@l h0 route) {
        l0.p(route, ProtectedSandApp.s("ꄯ\u0001"));
        return this.failedRoutes.contains(route);
    }
}
