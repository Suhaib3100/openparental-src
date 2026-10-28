package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Sets.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0086\u0002¢\u0006\u0002\u0010\u0004\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0006H\u0086\u0002¢\u0006\u0002\u0010\u0007\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0086\u0002\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0086\u0002\u001a,\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0004\u001a,\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0086\u0002¢\u0006\u0002\u0010\u0004\u001a4\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0006H\u0086\u0002¢\u0006\u0002\u0010\u0007\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0086\u0002\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0086\u0002\u001a,\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0004¨\u0006\r"}, d2 = {"minus", "", "T", "element", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "elements", "", "(Ljava/util/Set;[Ljava/lang/Object;)Ljava/util/Set;", "", "Lkotlin/sequences/Sequence;", "minusElement", "plus", "plusElement", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
@SourceDebugExtension({"SMAP\n_Sets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n857#2,2:140\n847#2,2:142\n1#3:144\n*S KotlinDebug\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n*L\n28#1:140,2\n52#1:142,2\n*E\n"})
/* loaded from: classes6.dex */
public class r1 extends q1 {
    @d5.d
    public static final <T> Set<T> A(@d5.d Set<? extends T> set, @d5.d T[] tArr) {
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("綍"));
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("綎"));
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        f0.K0(linkedHashSet, tArr);
        return linkedHashSet;
    }

    @InlineOnly
    private static final <T> Set<T> B(Set<? extends T> set, T t5) {
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("綏"));
        return y(set, t5);
    }

    @d5.d
    public static <T> Set<T> C(@d5.d Set<? extends T> set, @d5.d Iterable<? extends T> iterable) {
        int size;
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("綐"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("綑"));
        Integer c02 = b0.c0(iterable);
        if (c02 != null) {
            size = set.size() + c02.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(e1.j(size));
        linkedHashSet.addAll(set);
        f0.q0(linkedHashSet, iterable);
        return linkedHashSet;
    }

    @d5.d
    public static <T> Set<T> D(@d5.d Set<? extends T> set, T t5) {
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("綒"));
        LinkedHashSet linkedHashSet = new LinkedHashSet(e1.j(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t5);
        return linkedHashSet;
    }

    @d5.d
    public static final <T> Set<T> E(@d5.d Set<? extends T> set, @d5.d Sequence<? extends T> sequence) {
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("經"));
        kotlin.jvm.internal.l0.p(sequence, ProtectedSandApp.s("綔"));
        LinkedHashSet linkedHashSet = new LinkedHashSet(e1.j(set.size() * 2));
        linkedHashSet.addAll(set);
        f0.r0(linkedHashSet, sequence);
        return linkedHashSet;
    }

    @d5.d
    public static final <T> Set<T> F(@d5.d Set<? extends T> set, @d5.d T[] tArr) {
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("綕"));
        kotlin.jvm.internal.l0.p(tArr, ProtectedSandApp.s("綖"));
        LinkedHashSet linkedHashSet = new LinkedHashSet(e1.j(set.size() + tArr.length));
        linkedHashSet.addAll(set);
        f0.s0(linkedHashSet, tArr);
        return linkedHashSet;
    }

    @InlineOnly
    private static final <T> Set<T> G(Set<? extends T> set, T t5) {
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("綗"));
        return D(set, t5);
    }

    @d5.d
    public static <T> Set<T> x(@d5.d Set<? extends T> set, @d5.d Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("綘"));
        kotlin.jvm.internal.l0.p(iterable, ProtectedSandApp.s("継"));
        Collection<?> t02 = f0.t0(iterable);
        if (t02.isEmpty()) {
            return j0.a6(set);
        }
        if (!(t02 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(t02);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (T t5 : set) {
            if (!t02.contains(t5)) {
                linkedHashSet2.add(t5);
            }
        }
        return linkedHashSet2;
    }

    @d5.d
    public static <T> Set<T> y(@d5.d Set<? extends T> set, T t5) {
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("続"));
        LinkedHashSet linkedHashSet = new LinkedHashSet(e1.j(set.size()));
        boolean z5 = false;
        for (T t6 : set) {
            boolean z6 = true;
            if (!z5 && kotlin.jvm.internal.l0.g(t6, t5)) {
                z5 = true;
                z6 = false;
            }
            if (z6) {
                linkedHashSet.add(t6);
            }
        }
        return linkedHashSet;
    }

    @d5.d
    public static final <T> Set<T> z(@d5.d Set<? extends T> set, @d5.d Sequence<? extends T> sequence) {
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("綛"));
        kotlin.jvm.internal.l0.p(sequence, ProtectedSandApp.s("綜"));
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        f0.J0(linkedHashSet, sequence);
        return linkedHashSet;
    }
}
