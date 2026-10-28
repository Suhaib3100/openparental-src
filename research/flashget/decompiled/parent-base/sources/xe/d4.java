package xe;

import java.lang.Throwable;

/* compiled from: FailableToLongBiFunction.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface d4<T, U, E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final d4 f92986a = new c4();

    static <T, U, E extends Throwable> d4<T, U, E> a() {
        return f92986a;
    }

    private static /* synthetic */ long b(Object obj, Object obj2) throws Throwable {
        return 0L;
    }

    static /* synthetic */ long d(Object obj, Object obj2) {
        return 0L;
    }

    long c(T t4, U u4) throws Throwable;
}
