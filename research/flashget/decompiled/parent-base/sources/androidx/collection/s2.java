package androidx.collection;

import java.util.List;
import kotlin.Metadata;

/* compiled from: ObjectList.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\b\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n¢\u0006\u0004\b\u000e\u0010\r\u001a!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a1\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a-\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n2\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0018\"\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0004\b\u0000\u0010\nH\u0086\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010 \u001a)\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b!\u0010\"\u001a1\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b#\u0010$\u001a0\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0004\b\u0000\u0010\n2\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0018\"\u00028\u0000H\u0086\b¢\u0006\u0004\b%\u0010&\"\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\"\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"", "", "index", "Lkotlin/k2;", "d", "(Ljava/util/List;I)V", "fromIndex", "toIndex", "e", "(Ljava/util/List;II)V", "E", "Landroidx/collection/p2;", "f", "()Landroidx/collection/p2;", "l", "element1", "m", "(Ljava/lang/Object;)Landroidx/collection/p2;", "element2", "n", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/p2;", "element3", "o", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/p2;", "", "elements", "p", "([Ljava/lang/Object;)Landroidx/collection/p2;", "Landroidx/collection/h2;", "g", "()Landroidx/collection/h2;", "h", "(Ljava/lang/Object;)Landroidx/collection/h2;", "i", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/h2;", "j", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/h2;", "k", "([Ljava/lang/Object;)Landroidx/collection/h2;", "", "a", "[Ljava/lang/Object;", "EmptyArray", "b", "Landroidx/collection/p2;", "EmptyObjectList", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,1618:1\n1#2:1619\n948#3,2:1620\n948#3,2:1622\n948#3,2:1624\n948#3,2:1626\n948#3,2:1628\n948#3,2:1630\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n*L\n1587#1:1620,2\n1596#1:1622,2\n1597#1:1624,2\n1607#1:1626,2\n1608#1:1628,2\n1609#1:1630,2\n*E\n"})
/* loaded from: classes.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final Object[] f2382a = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final p2<Object> f2383b = new h2(0, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(List<?> list, int i4) {
        int size = list.size();
        if (i4 < 0 || i4 >= size) {
            throw new IndexOutOfBoundsException(q2.a("Index ", i4, " is out of bounds. The list has ", size, " elements."));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(List<?> list, int i4, int i5) {
        int size = list.size();
        if (i4 > i5) {
            throw new IllegalArgumentException(q2.a("Indices are out of order. fromIndex (", i4, ") is greater than toIndex (", i5, ")."));
        }
        if (i4 < 0) {
            throw new IndexOutOfBoundsException(r2.a("fromIndex (", i4, ") is less than 0."));
        }
        if (i5 > size) {
            throw new IndexOutOfBoundsException(m1.a("toIndex (", i5, ") is more than than the list size (", size, ')'));
        }
    }

    @fg.l
    public static final <E> p2<E> f() {
        p2<E> p2Var = (p2<E>) f2383b;
        kotlin.jvm.internal.l0.n(p2Var, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return p2Var;
    }

    @fg.l
    public static final <E> h2<E> g() {
        return new h2<>(0, 1, null);
    }

    @fg.l
    public static final <E> h2<E> h(E e4) {
        h2<E> h2Var = new h2<>(1, null);
        h2Var.Z(e4);
        return h2Var;
    }

    @fg.l
    public static final <E> h2<E> i(E e4, E e5) {
        h2<E> h2Var = new h2<>(2, null);
        h2Var.Z(e4);
        h2Var.Z(e5);
        return h2Var;
    }

    @fg.l
    public static final <E> h2<E> j(E e4, E e5, E e6) {
        h2<E> h2Var = new h2<>(3, null);
        h2Var.Z(e4);
        h2Var.Z(e5);
        h2Var.Z(e6);
        return h2Var;
    }

    @fg.l
    public static final <E> h2<E> k(@fg.l E... elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        h2<E> h2Var = new h2<>(elements.length, null);
        h2Var.A0(elements);
        return h2Var;
    }

    @fg.l
    public static final <E> p2<E> l() {
        p2<E> p2Var = (p2<E>) f2383b;
        kotlin.jvm.internal.l0.n(p2Var, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.objectListOf>");
        return p2Var;
    }

    @fg.l
    public static final <E> p2<E> m(E e4) {
        return h(e4);
    }

    @fg.l
    public static final <E> p2<E> n(E e4, E e5) {
        return i(e4, e5);
    }

    @fg.l
    public static final <E> p2<E> o(E e4, E e5, E e6) {
        return j(e4, e5, e6);
    }

    @fg.l
    public static final <E> p2<E> p(@fg.l E... elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        h2 h2Var = new h2(elements.length, null);
        h2Var.A0(elements);
        return h2Var;
    }
}
