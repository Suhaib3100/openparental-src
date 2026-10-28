package xe;

import java.lang.Throwable;

/* compiled from: FailableDoubleToIntFunction.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface b1<E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final b1 f92973a = new a1();

    static <E extends Throwable> b1<E> a() {
        return f92973a;
    }

    private static /* synthetic */ int b(double d5) throws Throwable {
        return 0;
    }

    static /* synthetic */ int d(double d5) {
        return 0;
    }

    int c(double d5) throws Throwable;
}
