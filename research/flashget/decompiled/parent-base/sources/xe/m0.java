package xe;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: FailableConsumer.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface m0<T, E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f93028a = new k0();

    static <T, E extends Throwable> m0<T, E> a() {
        return f93028a;
    }

    private static /* synthetic */ void b(Object obj) throws Throwable {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void d(m0 m0Var, Object obj) throws Throwable {
        accept(obj);
        m0Var.accept(obj);
    }

    static /* synthetic */ void e(Object obj) {
    }

    void accept(T t4) throws Throwable;

    default m0<T, E> f(final m0<? super T, E> m0Var) {
        Objects.requireNonNull(m0Var);
        return new m0() { // from class: xe.l0
            @Override // xe.m0
            public final void accept(Object obj) {
                m0.this.d(m0Var, obj);
            }
        };
    }
}
