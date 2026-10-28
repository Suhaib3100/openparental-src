package xe;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: FailableBiPredicate.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface h0<T, U, E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f93003a = new f0();

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f93004b = new g0();

    static <T, U, E extends Throwable> h0<T, U, E> a() {
        return f93004b;
    }

    private static /* synthetic */ boolean b(Object obj, Object obj2) throws Throwable {
        return false;
    }

    static <T, U, E extends Throwable> h0<T, U, E> c() {
        return f93003a;
    }

    static /* synthetic */ boolean d(Object obj, Object obj2) {
        return false;
    }

    static /* synthetic */ boolean e(Object obj, Object obj2) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean i(h0 h0Var, Object obj, Object obj2) throws Throwable {
        return test(obj, obj2) || h0Var.test(obj, obj2);
    }

    private static /* synthetic */ boolean j(Object obj, Object obj2) throws Throwable {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean l(h0 h0Var, Object obj, Object obj2) throws Throwable {
        return test(obj, obj2) && h0Var.test(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean n(Object obj, Object obj2) throws Throwable {
        return !test(obj, obj2);
    }

    default h0<T, U, E> g(final h0<? super T, ? super U, E> h0Var) {
        Objects.requireNonNull(h0Var);
        return new h0() { // from class: xe.e0
            @Override // xe.h0
            public final boolean test(Object obj, Object obj2) {
                boolean i4;
                i4 = h0.this.i(h0Var, obj, obj2);
                return i4;
            }
        };
    }

    default h0<T, U, E> h(final h0<? super T, ? super U, E> h0Var) {
        Objects.requireNonNull(h0Var);
        return new h0() { // from class: xe.d0
            @Override // xe.h0
            public final boolean test(Object obj, Object obj2) {
                boolean l4;
                l4 = h0.this.l(h0Var, obj, obj2);
                return l4;
            }
        };
    }

    default h0<T, U, E> negate() {
        return new h0() { // from class: xe.c0
            @Override // xe.h0
            public final boolean test(Object obj, Object obj2) {
                boolean n4;
                n4 = h0.this.n(obj, obj2);
                return n4;
            }
        };
    }

    boolean test(T t4, U u4) throws Throwable;
}
