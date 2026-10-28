package xe;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: FailableDoubleUnaryOperator.java */
/* loaded from: classes6.dex */
public interface i1<E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final i1 f93011a = new f1();

    static <E extends Throwable> i1<E> a() {
        return f93011a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default double d(i1 i1Var, double d5) throws Throwable {
        return applyAsDouble(i1Var.applyAsDouble(d5));
    }

    static /* synthetic */ double h(double d5) {
        return d5;
    }

    private static /* synthetic */ double i(double d5) throws Throwable {
        return d5;
    }

    static <E extends Throwable> i1<E> identity() {
        return new e1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default double k(i1 i1Var, double d5) throws Throwable {
        return i1Var.applyAsDouble(applyAsDouble(d5));
    }

    double applyAsDouble(double d5) throws Throwable;

    default i1<E> g(final i1<E> i1Var) {
        Objects.requireNonNull(i1Var);
        return new i1() { // from class: xe.g1
            @Override // xe.i1
            public final double applyAsDouble(double d5) {
                double d6;
                d6 = i1.this.d(i1Var, d5);
                return d6;
            }
        };
    }

    default i1<E> j(final i1<E> i1Var) {
        Objects.requireNonNull(i1Var);
        return new i1() { // from class: xe.h1
            @Override // xe.i1
            public final double applyAsDouble(double d5) {
                double k4;
                k4 = i1.this.k(i1Var, d5);
                return k4;
            }
        };
    }
}
