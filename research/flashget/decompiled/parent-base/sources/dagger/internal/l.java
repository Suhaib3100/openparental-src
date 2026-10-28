package dagger.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: InstanceFactory.java */
/* loaded from: classes7.dex */
public final class l<T> implements h<T>, vc.e<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final l<Object> f73684b = new l<>(null);

    /* renamed from: a, reason: collision with root package name */
    private final T f73685a;

    private l(T t4) {
        this.f73685a = t4;
    }

    public static <T> h<T> a(T t4) {
        return new l(s.c(t4, ProtectedSandApp.s("彳\u0001")));
    }

    public static <T> h<T> b(T t4) {
        return t4 == null ? f73684b : new l(t4);
    }

    private static <T> l<T> c() {
        return (l<T>) f73684b;
    }

    @Override // cd.c
    public T get() {
        return this.f73685a;
    }
}
