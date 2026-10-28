package xe;

import java.lang.Throwable;

/* compiled from: FailableLongToIntFunction.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface a3<E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final a3 f92969a = new z2();

    static <E extends Throwable> a3<E> a() {
        return f92969a;
    }

    private static /* synthetic */ int b(long j4) throws Throwable {
        return 0;
    }

    static /* synthetic */ int d(long j4) {
        return 0;
    }

    int c(long j4) throws Throwable;
}
