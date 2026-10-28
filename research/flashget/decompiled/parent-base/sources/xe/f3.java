package xe;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: FailableLongUnaryOperator.java */
/* loaded from: classes6.dex */
public interface f3<E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final f3 f92993a = new d3();

    static <E extends Throwable> f3<E> a() {
        return f92993a;
    }

    private static /* synthetic */ long b(long j4) throws Throwable {
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default long e(f3 f3Var, long j4) throws Throwable {
        return c(f3Var.c(j4));
    }

    private static /* synthetic */ long h(long j4) throws Throwable {
        return j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default long i(f3 f3Var, long j4) throws Throwable {
        return f3Var.c(c(j4));
    }

    static <E extends Throwable> f3<E> identity() {
        return new b3();
    }

    static /* synthetic */ long k(long j4) {
        return 0L;
    }

    static /* synthetic */ long l(long j4) {
        return j4;
    }

    long c(long j4) throws Throwable;

    default f3<E> d(final f3<E> f3Var) {
        Objects.requireNonNull(f3Var);
        return new f3() { // from class: xe.c3
            @Override // xe.f3
            public final long c(long j4) {
                long i4;
                i4 = f3.this.i(f3Var, j4);
                return i4;
            }
        };
    }

    default f3<E> j(final f3<E> f3Var) {
        Objects.requireNonNull(f3Var);
        return new f3() { // from class: xe.e3
            @Override // xe.f3
            public final long c(long j4) {
                long e4;
                e4 = f3.this.e(f3Var, j4);
                return e4;
            }
        };
    }
}
