package androidx.collection;

import kotlin.Metadata;

/* compiled from: LongObjectMap.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a)\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\r\u001aI\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aY\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001ai\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a9\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010 \u001aI\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b!\u0010\"\u001aY\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b#\u0010$\u001ai\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0004\b%\u0010&\"\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010(¨\u0006*"}, d2 = {"V", "Landroidx/collection/a1;", "a", "()Landroidx/collection/a1;", "b", "", "key1", "value1", "c", "(JLjava/lang/Object;)Landroidx/collection/a1;", "key2", "value2", "d", "(JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/a1;", "key3", "value3", "e", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/a1;", "key4", "value4", "f", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/a1;", "key5", "value5", "g", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/a1;", "Landroidx/collection/c2;", "h", "()Landroidx/collection/c2;", "i", "(JLjava/lang/Object;)Landroidx/collection/c2;", "j", "(JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/c2;", "k", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/c2;", "l", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/c2;", "m", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/c2;", "", "Landroidx/collection/c2;", "EmptyLongObjectMap", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final c2 f2175a = new c2(0);

    @fg.l
    public static final <V> a1<V> a() {
        c2 c2Var = f2175a;
        kotlin.jvm.internal.l0.n(c2Var, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        return c2Var;
    }

    @fg.l
    public static final <V> a1<V> b() {
        c2 c2Var = f2175a;
        kotlin.jvm.internal.l0.n(c2Var, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.longObjectMapOf>");
        return c2Var;
    }

    @fg.l
    public static final <V> a1<V> c(long j4, V v4) {
        c2 c2Var = new c2(0, 1, null);
        c2Var.j0(j4, v4);
        return c2Var;
    }

    @fg.l
    public static final <V> a1<V> d(long j4, V v4, long j5, V v5) {
        c2 c2Var = new c2(0, 1, null);
        c2Var.j0(j4, v4);
        c2Var.j0(j5, v5);
        return c2Var;
    }

    @fg.l
    public static final <V> a1<V> e(long j4, V v4, long j5, V v5, long j6, V v6) {
        c2 c2Var = new c2(0, 1, null);
        c2Var.j0(j4, v4);
        c2Var.j0(j5, v5);
        c2Var.j0(j6, v6);
        return c2Var;
    }

    @fg.l
    public static final <V> a1<V> f(long j4, V v4, long j5, V v5, long j6, V v6, long j7, V v7) {
        c2 c2Var = new c2(0, 1, null);
        c2Var.j0(j4, v4);
        c2Var.j0(j5, v5);
        c2Var.j0(j6, v6);
        c2Var.j0(j7, v7);
        return c2Var;
    }

    @fg.l
    public static final <V> a1<V> g(long j4, V v4, long j5, V v5, long j6, V v6, long j7, V v7, long j10, V v10) {
        c2 c2Var = new c2(0, 1, null);
        c2Var.j0(j4, v4);
        c2Var.j0(j5, v5);
        c2Var.j0(j6, v6);
        c2Var.j0(j7, v7);
        c2Var.j0(j10, v10);
        return c2Var;
    }

    @fg.l
    public static final <V> c2<V> h() {
        return new c2<>(0, 1, null);
    }

    @fg.l
    public static final <V> c2<V> i(long j4, V v4) {
        c2<V> c2Var = new c2<>(0, 1, null);
        c2Var.j0(j4, v4);
        return c2Var;
    }

    @fg.l
    public static final <V> c2<V> j(long j4, V v4, long j5, V v5) {
        c2<V> c2Var = new c2<>(0, 1, null);
        c2Var.j0(j4, v4);
        c2Var.j0(j5, v5);
        return c2Var;
    }

    @fg.l
    public static final <V> c2<V> k(long j4, V v4, long j5, V v5, long j6, V v6) {
        c2<V> c2Var = new c2<>(0, 1, null);
        c2Var.j0(j4, v4);
        c2Var.j0(j5, v5);
        c2Var.j0(j6, v6);
        return c2Var;
    }

    @fg.l
    public static final <V> c2<V> l(long j4, V v4, long j5, V v5, long j6, V v6, long j7, V v7) {
        c2<V> c2Var = new c2<>(0, 1, null);
        c2Var.j0(j4, v4);
        c2Var.j0(j5, v5);
        c2Var.j0(j6, v6);
        c2Var.j0(j7, v7);
        return c2Var;
    }

    @fg.l
    public static final <V> c2<V> m(long j4, V v4, long j5, V v5, long j6, V v6, long j7, V v7, long j10, V v10) {
        c2<V> c2Var = new c2<>(0, 1, null);
        c2Var.j0(j4, v4);
        c2Var.j0(j5, v5);
        c2Var.j0(j6, v6);
        c2Var.j0(j7, v7);
        c2Var.j0(j10, v10);
        return c2Var;
    }
}
