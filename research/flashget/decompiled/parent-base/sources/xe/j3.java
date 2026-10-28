package xe;

import java.lang.Throwable;

/* compiled from: FailableObjIntConsumer.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface j3<T, E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final j3 f93016a = new i3();

    static <T, E extends Throwable> j3<T, E> a() {
        return f93016a;
    }

    static /* synthetic */ void c(Object obj, int i4) {
    }

    private static /* synthetic */ void d(Object obj, int i4) throws Throwable {
    }

    void b(T t4, int i4) throws Throwable;
}
