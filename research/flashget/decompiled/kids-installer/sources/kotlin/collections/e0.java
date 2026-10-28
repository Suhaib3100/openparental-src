package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MutableCollectionsJVM.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087\b\u001a!\u0010\u0006\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0087\b\u001a \u0010\t\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\n*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a6\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\r0\fH\u0087\bø\u0001\u0000\u001a5\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u001a\u0010\u000e\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u000fj\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0010H\u0087\b\u001a2\u0010\u0011\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u001a\u0010\u000e\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u000fj\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"fill", "", "T", "", "value", "(Ljava/util/List;Ljava/lang/Object;)V", "shuffle", "random", "Ljava/util/Random;", "sort", "", "comparison", "Lkotlin/Function2;", "", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "sortWith", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes6.dex */
public class e0 extends d0 {
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final <T> void j0(List<T> list, T t5) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("沢"));
        Collections.fill(list, t5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final <T> void k0(List<T> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("沣"));
        Collections.shuffle(list);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final <T> void l0(List<T> list, Random random) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("沤"));
        kotlin.jvm.internal.l0.p(random, ProtectedSandApp.s("沥"));
        Collections.shuffle(list, random);
    }

    public static <T extends Comparable<? super T>> void m0(@d5.d List<T> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("沦"));
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use sortWith(comparator) instead.", replaceWith = @ReplaceWith(expression = "this.sortWith(comparator)", imports = {}))
    @InlineOnly
    private static final <T> void n0(List<T> list, Comparator<? super T> comparator) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("沧"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("沨"));
        throw new NotImplementedError(null, 1, null);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use sortWith(Comparator(comparison)) instead.", replaceWith = @ReplaceWith(expression = "this.sortWith(Comparator(comparison))", imports = {}))
    @InlineOnly
    private static final <T> void o0(List<T> list, q3.p<? super T, ? super T, Integer> pVar) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("沩"));
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("沪"));
        throw new NotImplementedError(null, 1, null);
    }

    public static <T> void p0(@d5.d List<T> list, @d5.d Comparator<? super T> comparator) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("沫"));
        kotlin.jvm.internal.l0.p(comparator, ProtectedSandApp.s("沬"));
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
