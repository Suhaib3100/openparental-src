package xe;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: FailableIntUnaryOperator.java */
/* loaded from: classes6.dex */
public interface j2<E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final j2 f93015a = new f2();

    static <E extends Throwable> j2<E> a() {
        return f93015a;
    }

    private static /* synthetic */ int b(int i4) throws Throwable {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default int e(j2 j2Var, int i4) throws Throwable {
        return c(j2Var.c(i4));
    }

    private static /* synthetic */ int f(int i4) throws Throwable {
        return i4;
    }

    static /* synthetic */ int h(int i4) {
        return i4;
    }

    static /* synthetic */ int i(int i4) {
        return 0;
    }

    static <E extends Throwable> j2<E> identity() {
        return new i2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default int l(j2 j2Var, int i4) throws Throwable {
        return j2Var.c(c(i4));
    }

    int c(int i4) throws Throwable;

    default j2<E> j(final j2<E> j2Var) {
        Objects.requireNonNull(j2Var);
        return new j2() { // from class: xe.h2
            @Override // xe.j2
            public final int c(int i4) {
                int l4;
                l4 = j2.this.l(j2Var, i4);
                return l4;
            }
        };
    }

    default j2<E> k(final j2<E> j2Var) {
        Objects.requireNonNull(j2Var);
        return new j2() { // from class: xe.g2
            @Override // xe.j2
            public final int c(int i4) {
                int e4;
                e4 = j2.this.e(j2Var, i4);
                return e4;
            }
        };
    }
}
