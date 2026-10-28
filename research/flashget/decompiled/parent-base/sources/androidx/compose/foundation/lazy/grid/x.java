package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.layout.i1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: LazyGridMeasuredItem.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001b\u001a\u00020\u0012*\u00020\u00122\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0019H\u0082\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJA\u0010&\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0002¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020%2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u00106\u001a\u0004\b7\u00108R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b:\u00102R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00106R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00100R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00100R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bA\u0010BR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u00103\u001a\u0004\bC\u00105R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0017\u0010F\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b=\u00102R\u0017\u0010G\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u00100\u001a\u0004\b?\u00102R\u0016\u0010H\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00100R\u0016\u0010J\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00100R\u0016\u0010L\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u00100R \u0010Q\u001a\u00020M8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bN\u0010B\u001a\u0004\bO\u0010PR*\u0010U\u001a\u00020\u00122\u0006\u0010R\u001a\u00020\u00128\u0016@RX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bS\u0010B\u001a\u0004\bT\u0010PR$\u0010#\u001a\u00020\u00022\u0006\u0010R\u001a\u00020\u00028\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bV\u00100\u001a\u0004\b/\u00102R$\u0010$\u001a\u00020\u00022\u0006\u0010R\u001a\u00020\u00028\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bW\u00100\u001a\u0004\bX\u00102R\"\u0010[\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u00106\u001a\u0004\bA\u00108\"\u0004\bK\u0010ZR\u0018\u0010]\u001a\u00020\u0002*\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\\R\u0018\u0010F\u001a\u00020\u0002*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010^R\u0011\u0010_\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bD\u00102R\u0011\u0010 \u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b9\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006`"}, d2 = {"Landroidx/compose/foundation/lazy/grid/x;", "Landroidx/compose/foundation/lazy/grid/k;", "", "index", "", "key", "", "isVertical", "crossAxisSize", "mainAxisSpacing", "reverseLayout", "Landroidx/compose/ui/unit/w;", "layoutDirection", "beforeContentPadding", "afterContentPadding", "", "Landroidx/compose/ui/layout/i1;", "placeables", "Landroidx/compose/ui/unit/q;", "visualOffset", "contentType", "Landroidx/compose/foundation/lazy/grid/l;", "animator", "<init>", "(ILjava/lang/Object;ZIIZLandroidx/compose/ui/unit/w;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/grid/l;Lkotlin/jvm/internal/w;)V", "Lkotlin/Function1;", "mainAxisMap", "f", "(JLld/l;)J", "n", "(I)Ljava/lang/Object;", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "row", "column", "Lkotlin/k2;", "r", "(IIIIII)V", "delta", "e", "(I)V", "Landroidx/compose/ui/layout/i1$a;", "scope", "q", "(Landroidx/compose/ui/layout/i1$a;)V", "d", "I", "getIndex", "()I", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "Z", "p", "()Z", "g", "h", "i", "Landroidx/compose/ui/unit/w;", "j", "k", "l", "Ljava/util/List;", "m", "J", "getContentType", "o", "Landroidx/compose/foundation/lazy/grid/l;", "mainAxisSize", "mainAxisSizeWithSpacings", "mainAxisLayoutSize", "s", "minMainAxisOffset", "t", "maxMainAxisOffset", "Landroidx/compose/ui/unit/u;", "u", "c", "()J", "size", "<set-?>", "v", "b", "offset", "w", "x", "a", "y", "(Z)V", "nonScrollableItem", "(J)I", "mainAxis", "(Landroidx/compose/ui/layout/i1;)I", "placeablesCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyGridMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,187:1\n183#1:194\n183#1:195\n183#1:198\n33#2,6:188\n1#3:196\n86#4:197\n86#4:199\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n*L\n136#1:194\n140#1:195\n167#1:198\n72#1:188,6\n157#1:197\n171#1:199\n*E\n"})
/* loaded from: classes.dex */
public final class x implements k {

