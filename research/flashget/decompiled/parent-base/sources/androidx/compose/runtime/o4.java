package androidx.compose.runtime;

import java.util.Collection;
import kotlin.Metadata;

@Metadata(d1 = {"androidx/compose/runtime/p4", "androidx/compose/runtime/q4", "androidx/compose/runtime/r4", "androidx/compose/runtime/s4", "androidx/compose/runtime/t4"}, d2 = {}, k = 4, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o4 {
    @fg.l
    @i
    public static final <T extends R, R> b5<R> a(@fg.l kotlinx.coroutines.flow.i<? extends T> iVar, R r4, @fg.m kotlin.coroutines.g gVar, @fg.m t tVar, int i4, int i5) {
        return r4.b(iVar, r4, gVar, tVar, i4, i5);
    }

    @fg.l
    @i
    public static final <T> b5<T> b(@fg.l kotlinx.coroutines.flow.t0<? extends T> t0Var, @fg.m kotlin.coroutines.g gVar, @fg.m t tVar, int i4, int i5) {
        return r4.c(t0Var, gVar, tVar, i4, i5);
    }

    @fg.l
    public static final androidx.compose.runtime.collection.g<s0> c() {
        return p4.b();
    }

    @androidx.compose.runtime.snapshots.j0
    @fg.l
    public static final <T> b5<T> d(@fg.l m4<T> m4Var, @fg.l ld.a<? extends T> aVar) {
        return p4.c(m4Var, aVar);
    }

    @androidx.compose.runtime.snapshots.j0
    @fg.l
    public static final <T> b5<T> e(@fg.l ld.a<? extends T> aVar) {
        return p4.d(aVar);
    }

    public static final <T> T f(@fg.l b5<? extends T> b5Var, @fg.m Object obj, @fg.l kotlin.reflect.o<?> oVar) {
        return b5Var.getValue();
    }

    @androidx.compose.runtime.snapshots.j0
    @fg.l
    public static final <T> androidx.compose.runtime.snapshots.b0<T> g() {
        return new androidx.compose.runtime.snapshots.b0<>();
    }

    @androidx.compose.runtime.snapshots.j0
    @fg.l
    public static final <T> androidx.compose.runtime.snapshots.b0<T> h(@fg.l T... tArr) {
        return t4.c(tArr);
    }

    @androidx.compose.runtime.snapshots.j0
    @fg.l
    public static final <K, V> androidx.compose.runtime.snapshots.d0<K, V> i() {
        return new androidx.compose.runtime.snapshots.d0<>();
    }

    @androidx.compose.runtime.snapshots.j0
    @fg.l
    public static final <K, V> androidx.compose.runtime.snapshots.d0<K, V> j(@fg.l kotlin.q0<? extends K, ? extends V>... q0VarArr) {
        return t4.e(q0VarArr);
    }

    @androidx.compose.runtime.snapshots.j0
    @fg.l
    public static final <T> k2<T> k(T t4, @fg.l m4<T> m4Var) {
        return b.e(t4, m4Var);
    }

    @fg.l
    public static final <T> m4<T> m() {
        return s4.a();
    }

    public static final <R> void n(@fg.l s0 s0Var, @fg.l ld.a<? extends R> aVar) {
        p4.f(s0Var, aVar);
    }

    @fg.l
    @i
    public static final <T> b5<T> o(T t4, @fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.l ld.p<? super y2<T>, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, @fg.m t tVar, int i4) {
        return q4.a(t4, obj, obj2, obj3, pVar, tVar, i4);
    }

    @fg.l
    @i
    public static final <T> b5<T> p(T t4, @fg.m Object obj, @fg.m Object obj2, @fg.l ld.p<? super y2<T>, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, @fg.m t tVar, int i4) {
        return q4.b(t4, obj, obj2, pVar, tVar, i4);
    }

    @fg.l
    @i
    public static final <T> b5<T> q(T t4, @fg.m Object obj, @fg.l ld.p<? super y2<T>, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, @fg.m t tVar, int i4) {
        return q4.c(t4, obj, pVar, tVar, i4);
    }

    @fg.l
    @i
    public static final <T> b5<T> r(T t4, @fg.l ld.p<? super y2<T>, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, @fg.m t tVar, int i4) {
        return q4.d(t4, pVar, tVar, i4);
    }

    @fg.l
    @i
    public static final <T> b5<T> s(T t4, @fg.l Object[] objArr, @fg.l ld.p<? super y2<T>, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, @fg.m t tVar, int i4) {
        return q4.e(t4, objArr, pVar, tVar, i4);
    }

    @fg.l
    public static final <T> m4<T> t() {
        return s4.b();
    }

    @fg.l
    @i
    public static final <T> b5<T> u(T t4, @fg.m t tVar, int i4) {
        return t4.h(t4, tVar, i4);
    }

    public static final <T> void v(@fg.l k2<T> k2Var, @fg.m Object obj, @fg.l kotlin.reflect.o<?> oVar, T t4) {
        k2Var.setValue(t4);
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> w(@fg.l ld.a<? extends T> aVar) {
        return r4.e(aVar);
    }

    @fg.l
    public static final <T> m4<T> x() {
        return s4.c();
    }

    @fg.l
    public static final <T> androidx.compose.runtime.snapshots.b0<T> y(@fg.l Collection<? extends T> collection) {
        return t4.j(collection);
    }

    @fg.l
    public static final <K, V> androidx.compose.runtime.snapshots.d0<K, V> z(@fg.l Iterable<? extends kotlin.q0<? extends K, ? extends V>> iterable) {
        return t4.k(iterable);
    }
}
