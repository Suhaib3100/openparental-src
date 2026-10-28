package androidx.collection;

import kotlin.Metadata;

/* compiled from: FloatObjectMap.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a)\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\r\u001aI\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aY\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001ai\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a9\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010 \u001aI\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b!\u0010\"\u001aY\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b#\u0010$\u001ai\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0004\b%\u0010&\"\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010(¨\u0006*"}, d2 = {"V", "Landroidx/collection/x;", "a", "()Landroidx/collection/x;", "b", "", "key1", "value1", "c", "(FLjava/lang/Object;)Landroidx/collection/x;", "key2", "value2", "d", "(FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/x;", "key3", "value3", "e", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/x;", "key4", "value4", "f", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/x;", "key5", "value5", "g", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/x;", "Landroidx/collection/q1;", "h", "()Landroidx/collection/q1;", "i", "(FLjava/lang/Object;)Landroidx/collection/q1;", "j", "(FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/q1;", "k", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/q1;", "l", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/q1;", "m", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/q1;", "", "Landroidx/collection/q1;", "EmptyFloatObjectMap", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final q1 f2469a = new q1(0);

    @fg.l
    public static final <V> x<V> a() {
        q1 q1Var = f2469a;
        kotlin.jvm.internal.l0.n(q1Var, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.emptyFloatObjectMap>");
        return q1Var;
    }

    @fg.l
    public static final <V> x<V> b() {
        q1 q1Var = f2469a;
        kotlin.jvm.internal.l0.n(q1Var, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.floatObjectMapOf>");
        return q1Var;
    }

    @fg.l
    public static final <V> x<V> c(float f4, V v4) {
        q1 q1Var = new q1(0, 1, null);
        q1Var.j0(f4, v4);
        return q1Var;
    }

    @fg.l
    public static final <V> x<V> d(float f4, V v4, float f5, V v5) {
        q1 q1Var = new q1(0, 1, null);
        q1Var.j0(f4, v4);
        q1Var.j0(f5, v5);
        return q1Var;
    }

    @fg.l
    public static final <V> x<V> e(float f4, V v4, float f5, V v5, float f6, V v6) {
        q1 q1Var = new q1(0, 1, null);
        q1Var.j0(f4, v4);
        q1Var.j0(f5, v5);
        q1Var.j0(f6, v6);
        return q1Var;
    }

    @fg.l
    public static final <V> x<V> f(float f4, V v4, float f5, V v5, float f6, V v6, float f7, V v7) {
        q1 q1Var = new q1(0, 1, null);
        q1Var.j0(f4, v4);
        q1Var.j0(f5, v5);
        q1Var.j0(f6, v6);
        q1Var.j0(f7, v7);
        return q1Var;
    }

    @fg.l
    public static final <V> x<V> g(float f4, V v4, float f5, V v5, float f6, V v6, float f7, V v7, float f10, V v10) {
        q1 q1Var = new q1(0, 1, null);
        q1Var.j0(f4, v4);
        q1Var.j0(f5, v5);
        q1Var.j0(f6, v6);
        q1Var.j0(f7, v7);
        q1Var.j0(f10, v10);
        return q1Var;
    }

    @fg.l
    public static final <V> q1<V> h() {
        return new q1<>(0, 1, null);
    }

    @fg.l
    public static final <V> q1<V> i(float f4, V v4) {
        q1<V> q1Var = new q1<>(0, 1, null);
        q1Var.j0(f4, v4);
        return q1Var;
    }

    @fg.l
    public static final <V> q1<V> j(float f4, V v4, float f5, V v5) {
        q1<V> q1Var = new q1<>(0, 1, null);
        q1Var.j0(f4, v4);
        q1Var.j0(f5, v5);
        return q1Var;
    }

    @fg.l
    public static final <V> q1<V> k(float f4, V v4, float f5, V v5, float f6, V v6) {
        q1<V> q1Var = new q1<>(0, 1, null);
        q1Var.j0(f4, v4);
        q1Var.j0(f5, v5);
        q1Var.j0(f6, v6);
        return q1Var;
    }

    @fg.l
    public static final <V> q1<V> l(float f4, V v4, float f5, V v5, float f6, V v6, float f7, V v7) {
        q1<V> q1Var = new q1<>(0, 1, null);
        q1Var.j0(f4, v4);
        q1Var.j0(f5, v5);
        q1Var.j0(f6, v6);
        q1Var.j0(f7, v7);
        return q1Var;
    }

    @fg.l
    public static final <V> q1<V> m(float f4, V v4, float f5, V v5, float f6, V v6, float f7, V v7, float f10, V v10) {
        q1<V> q1Var = new q1<>(0, 1, null);
        q1Var.j0(f4, v4);
        q1Var.j0(f5, v5);
        q1Var.j0(f6, v6);
        q1Var.j0(f7, v7);
        q1Var.j0(f10, v10);
        return q1Var;
    }
}
