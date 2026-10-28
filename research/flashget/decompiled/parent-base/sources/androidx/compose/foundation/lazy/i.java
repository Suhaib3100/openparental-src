package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyListHeaders.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0007\u001aM\u0010\u000b\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "Landroidx/compose/foundation/lazy/v;", "composedVisibleItems", "Landroidx/compose/foundation/lazy/x;", "itemProvider", "", "", "headerIndexes", "beforeContentPadding", "layoutWidth", "layoutHeight", "a", "(Ljava/util/List;Landroidx/compose/foundation/lazy/x;Ljava/util/List;III)Landroidx/compose/foundation/lazy/v;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyListHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,95:1\n1#2:96\n69#3,6:97\n*S KotlinDebug\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n*L\n57#1:97,6\n*E\n"})
/* loaded from: classes.dex */
public final class i {
    @fg.m
    public static final v a(@fg.l List<v> list, @fg.l x xVar, @fg.l List<Integer> list2, int i4, int i5, int i6) {
        int index = ((v) kotlin.collections.w.B2(list)).getIndex();
        int size = list2.size();
        int i7 = -1;
        int i10 = -1;
        int i11 = 0;
        while (i11 < size && list2.get(i11).intValue() <= index) {
            i7 = list2.get(i11).intValue();
            i11++;
            i10 = ((i11 < 0 || i11 > kotlin.collections.w.J(list2)) ? -1 : list2.get(i11)).intValue();
        }
        int size2 = list.size();
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = -1;
        for (int i15 = 0; i15 < size2; i15++) {
            v vVar = list.get(i15);
            if (vVar.getIndex() == i7) {
                i12 = vVar.getOffset();
                i14 = i15;
            } else if (vVar.getIndex() == i10) {
                i13 = vVar.getOffset();
            }
        }
        if (i7 == -1) {
            return null;
        }
        v b5 = xVar.b(i7);
        b5.n(true);
        int max = i12 != Integer.MIN_VALUE ? Math.max(-i4, i12) : -i4;
        if (i13 != Integer.MIN_VALUE) {
            max = Math.min(max, i13 - b5.getSize());
        }
        b5.m(max, i5, i6);
        if (i14 != -1) {
            list.set(i14, b5);
        } else {
            list.add(0, b5);
        }
        return b5;
    }
}
