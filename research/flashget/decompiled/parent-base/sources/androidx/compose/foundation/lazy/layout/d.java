package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.foundation.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: IntervalList.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a-\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Landroidx/compose/runtime/collection/g;", "Landroidx/compose/foundation/lazy/layout/c$a;", "", "itemIndex", "b", "(Landroidx/compose/runtime/collection/g;I)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,222:1\n48#2:223\n523#2:224\n523#2:225\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n*L\n198#1:223\n203#1:224\n212#1:225\n*E\n"})
/* loaded from: classes.dex */
public final class d {
    /* JADX INFO: Access modifiers changed from: private */
    @z0
    public static final <T> int b(androidx.compose.runtime.collection.g<c.a<T>> gVar, int i4) {
        int size = gVar.getSize() - 1;
        int i5 = 0;
        while (i5 < size) {
            int a5 = androidx.appcompat.widget.a.a(size, i5, 2, i5);
            int startIndex = gVar.L()[a5].getStartIndex();
            if (startIndex == i4) {
                return a5;
            }
            if (startIndex < i4) {
                i5 = a5 + 1;
                if (i4 < gVar.L()[i5].getStartIndex()) {
                    return a5;
                }
            } else {
                size = a5 - 1;
            }
        }
        return i5;
    }
}
