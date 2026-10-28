package xe;

import java.lang.Throwable;

/* compiled from: FailableDoubleFunction.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface s0<R, E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final s0 f93058a = new r0();

    static <R, E extends Throwable> s0<R, E> a() {
        return f93058a;
    }

    private static /* synthetic */ Object b(double d5) throws Throwable {
        return null;
    }

    static /* synthetic */ Object d(double d5) {
        return null;
    }

    R c(double d5) throws Throwable;
}
