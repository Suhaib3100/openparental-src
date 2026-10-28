package xe;

import java.lang.Throwable;

/* compiled from: FailableToDoubleBiFunction.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface v3<T, U, E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final v3 f93077a = new u3();

    static <T, U, E extends Throwable> v3<T, U, E> a() {
        return f93077a;
    }

    double d(T t4, U u4) throws Throwable;
}
