package androidx.core.util;

import android.annotation.SuppressLint;
import java.util.Objects;

/* compiled from: Predicate.java */
@SuppressLint({"UnknownNullness"})
/* loaded from: classes3.dex */
public interface c0<T> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean c(Object obj) {
        return !test(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean d(c0 c0Var, Object obj) {
        return test(obj) || c0Var.test(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean h(c0 c0Var, Object obj) {
        return test(obj) && c0Var.test(obj);
    }

    @SuppressLint({"MissingNullability"})
    static <T> c0<T> i(@SuppressLint({"MissingNullability"}) c0<? super T> c0Var) {
        Objects.requireNonNull(c0Var);
        return c0Var.negate();
    }

    @SuppressLint({"MissingNullability"})
    static <T> c0<T> isEqual(@SuppressLint({"MissingNullability"}) final Object obj) {
        return obj == null ? new y() : new c0() { // from class: androidx.core.util.z
            @Override // androidx.core.util.c0
            public final boolean test(Object obj2) {
                return obj.equals(obj2);
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    default c0<T> b(@SuppressLint({"MissingNullability"}) final c0<? super T> c0Var) {
        Objects.requireNonNull(c0Var);
        return new c0() { // from class: androidx.core.util.a0
            @Override // androidx.core.util.c0
            public final boolean test(Object obj) {
                boolean h4;
                h4 = c0.this.h(c0Var, obj);
                return h4;
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    default c0<T> e(@SuppressLint({"MissingNullability"}) final c0<? super T> c0Var) {
        Objects.requireNonNull(c0Var);
        return new c0() { // from class: androidx.core.util.x
            @Override // androidx.core.util.c0
            public final boolean test(Object obj) {
                boolean d5;
                d5 = c0.this.d(c0Var, obj);
                return d5;
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    default c0<T> negate() {
        return new c0() { // from class: androidx.core.util.b0
            @Override // androidx.core.util.c0
            public final boolean test(Object obj) {
                boolean c5;
                c5 = c0.this.c(obj);
                return c5;
            }
        };
    }

    boolean test(T t4);
}
