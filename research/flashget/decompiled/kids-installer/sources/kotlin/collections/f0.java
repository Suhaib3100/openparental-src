package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MutableCollections.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u001a-\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\n\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0000\u001a9\u0010\u000b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u0010\u001a9\u0010\u000b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00112\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u0010\u001a(\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u0006\u0010\u0014\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010\u0015\u001a.\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0087\n¢\u0006\u0002\u0010\u0016\u001a)\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0087\n\u001a)\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0087\n\u001a(\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u0006\u0010\u0014\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010\u0015\u001a.\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0087\n¢\u0006\u0002\u0010\u0016\u001a)\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0087\n\u001a)\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0087\n\u001a-\u0010\u0018\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0019*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\u0006\u0010\u0014\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u001a\u001a&\u0010\u0018\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0087\b¢\u0006\u0002\u0010\u001d\u001a-\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a&\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a&\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\u001a.\u0010\u001e\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0019*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\nH\u0087\b\u001a*\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u000e\u001a*\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00112\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u000e\u001a\u001d\u0010\u001f\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0011H\u0007¢\u0006\u0002\u0010 \u001a\u001f\u0010!\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0011H\u0007¢\u0006\u0002\u0010 \u001a\u001d\u0010\"\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0011H\u0007¢\u0006\u0002\u0010 \u001a\u001f\u0010#\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0011H\u0007¢\u0006\u0002\u0010 \u001a-\u0010$\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a&\u0010$\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a&\u0010$\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\u001a.\u0010$\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0019*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\nH\u0087\b\u001a*\u0010$\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u000e\u001a*\u0010$\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00112\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u000e\u001a\u0015\u0010%\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0002\b&¨\u0006'"}, d2 = {"addAll", "", "T", "", "elements", "", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "", "Lkotlin/sequences/Sequence;", "convertToListIfNotCollection", "", "filterInPlace", "", "predicate", "Lkotlin/Function1;", "predicateResultToRemove", "filterInPlace$CollectionsKt__MutableCollectionsKt", "", "minusAssign", "", "element", "(Ljava/util/Collection;Ljava/lang/Object;)V", "(Ljava/util/Collection;[Ljava/lang/Object;)V", "plusAssign", "remove", "Lkotlin/internal/OnlyInputTypes;", "(Ljava/util/Collection;Ljava/lang/Object;)Z", "index", "", "(Ljava/util/List;I)Ljava/lang/Object;", "removeAll", "removeFirst", "(Ljava/util/List;)Ljava/lang/Object;", "removeFirstOrNull", "removeLast", "removeLastOrNull", "retainAll", "retainNothing", "retainNothing$CollectionsKt__MutableCollectionsKt", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes6.dex */
public class f0 extends e0 {
    @InlineOnly
    private static final <T> void A0(Collection<? super T> collection, Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("沭"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("沮"));
        q0(collection, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <T> void B0(Collection<? super T> collection, T t5) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("沯"));
        collection.add(t5);
    }

    @InlineOnly
    private static final <T> void C0(Collection<? super T> collection, Sequence<? extends T> sequence) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("沰"));
        kotlin.jvm.internal.l0.p(sequence, ProtectedSandApp.s("沱"));
        r0(collection, sequence);
    }

    @InlineOnly
    private static final <T> void D0(Collection<? super T> collection, T[] tArr) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("沲"));
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("河"));
        s0(collection, tArr);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use removeAt(index) instead.", replaceWith = @ReplaceWith(expression = "removeAt(index)", imports = {}))
    @InlineOnly
    private static final <T> T E0(List<T> list, int i5) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("沴"));
        return list.remove(i5);
    }

    @InlineOnly
    private static final <T> boolean F0(Collection<? extends T> collection, T t5) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("沵"));
        return kotlin.jvm.internal.u1.a(collection).remove(t5);
    }

    public static final <T> boolean G0(@d5.d Iterable<? extends T> iterable, @d5.d q3.l<? super T, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("沶"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("沷"));
        return u0(iterable, lVar, true);
    }

    public static final <T> boolean H0(@d5.d Collection<? super T> collection, @d5.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("沸"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("油"));
        return collection.removeAll(t0(iterable));
    }

    @InlineOnly
    private static final <T> boolean I0(Collection<? extends T> collection, Collection<? extends T> collection2) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("沺"));
        kotlin.jvm.internal.l0.p(collection2, ProtectedSandApp.s("治"));
        return kotlin.jvm.internal.u1.a(collection).removeAll(collection2);
    }

    public static final <T> boolean J0(@d5.d Collection<? super T> collection, @d5.d Sequence<? extends T> sequence) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("沼"));
        kotlin.jvm.internal.l0.p(sequence, ProtectedSandApp.s("沽"));
        List c32 = kotlin.sequences.v.c3(sequence);
        return (c32.isEmpty() ^ true) && collection.removeAll(c32);
    }

    public static final <T> boolean K0(@d5.d Collection<? super T> collection, @d5.d T[] tArr) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("沾"));
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("沿"));
        return ((tArr.length == 0) ^ true) && collection.removeAll(p.t(tArr));
    }

    public static final <T> boolean L0(@d5.d List<T> list, @d5.d q3.l<? super T, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("泀"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("況"));
        return v0(list, lVar, true);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T> T M0(@d5.d List<T> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("泂"));
        if (list.isEmpty()) {
            throw new NoSuchElementException(ProtectedSandApp.s("泃"));
        }
        return list.remove(0);
    }

    @SinceKotlin(version = "1.4")
    @d5.e
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T> T N0(@d5.d List<T> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("泄"));
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static <T> T O0(@d5.d List<T> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("泅"));
        if (list.isEmpty()) {
            throw new NoSuchElementException(ProtectedSandApp.s("泆"));
        }
        return list.remove(a0.J(list));
    }

    @SinceKotlin(version = "1.4")
    @d5.e
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T> T P0(@d5.d List<T> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("泇"));
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(a0.J(list));
    }

    public static <T> boolean Q0(@d5.d Iterable<? extends T> iterable, @d5.d q3.l<? super T, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("泈"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("泉"));
        return u0(iterable, lVar, false);
    }

    public static final <T> boolean R0(@d5.d Collection<? super T> collection, @d5.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("泊"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("泋"));
        return collection.retainAll(t0(iterable));
    }

    @InlineOnly
    private static final <T> boolean S0(Collection<? extends T> collection, Collection<? extends T> collection2) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("泌"));
        kotlin.jvm.internal.l0.p(collection2, ProtectedSandApp.s("泍"));
        return kotlin.jvm.internal.u1.a(collection).retainAll(collection2);
    }

    public static final <T> boolean T0(@d5.d Collection<? super T> collection, @d5.d Sequence<? extends T> sequence) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("泎"));
        kotlin.jvm.internal.l0.p(sequence, ProtectedSandApp.s("泏"));
        List c32 = kotlin.sequences.v.c3(sequence);
        return c32.isEmpty() ^ true ? collection.retainAll(c32) : W0(collection);
    }

    public static final <T> boolean U0(@d5.d Collection<? super T> collection, @d5.d T[] tArr) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("泐"));
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("泑"));
        return (tArr.length == 0) ^ true ? collection.retainAll(p.t(tArr)) : W0(collection);
    }

    public static final <T> boolean V0(@d5.d List<T> list, @d5.d q3.l<? super T, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("泒"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("泓"));
        return v0(list, lVar, false);
    }

    private static final boolean W0(Collection<?> collection) {
        boolean z5 = !collection.isEmpty();
        collection.clear();
        return z5;
    }

    public static <T> boolean q0(@d5.d Collection<? super T> collection, @d5.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("泔"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("法"));
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z5 = true;
            }
        }
        return z5;
    }

    public static <T> boolean r0(@d5.d Collection<? super T> collection, @d5.d Sequence<? extends T> sequence) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("泖"));
        kotlin.jvm.internal.l0.p(sequence, ProtectedSandApp.s("泗"));
        Iterator<? extends T> it = sequence.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z5 = true;
            }
        }
        return z5;
    }

    public static <T> boolean s0(@d5.d Collection<? super T> collection, @d5.d T[] tArr) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("泘"));
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("泙"));
        return collection.addAll(p.t(tArr));
    }

    @d5.d
    public static <T> Collection<T> t0(@d5.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("泚"));
        return iterable instanceof Collection ? (Collection) iterable : j0.V5(iterable);
    }

    private static final <T> boolean u0(Iterable<? extends T> iterable, q3.l<? super T, Boolean> lVar, boolean z5) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            if (lVar.N(it.next()).booleanValue() == z5) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    private static final <T> boolean v0(List<T> list, q3.l<? super T, Boolean> lVar, boolean z5) {
        if (!(list instanceof RandomAccess)) {
            kotlin.jvm.internal.l0.n(list, ProtectedSandApp.s("泛"));
            return u0(kotlin.jvm.internal.u1.c(list), lVar, z5);
        }
        IntIterator it = new IntRange(0, a0.J(list)).iterator();
        int i5 = 0;
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            T t5 = list.get(nextInt);
            if (lVar.N(t5).booleanValue() != z5) {
                if (i5 != nextInt) {
                    list.set(i5, t5);
                }
                i5++;
            }
        }
        if (i5 >= list.size()) {
            return false;
        }
        int J = a0.J(list);
        if (i5 > J) {
            return true;
        }
        while (true) {
            list.remove(J);
            if (J == i5) {
                return true;
            }
            J--;
        }
    }

    @InlineOnly
    private static final <T> void w0(Collection<? super T> collection, Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("泜"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("泝"));
        H0(collection, iterable);
    }

    @InlineOnly
    private static final <T> void x0(Collection<? super T> collection, T t5) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("泞"));
        collection.remove(t5);
    }

    @InlineOnly
    private static final <T> void y0(Collection<? super T> collection, Sequence<? extends T> sequence) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("泟"));
        kotlin.jvm.internal.l0.p(sequence, ProtectedSandApp.s("泠"));
        J0(collection, sequence);
    }

    @InlineOnly
    private static final <T> void z0(Collection<? super T> collection, T[] tArr) {
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("泡"));
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("波"));
        K0(collection, tArr);
    }
}
