package okhttp3.internal.http;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: HttpMethod.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lokhttp3/internal/http/f;", "", "<init>", "()V", "", "method", "", "e", "(Ljava/lang/String;)Z", "b", "a", "d", "c", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f84481a = new f();

    private f() {
    }

    @n
    public static final boolean b(@l String method) {
        l0.p(method, ProtectedSandApp.s("A"));
        return (l0.g(method, ProtectedSandApp.s("B")) || l0.g(method, ProtectedSandApp.s("C"))) ? false : true;
    }

    @n
    public static final boolean e(@l String method) {
        l0.p(method, ProtectedSandApp.s("A"));
        return l0.g(method, ProtectedSandApp.s("D")) || l0.g(method, ProtectedSandApp.s("E")) || l0.g(method, ProtectedSandApp.s("F")) || l0.g(method, ProtectedSandApp.s("G")) || l0.g(method, ProtectedSandApp.s("H"));
    }

    public final boolean a(@l String method) {
        l0.p(method, ProtectedSandApp.s("A"));
        return l0.g(method, ProtectedSandApp.s("D")) || l0.g(method, ProtectedSandApp.s("F")) || l0.g(method, ProtectedSandApp.s("E")) || l0.g(method, ProtectedSandApp.s("I")) || l0.g(method, ProtectedSandApp.s("J"));
    }

    public final boolean c(@l String method) {
        l0.p(method, ProtectedSandApp.s("A"));
        return !l0.g(method, ProtectedSandApp.s("K"));
    }

    public final boolean d(@l String method) {
        l0.p(method, ProtectedSandApp.s("A"));
        return l0.g(method, ProtectedSandApp.s("K"));
    }
}
