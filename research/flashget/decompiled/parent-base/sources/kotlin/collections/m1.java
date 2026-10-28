package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.k2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SetsJVM.kt */
@Metadata(d1 = {"\u0000B\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a>\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\u001d\u0010\n\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0081\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aF\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\r2\u001d\u0010\n\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0081\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0005H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a-\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0018\"\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001aI\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u001a\u0010\u001f\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u001dj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u001e2\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0018\"\u00028\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"T", "element", "", "f", "(Ljava/lang/Object;)Ljava/util/Set;", "E", "Lkotlin/Function1;", "", "Lkotlin/k2;", "Lkotlin/u;", "builderAction", "c", "(Lld/l;)Ljava/util/Set;", "", "capacity", "b", "(ILld/l;)Ljava/util/Set;", "d", "()Ljava/util/Set;", "e", "(I)Ljava/util/Set;", "builder", "a", "(Ljava/util/Set;)Ljava/util/Set;", "", "elements", "Ljava/util/TreeSet;", "h", "([Ljava/lang/Object;)Ljava/util/TreeSet;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "g", "(Ljava/util/Comparator;[Ljava/lang/Object;)Ljava/util/TreeSet;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
/* loaded from: classes7.dex */
public class m1 {
    @fg.l
    @kotlin.c1(version = "1.3")
    @kotlin.w0
    public static <E> Set<E> a(@fg.l Set<E> set) {
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("憤\u0001"));
        return ((kotlin.collections.builders.j) set).c();
    }

    @kotlin.c1(version = "1.3")
    @kotlin.w0
    @kotlin.internal.f
    private static final <E> Set<E> b(int i4, ld.l<? super Set<E>, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("憥\u0001"));
        kotlin.collections.builders.j jVar = new kotlin.collections.builders.j(i4);
        lVar.invoke(jVar);
        return a(jVar);
    }

    @kotlin.c1(version = "1.3")
    @kotlin.w0
    @kotlin.internal.f
    private static final <E> Set<E> c(ld.l<? super Set<E>, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("憥\u0001"));
        kotlin.collections.builders.j jVar = new kotlin.collections.builders.j();
        lVar.invoke(jVar);
        return a(jVar);
    }

    @fg.l
    @kotlin.c1(version = "1.3")
    @kotlin.w0
    public static <E> Set<E> d() {
        return new kotlin.collections.builders.j();
    }

    @fg.l
    @kotlin.c1(version = "1.3")
    @kotlin.w0
    public static <E> Set<E> e(int i4) {
        return new kotlin.collections.builders.j(i4);
    }

    @fg.l
    public static <T> Set<T> f(T t4) {
        Set<T> singleton = Collections.singleton(t4);
        kotlin.jvm.internal.l0.o(singleton, ProtectedSandApp.s("憦\u0001"));
        return singleton;
    }

    @fg.l
    public static final <T> TreeSet<T> g(@fg.l Comparator<? super T> comparator, @fg.l T... tArr) {
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("憧\u0001"));
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("憨\u0001"));
        return (TreeSet) r.py(tArr, new TreeSet(comparator));
    }

    @fg.l
    public static <T> TreeSet<T> h(@fg.l T... tArr) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("憨\u0001"));
        return (TreeSet) r.py(tArr, new TreeSet());
    }
}
