package xe;

import java.lang.Throwable;

/* compiled from: FailableToIntBiFunction.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface z3<T, U, E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final z3 f93090a = new y3();

    static <T, U, E extends Throwable> z3<T, U, E> a() {
        return f93090a;
    }

    private static /* synthetic */ int b(Object obj, Object obj2) throws Throwable {
        return 0;
    }

    static /* synthetic */ int d(Object obj, Object obj2) {
        return 0;
    }

    int c(T t4, U u4) throws Throwable;
}
