package retrofit2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: Invocation.java */
/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final Method f89930a;

    /* renamed from: b, reason: collision with root package name */
    private final List<?> f89931b;

    k(Method method, List<?> list) {
        this.f89930a = method;
        this.f89931b = Collections.unmodifiableList(list);
    }

    public static k c(Method method, List<?> list) {
        Objects.requireNonNull(method, ProtectedSandApp.s("ꗄ\u0001"));
        Objects.requireNonNull(list, ProtectedSandApp.s("ꗅ\u0001"));
        return new k(method, new ArrayList(list));
    }

    public List<?> a() {
        return this.f89931b;
    }

    public Method b() {
        return this.f89930a;
    }

    public String toString() {
        return String.format(ProtectedSandApp.s("ꗆ\u0001"), this.f89930a.getDeclaringClass().getName(), this.f89930a.getName(), this.f89931b);
    }
}
