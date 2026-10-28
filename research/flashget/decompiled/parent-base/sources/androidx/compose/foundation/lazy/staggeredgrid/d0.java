package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.z0;
import androidx.compose.runtime.i2;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.m4;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyStaggeredGridScrollPosition.kt */
@z0
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*RD\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010+R+\u0010\u000e\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\u001dR+\u0010\u001e\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R+\u0010\u001b\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010-\u001a\u0004\b7\u0010/\"\u0004\b8\u0010\u001dR+\u0010\u001f\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u00106R\u0016\u0010<\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010;R\u0018\u0010?\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010>R\u0017\u0010D\u001a\u00020@8\u0006¢\u0006\f\n\u0004\b.\u0010A\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/d0;", "Landroidx/compose/runtime/m4;", "", "initialIndices", "initialOffsets", "Lkotlin/Function2;", "", "Lkotlin/r0;", "name", "targetIndex", "laneCount", "fillIndices", "<init>", "([I[ILld/p;)V", "indices", "d", "([I)I", "offsets", "e", "([I[I)I", "Lkotlin/k2;", "q", "([I[I)V", "Landroidx/compose/foundation/lazy/staggeredgrid/y;", "measureResult", "r", "(Landroidx/compose/foundation/lazy/staggeredgrid/y;)V", "scrollOffsets", "s", "([I)V", "index", "scrollOffset", "l", "(II)V", "Landroidx/compose/foundation/lazy/layout/s;", "itemProvider", "t", "(Landroidx/compose/foundation/lazy/layout/s;[I)[I", "a", "b", "", "f", "([I[I)Z", "Lld/p;", "<set-?>", "Landroidx/compose/runtime/k2;", "h", "()[I", "n", "c", "Landroidx/compose/runtime/i2;", "g", "()I", "m", "(I)V", "k", "p", "j", "o", "Z", "hadFirstNotEmptyLayout", "", "Ljava/lang/Object;", "lastKnownFirstItemKey", "Landroidx/compose/foundation/lazy/layout/z;", "Landroidx/compose/foundation/lazy/layout/z;", "i", "()Landroidx/compose/foundation/lazy/layout/z;", "nearestRangeState", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nLazyStaggeredGridScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,178:1\n81#2:179\n107#2,2:180\n81#2:185\n107#2,2:186\n75#3:182\n108#3,2:183\n75#3:188\n108#3,2:189\n13600#4,2:191\n116#5,2:193\n33#5,6:195\n118#5:201\n495#6,4:202\n500#6:211\n129#7,5:206\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n*L\n37#1:179\n37#1:180,2\n41#1:185\n41#1:186,2\n39#1:182\n39#1:183,2\n43#1:188\n43#1:189,2\n50#1:191,2\n88#1:193,2\n88#1:195,6\n88#1:201\n96#1:202,4\n96#1:211\n96#1:206,5\n*E\n"})
/* loaded from: classes.dex */
public final class d0 implements m4<int[]> {

    /* renamed from: i, reason: collision with root package name */
    public static final int f6256i = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.p<Integer, Integer, int[]> fillIndices;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 indices;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i2 index;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 scrollOffsets;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i2 scrollOffset;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean hadFirstNotEmptyLayout;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Object lastKnownFirstItemKey;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.lazy.layout.z nearestRangeState;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(@fg.l int[] iArr, @fg.l int[] iArr2, @fg.l ld.p<? super Integer, ? super Integer, int[]> pVar) {
        this.fillIndices = pVar;
        this.indices = androidx.compose.runtime.b.e(iArr, this);
        this.index = androidx.compose.runtime.b.c(d(iArr));
        this.scrollOffsets = androidx.compose.runtime.b.e(iArr2, this);
        this.scrollOffset = androidx.compose.runtime.b.c(e(iArr, iArr2));
        Integer mn = kotlin.collections.l.mn(iArr);
        this.nearestRangeState = new androidx.compose.foundation.lazy.layout.z(mn != null ? mn.intValue() : 0, 90, 200);
    }

