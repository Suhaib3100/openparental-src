package xe;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: FailableDoublePredicate.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface y0<E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final y0 f93084a = new w0();

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f93085b = new x0();

    static <E extends Throwable> y0<E> a() {
        return f93085b;
    }

    private static /* synthetic */ boolean b(double d5) throws Throwable {
        return false;
    }

    static <E extends Throwable> y0<E> c() {
        return f93084a;
    }

    private static /* synthetic */ boolean e(double d5) throws Throwable {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean h(y0 y0Var, double d5) throws Throwable {
        return d(d5) && y0Var.d(d5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean i(y0 y0Var, double d5) throws Throwable {
        return d(d5) || y0Var.d(d5);
    }

    static /* synthetic */ boolean j(double d5) {
        return true;
    }

    static /* synthetic */ boolean k(double d5) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean o(double d5) throws Throwable {
        return !d(d5);
    }

    boolean d(double d5) throws Throwable;

    default y0<E> f(final y0<E> y0Var) {
        Objects.requireNonNull(y0Var);
        return new y0() { // from class: xe.t0
            @Override // xe.y0
            public final boolean d(double d5) {
                boolean i4;
                i4 = y0.this.i(y0Var, d5);
                return i4;
            }
        };
    }

    default y0<E> n(final y0<E> y0Var) {
        Objects.requireNonNull(y0Var);
        return new y0() { // from class: xe.u0
            @Override // xe.y0
            public final boolean d(double d5) {
                boolean h4;
                h4 = y0.this.h(y0Var, d5);
                return h4;
            }
        };
    }

    default y0<E> negate() {
        return new y0() { // from class: xe.v0
            @Override // xe.y0
            public final boolean d(double d5) {
                boolean o4;
                o4 = y0.this.o(d5);
                return o4;
            }
        };
    }
}
