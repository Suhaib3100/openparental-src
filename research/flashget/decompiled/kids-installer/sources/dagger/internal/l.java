package dagger.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: InstanceFactory.java */
/* loaded from: classes6.dex */
public final class l<T> implements h<T>, d3.e<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final l<Object> f22370b = new l<>(null);

    /* renamed from: a, reason: collision with root package name */
    private final T f22371a;

    private l(T t5) {
        this.f22371a = t5;
    }

    public static <T> h<T> a(T t5) {
        return new l(s.c(t5, ProtectedSandApp.s("殁")));
    }

    public static <T> h<T> b(T t5) {
        return t5 == null ? f22370b : new l(t5);
    }

    private static <T> l<T> c() {
        return (l<T>) f22370b;
    }

    @Override // h3.c
    public T get() {
        return this.f22371a;
    }
}
