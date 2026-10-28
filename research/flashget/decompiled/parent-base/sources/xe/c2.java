package xe;

import java.lang.Throwable;

/* compiled from: FailableIntToDoubleFunction.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface c2<E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final c2 f92978a = new b2();

    static <E extends Throwable> c2<E> a() {
        return f92978a;
    }

    double c(int i4) throws Throwable;
}
