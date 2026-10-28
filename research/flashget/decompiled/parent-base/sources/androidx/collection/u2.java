package androidx.collection;

import kotlin.Metadata;

/* compiled from: ObjectLongMap.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a)\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r\u001aI\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011\u001aY\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015\u001ai\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001e\u001a9\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 \u001aI\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"\u001aY\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$\u001ai\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&\"\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010(¨\u0006*"}, d2 = {"K", "Landroidx/collection/t2;", "a", "()Landroidx/collection/t2;", "h", "key1", "", "value1", "i", "(Ljava/lang/Object;J)Landroidx/collection/t2;", "key2", "value2", "j", "(Ljava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/t2;", "key3", "value3", "k", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/t2;", "key4", "value4", "l", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/t2;", "key5", "value5", "m", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/t2;", "Landroidx/collection/i2;", "b", "()Landroidx/collection/i2;", "c", "(Ljava/lang/Object;J)Landroidx/collection/i2;", "d", "(Ljava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/i2;", "e", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/i2;", "f", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/i2;", "g", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/i2;", "", "Landroidx/collection/i2;", "EmptyObjectLongMap", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final i2<Object> f2396a = new i2<>(0);

    @fg.l
    public static final <K> t2<K> a() {
        i2<Object> i2Var = f2396a;
        kotlin.jvm.internal.l0.n(i2Var, "null cannot be cast to non-null type androidx.collection.ObjectLongMap<K of androidx.collection.ObjectLongMapKt.emptyObjectLongMap>");
        return i2Var;
    }

    @fg.l
    public static final <K> i2<K> b() {
        return new i2<>(0, 1, null);
    }

    @fg.l
    public static final <K> i2<K> c(K k4, long j4) {
        i2<K> i2Var = new i2<>(0, 1, null);
        i2Var.l0(k4, j4);
        return i2Var;
    }

    @fg.l
    public static final <K> i2<K> d(K k4, long j4, K k5, long j5) {
        i2<K> i2Var = new i2<>(0, 1, null);
        i2Var.l0(k4, j4);
        i2Var.l0(k5, j5);
        return i2Var;
    }

    @fg.l
    public static final <K> i2<K> e(K k4, long j4, K k5, long j5, K k6, long j6) {
        i2<K> i2Var = new i2<>(0, 1, null);
        i2Var.l0(k4, j4);
        i2Var.l0(k5, j5);
        i2Var.l0(k6, j6);
        return i2Var;
    }

    @fg.l
    public static final <K> i2<K> f(K k4, long j4, K k5, long j5, K k6, long j6, K k7, long j7) {
        i2<K> i2Var = new i2<>(0, 1, null);
        i2Var.l0(k4, j4);
        i2Var.l0(k5, j5);
        i2Var.l0(k6, j6);
        i2Var.l0(k7, j7);
        return i2Var;
    }

    @fg.l
    public static final <K> i2<K> g(K k4, long j4, K k5, long j5, K k6, long j6, K k7, long j7, K k10, long j10) {
        i2<K> i2Var = new i2<>(0, 1, null);
        i2Var.l0(k4, j4);
        i2Var.l0(k5, j5);
        i2Var.l0(k6, j6);
        i2Var.l0(k7, j7);
        i2Var.l0(k10, j10);
        return i2Var;
    }

    @fg.l
    public static final <K> t2<K> h() {
        i2<Object> i2Var = f2396a;
        kotlin.jvm.internal.l0.n(i2Var, "null cannot be cast to non-null type androidx.collection.ObjectLongMap<K of androidx.collection.ObjectLongMapKt.objectLongMap>");
        return i2Var;
    }

    @fg.l
    public static final <K> t2<K> i(K k4, long j4) {
        i2 i2Var = new i2(0, 1, null);
        i2Var.l0(k4, j4);
        return i2Var;
    }

    @fg.l
    public static final <K> t2<K> j(K k4, long j4, K k5, long j5) {
        i2 i2Var = new i2(0, 1, null);
        i2Var.l0(k4, j4);
        i2Var.l0(k5, j5);
        return i2Var;
    }

    @fg.l
    public static final <K> t2<K> k(K k4, long j4, K k5, long j5, K k6, long j6) {
        i2 i2Var = new i2(0, 1, null);
        i2Var.l0(k4, j4);
        i2Var.l0(k5, j5);
        i2Var.l0(k6, j6);
        return i2Var;
    }

    @fg.l
    public static final <K> t2<K> l(K k4, long j4, K k5, long j5, K k6, long j6, K k7, long j7) {
        i2 i2Var = new i2(0, 1, null);
        i2Var.l0(k4, j4);
        i2Var.l0(k5, j5);
        i2Var.l0(k6, j6);
        i2Var.l0(k7, j7);
        return i2Var;
    }

    @fg.l
    public static final <K> t2<K> m(K k4, long j4, K k5, long j5, K k6, long j6, K k7, long j7, K k10, long j10) {
        i2 i2Var = new i2(0, 1, null);
        i2Var.l0(k4, j4);
        i2Var.l0(k5, j5);
        i2Var.l0(k6, j6);
        i2Var.l0(k7, j7);
        i2Var.l0(k10, j10);
        return i2Var;
    }
}
