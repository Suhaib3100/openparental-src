package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.k2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CollectionsJVM.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a>\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\u001d\u0010\n\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0081\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aF\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\r2\u001d\u0010\n\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0081\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0005H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0087\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a-\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010!\u001a$\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$2\n\u0010#\u001a\u0006\u0012\u0002\b\u00030\"H\u0081\b¢\u0006\u0004\b&\u0010'\u001a6\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u00002\n\u0010#\u001a\u0006\u0012\u0002\b\u00030\"2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0081\b¢\u0006\u0004\b)\u0010*\u001a1\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u00002\u0006\u0010+\u001a\u00020\r2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0000¢\u0006\u0004\b,\u0010-\u001a3\u00100\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010%0$\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000$2\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b0\u00101\u001a\u0018\u00103\u001a\u00020\r2\u0006\u00102\u001a\u00020\rH\u0081\b¢\u0006\u0004\b3\u00104\u001a\u0018\u00106\u001a\u00020\r2\u0006\u00105\u001a\u00020\rH\u0081\b¢\u0006\u0004\b6\u00104\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00067"}, d2 = {"T", "element", "", "k", "(Ljava/lang/Object;)Ljava/util/List;", "E", "Lkotlin/Function1;", "", "Lkotlin/k2;", "Lkotlin/u;", "builderAction", "c", "(Lld/l;)Ljava/util/List;", "", "capacity", "b", "(ILld/l;)Ljava/util/List;", "i", "()Ljava/util/List;", "j", "(I)Ljava/util/List;", "builder", "a", "(Ljava/util/List;)Ljava/util/List;", "Ljava/util/Enumeration;", "o", "(Ljava/util/Enumeration;)Ljava/util/List;", "", "l", "(Ljava/lang/Iterable;)Ljava/util/List;", "Ljava/util/Random;", "random", "m", "(Ljava/lang/Iterable;Ljava/util/Random;)Ljava/util/List;", "", "collection", "", "", "f", "(Ljava/util/Collection;)[Ljava/lang/Object;", "array", "g", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "collectionSize", "n", "(I[Ljava/lang/Object;)[Ljava/lang/Object;", "", "isVarargs", "h", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "index", "e", "(I)I", "count", "d", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
@kotlin.jvm.internal.r1({"SMAP\nCollectionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionsJVM.kt\nkotlin/collections/CollectionsKt__CollectionsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
/* loaded from: classes7.dex */
public class x {
    @fg.l
    @kotlin.c1(version = "1.3")
    @kotlin.w0
    public static <E> List<E> a(@fg.l List<E> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("悗\u0001"));
        return ((kotlin.collections.builders.b) list).p();
    }

    @kotlin.c1(version = "1.3")
    @kotlin.w0
    @kotlin.internal.f
    private static final <E> List<E> b(int i4, ld.l<? super List<E>, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("悘\u0001"));
        kotlin.collections.builders.b bVar = new kotlin.collections.builders.b(i4);
        lVar.invoke(bVar);
        return a(bVar);
    }

    @kotlin.c1(version = "1.3")
    @kotlin.w0
    @kotlin.internal.f
    private static final <E> List<E> c(ld.l<? super List<E>, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("悘\u0001"));
        kotlin.collections.builders.b bVar = new kotlin.collections.builders.b();
        lVar.invoke(bVar);
        return a(bVar);
    }

    @kotlin.c1(version = "1.3")
    @kotlin.w0
    @kotlin.internal.f
    private static final int d(int i4) {
        if (i4 < 0) {
            if (!kotlin.internal.m.a(1, 3, 0)) {
                throw new ArithmeticException(ProtectedSandApp.s("悙\u0001"));
            }
            y.Y();
        }
        return i4;
    }

    @kotlin.c1(version = "1.3")
    @kotlin.w0
    @kotlin.internal.f
    private static final int e(int i4) {
        if (i4 < 0) {
            if (!kotlin.internal.m.a(1, 3, 0)) {
                throw new ArithmeticException(ProtectedSandApp.s("悚\u0001"));
            }
            y.Z();
        }
        return i4;
    }

    @kotlin.internal.f
    private static final Object[] f(Collection<?> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("悛\u0001"));
        return kotlin.jvm.internal.v.a(collection);
    }

    @kotlin.internal.f
    private static final <T> T[] g(Collection<?> collection, T[] tArr) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("悛\u0001"));
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("悜\u0001"));
        return (T[]) kotlin.jvm.internal.v.b(collection, tArr);
    }

    @fg.l
    public static final <T> Object[] h(@fg.l T[] tArr, boolean z4) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("悝\u0001"));
        if (z4 && kotlin.jvm.internal.l0.g(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        kotlin.jvm.internal.l0.o(copyOf, ProtectedSandApp.s("悞\u0001"));
        return copyOf;
    }

    @fg.l
    @kotlin.c1(version = "1.3")
    @kotlin.w0
    public static <E> List<E> i() {
        return new kotlin.collections.builders.b();
    }

    @fg.l
    @kotlin.c1(version = "1.3")
    @kotlin.w0
    public static <E> List<E> j(int i4) {
        return new kotlin.collections.builders.b(i4);
    }

    @fg.l
    public static <T> List<T> k(T t4) {
        List<T> singletonList = Collections.singletonList(t4);
        kotlin.jvm.internal.l0.o(singletonList, ProtectedSandApp.s("悟\u0001"));
        return singletonList;
    }

    @fg.l
    @kotlin.c1(version = "1.2")
    public static final <T> List<T> l(@fg.l Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("悝\u0001"));
        List<T> X5 = g0.X5(iterable);
        Collections.shuffle(X5);
        return X5;
    }

    @fg.l
    @kotlin.c1(version = "1.2")
    public static final <T> List<T> m(@fg.l Iterable<? extends T> iterable, @fg.l Random random) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("悝\u0001"));
        kotlin.jvm.internal.l0.p(random, ProtectedSandApp.s("悠\u0001"));
        List<T> X5 = g0.X5(iterable);
        Collections.shuffle(X5, random);
        return X5;
    }

    @fg.l
    public static <T> T[] n(int i4, @fg.l T[] tArr) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("悜\u0001"));
        if (i4 < tArr.length) {
            tArr[i4] = null;
        }
        return tArr;
    }

    @kotlin.internal.f
    private static final <T> List<T> o(Enumeration<T> enumeration) {
        kotlin.jvm.internal.l0.p(enumeration, ProtectedSandApp.s("悝\u0001"));
        ArrayList list = Collections.list(enumeration);
        kotlin.jvm.internal.l0.o(list, ProtectedSandApp.s("悡\u0001"));
        return list;
    }
}
