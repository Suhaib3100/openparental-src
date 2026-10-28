package xe;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: FailableFunction.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface n1<T, R, E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final n1 f93034a = new k1();

    static <T, R, E extends Throwable> n1<T, R, E> a() {
        return f93034a;
    }

    private static /* synthetic */ Object b(Object obj) throws Throwable {
        return null;
    }

    private static /* synthetic */ Object d(Object obj) throws Throwable {
        return obj;
    }

    static /* synthetic */ Object f(Object obj) {
        return null;
    }

    static /* synthetic */ Object i(Object obj) {
        return obj;
    }

    static <T, E extends Throwable> n1<T, T, E> identity() {
        return new m1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object j(n1 n1Var, Object obj) throws Throwable {
        return apply(n1Var.apply(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object k(n1 n1Var, Object obj) throws Throwable {
        return n1Var.apply(apply(obj));
    }

    R apply(T t4) throws Throwable;

    default <V> n1<T, V, E> c(final n1<? super R, ? extends V, E> n1Var) {
        Objects.requireNonNull(n1Var);
        return new n1() { // from class: xe.l1
            @Override // xe.n1
            public final Object apply(Object obj) {
                Object k4;
                k4 = n1.this.k(n1Var, obj);
                return k4;
            }
        };
    }

    default <V> n1<V, R, E> h(final n1<? super V, ? extends T, E> n1Var) {
        Objects.requireNonNull(n1Var);
        return new n1() { // from class: xe.j1
            @Override // xe.n1
            public final Object apply(Object obj) {
                Object j4;
                j4 = n1.this.j(n1Var, obj);
                return j4;
            }
        };
    }
}
