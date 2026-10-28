package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.collections.builders.ListBuilder;

@Metadata(d1 = {"kotlin/collections/CollectionsKt__CollectionsJVMKt", "kotlin/collections/CollectionsKt__CollectionsKt", "kotlin/collections/CollectionsKt__IterablesKt", "kotlin/collections/CollectionsKt__IteratorsJVMKt", "kotlin/collections/CollectionsKt__IteratorsKt", "kotlin/collections/CollectionsKt__MutableCollectionsJVMKt", "kotlin/collections/CollectionsKt__MutableCollectionsKt", "kotlin/collections/CollectionsKt__ReversedViewsKt", "kotlin/collections/CollectionsKt___CollectionsJvmKt", "kotlin/collections/CollectionsKt___CollectionsKt"}, k = 4, mv = {1, 9, 0}, xi = 49)
/* loaded from: classes6.dex */
public final class y extends j0 {
    private y() {
    }

    @d5.d
    public static List H() {
        return EmptyList.f23167o;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @d5.d
    public static List i() {
        return new ListBuilder();
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @d5.d
    public static List j(int i5) {
        return new ListBuilder(i5);
    }

    public static /* bridge */ /* synthetic */ Appendable k3(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i5, CharSequence charSequence4, q3.l lVar, int i6, Object obj) {
        Appendable j32;
        j32 = j0.j3(iterable, appendable, (r14 & 2) != 0 ? ProtectedSandApp.s("湫") : charSequence, (r14 & 4) != 0 ? "" : charSequence2, (r14 & 8) == 0 ? charSequence3 : "", (r14 & 16) != 0 ? -1 : i5, (r14 & 32) != 0 ? ProtectedSandApp.s("湬") : charSequence4, (r14 & 64) != 0 ? null : lVar);
        return j32;
    }
}
