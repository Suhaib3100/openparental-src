package xe;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: FailableIntConsumer.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface r1<E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final r1 f93052a = new q1();

    static <E extends Throwable> r1<E> a() {
        return f93052a;
    }

    private static /* synthetic */ void b(int i4) throws Throwable {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void d(r1 r1Var, int i4) throws Throwable {
        f(i4);
        r1Var.f(i4);
    }

    static /* synthetic */ void g(int i4) {
    }

    default r1<E> e(final r1<E> r1Var) {
        Objects.requireNonNull(r1Var);
        return new r1() { // from class: xe.p1
            @Override // xe.r1
            public final void f(int i4) {
                r1.this.d(r1Var, i4);
            }
        };
    }

    void f(int i4) throws Throwable;
}
