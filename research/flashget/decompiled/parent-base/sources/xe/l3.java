package xe;

import java.lang.Throwable;

/* compiled from: FailableObjLongConsumer.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface l3<T, E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final l3 f93026a = new k3();

    static <T, E extends Throwable> l3<T, E> a() {
        return f93026a;
    }

    static /* synthetic */ void c(Object obj, long j4) {
    }

    private static /* synthetic */ void d(Object obj, long j4) throws Throwable {
    }

    void b(T t4, long j4) throws Throwable;
}
