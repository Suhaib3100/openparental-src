package xe;

import java.lang.Throwable;

/* compiled from: FailableIntToLongFunction.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface e2<E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final e2 f92989a = new d2();

    static <E extends Throwable> e2<E> a() {
        return f92989a;
    }

    private static /* synthetic */ long b(int i4) throws Throwable {
        return 0L;
    }

    static /* synthetic */ long d(int i4) {
        return 0L;
    }

    long c(int i4) throws Throwable;
}
