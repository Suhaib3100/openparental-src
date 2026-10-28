package org.apache.commons.lang3;

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
import org.apache.commons.lang3.m0;
import org.apache.commons.lang3.z0;

/* compiled from: Functions.java */
@Deprecated
/* loaded from: classes6.dex */
public class m0 {

    /* compiled from: Functions.java */
    @FunctionalInterface
    @Deprecated
    public interface a<O1, O2, T extends Throwable> {
        void accept(O1 o12, O2 o22) throws Throwable;
    }

    /* compiled from: Functions.java */
    @FunctionalInterface
    @Deprecated
    public interface b<O1, O2, R, T extends Throwable> {
        R apply(O1 o12, O2 o22) throws Throwable;
    }

    /* compiled from: Functions.java */
    @FunctionalInterface
    @Deprecated
    public interface c<O1, O2, T extends Throwable> {
        boolean test(O1 o12, O2 o22) throws Throwable;
    }

    /* compiled from: Functions.java */
    @FunctionalInterface
    @Deprecated
    public interface d<R, T extends Throwable> {
        R call() throws Throwable;
    }

    /* compiled from: Functions.java */
    @FunctionalInterface
    @Deprecated
    public interface e<O, T extends Throwable> {
        void accept(O o4) throws Throwable;
    }

    /* compiled from: Functions.java */
    @FunctionalInterface
    @Deprecated
    public interface f<I, R, T extends Throwable> {
        R apply(I i4) throws Throwable;
    }

    /* compiled from: Functions.java */
    @FunctionalInterface
    @Deprecated
    public interface g<I, T extends Throwable> {
        boolean test(I i4) throws Throwable;
    }

    /* compiled from: Functions.java */
    @FunctionalInterface
    @Deprecated
    public interface h<T extends Throwable> {
        void run() throws Throwable;
    }

    /* compiled from: Functions.java */
    @FunctionalInterface
    @Deprecated
    public interface i<R, T extends Throwable> {
        R get() throws Throwable;
    }

    public static Runnable A(final h<?> hVar) {
        return new Runnable() { // from class: org.apache.commons.lang3.h0
            @Override // java.lang.Runnable
            public final void run() {
                m0.V(m0.h.this);
            }
        };
    }

    public static <O> Supplier<O> B(final i<O, ?> iVar) {
        return new Supplier() { // from class: org.apache.commons.lang3.f0
            @Override // java.util.function.Supplier
            public final Object get() {
                return m0.D(m0.i.this);
            }
        };
    }

    public static <O, T extends Throwable> O C(final d<O, T> dVar) {
        dVar.getClass();
        return (O) D(new i() { // from class: org.apache.commons.lang3.b0
            @Override // org.apache.commons.lang3.m0.i
            public final Object get() {
                return m0.d.this.call();
            }
        });
    }

    public static <O, T extends Throwable> O D(i<O, T> iVar) {
        try {
            return iVar.get();
        } catch (Throwable th) {
            throw U(th);
        }
    }

    private static <T extends Throwable> boolean E(xe.i0<T> i0Var) {
        try {
            return i0Var.getAsBoolean();
        } catch (Throwable th) {
            throw U(th);
        }
    }

    public static RuntimeException U(Throwable th) {
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

    public static <T extends Throwable> void V(h<T> hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            throw U(th);
        }
    }

    public static <O> z0.b<O> W(Collection<O> collection) {
        return new z0.b<>(collection.stream());
    }

    public static <O> z0.b<O> X(Stream<O> stream) {
        return new z0.b<>(stream);
    }

    public static <O1, O2, T extends Throwable> boolean Y(final c<O1, O2, T> cVar, final O1 o12, final O2 o22) {
        return E(new xe.i0() { // from class: org.apache.commons.lang3.x
            @Override // xe.i0
            public final boolean getAsBoolean() {
                return m0.c.this.test(o12, o22);
            }
        });
    }

    public static <O, T extends Throwable> boolean Z(final g<O, T> gVar, final O o4) {
        return E(new xe.i0() { // from class: org.apache.commons.lang3.z
            @Override // xe.i0
            public final boolean getAsBoolean() {
                return m0.g.this.test(o4);
            }
        });
    }

    @SafeVarargs
    public static void a0(h<? extends Throwable> hVar, e<Throwable, ? extends Throwable> eVar, h<? extends Throwable>... hVarArr) {
        if (eVar == null) {
            eVar = new i0();
        }
        if (hVarArr != null) {
            for (h<? extends Throwable> hVar2 : hVarArr) {
                Objects.requireNonNull(hVar2, "runnable");
            }
        }
        try {
            hVar.run();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        if (hVarArr != null) {
            for (h<? extends Throwable> hVar3 : hVarArr) {
                try {
                    hVar3.run();
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
            }
        }
        if (th != null) {
            try {
                eVar.accept(th);
            } catch (Throwable th3) {
                throw U(th3);
            }
        }
    }

    @SafeVarargs
    public static void b0(h<? extends Throwable> hVar, h<? extends Throwable>... hVarArr) {
        a0(hVar, null, hVarArr);
    }

    public static <O1, O2, T extends Throwable> void p(final a<O1, O2, T> aVar, final O1 o12, final O2 o22) {
        V(new h() { // from class: org.apache.commons.lang3.j0
            @Override // org.apache.commons.lang3.m0.h
            public final void run() {
                m0.a.this.accept(o12, o22);
            }
        });
    }

    public static <O, T extends Throwable> void q(final e<O, T> eVar, final O o4) {
        V(new h() { // from class: org.apache.commons.lang3.g0
            @Override // org.apache.commons.lang3.m0.h
            public final void run() {
                m0.e.this.accept(o4);
            }
        });
    }

    public static <O1, O2, O, T extends Throwable> O r(final b<O1, O2, O, T> bVar, final O1 o12, final O2 o22) {
        return (O) D(new i() { // from class: org.apache.commons.lang3.k0
            @Override // org.apache.commons.lang3.m0.i
            public final Object get() {
                return m0.b.this.apply(o12, o22);
            }
        });
    }

    public static <I, O, T extends Throwable> O s(final f<I, O, T> fVar, final I i4) {
        return (O) D(new i() { // from class: org.apache.commons.lang3.d0
            @Override // org.apache.commons.lang3.m0.i
            public final Object get() {
                return m0.f.this.apply(i4);
            }
        });
    }

    public static <O1, O2> BiConsumer<O1, O2> t(final a<O1, O2, ?> aVar) {
        return new BiConsumer() { // from class: org.apache.commons.lang3.a0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                m0.p(m0.a.this, obj, obj2);
            }
        };
    }

    public static <O1, O2, O> BiFunction<O1, O2, O> u(final b<O1, O2, O, ?> bVar) {
        return new BiFunction() { // from class: org.apache.commons.lang3.e0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return m0.r(m0.b.this, obj, obj2);
            }
        };
    }

    public static <O1, O2> BiPredicate<O1, O2> v(final c<O1, O2, ?> cVar) {
        return new BiPredicate() { // from class: org.apache.commons.lang3.w
            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return m0.Y(m0.c.this, obj, obj2);
            }
        };
    }

    public static <O> Callable<O> w(final d<O, ?> dVar) {
        return new Callable() { // from class: org.apache.commons.lang3.c0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m0.C(m0.d.this);
            }
        };
    }

    public static <I> Consumer<I> x(e<I, ?> eVar) {
        return new y(eVar);
    }

    public static <I, O> Function<I, O> y(f<I, O, ?> fVar) {
        return new l0(fVar);
    }

    public static <I> Predicate<I> z(g<I, ?> gVar) {
        return new v(gVar);
    }
}
