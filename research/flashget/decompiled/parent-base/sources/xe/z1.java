package xe;

import java.lang.Throwable;
import java.util.Objects;

/* compiled from: FailableIntPredicate.java */
@FunctionalInterface
/* loaded from: classes6.dex */
public interface z1<E extends Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public static final z1 f93088a = new v1();

    /* renamed from: b, reason: collision with root package name */
    public static final z1 f93089b = new w1();

    static <E extends Throwable> z1<E> a() {
        return f93089b;
    }

    private static /* synthetic */ boolean b(int i4) throws Throwable {
        return false;
    }

    static <E extends Throwable> z1<E> c() {
        return f93088a;
    }

    private static /* synthetic */ boolean e(int i4) throws Throwable {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean f(z1 z1Var, int i4) throws Throwable {
        return test(i4) && z1Var.test(i4);
    }

    static /* synthetic */ boolean h(int i4) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean k(int i4) throws Throwable {
        return !test(i4);
    }

    static /* synthetic */ boolean m(int i4) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean n(z1 z1Var, int i4) throws Throwable {
        return test(i4) || z1Var.test(i4);
    }

    default z1<E> d(final z1<E> z1Var) {
        Objects.requireNonNull(z1Var);
        return new z1() { // from class: xe.x1
            @Override // xe.z1
            public final boolean test(int i4) {
                boolean n4;
                n4 = z1.this.n(z1Var, i4);
                return n4;
            }
        };
    }

    default z1<E> l(final z1<E> z1Var) {
        Objects.requireNonNull(z1Var);
        return new z1() { // from class: xe.u1
            @Override // xe.z1
            public final boolean test(int i4) {
                boolean f4;
                f4 = z1.this.f(z1Var, i4);
                return f4;
            }
        };
    }

    default z1<E> negate() {
        return new z1() { // from class: xe.y1
            @Override // xe.z1
            public final boolean test(int i4) {
                boolean k4;
                k4 = z1.this.k(i4);
                return k4;
            }
        };
    }

    boolean test(int i4) throws Throwable;
}
