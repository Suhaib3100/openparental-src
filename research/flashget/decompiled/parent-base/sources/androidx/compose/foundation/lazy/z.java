package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.a2;
import androidx.compose.foundation.z0;
import androidx.compose.runtime.i2;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyListScrollPosition.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R+\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u0010R+\u0010\b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u0010R\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0017\u0010&\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b\u001b\u0010%¨\u0006'"}, d2 = {"Landroidx/compose/foundation/lazy/z;", "", "", "initialIndex", "initialScrollOffset", "<init>", "(II)V", "index", "scrollOffset", "Lkotlin/k2;", "g", "Landroidx/compose/foundation/lazy/u;", "measureResult", "h", "(Landroidx/compose/foundation/lazy/u;)V", "i", "(I)V", "d", "Landroidx/compose/foundation/lazy/o;", "itemProvider", "j", "(Landroidx/compose/foundation/lazy/o;I)I", "<set-?>", "a", "Landroidx/compose/runtime/i2;", "()I", "e", "b", "c", "f", "", "Z", "hadFirstNotEmptyLayout", "Ljava/lang/Object;", "lastKnownFirstItemKey", "Landroidx/compose/foundation/lazy/layout/z;", "Landroidx/compose/foundation/lazy/layout/z;", "()Landroidx/compose/foundation/lazy/layout/z;", "nearestRangeState", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyListScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListScrollPosition.kt\nandroidx/compose/foundation/lazy/LazyListScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n75#2:129\n108#2,2:130\n75#2:132\n108#2,2:133\n1#3:135\n*S KotlinDebug\n*F\n+ 1 LazyListScrollPosition.kt\nandroidx/compose/foundation/lazy/LazyListScrollPosition\n*L\n34#1:129\n34#1:130,2\n36#1:132\n36#1:133,2\n*E\n"})
/* loaded from: classes.dex */
public final class z {

    /* renamed from: f, reason: collision with root package name */
    public static final int f6578f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i2 index;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i2 scrollOffset;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean hadFirstNotEmptyLayout;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Object lastKnownFirstItemKey;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.z nearestRangeState;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.z.<init>():void");
    }

    private final void f(int i4) {
        this.scrollOffset.k(i4);
    }

    private final void g(int index, int scrollOffset) {
        if (index < 0.0f) {
            throw new IllegalArgumentException(a2.a("Index should be non-negative (", index, ')').toString());
        }
        e(index);
        this.nearestRangeState.l(index);
        f(scrollOffset);
    }

    public final int a() {
        return this.index.f();
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.z getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int c() {
        return this.scrollOffset.f();
    }

    public final void d(int index, int scrollOffset) {
        g(index, scrollOffset);
        this.lastKnownFirstItemKey = null;
    }

    public final void e(int i4) {
        this.index.k(i4);
    }

    public final void h(@fg.l u measureResult) {
        v firstVisibleItem = measureResult.getFirstVisibleItem();
        this.lastKnownFirstItemKey = firstVisibleItem != null ? firstVisibleItem.getKey() : null;
        if (this.hadFirstNotEmptyLayout || measureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            int firstVisibleItemScrollOffset = measureResult.getFirstVisibleItemScrollOffset();
            if (firstVisibleItemScrollOffset < 0.0f) {
                throw new IllegalStateException(a2.a("scrollOffset should be non-negative (", firstVisibleItemScrollOffset, ')').toString());
            }
            v firstVisibleItem2 = measureResult.getFirstVisibleItem();
            g(firstVisibleItem2 != null ? firstVisibleItem2.getIndex() : 0, firstVisibleItemScrollOffset);
        }
    }

    public final void i(int scrollOffset) {
        if (scrollOffset < 0.0f) {
            throw new IllegalStateException(a2.a("scrollOffset should be non-negative (", scrollOffset, ')').toString());
        }
        f(scrollOffset);
    }

    @z0
    public final int j(@fg.l o itemProvider, int index) {
        int a5 = androidx.compose.foundation.lazy.layout.t.a(itemProvider, this.lastKnownFirstItemKey, index);
        if (index != a5) {
            e(a5);
            this.nearestRangeState.l(index);
        }
        return a5;
    }

    public z(int i4, int i5) {
        this.index = androidx.compose.runtime.b.c(i4);
        this.scrollOffset = androidx.compose.runtime.b.c(i5);
        this.nearestRangeState = new androidx.compose.foundation.lazy.layout.z(i4, 30, 100);
    }

    public /* synthetic */ z(int i4, int i5, int i6, kotlin.jvm.internal.w wVar) {
        this((i6 & 1) != 0 ? 0 : i4, (i6 & 2) != 0 ? 0 : i5);
    }
}
