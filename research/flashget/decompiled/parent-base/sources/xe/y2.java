package xe;

import java.lang.Throwable;

/* compiled from: FailableLongToDoubleFunction.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface y2<E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final y2 f93087a = new x2();

    static <E extends Throwable> y2<E> a() {
        return f93087a;
    }

    double c(long j4) throws Throwable;
}
