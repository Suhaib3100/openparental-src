package xe;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: FailableBiFunction.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface b0<T, U, R, E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f92972a = new z();

    static <T, U, R, E extends Throwable> b0<T, U, R, E> a() {
        return f92972a;
    }

    private static /* synthetic */ Object b(Object obj, Object obj2) throws Throwable {
        return null;
    }

    static /* synthetic */ Object d(Object obj, Object obj2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object e(n1 n1Var, Object obj, Object obj2) throws Throwable {
        return n1Var.apply(apply(obj, obj2));
    }

    R apply(T t4, U u4) throws Throwable;

    default <V> b0<T, U, V, E> c(final n1<? super R, ? extends V, E> n1Var) {
        Objects.requireNonNull(n1Var);
        return new b0() { // from class: xe.a0
            @Override // xe.b0
            public final Object apply(Object obj, Object obj2) {
                Object e4;
                e4 = b0.this.e(n1Var, obj, obj2);
                return e4;
            }
        };
    }
}
