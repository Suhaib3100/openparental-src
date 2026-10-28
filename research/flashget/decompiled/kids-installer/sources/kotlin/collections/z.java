package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.collections.builders.ListBuilder;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.m2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CollectionsJVM.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0001\u001a?\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u001d\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0081\bø\u0001\u0000\u001a7\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u001d\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0081\bø\u0001\u0000\u001a\u0011\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0081\b\u001a\u0011\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0081\b\u001a\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0081\b¢\u0006\u0002\u0010\u0015\u001a4\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0011\"\u0004\b\u0000\u0010\u00162\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0011H\u0081\b¢\u0006\u0002\u0010\u0018\u001a\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\"\u0004\b\u0000\u0010\u0002H\u0001\u001a\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u001a\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0001\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u001b\u001a\u0002H\u0016¢\u0006\u0002\u0010\u001c\u001a/\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0011\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u001e\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0011H\u0000¢\u0006\u0002\u0010\u001f\u001a1\u0010 \u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00120\u0011\"\u0004\b\u0000\u0010\u0016*\n\u0012\u0006\b\u0001\u0012\u0002H\u00160\u00112\u0006\u0010!\u001a\u00020\"H\u0000¢\u0006\u0002\u0010#\u001a\u001e\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0001\"\u0004\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u0002H\u00160%H\u0007\u001a&\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0001\"\u0004\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u0002H\u00160%2\u0006\u0010&\u001a\u00020'H\u0007\u001a\u001f\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0001\"\u0004\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u0002H\u00160)H\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006*"}, d2 = {"build", "", "E", "builder", "", "buildListInternal", "capacity", "", "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "checkCountOverflow", "count", "checkIndexOverflow", "index", "collectionToArray", "", "", "collection", "", "(Ljava/util/Collection;)[Ljava/lang/Object;", "T", "array", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "createListBuilder", "listOf", "element", "(Ljava/lang/Object;)Ljava/util/List;", "terminateCollectionToArray", "collectionSize", "(I[Ljava/lang/Object;)[Ljava/lang/Object;", "copyToArrayOfAny", "isVarargs", "", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "shuffled", "", "random", "Ljava/util/Random;", "toList", "Ljava/util/Enumeration;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
@SourceDebugExtension({"SMAP\nCollectionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionsJVM.kt\nkotlin/collections/CollectionsKt__CollectionsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
/* loaded from: classes5.dex */
public class z {
    @SinceKotlin(version = "1.3")
    @PublishedApi
    @d5.d
    public static <E> List<E> a(@d5.d List<E> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("㜱"));
        return ((ListBuilder) list).t();
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @InlineOnly
    private static final <E> List<E> b(int i5, q3.l<? super List<E>, m2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("㜲"));
        ListBuilder listBuilder = new ListBuilder(i5);
        lVar.N(listBuilder);
        return a(listBuilder);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @InlineOnly
    private static final <E> List<E> c(q3.l<? super List<E>, m2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("㜳"));
        ListBuilder listBuilder = new ListBuilder();
        lVar.N(listBuilder);
        return a(listBuilder);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @InlineOnly
    private static final int d(int i5) {
        if (i5 < 0) {
            if (!kotlin.internal.m.a(1, 3, 0)) {
                throw new ArithmeticException(ProtectedSandApp.s("㜴"));
            }
            a0.Y();
        }
        return i5;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @InlineOnly
    private static final int e(int i5) {
        if (i5 < 0) {
            if (!kotlin.internal.m.a(1, 3, 0)) {
                throw new ArithmeticException(ProtectedSandApp.s("㜵"));
            }
            a0.Z();
        }
        return i5;
    }

    @InlineOnly
    private static final Object[] f(Collection<?> collection) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("㜶"));
        return kotlin.jvm.internal.v.a(collection);
    }

    @InlineOnly
    private static final <T> T[] g(Collection<?> collection, T[] tArr) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("㜷"));
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("㜸"));
        return (T[]) kotlin.jvm.internal.v.b(collection, tArr);
    }

    @d5.d
    public static final <T> Object[] h(@d5.d T[] tArr, boolean z5) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("㜹"));
        if (z5 && kotlin.jvm.internal.l0.g(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        kotlin.jvm.internal.l0.o(copyOf, ProtectedSandApp.s("㜺"));
        return copyOf;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @d5.d
    public static <E> List<E> i() {
        return new ListBuilder();
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @d5.d
    public static <E> List<E> j(int i5) {
        return new ListBuilder(i5);
    }

    @d5.d
    public static <T> List<T> k(T t5) {
        List<T> singletonList = Collections.singletonList(t5);
        kotlin.jvm.internal.l0.o(singletonList, ProtectedSandApp.s("㜻"));
        return singletonList;
    }

    @SinceKotlin(version = "1.2")
    @d5.d
    public static final <T> List<T> l(@d5.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("㜼"));
        List<T> X5 = j0.X5(iterable);
        Collections.shuffle(X5);
        return X5;
    }

    @SinceKotlin(version = "1.2")
    @d5.d
    public static final <T> List<T> m(@d5.d Iterable<? extends T> iterable, @d5.d Random random) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("㜽"));
        kotlin.jvm.internal.l0.p(random, ProtectedSandApp.s("㜾"));
        List<T> X5 = j0.X5(iterable);
        Collections.shuffle(X5, random);
        return X5;
    }

    @d5.d
    public static <T> T[] n(int i5, @d5.d T[] tArr) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("㜿"));
        if (i5 < tArr.length) {
            tArr[i5] = null;
        }
        return tArr;
    }

    @InlineOnly
    private static final <T> List<T> o(Enumeration<T> enumeration) {
        kotlin.jvm.internal.l0.p(enumeration, ProtectedSandApp.s("㝀"));
        ArrayList list = Collections.list(enumeration);
        kotlin.jvm.internal.l0.o(list, ProtectedSandApp.s("㝁"));
        return list;
    }
}
