package net.time4j.engine;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import net.time4j.engine.m0;

/* compiled from: TimePoint.java */
/* loaded from: classes7.dex */
public abstract class m0<U, T extends m0<U, T>> extends r<T> implements Comparable<T>, Serializable {
    private o0<T> R(U u4) {
        return y().z0(u4);
    }

    public static <U, T extends m0<U, T>> T S(T t4, T t5) {
        return t4.compareTo(t5) > 0 ? t4 : t5;
    }

    public static <U, T extends m0<U, T>> T T(T t4, T t5) {
        return t4.compareTo(t5) > 0 ? t5 : t4;
    }

    @Override // java.lang.Comparable
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public abstract int compareTo(T t4);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.r
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public abstract j0<U, T> y();

    public T U(long j4, U u4) {
        return W(net.time4j.base.c.k(j4), u4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T V(n0<? extends U> n0Var) {
        try {
            return (T) n0Var.a((m0) z());
        } catch (IllegalArgumentException e4) {
            ArithmeticException arithmeticException = new ArithmeticException(ProtectedSandApp.s("訨\u0001"));
            arithmeticException.initCause(e4);
            throw arithmeticException;
        }
    }

    public T W(long j4, U u4) {
        if (j4 == 0) {
            return (T) z();
        }
        try {
            return (T) R(u4).b(z(), j4);
        } catch (IllegalArgumentException e4) {
            ArithmeticException arithmeticException = new ArithmeticException(ProtectedSandApp.s("訨\u0001"));
            arithmeticException.initCause(e4);
            throw arithmeticException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T X(n0<? extends U> n0Var) {
        try {
            return (T) n0Var.b((m0) z());
        } catch (IllegalArgumentException e4) {
            ArithmeticException arithmeticException = new ArithmeticException(ProtectedSandApp.s("訨\u0001"));
            arithmeticException.initCause(e4);
            throw arithmeticException;
        }
    }

    public long Y(T t4, U u4) {
        return R(u4).a(z(), t4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <P> P Z(T t4, l0<? extends U, P> l0Var) {
        return l0Var.a((m0) z(), t4);
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();
}
