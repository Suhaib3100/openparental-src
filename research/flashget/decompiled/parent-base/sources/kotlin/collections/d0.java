package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.o2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MutableCollections.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u000e\u001a/\u0010\u0005\u001a\u00020\u0004\"\t\b\u0000\u0010\u0001¢\u0006\u0002\b\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\t\u001a\u00020\u0004\"\t\b\u0000\u0010\u0001¢\u0006\u0002\b\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0087\b¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u000b\u001a\u00020\u0004\"\t\b\u0000\u0010\u0001¢\u0006\u0002\b\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0087\b¢\u0006\u0004\b\u000b\u0010\n\u001a*\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0087\n¢\u0006\u0004\b\r\u0010\u000e\u001a0\u0010\u0010\u001a\u00020\f\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0087\n¢\u0006\u0004\b\u0010\u0010\u0011\u001a0\u0010\u0013\u001a\u00020\f\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0087\n¢\u0006\u0004\b\u0013\u0010\u0014\u001a0\u0010\u0016\u001a\u00020\f\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0087\n¢\u0006\u0004\b\u0016\u0010\u0017\u001a*\u0010\u0018\u001a\u00020\f\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0087\n¢\u0006\u0004\b\u0018\u0010\u000e\u001a0\u0010\u0019\u001a\u00020\f\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0087\n¢\u0006\u0004\b\u0019\u0010\u0011\u001a0\u0010\u001a\u001a\u00020\f\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0087\n¢\u0006\u0004\b\u001a\u0010\u0014\u001a0\u0010\u001b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0087\n¢\u0006\u0004\b\u001b\u0010\u0017\u001a-\u0010\u001c\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u001c\u0010\u001d\u001a-\u0010\u001e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u001e\u0010\u001f\u001a/\u0010 \u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0012¢\u0006\u0004\b \u0010!\u001a%\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0000¢\u0006\u0004\b\"\u0010#\u001a-\u0010$\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b$\u0010\u001d\u001a-\u0010%\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b%\u0010\u001f\u001a/\u0010&\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0012¢\u0006\u0004\b&\u0010!\u001a-\u0010'\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b'\u0010\u001d\u001a/\u0010(\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0012¢\u0006\u0004\b(\u0010!\u001a-\u0010)\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b)\u0010\u001f\u001a\u0017\u0010*\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b*\u0010+\u001a1\u0010/\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000,2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040-¢\u0006\u0004\b/\u00100\u001a1\u00101\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000,2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040-¢\u0006\u0004\b1\u00100\u001a;\u00103\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000,2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040-2\u0006\u00102\u001a\u00020\u0004H\u0002¢\u0006\u0004\b3\u00104\u001a(\u00108\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u0000052\u0006\u00107\u001a\u000206H\u0087\b¢\u0006\u0004\b8\u00109\u001a\u001f\u0010:\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u000005H\u0007¢\u0006\u0004\b:\u0010;\u001a!\u0010<\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u000005H\u0007¢\u0006\u0004\b<\u0010;\u001a\u001f\u0010=\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u000005H\u0007¢\u0006\u0004\b=\u0010;\u001a!\u0010>\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u000005H\u0007¢\u0006\u0004\b>\u0010;\u001a1\u0010?\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u0000052\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040-¢\u0006\u0004\b?\u0010@\u001a1\u0010A\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u0000052\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040-¢\u0006\u0004\bA\u0010@\u001a;\u0010B\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u0000052\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040-2\u0006\u00102\u001a\u00020\u0004H\u0002¢\u0006\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lkotlin/internal/j;", "T", "", "element", "", "F0", "(Ljava/util/Collection;Ljava/lang/Object;)Z", "", "elements", "I0", "(Ljava/util/Collection;Ljava/util/Collection;)Z", "S0", "Lkotlin/k2;", "B0", "(Ljava/util/Collection;Ljava/lang/Object;)V", "", "A0", "(Ljava/util/Collection;Ljava/lang/Iterable;)V", "", "D0", "(Ljava/util/Collection;[Ljava/lang/Object;)V", "Lkotlin/sequences/m;", "C0", "(Ljava/util/Collection;Lkotlin/sequences/m;)V", "x0", "w0", "z0", "y0", "q0", "(Ljava/util/Collection;Ljava/lang/Iterable;)Z", "r0", "(Ljava/util/Collection;Lkotlin/sequences/m;)Z", "s0", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "t0", "(Ljava/lang/Iterable;)Ljava/util/Collection;", "H0", "J0", "K0", "R0", "U0", "T0", "W0", "(Ljava/util/Collection;)Z", "", "Lkotlin/Function1;", "predicate", "G0", "(Ljava/lang/Iterable;Lld/l;)Z", "Q0", "predicateResultToRemove", "u0", "(Ljava/lang/Iterable;Lld/l;Z)Z", "", "", "index", "E0", "(Ljava/util/List;I)Ljava/lang/Object;", "M0", "(Ljava/util/List;)Ljava/lang/Object;", "N0", "O0", "P0", "L0", "(Ljava/util/List;Lld/l;)Z", "V0", "v0", "(Ljava/util/List;Lld/l;Z)Z", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes7.dex */
public class d0 extends c0 {
    @kotlin.internal.f
    private static final <T> void A0(Collection<? super T> collection, Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("愩\u0001"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("愪\u0001"));
        q0(collection, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    private static final <T> void B0(Collection<? super T> collection, T t4) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("愩\u0001"));
        collection.add(t4);
    }