    /* renamed from: z, reason: collision with root package name */
    public static final int f5855z = 8;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object key;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int crossAxisSize;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.unit.w layoutDirection;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int beforeContentPadding;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int afterContentPadding;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<i1> placeables;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long visualOffset;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Object contentType;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l animator;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSize;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int mainAxisSizeWithSpacings;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int mainAxisLayoutSize;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int minMainAxisOffset;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int maxMainAxisOffset;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private long offset;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private int row;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private int column;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean nonScrollableItem;

    public /* synthetic */ x(int i4, Object obj, boolean z4, int i5, int i6, boolean z5, androidx.compose.ui.unit.w wVar, int i7, int i10, List list, long j4, Object obj2, l lVar, kotlin.jvm.internal.w wVar2) {
        this(i4, obj, z4, i5, i6, z5, wVar, i7, i10, list, j4, obj2, lVar);
    }

    private final long f(long j4, ld.l<? super Integer, Integer> lVar) {
        int m4 = this.isVertical ? androidx.compose.ui.unit.q.m(j4) : lVar.invoke(Integer.valueOf(androidx.compose.ui.unit.q.m(j4))).intValue();
        boolean z4 = this.isVertical;
        int o4 = androidx.compose.ui.unit.q.o(j4);
        if (z4) {
            o4 = lVar.invoke(Integer.valueOf(o4)).intValue();
        }
        return androidx.compose.ui.unit.r.a(m4, o4);
    }

    private final int i(long j4) {
        return this.isVertical ? androidx.compose.ui.unit.q.o(j4) : androidx.compose.ui.unit.q.m(j4);
    }

