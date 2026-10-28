package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.b5;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.o4;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyLayoutNearestRangeState.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR+\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\r¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/layout/z;", "Landroidx/compose/runtime/b5;", "Lkotlin/ranges/l;", "", "firstVisibleItem", "slidingWindowSize", "extraItemCount", "<init>", "(III)V", "Lkotlin/k2;", "l", "(I)V", "b", "I", "c", "<set-?>", "d", "Landroidx/compose/runtime/k2;", "a", "()Lkotlin/ranges/l;", "i", "(Lkotlin/ranges/l;)V", "value", "e", "lastFirstVisibleItem", "f", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 1)
@r1({"SMAP\nLazyLayoutNearestRangeState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutNearestRangeState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,65:1\n81#2:66\n107#2,2:67\n*S KotlinDebug\n*F\n+ 1 LazyLayoutNearestRangeState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState\n*L\n31#1:66\n31#1:67,2\n*E\n"})
/* loaded from: classes.dex */
public final class z implements b5<kotlin.ranges.l> {

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final a f6164f = new a();

    /* renamed from: g, reason: collision with root package name */
    public static final int f6165g = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int slidingWindowSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int extraItemCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 value;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int lastFirstVisibleItem;

    /* compiled from: LazyLayoutNearestRangeState.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/z$a;", "", "<init>", "()V", "", "firstVisibleItem", "slidingWindowSize", "extraItemCount", "Lkotlin/ranges/l;", "b", "(III)Lkotlin/ranges/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final kotlin.ranges.l b(int firstVisibleItem, int slidingWindowSize, int extraItemCount) {
            int i4 = (firstVisibleItem / slidingWindowSize) * slidingWindowSize;
            return kotlin.ranges.s.W1(Math.max(i4 - extraItemCount, 0), i4 + slidingWindowSize + extraItemCount);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public z(int i4, int i5, int i6) {
        this.slidingWindowSize = i5;
        this.extraItemCount = i6;
        this.value = androidx.compose.runtime.b.e(f6164f.b(i4, i5, i6), o4.x());
        this.lastFirstVisibleItem = i4;
    }

    private void i(kotlin.ranges.l lVar) {
        this.value.setValue(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.b5
    @fg.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public kotlin.ranges.l getValue() {
        return (kotlin.ranges.l) this.value.getValue();
    }

    public final void l(int firstVisibleItem) {
        if (firstVisibleItem != this.lastFirstVisibleItem) {
            this.lastFirstVisibleItem = firstVisibleItem;
            i(f6164f.b(firstVisibleItem, this.slidingWindowSize, this.extraItemCount));
        }
    }
}
