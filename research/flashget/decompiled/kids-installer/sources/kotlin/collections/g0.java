package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReversedViews.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007¢\u0006\u0002\b\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\b\u001a\u001d\u0010\t\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\n\u001a\u001d\u0010\u000b\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"asReversed", "", "T", "", "asReversedMutable", "reverseElementIndex", "", "index", "reverseElementIndex$CollectionsKt__ReversedViewsKt", "reverseIteratorIndex", "reverseIteratorIndex$CollectionsKt__ReversedViewsKt", "reversePositionIndex", "reversePositionIndex$CollectionsKt__ReversedViewsKt", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes6.dex */
public class g0 extends f0 {
    public static final int Y0(List list, int i5) {
        return a0.J(list) - i5;
    }

    @d5.d
    public static final <T> List<T> a1(@d5.d List<? extends T> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("泣"));
        return new ReversedListReadOnly(list);
    }

    @p3.i(name = "asReversedMutable")
    @d5.d
    public static <T> List<T> b1(@d5.d List<T> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("泤"));
        return new ReversedList(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c1(List<?> list, int i5) {
        if (new IntRange(0, a0.J(list)).v(i5)) {
            return a0.J(list) - i5;
        }
        StringBuilder a6 = androidx.core.app.x.a(ProtectedSandApp.s("泥"), i5, ProtectedSandApp.s("泦"));
        a6.append(new IntRange(0, a0.J(list)));
        a6.append(ProtectedSandApp.s("泧"));
        throw new IndexOutOfBoundsException(a6.toString());
    }

    private static final int d1(List<?> list, int i5) {
        return a0.J(list) - i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e1(List<?> list, int i5) {
        if (new IntRange(0, list.size()).v(i5)) {
            return list.size() - i5;
        }
        StringBuilder a6 = androidx.core.app.x.a(ProtectedSandApp.s("注"), i5, ProtectedSandApp.s("泩"));
        a6.append(new IntRange(0, list.size()));
        a6.append(ProtectedSandApp.s("泪"));
        throw new IndexOutOfBoundsException(a6.toString());
    }
}
