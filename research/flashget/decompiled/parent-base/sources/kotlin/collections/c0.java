package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MutableCollectionsJVM.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0002j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0003H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a=\u0010\u000b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u000e\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\r*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a9\u0010\u0010\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0002j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0003¢\u0006\u0004\b\u0010\u0010\u0007\u001a(\u0010\u0012\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a \u0010\u0014\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087\b¢\u0006\u0004\b\u0014\u0010\u000f\u001a(\u0010\u0017\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0016\u001a\u00020\u0015H\u0087\b¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"T", "", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "Lkotlin/k2;", "n0", "(Ljava/util/List;Ljava/util/Comparator;)V", "Lkotlin/Function2;", "", "comparison", "o0", "(Ljava/util/List;Lld/p;)V", "", "m0", "(Ljava/util/List;)V", "p0", "value", "j0", "(Ljava/util/List;Ljava/lang/Object;)V", "k0", "Ljava/util/Random;", "random", "l0", "(Ljava/util/List;Ljava/util/Random;)V", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes7.dex */
public class c0 extends b0 {
    @kotlin.c1(version = "1.2")
    @kotlin.internal.f
    private static final <T> void j0(List<T> list, T t4) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("愕\u0001"));
        Collections.fill(list, t4);
    }

    @kotlin.c1(version = "1.2")
    @kotlin.internal.f
    private static final <T> void k0(List<T> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("愕\u0001"));
        Collections.shuffle(list);
    }

    @kotlin.c1(version = "1.2")
    @kotlin.internal.f
    private static final <T> void l0(List<T> list, Random random) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("愕\u0001"));
        kotlin.jvm.internal.l0.p(random, ProtectedSandApp.s("愖\u0001"));
        Collections.shuffle(list, random);
    }

    public static <T extends Comparable<? super T>> void m0(@fg.l List<T> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("愕\u0001"));
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Use sortWith(comparator) instead.", replaceWith = @kotlin.x0(expression = "this.sortWith(comparator)", imports = {}))
    @kotlin.internal.f
    private static final <T> void n0(List<T> list, Comparator<? super T> comparator) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("愕\u0001"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("愗\u0001"));
        throw new kotlin.g0(null, 1, null);
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Use sortWith(Comparator(comparison)) instead.", replaceWith = @kotlin.x0(expression = "this.sortWith(Comparator(comparison))", imports = {}))
    @kotlin.internal.f
    private static final <T> void o0(List<T> list, ld.p<? super T, ? super T, Integer> pVar) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("愕\u0001"));
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("愘\u0001"));
        throw new kotlin.g0(null, 1, null);
    }

    public static <T> void p0(@fg.l List<T> list, @fg.l Comparator<? super T> comparator) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("愕\u0001"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("愗\u0001"));
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
