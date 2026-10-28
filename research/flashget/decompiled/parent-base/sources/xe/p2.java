package xe;

import java.lang.Throwable;

/* compiled from: FailableLongFunction.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface p2<R, E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final p2 f93045a = new o2();

    static <R, E extends Throwable> p2<R, E> a() {
        return f93045a;
    }

    private static /* synthetic */ Object b(long j4) throws Throwable {
        return null;
    }

    static /* synthetic */ Object d(long j4) {
        return null;
    }

    R c(long j4) throws Throwable;
}
