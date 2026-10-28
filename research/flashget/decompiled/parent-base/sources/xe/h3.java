package xe;

import java.lang.Throwable;

/* compiled from: FailableObjDoubleConsumer.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface h3<T, E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final h3 f93009a = new g3();

    static <T, E extends Throwable> h3<T, E> a() {
        return f93009a;
    }

    private static /* synthetic */ void c(Object obj, double d5) throws Throwable {
    }

    static /* synthetic */ void d(Object obj, double d5) {
    }

    void b(T t4, double d5) throws Throwable;
}
