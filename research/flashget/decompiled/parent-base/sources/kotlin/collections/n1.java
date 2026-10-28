package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.InterfaceC1469b;
import kotlin.Metadata;
import kotlin.k2;
import kotlin.o2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sets.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0087\b¢\u0006\u0004\b\b\u0010\u0003\u001a\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000H\u0087\b¢\u0006\u0004\b\n\u0010\u0003\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\u000b\u0010\u0007\u001a&\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00028\u00000\fj\b\u0012\u0004\u0012\u00028\u0000`\r\"\u0004\b\u0000\u0010\u0000H\u0087\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00028\u00000\fj\b\u0012\u0004\u0012\u00028\u0000`\r\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a&\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0012j\b\u0012\u0004\u0012\u00028\u0000`\u0013\"\u0004\b\u0000\u0010\u0000H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a7\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0012j\b\u0012\u0004\u0012\u00028\u0000`\u0013\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a7\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u00182\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0004\"\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u001c\u0010\u0007\u001aM\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u001d2\u001f\b\u0001\u0010!\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0002\b H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\"\u0010#\u001aU\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u001d2\u0006\u0010%\u001a\u00020$2\u001f\b\u0001\u0010!\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0002\b H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b&\u0010'\u001a(\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001H\u0087\b¢\u0006\u0004\b(\u0010)\u001a%\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b*\u0010)\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006+"}, d2 = {"T", "", "k", "()Ljava/util/Set;", "", "elements", "u", "([Ljava/lang/Object;)Ljava/util/Set;", "t", "", "p", "q", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "l", "()Ljava/util/HashSet;", "m", "([Ljava/lang/Object;)Ljava/util/HashSet;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "n", "()Ljava/util/LinkedHashSet;", "o", "([Ljava/lang/Object;)Ljava/util/LinkedHashSet;", "", "element", "v", "(Ljava/lang/Object;)Ljava/util/Set;", "w", "E", "Lkotlin/Function1;", "Lkotlin/k2;", "Lkotlin/u;", "builderAction", "j", "(Lld/l;)Ljava/util/Set;", "", "capacity", "i", "(ILld/l;)Ljava/util/Set;", "s", "(Ljava/util/Set;)Ljava/util/Set;", "r", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
/* loaded from: classes7.dex */
public class n1 extends m1 {
    @o2(markerClass = {kotlin.r.class})
    @kotlin.c1(version = "1.6")
    @kotlin.internal.f
    private static final <E> Set<E> i(int i4, @InterfaceC1469b ld.l<? super Set<E>, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("憩\u0001"));
        kotlin.collections.builders.j jVar = new kotlin.collections.builders.j(i4);
        lVar.invoke(jVar);
        return m1.a(jVar);
    }

    @o2(markerClass = {kotlin.r.class})
    @kotlin.c1(version = "1.6")
    @kotlin.internal.f
    private static final <E> Set<E> j(@InterfaceC1469b ld.l<? super Set<E>, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("憩\u0001"));
        kotlin.collections.builders.j jVar = new kotlin.collections.builders.j();
        lVar.invoke(jVar);
        return m1.a(jVar);
    }

    @fg.l
    public static <T> Set<T> k() {
        return l0.f74939b;
    }

    @kotlin.c1(version = "1.1")
    @kotlin.internal.f
    private static final <T> HashSet<T> l() {
        return new HashSet<>();
    }

    @fg.l
    public static final <T> HashSet<T> m(@fg.l T... tArr) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("憪\u0001"));
        return (HashSet) r.py(tArr, new HashSet(b1.j(tArr.length)));
    }

    @kotlin.c1(version = "1.1")
    @kotlin.internal.f
    private static final <T> LinkedHashSet<T> n() {
        return new LinkedHashSet<>();
    }

    @fg.l
    public static <T> LinkedHashSet<T> o(@fg.l T... tArr) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("憪\u0001"));
        return (LinkedHashSet) r.py(tArr, new LinkedHashSet(b1.j(tArr.length)));
    }

    @kotlin.c1(version = "1.1")
    @kotlin.internal.f
    private static final <T> Set<T> p() {
        return new LinkedHashSet();
    }

    @fg.l
    public static final <T> Set<T> q(@fg.l T... tArr) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("憪\u0001"));
        return (Set) r.py(tArr, new LinkedHashSet(b1.j(tArr.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public static final <T> Set<T> r(@fg.l Set<? extends T> set) {
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("憫\u0001"));
        int size = set.size();
        return size != 0 ? size != 1 ? set : m1.f(set.iterator().next()) : l0.f74939b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final <T> Set<T> s(Set<? extends T> set) {
        return set == 0 ? l0.f74939b : set;
    }

    @kotlin.internal.f
    private static final <T> Set<T> t() {
        return l0.f74939b;
    }

    @fg.l
    public static <T> Set<T> u(@fg.l T... tArr) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("憪\u0001"));
        return tArr.length > 0 ? r.mz(tArr) : l0.f74939b;
    }

    @fg.l
    @kotlin.c1(version = "1.4")
    public static final <T> Set<T> v(@fg.m T t4) {
        return t4 != null ? m1.f(t4) : l0.f74939b;
    }

    @fg.l
    @kotlin.c1(version = "1.4")
    public static final <T> Set<T> w(@fg.l T... tArr) {
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("憪\u0001"));
        return (Set) r.Ua(tArr, new LinkedHashSet());
    }
}