    private final int k(i1 i1Var) {
        return this.isVertical ? i1Var.getHeight() : i1Var.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.grid.k
    /* renamed from: a, reason: from getter */
    public int getColumn() {
        return this.column;
    }

    @Override // androidx.compose.foundation.lazy.grid.k
    /* renamed from: b, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.grid.k
    /* renamed from: c, reason: from getter */
    public long getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.grid.k
    /* renamed from: d, reason: from getter */
    public int getRow() {
        return this.row;
    }

    public final void e(int delta) {
        if (this.nonScrollableItem) {
            return;
        }
        long j4 = this.offset;
        int m4 = this.isVertical ? androidx.compose.ui.unit.q.m(j4) : androidx.compose.ui.unit.q.m(j4) + delta;
        boolean z4 = this.isVertical;
        int o4 = androidx.compose.ui.unit.q.o(j4);
        if (z4) {
            o4 += delta;
        }
        this.offset = androidx.compose.ui.unit.r.a(m4, o4);
        int size = this.placeables.size();
        for (int i4 = 0; i4 < size; i4++) {
            androidx.compose.foundation.lazy.layout.h b5 = this.animator.b(this.key, i4);
            if (b5 != null) {
                long rawOffset = b5.getRawOffset();
                int m5 = this.isVertical ? androidx.compose.ui.unit.q.m(rawOffset) : Integer.valueOf(androidx.compose.ui.unit.q.m(rawOffset) + delta).intValue();
                boolean z5 = this.isVertical;
                int o5 = androidx.compose.ui.unit.q.o(rawOffset);
                if (z5) {
                    o5 += delta;
                }
                b5.A(androidx.compose.ui.unit.r.a(m5, o5));
            }
        }
    }

    public final int g() {
        return this.isVertical ? androidx.compose.ui.unit.q.m(this.offset) : androidx.compose.ui.unit.q.o(this.offset);
    }

    @Override // androidx.compose.foundation.lazy.grid.k
    @fg.m
    public Object getContentType() {
        return this.contentType;
    }

    @Override // androidx.compose.foundation.lazy.grid.k
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.grid.k
    @fg.l
    public Object getKey() {
        return this.key;
    }

    /* renamed from: h, reason: from getter */
    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    /* renamed from: j, reason: from getter */
    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    /* renamed from: l, reason: from getter */
    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @fg.m
    public final Object n(int index) {
        return this.placeables.get(index).a();
    }

    public final int o() {
        return this.placeables.size();
    }

    /* renamed from: p, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    public final void q(@fg.l i1.a scope) {
        int i4;
        int i5;
        if (this.mainAxisLayoutSize == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int i6 = 0;
        for (int size = this.placeables.size(); i6 < size; size = i4) {
            i1 i1Var = this.placeables.get(i6);
            int k4 = this.minMainAxisOffset - k(i1Var);
            int i7 = this.maxMainAxisOffset;
            long j4 = this.offset;
            androidx.compose.foundation.lazy.layout.h b5 = this.animator.b(this.key, i6);
            if (b5 != null) {
                long o4 = b5.o();
                i4 = size;
                i5 = i6;
                long a5 = androidx.compose.ui.unit.r.a(androidx.compose.ui.unit.q.m(j4) + ((int) (o4 >> 32)), ((int) (j4 & 4294967295L)) + ((int) (o4 & 4294967295L)));
                if ((i(j4) <= k4 && i(a5) <= k4) || (i(j4) >= i7 && i(a5) >= i7)) {
                    b5.j();
                }
                j4 = a5;
            } else {
                i4 = size;
                i5 = i6;
            }
            if (this.reverseLayout) {
                j4 = androidx.compose.ui.unit.r.a(this.isVertical ? androidx.compose.ui.unit.q.m(j4) : (this.mainAxisLayoutSize - androidx.compose.ui.unit.q.m(j4)) - k(i1Var), this.isVertical ? (this.mainAxisLayoutSize - androidx.compose.ui.unit.q.o(j4)) - k(i1Var) : androidx.compose.ui.unit.q.o(j4));
            }
            long j5 = this.visualOffset;
            long a6 = androidx.compose.ui.unit.r.a(androidx.compose.ui.unit.q.m(j4) + ((int) (j5 >> 32)), ((int) (j4 & 4294967295L)) + ((int) (j5 & 4294967295L)));
            if (this.isVertical) {
                i1.a.w(scope, i1Var, a6, 0.0f, null, 6, null);
            } else {
                i1.a.s(scope, i1Var, a6, 0.0f, null, 6, null);
            }
            i6 = i5 + 1;
        }
    }

    public final void r(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight, int row, int column) {
        boolean z4 = this.isVertical;
        this.mainAxisLayoutSize = z4 ? layoutHeight : layoutWidth;
        if (!z4) {
            layoutWidth = layoutHeight;
        }
        if (z4 && this.layoutDirection == androidx.compose.ui.unit.w.Rtl) {
            crossAxisOffset = (layoutWidth - crossAxisOffset) - this.crossAxisSize;
        }
        this.offset = z4 ? androidx.compose.ui.unit.r.a(crossAxisOffset, mainAxisOffset) : androidx.compose.ui.unit.r.a(mainAxisOffset, crossAxisOffset);
        this.row = row;
        this.column = column;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    public final void t(boolean z4) {
        this.nonScrollableItem = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private x(int i4, Object obj, boolean z4, int i5, int i6, boolean z5, androidx.compose.ui.unit.w wVar, int i7, int i10, List<? extends i1> list, long j4, Object obj2, l lVar) {
        this.index = i4;
        this.key = obj;
        this.isVertical = z4;
        this.crossAxisSize = i5;
        this.reverseLayout = z5;
        this.layoutDirection = wVar;
        this.beforeContentPadding = i7;
        this.afterContentPadding = i10;
        this.placeables = list;
        this.visualOffset = j4;
        this.contentType = obj2;
        this.animator = lVar;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i1 i1Var = (i1) list.get(i12);
            i11 = Math.max(i11, this.isVertical ? i1Var.getHeight() : i1Var.getWidth());
        }
        this.mainAxisSize = i11;
        int i13 = i6 + i11;
        this.mainAxisSizeWithSpacings = i13 >= 0 ? i13 : 0;
        this.size = this.isVertical ? androidx.compose.ui.unit.v.a(this.crossAxisSize, i11) : androidx.compose.ui.unit.v.a(i11, this.crossAxisSize);
        androidx.compose.ui.unit.q.INSTANCE.getClass();
        this.offset = androidx.compose.ui.unit.q.f21519c;
        this.row = -1;
        this.column = -1;
    }
}
