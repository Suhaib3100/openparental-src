package xe;

import java.lang.Throwable;

/* compiled from: FailableToLongFunction.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface f4<T, E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final f4 f92994a = new e4();

    static <T, E extends Throwable> f4<T, E> a() {
        return f92994a;
    }

    private static /* synthetic */ long b(Object obj) throws Throwable {
        return 0L;
    }

    static /* synthetic */ long c(Object obj) {
        return 0L;
    }

    long applyAsLong(T t4) throws Throwable;
}
