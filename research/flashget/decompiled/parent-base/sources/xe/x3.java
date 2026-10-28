package xe;

import java.lang.Throwable;

/* compiled from: FailableToDoubleFunction.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface x3<T, E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final x3 f93082a = new w3();

    static <T, E extends Throwable> x3<T, E> a() {
        return f93082a;
    }

    double c(T t4) throws Throwable;
}
