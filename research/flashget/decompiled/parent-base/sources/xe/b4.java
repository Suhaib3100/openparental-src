package xe;

import java.lang.Throwable;

/* compiled from: FailableToIntFunction.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface b4<T, E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final b4 f92974a = new a4();

    static <T, E extends Throwable> b4<T, E> a() {
        return f92974a;
    }

    private static /* synthetic */ int b(Object obj) throws Throwable {
        return 0;
    }

    static /* synthetic */ int d(Object obj) {
        return 0;
    }

    int c(T t4) throws Throwable;
}
