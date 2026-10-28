package xe;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.commons.lang3.stream.c;

/* compiled from: Failable.java */
/* loaded from: classes6.dex */
public class v {
    private v() {
    }

    public static <E extends Throwable> double A(final n0<E> n0Var, final double d5, final double d6) {
        return N(new z0() { // from class: xe.l
            @Override // xe.z0
            public final double a() {
                return n0.this.a(d5, d6);
            }
        });
    }

    public static <T, U> BiConsumer<T, U> B(final y<T, U, ?> yVar) {
        return new BiConsumer() { // from class: xe.o
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                v.t(y.this, obj, obj2);
            }
        };
    }

    public static <T, U, R> BiFunction<T, U, R> C(final b0<T, U, R, ?> b0Var) {
        return new BiFunction() { // from class: xe.h
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return v.y(b0.this, obj, obj2);
            }
        };
    }

    public static <T, U> BiPredicate<T, U> D(final h0<T, U, ?> h0Var) {
        return new BiPredicate() { // from class: xe.a
            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return v.n0(h0.this, obj, obj2);
            }
        };
    }

    public static <V> Callable<V> E(final j0<V, ?> j0Var) {
        return new Callable() { // from class: xe.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return v.K(j0.this);
            }
        };
    }

    public static <T> Consumer<T> F(m0<T, ?> m0Var) {
        return new r(m0Var);
    }

    public static <T, R> Function<T, R> G(n1<T, R, ?> n1Var) {
        return new n(n1Var);
    }

    public static <T> Predicate<T> H(r3<T, ?> r3Var) {
        return new q(r3Var);
    }

    public static Runnable I(final s3<?> s3Var) {
        return new Runnable() { // from class: xe.i
            @Override // java.lang.Runnable
            public final void run() {
                v.k0(s3.this);
            }
        };
    }

    public static <T> Supplier<T> J(final t3<T, ?> t3Var) {
        return new Supplier() { // from class: xe.f
            @Override // java.util.function.Supplier
            public final Object get() {
                return v.L(t3.this);
            }
        };
    }

    public static <V, E extends Throwable> V K(final j0<V, E> j0Var) {
        j0Var.getClass();
        return (V) L(new t3() { // from class: xe.m
            @Override // xe.t3
            public final Object get() {
                return j0.this.call();
            }
        });
    }

    public static <T, E extends Throwable> T L(t3<T, E> t3Var) {
        try {
            return t3Var.get();
        } catch (Throwable th) {
            throw j0(th);
        }
    }

    public static <E extends Throwable> boolean M(i0<E> i0Var) {
        try {
            return i0Var.getAsBoolean();
        } catch (Throwable th) {
            throw j0(th);
        }
    }

    public static <E extends Throwable> double N(z0<E> z0Var) {
        try {
            return z0Var.a();
        } catch (Throwable th) {
            throw j0(th);
        }
    }

    public static <E extends Throwable> int O(a2<E> a2Var) {
        try {
            return a2Var.a();
        } catch (Throwable th) {
            throw j0(th);
        }
    }

    public static <E extends Throwable> long P(w2<E> w2Var) {
        try {
            return w2Var.a();
        } catch (Throwable th) {
            throw j0(th);
        }
    }

    public static RuntimeException j0(Throwable th) {
        Objects.requireNonNull(th, "throwable");
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (th instanceof IOException) {
            throw new UncheckedIOException((IOException) th);
        }
        throw new UndeclaredThrowableException(th);
    }

    public static <E extends Throwable> void k0(s3<E> s3Var) {
        try {
            s3Var.run();
        } catch (Throwable th) {
            throw j0(th);
        }
    }

    public static <E> c.b<E> l0(Collection<E> collection) {
        return new c.b<>(collection.stream());
    }

    public static <T> c.b<T> m0(Stream<T> stream) {
        return new c.b<>(stream);
    }

    public static <T, U, E extends Throwable> boolean n0(final h0<T, U, E> h0Var, final T t4, final U u4) {
        return M(new i0() { // from class: xe.g
            @Override // xe.i0
            public final boolean getAsBoolean() {
                return h0.this.test(t4, u4);
            }
        });
    }

    public static <T, E extends Throwable> boolean o0(final r3<T, E> r3Var, final T t4) {
        return M(new i0() { // from class: xe.d
            @Override // xe.i0
            public final boolean getAsBoolean() {
                return r3.this.test(t4);
            }
        });
    }

    @SafeVarargs
    public static void p0(s3<? extends Throwable> s3Var, m0<Throwable, ? extends Throwable> m0Var, s3<? extends Throwable>... s3VarArr) {
        if (m0Var == null) {
            m0Var = new e();
        }
        if (s3VarArr != null) {
            for (s3<? extends Throwable> s3Var2 : s3VarArr) {
                Objects.requireNonNull(s3Var2, "runnable");
            }
        }
        try {
            s3Var.run();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        if (s3VarArr != null) {
            for (s3<? extends Throwable> s3Var3 : s3VarArr) {
                try {
                    s3Var3.run();
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
            }
        }
        if (th != null) {
            try {
                m0Var.accept(th);
            } catch (Throwable th3) {
                throw j0(th3);
            }
        }
    }

    @SafeVarargs
    public static void q0(s3<? extends Throwable> s3Var, s3<? extends Throwable>... s3VarArr) {
        p0(s3Var, null, s3VarArr);
    }

    public static <T, U, E extends Throwable> void t(final y<T, U, E> yVar, final T t4, final U u4) {
        k0(new s3() { // from class: xe.t
            @Override // xe.s3
            public final void run() {
                y.this.accept(t4, u4);
            }
        });
    }

    public static <T, E extends Throwable> void u(final m0<T, E> m0Var, final T t4) {
        k0(new s3() { // from class: xe.k
            @Override // xe.s3
            public final void run() {
                m0.this.accept(t4);
            }
        });
    }

    public static <E extends Throwable> void v(final q0<E> q0Var, final double d5) {
        k0(new s3() { // from class: xe.c
            @Override // xe.s3
            public final void run() {
                q0.this.c(d5);
            }
        });
    }

    public static <E extends Throwable> void w(final r1<E> r1Var, final int i4) {
        k0(new s3() { // from class: xe.p
            @Override // xe.s3
            public final void run() {
                r1.this.f(i4);
            }
        });
    }

    public static <E extends Throwable> void x(final n2<E> n2Var, final long j4) {
        k0(new s3() { // from class: xe.b
            @Override // xe.s3
            public final void run() {
                n2.this.h(j4);
            }
        });
    }

    public static <T, U, R, E extends Throwable> R y(final b0<T, U, R, E> b0Var, final T t4, final U u4) {
        return (R) L(new t3() { // from class: xe.u
            @Override // xe.t3
            public final Object get() {
                return b0.this.apply(t4, u4);
            }
        });
    }

    public static <T, R, E extends Throwable> R z(final n1<T, R, E> n1Var, final T t4) {
        return (R) L(new t3() { // from class: xe.s
            @Override // xe.t3
            public final Object get() {
                return n1.this.apply(t4);
            }
        });
    }
}
