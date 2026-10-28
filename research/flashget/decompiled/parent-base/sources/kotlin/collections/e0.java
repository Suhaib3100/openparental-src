package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReversedViews.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0002\u001a\u001f\u0010\u0003\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001f\u0010\u0006\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0004\u001a#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\nH\u0007¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"", "", "index", "c1", "(Ljava/util/List;I)I", "e1", "d1", "T", "a1", "(Ljava/util/List;)Ljava/util/List;", "", "b1", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes7.dex */
public class e0 extends d0 {
    public static final int Y0(List list, int i4) {
        return y.J(list) - i4;
    }

    @fg.l
    public static <T> List<T> a1(@fg.l List<? extends T> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("愸\u0001"));
        return new j1(list);
    }

    @fg.l
    @kd.i(name = "asReversedMutable")
    public static <T> List<T> b1(@fg.l List<T> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("愸\u0001"));
        return new i1(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c1(List<?> list, int i4) {
        if (new kotlin.ranges.l(0, y.J(list), 1).r(i4)) {
            return y.J(list) - i4;
        }
        StringBuilder a5 = androidx.collection.s.a(ProtectedSandApp.s("愹\u0001"), i4, ProtectedSandApp.s("愺\u0001"));
        a5.append(new kotlin.ranges.l(0, y.J(list), 1));
        a5.append(ProtectedSandApp.s("愻\u0001"));
        throw new IndexOutOfBoundsException(a5.toString());
    }

    private static final int d1(List<?> list, int i4) {
        return y.J(list) - i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e1(List<?> list, int i4) {
        if (new kotlin.ranges.l(0, list.size(), 1).r(i4)) {
            return list.size() - i4;
        }
        StringBuilder a5 = androidx.collection.s.a(ProtectedSandApp.s("愼\u0001"), i4, ProtectedSandApp.s("愺\u0001"));
        a5.append(new kotlin.ranges.l(0, list.size(), 1));
        a5.append(ProtectedSandApp.s("愻\u0001"));
        throw new IndexOutOfBoundsException(a5.toString());
    }
}