    @kotlin.internal.f
    private static final <T> void C0(Collection<? super T> collection, kotlin.sequences.m<? extends T> mVar) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("愩\u0001"));
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("愪\u0001"));
        r0(collection, mVar);
    }

    @kotlin.internal.f
    private static final <T> void D0(Collection<? super T> collection, T[] tArr) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("愩\u0001"));
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("愪\u0001"));
        s0(collection, tArr);
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Use removeAt(index) instead.", replaceWith = @kotlin.x0(expression = "removeAt(index)", imports = {}))
    @kotlin.internal.f
    private static final <T> T E0(List<T> list, int i4) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("愩\u0001"));
        return list.remove(i4);
    }

    @kotlin.internal.f
    private static final <T> boolean F0(Collection<? extends T> collection, T t4) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("愩\u0001"));
        return kotlin.jvm.internal.u1.a(collection).remove(t4);
    }

    public static <T> boolean G0(@fg.l Iterable<? extends T> iterable, @fg.l ld.l<? super T, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("愩\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愫\u0001"));
        return u0(iterable, lVar, true);
    }

    public static <T> boolean H0(@fg.l Collection<? super T> collection, @fg.l Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("愩\u0001"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("愪\u0001"));
        return collection.removeAll(t0(iterable));
    }

    @kotlin.internal.f
    private static final <T> boolean I0(Collection<? extends T> collection, Collection<? extends T> collection2) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("愩\u0001"));
        kotlin.jvm.internal.l0.p(collection2, ProtectedSandApp.s("愪\u0001"));
        return kotlin.jvm.internal.u1.a(collection).removeAll(collection2);
    }

    public static <T> boolean J0(@fg.l Collection<? super T> collection, @fg.l kotlin.sequences.m<? extends T> mVar) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("愩\u0001"));
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("愪\u0001"));
        List c32 = kotlin.sequences.p.c3(mVar);
        return !c32.isEmpty() && collection.removeAll(c32);
    }

    public static <T> boolean K0(@fg.l Collection<? super T> collection, @fg.l T[] tArr) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("愩\u0001"));
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("愪\u0001"));
        return !(tArr.length == 0) && collection.removeAll(o.t(tArr));
    }

    public static <T> boolean L0(@fg.l List<T> list, @fg.l ld.l<? super T, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("愩\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愫\u0001"));
        return v0(list, lVar, true);
    }

    @o2(markerClass = {kotlin.r.class})
    @kotlin.c1(version = "1.4")
    public static <T> T M0(@fg.l List<T> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("愩\u0001"));
        if (list.isEmpty()) {
            throw new NoSuchElementException(ProtectedSandApp.s("愬\u0001"));
        }
        return list.remove(0);
    }

    @o2(markerClass = {kotlin.r.class})
    @fg.m
    @kotlin.c1(version = "1.4")
    public static <T> T N0(@fg.l List<T> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("愩\u0001"));
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    @o2(markerClass = {kotlin.r.class})
    @kotlin.c1(version = "1.4")
    public static <T> T O0(@fg.l List<T> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("愩\u0001"));
        if (list.isEmpty()) {
            throw new NoSuchElementException(ProtectedSandApp.s("愬\u0001"));
        }
        return list.remove(y.J(list));
    }

    @o2(markerClass = {kotlin.r.class})
    @fg.m
    @kotlin.c1(version = "1.4")
    public static final <T> T P0(@fg.l List<T> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("愩\u0001"));
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(y.J(list));
    }

    public static <T> boolean Q0(@fg.l Iterable<? extends T> iterable, @fg.l ld.l<? super T, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("愩\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愫\u0001"));
        return u0(iterable, lVar, false);
    }

    public static <T> boolean R0(@fg.l Collection<? super T> collection, @fg.l Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("愩\u0001"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("愪\u0001"));
        return collection.retainAll(t0(iterable));
    }

    @kotlin.internal.f
    private static final <T> boolean S0(Collection<? extends T> collection, Collection<? extends T> collection2) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("愩\u0001"));
        kotlin.jvm.internal.l0.p(collection2, ProtectedSandApp.s("愪\u0001"));
        return kotlin.jvm.internal.u1.a(collection).retainAll(collection2);
    }

    public static final <T> boolean T0(@fg.l Collection<? super T> collection, @fg.l kotlin.sequences.m<? extends T> mVar) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("愩\u0001"));
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("愪\u0001"));
        List c32 = kotlin.sequences.p.c3(mVar);
        return !c32.isEmpty() ? collection.retainAll(c32) : W0(collection);
    }

    public static final <T> boolean U0(@fg.l Collection<? super T> collection, @fg.l T[] tArr) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("愩\u0001"));
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("愪\u0001"));
        return !(tArr.length == 0) ? collection.retainAll(o.t(tArr)) : W0(collection);
    }

    public static final <T> boolean V0(@fg.l List<T> list, @fg.l ld.l<? super T, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("愩\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("愫\u0001"));
        return v0(list, lVar, false);
    }

    private static final boolean W0(Collection<?> collection) {
        boolean z4 = !collection.isEmpty();
        collection.clear();
        return z4;
    }

    public static <T> boolean q0(@fg.l Collection<? super T> collection, @fg.l Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("愩\u0001"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("愪\u0001"));
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z4 = true;
            }
        }
        return z4;
    }

    public static <T> boolean r0(@fg.l Collection<? super T> collection, @fg.l kotlin.sequences.m<? extends T> mVar) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("愩\u0001"));
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("愪\u0001"));
        Iterator<? extends T> it = mVar.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z4 = true;
            }
        }
        return z4;
    }

    public static <T> boolean s0(@fg.l Collection<? super T> collection, @fg.l T[] tArr) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("愩\u0001"));
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("愪\u0001"));
        return collection.addAll(o.t(tArr));
    }

    @fg.l
    public static <T> Collection<T> t0(@fg.l Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("愩\u0001"));
        if (!(iterable instanceof Collection)) {
            iterable = g0.V5(iterable);
        }
        return (Collection) iterable;
    }

    private static final <T> boolean u0(Iterable<? extends T> iterable, ld.l<? super T, Boolean> lVar, boolean z4) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue() == z4) {
                it.remove();
                z5 = true;
            }
        }
        return z5;
    }

    private static final <T> boolean v0(List<T> list, ld.l<? super T, Boolean> lVar, boolean z4) {
        if (!(list instanceof RandomAccess)) {
            kotlin.jvm.internal.l0.n(list, ProtectedSandApp.s("愭\u0001"));
            return u0(kotlin.jvm.internal.u1.c(list), lVar, z4);
        }
        u0 it = new kotlin.ranges.l(0, y.J(list), 1).iterator();
        int i4 = 0;
        while (it.hasNext()) {
            int c5 = it.c();
            T t4 = list.get(c5);
            if (lVar.invoke(t4).booleanValue() != z4) {
                if (i4 != c5) {
                    list.set(i4, t4);
                }
                i4++;
            }
        }
        if (i4 >= list.size()) {
            return false;
        }
        int J = y.J(list);
        if (i4 <= J) {
            while (true) {
                list.remove(J);
                if (J == i4) {
                    break;
                }
                J--;
            }
        }
        return true;
    }

    @kotlin.internal.f
    private static final <T> void w0(Collection<? super T> collection, Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("愩\u0001"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("愪\u0001"));
        H0(collection, iterable);
    }

    @kotlin.internal.f
    private static final <T> void x0(Collection<? super T> collection, T t4) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("愩\u0001"));
        collection.remove(t4);
    }

    @kotlin.internal.f
    private static final <T> void y0(Collection<? super T> collection, kotlin.sequences.m<? extends T> mVar) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("愩\u0001"));
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("愪\u0001"));
        J0(collection, mVar);
    }

    @kotlin.internal.f
    private static final <T> void z0(Collection<? super T> collection, T[] tArr) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("愩\u0001"));
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("愪\u0001"));
        K0(collection, tArr);
    }
}
