package androidx.collection;

import kotlin.Metadata;

/* compiled from: ObjectIntMap.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a)\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r\u001aI\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011\u001aY\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015\u001ai\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001e\u001a9\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 \u001aI\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"\u001aY\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$\u001ai\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&\"\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010(¨\u0006*"}, d2 = {"K", "Landroidx/collection/n2;", "a", "()Landroidx/collection/n2;", "h", "key1", "", "value1", "i", "(Ljava/lang/Object;I)Landroidx/collection/n2;", "key2", "value2", "j", "(Ljava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/n2;", "key3", "value3", "k", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/n2;", "key4", "value4", "l", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/n2;", "key5", "value5", "m", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/n2;", "Landroidx/collection/g2;", "b", "()Landroidx/collection/g2;", "c", "(Ljava/lang/Object;I)Landroidx/collection/g2;", "d", "(Ljava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/g2;", "e", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/g2;", "f", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/g2;", "g", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/g2;", "", "Landroidx/collection/g2;", "EmptyObjectIntMap", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o2 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final g2<Object> f2357a = new g2<>(0);

    @fg.l
    public static final <K> n2<K> a() {
        g2<Object> g2Var = f2357a;
        kotlin.jvm.internal.l0.n(g2Var, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        return g2Var;
    }

    @fg.l
    public static final <K> g2<K> b() {
        return new g2<>(0, 1, null);
    }

    @fg.l
    public static final <K> g2<K> c(K k4, int i4) {
        g2<K> g2Var = new g2<>(0, 1, null);
        g2Var.l0(k4, i4);
        return g2Var;
    }

    @fg.l
    public static final <K> g2<K> d(K k4, int i4, K k5, int i5) {
        g2<K> g2Var = new g2<>(0, 1, null);
        g2Var.l0(k4, i4);
        g2Var.l0(k5, i5);
        return g2Var;
    }

    @fg.l
    public static final <K> g2<K> e(K k4, int i4, K k5, int i5, K k6, int i6) {
        g2<K> g2Var = new g2<>(0, 1, null);
        g2Var.l0(k4, i4);
        g2Var.l0(k5, i5);
        g2Var.l0(k6, i6);
        return g2Var;
    }

    @fg.l
    public static final <K> g2<K> f(K k4, int i4, K k5, int i5, K k6, int i6, K k7, int i7) {
        g2<K> g2Var = new g2<>(0, 1, null);
        g2Var.l0(k4, i4);
        g2Var.l0(k5, i5);
        g2Var.l0(k6, i6);
        g2Var.l0(k7, i7);
        return g2Var;
    }

    @fg.l
    public static final <K> g2<K> g(K k4, int i4, K k5, int i5, K k6, int i6, K k7, int i7, K k10, int i10) {
        g2<K> g2Var = new g2<>(0, 1, null);
        g2Var.l0(k4, i4);
        g2Var.l0(k5, i5);
        g2Var.l0(k6, i6);
        g2Var.l0(k7, i7);
        g2Var.l0(k10, i10);
        return g2Var;
    }

    @fg.l
    public static final <K> n2<K> h() {
        g2<Object> g2Var = f2357a;
        kotlin.jvm.internal.l0.n(g2Var, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.objectIntMap>");
        return g2Var;
    }

    @fg.l
    public static final <K> n2<K> i(K k4, int i4) {
        g2 g2Var = new g2(0, 1, null);
        g2Var.l0(k4, i4);
        return g2Var;
    }

    @fg.l
    public static final <K> n2<K> j(K k4, int i4, K k5, int i5) {
        g2 g2Var = new g2(0, 1, null);
        g2Var.l0(k4, i4);
        g2Var.l0(k5, i5);
        return g2Var;
    }

    @fg.l
    public static final <K> n2<K> k(K k4, int i4, K k5, int i5, K k6, int i6) {
        g2 g2Var = new g2(0, 1, null);
        g2Var.l0(k4, i4);
        g2Var.l0(k5, i5);
        g2Var.l0(k6, i6);
        return g2Var;
    }

    @fg.l
    public static final <K> n2<K> l(K k4, int i4, K k5, int i5, K k6, int i6, K k7, int i7) {
        g2 g2Var = new g2(0, 1, null);
        g2Var.l0(k4, i4);
        g2Var.l0(k5, i5);
        g2Var.l0(k6, i6);
        g2Var.l0(k7, i7);
        return g2Var;
    }

    @fg.l
    public static final <K> n2<K> m(K k4, int i4, K k5, int i5, K k6, int i6, K k7, int i7, K k10, int i10) {
        g2 g2Var = new g2(0, 1, null);
        g2Var.l0(k4, i4);
        g2Var.l0(k5, i5);
        g2Var.l0(k6, i6);
        g2Var.l0(k7, i7);
        g2Var.l0(k10, i10);
        return g2Var;
    }
}
