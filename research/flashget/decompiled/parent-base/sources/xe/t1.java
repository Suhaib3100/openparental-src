package xe;

import java.lang.Throwable;

/* compiled from: FailableIntFunction.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface t1<R, E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final t1 f93066a = new s1();

    static <R, E extends Throwable> t1<R, E> a() {
        return f93066a;
    }

    private static /* synthetic */ Object b(int i4) throws Throwable {
        return null;
    }

    static /* synthetic */ Object d(int i4) {
        return null;
    }

    R c(int i4) throws Throwable;
}