    private final int d(int[] indices) {
        int i4 = Integer.MAX_VALUE;
        for (int i5 : indices) {
            if (i5 <= 0) {
                return 0;
            }
            if (i4 > i5) {
                i4 = i5;
            }
        }
        if (i4 == Integer.MAX_VALUE) {
            return 0;
        }
        return i4;
    }

    private final int e(int[] indices, int[] offsets) {
        int d5 = d(indices);
        int length = offsets.length;
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < length; i5++) {
            if (indices[i5] == d5) {
                i4 = Math.min(i4, offsets[i5]);
            }
        }
        if (i4 == Integer.MAX_VALUE) {
            return 0;
        }
        return i4;
    }

    private final void m(int i4) {
        this.index.k(i4);
    }

    private final void n(int[] iArr) {
        this.indices.setValue(iArr);
    }

    private final void o(int i4) {
        this.scrollOffset.k(i4);
    }

    private final void p(int[] iArr) {
        this.scrollOffsets.setValue(iArr);
    }

    private final void q(int[] indices, int[] offsets) {
        n(indices);
        m(d(indices));
        p(offsets);
        o(e(indices, offsets));
    }

    @Override // androidx.compose.runtime.m4
    public boolean c(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    public boolean f(@fg.l int[] a5, @fg.l int[] b5) {
        return Arrays.equals(a5, b5);
    }

    public final int g() {
        return this.index.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public final int[] h() {
        return (int[]) this.indices.getValue();
    }

    @fg.l
    /* renamed from: i, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.z getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int j() {
        return this.scrollOffset.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public final int[] k() {
        return (int[]) this.scrollOffsets.getValue();
    }

    public final void l(int index, int scrollOffset) {
        int[] invoke = this.fillIndices.invoke(Integer.valueOf(index), Integer.valueOf(h().length));
        int length = invoke.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr[i4] = scrollOffset;
        }
        q(invoke, iArr);
        this.nearestRangeState.l(index);
        this.lastKnownFirstItemKey = null;
    }

    public final void r(@fg.l y measureResult) {
        a0 a0Var;
        int d5 = d(measureResult.getFirstVisibleItemIndices());
        List<a0> j4 = measureResult.j();
        int size = j4.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                a0Var = null;
                break;
            }
            a0Var = j4.get(i4);
            if (a0Var.getIndex() == d5) {
                break;
            } else {
                i4++;
            }
        }
        a0 a0Var2 = a0Var;
        this.lastKnownFirstItemKey = a0Var2 != null ? a0Var2.getKey() : null;
        this.nearestRangeState.l(d5);
        if (this.hadFirstNotEmptyLayout || measureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            androidx.compose.runtime.snapshots.m c5 = androidx.compose.runtime.snapshots.m.INSTANCE.c();
            try {
                androidx.compose.runtime.snapshots.m r4 = c5.r();
                try {
                    q(measureResult.getFirstVisibleItemIndices(), measureResult.getFirstVisibleItemScrollOffsets());
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                } finally {
                    c5.y(r4);
                }
            } finally {
                c5.d();
            }
        }
    }

    public final void s(@fg.l int[] scrollOffsets) {
        p(scrollOffsets);
        o(e(h(), scrollOffsets));
    }

    @fg.l
    @z0
    public final int[] t(@fg.l androidx.compose.foundation.lazy.layout.s itemProvider, @fg.l int[] indices) {
        Object obj = this.lastKnownFirstItemKey;
        Integer Ne = kotlin.collections.l.Ne(indices, 0);
        int a5 = androidx.compose.foundation.lazy.layout.t.a(itemProvider, obj, Ne != null ? Ne.intValue() : 0);
        if (kotlin.collections.l.q8(indices, a5)) {
            return indices;
        }
        this.nearestRangeState.l(a5);
        int[] invoke = this.fillIndices.invoke(Integer.valueOf(a5), Integer.valueOf(indices.length));
        n(invoke);
        m(d(invoke));
        return invoke;
    }
}
