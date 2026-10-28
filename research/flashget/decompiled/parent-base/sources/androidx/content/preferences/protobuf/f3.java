package androidx.content.preferences.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: Protobuf.java */
/* loaded from: classes3.dex */
final class f3 {

    /* renamed from: c, reason: collision with root package name */
    private static final f3 f28683c = new f3();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, m3<?>> f28685b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final n3 f28684a = new a2();

    private f3() {
    }

    public static f3 a() {
        return f28683c;
    }

    int b() {
        int i4 = 0;
        for (m3<?> m3Var : this.f28685b.values()) {
            if (m3Var instanceof n2) {
                i4 += ((n2) m3Var).x();
            }
        }
        return i4;
    }

    public <T> boolean c(T t4) {
        return j(t4).d(t4);
    }

    public <T> void d(T t4) {
        j(t4).c(t4);
    }

    public <T> void e(T t4, k3 k3Var) throws IOException {
        f(t4, k3Var, s0.d());
    }

    public <T> void f(T t4, k3 k3Var, s0 s0Var) throws IOException {
        j(t4).b(t4, k3Var, s0Var);
    }

    public m3<?> g(Class<?> cls, m3<?> m3Var) {
        p1.e(cls, "messageType");
        p1.e(m3Var, "schema");
        return this.f28685b.putIfAbsent(cls, m3Var);
    }

    public m3<?> h(Class<?> cls, m3<?> m3Var) {
        p1.e(cls, "messageType");
        p1.e(m3Var, "schema");
        return this.f28685b.put(cls, m3Var);
    }

    public <T> m3<T> i(Class<T> cls) {
        p1.e(cls, "messageType");
        m3<T> m3Var = (m3) this.f28685b.get(cls);
        if (m3Var != null) {
            return m3Var;
        }
        m3<T> a5 = this.f28684a.a(cls);
        m3<T> m3Var2 = (m3<T>) g(cls, a5);
        return m3Var2 != null ? m3Var2 : a5;
    }

    public <T> m3<T> j(T t4) {
        return i(t4.getClass());
    }

    public <T> void k(T t4, v4 v4Var) throws IOException {
        j(t4).h(t4, v4Var);
    }
}
