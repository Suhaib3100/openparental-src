package android.content.preferences.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: Protobuf.java */
/* loaded from: classes.dex */
final class c3 {

    /* renamed from: c, reason: collision with root package name */
    private static final c3 f7203c = new c3();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, j3<?>> f7205b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final k3 f7204a = new z1();

    private c3() {
    }

    public static c3 a() {
        return f7203c;
    }

    int b() {
        int i5 = 0;
        for (j3<?> j3Var : this.f7205b.values()) {
            if (j3Var instanceof k2) {
                i5 += ((k2) j3Var).x();
            }
        }
        return i5;
    }

    public <T> boolean c(T t5) {
        return j(t5).d(t5);
    }

    public <T> void d(T t5) {
        j(t5).c(t5);
    }

    public <T> void e(T t5, h3 h3Var) throws IOException {
        f(t5, h3Var, s0.d());
    }

    public <T> void f(T t5, h3 h3Var, s0 s0Var) throws IOException {
        j(t5).b(t5, h3Var, s0Var);
    }

    public j3<?> g(Class<?> cls, j3<?> j3Var) {
        o1.e(cls, "messageType");
        o1.e(j3Var, "schema");
        return this.f7205b.putIfAbsent(cls, j3Var);
    }

    public j3<?> h(Class<?> cls, j3<?> j3Var) {
        o1.e(cls, "messageType");
        o1.e(j3Var, "schema");
        return this.f7205b.put(cls, j3Var);
    }

    public <T> j3<T> i(Class<T> cls) {
        o1.e(cls, "messageType");
        j3<T> j3Var = (j3) this.f7205b.get(cls);
        if (j3Var != null) {
            return j3Var;
        }
        j3<T> a6 = this.f7204a.a(cls);
        j3<T> j3Var2 = (j3<T>) g(cls, a6);
        return j3Var2 != null ? j3Var2 : a6;
    }

    public <T> j3<T> j(T t5) {
        return i(t5.getClass());
    }

    public <T> void k(T t5, s4 s4Var) throws IOException {
        j(t5).e(t5, s4Var);
    }
}
