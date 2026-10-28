package androidx.collection;

import kotlin.Metadata;

/* compiled from: ScatterSet.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\n\u001a1\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000e\"\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a1\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a-\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000e\"\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001c\"\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u001e¨\u0006 "}, d2 = {"E", "Landroidx/collection/y2;", "a", "()Landroidx/collection/y2;", "g", "element1", "h", "(Ljava/lang/Object;)Landroidx/collection/y2;", "element2", "i", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/y2;", "element3", "j", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/y2;", "", "elements", "k", "([Ljava/lang/Object;)Landroidx/collection/y2;", "Landroidx/collection/k2;", "b", "()Landroidx/collection/k2;", "c", "(Ljava/lang/Object;)Landroidx/collection/k2;", "d", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/k2;", "e", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/k2;", "f", "([Ljava/lang/Object;)Landroidx/collection/k2;", "", "Landroidx/collection/k2;", "EmptyScatterSet", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1100:1\n1#2:1101\n*E\n"})
/* loaded from: classes.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final k2<Object> f2494a = new k2<>(0);

    @fg.l
    public static final <E> y2<E> a() {
        k2<Object> k2Var = f2494a;
        kotlin.jvm.internal.l0.n(k2Var, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        return k2Var;
    }

    @fg.l
    public static final <E> k2<E> b() {
        return new k2<>(0, 1, null);
    }

    @fg.l
    public static final <E> k2<E> c(E e4) {
        k2<E> k2Var = new k2<>(1);
        k2Var.Z(e4);
        return k2Var;
    }

    @fg.l
    public static final <E> k2<E> d(E e4, E e5) {
        k2<E> k2Var = new k2<>(2);
        k2Var.Z(e4);
        k2Var.Z(e5);
        return k2Var;
    }

    @fg.l
    public static final <E> k2<E> e(E e4, E e5, E e6) {
        k2<E> k2Var = new k2<>(3);
        k2Var.Z(e4);
        k2Var.Z(e5);
        k2Var.Z(e6);
        return k2Var;
    }

    @fg.l
    public static final <E> k2<E> f(@fg.l E... elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        k2<E> k2Var = new k2<>(elements.length);
        k2Var.b0(elements);
        return k2Var;
    }

    @fg.l
    public static final <E> y2<E> g() {
        k2<Object> k2Var = f2494a;
        kotlin.jvm.internal.l0.n(k2Var, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.scatterSetOf>");
        return k2Var;
    }

    @fg.l
    public static final <E> y2<E> h(E e4) {
        return c(e4);
    }

    @fg.l
    public static final <E> y2<E> i(E e4, E e5) {
        return d(e4, e5);
    }

    @fg.l
    public static final <E> y2<E> j(E e4, E e5, E e6) {
        return e(e4, e5, e6);
    }

    @fg.l
    public static final <E> y2<E> k(@fg.l E... elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        k2 k2Var = new k2(elements.length);
        k2Var.b0(elements);
        return k2Var;
    }
}
