package xe;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: FailablePredicate.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface r3<T, E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final r3 f93054a = new o3();

    /* renamed from: b, reason: collision with root package name */
    public static final r3 f93055b = new p3();

    static <T, E extends Throwable> r3<T, E> a() {
        return f93055b;
    }

    private static /* synthetic */ boolean b(Object obj) throws Throwable {
        return false;
    }

    static <T, E extends Throwable> r3<T, E> c() {
        return f93054a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean d(r3 r3Var, Object obj) throws Throwable {
        return test(obj) || r3Var.test(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean e(Object obj) throws Throwable {
        return !test(obj);
    }

    static /* synthetic */ boolean f(Object obj) {
        return true;
    }

    private static /* synthetic */ boolean g(Object obj) throws Throwable {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean i(r3 r3Var, Object obj) throws Throwable {
        return test(obj) && r3Var.test(obj);
    }

    static /* synthetic */ boolean m(Object obj) {
        return false;
    }

    default r3<T, E> l(final r3<? super T, E> r3Var) {
        Objects.requireNonNull(r3Var);
        return new r3() { // from class: xe.m3
            @Override // xe.r3
            public final boolean test(Object obj) {
                boolean d5;
                d5 = r3.this.d(r3Var, obj);
                return d5;
            }
        };
    }

    default r3<T, E> n(final r3<? super T, E> r3Var) {
        Objects.requireNonNull(r3Var);
        return new r3() { // from class: xe.n3
            @Override // xe.r3
            public final boolean test(Object obj) {
                boolean i4;
                i4 = r3.this.i(r3Var, obj);
                return i4;
            }
        };
    }

    default r3<T, E> negate() {
        return new r3() { // from class: xe.q3
            @Override // xe.r3
            public final boolean test(Object obj) {
                boolean e4;
                e4 = r3.this.e(obj);
                return e4;
            }
        };
    }

    boolean test(T t4) throws Throwable;
}
