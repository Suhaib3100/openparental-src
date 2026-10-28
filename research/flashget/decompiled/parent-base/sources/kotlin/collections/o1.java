package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Sets.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a6\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a4\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0086\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a4\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0087\b¢\u0006\u0004\b\u000f\u0010\u0004\u001a.\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0004\u001a6\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\b\u001a4\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u000b\u001a4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u000e\u001a.\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0004¨\u0006\u0015"}, d2 = {"T", "", "element", "y", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "", "elements", "A", "(Ljava/util/Set;[Ljava/lang/Object;)Ljava/util/Set;", "", "x", "(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;", "Lkotlin/sequences/m;", "z", "(Ljava/util/Set;Lkotlin/sequences/m;)Ljava/util/Set;", "B", "D", "F", "C", "E", "G", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
@kotlin.jvm.internal.r1({"SMAP\n_Sets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n857#2,2:140\n847#2,2:142\n1#3:144\n*S KotlinDebug\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n*L\n28#1:140,2\n52#1:142,2\n*E\n"})
/* loaded from: classes7.dex */
public class o1 extends n1 {
    @fg.l
    public static final <T> Set<T> A(@fg.l Set<? extends T> set, @fg.l T[] tArr) {
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("憬\u0001"));
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("憭\u0001"));
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        d0.K0(linkedHashSet, tArr);
        return linkedHashSet;
    }

    @kotlin.internal.f
    private static final <T> Set<T> B(Set<? extends T> set, T t4) {
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("憬\u0001"));
        return y(set, t4);
    }

    @fg.l
    public static <T> Set<T> C(@fg.l Set<? extends T> set, @fg.l Iterable<? extends T> iterable) {
        int size;
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("憬\u0001"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("憭\u0001"));
        Integer c02 = z.c0(iterable);
        if (c02 != null) {
            size = set.size() + c02.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(b1.j(size));
        linkedHashSet.addAll(set);
        d0.q0(linkedHashSet, iterable);
        return linkedHashSet;
    }

    @fg.l
    public static <T> Set<T> D(@fg.l Set<? extends T> set, T t4) {
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("憬\u0001"));
        LinkedHashSet linkedHashSet = new LinkedHashSet(b1.j(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t4);
        return linkedHashSet;
    }

    @fg.l
    public static final <T> Set<T> E(@fg.l Set<? extends T> set, @fg.l kotlin.sequences.m<? extends T> mVar) {
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("憬\u0001"));
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("憭\u0001"));
        LinkedHashSet linkedHashSet = new LinkedHashSet(b1.j(set.size() * 2));
        linkedHashSet.addAll(set);
        d0.r0(linkedHashSet, mVar);
        return linkedHashSet;
    }

    @fg.l
    public static final <T> Set<T> F(@fg.l Set<? extends T> set, @fg.l T[] tArr) {
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("憬\u0001"));
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("憭\u0001"));
        LinkedHashSet linkedHashSet = new LinkedHashSet(b1.j(set.size() + tArr.length));
        linkedHashSet.addAll(set);
        d0.s0(linkedHashSet, tArr);
        return linkedHashSet;
    }

    @kotlin.internal.f
    private static final <T> Set<T> G(Set<? extends T> set, T t4) {
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("憬\u0001"));
        return D(set, t4);
    }

    @fg.l
    public static <T> Set<T> x(@fg.l Set<? extends T> set, @fg.l Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("憬\u0001"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("憭\u0001"));
        Collection<?> t02 = d0.t0(iterable);
        if (t02.isEmpty()) {
            return g0.a6(set);
        }
        if (!(t02 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(t02);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (T t4 : set) {
            if (!t02.contains(t4)) {
                linkedHashSet2.add(t4);
            }
        }
        return linkedHashSet2;
    }

    @fg.l
    public static <T> Set<T> y(@fg.l Set<? extends T> set, T t4) {
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("憬\u0001"));
        LinkedHashSet linkedHashSet = new LinkedHashSet(b1.j(set.size()));
        boolean z4 = false;
        for (T t5 : set) {
            boolean z5 = true;
            if (!z4 && kotlin.jvm.internal.l0.g(t5, t4)) {
                z4 = true;
                z5 = false;
            }
            if (z5) {
                linkedHashSet.add(t5);
            }
        }
        return linkedHashSet;
    }

    @fg.l
    public static final <T> Set<T> z(@fg.l Set<? extends T> set, @fg.l kotlin.sequences.m<? extends T> mVar) {
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("憬\u0001"));
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("憭\u0001"));
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        d0.J0(linkedHashSet, mVar);
        return linkedHashSet;
    }
}
