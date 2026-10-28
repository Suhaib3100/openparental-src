package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.c0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyLayoutBeyondBoundsState.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/layout/s;", "Landroidx/compose/foundation/lazy/layout/c0;", "pinnedItemList", "Landroidx/compose/foundation/lazy/layout/k;", "beyondBoundsInfo", "", "", "a", "(Landroidx/compose/foundation/lazy/layout/s;Landroidx/compose/foundation/lazy/layout/c0;Landroidx/compose/foundation/lazy/layout/k;)Ljava/util/List;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyLayoutBeyondBoundsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsStateKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,62:1\n33#2,6:63\n*S KotlinDebug\n*F\n+ 1 LazyLayoutBeyondBoundsState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsStateKt\n*L\n50#1:63,6\n*E\n"})
/* loaded from: classes.dex */
public final class o {
    @fg.l
    public static final List<Integer> a(@fg.l s sVar, @fg.l c0 c0Var, @fg.l k kVar) {
        kotlin.ranges.l lVar;
        if (!kVar.d() && c0Var.isEmpty()) {
            return kotlin.collections.j0.f74919b;
        }
        ArrayList arrayList = new ArrayList();
        if (kVar.d()) {
            lVar = new kotlin.ranges.l(kVar.c(), Math.min(kVar.b(), sVar.b() - 1), 1);
        } else {
            kotlin.ranges.l.INSTANCE.getClass();
            lVar = kotlin.ranges.l.f75481g;
        }
        int size = c0Var.size();
        for (int i4 = 0; i4 < size; i4++) {
            c0.a aVar = c0Var.get(i4);
            int a5 = t.a(sVar, aVar.getKey(), aVar.getIndex());
            int first = lVar.getFirst();
            if ((a5 > lVar.getLast() || first > a5) && a5 >= 0 && a5 < sVar.b()) {
                arrayList.add(Integer.valueOf(a5));
            }
        }
        int first2 = lVar.getFirst();
        int last = lVar.getLast();
        if (first2 <= last) {
            while (true) {
                arrayList.add(Integer.valueOf(first2));
                if (first2 == last) {
                    break;
                }
                first2++;
            }
        }
        return arrayList;
    }
}
