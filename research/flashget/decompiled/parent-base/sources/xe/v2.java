package xe;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: FailableLongPredicate.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface v2<E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final v2 f93075a = new t2();

    /* renamed from: b, reason: collision with root package name */
    public static final v2 f93076b = new u2();

    static <E extends Throwable> v2<E> a() {
        return f93076b;
    }

    private static /* synthetic */ boolean b(long j4) throws Throwable {
        return false;
    }

    static <E extends Throwable> v2<E> c() {
        return f93075a;
    }

    private static /* synthetic */ boolean e(long j4) throws Throwable {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean f(v2 v2Var, long j4) throws Throwable {
        return d(j4) || v2Var.d(j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean g(v2 v2Var, long j4) throws Throwable {
        return d(j4) && v2Var.d(j4);
    }

    static /* synthetic */ boolean j(long j4) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean l(long j4) throws Throwable {
        return !d(j4);
    }

    static /* synthetic */ boolean n(long j4) {
        return true;
    }

    boolean d(long j4) throws Throwable;

    default v2<E> h(final v2<E> v2Var) {
        Objects.requireNonNull(v2Var);
        return new v2() { // from class: xe.s2
            @Override // xe.v2
            public final boolean d(long j4) {
                boolean f4;
                f4 = v2.this.f(v2Var, j4);
                return f4;
            }
        };
    }

    default v2<E> negate() {
        return new v2() { // from class: xe.r2
            @Override // xe.v2
            public final boolean d(long j4) {
                boolean l4;
                l4 = v2.this.l(j4);
                return l4;
            }
        };
    }

    default v2<E> o(final v2<E> v2Var) {
        Objects.requireNonNull(v2Var);
        return new v2() { // from class: xe.q2
            @Override // xe.v2
            public final boolean d(long j4) {
                boolean g4;
                g4 = v2.this.g(v2Var, j4);
                return g4;
            }
        };
    }
}
