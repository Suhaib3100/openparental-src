package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.j0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: LazyGridMeasuredLineProvider.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010#\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\"\u001a\u00020\u0006H&¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010'R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0011\u0010.\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b(\u0010-\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Landroidx/compose/foundation/lazy/grid/b0;", "", "", "isVertical", "Landroidx/compose/foundation/lazy/grid/g0;", "slots", "", "gridItemsCount", "spaceBetweenLines", "Landroidx/compose/foundation/lazy/grid/z;", "measuredItemProvider", "Landroidx/compose/foundation/lazy/grid/j0;", "spanLayoutProvider", "<init>", "(ZLandroidx/compose/foundation/lazy/grid/g0;IILandroidx/compose/foundation/lazy/grid/z;Landroidx/compose/foundation/lazy/grid/j0;)V", "startSlot", "span", "Landroidx/compose/ui/unit/b;", "a", "(II)J", "itemIndex", "e", "(I)J", "lineIndex", "Landroidx/compose/foundation/lazy/grid/a0;", "c", "(I)Landroidx/compose/foundation/lazy/grid/a0;", "index", "", "Landroidx/compose/foundation/lazy/grid/x;", "items", "", "Landroidx/compose/foundation/lazy/grid/b;", "spans", "mainAxisSpacing", "b", "(I[Landroidx/compose/foundation/lazy/grid/x;Ljava/util/List;I)Landroidx/compose/foundation/lazy/grid/a0;", "Z", "Landroidx/compose/foundation/lazy/grid/g0;", "I", "d", "Landroidx/compose/foundation/lazy/grid/z;", "f", "Landroidx/compose/foundation/lazy/grid/j0;", "Landroidx/compose/foundation/lazy/layout/v;", "()Landroidx/compose/foundation/lazy/layout/v;", "keyIndexMap", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyGridMeasuredLineProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredLineProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f5584g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isVertical;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final g0 slots;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int gridItemsCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int spaceBetweenLines;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final z measuredItemProvider;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j0 spanLayoutProvider;

    public b0(boolean z4, @fg.l g0 g0Var, int i4, int i5, @fg.l z zVar, @fg.l j0 j0Var) {
        this.isVertical = z4;
        this.slots = g0Var;
        this.gridItemsCount = i4;
        this.spaceBetweenLines = i5;
        this.measuredItemProvider = zVar;
        this.spanLayoutProvider = j0Var;
    }

    public final long a(int startSlot, int span) {
        int i4;
        if (span == 1) {
            i4 = this.slots.getSizes()[startSlot];
        } else {
            int i5 = (span + startSlot) - 1;
            i4 = (this.slots.getPositions()[i5] + this.slots.getSizes()[i5]) - this.slots.getPositions()[startSlot];
        }
        if (i4 < 0) {
            i4 = 0;
        }
        return this.isVertical ? androidx.compose.ui.unit.b.INSTANCE.e(i4) : androidx.compose.ui.unit.b.INSTANCE.d(i4);
    }

    @fg.l
    public abstract a0 b(int index, @fg.l x[] items, @fg.l List<b> spans, int mainAxisSpacing);

    @fg.l
    public final a0 c(int lineIndex) {
        j0.c c5 = this.spanLayoutProvider.c(lineIndex);
        int size = c5.b().size();
        int i4 = (size == 0 || c5.getFirstItemIndex() + size == this.gridItemsCount) ? 0 : this.spaceBetweenLines;
        x[] xVarArr = new x[size];
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            int packedValue = (int) c5.b().get(i6).getPackedValue();
            x b5 = this.measuredItemProvider.b(c5.getFirstItemIndex() + i6, i4, a(i5, packedValue));
            i5 += packedValue;
            k2 k2Var = k2.f75408a;
            xVarArr[i6] = b5;
        }
        return b(lineIndex, xVarArr, c5.b(), i4);
    }

    @fg.l
    public final androidx.compose.foundation.lazy.layout.v d() {
        return this.measuredItemProvider.d();
    }

    public final long e(int itemIndex) {
        j0 j0Var = this.spanLayoutProvider;
        return a(0, j0Var.i(itemIndex, j0Var.getSlotsPerLine()));
    }
}
