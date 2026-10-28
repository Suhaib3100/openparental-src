package retrofit2;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: Invocation.java */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final Method f33014a;

    /* renamed from: b, reason: collision with root package name */
    private final List<?> f33015b;

    k(Method method, List<?> list) {
        this.f33014a = method;
        this.f33015b = Collections.unmodifiableList(list);
    }

    public static k c(Method method, List<?> list) {
        Objects.requireNonNull(method, ProtectedSandApp.s("楁"));
        Objects.requireNonNull(list, ProtectedSandApp.s("楂"));
        return new k(method, new ArrayList(list));
    }

    public List<?> a() {
        return this.f33015b;
    }

    public Method b() {
        return this.f33014a;
    }

    public String toString() {
        return String.format(ProtectedSandApp.s("楃"), this.f33014a.getDeclaringClass().getName(), this.f33014a.getName(), this.f33015b);
    }
}
