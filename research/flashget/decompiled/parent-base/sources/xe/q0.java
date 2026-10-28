package xe;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: FailableDoubleConsumer.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface q0<E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final q0 f93047a = new o0();

    static <E extends Throwable> q0<E> a() {
        return f93047a;
    }

    private static /* synthetic */ void b(double d5) throws Throwable {
    }

    static /* synthetic */ void d(double d5) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void f(q0 q0Var, double d5) throws Throwable {
        c(d5);
        q0Var.c(d5);
    }

    void c(double d5) throws Throwable;

    default q0<E> e(final q0<E> q0Var) {
        Objects.requireNonNull(q0Var);
        return new q0() { // from class: xe.p0
            @Override // xe.q0
            public final void c(double d5) {
                q0.this.f(q0Var, d5);
            }
        };
    }
}
