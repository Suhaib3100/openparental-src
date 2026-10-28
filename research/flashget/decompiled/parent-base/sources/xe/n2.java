package xe;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: FailableLongConsumer.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface n2<E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final n2 f93035a = new l2();

    static <E extends Throwable> n2<E> a() {
        return f93035a;
    }

    private static /* synthetic */ void b(long j4) throws Throwable {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void c(n2 n2Var, long j4) throws Throwable {
        h(j4);
        n2Var.h(j4);
    }

    static /* synthetic */ void f(long j4) {
    }

    default n2<E> e(final n2<E> n2Var) {
        Objects.requireNonNull(n2Var);
        return new n2() { // from class: xe.m2
            @Override // xe.n2
            public final void h(long j4) {
                n2.this.c(n2Var, j4);
            }
        };
    }

    void h(long j4) throws Throwable;
}
