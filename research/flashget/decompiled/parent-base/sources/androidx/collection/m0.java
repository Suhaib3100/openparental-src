package androidx.collection;

import kotlin.Metadata;

/* compiled from: IntObjectMap.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a)\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\r\u001aI\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aY\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001ai\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a9\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010 \u001aI\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b!\u0010\"\u001aY\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b#\u0010$\u001ai\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0004\b%\u0010&\"\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010(¨\u0006*"}, d2 = {"V", "Landroidx/collection/l0;", "a", "()Landroidx/collection/l0;", "b", "", "key1", "value1", "c", "(ILjava/lang/Object;)Landroidx/collection/l0;", "key2", "value2", "d", "(ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/l0;", "key3", "value3", "e", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/l0;", "key4", "value4", "f", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/l0;", "key5", "value5", "g", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/l0;", "Landroidx/collection/w1;", "h", "()Landroidx/collection/w1;", "i", "(ILjava/lang/Object;)Landroidx/collection/w1;", "j", "(ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/w1;", "k", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/w1;", "l", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/w1;", "m", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/w1;", "", "Landroidx/collection/w1;", "EmptyIntObjectMap", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final w1 f2342a = new w1(0);

    @fg.l
    public static final <V> l0<V> a() {
        w1 w1Var = f2342a;
        kotlin.jvm.internal.l0.n(w1Var, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
        return w1Var;
    }

    @fg.l
    public static final <V> l0<V> b() {
        w1 w1Var = f2342a;
        kotlin.jvm.internal.l0.n(w1Var, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        return w1Var;
    }

    @fg.l
    public static final <V> l0<V> c(int i4, V v4) {
        w1 w1Var = new w1(0, 1, null);
        w1Var.j0(i4, v4);
        return w1Var;
    }

    @fg.l
    public static final <V> l0<V> d(int i4, V v4, int i5, V v5) {
        w1 w1Var = new w1(0, 1, null);
        w1Var.j0(i4, v4);
        w1Var.j0(i5, v5);
        return w1Var;
    }

    @fg.l
    public static final <V> l0<V> e(int i4, V v4, int i5, V v5, int i6, V v6) {
        w1 w1Var = new w1(0, 1, null);
        w1Var.j0(i4, v4);
        w1Var.j0(i5, v5);
        w1Var.j0(i6, v6);
        return w1Var;
    }

    @fg.l
    public static final <V> l0<V> f(int i4, V v4, int i5, V v5, int i6, V v6, int i7, V v7) {
        w1 w1Var = new w1(0, 1, null);
        w1Var.j0(i4, v4);
        w1Var.j0(i5, v5);
        w1Var.j0(i6, v6);
        w1Var.j0(i7, v7);
        return w1Var;
    }

    @fg.l
    public static final <V> l0<V> g(int i4, V v4, int i5, V v5, int i6, V v6, int i7, V v7, int i10, V v10) {
        w1 w1Var = new w1(0, 1, null);
        w1Var.j0(i4, v4);
        w1Var.j0(i5, v5);
        w1Var.j0(i6, v6);
        w1Var.j0(i7, v7);
        w1Var.j0(i10, v10);
        return w1Var;
    }

    @fg.l
    public static final <V> w1<V> h() {
        return new w1<>(0, 1, null);
    }

    @fg.l
    public static final <V> w1<V> i(int i4, V v4) {
        w1<V> w1Var = new w1<>(0, 1, null);
        w1Var.j0(i4, v4);
        return w1Var;
    }

    @fg.l
    public static final <V> w1<V> j(int i4, V v4, int i5, V v5) {
        w1<V> w1Var = new w1<>(0, 1, null);
        w1Var.j0(i4, v4);
        w1Var.j0(i5, v5);
        return w1Var;
    }

    @fg.l
    public static final <V> w1<V> k(int i4, V v4, int i5, V v5, int i6, V v6) {
        w1<V> w1Var = new w1<>(0, 1, null);
        w1Var.j0(i4, v4);
        w1Var.j0(i5, v5);
        w1Var.j0(i6, v6);
        return w1Var;
    }

    @fg.l
    public static final <V> w1<V> l(int i4, V v4, int i5, V v5, int i6, V v6, int i7, V v7) {
        w1<V> w1Var = new w1<>(0, 1, null);
        w1Var.j0(i4, v4);
        w1Var.j0(i5, v5);
        w1Var.j0(i6, v6);
        w1Var.j0(i7, v7);
        return w1Var;
    }

    @fg.l
    public static final <V> w1<V> m(int i4, V v4, int i5, V v5, int i6, V v6, int i7, V v7, int i10, V v10) {
        w1<V> w1Var = new w1<>(0, 1, null);
        w1Var.j0(i4, v4);
        w1Var.j0(i5, v5);
        w1Var.j0(i6, v6);
        w1Var.j0(i7, v7);
        w1Var.j0(i10, v10);
        return w1Var;
    }
}
